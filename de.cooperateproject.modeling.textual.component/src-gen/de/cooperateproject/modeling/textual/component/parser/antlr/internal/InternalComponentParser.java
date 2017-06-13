package de.cooperateproject.modeling.textual.component.parser.antlr.internal;

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
import de.cooperateproject.modeling.textual.component.services.ComponentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentDiagram'", "'{'", "'@start-cpd'", "'rootpackage'", "'@end-clsd'", "'}'", "'RootPackage'", "'relation'", "','", "'elementcontent'", "'Component'", "'alias'", "'comments'", "'component'", "'port'", "'interfacerelation'", "'interface'", "'Generalization'", "'('", "')'", "'Abstraction'", "'Manifestation'", "'Substitution'", "'Dependency'", "'Comment'", "'body'", "'Interface'", "'member'", "'Connector'", "'Provide'", "'Require'", "'static'", "'abstract'", "'Method'", "'visibility'", "'parameters'", "'Attribute'", "'Parameter'", "'UNDEFINED'", "'PUBLIC'", "'PRIVATE'", "'PROTECTED'", "'PACKAGE'"
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
    public static final int T__53=53;
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


        public InternalComponentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponent.g"; }



     	private ComponentGrammarAccess grammarAccess;

        public InternalComponentParser(TokenStream input, ComponentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentDiagram";
       	}

       	@Override
       	protected ComponentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentDiagram"
    // InternalComponent.g:65:1: entryRuleComponentDiagram returns [EObject current=null] : iv_ruleComponentDiagram= ruleComponentDiagram EOF ;
    public final EObject entryRuleComponentDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDiagram = null;


        try {
            // InternalComponent.g:65:57: (iv_ruleComponentDiagram= ruleComponentDiagram EOF )
            // InternalComponent.g:66:2: iv_ruleComponentDiagram= ruleComponentDiagram EOF
            {
             newCompositeNode(grammarAccess.getComponentDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDiagram=ruleComponentDiagram();

            state._fsp--;

             current =iv_ruleComponentDiagram; 
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
    // $ANTLR end "entryRuleComponentDiagram"


    // $ANTLR start "ruleComponentDiagram"
    // InternalComponent.g:72:1: ruleComponentDiagram returns [EObject current=null] : (otherlv_0= 'ComponentDiagram' otherlv_1= '{' otherlv_2= '@start-cpd' ( (lv_title_3_0= ruleEString ) ) otherlv_4= 'rootpackage' ( (lv_rootpackage_5_0= ruleRootPackage ) ) otherlv_6= '@end-clsd' otherlv_7= '}' ) ;
    public final EObject ruleComponentDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        EObject lv_rootpackage_5_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:78:2: ( (otherlv_0= 'ComponentDiagram' otherlv_1= '{' otherlv_2= '@start-cpd' ( (lv_title_3_0= ruleEString ) ) otherlv_4= 'rootpackage' ( (lv_rootpackage_5_0= ruleRootPackage ) ) otherlv_6= '@end-clsd' otherlv_7= '}' ) )
            // InternalComponent.g:79:2: (otherlv_0= 'ComponentDiagram' otherlv_1= '{' otherlv_2= '@start-cpd' ( (lv_title_3_0= ruleEString ) ) otherlv_4= 'rootpackage' ( (lv_rootpackage_5_0= ruleRootPackage ) ) otherlv_6= '@end-clsd' otherlv_7= '}' )
            {
            // InternalComponent.g:79:2: (otherlv_0= 'ComponentDiagram' otherlv_1= '{' otherlv_2= '@start-cpd' ( (lv_title_3_0= ruleEString ) ) otherlv_4= 'rootpackage' ( (lv_rootpackage_5_0= ruleRootPackage ) ) otherlv_6= '@end-clsd' otherlv_7= '}' )
            // InternalComponent.g:80:3: otherlv_0= 'ComponentDiagram' otherlv_1= '{' otherlv_2= '@start-cpd' ( (lv_title_3_0= ruleEString ) ) otherlv_4= 'rootpackage' ( (lv_rootpackage_5_0= ruleRootPackage ) ) otherlv_6= '@end-clsd' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDiagramAccess().getComponentDiagramKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentDiagramAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentDiagramAccess().getStartCpdKeyword_2());
            		
            // InternalComponent.g:92:3: ( (lv_title_3_0= ruleEString ) )
            // InternalComponent.g:93:4: (lv_title_3_0= ruleEString )
            {
            // InternalComponent.g:93:4: (lv_title_3_0= ruleEString )
            // InternalComponent.g:94:5: lv_title_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentDiagramAccess().getTitleEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_title_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDiagramRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_3_0,
            						"de.cooperateproject.modeling.textual.component.Component.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentDiagramAccess().getRootpackageKeyword_4());
            		
            // InternalComponent.g:115:3: ( (lv_rootpackage_5_0= ruleRootPackage ) )
            // InternalComponent.g:116:4: (lv_rootpackage_5_0= ruleRootPackage )
            {
            // InternalComponent.g:116:4: (lv_rootpackage_5_0= ruleRootPackage )
            // InternalComponent.g:117:5: lv_rootpackage_5_0= ruleRootPackage
            {

            					newCompositeNode(grammarAccess.getComponentDiagramAccess().getRootpackageRootPackageParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_rootpackage_5_0=ruleRootPackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDiagramRule());
            					}
            					set(
            						current,
            						"rootpackage",
            						lv_rootpackage_5_0,
            						"de.cooperateproject.modeling.textual.component.Component.RootPackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentDiagramAccess().getEndClsdKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentDiagramAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleComponentDiagram"


    // $ANTLR start "entryRuleElementRelation"
    // InternalComponent.g:146:1: entryRuleElementRelation returns [EObject current=null] : iv_ruleElementRelation= ruleElementRelation EOF ;
    public final EObject entryRuleElementRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementRelation = null;


        try {
            // InternalComponent.g:146:56: (iv_ruleElementRelation= ruleElementRelation EOF )
            // InternalComponent.g:147:2: iv_ruleElementRelation= ruleElementRelation EOF
            {
             newCompositeNode(grammarAccess.getElementRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementRelation=ruleElementRelation();

            state._fsp--;

             current =iv_ruleElementRelation; 
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
    // $ANTLR end "entryRuleElementRelation"


    // $ANTLR start "ruleElementRelation"
    // InternalComponent.g:153:1: ruleElementRelation returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency ) ;
    public final EObject ruleElementRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_Abstraction_1 = null;

        EObject this_Manifestation_2 = null;

        EObject this_Substitution_3 = null;

        EObject this_Dependency_4 = null;



        	enterRule();

        try {
            // InternalComponent.g:159:2: ( (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency ) )
            // InternalComponent.g:160:2: (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency )
            {
            // InternalComponent.g:160:2: (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 32:
                {
                alt1=3;
                }
                break;
            case 33:
                {
                alt1=4;
                }
                break;
            case 34:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalComponent.g:161:3: this_Generalization_0= ruleGeneralization
                    {

                    			newCompositeNode(grammarAccess.getElementRelationAccess().getGeneralizationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generalization_0=ruleGeneralization();

                    state._fsp--;


                    			current = this_Generalization_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponent.g:170:3: this_Abstraction_1= ruleAbstraction
                    {

                    			newCompositeNode(grammarAccess.getElementRelationAccess().getAbstractionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Abstraction_1=ruleAbstraction();

                    state._fsp--;


                    			current = this_Abstraction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponent.g:179:3: this_Manifestation_2= ruleManifestation
                    {

                    			newCompositeNode(grammarAccess.getElementRelationAccess().getManifestationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Manifestation_2=ruleManifestation();

                    state._fsp--;


                    			current = this_Manifestation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalComponent.g:188:3: this_Substitution_3= ruleSubstitution
                    {

                    			newCompositeNode(grammarAccess.getElementRelationAccess().getSubstitutionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Substitution_3=ruleSubstitution();

                    state._fsp--;


                    			current = this_Substitution_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalComponent.g:197:3: this_Dependency_4= ruleDependency
                    {

                    			newCompositeNode(grammarAccess.getElementRelationAccess().getDependencyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dependency_4=ruleDependency();

                    state._fsp--;


                    			current = this_Dependency_4;
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
    // $ANTLR end "ruleElementRelation"


    // $ANTLR start "entryRuleElementContent"
    // InternalComponent.g:209:1: entryRuleElementContent returns [EObject current=null] : iv_ruleElementContent= ruleElementContent EOF ;
    public final EObject entryRuleElementContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementContent = null;


        try {
            // InternalComponent.g:209:55: (iv_ruleElementContent= ruleElementContent EOF )
            // InternalComponent.g:210:2: iv_ruleElementContent= ruleElementContent EOF
            {
             newCompositeNode(grammarAccess.getElementContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementContent=ruleElementContent();

            state._fsp--;

             current =iv_ruleElementContent; 
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
    // $ANTLR end "entryRuleElementContent"


    // $ANTLR start "ruleElementContent"
    // InternalComponent.g:216:1: ruleElementContent returns [EObject current=null] : (this_Interface_0= ruleInterface | this_Component_1= ruleComponent ) ;
    public final EObject ruleElementContent() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_Component_1 = null;



        	enterRule();

        try {
            // InternalComponent.g:222:2: ( (this_Interface_0= ruleInterface | this_Component_1= ruleComponent ) )
            // InternalComponent.g:223:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent )
            {
            // InternalComponent.g:223:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==37) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponent.g:224:3: this_Interface_0= ruleInterface
                    {

                    			newCompositeNode(grammarAccess.getElementContentAccess().getInterfaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_0=ruleInterface();

                    state._fsp--;


                    			current = this_Interface_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponent.g:233:3: this_Component_1= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getElementContentAccess().getComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_1=ruleComponent();

                    state._fsp--;


                    			current = this_Component_1;
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
    // $ANTLR end "ruleElementContent"


    // $ANTLR start "entryRulePortRelation"
    // InternalComponent.g:245:1: entryRulePortRelation returns [EObject current=null] : iv_rulePortRelation= rulePortRelation EOF ;
    public final EObject entryRulePortRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortRelation = null;


        try {
            // InternalComponent.g:245:53: (iv_rulePortRelation= rulePortRelation EOF )
            // InternalComponent.g:246:2: iv_rulePortRelation= rulePortRelation EOF
            {
             newCompositeNode(grammarAccess.getPortRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortRelation=rulePortRelation();

            state._fsp--;

             current =iv_rulePortRelation; 
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
    // $ANTLR end "entryRulePortRelation"


    // $ANTLR start "rulePortRelation"
    // InternalComponent.g:252:1: rulePortRelation returns [EObject current=null] : this_Connector_0= ruleConnector ;
    public final EObject rulePortRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Connector_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:258:2: (this_Connector_0= ruleConnector )
            // InternalComponent.g:259:2: this_Connector_0= ruleConnector
            {

            		newCompositeNode(grammarAccess.getPortRelationAccess().getConnectorParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Connector_0=ruleConnector();

            state._fsp--;


            		current = this_Connector_0;
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
    // $ANTLR end "rulePortRelation"


    // $ANTLR start "entryRuleInterfaceRelation"
    // InternalComponent.g:270:1: entryRuleInterfaceRelation returns [EObject current=null] : iv_ruleInterfaceRelation= ruleInterfaceRelation EOF ;
    public final EObject entryRuleInterfaceRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceRelation = null;


        try {
            // InternalComponent.g:270:58: (iv_ruleInterfaceRelation= ruleInterfaceRelation EOF )
            // InternalComponent.g:271:2: iv_ruleInterfaceRelation= ruleInterfaceRelation EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceRelation=ruleInterfaceRelation();

            state._fsp--;

             current =iv_ruleInterfaceRelation; 
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
    // $ANTLR end "entryRuleInterfaceRelation"


    // $ANTLR start "ruleInterfaceRelation"
    // InternalComponent.g:277:1: ruleInterfaceRelation returns [EObject current=null] : (this_Provide_0= ruleProvide | this_Require_1= ruleRequire ) ;
    public final EObject ruleInterfaceRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Provide_0 = null;

        EObject this_Require_1 = null;



        	enterRule();

        try {
            // InternalComponent.g:283:2: ( (this_Provide_0= ruleProvide | this_Require_1= ruleRequire ) )
            // InternalComponent.g:284:2: (this_Provide_0= ruleProvide | this_Require_1= ruleRequire )
            {
            // InternalComponent.g:284:2: (this_Provide_0= ruleProvide | this_Require_1= ruleRequire )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            else if ( (LA3_0==41) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponent.g:285:3: this_Provide_0= ruleProvide
                    {

                    			newCompositeNode(grammarAccess.getInterfaceRelationAccess().getProvideParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Provide_0=ruleProvide();

                    state._fsp--;


                    			current = this_Provide_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponent.g:294:3: this_Require_1= ruleRequire
                    {

                    			newCompositeNode(grammarAccess.getInterfaceRelationAccess().getRequireParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Require_1=ruleRequire();

                    state._fsp--;


                    			current = this_Require_1;
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
    // $ANTLR end "ruleInterfaceRelation"


    // $ANTLR start "entryRuleMember"
    // InternalComponent.g:306:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalComponent.g:306:47: (iv_ruleMember= ruleMember EOF )
            // InternalComponent.g:307:2: iv_ruleMember= ruleMember EOF
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
    // InternalComponent.g:313:1: ruleMember returns [EObject current=null] : (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Attribute_1 = null;



        	enterRule();

        try {
            // InternalComponent.g:319:2: ( (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute ) )
            // InternalComponent.g:320:2: (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute )
            {
            // InternalComponent.g:320:2: (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 42:
                {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=43 && LA4_1<=44)) ) {
                    alt4=1;
                }
                else if ( (LA4_1==47) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 43:
            case 44:
                {
                alt4=1;
                }
                break;
            case 47:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalComponent.g:321:3: this_Method_0= ruleMethod
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Method_0=ruleMethod();

                    state._fsp--;


                    			current = this_Method_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponent.g:330:3: this_Attribute_1= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_1=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_1;
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


    // $ANTLR start "entryRuleEString"
    // InternalComponent.g:342:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponent.g:342:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponent.g:343:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalComponent.g:349:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComponent.g:355:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComponent.g:356:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComponent.g:356:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalComponent.g:357:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponent.g:365:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRootPackage"
    // InternalComponent.g:376:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalComponent.g:376:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalComponent.g:377:2: iv_ruleRootPackage= ruleRootPackage EOF
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
    // InternalComponent.g:383:1: ruleRootPackage returns [EObject current=null] : ( () otherlv_1= 'RootPackage' otherlv_2= '{' (otherlv_3= 'relation' otherlv_4= '{' ( (lv_relation_5_0= ruleElementRelation ) ) (otherlv_6= ',' ( (lv_relation_7_0= ruleElementRelation ) ) )* otherlv_8= '}' )? (otherlv_9= 'elementcontent' otherlv_10= '{' ( (lv_elementcontent_11_0= ruleElementContent ) ) (otherlv_12= ',' ( (lv_elementcontent_13_0= ruleElementContent ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_relation_5_0 = null;

        EObject lv_relation_7_0 = null;

        EObject lv_elementcontent_11_0 = null;

        EObject lv_elementcontent_13_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:389:2: ( ( () otherlv_1= 'RootPackage' otherlv_2= '{' (otherlv_3= 'relation' otherlv_4= '{' ( (lv_relation_5_0= ruleElementRelation ) ) (otherlv_6= ',' ( (lv_relation_7_0= ruleElementRelation ) ) )* otherlv_8= '}' )? (otherlv_9= 'elementcontent' otherlv_10= '{' ( (lv_elementcontent_11_0= ruleElementContent ) ) (otherlv_12= ',' ( (lv_elementcontent_13_0= ruleElementContent ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalComponent.g:390:2: ( () otherlv_1= 'RootPackage' otherlv_2= '{' (otherlv_3= 'relation' otherlv_4= '{' ( (lv_relation_5_0= ruleElementRelation ) ) (otherlv_6= ',' ( (lv_relation_7_0= ruleElementRelation ) ) )* otherlv_8= '}' )? (otherlv_9= 'elementcontent' otherlv_10= '{' ( (lv_elementcontent_11_0= ruleElementContent ) ) (otherlv_12= ',' ( (lv_elementcontent_13_0= ruleElementContent ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalComponent.g:390:2: ( () otherlv_1= 'RootPackage' otherlv_2= '{' (otherlv_3= 'relation' otherlv_4= '{' ( (lv_relation_5_0= ruleElementRelation ) ) (otherlv_6= ',' ( (lv_relation_7_0= ruleElementRelation ) ) )* otherlv_8= '}' )? (otherlv_9= 'elementcontent' otherlv_10= '{' ( (lv_elementcontent_11_0= ruleElementContent ) ) (otherlv_12= ',' ( (lv_elementcontent_13_0= ruleElementContent ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalComponent.g:391:3: () otherlv_1= 'RootPackage' otherlv_2= '{' (otherlv_3= 'relation' otherlv_4= '{' ( (lv_relation_5_0= ruleElementRelation ) ) (otherlv_6= ',' ( (lv_relation_7_0= ruleElementRelation ) ) )* otherlv_8= '}' )? (otherlv_9= 'elementcontent' otherlv_10= '{' ( (lv_elementcontent_11_0= ruleElementContent ) ) (otherlv_12= ',' ( (lv_elementcontent_13_0= ruleElementContent ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalComponent.g:391:3: ()
            // InternalComponent.g:392:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootPackageAccess().getRootPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRootPackageAccess().getRootPackageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRootPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponent.g:406:3: (otherlv_3= 'relation' otherlv_4= '{' ( (lv_relation_5_0= ruleElementRelation ) ) (otherlv_6= ',' ( (lv_relation_7_0= ruleElementRelation ) ) )* otherlv_8= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponent.g:407:4: otherlv_3= 'relation' otherlv_4= '{' ( (lv_relation_5_0= ruleElementRelation ) ) (otherlv_6= ',' ( (lv_relation_7_0= ruleElementRelation ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRootPackageAccess().getRelationKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getRootPackageAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalComponent.g:415:4: ( (lv_relation_5_0= ruleElementRelation ) )
                    // InternalComponent.g:416:5: (lv_relation_5_0= ruleElementRelation )
                    {
                    // InternalComponent.g:416:5: (lv_relation_5_0= ruleElementRelation )
                    // InternalComponent.g:417:6: lv_relation_5_0= ruleElementRelation
                    {

                    						newCompositeNode(grammarAccess.getRootPackageAccess().getRelationElementRelationParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_relation_5_0=ruleElementRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootPackageRule());
                    						}
                    						add(
                    							current,
                    							"relation",
                    							lv_relation_5_0,
                    							"de.cooperateproject.modeling.textual.component.Component.ElementRelation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponent.g:434:4: (otherlv_6= ',' ( (lv_relation_7_0= ruleElementRelation ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalComponent.g:435:5: otherlv_6= ',' ( (lv_relation_7_0= ruleElementRelation ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_11); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRootPackageAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalComponent.g:439:5: ( (lv_relation_7_0= ruleElementRelation ) )
                    	    // InternalComponent.g:440:6: (lv_relation_7_0= ruleElementRelation )
                    	    {
                    	    // InternalComponent.g:440:6: (lv_relation_7_0= ruleElementRelation )
                    	    // InternalComponent.g:441:7: lv_relation_7_0= ruleElementRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRootPackageAccess().getRelationElementRelationParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_relation_7_0=ruleElementRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRootPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation",
                    	    								lv_relation_7_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.ElementRelation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getRootPackageAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalComponent.g:464:3: (otherlv_9= 'elementcontent' otherlv_10= '{' ( (lv_elementcontent_11_0= ruleElementContent ) ) (otherlv_12= ',' ( (lv_elementcontent_13_0= ruleElementContent ) ) )* otherlv_14= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponent.g:465:4: otherlv_9= 'elementcontent' otherlv_10= '{' ( (lv_elementcontent_11_0= ruleElementContent ) ) (otherlv_12= ',' ( (lv_elementcontent_13_0= ruleElementContent ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRootPackageAccess().getElementcontentKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getRootPackageAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalComponent.g:473:4: ( (lv_elementcontent_11_0= ruleElementContent ) )
                    // InternalComponent.g:474:5: (lv_elementcontent_11_0= ruleElementContent )
                    {
                    // InternalComponent.g:474:5: (lv_elementcontent_11_0= ruleElementContent )
                    // InternalComponent.g:475:6: lv_elementcontent_11_0= ruleElementContent
                    {

                    						newCompositeNode(grammarAccess.getRootPackageAccess().getElementcontentElementContentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_elementcontent_11_0=ruleElementContent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootPackageRule());
                    						}
                    						add(
                    							current,
                    							"elementcontent",
                    							lv_elementcontent_11_0,
                    							"de.cooperateproject.modeling.textual.component.Component.ElementContent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponent.g:492:4: (otherlv_12= ',' ( (lv_elementcontent_13_0= ruleElementContent ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalComponent.g:493:5: otherlv_12= ',' ( (lv_elementcontent_13_0= ruleElementContent ) )
                    	    {
                    	    otherlv_12=(Token)match(input,19,FOLLOW_14); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRootPackageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalComponent.g:497:5: ( (lv_elementcontent_13_0= ruleElementContent ) )
                    	    // InternalComponent.g:498:6: (lv_elementcontent_13_0= ruleElementContent )
                    	    {
                    	    // InternalComponent.g:498:6: (lv_elementcontent_13_0= ruleElementContent )
                    	    // InternalComponent.g:499:7: lv_elementcontent_13_0= ruleElementContent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRootPackageAccess().getElementcontentElementContentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_elementcontent_13_0=ruleElementContent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRootPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elementcontent",
                    	    								lv_elementcontent_13_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.ElementContent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getRootPackageAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRootPackageAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleComponent"
    // InternalComponent.g:530:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalComponent.g:530:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalComponent.g:531:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalComponent.g:537:1: ruleComponent returns [EObject current=null] : ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )? (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )? (otherlv_12= 'component' otherlv_13= '{' ( (lv_component_14_0= ruleComponent ) ) (otherlv_15= ',' ( (lv_component_16_0= ruleComponent ) ) )* otherlv_17= '}' )? (otherlv_18= 'port' otherlv_19= '{' ( (lv_port_20_0= rulePortRelation ) ) (otherlv_21= ',' ( (lv_port_22_0= rulePortRelation ) ) )* otherlv_23= '}' )? (otherlv_24= 'interfacerelation' otherlv_25= '{' ( (lv_interfacerelation_26_0= ruleInterfaceRelation ) ) (otherlv_27= ',' ( (lv_interfacerelation_28_0= ruleInterfaceRelation ) ) )* otherlv_29= '}' )? (otherlv_30= 'interface' otherlv_31= '{' ( (lv_interface_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_interface_34_0= ruleInterface ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_alias_5_0 = null;

        EObject lv_comments_8_0 = null;

        EObject lv_comments_10_0 = null;

        EObject lv_component_14_0 = null;

        EObject lv_component_16_0 = null;

        EObject lv_port_20_0 = null;

        EObject lv_port_22_0 = null;

        EObject lv_interfacerelation_26_0 = null;

        EObject lv_interfacerelation_28_0 = null;

        EObject lv_interface_32_0 = null;

        EObject lv_interface_34_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:543:2: ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )? (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )? (otherlv_12= 'component' otherlv_13= '{' ( (lv_component_14_0= ruleComponent ) ) (otherlv_15= ',' ( (lv_component_16_0= ruleComponent ) ) )* otherlv_17= '}' )? (otherlv_18= 'port' otherlv_19= '{' ( (lv_port_20_0= rulePortRelation ) ) (otherlv_21= ',' ( (lv_port_22_0= rulePortRelation ) ) )* otherlv_23= '}' )? (otherlv_24= 'interfacerelation' otherlv_25= '{' ( (lv_interfacerelation_26_0= ruleInterfaceRelation ) ) (otherlv_27= ',' ( (lv_interfacerelation_28_0= ruleInterfaceRelation ) ) )* otherlv_29= '}' )? (otherlv_30= 'interface' otherlv_31= '{' ( (lv_interface_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_interface_34_0= ruleInterface ) ) )* otherlv_35= '}' )? otherlv_36= '}' ) )
            // InternalComponent.g:544:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )? (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )? (otherlv_12= 'component' otherlv_13= '{' ( (lv_component_14_0= ruleComponent ) ) (otherlv_15= ',' ( (lv_component_16_0= ruleComponent ) ) )* otherlv_17= '}' )? (otherlv_18= 'port' otherlv_19= '{' ( (lv_port_20_0= rulePortRelation ) ) (otherlv_21= ',' ( (lv_port_22_0= rulePortRelation ) ) )* otherlv_23= '}' )? (otherlv_24= 'interfacerelation' otherlv_25= '{' ( (lv_interfacerelation_26_0= ruleInterfaceRelation ) ) (otherlv_27= ',' ( (lv_interfacerelation_28_0= ruleInterfaceRelation ) ) )* otherlv_29= '}' )? (otherlv_30= 'interface' otherlv_31= '{' ( (lv_interface_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_interface_34_0= ruleInterface ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            {
            // InternalComponent.g:544:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )? (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )? (otherlv_12= 'component' otherlv_13= '{' ( (lv_component_14_0= ruleComponent ) ) (otherlv_15= ',' ( (lv_component_16_0= ruleComponent ) ) )* otherlv_17= '}' )? (otherlv_18= 'port' otherlv_19= '{' ( (lv_port_20_0= rulePortRelation ) ) (otherlv_21= ',' ( (lv_port_22_0= rulePortRelation ) ) )* otherlv_23= '}' )? (otherlv_24= 'interfacerelation' otherlv_25= '{' ( (lv_interfacerelation_26_0= ruleInterfaceRelation ) ) (otherlv_27= ',' ( (lv_interfacerelation_28_0= ruleInterfaceRelation ) ) )* otherlv_29= '}' )? (otherlv_30= 'interface' otherlv_31= '{' ( (lv_interface_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_interface_34_0= ruleInterface ) ) )* otherlv_35= '}' )? otherlv_36= '}' )
            // InternalComponent.g:545:3: () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )? (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )? (otherlv_12= 'component' otherlv_13= '{' ( (lv_component_14_0= ruleComponent ) ) (otherlv_15= ',' ( (lv_component_16_0= ruleComponent ) ) )* otherlv_17= '}' )? (otherlv_18= 'port' otherlv_19= '{' ( (lv_port_20_0= rulePortRelation ) ) (otherlv_21= ',' ( (lv_port_22_0= rulePortRelation ) ) )* otherlv_23= '}' )? (otherlv_24= 'interfacerelation' otherlv_25= '{' ( (lv_interfacerelation_26_0= ruleInterfaceRelation ) ) (otherlv_27= ',' ( (lv_interfacerelation_28_0= ruleInterfaceRelation ) ) )* otherlv_29= '}' )? (otherlv_30= 'interface' otherlv_31= '{' ( (lv_interface_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_interface_34_0= ruleInterface ) ) )* otherlv_35= '}' )? otherlv_36= '}'
            {
            // InternalComponent.g:545:3: ()
            // InternalComponent.g:546:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentKeyword_1());
            		
            // InternalComponent.g:556:3: ( (lv_name_2_0= ruleEString ) )
            // InternalComponent.g:557:4: (lv_name_2_0= ruleEString )
            {
            // InternalComponent.g:557:4: (lv_name_2_0= ruleEString )
            // InternalComponent.g:558:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.cooperateproject.modeling.textual.component.Component.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponent.g:579:3: (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponent.g:580:4: otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getAliasKeyword_4_0());
                    			
                    // InternalComponent.g:584:4: ( (lv_alias_5_0= ruleEString ) )
                    // InternalComponent.g:585:5: (lv_alias_5_0= ruleEString )
                    {
                    // InternalComponent.g:585:5: (lv_alias_5_0= ruleEString )
                    // InternalComponent.g:586:6: lv_alias_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getAliasEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_alias_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_5_0,
                    							"de.cooperateproject.modeling.textual.component.Component.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponent.g:604:3: (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponent.g:605:4: otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getCommentsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalComponent.g:613:4: ( (lv_comments_8_0= ruleComment ) )
                    // InternalComponent.g:614:5: (lv_comments_8_0= ruleComment )
                    {
                    // InternalComponent.g:614:5: (lv_comments_8_0= ruleComment )
                    // InternalComponent.g:615:6: lv_comments_8_0= ruleComment
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_comments_8_0=ruleComment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"comments",
                    							lv_comments_8_0,
                    							"de.cooperateproject.modeling.textual.component.Component.Comment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponent.g:632:4: (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalComponent.g:633:5: otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalComponent.g:637:5: ( (lv_comments_10_0= ruleComment ) )
                    	    // InternalComponent.g:638:6: (lv_comments_10_0= ruleComment )
                    	    {
                    	    // InternalComponent.g:638:6: (lv_comments_10_0= ruleComment )
                    	    // InternalComponent.g:639:7: lv_comments_10_0= ruleComment
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_comments_10_0=ruleComment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"comments",
                    	    								lv_comments_10_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Comment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalComponent.g:662:3: (otherlv_12= 'component' otherlv_13= '{' ( (lv_component_14_0= ruleComponent ) ) (otherlv_15= ',' ( (lv_component_16_0= ruleComponent ) ) )* otherlv_17= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponent.g:663:4: otherlv_12= 'component' otherlv_13= '{' ( (lv_component_14_0= ruleComponent ) ) (otherlv_15= ',' ( (lv_component_16_0= ruleComponent ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getComponentKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalComponent.g:671:4: ( (lv_component_14_0= ruleComponent ) )
                    // InternalComponent.g:672:5: (lv_component_14_0= ruleComponent )
                    {
                    // InternalComponent.g:672:5: (lv_component_14_0= ruleComponent )
                    // InternalComponent.g:673:6: lv_component_14_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getComponentComponentParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_component_14_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"component",
                    							lv_component_14_0,
                    							"de.cooperateproject.modeling.textual.component.Component.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponent.g:690:4: (otherlv_15= ',' ( (lv_component_16_0= ruleComponent ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==19) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalComponent.g:691:5: otherlv_15= ',' ( (lv_component_16_0= ruleComponent ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FOLLOW_14); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalComponent.g:695:5: ( (lv_component_16_0= ruleComponent ) )
                    	    // InternalComponent.g:696:6: (lv_component_16_0= ruleComponent )
                    	    {
                    	    // InternalComponent.g:696:6: (lv_component_16_0= ruleComponent )
                    	    // InternalComponent.g:697:7: lv_component_16_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getComponentComponentParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_component_16_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"component",
                    	    								lv_component_16_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_17, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalComponent.g:720:3: (otherlv_18= 'port' otherlv_19= '{' ( (lv_port_20_0= rulePortRelation ) ) (otherlv_21= ',' ( (lv_port_22_0= rulePortRelation ) ) )* otherlv_23= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponent.g:721:4: otherlv_18= 'port' otherlv_19= '{' ( (lv_port_20_0= rulePortRelation ) ) (otherlv_21= ',' ( (lv_port_22_0= rulePortRelation ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getPortKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_19, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalComponent.g:729:4: ( (lv_port_20_0= rulePortRelation ) )
                    // InternalComponent.g:730:5: (lv_port_20_0= rulePortRelation )
                    {
                    // InternalComponent.g:730:5: (lv_port_20_0= rulePortRelation )
                    // InternalComponent.g:731:6: lv_port_20_0= rulePortRelation
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getPortPortRelationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_port_20_0=rulePortRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"port",
                    							lv_port_20_0,
                    							"de.cooperateproject.modeling.textual.component.Component.PortRelation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponent.g:748:4: (otherlv_21= ',' ( (lv_port_22_0= rulePortRelation ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==19) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalComponent.g:749:5: otherlv_21= ',' ( (lv_port_22_0= rulePortRelation ) )
                    	    {
                    	    otherlv_21=(Token)match(input,19,FOLLOW_20); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getComponentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalComponent.g:753:5: ( (lv_port_22_0= rulePortRelation ) )
                    	    // InternalComponent.g:754:6: (lv_port_22_0= rulePortRelation )
                    	    {
                    	    // InternalComponent.g:754:6: (lv_port_22_0= rulePortRelation )
                    	    // InternalComponent.g:755:7: lv_port_22_0= rulePortRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getPortPortRelationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_port_22_0=rulePortRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"port",
                    	    								lv_port_22_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.PortRelation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_23, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalComponent.g:778:3: (otherlv_24= 'interfacerelation' otherlv_25= '{' ( (lv_interfacerelation_26_0= ruleInterfaceRelation ) ) (otherlv_27= ',' ( (lv_interfacerelation_28_0= ruleInterfaceRelation ) ) )* otherlv_29= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponent.g:779:4: otherlv_24= 'interfacerelation' otherlv_25= '{' ( (lv_interfacerelation_26_0= ruleInterfaceRelation ) ) (otherlv_27= ',' ( (lv_interfacerelation_28_0= ruleInterfaceRelation ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getComponentAccess().getInterfacerelationKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_25, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalComponent.g:787:4: ( (lv_interfacerelation_26_0= ruleInterfaceRelation ) )
                    // InternalComponent.g:788:5: (lv_interfacerelation_26_0= ruleInterfaceRelation )
                    {
                    // InternalComponent.g:788:5: (lv_interfacerelation_26_0= ruleInterfaceRelation )
                    // InternalComponent.g:789:6: lv_interfacerelation_26_0= ruleInterfaceRelation
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getInterfacerelationInterfaceRelationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_interfacerelation_26_0=ruleInterfaceRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"interfacerelation",
                    							lv_interfacerelation_26_0,
                    							"de.cooperateproject.modeling.textual.component.Component.InterfaceRelation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponent.g:806:4: (otherlv_27= ',' ( (lv_interfacerelation_28_0= ruleInterfaceRelation ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==19) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalComponent.g:807:5: otherlv_27= ',' ( (lv_interfacerelation_28_0= ruleInterfaceRelation ) )
                    	    {
                    	    otherlv_27=(Token)match(input,19,FOLLOW_22); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getComponentAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalComponent.g:811:5: ( (lv_interfacerelation_28_0= ruleInterfaceRelation ) )
                    	    // InternalComponent.g:812:6: (lv_interfacerelation_28_0= ruleInterfaceRelation )
                    	    {
                    	    // InternalComponent.g:812:6: (lv_interfacerelation_28_0= ruleInterfaceRelation )
                    	    // InternalComponent.g:813:7: lv_interfacerelation_28_0= ruleInterfaceRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getInterfacerelationInterfaceRelationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_interfacerelation_28_0=ruleInterfaceRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfacerelation",
                    	    								lv_interfacerelation_28_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.InterfaceRelation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,16,FOLLOW_23); 

                    				newLeafNode(otherlv_29, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalComponent.g:836:3: (otherlv_30= 'interface' otherlv_31= '{' ( (lv_interface_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_interface_34_0= ruleInterface ) ) )* otherlv_35= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponent.g:837:4: otherlv_30= 'interface' otherlv_31= '{' ( (lv_interface_32_0= ruleInterface ) ) (otherlv_33= ',' ( (lv_interface_34_0= ruleInterface ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getComponentAccess().getInterfaceKeyword_9_0());
                    			
                    otherlv_31=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_31, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalComponent.g:845:4: ( (lv_interface_32_0= ruleInterface ) )
                    // InternalComponent.g:846:5: (lv_interface_32_0= ruleInterface )
                    {
                    // InternalComponent.g:846:5: (lv_interface_32_0= ruleInterface )
                    // InternalComponent.g:847:6: lv_interface_32_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getInterfaceInterfaceParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_interface_32_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_32_0,
                    							"de.cooperateproject.modeling.textual.component.Component.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponent.g:864:4: (otherlv_33= ',' ( (lv_interface_34_0= ruleInterface ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==19) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalComponent.g:865:5: otherlv_33= ',' ( (lv_interface_34_0= ruleInterface ) )
                    	    {
                    	    otherlv_33=(Token)match(input,19,FOLLOW_24); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getComponentAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalComponent.g:869:5: ( (lv_interface_34_0= ruleInterface ) )
                    	    // InternalComponent.g:870:6: (lv_interface_34_0= ruleInterface )
                    	    {
                    	    // InternalComponent.g:870:6: (lv_interface_34_0= ruleInterface )
                    	    // InternalComponent.g:871:7: lv_interface_34_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getInterfaceInterfaceParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_interface_34_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_34_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_35, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_36=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleGeneralization"
    // InternalComponent.g:902:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalComponent.g:902:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalComponent.g:903:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalComponent.g:909:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'Generalization' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalComponent.g:915:2: ( (otherlv_0= 'Generalization' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalComponent.g:916:2: (otherlv_0= 'Generalization' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalComponent.g:916:2: (otherlv_0= 'Generalization' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalComponent.g:917:3: otherlv_0= 'Generalization' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGeneralizationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralizationAccess().getComponentKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalComponent.g:933:3: ( ( ruleEString ) )
            // InternalComponent.g:934:4: ( ruleEString )
            {
            // InternalComponent.g:934:4: ( ruleEString )
            // InternalComponent.g:935:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponent.g:949:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComponent.g:950:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalComponent.g:954:4: ( ( ruleEString ) )
            	    // InternalComponent.g:955:5: ( ruleEString )
            	    {
            	    // InternalComponent.g:955:5: ( ruleEString )
            	    // InternalComponent.g:956:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGeneralizationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGeneralizationAccess().getComponentComponentCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getGeneralizationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGeneralizationAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleAbstraction"
    // InternalComponent.g:983:1: entryRuleAbstraction returns [EObject current=null] : iv_ruleAbstraction= ruleAbstraction EOF ;
    public final EObject entryRuleAbstraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstraction = null;


        try {
            // InternalComponent.g:983:52: (iv_ruleAbstraction= ruleAbstraction EOF )
            // InternalComponent.g:984:2: iv_ruleAbstraction= ruleAbstraction EOF
            {
             newCompositeNode(grammarAccess.getAbstractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstraction=ruleAbstraction();

            state._fsp--;

             current =iv_ruleAbstraction; 
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
    // $ANTLR end "entryRuleAbstraction"


    // $ANTLR start "ruleAbstraction"
    // InternalComponent.g:990:1: ruleAbstraction returns [EObject current=null] : (otherlv_0= 'Abstraction' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleAbstraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalComponent.g:996:2: ( (otherlv_0= 'Abstraction' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalComponent.g:997:2: (otherlv_0= 'Abstraction' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalComponent.g:997:2: (otherlv_0= 'Abstraction' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalComponent.g:998:3: otherlv_0= 'Abstraction' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractionAccess().getAbstractionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractionAccess().getComponentKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalComponent.g:1014:3: ( ( ruleEString ) )
            // InternalComponent.g:1015:4: ( ruleEString )
            {
            // InternalComponent.g:1015:4: ( ruleEString )
            // InternalComponent.g:1016:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAbstractionAccess().getComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponent.g:1030:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalComponent.g:1031:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAbstractionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalComponent.g:1035:4: ( ( ruleEString ) )
            	    // InternalComponent.g:1036:5: ( ruleEString )
            	    {
            	    // InternalComponent.g:1036:5: ( ruleEString )
            	    // InternalComponent.g:1037:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAbstractionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAbstractionAccess().getComponentComponentCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getAbstractionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAbstractionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAbstraction"


    // $ANTLR start "entryRuleManifestation"
    // InternalComponent.g:1064:1: entryRuleManifestation returns [EObject current=null] : iv_ruleManifestation= ruleManifestation EOF ;
    public final EObject entryRuleManifestation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManifestation = null;


        try {
            // InternalComponent.g:1064:54: (iv_ruleManifestation= ruleManifestation EOF )
            // InternalComponent.g:1065:2: iv_ruleManifestation= ruleManifestation EOF
            {
             newCompositeNode(grammarAccess.getManifestationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManifestation=ruleManifestation();

            state._fsp--;

             current =iv_ruleManifestation; 
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
    // $ANTLR end "entryRuleManifestation"


    // $ANTLR start "ruleManifestation"
    // InternalComponent.g:1071:1: ruleManifestation returns [EObject current=null] : (otherlv_0= 'Manifestation' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleManifestation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalComponent.g:1077:2: ( (otherlv_0= 'Manifestation' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalComponent.g:1078:2: (otherlv_0= 'Manifestation' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalComponent.g:1078:2: (otherlv_0= 'Manifestation' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalComponent.g:1079:3: otherlv_0= 'Manifestation' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getManifestationAccess().getManifestationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getManifestationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getManifestationAccess().getComponentKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getManifestationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalComponent.g:1095:3: ( ( ruleEString ) )
            // InternalComponent.g:1096:4: ( ruleEString )
            {
            // InternalComponent.g:1096:4: ( ruleEString )
            // InternalComponent.g:1097:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManifestationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManifestationAccess().getComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponent.g:1111:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalComponent.g:1112:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getManifestationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalComponent.g:1116:4: ( ( ruleEString ) )
            	    // InternalComponent.g:1117:5: ( ruleEString )
            	    {
            	    // InternalComponent.g:1117:5: ( ruleEString )
            	    // InternalComponent.g:1118:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getManifestationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getManifestationAccess().getComponentComponentCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getManifestationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getManifestationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleManifestation"


    // $ANTLR start "entryRuleSubstitution"
    // InternalComponent.g:1145:1: entryRuleSubstitution returns [EObject current=null] : iv_ruleSubstitution= ruleSubstitution EOF ;
    public final EObject entryRuleSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstitution = null;


        try {
            // InternalComponent.g:1145:53: (iv_ruleSubstitution= ruleSubstitution EOF )
            // InternalComponent.g:1146:2: iv_ruleSubstitution= ruleSubstitution EOF
            {
             newCompositeNode(grammarAccess.getSubstitutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubstitution=ruleSubstitution();

            state._fsp--;

             current =iv_ruleSubstitution; 
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
    // $ANTLR end "entryRuleSubstitution"


    // $ANTLR start "ruleSubstitution"
    // InternalComponent.g:1152:1: ruleSubstitution returns [EObject current=null] : (otherlv_0= 'Substitution' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleSubstitution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalComponent.g:1158:2: ( (otherlv_0= 'Substitution' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalComponent.g:1159:2: (otherlv_0= 'Substitution' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalComponent.g:1159:2: (otherlv_0= 'Substitution' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalComponent.g:1160:3: otherlv_0= 'Substitution' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubstitutionAccess().getSubstitutionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getSubstitutionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getSubstitutionAccess().getComponentKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSubstitutionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalComponent.g:1176:3: ( ( ruleEString ) )
            // InternalComponent.g:1177:4: ( ruleEString )
            {
            // InternalComponent.g:1177:4: ( ruleEString )
            // InternalComponent.g:1178:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstitutionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubstitutionAccess().getComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponent.g:1192:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalComponent.g:1193:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSubstitutionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalComponent.g:1197:4: ( ( ruleEString ) )
            	    // InternalComponent.g:1198:5: ( ruleEString )
            	    {
            	    // InternalComponent.g:1198:5: ( ruleEString )
            	    // InternalComponent.g:1199:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSubstitutionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSubstitutionAccess().getComponentComponentCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getSubstitutionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSubstitutionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSubstitution"


    // $ANTLR start "entryRuleDependency"
    // InternalComponent.g:1226:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalComponent.g:1226:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalComponent.g:1227:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalComponent.g:1233:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'Dependency' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalComponent.g:1239:2: ( (otherlv_0= 'Dependency' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalComponent.g:1240:2: (otherlv_0= 'Dependency' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalComponent.g:1240:2: (otherlv_0= 'Dependency' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalComponent.g:1241:3: otherlv_0= 'Dependency' otherlv_1= '{' otherlv_2= 'component' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependencyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getComponentKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getLeftParenthesisKeyword_3());
            		
            // InternalComponent.g:1257:3: ( ( ruleEString ) )
            // InternalComponent.g:1258:4: ( ruleEString )
            {
            // InternalComponent.g:1258:4: ( ruleEString )
            // InternalComponent.g:1259:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDependencyAccess().getComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponent.g:1273:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalComponent.g:1274:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDependencyAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalComponent.g:1278:4: ( ( ruleEString ) )
            	    // InternalComponent.g:1279:5: ( ruleEString )
            	    {
            	    // InternalComponent.g:1279:5: ( ruleEString )
            	    // InternalComponent.g:1280:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDependencyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDependencyAccess().getComponentComponentCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getDependencyAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleComment"
    // InternalComponent.g:1307:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalComponent.g:1307:48: (iv_ruleComment= ruleComment EOF )
            // InternalComponent.g:1308:2: iv_ruleComment= ruleComment EOF
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
    // InternalComponent.g:1314:1: ruleComment returns [EObject current=null] : (otherlv_0= 'Comment' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1320:2: ( (otherlv_0= 'Comment' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalComponent.g:1321:2: (otherlv_0= 'Comment' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalComponent.g:1321:2: (otherlv_0= 'Comment' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalComponent.g:1322:3: otherlv_0= 'Comment' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCommentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getBodyKeyword_2());
            		
            // InternalComponent.g:1334:3: ( (lv_body_3_0= ruleEString ) )
            // InternalComponent.g:1335:4: (lv_body_3_0= ruleEString )
            {
            // InternalComponent.g:1335:4: (lv_body_3_0= ruleEString )
            // InternalComponent.g:1336:5: lv_body_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommentAccess().getBodyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_body_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"de.cooperateproject.modeling.textual.component.Component.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCommentAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleInterface"
    // InternalComponent.g:1361:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalComponent.g:1361:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalComponent.g:1362:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalComponent.g:1368:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )? (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )? (otherlv_12= 'member' otherlv_13= '{' ( (lv_member_14_0= ruleMember ) ) (otherlv_15= ',' ( (lv_member_16_0= ruleMember ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_alias_5_0 = null;

        EObject lv_comments_8_0 = null;

        EObject lv_comments_10_0 = null;

        EObject lv_member_14_0 = null;

        EObject lv_member_16_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1374:2: ( ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )? (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )? (otherlv_12= 'member' otherlv_13= '{' ( (lv_member_14_0= ruleMember ) ) (otherlv_15= ',' ( (lv_member_16_0= ruleMember ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalComponent.g:1375:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )? (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )? (otherlv_12= 'member' otherlv_13= '{' ( (lv_member_14_0= ruleMember ) ) (otherlv_15= ',' ( (lv_member_16_0= ruleMember ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalComponent.g:1375:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )? (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )? (otherlv_12= 'member' otherlv_13= '{' ( (lv_member_14_0= ruleMember ) ) (otherlv_15= ',' ( (lv_member_16_0= ruleMember ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalComponent.g:1376:3: () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )? (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )? (otherlv_12= 'member' otherlv_13= '{' ( (lv_member_14_0= ruleMember ) ) (otherlv_15= ',' ( (lv_member_16_0= ruleMember ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalComponent.g:1376:3: ()
            // InternalComponent.g:1377:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalComponent.g:1387:3: ( (lv_name_2_0= ruleEString ) )
            // InternalComponent.g:1388:4: (lv_name_2_0= ruleEString )
            {
            // InternalComponent.g:1388:4: (lv_name_2_0= ruleEString )
            // InternalComponent.g:1389:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.cooperateproject.modeling.textual.component.Component.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponent.g:1410:3: (otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponent.g:1411:4: otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getAliasKeyword_4_0());
                    			
                    // InternalComponent.g:1415:4: ( (lv_alias_5_0= ruleEString ) )
                    // InternalComponent.g:1416:5: (lv_alias_5_0= ruleEString )
                    {
                    // InternalComponent.g:1416:5: (lv_alias_5_0= ruleEString )
                    // InternalComponent.g:1417:6: lv_alias_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getAliasEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_alias_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_5_0,
                    							"de.cooperateproject.modeling.textual.component.Component.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponent.g:1435:3: (otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponent.g:1436:4: otherlv_6= 'comments' otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) ) (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getCommentsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalComponent.g:1444:4: ( (lv_comments_8_0= ruleComment ) )
                    // InternalComponent.g:1445:5: (lv_comments_8_0= ruleComment )
                    {
                    // InternalComponent.g:1445:5: (lv_comments_8_0= ruleComment )
                    // InternalComponent.g:1446:6: lv_comments_8_0= ruleComment
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_comments_8_0=ruleComment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"comments",
                    							lv_comments_8_0,
                    							"de.cooperateproject.modeling.textual.component.Component.Comment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponent.g:1463:4: (otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==19) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalComponent.g:1464:5: otherlv_9= ',' ( (lv_comments_10_0= ruleComment ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalComponent.g:1468:5: ( (lv_comments_10_0= ruleComment ) )
                    	    // InternalComponent.g:1469:6: (lv_comments_10_0= ruleComment )
                    	    {
                    	    // InternalComponent.g:1469:6: (lv_comments_10_0= ruleComment )
                    	    // InternalComponent.g:1470:7: lv_comments_10_0= ruleComment
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_comments_10_0=ruleComment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"comments",
                    	    								lv_comments_10_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Comment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_31); 

                    				newLeafNode(otherlv_11, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalComponent.g:1493:3: (otherlv_12= 'member' otherlv_13= '{' ( (lv_member_14_0= ruleMember ) ) (otherlv_15= ',' ( (lv_member_16_0= ruleMember ) ) )* otherlv_17= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponent.g:1494:4: otherlv_12= 'member' otherlv_13= '{' ( (lv_member_14_0= ruleMember ) ) (otherlv_15= ',' ( (lv_member_16_0= ruleMember ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getInterfaceAccess().getMemberKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_13, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalComponent.g:1502:4: ( (lv_member_14_0= ruleMember ) )
                    // InternalComponent.g:1503:5: (lv_member_14_0= ruleMember )
                    {
                    // InternalComponent.g:1503:5: (lv_member_14_0= ruleMember )
                    // InternalComponent.g:1504:6: lv_member_14_0= ruleMember
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getMemberMemberParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_member_14_0=ruleMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"member",
                    							lv_member_14_0,
                    							"de.cooperateproject.modeling.textual.component.Component.Member");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponent.g:1521:4: (otherlv_15= ',' ( (lv_member_16_0= ruleMember ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==19) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalComponent.g:1522:5: otherlv_15= ',' ( (lv_member_16_0= ruleMember ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FOLLOW_32); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getInterfaceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalComponent.g:1526:5: ( (lv_member_16_0= ruleMember ) )
                    	    // InternalComponent.g:1527:6: (lv_member_16_0= ruleMember )
                    	    {
                    	    // InternalComponent.g:1527:6: (lv_member_16_0= ruleMember )
                    	    // InternalComponent.g:1528:7: lv_member_16_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getMemberMemberParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_member_16_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"member",
                    	    								lv_member_16_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleConnector"
    // InternalComponent.g:1559:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalComponent.g:1559:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalComponent.g:1560:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalComponent.g:1566:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'Connector' otherlv_1= '{' otherlv_2= 'port' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'interface' ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalComponent.g:1572:2: ( (otherlv_0= 'Connector' otherlv_1= '{' otherlv_2= 'port' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'interface' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // InternalComponent.g:1573:2: (otherlv_0= 'Connector' otherlv_1= '{' otherlv_2= 'port' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'interface' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // InternalComponent.g:1573:2: (otherlv_0= 'Connector' otherlv_1= '{' otherlv_2= 'port' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'interface' ( ( ruleEString ) ) otherlv_10= '}' )
            // InternalComponent.g:1574:3: otherlv_0= 'Connector' otherlv_1= '{' otherlv_2= 'port' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'interface' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getPortKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getLeftParenthesisKeyword_3());
            		
            // InternalComponent.g:1590:3: ( ( ruleEString ) )
            // InternalComponent.g:1591:4: ( ruleEString )
            {
            // InternalComponent.g:1591:4: ( ruleEString )
            // InternalComponent.g:1592:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorAccess().getPortComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponent.g:1606:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==19) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalComponent.g:1607:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalComponent.g:1611:4: ( ( ruleEString ) )
            	    // InternalComponent.g:1612:5: ( ruleEString )
            	    {
            	    // InternalComponent.g:1612:5: ( ruleEString )
            	    // InternalComponent.g:1613:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConnectorRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getConnectorAccess().getPortComponentCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_34); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectorAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectorAccess().getInterfaceKeyword_7());
            		
            // InternalComponent.g:1636:3: ( ( ruleEString ) )
            // InternalComponent.g:1637:4: ( ruleEString )
            {
            // InternalComponent.g:1637:4: ( ruleEString )
            // InternalComponent.g:1638:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorAccess().getInterfaceInterfaceCrossReference_8_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleProvide"
    // InternalComponent.g:1660:1: entryRuleProvide returns [EObject current=null] : iv_ruleProvide= ruleProvide EOF ;
    public final EObject entryRuleProvide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvide = null;


        try {
            // InternalComponent.g:1660:48: (iv_ruleProvide= ruleProvide EOF )
            // InternalComponent.g:1661:2: iv_ruleProvide= ruleProvide EOF
            {
             newCompositeNode(grammarAccess.getProvideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvide=ruleProvide();

            state._fsp--;

             current =iv_ruleProvide; 
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
    // $ANTLR end "entryRuleProvide"


    // $ANTLR start "ruleProvide"
    // InternalComponent.g:1667:1: ruleProvide returns [EObject current=null] : ( () otherlv_1= 'Provide' otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleProvide() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:1673:2: ( ( () otherlv_1= 'Provide' otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalComponent.g:1674:2: ( () otherlv_1= 'Provide' otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalComponent.g:1674:2: ( () otherlv_1= 'Provide' otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalComponent.g:1675:3: () otherlv_1= 'Provide' otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalComponent.g:1675:3: ()
            // InternalComponent.g:1676:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvideAccess().getProvideAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProvideAccess().getProvideKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getProvideAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponent.g:1690:3: (otherlv_3= 'interface' ( ( ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponent.g:1691:4: otherlv_3= 'interface' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getProvideAccess().getInterfaceKeyword_3_0());
                    			
                    // InternalComponent.g:1695:4: ( ( ruleEString ) )
                    // InternalComponent.g:1696:5: ( ruleEString )
                    {
                    // InternalComponent.g:1696:5: ( ruleEString )
                    // InternalComponent.g:1697:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProvideRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProvideAccess().getInterfaceInterfaceCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProvideAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProvide"


    // $ANTLR start "entryRuleRequire"
    // InternalComponent.g:1720:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalComponent.g:1720:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalComponent.g:1721:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalComponent.g:1727:1: ruleRequire returns [EObject current=null] : ( () otherlv_1= 'Require' otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:1733:2: ( ( () otherlv_1= 'Require' otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalComponent.g:1734:2: ( () otherlv_1= 'Require' otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalComponent.g:1734:2: ( () otherlv_1= 'Require' otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalComponent.g:1735:3: () otherlv_1= 'Require' otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalComponent.g:1735:3: ()
            // InternalComponent.g:1736:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequireAccess().getRequireAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequireAccess().getRequireKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getRequireAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponent.g:1750:3: (otherlv_3= 'interface' ( ( ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalComponent.g:1751:4: otherlv_3= 'interface' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRequireAccess().getInterfaceKeyword_3_0());
                    			
                    // InternalComponent.g:1755:4: ( ( ruleEString ) )
                    // InternalComponent.g:1756:5: ( ruleEString )
                    {
                    // InternalComponent.g:1756:5: ( ruleEString )
                    // InternalComponent.g:1757:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequireRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRequireAccess().getInterfaceInterfaceCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRequireAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleMethod"
    // InternalComponent.g:1780:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalComponent.g:1780:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalComponent.g:1781:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalComponent.g:1787:1: ruleMethod returns [EObject current=null] : ( () ( (lv_static_1_0= 'static' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Method' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleParameter ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_abstract_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_visibility_7_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_parameters_12_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1793:2: ( ( () ( (lv_static_1_0= 'static' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Method' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleParameter ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalComponent.g:1794:2: ( () ( (lv_static_1_0= 'static' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Method' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleParameter ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalComponent.g:1794:2: ( () ( (lv_static_1_0= 'static' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Method' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleParameter ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalComponent.g:1795:3: () ( (lv_static_1_0= 'static' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Method' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleParameter ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalComponent.g:1795:3: ()
            // InternalComponent.g:1796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            // InternalComponent.g:1802:3: ( (lv_static_1_0= 'static' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalComponent.g:1803:4: (lv_static_1_0= 'static' )
                    {
                    // InternalComponent.g:1803:4: (lv_static_1_0= 'static' )
                    // InternalComponent.g:1804:5: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,42,FOLLOW_35); 

                    					newLeafNode(lv_static_1_0, grammarAccess.getMethodAccess().getStaticStaticKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1816:3: ( (lv_abstract_2_0= 'abstract' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalComponent.g:1817:4: (lv_abstract_2_0= 'abstract' )
                    {
                    // InternalComponent.g:1817:4: (lv_abstract_2_0= 'abstract' )
                    // InternalComponent.g:1818:5: lv_abstract_2_0= 'abstract'
                    {
                    lv_abstract_2_0=(Token)match(input,43,FOLLOW_36); 

                    					newLeafNode(lv_abstract_2_0, grammarAccess.getMethodAccess().getAbstractAbstractKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getMethodKeyword_3());
            		
            // InternalComponent.g:1834:3: ( (lv_name_4_0= ruleEString ) )
            // InternalComponent.g:1835:4: (lv_name_4_0= ruleEString )
            {
            // InternalComponent.g:1835:4: (lv_name_4_0= ruleEString )
            // InternalComponent.g:1836:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.cooperateproject.modeling.textual.component.Component.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalComponent.g:1857:3: (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalComponent.g:1858:4: otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getVisibilityKeyword_6_0());
                    			
                    // InternalComponent.g:1862:4: ( (lv_visibility_7_0= ruleVisibility ) )
                    // InternalComponent.g:1863:5: (lv_visibility_7_0= ruleVisibility )
                    {
                    // InternalComponent.g:1863:5: (lv_visibility_7_0= ruleVisibility )
                    // InternalComponent.g:1864:6: lv_visibility_7_0= ruleVisibility
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_visibility_7_0=ruleVisibility();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_7_0,
                    							"de.cooperateproject.modeling.textual.component.Component.Visibility");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponent.g:1882:3: (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleParameter ) ) )* otherlv_13= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalComponent.g:1883:4: otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleParameter ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getParametersKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalComponent.g:1891:4: ( (lv_parameters_10_0= ruleParameter ) )
                    // InternalComponent.g:1892:5: (lv_parameters_10_0= ruleParameter )
                    {
                    // InternalComponent.g:1892:5: (lv_parameters_10_0= ruleParameter )
                    // InternalComponent.g:1893:6: lv_parameters_10_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parameters_10_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_10_0,
                    							"de.cooperateproject.modeling.textual.component.Component.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponent.g:1910:4: (otherlv_11= ',' ( (lv_parameters_12_0= ruleParameter ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==19) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalComponent.g:1911:5: otherlv_11= ',' ( (lv_parameters_12_0= ruleParameter ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_40); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalComponent.g:1915:5: ( (lv_parameters_12_0= ruleParameter ) )
                    	    // InternalComponent.g:1916:6: (lv_parameters_12_0= ruleParameter )
                    	    {
                    	    // InternalComponent.g:1916:6: (lv_parameters_12_0= ruleParameter )
                    	    // InternalComponent.g:1917:7: lv_parameters_12_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parameters_12_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_12_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleAttribute"
    // InternalComponent.g:1948:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalComponent.g:1948:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalComponent.g:1949:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalComponent.g:1955:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_static_1_0= 'static' ) )? otherlv_2= 'Attribute' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_visibility_6_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1961:2: ( ( () ( (lv_static_1_0= 'static' ) )? otherlv_2= 'Attribute' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )? otherlv_7= '}' ) )
            // InternalComponent.g:1962:2: ( () ( (lv_static_1_0= 'static' ) )? otherlv_2= 'Attribute' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )? otherlv_7= '}' )
            {
            // InternalComponent.g:1962:2: ( () ( (lv_static_1_0= 'static' ) )? otherlv_2= 'Attribute' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )? otherlv_7= '}' )
            // InternalComponent.g:1963:3: () ( (lv_static_1_0= 'static' ) )? otherlv_2= 'Attribute' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )? otherlv_7= '}'
            {
            // InternalComponent.g:1963:3: ()
            // InternalComponent.g:1964:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalComponent.g:1970:3: ( (lv_static_1_0= 'static' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalComponent.g:1971:4: (lv_static_1_0= 'static' )
                    {
                    // InternalComponent.g:1971:4: (lv_static_1_0= 'static' )
                    // InternalComponent.g:1972:5: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,42,FOLLOW_41); 

                    					newLeafNode(lv_static_1_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getAttributeKeyword_2());
            		
            // InternalComponent.g:1988:3: ( (lv_name_3_0= ruleEString ) )
            // InternalComponent.g:1989:4: (lv_name_3_0= ruleEString )
            {
            // InternalComponent.g:1989:4: (lv_name_3_0= ruleEString )
            // InternalComponent.g:1990:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.cooperateproject.modeling.textual.component.Component.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponent.g:2011:3: (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalComponent.g:2012:4: otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) )
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getVisibilityKeyword_5_0());
                    			
                    // InternalComponent.g:2016:4: ( (lv_visibility_6_0= ruleVisibility ) )
                    // InternalComponent.g:2017:5: (lv_visibility_6_0= ruleVisibility )
                    {
                    // InternalComponent.g:2017:5: (lv_visibility_6_0= ruleVisibility )
                    // InternalComponent.g:2018:6: lv_visibility_6_0= ruleVisibility
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_visibility_6_0=ruleVisibility();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_6_0,
                    							"de.cooperateproject.modeling.textual.component.Component.Visibility");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleParameter"
    // InternalComponent.g:2044:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalComponent.g:2044:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalComponent.g:2045:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalComponent.g:2051:1: ruleParameter returns [EObject current=null] : ( () ( (lv_static_1_0= 'static' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_visibility_6_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:2057:2: ( ( () ( (lv_static_1_0= 'static' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )? otherlv_7= '}' ) )
            // InternalComponent.g:2058:2: ( () ( (lv_static_1_0= 'static' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )? otherlv_7= '}' )
            {
            // InternalComponent.g:2058:2: ( () ( (lv_static_1_0= 'static' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )? otherlv_7= '}' )
            // InternalComponent.g:2059:3: () ( (lv_static_1_0= 'static' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )? otherlv_7= '}'
            {
            // InternalComponent.g:2059:3: ()
            // InternalComponent.g:2060:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalComponent.g:2066:3: ( (lv_static_1_0= 'static' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==42) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalComponent.g:2067:4: (lv_static_1_0= 'static' )
                    {
                    // InternalComponent.g:2067:4: (lv_static_1_0= 'static' )
                    // InternalComponent.g:2068:5: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,42,FOLLOW_43); 

                    					newLeafNode(lv_static_1_0, grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getParameterKeyword_2());
            		
            // InternalComponent.g:2084:3: ( (lv_name_3_0= ruleEString ) )
            // InternalComponent.g:2085:4: (lv_name_3_0= ruleEString )
            {
            // InternalComponent.g:2085:4: (lv_name_3_0= ruleEString )
            // InternalComponent.g:2086:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.cooperateproject.modeling.textual.component.Component.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponent.g:2107:3: (otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalComponent.g:2108:4: otherlv_5= 'visibility' ( (lv_visibility_6_0= ruleVisibility ) )
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getVisibilityKeyword_5_0());
                    			
                    // InternalComponent.g:2112:4: ( (lv_visibility_6_0= ruleVisibility ) )
                    // InternalComponent.g:2113:5: (lv_visibility_6_0= ruleVisibility )
                    {
                    // InternalComponent.g:2113:5: (lv_visibility_6_0= ruleVisibility )
                    // InternalComponent.g:2114:6: lv_visibility_6_0= ruleVisibility
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getVisibilityVisibilityEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_visibility_6_0=ruleVisibility();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_6_0,
                    							"de.cooperateproject.modeling.textual.component.Component.Visibility");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "ruleVisibility"
    // InternalComponent.g:2140:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'PRIVATE' ) | (enumLiteral_3= 'PROTECTED' ) | (enumLiteral_4= 'PACKAGE' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalComponent.g:2146:2: ( ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'PRIVATE' ) | (enumLiteral_3= 'PROTECTED' ) | (enumLiteral_4= 'PACKAGE' ) ) )
            // InternalComponent.g:2147:2: ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'PRIVATE' ) | (enumLiteral_3= 'PROTECTED' ) | (enumLiteral_4= 'PACKAGE' ) )
            {
            // InternalComponent.g:2147:2: ( (enumLiteral_0= 'UNDEFINED' ) | (enumLiteral_1= 'PUBLIC' ) | (enumLiteral_2= 'PRIVATE' ) | (enumLiteral_3= 'PROTECTED' ) | (enumLiteral_4= 'PACKAGE' ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt43=1;
                }
                break;
            case 50:
                {
                alt43=2;
                }
                break;
            case 51:
                {
                alt43=3;
                }
                break;
            case 52:
                {
                alt43=4;
                }
                break;
            case 53:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalComponent.g:2148:3: (enumLiteral_0= 'UNDEFINED' )
                    {
                    // InternalComponent.g:2148:3: (enumLiteral_0= 'UNDEFINED' )
                    // InternalComponent.g:2149:4: enumLiteral_0= 'UNDEFINED'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getUNDEFINEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getUNDEFINEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:2156:3: (enumLiteral_1= 'PUBLIC' )
                    {
                    // InternalComponent.g:2156:3: (enumLiteral_1= 'PUBLIC' )
                    // InternalComponent.g:2157:4: enumLiteral_1= 'PUBLIC'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalComponent.g:2164:3: (enumLiteral_2= 'PRIVATE' )
                    {
                    // InternalComponent.g:2164:3: (enumLiteral_2= 'PRIVATE' )
                    // InternalComponent.g:2165:4: enumLiteral_2= 'PRIVATE'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalComponent.g:2172:3: (enumLiteral_3= 'PROTECTED' )
                    {
                    // InternalComponent.g:2172:3: (enumLiteral_3= 'PROTECTED' )
                    // InternalComponent.g:2173:4: enumLiteral_3= 'PROTECTED'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalComponent.g:2180:3: (enumLiteral_4= 'PACKAGE' )
                    {
                    // InternalComponent.g:2180:3: (enumLiteral_4= 'PACKAGE' )
                    // InternalComponent.g:2181:4: enumLiteral_4= 'PACKAGE'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_4());
                    			

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000150000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000790000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000FC10000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000F810000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000F010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000E010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000C10000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000810000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00009C0000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000600000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x003E000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});

}