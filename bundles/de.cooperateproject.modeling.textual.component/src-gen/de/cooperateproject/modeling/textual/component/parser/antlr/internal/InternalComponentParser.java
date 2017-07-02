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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_UNDERSCORE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-cpd'", "'@end-cpd'", "'rootPackage'", "'component'", "'as'", "'{'", "'}'", "'isa'", "'('", "','", "')'", "'abs'", "'man'", "'sub'", "'dep'", "'note'", "'port'", "'interface'", "'con'", "'provide'", "'require'", "'abstract'", "'static'", "':'", "'.'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_UNDERSCORE=6;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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
    // InternalComponent.g:72:1: ruleComponentDiagram returns [EObject current=null] : ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= ruleEString ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' ) ;
    public final EObject ruleComponentDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        EObject lv_rootpackage_3_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:78:2: ( ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= ruleEString ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' ) )
            // InternalComponent.g:79:2: ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= ruleEString ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' )
            {
            // InternalComponent.g:79:2: ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= ruleEString ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' )
            // InternalComponent.g:80:3: () otherlv_1= '@start-cpd' ( (lv_title_2_0= ruleEString ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd'
            {
            // InternalComponent.g:80:3: ()
            // InternalComponent.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentDiagramAccess().getComponentDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentDiagramAccess().getStartCpdKeyword_1());
            		
            // InternalComponent.g:91:3: ( (lv_title_2_0= ruleEString ) )
            // InternalComponent.g:92:4: (lv_title_2_0= ruleEString )
            {
            // InternalComponent.g:92:4: (lv_title_2_0= ruleEString )
            // InternalComponent.g:93:5: lv_title_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentDiagramAccess().getTitleEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_title_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDiagramRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_2_0,
            						"de.cooperateproject.modeling.textual.component.Component.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponent.g:110:3: ( (lv_rootpackage_3_0= ruleRootPackage ) )
            // InternalComponent.g:111:4: (lv_rootpackage_3_0= ruleRootPackage )
            {
            // InternalComponent.g:111:4: (lv_rootpackage_3_0= ruleRootPackage )
            // InternalComponent.g:112:5: lv_rootpackage_3_0= ruleRootPackage
            {

            					newCompositeNode(grammarAccess.getComponentDiagramAccess().getRootpackageRootPackageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_rootpackage_3_0=ruleRootPackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDiagramRule());
            					}
            					set(
            						current,
            						"rootpackage",
            						lv_rootpackage_3_0,
            						"de.cooperateproject.modeling.textual.component.Component.RootPackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentDiagramAccess().getEndCpdKeyword_4());
            		

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


    // $ANTLR start "entryRuleClassifierRelation"
    // InternalComponent.g:137:1: entryRuleClassifierRelation returns [EObject current=null] : iv_ruleClassifierRelation= ruleClassifierRelation EOF ;
    public final EObject entryRuleClassifierRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierRelation = null;


        try {
            // InternalComponent.g:137:59: (iv_ruleClassifierRelation= ruleClassifierRelation EOF )
            // InternalComponent.g:138:2: iv_ruleClassifierRelation= ruleClassifierRelation EOF
            {
             newCompositeNode(grammarAccess.getClassifierRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifierRelation=ruleClassifierRelation();

            state._fsp--;

             current =iv_ruleClassifierRelation; 
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
    // $ANTLR end "entryRuleClassifierRelation"


    // $ANTLR start "ruleClassifierRelation"
    // InternalComponent.g:144:1: ruleClassifierRelation returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency ) ;
    public final EObject ruleClassifierRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_Abstraction_1 = null;

        EObject this_Manifestation_2 = null;

        EObject this_Substitution_3 = null;

        EObject this_Dependency_4 = null;



        	enterRule();

        try {
            // InternalComponent.g:150:2: ( (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency ) )
            // InternalComponent.g:151:2: (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency )
            {
            // InternalComponent.g:151:2: (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            case 26:
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
                    // InternalComponent.g:152:3: this_Generalization_0= ruleGeneralization
                    {

                    			newCompositeNode(grammarAccess.getClassifierRelationAccess().getGeneralizationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generalization_0=ruleGeneralization();

                    state._fsp--;


                    			current = this_Generalization_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponent.g:161:3: this_Abstraction_1= ruleAbstraction
                    {

                    			newCompositeNode(grammarAccess.getClassifierRelationAccess().getAbstractionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Abstraction_1=ruleAbstraction();

                    state._fsp--;


                    			current = this_Abstraction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponent.g:170:3: this_Manifestation_2= ruleManifestation
                    {

                    			newCompositeNode(grammarAccess.getClassifierRelationAccess().getManifestationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Manifestation_2=ruleManifestation();

                    state._fsp--;


                    			current = this_Manifestation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalComponent.g:179:3: this_Substitution_3= ruleSubstitution
                    {

                    			newCompositeNode(grammarAccess.getClassifierRelationAccess().getSubstitutionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Substitution_3=ruleSubstitution();

                    state._fsp--;


                    			current = this_Substitution_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalComponent.g:188:3: this_Dependency_4= ruleDependency
                    {

                    			newCompositeNode(grammarAccess.getClassifierRelationAccess().getDependencyParserRuleCall_4());
                    		
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
    // $ANTLR end "ruleClassifierRelation"


    // $ANTLR start "entryRuleClassifier"
    // InternalComponent.g:200:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalComponent.g:200:51: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalComponent.g:201:2: iv_ruleClassifier= ruleClassifier EOF
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
    // InternalComponent.g:207:1: ruleClassifier returns [EObject current=null] : (this_Interface_0= ruleInterface | this_Component_1= ruleComponent ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_Component_1 = null;



        	enterRule();

        try {
            // InternalComponent.g:213:2: ( (this_Interface_0= ruleInterface | this_Component_1= ruleComponent ) )
            // InternalComponent.g:214:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent )
            {
            // InternalComponent.g:214:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponent.g:215:3: this_Interface_0= ruleInterface
                    {

                    			newCompositeNode(grammarAccess.getClassifierAccess().getInterfaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_0=ruleInterface();

                    state._fsp--;


                    			current = this_Interface_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponent.g:224:3: this_Component_1= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getClassifierAccess().getComponentParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRulePortRelation"
    // InternalComponent.g:236:1: entryRulePortRelation returns [EObject current=null] : iv_rulePortRelation= rulePortRelation EOF ;
    public final EObject entryRulePortRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortRelation = null;


        try {
            // InternalComponent.g:236:53: (iv_rulePortRelation= rulePortRelation EOF )
            // InternalComponent.g:237:2: iv_rulePortRelation= rulePortRelation EOF
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
    // InternalComponent.g:243:1: rulePortRelation returns [EObject current=null] : this_Connector_0= ruleConnector ;
    public final EObject rulePortRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Connector_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:249:2: (this_Connector_0= ruleConnector )
            // InternalComponent.g:250:2: this_Connector_0= ruleConnector
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
    // InternalComponent.g:261:1: entryRuleInterfaceRelation returns [EObject current=null] : iv_ruleInterfaceRelation= ruleInterfaceRelation EOF ;
    public final EObject entryRuleInterfaceRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceRelation = null;


        try {
            // InternalComponent.g:261:58: (iv_ruleInterfaceRelation= ruleInterfaceRelation EOF )
            // InternalComponent.g:262:2: iv_ruleInterfaceRelation= ruleInterfaceRelation EOF
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
    // InternalComponent.g:268:1: ruleInterfaceRelation returns [EObject current=null] : (this_Provide_0= ruleProvide | this_Require_1= ruleRequire ) ;
    public final EObject ruleInterfaceRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Provide_0 = null;

        EObject this_Require_1 = null;



        	enterRule();

        try {
            // InternalComponent.g:274:2: ( (this_Provide_0= ruleProvide | this_Require_1= ruleRequire ) )
            // InternalComponent.g:275:2: (this_Provide_0= ruleProvide | this_Require_1= ruleRequire )
            {
            // InternalComponent.g:275:2: (this_Provide_0= ruleProvide | this_Require_1= ruleRequire )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponent.g:276:3: this_Provide_0= ruleProvide
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
                    // InternalComponent.g:285:3: this_Require_1= ruleRequire
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
    // InternalComponent.g:297:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalComponent.g:297:47: (iv_ruleMember= ruleMember EOF )
            // InternalComponent.g:298:2: iv_ruleMember= ruleMember EOF
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
    // InternalComponent.g:304:1: ruleMember returns [EObject current=null] : (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Attribute_1 = null;



        	enterRule();

        try {
            // InternalComponent.g:310:2: ( (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute ) )
            // InternalComponent.g:311:2: (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute )
            {
            // InternalComponent.g:311:2: (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalComponent.g:312:3: this_Method_0= ruleMethod
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
                    // InternalComponent.g:321:3: this_Attribute_1= ruleAttribute
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
    // InternalComponent.g:333:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponent.g:333:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponent.g:334:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponent.g:340:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComponent.g:346:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComponent.g:347:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComponent.g:347:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalComponent.g:348:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponent.g:356:3: this_ID_1= RULE_ID
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
    // InternalComponent.g:367:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalComponent.g:367:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalComponent.g:368:2: iv_ruleRootPackage= ruleRootPackage EOF
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
    // InternalComponent.g:374:1: ruleRootPackage returns [EObject current=null] : ( () otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) ( (lv_classifier_3_0= ruleClassifier ) )* ( (lv_relation_4_0= ruleClassifierRelation ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_classifier_3_0 = null;

        EObject lv_relation_4_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:380:2: ( ( () otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) ( (lv_classifier_3_0= ruleClassifier ) )* ( (lv_relation_4_0= ruleClassifierRelation ) )* ) )
            // InternalComponent.g:381:2: ( () otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) ( (lv_classifier_3_0= ruleClassifier ) )* ( (lv_relation_4_0= ruleClassifierRelation ) )* )
            {
            // InternalComponent.g:381:2: ( () otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) ( (lv_classifier_3_0= ruleClassifier ) )* ( (lv_relation_4_0= ruleClassifierRelation ) )* )
            // InternalComponent.g:382:3: () otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) ( (lv_classifier_3_0= ruleClassifier ) )* ( (lv_relation_4_0= ruleClassifierRelation ) )*
            {
            // InternalComponent.g:382:3: ()
            // InternalComponent.g:383:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootPackageAccess().getRootPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRootPackageAccess().getRootPackageKeyword_1());
            		
            // InternalComponent.g:393:3: ( (lv_name_2_0= ruleFQN ) )
            // InternalComponent.g:394:4: (lv_name_2_0= ruleFQN )
            {
            // InternalComponent.g:394:4: (lv_name_2_0= ruleFQN )
            // InternalComponent.g:395:5: lv_name_2_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_2_0());
            				
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
            						"de.cooperateproject.modeling.textual.component.Component.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponent.g:412:3: ( (lv_classifier_3_0= ruleClassifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15||LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponent.g:413:4: (lv_classifier_3_0= ruleClassifier )
            	    {
            	    // InternalComponent.g:413:4: (lv_classifier_3_0= ruleClassifier )
            	    // InternalComponent.g:414:5: lv_classifier_3_0= ruleClassifier
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getClassifierClassifierParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_classifier_3_0=ruleClassifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classifier",
            	    						lv_classifier_3_0,
            	    						"de.cooperateproject.modeling.textual.component.Component.Classifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalComponent.g:431:3: ( (lv_relation_4_0= ruleClassifierRelation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19||(LA7_0>=23 && LA7_0<=26)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComponent.g:432:4: (lv_relation_4_0= ruleClassifierRelation )
            	    {
            	    // InternalComponent.g:432:4: (lv_relation_4_0= ruleClassifierRelation )
            	    // InternalComponent.g:433:5: lv_relation_4_0= ruleClassifierRelation
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getRelationClassifierRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_relation_4_0=ruleClassifierRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relation",
            	    						lv_relation_4_0,
            	    						"de.cooperateproject.modeling.textual.component.Component.ClassifierRelation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "entryRuleComponent"
    // InternalComponent.g:454:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalComponent.g:454:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalComponent.g:455:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalComponent.g:461:1: ruleComponent returns [EObject current=null] : ( () otherlv_1= 'component' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) otherlv_6= '{' ( ( (lv_comments_7_0= ruleComment ) )? ( (lv_component_8_0= ruleComponent ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_portrelation_10_0= rulePortRelation ) )* ( (lv_interfacerelation_11_0= ruleInterfaceRelation ) )* ( (lv_interface_12_0= ruleInterface ) )* ) otherlv_13= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_13=null;
        EObject lv_comments_7_0 = null;

        EObject lv_component_8_0 = null;

        EObject lv_port_9_0 = null;

        EObject lv_portrelation_10_0 = null;

        EObject lv_interfacerelation_11_0 = null;

        EObject lv_interface_12_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:467:2: ( ( () otherlv_1= 'component' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) otherlv_6= '{' ( ( (lv_comments_7_0= ruleComment ) )? ( (lv_component_8_0= ruleComponent ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_portrelation_10_0= rulePortRelation ) )* ( (lv_interfacerelation_11_0= ruleInterfaceRelation ) )* ( (lv_interface_12_0= ruleInterface ) )* ) otherlv_13= '}' ) )
            // InternalComponent.g:468:2: ( () otherlv_1= 'component' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) otherlv_6= '{' ( ( (lv_comments_7_0= ruleComment ) )? ( (lv_component_8_0= ruleComponent ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_portrelation_10_0= rulePortRelation ) )* ( (lv_interfacerelation_11_0= ruleInterfaceRelation ) )* ( (lv_interface_12_0= ruleInterface ) )* ) otherlv_13= '}' )
            {
            // InternalComponent.g:468:2: ( () otherlv_1= 'component' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) otherlv_6= '{' ( ( (lv_comments_7_0= ruleComment ) )? ( (lv_component_8_0= ruleComponent ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_portrelation_10_0= rulePortRelation ) )* ( (lv_interfacerelation_11_0= ruleInterfaceRelation ) )* ( (lv_interface_12_0= ruleInterface ) )* ) otherlv_13= '}' )
            // InternalComponent.g:469:3: () otherlv_1= 'component' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) otherlv_6= '{' ( ( (lv_comments_7_0= ruleComment ) )? ( (lv_component_8_0= ruleComponent ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_portrelation_10_0= rulePortRelation ) )* ( (lv_interfacerelation_11_0= ruleInterfaceRelation ) )* ( (lv_interface_12_0= ruleInterface ) )* ) otherlv_13= '}'
            {
            // InternalComponent.g:469:3: ()
            // InternalComponent.g:470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentKeyword_1());
            		
            // InternalComponent.g:480:3: ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
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
                    // InternalComponent.g:481:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    {
                    // InternalComponent.g:481:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    // InternalComponent.g:482:5: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    // InternalComponent.g:482:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalComponent.g:483:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalComponent.g:483:6: (lv_name_2_0= RULE_STRING )
                    // InternalComponent.g:484:7: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    							newLeafNode(lv_name_2_0, grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComponentRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getAsKeyword_2_0_1());
                    				
                    // InternalComponent.g:504:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalComponent.g:505:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalComponent.g:505:6: (lv_alias_4_0= RULE_ID )
                    // InternalComponent.g:506:7: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    							newLeafNode(lv_alias_4_0, grammarAccess.getComponentAccess().getAliasIDTerminalRuleCall_2_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComponentRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_4_0,
                    								"de.cooperateproject.modeling.textual.component.Component.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:524:4: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // InternalComponent.g:524:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalComponent.g:525:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalComponent.g:525:5: (lv_name_5_0= RULE_ID )
                    // InternalComponent.g:526:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"de.cooperateproject.modeling.textual.component.Component.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponent.g:547:3: ( ( (lv_comments_7_0= ruleComment ) )? ( (lv_component_8_0= ruleComponent ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_portrelation_10_0= rulePortRelation ) )* ( (lv_interfacerelation_11_0= ruleInterfaceRelation ) )* ( (lv_interface_12_0= ruleInterface ) )* )
            // InternalComponent.g:548:4: ( (lv_comments_7_0= ruleComment ) )? ( (lv_component_8_0= ruleComponent ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_portrelation_10_0= rulePortRelation ) )* ( (lv_interfacerelation_11_0= ruleInterfaceRelation ) )* ( (lv_interface_12_0= ruleInterface ) )*
            {
            // InternalComponent.g:548:4: ( (lv_comments_7_0= ruleComment ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponent.g:549:5: (lv_comments_7_0= ruleComment )
                    {
                    // InternalComponent.g:549:5: (lv_comments_7_0= ruleComment )
                    // InternalComponent.g:550:6: lv_comments_7_0= ruleComment
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_comments_7_0=ruleComment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"comments",
                    							lv_comments_7_0,
                    							"de.cooperateproject.modeling.textual.component.Component.Comment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalComponent.g:567:4: ( (lv_component_8_0= ruleComponent ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponent.g:568:5: (lv_component_8_0= ruleComponent )
            	    {
            	    // InternalComponent.g:568:5: (lv_component_8_0= ruleComponent )
            	    // InternalComponent.g:569:6: lv_component_8_0= ruleComponent
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getComponentComponentParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_component_8_0=ruleComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"component",
            	    							lv_component_8_0,
            	    							"de.cooperateproject.modeling.textual.component.Component.Component");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalComponent.g:586:4: ( (lv_port_9_0= rulePort ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28||(LA11_0>=37 && LA11_0<=43)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponent.g:587:5: (lv_port_9_0= rulePort )
            	    {
            	    // InternalComponent.g:587:5: (lv_port_9_0= rulePort )
            	    // InternalComponent.g:588:6: lv_port_9_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getPortPortParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_port_9_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"port",
            	    							lv_port_9_0,
            	    							"de.cooperateproject.modeling.textual.component.Component.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalComponent.g:605:4: ( (lv_portrelation_10_0= rulePortRelation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponent.g:606:5: (lv_portrelation_10_0= rulePortRelation )
            	    {
            	    // InternalComponent.g:606:5: (lv_portrelation_10_0= rulePortRelation )
            	    // InternalComponent.g:607:6: lv_portrelation_10_0= rulePortRelation
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getPortrelationPortRelationParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_portrelation_10_0=rulePortRelation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"portrelation",
            	    							lv_portrelation_10_0,
            	    							"de.cooperateproject.modeling.textual.component.Component.PortRelation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalComponent.g:624:4: ( (lv_interfacerelation_11_0= ruleInterfaceRelation ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=31 && LA13_0<=32)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponent.g:625:5: (lv_interfacerelation_11_0= ruleInterfaceRelation )
            	    {
            	    // InternalComponent.g:625:5: (lv_interfacerelation_11_0= ruleInterfaceRelation )
            	    // InternalComponent.g:626:6: lv_interfacerelation_11_0= ruleInterfaceRelation
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getInterfacerelationInterfaceRelationParserRuleCall_4_4_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_interfacerelation_11_0=ruleInterfaceRelation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interfacerelation",
            	    							lv_interfacerelation_11_0,
            	    							"de.cooperateproject.modeling.textual.component.Component.InterfaceRelation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalComponent.g:643:4: ( (lv_interface_12_0= ruleInterface ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponent.g:644:5: (lv_interface_12_0= ruleInterface )
            	    {
            	    // InternalComponent.g:644:5: (lv_interface_12_0= ruleInterface )
            	    // InternalComponent.g:645:6: lv_interface_12_0= ruleInterface
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getInterfaceInterfaceParserRuleCall_4_5_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_interface_12_0=ruleInterface();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interface",
            	    							lv_interface_12_0,
            	    							"de.cooperateproject.modeling.textual.component.Component.Interface");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalComponent.g:671:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalComponent.g:671:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalComponent.g:672:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalComponent.g:678:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:684:2: ( (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' ) )
            // InternalComponent.g:685:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' )
            {
            // InternalComponent.g:685:2: (otherlv_0= 'isa' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' )
            // InternalComponent.g:686:3: otherlv_0= 'isa' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsaKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponent.g:694:3: ( ( ruleEString ) )
            // InternalComponent.g:695:4: ( ruleEString )
            {
            // InternalComponent.g:695:4: ( ruleEString )
            // InternalComponent.g:696:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getLeftclassifierClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getCommaKeyword_3());
            		
            // InternalComponent.g:714:3: ( ( ruleEString ) )
            // InternalComponent.g:715:4: ( ruleEString )
            {
            // InternalComponent.g:715:4: ( ruleEString )
            // InternalComponent.g:716:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getRightclassifierClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAbstraction"
    // InternalComponent.g:738:1: entryRuleAbstraction returns [EObject current=null] : iv_ruleAbstraction= ruleAbstraction EOF ;
    public final EObject entryRuleAbstraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstraction = null;


        try {
            // InternalComponent.g:738:52: (iv_ruleAbstraction= ruleAbstraction EOF )
            // InternalComponent.g:739:2: iv_ruleAbstraction= ruleAbstraction EOF
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
    // InternalComponent.g:745:1: ruleAbstraction returns [EObject current=null] : (otherlv_0= 'abs' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' ) ;
    public final EObject ruleAbstraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:751:2: ( (otherlv_0= 'abs' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' ) )
            // InternalComponent.g:752:2: (otherlv_0= 'abs' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' )
            {
            // InternalComponent.g:752:2: (otherlv_0= 'abs' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' )
            // InternalComponent.g:753:3: otherlv_0= 'abs' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractionAccess().getAbsKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponent.g:761:3: ( ( ruleEString ) )
            // InternalComponent.g:762:4: ( ruleEString )
            {
            // InternalComponent.g:762:4: ( ruleEString )
            // InternalComponent.g:763:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAbstractionAccess().getLeftclassifierClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractionAccess().getCommaKeyword_3());
            		
            // InternalComponent.g:781:3: ( ( ruleEString ) )
            // InternalComponent.g:782:4: ( ruleEString )
            {
            // InternalComponent.g:782:4: ( ruleEString )
            // InternalComponent.g:783:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAbstractionAccess().getRightclassifierClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAbstractionAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalComponent.g:805:1: entryRuleManifestation returns [EObject current=null] : iv_ruleManifestation= ruleManifestation EOF ;
    public final EObject entryRuleManifestation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManifestation = null;


        try {
            // InternalComponent.g:805:54: (iv_ruleManifestation= ruleManifestation EOF )
            // InternalComponent.g:806:2: iv_ruleManifestation= ruleManifestation EOF
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
    // InternalComponent.g:812:1: ruleManifestation returns [EObject current=null] : (otherlv_0= 'man' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' ) ;
    public final EObject ruleManifestation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:818:2: ( (otherlv_0= 'man' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' ) )
            // InternalComponent.g:819:2: (otherlv_0= 'man' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' )
            {
            // InternalComponent.g:819:2: (otherlv_0= 'man' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' )
            // InternalComponent.g:820:3: otherlv_0= 'man' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getManifestationAccess().getManKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getManifestationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponent.g:828:3: ( ( ruleEString ) )
            // InternalComponent.g:829:4: ( ruleEString )
            {
            // InternalComponent.g:829:4: ( ruleEString )
            // InternalComponent.g:830:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManifestationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManifestationAccess().getLeftclassifierClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getManifestationAccess().getCommaKeyword_3());
            		
            // InternalComponent.g:848:3: ( ( ruleEString ) )
            // InternalComponent.g:849:4: ( ruleEString )
            {
            // InternalComponent.g:849:4: ( ruleEString )
            // InternalComponent.g:850:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManifestationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManifestationAccess().getRightclassifierClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getManifestationAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalComponent.g:872:1: entryRuleSubstitution returns [EObject current=null] : iv_ruleSubstitution= ruleSubstitution EOF ;
    public final EObject entryRuleSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstitution = null;


        try {
            // InternalComponent.g:872:53: (iv_ruleSubstitution= ruleSubstitution EOF )
            // InternalComponent.g:873:2: iv_ruleSubstitution= ruleSubstitution EOF
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
    // InternalComponent.g:879:1: ruleSubstitution returns [EObject current=null] : (otherlv_0= 'sub' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' ) ;
    public final EObject ruleSubstitution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:885:2: ( (otherlv_0= 'sub' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' ) )
            // InternalComponent.g:886:2: (otherlv_0= 'sub' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' )
            {
            // InternalComponent.g:886:2: (otherlv_0= 'sub' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' )
            // InternalComponent.g:887:3: otherlv_0= 'sub' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSubstitutionAccess().getSubKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSubstitutionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponent.g:895:3: ( ( ruleEString ) )
            // InternalComponent.g:896:4: ( ruleEString )
            {
            // InternalComponent.g:896:4: ( ruleEString )
            // InternalComponent.g:897:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstitutionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubstitutionAccess().getLeftclassifierClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSubstitutionAccess().getCommaKeyword_3());
            		
            // InternalComponent.g:915:3: ( ( ruleEString ) )
            // InternalComponent.g:916:4: ( ruleEString )
            {
            // InternalComponent.g:916:4: ( ruleEString )
            // InternalComponent.g:917:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstitutionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubstitutionAccess().getRightclassifierClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubstitutionAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalComponent.g:939:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalComponent.g:939:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalComponent.g:940:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalComponent.g:946:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'dep' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:952:2: ( (otherlv_0= 'dep' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' ) )
            // InternalComponent.g:953:2: (otherlv_0= 'dep' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' )
            {
            // InternalComponent.g:953:2: (otherlv_0= 'dep' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')' )
            // InternalComponent.g:954:3: otherlv_0= 'dep' otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDepKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponent.g:962:3: ( ( ruleEString ) )
            // InternalComponent.g:963:4: ( ruleEString )
            {
            // InternalComponent.g:963:4: ( ruleEString )
            // InternalComponent.g:964:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDependencyAccess().getLeftclassifierClassifierCrossReference_2_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getCommaKeyword_3());
            		
            // InternalComponent.g:982:3: ( ( ruleEString ) )
            // InternalComponent.g:983:4: ( ruleEString )
            {
            // InternalComponent.g:983:4: ( ruleEString )
            // InternalComponent.g:984:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDependencyAccess().getRightclassifierClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDependencyAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalComponent.g:1006:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalComponent.g:1006:48: (iv_ruleComment= ruleComment EOF )
            // InternalComponent.g:1007:2: iv_ruleComment= ruleComment EOF
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
    // InternalComponent.g:1013:1: ruleComment returns [EObject current=null] : (otherlv_0= 'note' ( (lv_body_1_0= ruleEString ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1019:2: ( (otherlv_0= 'note' ( (lv_body_1_0= ruleEString ) ) ) )
            // InternalComponent.g:1020:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleEString ) ) )
            {
            // InternalComponent.g:1020:2: (otherlv_0= 'note' ( (lv_body_1_0= ruleEString ) ) )
            // InternalComponent.g:1021:3: otherlv_0= 'note' ( (lv_body_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
            		
            // InternalComponent.g:1025:3: ( (lv_body_1_0= ruleEString ) )
            // InternalComponent.g:1026:4: (lv_body_1_0= ruleEString )
            {
            // InternalComponent.g:1026:4: (lv_body_1_0= ruleEString )
            // InternalComponent.g:1027:5: lv_body_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommentAccess().getBodyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"de.cooperateproject.modeling.textual.component.Component.EString");
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


    // $ANTLR start "entryRulePort"
    // InternalComponent.g:1048:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalComponent.g:1048:45: (iv_rulePort= rulePort EOF )
            // InternalComponent.g:1049:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalComponent.g:1055:1: rulePort returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'port' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1061:2: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'port' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalComponent.g:1062:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'port' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalComponent.g:1062:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'port' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalComponent.g:1063:3: () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'port' ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalComponent.g:1063:3: ()
            // InternalComponent.g:1064:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortAccess().getPortAction_0(),
            					current);
            			

            }

            // InternalComponent.g:1070:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=37 && LA15_0<=43)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponent.g:1071:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalComponent.g:1071:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalComponent.g:1072:5: lv_visibility_1_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getPortAccess().getVisibilityVisibilityEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_visibility_1_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPortRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"de.cooperateproject.modeling.textual.component.Component.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPortAccess().getPortKeyword_2());
            		
            // InternalComponent.g:1093:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalComponent.g:1094:4: (lv_name_3_0= RULE_ID )
            {
            // InternalComponent.g:1094:4: (lv_name_3_0= RULE_ID )
            // InternalComponent.g:1095:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleInterface"
    // InternalComponent.g:1115:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalComponent.g:1115:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalComponent.g:1116:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalComponent.g:1122:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_member_9_0= ruleMember ) )* otherlv_10= '}' ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_comments_6_0 = null;

        EObject lv_comments_8_0 = null;

        EObject lv_member_9_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1128:2: ( ( () otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_member_9_0= ruleMember ) )* otherlv_10= '}' ) ) ) )
            // InternalComponent.g:1129:2: ( () otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_member_9_0= ruleMember ) )* otherlv_10= '}' ) ) )
            {
            // InternalComponent.g:1129:2: ( () otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_member_9_0= ruleMember ) )* otherlv_10= '}' ) ) )
            // InternalComponent.g:1130:3: () otherlv_1= 'interface' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_member_9_0= ruleMember ) )* otherlv_10= '}' ) )
            {
            // InternalComponent.g:1130:3: ()
            // InternalComponent.g:1131:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalComponent.g:1141:3: ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponent.g:1142:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    {
                    // InternalComponent.g:1142:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    // InternalComponent.g:1143:5: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1143:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalComponent.g:1144:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalComponent.g:1144:6: (lv_name_2_0= RULE_STRING )
                    // InternalComponent.g:1145:7: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

                    otherlv_3=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getAsKeyword_2_0_1());
                    				
                    // InternalComponent.g:1165:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalComponent.g:1166:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalComponent.g:1166:6: (lv_alias_4_0= RULE_ID )
                    // InternalComponent.g:1167:7: lv_alias_4_0= RULE_ID
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
                    								"de.cooperateproject.modeling.textual.component.Component.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:1185:4: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1185:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalComponent.g:1186:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalComponent.g:1186:5: (lv_name_5_0= RULE_ID )
                    // InternalComponent.g:1187:6: lv_name_5_0= RULE_ID
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
                    							"de.cooperateproject.modeling.textual.component.Component.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponent.g:1204:3: ( ( (lv_comments_6_0= ruleComment ) )? | (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_member_9_0= ruleMember ) )* otherlv_10= '}' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EOF||LA20_0==13||LA20_0==15||(LA20_0>=18 && LA20_0<=19)||(LA20_0>=23 && LA20_0<=27)||LA20_0==29) ) {
                alt20=1;
            }
            else if ( (LA20_0==17) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponent.g:1205:4: ( (lv_comments_6_0= ruleComment ) )?
                    {
                    // InternalComponent.g:1205:4: ( (lv_comments_6_0= ruleComment ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalComponent.g:1206:5: (lv_comments_6_0= ruleComment )
                            {
                            // InternalComponent.g:1206:5: (lv_comments_6_0= ruleComment )
                            // InternalComponent.g:1207:6: lv_comments_6_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_3_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_6_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_6_0,
                            							"de.cooperateproject.modeling.textual.component.Component.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:1225:4: (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_member_9_0= ruleMember ) )* otherlv_10= '}' )
                    {
                    // InternalComponent.g:1225:4: (otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_member_9_0= ruleMember ) )* otherlv_10= '}' )
                    // InternalComponent.g:1226:5: otherlv_7= '{' ( (lv_comments_8_0= ruleComment ) )? ( (lv_member_9_0= ruleMember ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_22); 

                    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalComponent.g:1230:5: ( (lv_comments_8_0= ruleComment ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==27) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalComponent.g:1231:6: (lv_comments_8_0= ruleComment )
                            {
                            // InternalComponent.g:1231:6: (lv_comments_8_0= ruleComment )
                            // InternalComponent.g:1232:7: lv_comments_8_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_23);
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
                            break;

                    }

                    // InternalComponent.g:1249:5: ( (lv_member_9_0= ruleMember ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID||(LA19_0>=33 && LA19_0<=34)||(LA19_0>=37 && LA19_0<=43)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalComponent.g:1250:6: (lv_member_9_0= ruleMember )
                    	    {
                    	    // InternalComponent.g:1250:6: (lv_member_9_0= ruleMember )
                    	    // InternalComponent.g:1251:7: lv_member_9_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getMemberMemberParserRuleCall_3_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_member_9_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"member",
                    	    								lv_member_9_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3_1_3());
                    				

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


    // $ANTLR start "entryRuleConnector"
    // InternalComponent.g:1278:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalComponent.g:1278:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalComponent.g:1279:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalComponent.g:1285:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'con' ( ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( ( ruleEString ) ) otherlv_11= ')' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1291:2: ( (otherlv_0= 'con' ( ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( ( ruleEString ) ) otherlv_11= ')' ) )
            // InternalComponent.g:1292:2: (otherlv_0= 'con' ( ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( ( ruleEString ) ) otherlv_11= ')' )
            {
            // InternalComponent.g:1292:2: (otherlv_0= 'con' ( ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( ( ruleEString ) ) otherlv_11= ')' )
            // InternalComponent.g:1293:3: otherlv_0= 'con' ( ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' ( ( ruleEString ) ) otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConKeyword_0());
            		
            // InternalComponent.g:1297:3: ( ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==16) ) {
                    alt21=1;
                }
                else if ( (LA21_2==20) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

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
                    // InternalComponent.g:1298:4: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
                    {
                    // InternalComponent.g:1298:4: ( ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
                    // InternalComponent.g:1299:5: ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1299:5: ( (lv_name_1_0= ruleEString ) )
                    // InternalComponent.g:1300:6: (lv_name_1_0= ruleEString )
                    {
                    // InternalComponent.g:1300:6: (lv_name_1_0= ruleEString )
                    // InternalComponent.g:1301:7: lv_name_1_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getConnectorAccess().getNameEStringParserRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConnectorRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_1_0,
                    								"de.cooperateproject.modeling.textual.component.Component.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getAsKeyword_1_0_1());
                    				
                    // InternalComponent.g:1322:5: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalComponent.g:1323:6: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalComponent.g:1323:6: (lv_alias_3_0= RULE_ID )
                    // InternalComponent.g:1324:7: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    							newLeafNode(lv_alias_3_0, grammarAccess.getConnectorAccess().getAliasIDTerminalRuleCall_1_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConnectorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_3_0,
                    								"de.cooperateproject.modeling.textual.component.Component.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:1342:4: ( (lv_name_4_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1342:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalComponent.g:1343:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalComponent.g:1343:5: (lv_name_4_0= RULE_ID )
                    // InternalComponent.g:1344:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"de.cooperateproject.modeling.textual.component.Component.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getLeftParenthesisKeyword_2());
            		
            // InternalComponent.g:1365:3: ( (otherlv_6= RULE_ID ) )
            // InternalComponent.g:1366:4: (otherlv_6= RULE_ID )
            {
            // InternalComponent.g:1366:4: (otherlv_6= RULE_ID )
            // InternalComponent.g:1367:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_6, grammarAccess.getConnectorAccess().getLeftportPortCrossReference_3_0());
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectorAccess().getCommaKeyword_4());
            		
            // InternalComponent.g:1382:3: ( (otherlv_8= RULE_ID ) )
            // InternalComponent.g:1383:4: (otherlv_8= RULE_ID )
            {
            // InternalComponent.g:1383:4: (otherlv_8= RULE_ID )
            // InternalComponent.g:1384:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_8, grammarAccess.getConnectorAccess().getRightportPortCrossReference_5_0());
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getConnectorAccess().getCommaKeyword_6());
            		
            // InternalComponent.g:1399:3: ( ( ruleEString ) )
            // InternalComponent.g:1400:4: ( ruleEString )
            {
            // InternalComponent.g:1400:4: ( ruleEString )
            // InternalComponent.g:1401:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorAccess().getInterfaceInterfaceCrossReference_7_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getConnectorAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalComponent.g:1423:1: entryRuleProvide returns [EObject current=null] : iv_ruleProvide= ruleProvide EOF ;
    public final EObject entryRuleProvide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvide = null;


        try {
            // InternalComponent.g:1423:48: (iv_ruleProvide= ruleProvide EOF )
            // InternalComponent.g:1424:2: iv_ruleProvide= ruleProvide EOF
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
    // InternalComponent.g:1430:1: ruleProvide returns [EObject current=null] : ( () otherlv_1= 'provide' ( ( ruleFQN ) ) ) ;
    public final EObject ruleProvide() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalComponent.g:1436:2: ( ( () otherlv_1= 'provide' ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1437:2: ( () otherlv_1= 'provide' ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1437:2: ( () otherlv_1= 'provide' ( ( ruleFQN ) ) )
            // InternalComponent.g:1438:3: () otherlv_1= 'provide' ( ( ruleFQN ) )
            {
            // InternalComponent.g:1438:3: ()
            // InternalComponent.g:1439:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvideAccess().getProvideAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getProvideAccess().getProvideKeyword_1());
            		
            // InternalComponent.g:1449:3: ( ( ruleFQN ) )
            // InternalComponent.g:1450:4: ( ruleFQN )
            {
            // InternalComponent.g:1450:4: ( ruleFQN )
            // InternalComponent.g:1451:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvideRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvideAccess().getInterfaceInterfaceCrossReference_2_0());
            				
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
    // $ANTLR end "ruleProvide"


    // $ANTLR start "entryRuleRequire"
    // InternalComponent.g:1469:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalComponent.g:1469:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalComponent.g:1470:2: iv_ruleRequire= ruleRequire EOF
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
    // InternalComponent.g:1476:1: ruleRequire returns [EObject current=null] : ( () otherlv_1= 'require' ( ( ruleFQN ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalComponent.g:1482:2: ( ( () otherlv_1= 'require' ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1483:2: ( () otherlv_1= 'require' ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1483:2: ( () otherlv_1= 'require' ( ( ruleFQN ) ) )
            // InternalComponent.g:1484:3: () otherlv_1= 'require' ( ( ruleFQN ) )
            {
            // InternalComponent.g:1484:3: ()
            // InternalComponent.g:1485:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequireAccess().getRequireAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRequireAccess().getRequireKeyword_1());
            		
            // InternalComponent.g:1495:3: ( ( ruleFQN ) )
            // InternalComponent.g:1496:4: ( ruleFQN )
            {
            // InternalComponent.g:1496:4: ( ruleFQN )
            // InternalComponent.g:1497:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequireRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequireAccess().getInterfaceInterfaceCrossReference_2_0());
            				
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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleMethod"
    // InternalComponent.g:1515:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalComponent.g:1515:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalComponent.g:1516:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalComponent.g:1522:1: ruleMethod returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_2_0=null;
        Token lv_static_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1528:2: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? ) )
            // InternalComponent.g:1529:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? )
            {
            // InternalComponent.g:1529:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? )
            // InternalComponent.g:1530:3: () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )?
            {
            // InternalComponent.g:1530:3: ()
            // InternalComponent.g:1531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            // InternalComponent.g:1537:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=37 && LA22_0<=43)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponent.g:1538:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalComponent.g:1538:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalComponent.g:1539:5: lv_visibility_1_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_visibility_1_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"de.cooperateproject.modeling.textual.component.Component.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1556:3: ( (lv_abstract_2_0= 'abstract' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponent.g:1557:4: (lv_abstract_2_0= 'abstract' )
                    {
                    // InternalComponent.g:1557:4: (lv_abstract_2_0= 'abstract' )
                    // InternalComponent.g:1558:5: lv_abstract_2_0= 'abstract'
                    {
                    lv_abstract_2_0=(Token)match(input,33,FOLLOW_25); 

                    					newLeafNode(lv_abstract_2_0, grammarAccess.getMethodAccess().getAbstractAbstractKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1570:3: ( (lv_static_3_0= 'static' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponent.g:1571:4: (lv_static_3_0= 'static' )
                    {
                    // InternalComponent.g:1571:4: (lv_static_3_0= 'static' )
                    // InternalComponent.g:1572:5: lv_static_3_0= 'static'
                    {
                    lv_static_3_0=(Token)match(input,34,FOLLOW_6); 

                    					newLeafNode(lv_static_3_0, grammarAccess.getMethodAccess().getStaticStaticKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1584:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalComponent.g:1585:4: (lv_name_4_0= RULE_ID )
            {
            // InternalComponent.g:1585:4: (lv_name_4_0= RULE_ID )
            // InternalComponent.g:1586:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
            		
            // InternalComponent.g:1606:3: ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==34||(LA26_0>=37 && LA26_0<=43)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalComponent.g:1607:4: ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    {
            	    // InternalComponent.g:1607:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalComponent.g:1608:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalComponent.g:1608:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalComponent.g:1609:6: lv_parameters_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_parameters_6_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"de.cooperateproject.modeling.textual.component.Component.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalComponent.g:1626:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==21) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalComponent.g:1627:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,21,FOLLOW_28); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_6_1_0());
            	    	    				
            	    	    // InternalComponent.g:1631:5: ( (lv_parameters_8_0= ruleParameter ) )
            	    	    // InternalComponent.g:1632:6: (lv_parameters_8_0= ruleParameter )
            	    	    {
            	    	    // InternalComponent.g:1632:6: (lv_parameters_8_0= ruleParameter )
            	    	    // InternalComponent.g:1633:7: lv_parameters_8_0= ruleParameter
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_parameters_8_0=ruleParameter();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"parameters",
            	    	    								lv_parameters_8_0,
            	    	    								"de.cooperateproject.modeling.textual.component.Component.Parameter");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_7());
            		
            // InternalComponent.g:1656:3: (otherlv_10= ':' ( ( ruleFQN ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponent.g:1657:4: otherlv_10= ':' ( ( ruleFQN ) )
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getColonKeyword_8_0());
                    			
                    // InternalComponent.g:1661:4: ( ( ruleFQN ) )
                    // InternalComponent.g:1662:5: ( ruleFQN )
                    {
                    // InternalComponent.g:1662:5: ( ruleFQN )
                    // InternalComponent.g:1663:6: ruleFQN
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


    // $ANTLR start "entryRuleAttribute"
    // InternalComponent.g:1682:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalComponent.g:1682:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalComponent.g:1683:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalComponent.g:1689:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1695:2: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1696:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1696:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) )
            // InternalComponent.g:1697:3: () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) )
            {
            // InternalComponent.g:1697:3: ()
            // InternalComponent.g:1698:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalComponent.g:1704:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=37 && LA28_0<=43)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponent.g:1705:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalComponent.g:1705:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalComponent.g:1706:5: lv_visibility_1_0= ruleVisibility
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
                    						"de.cooperateproject.modeling.textual.component.Component.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1723:3: ( (lv_static_2_0= 'static' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponent.g:1724:4: (lv_static_2_0= 'static' )
                    {
                    // InternalComponent.g:1724:4: (lv_static_2_0= 'static' )
                    // InternalComponent.g:1725:5: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,34,FOLLOW_6); 

                    					newLeafNode(lv_static_2_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1737:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalComponent.g:1738:4: (lv_name_3_0= RULE_ID )
            {
            // InternalComponent.g:1738:4: (lv_name_3_0= RULE_ID )
            // InternalComponent.g:1739:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4());
            		
            // InternalComponent.g:1759:3: ( ( ruleFQN ) )
            // InternalComponent.g:1760:4: ( ruleFQN )
            {
            // InternalComponent.g:1760:4: ( ruleFQN )
            // InternalComponent.g:1761:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeClassifierCrossReference_5_0());
            				
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleParameter"
    // InternalComponent.g:1779:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalComponent.g:1779:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalComponent.g:1780:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalComponent.g:1786:1: ruleParameter returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1792:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1793:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1793:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            // InternalComponent.g:1794:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) )
            {
            // InternalComponent.g:1794:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=37 && LA30_0<=43)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponent.g:1795:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalComponent.g:1795:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalComponent.g:1796:5: lv_visibility_0_0= ruleVisibility
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
                    						"de.cooperateproject.modeling.textual.component.Component.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1813:3: ( (lv_static_1_0= 'static' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalComponent.g:1814:4: (lv_static_1_0= 'static' )
                    {
                    // InternalComponent.g:1814:4: (lv_static_1_0= 'static' )
                    // InternalComponent.g:1815:5: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,34,FOLLOW_6); 

                    					newLeafNode(lv_static_1_0, grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1827:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponent.g:1828:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponent.g:1828:4: (lv_name_2_0= RULE_ID )
            // InternalComponent.g:1829:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_2_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
            		
            // InternalComponent.g:1849:3: ( ( ruleFQN ) )
            // InternalComponent.g:1850:4: ( ruleFQN )
            {
            // InternalComponent.g:1850:4: ( ruleFQN )
            // InternalComponent.g:1851:5: ruleFQN
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


    // $ANTLR start "entryRuleFQN"
    // InternalComponent.g:1869:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalComponent.g:1869:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalComponent.g:1870:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalComponent.g:1876:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponent.g:1882:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponent.g:1883:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponent.g:1883:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponent.g:1884:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponent.g:1891:3: (kw= '.' this_ID_2= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalComponent.g:1892:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
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


    // $ANTLR start "ruleVisibility"
    // InternalComponent.g:1909:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) ;
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
            // InternalComponent.g:1915:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) )
            // InternalComponent.g:1916:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            {
            // InternalComponent.g:1916:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            int alt33=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt33=1;
                }
                break;
            case 38:
                {
                alt33=2;
                }
                break;
            case 39:
                {
                alt33=3;
                }
                break;
            case 40:
                {
                alt33=4;
                }
                break;
            case 41:
                {
                alt33=5;
                }
                break;
            case 42:
                {
                alt33=6;
                }
                break;
            case 43:
                {
                alt33=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalComponent.g:1917:3: (enumLiteral_0= '+' )
                    {
                    // InternalComponent.g:1917:3: (enumLiteral_0= '+' )
                    // InternalComponent.g:1918:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:1925:3: (enumLiteral_1= 'public' )
                    {
                    // InternalComponent.g:1925:3: (enumLiteral_1= 'public' )
                    // InternalComponent.g:1926:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalComponent.g:1933:3: (enumLiteral_2= '-' )
                    {
                    // InternalComponent.g:1933:3: (enumLiteral_2= '-' )
                    // InternalComponent.g:1934:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalComponent.g:1941:3: (enumLiteral_3= 'private' )
                    {
                    // InternalComponent.g:1941:3: (enumLiteral_3= 'private' )
                    // InternalComponent.g:1942:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalComponent.g:1949:3: (enumLiteral_4= '#' )
                    {
                    // InternalComponent.g:1949:3: (enumLiteral_4= '#' )
                    // InternalComponent.g:1950:4: enumLiteral_4= '#'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalComponent.g:1957:3: (enumLiteral_5= 'protected' )
                    {
                    // InternalComponent.g:1957:3: (enumLiteral_5= 'protected' )
                    // InternalComponent.g:1958:4: enumLiteral_5= 'protected'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalComponent.g:1965:3: (enumLiteral_6= '~' )
                    {
                    // InternalComponent.g:1965:3: (enumLiteral_6= '~' )
                    // InternalComponent.g:1966:4: enumLiteral_6= '~'
                    {
                    enumLiteral_6=(Token)match(input,43,FOLLOW_2); 

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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\10\5\1\uffff\1\5\1\24\1\uffff";
    static final String dfa_3s = "\1\53\7\42\1\uffff\1\5\1\43\1\uffff";
    static final String dfa_4s = "\10\uffff\1\1\2\uffff\1\2";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\12\33\uffff\1\10\1\11\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "",
            "\1\12",
            "\1\10\16\uffff\1\13",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "311:2: (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000027888002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000007880002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000FE1F8048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000FE1F0048000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000FE1F0040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001E0040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001A0040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008020002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000FE608040020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000FE600040020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000600000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000FE400400020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000FE400600020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000FE400000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000002L});

}