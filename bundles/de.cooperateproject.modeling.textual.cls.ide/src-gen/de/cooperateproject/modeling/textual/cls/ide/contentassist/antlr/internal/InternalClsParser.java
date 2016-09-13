package de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'string'", "'int'", "'double'", "'boolean'", "'char'", "'byte'", "'short'", "'long'", "'float'", "'asc'", "'agg'", "'com'", "'@startclass'", "'@endclass'", "'import'", "'.'", "'class'", "'as'", "'{'", "'}'", "'interface'", "':'", "'('", "')'", "','", "'isa'", "'impl'", "'note'", "';'", "'['", "']'", "'|'", "'..'", "'abstract'", "'static'", "'final'", "'bi'", "'<'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
     	
        public void setGrammarAccess(ClsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleClassDiagram"
    // InternalCls.g:60:1: entryRuleClassDiagram : ruleClassDiagram EOF ;
    public final void entryRuleClassDiagram() throws RecognitionException {
        try {
            // InternalCls.g:61:1: ( ruleClassDiagram EOF )
            // InternalCls.g:62:1: ruleClassDiagram EOF
            {
             before(grammarAccess.getClassDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDiagram();

            state._fsp--;

             after(grammarAccess.getClassDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassDiagram"


    // $ANTLR start "ruleClassDiagram"
    // InternalCls.g:69:1: ruleClassDiagram : ( ( rule__ClassDiagram__Group__0 ) ) ;
    public final void ruleClassDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:73:2: ( ( ( rule__ClassDiagram__Group__0 ) ) )
            // InternalCls.g:74:1: ( ( rule__ClassDiagram__Group__0 ) )
            {
            // InternalCls.g:74:1: ( ( rule__ClassDiagram__Group__0 ) )
            // InternalCls.g:75:1: ( rule__ClassDiagram__Group__0 )
            {
             before(grammarAccess.getClassDiagramAccess().getGroup()); 
            // InternalCls.g:76:1: ( rule__ClassDiagram__Group__0 )
            // InternalCls.g:76:2: rule__ClassDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDiagram"


    // $ANTLR start "entryRulePackageImport"
    // InternalCls.g:88:1: entryRulePackageImport : rulePackageImport EOF ;
    public final void entryRulePackageImport() throws RecognitionException {
        try {
            // InternalCls.g:89:1: ( rulePackageImport EOF )
            // InternalCls.g:90:1: rulePackageImport EOF
            {
             before(grammarAccess.getPackageImportRule()); 
            pushFollow(FOLLOW_1);
            rulePackageImport();

            state._fsp--;

             after(grammarAccess.getPackageImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageImport"


    // $ANTLR start "rulePackageImport"
    // InternalCls.g:97:1: rulePackageImport : ( ( rule__PackageImport__Group__0 ) ) ;
    public final void rulePackageImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:101:2: ( ( ( rule__PackageImport__Group__0 ) ) )
            // InternalCls.g:102:1: ( ( rule__PackageImport__Group__0 ) )
            {
            // InternalCls.g:102:1: ( ( rule__PackageImport__Group__0 ) )
            // InternalCls.g:103:1: ( rule__PackageImport__Group__0 )
            {
             before(grammarAccess.getPackageImportAccess().getGroup()); 
            // InternalCls.g:104:1: ( rule__PackageImport__Group__0 )
            // InternalCls.g:104:2: rule__PackageImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageImport"


    // $ANTLR start "entryRuleFQN"
    // InternalCls.g:116:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalCls.g:117:1: ( ruleFQN EOF )
            // InternalCls.g:118:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalCls.g:125:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:129:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalCls.g:130:1: ( ( rule__FQN__Group__0 ) )
            {
            // InternalCls.g:130:1: ( ( rule__FQN__Group__0 ) )
            // InternalCls.g:131:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalCls.g:132:1: ( rule__FQN__Group__0 )
            // InternalCls.g:132:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleClassifier"
    // InternalCls.g:144:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // InternalCls.g:145:1: ( ruleClassifier EOF )
            // InternalCls.g:146:1: ruleClassifier EOF
            {
             before(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_1);
            ruleClassifier();

            state._fsp--;

             after(grammarAccess.getClassifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // InternalCls.g:153:1: ruleClassifier : ( ( rule__Classifier__Alternatives ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:157:2: ( ( ( rule__Classifier__Alternatives ) ) )
            // InternalCls.g:158:1: ( ( rule__Classifier__Alternatives ) )
            {
            // InternalCls.g:158:1: ( ( rule__Classifier__Alternatives ) )
            // InternalCls.g:159:1: ( rule__Classifier__Alternatives )
            {
             before(grammarAccess.getClassifierAccess().getAlternatives()); 
            // InternalCls.g:160:1: ( rule__Classifier__Alternatives )
            // InternalCls.g:160:2: rule__Classifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Classifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleClass"
    // InternalCls.g:172:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalCls.g:173:1: ( ruleClass EOF )
            // InternalCls.g:174:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalCls.g:181:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:185:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalCls.g:186:1: ( ( rule__Class__Group__0 ) )
            {
            // InternalCls.g:186:1: ( ( rule__Class__Group__0 ) )
            // InternalCls.g:187:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalCls.g:188:1: ( rule__Class__Group__0 )
            // InternalCls.g:188:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleInterface"
    // InternalCls.g:200:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalCls.g:201:1: ( ruleInterface EOF )
            // InternalCls.g:202:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalCls.g:209:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:213:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalCls.g:214:1: ( ( rule__Interface__Group__0 ) )
            {
            // InternalCls.g:214:1: ( ( rule__Interface__Group__0 ) )
            // InternalCls.g:215:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalCls.g:216:1: ( rule__Interface__Group__0 )
            // InternalCls.g:216:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleTypeReference"
    // InternalCls.g:228:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalCls.g:229:1: ( ruleTypeReference EOF )
            // InternalCls.g:230:1: ruleTypeReference EOF
            {
             before(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalCls.g:237:1: ruleTypeReference : ( ( rule__TypeReference__Alternatives ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:241:2: ( ( ( rule__TypeReference__Alternatives ) ) )
            // InternalCls.g:242:1: ( ( rule__TypeReference__Alternatives ) )
            {
            // InternalCls.g:242:1: ( ( rule__TypeReference__Alternatives ) )
            // InternalCls.g:243:1: ( rule__TypeReference__Alternatives )
            {
             before(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            // InternalCls.g:244:1: ( rule__TypeReference__Alternatives )
            // InternalCls.g:244:2: rule__TypeReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleDataTypeReference"
    // InternalCls.g:256:1: entryRuleDataTypeReference : ruleDataTypeReference EOF ;
    public final void entryRuleDataTypeReference() throws RecognitionException {
        try {
            // InternalCls.g:257:1: ( ruleDataTypeReference EOF )
            // InternalCls.g:258:1: ruleDataTypeReference EOF
            {
             before(grammarAccess.getDataTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleDataTypeReference();

            state._fsp--;

             after(grammarAccess.getDataTypeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataTypeReference"


    // $ANTLR start "ruleDataTypeReference"
    // InternalCls.g:265:1: ruleDataTypeReference : ( ( rule__DataTypeReference__TypeAssignment ) ) ;
    public final void ruleDataTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:269:2: ( ( ( rule__DataTypeReference__TypeAssignment ) ) )
            // InternalCls.g:270:1: ( ( rule__DataTypeReference__TypeAssignment ) )
            {
            // InternalCls.g:270:1: ( ( rule__DataTypeReference__TypeAssignment ) )
            // InternalCls.g:271:1: ( rule__DataTypeReference__TypeAssignment )
            {
             before(grammarAccess.getDataTypeReferenceAccess().getTypeAssignment()); 
            // InternalCls.g:272:1: ( rule__DataTypeReference__TypeAssignment )
            // InternalCls.g:272:2: rule__DataTypeReference__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeReference__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeReferenceAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeReference"


    // $ANTLR start "entryRuleUMLTypeReference"
    // InternalCls.g:284:1: entryRuleUMLTypeReference : ruleUMLTypeReference EOF ;
    public final void entryRuleUMLTypeReference() throws RecognitionException {
        try {
            // InternalCls.g:285:1: ( ruleUMLTypeReference EOF )
            // InternalCls.g:286:1: ruleUMLTypeReference EOF
            {
             before(grammarAccess.getUMLTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleUMLTypeReference();

            state._fsp--;

             after(grammarAccess.getUMLTypeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUMLTypeReference"


    // $ANTLR start "ruleUMLTypeReference"
    // InternalCls.g:293:1: ruleUMLTypeReference : ( ( rule__UMLTypeReference__TypeAssignment ) ) ;
    public final void ruleUMLTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:297:2: ( ( ( rule__UMLTypeReference__TypeAssignment ) ) )
            // InternalCls.g:298:1: ( ( rule__UMLTypeReference__TypeAssignment ) )
            {
            // InternalCls.g:298:1: ( ( rule__UMLTypeReference__TypeAssignment ) )
            // InternalCls.g:299:1: ( rule__UMLTypeReference__TypeAssignment )
            {
             before(grammarAccess.getUMLTypeReferenceAccess().getTypeAssignment()); 
            // InternalCls.g:300:1: ( rule__UMLTypeReference__TypeAssignment )
            // InternalCls.g:300:2: rule__UMLTypeReference__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__UMLTypeReference__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUMLTypeReferenceAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUMLTypeReference"


    // $ANTLR start "entryRuleMember"
    // InternalCls.g:312:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalCls.g:313:1: ( ruleMember EOF )
            // InternalCls.g:314:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalCls.g:321:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:325:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalCls.g:326:1: ( ( rule__Member__Alternatives ) )
            {
            // InternalCls.g:326:1: ( ( rule__Member__Alternatives ) )
            // InternalCls.g:327:1: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // InternalCls.g:328:1: ( rule__Member__Alternatives )
            // InternalCls.g:328:2: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleAttribute"
    // InternalCls.g:340:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalCls.g:341:1: ( ruleAttribute EOF )
            // InternalCls.g:342:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalCls.g:349:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:353:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalCls.g:354:1: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalCls.g:354:1: ( ( rule__Attribute__Group__0 ) )
            // InternalCls.g:355:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalCls.g:356:1: ( rule__Attribute__Group__0 )
            // InternalCls.g:356:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalCls.g:368:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalCls.g:369:1: ( ruleMethod EOF )
            // InternalCls.g:370:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalCls.g:377:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:381:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalCls.g:382:1: ( ( rule__Method__Group__0 ) )
            {
            // InternalCls.g:382:1: ( ( rule__Method__Group__0 ) )
            // InternalCls.g:383:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalCls.g:384:1: ( rule__Method__Group__0 )
            // InternalCls.g:384:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalCls.g:396:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalCls.g:397:1: ( ruleParameter EOF )
            // InternalCls.g:398:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCls.g:405:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:409:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalCls.g:410:1: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalCls.g:410:1: ( ( rule__Parameter__Group__0 ) )
            // InternalCls.g:411:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalCls.g:412:1: ( rule__Parameter__Group__0 )
            // InternalCls.g:412:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleConnector"
    // InternalCls.g:424:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalCls.g:425:1: ( ruleConnector EOF )
            // InternalCls.g:426:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalCls.g:433:1: ruleConnector : ( ( rule__Connector__Alternatives ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:437:2: ( ( ( rule__Connector__Alternatives ) ) )
            // InternalCls.g:438:1: ( ( rule__Connector__Alternatives ) )
            {
            // InternalCls.g:438:1: ( ( rule__Connector__Alternatives ) )
            // InternalCls.g:439:1: ( rule__Connector__Alternatives )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives()); 
            // InternalCls.g:440:1: ( rule__Connector__Alternatives )
            // InternalCls.g:440:2: rule__Connector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleClassifierAssociationEnd"
    // InternalCls.g:452:1: entryRuleClassifierAssociationEnd : ruleClassifierAssociationEnd EOF ;
    public final void entryRuleClassifierAssociationEnd() throws RecognitionException {
        try {
            // InternalCls.g:453:1: ( ruleClassifierAssociationEnd EOF )
            // InternalCls.g:454:1: ruleClassifierAssociationEnd EOF
            {
             before(grammarAccess.getClassifierAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getClassifierAssociationEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassifierAssociationEnd"


    // $ANTLR start "ruleClassifierAssociationEnd"
    // InternalCls.g:461:1: ruleClassifierAssociationEnd : ( ruleUMLTypeReference ) ;
    public final void ruleClassifierAssociationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:465:2: ( ( ruleUMLTypeReference ) )
            // InternalCls.g:466:1: ( ruleUMLTypeReference )
            {
            // InternalCls.g:466:1: ( ruleUMLTypeReference )
            // InternalCls.g:467:1: ruleUMLTypeReference
            {
             before(grammarAccess.getClassifierAssociationEndAccess().getUMLTypeReferenceParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleUMLTypeReference();

            state._fsp--;

             after(grammarAccess.getClassifierAssociationEndAccess().getUMLTypeReferenceParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassifierAssociationEnd"


    // $ANTLR start "entryRuleGeneralization"
    // InternalCls.g:480:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalCls.g:481:1: ( ruleGeneralization EOF )
            // InternalCls.g:482:1: ruleGeneralization EOF
            {
             before(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getGeneralizationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalCls.g:489:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:493:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalCls.g:494:1: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalCls.g:494:1: ( ( rule__Generalization__Group__0 ) )
            // InternalCls.g:495:1: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalCls.g:496:1: ( rule__Generalization__Group__0 )
            // InternalCls.g:496:2: rule__Generalization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleImplementation"
    // InternalCls.g:508:1: entryRuleImplementation : ruleImplementation EOF ;
    public final void entryRuleImplementation() throws RecognitionException {
        try {
            // InternalCls.g:509:1: ( ruleImplementation EOF )
            // InternalCls.g:510:1: ruleImplementation EOF
            {
             before(grammarAccess.getImplementationRule()); 
            pushFollow(FOLLOW_1);
            ruleImplementation();

            state._fsp--;

             after(grammarAccess.getImplementationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImplementation"


    // $ANTLR start "ruleImplementation"
    // InternalCls.g:517:1: ruleImplementation : ( ( rule__Implementation__Group__0 ) ) ;
    public final void ruleImplementation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:521:2: ( ( ( rule__Implementation__Group__0 ) ) )
            // InternalCls.g:522:1: ( ( rule__Implementation__Group__0 ) )
            {
            // InternalCls.g:522:1: ( ( rule__Implementation__Group__0 ) )
            // InternalCls.g:523:1: ( rule__Implementation__Group__0 )
            {
             before(grammarAccess.getImplementationAccess().getGroup()); 
            // InternalCls.g:524:1: ( rule__Implementation__Group__0 )
            // InternalCls.g:524:2: rule__Implementation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplementationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplementation"


    // $ANTLR start "entryRuleCommentLink"
    // InternalCls.g:536:1: entryRuleCommentLink : ruleCommentLink EOF ;
    public final void entryRuleCommentLink() throws RecognitionException {
        try {
            // InternalCls.g:537:1: ( ruleCommentLink EOF )
            // InternalCls.g:538:1: ruleCommentLink EOF
            {
             before(grammarAccess.getCommentLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleCommentLink();

            state._fsp--;

             after(grammarAccess.getCommentLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommentLink"


    // $ANTLR start "ruleCommentLink"
    // InternalCls.g:545:1: ruleCommentLink : ( ( rule__CommentLink__Group__0 ) ) ;
    public final void ruleCommentLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:549:2: ( ( ( rule__CommentLink__Group__0 ) ) )
            // InternalCls.g:550:1: ( ( rule__CommentLink__Group__0 ) )
            {
            // InternalCls.g:550:1: ( ( rule__CommentLink__Group__0 ) )
            // InternalCls.g:551:1: ( rule__CommentLink__Group__0 )
            {
             before(grammarAccess.getCommentLinkAccess().getGroup()); 
            // InternalCls.g:552:1: ( rule__CommentLink__Group__0 )
            // InternalCls.g:552:2: rule__CommentLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommentLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentLink"


    // $ANTLR start "entryRuleAssociation"
    // InternalCls.g:564:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalCls.g:565:1: ( ruleAssociation EOF )
            // InternalCls.g:566:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalCls.g:573:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:577:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalCls.g:578:1: ( ( rule__Association__Group__0 ) )
            {
            // InternalCls.g:578:1: ( ( rule__Association__Group__0 ) )
            // InternalCls.g:579:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalCls.g:580:1: ( rule__Association__Group__0 )
            // InternalCls.g:580:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleMultiAssociation"
    // InternalCls.g:592:1: entryRuleMultiAssociation : ruleMultiAssociation EOF ;
    public final void entryRuleMultiAssociation() throws RecognitionException {
        try {
            // InternalCls.g:593:1: ( ruleMultiAssociation EOF )
            // InternalCls.g:594:1: ruleMultiAssociation EOF
            {
             before(grammarAccess.getMultiAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiAssociation();

            state._fsp--;

             after(grammarAccess.getMultiAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiAssociation"


    // $ANTLR start "ruleMultiAssociation"
    // InternalCls.g:601:1: ruleMultiAssociation : ( ( rule__MultiAssociation__Group__0 ) ) ;
    public final void ruleMultiAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:605:2: ( ( ( rule__MultiAssociation__Group__0 ) ) )
            // InternalCls.g:606:1: ( ( rule__MultiAssociation__Group__0 ) )
            {
            // InternalCls.g:606:1: ( ( rule__MultiAssociation__Group__0 ) )
            // InternalCls.g:607:1: ( rule__MultiAssociation__Group__0 )
            {
             before(grammarAccess.getMultiAssociationAccess().getGroup()); 
            // InternalCls.g:608:1: ( rule__MultiAssociation__Group__0 )
            // InternalCls.g:608:2: rule__MultiAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiAssociation"


    // $ANTLR start "entryRuleMemberEnd"
    // InternalCls.g:620:1: entryRuleMemberEnd : ruleMemberEnd EOF ;
    public final void entryRuleMemberEnd() throws RecognitionException {
        try {
            // InternalCls.g:621:1: ( ruleMemberEnd EOF )
            // InternalCls.g:622:1: ruleMemberEnd EOF
            {
             before(grammarAccess.getMemberEndRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberEnd();

            state._fsp--;

             after(grammarAccess.getMemberEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberEnd"


    // $ANTLR start "ruleMemberEnd"
    // InternalCls.g:629:1: ruleMemberEnd : ( ( rule__MemberEnd__Group__0 ) ) ;
    public final void ruleMemberEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:633:2: ( ( ( rule__MemberEnd__Group__0 ) ) )
            // InternalCls.g:634:1: ( ( rule__MemberEnd__Group__0 ) )
            {
            // InternalCls.g:634:1: ( ( rule__MemberEnd__Group__0 ) )
            // InternalCls.g:635:1: ( rule__MemberEnd__Group__0 )
            {
             before(grammarAccess.getMemberEndAccess().getGroup()); 
            // InternalCls.g:636:1: ( rule__MemberEnd__Group__0 )
            // InternalCls.g:636:2: rule__MemberEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberEnd"


    // $ANTLR start "entryRuleAssociationProperties"
    // InternalCls.g:648:1: entryRuleAssociationProperties : ruleAssociationProperties EOF ;
    public final void entryRuleAssociationProperties() throws RecognitionException {
        try {
            // InternalCls.g:649:1: ( ruleAssociationProperties EOF )
            // InternalCls.g:650:1: ruleAssociationProperties EOF
            {
             before(grammarAccess.getAssociationPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationProperties();

            state._fsp--;

             after(grammarAccess.getAssociationPropertiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociationProperties"


    // $ANTLR start "ruleAssociationProperties"
    // InternalCls.g:657:1: ruleAssociationProperties : ( ( rule__AssociationProperties__Group__0 ) ) ;
    public final void ruleAssociationProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:661:2: ( ( ( rule__AssociationProperties__Group__0 ) ) )
            // InternalCls.g:662:1: ( ( rule__AssociationProperties__Group__0 ) )
            {
            // InternalCls.g:662:1: ( ( rule__AssociationProperties__Group__0 ) )
            // InternalCls.g:663:1: ( rule__AssociationProperties__Group__0 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getGroup()); 
            // InternalCls.g:664:1: ( rule__AssociationProperties__Group__0 )
            // InternalCls.g:664:2: rule__AssociationProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationProperties"


    // $ANTLR start "entryRuleCardinality"
    // InternalCls.g:676:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalCls.g:677:1: ( ruleCardinality EOF )
            // InternalCls.g:678:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalCls.g:685:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:689:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalCls.g:690:1: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalCls.g:690:1: ( ( rule__Cardinality__Group__0 ) )
            // InternalCls.g:691:1: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalCls.g:692:1: ( rule__Cardinality__Group__0 )
            // InternalCls.g:692:2: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleCommentBody"
    // InternalCls.g:704:1: entryRuleCommentBody : ruleCommentBody EOF ;
    public final void entryRuleCommentBody() throws RecognitionException {
        try {
            // InternalCls.g:705:1: ( ruleCommentBody EOF )
            // InternalCls.g:706:1: ruleCommentBody EOF
            {
             before(grammarAccess.getCommentBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleCommentBody();

            state._fsp--;

             after(grammarAccess.getCommentBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommentBody"


    // $ANTLR start "ruleCommentBody"
    // InternalCls.g:713:1: ruleCommentBody : ( RULE_STRING ) ;
    public final void ruleCommentBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:717:2: ( ( RULE_STRING ) )
            // InternalCls.g:718:1: ( RULE_STRING )
            {
            // InternalCls.g:718:1: ( RULE_STRING )
            // InternalCls.g:719:1: RULE_STRING
            {
             before(grammarAccess.getCommentBodyAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommentBodyAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentBody"


    // $ANTLR start "entryRuleCardinalityBound"
    // InternalCls.g:732:1: entryRuleCardinalityBound : ruleCardinalityBound EOF ;
    public final void entryRuleCardinalityBound() throws RecognitionException {
        try {
            // InternalCls.g:733:1: ( ruleCardinalityBound EOF )
            // InternalCls.g:734:1: ruleCardinalityBound EOF
            {
             before(grammarAccess.getCardinalityBoundRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinalityBound();

            state._fsp--;

             after(grammarAccess.getCardinalityBoundRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinalityBound"


    // $ANTLR start "ruleCardinalityBound"
    // InternalCls.g:741:1: ruleCardinalityBound : ( ( rule__CardinalityBound__Alternatives ) ) ;
    public final void ruleCardinalityBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:745:2: ( ( ( rule__CardinalityBound__Alternatives ) ) )
            // InternalCls.g:746:1: ( ( rule__CardinalityBound__Alternatives ) )
            {
            // InternalCls.g:746:1: ( ( rule__CardinalityBound__Alternatives ) )
            // InternalCls.g:747:1: ( rule__CardinalityBound__Alternatives )
            {
             before(grammarAccess.getCardinalityBoundAccess().getAlternatives()); 
            // InternalCls.g:748:1: ( rule__CardinalityBound__Alternatives )
            // InternalCls.g:748:2: rule__CardinalityBound__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CardinalityBound__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityBoundAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinalityBound"


    // $ANTLR start "ruleVisibility"
    // InternalCls.g:761:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:765:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalCls.g:766:1: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalCls.g:766:1: ( ( rule__Visibility__Alternatives ) )
            // InternalCls.g:767:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalCls.g:768:1: ( rule__Visibility__Alternatives )
            // InternalCls.g:768:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rulePrimitiveType"
    // InternalCls.g:780:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:784:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalCls.g:785:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalCls.g:785:1: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalCls.g:786:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalCls.g:787:1: ( rule__PrimitiveType__Alternatives )
            // InternalCls.g:787:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "ruleAggregationKind"
    // InternalCls.g:799:1: ruleAggregationKind : ( ( rule__AggregationKind__Alternatives ) ) ;
    public final void ruleAggregationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:803:1: ( ( ( rule__AggregationKind__Alternatives ) ) )
            // InternalCls.g:804:1: ( ( rule__AggregationKind__Alternatives ) )
            {
            // InternalCls.g:804:1: ( ( rule__AggregationKind__Alternatives ) )
            // InternalCls.g:805:1: ( rule__AggregationKind__Alternatives )
            {
             before(grammarAccess.getAggregationKindAccess().getAlternatives()); 
            // InternalCls.g:806:1: ( rule__AggregationKind__Alternatives )
            // InternalCls.g:806:2: rule__AggregationKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AggregationKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAggregationKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregationKind"


    // $ANTLR start "rule__Classifier__Alternatives"
    // InternalCls.g:817:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );
    public final void rule__Classifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:821:1: ( ( ruleClass ) | ( ruleInterface ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCls.g:822:1: ( ruleClass )
                    {
                    // InternalCls.g:822:1: ( ruleClass )
                    // InternalCls.g:823:1: ruleClass
                    {
                     before(grammarAccess.getClassifierAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getClassifierAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:828:6: ( ruleInterface )
                    {
                    // InternalCls.g:828:6: ( ruleInterface )
                    // InternalCls.g:829:1: ruleInterface
                    {
                     before(grammarAccess.getClassifierAccess().getInterfaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getClassifierAccess().getInterfaceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Alternatives"


    // $ANTLR start "rule__Class__LongNameAlternatives_3_0_0"
    // InternalCls.g:839:1: rule__Class__LongNameAlternatives_3_0_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Class__LongNameAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:843:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCls.g:844:1: ( RULE_STRING )
                    {
                    // InternalCls.g:844:1: ( RULE_STRING )
                    // InternalCls.g:845:1: RULE_STRING
                    {
                     before(grammarAccess.getClassAccess().getLongNameSTRINGTerminalRuleCall_3_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getLongNameSTRINGTerminalRuleCall_3_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:850:6: ( RULE_ID )
                    {
                    // InternalCls.g:850:6: ( RULE_ID )
                    // InternalCls.g:851:1: RULE_ID
                    {
                     before(grammarAccess.getClassAccess().getLongNameIDTerminalRuleCall_3_0_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getLongNameIDTerminalRuleCall_3_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__LongNameAlternatives_3_0_0"


    // $ANTLR start "rule__Interface__LongNameAlternatives_2_0_0"
    // InternalCls.g:861:1: rule__Interface__LongNameAlternatives_2_0_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Interface__LongNameAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:865:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCls.g:866:1: ( RULE_STRING )
                    {
                    // InternalCls.g:866:1: ( RULE_STRING )
                    // InternalCls.g:867:1: RULE_STRING
                    {
                     before(grammarAccess.getInterfaceAccess().getLongNameSTRINGTerminalRuleCall_2_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getInterfaceAccess().getLongNameSTRINGTerminalRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:872:6: ( RULE_ID )
                    {
                    // InternalCls.g:872:6: ( RULE_ID )
                    // InternalCls.g:873:1: RULE_ID
                    {
                     before(grammarAccess.getInterfaceAccess().getLongNameIDTerminalRuleCall_2_0_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getInterfaceAccess().getLongNameIDTerminalRuleCall_2_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__LongNameAlternatives_2_0_0"


    // $ANTLR start "rule__TypeReference__Alternatives"
    // InternalCls.g:883:1: rule__TypeReference__Alternatives : ( ( ruleDataTypeReference ) | ( ruleUMLTypeReference ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:887:1: ( ( ruleDataTypeReference ) | ( ruleUMLTypeReference ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=19 && LA4_0<=27)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCls.g:888:1: ( ruleDataTypeReference )
                    {
                    // InternalCls.g:888:1: ( ruleDataTypeReference )
                    // InternalCls.g:889:1: ruleDataTypeReference
                    {
                     before(grammarAccess.getTypeReferenceAccess().getDataTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataTypeReference();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getDataTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:894:6: ( ruleUMLTypeReference )
                    {
                    // InternalCls.g:894:6: ( ruleUMLTypeReference )
                    // InternalCls.g:895:1: ruleUMLTypeReference
                    {
                     before(grammarAccess.getTypeReferenceAccess().getUMLTypeReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUMLTypeReference();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getUMLTypeReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Alternatives"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalCls.g:905:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:909:1: ( ( ruleAttribute ) | ( ruleMethod ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCls.g:910:1: ( ruleAttribute )
                    {
                    // InternalCls.g:910:1: ( ruleAttribute )
                    // InternalCls.g:911:1: ruleAttribute
                    {
                     before(grammarAccess.getMemberAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:916:6: ( ruleMethod )
                    {
                    // InternalCls.g:916:6: ( ruleMethod )
                    // InternalCls.g:917:1: ruleMethod
                    {
                     before(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__Connector__Alternatives"
    // InternalCls.g:927:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleAssociation ) | ( ruleImplementation ) | ( ruleCommentLink ) | ( ruleMultiAssociation ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:931:1: ( ( ruleGeneralization ) | ( ruleAssociation ) | ( ruleImplementation ) | ( ruleCommentLink ) | ( ruleMultiAssociation ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 44:
                    {
                    alt6=1;
                    }
                    break;
                case 45:
                    {
                    alt6=3;
                    }
                    break;
                case 46:
                    {
                    alt6=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 29:
            case 30:
            case 55:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==RULE_ID) ) {
                    int LA6_7 = input.LA(3);

                    if ( (LA6_7==37) ) {
                        alt6=5;
                    }
                    else if ( (LA6_7==RULE_ID) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCls.g:932:1: ( ruleGeneralization )
                    {
                    // InternalCls.g:932:1: ( ruleGeneralization )
                    // InternalCls.g:933:1: ruleGeneralization
                    {
                     before(grammarAccess.getConnectorAccess().getGeneralizationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralization();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getGeneralizationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:938:6: ( ruleAssociation )
                    {
                    // InternalCls.g:938:6: ( ruleAssociation )
                    // InternalCls.g:939:1: ruleAssociation
                    {
                     before(grammarAccess.getConnectorAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getAssociationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:944:6: ( ruleImplementation )
                    {
                    // InternalCls.g:944:6: ( ruleImplementation )
                    // InternalCls.g:945:1: ruleImplementation
                    {
                     before(grammarAccess.getConnectorAccess().getImplementationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImplementation();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getImplementationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:950:6: ( ruleCommentLink )
                    {
                    // InternalCls.g:950:6: ( ruleCommentLink )
                    // InternalCls.g:951:1: ruleCommentLink
                    {
                     before(grammarAccess.getConnectorAccess().getCommentLinkParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCommentLink();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getCommentLinkParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:956:6: ( ruleMultiAssociation )
                    {
                    // InternalCls.g:956:6: ( ruleMultiAssociation )
                    // InternalCls.g:957:1: ruleMultiAssociation
                    {
                     before(grammarAccess.getConnectorAccess().getMultiAssociationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiAssociation();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getMultiAssociationParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Alternatives"


    // $ANTLR start "rule__CardinalityBound__Alternatives"
    // InternalCls.g:967:1: rule__CardinalityBound__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CardinalityBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:971:1: ( ( '*' ) | ( RULE_INT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCls.g:972:1: ( '*' )
                    {
                    // InternalCls.g:972:1: ( '*' )
                    // InternalCls.g:973:1: '*'
                    {
                     before(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:980:6: ( RULE_INT )
                    {
                    // InternalCls.g:980:6: ( RULE_INT )
                    // InternalCls.g:981:1: RULE_INT
                    {
                     before(grammarAccess.getCardinalityBoundAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityBoundAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityBound__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalCls.g:991:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:995:1: ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            case 16:
                {
                alt8=5;
                }
                break;
            case 17:
                {
                alt8=6;
                }
                break;
            case 18:
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
                    // InternalCls.g:996:1: ( ( '+' ) )
                    {
                    // InternalCls.g:996:1: ( ( '+' ) )
                    // InternalCls.g:997:1: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalCls.g:998:1: ( '+' )
                    // InternalCls.g:998:3: '+'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1003:6: ( ( 'public' ) )
                    {
                    // InternalCls.g:1003:6: ( ( 'public' ) )
                    // InternalCls.g:1004:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // InternalCls.g:1005:1: ( 'public' )
                    // InternalCls.g:1005:3: 'public'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1010:6: ( ( '-' ) )
                    {
                    // InternalCls.g:1010:6: ( ( '-' ) )
                    // InternalCls.g:1011:1: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2()); 
                    // InternalCls.g:1012:1: ( '-' )
                    // InternalCls.g:1012:3: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1017:6: ( ( 'private' ) )
                    {
                    // InternalCls.g:1017:6: ( ( 'private' ) )
                    // InternalCls.g:1018:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3()); 
                    // InternalCls.g:1019:1: ( 'private' )
                    // InternalCls.g:1019:3: 'private'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:1024:6: ( ( '#' ) )
                    {
                    // InternalCls.g:1024:6: ( ( '#' ) )
                    // InternalCls.g:1025:1: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4()); 
                    // InternalCls.g:1026:1: ( '#' )
                    // InternalCls.g:1026:3: '#'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:1031:6: ( ( 'protected' ) )
                    {
                    // InternalCls.g:1031:6: ( ( 'protected' ) )
                    // InternalCls.g:1032:1: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5()); 
                    // InternalCls.g:1033:1: ( 'protected' )
                    // InternalCls.g:1033:3: 'protected'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:1038:6: ( ( '~' ) )
                    {
                    // InternalCls.g:1038:6: ( ( '~' ) )
                    // InternalCls.g:1039:1: ( '~' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_6()); 
                    // InternalCls.g:1040:1: ( '~' )
                    // InternalCls.g:1040:3: '~'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalCls.g:1050:1: rule__PrimitiveType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'short' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1054:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'short' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            case 24:
                {
                alt9=6;
                }
                break;
            case 25:
                {
                alt9=7;
                }
                break;
            case 26:
                {
                alt9=8;
                }
                break;
            case 27:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCls.g:1055:1: ( ( 'string' ) )
                    {
                    // InternalCls.g:1055:1: ( ( 'string' ) )
                    // InternalCls.g:1056:1: ( 'string' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalCls.g:1057:1: ( 'string' )
                    // InternalCls.g:1057:3: 'string'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1062:6: ( ( 'int' ) )
                    {
                    // InternalCls.g:1062:6: ( ( 'int' ) )
                    // InternalCls.g:1063:1: ( 'int' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalCls.g:1064:1: ( 'int' )
                    // InternalCls.g:1064:3: 'int'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1069:6: ( ( 'double' ) )
                    {
                    // InternalCls.g:1069:6: ( ( 'double' ) )
                    // InternalCls.g:1070:1: ( 'double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    // InternalCls.g:1071:1: ( 'double' )
                    // InternalCls.g:1071:3: 'double'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1076:6: ( ( 'boolean' ) )
                    {
                    // InternalCls.g:1076:6: ( ( 'boolean' ) )
                    // InternalCls.g:1077:1: ( 'boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 
                    // InternalCls.g:1078:1: ( 'boolean' )
                    // InternalCls.g:1078:3: 'boolean'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:1083:6: ( ( 'char' ) )
                    {
                    // InternalCls.g:1083:6: ( ( 'char' ) )
                    // InternalCls.g:1084:1: ( 'char' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4()); 
                    // InternalCls.g:1085:1: ( 'char' )
                    // InternalCls.g:1085:3: 'char'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:1090:6: ( ( 'byte' ) )
                    {
                    // InternalCls.g:1090:6: ( ( 'byte' ) )
                    // InternalCls.g:1091:1: ( 'byte' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5()); 
                    // InternalCls.g:1092:1: ( 'byte' )
                    // InternalCls.g:1092:3: 'byte'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:1097:6: ( ( 'short' ) )
                    {
                    // InternalCls.g:1097:6: ( ( 'short' ) )
                    // InternalCls.g:1098:1: ( 'short' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6()); 
                    // InternalCls.g:1099:1: ( 'short' )
                    // InternalCls.g:1099:3: 'short'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCls.g:1104:6: ( ( 'long' ) )
                    {
                    // InternalCls.g:1104:6: ( ( 'long' ) )
                    // InternalCls.g:1105:1: ( 'long' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7()); 
                    // InternalCls.g:1106:1: ( 'long' )
                    // InternalCls.g:1106:3: 'long'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCls.g:1111:6: ( ( 'float' ) )
                    {
                    // InternalCls.g:1111:6: ( ( 'float' ) )
                    // InternalCls.g:1112:1: ( 'float' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalCls.g:1113:1: ( 'float' )
                    // InternalCls.g:1113:3: 'float'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__AggregationKind__Alternatives"
    // InternalCls.g:1123:1: rule__AggregationKind__Alternatives : ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) );
    public final void rule__AggregationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1127:1: ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCls.g:1128:1: ( ( 'asc' ) )
                    {
                    // InternalCls.g:1128:1: ( ( 'asc' ) )
                    // InternalCls.g:1129:1: ( 'asc' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalCls.g:1130:1: ( 'asc' )
                    // InternalCls.g:1130:3: 'asc'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1135:6: ( ( 'agg' ) )
                    {
                    // InternalCls.g:1135:6: ( ( 'agg' ) )
                    // InternalCls.g:1136:1: ( 'agg' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 
                    // InternalCls.g:1137:1: ( 'agg' )
                    // InternalCls.g:1137:3: 'agg'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1142:6: ( ( 'com' ) )
                    {
                    // InternalCls.g:1142:6: ( ( 'com' ) )
                    // InternalCls.g:1143:1: ( 'com' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getCOMPOSITIONEnumLiteralDeclaration_2()); 
                    // InternalCls.g:1144:1: ( 'com' )
                    // InternalCls.g:1144:3: 'com'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getCOMPOSITIONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationKind__Alternatives"


    // $ANTLR start "rule__ClassDiagram__Group__0"
    // InternalCls.g:1156:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1160:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // InternalCls.g:1161:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__0"


    // $ANTLR start "rule__ClassDiagram__Group__0__Impl"
    // InternalCls.g:1168:1: rule__ClassDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1172:1: ( ( () ) )
            // InternalCls.g:1173:1: ( () )
            {
            // InternalCls.g:1173:1: ( () )
            // InternalCls.g:1174:1: ()
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 
            // InternalCls.g:1175:1: ()
            // InternalCls.g:1177:1: 
            {
            }

             after(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__0__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__1"
    // InternalCls.g:1187:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1191:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // InternalCls.g:1192:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ClassDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__1"


    // $ANTLR start "rule__ClassDiagram__Group__1__Impl"
    // InternalCls.g:1199:1: rule__ClassDiagram__Group__1__Impl : ( '@startclass' ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1203:1: ( ( '@startclass' ) )
            // InternalCls.g:1204:1: ( '@startclass' )
            {
            // InternalCls.g:1204:1: ( '@startclass' )
            // InternalCls.g:1205:1: '@startclass'
            {
             before(grammarAccess.getClassDiagramAccess().getStartclassKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getStartclassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__1__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__2"
    // InternalCls.g:1218:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1222:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // InternalCls.g:1223:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ClassDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__2"


    // $ANTLR start "rule__ClassDiagram__Group__2__Impl"
    // InternalCls.g:1230:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__NameAssignment_2 ) ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1234:1: ( ( ( rule__ClassDiagram__NameAssignment_2 ) ) )
            // InternalCls.g:1235:1: ( ( rule__ClassDiagram__NameAssignment_2 ) )
            {
            // InternalCls.g:1235:1: ( ( rule__ClassDiagram__NameAssignment_2 ) )
            // InternalCls.g:1236:1: ( rule__ClassDiagram__NameAssignment_2 )
            {
             before(grammarAccess.getClassDiagramAccess().getNameAssignment_2()); 
            // InternalCls.g:1237:1: ( rule__ClassDiagram__NameAssignment_2 )
            // InternalCls.g:1237:2: rule__ClassDiagram__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__2__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__3"
    // InternalCls.g:1247:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1251:1: ( rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 )
            // InternalCls.g:1252:2: rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ClassDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__3"


    // $ANTLR start "rule__ClassDiagram__Group__3__Impl"
    // InternalCls.g:1259:1: rule__ClassDiagram__Group__3__Impl : ( ( rule__ClassDiagram__PackageImportsAssignment_3 )* ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1263:1: ( ( ( rule__ClassDiagram__PackageImportsAssignment_3 )* ) )
            // InternalCls.g:1264:1: ( ( rule__ClassDiagram__PackageImportsAssignment_3 )* )
            {
            // InternalCls.g:1264:1: ( ( rule__ClassDiagram__PackageImportsAssignment_3 )* )
            // InternalCls.g:1265:1: ( rule__ClassDiagram__PackageImportsAssignment_3 )*
            {
             before(grammarAccess.getClassDiagramAccess().getPackageImportsAssignment_3()); 
            // InternalCls.g:1266:1: ( rule__ClassDiagram__PackageImportsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCls.g:1266:2: rule__ClassDiagram__PackageImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ClassDiagram__PackageImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClassDiagramAccess().getPackageImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__3__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__4"
    // InternalCls.g:1276:1: rule__ClassDiagram__Group__4 : rule__ClassDiagram__Group__4__Impl rule__ClassDiagram__Group__5 ;
    public final void rule__ClassDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1280:1: ( rule__ClassDiagram__Group__4__Impl rule__ClassDiagram__Group__5 )
            // InternalCls.g:1281:2: rule__ClassDiagram__Group__4__Impl rule__ClassDiagram__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ClassDiagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__4"


    // $ANTLR start "rule__ClassDiagram__Group__4__Impl"
    // InternalCls.g:1288:1: rule__ClassDiagram__Group__4__Impl : ( ( rule__ClassDiagram__ClassifiersAssignment_4 )* ) ;
    public final void rule__ClassDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1292:1: ( ( ( rule__ClassDiagram__ClassifiersAssignment_4 )* ) )
            // InternalCls.g:1293:1: ( ( rule__ClassDiagram__ClassifiersAssignment_4 )* )
            {
            // InternalCls.g:1293:1: ( ( rule__ClassDiagram__ClassifiersAssignment_4 )* )
            // InternalCls.g:1294:1: ( rule__ClassDiagram__ClassifiersAssignment_4 )*
            {
             before(grammarAccess.getClassDiagramAccess().getClassifiersAssignment_4()); 
            // InternalCls.g:1295:1: ( rule__ClassDiagram__ClassifiersAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=12 && LA12_0<=18)||LA12_0==35||LA12_0==39||LA12_0==52) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCls.g:1295:2: rule__ClassDiagram__ClassifiersAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ClassDiagram__ClassifiersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassDiagramAccess().getClassifiersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__4__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__5"
    // InternalCls.g:1305:1: rule__ClassDiagram__Group__5 : rule__ClassDiagram__Group__5__Impl rule__ClassDiagram__Group__6 ;
    public final void rule__ClassDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1309:1: ( rule__ClassDiagram__Group__5__Impl rule__ClassDiagram__Group__6 )
            // InternalCls.g:1310:2: rule__ClassDiagram__Group__5__Impl rule__ClassDiagram__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__ClassDiagram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__5"


    // $ANTLR start "rule__ClassDiagram__Group__5__Impl"
    // InternalCls.g:1317:1: rule__ClassDiagram__Group__5__Impl : ( ( rule__ClassDiagram__ConnectorsAssignment_5 )* ) ;
    public final void rule__ClassDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1321:1: ( ( ( rule__ClassDiagram__ConnectorsAssignment_5 )* ) )
            // InternalCls.g:1322:1: ( ( rule__ClassDiagram__ConnectorsAssignment_5 )* )
            {
            // InternalCls.g:1322:1: ( ( rule__ClassDiagram__ConnectorsAssignment_5 )* )
            // InternalCls.g:1323:1: ( rule__ClassDiagram__ConnectorsAssignment_5 )*
            {
             before(grammarAccess.getClassDiagramAccess().getConnectorsAssignment_5()); 
            // InternalCls.g:1324:1: ( rule__ClassDiagram__ConnectorsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=28 && LA13_0<=30)||LA13_0==55) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCls.g:1324:2: rule__ClassDiagram__ConnectorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ClassDiagram__ConnectorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getClassDiagramAccess().getConnectorsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__5__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__6"
    // InternalCls.g:1334:1: rule__ClassDiagram__Group__6 : rule__ClassDiagram__Group__6__Impl ;
    public final void rule__ClassDiagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1338:1: ( rule__ClassDiagram__Group__6__Impl )
            // InternalCls.g:1339:2: rule__ClassDiagram__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__6"


    // $ANTLR start "rule__ClassDiagram__Group__6__Impl"
    // InternalCls.g:1345:1: rule__ClassDiagram__Group__6__Impl : ( '@endclass' ) ;
    public final void rule__ClassDiagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1349:1: ( ( '@endclass' ) )
            // InternalCls.g:1350:1: ( '@endclass' )
            {
            // InternalCls.g:1350:1: ( '@endclass' )
            // InternalCls.g:1351:1: '@endclass'
            {
             before(grammarAccess.getClassDiagramAccess().getEndclassKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getEndclassKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__6__Impl"


    // $ANTLR start "rule__PackageImport__Group__0"
    // InternalCls.g:1378:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1382:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // InternalCls.g:1383:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PackageImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__Group__0"


    // $ANTLR start "rule__PackageImport__Group__0__Impl"
    // InternalCls.g:1390:1: rule__PackageImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1394:1: ( ( 'import' ) )
            // InternalCls.g:1395:1: ( 'import' )
            {
            // InternalCls.g:1395:1: ( 'import' )
            // InternalCls.g:1396:1: 'import'
            {
             before(grammarAccess.getPackageImportAccess().getImportKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPackageImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__Group__0__Impl"


    // $ANTLR start "rule__PackageImport__Group__1"
    // InternalCls.g:1409:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1413:1: ( rule__PackageImport__Group__1__Impl )
            // InternalCls.g:1414:2: rule__PackageImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageImport__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__Group__1"


    // $ANTLR start "rule__PackageImport__Group__1__Impl"
    // InternalCls.g:1420:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__PackageAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1424:1: ( ( ( rule__PackageImport__PackageAssignment_1 ) ) )
            // InternalCls.g:1425:1: ( ( rule__PackageImport__PackageAssignment_1 ) )
            {
            // InternalCls.g:1425:1: ( ( rule__PackageImport__PackageAssignment_1 ) )
            // InternalCls.g:1426:1: ( rule__PackageImport__PackageAssignment_1 )
            {
             before(grammarAccess.getPackageImportAccess().getPackageAssignment_1()); 
            // InternalCls.g:1427:1: ( rule__PackageImport__PackageAssignment_1 )
            // InternalCls.g:1427:2: rule__PackageImport__PackageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageImport__PackageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageImportAccess().getPackageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalCls.g:1441:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1445:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCls.g:1446:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalCls.g:1453:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1457:1: ( ( RULE_ID ) )
            // InternalCls.g:1458:1: ( RULE_ID )
            {
            // InternalCls.g:1458:1: ( RULE_ID )
            // InternalCls.g:1459:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalCls.g:1470:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1474:1: ( rule__FQN__Group__1__Impl )
            // InternalCls.g:1475:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalCls.g:1481:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1485:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCls.g:1486:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCls.g:1486:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCls.g:1487:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCls.g:1488:1: ( rule__FQN__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCls.g:1488:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalCls.g:1502:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1506:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCls.g:1507:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalCls.g:1514:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1518:1: ( ( '.' ) )
            // InternalCls.g:1519:1: ( '.' )
            {
            // InternalCls.g:1519:1: ( '.' )
            // InternalCls.g:1520:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalCls.g:1533:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1537:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCls.g:1538:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalCls.g:1544:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1548:1: ( ( RULE_ID ) )
            // InternalCls.g:1549:1: ( RULE_ID )
            {
            // InternalCls.g:1549:1: ( RULE_ID )
            // InternalCls.g:1550:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalCls.g:1565:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1569:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalCls.g:1570:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalCls.g:1577:1: rule__Class__Group__0__Impl : ( ( rule__Class__VisibilityAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1581:1: ( ( ( rule__Class__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1582:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1582:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            // InternalCls.g:1583:1: ( rule__Class__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1584:1: ( rule__Class__VisibilityAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=12 && LA15_0<=18)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCls.g:1584:2: rule__Class__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalCls.g:1594:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1598:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalCls.g:1599:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalCls.g:1606:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1610:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalCls.g:1611:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalCls.g:1611:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalCls.g:1612:1: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalCls.g:1613:1: ( rule__Class__AbstractAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCls.g:1613:2: rule__Class__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAbstractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalCls.g:1623:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1627:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalCls.g:1628:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalCls.g:1635:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1639:1: ( ( 'class' ) )
            // InternalCls.g:1640:1: ( 'class' )
            {
            // InternalCls.g:1640:1: ( 'class' )
            // InternalCls.g:1641:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalCls.g:1654:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1658:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalCls.g:1659:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalCls.g:1666:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1670:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalCls.g:1671:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalCls.g:1671:1: ( ( rule__Class__Group_3__0 )? )
            // InternalCls.g:1672:1: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalCls.g:1673:1: ( rule__Class__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==36) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalCls.g:1673:2: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalCls.g:1683:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1687:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalCls.g:1688:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalCls.g:1695:1: rule__Class__Group__4__Impl : ( ( rule__Class__ReferencedElementAssignment_4 ) ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1699:1: ( ( ( rule__Class__ReferencedElementAssignment_4 ) ) )
            // InternalCls.g:1700:1: ( ( rule__Class__ReferencedElementAssignment_4 ) )
            {
            // InternalCls.g:1700:1: ( ( rule__Class__ReferencedElementAssignment_4 ) )
            // InternalCls.g:1701:1: ( rule__Class__ReferencedElementAssignment_4 )
            {
             before(grammarAccess.getClassAccess().getReferencedElementAssignment_4()); 
            // InternalCls.g:1702:1: ( rule__Class__ReferencedElementAssignment_4 )
            // InternalCls.g:1702:2: rule__Class__ReferencedElementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Class__ReferencedElementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getReferencedElementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalCls.g:1712:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1716:1: ( rule__Class__Group__5__Impl )
            // InternalCls.g:1717:2: rule__Class__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalCls.g:1723:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1727:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalCls.g:1728:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalCls.g:1728:1: ( ( rule__Class__Group_5__0 )? )
            // InternalCls.g:1729:1: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalCls.g:1730:1: ( rule__Class__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCls.g:1730:2: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalCls.g:1752:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1756:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalCls.g:1757:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // InternalCls.g:1764:1: rule__Class__Group_3__0__Impl : ( ( rule__Class__LongNameAssignment_3_0 ) ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1768:1: ( ( ( rule__Class__LongNameAssignment_3_0 ) ) )
            // InternalCls.g:1769:1: ( ( rule__Class__LongNameAssignment_3_0 ) )
            {
            // InternalCls.g:1769:1: ( ( rule__Class__LongNameAssignment_3_0 ) )
            // InternalCls.g:1770:1: ( rule__Class__LongNameAssignment_3_0 )
            {
             before(grammarAccess.getClassAccess().getLongNameAssignment_3_0()); 
            // InternalCls.g:1771:1: ( rule__Class__LongNameAssignment_3_0 )
            // InternalCls.g:1771:2: rule__Class__LongNameAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Class__LongNameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getLongNameAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // InternalCls.g:1781:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1785:1: ( rule__Class__Group_3__1__Impl )
            // InternalCls.g:1786:2: rule__Class__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // InternalCls.g:1792:1: rule__Class__Group_3__1__Impl : ( 'as' ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1796:1: ( ( 'as' ) )
            // InternalCls.g:1797:1: ( 'as' )
            {
            // InternalCls.g:1797:1: ( 'as' )
            // InternalCls.g:1798:1: 'as'
            {
             before(grammarAccess.getClassAccess().getAsKeyword_3_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAsKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalCls.g:1815:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1819:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalCls.g:1820:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // InternalCls.g:1827:1: rule__Class__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1831:1: ( ( '{' ) )
            // InternalCls.g:1832:1: ( '{' )
            {
            // InternalCls.g:1832:1: ( '{' )
            // InternalCls.g:1833:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // InternalCls.g:1846:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1850:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalCls.g:1851:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // InternalCls.g:1858:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__MembersAssignment_5_1 )* ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1862:1: ( ( ( rule__Class__MembersAssignment_5_1 )* ) )
            // InternalCls.g:1863:1: ( ( rule__Class__MembersAssignment_5_1 )* )
            {
            // InternalCls.g:1863:1: ( ( rule__Class__MembersAssignment_5_1 )* )
            // InternalCls.g:1864:1: ( rule__Class__MembersAssignment_5_1 )*
            {
             before(grammarAccess.getClassAccess().getMembersAssignment_5_1()); 
            // InternalCls.g:1865:1: ( rule__Class__MembersAssignment_5_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=12 && LA19_0<=18)||(LA19_0>=52 && LA19_0<=54)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCls.g:1865:2: rule__Class__MembersAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Class__MembersAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMembersAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_5__2"
    // InternalCls.g:1875:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1879:1: ( rule__Class__Group_5__2__Impl )
            // InternalCls.g:1880:2: rule__Class__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2"


    // $ANTLR start "rule__Class__Group_5__2__Impl"
    // InternalCls.g:1886:1: rule__Class__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1890:1: ( ( '}' ) )
            // InternalCls.g:1891:1: ( '}' )
            {
            // InternalCls.g:1891:1: ( '}' )
            // InternalCls.g:1892:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalCls.g:1911:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1915:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalCls.g:1916:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalCls.g:1923:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__VisibilityAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1927:1: ( ( ( rule__Interface__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1928:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1928:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            // InternalCls.g:1929:1: ( rule__Interface__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1930:1: ( rule__Interface__VisibilityAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=12 && LA20_0<=18)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCls.g:1930:2: rule__Interface__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalCls.g:1940:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1944:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalCls.g:1945:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalCls.g:1952:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1956:1: ( ( 'interface' ) )
            // InternalCls.g:1957:1: ( 'interface' )
            {
            // InternalCls.g:1957:1: ( 'interface' )
            // InternalCls.g:1958:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalCls.g:1971:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1975:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalCls.g:1976:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalCls.g:1983:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__Group_2__0 )? ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1987:1: ( ( ( rule__Interface__Group_2__0 )? ) )
            // InternalCls.g:1988:1: ( ( rule__Interface__Group_2__0 )? )
            {
            // InternalCls.g:1988:1: ( ( rule__Interface__Group_2__0 )? )
            // InternalCls.g:1989:1: ( rule__Interface__Group_2__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_2()); 
            // InternalCls.g:1990:1: ( rule__Interface__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==36) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalCls.g:1990:2: rule__Interface__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // InternalCls.g:2000:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2004:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalCls.g:2005:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // InternalCls.g:2012:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__ReferencedElementAssignment_3 ) ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2016:1: ( ( ( rule__Interface__ReferencedElementAssignment_3 ) ) )
            // InternalCls.g:2017:1: ( ( rule__Interface__ReferencedElementAssignment_3 ) )
            {
            // InternalCls.g:2017:1: ( ( rule__Interface__ReferencedElementAssignment_3 ) )
            // InternalCls.g:2018:1: ( rule__Interface__ReferencedElementAssignment_3 )
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementAssignment_3()); 
            // InternalCls.g:2019:1: ( rule__Interface__ReferencedElementAssignment_3 )
            // InternalCls.g:2019:2: rule__Interface__ReferencedElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Interface__ReferencedElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getReferencedElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // InternalCls.g:2029:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2033:1: ( rule__Interface__Group__4__Impl )
            // InternalCls.g:2034:2: rule__Interface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // InternalCls.g:2040:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__Group_4__0 )? ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2044:1: ( ( ( rule__Interface__Group_4__0 )? ) )
            // InternalCls.g:2045:1: ( ( rule__Interface__Group_4__0 )? )
            {
            // InternalCls.g:2045:1: ( ( rule__Interface__Group_4__0 )? )
            // InternalCls.g:2046:1: ( rule__Interface__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4()); 
            // InternalCls.g:2047:1: ( rule__Interface__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCls.g:2047:2: rule__Interface__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group_2__0"
    // InternalCls.g:2067:1: rule__Interface__Group_2__0 : rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 ;
    public final void rule__Interface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2071:1: ( rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 )
            // InternalCls.g:2072:2: rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Interface__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__0"


    // $ANTLR start "rule__Interface__Group_2__0__Impl"
    // InternalCls.g:2079:1: rule__Interface__Group_2__0__Impl : ( ( rule__Interface__LongNameAssignment_2_0 ) ) ;
    public final void rule__Interface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2083:1: ( ( ( rule__Interface__LongNameAssignment_2_0 ) ) )
            // InternalCls.g:2084:1: ( ( rule__Interface__LongNameAssignment_2_0 ) )
            {
            // InternalCls.g:2084:1: ( ( rule__Interface__LongNameAssignment_2_0 ) )
            // InternalCls.g:2085:1: ( rule__Interface__LongNameAssignment_2_0 )
            {
             before(grammarAccess.getInterfaceAccess().getLongNameAssignment_2_0()); 
            // InternalCls.g:2086:1: ( rule__Interface__LongNameAssignment_2_0 )
            // InternalCls.g:2086:2: rule__Interface__LongNameAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__LongNameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getLongNameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__0__Impl"


    // $ANTLR start "rule__Interface__Group_2__1"
    // InternalCls.g:2096:1: rule__Interface__Group_2__1 : rule__Interface__Group_2__1__Impl ;
    public final void rule__Interface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2100:1: ( rule__Interface__Group_2__1__Impl )
            // InternalCls.g:2101:2: rule__Interface__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__1"


    // $ANTLR start "rule__Interface__Group_2__1__Impl"
    // InternalCls.g:2107:1: rule__Interface__Group_2__1__Impl : ( 'as' ) ;
    public final void rule__Interface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2111:1: ( ( 'as' ) )
            // InternalCls.g:2112:1: ( 'as' )
            {
            // InternalCls.g:2112:1: ( 'as' )
            // InternalCls.g:2113:1: 'as'
            {
             before(grammarAccess.getInterfaceAccess().getAsKeyword_2_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getAsKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__1__Impl"


    // $ANTLR start "rule__Interface__Group_4__0"
    // InternalCls.g:2130:1: rule__Interface__Group_4__0 : rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 ;
    public final void rule__Interface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2134:1: ( rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 )
            // InternalCls.g:2135:2: rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Interface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__0"


    // $ANTLR start "rule__Interface__Group_4__0__Impl"
    // InternalCls.g:2142:1: rule__Interface__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Interface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2146:1: ( ( '{' ) )
            // InternalCls.g:2147:1: ( '{' )
            {
            // InternalCls.g:2147:1: ( '{' )
            // InternalCls.g:2148:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__0__Impl"


    // $ANTLR start "rule__Interface__Group_4__1"
    // InternalCls.g:2161:1: rule__Interface__Group_4__1 : rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2 ;
    public final void rule__Interface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2165:1: ( rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2 )
            // InternalCls.g:2166:2: rule__Interface__Group_4__1__Impl rule__Interface__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__Interface__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__1"


    // $ANTLR start "rule__Interface__Group_4__1__Impl"
    // InternalCls.g:2173:1: rule__Interface__Group_4__1__Impl : ( ( rule__Interface__MembersAssignment_4_1 )* ) ;
    public final void rule__Interface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2177:1: ( ( ( rule__Interface__MembersAssignment_4_1 )* ) )
            // InternalCls.g:2178:1: ( ( rule__Interface__MembersAssignment_4_1 )* )
            {
            // InternalCls.g:2178:1: ( ( rule__Interface__MembersAssignment_4_1 )* )
            // InternalCls.g:2179:1: ( rule__Interface__MembersAssignment_4_1 )*
            {
             before(grammarAccess.getInterfaceAccess().getMembersAssignment_4_1()); 
            // InternalCls.g:2180:1: ( rule__Interface__MembersAssignment_4_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=12 && LA23_0<=18)||(LA23_0>=52 && LA23_0<=54)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCls.g:2180:2: rule__Interface__MembersAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Interface__MembersAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getMembersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__1__Impl"


    // $ANTLR start "rule__Interface__Group_4__2"
    // InternalCls.g:2190:1: rule__Interface__Group_4__2 : rule__Interface__Group_4__2__Impl ;
    public final void rule__Interface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2194:1: ( rule__Interface__Group_4__2__Impl )
            // InternalCls.g:2195:2: rule__Interface__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__2"


    // $ANTLR start "rule__Interface__Group_4__2__Impl"
    // InternalCls.g:2201:1: rule__Interface__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Interface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2205:1: ( ( '}' ) )
            // InternalCls.g:2206:1: ( '}' )
            {
            // InternalCls.g:2206:1: ( '}' )
            // InternalCls.g:2207:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalCls.g:2226:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2230:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalCls.g:2231:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalCls.g:2238:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2242:1: ( ( () ) )
            // InternalCls.g:2243:1: ( () )
            {
            // InternalCls.g:2243:1: ( () )
            // InternalCls.g:2244:1: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalCls.g:2245:1: ()
            // InternalCls.g:2247:1: 
            {
            }

             after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalCls.g:2257:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2261:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalCls.g:2262:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalCls.g:2269:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__VisibilityAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2273:1: ( ( ( rule__Attribute__VisibilityAssignment_1 )? ) )
            // InternalCls.g:2274:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            {
            // InternalCls.g:2274:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            // InternalCls.g:2275:1: ( rule__Attribute__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 
            // InternalCls.g:2276:1: ( rule__Attribute__VisibilityAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=12 && LA24_0<=18)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCls.g:2276:2: rule__Attribute__VisibilityAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__VisibilityAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalCls.g:2286:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2290:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalCls.g:2291:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalCls.g:2298:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__StaticAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2302:1: ( ( ( rule__Attribute__StaticAssignment_2 )? ) )
            // InternalCls.g:2303:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            {
            // InternalCls.g:2303:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            // InternalCls.g:2304:1: ( rule__Attribute__StaticAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getStaticAssignment_2()); 
            // InternalCls.g:2305:1: ( rule__Attribute__StaticAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==53) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:2305:2: rule__Attribute__StaticAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__StaticAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getStaticAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalCls.g:2315:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2319:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalCls.g:2320:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalCls.g:2327:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__FinalAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2331:1: ( ( ( rule__Attribute__FinalAssignment_3 )? ) )
            // InternalCls.g:2332:1: ( ( rule__Attribute__FinalAssignment_3 )? )
            {
            // InternalCls.g:2332:1: ( ( rule__Attribute__FinalAssignment_3 )? )
            // InternalCls.g:2333:1: ( rule__Attribute__FinalAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getFinalAssignment_3()); 
            // InternalCls.g:2334:1: ( rule__Attribute__FinalAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==54) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:2334:2: rule__Attribute__FinalAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__FinalAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getFinalAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalCls.g:2344:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2348:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalCls.g:2349:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalCls.g:2356:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__ReferencedElementAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2360:1: ( ( ( rule__Attribute__ReferencedElementAssignment_4 ) ) )
            // InternalCls.g:2361:1: ( ( rule__Attribute__ReferencedElementAssignment_4 ) )
            {
            // InternalCls.g:2361:1: ( ( rule__Attribute__ReferencedElementAssignment_4 ) )
            // InternalCls.g:2362:1: ( rule__Attribute__ReferencedElementAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getReferencedElementAssignment_4()); 
            // InternalCls.g:2363:1: ( rule__Attribute__ReferencedElementAssignment_4 )
            // InternalCls.g:2363:2: rule__Attribute__ReferencedElementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ReferencedElementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getReferencedElementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalCls.g:2373:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2377:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalCls.g:2378:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalCls.g:2385:1: rule__Attribute__Group__5__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2389:1: ( ( ':' ) )
            // InternalCls.g:2390:1: ( ':' )
            {
            // InternalCls.g:2390:1: ( ':' )
            // InternalCls.g:2391:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalCls.g:2404:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2408:1: ( rule__Attribute__Group__6__Impl )
            // InternalCls.g:2409:2: rule__Attribute__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalCls.g:2415:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__TypeAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2419:1: ( ( ( rule__Attribute__TypeAssignment_6 ) ) )
            // InternalCls.g:2420:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            {
            // InternalCls.g:2420:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            // InternalCls.g:2421:1: ( rule__Attribute__TypeAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_6()); 
            // InternalCls.g:2422:1: ( rule__Attribute__TypeAssignment_6 )
            // InternalCls.g:2422:2: rule__Attribute__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalCls.g:2446:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2450:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalCls.g:2451:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalCls.g:2458:1: rule__Method__Group__0__Impl : ( ( rule__Method__VisibilityAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2462:1: ( ( ( rule__Method__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2463:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2463:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            // InternalCls.g:2464:1: ( rule__Method__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2465:1: ( rule__Method__VisibilityAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=12 && LA27_0<=18)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:2465:2: rule__Method__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalCls.g:2475:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2479:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalCls.g:2480:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalCls.g:2487:1: rule__Method__Group__1__Impl : ( ( rule__Method__AbstractAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2491:1: ( ( ( rule__Method__AbstractAssignment_1 )? ) )
            // InternalCls.g:2492:1: ( ( rule__Method__AbstractAssignment_1 )? )
            {
            // InternalCls.g:2492:1: ( ( rule__Method__AbstractAssignment_1 )? )
            // InternalCls.g:2493:1: ( rule__Method__AbstractAssignment_1 )?
            {
             before(grammarAccess.getMethodAccess().getAbstractAssignment_1()); 
            // InternalCls.g:2494:1: ( rule__Method__AbstractAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCls.g:2494:2: rule__Method__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__AbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getAbstractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalCls.g:2504:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2508:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalCls.g:2509:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalCls.g:2516:1: rule__Method__Group__2__Impl : ( ( rule__Method__StaticAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2520:1: ( ( ( rule__Method__StaticAssignment_2 )? ) )
            // InternalCls.g:2521:1: ( ( rule__Method__StaticAssignment_2 )? )
            {
            // InternalCls.g:2521:1: ( ( rule__Method__StaticAssignment_2 )? )
            // InternalCls.g:2522:1: ( rule__Method__StaticAssignment_2 )?
            {
             before(grammarAccess.getMethodAccess().getStaticAssignment_2()); 
            // InternalCls.g:2523:1: ( rule__Method__StaticAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:2523:2: rule__Method__StaticAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__StaticAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getStaticAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalCls.g:2533:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2537:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalCls.g:2538:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalCls.g:2545:1: rule__Method__Group__3__Impl : ( ( rule__Method__FinalAssignment_3 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2549:1: ( ( ( rule__Method__FinalAssignment_3 )? ) )
            // InternalCls.g:2550:1: ( ( rule__Method__FinalAssignment_3 )? )
            {
            // InternalCls.g:2550:1: ( ( rule__Method__FinalAssignment_3 )? )
            // InternalCls.g:2551:1: ( rule__Method__FinalAssignment_3 )?
            {
             before(grammarAccess.getMethodAccess().getFinalAssignment_3()); 
            // InternalCls.g:2552:1: ( rule__Method__FinalAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCls.g:2552:2: rule__Method__FinalAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__FinalAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getFinalAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalCls.g:2562:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2566:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalCls.g:2567:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalCls.g:2574:1: rule__Method__Group__4__Impl : ( ( rule__Method__ReferencedElementAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2578:1: ( ( ( rule__Method__ReferencedElementAssignment_4 ) ) )
            // InternalCls.g:2579:1: ( ( rule__Method__ReferencedElementAssignment_4 ) )
            {
            // InternalCls.g:2579:1: ( ( rule__Method__ReferencedElementAssignment_4 ) )
            // InternalCls.g:2580:1: ( rule__Method__ReferencedElementAssignment_4 )
            {
             before(grammarAccess.getMethodAccess().getReferencedElementAssignment_4()); 
            // InternalCls.g:2581:1: ( rule__Method__ReferencedElementAssignment_4 )
            // InternalCls.g:2581:2: rule__Method__ReferencedElementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Method__ReferencedElementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getReferencedElementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalCls.g:2591:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2595:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalCls.g:2596:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalCls.g:2603:1: rule__Method__Group__5__Impl : ( '(' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2607:1: ( ( '(' ) )
            // InternalCls.g:2608:1: ( '(' )
            {
            // InternalCls.g:2608:1: ( '(' )
            // InternalCls.g:2609:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalCls.g:2622:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2626:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalCls.g:2627:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Method__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalCls.g:2634:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )* ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2638:1: ( ( ( rule__Method__Group_6__0 )* ) )
            // InternalCls.g:2639:1: ( ( rule__Method__Group_6__0 )* )
            {
            // InternalCls.g:2639:1: ( ( rule__Method__Group_6__0 )* )
            // InternalCls.g:2640:1: ( rule__Method__Group_6__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalCls.g:2641:1: ( rule__Method__Group_6__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=12 && LA31_0<=18)||(LA31_0>=53 && LA31_0<=54)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCls.g:2641:2: rule__Method__Group_6__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Method__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // InternalCls.g:2651:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2655:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalCls.g:2656:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Method__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // InternalCls.g:2663:1: rule__Method__Group__7__Impl : ( ')' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2667:1: ( ( ')' ) )
            // InternalCls.g:2668:1: ( ')' )
            {
            // InternalCls.g:2668:1: ( ')' )
            // InternalCls.g:2669:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group__8"
    // InternalCls.g:2682:1: rule__Method__Group__8 : rule__Method__Group__8__Impl ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2686:1: ( rule__Method__Group__8__Impl )
            // InternalCls.g:2687:2: rule__Method__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8"


    // $ANTLR start "rule__Method__Group__8__Impl"
    // InternalCls.g:2693:1: rule__Method__Group__8__Impl : ( ( rule__Method__Group_8__0 )? ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2697:1: ( ( ( rule__Method__Group_8__0 )? ) )
            // InternalCls.g:2698:1: ( ( rule__Method__Group_8__0 )? )
            {
            // InternalCls.g:2698:1: ( ( rule__Method__Group_8__0 )? )
            // InternalCls.g:2699:1: ( rule__Method__Group_8__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_8()); 
            // InternalCls.g:2700:1: ( rule__Method__Group_8__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCls.g:2700:2: rule__Method__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8__Impl"


    // $ANTLR start "rule__Method__Group_6__0"
    // InternalCls.g:2728:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2732:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalCls.g:2733:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_26);
            rule__Method__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__0"


    // $ANTLR start "rule__Method__Group_6__0__Impl"
    // InternalCls.g:2740:1: rule__Method__Group_6__0__Impl : ( ( rule__Method__ParametersAssignment_6_0 ) ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2744:1: ( ( ( rule__Method__ParametersAssignment_6_0 ) ) )
            // InternalCls.g:2745:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            {
            // InternalCls.g:2745:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            // InternalCls.g:2746:1: ( rule__Method__ParametersAssignment_6_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_0()); 
            // InternalCls.g:2747:1: ( rule__Method__ParametersAssignment_6_0 )
            // InternalCls.g:2747:2: rule__Method__ParametersAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__0__Impl"


    // $ANTLR start "rule__Method__Group_6__1"
    // InternalCls.g:2757:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2761:1: ( rule__Method__Group_6__1__Impl )
            // InternalCls.g:2762:2: rule__Method__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__1"


    // $ANTLR start "rule__Method__Group_6__1__Impl"
    // InternalCls.g:2768:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Group_6_1__0 )* ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2772:1: ( ( ( rule__Method__Group_6_1__0 )* ) )
            // InternalCls.g:2773:1: ( ( rule__Method__Group_6_1__0 )* )
            {
            // InternalCls.g:2773:1: ( ( rule__Method__Group_6_1__0 )* )
            // InternalCls.g:2774:1: ( rule__Method__Group_6_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6_1()); 
            // InternalCls.g:2775:1: ( rule__Method__Group_6_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCls.g:2775:2: rule__Method__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Method__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__1__Impl"


    // $ANTLR start "rule__Method__Group_6_1__0"
    // InternalCls.g:2789:1: rule__Method__Group_6_1__0 : rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
    public final void rule__Method__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2793:1: ( rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
            // InternalCls.g:2794:2: rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Method__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__0"


    // $ANTLR start "rule__Method__Group_6_1__0__Impl"
    // InternalCls.g:2801:1: rule__Method__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2805:1: ( ( ',' ) )
            // InternalCls.g:2806:1: ( ',' )
            {
            // InternalCls.g:2806:1: ( ',' )
            // InternalCls.g:2807:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_6_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__0__Impl"


    // $ANTLR start "rule__Method__Group_6_1__1"
    // InternalCls.g:2820:1: rule__Method__Group_6_1__1 : rule__Method__Group_6_1__1__Impl ;
    public final void rule__Method__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2824:1: ( rule__Method__Group_6_1__1__Impl )
            // InternalCls.g:2825:2: rule__Method__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__1"


    // $ANTLR start "rule__Method__Group_6_1__1__Impl"
    // InternalCls.g:2831:1: rule__Method__Group_6_1__1__Impl : ( ( rule__Method__ParametersAssignment_6_1_1 ) ) ;
    public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2835:1: ( ( ( rule__Method__ParametersAssignment_6_1_1 ) ) )
            // InternalCls.g:2836:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            {
            // InternalCls.g:2836:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            // InternalCls.g:2837:1: ( rule__Method__ParametersAssignment_6_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_1_1()); 
            // InternalCls.g:2838:1: ( rule__Method__ParametersAssignment_6_1_1 )
            // InternalCls.g:2838:2: rule__Method__ParametersAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__1__Impl"


    // $ANTLR start "rule__Method__Group_8__0"
    // InternalCls.g:2852:1: rule__Method__Group_8__0 : rule__Method__Group_8__0__Impl rule__Method__Group_8__1 ;
    public final void rule__Method__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2856:1: ( rule__Method__Group_8__0__Impl rule__Method__Group_8__1 )
            // InternalCls.g:2857:2: rule__Method__Group_8__0__Impl rule__Method__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__Method__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_8__0"


    // $ANTLR start "rule__Method__Group_8__0__Impl"
    // InternalCls.g:2864:1: rule__Method__Group_8__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2868:1: ( ( ':' ) )
            // InternalCls.g:2869:1: ( ':' )
            {
            // InternalCls.g:2869:1: ( ':' )
            // InternalCls.g:2870:1: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_8_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_8__0__Impl"


    // $ANTLR start "rule__Method__Group_8__1"
    // InternalCls.g:2883:1: rule__Method__Group_8__1 : rule__Method__Group_8__1__Impl ;
    public final void rule__Method__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2887:1: ( rule__Method__Group_8__1__Impl )
            // InternalCls.g:2888:2: rule__Method__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_8__1"


    // $ANTLR start "rule__Method__Group_8__1__Impl"
    // InternalCls.g:2894:1: rule__Method__Group_8__1__Impl : ( ( rule__Method__TypeAssignment_8_1 ) ) ;
    public final void rule__Method__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2898:1: ( ( ( rule__Method__TypeAssignment_8_1 ) ) )
            // InternalCls.g:2899:1: ( ( rule__Method__TypeAssignment_8_1 ) )
            {
            // InternalCls.g:2899:1: ( ( rule__Method__TypeAssignment_8_1 ) )
            // InternalCls.g:2900:1: ( rule__Method__TypeAssignment_8_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_8_1()); 
            // InternalCls.g:2901:1: ( rule__Method__TypeAssignment_8_1 )
            // InternalCls.g:2901:2: rule__Method__TypeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__TypeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_8__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalCls.g:2915:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2919:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCls.g:2920:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalCls.g:2927:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__VisibilityAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2931:1: ( ( ( rule__Parameter__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2932:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2932:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            // InternalCls.g:2933:1: ( rule__Parameter__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2934:1: ( rule__Parameter__VisibilityAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=12 && LA34_0<=18)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCls.g:2934:2: rule__Parameter__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalCls.g:2944:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2948:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCls.g:2949:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalCls.g:2956:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__StaticAssignment_1 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2960:1: ( ( ( rule__Parameter__StaticAssignment_1 )? ) )
            // InternalCls.g:2961:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            {
            // InternalCls.g:2961:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            // InternalCls.g:2962:1: ( rule__Parameter__StaticAssignment_1 )?
            {
             before(grammarAccess.getParameterAccess().getStaticAssignment_1()); 
            // InternalCls.g:2963:1: ( rule__Parameter__StaticAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:2963:2: rule__Parameter__StaticAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__StaticAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getStaticAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalCls.g:2973:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2977:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCls.g:2978:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalCls.g:2985:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__FinalAssignment_2 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2989:1: ( ( ( rule__Parameter__FinalAssignment_2 )? ) )
            // InternalCls.g:2990:1: ( ( rule__Parameter__FinalAssignment_2 )? )
            {
            // InternalCls.g:2990:1: ( ( rule__Parameter__FinalAssignment_2 )? )
            // InternalCls.g:2991:1: ( rule__Parameter__FinalAssignment_2 )?
            {
             before(grammarAccess.getParameterAccess().getFinalAssignment_2()); 
            // InternalCls.g:2992:1: ( rule__Parameter__FinalAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==54) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCls.g:2992:2: rule__Parameter__FinalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__FinalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getFinalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalCls.g:3002:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3006:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalCls.g:3007:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalCls.g:3014:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ReferencedElementAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3018:1: ( ( ( rule__Parameter__ReferencedElementAssignment_3 ) ) )
            // InternalCls.g:3019:1: ( ( rule__Parameter__ReferencedElementAssignment_3 ) )
            {
            // InternalCls.g:3019:1: ( ( rule__Parameter__ReferencedElementAssignment_3 ) )
            // InternalCls.g:3020:1: ( rule__Parameter__ReferencedElementAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getReferencedElementAssignment_3()); 
            // InternalCls.g:3021:1: ( rule__Parameter__ReferencedElementAssignment_3 )
            // InternalCls.g:3021:2: rule__Parameter__ReferencedElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ReferencedElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getReferencedElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalCls.g:3031:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3035:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalCls.g:3036:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalCls.g:3043:1: rule__Parameter__Group__4__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3047:1: ( ( ':' ) )
            // InternalCls.g:3048:1: ( ':' )
            {
            // InternalCls.g:3048:1: ( ':' )
            // InternalCls.g:3049:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalCls.g:3062:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3066:1: ( rule__Parameter__Group__5__Impl )
            // InternalCls.g:3067:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalCls.g:3073:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__TypeAssignment_5 ) ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3077:1: ( ( ( rule__Parameter__TypeAssignment_5 ) ) )
            // InternalCls.g:3078:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            {
            // InternalCls.g:3078:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            // InternalCls.g:3079:1: ( rule__Parameter__TypeAssignment_5 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_5()); 
            // InternalCls.g:3080:1: ( rule__Parameter__TypeAssignment_5 )
            // InternalCls.g:3080:2: rule__Parameter__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Generalization__Group__0"
    // InternalCls.g:3102:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3106:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalCls.g:3107:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Generalization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__0"


    // $ANTLR start "rule__Generalization__Group__0__Impl"
    // InternalCls.g:3114:1: rule__Generalization__Group__0__Impl : ( ( rule__Generalization__LeftAssignment_0 ) ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3118:1: ( ( ( rule__Generalization__LeftAssignment_0 ) ) )
            // InternalCls.g:3119:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            {
            // InternalCls.g:3119:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            // InternalCls.g:3120:1: ( rule__Generalization__LeftAssignment_0 )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssignment_0()); 
            // InternalCls.g:3121:1: ( rule__Generalization__LeftAssignment_0 )
            // InternalCls.g:3121:2: rule__Generalization__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__0__Impl"


    // $ANTLR start "rule__Generalization__Group__1"
    // InternalCls.g:3131:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3135:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalCls.g:3136:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Generalization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__1"


    // $ANTLR start "rule__Generalization__Group__1__Impl"
    // InternalCls.g:3143:1: rule__Generalization__Group__1__Impl : ( 'isa' ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3147:1: ( ( 'isa' ) )
            // InternalCls.g:3148:1: ( 'isa' )
            {
            // InternalCls.g:3148:1: ( 'isa' )
            // InternalCls.g:3149:1: 'isa'
            {
             before(grammarAccess.getGeneralizationAccess().getIsaKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getIsaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__1__Impl"


    // $ANTLR start "rule__Generalization__Group__2"
    // InternalCls.g:3162:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3166:1: ( rule__Generalization__Group__2__Impl )
            // InternalCls.g:3167:2: rule__Generalization__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__2"


    // $ANTLR start "rule__Generalization__Group__2__Impl"
    // InternalCls.g:3173:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__RightAssignment_2 ) ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3177:1: ( ( ( rule__Generalization__RightAssignment_2 ) ) )
            // InternalCls.g:3178:1: ( ( rule__Generalization__RightAssignment_2 ) )
            {
            // InternalCls.g:3178:1: ( ( rule__Generalization__RightAssignment_2 ) )
            // InternalCls.g:3179:1: ( rule__Generalization__RightAssignment_2 )
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssignment_2()); 
            // InternalCls.g:3180:1: ( rule__Generalization__RightAssignment_2 )
            // InternalCls.g:3180:2: rule__Generalization__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__2__Impl"


    // $ANTLR start "rule__Implementation__Group__0"
    // InternalCls.g:3196:1: rule__Implementation__Group__0 : rule__Implementation__Group__0__Impl rule__Implementation__Group__1 ;
    public final void rule__Implementation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3200:1: ( rule__Implementation__Group__0__Impl rule__Implementation__Group__1 )
            // InternalCls.g:3201:2: rule__Implementation__Group__0__Impl rule__Implementation__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Implementation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__0"


    // $ANTLR start "rule__Implementation__Group__0__Impl"
    // InternalCls.g:3208:1: rule__Implementation__Group__0__Impl : ( ( rule__Implementation__LeftAssignment_0 ) ) ;
    public final void rule__Implementation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3212:1: ( ( ( rule__Implementation__LeftAssignment_0 ) ) )
            // InternalCls.g:3213:1: ( ( rule__Implementation__LeftAssignment_0 ) )
            {
            // InternalCls.g:3213:1: ( ( rule__Implementation__LeftAssignment_0 ) )
            // InternalCls.g:3214:1: ( rule__Implementation__LeftAssignment_0 )
            {
             before(grammarAccess.getImplementationAccess().getLeftAssignment_0()); 
            // InternalCls.g:3215:1: ( rule__Implementation__LeftAssignment_0 )
            // InternalCls.g:3215:2: rule__Implementation__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImplementationAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__0__Impl"


    // $ANTLR start "rule__Implementation__Group__1"
    // InternalCls.g:3225:1: rule__Implementation__Group__1 : rule__Implementation__Group__1__Impl rule__Implementation__Group__2 ;
    public final void rule__Implementation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3229:1: ( rule__Implementation__Group__1__Impl rule__Implementation__Group__2 )
            // InternalCls.g:3230:2: rule__Implementation__Group__1__Impl rule__Implementation__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Implementation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__1"


    // $ANTLR start "rule__Implementation__Group__1__Impl"
    // InternalCls.g:3237:1: rule__Implementation__Group__1__Impl : ( 'impl' ) ;
    public final void rule__Implementation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3241:1: ( ( 'impl' ) )
            // InternalCls.g:3242:1: ( 'impl' )
            {
            // InternalCls.g:3242:1: ( 'impl' )
            // InternalCls.g:3243:1: 'impl'
            {
             before(grammarAccess.getImplementationAccess().getImplKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getImplementationAccess().getImplKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__1__Impl"


    // $ANTLR start "rule__Implementation__Group__2"
    // InternalCls.g:3256:1: rule__Implementation__Group__2 : rule__Implementation__Group__2__Impl ;
    public final void rule__Implementation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3260:1: ( rule__Implementation__Group__2__Impl )
            // InternalCls.g:3261:2: rule__Implementation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__2"


    // $ANTLR start "rule__Implementation__Group__2__Impl"
    // InternalCls.g:3267:1: rule__Implementation__Group__2__Impl : ( ( rule__Implementation__RightAssignment_2 ) ) ;
    public final void rule__Implementation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3271:1: ( ( ( rule__Implementation__RightAssignment_2 ) ) )
            // InternalCls.g:3272:1: ( ( rule__Implementation__RightAssignment_2 ) )
            {
            // InternalCls.g:3272:1: ( ( rule__Implementation__RightAssignment_2 ) )
            // InternalCls.g:3273:1: ( rule__Implementation__RightAssignment_2 )
            {
             before(grammarAccess.getImplementationAccess().getRightAssignment_2()); 
            // InternalCls.g:3274:1: ( rule__Implementation__RightAssignment_2 )
            // InternalCls.g:3274:2: rule__Implementation__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImplementationAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__2__Impl"


    // $ANTLR start "rule__CommentLink__Group__0"
    // InternalCls.g:3290:1: rule__CommentLink__Group__0 : rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1 ;
    public final void rule__CommentLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3294:1: ( rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1 )
            // InternalCls.g:3295:2: rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__CommentLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommentLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentLink__Group__0"


    // $ANTLR start "rule__CommentLink__Group__0__Impl"
    // InternalCls.g:3302:1: rule__CommentLink__Group__0__Impl : ( ( rule__CommentLink__LeftAssignment_0 ) ) ;
    public final void rule__CommentLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3306:1: ( ( ( rule__CommentLink__LeftAssignment_0 ) ) )
            // InternalCls.g:3307:1: ( ( rule__CommentLink__LeftAssignment_0 ) )
            {
            // InternalCls.g:3307:1: ( ( rule__CommentLink__LeftAssignment_0 ) )
            // InternalCls.g:3308:1: ( rule__CommentLink__LeftAssignment_0 )
            {
             before(grammarAccess.getCommentLinkAccess().getLeftAssignment_0()); 
            // InternalCls.g:3309:1: ( rule__CommentLink__LeftAssignment_0 )
            // InternalCls.g:3309:2: rule__CommentLink__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CommentLink__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommentLinkAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentLink__Group__0__Impl"


    // $ANTLR start "rule__CommentLink__Group__1"
    // InternalCls.g:3319:1: rule__CommentLink__Group__1 : rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2 ;
    public final void rule__CommentLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3323:1: ( rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2 )
            // InternalCls.g:3324:2: rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CommentLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommentLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentLink__Group__1"


    // $ANTLR start "rule__CommentLink__Group__1__Impl"
    // InternalCls.g:3331:1: rule__CommentLink__Group__1__Impl : ( 'note' ) ;
    public final void rule__CommentLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3335:1: ( ( 'note' ) )
            // InternalCls.g:3336:1: ( 'note' )
            {
            // InternalCls.g:3336:1: ( 'note' )
            // InternalCls.g:3337:1: 'note'
            {
             before(grammarAccess.getCommentLinkAccess().getNoteKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCommentLinkAccess().getNoteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentLink__Group__1__Impl"


    // $ANTLR start "rule__CommentLink__Group__2"
    // InternalCls.g:3350:1: rule__CommentLink__Group__2 : rule__CommentLink__Group__2__Impl ;
    public final void rule__CommentLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3354:1: ( rule__CommentLink__Group__2__Impl )
            // InternalCls.g:3355:2: rule__CommentLink__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommentLink__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentLink__Group__2"


    // $ANTLR start "rule__CommentLink__Group__2__Impl"
    // InternalCls.g:3361:1: rule__CommentLink__Group__2__Impl : ( ( rule__CommentLink__CommentAssignment_2 ) ) ;
    public final void rule__CommentLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3365:1: ( ( ( rule__CommentLink__CommentAssignment_2 ) ) )
            // InternalCls.g:3366:1: ( ( rule__CommentLink__CommentAssignment_2 ) )
            {
            // InternalCls.g:3366:1: ( ( rule__CommentLink__CommentAssignment_2 ) )
            // InternalCls.g:3367:1: ( rule__CommentLink__CommentAssignment_2 )
            {
             before(grammarAccess.getCommentLinkAccess().getCommentAssignment_2()); 
            // InternalCls.g:3368:1: ( rule__CommentLink__CommentAssignment_2 )
            // InternalCls.g:3368:2: rule__CommentLink__CommentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CommentLink__CommentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommentLinkAccess().getCommentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentLink__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // InternalCls.g:3384:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3388:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalCls.g:3389:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // InternalCls.g:3396:1: rule__Association__Group__0__Impl : ( ( rule__Association__BidirectionalAssignment_0 )? ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3400:1: ( ( ( rule__Association__BidirectionalAssignment_0 )? ) )
            // InternalCls.g:3401:1: ( ( rule__Association__BidirectionalAssignment_0 )? )
            {
            // InternalCls.g:3401:1: ( ( rule__Association__BidirectionalAssignment_0 )? )
            // InternalCls.g:3402:1: ( rule__Association__BidirectionalAssignment_0 )?
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalAssignment_0()); 
            // InternalCls.g:3403:1: ( rule__Association__BidirectionalAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCls.g:3403:2: rule__Association__BidirectionalAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__BidirectionalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getBidirectionalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // InternalCls.g:3413:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3417:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalCls.g:3418:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // InternalCls.g:3425:1: rule__Association__Group__1__Impl : ( ( rule__Association__AggregationKindAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3429:1: ( ( ( rule__Association__AggregationKindAssignment_1 ) ) )
            // InternalCls.g:3430:1: ( ( rule__Association__AggregationKindAssignment_1 ) )
            {
            // InternalCls.g:3430:1: ( ( rule__Association__AggregationKindAssignment_1 ) )
            // InternalCls.g:3431:1: ( rule__Association__AggregationKindAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getAggregationKindAssignment_1()); 
            // InternalCls.g:3432:1: ( rule__Association__AggregationKindAssignment_1 )
            // InternalCls.g:3432:2: rule__Association__AggregationKindAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Association__AggregationKindAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAggregationKindAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // InternalCls.g:3442:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3446:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalCls.g:3447:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // InternalCls.g:3454:1: rule__Association__Group__2__Impl : ( ( rule__Association__LeftAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3458:1: ( ( ( rule__Association__LeftAssignment_2 ) ) )
            // InternalCls.g:3459:1: ( ( rule__Association__LeftAssignment_2 ) )
            {
            // InternalCls.g:3459:1: ( ( rule__Association__LeftAssignment_2 ) )
            // InternalCls.g:3460:1: ( rule__Association__LeftAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getLeftAssignment_2()); 
            // InternalCls.g:3461:1: ( rule__Association__LeftAssignment_2 )
            // InternalCls.g:3461:2: rule__Association__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Association__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // InternalCls.g:3471:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3475:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalCls.g:3476:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // InternalCls.g:3483:1: rule__Association__Group__3__Impl : ( ( rule__Association__ReferencedElementAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3487:1: ( ( ( rule__Association__ReferencedElementAssignment_3 ) ) )
            // InternalCls.g:3488:1: ( ( rule__Association__ReferencedElementAssignment_3 ) )
            {
            // InternalCls.g:3488:1: ( ( rule__Association__ReferencedElementAssignment_3 ) )
            // InternalCls.g:3489:1: ( rule__Association__ReferencedElementAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getReferencedElementAssignment_3()); 
            // InternalCls.g:3490:1: ( rule__Association__ReferencedElementAssignment_3 )
            // InternalCls.g:3490:2: rule__Association__ReferencedElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Association__ReferencedElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getReferencedElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // InternalCls.g:3500:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3504:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalCls.g:3505:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Association__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // InternalCls.g:3512:1: rule__Association__Group__4__Impl : ( ( rule__Association__RightAssignment_4 ) ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3516:1: ( ( ( rule__Association__RightAssignment_4 ) ) )
            // InternalCls.g:3517:1: ( ( rule__Association__RightAssignment_4 ) )
            {
            // InternalCls.g:3517:1: ( ( rule__Association__RightAssignment_4 ) )
            // InternalCls.g:3518:1: ( rule__Association__RightAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getRightAssignment_4()); 
            // InternalCls.g:3519:1: ( rule__Association__RightAssignment_4 )
            // InternalCls.g:3519:2: rule__Association__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Association__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getRightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Association__Group__5"
    // InternalCls.g:3529:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3533:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalCls.g:3534:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__Association__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5"


    // $ANTLR start "rule__Association__Group__5__Impl"
    // InternalCls.g:3541:1: rule__Association__Group__5__Impl : ( ( rule__Association__PropertiesAssignment_5 )? ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3545:1: ( ( ( rule__Association__PropertiesAssignment_5 )? ) )
            // InternalCls.g:3546:1: ( ( rule__Association__PropertiesAssignment_5 )? )
            {
            // InternalCls.g:3546:1: ( ( rule__Association__PropertiesAssignment_5 )? )
            // InternalCls.g:3547:1: ( rule__Association__PropertiesAssignment_5 )?
            {
             before(grammarAccess.getAssociationAccess().getPropertiesAssignment_5()); 
            // InternalCls.g:3548:1: ( rule__Association__PropertiesAssignment_5 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:3548:2: rule__Association__PropertiesAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__PropertiesAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getPropertiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5__Impl"


    // $ANTLR start "rule__Association__Group__6"
    // InternalCls.g:3558:1: rule__Association__Group__6 : rule__Association__Group__6__Impl ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3562:1: ( rule__Association__Group__6__Impl )
            // InternalCls.g:3563:2: rule__Association__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6"


    // $ANTLR start "rule__Association__Group__6__Impl"
    // InternalCls.g:3569:1: rule__Association__Group__6__Impl : ( ( rule__Association__Group_6__0 )? ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3573:1: ( ( ( rule__Association__Group_6__0 )? ) )
            // InternalCls.g:3574:1: ( ( rule__Association__Group_6__0 )? )
            {
            // InternalCls.g:3574:1: ( ( rule__Association__Group_6__0 )? )
            // InternalCls.g:3575:1: ( rule__Association__Group_6__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_6()); 
            // InternalCls.g:3576:1: ( rule__Association__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==46) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCls.g:3576:2: rule__Association__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6__Impl"


    // $ANTLR start "rule__Association__Group_6__0"
    // InternalCls.g:3600:1: rule__Association__Group_6__0 : rule__Association__Group_6__0__Impl rule__Association__Group_6__1 ;
    public final void rule__Association__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3604:1: ( rule__Association__Group_6__0__Impl rule__Association__Group_6__1 )
            // InternalCls.g:3605:2: rule__Association__Group_6__0__Impl rule__Association__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__0"


    // $ANTLR start "rule__Association__Group_6__0__Impl"
    // InternalCls.g:3612:1: rule__Association__Group_6__0__Impl : ( 'note' ) ;
    public final void rule__Association__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3616:1: ( ( 'note' ) )
            // InternalCls.g:3617:1: ( 'note' )
            {
            // InternalCls.g:3617:1: ( 'note' )
            // InternalCls.g:3618:1: 'note'
            {
             before(grammarAccess.getAssociationAccess().getNoteKeyword_6_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getNoteKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__0__Impl"


    // $ANTLR start "rule__Association__Group_6__1"
    // InternalCls.g:3631:1: rule__Association__Group_6__1 : rule__Association__Group_6__1__Impl ;
    public final void rule__Association__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3635:1: ( rule__Association__Group_6__1__Impl )
            // InternalCls.g:3636:2: rule__Association__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__1"


    // $ANTLR start "rule__Association__Group_6__1__Impl"
    // InternalCls.g:3642:1: rule__Association__Group_6__1__Impl : ( ( rule__Association__CommentAssignment_6_1 ) ) ;
    public final void rule__Association__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3646:1: ( ( ( rule__Association__CommentAssignment_6_1 ) ) )
            // InternalCls.g:3647:1: ( ( rule__Association__CommentAssignment_6_1 ) )
            {
            // InternalCls.g:3647:1: ( ( rule__Association__CommentAssignment_6_1 ) )
            // InternalCls.g:3648:1: ( rule__Association__CommentAssignment_6_1 )
            {
             before(grammarAccess.getAssociationAccess().getCommentAssignment_6_1()); 
            // InternalCls.g:3649:1: ( rule__Association__CommentAssignment_6_1 )
            // InternalCls.g:3649:2: rule__Association__CommentAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Association__CommentAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getCommentAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__1__Impl"


    // $ANTLR start "rule__MultiAssociation__Group__0"
    // InternalCls.g:3663:1: rule__MultiAssociation__Group__0 : rule__MultiAssociation__Group__0__Impl rule__MultiAssociation__Group__1 ;
    public final void rule__MultiAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3667:1: ( rule__MultiAssociation__Group__0__Impl rule__MultiAssociation__Group__1 )
            // InternalCls.g:3668:2: rule__MultiAssociation__Group__0__Impl rule__MultiAssociation__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MultiAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiAssociation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group__0"


    // $ANTLR start "rule__MultiAssociation__Group__0__Impl"
    // InternalCls.g:3675:1: rule__MultiAssociation__Group__0__Impl : ( 'asc' ) ;
    public final void rule__MultiAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3679:1: ( ( 'asc' ) )
            // InternalCls.g:3680:1: ( 'asc' )
            {
            // InternalCls.g:3680:1: ( 'asc' )
            // InternalCls.g:3681:1: 'asc'
            {
             before(grammarAccess.getMultiAssociationAccess().getAscKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMultiAssociationAccess().getAscKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group__0__Impl"


    // $ANTLR start "rule__MultiAssociation__Group__1"
    // InternalCls.g:3694:1: rule__MultiAssociation__Group__1 : rule__MultiAssociation__Group__1__Impl rule__MultiAssociation__Group__2 ;
    public final void rule__MultiAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3698:1: ( rule__MultiAssociation__Group__1__Impl rule__MultiAssociation__Group__2 )
            // InternalCls.g:3699:2: rule__MultiAssociation__Group__1__Impl rule__MultiAssociation__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__MultiAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiAssociation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group__1"


    // $ANTLR start "rule__MultiAssociation__Group__1__Impl"
    // InternalCls.g:3706:1: rule__MultiAssociation__Group__1__Impl : ( ( rule__MultiAssociation__ReferencedElementAssignment_1 ) ) ;
    public final void rule__MultiAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3710:1: ( ( ( rule__MultiAssociation__ReferencedElementAssignment_1 ) ) )
            // InternalCls.g:3711:1: ( ( rule__MultiAssociation__ReferencedElementAssignment_1 ) )
            {
            // InternalCls.g:3711:1: ( ( rule__MultiAssociation__ReferencedElementAssignment_1 ) )
            // InternalCls.g:3712:1: ( rule__MultiAssociation__ReferencedElementAssignment_1 )
            {
             before(grammarAccess.getMultiAssociationAccess().getReferencedElementAssignment_1()); 
            // InternalCls.g:3713:1: ( rule__MultiAssociation__ReferencedElementAssignment_1 )
            // InternalCls.g:3713:2: rule__MultiAssociation__ReferencedElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiAssociation__ReferencedElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiAssociationAccess().getReferencedElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group__1__Impl"


    // $ANTLR start "rule__MultiAssociation__Group__2"
    // InternalCls.g:3723:1: rule__MultiAssociation__Group__2 : rule__MultiAssociation__Group__2__Impl rule__MultiAssociation__Group__3 ;
    public final void rule__MultiAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3727:1: ( rule__MultiAssociation__Group__2__Impl rule__MultiAssociation__Group__3 )
            // InternalCls.g:3728:2: rule__MultiAssociation__Group__2__Impl rule__MultiAssociation__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MultiAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiAssociation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group__2"


    // $ANTLR start "rule__MultiAssociation__Group__2__Impl"
    // InternalCls.g:3735:1: rule__MultiAssociation__Group__2__Impl : ( '{' ) ;
    public final void rule__MultiAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3739:1: ( ( '{' ) )
            // InternalCls.g:3740:1: ( '{' )
            {
            // InternalCls.g:3740:1: ( '{' )
            // InternalCls.g:3741:1: '{'
            {
             before(grammarAccess.getMultiAssociationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMultiAssociationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group__2__Impl"


    // $ANTLR start "rule__MultiAssociation__Group__3"
    // InternalCls.g:3754:1: rule__MultiAssociation__Group__3 : rule__MultiAssociation__Group__3__Impl rule__MultiAssociation__Group__4 ;
    public final void rule__MultiAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3758:1: ( rule__MultiAssociation__Group__3__Impl rule__MultiAssociation__Group__4 )
            // InternalCls.g:3759:2: rule__MultiAssociation__Group__3__Impl rule__MultiAssociation__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__MultiAssociation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiAssociation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group__3"


    // $ANTLR start "rule__MultiAssociation__Group__3__Impl"
    // InternalCls.g:3766:1: rule__MultiAssociation__Group__3__Impl : ( ( ( rule__MultiAssociation__Group_3__0 ) ) ( ( rule__MultiAssociation__Group_3__0 )* ) ) ;
    public final void rule__MultiAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3770:1: ( ( ( ( rule__MultiAssociation__Group_3__0 ) ) ( ( rule__MultiAssociation__Group_3__0 )* ) ) )
            // InternalCls.g:3771:1: ( ( ( rule__MultiAssociation__Group_3__0 ) ) ( ( rule__MultiAssociation__Group_3__0 )* ) )
            {
            // InternalCls.g:3771:1: ( ( ( rule__MultiAssociation__Group_3__0 ) ) ( ( rule__MultiAssociation__Group_3__0 )* ) )
            // InternalCls.g:3772:1: ( ( rule__MultiAssociation__Group_3__0 ) ) ( ( rule__MultiAssociation__Group_3__0 )* )
            {
            // InternalCls.g:3772:1: ( ( rule__MultiAssociation__Group_3__0 ) )
            // InternalCls.g:3773:1: ( rule__MultiAssociation__Group_3__0 )
            {
             before(grammarAccess.getMultiAssociationAccess().getGroup_3()); 
            // InternalCls.g:3774:1: ( rule__MultiAssociation__Group_3__0 )
            // InternalCls.g:3774:2: rule__MultiAssociation__Group_3__0
            {
            pushFollow(FOLLOW_34);
            rule__MultiAssociation__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiAssociationAccess().getGroup_3()); 

            }

            // InternalCls.g:3777:1: ( ( rule__MultiAssociation__Group_3__0 )* )
            // InternalCls.g:3778:1: ( rule__MultiAssociation__Group_3__0 )*
            {
             before(grammarAccess.getMultiAssociationAccess().getGroup_3()); 
            // InternalCls.g:3779:1: ( rule__MultiAssociation__Group_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCls.g:3779:2: rule__MultiAssociation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__MultiAssociation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getMultiAssociationAccess().getGroup_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group__3__Impl"


    // $ANTLR start "rule__MultiAssociation__Group__4"
    // InternalCls.g:3790:1: rule__MultiAssociation__Group__4 : rule__MultiAssociation__Group__4__Impl ;
    public final void rule__MultiAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3794:1: ( rule__MultiAssociation__Group__4__Impl )
            // InternalCls.g:3795:2: rule__MultiAssociation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiAssociation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group__4"


    // $ANTLR start "rule__MultiAssociation__Group__4__Impl"
    // InternalCls.g:3801:1: rule__MultiAssociation__Group__4__Impl : ( '}' ) ;
    public final void rule__MultiAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3805:1: ( ( '}' ) )
            // InternalCls.g:3806:1: ( '}' )
            {
            // InternalCls.g:3806:1: ( '}' )
            // InternalCls.g:3807:1: '}'
            {
             before(grammarAccess.getMultiAssociationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMultiAssociationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group__4__Impl"


    // $ANTLR start "rule__MultiAssociation__Group_3__0"
    // InternalCls.g:3830:1: rule__MultiAssociation__Group_3__0 : rule__MultiAssociation__Group_3__0__Impl rule__MultiAssociation__Group_3__1 ;
    public final void rule__MultiAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3834:1: ( rule__MultiAssociation__Group_3__0__Impl rule__MultiAssociation__Group_3__1 )
            // InternalCls.g:3835:2: rule__MultiAssociation__Group_3__0__Impl rule__MultiAssociation__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__MultiAssociation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiAssociation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group_3__0"


    // $ANTLR start "rule__MultiAssociation__Group_3__0__Impl"
    // InternalCls.g:3842:1: rule__MultiAssociation__Group_3__0__Impl : ( ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 ) ) ;
    public final void rule__MultiAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3846:1: ( ( ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 ) ) )
            // InternalCls.g:3847:1: ( ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 ) )
            {
            // InternalCls.g:3847:1: ( ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 ) )
            // InternalCls.g:3848:1: ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 )
            {
             before(grammarAccess.getMultiAssociationAccess().getConnectorEndsAssignment_3_0()); 
            // InternalCls.g:3849:1: ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 )
            // InternalCls.g:3849:2: rule__MultiAssociation__ConnectorEndsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiAssociation__ConnectorEndsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiAssociationAccess().getConnectorEndsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group_3__0__Impl"


    // $ANTLR start "rule__MultiAssociation__Group_3__1"
    // InternalCls.g:3859:1: rule__MultiAssociation__Group_3__1 : rule__MultiAssociation__Group_3__1__Impl ;
    public final void rule__MultiAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3863:1: ( rule__MultiAssociation__Group_3__1__Impl )
            // InternalCls.g:3864:2: rule__MultiAssociation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiAssociation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group_3__1"


    // $ANTLR start "rule__MultiAssociation__Group_3__1__Impl"
    // InternalCls.g:3870:1: rule__MultiAssociation__Group_3__1__Impl : ( ';' ) ;
    public final void rule__MultiAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3874:1: ( ( ';' ) )
            // InternalCls.g:3875:1: ( ';' )
            {
            // InternalCls.g:3875:1: ( ';' )
            // InternalCls.g:3876:1: ';'
            {
             before(grammarAccess.getMultiAssociationAccess().getSemicolonKeyword_3_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMultiAssociationAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__Group_3__1__Impl"


    // $ANTLR start "rule__MemberEnd__Group__0"
    // InternalCls.g:3893:1: rule__MemberEnd__Group__0 : rule__MemberEnd__Group__0__Impl rule__MemberEnd__Group__1 ;
    public final void rule__MemberEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3897:1: ( rule__MemberEnd__Group__0__Impl rule__MemberEnd__Group__1 )
            // InternalCls.g:3898:2: rule__MemberEnd__Group__0__Impl rule__MemberEnd__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__MemberEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__0"


    // $ANTLR start "rule__MemberEnd__Group__0__Impl"
    // InternalCls.g:3905:1: rule__MemberEnd__Group__0__Impl : ( ( rule__MemberEnd__TypeAssignment_0 ) ) ;
    public final void rule__MemberEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3909:1: ( ( ( rule__MemberEnd__TypeAssignment_0 ) ) )
            // InternalCls.g:3910:1: ( ( rule__MemberEnd__TypeAssignment_0 ) )
            {
            // InternalCls.g:3910:1: ( ( rule__MemberEnd__TypeAssignment_0 ) )
            // InternalCls.g:3911:1: ( rule__MemberEnd__TypeAssignment_0 )
            {
             before(grammarAccess.getMemberEndAccess().getTypeAssignment_0()); 
            // InternalCls.g:3912:1: ( rule__MemberEnd__TypeAssignment_0 )
            // InternalCls.g:3912:2: rule__MemberEnd__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MemberEnd__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberEndAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__0__Impl"


    // $ANTLR start "rule__MemberEnd__Group__1"
    // InternalCls.g:3922:1: rule__MemberEnd__Group__1 : rule__MemberEnd__Group__1__Impl rule__MemberEnd__Group__2 ;
    public final void rule__MemberEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3926:1: ( rule__MemberEnd__Group__1__Impl rule__MemberEnd__Group__2 )
            // InternalCls.g:3927:2: rule__MemberEnd__Group__1__Impl rule__MemberEnd__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__MemberEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__1"


    // $ANTLR start "rule__MemberEnd__Group__1__Impl"
    // InternalCls.g:3934:1: rule__MemberEnd__Group__1__Impl : ( ( rule__MemberEnd__ReferencedElementAssignment_1 )? ) ;
    public final void rule__MemberEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3938:1: ( ( ( rule__MemberEnd__ReferencedElementAssignment_1 )? ) )
            // InternalCls.g:3939:1: ( ( rule__MemberEnd__ReferencedElementAssignment_1 )? )
            {
            // InternalCls.g:3939:1: ( ( rule__MemberEnd__ReferencedElementAssignment_1 )? )
            // InternalCls.g:3940:1: ( rule__MemberEnd__ReferencedElementAssignment_1 )?
            {
             before(grammarAccess.getMemberEndAccess().getReferencedElementAssignment_1()); 
            // InternalCls.g:3941:1: ( rule__MemberEnd__ReferencedElementAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCls.g:3941:2: rule__MemberEnd__ReferencedElementAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberEnd__ReferencedElementAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberEndAccess().getReferencedElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__1__Impl"


    // $ANTLR start "rule__MemberEnd__Group__2"
    // InternalCls.g:3951:1: rule__MemberEnd__Group__2 : rule__MemberEnd__Group__2__Impl rule__MemberEnd__Group__3 ;
    public final void rule__MemberEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3955:1: ( rule__MemberEnd__Group__2__Impl rule__MemberEnd__Group__3 )
            // InternalCls.g:3956:2: rule__MemberEnd__Group__2__Impl rule__MemberEnd__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__MemberEnd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__2"


    // $ANTLR start "rule__MemberEnd__Group__2__Impl"
    // InternalCls.g:3963:1: rule__MemberEnd__Group__2__Impl : ( ( rule__MemberEnd__CardinalityAssignment_2 )? ) ;
    public final void rule__MemberEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3967:1: ( ( ( rule__MemberEnd__CardinalityAssignment_2 )? ) )
            // InternalCls.g:3968:1: ( ( rule__MemberEnd__CardinalityAssignment_2 )? )
            {
            // InternalCls.g:3968:1: ( ( rule__MemberEnd__CardinalityAssignment_2 )? )
            // InternalCls.g:3969:1: ( rule__MemberEnd__CardinalityAssignment_2 )?
            {
             before(grammarAccess.getMemberEndAccess().getCardinalityAssignment_2()); 
            // InternalCls.g:3970:1: ( rule__MemberEnd__CardinalityAssignment_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT||LA42_0==11) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCls.g:3970:2: rule__MemberEnd__CardinalityAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberEnd__CardinalityAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberEndAccess().getCardinalityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__2__Impl"


    // $ANTLR start "rule__MemberEnd__Group__3"
    // InternalCls.g:3980:1: rule__MemberEnd__Group__3 : rule__MemberEnd__Group__3__Impl ;
    public final void rule__MemberEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3984:1: ( rule__MemberEnd__Group__3__Impl )
            // InternalCls.g:3985:2: rule__MemberEnd__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberEnd__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__3"


    // $ANTLR start "rule__MemberEnd__Group__3__Impl"
    // InternalCls.g:3991:1: rule__MemberEnd__Group__3__Impl : ( ( rule__MemberEnd__NavigableAssignment_3 ) ) ;
    public final void rule__MemberEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3995:1: ( ( ( rule__MemberEnd__NavigableAssignment_3 ) ) )
            // InternalCls.g:3996:1: ( ( rule__MemberEnd__NavigableAssignment_3 ) )
            {
            // InternalCls.g:3996:1: ( ( rule__MemberEnd__NavigableAssignment_3 ) )
            // InternalCls.g:3997:1: ( rule__MemberEnd__NavigableAssignment_3 )
            {
             before(grammarAccess.getMemberEndAccess().getNavigableAssignment_3()); 
            // InternalCls.g:3998:1: ( rule__MemberEnd__NavigableAssignment_3 )
            // InternalCls.g:3998:2: rule__MemberEnd__NavigableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MemberEnd__NavigableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMemberEndAccess().getNavigableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__Group__3__Impl"


    // $ANTLR start "rule__AssociationProperties__Group__0"
    // InternalCls.g:4016:1: rule__AssociationProperties__Group__0 : rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1 ;
    public final void rule__AssociationProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4020:1: ( rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1 )
            // InternalCls.g:4021:2: rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__AssociationProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group__0"


    // $ANTLR start "rule__AssociationProperties__Group__0__Impl"
    // InternalCls.g:4028:1: rule__AssociationProperties__Group__0__Impl : ( '[' ) ;
    public final void rule__AssociationProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4032:1: ( ( '[' ) )
            // InternalCls.g:4033:1: ( '[' )
            {
            // InternalCls.g:4033:1: ( '[' )
            // InternalCls.g:4034:1: '['
            {
             before(grammarAccess.getAssociationPropertiesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAssociationPropertiesAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group__0__Impl"


    // $ANTLR start "rule__AssociationProperties__Group__1"
    // InternalCls.g:4047:1: rule__AssociationProperties__Group__1 : rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2 ;
    public final void rule__AssociationProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4051:1: ( rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2 )
            // InternalCls.g:4052:2: rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__AssociationProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group__1"


    // $ANTLR start "rule__AssociationProperties__Group__1__Impl"
    // InternalCls.g:4059:1: rule__AssociationProperties__Group__1__Impl : ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) ) ;
    public final void rule__AssociationProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4063:1: ( ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) ) )
            // InternalCls.g:4064:1: ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) )
            {
            // InternalCls.g:4064:1: ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) )
            // InternalCls.g:4065:1: ( rule__AssociationProperties__CardinalityLeftAssignment_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCardinalityLeftAssignment_1()); 
            // InternalCls.g:4066:1: ( rule__AssociationProperties__CardinalityLeftAssignment_1 )
            // InternalCls.g:4066:2: rule__AssociationProperties__CardinalityLeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__CardinalityLeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertiesAccess().getCardinalityLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group__1__Impl"


    // $ANTLR start "rule__AssociationProperties__Group__2"
    // InternalCls.g:4076:1: rule__AssociationProperties__Group__2 : rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3 ;
    public final void rule__AssociationProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4080:1: ( rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3 )
            // InternalCls.g:4081:2: rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__AssociationProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group__2"


    // $ANTLR start "rule__AssociationProperties__Group__2__Impl"
    // InternalCls.g:4088:1: rule__AssociationProperties__Group__2__Impl : ( ( rule__AssociationProperties__Group_2__0 )? ) ;
    public final void rule__AssociationProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4092:1: ( ( ( rule__AssociationProperties__Group_2__0 )? ) )
            // InternalCls.g:4093:1: ( ( rule__AssociationProperties__Group_2__0 )? )
            {
            // InternalCls.g:4093:1: ( ( rule__AssociationProperties__Group_2__0 )? )
            // InternalCls.g:4094:1: ( rule__AssociationProperties__Group_2__0 )?
            {
             before(grammarAccess.getAssociationPropertiesAccess().getGroup_2()); 
            // InternalCls.g:4095:1: ( rule__AssociationProperties__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==50) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCls.g:4095:2: rule__AssociationProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationProperties__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationPropertiesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group__2__Impl"


    // $ANTLR start "rule__AssociationProperties__Group__3"
    // InternalCls.g:4105:1: rule__AssociationProperties__Group__3 : rule__AssociationProperties__Group__3__Impl ;
    public final void rule__AssociationProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4109:1: ( rule__AssociationProperties__Group__3__Impl )
            // InternalCls.g:4110:2: rule__AssociationProperties__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group__3"


    // $ANTLR start "rule__AssociationProperties__Group__3__Impl"
    // InternalCls.g:4116:1: rule__AssociationProperties__Group__3__Impl : ( ']' ) ;
    public final void rule__AssociationProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4120:1: ( ( ']' ) )
            // InternalCls.g:4121:1: ( ']' )
            {
            // InternalCls.g:4121:1: ( ']' )
            // InternalCls.g:4122:1: ']'
            {
             before(grammarAccess.getAssociationPropertiesAccess().getRightSquareBracketKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAssociationPropertiesAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group__3__Impl"


    // $ANTLR start "rule__AssociationProperties__Group_2__0"
    // InternalCls.g:4143:1: rule__AssociationProperties__Group_2__0 : rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1 ;
    public final void rule__AssociationProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4147:1: ( rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1 )
            // InternalCls.g:4148:2: rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1
            {
            pushFollow(FOLLOW_37);
            rule__AssociationProperties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_2__0"


    // $ANTLR start "rule__AssociationProperties__Group_2__0__Impl"
    // InternalCls.g:4155:1: rule__AssociationProperties__Group_2__0__Impl : ( '|' ) ;
    public final void rule__AssociationProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4159:1: ( ( '|' ) )
            // InternalCls.g:4160:1: ( '|' )
            {
            // InternalCls.g:4160:1: ( '|' )
            // InternalCls.g:4161:1: '|'
            {
             before(grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_2__0__Impl"


    // $ANTLR start "rule__AssociationProperties__Group_2__1"
    // InternalCls.g:4174:1: rule__AssociationProperties__Group_2__1 : rule__AssociationProperties__Group_2__1__Impl ;
    public final void rule__AssociationProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4178:1: ( rule__AssociationProperties__Group_2__1__Impl )
            // InternalCls.g:4179:2: rule__AssociationProperties__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_2__1"


    // $ANTLR start "rule__AssociationProperties__Group_2__1__Impl"
    // InternalCls.g:4185:1: rule__AssociationProperties__Group_2__1__Impl : ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) ) ;
    public final void rule__AssociationProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4189:1: ( ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) ) )
            // InternalCls.g:4190:1: ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) )
            {
            // InternalCls.g:4190:1: ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) )
            // InternalCls.g:4191:1: ( rule__AssociationProperties__CardinalityRightAssignment_2_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightAssignment_2_1()); 
            // InternalCls.g:4192:1: ( rule__AssociationProperties__CardinalityRightAssignment_2_1 )
            // InternalCls.g:4192:2: rule__AssociationProperties__CardinalityRightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__CardinalityRightAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_2__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalCls.g:4206:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4210:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalCls.g:4211:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // InternalCls.g:4218:1: rule__Cardinality__Group__0__Impl : ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4222:1: ( ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) )
            // InternalCls.g:4223:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            {
            // InternalCls.g:4223:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            // InternalCls.g:4224:1: ( rule__Cardinality__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0()); 
            // InternalCls.g:4225:1: ( rule__Cardinality__LowerBoundAssignment_0 )
            // InternalCls.g:4225:2: rule__Cardinality__LowerBoundAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__LowerBoundAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // InternalCls.g:4235:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4239:1: ( rule__Cardinality__Group__1__Impl )
            // InternalCls.g:4240:2: rule__Cardinality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // InternalCls.g:4246:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Group_1__0 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4250:1: ( ( ( rule__Cardinality__Group_1__0 )? ) )
            // InternalCls.g:4251:1: ( ( rule__Cardinality__Group_1__0 )? )
            {
            // InternalCls.g:4251:1: ( ( rule__Cardinality__Group_1__0 )? )
            // InternalCls.g:4252:1: ( rule__Cardinality__Group_1__0 )?
            {
             before(grammarAccess.getCardinalityAccess().getGroup_1()); 
            // InternalCls.g:4253:1: ( rule__Cardinality__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCls.g:4253:2: rule__Cardinality__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cardinality__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCardinalityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group_1__0"
    // InternalCls.g:4267:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4271:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // InternalCls.g:4272:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__Cardinality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1__0"


    // $ANTLR start "rule__Cardinality__Group_1__0__Impl"
    // InternalCls.g:4279:1: rule__Cardinality__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4283:1: ( ( '..' ) )
            // InternalCls.g:4284:1: ( '..' )
            {
            // InternalCls.g:4284:1: ( '..' )
            // InternalCls.g:4285:1: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1__0__Impl"


    // $ANTLR start "rule__Cardinality__Group_1__1"
    // InternalCls.g:4298:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4302:1: ( rule__Cardinality__Group_1__1__Impl )
            // InternalCls.g:4303:2: rule__Cardinality__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1__1"


    // $ANTLR start "rule__Cardinality__Group_1__1__Impl"
    // InternalCls.g:4309:1: rule__Cardinality__Group_1__1__Impl : ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4313:1: ( ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) )
            // InternalCls.g:4314:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            {
            // InternalCls.g:4314:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            // InternalCls.g:4315:1: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1()); 
            // InternalCls.g:4316:1: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            // InternalCls.g:4316:2: rule__Cardinality__UpperBoundAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__UpperBoundAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1__1__Impl"


    // $ANTLR start "rule__ClassDiagram__NameAssignment_2"
    // InternalCls.g:4331:1: rule__ClassDiagram__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassDiagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4335:1: ( ( RULE_STRING ) )
            // InternalCls.g:4336:1: ( RULE_STRING )
            {
            // InternalCls.g:4336:1: ( RULE_STRING )
            // InternalCls.g:4337:1: RULE_STRING
            {
             before(grammarAccess.getClassDiagramAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__NameAssignment_2"


    // $ANTLR start "rule__ClassDiagram__PackageImportsAssignment_3"
    // InternalCls.g:4346:1: rule__ClassDiagram__PackageImportsAssignment_3 : ( rulePackageImport ) ;
    public final void rule__ClassDiagram__PackageImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4350:1: ( ( rulePackageImport ) )
            // InternalCls.g:4351:1: ( rulePackageImport )
            {
            // InternalCls.g:4351:1: ( rulePackageImport )
            // InternalCls.g:4352:1: rulePackageImport
            {
             before(grammarAccess.getClassDiagramAccess().getPackageImportsPackageImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePackageImport();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getPackageImportsPackageImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__PackageImportsAssignment_3"


    // $ANTLR start "rule__ClassDiagram__ClassifiersAssignment_4"
    // InternalCls.g:4361:1: rule__ClassDiagram__ClassifiersAssignment_4 : ( ruleClassifier ) ;
    public final void rule__ClassDiagram__ClassifiersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4365:1: ( ( ruleClassifier ) )
            // InternalCls.g:4366:1: ( ruleClassifier )
            {
            // InternalCls.g:4366:1: ( ruleClassifier )
            // InternalCls.g:4367:1: ruleClassifier
            {
             before(grammarAccess.getClassDiagramAccess().getClassifiersClassifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifier();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getClassifiersClassifierParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__ClassifiersAssignment_4"


    // $ANTLR start "rule__ClassDiagram__ConnectorsAssignment_5"
    // InternalCls.g:4376:1: rule__ClassDiagram__ConnectorsAssignment_5 : ( ruleConnector ) ;
    public final void rule__ClassDiagram__ConnectorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4380:1: ( ( ruleConnector ) )
            // InternalCls.g:4381:1: ( ruleConnector )
            {
            // InternalCls.g:4381:1: ( ruleConnector )
            // InternalCls.g:4382:1: ruleConnector
            {
             before(grammarAccess.getClassDiagramAccess().getConnectorsConnectorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getConnectorsConnectorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__ConnectorsAssignment_5"


    // $ANTLR start "rule__PackageImport__PackageAssignment_1"
    // InternalCls.g:4391:1: rule__PackageImport__PackageAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__PackageImport__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4395:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4396:1: ( ( ruleFQN ) )
            {
            // InternalCls.g:4396:1: ( ( ruleFQN ) )
            // InternalCls.g:4397:1: ( ruleFQN )
            {
             before(grammarAccess.getPackageImportAccess().getPackagePackageCrossReference_1_0()); 
            // InternalCls.g:4398:1: ( ruleFQN )
            // InternalCls.g:4399:1: ruleFQN
            {
             before(grammarAccess.getPackageImportAccess().getPackagePackageFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPackageImportAccess().getPackagePackageFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPackageImportAccess().getPackagePackageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__PackageAssignment_1"


    // $ANTLR start "rule__Class__VisibilityAssignment_0"
    // InternalCls.g:4410:1: rule__Class__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4414:1: ( ( ruleVisibility ) )
            // InternalCls.g:4415:1: ( ruleVisibility )
            {
            // InternalCls.g:4415:1: ( ruleVisibility )
            // InternalCls.g:4416:1: ruleVisibility
            {
             before(grammarAccess.getClassAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getClassAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__VisibilityAssignment_0"


    // $ANTLR start "rule__Class__AbstractAssignment_1"
    // InternalCls.g:4425:1: rule__Class__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4429:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4430:1: ( ( 'abstract' ) )
            {
            // InternalCls.g:4430:1: ( ( 'abstract' ) )
            // InternalCls.g:4431:1: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4432:1: ( 'abstract' )
            // InternalCls.g:4433:1: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AbstractAssignment_1"


    // $ANTLR start "rule__Class__LongNameAssignment_3_0"
    // InternalCls.g:4448:1: rule__Class__LongNameAssignment_3_0 : ( ( rule__Class__LongNameAlternatives_3_0_0 ) ) ;
    public final void rule__Class__LongNameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4452:1: ( ( ( rule__Class__LongNameAlternatives_3_0_0 ) ) )
            // InternalCls.g:4453:1: ( ( rule__Class__LongNameAlternatives_3_0_0 ) )
            {
            // InternalCls.g:4453:1: ( ( rule__Class__LongNameAlternatives_3_0_0 ) )
            // InternalCls.g:4454:1: ( rule__Class__LongNameAlternatives_3_0_0 )
            {
             before(grammarAccess.getClassAccess().getLongNameAlternatives_3_0_0()); 
            // InternalCls.g:4455:1: ( rule__Class__LongNameAlternatives_3_0_0 )
            // InternalCls.g:4455:2: rule__Class__LongNameAlternatives_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Class__LongNameAlternatives_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getLongNameAlternatives_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__LongNameAssignment_3_0"


    // $ANTLR start "rule__Class__ReferencedElementAssignment_4"
    // InternalCls.g:4464:1: rule__Class__ReferencedElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ReferencedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4468:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4469:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4469:1: ( ( RULE_ID ) )
            // InternalCls.g:4470:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getReferencedElementClassCrossReference_4_0()); 
            // InternalCls.g:4471:1: ( RULE_ID )
            // InternalCls.g:4472:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getReferencedElementClassIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getReferencedElementClassIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getClassAccess().getReferencedElementClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ReferencedElementAssignment_4"


    // $ANTLR start "rule__Class__MembersAssignment_5_1"
    // InternalCls.g:4483:1: rule__Class__MembersAssignment_5_1 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4487:1: ( ( ruleMember ) )
            // InternalCls.g:4488:1: ( ruleMember )
            {
            // InternalCls.g:4488:1: ( ruleMember )
            // InternalCls.g:4489:1: ruleMember
            {
             before(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MembersAssignment_5_1"


    // $ANTLR start "rule__Interface__VisibilityAssignment_0"
    // InternalCls.g:4498:1: rule__Interface__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Interface__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4502:1: ( ( ruleVisibility ) )
            // InternalCls.g:4503:1: ( ruleVisibility )
            {
            // InternalCls.g:4503:1: ( ruleVisibility )
            // InternalCls.g:4504:1: ruleVisibility
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__VisibilityAssignment_0"


    // $ANTLR start "rule__Interface__LongNameAssignment_2_0"
    // InternalCls.g:4513:1: rule__Interface__LongNameAssignment_2_0 : ( ( rule__Interface__LongNameAlternatives_2_0_0 ) ) ;
    public final void rule__Interface__LongNameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4517:1: ( ( ( rule__Interface__LongNameAlternatives_2_0_0 ) ) )
            // InternalCls.g:4518:1: ( ( rule__Interface__LongNameAlternatives_2_0_0 ) )
            {
            // InternalCls.g:4518:1: ( ( rule__Interface__LongNameAlternatives_2_0_0 ) )
            // InternalCls.g:4519:1: ( rule__Interface__LongNameAlternatives_2_0_0 )
            {
             before(grammarAccess.getInterfaceAccess().getLongNameAlternatives_2_0_0()); 
            // InternalCls.g:4520:1: ( rule__Interface__LongNameAlternatives_2_0_0 )
            // InternalCls.g:4520:2: rule__Interface__LongNameAlternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__LongNameAlternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getLongNameAlternatives_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__LongNameAssignment_2_0"


    // $ANTLR start "rule__Interface__ReferencedElementAssignment_3"
    // InternalCls.g:4529:1: rule__Interface__ReferencedElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__ReferencedElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4533:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4534:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4534:1: ( ( RULE_ID ) )
            // InternalCls.g:4535:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceCrossReference_3_0()); 
            // InternalCls.g:4536:1: ( RULE_ID )
            // InternalCls.g:4537:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__ReferencedElementAssignment_3"


    // $ANTLR start "rule__Interface__MembersAssignment_4_1"
    // InternalCls.g:4548:1: rule__Interface__MembersAssignment_4_1 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4552:1: ( ( ruleMember ) )
            // InternalCls.g:4553:1: ( ruleMember )
            {
            // InternalCls.g:4553:1: ( ruleMember )
            // InternalCls.g:4554:1: ruleMember
            {
             before(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__MembersAssignment_4_1"


    // $ANTLR start "rule__DataTypeReference__TypeAssignment"
    // InternalCls.g:4563:1: rule__DataTypeReference__TypeAssignment : ( rulePrimitiveType ) ;
    public final void rule__DataTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4567:1: ( ( rulePrimitiveType ) )
            // InternalCls.g:4568:1: ( rulePrimitiveType )
            {
            // InternalCls.g:4568:1: ( rulePrimitiveType )
            // InternalCls.g:4569:1: rulePrimitiveType
            {
             before(grammarAccess.getDataTypeReferenceAccess().getTypePrimitiveTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getDataTypeReferenceAccess().getTypePrimitiveTypeEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeReference__TypeAssignment"


    // $ANTLR start "rule__UMLTypeReference__TypeAssignment"
    // InternalCls.g:4578:1: rule__UMLTypeReference__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__UMLTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4582:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4583:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4583:1: ( ( RULE_ID ) )
            // InternalCls.g:4584:1: ( RULE_ID )
            {
             before(grammarAccess.getUMLTypeReferenceAccess().getTypeTypeCrossReference_0()); 
            // InternalCls.g:4585:1: ( RULE_ID )
            // InternalCls.g:4586:1: RULE_ID
            {
             before(grammarAccess.getUMLTypeReferenceAccess().getTypeTypeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUMLTypeReferenceAccess().getTypeTypeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getUMLTypeReferenceAccess().getTypeTypeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UMLTypeReference__TypeAssignment"


    // $ANTLR start "rule__Attribute__VisibilityAssignment_1"
    // InternalCls.g:4597:1: rule__Attribute__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4601:1: ( ( ruleVisibility ) )
            // InternalCls.g:4602:1: ( ruleVisibility )
            {
            // InternalCls.g:4602:1: ( ruleVisibility )
            // InternalCls.g:4603:1: ruleVisibility
            {
             before(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__VisibilityAssignment_1"


    // $ANTLR start "rule__Attribute__StaticAssignment_2"
    // InternalCls.g:4612:1: rule__Attribute__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4616:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4617:1: ( ( 'static' ) )
            {
            // InternalCls.g:4617:1: ( ( 'static' ) )
            // InternalCls.g:4618:1: ( 'static' )
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4619:1: ( 'static' )
            // InternalCls.g:4620:1: 'static'
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 

            }

             after(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__StaticAssignment_2"


    // $ANTLR start "rule__Attribute__FinalAssignment_3"
    // InternalCls.g:4635:1: rule__Attribute__FinalAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Attribute__FinalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4639:1: ( ( ( 'final' ) ) )
            // InternalCls.g:4640:1: ( ( 'final' ) )
            {
            // InternalCls.g:4640:1: ( ( 'final' ) )
            // InternalCls.g:4641:1: ( 'final' )
            {
             before(grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0()); 
            // InternalCls.g:4642:1: ( 'final' )
            // InternalCls.g:4643:1: 'final'
            {
             before(grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0()); 

            }

             after(grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__FinalAssignment_3"


    // $ANTLR start "rule__Attribute__ReferencedElementAssignment_4"
    // InternalCls.g:4658:1: rule__Attribute__ReferencedElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__ReferencedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4662:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4663:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4663:1: ( ( RULE_ID ) )
            // InternalCls.g:4664:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getReferencedElementPropertyCrossReference_4_0()); 
            // InternalCls.g:4665:1: ( RULE_ID )
            // InternalCls.g:4666:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getReferencedElementPropertyIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getReferencedElementPropertyIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getReferencedElementPropertyCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ReferencedElementAssignment_4"


    // $ANTLR start "rule__Attribute__TypeAssignment_6"
    // InternalCls.g:4677:1: rule__Attribute__TypeAssignment_6 : ( ruleTypeReference ) ;
    public final void rule__Attribute__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4681:1: ( ( ruleTypeReference ) )
            // InternalCls.g:4682:1: ( ruleTypeReference )
            {
            // InternalCls.g:4682:1: ( ruleTypeReference )
            // InternalCls.g:4683:1: ruleTypeReference
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeReferenceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeReferenceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_6"


    // $ANTLR start "rule__Method__VisibilityAssignment_0"
    // InternalCls.g:4692:1: rule__Method__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Method__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4696:1: ( ( ruleVisibility ) )
            // InternalCls.g:4697:1: ( ruleVisibility )
            {
            // InternalCls.g:4697:1: ( ruleVisibility )
            // InternalCls.g:4698:1: ruleVisibility
            {
             before(grammarAccess.getMethodAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__VisibilityAssignment_0"


    // $ANTLR start "rule__Method__AbstractAssignment_1"
    // InternalCls.g:4707:1: rule__Method__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Method__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4711:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4712:1: ( ( 'abstract' ) )
            {
            // InternalCls.g:4712:1: ( ( 'abstract' ) )
            // InternalCls.g:4713:1: ( 'abstract' )
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4714:1: ( 'abstract' )
            // InternalCls.g:4715:1: 'abstract'
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__AbstractAssignment_1"


    // $ANTLR start "rule__Method__StaticAssignment_2"
    // InternalCls.g:4730:1: rule__Method__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Method__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4734:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4735:1: ( ( 'static' ) )
            {
            // InternalCls.g:4735:1: ( ( 'static' ) )
            // InternalCls.g:4736:1: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4737:1: ( 'static' )
            // InternalCls.g:4738:1: 'static'
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 

            }

             after(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__StaticAssignment_2"


    // $ANTLR start "rule__Method__FinalAssignment_3"
    // InternalCls.g:4753:1: rule__Method__FinalAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Method__FinalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4757:1: ( ( ( 'final' ) ) )
            // InternalCls.g:4758:1: ( ( 'final' ) )
            {
            // InternalCls.g:4758:1: ( ( 'final' ) )
            // InternalCls.g:4759:1: ( 'final' )
            {
             before(grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0()); 
            // InternalCls.g:4760:1: ( 'final' )
            // InternalCls.g:4761:1: 'final'
            {
             before(grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0()); 

            }

             after(grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__FinalAssignment_3"


    // $ANTLR start "rule__Method__ReferencedElementAssignment_4"
    // InternalCls.g:4776:1: rule__Method__ReferencedElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Method__ReferencedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4780:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4781:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4781:1: ( ( RULE_ID ) )
            // InternalCls.g:4782:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getReferencedElementOperationCrossReference_4_0()); 
            // InternalCls.g:4783:1: ( RULE_ID )
            // InternalCls.g:4784:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getReferencedElementOperationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getReferencedElementOperationIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getReferencedElementOperationCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReferencedElementAssignment_4"


    // $ANTLR start "rule__Method__ParametersAssignment_6_0"
    // InternalCls.g:4795:1: rule__Method__ParametersAssignment_6_0 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4799:1: ( ( ruleParameter ) )
            // InternalCls.g:4800:1: ( ruleParameter )
            {
            // InternalCls.g:4800:1: ( ruleParameter )
            // InternalCls.g:4801:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_6_0"


    // $ANTLR start "rule__Method__ParametersAssignment_6_1_1"
    // InternalCls.g:4810:1: rule__Method__ParametersAssignment_6_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4814:1: ( ( ruleParameter ) )
            // InternalCls.g:4815:1: ( ruleParameter )
            {
            // InternalCls.g:4815:1: ( ruleParameter )
            // InternalCls.g:4816:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_6_1_1"


    // $ANTLR start "rule__Method__TypeAssignment_8_1"
    // InternalCls.g:4825:1: rule__Method__TypeAssignment_8_1 : ( ruleTypeReference ) ;
    public final void rule__Method__TypeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4829:1: ( ( ruleTypeReference ) )
            // InternalCls.g:4830:1: ( ruleTypeReference )
            {
            // InternalCls.g:4830:1: ( ruleTypeReference )
            // InternalCls.g:4831:1: ruleTypeReference
            {
             before(grammarAccess.getMethodAccess().getTypeTypeReferenceParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypeTypeReferenceParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypeAssignment_8_1"


    // $ANTLR start "rule__Parameter__VisibilityAssignment_0"
    // InternalCls.g:4840:1: rule__Parameter__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Parameter__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4844:1: ( ( ruleVisibility ) )
            // InternalCls.g:4845:1: ( ruleVisibility )
            {
            // InternalCls.g:4845:1: ( ruleVisibility )
            // InternalCls.g:4846:1: ruleVisibility
            {
             before(grammarAccess.getParameterAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__VisibilityAssignment_0"


    // $ANTLR start "rule__Parameter__StaticAssignment_1"
    // InternalCls.g:4855:1: rule__Parameter__StaticAssignment_1 : ( ( 'static' ) ) ;
    public final void rule__Parameter__StaticAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4859:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4860:1: ( ( 'static' ) )
            {
            // InternalCls.g:4860:1: ( ( 'static' ) )
            // InternalCls.g:4861:1: ( 'static' )
            {
             before(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 
            // InternalCls.g:4862:1: ( 'static' )
            // InternalCls.g:4863:1: 'static'
            {
             before(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 

            }

             after(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__StaticAssignment_1"


    // $ANTLR start "rule__Parameter__FinalAssignment_2"
    // InternalCls.g:4878:1: rule__Parameter__FinalAssignment_2 : ( ( 'final' ) ) ;
    public final void rule__Parameter__FinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4882:1: ( ( ( 'final' ) ) )
            // InternalCls.g:4883:1: ( ( 'final' ) )
            {
            // InternalCls.g:4883:1: ( ( 'final' ) )
            // InternalCls.g:4884:1: ( 'final' )
            {
             before(grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0()); 
            // InternalCls.g:4885:1: ( 'final' )
            // InternalCls.g:4886:1: 'final'
            {
             before(grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0()); 

            }

             after(grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__FinalAssignment_2"


    // $ANTLR start "rule__Parameter__ReferencedElementAssignment_3"
    // InternalCls.g:4901:1: rule__Parameter__ReferencedElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__ReferencedElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4905:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4906:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4906:1: ( ( RULE_ID ) )
            // InternalCls.g:4907:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getReferencedElementParameterCrossReference_3_0()); 
            // InternalCls.g:4908:1: ( RULE_ID )
            // InternalCls.g:4909:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getReferencedElementParameterIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getReferencedElementParameterIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getReferencedElementParameterCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ReferencedElementAssignment_3"


    // $ANTLR start "rule__Parameter__TypeAssignment_5"
    // InternalCls.g:4920:1: rule__Parameter__TypeAssignment_5 : ( ruleTypeReference ) ;
    public final void rule__Parameter__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4924:1: ( ( ruleTypeReference ) )
            // InternalCls.g:4925:1: ( ruleTypeReference )
            {
            // InternalCls.g:4925:1: ( ruleTypeReference )
            // InternalCls.g:4926:1: ruleTypeReference
            {
             before(grammarAccess.getParameterAccess().getTypeTypeReferenceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeReferenceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_5"


    // $ANTLR start "rule__Generalization__LeftAssignment_0"
    // InternalCls.g:4935:1: rule__Generalization__LeftAssignment_0 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Generalization__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4939:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4940:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4940:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4941:1: ruleClassifierAssociationEnd
            {
             before(grammarAccess.getGeneralizationAccess().getLeftClassifierAssociationEndParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getLeftClassifierAssociationEndParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__LeftAssignment_0"


    // $ANTLR start "rule__Generalization__RightAssignment_2"
    // InternalCls.g:4950:1: rule__Generalization__RightAssignment_2 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Generalization__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4954:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4955:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4955:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4956:1: ruleClassifierAssociationEnd
            {
             before(grammarAccess.getGeneralizationAccess().getRightClassifierAssociationEndParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getRightClassifierAssociationEndParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__RightAssignment_2"


    // $ANTLR start "rule__Implementation__LeftAssignment_0"
    // InternalCls.g:4965:1: rule__Implementation__LeftAssignment_0 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Implementation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4969:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4970:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4970:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4971:1: ruleClassifierAssociationEnd
            {
             before(grammarAccess.getImplementationAccess().getLeftClassifierAssociationEndParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getLeftClassifierAssociationEndParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__LeftAssignment_0"


    // $ANTLR start "rule__Implementation__RightAssignment_2"
    // InternalCls.g:4980:1: rule__Implementation__RightAssignment_2 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Implementation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4984:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4985:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4985:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4986:1: ruleClassifierAssociationEnd
            {
             before(grammarAccess.getImplementationAccess().getRightClassifierAssociationEndParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getRightClassifierAssociationEndParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__RightAssignment_2"


    // $ANTLR start "rule__CommentLink__LeftAssignment_0"
    // InternalCls.g:4995:1: rule__CommentLink__LeftAssignment_0 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__CommentLink__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4999:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:5000:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:5000:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:5001:1: ruleClassifierAssociationEnd
            {
             before(grammarAccess.getCommentLinkAccess().getLeftClassifierAssociationEndParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getCommentLinkAccess().getLeftClassifierAssociationEndParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentLink__LeftAssignment_0"


    // $ANTLR start "rule__CommentLink__CommentAssignment_2"
    // InternalCls.g:5010:1: rule__CommentLink__CommentAssignment_2 : ( ( ruleCommentBody ) ) ;
    public final void rule__CommentLink__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5014:1: ( ( ( ruleCommentBody ) ) )
            // InternalCls.g:5015:1: ( ( ruleCommentBody ) )
            {
            // InternalCls.g:5015:1: ( ( ruleCommentBody ) )
            // InternalCls.g:5016:1: ( ruleCommentBody )
            {
             before(grammarAccess.getCommentLinkAccess().getCommentCommentCrossReference_2_0()); 
            // InternalCls.g:5017:1: ( ruleCommentBody )
            // InternalCls.g:5018:1: ruleCommentBody
            {
             before(grammarAccess.getCommentLinkAccess().getCommentCommentCommentBodyParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleCommentBody();

            state._fsp--;

             after(grammarAccess.getCommentLinkAccess().getCommentCommentCommentBodyParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCommentLinkAccess().getCommentCommentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentLink__CommentAssignment_2"


    // $ANTLR start "rule__Association__BidirectionalAssignment_0"
    // InternalCls.g:5029:1: rule__Association__BidirectionalAssignment_0 : ( ( 'bi' ) ) ;
    public final void rule__Association__BidirectionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5033:1: ( ( ( 'bi' ) ) )
            // InternalCls.g:5034:1: ( ( 'bi' ) )
            {
            // InternalCls.g:5034:1: ( ( 'bi' ) )
            // InternalCls.g:5035:1: ( 'bi' )
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalBiKeyword_0_0()); 
            // InternalCls.g:5036:1: ( 'bi' )
            // InternalCls.g:5037:1: 'bi'
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalBiKeyword_0_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getBidirectionalBiKeyword_0_0()); 

            }

             after(grammarAccess.getAssociationAccess().getBidirectionalBiKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__BidirectionalAssignment_0"


    // $ANTLR start "rule__Association__AggregationKindAssignment_1"
    // InternalCls.g:5052:1: rule__Association__AggregationKindAssignment_1 : ( ruleAggregationKind ) ;
    public final void rule__Association__AggregationKindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5056:1: ( ( ruleAggregationKind ) )
            // InternalCls.g:5057:1: ( ruleAggregationKind )
            {
            // InternalCls.g:5057:1: ( ruleAggregationKind )
            // InternalCls.g:5058:1: ruleAggregationKind
            {
             before(grammarAccess.getAssociationAccess().getAggregationKindAggregationKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregationKind();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getAggregationKindAggregationKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__AggregationKindAssignment_1"


    // $ANTLR start "rule__Association__LeftAssignment_2"
    // InternalCls.g:5067:1: rule__Association__LeftAssignment_2 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Association__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5071:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:5072:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:5072:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:5073:1: ruleClassifierAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getLeftClassifierAssociationEndParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getLeftClassifierAssociationEndParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__LeftAssignment_2"


    // $ANTLR start "rule__Association__ReferencedElementAssignment_3"
    // InternalCls.g:5082:1: rule__Association__ReferencedElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Association__ReferencedElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5086:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:5087:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:5087:1: ( ( RULE_ID ) )
            // InternalCls.g:5088:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getReferencedElementAssociationCrossReference_3_0()); 
            // InternalCls.g:5089:1: ( RULE_ID )
            // InternalCls.g:5090:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getReferencedElementAssociationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getReferencedElementAssociationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getReferencedElementAssociationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__ReferencedElementAssignment_3"


    // $ANTLR start "rule__Association__RightAssignment_4"
    // InternalCls.g:5101:1: rule__Association__RightAssignment_4 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Association__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5105:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:5106:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:5106:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:5107:1: ruleClassifierAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getRightClassifierAssociationEndParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRightClassifierAssociationEndParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__RightAssignment_4"


    // $ANTLR start "rule__Association__PropertiesAssignment_5"
    // InternalCls.g:5116:1: rule__Association__PropertiesAssignment_5 : ( ruleAssociationProperties ) ;
    public final void rule__Association__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5120:1: ( ( ruleAssociationProperties ) )
            // InternalCls.g:5121:1: ( ruleAssociationProperties )
            {
            // InternalCls.g:5121:1: ( ruleAssociationProperties )
            // InternalCls.g:5122:1: ruleAssociationProperties
            {
             before(grammarAccess.getAssociationAccess().getPropertiesAssociationPropertiesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationProperties();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getPropertiesAssociationPropertiesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__PropertiesAssignment_5"


    // $ANTLR start "rule__Association__CommentAssignment_6_1"
    // InternalCls.g:5131:1: rule__Association__CommentAssignment_6_1 : ( ( ruleCommentBody ) ) ;
    public final void rule__Association__CommentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5135:1: ( ( ( ruleCommentBody ) ) )
            // InternalCls.g:5136:1: ( ( ruleCommentBody ) )
            {
            // InternalCls.g:5136:1: ( ( ruleCommentBody ) )
            // InternalCls.g:5137:1: ( ruleCommentBody )
            {
             before(grammarAccess.getAssociationAccess().getCommentCommentCrossReference_6_1_0()); 
            // InternalCls.g:5138:1: ( ruleCommentBody )
            // InternalCls.g:5139:1: ruleCommentBody
            {
             before(grammarAccess.getAssociationAccess().getCommentCommentCommentBodyParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleCommentBody();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getCommentCommentCommentBodyParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getCommentCommentCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__CommentAssignment_6_1"


    // $ANTLR start "rule__MultiAssociation__ReferencedElementAssignment_1"
    // InternalCls.g:5150:1: rule__MultiAssociation__ReferencedElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MultiAssociation__ReferencedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5154:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:5155:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:5155:1: ( ( RULE_ID ) )
            // InternalCls.g:5156:1: ( RULE_ID )
            {
             before(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationCrossReference_1_0()); 
            // InternalCls.g:5157:1: ( RULE_ID )
            // InternalCls.g:5158:1: RULE_ID
            {
             before(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__ReferencedElementAssignment_1"


    // $ANTLR start "rule__MultiAssociation__ConnectorEndsAssignment_3_0"
    // InternalCls.g:5169:1: rule__MultiAssociation__ConnectorEndsAssignment_3_0 : ( ruleMemberEnd ) ;
    public final void rule__MultiAssociation__ConnectorEndsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5173:1: ( ( ruleMemberEnd ) )
            // InternalCls.g:5174:1: ( ruleMemberEnd )
            {
            // InternalCls.g:5174:1: ( ruleMemberEnd )
            // InternalCls.g:5175:1: ruleMemberEnd
            {
             before(grammarAccess.getMultiAssociationAccess().getConnectorEndsMemberEndParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberEnd();

            state._fsp--;

             after(grammarAccess.getMultiAssociationAccess().getConnectorEndsMemberEndParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__ConnectorEndsAssignment_3_0"


    // $ANTLR start "rule__MemberEnd__TypeAssignment_0"
    // InternalCls.g:5184:1: rule__MemberEnd__TypeAssignment_0 : ( ruleUMLTypeReference ) ;
    public final void rule__MemberEnd__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5188:1: ( ( ruleUMLTypeReference ) )
            // InternalCls.g:5189:1: ( ruleUMLTypeReference )
            {
            // InternalCls.g:5189:1: ( ruleUMLTypeReference )
            // InternalCls.g:5190:1: ruleUMLTypeReference
            {
             before(grammarAccess.getMemberEndAccess().getTypeUMLTypeReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUMLTypeReference();

            state._fsp--;

             after(grammarAccess.getMemberEndAccess().getTypeUMLTypeReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__TypeAssignment_0"


    // $ANTLR start "rule__MemberEnd__ReferencedElementAssignment_1"
    // InternalCls.g:5199:1: rule__MemberEnd__ReferencedElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MemberEnd__ReferencedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5203:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:5204:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:5204:1: ( ( RULE_ID ) )
            // InternalCls.g:5205:1: ( RULE_ID )
            {
             before(grammarAccess.getMemberEndAccess().getReferencedElementPropertyCrossReference_1_0()); 
            // InternalCls.g:5206:1: ( RULE_ID )
            // InternalCls.g:5207:1: RULE_ID
            {
             before(grammarAccess.getMemberEndAccess().getReferencedElementPropertyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberEndAccess().getReferencedElementPropertyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMemberEndAccess().getReferencedElementPropertyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__ReferencedElementAssignment_1"


    // $ANTLR start "rule__MemberEnd__CardinalityAssignment_2"
    // InternalCls.g:5218:1: rule__MemberEnd__CardinalityAssignment_2 : ( ruleCardinality ) ;
    public final void rule__MemberEnd__CardinalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5222:1: ( ( ruleCardinality ) )
            // InternalCls.g:5223:1: ( ruleCardinality )
            {
            // InternalCls.g:5223:1: ( ruleCardinality )
            // InternalCls.g:5224:1: ruleCardinality
            {
             before(grammarAccess.getMemberEndAccess().getCardinalityCardinalityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getMemberEndAccess().getCardinalityCardinalityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__CardinalityAssignment_2"


    // $ANTLR start "rule__MemberEnd__NavigableAssignment_3"
    // InternalCls.g:5233:1: rule__MemberEnd__NavigableAssignment_3 : ( ( '<' ) ) ;
    public final void rule__MemberEnd__NavigableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5237:1: ( ( ( '<' ) ) )
            // InternalCls.g:5238:1: ( ( '<' ) )
            {
            // InternalCls.g:5238:1: ( ( '<' ) )
            // InternalCls.g:5239:1: ( '<' )
            {
             before(grammarAccess.getMemberEndAccess().getNavigableLessThanSignKeyword_3_0()); 
            // InternalCls.g:5240:1: ( '<' )
            // InternalCls.g:5241:1: '<'
            {
             before(grammarAccess.getMemberEndAccess().getNavigableLessThanSignKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMemberEndAccess().getNavigableLessThanSignKeyword_3_0()); 

            }

             after(grammarAccess.getMemberEndAccess().getNavigableLessThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberEnd__NavigableAssignment_3"


    // $ANTLR start "rule__AssociationProperties__CardinalityLeftAssignment_1"
    // InternalCls.g:5256:1: rule__AssociationProperties__CardinalityLeftAssignment_1 : ( ruleCardinality ) ;
    public final void rule__AssociationProperties__CardinalityLeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5260:1: ( ( ruleCardinality ) )
            // InternalCls.g:5261:1: ( ruleCardinality )
            {
            // InternalCls.g:5261:1: ( ruleCardinality )
            // InternalCls.g:5262:1: ruleCardinality
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCardinalityLeftCardinalityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getAssociationPropertiesAccess().getCardinalityLeftCardinalityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__CardinalityLeftAssignment_1"


    // $ANTLR start "rule__AssociationProperties__CardinalityRightAssignment_2_1"
    // InternalCls.g:5271:1: rule__AssociationProperties__CardinalityRightAssignment_2_1 : ( ruleCardinality ) ;
    public final void rule__AssociationProperties__CardinalityRightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5275:1: ( ( ruleCardinality ) )
            // InternalCls.g:5276:1: ( ruleCardinality )
            {
            // InternalCls.g:5276:1: ( ruleCardinality )
            // InternalCls.g:5277:1: ruleCardinality
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightCardinalityParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightCardinalityParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__CardinalityRightAssignment_2_1"


    // $ANTLR start "rule__Cardinality__LowerBoundAssignment_0"
    // InternalCls.g:5286:1: rule__Cardinality__LowerBoundAssignment_0 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5290:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:5291:1: ( ruleCardinalityBound )
            {
            // InternalCls.g:5291:1: ( ruleCardinalityBound )
            // InternalCls.g:5292:1: ruleCardinalityBound
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundCardinalityBoundParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalityBound();

            state._fsp--;

             after(grammarAccess.getCardinalityAccess().getLowerBoundCardinalityBoundParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__LowerBoundAssignment_0"


    // $ANTLR start "rule__Cardinality__UpperBoundAssignment_1_1"
    // InternalCls.g:5301:1: rule__Cardinality__UpperBoundAssignment_1_1 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__UpperBoundAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5305:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:5306:1: ( ruleCardinalityBound )
            {
            // InternalCls.g:5306:1: ( ruleCardinalityBound )
            // InternalCls.g:5307:1: ruleCardinalityBound
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundCardinalityBoundParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalityBound();

            state._fsp--;

             after(grammarAccess.getCardinalityAccess().getUpperBoundCardinalityBoundParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__UpperBoundAssignment_1_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\14\7\43\2\uffff";
    static final String dfa_3s = "\10\64\2\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\20\uffff\1\10\3\uffff\1\11\14\uffff\1\10",
            "\1\10\3\uffff\1\11\14\uffff\1\10",
            "\1\10\3\uffff\1\11\14\uffff\1\10",
            "\1\10\3\uffff\1\11\14\uffff\1\10",
            "\1\10\3\uffff\1\11\14\uffff\1\10",
            "\1\10\3\uffff\1\11\14\uffff\1\10",
            "\1\10\3\uffff\1\11\14\uffff\1\10",
            "\1\10\3\uffff\1\11\14\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "817:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\12\5\1\50\2\uffff";
    static final String dfa_9s = "\11\66\1\5\1\51\2\uffff";
    static final String dfa_10s = "\13\uffff\1\2\1\1";
    static final String dfa_11s = "\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\12\6\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\41\uffff\1\13\1\10\1\11",
            "\1\12\56\uffff\1\13\1\10\1\11",
            "\1\12\56\uffff\1\13\1\10\1\11",
            "\1\12\56\uffff\1\13\1\10\1\11",
            "\1\12\56\uffff\1\13\1\10\1\11",
            "\1\12\56\uffff\1\13\1\10\1\11",
            "\1\12\56\uffff\1\13\1\10\1\11",
            "\1\12\56\uffff\1\13\1\10\1\11",
            "\1\12\60\uffff\1\11",
            "\1\12",
            "\1\14\1\13",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "905:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0090008B7007F020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x001000880007F002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0080000070000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x001000080007F000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x007000400007F020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x007000000007F022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x001000880007F000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x006000000007F020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000FF80020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x007000000007F020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x006004000007F020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x006000000007F022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000070000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000000000860L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});

}