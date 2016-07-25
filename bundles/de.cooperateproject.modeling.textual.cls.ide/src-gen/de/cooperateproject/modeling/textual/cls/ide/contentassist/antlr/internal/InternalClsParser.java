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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'~'", "'-'", "'#'", "'+'", "'<'", "'>'", "'string'", "'int'", "'double'", "'boolean'", "'char'", "'byte'", "'short'", "'long'", "'float'", "'asc'", "'agg'", "'com'", "'@startclass'", "'@endclass'", "'import'", "'.'", "'class'", "'{'", "'}'", "'as'", "'interface'", "':'", "'('", "')'", "','", "'isa'", "'impl'", "'note'", "'['", "']'", "'|'", "'..'", "'abstract'", "'static'", "'final'"
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


    // $ANTLR start "entryRuleAssociationProperties"
    // InternalCls.g:592:1: entryRuleAssociationProperties : ruleAssociationProperties EOF ;
    public final void entryRuleAssociationProperties() throws RecognitionException {
        try {
            // InternalCls.g:593:1: ( ruleAssociationProperties EOF )
            // InternalCls.g:594:1: ruleAssociationProperties EOF
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
    // InternalCls.g:601:1: ruleAssociationProperties : ( ( rule__AssociationProperties__Group__0 ) ) ;
    public final void ruleAssociationProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:605:2: ( ( ( rule__AssociationProperties__Group__0 ) ) )
            // InternalCls.g:606:1: ( ( rule__AssociationProperties__Group__0 ) )
            {
            // InternalCls.g:606:1: ( ( rule__AssociationProperties__Group__0 ) )
            // InternalCls.g:607:1: ( rule__AssociationProperties__Group__0 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getGroup()); 
            // InternalCls.g:608:1: ( rule__AssociationProperties__Group__0 )
            // InternalCls.g:608:2: rule__AssociationProperties__Group__0
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
    // InternalCls.g:620:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalCls.g:621:1: ( ruleCardinality EOF )
            // InternalCls.g:622:1: ruleCardinality EOF
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
    // InternalCls.g:629:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:633:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalCls.g:634:1: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalCls.g:634:1: ( ( rule__Cardinality__Group__0 ) )
            // InternalCls.g:635:1: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalCls.g:636:1: ( rule__Cardinality__Group__0 )
            // InternalCls.g:636:2: rule__Cardinality__Group__0
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


    // $ANTLR start "entryRuleCardinalityBound"
    // InternalCls.g:648:1: entryRuleCardinalityBound : ruleCardinalityBound EOF ;
    public final void entryRuleCardinalityBound() throws RecognitionException {
        try {
            // InternalCls.g:649:1: ( ruleCardinalityBound EOF )
            // InternalCls.g:650:1: ruleCardinalityBound EOF
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
    // InternalCls.g:657:1: ruleCardinalityBound : ( ( rule__CardinalityBound__Alternatives ) ) ;
    public final void ruleCardinalityBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:661:2: ( ( ( rule__CardinalityBound__Alternatives ) ) )
            // InternalCls.g:662:1: ( ( rule__CardinalityBound__Alternatives ) )
            {
            // InternalCls.g:662:1: ( ( rule__CardinalityBound__Alternatives ) )
            // InternalCls.g:663:1: ( rule__CardinalityBound__Alternatives )
            {
             before(grammarAccess.getCardinalityBoundAccess().getAlternatives()); 
            // InternalCls.g:664:1: ( rule__CardinalityBound__Alternatives )
            // InternalCls.g:664:2: rule__CardinalityBound__Alternatives
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
    // InternalCls.g:677:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:681:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalCls.g:682:1: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalCls.g:682:1: ( ( rule__Visibility__Alternatives ) )
            // InternalCls.g:683:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalCls.g:684:1: ( rule__Visibility__Alternatives )
            // InternalCls.g:684:2: rule__Visibility__Alternatives
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


    // $ANTLR start "ruleReadingDirection"
    // InternalCls.g:696:1: ruleReadingDirection : ( ( rule__ReadingDirection__Alternatives ) ) ;
    public final void ruleReadingDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:700:1: ( ( ( rule__ReadingDirection__Alternatives ) ) )
            // InternalCls.g:701:1: ( ( rule__ReadingDirection__Alternatives ) )
            {
            // InternalCls.g:701:1: ( ( rule__ReadingDirection__Alternatives ) )
            // InternalCls.g:702:1: ( rule__ReadingDirection__Alternatives )
            {
             before(grammarAccess.getReadingDirectionAccess().getAlternatives()); 
            // InternalCls.g:703:1: ( rule__ReadingDirection__Alternatives )
            // InternalCls.g:703:2: rule__ReadingDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReadingDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReadingDirectionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleReadingDirection"


    // $ANTLR start "rulePrimitiveType"
    // InternalCls.g:715:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:719:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalCls.g:720:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalCls.g:720:1: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalCls.g:721:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalCls.g:722:1: ( rule__PrimitiveType__Alternatives )
            // InternalCls.g:722:2: rule__PrimitiveType__Alternatives
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
    // InternalCls.g:734:1: ruleAggregationKind : ( ( rule__AggregationKind__Alternatives ) ) ;
    public final void ruleAggregationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:738:1: ( ( ( rule__AggregationKind__Alternatives ) ) )
            // InternalCls.g:739:1: ( ( rule__AggregationKind__Alternatives ) )
            {
            // InternalCls.g:739:1: ( ( rule__AggregationKind__Alternatives ) )
            // InternalCls.g:740:1: ( rule__AggregationKind__Alternatives )
            {
             before(grammarAccess.getAggregationKindAccess().getAlternatives()); 
            // InternalCls.g:741:1: ( rule__AggregationKind__Alternatives )
            // InternalCls.g:741:2: rule__AggregationKind__Alternatives
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
    // InternalCls.g:752:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );
    public final void rule__Classifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:756:1: ( ( ruleClass ) | ( ruleInterface ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==34||LA1_1==50) ) {
                    alt1=1;
                }
                else if ( (LA1_1==38) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==38) ) {
                    alt1=2;
                }
                else if ( (LA1_2==34||LA1_2==50) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==34||LA1_3==50) ) {
                    alt1=1;
                }
                else if ( (LA1_3==38) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4==38) ) {
                    alt1=2;
                }
                else if ( (LA1_4==34||LA1_4==50) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case 34:
            case 50:
                {
                alt1=1;
                }
                break;
            case 38:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCls.g:757:1: ( ruleClass )
                    {
                    // InternalCls.g:757:1: ( ruleClass )
                    // InternalCls.g:758:1: ruleClass
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
                    // InternalCls.g:763:6: ( ruleInterface )
                    {
                    // InternalCls.g:763:6: ( ruleInterface )
                    // InternalCls.g:764:1: ruleInterface
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
    // InternalCls.g:774:1: rule__Class__LongNameAlternatives_3_0_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Class__LongNameAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:778:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCls.g:779:1: ( RULE_STRING )
                    {
                    // InternalCls.g:779:1: ( RULE_STRING )
                    // InternalCls.g:780:1: RULE_STRING
                    {
                     before(grammarAccess.getClassAccess().getLongNameSTRINGTerminalRuleCall_3_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getLongNameSTRINGTerminalRuleCall_3_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:785:6: ( RULE_ID )
                    {
                    // InternalCls.g:785:6: ( RULE_ID )
                    // InternalCls.g:786:1: RULE_ID
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
    // InternalCls.g:796:1: rule__Interface__LongNameAlternatives_2_0_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Interface__LongNameAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:800:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCls.g:801:1: ( RULE_STRING )
                    {
                    // InternalCls.g:801:1: ( RULE_STRING )
                    // InternalCls.g:802:1: RULE_STRING
                    {
                     before(grammarAccess.getInterfaceAccess().getLongNameSTRINGTerminalRuleCall_2_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getInterfaceAccess().getLongNameSTRINGTerminalRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:807:6: ( RULE_ID )
                    {
                    // InternalCls.g:807:6: ( RULE_ID )
                    // InternalCls.g:808:1: RULE_ID
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
    // InternalCls.g:818:1: rule__TypeReference__Alternatives : ( ( ruleDataTypeReference ) | ( ruleUMLTypeReference ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:822:1: ( ( ruleDataTypeReference ) | ( ruleUMLTypeReference ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=18 && LA4_0<=26)) ) {
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
                    // InternalCls.g:823:1: ( ruleDataTypeReference )
                    {
                    // InternalCls.g:823:1: ( ruleDataTypeReference )
                    // InternalCls.g:824:1: ruleDataTypeReference
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
                    // InternalCls.g:829:6: ( ruleUMLTypeReference )
                    {
                    // InternalCls.g:829:6: ( ruleUMLTypeReference )
                    // InternalCls.g:830:1: ruleUMLTypeReference
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
    // InternalCls.g:840:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:844:1: ( ( ruleAttribute ) | ( ruleMethod ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCls.g:845:1: ( ruleAttribute )
                    {
                    // InternalCls.g:845:1: ( ruleAttribute )
                    // InternalCls.g:846:1: ruleAttribute
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
                    // InternalCls.g:851:6: ( ruleMethod )
                    {
                    // InternalCls.g:851:6: ( ruleMethod )
                    // InternalCls.g:852:1: ruleMethod
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
    // InternalCls.g:862:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleAssociation ) | ( ruleImplementation ) | ( ruleCommentLink ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:866:1: ( ( ruleGeneralization ) | ( ruleAssociation ) | ( ruleImplementation ) | ( ruleCommentLink ) )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    alt6=4;
                    }
                    break;
                case 43:
                    {
                    alt6=1;
                    }
                    break;
                case 44:
                    {
                    alt6=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA6_0>=27 && LA6_0<=29)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCls.g:867:1: ( ruleGeneralization )
                    {
                    // InternalCls.g:867:1: ( ruleGeneralization )
                    // InternalCls.g:868:1: ruleGeneralization
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
                    // InternalCls.g:873:6: ( ruleAssociation )
                    {
                    // InternalCls.g:873:6: ( ruleAssociation )
                    // InternalCls.g:874:1: ruleAssociation
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
                    // InternalCls.g:879:6: ( ruleImplementation )
                    {
                    // InternalCls.g:879:6: ( ruleImplementation )
                    // InternalCls.g:880:1: ruleImplementation
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
                    // InternalCls.g:885:6: ( ruleCommentLink )
                    {
                    // InternalCls.g:885:6: ( ruleCommentLink )
                    // InternalCls.g:886:1: ruleCommentLink
                    {
                     before(grammarAccess.getConnectorAccess().getCommentLinkParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCommentLink();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getCommentLinkParserRuleCall_3()); 

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
    // InternalCls.g:896:1: rule__CardinalityBound__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CardinalityBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:900:1: ( ( '*' ) | ( RULE_INT ) )
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
                    // InternalCls.g:901:1: ( '*' )
                    {
                    // InternalCls.g:901:1: ( '*' )
                    // InternalCls.g:902:1: '*'
                    {
                     before(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:909:6: ( RULE_INT )
                    {
                    // InternalCls.g:909:6: ( RULE_INT )
                    // InternalCls.g:910:1: RULE_INT
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
    // InternalCls.g:920:1: rule__Visibility__Alternatives : ( ( ( '~' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '+' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:924:1: ( ( ( '~' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '+' ) ) )
            int alt8=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCls.g:925:1: ( ( '~' ) )
                    {
                    // InternalCls.g:925:1: ( ( '~' ) )
                    // InternalCls.g:926:1: ( '~' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_0()); 
                    // InternalCls.g:927:1: ( '~' )
                    // InternalCls.g:927:3: '~'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:932:6: ( ( '-' ) )
                    {
                    // InternalCls.g:932:6: ( ( '-' ) )
                    // InternalCls.g:933:1: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalCls.g:934:1: ( '-' )
                    // InternalCls.g:934:3: '-'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:939:6: ( ( '#' ) )
                    {
                    // InternalCls.g:939:6: ( ( '#' ) )
                    // InternalCls.g:940:1: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    // InternalCls.g:941:1: ( '#' )
                    // InternalCls.g:941:3: '#'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:946:6: ( ( '+' ) )
                    {
                    // InternalCls.g:946:6: ( ( '+' ) )
                    // InternalCls.g:947:1: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_3()); 
                    // InternalCls.g:948:1: ( '+' )
                    // InternalCls.g:948:3: '+'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_3()); 

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


    // $ANTLR start "rule__ReadingDirection__Alternatives"
    // InternalCls.g:958:1: rule__ReadingDirection__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__ReadingDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:962:1: ( ( ( '<' ) ) | ( ( '>' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCls.g:963:1: ( ( '<' ) )
                    {
                    // InternalCls.g:963:1: ( ( '<' ) )
                    // InternalCls.g:964:1: ( '<' )
                    {
                     before(grammarAccess.getReadingDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalCls.g:965:1: ( '<' )
                    // InternalCls.g:965:3: '<'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getReadingDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:970:6: ( ( '>' ) )
                    {
                    // InternalCls.g:970:6: ( ( '>' ) )
                    // InternalCls.g:971:1: ( '>' )
                    {
                     before(grammarAccess.getReadingDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalCls.g:972:1: ( '>' )
                    // InternalCls.g:972:3: '>'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getReadingDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ReadingDirection__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalCls.g:982:1: rule__PrimitiveType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'short' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:986:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'short' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            case 22:
                {
                alt10=5;
                }
                break;
            case 23:
                {
                alt10=6;
                }
                break;
            case 24:
                {
                alt10=7;
                }
                break;
            case 25:
                {
                alt10=8;
                }
                break;
            case 26:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCls.g:987:1: ( ( 'string' ) )
                    {
                    // InternalCls.g:987:1: ( ( 'string' ) )
                    // InternalCls.g:988:1: ( 'string' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalCls.g:989:1: ( 'string' )
                    // InternalCls.g:989:3: 'string'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:994:6: ( ( 'int' ) )
                    {
                    // InternalCls.g:994:6: ( ( 'int' ) )
                    // InternalCls.g:995:1: ( 'int' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalCls.g:996:1: ( 'int' )
                    // InternalCls.g:996:3: 'int'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1001:6: ( ( 'double' ) )
                    {
                    // InternalCls.g:1001:6: ( ( 'double' ) )
                    // InternalCls.g:1002:1: ( 'double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    // InternalCls.g:1003:1: ( 'double' )
                    // InternalCls.g:1003:3: 'double'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1008:6: ( ( 'boolean' ) )
                    {
                    // InternalCls.g:1008:6: ( ( 'boolean' ) )
                    // InternalCls.g:1009:1: ( 'boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 
                    // InternalCls.g:1010:1: ( 'boolean' )
                    // InternalCls.g:1010:3: 'boolean'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:1015:6: ( ( 'char' ) )
                    {
                    // InternalCls.g:1015:6: ( ( 'char' ) )
                    // InternalCls.g:1016:1: ( 'char' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4()); 
                    // InternalCls.g:1017:1: ( 'char' )
                    // InternalCls.g:1017:3: 'char'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:1022:6: ( ( 'byte' ) )
                    {
                    // InternalCls.g:1022:6: ( ( 'byte' ) )
                    // InternalCls.g:1023:1: ( 'byte' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5()); 
                    // InternalCls.g:1024:1: ( 'byte' )
                    // InternalCls.g:1024:3: 'byte'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:1029:6: ( ( 'short' ) )
                    {
                    // InternalCls.g:1029:6: ( ( 'short' ) )
                    // InternalCls.g:1030:1: ( 'short' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6()); 
                    // InternalCls.g:1031:1: ( 'short' )
                    // InternalCls.g:1031:3: 'short'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCls.g:1036:6: ( ( 'long' ) )
                    {
                    // InternalCls.g:1036:6: ( ( 'long' ) )
                    // InternalCls.g:1037:1: ( 'long' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7()); 
                    // InternalCls.g:1038:1: ( 'long' )
                    // InternalCls.g:1038:3: 'long'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCls.g:1043:6: ( ( 'float' ) )
                    {
                    // InternalCls.g:1043:6: ( ( 'float' ) )
                    // InternalCls.g:1044:1: ( 'float' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalCls.g:1045:1: ( 'float' )
                    // InternalCls.g:1045:3: 'float'
                    {
                    match(input,26,FOLLOW_2); 

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
    // InternalCls.g:1055:1: rule__AggregationKind__Alternatives : ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) );
    public final void rule__AggregationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1059:1: ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCls.g:1060:1: ( ( 'asc' ) )
                    {
                    // InternalCls.g:1060:1: ( ( 'asc' ) )
                    // InternalCls.g:1061:1: ( 'asc' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalCls.g:1062:1: ( 'asc' )
                    // InternalCls.g:1062:3: 'asc'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1067:6: ( ( 'agg' ) )
                    {
                    // InternalCls.g:1067:6: ( ( 'agg' ) )
                    // InternalCls.g:1068:1: ( 'agg' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 
                    // InternalCls.g:1069:1: ( 'agg' )
                    // InternalCls.g:1069:3: 'agg'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1074:6: ( ( 'com' ) )
                    {
                    // InternalCls.g:1074:6: ( ( 'com' ) )
                    // InternalCls.g:1075:1: ( 'com' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getCOMPOSITIONEnumLiteralDeclaration_2()); 
                    // InternalCls.g:1076:1: ( 'com' )
                    // InternalCls.g:1076:3: 'com'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalCls.g:1088:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1092:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // InternalCls.g:1093:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
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
    // InternalCls.g:1100:1: rule__ClassDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1104:1: ( ( () ) )
            // InternalCls.g:1105:1: ( () )
            {
            // InternalCls.g:1105:1: ( () )
            // InternalCls.g:1106:1: ()
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 
            // InternalCls.g:1107:1: ()
            // InternalCls.g:1109:1: 
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
    // InternalCls.g:1119:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1123:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // InternalCls.g:1124:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
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
    // InternalCls.g:1131:1: rule__ClassDiagram__Group__1__Impl : ( '@startclass' ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1135:1: ( ( '@startclass' ) )
            // InternalCls.g:1136:1: ( '@startclass' )
            {
            // InternalCls.g:1136:1: ( '@startclass' )
            // InternalCls.g:1137:1: '@startclass'
            {
             before(grammarAccess.getClassDiagramAccess().getStartclassKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCls.g:1150:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1154:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // InternalCls.g:1155:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
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
    // InternalCls.g:1162:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__NameAssignment_2 ) ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1166:1: ( ( ( rule__ClassDiagram__NameAssignment_2 ) ) )
            // InternalCls.g:1167:1: ( ( rule__ClassDiagram__NameAssignment_2 ) )
            {
            // InternalCls.g:1167:1: ( ( rule__ClassDiagram__NameAssignment_2 ) )
            // InternalCls.g:1168:1: ( rule__ClassDiagram__NameAssignment_2 )
            {
             before(grammarAccess.getClassDiagramAccess().getNameAssignment_2()); 
            // InternalCls.g:1169:1: ( rule__ClassDiagram__NameAssignment_2 )
            // InternalCls.g:1169:2: rule__ClassDiagram__NameAssignment_2
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
    // InternalCls.g:1179:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1183:1: ( rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 )
            // InternalCls.g:1184:2: rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4
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
    // InternalCls.g:1191:1: rule__ClassDiagram__Group__3__Impl : ( ( rule__ClassDiagram__PackageImportsAssignment_3 )* ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1195:1: ( ( ( rule__ClassDiagram__PackageImportsAssignment_3 )* ) )
            // InternalCls.g:1196:1: ( ( rule__ClassDiagram__PackageImportsAssignment_3 )* )
            {
            // InternalCls.g:1196:1: ( ( rule__ClassDiagram__PackageImportsAssignment_3 )* )
            // InternalCls.g:1197:1: ( rule__ClassDiagram__PackageImportsAssignment_3 )*
            {
             before(grammarAccess.getClassDiagramAccess().getPackageImportsAssignment_3()); 
            // InternalCls.g:1198:1: ( rule__ClassDiagram__PackageImportsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCls.g:1198:2: rule__ClassDiagram__PackageImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ClassDiagram__PackageImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalCls.g:1208:1: rule__ClassDiagram__Group__4 : rule__ClassDiagram__Group__4__Impl rule__ClassDiagram__Group__5 ;
    public final void rule__ClassDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1212:1: ( rule__ClassDiagram__Group__4__Impl rule__ClassDiagram__Group__5 )
            // InternalCls.g:1213:2: rule__ClassDiagram__Group__4__Impl rule__ClassDiagram__Group__5
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
    // InternalCls.g:1220:1: rule__ClassDiagram__Group__4__Impl : ( ( rule__ClassDiagram__ClassifiersAssignment_4 )* ) ;
    public final void rule__ClassDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1224:1: ( ( ( rule__ClassDiagram__ClassifiersAssignment_4 )* ) )
            // InternalCls.g:1225:1: ( ( rule__ClassDiagram__ClassifiersAssignment_4 )* )
            {
            // InternalCls.g:1225:1: ( ( rule__ClassDiagram__ClassifiersAssignment_4 )* )
            // InternalCls.g:1226:1: ( rule__ClassDiagram__ClassifiersAssignment_4 )*
            {
             before(grammarAccess.getClassDiagramAccess().getClassifiersAssignment_4()); 
            // InternalCls.g:1227:1: ( rule__ClassDiagram__ClassifiersAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=15)||LA13_0==34||LA13_0==38||LA13_0==50) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCls.g:1227:2: rule__ClassDiagram__ClassifiersAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ClassDiagram__ClassifiersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalCls.g:1237:1: rule__ClassDiagram__Group__5 : rule__ClassDiagram__Group__5__Impl rule__ClassDiagram__Group__6 ;
    public final void rule__ClassDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1241:1: ( rule__ClassDiagram__Group__5__Impl rule__ClassDiagram__Group__6 )
            // InternalCls.g:1242:2: rule__ClassDiagram__Group__5__Impl rule__ClassDiagram__Group__6
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
    // InternalCls.g:1249:1: rule__ClassDiagram__Group__5__Impl : ( ( rule__ClassDiagram__ConnectorsAssignment_5 )* ) ;
    public final void rule__ClassDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1253:1: ( ( ( rule__ClassDiagram__ConnectorsAssignment_5 )* ) )
            // InternalCls.g:1254:1: ( ( rule__ClassDiagram__ConnectorsAssignment_5 )* )
            {
            // InternalCls.g:1254:1: ( ( rule__ClassDiagram__ConnectorsAssignment_5 )* )
            // InternalCls.g:1255:1: ( rule__ClassDiagram__ConnectorsAssignment_5 )*
            {
             before(grammarAccess.getClassDiagramAccess().getConnectorsAssignment_5()); 
            // InternalCls.g:1256:1: ( rule__ClassDiagram__ConnectorsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=27 && LA14_0<=29)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCls.g:1256:2: rule__ClassDiagram__ConnectorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ClassDiagram__ConnectorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalCls.g:1266:1: rule__ClassDiagram__Group__6 : rule__ClassDiagram__Group__6__Impl ;
    public final void rule__ClassDiagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1270:1: ( rule__ClassDiagram__Group__6__Impl )
            // InternalCls.g:1271:2: rule__ClassDiagram__Group__6__Impl
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
    // InternalCls.g:1277:1: rule__ClassDiagram__Group__6__Impl : ( '@endclass' ) ;
    public final void rule__ClassDiagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1281:1: ( ( '@endclass' ) )
            // InternalCls.g:1282:1: ( '@endclass' )
            {
            // InternalCls.g:1282:1: ( '@endclass' )
            // InternalCls.g:1283:1: '@endclass'
            {
             before(grammarAccess.getClassDiagramAccess().getEndclassKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCls.g:1310:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1314:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // InternalCls.g:1315:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
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
    // InternalCls.g:1322:1: rule__PackageImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1326:1: ( ( 'import' ) )
            // InternalCls.g:1327:1: ( 'import' )
            {
            // InternalCls.g:1327:1: ( 'import' )
            // InternalCls.g:1328:1: 'import'
            {
             before(grammarAccess.getPackageImportAccess().getImportKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCls.g:1341:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1345:1: ( rule__PackageImport__Group__1__Impl )
            // InternalCls.g:1346:2: rule__PackageImport__Group__1__Impl
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
    // InternalCls.g:1352:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__PackageAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1356:1: ( ( ( rule__PackageImport__PackageAssignment_1 ) ) )
            // InternalCls.g:1357:1: ( ( rule__PackageImport__PackageAssignment_1 ) )
            {
            // InternalCls.g:1357:1: ( ( rule__PackageImport__PackageAssignment_1 ) )
            // InternalCls.g:1358:1: ( rule__PackageImport__PackageAssignment_1 )
            {
             before(grammarAccess.getPackageImportAccess().getPackageAssignment_1()); 
            // InternalCls.g:1359:1: ( rule__PackageImport__PackageAssignment_1 )
            // InternalCls.g:1359:2: rule__PackageImport__PackageAssignment_1
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
    // InternalCls.g:1373:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1377:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCls.g:1378:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalCls.g:1385:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1389:1: ( ( RULE_ID ) )
            // InternalCls.g:1390:1: ( RULE_ID )
            {
            // InternalCls.g:1390:1: ( RULE_ID )
            // InternalCls.g:1391:1: RULE_ID
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
    // InternalCls.g:1402:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1406:1: ( rule__FQN__Group__1__Impl )
            // InternalCls.g:1407:2: rule__FQN__Group__1__Impl
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
    // InternalCls.g:1413:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1417:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCls.g:1418:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCls.g:1418:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCls.g:1419:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCls.g:1420:1: ( rule__FQN__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCls.g:1420:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCls.g:1434:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1438:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCls.g:1439:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalCls.g:1446:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1450:1: ( ( '.' ) )
            // InternalCls.g:1451:1: ( '.' )
            {
            // InternalCls.g:1451:1: ( '.' )
            // InternalCls.g:1452:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCls.g:1465:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1469:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCls.g:1470:2: rule__FQN__Group_1__1__Impl
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
    // InternalCls.g:1476:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1480:1: ( ( RULE_ID ) )
            // InternalCls.g:1481:1: ( RULE_ID )
            {
            // InternalCls.g:1481:1: ( RULE_ID )
            // InternalCls.g:1482:1: RULE_ID
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
    // InternalCls.g:1497:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1501:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalCls.g:1502:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalCls.g:1509:1: rule__Class__Group__0__Impl : ( ( rule__Class__VisibilityAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1513:1: ( ( ( rule__Class__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1514:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1514:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            // InternalCls.g:1515:1: ( rule__Class__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1516:1: ( rule__Class__VisibilityAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=12 && LA16_0<=15)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCls.g:1516:2: rule__Class__VisibilityAssignment_0
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
    // InternalCls.g:1526:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1530:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalCls.g:1531:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalCls.g:1538:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1542:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalCls.g:1543:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalCls.g:1543:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalCls.g:1544:1: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalCls.g:1545:1: ( rule__Class__AbstractAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==50) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCls.g:1545:2: rule__Class__AbstractAssignment_1
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
    // InternalCls.g:1555:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1559:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalCls.g:1560:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalCls.g:1567:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1571:1: ( ( 'class' ) )
            // InternalCls.g:1572:1: ( 'class' )
            {
            // InternalCls.g:1572:1: ( 'class' )
            // InternalCls.g:1573:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCls.g:1586:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1590:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalCls.g:1591:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalCls.g:1598:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1602:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalCls.g:1603:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalCls.g:1603:1: ( ( rule__Class__Group_3__0 )? )
            // InternalCls.g:1604:1: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalCls.g:1605:1: ( rule__Class__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==37) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalCls.g:1605:2: rule__Class__Group_3__0
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
    // InternalCls.g:1615:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1619:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalCls.g:1620:2: rule__Class__Group__4__Impl rule__Class__Group__5
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
    // InternalCls.g:1627:1: rule__Class__Group__4__Impl : ( ( rule__Class__ReferencedElementAssignment_4 ) ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1631:1: ( ( ( rule__Class__ReferencedElementAssignment_4 ) ) )
            // InternalCls.g:1632:1: ( ( rule__Class__ReferencedElementAssignment_4 ) )
            {
            // InternalCls.g:1632:1: ( ( rule__Class__ReferencedElementAssignment_4 ) )
            // InternalCls.g:1633:1: ( rule__Class__ReferencedElementAssignment_4 )
            {
             before(grammarAccess.getClassAccess().getReferencedElementAssignment_4()); 
            // InternalCls.g:1634:1: ( rule__Class__ReferencedElementAssignment_4 )
            // InternalCls.g:1634:2: rule__Class__ReferencedElementAssignment_4
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
    // InternalCls.g:1644:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1648:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalCls.g:1649:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

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
    // InternalCls.g:1656:1: rule__Class__Group__5__Impl : ( '{' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1660:1: ( ( '{' ) )
            // InternalCls.g:1661:1: ( '{' )
            {
            // InternalCls.g:1661:1: ( '{' )
            // InternalCls.g:1662:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Class__Group__6"
    // InternalCls.g:1675:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1679:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalCls.g:1680:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

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
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalCls.g:1687:1: rule__Class__Group__6__Impl : ( ( rule__Class__MembersAssignment_6 )* ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1691:1: ( ( ( rule__Class__MembersAssignment_6 )* ) )
            // InternalCls.g:1692:1: ( ( rule__Class__MembersAssignment_6 )* )
            {
            // InternalCls.g:1692:1: ( ( rule__Class__MembersAssignment_6 )* )
            // InternalCls.g:1693:1: ( rule__Class__MembersAssignment_6 )*
            {
             before(grammarAccess.getClassAccess().getMembersAssignment_6()); 
            // InternalCls.g:1694:1: ( rule__Class__MembersAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=12 && LA19_0<=15)||(LA19_0>=50 && LA19_0<=52)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCls.g:1694:2: rule__Class__MembersAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Class__MembersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMembersAssignment_6()); 

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
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalCls.g:1704:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1708:1: ( rule__Class__Group__7__Impl )
            // InternalCls.g:1709:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__7__Impl();

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
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalCls.g:1715:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1719:1: ( ( '}' ) )
            // InternalCls.g:1720:1: ( '}' )
            {
            // InternalCls.g:1720:1: ( '}' )
            // InternalCls.g:1721:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalCls.g:1750:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1754:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalCls.g:1755:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCls.g:1762:1: rule__Class__Group_3__0__Impl : ( ( rule__Class__LongNameAssignment_3_0 ) ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1766:1: ( ( ( rule__Class__LongNameAssignment_3_0 ) ) )
            // InternalCls.g:1767:1: ( ( rule__Class__LongNameAssignment_3_0 ) )
            {
            // InternalCls.g:1767:1: ( ( rule__Class__LongNameAssignment_3_0 ) )
            // InternalCls.g:1768:1: ( rule__Class__LongNameAssignment_3_0 )
            {
             before(grammarAccess.getClassAccess().getLongNameAssignment_3_0()); 
            // InternalCls.g:1769:1: ( rule__Class__LongNameAssignment_3_0 )
            // InternalCls.g:1769:2: rule__Class__LongNameAssignment_3_0
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
    // InternalCls.g:1779:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1783:1: ( rule__Class__Group_3__1__Impl )
            // InternalCls.g:1784:2: rule__Class__Group_3__1__Impl
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
    // InternalCls.g:1790:1: rule__Class__Group_3__1__Impl : ( 'as' ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1794:1: ( ( 'as' ) )
            // InternalCls.g:1795:1: ( 'as' )
            {
            // InternalCls.g:1795:1: ( 'as' )
            // InternalCls.g:1796:1: 'as'
            {
             before(grammarAccess.getClassAccess().getAsKeyword_3_1()); 
            match(input,37,FOLLOW_2); 
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


    // $ANTLR start "rule__Interface__Group__0"
    // InternalCls.g:1813:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1817:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalCls.g:1818:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
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
    // InternalCls.g:1825:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__VisibilityAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1829:1: ( ( ( rule__Interface__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1830:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1830:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            // InternalCls.g:1831:1: ( rule__Interface__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1832:1: ( rule__Interface__VisibilityAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=12 && LA20_0<=15)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCls.g:1832:2: rule__Interface__VisibilityAssignment_0
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
    // InternalCls.g:1842:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1846:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalCls.g:1847:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
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
    // InternalCls.g:1854:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1858:1: ( ( 'interface' ) )
            // InternalCls.g:1859:1: ( 'interface' )
            {
            // InternalCls.g:1859:1: ( 'interface' )
            // InternalCls.g:1860:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCls.g:1873:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1877:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalCls.g:1878:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
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
    // InternalCls.g:1885:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__Group_2__0 )? ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1889:1: ( ( ( rule__Interface__Group_2__0 )? ) )
            // InternalCls.g:1890:1: ( ( rule__Interface__Group_2__0 )? )
            {
            // InternalCls.g:1890:1: ( ( rule__Interface__Group_2__0 )? )
            // InternalCls.g:1891:1: ( rule__Interface__Group_2__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_2()); 
            // InternalCls.g:1892:1: ( rule__Interface__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==37) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalCls.g:1892:2: rule__Interface__Group_2__0
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
    // InternalCls.g:1902:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1906:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalCls.g:1907:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
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
    // InternalCls.g:1914:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__ReferencedElementAssignment_3 ) ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1918:1: ( ( ( rule__Interface__ReferencedElementAssignment_3 ) ) )
            // InternalCls.g:1919:1: ( ( rule__Interface__ReferencedElementAssignment_3 ) )
            {
            // InternalCls.g:1919:1: ( ( rule__Interface__ReferencedElementAssignment_3 ) )
            // InternalCls.g:1920:1: ( rule__Interface__ReferencedElementAssignment_3 )
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementAssignment_3()); 
            // InternalCls.g:1921:1: ( rule__Interface__ReferencedElementAssignment_3 )
            // InternalCls.g:1921:2: rule__Interface__ReferencedElementAssignment_3
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
    // InternalCls.g:1931:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1935:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalCls.g:1936:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__5();

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
    // InternalCls.g:1943:1: rule__Interface__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1947:1: ( ( '{' ) )
            // InternalCls.g:1948:1: ( '{' )
            {
            // InternalCls.g:1948:1: ( '{' )
            // InternalCls.g:1949:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Interface__Group__5"
    // InternalCls.g:1962:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1966:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // InternalCls.g:1967:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Interface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__6();

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
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // InternalCls.g:1974:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__MembersAssignment_5 )* ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1978:1: ( ( ( rule__Interface__MembersAssignment_5 )* ) )
            // InternalCls.g:1979:1: ( ( rule__Interface__MembersAssignment_5 )* )
            {
            // InternalCls.g:1979:1: ( ( rule__Interface__MembersAssignment_5 )* )
            // InternalCls.g:1980:1: ( rule__Interface__MembersAssignment_5 )*
            {
             before(grammarAccess.getInterfaceAccess().getMembersAssignment_5()); 
            // InternalCls.g:1981:1: ( rule__Interface__MembersAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=12 && LA22_0<=15)||(LA22_0>=50 && LA22_0<=52)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCls.g:1981:2: rule__Interface__MembersAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Interface__MembersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getMembersAssignment_5()); 

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
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__6"
    // InternalCls.g:1991:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1995:1: ( rule__Interface__Group__6__Impl )
            // InternalCls.g:1996:2: rule__Interface__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__6__Impl();

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
    // $ANTLR end "rule__Interface__Group__6"


    // $ANTLR start "rule__Interface__Group__6__Impl"
    // InternalCls.g:2002:1: rule__Interface__Group__6__Impl : ( '}' ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2006:1: ( ( '}' ) )
            // InternalCls.g:2007:1: ( '}' )
            {
            // InternalCls.g:2007:1: ( '}' )
            // InternalCls.g:2008:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Interface__Group__6__Impl"


    // $ANTLR start "rule__Interface__Group_2__0"
    // InternalCls.g:2035:1: rule__Interface__Group_2__0 : rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 ;
    public final void rule__Interface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2039:1: ( rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 )
            // InternalCls.g:2040:2: rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCls.g:2047:1: rule__Interface__Group_2__0__Impl : ( ( rule__Interface__LongNameAssignment_2_0 ) ) ;
    public final void rule__Interface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2051:1: ( ( ( rule__Interface__LongNameAssignment_2_0 ) ) )
            // InternalCls.g:2052:1: ( ( rule__Interface__LongNameAssignment_2_0 ) )
            {
            // InternalCls.g:2052:1: ( ( rule__Interface__LongNameAssignment_2_0 ) )
            // InternalCls.g:2053:1: ( rule__Interface__LongNameAssignment_2_0 )
            {
             before(grammarAccess.getInterfaceAccess().getLongNameAssignment_2_0()); 
            // InternalCls.g:2054:1: ( rule__Interface__LongNameAssignment_2_0 )
            // InternalCls.g:2054:2: rule__Interface__LongNameAssignment_2_0
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
    // InternalCls.g:2064:1: rule__Interface__Group_2__1 : rule__Interface__Group_2__1__Impl ;
    public final void rule__Interface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2068:1: ( rule__Interface__Group_2__1__Impl )
            // InternalCls.g:2069:2: rule__Interface__Group_2__1__Impl
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
    // InternalCls.g:2075:1: rule__Interface__Group_2__1__Impl : ( 'as' ) ;
    public final void rule__Interface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2079:1: ( ( 'as' ) )
            // InternalCls.g:2080:1: ( 'as' )
            {
            // InternalCls.g:2080:1: ( 'as' )
            // InternalCls.g:2081:1: 'as'
            {
             before(grammarAccess.getInterfaceAccess().getAsKeyword_2_1()); 
            match(input,37,FOLLOW_2); 
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalCls.g:2098:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2102:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalCls.g:2103:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalCls.g:2110:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2114:1: ( ( () ) )
            // InternalCls.g:2115:1: ( () )
            {
            // InternalCls.g:2115:1: ( () )
            // InternalCls.g:2116:1: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalCls.g:2117:1: ()
            // InternalCls.g:2119:1: 
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
    // InternalCls.g:2129:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2133:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalCls.g:2134:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalCls.g:2141:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__VisibilityAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2145:1: ( ( ( rule__Attribute__VisibilityAssignment_1 )? ) )
            // InternalCls.g:2146:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            {
            // InternalCls.g:2146:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            // InternalCls.g:2147:1: ( rule__Attribute__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 
            // InternalCls.g:2148:1: ( rule__Attribute__VisibilityAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=12 && LA23_0<=15)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCls.g:2148:2: rule__Attribute__VisibilityAssignment_1
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
    // InternalCls.g:2158:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2162:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalCls.g:2163:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalCls.g:2170:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__StaticAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2174:1: ( ( ( rule__Attribute__StaticAssignment_2 )? ) )
            // InternalCls.g:2175:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            {
            // InternalCls.g:2175:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            // InternalCls.g:2176:1: ( rule__Attribute__StaticAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getStaticAssignment_2()); 
            // InternalCls.g:2177:1: ( rule__Attribute__StaticAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCls.g:2177:2: rule__Attribute__StaticAssignment_2
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
    // InternalCls.g:2187:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2191:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalCls.g:2192:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalCls.g:2199:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__FinalAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2203:1: ( ( ( rule__Attribute__FinalAssignment_3 )? ) )
            // InternalCls.g:2204:1: ( ( rule__Attribute__FinalAssignment_3 )? )
            {
            // InternalCls.g:2204:1: ( ( rule__Attribute__FinalAssignment_3 )? )
            // InternalCls.g:2205:1: ( rule__Attribute__FinalAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getFinalAssignment_3()); 
            // InternalCls.g:2206:1: ( rule__Attribute__FinalAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:2206:2: rule__Attribute__FinalAssignment_3
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
    // InternalCls.g:2216:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2220:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalCls.g:2221:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalCls.g:2228:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__ReferencedElementAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2232:1: ( ( ( rule__Attribute__ReferencedElementAssignment_4 ) ) )
            // InternalCls.g:2233:1: ( ( rule__Attribute__ReferencedElementAssignment_4 ) )
            {
            // InternalCls.g:2233:1: ( ( rule__Attribute__ReferencedElementAssignment_4 ) )
            // InternalCls.g:2234:1: ( rule__Attribute__ReferencedElementAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getReferencedElementAssignment_4()); 
            // InternalCls.g:2235:1: ( rule__Attribute__ReferencedElementAssignment_4 )
            // InternalCls.g:2235:2: rule__Attribute__ReferencedElementAssignment_4
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
    // InternalCls.g:2245:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2249:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalCls.g:2250:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
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
    // InternalCls.g:2257:1: rule__Attribute__Group__5__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2261:1: ( ( ':' ) )
            // InternalCls.g:2262:1: ( ':' )
            {
            // InternalCls.g:2262:1: ( ':' )
            // InternalCls.g:2263:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCls.g:2276:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2280:1: ( rule__Attribute__Group__6__Impl )
            // InternalCls.g:2281:2: rule__Attribute__Group__6__Impl
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
    // InternalCls.g:2287:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__TypeAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2291:1: ( ( ( rule__Attribute__TypeAssignment_6 ) ) )
            // InternalCls.g:2292:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            {
            // InternalCls.g:2292:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            // InternalCls.g:2293:1: ( rule__Attribute__TypeAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_6()); 
            // InternalCls.g:2294:1: ( rule__Attribute__TypeAssignment_6 )
            // InternalCls.g:2294:2: rule__Attribute__TypeAssignment_6
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
    // InternalCls.g:2318:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2322:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalCls.g:2323:2: rule__Method__Group__0__Impl rule__Method__Group__1
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
    // InternalCls.g:2330:1: rule__Method__Group__0__Impl : ( ( rule__Method__VisibilityAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2334:1: ( ( ( rule__Method__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2335:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2335:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            // InternalCls.g:2336:1: ( rule__Method__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2337:1: ( rule__Method__VisibilityAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=12 && LA26_0<=15)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:2337:2: rule__Method__VisibilityAssignment_0
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
    // InternalCls.g:2347:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2351:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalCls.g:2352:2: rule__Method__Group__1__Impl rule__Method__Group__2
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
    // InternalCls.g:2359:1: rule__Method__Group__1__Impl : ( ( rule__Method__AbstractAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2363:1: ( ( ( rule__Method__AbstractAssignment_1 )? ) )
            // InternalCls.g:2364:1: ( ( rule__Method__AbstractAssignment_1 )? )
            {
            // InternalCls.g:2364:1: ( ( rule__Method__AbstractAssignment_1 )? )
            // InternalCls.g:2365:1: ( rule__Method__AbstractAssignment_1 )?
            {
             before(grammarAccess.getMethodAccess().getAbstractAssignment_1()); 
            // InternalCls.g:2366:1: ( rule__Method__AbstractAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:2366:2: rule__Method__AbstractAssignment_1
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
    // InternalCls.g:2376:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2380:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalCls.g:2381:2: rule__Method__Group__2__Impl rule__Method__Group__3
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
    // InternalCls.g:2388:1: rule__Method__Group__2__Impl : ( ( rule__Method__StaticAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2392:1: ( ( ( rule__Method__StaticAssignment_2 )? ) )
            // InternalCls.g:2393:1: ( ( rule__Method__StaticAssignment_2 )? )
            {
            // InternalCls.g:2393:1: ( ( rule__Method__StaticAssignment_2 )? )
            // InternalCls.g:2394:1: ( rule__Method__StaticAssignment_2 )?
            {
             before(grammarAccess.getMethodAccess().getStaticAssignment_2()); 
            // InternalCls.g:2395:1: ( rule__Method__StaticAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCls.g:2395:2: rule__Method__StaticAssignment_2
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
    // InternalCls.g:2405:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2409:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalCls.g:2410:2: rule__Method__Group__3__Impl rule__Method__Group__4
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
    // InternalCls.g:2417:1: rule__Method__Group__3__Impl : ( ( rule__Method__FinalAssignment_3 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2421:1: ( ( ( rule__Method__FinalAssignment_3 )? ) )
            // InternalCls.g:2422:1: ( ( rule__Method__FinalAssignment_3 )? )
            {
            // InternalCls.g:2422:1: ( ( rule__Method__FinalAssignment_3 )? )
            // InternalCls.g:2423:1: ( rule__Method__FinalAssignment_3 )?
            {
             before(grammarAccess.getMethodAccess().getFinalAssignment_3()); 
            // InternalCls.g:2424:1: ( rule__Method__FinalAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:2424:2: rule__Method__FinalAssignment_3
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
    // InternalCls.g:2434:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2438:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalCls.g:2439:2: rule__Method__Group__4__Impl rule__Method__Group__5
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
    // InternalCls.g:2446:1: rule__Method__Group__4__Impl : ( ( rule__Method__ReferencedElementAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2450:1: ( ( ( rule__Method__ReferencedElementAssignment_4 ) ) )
            // InternalCls.g:2451:1: ( ( rule__Method__ReferencedElementAssignment_4 ) )
            {
            // InternalCls.g:2451:1: ( ( rule__Method__ReferencedElementAssignment_4 ) )
            // InternalCls.g:2452:1: ( rule__Method__ReferencedElementAssignment_4 )
            {
             before(grammarAccess.getMethodAccess().getReferencedElementAssignment_4()); 
            // InternalCls.g:2453:1: ( rule__Method__ReferencedElementAssignment_4 )
            // InternalCls.g:2453:2: rule__Method__ReferencedElementAssignment_4
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
    // InternalCls.g:2463:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2467:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalCls.g:2468:2: rule__Method__Group__5__Impl rule__Method__Group__6
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
    // InternalCls.g:2475:1: rule__Method__Group__5__Impl : ( '(' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2479:1: ( ( '(' ) )
            // InternalCls.g:2480:1: ( '(' )
            {
            // InternalCls.g:2480:1: ( '(' )
            // InternalCls.g:2481:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCls.g:2494:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2498:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalCls.g:2499:2: rule__Method__Group__6__Impl rule__Method__Group__7
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
    // InternalCls.g:2506:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )* ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2510:1: ( ( ( rule__Method__Group_6__0 )* ) )
            // InternalCls.g:2511:1: ( ( rule__Method__Group_6__0 )* )
            {
            // InternalCls.g:2511:1: ( ( rule__Method__Group_6__0 )* )
            // InternalCls.g:2512:1: ( rule__Method__Group_6__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalCls.g:2513:1: ( rule__Method__Group_6__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=12 && LA30_0<=15)||(LA30_0>=51 && LA30_0<=52)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCls.g:2513:2: rule__Method__Group_6__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Method__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalCls.g:2523:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2527:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalCls.g:2528:2: rule__Method__Group__7__Impl rule__Method__Group__8
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
    // InternalCls.g:2535:1: rule__Method__Group__7__Impl : ( ')' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2539:1: ( ( ')' ) )
            // InternalCls.g:2540:1: ( ')' )
            {
            // InternalCls.g:2540:1: ( ')' )
            // InternalCls.g:2541:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCls.g:2554:1: rule__Method__Group__8 : rule__Method__Group__8__Impl ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2558:1: ( rule__Method__Group__8__Impl )
            // InternalCls.g:2559:2: rule__Method__Group__8__Impl
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
    // InternalCls.g:2565:1: rule__Method__Group__8__Impl : ( ( rule__Method__Group_8__0 )? ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2569:1: ( ( ( rule__Method__Group_8__0 )? ) )
            // InternalCls.g:2570:1: ( ( rule__Method__Group_8__0 )? )
            {
            // InternalCls.g:2570:1: ( ( rule__Method__Group_8__0 )? )
            // InternalCls.g:2571:1: ( rule__Method__Group_8__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_8()); 
            // InternalCls.g:2572:1: ( rule__Method__Group_8__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCls.g:2572:2: rule__Method__Group_8__0
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
    // InternalCls.g:2600:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2604:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalCls.g:2605:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
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
    // InternalCls.g:2612:1: rule__Method__Group_6__0__Impl : ( ( rule__Method__ParametersAssignment_6_0 ) ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2616:1: ( ( ( rule__Method__ParametersAssignment_6_0 ) ) )
            // InternalCls.g:2617:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            {
            // InternalCls.g:2617:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            // InternalCls.g:2618:1: ( rule__Method__ParametersAssignment_6_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_0()); 
            // InternalCls.g:2619:1: ( rule__Method__ParametersAssignment_6_0 )
            // InternalCls.g:2619:2: rule__Method__ParametersAssignment_6_0
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
    // InternalCls.g:2629:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2633:1: ( rule__Method__Group_6__1__Impl )
            // InternalCls.g:2634:2: rule__Method__Group_6__1__Impl
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
    // InternalCls.g:2640:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Group_6_1__0 )* ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2644:1: ( ( ( rule__Method__Group_6_1__0 )* ) )
            // InternalCls.g:2645:1: ( ( rule__Method__Group_6_1__0 )* )
            {
            // InternalCls.g:2645:1: ( ( rule__Method__Group_6_1__0 )* )
            // InternalCls.g:2646:1: ( rule__Method__Group_6_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6_1()); 
            // InternalCls.g:2647:1: ( rule__Method__Group_6_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==42) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCls.g:2647:2: rule__Method__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Method__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalCls.g:2661:1: rule__Method__Group_6_1__0 : rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
    public final void rule__Method__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2665:1: ( rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
            // InternalCls.g:2666:2: rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
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
    // InternalCls.g:2673:1: rule__Method__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2677:1: ( ( ',' ) )
            // InternalCls.g:2678:1: ( ',' )
            {
            // InternalCls.g:2678:1: ( ',' )
            // InternalCls.g:2679:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_6_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCls.g:2692:1: rule__Method__Group_6_1__1 : rule__Method__Group_6_1__1__Impl ;
    public final void rule__Method__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2696:1: ( rule__Method__Group_6_1__1__Impl )
            // InternalCls.g:2697:2: rule__Method__Group_6_1__1__Impl
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
    // InternalCls.g:2703:1: rule__Method__Group_6_1__1__Impl : ( ( rule__Method__ParametersAssignment_6_1_1 ) ) ;
    public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2707:1: ( ( ( rule__Method__ParametersAssignment_6_1_1 ) ) )
            // InternalCls.g:2708:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            {
            // InternalCls.g:2708:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            // InternalCls.g:2709:1: ( rule__Method__ParametersAssignment_6_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_1_1()); 
            // InternalCls.g:2710:1: ( rule__Method__ParametersAssignment_6_1_1 )
            // InternalCls.g:2710:2: rule__Method__ParametersAssignment_6_1_1
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
    // InternalCls.g:2724:1: rule__Method__Group_8__0 : rule__Method__Group_8__0__Impl rule__Method__Group_8__1 ;
    public final void rule__Method__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2728:1: ( rule__Method__Group_8__0__Impl rule__Method__Group_8__1 )
            // InternalCls.g:2729:2: rule__Method__Group_8__0__Impl rule__Method__Group_8__1
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
    // InternalCls.g:2736:1: rule__Method__Group_8__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2740:1: ( ( ':' ) )
            // InternalCls.g:2741:1: ( ':' )
            {
            // InternalCls.g:2741:1: ( ':' )
            // InternalCls.g:2742:1: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCls.g:2755:1: rule__Method__Group_8__1 : rule__Method__Group_8__1__Impl ;
    public final void rule__Method__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2759:1: ( rule__Method__Group_8__1__Impl )
            // InternalCls.g:2760:2: rule__Method__Group_8__1__Impl
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
    // InternalCls.g:2766:1: rule__Method__Group_8__1__Impl : ( ( rule__Method__TypeAssignment_8_1 ) ) ;
    public final void rule__Method__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2770:1: ( ( ( rule__Method__TypeAssignment_8_1 ) ) )
            // InternalCls.g:2771:1: ( ( rule__Method__TypeAssignment_8_1 ) )
            {
            // InternalCls.g:2771:1: ( ( rule__Method__TypeAssignment_8_1 ) )
            // InternalCls.g:2772:1: ( rule__Method__TypeAssignment_8_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_8_1()); 
            // InternalCls.g:2773:1: ( rule__Method__TypeAssignment_8_1 )
            // InternalCls.g:2773:2: rule__Method__TypeAssignment_8_1
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
    // InternalCls.g:2787:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2791:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCls.g:2792:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalCls.g:2799:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__VisibilityAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2803:1: ( ( ( rule__Parameter__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2804:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2804:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            // InternalCls.g:2805:1: ( rule__Parameter__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2806:1: ( rule__Parameter__VisibilityAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=12 && LA33_0<=15)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:2806:2: rule__Parameter__VisibilityAssignment_0
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
    // InternalCls.g:2816:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2820:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCls.g:2821:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalCls.g:2828:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__StaticAssignment_1 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2832:1: ( ( ( rule__Parameter__StaticAssignment_1 )? ) )
            // InternalCls.g:2833:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            {
            // InternalCls.g:2833:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            // InternalCls.g:2834:1: ( rule__Parameter__StaticAssignment_1 )?
            {
             before(grammarAccess.getParameterAccess().getStaticAssignment_1()); 
            // InternalCls.g:2835:1: ( rule__Parameter__StaticAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCls.g:2835:2: rule__Parameter__StaticAssignment_1
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
    // InternalCls.g:2845:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2849:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCls.g:2850:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalCls.g:2857:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__FinalAssignment_2 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2861:1: ( ( ( rule__Parameter__FinalAssignment_2 )? ) )
            // InternalCls.g:2862:1: ( ( rule__Parameter__FinalAssignment_2 )? )
            {
            // InternalCls.g:2862:1: ( ( rule__Parameter__FinalAssignment_2 )? )
            // InternalCls.g:2863:1: ( rule__Parameter__FinalAssignment_2 )?
            {
             before(grammarAccess.getParameterAccess().getFinalAssignment_2()); 
            // InternalCls.g:2864:1: ( rule__Parameter__FinalAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:2864:2: rule__Parameter__FinalAssignment_2
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
    // InternalCls.g:2874:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2878:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalCls.g:2879:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
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
    // InternalCls.g:2886:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ReferencedElementAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2890:1: ( ( ( rule__Parameter__ReferencedElementAssignment_3 ) ) )
            // InternalCls.g:2891:1: ( ( rule__Parameter__ReferencedElementAssignment_3 ) )
            {
            // InternalCls.g:2891:1: ( ( rule__Parameter__ReferencedElementAssignment_3 ) )
            // InternalCls.g:2892:1: ( rule__Parameter__ReferencedElementAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getReferencedElementAssignment_3()); 
            // InternalCls.g:2893:1: ( rule__Parameter__ReferencedElementAssignment_3 )
            // InternalCls.g:2893:2: rule__Parameter__ReferencedElementAssignment_3
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
    // InternalCls.g:2903:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2907:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalCls.g:2908:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
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
    // InternalCls.g:2915:1: rule__Parameter__Group__4__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2919:1: ( ( ':' ) )
            // InternalCls.g:2920:1: ( ':' )
            {
            // InternalCls.g:2920:1: ( ':' )
            // InternalCls.g:2921:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCls.g:2934:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2938:1: ( rule__Parameter__Group__5__Impl )
            // InternalCls.g:2939:2: rule__Parameter__Group__5__Impl
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
    // InternalCls.g:2945:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__TypeAssignment_5 ) ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2949:1: ( ( ( rule__Parameter__TypeAssignment_5 ) ) )
            // InternalCls.g:2950:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            {
            // InternalCls.g:2950:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            // InternalCls.g:2951:1: ( rule__Parameter__TypeAssignment_5 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_5()); 
            // InternalCls.g:2952:1: ( rule__Parameter__TypeAssignment_5 )
            // InternalCls.g:2952:2: rule__Parameter__TypeAssignment_5
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
    // InternalCls.g:2974:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2978:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalCls.g:2979:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
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
    // InternalCls.g:2986:1: rule__Generalization__Group__0__Impl : ( ( rule__Generalization__LeftAssignment_0 ) ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2990:1: ( ( ( rule__Generalization__LeftAssignment_0 ) ) )
            // InternalCls.g:2991:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            {
            // InternalCls.g:2991:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            // InternalCls.g:2992:1: ( rule__Generalization__LeftAssignment_0 )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssignment_0()); 
            // InternalCls.g:2993:1: ( rule__Generalization__LeftAssignment_0 )
            // InternalCls.g:2993:2: rule__Generalization__LeftAssignment_0
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
    // InternalCls.g:3003:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3007:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalCls.g:3008:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
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
    // InternalCls.g:3015:1: rule__Generalization__Group__1__Impl : ( 'isa' ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3019:1: ( ( 'isa' ) )
            // InternalCls.g:3020:1: ( 'isa' )
            {
            // InternalCls.g:3020:1: ( 'isa' )
            // InternalCls.g:3021:1: 'isa'
            {
             before(grammarAccess.getGeneralizationAccess().getIsaKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCls.g:3034:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3038:1: ( rule__Generalization__Group__2__Impl )
            // InternalCls.g:3039:2: rule__Generalization__Group__2__Impl
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
    // InternalCls.g:3045:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__RightAssignment_2 ) ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3049:1: ( ( ( rule__Generalization__RightAssignment_2 ) ) )
            // InternalCls.g:3050:1: ( ( rule__Generalization__RightAssignment_2 ) )
            {
            // InternalCls.g:3050:1: ( ( rule__Generalization__RightAssignment_2 ) )
            // InternalCls.g:3051:1: ( rule__Generalization__RightAssignment_2 )
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssignment_2()); 
            // InternalCls.g:3052:1: ( rule__Generalization__RightAssignment_2 )
            // InternalCls.g:3052:2: rule__Generalization__RightAssignment_2
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
    // InternalCls.g:3068:1: rule__Implementation__Group__0 : rule__Implementation__Group__0__Impl rule__Implementation__Group__1 ;
    public final void rule__Implementation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3072:1: ( rule__Implementation__Group__0__Impl rule__Implementation__Group__1 )
            // InternalCls.g:3073:2: rule__Implementation__Group__0__Impl rule__Implementation__Group__1
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
    // InternalCls.g:3080:1: rule__Implementation__Group__0__Impl : ( ( rule__Implementation__LeftAssignment_0 ) ) ;
    public final void rule__Implementation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3084:1: ( ( ( rule__Implementation__LeftAssignment_0 ) ) )
            // InternalCls.g:3085:1: ( ( rule__Implementation__LeftAssignment_0 ) )
            {
            // InternalCls.g:3085:1: ( ( rule__Implementation__LeftAssignment_0 ) )
            // InternalCls.g:3086:1: ( rule__Implementation__LeftAssignment_0 )
            {
             before(grammarAccess.getImplementationAccess().getLeftAssignment_0()); 
            // InternalCls.g:3087:1: ( rule__Implementation__LeftAssignment_0 )
            // InternalCls.g:3087:2: rule__Implementation__LeftAssignment_0
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
    // InternalCls.g:3097:1: rule__Implementation__Group__1 : rule__Implementation__Group__1__Impl rule__Implementation__Group__2 ;
    public final void rule__Implementation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3101:1: ( rule__Implementation__Group__1__Impl rule__Implementation__Group__2 )
            // InternalCls.g:3102:2: rule__Implementation__Group__1__Impl rule__Implementation__Group__2
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
    // InternalCls.g:3109:1: rule__Implementation__Group__1__Impl : ( 'impl' ) ;
    public final void rule__Implementation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3113:1: ( ( 'impl' ) )
            // InternalCls.g:3114:1: ( 'impl' )
            {
            // InternalCls.g:3114:1: ( 'impl' )
            // InternalCls.g:3115:1: 'impl'
            {
             before(grammarAccess.getImplementationAccess().getImplKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCls.g:3128:1: rule__Implementation__Group__2 : rule__Implementation__Group__2__Impl ;
    public final void rule__Implementation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3132:1: ( rule__Implementation__Group__2__Impl )
            // InternalCls.g:3133:2: rule__Implementation__Group__2__Impl
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
    // InternalCls.g:3139:1: rule__Implementation__Group__2__Impl : ( ( rule__Implementation__RightAssignment_2 ) ) ;
    public final void rule__Implementation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3143:1: ( ( ( rule__Implementation__RightAssignment_2 ) ) )
            // InternalCls.g:3144:1: ( ( rule__Implementation__RightAssignment_2 ) )
            {
            // InternalCls.g:3144:1: ( ( rule__Implementation__RightAssignment_2 ) )
            // InternalCls.g:3145:1: ( rule__Implementation__RightAssignment_2 )
            {
             before(grammarAccess.getImplementationAccess().getRightAssignment_2()); 
            // InternalCls.g:3146:1: ( rule__Implementation__RightAssignment_2 )
            // InternalCls.g:3146:2: rule__Implementation__RightAssignment_2
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
    // InternalCls.g:3162:1: rule__CommentLink__Group__0 : rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1 ;
    public final void rule__CommentLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3166:1: ( rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1 )
            // InternalCls.g:3167:2: rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1
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
    // InternalCls.g:3174:1: rule__CommentLink__Group__0__Impl : ( ( rule__CommentLink__LeftAssignment_0 ) ) ;
    public final void rule__CommentLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3178:1: ( ( ( rule__CommentLink__LeftAssignment_0 ) ) )
            // InternalCls.g:3179:1: ( ( rule__CommentLink__LeftAssignment_0 ) )
            {
            // InternalCls.g:3179:1: ( ( rule__CommentLink__LeftAssignment_0 ) )
            // InternalCls.g:3180:1: ( rule__CommentLink__LeftAssignment_0 )
            {
             before(grammarAccess.getCommentLinkAccess().getLeftAssignment_0()); 
            // InternalCls.g:3181:1: ( rule__CommentLink__LeftAssignment_0 )
            // InternalCls.g:3181:2: rule__CommentLink__LeftAssignment_0
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
    // InternalCls.g:3191:1: rule__CommentLink__Group__1 : rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2 ;
    public final void rule__CommentLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3195:1: ( rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2 )
            // InternalCls.g:3196:2: rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalCls.g:3203:1: rule__CommentLink__Group__1__Impl : ( '-' ) ;
    public final void rule__CommentLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3207:1: ( ( '-' ) )
            // InternalCls.g:3208:1: ( '-' )
            {
            // InternalCls.g:3208:1: ( '-' )
            // InternalCls.g:3209:1: '-'
            {
             before(grammarAccess.getCommentLinkAccess().getHyphenMinusKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCommentLinkAccess().getHyphenMinusKeyword_1()); 

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
    // InternalCls.g:3222:1: rule__CommentLink__Group__2 : rule__CommentLink__Group__2__Impl rule__CommentLink__Group__3 ;
    public final void rule__CommentLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3226:1: ( rule__CommentLink__Group__2__Impl rule__CommentLink__Group__3 )
            // InternalCls.g:3227:2: rule__CommentLink__Group__2__Impl rule__CommentLink__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CommentLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommentLink__Group__3();

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
    // InternalCls.g:3234:1: rule__CommentLink__Group__2__Impl : ( 'note' ) ;
    public final void rule__CommentLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3238:1: ( ( 'note' ) )
            // InternalCls.g:3239:1: ( 'note' )
            {
            // InternalCls.g:3239:1: ( 'note' )
            // InternalCls.g:3240:1: 'note'
            {
             before(grammarAccess.getCommentLinkAccess().getNoteKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCommentLinkAccess().getNoteKeyword_2()); 

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


    // $ANTLR start "rule__CommentLink__Group__3"
    // InternalCls.g:3253:1: rule__CommentLink__Group__3 : rule__CommentLink__Group__3__Impl ;
    public final void rule__CommentLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3257:1: ( rule__CommentLink__Group__3__Impl )
            // InternalCls.g:3258:2: rule__CommentLink__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommentLink__Group__3__Impl();

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
    // $ANTLR end "rule__CommentLink__Group__3"


    // $ANTLR start "rule__CommentLink__Group__3__Impl"
    // InternalCls.g:3264:1: rule__CommentLink__Group__3__Impl : ( ( rule__CommentLink__CommentAssignment_3 ) ) ;
    public final void rule__CommentLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3268:1: ( ( ( rule__CommentLink__CommentAssignment_3 ) ) )
            // InternalCls.g:3269:1: ( ( rule__CommentLink__CommentAssignment_3 ) )
            {
            // InternalCls.g:3269:1: ( ( rule__CommentLink__CommentAssignment_3 ) )
            // InternalCls.g:3270:1: ( rule__CommentLink__CommentAssignment_3 )
            {
             before(grammarAccess.getCommentLinkAccess().getCommentAssignment_3()); 
            // InternalCls.g:3271:1: ( rule__CommentLink__CommentAssignment_3 )
            // InternalCls.g:3271:2: rule__CommentLink__CommentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CommentLink__CommentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCommentLinkAccess().getCommentAssignment_3()); 

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
    // $ANTLR end "rule__CommentLink__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // InternalCls.g:3289:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3293:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalCls.g:3294:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCls.g:3301:1: rule__Association__Group__0__Impl : ( ( rule__Association__AggregationKindAssignment_0 ) ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3305:1: ( ( ( rule__Association__AggregationKindAssignment_0 ) ) )
            // InternalCls.g:3306:1: ( ( rule__Association__AggregationKindAssignment_0 ) )
            {
            // InternalCls.g:3306:1: ( ( rule__Association__AggregationKindAssignment_0 ) )
            // InternalCls.g:3307:1: ( rule__Association__AggregationKindAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getAggregationKindAssignment_0()); 
            // InternalCls.g:3308:1: ( rule__Association__AggregationKindAssignment_0 )
            // InternalCls.g:3308:2: rule__Association__AggregationKindAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Association__AggregationKindAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAggregationKindAssignment_0()); 

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
    // InternalCls.g:3318:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3322:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalCls.g:3323:2: rule__Association__Group__1__Impl rule__Association__Group__2
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
    // InternalCls.g:3330:1: rule__Association__Group__1__Impl : ( ( rule__Association__LeftAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3334:1: ( ( ( rule__Association__LeftAssignment_1 ) ) )
            // InternalCls.g:3335:1: ( ( rule__Association__LeftAssignment_1 ) )
            {
            // InternalCls.g:3335:1: ( ( rule__Association__LeftAssignment_1 ) )
            // InternalCls.g:3336:1: ( rule__Association__LeftAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getLeftAssignment_1()); 
            // InternalCls.g:3337:1: ( rule__Association__LeftAssignment_1 )
            // InternalCls.g:3337:2: rule__Association__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Association__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getLeftAssignment_1()); 

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
    // InternalCls.g:3347:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3351:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalCls.g:3352:2: rule__Association__Group__2__Impl rule__Association__Group__3
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
    // InternalCls.g:3359:1: rule__Association__Group__2__Impl : ( ( rule__Association__ReferencedElementAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3363:1: ( ( ( rule__Association__ReferencedElementAssignment_2 ) ) )
            // InternalCls.g:3364:1: ( ( rule__Association__ReferencedElementAssignment_2 ) )
            {
            // InternalCls.g:3364:1: ( ( rule__Association__ReferencedElementAssignment_2 ) )
            // InternalCls.g:3365:1: ( rule__Association__ReferencedElementAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getReferencedElementAssignment_2()); 
            // InternalCls.g:3366:1: ( rule__Association__ReferencedElementAssignment_2 )
            // InternalCls.g:3366:2: rule__Association__ReferencedElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Association__ReferencedElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getReferencedElementAssignment_2()); 

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
    // InternalCls.g:3376:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3380:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalCls.g:3381:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalCls.g:3388:1: rule__Association__Group__3__Impl : ( ( rule__Association__RightAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3392:1: ( ( ( rule__Association__RightAssignment_3 ) ) )
            // InternalCls.g:3393:1: ( ( rule__Association__RightAssignment_3 ) )
            {
            // InternalCls.g:3393:1: ( ( rule__Association__RightAssignment_3 ) )
            // InternalCls.g:3394:1: ( rule__Association__RightAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getRightAssignment_3()); 
            // InternalCls.g:3395:1: ( rule__Association__RightAssignment_3 )
            // InternalCls.g:3395:2: rule__Association__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Association__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getRightAssignment_3()); 

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
    // InternalCls.g:3405:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3409:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalCls.g:3410:2: rule__Association__Group__4__Impl rule__Association__Group__5
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
    // InternalCls.g:3417:1: rule__Association__Group__4__Impl : ( ( rule__Association__PropertiesAssignment_4 )? ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3421:1: ( ( ( rule__Association__PropertiesAssignment_4 )? ) )
            // InternalCls.g:3422:1: ( ( rule__Association__PropertiesAssignment_4 )? )
            {
            // InternalCls.g:3422:1: ( ( rule__Association__PropertiesAssignment_4 )? )
            // InternalCls.g:3423:1: ( rule__Association__PropertiesAssignment_4 )?
            {
             before(grammarAccess.getAssociationAccess().getPropertiesAssignment_4()); 
            // InternalCls.g:3424:1: ( rule__Association__PropertiesAssignment_4 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCls.g:3424:2: rule__Association__PropertiesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__PropertiesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getPropertiesAssignment_4()); 

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
    // InternalCls.g:3434:1: rule__Association__Group__5 : rule__Association__Group__5__Impl ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3438:1: ( rule__Association__Group__5__Impl )
            // InternalCls.g:3439:2: rule__Association__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__5__Impl();

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
    // InternalCls.g:3445:1: rule__Association__Group__5__Impl : ( ( rule__Association__Group_5__0 )? ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3449:1: ( ( ( rule__Association__Group_5__0 )? ) )
            // InternalCls.g:3450:1: ( ( rule__Association__Group_5__0 )? )
            {
            // InternalCls.g:3450:1: ( ( rule__Association__Group_5__0 )? )
            // InternalCls.g:3451:1: ( rule__Association__Group_5__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_5()); 
            // InternalCls.g:3452:1: ( rule__Association__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCls.g:3452:2: rule__Association__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_5()); 

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


    // $ANTLR start "rule__Association__Group_5__0"
    // InternalCls.g:3474:1: rule__Association__Group_5__0 : rule__Association__Group_5__0__Impl rule__Association__Group_5__1 ;
    public final void rule__Association__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3478:1: ( rule__Association__Group_5__0__Impl rule__Association__Group_5__1 )
            // InternalCls.g:3479:2: rule__Association__Group_5__0__Impl rule__Association__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group_5__1();

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
    // $ANTLR end "rule__Association__Group_5__0"


    // $ANTLR start "rule__Association__Group_5__0__Impl"
    // InternalCls.g:3486:1: rule__Association__Group_5__0__Impl : ( 'note' ) ;
    public final void rule__Association__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3490:1: ( ( 'note' ) )
            // InternalCls.g:3491:1: ( 'note' )
            {
            // InternalCls.g:3491:1: ( 'note' )
            // InternalCls.g:3492:1: 'note'
            {
             before(grammarAccess.getAssociationAccess().getNoteKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getNoteKeyword_5_0()); 

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
    // $ANTLR end "rule__Association__Group_5__0__Impl"


    // $ANTLR start "rule__Association__Group_5__1"
    // InternalCls.g:3505:1: rule__Association__Group_5__1 : rule__Association__Group_5__1__Impl ;
    public final void rule__Association__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3509:1: ( rule__Association__Group_5__1__Impl )
            // InternalCls.g:3510:2: rule__Association__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group_5__1__Impl();

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
    // $ANTLR end "rule__Association__Group_5__1"


    // $ANTLR start "rule__Association__Group_5__1__Impl"
    // InternalCls.g:3516:1: rule__Association__Group_5__1__Impl : ( ( rule__Association__CommentAssignment_5_1 ) ) ;
    public final void rule__Association__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3520:1: ( ( ( rule__Association__CommentAssignment_5_1 ) ) )
            // InternalCls.g:3521:1: ( ( rule__Association__CommentAssignment_5_1 ) )
            {
            // InternalCls.g:3521:1: ( ( rule__Association__CommentAssignment_5_1 ) )
            // InternalCls.g:3522:1: ( rule__Association__CommentAssignment_5_1 )
            {
             before(grammarAccess.getAssociationAccess().getCommentAssignment_5_1()); 
            // InternalCls.g:3523:1: ( rule__Association__CommentAssignment_5_1 )
            // InternalCls.g:3523:2: rule__Association__CommentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Association__CommentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getCommentAssignment_5_1()); 

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
    // $ANTLR end "rule__Association__Group_5__1__Impl"


    // $ANTLR start "rule__AssociationProperties__Group__0"
    // InternalCls.g:3537:1: rule__AssociationProperties__Group__0 : rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1 ;
    public final void rule__AssociationProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3541:1: ( rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1 )
            // InternalCls.g:3542:2: rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalCls.g:3549:1: rule__AssociationProperties__Group__0__Impl : ( '[' ) ;
    public final void rule__AssociationProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3553:1: ( ( '[' ) )
            // InternalCls.g:3554:1: ( '[' )
            {
            // InternalCls.g:3554:1: ( '[' )
            // InternalCls.g:3555:1: '['
            {
             before(grammarAccess.getAssociationPropertiesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCls.g:3568:1: rule__AssociationProperties__Group__1 : rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2 ;
    public final void rule__AssociationProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3572:1: ( rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2 )
            // InternalCls.g:3573:2: rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:3580:1: rule__AssociationProperties__Group__1__Impl : ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) ) ;
    public final void rule__AssociationProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3584:1: ( ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) ) )
            // InternalCls.g:3585:1: ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) )
            {
            // InternalCls.g:3585:1: ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) )
            // InternalCls.g:3586:1: ( rule__AssociationProperties__CardinalityLeftAssignment_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCardinalityLeftAssignment_1()); 
            // InternalCls.g:3587:1: ( rule__AssociationProperties__CardinalityLeftAssignment_1 )
            // InternalCls.g:3587:2: rule__AssociationProperties__CardinalityLeftAssignment_1
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
    // InternalCls.g:3597:1: rule__AssociationProperties__Group__2 : rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3 ;
    public final void rule__AssociationProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3601:1: ( rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3 )
            // InternalCls.g:3602:2: rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:3609:1: rule__AssociationProperties__Group__2__Impl : ( ( rule__AssociationProperties__Group_2__0 )? ) ;
    public final void rule__AssociationProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3613:1: ( ( ( rule__AssociationProperties__Group_2__0 )? ) )
            // InternalCls.g:3614:1: ( ( rule__AssociationProperties__Group_2__0 )? )
            {
            // InternalCls.g:3614:1: ( ( rule__AssociationProperties__Group_2__0 )? )
            // InternalCls.g:3615:1: ( rule__AssociationProperties__Group_2__0 )?
            {
             before(grammarAccess.getAssociationPropertiesAccess().getGroup_2()); 
            // InternalCls.g:3616:1: ( rule__AssociationProperties__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:3616:2: rule__AssociationProperties__Group_2__0
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
    // InternalCls.g:3626:1: rule__AssociationProperties__Group__3 : rule__AssociationProperties__Group__3__Impl ;
    public final void rule__AssociationProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3630:1: ( rule__AssociationProperties__Group__3__Impl )
            // InternalCls.g:3631:2: rule__AssociationProperties__Group__3__Impl
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
    // InternalCls.g:3637:1: rule__AssociationProperties__Group__3__Impl : ( ']' ) ;
    public final void rule__AssociationProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3641:1: ( ( ']' ) )
            // InternalCls.g:3642:1: ( ']' )
            {
            // InternalCls.g:3642:1: ( ']' )
            // InternalCls.g:3643:1: ']'
            {
             before(grammarAccess.getAssociationPropertiesAccess().getRightSquareBracketKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCls.g:3664:1: rule__AssociationProperties__Group_2__0 : rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1 ;
    public final void rule__AssociationProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3668:1: ( rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1 )
            // InternalCls.g:3669:2: rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalCls.g:3676:1: rule__AssociationProperties__Group_2__0__Impl : ( '|' ) ;
    public final void rule__AssociationProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3680:1: ( ( '|' ) )
            // InternalCls.g:3681:1: ( '|' )
            {
            // InternalCls.g:3681:1: ( '|' )
            // InternalCls.g:3682:1: '|'
            {
             before(grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCls.g:3695:1: rule__AssociationProperties__Group_2__1 : rule__AssociationProperties__Group_2__1__Impl rule__AssociationProperties__Group_2__2 ;
    public final void rule__AssociationProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3699:1: ( rule__AssociationProperties__Group_2__1__Impl rule__AssociationProperties__Group_2__2 )
            // InternalCls.g:3700:2: rule__AssociationProperties__Group_2__1__Impl rule__AssociationProperties__Group_2__2
            {
            pushFollow(FOLLOW_35);
            rule__AssociationProperties__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_2__2();

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
    // InternalCls.g:3707:1: rule__AssociationProperties__Group_2__1__Impl : ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) ) ;
    public final void rule__AssociationProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3711:1: ( ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) ) )
            // InternalCls.g:3712:1: ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) )
            {
            // InternalCls.g:3712:1: ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) )
            // InternalCls.g:3713:1: ( rule__AssociationProperties__CardinalityRightAssignment_2_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightAssignment_2_1()); 
            // InternalCls.g:3714:1: ( rule__AssociationProperties__CardinalityRightAssignment_2_1 )
            // InternalCls.g:3714:2: rule__AssociationProperties__CardinalityRightAssignment_2_1
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


    // $ANTLR start "rule__AssociationProperties__Group_2__2"
    // InternalCls.g:3724:1: rule__AssociationProperties__Group_2__2 : rule__AssociationProperties__Group_2__2__Impl ;
    public final void rule__AssociationProperties__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3728:1: ( rule__AssociationProperties__Group_2__2__Impl )
            // InternalCls.g:3729:2: rule__AssociationProperties__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_2__2__Impl();

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
    // $ANTLR end "rule__AssociationProperties__Group_2__2"


    // $ANTLR start "rule__AssociationProperties__Group_2__2__Impl"
    // InternalCls.g:3735:1: rule__AssociationProperties__Group_2__2__Impl : ( ( rule__AssociationProperties__Group_2_2__0 )? ) ;
    public final void rule__AssociationProperties__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3739:1: ( ( ( rule__AssociationProperties__Group_2_2__0 )? ) )
            // InternalCls.g:3740:1: ( ( rule__AssociationProperties__Group_2_2__0 )? )
            {
            // InternalCls.g:3740:1: ( ( rule__AssociationProperties__Group_2_2__0 )? )
            // InternalCls.g:3741:1: ( rule__AssociationProperties__Group_2_2__0 )?
            {
             before(grammarAccess.getAssociationPropertiesAccess().getGroup_2_2()); 
            // InternalCls.g:3742:1: ( rule__AssociationProperties__Group_2_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCls.g:3742:2: rule__AssociationProperties__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationProperties__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationPropertiesAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__AssociationProperties__Group_2__2__Impl"


    // $ANTLR start "rule__AssociationProperties__Group_2_2__0"
    // InternalCls.g:3758:1: rule__AssociationProperties__Group_2_2__0 : rule__AssociationProperties__Group_2_2__0__Impl rule__AssociationProperties__Group_2_2__1 ;
    public final void rule__AssociationProperties__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3762:1: ( rule__AssociationProperties__Group_2_2__0__Impl rule__AssociationProperties__Group_2_2__1 )
            // InternalCls.g:3763:2: rule__AssociationProperties__Group_2_2__0__Impl rule__AssociationProperties__Group_2_2__1
            {
            pushFollow(FOLLOW_36);
            rule__AssociationProperties__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_2_2__1();

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
    // $ANTLR end "rule__AssociationProperties__Group_2_2__0"


    // $ANTLR start "rule__AssociationProperties__Group_2_2__0__Impl"
    // InternalCls.g:3770:1: rule__AssociationProperties__Group_2_2__0__Impl : ( '|' ) ;
    public final void rule__AssociationProperties__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3774:1: ( ( '|' ) )
            // InternalCls.g:3775:1: ( '|' )
            {
            // InternalCls.g:3775:1: ( '|' )
            // InternalCls.g:3776:1: '|'
            {
             before(grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_2_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_2_2_0()); 

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
    // $ANTLR end "rule__AssociationProperties__Group_2_2__0__Impl"


    // $ANTLR start "rule__AssociationProperties__Group_2_2__1"
    // InternalCls.g:3789:1: rule__AssociationProperties__Group_2_2__1 : rule__AssociationProperties__Group_2_2__1__Impl ;
    public final void rule__AssociationProperties__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3793:1: ( rule__AssociationProperties__Group_2_2__1__Impl )
            // InternalCls.g:3794:2: rule__AssociationProperties__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__AssociationProperties__Group_2_2__1"


    // $ANTLR start "rule__AssociationProperties__Group_2_2__1__Impl"
    // InternalCls.g:3800:1: rule__AssociationProperties__Group_2_2__1__Impl : ( ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_1 ) ) ;
    public final void rule__AssociationProperties__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3804:1: ( ( ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_1 ) ) )
            // InternalCls.g:3805:1: ( ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_1 ) )
            {
            // InternalCls.g:3805:1: ( ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_1 ) )
            // InternalCls.g:3806:1: ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getReadingDirectionAssignment_2_2_1()); 
            // InternalCls.g:3807:1: ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_1 )
            // InternalCls.g:3807:2: rule__AssociationProperties__ReadingDirectionAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__ReadingDirectionAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertiesAccess().getReadingDirectionAssignment_2_2_1()); 

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
    // $ANTLR end "rule__AssociationProperties__Group_2_2__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalCls.g:3821:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3825:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalCls.g:3826:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalCls.g:3833:1: rule__Cardinality__Group__0__Impl : ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3837:1: ( ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) )
            // InternalCls.g:3838:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            {
            // InternalCls.g:3838:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            // InternalCls.g:3839:1: ( rule__Cardinality__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0()); 
            // InternalCls.g:3840:1: ( rule__Cardinality__LowerBoundAssignment_0 )
            // InternalCls.g:3840:2: rule__Cardinality__LowerBoundAssignment_0
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
    // InternalCls.g:3850:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3854:1: ( rule__Cardinality__Group__1__Impl )
            // InternalCls.g:3855:2: rule__Cardinality__Group__1__Impl
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
    // InternalCls.g:3861:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Group_1__0 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3865:1: ( ( ( rule__Cardinality__Group_1__0 )? ) )
            // InternalCls.g:3866:1: ( ( rule__Cardinality__Group_1__0 )? )
            {
            // InternalCls.g:3866:1: ( ( rule__Cardinality__Group_1__0 )? )
            // InternalCls.g:3867:1: ( rule__Cardinality__Group_1__0 )?
            {
             before(grammarAccess.getCardinalityAccess().getGroup_1()); 
            // InternalCls.g:3868:1: ( rule__Cardinality__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCls.g:3868:2: rule__Cardinality__Group_1__0
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
    // InternalCls.g:3882:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3886:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // InternalCls.g:3887:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalCls.g:3894:1: rule__Cardinality__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3898:1: ( ( '..' ) )
            // InternalCls.g:3899:1: ( '..' )
            {
            // InternalCls.g:3899:1: ( '..' )
            // InternalCls.g:3900:1: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCls.g:3913:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3917:1: ( rule__Cardinality__Group_1__1__Impl )
            // InternalCls.g:3918:2: rule__Cardinality__Group_1__1__Impl
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
    // InternalCls.g:3924:1: rule__Cardinality__Group_1__1__Impl : ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3928:1: ( ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) )
            // InternalCls.g:3929:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            {
            // InternalCls.g:3929:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            // InternalCls.g:3930:1: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1()); 
            // InternalCls.g:3931:1: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            // InternalCls.g:3931:2: rule__Cardinality__UpperBoundAssignment_1_1
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
    // InternalCls.g:3946:1: rule__ClassDiagram__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassDiagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3950:1: ( ( RULE_STRING ) )
            // InternalCls.g:3951:1: ( RULE_STRING )
            {
            // InternalCls.g:3951:1: ( RULE_STRING )
            // InternalCls.g:3952:1: RULE_STRING
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
    // InternalCls.g:3961:1: rule__ClassDiagram__PackageImportsAssignment_3 : ( rulePackageImport ) ;
    public final void rule__ClassDiagram__PackageImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3965:1: ( ( rulePackageImport ) )
            // InternalCls.g:3966:1: ( rulePackageImport )
            {
            // InternalCls.g:3966:1: ( rulePackageImport )
            // InternalCls.g:3967:1: rulePackageImport
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
    // InternalCls.g:3976:1: rule__ClassDiagram__ClassifiersAssignment_4 : ( ruleClassifier ) ;
    public final void rule__ClassDiagram__ClassifiersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3980:1: ( ( ruleClassifier ) )
            // InternalCls.g:3981:1: ( ruleClassifier )
            {
            // InternalCls.g:3981:1: ( ruleClassifier )
            // InternalCls.g:3982:1: ruleClassifier
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
    // InternalCls.g:3991:1: rule__ClassDiagram__ConnectorsAssignment_5 : ( ruleConnector ) ;
    public final void rule__ClassDiagram__ConnectorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3995:1: ( ( ruleConnector ) )
            // InternalCls.g:3996:1: ( ruleConnector )
            {
            // InternalCls.g:3996:1: ( ruleConnector )
            // InternalCls.g:3997:1: ruleConnector
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
    // InternalCls.g:4006:1: rule__PackageImport__PackageAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__PackageImport__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4010:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4011:1: ( ( ruleFQN ) )
            {
            // InternalCls.g:4011:1: ( ( ruleFQN ) )
            // InternalCls.g:4012:1: ( ruleFQN )
            {
             before(grammarAccess.getPackageImportAccess().getPackagePackageCrossReference_1_0()); 
            // InternalCls.g:4013:1: ( ruleFQN )
            // InternalCls.g:4014:1: ruleFQN
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
    // InternalCls.g:4025:1: rule__Class__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4029:1: ( ( ruleVisibility ) )
            // InternalCls.g:4030:1: ( ruleVisibility )
            {
            // InternalCls.g:4030:1: ( ruleVisibility )
            // InternalCls.g:4031:1: ruleVisibility
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
    // InternalCls.g:4040:1: rule__Class__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4044:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4045:1: ( ( 'abstract' ) )
            {
            // InternalCls.g:4045:1: ( ( 'abstract' ) )
            // InternalCls.g:4046:1: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4047:1: ( 'abstract' )
            // InternalCls.g:4048:1: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCls.g:4063:1: rule__Class__LongNameAssignment_3_0 : ( ( rule__Class__LongNameAlternatives_3_0_0 ) ) ;
    public final void rule__Class__LongNameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4067:1: ( ( ( rule__Class__LongNameAlternatives_3_0_0 ) ) )
            // InternalCls.g:4068:1: ( ( rule__Class__LongNameAlternatives_3_0_0 ) )
            {
            // InternalCls.g:4068:1: ( ( rule__Class__LongNameAlternatives_3_0_0 ) )
            // InternalCls.g:4069:1: ( rule__Class__LongNameAlternatives_3_0_0 )
            {
             before(grammarAccess.getClassAccess().getLongNameAlternatives_3_0_0()); 
            // InternalCls.g:4070:1: ( rule__Class__LongNameAlternatives_3_0_0 )
            // InternalCls.g:4070:2: rule__Class__LongNameAlternatives_3_0_0
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
    // InternalCls.g:4079:1: rule__Class__ReferencedElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ReferencedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4083:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4084:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4084:1: ( ( RULE_ID ) )
            // InternalCls.g:4085:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getReferencedElementClassCrossReference_4_0()); 
            // InternalCls.g:4086:1: ( RULE_ID )
            // InternalCls.g:4087:1: RULE_ID
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


    // $ANTLR start "rule__Class__MembersAssignment_6"
    // InternalCls.g:4098:1: rule__Class__MembersAssignment_6 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4102:1: ( ( ruleMember ) )
            // InternalCls.g:4103:1: ( ruleMember )
            {
            // InternalCls.g:4103:1: ( ruleMember )
            // InternalCls.g:4104:1: ruleMember
            {
             before(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Class__MembersAssignment_6"


    // $ANTLR start "rule__Interface__VisibilityAssignment_0"
    // InternalCls.g:4113:1: rule__Interface__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Interface__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4117:1: ( ( ruleVisibility ) )
            // InternalCls.g:4118:1: ( ruleVisibility )
            {
            // InternalCls.g:4118:1: ( ruleVisibility )
            // InternalCls.g:4119:1: ruleVisibility
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
    // InternalCls.g:4128:1: rule__Interface__LongNameAssignment_2_0 : ( ( rule__Interface__LongNameAlternatives_2_0_0 ) ) ;
    public final void rule__Interface__LongNameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4132:1: ( ( ( rule__Interface__LongNameAlternatives_2_0_0 ) ) )
            // InternalCls.g:4133:1: ( ( rule__Interface__LongNameAlternatives_2_0_0 ) )
            {
            // InternalCls.g:4133:1: ( ( rule__Interface__LongNameAlternatives_2_0_0 ) )
            // InternalCls.g:4134:1: ( rule__Interface__LongNameAlternatives_2_0_0 )
            {
             before(grammarAccess.getInterfaceAccess().getLongNameAlternatives_2_0_0()); 
            // InternalCls.g:4135:1: ( rule__Interface__LongNameAlternatives_2_0_0 )
            // InternalCls.g:4135:2: rule__Interface__LongNameAlternatives_2_0_0
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
    // InternalCls.g:4144:1: rule__Interface__ReferencedElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__ReferencedElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4148:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4149:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4149:1: ( ( RULE_ID ) )
            // InternalCls.g:4150:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceCrossReference_3_0()); 
            // InternalCls.g:4151:1: ( RULE_ID )
            // InternalCls.g:4152:1: RULE_ID
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


    // $ANTLR start "rule__Interface__MembersAssignment_5"
    // InternalCls.g:4163:1: rule__Interface__MembersAssignment_5 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4167:1: ( ( ruleMember ) )
            // InternalCls.g:4168:1: ( ruleMember )
            {
            // InternalCls.g:4168:1: ( ruleMember )
            // InternalCls.g:4169:1: ruleMember
            {
             before(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Interface__MembersAssignment_5"


    // $ANTLR start "rule__DataTypeReference__TypeAssignment"
    // InternalCls.g:4178:1: rule__DataTypeReference__TypeAssignment : ( rulePrimitiveType ) ;
    public final void rule__DataTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4182:1: ( ( rulePrimitiveType ) )
            // InternalCls.g:4183:1: ( rulePrimitiveType )
            {
            // InternalCls.g:4183:1: ( rulePrimitiveType )
            // InternalCls.g:4184:1: rulePrimitiveType
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
    // InternalCls.g:4193:1: rule__UMLTypeReference__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__UMLTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4197:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4198:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4198:1: ( ( RULE_ID ) )
            // InternalCls.g:4199:1: ( RULE_ID )
            {
             before(grammarAccess.getUMLTypeReferenceAccess().getTypeTypeCrossReference_0()); 
            // InternalCls.g:4200:1: ( RULE_ID )
            // InternalCls.g:4201:1: RULE_ID
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
    // InternalCls.g:4212:1: rule__Attribute__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4216:1: ( ( ruleVisibility ) )
            // InternalCls.g:4217:1: ( ruleVisibility )
            {
            // InternalCls.g:4217:1: ( ruleVisibility )
            // InternalCls.g:4218:1: ruleVisibility
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
    // InternalCls.g:4227:1: rule__Attribute__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4231:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4232:1: ( ( 'static' ) )
            {
            // InternalCls.g:4232:1: ( ( 'static' ) )
            // InternalCls.g:4233:1: ( 'static' )
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4234:1: ( 'static' )
            // InternalCls.g:4235:1: 'static'
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCls.g:4250:1: rule__Attribute__FinalAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Attribute__FinalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4254:1: ( ( ( 'final' ) ) )
            // InternalCls.g:4255:1: ( ( 'final' ) )
            {
            // InternalCls.g:4255:1: ( ( 'final' ) )
            // InternalCls.g:4256:1: ( 'final' )
            {
             before(grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0()); 
            // InternalCls.g:4257:1: ( 'final' )
            // InternalCls.g:4258:1: 'final'
            {
             before(grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalCls.g:4273:1: rule__Attribute__ReferencedElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__ReferencedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4277:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4278:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4278:1: ( ( RULE_ID ) )
            // InternalCls.g:4279:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getReferencedElementPropertyCrossReference_4_0()); 
            // InternalCls.g:4280:1: ( RULE_ID )
            // InternalCls.g:4281:1: RULE_ID
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
    // InternalCls.g:4292:1: rule__Attribute__TypeAssignment_6 : ( ruleTypeReference ) ;
    public final void rule__Attribute__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4296:1: ( ( ruleTypeReference ) )
            // InternalCls.g:4297:1: ( ruleTypeReference )
            {
            // InternalCls.g:4297:1: ( ruleTypeReference )
            // InternalCls.g:4298:1: ruleTypeReference
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
    // InternalCls.g:4307:1: rule__Method__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Method__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4311:1: ( ( ruleVisibility ) )
            // InternalCls.g:4312:1: ( ruleVisibility )
            {
            // InternalCls.g:4312:1: ( ruleVisibility )
            // InternalCls.g:4313:1: ruleVisibility
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
    // InternalCls.g:4322:1: rule__Method__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Method__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4326:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4327:1: ( ( 'abstract' ) )
            {
            // InternalCls.g:4327:1: ( ( 'abstract' ) )
            // InternalCls.g:4328:1: ( 'abstract' )
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4329:1: ( 'abstract' )
            // InternalCls.g:4330:1: 'abstract'
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCls.g:4345:1: rule__Method__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Method__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4349:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4350:1: ( ( 'static' ) )
            {
            // InternalCls.g:4350:1: ( ( 'static' ) )
            // InternalCls.g:4351:1: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4352:1: ( 'static' )
            // InternalCls.g:4353:1: 'static'
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCls.g:4368:1: rule__Method__FinalAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Method__FinalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4372:1: ( ( ( 'final' ) ) )
            // InternalCls.g:4373:1: ( ( 'final' ) )
            {
            // InternalCls.g:4373:1: ( ( 'final' ) )
            // InternalCls.g:4374:1: ( 'final' )
            {
             before(grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0()); 
            // InternalCls.g:4375:1: ( 'final' )
            // InternalCls.g:4376:1: 'final'
            {
             before(grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalCls.g:4391:1: rule__Method__ReferencedElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Method__ReferencedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4395:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4396:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4396:1: ( ( RULE_ID ) )
            // InternalCls.g:4397:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getReferencedElementOperationCrossReference_4_0()); 
            // InternalCls.g:4398:1: ( RULE_ID )
            // InternalCls.g:4399:1: RULE_ID
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
    // InternalCls.g:4410:1: rule__Method__ParametersAssignment_6_0 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4414:1: ( ( ruleParameter ) )
            // InternalCls.g:4415:1: ( ruleParameter )
            {
            // InternalCls.g:4415:1: ( ruleParameter )
            // InternalCls.g:4416:1: ruleParameter
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
    // InternalCls.g:4425:1: rule__Method__ParametersAssignment_6_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4429:1: ( ( ruleParameter ) )
            // InternalCls.g:4430:1: ( ruleParameter )
            {
            // InternalCls.g:4430:1: ( ruleParameter )
            // InternalCls.g:4431:1: ruleParameter
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
    // InternalCls.g:4440:1: rule__Method__TypeAssignment_8_1 : ( ruleTypeReference ) ;
    public final void rule__Method__TypeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4444:1: ( ( ruleTypeReference ) )
            // InternalCls.g:4445:1: ( ruleTypeReference )
            {
            // InternalCls.g:4445:1: ( ruleTypeReference )
            // InternalCls.g:4446:1: ruleTypeReference
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
    // InternalCls.g:4455:1: rule__Parameter__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Parameter__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4459:1: ( ( ruleVisibility ) )
            // InternalCls.g:4460:1: ( ruleVisibility )
            {
            // InternalCls.g:4460:1: ( ruleVisibility )
            // InternalCls.g:4461:1: ruleVisibility
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
    // InternalCls.g:4470:1: rule__Parameter__StaticAssignment_1 : ( ( 'static' ) ) ;
    public final void rule__Parameter__StaticAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4474:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4475:1: ( ( 'static' ) )
            {
            // InternalCls.g:4475:1: ( ( 'static' ) )
            // InternalCls.g:4476:1: ( 'static' )
            {
             before(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 
            // InternalCls.g:4477:1: ( 'static' )
            // InternalCls.g:4478:1: 'static'
            {
             before(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCls.g:4493:1: rule__Parameter__FinalAssignment_2 : ( ( 'final' ) ) ;
    public final void rule__Parameter__FinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4497:1: ( ( ( 'final' ) ) )
            // InternalCls.g:4498:1: ( ( 'final' ) )
            {
            // InternalCls.g:4498:1: ( ( 'final' ) )
            // InternalCls.g:4499:1: ( 'final' )
            {
             before(grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0()); 
            // InternalCls.g:4500:1: ( 'final' )
            // InternalCls.g:4501:1: 'final'
            {
             before(grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalCls.g:4516:1: rule__Parameter__ReferencedElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__ReferencedElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4520:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4521:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4521:1: ( ( RULE_ID ) )
            // InternalCls.g:4522:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getReferencedElementParameterCrossReference_3_0()); 
            // InternalCls.g:4523:1: ( RULE_ID )
            // InternalCls.g:4524:1: RULE_ID
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
    // InternalCls.g:4535:1: rule__Parameter__TypeAssignment_5 : ( ruleTypeReference ) ;
    public final void rule__Parameter__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4539:1: ( ( ruleTypeReference ) )
            // InternalCls.g:4540:1: ( ruleTypeReference )
            {
            // InternalCls.g:4540:1: ( ruleTypeReference )
            // InternalCls.g:4541:1: ruleTypeReference
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
    // InternalCls.g:4550:1: rule__Generalization__LeftAssignment_0 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Generalization__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4554:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4555:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4555:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4556:1: ruleClassifierAssociationEnd
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
    // InternalCls.g:4565:1: rule__Generalization__RightAssignment_2 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Generalization__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4569:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4570:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4570:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4571:1: ruleClassifierAssociationEnd
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
    // InternalCls.g:4580:1: rule__Implementation__LeftAssignment_0 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Implementation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4584:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4585:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4585:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4586:1: ruleClassifierAssociationEnd
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
    // InternalCls.g:4595:1: rule__Implementation__RightAssignment_2 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Implementation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4599:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4600:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4600:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4601:1: ruleClassifierAssociationEnd
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
    // InternalCls.g:4610:1: rule__CommentLink__LeftAssignment_0 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__CommentLink__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4614:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4615:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4615:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4616:1: ruleClassifierAssociationEnd
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


    // $ANTLR start "rule__CommentLink__CommentAssignment_3"
    // InternalCls.g:4625:1: rule__CommentLink__CommentAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__CommentLink__CommentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4629:1: ( ( ( RULE_STRING ) ) )
            // InternalCls.g:4630:1: ( ( RULE_STRING ) )
            {
            // InternalCls.g:4630:1: ( ( RULE_STRING ) )
            // InternalCls.g:4631:1: ( RULE_STRING )
            {
             before(grammarAccess.getCommentLinkAccess().getCommentCommentCrossReference_3_0()); 
            // InternalCls.g:4632:1: ( RULE_STRING )
            // InternalCls.g:4633:1: RULE_STRING
            {
             before(grammarAccess.getCommentLinkAccess().getCommentCommentSTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommentLinkAccess().getCommentCommentSTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCommentLinkAccess().getCommentCommentCrossReference_3_0()); 

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
    // $ANTLR end "rule__CommentLink__CommentAssignment_3"


    // $ANTLR start "rule__Association__AggregationKindAssignment_0"
    // InternalCls.g:4644:1: rule__Association__AggregationKindAssignment_0 : ( ruleAggregationKind ) ;
    public final void rule__Association__AggregationKindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4648:1: ( ( ruleAggregationKind ) )
            // InternalCls.g:4649:1: ( ruleAggregationKind )
            {
            // InternalCls.g:4649:1: ( ruleAggregationKind )
            // InternalCls.g:4650:1: ruleAggregationKind
            {
             before(grammarAccess.getAssociationAccess().getAggregationKindAggregationKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregationKind();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getAggregationKindAggregationKindEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Association__AggregationKindAssignment_0"


    // $ANTLR start "rule__Association__LeftAssignment_1"
    // InternalCls.g:4659:1: rule__Association__LeftAssignment_1 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Association__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4663:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4664:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4664:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4665:1: ruleClassifierAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getLeftClassifierAssociationEndParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getLeftClassifierAssociationEndParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Association__LeftAssignment_1"


    // $ANTLR start "rule__Association__ReferencedElementAssignment_2"
    // InternalCls.g:4674:1: rule__Association__ReferencedElementAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__ReferencedElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4678:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4679:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4679:1: ( ( RULE_ID ) )
            // InternalCls.g:4680:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getReferencedElementAssociationCrossReference_2_0()); 
            // InternalCls.g:4681:1: ( RULE_ID )
            // InternalCls.g:4682:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getReferencedElementAssociationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getReferencedElementAssociationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getReferencedElementAssociationCrossReference_2_0()); 

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
    // $ANTLR end "rule__Association__ReferencedElementAssignment_2"


    // $ANTLR start "rule__Association__RightAssignment_3"
    // InternalCls.g:4693:1: rule__Association__RightAssignment_3 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Association__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4697:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4698:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4698:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4699:1: ruleClassifierAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getRightClassifierAssociationEndParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRightClassifierAssociationEndParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Association__RightAssignment_3"


    // $ANTLR start "rule__Association__PropertiesAssignment_4"
    // InternalCls.g:4708:1: rule__Association__PropertiesAssignment_4 : ( ruleAssociationProperties ) ;
    public final void rule__Association__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4712:1: ( ( ruleAssociationProperties ) )
            // InternalCls.g:4713:1: ( ruleAssociationProperties )
            {
            // InternalCls.g:4713:1: ( ruleAssociationProperties )
            // InternalCls.g:4714:1: ruleAssociationProperties
            {
             before(grammarAccess.getAssociationAccess().getPropertiesAssociationPropertiesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationProperties();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getPropertiesAssociationPropertiesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Association__PropertiesAssignment_4"


    // $ANTLR start "rule__Association__CommentAssignment_5_1"
    // InternalCls.g:4723:1: rule__Association__CommentAssignment_5_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Association__CommentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4727:1: ( ( ( RULE_STRING ) ) )
            // InternalCls.g:4728:1: ( ( RULE_STRING ) )
            {
            // InternalCls.g:4728:1: ( ( RULE_STRING ) )
            // InternalCls.g:4729:1: ( RULE_STRING )
            {
             before(grammarAccess.getAssociationAccess().getCommentCommentCrossReference_5_1_0()); 
            // InternalCls.g:4730:1: ( RULE_STRING )
            // InternalCls.g:4731:1: RULE_STRING
            {
             before(grammarAccess.getAssociationAccess().getCommentCommentSTRINGTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getCommentCommentSTRINGTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getCommentCommentCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Association__CommentAssignment_5_1"


    // $ANTLR start "rule__AssociationProperties__CardinalityLeftAssignment_1"
    // InternalCls.g:4742:1: rule__AssociationProperties__CardinalityLeftAssignment_1 : ( ruleCardinality ) ;
    public final void rule__AssociationProperties__CardinalityLeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4746:1: ( ( ruleCardinality ) )
            // InternalCls.g:4747:1: ( ruleCardinality )
            {
            // InternalCls.g:4747:1: ( ruleCardinality )
            // InternalCls.g:4748:1: ruleCardinality
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
    // InternalCls.g:4757:1: rule__AssociationProperties__CardinalityRightAssignment_2_1 : ( ruleCardinality ) ;
    public final void rule__AssociationProperties__CardinalityRightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4761:1: ( ( ruleCardinality ) )
            // InternalCls.g:4762:1: ( ruleCardinality )
            {
            // InternalCls.g:4762:1: ( ruleCardinality )
            // InternalCls.g:4763:1: ruleCardinality
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


    // $ANTLR start "rule__AssociationProperties__ReadingDirectionAssignment_2_2_1"
    // InternalCls.g:4772:1: rule__AssociationProperties__ReadingDirectionAssignment_2_2_1 : ( ruleReadingDirection ) ;
    public final void rule__AssociationProperties__ReadingDirectionAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4776:1: ( ( ruleReadingDirection ) )
            // InternalCls.g:4777:1: ( ruleReadingDirection )
            {
            // InternalCls.g:4777:1: ( ruleReadingDirection )
            // InternalCls.g:4778:1: ruleReadingDirection
            {
             before(grammarAccess.getAssociationPropertiesAccess().getReadingDirectionReadingDirectionEnumRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReadingDirection();

            state._fsp--;

             after(grammarAccess.getAssociationPropertiesAccess().getReadingDirectionReadingDirectionEnumRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__AssociationProperties__ReadingDirectionAssignment_2_2_1"


    // $ANTLR start "rule__Cardinality__LowerBoundAssignment_0"
    // InternalCls.g:4787:1: rule__Cardinality__LowerBoundAssignment_0 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4791:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:4792:1: ( ruleCardinalityBound )
            {
            // InternalCls.g:4792:1: ( ruleCardinalityBound )
            // InternalCls.g:4793:1: ruleCardinalityBound
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
    // InternalCls.g:4802:1: rule__Cardinality__UpperBoundAssignment_1_1 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__UpperBoundAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4806:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:4807:1: ( ruleCardinalityBound )
            {
            // InternalCls.g:4807:1: ( ruleCardinalityBound )
            // InternalCls.g:4808:1: ruleCardinalityBound
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


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\7\5\1\47\2\uffff";
    static final String dfa_3s = "\6\64\1\5\1\50\2\uffff";
    static final String dfa_4s = "\10\uffff\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\6\uffff\1\1\1\2\1\3\1\4\42\uffff\1\10\1\5\1\6",
            "\1\7\54\uffff\1\10\1\5\1\6",
            "\1\7\54\uffff\1\10\1\5\1\6",
            "\1\7\54\uffff\1\10\1\5\1\6",
            "\1\7\54\uffff\1\10\1\5\1\6",
            "\1\7\56\uffff\1\6",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "840:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00040045B800F020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000400440000F002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000038000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000400040000F000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x001C00100000F020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x001C00000000F022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000400440000F000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x001800000000F020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000007FC0020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x001C00000000F020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x001802000000F020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x001800000000F022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});

}