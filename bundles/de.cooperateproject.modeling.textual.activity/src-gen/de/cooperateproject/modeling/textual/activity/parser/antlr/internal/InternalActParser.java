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
import de.cooperateproject.modeling.textual.activity.services.ActGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-actd'", "'activityName'", "'@end-actd'", "'rootPackage'", "'.'", "'ini'", "'fin'", "'ffin'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalAct.g:65:1: entryRuleActivityDiagram returns [EObject current=null] : iv_ruleActivityDiagram= ruleActivityDiagram EOF ;
    public final EObject entryRuleActivityDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityDiagram = null;


        try {
            // InternalAct.g:65:56: (iv_ruleActivityDiagram= ruleActivityDiagram EOF )
            // InternalAct.g:66:2: iv_ruleActivityDiagram= ruleActivityDiagram EOF
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
    // InternalAct.g:72:1: ruleActivityDiagram returns [EObject current=null] : ( () otherlv_1= '@start-actd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) (otherlv_4= 'activityName' ( (lv_activityName_5_0= RULE_STRING ) ) )? otherlv_6= '@end-actd' ) ;
    public final EObject ruleActivityDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_4=null;
        Token lv_activityName_5_0=null;
        Token otherlv_6=null;
        EObject lv_rootPackage_3_0 = null;



        	enterRule();

        try {
            // InternalAct.g:78:2: ( ( () otherlv_1= '@start-actd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) (otherlv_4= 'activityName' ( (lv_activityName_5_0= RULE_STRING ) ) )? otherlv_6= '@end-actd' ) )
            // InternalAct.g:79:2: ( () otherlv_1= '@start-actd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) (otherlv_4= 'activityName' ( (lv_activityName_5_0= RULE_STRING ) ) )? otherlv_6= '@end-actd' )
            {
            // InternalAct.g:79:2: ( () otherlv_1= '@start-actd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) (otherlv_4= 'activityName' ( (lv_activityName_5_0= RULE_STRING ) ) )? otherlv_6= '@end-actd' )
            // InternalAct.g:80:3: () otherlv_1= '@start-actd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootPackage_3_0= ruleRootPackage ) ) (otherlv_4= 'activityName' ( (lv_activityName_5_0= RULE_STRING ) ) )? otherlv_6= '@end-actd'
            {
            // InternalAct.g:80:3: ()
            // InternalAct.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityDiagramAccess().getStartActdKeyword_1());
            		
            // InternalAct.g:91:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalAct.g:92:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalAct.g:92:4: (lv_title_2_0= RULE_STRING )
            // InternalAct.g:93:5: lv_title_2_0= RULE_STRING
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

            // InternalAct.g:109:3: ( (lv_rootPackage_3_0= ruleRootPackage ) )
            // InternalAct.g:110:4: (lv_rootPackage_3_0= ruleRootPackage )
            {
            // InternalAct.g:110:4: (lv_rootPackage_3_0= ruleRootPackage )
            // InternalAct.g:111:5: lv_rootPackage_3_0= ruleRootPackage
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

            // InternalAct.g:128:3: (otherlv_4= 'activityName' ( (lv_activityName_5_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAct.g:129:4: otherlv_4= 'activityName' ( (lv_activityName_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityDiagramAccess().getActivityNameKeyword_4_0());
                    			
                    // InternalAct.g:133:4: ( (lv_activityName_5_0= RULE_STRING ) )
                    // InternalAct.g:134:5: (lv_activityName_5_0= RULE_STRING )
                    {
                    // InternalAct.g:134:5: (lv_activityName_5_0= RULE_STRING )
                    // InternalAct.g:135:6: lv_activityName_5_0= RULE_STRING
                    {
                    lv_activityName_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_activityName_5_0, grammarAccess.getActivityDiagramAccess().getActivityNameSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityDiagramRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"activityName",
                    							lv_activityName_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActivityDiagramAccess().getEndActdKeyword_5());
            		

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
    // InternalAct.g:160:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalAct.g:160:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalAct.g:161:2: iv_ruleRootPackage= ruleRootPackage EOF
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
    // InternalAct.g:167:1: ruleRootPackage returns [EObject current=null] : ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_nodes_3_0= ruleNode ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_nodes_3_0 = null;



        	enterRule();

        try {
            // InternalAct.g:173:2: ( ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_nodes_3_0= ruleNode ) )* ) )
            // InternalAct.g:174:2: ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_nodes_3_0= ruleNode ) )* )
            {
            // InternalAct.g:174:2: ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_nodes_3_0= ruleNode ) )* )
            // InternalAct.g:175:3: () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_nodes_3_0= ruleNode ) )*
            {
            // InternalAct.g:175:3: ()
            // InternalAct.g:176:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootPackageAccess().getRootPackageAction_0(),
            					current);
            			

            }

            // InternalAct.g:182:3: (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAct.g:183:4: otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0());
                    			
                    // InternalAct.g:187:4: ( (lv_name_2_0= ruleFQN ) )
                    // InternalAct.g:188:5: (lv_name_2_0= ruleFQN )
                    {
                    // InternalAct.g:188:5: (lv_name_2_0= ruleFQN )
                    // InternalAct.g:189:6: lv_name_2_0= ruleFQN
                    {

                    						newCompositeNode(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

            // InternalAct.g:207:3: ( (lv_nodes_3_0= ruleNode ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAct.g:208:4: (lv_nodes_3_0= ruleNode )
            	    {
            	    // InternalAct.g:208:4: (lv_nodes_3_0= ruleNode )
            	    // InternalAct.g:209:5: lv_nodes_3_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getNodesNodeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_nodes_3_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
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
            	    break loop3;
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


    // $ANTLR start "entryRuleNode"
    // InternalAct.g:230:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalAct.g:230:45: (iv_ruleNode= ruleNode EOF )
            // InternalAct.g:231:2: iv_ruleNode= ruleNode EOF
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
    // InternalAct.g:237:1: ruleNode returns [EObject current=null] : ( ( (lv_type_0_0= ruleNodeType ) ) ( (lv_name_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalAct.g:243:2: ( ( ( (lv_type_0_0= ruleNodeType ) ) ( (lv_name_1_0= RULE_STRING ) )? ) )
            // InternalAct.g:244:2: ( ( (lv_type_0_0= ruleNodeType ) ) ( (lv_name_1_0= RULE_STRING ) )? )
            {
            // InternalAct.g:244:2: ( ( (lv_type_0_0= ruleNodeType ) ) ( (lv_name_1_0= RULE_STRING ) )? )
            // InternalAct.g:245:3: ( (lv_type_0_0= ruleNodeType ) ) ( (lv_name_1_0= RULE_STRING ) )?
            {
            // InternalAct.g:245:3: ( (lv_type_0_0= ruleNodeType ) )
            // InternalAct.g:246:4: (lv_type_0_0= ruleNodeType )
            {
            // InternalAct.g:246:4: (lv_type_0_0= ruleNodeType )
            // InternalAct.g:247:5: lv_type_0_0= ruleNodeType
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_0_0=ruleNodeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"de.cooperateproject.modeling.textual.activity.Act.NodeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAct.g:264:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAct.g:265:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalAct.g:265:4: (lv_name_1_0= RULE_STRING )
                    // InternalAct.g:266:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleFQN"
    // InternalAct.g:286:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalAct.g:286:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalAct.g:287:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalAct.g:293:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAct.g:299:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAct.g:300:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAct.g:300:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAct.g:301:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalAct.g:308:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAct.g:309:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleNodeType"
    // InternalAct.g:326:1: ruleNodeType returns [Enumerator current=null] : ( (enumLiteral_0= 'ini' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'ffin' ) ) ;
    public final Enumerator ruleNodeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAct.g:332:2: ( ( (enumLiteral_0= 'ini' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'ffin' ) ) )
            // InternalAct.g:333:2: ( (enumLiteral_0= 'ini' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'ffin' ) )
            {
            // InternalAct.g:333:2: ( (enumLiteral_0= 'ini' ) | (enumLiteral_1= 'fin' ) | (enumLiteral_2= 'ffin' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAct.g:334:3: (enumLiteral_0= 'ini' )
                    {
                    // InternalAct.g:334:3: (enumLiteral_0= 'ini' )
                    // InternalAct.g:335:4: enumLiteral_0= 'ini'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getINITIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNodeTypeAccess().getINITIALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAct.g:342:3: (enumLiteral_1= 'fin' )
                    {
                    // InternalAct.g:342:3: (enumLiteral_1= 'fin' )
                    // InternalAct.g:343:4: enumLiteral_1= 'fin'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getFINALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNodeTypeAccess().getFINALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAct.g:350:3: (enumLiteral_2= 'ffin' )
                    {
                    // InternalAct.g:350:3: (enumLiteral_2= 'ffin' )
                    // InternalAct.g:351:4: enumLiteral_2= 'ffin'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getFLOW_FINALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNodeTypeAccess().getFLOW_FINALEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleNodeType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000077000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});

}