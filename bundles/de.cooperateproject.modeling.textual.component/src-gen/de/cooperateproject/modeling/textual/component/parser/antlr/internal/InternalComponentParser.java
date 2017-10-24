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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-cpd'", "'@end-cpd'", "'rootPackage'", "'component'", "'as'", "'{'", "'}'", "'class'", "'isa'", "'('", "','", "')'", "'abs'", "'man'", "'sub'", "'dep'", "'note'", "'port'", "'realizes'", "'interface'", "'con'", "'.'", "'provide'", "'require'", "'abstract'", "'static'", "':'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'"
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
    public static final int T__44=44;
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
    // InternalComponent.g:72:1: ruleComponentDiagram returns [EObject current=null] : ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' ) ;
    public final EObject ruleComponentDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_4=null;
        EObject lv_rootpackage_3_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:78:2: ( ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' ) )
            // InternalComponent.g:79:2: ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' )
            {
            // InternalComponent.g:79:2: ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' )
            // InternalComponent.g:80:3: () otherlv_1= '@start-cpd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd'
            {
            // InternalComponent.g:80:3: ()
            // InternalComponent.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentDiagramAccess().getComponentDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentDiagramAccess().getStartCpdKeyword_1());
            		
            // InternalComponent.g:91:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalComponent.g:92:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalComponent.g:92:4: (lv_title_2_0= RULE_STRING )
            // InternalComponent.g:93:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_2_0, grammarAccess.getComponentDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalComponent.g:109:3: ( (lv_rootpackage_3_0= ruleRootPackage ) )
            // InternalComponent.g:110:4: (lv_rootpackage_3_0= ruleRootPackage )
            {
            // InternalComponent.g:110:4: (lv_rootpackage_3_0= ruleRootPackage )
            // InternalComponent.g:111:5: lv_rootpackage_3_0= ruleRootPackage
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

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

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
    // InternalComponent.g:136:1: entryRuleClassifierRelation returns [EObject current=null] : iv_ruleClassifierRelation= ruleClassifierRelation EOF ;
    public final EObject entryRuleClassifierRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierRelation = null;


        try {
            // InternalComponent.g:136:59: (iv_ruleClassifierRelation= ruleClassifierRelation EOF )
            // InternalComponent.g:137:2: iv_ruleClassifierRelation= ruleClassifierRelation EOF
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
    // InternalComponent.g:143:1: ruleClassifierRelation returns [EObject current=null] : (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency ) ;
    public final EObject ruleClassifierRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;

        EObject this_Abstraction_1 = null;

        EObject this_Manifestation_2 = null;

        EObject this_Substitution_3 = null;

        EObject this_Dependency_4 = null;



        	enterRule();

        try {
            // InternalComponent.g:149:2: ( (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency ) )
            // InternalComponent.g:150:2: (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency )
            {
            // InternalComponent.g:150:2: (this_Generalization_0= ruleGeneralization | this_Abstraction_1= ruleAbstraction | this_Manifestation_2= ruleManifestation | this_Substitution_3= ruleSubstitution | this_Dependency_4= ruleDependency )
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
                    // InternalComponent.g:151:3: this_Generalization_0= ruleGeneralization
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
                    // InternalComponent.g:160:3: this_Abstraction_1= ruleAbstraction
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
                    // InternalComponent.g:169:3: this_Manifestation_2= ruleManifestation
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
                    // InternalComponent.g:178:3: this_Substitution_3= ruleSubstitution
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
                    // InternalComponent.g:187:3: this_Dependency_4= ruleDependency
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
    // InternalComponent.g:199:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalComponent.g:199:51: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalComponent.g:200:2: iv_ruleClassifier= ruleClassifier EOF
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
    // InternalComponent.g:206:1: ruleClassifier returns [EObject current=null] : (this_Interface_0= ruleInterface | this_Component_1= ruleComponent | this_Class_2= ruleClass ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_Component_1 = null;

        EObject this_Class_2 = null;



        	enterRule();

        try {
            // InternalComponent.g:212:2: ( (this_Interface_0= ruleInterface | this_Component_1= ruleComponent | this_Class_2= ruleClass ) )
            // InternalComponent.g:213:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent | this_Class_2= ruleClass )
            {
            // InternalComponent.g:213:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent | this_Class_2= ruleClass )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 18:
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
                    // InternalComponent.g:214:3: this_Interface_0= ruleInterface
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
                    // InternalComponent.g:223:3: this_Component_1= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getClassifierAccess().getComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_1=ruleComponent();

                    state._fsp--;


                    			current = this_Component_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponent.g:232:3: this_Class_2= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getClassifierAccess().getClassParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_2=ruleClass();

                    state._fsp--;


                    			current = this_Class_2;
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


    // $ANTLR start "entryRuleInterfaceRelation"
    // InternalComponent.g:244:1: entryRuleInterfaceRelation returns [EObject current=null] : iv_ruleInterfaceRelation= ruleInterfaceRelation EOF ;
    public final EObject entryRuleInterfaceRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceRelation = null;


        try {
            // InternalComponent.g:244:58: (iv_ruleInterfaceRelation= ruleInterfaceRelation EOF )
            // InternalComponent.g:245:2: iv_ruleInterfaceRelation= ruleInterfaceRelation EOF
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
    // InternalComponent.g:251:1: ruleInterfaceRelation returns [EObject current=null] : (this_Provide_0= ruleProvide | this_Require_1= ruleRequire ) ;
    public final EObject ruleInterfaceRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Provide_0 = null;

        EObject this_Require_1 = null;



        	enterRule();

        try {
            // InternalComponent.g:257:2: ( (this_Provide_0= ruleProvide | this_Require_1= ruleRequire ) )
            // InternalComponent.g:258:2: (this_Provide_0= ruleProvide | this_Require_1= ruleRequire )
            {
            // InternalComponent.g:258:2: (this_Provide_0= ruleProvide | this_Require_1= ruleRequire )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==33) ) {
                alt3=1;
            }
            else if ( (LA3_0==34) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponent.g:259:3: this_Provide_0= ruleProvide
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
                    // InternalComponent.g:268:3: this_Require_1= ruleRequire
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
    // InternalComponent.g:280:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalComponent.g:280:47: (iv_ruleMember= ruleMember EOF )
            // InternalComponent.g:281:2: iv_ruleMember= ruleMember EOF
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
    // InternalComponent.g:287:1: ruleMember returns [EObject current=null] : (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Attribute_1 = null;



        	enterRule();

        try {
            // InternalComponent.g:293:2: ( (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute ) )
            // InternalComponent.g:294:2: (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute )
            {
            // InternalComponent.g:294:2: (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalComponent.g:295:3: this_Method_0= ruleMethod
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
                    // InternalComponent.g:304:3: this_Attribute_1= ruleAttribute
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


    // $ANTLR start "entryRuleRootPackage"
    // InternalComponent.g:316:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalComponent.g:316:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalComponent.g:317:2: iv_ruleRootPackage= ruleRootPackage EOF
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
    // InternalComponent.g:323:1: ruleRootPackage returns [EObject current=null] : (otherlv_0= 'rootPackage' ( (lv_name_1_0= ruleFQN ) ) ( (lv_classifiers_2_0= ruleClassifier ) )* ( (lv_relations_3_0= ruleClassifierRelation ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_classifiers_2_0 = null;

        EObject lv_relations_3_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:329:2: ( (otherlv_0= 'rootPackage' ( (lv_name_1_0= ruleFQN ) ) ( (lv_classifiers_2_0= ruleClassifier ) )* ( (lv_relations_3_0= ruleClassifierRelation ) )* ) )
            // InternalComponent.g:330:2: (otherlv_0= 'rootPackage' ( (lv_name_1_0= ruleFQN ) ) ( (lv_classifiers_2_0= ruleClassifier ) )* ( (lv_relations_3_0= ruleClassifierRelation ) )* )
            {
            // InternalComponent.g:330:2: (otherlv_0= 'rootPackage' ( (lv_name_1_0= ruleFQN ) ) ( (lv_classifiers_2_0= ruleClassifier ) )* ( (lv_relations_3_0= ruleClassifierRelation ) )* )
            // InternalComponent.g:331:3: otherlv_0= 'rootPackage' ( (lv_name_1_0= ruleFQN ) ) ( (lv_classifiers_2_0= ruleClassifier ) )* ( (lv_relations_3_0= ruleClassifierRelation ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRootPackageAccess().getRootPackageKeyword_0());
            		
            // InternalComponent.g:335:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalComponent.g:336:4: (lv_name_1_0= ruleFQN )
            {
            // InternalComponent.g:336:4: (lv_name_1_0= ruleFQN )
            // InternalComponent.g:337:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cooperateproject.modeling.textual.component.Component.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponent.g:354:3: ( (lv_classifiers_2_0= ruleClassifier ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14||LA5_0==18||LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalComponent.g:355:4: (lv_classifiers_2_0= ruleClassifier )
            	    {
            	    // InternalComponent.g:355:4: (lv_classifiers_2_0= ruleClassifier )
            	    // InternalComponent.g:356:5: lv_classifiers_2_0= ruleClassifier
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getClassifiersClassifierParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_classifiers_2_0=ruleClassifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classifiers",
            	    						lv_classifiers_2_0,
            	    						"de.cooperateproject.modeling.textual.component.Component.Classifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalComponent.g:373:3: ( (lv_relations_3_0= ruleClassifierRelation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19||(LA6_0>=23 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponent.g:374:4: (lv_relations_3_0= ruleClassifierRelation )
            	    {
            	    // InternalComponent.g:374:4: (lv_relations_3_0= ruleClassifierRelation )
            	    // InternalComponent.g:375:5: lv_relations_3_0= ruleClassifierRelation
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getRelationsClassifierRelationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_relations_3_0=ruleClassifierRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_3_0,
            	    						"de.cooperateproject.modeling.textual.component.Component.ClassifierRelation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalComponent.g:396:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalComponent.g:396:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalComponent.g:397:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalComponent.g:403:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_6=null;
        Token otherlv_13=null;
        EObject lv_comments_5_0 = null;

        EObject lv_comments_7_0 = null;

        EObject lv_interfaceRelation_8_0 = null;

        EObject lv_port_9_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_connectors_11_0 = null;

        EObject lv_packagedElements_12_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:409:2: ( (otherlv_0= 'component' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) ) ) )
            // InternalComponent.g:410:2: (otherlv_0= 'component' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) ) )
            {
            // InternalComponent.g:410:2: (otherlv_0= 'component' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) ) )
            // InternalComponent.g:411:3: otherlv_0= 'component' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalComponent.g:415:3: ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) )
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
                    // InternalComponent.g:416:4: ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
                    {
                    // InternalComponent.g:416:4: ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
                    // InternalComponent.g:417:5: ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    // InternalComponent.g:417:5: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalComponent.g:418:6: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalComponent.g:418:6: (lv_name_1_0= RULE_STRING )
                    // InternalComponent.g:419:7: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    							newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComponentRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_1_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getAsKeyword_1_0_1());
                    				
                    // InternalComponent.g:439:5: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalComponent.g:440:6: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalComponent.g:440:6: (lv_alias_3_0= RULE_ID )
                    // InternalComponent.g:441:7: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    							newLeafNode(lv_alias_3_0, grammarAccess.getComponentAccess().getAliasIDTerminalRuleCall_1_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComponentRule());
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
                    // InternalComponent.g:459:4: ( (lv_name_4_0= RULE_ID ) )
                    {
                    // InternalComponent.g:459:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalComponent.g:460:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalComponent.g:460:5: (lv_name_4_0= RULE_ID )
                    // InternalComponent.g:461:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
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

            // InternalComponent.g:478:3: ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EOF||LA15_0==12||LA15_0==14||(LA15_0>=17 && LA15_0<=19)||(LA15_0>=23 && LA15_0<=27)||LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==16) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponent.g:479:4: ( (lv_comments_5_0= ruleComment ) )?
                    {
                    // InternalComponent.g:479:4: ( (lv_comments_5_0= ruleComment ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==27) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalComponent.g:480:5: (lv_comments_5_0= ruleComment )
                            {
                            // InternalComponent.g:480:5: (lv_comments_5_0= ruleComment )
                            // InternalComponent.g:481:6: lv_comments_5_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_5_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getComponentRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_5_0,
                            							"de.cooperateproject.modeling.textual.component.Component.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:499:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' )
                    {
                    // InternalComponent.g:499:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' )
                    // InternalComponent.g:500:5: otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_12); 

                    					newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalComponent.g:504:5: ( (lv_comments_7_0= ruleComment ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==27) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalComponent.g:505:6: (lv_comments_7_0= ruleComment )
                            {
                            // InternalComponent.g:505:6: (lv_comments_7_0= ruleComment )
                            // InternalComponent.g:506:7: lv_comments_7_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_13);
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

                    // InternalComponent.g:523:5: ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=33 && LA10_0<=34)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalComponent.g:524:6: (lv_interfaceRelation_8_0= ruleInterfaceRelation )
                    	    {
                    	    // InternalComponent.g:524:6: (lv_interfaceRelation_8_0= ruleInterfaceRelation )
                    	    // InternalComponent.g:525:7: lv_interfaceRelation_8_0= ruleInterfaceRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getInterfaceRelationInterfaceRelationParserRuleCall_2_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_interfaceRelation_8_0=ruleInterfaceRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaceRelation",
                    	    								lv_interfaceRelation_8_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.InterfaceRelation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // InternalComponent.g:542:5: ( (lv_port_9_0= rulePort ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28||(LA11_0>=38 && LA11_0<=44)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalComponent.g:543:6: (lv_port_9_0= rulePort )
                    	    {
                    	    // InternalComponent.g:543:6: (lv_port_9_0= rulePort )
                    	    // InternalComponent.g:544:7: lv_port_9_0= rulePort
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getPortPortParserRuleCall_2_1_3_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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

                    // InternalComponent.g:561:5: ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalComponent.g:562:6: (lv_attributes_10_0= ruleComponentTypeAttribute )
                    	    {
                    	    // InternalComponent.g:562:6: (lv_attributes_10_0= ruleComponentTypeAttribute )
                    	    // InternalComponent.g:563:7: lv_attributes_10_0= ruleComponentTypeAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getAttributesComponentTypeAttributeParserRuleCall_2_1_4_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_attributes_10_0=ruleComponentTypeAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_10_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.ComponentTypeAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalComponent.g:580:5: ( (lv_connectors_11_0= ruleConnector ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==31) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalComponent.g:581:6: (lv_connectors_11_0= ruleConnector )
                    	    {
                    	    // InternalComponent.g:581:6: (lv_connectors_11_0= ruleConnector )
                    	    // InternalComponent.g:582:7: lv_connectors_11_0= ruleConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_2_1_5_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_connectors_11_0=ruleConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"connectors",
                    	    								lv_connectors_11_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Connector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalComponent.g:599:5: ( (lv_packagedElements_12_0= ruleClassifier ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14||LA14_0==18||LA14_0==30) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalComponent.g:600:6: (lv_packagedElements_12_0= ruleClassifier )
                    	    {
                    	    // InternalComponent.g:600:6: (lv_packagedElements_12_0= ruleClassifier )
                    	    // InternalComponent.g:601:7: lv_packagedElements_12_0= ruleClassifier
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getPackagedElementsClassifierParserRuleCall_2_1_6_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_packagedElements_12_0=ruleClassifier();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"packagedElements",
                    	    								lv_packagedElements_12_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Classifier");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_2_1_7());
                    				

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleClass"
    // InternalComponent.g:628:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalComponent.g:628:46: (iv_ruleClass= ruleClass EOF )
            // InternalComponent.g:629:2: iv_ruleClass= ruleClass EOF
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
    // InternalComponent.g:635:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_comments_5_0 = null;

        EObject lv_comments_7_0 = null;

        EObject lv_interfaceRelation_8_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:641:2: ( (otherlv_0= 'class' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) ) ) )
            // InternalComponent.g:642:2: (otherlv_0= 'class' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) ) )
            {
            // InternalComponent.g:642:2: (otherlv_0= 'class' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) ) )
            // InternalComponent.g:643:3: otherlv_0= 'class' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalComponent.g:647:3: ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) )
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
                    // InternalComponent.g:648:4: ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
                    {
                    // InternalComponent.g:648:4: ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
                    // InternalComponent.g:649:5: ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    // InternalComponent.g:649:5: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalComponent.g:650:6: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalComponent.g:650:6: (lv_name_1_0= RULE_STRING )
                    // InternalComponent.g:651:7: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    							newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_1_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getClassAccess().getAsKeyword_1_0_1());
                    				
                    // InternalComponent.g:671:5: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalComponent.g:672:6: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalComponent.g:672:6: (lv_alias_3_0= RULE_ID )
                    // InternalComponent.g:673:7: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    							newLeafNode(lv_alias_3_0, grammarAccess.getClassAccess().getAliasIDTerminalRuleCall_1_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassRule());
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
                    // InternalComponent.g:691:4: ( (lv_name_4_0= RULE_ID ) )
                    {
                    // InternalComponent.g:691:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalComponent.g:692:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalComponent.g:692:5: (lv_name_4_0= RULE_ID )
                    // InternalComponent.g:693:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
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

            // InternalComponent.g:710:3: ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EOF||LA20_0==12||LA20_0==14||(LA20_0>=17 && LA20_0<=19)||(LA20_0>=23 && LA20_0<=27)||LA20_0==30) ) {
                alt20=1;
            }
            else if ( (LA20_0==16) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponent.g:711:4: ( (lv_comments_5_0= ruleComment ) )?
                    {
                    // InternalComponent.g:711:4: ( (lv_comments_5_0= ruleComment ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalComponent.g:712:5: (lv_comments_5_0= ruleComment )
                            {
                            // InternalComponent.g:712:5: (lv_comments_5_0= ruleComment )
                            // InternalComponent.g:713:6: lv_comments_5_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_5_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClassRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_5_0,
                            							"de.cooperateproject.modeling.textual.component.Component.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:731:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' )
                    {
                    // InternalComponent.g:731:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' )
                    // InternalComponent.g:732:5: otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_18); 

                    					newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalComponent.g:736:5: ( (lv_comments_7_0= ruleComment ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==27) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalComponent.g:737:6: (lv_comments_7_0= ruleComment )
                            {
                            // InternalComponent.g:737:6: (lv_comments_7_0= ruleComment )
                            // InternalComponent.g:738:7: lv_comments_7_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_19);
                            lv_comments_7_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassRule());
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

                    // InternalComponent.g:755:5: ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=33 && LA19_0<=34)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalComponent.g:756:6: (lv_interfaceRelation_8_0= ruleInterfaceRelation )
                    	    {
                    	    // InternalComponent.g:756:6: (lv_interfaceRelation_8_0= ruleInterfaceRelation )
                    	    // InternalComponent.g:757:7: lv_interfaceRelation_8_0= ruleInterfaceRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getInterfaceRelationInterfaceRelationParserRuleCall_2_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_interfaceRelation_8_0=ruleInterfaceRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaceRelation",
                    	    								lv_interfaceRelation_8_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.InterfaceRelation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_2_1_3());
                    				

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleGeneralization"
    // InternalComponent.g:784:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalComponent.g:784:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalComponent.g:785:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalComponent.g:791:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'isa' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:797:2: ( (otherlv_0= 'isa' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalComponent.g:798:2: (otherlv_0= 'isa' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalComponent.g:798:2: (otherlv_0= 'isa' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalComponent.g:799:3: otherlv_0= 'isa' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsaKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponent.g:807:3: ( (otherlv_2= RULE_ID ) )
            // InternalComponent.g:808:4: (otherlv_2= RULE_ID )
            {
            // InternalComponent.g:808:4: (otherlv_2= RULE_ID )
            // InternalComponent.g:809:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getGeneralizationAccess().getLeftClassifierClassifierCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getCommaKeyword_3());
            		
            // InternalComponent.g:824:3: ( (otherlv_4= RULE_ID ) )
            // InternalComponent.g:825:4: (otherlv_4= RULE_ID )
            {
            // InternalComponent.g:825:4: (otherlv_4= RULE_ID )
            // InternalComponent.g:826:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_4, grammarAccess.getGeneralizationAccess().getRightClassifierClassifierCrossReference_4_0());
            				

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
    // InternalComponent.g:845:1: entryRuleAbstraction returns [EObject current=null] : iv_ruleAbstraction= ruleAbstraction EOF ;
    public final EObject entryRuleAbstraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstraction = null;


        try {
            // InternalComponent.g:845:52: (iv_ruleAbstraction= ruleAbstraction EOF )
            // InternalComponent.g:846:2: iv_ruleAbstraction= ruleAbstraction EOF
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
    // InternalComponent.g:852:1: ruleAbstraction returns [EObject current=null] : (otherlv_0= 'abs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleAbstraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:858:2: ( (otherlv_0= 'abs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalComponent.g:859:2: (otherlv_0= 'abs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalComponent.g:859:2: (otherlv_0= 'abs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalComponent.g:860:3: otherlv_0= 'abs' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractionAccess().getAbsKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponent.g:868:3: ( (otherlv_2= RULE_ID ) )
            // InternalComponent.g:869:4: (otherlv_2= RULE_ID )
            {
            // InternalComponent.g:869:4: (otherlv_2= RULE_ID )
            // InternalComponent.g:870:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getAbstractionAccess().getLeftClassifierClassifierCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAbstractionAccess().getCommaKeyword_3());
            		
            // InternalComponent.g:885:3: ( (otherlv_4= RULE_ID ) )
            // InternalComponent.g:886:4: (otherlv_4= RULE_ID )
            {
            // InternalComponent.g:886:4: (otherlv_4= RULE_ID )
            // InternalComponent.g:887:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_4, grammarAccess.getAbstractionAccess().getRightClassifierClassifierCrossReference_4_0());
            				

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
    // InternalComponent.g:906:1: entryRuleManifestation returns [EObject current=null] : iv_ruleManifestation= ruleManifestation EOF ;
    public final EObject entryRuleManifestation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManifestation = null;


        try {
            // InternalComponent.g:906:54: (iv_ruleManifestation= ruleManifestation EOF )
            // InternalComponent.g:907:2: iv_ruleManifestation= ruleManifestation EOF
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
    // InternalComponent.g:913:1: ruleManifestation returns [EObject current=null] : (otherlv_0= 'man' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleManifestation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:919:2: ( (otherlv_0= 'man' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalComponent.g:920:2: (otherlv_0= 'man' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalComponent.g:920:2: (otherlv_0= 'man' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalComponent.g:921:3: otherlv_0= 'man' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getManifestationAccess().getManKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getManifestationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponent.g:929:3: ( (otherlv_2= RULE_ID ) )
            // InternalComponent.g:930:4: (otherlv_2= RULE_ID )
            {
            // InternalComponent.g:930:4: (otherlv_2= RULE_ID )
            // InternalComponent.g:931:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManifestationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getManifestationAccess().getLeftClassifierClassifierCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getManifestationAccess().getCommaKeyword_3());
            		
            // InternalComponent.g:946:3: ( (otherlv_4= RULE_ID ) )
            // InternalComponent.g:947:4: (otherlv_4= RULE_ID )
            {
            // InternalComponent.g:947:4: (otherlv_4= RULE_ID )
            // InternalComponent.g:948:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManifestationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_4, grammarAccess.getManifestationAccess().getRightClassifierClassifierCrossReference_4_0());
            				

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
    // InternalComponent.g:967:1: entryRuleSubstitution returns [EObject current=null] : iv_ruleSubstitution= ruleSubstitution EOF ;
    public final EObject entryRuleSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstitution = null;


        try {
            // InternalComponent.g:967:53: (iv_ruleSubstitution= ruleSubstitution EOF )
            // InternalComponent.g:968:2: iv_ruleSubstitution= ruleSubstitution EOF
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
    // InternalComponent.g:974:1: ruleSubstitution returns [EObject current=null] : (otherlv_0= 'sub' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleSubstitution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:980:2: ( (otherlv_0= 'sub' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalComponent.g:981:2: (otherlv_0= 'sub' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalComponent.g:981:2: (otherlv_0= 'sub' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalComponent.g:982:3: otherlv_0= 'sub' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getSubstitutionAccess().getSubKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSubstitutionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponent.g:990:3: ( (otherlv_2= RULE_ID ) )
            // InternalComponent.g:991:4: (otherlv_2= RULE_ID )
            {
            // InternalComponent.g:991:4: (otherlv_2= RULE_ID )
            // InternalComponent.g:992:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstitutionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getSubstitutionAccess().getLeftClassifierClassifierCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSubstitutionAccess().getCommaKeyword_3());
            		
            // InternalComponent.g:1007:3: ( (otherlv_4= RULE_ID ) )
            // InternalComponent.g:1008:4: (otherlv_4= RULE_ID )
            {
            // InternalComponent.g:1008:4: (otherlv_4= RULE_ID )
            // InternalComponent.g:1009:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstitutionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_4, grammarAccess.getSubstitutionAccess().getRightClassifierClassifierCrossReference_4_0());
            				

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
    // InternalComponent.g:1028:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalComponent.g:1028:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalComponent.g:1029:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalComponent.g:1035:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'dep' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponent.g:1041:2: ( (otherlv_0= 'dep' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalComponent.g:1042:2: (otherlv_0= 'dep' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalComponent.g:1042:2: (otherlv_0= 'dep' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalComponent.g:1043:3: otherlv_0= 'dep' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDepKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponent.g:1051:3: ( (otherlv_2= RULE_ID ) )
            // InternalComponent.g:1052:4: (otherlv_2= RULE_ID )
            {
            // InternalComponent.g:1052:4: (otherlv_2= RULE_ID )
            // InternalComponent.g:1053:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getLeftClassifierClassifierCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getCommaKeyword_3());
            		
            // InternalComponent.g:1068:3: ( (otherlv_4= RULE_ID ) )
            // InternalComponent.g:1069:4: (otherlv_4= RULE_ID )
            {
            // InternalComponent.g:1069:4: (otherlv_4= RULE_ID )
            // InternalComponent.g:1070:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_4, grammarAccess.getDependencyAccess().getRightClassifierClassifierCrossReference_4_0());
            				

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
    // InternalComponent.g:1089:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalComponent.g:1089:48: (iv_ruleComment= ruleComment EOF )
            // InternalComponent.g:1090:2: iv_ruleComment= ruleComment EOF
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
    // InternalComponent.g:1096:1: ruleComment returns [EObject current=null] : (otherlv_0= 'note' ( (lv_body_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalComponent.g:1102:2: ( (otherlv_0= 'note' ( (lv_body_1_0= RULE_STRING ) ) ) )
            // InternalComponent.g:1103:2: (otherlv_0= 'note' ( (lv_body_1_0= RULE_STRING ) ) )
            {
            // InternalComponent.g:1103:2: (otherlv_0= 'note' ( (lv_body_1_0= RULE_STRING ) ) )
            // InternalComponent.g:1104:3: otherlv_0= 'note' ( (lv_body_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
            		
            // InternalComponent.g:1108:3: ( (lv_body_1_0= RULE_STRING ) )
            // InternalComponent.g:1109:4: (lv_body_1_0= RULE_STRING )
            {
            // InternalComponent.g:1109:4: (lv_body_1_0= RULE_STRING )
            // InternalComponent.g:1110:5: lv_body_1_0= RULE_STRING
            {
            lv_body_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_body_1_0, grammarAccess.getCommentAccess().getBodySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // InternalComponent.g:1130:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalComponent.g:1130:45: (iv_rulePort= rulePort EOF )
            // InternalComponent.g:1131:2: iv_rulePort= rulePort EOF
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
    // InternalComponent.g:1137:1: rulePort returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'realizes' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1143:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'realizes' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalComponent.g:1144:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'realizes' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalComponent.g:1144:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'realizes' ( (otherlv_4= RULE_ID ) ) )
            // InternalComponent.g:1145:3: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'realizes' ( (otherlv_4= RULE_ID ) )
            {
            // InternalComponent.g:1145:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=38 && LA21_0<=44)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponent.g:1146:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalComponent.g:1146:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalComponent.g:1147:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getPortAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPortRule());
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

            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getPortKeyword_1());
            		
            // InternalComponent.g:1168:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponent.g:1169:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponent.g:1169:4: (lv_name_2_0= RULE_ID )
            // InternalComponent.g:1170:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPortAccess().getRealizesKeyword_3());
            		
            // InternalComponent.g:1190:3: ( (otherlv_4= RULE_ID ) )
            // InternalComponent.g:1191:4: (otherlv_4= RULE_ID )
            {
            // InternalComponent.g:1191:4: (otherlv_4= RULE_ID )
            // InternalComponent.g:1192:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getPortAccess().getRealizedClassifierClassifierCrossReference_4_0());
            				

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
    // InternalComponent.g:1207:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalComponent.g:1207:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalComponent.g:1208:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalComponent.g:1214:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_comments_5_0 = null;

        EObject lv_comments_7_0 = null;

        EObject lv_members_8_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1220:2: ( (otherlv_0= 'interface' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) ) ) )
            // InternalComponent.g:1221:2: (otherlv_0= 'interface' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) ) )
            {
            // InternalComponent.g:1221:2: (otherlv_0= 'interface' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) ) )
            // InternalComponent.g:1222:3: otherlv_0= 'interface' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalComponent.g:1226:3: ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
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
                    // InternalComponent.g:1227:4: ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
                    {
                    // InternalComponent.g:1227:4: ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
                    // InternalComponent.g:1228:5: ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1228:5: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalComponent.g:1229:6: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalComponent.g:1229:6: (lv_name_1_0= RULE_STRING )
                    // InternalComponent.g:1230:7: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    							newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameSTRINGTerminalRuleCall_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInterfaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_1_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getAsKeyword_1_0_1());
                    				
                    // InternalComponent.g:1250:5: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalComponent.g:1251:6: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalComponent.g:1251:6: (lv_alias_3_0= RULE_ID )
                    // InternalComponent.g:1252:7: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    							newLeafNode(lv_alias_3_0, grammarAccess.getInterfaceAccess().getAliasIDTerminalRuleCall_1_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInterfaceRule());
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
                    // InternalComponent.g:1270:4: ( (lv_name_4_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1270:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalComponent.g:1271:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalComponent.g:1271:5: (lv_name_4_0= RULE_ID )
                    // InternalComponent.g:1272:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterfaceRule());
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

            // InternalComponent.g:1289:3: ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EOF||LA26_0==12||LA26_0==14||(LA26_0>=17 && LA26_0<=19)||(LA26_0>=23 && LA26_0<=27)||LA26_0==30) ) {
                alt26=1;
            }
            else if ( (LA26_0==16) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponent.g:1290:4: ( (lv_comments_5_0= ruleComment ) )?
                    {
                    // InternalComponent.g:1290:4: ( (lv_comments_5_0= ruleComment ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==27) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalComponent.g:1291:5: (lv_comments_5_0= ruleComment )
                            {
                            // InternalComponent.g:1291:5: (lv_comments_5_0= ruleComment )
                            // InternalComponent.g:1292:6: lv_comments_5_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_5_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_5_0,
                            							"de.cooperateproject.modeling.textual.component.Component.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:1310:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )
                    {
                    // InternalComponent.g:1310:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )
                    // InternalComponent.g:1311:5: otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_25); 

                    					newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalComponent.g:1315:5: ( (lv_comments_7_0= ruleComment ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==27) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalComponent.g:1316:6: (lv_comments_7_0= ruleComment )
                            {
                            // InternalComponent.g:1316:6: (lv_comments_7_0= ruleComment )
                            // InternalComponent.g:1317:7: lv_comments_7_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_26);
                            lv_comments_7_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInterfaceRule());
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

                    // InternalComponent.g:1334:5: ( (lv_members_8_0= ruleMember ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID||(LA25_0>=35 && LA25_0<=36)||(LA25_0>=38 && LA25_0<=44)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalComponent.g:1335:6: (lv_members_8_0= ruleMember )
                    	    {
                    	    // InternalComponent.g:1335:6: (lv_members_8_0= ruleMember )
                    	    // InternalComponent.g:1336:7: lv_members_8_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_2_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_members_8_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_8_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_2_1_3());
                    				

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
    // InternalComponent.g:1363:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalComponent.g:1363:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalComponent.g:1364:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalComponent.g:1370:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'con' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) otherlv_5= '(' ( (lv_connectorEnds_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_connectorEnds_6_0 = null;

        EObject lv_connectorEnds_8_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1376:2: ( (otherlv_0= 'con' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) otherlv_5= '(' ( (lv_connectorEnds_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) )
            // InternalComponent.g:1377:2: (otherlv_0= 'con' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) otherlv_5= '(' ( (lv_connectorEnds_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' )
            {
            // InternalComponent.g:1377:2: (otherlv_0= 'con' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) otherlv_5= '(' ( (lv_connectorEnds_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' )
            // InternalComponent.g:1378:3: otherlv_0= 'con' ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) ) otherlv_5= '(' ( (lv_connectorEnds_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConKeyword_0());
            		
            // InternalComponent.g:1382:3: ( ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) ) | ( (lv_name_4_0= RULE_ID ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponent.g:1383:4: ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
                    {
                    // InternalComponent.g:1383:4: ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )
                    // InternalComponent.g:1384:5: ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1384:5: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalComponent.g:1385:6: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalComponent.g:1385:6: (lv_name_1_0= RULE_STRING )
                    // InternalComponent.g:1386:7: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    							newLeafNode(lv_name_1_0, grammarAccess.getConnectorAccess().getNameSTRINGTerminalRuleCall_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConnectorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_1_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getAsKeyword_1_0_1());
                    				
                    // InternalComponent.g:1406:5: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalComponent.g:1407:6: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalComponent.g:1407:6: (lv_alias_3_0= RULE_ID )
                    // InternalComponent.g:1408:7: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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
                    // InternalComponent.g:1426:4: ( (lv_name_4_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1426:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalComponent.g:1427:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalComponent.g:1427:5: (lv_name_4_0= RULE_ID )
                    // InternalComponent.g:1428:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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
            		
            // InternalComponent.g:1449:3: ( (lv_connectorEnds_6_0= ruleConnectorEnd ) )
            // InternalComponent.g:1450:4: (lv_connectorEnds_6_0= ruleConnectorEnd )
            {
            // InternalComponent.g:1450:4: (lv_connectorEnds_6_0= ruleConnectorEnd )
            // InternalComponent.g:1451:5: lv_connectorEnds_6_0= ruleConnectorEnd
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getConnectorEndsConnectorEndParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_connectorEnds_6_0=ruleConnectorEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					add(
            						current,
            						"connectorEnds",
            						lv_connectorEnds_6_0,
            						"de.cooperateproject.modeling.textual.component.Component.ConnectorEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponent.g:1468:3: (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalComponent.g:1469:4: otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) )
            	    {
            	    otherlv_7=(Token)match(input,21,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getConnectorAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalComponent.g:1473:4: ( (lv_connectorEnds_8_0= ruleConnectorEnd ) )
            	    // InternalComponent.g:1474:5: (lv_connectorEnds_8_0= ruleConnectorEnd )
            	    {
            	    // InternalComponent.g:1474:5: (lv_connectorEnds_8_0= ruleConnectorEnd )
            	    // InternalComponent.g:1475:6: lv_connectorEnds_8_0= ruleConnectorEnd
            	    {

            	    						newCompositeNode(grammarAccess.getConnectorAccess().getConnectorEndsConnectorEndParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_connectorEnds_8_0=ruleConnectorEnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConnectorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connectorEnds",
            	    							lv_connectorEnds_8_0,
            	    							"de.cooperateproject.modeling.textual.component.Component.ConnectorEnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConnectorAccess().getRightParenthesisKeyword_5());
            		

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


    // $ANTLR start "entryRuleConnectorEnd"
    // InternalComponent.g:1501:1: entryRuleConnectorEnd returns [EObject current=null] : iv_ruleConnectorEnd= ruleConnectorEnd EOF ;
    public final EObject entryRuleConnectorEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorEnd = null;


        try {
            // InternalComponent.g:1501:53: (iv_ruleConnectorEnd= ruleConnectorEnd EOF )
            // InternalComponent.g:1502:2: iv_ruleConnectorEnd= ruleConnectorEnd EOF
            {
             newCompositeNode(grammarAccess.getConnectorEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorEnd=ruleConnectorEnd();

            state._fsp--;

             current =iv_ruleConnectorEnd; 
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
    // $ANTLR end "entryRuleConnectorEnd"


    // $ANTLR start "ruleConnectorEnd"
    // InternalComponent.g:1508:1: ruleConnectorEnd returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleConnectorEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponent.g:1514:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalComponent.g:1515:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalComponent.g:1515:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalComponent.g:1516:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalComponent.g:1516:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==32) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalComponent.g:1517:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // InternalComponent.g:1517:4: ( (otherlv_0= RULE_ID ) )
                    // InternalComponent.g:1518:5: (otherlv_0= RULE_ID )
                    {
                    // InternalComponent.g:1518:5: (otherlv_0= RULE_ID )
                    // InternalComponent.g:1519:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorEndRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_0, grammarAccess.getConnectorEndAccess().getPartAttributeCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,32,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getConnectorEndAccess().getFullStopKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalComponent.g:1535:3: ( (otherlv_2= RULE_ID ) )
            // InternalComponent.g:1536:4: (otherlv_2= RULE_ID )
            {
            // InternalComponent.g:1536:4: (otherlv_2= RULE_ID )
            // InternalComponent.g:1537:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorEndRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getConnectorEndAccess().getRolePortCrossReference_1_0());
            				

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
    // $ANTLR end "ruleConnectorEnd"


    // $ANTLR start "entryRuleProvide"
    // InternalComponent.g:1552:1: entryRuleProvide returns [EObject current=null] : iv_ruleProvide= ruleProvide EOF ;
    public final EObject entryRuleProvide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvide = null;


        try {
            // InternalComponent.g:1552:48: (iv_ruleProvide= ruleProvide EOF )
            // InternalComponent.g:1553:2: iv_ruleProvide= ruleProvide EOF
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
    // InternalComponent.g:1559:1: ruleProvide returns [EObject current=null] : ( () otherlv_1= 'provide' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( ruleFQN ) ) ) ;
    public final EObject ruleProvide() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalComponent.g:1565:2: ( ( () otherlv_1= 'provide' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1566:2: ( () otherlv_1= 'provide' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1566:2: ( () otherlv_1= 'provide' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( ruleFQN ) ) )
            // InternalComponent.g:1567:3: () otherlv_1= 'provide' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( ruleFQN ) )
            {
            // InternalComponent.g:1567:3: ()
            // InternalComponent.g:1568:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvideAccess().getProvideAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getProvideAccess().getProvideKeyword_1());
            		
            // InternalComponent.g:1578:3: ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponent.g:1579:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    {
                    // InternalComponent.g:1579:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    // InternalComponent.g:1580:5: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1580:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalComponent.g:1581:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalComponent.g:1581:6: (lv_name_2_0= RULE_STRING )
                    // InternalComponent.g:1582:7: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    							newLeafNode(lv_name_2_0, grammarAccess.getProvideAccess().getNameSTRINGTerminalRuleCall_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getProvideRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getProvideAccess().getAsKeyword_2_0_1());
                    				
                    // InternalComponent.g:1602:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalComponent.g:1603:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalComponent.g:1603:6: (lv_alias_4_0= RULE_ID )
                    // InternalComponent.g:1604:7: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    							newLeafNode(lv_alias_4_0, grammarAccess.getProvideAccess().getAliasIDTerminalRuleCall_2_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getProvideRule());
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
                    // InternalComponent.g:1622:4: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1622:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalComponent.g:1623:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalComponent.g:1623:5: (lv_name_5_0= RULE_ID )
                    // InternalComponent.g:1624:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getProvideAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProvideRule());
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

            // InternalComponent.g:1641:3: ( ( ruleFQN ) )
            // InternalComponent.g:1642:4: ( ruleFQN )
            {
            // InternalComponent.g:1642:4: ( ruleFQN )
            // InternalComponent.g:1643:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvideRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvideAccess().getInterfaceInterfaceCrossReference_3_0());
            				
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
    // InternalComponent.g:1661:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalComponent.g:1661:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalComponent.g:1662:2: iv_ruleRequire= ruleRequire EOF
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
    // InternalComponent.g:1668:1: ruleRequire returns [EObject current=null] : ( () otherlv_1= 'require' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( ruleFQN ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalComponent.g:1674:2: ( ( () otherlv_1= 'require' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1675:2: ( () otherlv_1= 'require' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1675:2: ( () otherlv_1= 'require' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( ruleFQN ) ) )
            // InternalComponent.g:1676:3: () otherlv_1= 'require' ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ( ( ruleFQN ) )
            {
            // InternalComponent.g:1676:3: ()
            // InternalComponent.g:1677:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequireAccess().getRequireAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRequireAccess().getRequireKeyword_1());
            		
            // InternalComponent.g:1687:3: ( ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalComponent.g:1688:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    {
                    // InternalComponent.g:1688:4: ( ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )
                    // InternalComponent.g:1689:5: ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1689:5: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalComponent.g:1690:6: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalComponent.g:1690:6: (lv_name_2_0= RULE_STRING )
                    // InternalComponent.g:1691:7: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    							newLeafNode(lv_name_2_0, grammarAccess.getRequireAccess().getNameSTRINGTerminalRuleCall_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRequireRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getRequireAccess().getAsKeyword_2_0_1());
                    				
                    // InternalComponent.g:1711:5: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalComponent.g:1712:6: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalComponent.g:1712:6: (lv_alias_4_0= RULE_ID )
                    // InternalComponent.g:1713:7: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    							newLeafNode(lv_alias_4_0, grammarAccess.getRequireAccess().getAliasIDTerminalRuleCall_2_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRequireRule());
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
                    // InternalComponent.g:1731:4: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1731:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalComponent.g:1732:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalComponent.g:1732:5: (lv_name_5_0= RULE_ID )
                    // InternalComponent.g:1733:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getRequireAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequireRule());
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

            // InternalComponent.g:1750:3: ( ( ruleFQN ) )
            // InternalComponent.g:1751:4: ( ruleFQN )
            {
            // InternalComponent.g:1751:4: ( ruleFQN )
            // InternalComponent.g:1752:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequireRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequireAccess().getInterfaceInterfaceCrossReference_3_0());
            				
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
    // InternalComponent.g:1770:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalComponent.g:1770:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalComponent.g:1771:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalComponent.g:1777:1: ruleMethod returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? ) ;
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
            // InternalComponent.g:1783:2: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? ) )
            // InternalComponent.g:1784:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? )
            {
            // InternalComponent.g:1784:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? )
            // InternalComponent.g:1785:3: () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )?
            {
            // InternalComponent.g:1785:3: ()
            // InternalComponent.g:1786:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            // InternalComponent.g:1792:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=38 && LA32_0<=44)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponent.g:1793:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalComponent.g:1793:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalComponent.g:1794:5: lv_visibility_1_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_29);
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

            // InternalComponent.g:1811:3: ( (lv_abstract_2_0= 'abstract' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalComponent.g:1812:4: (lv_abstract_2_0= 'abstract' )
                    {
                    // InternalComponent.g:1812:4: (lv_abstract_2_0= 'abstract' )
                    // InternalComponent.g:1813:5: lv_abstract_2_0= 'abstract'
                    {
                    lv_abstract_2_0=(Token)match(input,35,FOLLOW_30); 

                    					newLeafNode(lv_abstract_2_0, grammarAccess.getMethodAccess().getAbstractAbstractKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1825:3: ( (lv_static_3_0= 'static' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalComponent.g:1826:4: (lv_static_3_0= 'static' )
                    {
                    // InternalComponent.g:1826:4: (lv_static_3_0= 'static' )
                    // InternalComponent.g:1827:5: lv_static_3_0= 'static'
                    {
                    lv_static_3_0=(Token)match(input,36,FOLLOW_6); 

                    					newLeafNode(lv_static_3_0, grammarAccess.getMethodAccess().getStaticStaticKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1839:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalComponent.g:1840:4: (lv_name_4_0= RULE_ID )
            {
            // InternalComponent.g:1840:4: (lv_name_4_0= RULE_ID )
            // InternalComponent.g:1841:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
            		
            // InternalComponent.g:1861:3: ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==36||(LA36_0>=38 && LA36_0<=44)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalComponent.g:1862:4: ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    {
            	    // InternalComponent.g:1862:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalComponent.g:1863:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalComponent.g:1863:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalComponent.g:1864:6: lv_parameters_6_0= ruleParameter
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
            	    							"de.cooperateproject.modeling.textual.component.Component.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalComponent.g:1881:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==21) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // InternalComponent.g:1882:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,21,FOLLOW_33); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_6_1_0());
            	    	    				
            	    	    // InternalComponent.g:1886:5: ( (lv_parameters_8_0= ruleParameter ) )
            	    	    // InternalComponent.g:1887:6: (lv_parameters_8_0= ruleParameter )
            	    	    {
            	    	    // InternalComponent.g:1887:6: (lv_parameters_8_0= ruleParameter )
            	    	    // InternalComponent.g:1888:7: lv_parameters_8_0= ruleParameter
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
            	    	    								"de.cooperateproject.modeling.textual.component.Component.Parameter");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop35;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_34); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_7());
            		
            // InternalComponent.g:1911:3: (otherlv_10= ':' ( ( ruleFQN ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalComponent.g:1912:4: otherlv_10= ':' ( ( ruleFQN ) )
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getColonKeyword_8_0());
                    			
                    // InternalComponent.g:1916:4: ( ( ruleFQN ) )
                    // InternalComponent.g:1917:5: ( ruleFQN )
                    {
                    // InternalComponent.g:1917:5: ( ruleFQN )
                    // InternalComponent.g:1918:6: ruleFQN
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
    // InternalComponent.g:1937:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalComponent.g:1937:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalComponent.g:1938:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalComponent.g:1944:1: ruleAttribute returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1950:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1951:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1951:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            // InternalComponent.g:1952:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) )
            {
            // InternalComponent.g:1952:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=38 && LA38_0<=44)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalComponent.g:1953:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalComponent.g:1953:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalComponent.g:1954:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
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

            // InternalComponent.g:1971:3: ( (lv_static_1_0= 'static' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalComponent.g:1972:4: (lv_static_1_0= 'static' )
                    {
                    // InternalComponent.g:1972:4: (lv_static_1_0= 'static' )
                    // InternalComponent.g:1973:5: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,36,FOLLOW_6); 

                    					newLeafNode(lv_static_1_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1985:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponent.g:1986:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponent.g:1986:4: (lv_name_2_0= RULE_ID )
            // InternalComponent.g:1987:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalComponent.g:2007:3: ( ( ruleFQN ) )
            // InternalComponent.g:2008:4: ( ruleFQN )
            {
            // InternalComponent.g:2008:4: ( ruleFQN )
            // InternalComponent.g:2009:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeClassifierCrossReference_4_0());
            				
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


    // $ANTLR start "entryRuleComponentTypeAttribute"
    // InternalComponent.g:2027:1: entryRuleComponentTypeAttribute returns [EObject current=null] : iv_ruleComponentTypeAttribute= ruleComponentTypeAttribute EOF ;
    public final EObject entryRuleComponentTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTypeAttribute = null;


        try {
            // InternalComponent.g:2027:63: (iv_ruleComponentTypeAttribute= ruleComponentTypeAttribute EOF )
            // InternalComponent.g:2028:2: iv_ruleComponentTypeAttribute= ruleComponentTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getComponentTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentTypeAttribute=ruleComponentTypeAttribute();

            state._fsp--;

             current =iv_ruleComponentTypeAttribute; 
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
    // $ANTLR end "entryRuleComponentTypeAttribute"


    // $ANTLR start "ruleComponentTypeAttribute"
    // InternalComponent.g:2034:1: ruleComponentTypeAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleComponentTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalComponent.g:2040:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalComponent.g:2041:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:2041:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalComponent.g:2042:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // InternalComponent.g:2042:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalComponent.g:2043:4: (lv_name_0_0= RULE_ID )
            {
            // InternalComponent.g:2043:4: (lv_name_0_0= RULE_ID )
            // InternalComponent.g:2044:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComponentTypeAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentTypeAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTypeAttributeAccess().getColonKeyword_1());
            		
            // InternalComponent.g:2064:3: ( ( ruleFQN ) )
            // InternalComponent.g:2065:4: ( ruleFQN )
            {
            // InternalComponent.g:2065:4: ( ruleFQN )
            // InternalComponent.g:2066:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentTypeAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentTypeAttributeAccess().getTypeComponentCrossReference_2_0());
            				
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
    // $ANTLR end "ruleComponentTypeAttribute"


    // $ANTLR start "entryRuleParameter"
    // InternalComponent.g:2084:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalComponent.g:2084:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalComponent.g:2085:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalComponent.g:2091:1: ruleParameter returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:2097:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) )
            // InternalComponent.g:2098:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:2098:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            // InternalComponent.g:2099:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) )
            {
            // InternalComponent.g:2099:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=38 && LA40_0<=44)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalComponent.g:2100:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalComponent.g:2100:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalComponent.g:2101:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_30);
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

            // InternalComponent.g:2118:3: ( (lv_static_1_0= 'static' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalComponent.g:2119:4: (lv_static_1_0= 'static' )
                    {
                    // InternalComponent.g:2119:4: (lv_static_1_0= 'static' )
                    // InternalComponent.g:2120:5: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,36,FOLLOW_6); 

                    					newLeafNode(lv_static_1_0, grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:2132:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponent.g:2133:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponent.g:2133:4: (lv_name_2_0= RULE_ID )
            // InternalComponent.g:2134:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_35); 

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

            otherlv_3=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
            		
            // InternalComponent.g:2154:3: ( ( ruleFQN ) )
            // InternalComponent.g:2155:4: ( ruleFQN )
            {
            // InternalComponent.g:2155:4: ( ruleFQN )
            // InternalComponent.g:2156:5: ruleFQN
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
    // InternalComponent.g:2174:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalComponent.g:2174:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalComponent.g:2175:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalComponent.g:2181:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponent.g:2187:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponent.g:2188:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponent.g:2188:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponent.g:2189:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponent.g:2196:3: (kw= '.' this_ID_2= RULE_ID )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==32) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalComponent.g:2197:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_36); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalComponent.g:2214:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) ;
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
            // InternalComponent.g:2220:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) )
            // InternalComponent.g:2221:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            {
            // InternalComponent.g:2221:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            int alt43=7;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt43=1;
                }
                break;
            case 39:
                {
                alt43=2;
                }
                break;
            case 40:
                {
                alt43=3;
                }
                break;
            case 41:
                {
                alt43=4;
                }
                break;
            case 42:
                {
                alt43=5;
                }
                break;
            case 43:
                {
                alt43=6;
                }
                break;
            case 44:
                {
                alt43=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalComponent.g:2222:3: (enumLiteral_0= '+' )
                    {
                    // InternalComponent.g:2222:3: (enumLiteral_0= '+' )
                    // InternalComponent.g:2223:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:2230:3: (enumLiteral_1= 'public' )
                    {
                    // InternalComponent.g:2230:3: (enumLiteral_1= 'public' )
                    // InternalComponent.g:2231:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalComponent.g:2238:3: (enumLiteral_2= '-' )
                    {
                    // InternalComponent.g:2238:3: (enumLiteral_2= '-' )
                    // InternalComponent.g:2239:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalComponent.g:2246:3: (enumLiteral_3= 'private' )
                    {
                    // InternalComponent.g:2246:3: (enumLiteral_3= 'private' )
                    // InternalComponent.g:2247:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalComponent.g:2254:3: (enumLiteral_4= '#' )
                    {
                    // InternalComponent.g:2254:3: (enumLiteral_4= '#' )
                    // InternalComponent.g:2255:4: enumLiteral_4= '#'
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalComponent.g:2262:3: (enumLiteral_5= 'protected' )
                    {
                    // InternalComponent.g:2262:3: (enumLiteral_5= 'protected' )
                    // InternalComponent.g:2263:4: enumLiteral_5= 'protected'
                    {
                    enumLiteral_5=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalComponent.g:2270:3: (enumLiteral_6= '~' )
                    {
                    // InternalComponent.g:2270:3: (enumLiteral_6= '~' )
                    // InternalComponent.g:2271:4: enumLiteral_6= '~'
                    {
                    enumLiteral_6=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6());
                    			

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
    static final String dfa_3s = "\1\54\7\44\1\uffff\1\5\1\45\1\uffff";
    static final String dfa_4s = "\10\uffff\1\1\2\uffff\1\2";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\12\35\uffff\1\10\1\11\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\12\35\uffff\1\10\1\11",
            "\1\12\35\uffff\1\10\1\11",
            "\1\12\35\uffff\1\10\1\11",
            "\1\12\35\uffff\1\10\1\11",
            "\1\12\35\uffff\1\10\1\11",
            "\1\12\35\uffff\1\10\1\11",
            "\1\12\35\uffff\1\10\1\11",
            "",
            "\1\12",
            "\1\10\20\uffff\1\13",
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
            return "294:2: (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000478C4002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000007880002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00001FC6D8064020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00001FC6D0064020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001FC0D0064020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000C0064020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0064000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040064000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000608020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000600020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00001FD808020020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00001FD800020020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00001FD000400020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00001FD000600020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00001FD000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000002L});

}