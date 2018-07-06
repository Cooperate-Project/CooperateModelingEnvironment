package de.cooperateproject.modeling.textual.activity.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cooperateproject.modeling.textual.activity.services.ActGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-actd'", "'@end-actd'", "'rootPackage'", "'activityName'", "'actn'", "'as'", "'ini'", "'fin'", "'ffin'", "'decn'", "'mrgn'", "'fork'", "'join'", "'flw'", "'('", "','", "')'", "'['", "']'", "'swl'", "'{'", "'}'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalActParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAct.g"; }



     	private ActGrammarAccess grammarAccess;

        public InternalActParser(TokenStream input, ActGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ActivityDiagram";
       	}

       	@Override
       	protected ActGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleActivityDiagram"
    // InternalAct.g:64:1: entryRuleActivityDiagram returns [EObject current=null] : iv_ruleActivityDiagram= ruleActivityDiagram EOF ;
    public final EObject entryRuleActivityDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityDiagram = null;


        try {
            // InternalAct.g:64:56: (iv_ruleActivityDiagram= ruleActivityDiagram EOF )
            // InternalAct.g:65:2: iv_ruleActivityDiagram= ruleActivityDiagram EOF
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
    // InternalAct.g:71:1: ruleActivityDiagram returns [EObject current=null] : ( () otherlv_1= '@start-actd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-actd' ) ;
    public final EObject ruleActivityDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_4=null;
        EObject lv_rootPackage_3_0 = null;



        	enterRule();

        try {
            // InternalAct.g:77:2: ( ( () otherlv_1= '@start-actd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-actd' ) )
            // InternalAct.g:78:2: ( () otherlv_1= '@start-actd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-actd' )
            {
            // InternalAct.g:78:2: ( () otherlv_1= '@start-actd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-actd' )
            // InternalAct.g:79:3: () otherlv_1= '@start-actd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-actd'
            {
            // InternalAct.g:79:3: ()
            // InternalAct.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityDiagramAccess().getStartActdKeyword_1());
            		
            // InternalAct.g:90:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalAct.g:91:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalAct.g:91:4: (lv_title_2_0= RULE_STRING )
            // InternalAct.g:92:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_2_0, grammarAccess.getActivityDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAct.g:108:3: ( (lv_rootPackage_3_0= ruleRootPackage ) )
            // InternalAct.g:109:4: (lv_rootPackage_3_0= ruleRootPackage )
            {
            // InternalAct.g:109:4: (lv_rootPackage_3_0= ruleRootPackage )
            // InternalAct.g:110:5: lv_rootPackage_3_0= ruleRootPackage
            {

            					newCompositeNode(grammarAccess.getActivityDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_rootPackage_3_0=ruleRootPackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
            					}
            					set(
            						current,
            						"rootPackage",
            						lv_rootPackage_3_0,
            						"de.cooperateproject.modeling.textual.activity.Act.RootPackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getActivityDiagramAccess().getEndActdKeyword_4());
            		

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


    // $ANTLR start "entryRuleRootPackage"
    // InternalAct.g:135:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalAct.g:135:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalAct.g:136:2: iv_ruleRootPackage= ruleRootPackage EOF
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
    // InternalAct.g:142:1: ruleRootPackage returns [EObject current=null] : ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_activity_3_0= ruleActivity ) ) ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_activity_3_0 = null;



        	enterRule();

        try {
            // InternalAct.g:148:2: ( ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_activity_3_0= ruleActivity ) ) ) )
            // InternalAct.g:149:2: ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_activity_3_0= ruleActivity ) ) )
            {
            // InternalAct.g:149:2: ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_activity_3_0= ruleActivity ) ) )
            // InternalAct.g:150:3: () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_activity_3_0= ruleActivity ) )
            {
            // InternalAct.g:150:3: ()
            // InternalAct.g:151:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootPackageAccess().getRootPackageAction_0(),
            					current);
            			

            }

            // InternalAct.g:157:3: (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAct.g:158:4: otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0());
                    			
                    // InternalAct.g:162:4: ( (lv_name_2_0= ruleFQN ) )
                    // InternalAct.g:163:5: (lv_name_2_0= ruleFQN )
                    {
                    // InternalAct.g:163:5: (lv_name_2_0= ruleFQN )
                    // InternalAct.g:164:6: lv_name_2_0= ruleFQN
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
                    							"de.cooperateproject.modeling.textual.activity.Act.FQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAct.g:182:3: ( (lv_activity_3_0= ruleActivity ) )
            // InternalAct.g:183:4: (lv_activity_3_0= ruleActivity )
            {
            // InternalAct.g:183:4: (lv_activity_3_0= ruleActivity )
            // InternalAct.g:184:5: lv_activity_3_0= ruleActivity
            {

            					newCompositeNode(grammarAccess.getRootPackageAccess().getActivityActivityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_activity_3_0=ruleActivity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            					}
            					set(
            						current,
            						"activity",
            						lv_activity_3_0,
            						"de.cooperateproject.modeling.textual.activity.Act.Activity");
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
    // $ANTLR end "ruleRootPackage"


    // $ANTLR start "entryRuleActivity"
    // InternalAct.g:205:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalAct.g:205:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalAct.g:206:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalAct.g:212:1: ruleActivity returns [EObject current=null] : ( () (otherlv_1= 'activityName' ( (lv_name_2_0= RULE_STRING ) ) )? ( (lv_children_3_0= ruleSwimlane ) )* ( (lv_nodes_4_0= ruleNode ) )* ( (lv_flows_5_0= ruleFlow ) )* ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_children_3_0 = null;

        EObject lv_nodes_4_0 = null;

        EObject lv_flows_5_0 = null;



        	enterRule();

        try {
            // InternalAct.g:218:2: ( ( () (otherlv_1= 'activityName' ( (lv_name_2_0= RULE_STRING ) ) )? ( (lv_children_3_0= ruleSwimlane ) )* ( (lv_nodes_4_0= ruleNode ) )* ( (lv_flows_5_0= ruleFlow ) )* ) )
            // InternalAct.g:219:2: ( () (otherlv_1= 'activityName' ( (lv_name_2_0= RULE_STRING ) ) )? ( (lv_children_3_0= ruleSwimlane ) )* ( (lv_nodes_4_0= ruleNode ) )* ( (lv_flows_5_0= ruleFlow ) )* )
            {
            // InternalAct.g:219:2: ( () (otherlv_1= 'activityName' ( (lv_name_2_0= RULE_STRING ) ) )? ( (lv_children_3_0= ruleSwimlane ) )* ( (lv_nodes_4_0= ruleNode ) )* ( (lv_flows_5_0= ruleFlow ) )* )
            // InternalAct.g:220:3: () (otherlv_1= 'activityName' ( (lv_name_2_0= RULE_STRING ) ) )? ( (lv_children_3_0= ruleSwimlane ) )* ( (lv_nodes_4_0= ruleNode ) )* ( (lv_flows_5_0= ruleFlow ) )*
            {
            // InternalAct.g:220:3: ()
            // InternalAct.g:221:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityAccess().getActivityAction_0(),
            					current);
            			

            }

            // InternalAct.g:227:3: (otherlv_1= 'activityName' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAct.g:228:4: otherlv_1= 'activityName' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityNameKeyword_1_0());
                    			
                    // InternalAct.g:232:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalAct.g:233:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalAct.g:233:5: (lv_name_2_0= RULE_STRING )
                    // InternalAct.g:234:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAct.g:251:3: ( (lv_children_3_0= ruleSwimlane ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAct.g:252:4: (lv_children_3_0= ruleSwimlane )
            	    {
            	    // InternalAct.g:252:4: (lv_children_3_0= ruleSwimlane )
            	    // InternalAct.g:253:5: lv_children_3_0= ruleSwimlane
            	    {

            	    					newCompositeNode(grammarAccess.getActivityAccess().getChildrenSwimlaneParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_children_3_0=ruleSwimlane();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActivityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_3_0,
            	    						"de.cooperateproject.modeling.textual.activity.Act.Swimlane");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalAct.g:270:3: ( (lv_nodes_4_0= ruleNode ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||(LA4_0>=17 && LA4_0<=23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAct.g:271:4: (lv_nodes_4_0= ruleNode )
            	    {
            	    // InternalAct.g:271:4: (lv_nodes_4_0= ruleNode )
            	    // InternalAct.g:272:5: lv_nodes_4_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getActivityAccess().getNodesNodeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_nodes_4_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActivityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_4_0,
            	    						"de.cooperateproject.modeling.textual.activity.Act.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalAct.g:289:3: ( (lv_flows_5_0= ruleFlow ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAct.g:290:4: (lv_flows_5_0= ruleFlow )
            	    {
            	    // InternalAct.g:290:4: (lv_flows_5_0= ruleFlow )
            	    // InternalAct.g:291:5: lv_flows_5_0= ruleFlow
            	    {

            	    					newCompositeNode(grammarAccess.getActivityAccess().getFlowsFlowParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_flows_5_0=ruleFlow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActivityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flows",
            	    						lv_flows_5_0,
            	    						"de.cooperateproject.modeling.textual.activity.Act.Flow");
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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleNode"
    // InternalAct.g:312:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalAct.g:312:45: (iv_ruleNode= ruleNode EOF )
            // InternalAct.g:313:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalAct.g:319:1: ruleNode returns [EObject current=null] : (this_ActionNode_0= ruleActionNode | this_ControlNode_1= ruleControlNode ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_ActionNode_0 = null;

        EObject this_ControlNode_1 = null;



        	enterRule();

        try {
            // InternalAct.g:325:2: ( (this_ActionNode_0= ruleActionNode | this_ControlNode_1= ruleControlNode ) )
            // InternalAct.g:326:2: (this_ActionNode_0= ruleActionNode | this_ControlNode_1= ruleControlNode )
            {
            // InternalAct.g:326:2: (this_ActionNode_0= ruleActionNode | this_ControlNode_1= ruleControlNode )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=17 && LA6_0<=23)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAct.g:327:3: this_ActionNode_0= ruleActionNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getActionNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionNode_0=ruleActionNode();

                    state._fsp--;


                    			current = this_ActionNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAct.g:336:3: this_ControlNode_1= ruleControlNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getControlNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ControlNode_1=ruleControlNode();

                    state._fsp--;


                    			current = this_ControlNode_1;
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleActionNode"
    // InternalAct.g:348:1: entryRuleActionNode returns [EObject current=null] : iv_ruleActionNode= ruleActionNode EOF ;
    public final EObject entryRuleActionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionNode = null;


        try {
            // InternalAct.g:348:51: (iv_ruleActionNode= ruleActionNode EOF )
            // InternalAct.g:349:2: iv_ruleActionNode= ruleActionNode EOF
            {
             newCompositeNode(grammarAccess.getActionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionNode=ruleActionNode();

            state._fsp--;

             current =iv_ruleActionNode; 
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
    // $ANTLR end "entryRuleActionNode"


    // $ANTLR start "ruleActionNode"
    // InternalAct.g:355:1: ruleActionNode returns [EObject current=null] : (otherlv_0= 'actn' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleActionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalAct.g:361:2: ( (otherlv_0= 'actn' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ) )
            // InternalAct.g:362:2: (otherlv_0= 'actn' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) )
            {
            // InternalAct.g:362:2: (otherlv_0= 'actn' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) )
            // InternalAct.g:363:3: otherlv_0= 'actn' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getActionNodeAccess().getActnKeyword_0());
            		
            // InternalAct.g:367:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==12||LA7_1==15||(LA7_1>=17 && LA7_1<=24)||LA7_1==32) ) {
                    alt7=1;
                }
                else if ( (LA7_1==16) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAct.g:368:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalAct.g:368:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalAct.g:369:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAct.g:369:5: (lv_name_1_0= RULE_ID )
                    // InternalAct.g:370:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getActionNodeAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAct.g:387:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    {
                    // InternalAct.g:387:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    // InternalAct.g:388:5: ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) )
                    {
                    // InternalAct.g:388:5: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalAct.g:389:6: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalAct.g:389:6: (lv_alias_2_0= RULE_ID )
                    // InternalAct.g:390:7: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    							newLeafNode(lv_alias_2_0, grammarAccess.getActionNodeAccess().getAliasIDTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActionNodeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_2_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getActionNodeAccess().getAsKeyword_1_1_1());
                    				
                    // InternalAct.g:410:5: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalAct.g:411:6: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalAct.g:411:6: (lv_name_4_0= RULE_STRING )
                    // InternalAct.g:412:7: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getActionNodeAccess().getNameSTRINGTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActionNodeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


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
    // $ANTLR end "ruleActionNode"


    // $ANTLR start "entryRuleControlNode"
    // InternalAct.g:434:1: entryRuleControlNode returns [EObject current=null] : iv_ruleControlNode= ruleControlNode EOF ;
    public final EObject entryRuleControlNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlNode = null;


        try {
            // InternalAct.g:434:52: (iv_ruleControlNode= ruleControlNode EOF )
            // InternalAct.g:435:2: iv_ruleControlNode= ruleControlNode EOF
            {
             newCompositeNode(grammarAccess.getControlNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlNode=ruleControlNode();

            state._fsp--;

             current =iv_ruleControlNode; 
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
    // $ANTLR end "entryRuleControlNode"


    // $ANTLR start "ruleControlNode"
    // InternalAct.g:441:1: ruleControlNode returns [EObject current=null] : (this_InitialNode_0= ruleInitialNode | this_FinalNode_1= ruleFinalNode | this_FlowFinalNode_2= ruleFlowFinalNode | this_DecisionNode_3= ruleDecisionNode | this_MergeNode_4= ruleMergeNode | this_ForkNode_5= ruleForkNode | this_JoinNode_6= ruleJoinNode ) ;
    public final EObject ruleControlNode() throws RecognitionException {
        EObject current = null;

        EObject this_InitialNode_0 = null;

        EObject this_FinalNode_1 = null;

        EObject this_FlowFinalNode_2 = null;

        EObject this_DecisionNode_3 = null;

        EObject this_MergeNode_4 = null;

        EObject this_ForkNode_5 = null;

        EObject this_JoinNode_6 = null;



        	enterRule();

        try {
            // InternalAct.g:447:2: ( (this_InitialNode_0= ruleInitialNode | this_FinalNode_1= ruleFinalNode | this_FlowFinalNode_2= ruleFlowFinalNode | this_DecisionNode_3= ruleDecisionNode | this_MergeNode_4= ruleMergeNode | this_ForkNode_5= ruleForkNode | this_JoinNode_6= ruleJoinNode ) )
            // InternalAct.g:448:2: (this_InitialNode_0= ruleInitialNode | this_FinalNode_1= ruleFinalNode | this_FlowFinalNode_2= ruleFlowFinalNode | this_DecisionNode_3= ruleDecisionNode | this_MergeNode_4= ruleMergeNode | this_ForkNode_5= ruleForkNode | this_JoinNode_6= ruleJoinNode )
            {
            // InternalAct.g:448:2: (this_InitialNode_0= ruleInitialNode | this_FinalNode_1= ruleFinalNode | this_FlowFinalNode_2= ruleFlowFinalNode | this_DecisionNode_3= ruleDecisionNode | this_MergeNode_4= ruleMergeNode | this_ForkNode_5= ruleForkNode | this_JoinNode_6= ruleJoinNode )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            case 21:
                {
                alt8=5;
                }
                break;
            case 22:
                {
                alt8=6;
                }
                break;
            case 23:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAct.g:449:3: this_InitialNode_0= ruleInitialNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getInitialNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialNode_0=ruleInitialNode();

                    state._fsp--;


                    			current = this_InitialNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAct.g:458:3: this_FinalNode_1= ruleFinalNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getFinalNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FinalNode_1=ruleFinalNode();

                    state._fsp--;


                    			current = this_FinalNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAct.g:467:3: this_FlowFinalNode_2= ruleFlowFinalNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getFlowFinalNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FlowFinalNode_2=ruleFlowFinalNode();

                    state._fsp--;


                    			current = this_FlowFinalNode_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAct.g:476:3: this_DecisionNode_3= ruleDecisionNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getDecisionNodeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecisionNode_3=ruleDecisionNode();

                    state._fsp--;


                    			current = this_DecisionNode_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAct.g:485:3: this_MergeNode_4= ruleMergeNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getMergeNodeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeNode_4=ruleMergeNode();

                    state._fsp--;


                    			current = this_MergeNode_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAct.g:494:3: this_ForkNode_5= ruleForkNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getForkNodeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForkNode_5=ruleForkNode();

                    state._fsp--;


                    			current = this_ForkNode_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAct.g:503:3: this_JoinNode_6= ruleJoinNode
                    {

                    			newCompositeNode(grammarAccess.getControlNodeAccess().getJoinNodeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_JoinNode_6=ruleJoinNode();

                    state._fsp--;


                    			current = this_JoinNode_6;
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
    // $ANTLR end "ruleControlNode"


    // $ANTLR start "entryRuleInitialNode"
    // InternalAct.g:515:1: entryRuleInitialNode returns [EObject current=null] : iv_ruleInitialNode= ruleInitialNode EOF ;
    public final EObject entryRuleInitialNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialNode = null;


        try {
            // InternalAct.g:515:52: (iv_ruleInitialNode= ruleInitialNode EOF )
            // InternalAct.g:516:2: iv_ruleInitialNode= ruleInitialNode EOF
            {
             newCompositeNode(grammarAccess.getInitialNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialNode=ruleInitialNode();

            state._fsp--;

             current =iv_ruleInitialNode; 
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
    // $ANTLR end "entryRuleInitialNode"


    // $ANTLR start "ruleInitialNode"
    // InternalAct.g:522:1: ruleInitialNode returns [EObject current=null] : (otherlv_0= 'ini' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInitialNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAct.g:528:2: ( (otherlv_0= 'ini' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAct.g:529:2: (otherlv_0= 'ini' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAct.g:529:2: (otherlv_0= 'ini' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAct.g:530:3: otherlv_0= 'ini' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialNodeAccess().getIniKeyword_0());
            		
            // InternalAct.g:534:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAct.g:535:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAct.g:535:4: (lv_name_1_0= RULE_ID )
            // InternalAct.g:536:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleInitialNode"


    // $ANTLR start "entryRuleFinalNode"
    // InternalAct.g:556:1: entryRuleFinalNode returns [EObject current=null] : iv_ruleFinalNode= ruleFinalNode EOF ;
    public final EObject entryRuleFinalNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalNode = null;


        try {
            // InternalAct.g:556:50: (iv_ruleFinalNode= ruleFinalNode EOF )
            // InternalAct.g:557:2: iv_ruleFinalNode= ruleFinalNode EOF
            {
             newCompositeNode(grammarAccess.getFinalNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalNode=ruleFinalNode();

            state._fsp--;

             current =iv_ruleFinalNode; 
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
    // $ANTLR end "entryRuleFinalNode"


    // $ANTLR start "ruleFinalNode"
    // InternalAct.g:563:1: ruleFinalNode returns [EObject current=null] : (otherlv_0= 'fin' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFinalNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAct.g:569:2: ( (otherlv_0= 'fin' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAct.g:570:2: (otherlv_0= 'fin' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAct.g:570:2: (otherlv_0= 'fin' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAct.g:571:3: otherlv_0= 'fin' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFinalNodeAccess().getFinKeyword_0());
            		
            // InternalAct.g:575:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAct.g:576:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAct.g:576:4: (lv_name_1_0= RULE_ID )
            // InternalAct.g:577:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFinalNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFinalNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleFinalNode"


    // $ANTLR start "entryRuleFlowFinalNode"
    // InternalAct.g:597:1: entryRuleFlowFinalNode returns [EObject current=null] : iv_ruleFlowFinalNode= ruleFlowFinalNode EOF ;
    public final EObject entryRuleFlowFinalNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowFinalNode = null;


        try {
            // InternalAct.g:597:54: (iv_ruleFlowFinalNode= ruleFlowFinalNode EOF )
            // InternalAct.g:598:2: iv_ruleFlowFinalNode= ruleFlowFinalNode EOF
            {
             newCompositeNode(grammarAccess.getFlowFinalNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlowFinalNode=ruleFlowFinalNode();

            state._fsp--;

             current =iv_ruleFlowFinalNode; 
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
    // $ANTLR end "entryRuleFlowFinalNode"


    // $ANTLR start "ruleFlowFinalNode"
    // InternalAct.g:604:1: ruleFlowFinalNode returns [EObject current=null] : (otherlv_0= 'ffin' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFlowFinalNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAct.g:610:2: ( (otherlv_0= 'ffin' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAct.g:611:2: (otherlv_0= 'ffin' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAct.g:611:2: (otherlv_0= 'ffin' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAct.g:612:3: otherlv_0= 'ffin' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFlowFinalNodeAccess().getFfinKeyword_0());
            		
            // InternalAct.g:616:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAct.g:617:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAct.g:617:4: (lv_name_1_0= RULE_ID )
            // InternalAct.g:618:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFlowFinalNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlowFinalNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleFlowFinalNode"


    // $ANTLR start "entryRuleDecisionNode"
    // InternalAct.g:638:1: entryRuleDecisionNode returns [EObject current=null] : iv_ruleDecisionNode= ruleDecisionNode EOF ;
    public final EObject entryRuleDecisionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionNode = null;


        try {
            // InternalAct.g:638:53: (iv_ruleDecisionNode= ruleDecisionNode EOF )
            // InternalAct.g:639:2: iv_ruleDecisionNode= ruleDecisionNode EOF
            {
             newCompositeNode(grammarAccess.getDecisionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecisionNode=ruleDecisionNode();

            state._fsp--;

             current =iv_ruleDecisionNode; 
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
    // $ANTLR end "entryRuleDecisionNode"


    // $ANTLR start "ruleDecisionNode"
    // InternalAct.g:645:1: ruleDecisionNode returns [EObject current=null] : (otherlv_0= 'decn' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDecisionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAct.g:651:2: ( (otherlv_0= 'decn' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAct.g:652:2: (otherlv_0= 'decn' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAct.g:652:2: (otherlv_0= 'decn' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAct.g:653:3: otherlv_0= 'decn' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDecisionNodeAccess().getDecnKeyword_0());
            		
            // InternalAct.g:657:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAct.g:658:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAct.g:658:4: (lv_name_1_0= RULE_ID )
            // InternalAct.g:659:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDecisionNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecisionNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleDecisionNode"


    // $ANTLR start "entryRuleMergeNode"
    // InternalAct.g:679:1: entryRuleMergeNode returns [EObject current=null] : iv_ruleMergeNode= ruleMergeNode EOF ;
    public final EObject entryRuleMergeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeNode = null;


        try {
            // InternalAct.g:679:50: (iv_ruleMergeNode= ruleMergeNode EOF )
            // InternalAct.g:680:2: iv_ruleMergeNode= ruleMergeNode EOF
            {
             newCompositeNode(grammarAccess.getMergeNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMergeNode=ruleMergeNode();

            state._fsp--;

             current =iv_ruleMergeNode; 
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
    // $ANTLR end "entryRuleMergeNode"


    // $ANTLR start "ruleMergeNode"
    // InternalAct.g:686:1: ruleMergeNode returns [EObject current=null] : (otherlv_0= 'mrgn' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMergeNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAct.g:692:2: ( (otherlv_0= 'mrgn' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAct.g:693:2: (otherlv_0= 'mrgn' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAct.g:693:2: (otherlv_0= 'mrgn' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAct.g:694:3: otherlv_0= 'mrgn' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeNodeAccess().getMrgnKeyword_0());
            		
            // InternalAct.g:698:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAct.g:699:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAct.g:699:4: (lv_name_1_0= RULE_ID )
            // InternalAct.g:700:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMergeNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleMergeNode"


    // $ANTLR start "entryRuleForkNode"
    // InternalAct.g:720:1: entryRuleForkNode returns [EObject current=null] : iv_ruleForkNode= ruleForkNode EOF ;
    public final EObject entryRuleForkNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkNode = null;


        try {
            // InternalAct.g:720:49: (iv_ruleForkNode= ruleForkNode EOF )
            // InternalAct.g:721:2: iv_ruleForkNode= ruleForkNode EOF
            {
             newCompositeNode(grammarAccess.getForkNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForkNode=ruleForkNode();

            state._fsp--;

             current =iv_ruleForkNode; 
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
    // $ANTLR end "entryRuleForkNode"


    // $ANTLR start "ruleForkNode"
    // InternalAct.g:727:1: ruleForkNode returns [EObject current=null] : (otherlv_0= 'fork' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleForkNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAct.g:733:2: ( (otherlv_0= 'fork' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAct.g:734:2: (otherlv_0= 'fork' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAct.g:734:2: (otherlv_0= 'fork' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAct.g:735:3: otherlv_0= 'fork' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getForkNodeAccess().getForkKeyword_0());
            		
            // InternalAct.g:739:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAct.g:740:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAct.g:740:4: (lv_name_1_0= RULE_ID )
            // InternalAct.g:741:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getForkNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForkNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleForkNode"


    // $ANTLR start "entryRuleJoinNode"
    // InternalAct.g:761:1: entryRuleJoinNode returns [EObject current=null] : iv_ruleJoinNode= ruleJoinNode EOF ;
    public final EObject entryRuleJoinNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinNode = null;


        try {
            // InternalAct.g:761:49: (iv_ruleJoinNode= ruleJoinNode EOF )
            // InternalAct.g:762:2: iv_ruleJoinNode= ruleJoinNode EOF
            {
             newCompositeNode(grammarAccess.getJoinNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoinNode=ruleJoinNode();

            state._fsp--;

             current =iv_ruleJoinNode; 
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
    // $ANTLR end "entryRuleJoinNode"


    // $ANTLR start "ruleJoinNode"
    // InternalAct.g:768:1: ruleJoinNode returns [EObject current=null] : (otherlv_0= 'join' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJoinNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAct.g:774:2: ( (otherlv_0= 'join' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAct.g:775:2: (otherlv_0= 'join' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAct.g:775:2: (otherlv_0= 'join' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAct.g:776:3: otherlv_0= 'join' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getJoinNodeAccess().getJoinKeyword_0());
            		
            // InternalAct.g:780:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAct.g:781:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAct.g:781:4: (lv_name_1_0= RULE_ID )
            // InternalAct.g:782:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJoinNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleJoinNode"


    // $ANTLR start "entryRuleFlow"
    // InternalAct.g:802:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // InternalAct.g:802:45: (iv_ruleFlow= ruleFlow EOF )
            // InternalAct.g:803:2: iv_ruleFlow= ruleFlow EOF
            {
             newCompositeNode(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlow=ruleFlow();

            state._fsp--;

             current =iv_ruleFlow; 
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
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // InternalAct.g:809:1: ruleFlow returns [EObject current=null] : (otherlv_0= 'flw' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= '[' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= ']' )? ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalAct.g:815:2: ( (otherlv_0= 'flw' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= '[' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= ']' )? ) )
            // InternalAct.g:816:2: (otherlv_0= 'flw' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= '[' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= ']' )? )
            {
            // InternalAct.g:816:2: (otherlv_0= 'flw' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= '[' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= ']' )? )
            // InternalAct.g:817:3: otherlv_0= 'flw' otherlv_1= '(' ( ( ruleFQN ) ) otherlv_3= ',' ( ( ruleFQN ) ) otherlv_5= ')' (otherlv_6= '[' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFlowAccess().getFlwKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFlowAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAct.g:825:3: ( ( ruleFQN ) )
            // InternalAct.g:826:4: ( ruleFQN )
            {
            // InternalAct.g:826:4: ( ruleFQN )
            // InternalAct.g:827:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFlowAccess().getSourceNodeCrossReference_2_0());
            				
            pushFollow(FOLLOW_13);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getFlowAccess().getCommaKeyword_3());
            		
            // InternalAct.g:845:3: ( ( ruleFQN ) )
            // InternalAct.g:846:4: ( ruleFQN )
            {
            // InternalAct.g:846:4: ( ruleFQN )
            // InternalAct.g:847:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFlowAccess().getTargetNodeCrossReference_4_0());
            				
            pushFollow(FOLLOW_14);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getFlowAccess().getRightParenthesisKeyword_5());
            		
            // InternalAct.g:865:3: (otherlv_6= '[' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAct.g:866:4: otherlv_6= '[' ( (lv_name_7_0= RULE_STRING ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getFlowAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalAct.g:870:4: ( (lv_name_7_0= RULE_STRING ) )
                    // InternalAct.g:871:5: (lv_name_7_0= RULE_STRING )
                    {
                    // InternalAct.g:871:5: (lv_name_7_0= RULE_STRING )
                    // InternalAct.g:872:6: lv_name_7_0= RULE_STRING
                    {
                    lv_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_name_7_0, grammarAccess.getFlowAccess().getNameSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlowRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getFlowAccess().getRightSquareBracketKeyword_6_2());
                    			

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
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleSwimlane"
    // InternalAct.g:897:1: entryRuleSwimlane returns [EObject current=null] : iv_ruleSwimlane= ruleSwimlane EOF ;
    public final EObject entryRuleSwimlane() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwimlane = null;


        try {
            // InternalAct.g:897:49: (iv_ruleSwimlane= ruleSwimlane EOF )
            // InternalAct.g:898:2: iv_ruleSwimlane= ruleSwimlane EOF
            {
             newCompositeNode(grammarAccess.getSwimlaneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwimlane=ruleSwimlane();

            state._fsp--;

             current =iv_ruleSwimlane; 
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
    // $ANTLR end "entryRuleSwimlane"


    // $ANTLR start "ruleSwimlane"
    // InternalAct.g:904:1: ruleSwimlane returns [EObject current=null] : (otherlv_0= 'swl' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_nodes_3_0= ruleNode ) )* otherlv_4= '}' ) ;
    public final EObject ruleSwimlane() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_nodes_3_0 = null;



        	enterRule();

        try {
            // InternalAct.g:910:2: ( (otherlv_0= 'swl' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_nodes_3_0= ruleNode ) )* otherlv_4= '}' ) )
            // InternalAct.g:911:2: (otherlv_0= 'swl' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_nodes_3_0= ruleNode ) )* otherlv_4= '}' )
            {
            // InternalAct.g:911:2: (otherlv_0= 'swl' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_nodes_3_0= ruleNode ) )* otherlv_4= '}' )
            // InternalAct.g:912:3: otherlv_0= 'swl' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_nodes_3_0= ruleNode ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSwimlaneAccess().getSwlKeyword_0());
            		
            // InternalAct.g:916:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAct.g:917:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAct.g:917:4: (lv_name_1_0= RULE_ID )
            // InternalAct.g:918:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSwimlaneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSwimlaneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSwimlaneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAct.g:938:3: ( (lv_nodes_3_0= ruleNode ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15||(LA10_0>=17 && LA10_0<=23)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAct.g:939:4: (lv_nodes_3_0= ruleNode )
            	    {
            	    // InternalAct.g:939:4: (lv_nodes_3_0= ruleNode )
            	    // InternalAct.g:940:5: lv_nodes_3_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getSwimlaneAccess().getNodesNodeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_nodes_3_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSwimlaneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_3_0,
            	    						"de.cooperateproject.modeling.textual.activity.Act.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSwimlaneAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSwimlane"


    // $ANTLR start "entryRuleFQN"
    // InternalAct.g:965:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalAct.g:965:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalAct.g:966:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalAct.g:972:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAct.g:978:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAct.g:979:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAct.g:979:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAct.g:980:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalAct.g:987:3: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAct.g:988:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_19); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000041FEE000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000041FEC000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000041FE8002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001FE8002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100FE8000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000002L});

}