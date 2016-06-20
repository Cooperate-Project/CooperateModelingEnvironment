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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'~'", "'-'", "'#'", "'+'", "'<'", "'>'", "'string'", "'int'", "'double'", "'boolean'", "'char'", "'byte'", "'short'", "'long'", "'float'", "'@startclass'", "'@endclass'", "'import'", "'.'", "'class'", "'{'", "'}'", "'as'", "'interface'", "':'", "'('", "')'", "','", "'isa'", "'impl'", "'['", "']'", "'|'", "'..'", "'note['", "'abstract'", "'static'", "'final'"
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


    // $ANTLR start "entryRuleClassifierReference"
    // InternalCls.g:256:1: entryRuleClassifierReference : ruleClassifierReference EOF ;
    public final void entryRuleClassifierReference() throws RecognitionException {
        try {
            // InternalCls.g:257:1: ( ruleClassifierReference EOF )
            // InternalCls.g:258:1: ruleClassifierReference EOF
            {
             before(grammarAccess.getClassifierReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleClassifierReference();

            state._fsp--;

             after(grammarAccess.getClassifierReferenceRule()); 
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
    // $ANTLR end "entryRuleClassifierReference"


    // $ANTLR start "ruleClassifierReference"
    // InternalCls.g:265:1: ruleClassifierReference : ( ( rule__ClassifierReference__TypeAssignment ) ) ;
    public final void ruleClassifierReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:269:2: ( ( ( rule__ClassifierReference__TypeAssignment ) ) )
            // InternalCls.g:270:1: ( ( rule__ClassifierReference__TypeAssignment ) )
            {
            // InternalCls.g:270:1: ( ( rule__ClassifierReference__TypeAssignment ) )
            // InternalCls.g:271:1: ( rule__ClassifierReference__TypeAssignment )
            {
             before(grammarAccess.getClassifierReferenceAccess().getTypeAssignment()); 
            // InternalCls.g:272:1: ( rule__ClassifierReference__TypeAssignment )
            // InternalCls.g:272:2: rule__ClassifierReference__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierReference__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClassifierReferenceAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassifierReference"


    // $ANTLR start "entryRuleDataTypeReference"
    // InternalCls.g:284:1: entryRuleDataTypeReference : ruleDataTypeReference EOF ;
    public final void entryRuleDataTypeReference() throws RecognitionException {
        try {
            // InternalCls.g:285:1: ( ruleDataTypeReference EOF )
            // InternalCls.g:286:1: ruleDataTypeReference EOF
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
    // InternalCls.g:293:1: ruleDataTypeReference : ( ( rule__DataTypeReference__TypeAssignment ) ) ;
    public final void ruleDataTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:297:2: ( ( ( rule__DataTypeReference__TypeAssignment ) ) )
            // InternalCls.g:298:1: ( ( rule__DataTypeReference__TypeAssignment ) )
            {
            // InternalCls.g:298:1: ( ( rule__DataTypeReference__TypeAssignment ) )
            // InternalCls.g:299:1: ( rule__DataTypeReference__TypeAssignment )
            {
             before(grammarAccess.getDataTypeReferenceAccess().getTypeAssignment()); 
            // InternalCls.g:300:1: ( rule__DataTypeReference__TypeAssignment )
            // InternalCls.g:300:2: rule__DataTypeReference__TypeAssignment
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
    // InternalCls.g:461:1: ruleClassifierAssociationEnd : ( ruleClassifierReference ) ;
    public final void ruleClassifierAssociationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:465:2: ( ( ruleClassifierReference ) )
            // InternalCls.g:466:1: ( ruleClassifierReference )
            {
            // InternalCls.g:466:1: ( ruleClassifierReference )
            // InternalCls.g:467:1: ruleClassifierReference
            {
             before(grammarAccess.getClassifierAssociationEndAccess().getClassifierReferenceParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleClassifierReference();

            state._fsp--;

             after(grammarAccess.getClassifierAssociationEndAccess().getClassifierReferenceParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleComment"
    // InternalCls.g:676:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalCls.g:677:1: ( ruleComment EOF )
            // InternalCls.g:678:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalCls.g:685:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:689:2: ( ( ( rule__Comment__Group__0 ) ) )
            // InternalCls.g:690:1: ( ( rule__Comment__Group__0 ) )
            {
            // InternalCls.g:690:1: ( ( rule__Comment__Group__0 ) )
            // InternalCls.g:691:1: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // InternalCls.g:692:1: ( rule__Comment__Group__0 )
            // InternalCls.g:692:2: rule__Comment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "ruleVisibility"
    // InternalCls.g:705:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:709:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalCls.g:710:1: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalCls.g:710:1: ( ( rule__Visibility__Alternatives ) )
            // InternalCls.g:711:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalCls.g:712:1: ( rule__Visibility__Alternatives )
            // InternalCls.g:712:2: rule__Visibility__Alternatives
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
    // InternalCls.g:724:1: ruleReadingDirection : ( ( rule__ReadingDirection__Alternatives ) ) ;
    public final void ruleReadingDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:728:1: ( ( ( rule__ReadingDirection__Alternatives ) ) )
            // InternalCls.g:729:1: ( ( rule__ReadingDirection__Alternatives ) )
            {
            // InternalCls.g:729:1: ( ( rule__ReadingDirection__Alternatives ) )
            // InternalCls.g:730:1: ( rule__ReadingDirection__Alternatives )
            {
             before(grammarAccess.getReadingDirectionAccess().getAlternatives()); 
            // InternalCls.g:731:1: ( rule__ReadingDirection__Alternatives )
            // InternalCls.g:731:2: rule__ReadingDirection__Alternatives
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
    // InternalCls.g:743:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:747:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalCls.g:748:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalCls.g:748:1: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalCls.g:749:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalCls.g:750:1: ( rule__PrimitiveType__Alternatives )
            // InternalCls.g:750:2: rule__PrimitiveType__Alternatives
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


    // $ANTLR start "rule__Classifier__Alternatives"
    // InternalCls.g:761:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );
    public final void rule__Classifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:765:1: ( ( ruleClass ) | ( ruleInterface ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==31||LA1_1==47) ) {
                    alt1=1;
                }
                else if ( (LA1_1==35) ) {
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

                if ( (LA1_2==35) ) {
                    alt1=2;
                }
                else if ( (LA1_2==31||LA1_2==47) ) {
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

                if ( (LA1_3==31||LA1_3==47) ) {
                    alt1=1;
                }
                else if ( (LA1_3==35) ) {
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

                if ( (LA1_4==35) ) {
                    alt1=2;
                }
                else if ( (LA1_4==31||LA1_4==47) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 47:
                {
                alt1=1;
                }
                break;
            case 35:
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
                    // InternalCls.g:766:1: ( ruleClass )
                    {
                    // InternalCls.g:766:1: ( ruleClass )
                    // InternalCls.g:767:1: ruleClass
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
                    // InternalCls.g:772:6: ( ruleInterface )
                    {
                    // InternalCls.g:772:6: ( ruleInterface )
                    // InternalCls.g:773:1: ruleInterface
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
    // InternalCls.g:783:1: rule__Class__LongNameAlternatives_3_0_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Class__LongNameAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:787:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCls.g:788:1: ( RULE_STRING )
                    {
                    // InternalCls.g:788:1: ( RULE_STRING )
                    // InternalCls.g:789:1: RULE_STRING
                    {
                     before(grammarAccess.getClassAccess().getLongNameSTRINGTerminalRuleCall_3_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getClassAccess().getLongNameSTRINGTerminalRuleCall_3_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:794:6: ( RULE_ID )
                    {
                    // InternalCls.g:794:6: ( RULE_ID )
                    // InternalCls.g:795:1: RULE_ID
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
    // InternalCls.g:805:1: rule__Interface__LongNameAlternatives_2_0_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Interface__LongNameAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:809:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCls.g:810:1: ( RULE_STRING )
                    {
                    // InternalCls.g:810:1: ( RULE_STRING )
                    // InternalCls.g:811:1: RULE_STRING
                    {
                     before(grammarAccess.getInterfaceAccess().getLongNameSTRINGTerminalRuleCall_2_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getInterfaceAccess().getLongNameSTRINGTerminalRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:816:6: ( RULE_ID )
                    {
                    // InternalCls.g:816:6: ( RULE_ID )
                    // InternalCls.g:817:1: RULE_ID
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
    // InternalCls.g:827:1: rule__TypeReference__Alternatives : ( ( ruleClassifierReference ) | ( ruleDataTypeReference ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:831:1: ( ( ruleClassifierReference ) | ( ruleDataTypeReference ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=18 && LA4_0<=26)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCls.g:832:1: ( ruleClassifierReference )
                    {
                    // InternalCls.g:832:1: ( ruleClassifierReference )
                    // InternalCls.g:833:1: ruleClassifierReference
                    {
                     before(grammarAccess.getTypeReferenceAccess().getClassifierReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassifierReference();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getClassifierReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:838:6: ( ruleDataTypeReference )
                    {
                    // InternalCls.g:838:6: ( ruleDataTypeReference )
                    // InternalCls.g:839:1: ruleDataTypeReference
                    {
                     before(grammarAccess.getTypeReferenceAccess().getDataTypeReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataTypeReference();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getDataTypeReferenceParserRuleCall_1()); 

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
    // InternalCls.g:849:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:853:1: ( ( ruleAttribute ) | ( ruleMethod ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCls.g:854:1: ( ruleAttribute )
                    {
                    // InternalCls.g:854:1: ( ruleAttribute )
                    // InternalCls.g:855:1: ruleAttribute
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
                    // InternalCls.g:860:6: ( ruleMethod )
                    {
                    // InternalCls.g:860:6: ( ruleMethod )
                    // InternalCls.g:861:1: ruleMethod
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
    // InternalCls.g:871:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleAssociation ) | ( ruleImplementation ) | ( ruleCommentLink ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:875:1: ( ( ruleGeneralization ) | ( ruleAssociation ) | ( ruleImplementation ) | ( ruleCommentLink ) )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==46) ) {
                        alt6=4;
                    }
                    else if ( (LA6_2==RULE_ID) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    alt6=1;
                    }
                    break;
                case 41:
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
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCls.g:876:1: ( ruleGeneralization )
                    {
                    // InternalCls.g:876:1: ( ruleGeneralization )
                    // InternalCls.g:877:1: ruleGeneralization
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
                    // InternalCls.g:882:6: ( ruleAssociation )
                    {
                    // InternalCls.g:882:6: ( ruleAssociation )
                    // InternalCls.g:883:1: ruleAssociation
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
                    // InternalCls.g:888:6: ( ruleImplementation )
                    {
                    // InternalCls.g:888:6: ( ruleImplementation )
                    // InternalCls.g:889:1: ruleImplementation
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
                    // InternalCls.g:894:6: ( ruleCommentLink )
                    {
                    // InternalCls.g:894:6: ( ruleCommentLink )
                    // InternalCls.g:895:1: ruleCommentLink
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


    // $ANTLR start "rule__AssociationProperties__NameAlternatives_2_2_1_0"
    // InternalCls.g:905:1: rule__AssociationProperties__NameAlternatives_2_2_1_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__AssociationProperties__NameAlternatives_2_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:909:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCls.g:910:1: ( RULE_STRING )
                    {
                    // InternalCls.g:910:1: ( RULE_STRING )
                    // InternalCls.g:911:1: RULE_STRING
                    {
                     before(grammarAccess.getAssociationPropertiesAccess().getNameSTRINGTerminalRuleCall_2_2_1_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAssociationPropertiesAccess().getNameSTRINGTerminalRuleCall_2_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:916:6: ( RULE_ID )
                    {
                    // InternalCls.g:916:6: ( RULE_ID )
                    // InternalCls.g:917:1: RULE_ID
                    {
                     before(grammarAccess.getAssociationPropertiesAccess().getNameIDTerminalRuleCall_2_2_1_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAssociationPropertiesAccess().getNameIDTerminalRuleCall_2_2_1_0_1()); 

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
    // $ANTLR end "rule__AssociationProperties__NameAlternatives_2_2_1_0"


    // $ANTLR start "rule__CardinalityBound__Alternatives"
    // InternalCls.g:927:1: rule__CardinalityBound__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CardinalityBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:931:1: ( ( '*' ) | ( RULE_INT ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCls.g:932:1: ( '*' )
                    {
                    // InternalCls.g:932:1: ( '*' )
                    // InternalCls.g:933:1: '*'
                    {
                     before(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:940:6: ( RULE_INT )
                    {
                    // InternalCls.g:940:6: ( RULE_INT )
                    // InternalCls.g:941:1: RULE_INT
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
    // InternalCls.g:951:1: rule__Visibility__Alternatives : ( ( ( '~' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '+' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:955:1: ( ( ( '~' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '+' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case 14:
                {
                alt9=3;
                }
                break;
            case 15:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCls.g:956:1: ( ( '~' ) )
                    {
                    // InternalCls.g:956:1: ( ( '~' ) )
                    // InternalCls.g:957:1: ( '~' )
                    {
                     before(grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                    // InternalCls.g:958:1: ( '~' )
                    // InternalCls.g:958:3: '~'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:963:6: ( ( '-' ) )
                    {
                    // InternalCls.g:963:6: ( ( '-' ) )
                    // InternalCls.g:964:1: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalCls.g:965:1: ( '-' )
                    // InternalCls.g:965:3: '-'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:970:6: ( ( '#' ) )
                    {
                    // InternalCls.g:970:6: ( ( '#' ) )
                    // InternalCls.g:971:1: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    // InternalCls.g:972:1: ( '#' )
                    // InternalCls.g:972:3: '#'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:977:6: ( ( '+' ) )
                    {
                    // InternalCls.g:977:6: ( ( '+' ) )
                    // InternalCls.g:978:1: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_3()); 
                    // InternalCls.g:979:1: ( '+' )
                    // InternalCls.g:979:3: '+'
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
    // InternalCls.g:989:1: rule__ReadingDirection__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__ReadingDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:993:1: ( ( ( '<' ) ) | ( ( '>' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCls.g:994:1: ( ( '<' ) )
                    {
                    // InternalCls.g:994:1: ( ( '<' ) )
                    // InternalCls.g:995:1: ( '<' )
                    {
                     before(grammarAccess.getReadingDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalCls.g:996:1: ( '<' )
                    // InternalCls.g:996:3: '<'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getReadingDirectionAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1001:6: ( ( '>' ) )
                    {
                    // InternalCls.g:1001:6: ( ( '>' ) )
                    // InternalCls.g:1002:1: ( '>' )
                    {
                     before(grammarAccess.getReadingDirectionAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalCls.g:1003:1: ( '>' )
                    // InternalCls.g:1003:3: '>'
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
    // InternalCls.g:1013:1: rule__PrimitiveType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'short' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1017:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'short' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 22:
                {
                alt11=5;
                }
                break;
            case 23:
                {
                alt11=6;
                }
                break;
            case 24:
                {
                alt11=7;
                }
                break;
            case 25:
                {
                alt11=8;
                }
                break;
            case 26:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCls.g:1018:1: ( ( 'string' ) )
                    {
                    // InternalCls.g:1018:1: ( ( 'string' ) )
                    // InternalCls.g:1019:1: ( 'string' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalCls.g:1020:1: ( 'string' )
                    // InternalCls.g:1020:3: 'string'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1025:6: ( ( 'int' ) )
                    {
                    // InternalCls.g:1025:6: ( ( 'int' ) )
                    // InternalCls.g:1026:1: ( 'int' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalCls.g:1027:1: ( 'int' )
                    // InternalCls.g:1027:3: 'int'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1032:6: ( ( 'double' ) )
                    {
                    // InternalCls.g:1032:6: ( ( 'double' ) )
                    // InternalCls.g:1033:1: ( 'double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    // InternalCls.g:1034:1: ( 'double' )
                    // InternalCls.g:1034:3: 'double'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1039:6: ( ( 'boolean' ) )
                    {
                    // InternalCls.g:1039:6: ( ( 'boolean' ) )
                    // InternalCls.g:1040:1: ( 'boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 
                    // InternalCls.g:1041:1: ( 'boolean' )
                    // InternalCls.g:1041:3: 'boolean'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:1046:6: ( ( 'char' ) )
                    {
                    // InternalCls.g:1046:6: ( ( 'char' ) )
                    // InternalCls.g:1047:1: ( 'char' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4()); 
                    // InternalCls.g:1048:1: ( 'char' )
                    // InternalCls.g:1048:3: 'char'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:1053:6: ( ( 'byte' ) )
                    {
                    // InternalCls.g:1053:6: ( ( 'byte' ) )
                    // InternalCls.g:1054:1: ( 'byte' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5()); 
                    // InternalCls.g:1055:1: ( 'byte' )
                    // InternalCls.g:1055:3: 'byte'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:1060:6: ( ( 'short' ) )
                    {
                    // InternalCls.g:1060:6: ( ( 'short' ) )
                    // InternalCls.g:1061:1: ( 'short' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6()); 
                    // InternalCls.g:1062:1: ( 'short' )
                    // InternalCls.g:1062:3: 'short'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCls.g:1067:6: ( ( 'long' ) )
                    {
                    // InternalCls.g:1067:6: ( ( 'long' ) )
                    // InternalCls.g:1068:1: ( 'long' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7()); 
                    // InternalCls.g:1069:1: ( 'long' )
                    // InternalCls.g:1069:3: 'long'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCls.g:1074:6: ( ( 'float' ) )
                    {
                    // InternalCls.g:1074:6: ( ( 'float' ) )
                    // InternalCls.g:1075:1: ( 'float' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalCls.g:1076:1: ( 'float' )
                    // InternalCls.g:1076:3: 'float'
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
            match(input,27,FOLLOW_2); 
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
            pushFollow(FOLLOW_4);
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
    // InternalCls.g:1162:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__PackageImportsAssignment_2 )* ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1166:1: ( ( ( rule__ClassDiagram__PackageImportsAssignment_2 )* ) )
            // InternalCls.g:1167:1: ( ( rule__ClassDiagram__PackageImportsAssignment_2 )* )
            {
            // InternalCls.g:1167:1: ( ( rule__ClassDiagram__PackageImportsAssignment_2 )* )
            // InternalCls.g:1168:1: ( rule__ClassDiagram__PackageImportsAssignment_2 )*
            {
             before(grammarAccess.getClassDiagramAccess().getPackageImportsAssignment_2()); 
            // InternalCls.g:1169:1: ( rule__ClassDiagram__PackageImportsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCls.g:1169:2: rule__ClassDiagram__PackageImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ClassDiagram__PackageImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassDiagramAccess().getPackageImportsAssignment_2()); 

            }


            }

        }
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
            pushFollow(FOLLOW_4);
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
    // InternalCls.g:1191:1: rule__ClassDiagram__Group__3__Impl : ( ( rule__ClassDiagram__ClassifiersAssignment_3 )* ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1195:1: ( ( ( rule__ClassDiagram__ClassifiersAssignment_3 )* ) )
            // InternalCls.g:1196:1: ( ( rule__ClassDiagram__ClassifiersAssignment_3 )* )
            {
            // InternalCls.g:1196:1: ( ( rule__ClassDiagram__ClassifiersAssignment_3 )* )
            // InternalCls.g:1197:1: ( rule__ClassDiagram__ClassifiersAssignment_3 )*
            {
             before(grammarAccess.getClassDiagramAccess().getClassifiersAssignment_3()); 
            // InternalCls.g:1198:1: ( rule__ClassDiagram__ClassifiersAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=15)||LA13_0==31||LA13_0==35||LA13_0==47) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCls.g:1198:2: rule__ClassDiagram__ClassifiersAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ClassDiagram__ClassifiersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getClassDiagramAccess().getClassifiersAssignment_3()); 

            }


            }

        }
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
            pushFollow(FOLLOW_4);
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
    // InternalCls.g:1220:1: rule__ClassDiagram__Group__4__Impl : ( ( rule__ClassDiagram__ConnectorsAssignment_4 )* ) ;
    public final void rule__ClassDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1224:1: ( ( ( rule__ClassDiagram__ConnectorsAssignment_4 )* ) )
            // InternalCls.g:1225:1: ( ( rule__ClassDiagram__ConnectorsAssignment_4 )* )
            {
            // InternalCls.g:1225:1: ( ( rule__ClassDiagram__ConnectorsAssignment_4 )* )
            // InternalCls.g:1226:1: ( rule__ClassDiagram__ConnectorsAssignment_4 )*
            {
             before(grammarAccess.getClassDiagramAccess().getConnectorsAssignment_4()); 
            // InternalCls.g:1227:1: ( rule__ClassDiagram__ConnectorsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCls.g:1227:2: rule__ClassDiagram__ConnectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ClassDiagram__ConnectorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getClassDiagramAccess().getConnectorsAssignment_4()); 

            }


            }

        }
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
    // InternalCls.g:1237:1: rule__ClassDiagram__Group__5 : rule__ClassDiagram__Group__5__Impl ;
    public final void rule__ClassDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1241:1: ( rule__ClassDiagram__Group__5__Impl )
            // InternalCls.g:1242:2: rule__ClassDiagram__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__5__Impl();

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
    // InternalCls.g:1248:1: rule__ClassDiagram__Group__5__Impl : ( '@endclass' ) ;
    public final void rule__ClassDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1252:1: ( ( '@endclass' ) )
            // InternalCls.g:1253:1: ( '@endclass' )
            {
            // InternalCls.g:1253:1: ( '@endclass' )
            // InternalCls.g:1254:1: '@endclass'
            {
             before(grammarAccess.getClassDiagramAccess().getEndclassKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getEndclassKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__PackageImport__Group__0"
    // InternalCls.g:1279:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1283:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // InternalCls.g:1284:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCls.g:1291:1: rule__PackageImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1295:1: ( ( 'import' ) )
            // InternalCls.g:1296:1: ( 'import' )
            {
            // InternalCls.g:1296:1: ( 'import' )
            // InternalCls.g:1297:1: 'import'
            {
             before(grammarAccess.getPackageImportAccess().getImportKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCls.g:1310:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1314:1: ( rule__PackageImport__Group__1__Impl )
            // InternalCls.g:1315:2: rule__PackageImport__Group__1__Impl
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
    // InternalCls.g:1321:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__PackageAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1325:1: ( ( ( rule__PackageImport__PackageAssignment_1 ) ) )
            // InternalCls.g:1326:1: ( ( rule__PackageImport__PackageAssignment_1 ) )
            {
            // InternalCls.g:1326:1: ( ( rule__PackageImport__PackageAssignment_1 ) )
            // InternalCls.g:1327:1: ( rule__PackageImport__PackageAssignment_1 )
            {
             before(grammarAccess.getPackageImportAccess().getPackageAssignment_1()); 
            // InternalCls.g:1328:1: ( rule__PackageImport__PackageAssignment_1 )
            // InternalCls.g:1328:2: rule__PackageImport__PackageAssignment_1
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
    // InternalCls.g:1342:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1346:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCls.g:1347:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCls.g:1354:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1358:1: ( ( RULE_ID ) )
            // InternalCls.g:1359:1: ( RULE_ID )
            {
            // InternalCls.g:1359:1: ( RULE_ID )
            // InternalCls.g:1360:1: RULE_ID
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
    // InternalCls.g:1371:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1375:1: ( rule__FQN__Group__1__Impl )
            // InternalCls.g:1376:2: rule__FQN__Group__1__Impl
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
    // InternalCls.g:1382:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1386:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCls.g:1387:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCls.g:1387:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCls.g:1388:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCls.g:1389:1: ( rule__FQN__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCls.g:1389:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
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
    // InternalCls.g:1403:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1407:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCls.g:1408:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCls.g:1415:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1419:1: ( ( '.' ) )
            // InternalCls.g:1420:1: ( '.' )
            {
            // InternalCls.g:1420:1: ( '.' )
            // InternalCls.g:1421:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCls.g:1434:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1438:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCls.g:1439:2: rule__FQN__Group_1__1__Impl
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
    // InternalCls.g:1445:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1449:1: ( ( RULE_ID ) )
            // InternalCls.g:1450:1: ( RULE_ID )
            {
            // InternalCls.g:1450:1: ( RULE_ID )
            // InternalCls.g:1451:1: RULE_ID
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
    // InternalCls.g:1466:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1470:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalCls.g:1471:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:1478:1: rule__Class__Group__0__Impl : ( ( rule__Class__VisibilityAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1482:1: ( ( ( rule__Class__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1483:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1483:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            // InternalCls.g:1484:1: ( rule__Class__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1485:1: ( rule__Class__VisibilityAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=12 && LA16_0<=15)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCls.g:1485:2: rule__Class__VisibilityAssignment_0
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
    // InternalCls.g:1495:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1499:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalCls.g:1500:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:1507:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1511:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalCls.g:1512:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalCls.g:1512:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalCls.g:1513:1: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalCls.g:1514:1: ( rule__Class__AbstractAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCls.g:1514:2: rule__Class__AbstractAssignment_1
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
    // InternalCls.g:1524:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1528:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalCls.g:1529:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalCls.g:1536:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1540:1: ( ( 'class' ) )
            // InternalCls.g:1541:1: ( 'class' )
            {
            // InternalCls.g:1541:1: ( 'class' )
            // InternalCls.g:1542:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCls.g:1555:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1559:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalCls.g:1560:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalCls.g:1567:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1571:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalCls.g:1572:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalCls.g:1572:1: ( ( rule__Class__Group_3__0 )? )
            // InternalCls.g:1573:1: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalCls.g:1574:1: ( rule__Class__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==34) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalCls.g:1574:2: rule__Class__Group_3__0
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
    // InternalCls.g:1584:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1588:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalCls.g:1589:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalCls.g:1596:1: rule__Class__Group__4__Impl : ( ( rule__Class__ReferencedElementAssignment_4 ) ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1600:1: ( ( ( rule__Class__ReferencedElementAssignment_4 ) ) )
            // InternalCls.g:1601:1: ( ( rule__Class__ReferencedElementAssignment_4 ) )
            {
            // InternalCls.g:1601:1: ( ( rule__Class__ReferencedElementAssignment_4 ) )
            // InternalCls.g:1602:1: ( rule__Class__ReferencedElementAssignment_4 )
            {
             before(grammarAccess.getClassAccess().getReferencedElementAssignment_4()); 
            // InternalCls.g:1603:1: ( rule__Class__ReferencedElementAssignment_4 )
            // InternalCls.g:1603:2: rule__Class__ReferencedElementAssignment_4
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
    // InternalCls.g:1613:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1617:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalCls.g:1618:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalCls.g:1625:1: rule__Class__Group__5__Impl : ( '{' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1629:1: ( ( '{' ) )
            // InternalCls.g:1630:1: ( '{' )
            {
            // InternalCls.g:1630:1: ( '{' )
            // InternalCls.g:1631:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCls.g:1644:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1648:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalCls.g:1649:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalCls.g:1656:1: rule__Class__Group__6__Impl : ( ( rule__Class__MembersAssignment_6 )* ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1660:1: ( ( ( rule__Class__MembersAssignment_6 )* ) )
            // InternalCls.g:1661:1: ( ( rule__Class__MembersAssignment_6 )* )
            {
            // InternalCls.g:1661:1: ( ( rule__Class__MembersAssignment_6 )* )
            // InternalCls.g:1662:1: ( rule__Class__MembersAssignment_6 )*
            {
             before(grammarAccess.getClassAccess().getMembersAssignment_6()); 
            // InternalCls.g:1663:1: ( rule__Class__MembersAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=12 && LA19_0<=15)||(LA19_0>=47 && LA19_0<=49)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCls.g:1663:2: rule__Class__MembersAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalCls.g:1673:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1677:1: ( rule__Class__Group__7__Impl )
            // InternalCls.g:1678:2: rule__Class__Group__7__Impl
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
    // InternalCls.g:1684:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1688:1: ( ( '}' ) )
            // InternalCls.g:1689:1: ( '}' )
            {
            // InternalCls.g:1689:1: ( '}' )
            // InternalCls.g:1690:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCls.g:1719:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1723:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalCls.g:1724:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCls.g:1731:1: rule__Class__Group_3__0__Impl : ( ( rule__Class__LongNameAssignment_3_0 ) ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1735:1: ( ( ( rule__Class__LongNameAssignment_3_0 ) ) )
            // InternalCls.g:1736:1: ( ( rule__Class__LongNameAssignment_3_0 ) )
            {
            // InternalCls.g:1736:1: ( ( rule__Class__LongNameAssignment_3_0 ) )
            // InternalCls.g:1737:1: ( rule__Class__LongNameAssignment_3_0 )
            {
             before(grammarAccess.getClassAccess().getLongNameAssignment_3_0()); 
            // InternalCls.g:1738:1: ( rule__Class__LongNameAssignment_3_0 )
            // InternalCls.g:1738:2: rule__Class__LongNameAssignment_3_0
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
    // InternalCls.g:1748:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1752:1: ( rule__Class__Group_3__1__Impl )
            // InternalCls.g:1753:2: rule__Class__Group_3__1__Impl
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
    // InternalCls.g:1759:1: rule__Class__Group_3__1__Impl : ( 'as' ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1763:1: ( ( 'as' ) )
            // InternalCls.g:1764:1: ( 'as' )
            {
            // InternalCls.g:1764:1: ( 'as' )
            // InternalCls.g:1765:1: 'as'
            {
             before(grammarAccess.getClassAccess().getAsKeyword_3_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCls.g:1782:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1786:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalCls.g:1787:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCls.g:1794:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__VisibilityAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1798:1: ( ( ( rule__Interface__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1799:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1799:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            // InternalCls.g:1800:1: ( rule__Interface__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1801:1: ( rule__Interface__VisibilityAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=12 && LA20_0<=15)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCls.g:1801:2: rule__Interface__VisibilityAssignment_0
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
    // InternalCls.g:1811:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1815:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalCls.g:1816:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalCls.g:1823:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1827:1: ( ( 'interface' ) )
            // InternalCls.g:1828:1: ( 'interface' )
            {
            // InternalCls.g:1828:1: ( 'interface' )
            // InternalCls.g:1829:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCls.g:1842:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1846:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalCls.g:1847:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalCls.g:1854:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__Group_2__0 )? ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1858:1: ( ( ( rule__Interface__Group_2__0 )? ) )
            // InternalCls.g:1859:1: ( ( rule__Interface__Group_2__0 )? )
            {
            // InternalCls.g:1859:1: ( ( rule__Interface__Group_2__0 )? )
            // InternalCls.g:1860:1: ( rule__Interface__Group_2__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_2()); 
            // InternalCls.g:1861:1: ( rule__Interface__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==34) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalCls.g:1861:2: rule__Interface__Group_2__0
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
    // InternalCls.g:1871:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1875:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalCls.g:1876:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalCls.g:1883:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__ReferencedElementAssignment_3 ) ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1887:1: ( ( ( rule__Interface__ReferencedElementAssignment_3 ) ) )
            // InternalCls.g:1888:1: ( ( rule__Interface__ReferencedElementAssignment_3 ) )
            {
            // InternalCls.g:1888:1: ( ( rule__Interface__ReferencedElementAssignment_3 ) )
            // InternalCls.g:1889:1: ( rule__Interface__ReferencedElementAssignment_3 )
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementAssignment_3()); 
            // InternalCls.g:1890:1: ( rule__Interface__ReferencedElementAssignment_3 )
            // InternalCls.g:1890:2: rule__Interface__ReferencedElementAssignment_3
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
    // InternalCls.g:1900:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1904:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalCls.g:1905:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalCls.g:1912:1: rule__Interface__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1916:1: ( ( '{' ) )
            // InternalCls.g:1917:1: ( '{' )
            {
            // InternalCls.g:1917:1: ( '{' )
            // InternalCls.g:1918:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCls.g:1931:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1935:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // InternalCls.g:1936:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalCls.g:1943:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__MembersAssignment_5 )* ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1947:1: ( ( ( rule__Interface__MembersAssignment_5 )* ) )
            // InternalCls.g:1948:1: ( ( rule__Interface__MembersAssignment_5 )* )
            {
            // InternalCls.g:1948:1: ( ( rule__Interface__MembersAssignment_5 )* )
            // InternalCls.g:1949:1: ( rule__Interface__MembersAssignment_5 )*
            {
             before(grammarAccess.getInterfaceAccess().getMembersAssignment_5()); 
            // InternalCls.g:1950:1: ( rule__Interface__MembersAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=12 && LA22_0<=15)||(LA22_0>=47 && LA22_0<=49)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCls.g:1950:2: rule__Interface__MembersAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalCls.g:1960:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1964:1: ( rule__Interface__Group__6__Impl )
            // InternalCls.g:1965:2: rule__Interface__Group__6__Impl
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
    // InternalCls.g:1971:1: rule__Interface__Group__6__Impl : ( '}' ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1975:1: ( ( '}' ) )
            // InternalCls.g:1976:1: ( '}' )
            {
            // InternalCls.g:1976:1: ( '}' )
            // InternalCls.g:1977:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCls.g:2004:1: rule__Interface__Group_2__0 : rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 ;
    public final void rule__Interface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2008:1: ( rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 )
            // InternalCls.g:2009:2: rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCls.g:2016:1: rule__Interface__Group_2__0__Impl : ( ( rule__Interface__LongNameAssignment_2_0 ) ) ;
    public final void rule__Interface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2020:1: ( ( ( rule__Interface__LongNameAssignment_2_0 ) ) )
            // InternalCls.g:2021:1: ( ( rule__Interface__LongNameAssignment_2_0 ) )
            {
            // InternalCls.g:2021:1: ( ( rule__Interface__LongNameAssignment_2_0 ) )
            // InternalCls.g:2022:1: ( rule__Interface__LongNameAssignment_2_0 )
            {
             before(grammarAccess.getInterfaceAccess().getLongNameAssignment_2_0()); 
            // InternalCls.g:2023:1: ( rule__Interface__LongNameAssignment_2_0 )
            // InternalCls.g:2023:2: rule__Interface__LongNameAssignment_2_0
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
    // InternalCls.g:2033:1: rule__Interface__Group_2__1 : rule__Interface__Group_2__1__Impl ;
    public final void rule__Interface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2037:1: ( rule__Interface__Group_2__1__Impl )
            // InternalCls.g:2038:2: rule__Interface__Group_2__1__Impl
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
    // InternalCls.g:2044:1: rule__Interface__Group_2__1__Impl : ( 'as' ) ;
    public final void rule__Interface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2048:1: ( ( 'as' ) )
            // InternalCls.g:2049:1: ( 'as' )
            {
            // InternalCls.g:2049:1: ( 'as' )
            // InternalCls.g:2050:1: 'as'
            {
             before(grammarAccess.getInterfaceAccess().getAsKeyword_2_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCls.g:2067:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2071:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalCls.g:2072:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:2079:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2083:1: ( ( () ) )
            // InternalCls.g:2084:1: ( () )
            {
            // InternalCls.g:2084:1: ( () )
            // InternalCls.g:2085:1: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalCls.g:2086:1: ()
            // InternalCls.g:2088:1: 
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
    // InternalCls.g:2098:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2102:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalCls.g:2103:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:2110:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__VisibilityAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2114:1: ( ( ( rule__Attribute__VisibilityAssignment_1 )? ) )
            // InternalCls.g:2115:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            {
            // InternalCls.g:2115:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            // InternalCls.g:2116:1: ( rule__Attribute__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 
            // InternalCls.g:2117:1: ( rule__Attribute__VisibilityAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=12 && LA23_0<=15)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCls.g:2117:2: rule__Attribute__VisibilityAssignment_1
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
    // InternalCls.g:2127:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2131:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalCls.g:2132:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:2139:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__StaticAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2143:1: ( ( ( rule__Attribute__StaticAssignment_2 )? ) )
            // InternalCls.g:2144:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            {
            // InternalCls.g:2144:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            // InternalCls.g:2145:1: ( rule__Attribute__StaticAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getStaticAssignment_2()); 
            // InternalCls.g:2146:1: ( rule__Attribute__StaticAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCls.g:2146:2: rule__Attribute__StaticAssignment_2
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
    // InternalCls.g:2156:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2160:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalCls.g:2161:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:2168:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__FinalAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2172:1: ( ( ( rule__Attribute__FinalAssignment_3 )? ) )
            // InternalCls.g:2173:1: ( ( rule__Attribute__FinalAssignment_3 )? )
            {
            // InternalCls.g:2173:1: ( ( rule__Attribute__FinalAssignment_3 )? )
            // InternalCls.g:2174:1: ( rule__Attribute__FinalAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getFinalAssignment_3()); 
            // InternalCls.g:2175:1: ( rule__Attribute__FinalAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:2175:2: rule__Attribute__FinalAssignment_3
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
    // InternalCls.g:2185:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2189:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalCls.g:2190:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalCls.g:2197:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__ReferencedElementAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2201:1: ( ( ( rule__Attribute__ReferencedElementAssignment_4 ) ) )
            // InternalCls.g:2202:1: ( ( rule__Attribute__ReferencedElementAssignment_4 ) )
            {
            // InternalCls.g:2202:1: ( ( rule__Attribute__ReferencedElementAssignment_4 ) )
            // InternalCls.g:2203:1: ( rule__Attribute__ReferencedElementAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getReferencedElementAssignment_4()); 
            // InternalCls.g:2204:1: ( rule__Attribute__ReferencedElementAssignment_4 )
            // InternalCls.g:2204:2: rule__Attribute__ReferencedElementAssignment_4
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
    // InternalCls.g:2214:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2218:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalCls.g:2219:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalCls.g:2226:1: rule__Attribute__Group__5__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2230:1: ( ( ':' ) )
            // InternalCls.g:2231:1: ( ':' )
            {
            // InternalCls.g:2231:1: ( ':' )
            // InternalCls.g:2232:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCls.g:2245:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2249:1: ( rule__Attribute__Group__6__Impl )
            // InternalCls.g:2250:2: rule__Attribute__Group__6__Impl
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
    // InternalCls.g:2256:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__TypeAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2260:1: ( ( ( rule__Attribute__TypeAssignment_6 ) ) )
            // InternalCls.g:2261:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            {
            // InternalCls.g:2261:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            // InternalCls.g:2262:1: ( rule__Attribute__TypeAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_6()); 
            // InternalCls.g:2263:1: ( rule__Attribute__TypeAssignment_6 )
            // InternalCls.g:2263:2: rule__Attribute__TypeAssignment_6
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
    // InternalCls.g:2287:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2291:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalCls.g:2292:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:2299:1: rule__Method__Group__0__Impl : ( ( rule__Method__VisibilityAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2303:1: ( ( ( rule__Method__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2304:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2304:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            // InternalCls.g:2305:1: ( rule__Method__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2306:1: ( rule__Method__VisibilityAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=12 && LA26_0<=15)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:2306:2: rule__Method__VisibilityAssignment_0
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
    // InternalCls.g:2316:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2320:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalCls.g:2321:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:2328:1: rule__Method__Group__1__Impl : ( ( rule__Method__AbstractAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2332:1: ( ( ( rule__Method__AbstractAssignment_1 )? ) )
            // InternalCls.g:2333:1: ( ( rule__Method__AbstractAssignment_1 )? )
            {
            // InternalCls.g:2333:1: ( ( rule__Method__AbstractAssignment_1 )? )
            // InternalCls.g:2334:1: ( rule__Method__AbstractAssignment_1 )?
            {
             before(grammarAccess.getMethodAccess().getAbstractAssignment_1()); 
            // InternalCls.g:2335:1: ( rule__Method__AbstractAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:2335:2: rule__Method__AbstractAssignment_1
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
    // InternalCls.g:2345:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2349:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalCls.g:2350:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:2357:1: rule__Method__Group__2__Impl : ( ( rule__Method__StaticAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2361:1: ( ( ( rule__Method__StaticAssignment_2 )? ) )
            // InternalCls.g:2362:1: ( ( rule__Method__StaticAssignment_2 )? )
            {
            // InternalCls.g:2362:1: ( ( rule__Method__StaticAssignment_2 )? )
            // InternalCls.g:2363:1: ( rule__Method__StaticAssignment_2 )?
            {
             before(grammarAccess.getMethodAccess().getStaticAssignment_2()); 
            // InternalCls.g:2364:1: ( rule__Method__StaticAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCls.g:2364:2: rule__Method__StaticAssignment_2
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
    // InternalCls.g:2374:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2378:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalCls.g:2379:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:2386:1: rule__Method__Group__3__Impl : ( ( rule__Method__FinalAssignment_3 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2390:1: ( ( ( rule__Method__FinalAssignment_3 )? ) )
            // InternalCls.g:2391:1: ( ( rule__Method__FinalAssignment_3 )? )
            {
            // InternalCls.g:2391:1: ( ( rule__Method__FinalAssignment_3 )? )
            // InternalCls.g:2392:1: ( rule__Method__FinalAssignment_3 )?
            {
             before(grammarAccess.getMethodAccess().getFinalAssignment_3()); 
            // InternalCls.g:2393:1: ( rule__Method__FinalAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:2393:2: rule__Method__FinalAssignment_3
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
    // InternalCls.g:2403:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2407:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalCls.g:2408:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalCls.g:2415:1: rule__Method__Group__4__Impl : ( ( rule__Method__ReferencedElementAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2419:1: ( ( ( rule__Method__ReferencedElementAssignment_4 ) ) )
            // InternalCls.g:2420:1: ( ( rule__Method__ReferencedElementAssignment_4 ) )
            {
            // InternalCls.g:2420:1: ( ( rule__Method__ReferencedElementAssignment_4 ) )
            // InternalCls.g:2421:1: ( rule__Method__ReferencedElementAssignment_4 )
            {
             before(grammarAccess.getMethodAccess().getReferencedElementAssignment_4()); 
            // InternalCls.g:2422:1: ( rule__Method__ReferencedElementAssignment_4 )
            // InternalCls.g:2422:2: rule__Method__ReferencedElementAssignment_4
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
    // InternalCls.g:2432:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2436:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalCls.g:2437:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:2444:1: rule__Method__Group__5__Impl : ( '(' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2448:1: ( ( '(' ) )
            // InternalCls.g:2449:1: ( '(' )
            {
            // InternalCls.g:2449:1: ( '(' )
            // InternalCls.g:2450:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCls.g:2463:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2467:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalCls.g:2468:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:2475:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )* ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2479:1: ( ( ( rule__Method__Group_6__0 )* ) )
            // InternalCls.g:2480:1: ( ( rule__Method__Group_6__0 )* )
            {
            // InternalCls.g:2480:1: ( ( rule__Method__Group_6__0 )* )
            // InternalCls.g:2481:1: ( rule__Method__Group_6__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalCls.g:2482:1: ( rule__Method__Group_6__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=12 && LA30_0<=15)||(LA30_0>=48 && LA30_0<=49)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCls.g:2482:2: rule__Method__Group_6__0
            	    {
            	    pushFollow(FOLLOW_24);
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
    // InternalCls.g:2492:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2496:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalCls.g:2497:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalCls.g:2504:1: rule__Method__Group__7__Impl : ( ')' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2508:1: ( ( ')' ) )
            // InternalCls.g:2509:1: ( ')' )
            {
            // InternalCls.g:2509:1: ( ')' )
            // InternalCls.g:2510:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCls.g:2523:1: rule__Method__Group__8 : rule__Method__Group__8__Impl ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2527:1: ( rule__Method__Group__8__Impl )
            // InternalCls.g:2528:2: rule__Method__Group__8__Impl
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
    // InternalCls.g:2534:1: rule__Method__Group__8__Impl : ( ( rule__Method__Group_8__0 )? ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2538:1: ( ( ( rule__Method__Group_8__0 )? ) )
            // InternalCls.g:2539:1: ( ( rule__Method__Group_8__0 )? )
            {
            // InternalCls.g:2539:1: ( ( rule__Method__Group_8__0 )? )
            // InternalCls.g:2540:1: ( rule__Method__Group_8__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_8()); 
            // InternalCls.g:2541:1: ( rule__Method__Group_8__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCls.g:2541:2: rule__Method__Group_8__0
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
    // InternalCls.g:2569:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2573:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalCls.g:2574:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:2581:1: rule__Method__Group_6__0__Impl : ( ( rule__Method__ParametersAssignment_6_0 ) ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2585:1: ( ( ( rule__Method__ParametersAssignment_6_0 ) ) )
            // InternalCls.g:2586:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            {
            // InternalCls.g:2586:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            // InternalCls.g:2587:1: ( rule__Method__ParametersAssignment_6_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_0()); 
            // InternalCls.g:2588:1: ( rule__Method__ParametersAssignment_6_0 )
            // InternalCls.g:2588:2: rule__Method__ParametersAssignment_6_0
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
    // InternalCls.g:2598:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2602:1: ( rule__Method__Group_6__1__Impl )
            // InternalCls.g:2603:2: rule__Method__Group_6__1__Impl
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
    // InternalCls.g:2609:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Group_6_1__0 )* ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2613:1: ( ( ( rule__Method__Group_6_1__0 )* ) )
            // InternalCls.g:2614:1: ( ( rule__Method__Group_6_1__0 )* )
            {
            // InternalCls.g:2614:1: ( ( rule__Method__Group_6_1__0 )* )
            // InternalCls.g:2615:1: ( rule__Method__Group_6_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6_1()); 
            // InternalCls.g:2616:1: ( rule__Method__Group_6_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==39) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCls.g:2616:2: rule__Method__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_26);
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
    // InternalCls.g:2630:1: rule__Method__Group_6_1__0 : rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
    public final void rule__Method__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2634:1: ( rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
            // InternalCls.g:2635:2: rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:2642:1: rule__Method__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2646:1: ( ( ',' ) )
            // InternalCls.g:2647:1: ( ',' )
            {
            // InternalCls.g:2647:1: ( ',' )
            // InternalCls.g:2648:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_6_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCls.g:2661:1: rule__Method__Group_6_1__1 : rule__Method__Group_6_1__1__Impl ;
    public final void rule__Method__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2665:1: ( rule__Method__Group_6_1__1__Impl )
            // InternalCls.g:2666:2: rule__Method__Group_6_1__1__Impl
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
    // InternalCls.g:2672:1: rule__Method__Group_6_1__1__Impl : ( ( rule__Method__ParametersAssignment_6_1_1 ) ) ;
    public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2676:1: ( ( ( rule__Method__ParametersAssignment_6_1_1 ) ) )
            // InternalCls.g:2677:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            {
            // InternalCls.g:2677:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            // InternalCls.g:2678:1: ( rule__Method__ParametersAssignment_6_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_1_1()); 
            // InternalCls.g:2679:1: ( rule__Method__ParametersAssignment_6_1_1 )
            // InternalCls.g:2679:2: rule__Method__ParametersAssignment_6_1_1
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
    // InternalCls.g:2693:1: rule__Method__Group_8__0 : rule__Method__Group_8__0__Impl rule__Method__Group_8__1 ;
    public final void rule__Method__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2697:1: ( rule__Method__Group_8__0__Impl rule__Method__Group_8__1 )
            // InternalCls.g:2698:2: rule__Method__Group_8__0__Impl rule__Method__Group_8__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCls.g:2705:1: rule__Method__Group_8__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2709:1: ( ( ':' ) )
            // InternalCls.g:2710:1: ( ':' )
            {
            // InternalCls.g:2710:1: ( ':' )
            // InternalCls.g:2711:1: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_8_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCls.g:2724:1: rule__Method__Group_8__1 : rule__Method__Group_8__1__Impl ;
    public final void rule__Method__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2728:1: ( rule__Method__Group_8__1__Impl )
            // InternalCls.g:2729:2: rule__Method__Group_8__1__Impl
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
    // InternalCls.g:2735:1: rule__Method__Group_8__1__Impl : ( ( rule__Method__TypeAssignment_8_1 ) ) ;
    public final void rule__Method__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2739:1: ( ( ( rule__Method__TypeAssignment_8_1 ) ) )
            // InternalCls.g:2740:1: ( ( rule__Method__TypeAssignment_8_1 ) )
            {
            // InternalCls.g:2740:1: ( ( rule__Method__TypeAssignment_8_1 ) )
            // InternalCls.g:2741:1: ( rule__Method__TypeAssignment_8_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_8_1()); 
            // InternalCls.g:2742:1: ( rule__Method__TypeAssignment_8_1 )
            // InternalCls.g:2742:2: rule__Method__TypeAssignment_8_1
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
    // InternalCls.g:2756:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2760:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCls.g:2761:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:2768:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__VisibilityAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2772:1: ( ( ( rule__Parameter__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2773:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2773:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            // InternalCls.g:2774:1: ( rule__Parameter__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2775:1: ( rule__Parameter__VisibilityAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=12 && LA33_0<=15)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:2775:2: rule__Parameter__VisibilityAssignment_0
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
    // InternalCls.g:2785:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2789:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCls.g:2790:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:2797:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__StaticAssignment_1 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2801:1: ( ( ( rule__Parameter__StaticAssignment_1 )? ) )
            // InternalCls.g:2802:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            {
            // InternalCls.g:2802:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            // InternalCls.g:2803:1: ( rule__Parameter__StaticAssignment_1 )?
            {
             before(grammarAccess.getParameterAccess().getStaticAssignment_1()); 
            // InternalCls.g:2804:1: ( rule__Parameter__StaticAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCls.g:2804:2: rule__Parameter__StaticAssignment_1
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
    // InternalCls.g:2814:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2818:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCls.g:2819:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:2826:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__FinalAssignment_2 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2830:1: ( ( ( rule__Parameter__FinalAssignment_2 )? ) )
            // InternalCls.g:2831:1: ( ( rule__Parameter__FinalAssignment_2 )? )
            {
            // InternalCls.g:2831:1: ( ( rule__Parameter__FinalAssignment_2 )? )
            // InternalCls.g:2832:1: ( rule__Parameter__FinalAssignment_2 )?
            {
             before(grammarAccess.getParameterAccess().getFinalAssignment_2()); 
            // InternalCls.g:2833:1: ( rule__Parameter__FinalAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:2833:2: rule__Parameter__FinalAssignment_2
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
    // InternalCls.g:2843:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2847:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalCls.g:2848:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalCls.g:2855:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ReferencedElementAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2859:1: ( ( ( rule__Parameter__ReferencedElementAssignment_3 ) ) )
            // InternalCls.g:2860:1: ( ( rule__Parameter__ReferencedElementAssignment_3 ) )
            {
            // InternalCls.g:2860:1: ( ( rule__Parameter__ReferencedElementAssignment_3 ) )
            // InternalCls.g:2861:1: ( rule__Parameter__ReferencedElementAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getReferencedElementAssignment_3()); 
            // InternalCls.g:2862:1: ( rule__Parameter__ReferencedElementAssignment_3 )
            // InternalCls.g:2862:2: rule__Parameter__ReferencedElementAssignment_3
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
    // InternalCls.g:2872:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2876:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalCls.g:2877:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalCls.g:2884:1: rule__Parameter__Group__4__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2888:1: ( ( ':' ) )
            // InternalCls.g:2889:1: ( ':' )
            {
            // InternalCls.g:2889:1: ( ':' )
            // InternalCls.g:2890:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCls.g:2903:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2907:1: ( rule__Parameter__Group__5__Impl )
            // InternalCls.g:2908:2: rule__Parameter__Group__5__Impl
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
    // InternalCls.g:2914:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__TypeAssignment_5 ) ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2918:1: ( ( ( rule__Parameter__TypeAssignment_5 ) ) )
            // InternalCls.g:2919:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            {
            // InternalCls.g:2919:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            // InternalCls.g:2920:1: ( rule__Parameter__TypeAssignment_5 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_5()); 
            // InternalCls.g:2921:1: ( rule__Parameter__TypeAssignment_5 )
            // InternalCls.g:2921:2: rule__Parameter__TypeAssignment_5
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
    // InternalCls.g:2943:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2947:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalCls.g:2948:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalCls.g:2955:1: rule__Generalization__Group__0__Impl : ( ( rule__Generalization__LeftAssignment_0 ) ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2959:1: ( ( ( rule__Generalization__LeftAssignment_0 ) ) )
            // InternalCls.g:2960:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            {
            // InternalCls.g:2960:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            // InternalCls.g:2961:1: ( rule__Generalization__LeftAssignment_0 )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssignment_0()); 
            // InternalCls.g:2962:1: ( rule__Generalization__LeftAssignment_0 )
            // InternalCls.g:2962:2: rule__Generalization__LeftAssignment_0
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
    // InternalCls.g:2972:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2976:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalCls.g:2977:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalCls.g:2984:1: rule__Generalization__Group__1__Impl : ( 'isa' ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2988:1: ( ( 'isa' ) )
            // InternalCls.g:2989:1: ( 'isa' )
            {
            // InternalCls.g:2989:1: ( 'isa' )
            // InternalCls.g:2990:1: 'isa'
            {
             before(grammarAccess.getGeneralizationAccess().getIsaKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCls.g:3003:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3007:1: ( rule__Generalization__Group__2__Impl )
            // InternalCls.g:3008:2: rule__Generalization__Group__2__Impl
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
    // InternalCls.g:3014:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__RightAssignment_2 ) ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3018:1: ( ( ( rule__Generalization__RightAssignment_2 ) ) )
            // InternalCls.g:3019:1: ( ( rule__Generalization__RightAssignment_2 ) )
            {
            // InternalCls.g:3019:1: ( ( rule__Generalization__RightAssignment_2 ) )
            // InternalCls.g:3020:1: ( rule__Generalization__RightAssignment_2 )
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssignment_2()); 
            // InternalCls.g:3021:1: ( rule__Generalization__RightAssignment_2 )
            // InternalCls.g:3021:2: rule__Generalization__RightAssignment_2
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
    // InternalCls.g:3037:1: rule__Implementation__Group__0 : rule__Implementation__Group__0__Impl rule__Implementation__Group__1 ;
    public final void rule__Implementation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3041:1: ( rule__Implementation__Group__0__Impl rule__Implementation__Group__1 )
            // InternalCls.g:3042:2: rule__Implementation__Group__0__Impl rule__Implementation__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCls.g:3049:1: rule__Implementation__Group__0__Impl : ( ( rule__Implementation__LeftAssignment_0 ) ) ;
    public final void rule__Implementation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3053:1: ( ( ( rule__Implementation__LeftAssignment_0 ) ) )
            // InternalCls.g:3054:1: ( ( rule__Implementation__LeftAssignment_0 ) )
            {
            // InternalCls.g:3054:1: ( ( rule__Implementation__LeftAssignment_0 ) )
            // InternalCls.g:3055:1: ( rule__Implementation__LeftAssignment_0 )
            {
             before(grammarAccess.getImplementationAccess().getLeftAssignment_0()); 
            // InternalCls.g:3056:1: ( rule__Implementation__LeftAssignment_0 )
            // InternalCls.g:3056:2: rule__Implementation__LeftAssignment_0
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
    // InternalCls.g:3066:1: rule__Implementation__Group__1 : rule__Implementation__Group__1__Impl rule__Implementation__Group__2 ;
    public final void rule__Implementation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3070:1: ( rule__Implementation__Group__1__Impl rule__Implementation__Group__2 )
            // InternalCls.g:3071:2: rule__Implementation__Group__1__Impl rule__Implementation__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalCls.g:3078:1: rule__Implementation__Group__1__Impl : ( 'impl' ) ;
    public final void rule__Implementation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3082:1: ( ( 'impl' ) )
            // InternalCls.g:3083:1: ( 'impl' )
            {
            // InternalCls.g:3083:1: ( 'impl' )
            // InternalCls.g:3084:1: 'impl'
            {
             before(grammarAccess.getImplementationAccess().getImplKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCls.g:3097:1: rule__Implementation__Group__2 : rule__Implementation__Group__2__Impl ;
    public final void rule__Implementation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3101:1: ( rule__Implementation__Group__2__Impl )
            // InternalCls.g:3102:2: rule__Implementation__Group__2__Impl
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
    // InternalCls.g:3108:1: rule__Implementation__Group__2__Impl : ( ( rule__Implementation__RightAssignment_2 ) ) ;
    public final void rule__Implementation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3112:1: ( ( ( rule__Implementation__RightAssignment_2 ) ) )
            // InternalCls.g:3113:1: ( ( rule__Implementation__RightAssignment_2 ) )
            {
            // InternalCls.g:3113:1: ( ( rule__Implementation__RightAssignment_2 ) )
            // InternalCls.g:3114:1: ( rule__Implementation__RightAssignment_2 )
            {
             before(grammarAccess.getImplementationAccess().getRightAssignment_2()); 
            // InternalCls.g:3115:1: ( rule__Implementation__RightAssignment_2 )
            // InternalCls.g:3115:2: rule__Implementation__RightAssignment_2
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
    // InternalCls.g:3131:1: rule__CommentLink__Group__0 : rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1 ;
    public final void rule__CommentLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3135:1: ( rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1 )
            // InternalCls.g:3136:2: rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalCls.g:3143:1: rule__CommentLink__Group__0__Impl : ( ( rule__CommentLink__LeftAssignment_0 ) ) ;
    public final void rule__CommentLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3147:1: ( ( ( rule__CommentLink__LeftAssignment_0 ) ) )
            // InternalCls.g:3148:1: ( ( rule__CommentLink__LeftAssignment_0 ) )
            {
            // InternalCls.g:3148:1: ( ( rule__CommentLink__LeftAssignment_0 ) )
            // InternalCls.g:3149:1: ( rule__CommentLink__LeftAssignment_0 )
            {
             before(grammarAccess.getCommentLinkAccess().getLeftAssignment_0()); 
            // InternalCls.g:3150:1: ( rule__CommentLink__LeftAssignment_0 )
            // InternalCls.g:3150:2: rule__CommentLink__LeftAssignment_0
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
    // InternalCls.g:3160:1: rule__CommentLink__Group__1 : rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2 ;
    public final void rule__CommentLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3164:1: ( rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2 )
            // InternalCls.g:3165:2: rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalCls.g:3172:1: rule__CommentLink__Group__1__Impl : ( '-' ) ;
    public final void rule__CommentLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3176:1: ( ( '-' ) )
            // InternalCls.g:3177:1: ( '-' )
            {
            // InternalCls.g:3177:1: ( '-' )
            // InternalCls.g:3178:1: '-'
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
    // InternalCls.g:3191:1: rule__CommentLink__Group__2 : rule__CommentLink__Group__2__Impl ;
    public final void rule__CommentLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3195:1: ( rule__CommentLink__Group__2__Impl )
            // InternalCls.g:3196:2: rule__CommentLink__Group__2__Impl
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
    // InternalCls.g:3202:1: rule__CommentLink__Group__2__Impl : ( ( rule__CommentLink__CommentAssignment_2 ) ) ;
    public final void rule__CommentLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3206:1: ( ( ( rule__CommentLink__CommentAssignment_2 ) ) )
            // InternalCls.g:3207:1: ( ( rule__CommentLink__CommentAssignment_2 ) )
            {
            // InternalCls.g:3207:1: ( ( rule__CommentLink__CommentAssignment_2 ) )
            // InternalCls.g:3208:1: ( rule__CommentLink__CommentAssignment_2 )
            {
             before(grammarAccess.getCommentLinkAccess().getCommentAssignment_2()); 
            // InternalCls.g:3209:1: ( rule__CommentLink__CommentAssignment_2 )
            // InternalCls.g:3209:2: rule__CommentLink__CommentAssignment_2
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
    // InternalCls.g:3225:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3229:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalCls.g:3230:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalCls.g:3237:1: rule__Association__Group__0__Impl : ( ( rule__Association__LeftAssignment_0 ) ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3241:1: ( ( ( rule__Association__LeftAssignment_0 ) ) )
            // InternalCls.g:3242:1: ( ( rule__Association__LeftAssignment_0 ) )
            {
            // InternalCls.g:3242:1: ( ( rule__Association__LeftAssignment_0 ) )
            // InternalCls.g:3243:1: ( rule__Association__LeftAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getLeftAssignment_0()); 
            // InternalCls.g:3244:1: ( rule__Association__LeftAssignment_0 )
            // InternalCls.g:3244:2: rule__Association__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Association__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getLeftAssignment_0()); 

            }


            }

        }
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
    // InternalCls.g:3254:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3258:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalCls.g:3259:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalCls.g:3266:1: rule__Association__Group__1__Impl : ( '-' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3270:1: ( ( '-' ) )
            // InternalCls.g:3271:1: ( '-' )
            {
            // InternalCls.g:3271:1: ( '-' )
            // InternalCls.g:3272:1: '-'
            {
             before(grammarAccess.getAssociationAccess().getHyphenMinusKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
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
    // InternalCls.g:3285:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3289:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalCls.g:3290:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalCls.g:3297:1: rule__Association__Group__2__Impl : ( ( rule__Association__RightAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3301:1: ( ( ( rule__Association__RightAssignment_2 ) ) )
            // InternalCls.g:3302:1: ( ( rule__Association__RightAssignment_2 ) )
            {
            // InternalCls.g:3302:1: ( ( rule__Association__RightAssignment_2 ) )
            // InternalCls.g:3303:1: ( rule__Association__RightAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getRightAssignment_2()); 
            // InternalCls.g:3304:1: ( rule__Association__RightAssignment_2 )
            // InternalCls.g:3304:2: rule__Association__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Association__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getRightAssignment_2()); 

            }


            }

        }
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
    // InternalCls.g:3314:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3318:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalCls.g:3319:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalCls.g:3326:1: rule__Association__Group__3__Impl : ( ( rule__Association__PropertiesAssignment_3 )? ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3330:1: ( ( ( rule__Association__PropertiesAssignment_3 )? ) )
            // InternalCls.g:3331:1: ( ( rule__Association__PropertiesAssignment_3 )? )
            {
            // InternalCls.g:3331:1: ( ( rule__Association__PropertiesAssignment_3 )? )
            // InternalCls.g:3332:1: ( rule__Association__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getAssociationAccess().getPropertiesAssignment_3()); 
            // InternalCls.g:3333:1: ( rule__Association__PropertiesAssignment_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCls.g:3333:2: rule__Association__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getPropertiesAssignment_3()); 

            }


            }

        }
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
    // InternalCls.g:3343:1: rule__Association__Group__4 : rule__Association__Group__4__Impl ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3347:1: ( rule__Association__Group__4__Impl )
            // InternalCls.g:3348:2: rule__Association__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__4__Impl();

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
    // InternalCls.g:3354:1: rule__Association__Group__4__Impl : ( ( rule__Association__CommentAssignment_4 )? ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3358:1: ( ( ( rule__Association__CommentAssignment_4 )? ) )
            // InternalCls.g:3359:1: ( ( rule__Association__CommentAssignment_4 )? )
            {
            // InternalCls.g:3359:1: ( ( rule__Association__CommentAssignment_4 )? )
            // InternalCls.g:3360:1: ( rule__Association__CommentAssignment_4 )?
            {
             before(grammarAccess.getAssociationAccess().getCommentAssignment_4()); 
            // InternalCls.g:3361:1: ( rule__Association__CommentAssignment_4 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCls.g:3361:2: rule__Association__CommentAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__CommentAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getCommentAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__AssociationProperties__Group__0"
    // InternalCls.g:3381:1: rule__AssociationProperties__Group__0 : rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1 ;
    public final void rule__AssociationProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3385:1: ( rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1 )
            // InternalCls.g:3386:2: rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalCls.g:3393:1: rule__AssociationProperties__Group__0__Impl : ( '[' ) ;
    public final void rule__AssociationProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3397:1: ( ( '[' ) )
            // InternalCls.g:3398:1: ( '[' )
            {
            // InternalCls.g:3398:1: ( '[' )
            // InternalCls.g:3399:1: '['
            {
             before(grammarAccess.getAssociationPropertiesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCls.g:3412:1: rule__AssociationProperties__Group__1 : rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2 ;
    public final void rule__AssociationProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3416:1: ( rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2 )
            // InternalCls.g:3417:2: rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalCls.g:3424:1: rule__AssociationProperties__Group__1__Impl : ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) ) ;
    public final void rule__AssociationProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3428:1: ( ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) ) )
            // InternalCls.g:3429:1: ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) )
            {
            // InternalCls.g:3429:1: ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) )
            // InternalCls.g:3430:1: ( rule__AssociationProperties__CardinalityLeftAssignment_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCardinalityLeftAssignment_1()); 
            // InternalCls.g:3431:1: ( rule__AssociationProperties__CardinalityLeftAssignment_1 )
            // InternalCls.g:3431:2: rule__AssociationProperties__CardinalityLeftAssignment_1
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
    // InternalCls.g:3441:1: rule__AssociationProperties__Group__2 : rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3 ;
    public final void rule__AssociationProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3445:1: ( rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3 )
            // InternalCls.g:3446:2: rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalCls.g:3453:1: rule__AssociationProperties__Group__2__Impl : ( ( rule__AssociationProperties__Group_2__0 )? ) ;
    public final void rule__AssociationProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3457:1: ( ( ( rule__AssociationProperties__Group_2__0 )? ) )
            // InternalCls.g:3458:1: ( ( rule__AssociationProperties__Group_2__0 )? )
            {
            // InternalCls.g:3458:1: ( ( rule__AssociationProperties__Group_2__0 )? )
            // InternalCls.g:3459:1: ( rule__AssociationProperties__Group_2__0 )?
            {
             before(grammarAccess.getAssociationPropertiesAccess().getGroup_2()); 
            // InternalCls.g:3460:1: ( rule__AssociationProperties__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:3460:2: rule__AssociationProperties__Group_2__0
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
    // InternalCls.g:3470:1: rule__AssociationProperties__Group__3 : rule__AssociationProperties__Group__3__Impl ;
    public final void rule__AssociationProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3474:1: ( rule__AssociationProperties__Group__3__Impl )
            // InternalCls.g:3475:2: rule__AssociationProperties__Group__3__Impl
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
    // InternalCls.g:3481:1: rule__AssociationProperties__Group__3__Impl : ( ']' ) ;
    public final void rule__AssociationProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3485:1: ( ( ']' ) )
            // InternalCls.g:3486:1: ( ']' )
            {
            // InternalCls.g:3486:1: ( ']' )
            // InternalCls.g:3487:1: ']'
            {
             before(grammarAccess.getAssociationPropertiesAccess().getRightSquareBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCls.g:3508:1: rule__AssociationProperties__Group_2__0 : rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1 ;
    public final void rule__AssociationProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3512:1: ( rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1 )
            // InternalCls.g:3513:2: rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalCls.g:3520:1: rule__AssociationProperties__Group_2__0__Impl : ( '|' ) ;
    public final void rule__AssociationProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3524:1: ( ( '|' ) )
            // InternalCls.g:3525:1: ( '|' )
            {
            // InternalCls.g:3525:1: ( '|' )
            // InternalCls.g:3526:1: '|'
            {
             before(grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCls.g:3539:1: rule__AssociationProperties__Group_2__1 : rule__AssociationProperties__Group_2__1__Impl rule__AssociationProperties__Group_2__2 ;
    public final void rule__AssociationProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3543:1: ( rule__AssociationProperties__Group_2__1__Impl rule__AssociationProperties__Group_2__2 )
            // InternalCls.g:3544:2: rule__AssociationProperties__Group_2__1__Impl rule__AssociationProperties__Group_2__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:3551:1: rule__AssociationProperties__Group_2__1__Impl : ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) ) ;
    public final void rule__AssociationProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3555:1: ( ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) ) )
            // InternalCls.g:3556:1: ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) )
            {
            // InternalCls.g:3556:1: ( ( rule__AssociationProperties__CardinalityRightAssignment_2_1 ) )
            // InternalCls.g:3557:1: ( rule__AssociationProperties__CardinalityRightAssignment_2_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightAssignment_2_1()); 
            // InternalCls.g:3558:1: ( rule__AssociationProperties__CardinalityRightAssignment_2_1 )
            // InternalCls.g:3558:2: rule__AssociationProperties__CardinalityRightAssignment_2_1
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
    // InternalCls.g:3568:1: rule__AssociationProperties__Group_2__2 : rule__AssociationProperties__Group_2__2__Impl ;
    public final void rule__AssociationProperties__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3572:1: ( rule__AssociationProperties__Group_2__2__Impl )
            // InternalCls.g:3573:2: rule__AssociationProperties__Group_2__2__Impl
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
    // InternalCls.g:3579:1: rule__AssociationProperties__Group_2__2__Impl : ( ( rule__AssociationProperties__Group_2_2__0 )? ) ;
    public final void rule__AssociationProperties__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3583:1: ( ( ( rule__AssociationProperties__Group_2_2__0 )? ) )
            // InternalCls.g:3584:1: ( ( rule__AssociationProperties__Group_2_2__0 )? )
            {
            // InternalCls.g:3584:1: ( ( rule__AssociationProperties__Group_2_2__0 )? )
            // InternalCls.g:3585:1: ( rule__AssociationProperties__Group_2_2__0 )?
            {
             before(grammarAccess.getAssociationPropertiesAccess().getGroup_2_2()); 
            // InternalCls.g:3586:1: ( rule__AssociationProperties__Group_2_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCls.g:3586:2: rule__AssociationProperties__Group_2_2__0
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
    // InternalCls.g:3602:1: rule__AssociationProperties__Group_2_2__0 : rule__AssociationProperties__Group_2_2__0__Impl rule__AssociationProperties__Group_2_2__1 ;
    public final void rule__AssociationProperties__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3606:1: ( rule__AssociationProperties__Group_2_2__0__Impl rule__AssociationProperties__Group_2_2__1 )
            // InternalCls.g:3607:2: rule__AssociationProperties__Group_2_2__0__Impl rule__AssociationProperties__Group_2_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCls.g:3614:1: rule__AssociationProperties__Group_2_2__0__Impl : ( '|' ) ;
    public final void rule__AssociationProperties__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3618:1: ( ( '|' ) )
            // InternalCls.g:3619:1: ( '|' )
            {
            // InternalCls.g:3619:1: ( '|' )
            // InternalCls.g:3620:1: '|'
            {
             before(grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_2_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCls.g:3633:1: rule__AssociationProperties__Group_2_2__1 : rule__AssociationProperties__Group_2_2__1__Impl rule__AssociationProperties__Group_2_2__2 ;
    public final void rule__AssociationProperties__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3637:1: ( rule__AssociationProperties__Group_2_2__1__Impl rule__AssociationProperties__Group_2_2__2 )
            // InternalCls.g:3638:2: rule__AssociationProperties__Group_2_2__1__Impl rule__AssociationProperties__Group_2_2__2
            {
            pushFollow(FOLLOW_35);
            rule__AssociationProperties__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_2_2__2();

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
    // InternalCls.g:3645:1: rule__AssociationProperties__Group_2_2__1__Impl : ( ( rule__AssociationProperties__NameAssignment_2_2_1 ) ) ;
    public final void rule__AssociationProperties__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3649:1: ( ( ( rule__AssociationProperties__NameAssignment_2_2_1 ) ) )
            // InternalCls.g:3650:1: ( ( rule__AssociationProperties__NameAssignment_2_2_1 ) )
            {
            // InternalCls.g:3650:1: ( ( rule__AssociationProperties__NameAssignment_2_2_1 ) )
            // InternalCls.g:3651:1: ( rule__AssociationProperties__NameAssignment_2_2_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getNameAssignment_2_2_1()); 
            // InternalCls.g:3652:1: ( rule__AssociationProperties__NameAssignment_2_2_1 )
            // InternalCls.g:3652:2: rule__AssociationProperties__NameAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__NameAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertiesAccess().getNameAssignment_2_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AssociationProperties__Group_2_2__2"
    // InternalCls.g:3662:1: rule__AssociationProperties__Group_2_2__2 : rule__AssociationProperties__Group_2_2__2__Impl ;
    public final void rule__AssociationProperties__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3666:1: ( rule__AssociationProperties__Group_2_2__2__Impl )
            // InternalCls.g:3667:2: rule__AssociationProperties__Group_2_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_2_2__2__Impl();

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
    // $ANTLR end "rule__AssociationProperties__Group_2_2__2"


    // $ANTLR start "rule__AssociationProperties__Group_2_2__2__Impl"
    // InternalCls.g:3673:1: rule__AssociationProperties__Group_2_2__2__Impl : ( ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_2 )? ) ;
    public final void rule__AssociationProperties__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3677:1: ( ( ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_2 )? ) )
            // InternalCls.g:3678:1: ( ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_2 )? )
            {
            // InternalCls.g:3678:1: ( ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_2 )? )
            // InternalCls.g:3679:1: ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_2 )?
            {
             before(grammarAccess.getAssociationPropertiesAccess().getReadingDirectionAssignment_2_2_2()); 
            // InternalCls.g:3680:1: ( rule__AssociationProperties__ReadingDirectionAssignment_2_2_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=16 && LA40_0<=17)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCls.g:3680:2: rule__AssociationProperties__ReadingDirectionAssignment_2_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationProperties__ReadingDirectionAssignment_2_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationPropertiesAccess().getReadingDirectionAssignment_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_2_2__2__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalCls.g:3696:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3700:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalCls.g:3701:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalCls.g:3708:1: rule__Cardinality__Group__0__Impl : ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3712:1: ( ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) )
            // InternalCls.g:3713:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            {
            // InternalCls.g:3713:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            // InternalCls.g:3714:1: ( rule__Cardinality__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0()); 
            // InternalCls.g:3715:1: ( rule__Cardinality__LowerBoundAssignment_0 )
            // InternalCls.g:3715:2: rule__Cardinality__LowerBoundAssignment_0
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
    // InternalCls.g:3725:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3729:1: ( rule__Cardinality__Group__1__Impl )
            // InternalCls.g:3730:2: rule__Cardinality__Group__1__Impl
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
    // InternalCls.g:3736:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Group_1__0 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3740:1: ( ( ( rule__Cardinality__Group_1__0 )? ) )
            // InternalCls.g:3741:1: ( ( rule__Cardinality__Group_1__0 )? )
            {
            // InternalCls.g:3741:1: ( ( rule__Cardinality__Group_1__0 )? )
            // InternalCls.g:3742:1: ( rule__Cardinality__Group_1__0 )?
            {
             before(grammarAccess.getCardinalityAccess().getGroup_1()); 
            // InternalCls.g:3743:1: ( rule__Cardinality__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCls.g:3743:2: rule__Cardinality__Group_1__0
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
    // InternalCls.g:3757:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3761:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // InternalCls.g:3762:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalCls.g:3769:1: rule__Cardinality__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3773:1: ( ( '..' ) )
            // InternalCls.g:3774:1: ( '..' )
            {
            // InternalCls.g:3774:1: ( '..' )
            // InternalCls.g:3775:1: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCls.g:3788:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3792:1: ( rule__Cardinality__Group_1__1__Impl )
            // InternalCls.g:3793:2: rule__Cardinality__Group_1__1__Impl
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
    // InternalCls.g:3799:1: rule__Cardinality__Group_1__1__Impl : ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3803:1: ( ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) )
            // InternalCls.g:3804:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            {
            // InternalCls.g:3804:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            // InternalCls.g:3805:1: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1()); 
            // InternalCls.g:3806:1: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            // InternalCls.g:3806:2: rule__Cardinality__UpperBoundAssignment_1_1
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


    // $ANTLR start "rule__Comment__Group__0"
    // InternalCls.g:3820:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3824:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalCls.g:3825:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Comment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__1();

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
    // $ANTLR end "rule__Comment__Group__0"


    // $ANTLR start "rule__Comment__Group__0__Impl"
    // InternalCls.g:3832:1: rule__Comment__Group__0__Impl : ( 'note[' ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3836:1: ( ( 'note[' ) )
            // InternalCls.g:3837:1: ( 'note[' )
            {
            // InternalCls.g:3837:1: ( 'note[' )
            // InternalCls.g:3838:1: 'note['
            {
             before(grammarAccess.getCommentAccess().getNoteKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getNoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__0__Impl"


    // $ANTLR start "rule__Comment__Group__1"
    // InternalCls.g:3851:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl rule__Comment__Group__2 ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3855:1: ( rule__Comment__Group__1__Impl rule__Comment__Group__2 )
            // InternalCls.g:3856:2: rule__Comment__Group__1__Impl rule__Comment__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Comment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__2();

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
    // $ANTLR end "rule__Comment__Group__1"


    // $ANTLR start "rule__Comment__Group__1__Impl"
    // InternalCls.g:3863:1: rule__Comment__Group__1__Impl : ( ( rule__Comment__DescriptionAssignment_1 ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3867:1: ( ( ( rule__Comment__DescriptionAssignment_1 ) ) )
            // InternalCls.g:3868:1: ( ( rule__Comment__DescriptionAssignment_1 ) )
            {
            // InternalCls.g:3868:1: ( ( rule__Comment__DescriptionAssignment_1 ) )
            // InternalCls.g:3869:1: ( rule__Comment__DescriptionAssignment_1 )
            {
             before(grammarAccess.getCommentAccess().getDescriptionAssignment_1()); 
            // InternalCls.g:3870:1: ( rule__Comment__DescriptionAssignment_1 )
            // InternalCls.g:3870:2: rule__Comment__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comment__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__1__Impl"


    // $ANTLR start "rule__Comment__Group__2"
    // InternalCls.g:3880:1: rule__Comment__Group__2 : rule__Comment__Group__2__Impl ;
    public final void rule__Comment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3884:1: ( rule__Comment__Group__2__Impl )
            // InternalCls.g:3885:2: rule__Comment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__2__Impl();

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
    // $ANTLR end "rule__Comment__Group__2"


    // $ANTLR start "rule__Comment__Group__2__Impl"
    // InternalCls.g:3891:1: rule__Comment__Group__2__Impl : ( ']' ) ;
    public final void rule__Comment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3895:1: ( ( ']' ) )
            // InternalCls.g:3896:1: ( ']' )
            {
            // InternalCls.g:3896:1: ( ']' )
            // InternalCls.g:3897:1: ']'
            {
             before(grammarAccess.getCommentAccess().getRightSquareBracketKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__2__Impl"


    // $ANTLR start "rule__ClassDiagram__PackageImportsAssignment_2"
    // InternalCls.g:3917:1: rule__ClassDiagram__PackageImportsAssignment_2 : ( rulePackageImport ) ;
    public final void rule__ClassDiagram__PackageImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3921:1: ( ( rulePackageImport ) )
            // InternalCls.g:3922:1: ( rulePackageImport )
            {
            // InternalCls.g:3922:1: ( rulePackageImport )
            // InternalCls.g:3923:1: rulePackageImport
            {
             before(grammarAccess.getClassDiagramAccess().getPackageImportsPackageImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePackageImport();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getPackageImportsPackageImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__PackageImportsAssignment_2"


    // $ANTLR start "rule__ClassDiagram__ClassifiersAssignment_3"
    // InternalCls.g:3932:1: rule__ClassDiagram__ClassifiersAssignment_3 : ( ruleClassifier ) ;
    public final void rule__ClassDiagram__ClassifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3936:1: ( ( ruleClassifier ) )
            // InternalCls.g:3937:1: ( ruleClassifier )
            {
            // InternalCls.g:3937:1: ( ruleClassifier )
            // InternalCls.g:3938:1: ruleClassifier
            {
             before(grammarAccess.getClassDiagramAccess().getClassifiersClassifierParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifier();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getClassifiersClassifierParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__ClassifiersAssignment_3"


    // $ANTLR start "rule__ClassDiagram__ConnectorsAssignment_4"
    // InternalCls.g:3947:1: rule__ClassDiagram__ConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__ClassDiagram__ConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3951:1: ( ( ruleConnector ) )
            // InternalCls.g:3952:1: ( ruleConnector )
            {
            // InternalCls.g:3952:1: ( ruleConnector )
            // InternalCls.g:3953:1: ruleConnector
            {
             before(grammarAccess.getClassDiagramAccess().getConnectorsConnectorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getConnectorsConnectorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__ConnectorsAssignment_4"


    // $ANTLR start "rule__PackageImport__PackageAssignment_1"
    // InternalCls.g:3962:1: rule__PackageImport__PackageAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__PackageImport__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3966:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:3967:1: ( ( ruleFQN ) )
            {
            // InternalCls.g:3967:1: ( ( ruleFQN ) )
            // InternalCls.g:3968:1: ( ruleFQN )
            {
             before(grammarAccess.getPackageImportAccess().getPackagePackageCrossReference_1_0()); 
            // InternalCls.g:3969:1: ( ruleFQN )
            // InternalCls.g:3970:1: ruleFQN
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
    // InternalCls.g:3981:1: rule__Class__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3985:1: ( ( ruleVisibility ) )
            // InternalCls.g:3986:1: ( ruleVisibility )
            {
            // InternalCls.g:3986:1: ( ruleVisibility )
            // InternalCls.g:3987:1: ruleVisibility
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
    // InternalCls.g:3996:1: rule__Class__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4000:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4001:1: ( ( 'abstract' ) )
            {
            // InternalCls.g:4001:1: ( ( 'abstract' ) )
            // InternalCls.g:4002:1: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4003:1: ( 'abstract' )
            // InternalCls.g:4004:1: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCls.g:4019:1: rule__Class__LongNameAssignment_3_0 : ( ( rule__Class__LongNameAlternatives_3_0_0 ) ) ;
    public final void rule__Class__LongNameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4023:1: ( ( ( rule__Class__LongNameAlternatives_3_0_0 ) ) )
            // InternalCls.g:4024:1: ( ( rule__Class__LongNameAlternatives_3_0_0 ) )
            {
            // InternalCls.g:4024:1: ( ( rule__Class__LongNameAlternatives_3_0_0 ) )
            // InternalCls.g:4025:1: ( rule__Class__LongNameAlternatives_3_0_0 )
            {
             before(grammarAccess.getClassAccess().getLongNameAlternatives_3_0_0()); 
            // InternalCls.g:4026:1: ( rule__Class__LongNameAlternatives_3_0_0 )
            // InternalCls.g:4026:2: rule__Class__LongNameAlternatives_3_0_0
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
    // InternalCls.g:4035:1: rule__Class__ReferencedElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ReferencedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4039:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4040:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4040:1: ( ( RULE_ID ) )
            // InternalCls.g:4041:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getReferencedElementClassCrossReference_4_0()); 
            // InternalCls.g:4042:1: ( RULE_ID )
            // InternalCls.g:4043:1: RULE_ID
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
    // InternalCls.g:4054:1: rule__Class__MembersAssignment_6 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4058:1: ( ( ruleMember ) )
            // InternalCls.g:4059:1: ( ruleMember )
            {
            // InternalCls.g:4059:1: ( ruleMember )
            // InternalCls.g:4060:1: ruleMember
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
    // InternalCls.g:4069:1: rule__Interface__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Interface__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4073:1: ( ( ruleVisibility ) )
            // InternalCls.g:4074:1: ( ruleVisibility )
            {
            // InternalCls.g:4074:1: ( ruleVisibility )
            // InternalCls.g:4075:1: ruleVisibility
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
    // InternalCls.g:4084:1: rule__Interface__LongNameAssignment_2_0 : ( ( rule__Interface__LongNameAlternatives_2_0_0 ) ) ;
    public final void rule__Interface__LongNameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4088:1: ( ( ( rule__Interface__LongNameAlternatives_2_0_0 ) ) )
            // InternalCls.g:4089:1: ( ( rule__Interface__LongNameAlternatives_2_0_0 ) )
            {
            // InternalCls.g:4089:1: ( ( rule__Interface__LongNameAlternatives_2_0_0 ) )
            // InternalCls.g:4090:1: ( rule__Interface__LongNameAlternatives_2_0_0 )
            {
             before(grammarAccess.getInterfaceAccess().getLongNameAlternatives_2_0_0()); 
            // InternalCls.g:4091:1: ( rule__Interface__LongNameAlternatives_2_0_0 )
            // InternalCls.g:4091:2: rule__Interface__LongNameAlternatives_2_0_0
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
    // InternalCls.g:4100:1: rule__Interface__ReferencedElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__ReferencedElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4104:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4105:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4105:1: ( ( RULE_ID ) )
            // InternalCls.g:4106:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceCrossReference_3_0()); 
            // InternalCls.g:4107:1: ( RULE_ID )
            // InternalCls.g:4108:1: RULE_ID
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
    // InternalCls.g:4119:1: rule__Interface__MembersAssignment_5 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4123:1: ( ( ruleMember ) )
            // InternalCls.g:4124:1: ( ruleMember )
            {
            // InternalCls.g:4124:1: ( ruleMember )
            // InternalCls.g:4125:1: ruleMember
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


    // $ANTLR start "rule__ClassifierReference__TypeAssignment"
    // InternalCls.g:4134:1: rule__ClassifierReference__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ClassifierReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4138:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4139:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4139:1: ( ( RULE_ID ) )
            // InternalCls.g:4140:1: ( RULE_ID )
            {
             before(grammarAccess.getClassifierReferenceAccess().getTypeClassifierCrossReference_0()); 
            // InternalCls.g:4141:1: ( RULE_ID )
            // InternalCls.g:4142:1: RULE_ID
            {
             before(grammarAccess.getClassifierReferenceAccess().getTypeClassifierIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassifierReferenceAccess().getTypeClassifierIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getClassifierReferenceAccess().getTypeClassifierCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierReference__TypeAssignment"


    // $ANTLR start "rule__DataTypeReference__TypeAssignment"
    // InternalCls.g:4153:1: rule__DataTypeReference__TypeAssignment : ( rulePrimitiveType ) ;
    public final void rule__DataTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4157:1: ( ( rulePrimitiveType ) )
            // InternalCls.g:4158:1: ( rulePrimitiveType )
            {
            // InternalCls.g:4158:1: ( rulePrimitiveType )
            // InternalCls.g:4159:1: rulePrimitiveType
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


    // $ANTLR start "rule__Attribute__VisibilityAssignment_1"
    // InternalCls.g:4168:1: rule__Attribute__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4172:1: ( ( ruleVisibility ) )
            // InternalCls.g:4173:1: ( ruleVisibility )
            {
            // InternalCls.g:4173:1: ( ruleVisibility )
            // InternalCls.g:4174:1: ruleVisibility
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
    // InternalCls.g:4183:1: rule__Attribute__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4187:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4188:1: ( ( 'static' ) )
            {
            // InternalCls.g:4188:1: ( ( 'static' ) )
            // InternalCls.g:4189:1: ( 'static' )
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4190:1: ( 'static' )
            // InternalCls.g:4191:1: 'static'
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCls.g:4206:1: rule__Attribute__FinalAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Attribute__FinalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4210:1: ( ( ( 'final' ) ) )
            // InternalCls.g:4211:1: ( ( 'final' ) )
            {
            // InternalCls.g:4211:1: ( ( 'final' ) )
            // InternalCls.g:4212:1: ( 'final' )
            {
             before(grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0()); 
            // InternalCls.g:4213:1: ( 'final' )
            // InternalCls.g:4214:1: 'final'
            {
             before(grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCls.g:4229:1: rule__Attribute__ReferencedElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__ReferencedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4233:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4234:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4234:1: ( ( RULE_ID ) )
            // InternalCls.g:4235:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getReferencedElementPropertyCrossReference_4_0()); 
            // InternalCls.g:4236:1: ( RULE_ID )
            // InternalCls.g:4237:1: RULE_ID
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
    // InternalCls.g:4248:1: rule__Attribute__TypeAssignment_6 : ( ruleTypeReference ) ;
    public final void rule__Attribute__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4252:1: ( ( ruleTypeReference ) )
            // InternalCls.g:4253:1: ( ruleTypeReference )
            {
            // InternalCls.g:4253:1: ( ruleTypeReference )
            // InternalCls.g:4254:1: ruleTypeReference
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
    // InternalCls.g:4263:1: rule__Method__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Method__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4267:1: ( ( ruleVisibility ) )
            // InternalCls.g:4268:1: ( ruleVisibility )
            {
            // InternalCls.g:4268:1: ( ruleVisibility )
            // InternalCls.g:4269:1: ruleVisibility
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
    // InternalCls.g:4278:1: rule__Method__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Method__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4282:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4283:1: ( ( 'abstract' ) )
            {
            // InternalCls.g:4283:1: ( ( 'abstract' ) )
            // InternalCls.g:4284:1: ( 'abstract' )
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4285:1: ( 'abstract' )
            // InternalCls.g:4286:1: 'abstract'
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCls.g:4301:1: rule__Method__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Method__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4305:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4306:1: ( ( 'static' ) )
            {
            // InternalCls.g:4306:1: ( ( 'static' ) )
            // InternalCls.g:4307:1: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4308:1: ( 'static' )
            // InternalCls.g:4309:1: 'static'
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCls.g:4324:1: rule__Method__FinalAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Method__FinalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4328:1: ( ( ( 'final' ) ) )
            // InternalCls.g:4329:1: ( ( 'final' ) )
            {
            // InternalCls.g:4329:1: ( ( 'final' ) )
            // InternalCls.g:4330:1: ( 'final' )
            {
             before(grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0()); 
            // InternalCls.g:4331:1: ( 'final' )
            // InternalCls.g:4332:1: 'final'
            {
             before(grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCls.g:4347:1: rule__Method__ReferencedElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Method__ReferencedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4351:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4352:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4352:1: ( ( RULE_ID ) )
            // InternalCls.g:4353:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getReferencedElementOperationCrossReference_4_0()); 
            // InternalCls.g:4354:1: ( RULE_ID )
            // InternalCls.g:4355:1: RULE_ID
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
    // InternalCls.g:4366:1: rule__Method__ParametersAssignment_6_0 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4370:1: ( ( ruleParameter ) )
            // InternalCls.g:4371:1: ( ruleParameter )
            {
            // InternalCls.g:4371:1: ( ruleParameter )
            // InternalCls.g:4372:1: ruleParameter
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
    // InternalCls.g:4381:1: rule__Method__ParametersAssignment_6_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4385:1: ( ( ruleParameter ) )
            // InternalCls.g:4386:1: ( ruleParameter )
            {
            // InternalCls.g:4386:1: ( ruleParameter )
            // InternalCls.g:4387:1: ruleParameter
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
    // InternalCls.g:4396:1: rule__Method__TypeAssignment_8_1 : ( ruleTypeReference ) ;
    public final void rule__Method__TypeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4400:1: ( ( ruleTypeReference ) )
            // InternalCls.g:4401:1: ( ruleTypeReference )
            {
            // InternalCls.g:4401:1: ( ruleTypeReference )
            // InternalCls.g:4402:1: ruleTypeReference
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
    // InternalCls.g:4411:1: rule__Parameter__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Parameter__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4415:1: ( ( ruleVisibility ) )
            // InternalCls.g:4416:1: ( ruleVisibility )
            {
            // InternalCls.g:4416:1: ( ruleVisibility )
            // InternalCls.g:4417:1: ruleVisibility
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
    // InternalCls.g:4426:1: rule__Parameter__StaticAssignment_1 : ( ( 'static' ) ) ;
    public final void rule__Parameter__StaticAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4430:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4431:1: ( ( 'static' ) )
            {
            // InternalCls.g:4431:1: ( ( 'static' ) )
            // InternalCls.g:4432:1: ( 'static' )
            {
             before(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 
            // InternalCls.g:4433:1: ( 'static' )
            // InternalCls.g:4434:1: 'static'
            {
             before(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCls.g:4449:1: rule__Parameter__FinalAssignment_2 : ( ( 'final' ) ) ;
    public final void rule__Parameter__FinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4453:1: ( ( ( 'final' ) ) )
            // InternalCls.g:4454:1: ( ( 'final' ) )
            {
            // InternalCls.g:4454:1: ( ( 'final' ) )
            // InternalCls.g:4455:1: ( 'final' )
            {
             before(grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0()); 
            // InternalCls.g:4456:1: ( 'final' )
            // InternalCls.g:4457:1: 'final'
            {
             before(grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCls.g:4472:1: rule__Parameter__ReferencedElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__ReferencedElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4476:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:4477:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:4477:1: ( ( RULE_ID ) )
            // InternalCls.g:4478:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getReferencedElementParameterCrossReference_3_0()); 
            // InternalCls.g:4479:1: ( RULE_ID )
            // InternalCls.g:4480:1: RULE_ID
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
    // InternalCls.g:4491:1: rule__Parameter__TypeAssignment_5 : ( ruleTypeReference ) ;
    public final void rule__Parameter__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4495:1: ( ( ruleTypeReference ) )
            // InternalCls.g:4496:1: ( ruleTypeReference )
            {
            // InternalCls.g:4496:1: ( ruleTypeReference )
            // InternalCls.g:4497:1: ruleTypeReference
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
    // InternalCls.g:4506:1: rule__Generalization__LeftAssignment_0 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Generalization__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4510:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4511:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4511:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4512:1: ruleClassifierAssociationEnd
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
    // InternalCls.g:4521:1: rule__Generalization__RightAssignment_2 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Generalization__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4525:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4526:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4526:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4527:1: ruleClassifierAssociationEnd
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
    // InternalCls.g:4536:1: rule__Implementation__LeftAssignment_0 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Implementation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4540:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4541:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4541:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4542:1: ruleClassifierAssociationEnd
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
    // InternalCls.g:4551:1: rule__Implementation__RightAssignment_2 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Implementation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4555:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4556:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4556:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4557:1: ruleClassifierAssociationEnd
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
    // InternalCls.g:4566:1: rule__CommentLink__LeftAssignment_0 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__CommentLink__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4570:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4571:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4571:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4572:1: ruleClassifierAssociationEnd
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
    // InternalCls.g:4581:1: rule__CommentLink__CommentAssignment_2 : ( ruleComment ) ;
    public final void rule__CommentLink__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4585:1: ( ( ruleComment ) )
            // InternalCls.g:4586:1: ( ruleComment )
            {
            // InternalCls.g:4586:1: ( ruleComment )
            // InternalCls.g:4587:1: ruleComment
            {
             before(grammarAccess.getCommentLinkAccess().getCommentCommentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentLinkAccess().getCommentCommentParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Association__LeftAssignment_0"
    // InternalCls.g:4596:1: rule__Association__LeftAssignment_0 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Association__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4600:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4601:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4601:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4602:1: ruleClassifierAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getLeftClassifierAssociationEndParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getLeftClassifierAssociationEndParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__LeftAssignment_0"


    // $ANTLR start "rule__Association__RightAssignment_2"
    // InternalCls.g:4611:1: rule__Association__RightAssignment_2 : ( ruleClassifierAssociationEnd ) ;
    public final void rule__Association__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4615:1: ( ( ruleClassifierAssociationEnd ) )
            // InternalCls.g:4616:1: ( ruleClassifierAssociationEnd )
            {
            // InternalCls.g:4616:1: ( ruleClassifierAssociationEnd )
            // InternalCls.g:4617:1: ruleClassifierAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getRightClassifierAssociationEndParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifierAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRightClassifierAssociationEndParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__RightAssignment_2"


    // $ANTLR start "rule__Association__PropertiesAssignment_3"
    // InternalCls.g:4626:1: rule__Association__PropertiesAssignment_3 : ( ruleAssociationProperties ) ;
    public final void rule__Association__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4630:1: ( ( ruleAssociationProperties ) )
            // InternalCls.g:4631:1: ( ruleAssociationProperties )
            {
            // InternalCls.g:4631:1: ( ruleAssociationProperties )
            // InternalCls.g:4632:1: ruleAssociationProperties
            {
             before(grammarAccess.getAssociationAccess().getPropertiesAssociationPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationProperties();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getPropertiesAssociationPropertiesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__PropertiesAssignment_3"


    // $ANTLR start "rule__Association__CommentAssignment_4"
    // InternalCls.g:4641:1: rule__Association__CommentAssignment_4 : ( ruleComment ) ;
    public final void rule__Association__CommentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4645:1: ( ( ruleComment ) )
            // InternalCls.g:4646:1: ( ruleComment )
            {
            // InternalCls.g:4646:1: ( ruleComment )
            // InternalCls.g:4647:1: ruleComment
            {
             before(grammarAccess.getAssociationAccess().getCommentCommentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getCommentCommentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__CommentAssignment_4"


    // $ANTLR start "rule__AssociationProperties__CardinalityLeftAssignment_1"
    // InternalCls.g:4656:1: rule__AssociationProperties__CardinalityLeftAssignment_1 : ( ruleCardinality ) ;
    public final void rule__AssociationProperties__CardinalityLeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4660:1: ( ( ruleCardinality ) )
            // InternalCls.g:4661:1: ( ruleCardinality )
            {
            // InternalCls.g:4661:1: ( ruleCardinality )
            // InternalCls.g:4662:1: ruleCardinality
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
    // InternalCls.g:4671:1: rule__AssociationProperties__CardinalityRightAssignment_2_1 : ( ruleCardinality ) ;
    public final void rule__AssociationProperties__CardinalityRightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4675:1: ( ( ruleCardinality ) )
            // InternalCls.g:4676:1: ( ruleCardinality )
            {
            // InternalCls.g:4676:1: ( ruleCardinality )
            // InternalCls.g:4677:1: ruleCardinality
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


    // $ANTLR start "rule__AssociationProperties__NameAssignment_2_2_1"
    // InternalCls.g:4686:1: rule__AssociationProperties__NameAssignment_2_2_1 : ( ( rule__AssociationProperties__NameAlternatives_2_2_1_0 ) ) ;
    public final void rule__AssociationProperties__NameAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4690:1: ( ( ( rule__AssociationProperties__NameAlternatives_2_2_1_0 ) ) )
            // InternalCls.g:4691:1: ( ( rule__AssociationProperties__NameAlternatives_2_2_1_0 ) )
            {
            // InternalCls.g:4691:1: ( ( rule__AssociationProperties__NameAlternatives_2_2_1_0 ) )
            // InternalCls.g:4692:1: ( rule__AssociationProperties__NameAlternatives_2_2_1_0 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getNameAlternatives_2_2_1_0()); 
            // InternalCls.g:4693:1: ( rule__AssociationProperties__NameAlternatives_2_2_1_0 )
            // InternalCls.g:4693:2: rule__AssociationProperties__NameAlternatives_2_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__NameAlternatives_2_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertiesAccess().getNameAlternatives_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__NameAssignment_2_2_1"


    // $ANTLR start "rule__AssociationProperties__ReadingDirectionAssignment_2_2_2"
    // InternalCls.g:4702:1: rule__AssociationProperties__ReadingDirectionAssignment_2_2_2 : ( ruleReadingDirection ) ;
    public final void rule__AssociationProperties__ReadingDirectionAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4706:1: ( ( ruleReadingDirection ) )
            // InternalCls.g:4707:1: ( ruleReadingDirection )
            {
            // InternalCls.g:4707:1: ( ruleReadingDirection )
            // InternalCls.g:4708:1: ruleReadingDirection
            {
             before(grammarAccess.getAssociationPropertiesAccess().getReadingDirectionReadingDirectionEnumRuleCall_2_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReadingDirection();

            state._fsp--;

             after(grammarAccess.getAssociationPropertiesAccess().getReadingDirectionReadingDirectionEnumRuleCall_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__ReadingDirectionAssignment_2_2_2"


    // $ANTLR start "rule__Cardinality__LowerBoundAssignment_0"
    // InternalCls.g:4717:1: rule__Cardinality__LowerBoundAssignment_0 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4721:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:4722:1: ( ruleCardinalityBound )
            {
            // InternalCls.g:4722:1: ( ruleCardinalityBound )
            // InternalCls.g:4723:1: ruleCardinalityBound
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
    // InternalCls.g:4732:1: rule__Cardinality__UpperBoundAssignment_1_1 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__UpperBoundAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4736:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:4737:1: ( ruleCardinalityBound )
            {
            // InternalCls.g:4737:1: ( ruleCardinalityBound )
            // InternalCls.g:4738:1: ruleCardinalityBound
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


    // $ANTLR start "rule__Comment__DescriptionAssignment_1"
    // InternalCls.g:4747:1: rule__Comment__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Comment__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4751:1: ( ( RULE_STRING ) )
            // InternalCls.g:4752:1: ( RULE_STRING )
            {
            // InternalCls.g:4752:1: ( RULE_STRING )
            // InternalCls.g:4753:1: RULE_STRING
            {
             before(grammarAccess.getCommentAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__DescriptionAssignment_1"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\7\5\1\44\2\uffff";
    static final String dfa_3s = "\6\61\1\5\1\45\2\uffff";
    static final String dfa_4s = "\10\uffff\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\6\uffff\1\1\1\2\1\3\1\4\37\uffff\1\10\1\5\1\6",
            "\1\7\51\uffff\1\10\1\5\1\6",
            "\1\7\51\uffff\1\10\1\5\1\6",
            "\1\7\51\uffff\1\10\1\5\1\6",
            "\1\7\51\uffff\1\10\1\5\1\6",
            "\1\7\53\uffff\1\6",
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
            return "849:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00008008B000F020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000080088000F002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000080008000F000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000380020000F020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000380000000F022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000080088000F000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000300000000F020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007FC0020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000380000000F020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000300400000F020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000300000000F022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});

}