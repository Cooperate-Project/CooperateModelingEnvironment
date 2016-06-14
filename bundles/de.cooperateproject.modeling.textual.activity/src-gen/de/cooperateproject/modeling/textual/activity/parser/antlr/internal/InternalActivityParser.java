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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@startactivity'", "'@endactivity'", "'action'", "'condition'", "':'", "'fork'", "'as'", "'-'", "'note['", "']'", "'start'", "'end'"
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
    // InternalActivity.g:77:1: ruleActivityDiagram returns [EObject current=null] : ( () otherlv_1= '@startactivity' ( ( (lv_actions_2_0= ruleAction ) ) | ( (lv_conditions_3_0= ruleCondition ) ) | ( (lv_forks_4_0= ruleFork ) ) | ( (lv_associations_5_0= ruleAssociation ) ) )* otherlv_6= '@endactivity' ) ;
    public final EObject ruleActivityDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_actions_2_0 = null;

        EObject lv_conditions_3_0 = null;

        EObject lv_forks_4_0 = null;

        EObject lv_associations_5_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:80:28: ( ( () otherlv_1= '@startactivity' ( ( (lv_actions_2_0= ruleAction ) ) | ( (lv_conditions_3_0= ruleCondition ) ) | ( (lv_forks_4_0= ruleFork ) ) | ( (lv_associations_5_0= ruleAssociation ) ) )* otherlv_6= '@endactivity' ) )
            // InternalActivity.g:81:1: ( () otherlv_1= '@startactivity' ( ( (lv_actions_2_0= ruleAction ) ) | ( (lv_conditions_3_0= ruleCondition ) ) | ( (lv_forks_4_0= ruleFork ) ) | ( (lv_associations_5_0= ruleAssociation ) ) )* otherlv_6= '@endactivity' )
            {
            // InternalActivity.g:81:1: ( () otherlv_1= '@startactivity' ( ( (lv_actions_2_0= ruleAction ) ) | ( (lv_conditions_3_0= ruleCondition ) ) | ( (lv_forks_4_0= ruleFork ) ) | ( (lv_associations_5_0= ruleAssociation ) ) )* otherlv_6= '@endactivity' )
            // InternalActivity.g:81:2: () otherlv_1= '@startactivity' ( ( (lv_actions_2_0= ruleAction ) ) | ( (lv_conditions_3_0= ruleCondition ) ) | ( (lv_forks_4_0= ruleFork ) ) | ( (lv_associations_5_0= ruleAssociation ) ) )* otherlv_6= '@endactivity'
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
                
            // InternalActivity.g:91:1: ( ( (lv_actions_2_0= ruleAction ) ) | ( (lv_conditions_3_0= ruleCondition ) ) | ( (lv_forks_4_0= ruleFork ) ) | ( (lv_associations_5_0= ruleAssociation ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt1=1;
                    }
                    break;
                case 14:
                    {
                    alt1=2;
                    }
                    break;
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                case RULE_ID:
                case 21:
                case 22:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalActivity.g:91:2: ( (lv_actions_2_0= ruleAction ) )
            	    {
            	    // InternalActivity.g:91:2: ( (lv_actions_2_0= ruleAction ) )
            	    // InternalActivity.g:92:1: (lv_actions_2_0= ruleAction )
            	    {
            	    // InternalActivity.g:92:1: (lv_actions_2_0= ruleAction )
            	    // InternalActivity.g:93:3: lv_actions_2_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityDiagramAccess().getActionsActionParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_2_0, 
            	            		"de.cooperateproject.modeling.textual.activity.Activity.Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalActivity.g:110:6: ( (lv_conditions_3_0= ruleCondition ) )
            	    {
            	    // InternalActivity.g:110:6: ( (lv_conditions_3_0= ruleCondition ) )
            	    // InternalActivity.g:111:1: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // InternalActivity.g:111:1: (lv_conditions_3_0= ruleCondition )
            	    // InternalActivity.g:112:3: lv_conditions_3_0= ruleCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityDiagramAccess().getConditionsConditionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_conditions_3_0=ruleCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditions",
            	            		lv_conditions_3_0, 
            	            		"de.cooperateproject.modeling.textual.activity.Activity.Condition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalActivity.g:129:6: ( (lv_forks_4_0= ruleFork ) )
            	    {
            	    // InternalActivity.g:129:6: ( (lv_forks_4_0= ruleFork ) )
            	    // InternalActivity.g:130:1: (lv_forks_4_0= ruleFork )
            	    {
            	    // InternalActivity.g:130:1: (lv_forks_4_0= ruleFork )
            	    // InternalActivity.g:131:3: lv_forks_4_0= ruleFork
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityDiagramAccess().getForksForkParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_forks_4_0=ruleFork();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"forks",
            	            		lv_forks_4_0, 
            	            		"de.cooperateproject.modeling.textual.activity.Activity.Fork");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalActivity.g:148:6: ( (lv_associations_5_0= ruleAssociation ) )
            	    {
            	    // InternalActivity.g:148:6: ( (lv_associations_5_0= ruleAssociation ) )
            	    // InternalActivity.g:149:1: (lv_associations_5_0= ruleAssociation )
            	    {
            	    // InternalActivity.g:149:1: (lv_associations_5_0= ruleAssociation )
            	    // InternalActivity.g:150:3: lv_associations_5_0= ruleAssociation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityDiagramAccess().getAssociationsAssociationParserRuleCall_2_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_associations_5_0=ruleAssociation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"associations",
            	            		lv_associations_5_0, 
            	            		"de.cooperateproject.modeling.textual.activity.Activity.Association");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getActivityDiagramAccess().getEndactivityKeyword_3());
                

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


    // $ANTLR start "entryRuleAction"
    // InternalActivity.g:178:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalActivity.g:179:2: (iv_ruleAction= ruleAction EOF )
            // InternalActivity.g:180:2: iv_ruleAction= ruleAction EOF
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
    // InternalActivity.g:187:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= ruleName ) ) ( (lv_comment_2_0= ruleComment ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;

        EObject lv_comment_2_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:190:28: ( (otherlv_0= 'action' ( (lv_name_1_0= ruleName ) ) ( (lv_comment_2_0= ruleComment ) )? ) )
            // InternalActivity.g:191:1: (otherlv_0= 'action' ( (lv_name_1_0= ruleName ) ) ( (lv_comment_2_0= ruleComment ) )? )
            {
            // InternalActivity.g:191:1: (otherlv_0= 'action' ( (lv_name_1_0= ruleName ) ) ( (lv_comment_2_0= ruleComment ) )? )
            // InternalActivity.g:191:3: otherlv_0= 'action' ( (lv_name_1_0= ruleName ) ) ( (lv_comment_2_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
                
            // InternalActivity.g:195:1: ( (lv_name_1_0= ruleName ) )
            // InternalActivity.g:196:1: (lv_name_1_0= ruleName )
            {
            // InternalActivity.g:196:1: (lv_name_1_0= ruleName )
            // InternalActivity.g:197:3: lv_name_1_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"de.cooperateproject.modeling.textual.activity.Activity.Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalActivity.g:213:2: ( (lv_comment_2_0= ruleComment ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalActivity.g:214:1: (lv_comment_2_0= ruleComment )
                    {
                    // InternalActivity.g:214:1: (lv_comment_2_0= ruleComment )
                    // InternalActivity.g:215:3: lv_comment_2_0= ruleComment
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getCommentCommentParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_comment_2_0=ruleComment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_2_0, 
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
    // InternalActivity.g:239:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalActivity.g:240:2: (iv_ruleCondition= ruleCondition EOF )
            // InternalActivity.g:241:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalActivity.g:248:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_conditionStart_1_0= ruleConditionEnd ) ) otherlv_2= ':' ( (lv_conditionEnd_3_0= ruleConditionEnd ) ) ( (lv_comment_4_0= ruleComment ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_conditionStart_1_0 = null;

        EObject lv_conditionEnd_3_0 = null;

        EObject lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:251:28: ( (otherlv_0= 'condition' ( (lv_conditionStart_1_0= ruleConditionEnd ) ) otherlv_2= ':' ( (lv_conditionEnd_3_0= ruleConditionEnd ) ) ( (lv_comment_4_0= ruleComment ) )? ) )
            // InternalActivity.g:252:1: (otherlv_0= 'condition' ( (lv_conditionStart_1_0= ruleConditionEnd ) ) otherlv_2= ':' ( (lv_conditionEnd_3_0= ruleConditionEnd ) ) ( (lv_comment_4_0= ruleComment ) )? )
            {
            // InternalActivity.g:252:1: (otherlv_0= 'condition' ( (lv_conditionStart_1_0= ruleConditionEnd ) ) otherlv_2= ':' ( (lv_conditionEnd_3_0= ruleConditionEnd ) ) ( (lv_comment_4_0= ruleComment ) )? )
            // InternalActivity.g:252:3: otherlv_0= 'condition' ( (lv_conditionStart_1_0= ruleConditionEnd ) ) otherlv_2= ':' ( (lv_conditionEnd_3_0= ruleConditionEnd ) ) ( (lv_comment_4_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
                
            // InternalActivity.g:256:1: ( (lv_conditionStart_1_0= ruleConditionEnd ) )
            // InternalActivity.g:257:1: (lv_conditionStart_1_0= ruleConditionEnd )
            {
            // InternalActivity.g:257:1: (lv_conditionStart_1_0= ruleConditionEnd )
            // InternalActivity.g:258:3: lv_conditionStart_1_0= ruleConditionEnd
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getConditionStartConditionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getColonKeyword_2());
                
            // InternalActivity.g:278:1: ( (lv_conditionEnd_3_0= ruleConditionEnd ) )
            // InternalActivity.g:279:1: (lv_conditionEnd_3_0= ruleConditionEnd )
            {
            // InternalActivity.g:279:1: (lv_conditionEnd_3_0= ruleConditionEnd )
            // InternalActivity.g:280:3: lv_conditionEnd_3_0= ruleConditionEnd
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getConditionEndConditionEndParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_5);
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

            // InternalActivity.g:296:2: ( (lv_comment_4_0= ruleComment ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalActivity.g:297:1: (lv_comment_4_0= ruleComment )
                    {
                    // InternalActivity.g:297:1: (lv_comment_4_0= ruleComment )
                    // InternalActivity.g:298:3: lv_comment_4_0= ruleComment
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
    // InternalActivity.g:322:1: entryRuleConditionEnd returns [EObject current=null] : iv_ruleConditionEnd= ruleConditionEnd EOF ;
    public final EObject entryRuleConditionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionEnd = null;


        try {
            // InternalActivity.g:323:2: (iv_ruleConditionEnd= ruleConditionEnd EOF )
            // InternalActivity.g:324:2: iv_ruleConditionEnd= ruleConditionEnd EOF
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
    // InternalActivity.g:331:1: ruleConditionEnd returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleConditionEnd() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:334:28: ( ( (lv_name_0_0= ruleName ) ) )
            // InternalActivity.g:335:1: ( (lv_name_0_0= ruleName ) )
            {
            // InternalActivity.g:335:1: ( (lv_name_0_0= ruleName ) )
            // InternalActivity.g:336:1: (lv_name_0_0= ruleName )
            {
            // InternalActivity.g:336:1: (lv_name_0_0= ruleName )
            // InternalActivity.g:337:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getConditionEndAccess().getNameNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionEndRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"de.cooperateproject.modeling.textual.activity.Activity.Name");
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
    // $ANTLR end "ruleConditionEnd"


    // $ANTLR start "entryRuleFork"
    // InternalActivity.g:361:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // InternalActivity.g:362:2: (iv_ruleFork= ruleFork EOF )
            // InternalActivity.g:363:2: iv_ruleFork= ruleFork EOF
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
    // InternalActivity.g:370:1: ruleFork returns [EObject current=null] : (otherlv_0= 'fork' ( (lv_forkStart_1_0= ruleForkEnd ) ) otherlv_2= ':' ( (lv_forkEnd_3_0= ruleForkEnd ) ) ( (lv_comment_4_0= ruleComment ) )? ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_forkStart_1_0 = null;

        EObject lv_forkEnd_3_0 = null;

        EObject lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:373:28: ( (otherlv_0= 'fork' ( (lv_forkStart_1_0= ruleForkEnd ) ) otherlv_2= ':' ( (lv_forkEnd_3_0= ruleForkEnd ) ) ( (lv_comment_4_0= ruleComment ) )? ) )
            // InternalActivity.g:374:1: (otherlv_0= 'fork' ( (lv_forkStart_1_0= ruleForkEnd ) ) otherlv_2= ':' ( (lv_forkEnd_3_0= ruleForkEnd ) ) ( (lv_comment_4_0= ruleComment ) )? )
            {
            // InternalActivity.g:374:1: (otherlv_0= 'fork' ( (lv_forkStart_1_0= ruleForkEnd ) ) otherlv_2= ':' ( (lv_forkEnd_3_0= ruleForkEnd ) ) ( (lv_comment_4_0= ruleComment ) )? )
            // InternalActivity.g:374:3: otherlv_0= 'fork' ( (lv_forkStart_1_0= ruleForkEnd ) ) otherlv_2= ':' ( (lv_forkEnd_3_0= ruleForkEnd ) ) ( (lv_comment_4_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getForkAccess().getForkKeyword_0());
                
            // InternalActivity.g:378:1: ( (lv_forkStart_1_0= ruleForkEnd ) )
            // InternalActivity.g:379:1: (lv_forkStart_1_0= ruleForkEnd )
            {
            // InternalActivity.g:379:1: (lv_forkStart_1_0= ruleForkEnd )
            // InternalActivity.g:380:3: lv_forkStart_1_0= ruleForkEnd
            {
             
            	        newCompositeNode(grammarAccess.getForkAccess().getForkStartForkEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getForkAccess().getColonKeyword_2());
                
            // InternalActivity.g:400:1: ( (lv_forkEnd_3_0= ruleForkEnd ) )
            // InternalActivity.g:401:1: (lv_forkEnd_3_0= ruleForkEnd )
            {
            // InternalActivity.g:401:1: (lv_forkEnd_3_0= ruleForkEnd )
            // InternalActivity.g:402:3: lv_forkEnd_3_0= ruleForkEnd
            {
             
            	        newCompositeNode(grammarAccess.getForkAccess().getForkEndForkEndParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_5);
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

            // InternalActivity.g:418:2: ( (lv_comment_4_0= ruleComment ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalActivity.g:419:1: (lv_comment_4_0= ruleComment )
                    {
                    // InternalActivity.g:419:1: (lv_comment_4_0= ruleComment )
                    // InternalActivity.g:420:3: lv_comment_4_0= ruleComment
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
    // InternalActivity.g:444:1: entryRuleForkEnd returns [EObject current=null] : iv_ruleForkEnd= ruleForkEnd EOF ;
    public final EObject entryRuleForkEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkEnd = null;


        try {
            // InternalActivity.g:445:2: (iv_ruleForkEnd= ruleForkEnd EOF )
            // InternalActivity.g:446:2: iv_ruleForkEnd= ruleForkEnd EOF
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
    // InternalActivity.g:453:1: ruleForkEnd returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleForkEnd() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:456:28: ( ( (lv_name_0_0= ruleName ) ) )
            // InternalActivity.g:457:1: ( (lv_name_0_0= ruleName ) )
            {
            // InternalActivity.g:457:1: ( (lv_name_0_0= ruleName ) )
            // InternalActivity.g:458:1: (lv_name_0_0= ruleName )
            {
            // InternalActivity.g:458:1: (lv_name_0_0= ruleName )
            // InternalActivity.g:459:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getForkEndAccess().getNameNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForkEndRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"de.cooperateproject.modeling.textual.activity.Activity.Name");
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
    // $ANTLR end "ruleForkEnd"


    // $ANTLR start "entryRuleName"
    // InternalActivity.g:483:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalActivity.g:484:2: (iv_ruleName= ruleName EOF )
            // InternalActivity.g:485:2: iv_ruleName= ruleName EOF
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
    // InternalActivity.g:492:1: ruleName returns [EObject current=null] : ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_longName_0_1=null;
        Token lv_longName_0_2=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // InternalActivity.g:495:28: ( ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalActivity.g:496:1: ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalActivity.g:496:1: ( ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalActivity.g:496:2: ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalActivity.g:496:2: ( ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==17) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalActivity.g:496:3: ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) ) otherlv_1= 'as'
                    {
                    // InternalActivity.g:496:3: ( ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) ) )
                    // InternalActivity.g:497:1: ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) )
                    {
                    // InternalActivity.g:497:1: ( (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID ) )
                    // InternalActivity.g:498:1: (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID )
                    {
                    // InternalActivity.g:498:1: (lv_longName_0_1= RULE_STRING | lv_longName_0_2= RULE_ID )
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
                            // InternalActivity.g:499:3: lv_longName_0_1= RULE_STRING
                            {
                            lv_longName_0_1=(Token)match(input,RULE_STRING,FOLLOW_7); 

                            			newLeafNode(lv_longName_0_1, grammarAccess.getNameAccess().getLongNameSTRINGTerminalRuleCall_0_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNameRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_0_1, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }
                            break;
                        case 2 :
                            // InternalActivity.g:514:8: lv_longName_0_2= RULE_ID
                            {
                            lv_longName_0_2=(Token)match(input,RULE_ID,FOLLOW_7); 

                            			newLeafNode(lv_longName_0_2, grammarAccess.getNameAccess().getLongNameIDTerminalRuleCall_0_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNameRule());
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

                    otherlv_1=(Token)match(input,17,FOLLOW_8); 

                        	newLeafNode(otherlv_1, grammarAccess.getNameAccess().getAsKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalActivity.g:536:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalActivity.g:537:1: (lv_name_2_0= RULE_ID )
            {
            // InternalActivity.g:537:1: (lv_name_2_0= RULE_ID )
            // InternalActivity.g:538:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNameRule());
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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleAssociation"
    // InternalActivity.g:562:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalActivity.g:563:2: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalActivity.g:564:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalActivity.g:571:1: ruleAssociation returns [EObject current=null] : ( ( (lv_left_0_0= ruleReference ) ) otherlv_1= '-' ( (lv_right_2_0= ruleReference ) ) ( (lv_comment_3_0= ruleComment ) )? ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:574:28: ( ( ( (lv_left_0_0= ruleReference ) ) otherlv_1= '-' ( (lv_right_2_0= ruleReference ) ) ( (lv_comment_3_0= ruleComment ) )? ) )
            // InternalActivity.g:575:1: ( ( (lv_left_0_0= ruleReference ) ) otherlv_1= '-' ( (lv_right_2_0= ruleReference ) ) ( (lv_comment_3_0= ruleComment ) )? )
            {
            // InternalActivity.g:575:1: ( ( (lv_left_0_0= ruleReference ) ) otherlv_1= '-' ( (lv_right_2_0= ruleReference ) ) ( (lv_comment_3_0= ruleComment ) )? )
            // InternalActivity.g:575:2: ( (lv_left_0_0= ruleReference ) ) otherlv_1= '-' ( (lv_right_2_0= ruleReference ) ) ( (lv_comment_3_0= ruleComment ) )?
            {
            // InternalActivity.g:575:2: ( (lv_left_0_0= ruleReference ) )
            // InternalActivity.g:576:1: (lv_left_0_0= ruleReference )
            {
            // InternalActivity.g:576:1: (lv_left_0_0= ruleReference )
            // InternalActivity.g:577:3: lv_left_0_0= ruleReference
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
                
            // InternalActivity.g:597:1: ( (lv_right_2_0= ruleReference ) )
            // InternalActivity.g:598:1: (lv_right_2_0= ruleReference )
            {
            // InternalActivity.g:598:1: (lv_right_2_0= ruleReference )
            // InternalActivity.g:599:3: lv_right_2_0= ruleReference
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getRightReferenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_5);
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

            // InternalActivity.g:615:2: ( (lv_comment_3_0= ruleComment ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalActivity.g:616:1: (lv_comment_3_0= ruleComment )
                    {
                    // InternalActivity.g:616:1: (lv_comment_3_0= ruleComment )
                    // InternalActivity.g:617:3: lv_comment_3_0= ruleComment
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
    // InternalActivity.g:641:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalActivity.g:642:2: (iv_ruleReference= ruleReference EOF )
            // InternalActivity.g:643:2: iv_ruleReference= ruleReference EOF
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
    // InternalActivity.g:650:1: ruleReference returns [EObject current=null] : (this_ActivityElementReference_0= ruleActivityElementReference | this_StartEndReference_1= ruleStartEndReference ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject this_ActivityElementReference_0 = null;

        EObject this_StartEndReference_1 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:653:28: ( (this_ActivityElementReference_0= ruleActivityElementReference | this_StartEndReference_1= ruleStartEndReference ) )
            // InternalActivity.g:654:1: (this_ActivityElementReference_0= ruleActivityElementReference | this_StartEndReference_1= ruleStartEndReference )
            {
            // InternalActivity.g:654:1: (this_ActivityElementReference_0= ruleActivityElementReference | this_StartEndReference_1= ruleStartEndReference )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalActivity.g:655:5: this_ActivityElementReference_0= ruleActivityElementReference
                    {
                     
                            newCompositeNode(grammarAccess.getReferenceAccess().getActivityElementReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ActivityElementReference_0=ruleActivityElementReference();

                    state._fsp--;

                     
                            current = this_ActivityElementReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalActivity.g:665:5: this_StartEndReference_1= ruleStartEndReference
                    {
                     
                            newCompositeNode(grammarAccess.getReferenceAccess().getStartEndReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_StartEndReference_1=ruleStartEndReference();

                    state._fsp--;

                     
                            current = this_StartEndReference_1; 
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


    // $ANTLR start "entryRuleActivityElementReference"
    // InternalActivity.g:681:1: entryRuleActivityElementReference returns [EObject current=null] : iv_ruleActivityElementReference= ruleActivityElementReference EOF ;
    public final EObject entryRuleActivityElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityElementReference = null;


        try {
            // InternalActivity.g:682:2: (iv_ruleActivityElementReference= ruleActivityElementReference EOF )
            // InternalActivity.g:683:2: iv_ruleActivityElementReference= ruleActivityElementReference EOF
            {
             newCompositeNode(grammarAccess.getActivityElementReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityElementReference=ruleActivityElementReference();

            state._fsp--;

             current =iv_ruleActivityElementReference; 
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
    // $ANTLR end "entryRuleActivityElementReference"


    // $ANTLR start "ruleActivityElementReference"
    // InternalActivity.g:690:1: ruleActivityElementReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleActivityElementReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalActivity.g:693:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalActivity.g:694:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalActivity.g:694:1: ( (otherlv_0= RULE_ID ) )
            // InternalActivity.g:695:1: (otherlv_0= RULE_ID )
            {
            // InternalActivity.g:695:1: (otherlv_0= RULE_ID )
            // InternalActivity.g:696:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityElementReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getActivityElementReferenceAccess().getTypeNameCrossReference_0()); 
            	

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
    // $ANTLR end "ruleActivityElementReference"


    // $ANTLR start "entryRuleStartEndReference"
    // InternalActivity.g:715:1: entryRuleStartEndReference returns [EObject current=null] : iv_ruleStartEndReference= ruleStartEndReference EOF ;
    public final EObject entryRuleStartEndReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartEndReference = null;


        try {
            // InternalActivity.g:716:2: (iv_ruleStartEndReference= ruleStartEndReference EOF )
            // InternalActivity.g:717:2: iv_ruleStartEndReference= ruleStartEndReference EOF
            {
             newCompositeNode(grammarAccess.getStartEndReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartEndReference=ruleStartEndReference();

            state._fsp--;

             current =iv_ruleStartEndReference; 
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
    // $ANTLR end "entryRuleStartEndReference"


    // $ANTLR start "ruleStartEndReference"
    // InternalActivity.g:724:1: ruleStartEndReference returns [EObject current=null] : ( (lv_type_0_0= ruleStartEndEnum ) ) ;
    public final EObject ruleStartEndReference() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalActivity.g:727:28: ( ( (lv_type_0_0= ruleStartEndEnum ) ) )
            // InternalActivity.g:728:1: ( (lv_type_0_0= ruleStartEndEnum ) )
            {
            // InternalActivity.g:728:1: ( (lv_type_0_0= ruleStartEndEnum ) )
            // InternalActivity.g:729:1: (lv_type_0_0= ruleStartEndEnum )
            {
            // InternalActivity.g:729:1: (lv_type_0_0= ruleStartEndEnum )
            // InternalActivity.g:730:3: lv_type_0_0= ruleStartEndEnum
            {
             
            	        newCompositeNode(grammarAccess.getStartEndReferenceAccess().getTypeStartEndEnumEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleStartEndEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStartEndReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"de.cooperateproject.modeling.textual.activity.Activity.StartEndEnum");
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
    // $ANTLR end "ruleStartEndReference"


    // $ANTLR start "entryRuleComment"
    // InternalActivity.g:754:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalActivity.g:755:2: (iv_ruleComment= ruleComment EOF )
            // InternalActivity.g:756:2: iv_ruleComment= ruleComment EOF
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
    // InternalActivity.g:763:1: ruleComment returns [EObject current=null] : (otherlv_0= 'note[' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ']' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalActivity.g:766:28: ( (otherlv_0= 'note[' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ']' ) )
            // InternalActivity.g:767:1: (otherlv_0= 'note[' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ']' )
            {
            // InternalActivity.g:767:1: (otherlv_0= 'note[' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ']' )
            // InternalActivity.g:767:3: otherlv_0= 'note[' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
                
            // InternalActivity.g:771:1: ( (lv_description_1_0= RULE_STRING ) )
            // InternalActivity.g:772:1: (lv_description_1_0= RULE_STRING )
            {
            // InternalActivity.g:772:1: (lv_description_1_0= RULE_STRING )
            // InternalActivity.g:773:3: lv_description_1_0= RULE_STRING
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


    // $ANTLR start "ruleStartEndEnum"
    // InternalActivity.g:801:1: ruleStartEndEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'end' ) ) ;
    public final Enumerator ruleStartEndEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalActivity.g:803:28: ( ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'end' ) ) )
            // InternalActivity.g:804:1: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'end' ) )
            {
            // InternalActivity.g:804:1: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'end' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalActivity.g:804:2: (enumLiteral_0= 'start' )
                    {
                    // InternalActivity.g:804:2: (enumLiteral_0= 'start' )
                    // InternalActivity.g:804:4: enumLiteral_0= 'start'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                            current = grammarAccess.getStartEndEnumAccess().getSTARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStartEndEnumAccess().getSTARTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalActivity.g:810:6: (enumLiteral_1= 'end' )
                    {
                    // InternalActivity.g:810:6: (enumLiteral_1= 'end' )
                    // InternalActivity.g:810:8: enumLiteral_1= 'end'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                            current = grammarAccess.getStartEndEnumAccess().getENDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStartEndEnumAccess().getENDEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleStartEndEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000617020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000616020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});

}