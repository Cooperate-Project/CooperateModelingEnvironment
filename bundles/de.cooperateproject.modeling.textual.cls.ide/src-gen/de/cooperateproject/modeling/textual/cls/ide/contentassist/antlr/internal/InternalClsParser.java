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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'string'", "'int'", "'double'", "'boolean'", "'char'", "'byte'", "'short'", "'long'", "'float'", "'asc'", "'agg'", "'com'", "'@startclass'", "'@endclass'", "'rootPackage'", "'package'", "'{'", "'}'", "'import'", "'.'", "'class'", "'as'", "'interface'", "':'", "'('", "')'", "','", "'isa'", "'impl'", "'note'", "';'", "'['", "']'", "'|'", "'..'", "'abstract'", "'static'", "'final'", "'bi'", "'<'"
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
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


    // $ANTLR start "entryRuleRootPackage"
    // InternalCls.g:88:1: entryRuleRootPackage : ruleRootPackage EOF ;
    public final void entryRuleRootPackage() throws RecognitionException {
        try {
            // InternalCls.g:89:1: ( ruleRootPackage EOF )
            // InternalCls.g:90:1: ruleRootPackage EOF
            {
             before(grammarAccess.getRootPackageRule()); 
            pushFollow(FOLLOW_1);
            ruleRootPackage();

            state._fsp--;

             after(grammarAccess.getRootPackageRule()); 
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
    // $ANTLR end "entryRuleRootPackage"


    // $ANTLR start "ruleRootPackage"
    // InternalCls.g:97:1: ruleRootPackage : ( ( rule__RootPackage__Group__0 ) ) ;
    public final void ruleRootPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:101:2: ( ( ( rule__RootPackage__Group__0 ) ) )
            // InternalCls.g:102:1: ( ( rule__RootPackage__Group__0 ) )
            {
            // InternalCls.g:102:1: ( ( rule__RootPackage__Group__0 ) )
            // InternalCls.g:103:1: ( rule__RootPackage__Group__0 )
            {
             before(grammarAccess.getRootPackageAccess().getGroup()); 
            // InternalCls.g:104:1: ( rule__RootPackage__Group__0 )
            // InternalCls.g:104:2: rule__RootPackage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootPackage"


    // $ANTLR start "entryRulePackage"
    // InternalCls.g:116:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalCls.g:117:1: ( rulePackage EOF )
            // InternalCls.g:118:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalCls.g:125:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:129:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalCls.g:130:1: ( ( rule__Package__Group__0 ) )
            {
            // InternalCls.g:130:1: ( ( rule__Package__Group__0 ) )
            // InternalCls.g:131:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalCls.g:132:1: ( rule__Package__Group__0 )
            // InternalCls.g:132:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackageImport"
    // InternalCls.g:144:1: entryRulePackageImport : rulePackageImport EOF ;
    public final void entryRulePackageImport() throws RecognitionException {
        try {
            // InternalCls.g:145:1: ( rulePackageImport EOF )
            // InternalCls.g:146:1: rulePackageImport EOF
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
    // InternalCls.g:153:1: rulePackageImport : ( ( rule__PackageImport__Group__0 ) ) ;
    public final void rulePackageImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:157:2: ( ( ( rule__PackageImport__Group__0 ) ) )
            // InternalCls.g:158:1: ( ( rule__PackageImport__Group__0 ) )
            {
            // InternalCls.g:158:1: ( ( rule__PackageImport__Group__0 ) )
            // InternalCls.g:159:1: ( rule__PackageImport__Group__0 )
            {
             before(grammarAccess.getPackageImportAccess().getGroup()); 
            // InternalCls.g:160:1: ( rule__PackageImport__Group__0 )
            // InternalCls.g:160:2: rule__PackageImport__Group__0
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


    // $ANTLR start "entryRuleNameString"
    // InternalCls.g:172:1: entryRuleNameString : ruleNameString EOF ;
    public final void entryRuleNameString() throws RecognitionException {
        try {
            // InternalCls.g:173:1: ( ruleNameString EOF )
            // InternalCls.g:174:1: ruleNameString EOF
            {
             before(grammarAccess.getNameStringRule()); 
            pushFollow(FOLLOW_1);
            ruleNameString();

            state._fsp--;

             after(grammarAccess.getNameStringRule()); 
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
    // $ANTLR end "entryRuleNameString"


    // $ANTLR start "ruleNameString"
    // InternalCls.g:181:1: ruleNameString : ( RULE_STRING ) ;
    public final void ruleNameString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:185:2: ( ( RULE_STRING ) )
            // InternalCls.g:186:1: ( RULE_STRING )
            {
            // InternalCls.g:186:1: ( RULE_STRING )
            // InternalCls.g:187:1: RULE_STRING
            {
             before(grammarAccess.getNameStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNameStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameString"


    // $ANTLR start "entryRuleFQN"
    // InternalCls.g:200:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalCls.g:201:1: ( ruleFQN EOF )
            // InternalCls.g:202:1: ruleFQN EOF
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
    // InternalCls.g:209:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:213:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalCls.g:214:1: ( ( rule__FQN__Group__0 ) )
            {
            // InternalCls.g:214:1: ( ( rule__FQN__Group__0 ) )
            // InternalCls.g:215:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalCls.g:216:1: ( rule__FQN__Group__0 )
            // InternalCls.g:216:2: rule__FQN__Group__0
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
    // InternalCls.g:228:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // InternalCls.g:229:1: ( ruleClassifier EOF )
            // InternalCls.g:230:1: ruleClassifier EOF
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
    // InternalCls.g:237:1: ruleClassifier : ( ( rule__Classifier__Alternatives ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:241:2: ( ( ( rule__Classifier__Alternatives ) ) )
            // InternalCls.g:242:1: ( ( rule__Classifier__Alternatives ) )
            {
            // InternalCls.g:242:1: ( ( rule__Classifier__Alternatives ) )
            // InternalCls.g:243:1: ( rule__Classifier__Alternatives )
            {
             before(grammarAccess.getClassifierAccess().getAlternatives()); 
            // InternalCls.g:244:1: ( rule__Classifier__Alternatives )
            // InternalCls.g:244:2: rule__Classifier__Alternatives
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
    // InternalCls.g:256:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalCls.g:257:1: ( ruleClass EOF )
            // InternalCls.g:258:1: ruleClass EOF
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
    // InternalCls.g:265:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:269:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalCls.g:270:1: ( ( rule__Class__Group__0 ) )
            {
            // InternalCls.g:270:1: ( ( rule__Class__Group__0 ) )
            // InternalCls.g:271:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalCls.g:272:1: ( rule__Class__Group__0 )
            // InternalCls.g:272:2: rule__Class__Group__0
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
    // InternalCls.g:284:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalCls.g:285:1: ( ruleInterface EOF )
            // InternalCls.g:286:1: ruleInterface EOF
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
    // InternalCls.g:293:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:297:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalCls.g:298:1: ( ( rule__Interface__Group__0 ) )
            {
            // InternalCls.g:298:1: ( ( rule__Interface__Group__0 ) )
            // InternalCls.g:299:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalCls.g:300:1: ( rule__Interface__Group__0 )
            // InternalCls.g:300:2: rule__Interface__Group__0
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
    // InternalCls.g:312:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalCls.g:313:1: ( ruleTypeReference EOF )
            // InternalCls.g:314:1: ruleTypeReference EOF
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
    // InternalCls.g:321:1: ruleTypeReference : ( ( rule__TypeReference__Alternatives ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:325:2: ( ( ( rule__TypeReference__Alternatives ) ) )
            // InternalCls.g:326:1: ( ( rule__TypeReference__Alternatives ) )
            {
            // InternalCls.g:326:1: ( ( rule__TypeReference__Alternatives ) )
            // InternalCls.g:327:1: ( rule__TypeReference__Alternatives )
            {
             before(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            // InternalCls.g:328:1: ( rule__TypeReference__Alternatives )
            // InternalCls.g:328:2: rule__TypeReference__Alternatives
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
    // InternalCls.g:340:1: entryRuleDataTypeReference : ruleDataTypeReference EOF ;
    public final void entryRuleDataTypeReference() throws RecognitionException {
        try {
            // InternalCls.g:341:1: ( ruleDataTypeReference EOF )
            // InternalCls.g:342:1: ruleDataTypeReference EOF
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
    // InternalCls.g:349:1: ruleDataTypeReference : ( ( rule__DataTypeReference__TypeAssignment ) ) ;
    public final void ruleDataTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:353:2: ( ( ( rule__DataTypeReference__TypeAssignment ) ) )
            // InternalCls.g:354:1: ( ( rule__DataTypeReference__TypeAssignment ) )
            {
            // InternalCls.g:354:1: ( ( rule__DataTypeReference__TypeAssignment ) )
            // InternalCls.g:355:1: ( rule__DataTypeReference__TypeAssignment )
            {
             before(grammarAccess.getDataTypeReferenceAccess().getTypeAssignment()); 
            // InternalCls.g:356:1: ( rule__DataTypeReference__TypeAssignment )
            // InternalCls.g:356:2: rule__DataTypeReference__TypeAssignment
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
    // InternalCls.g:368:1: entryRuleUMLTypeReference : ruleUMLTypeReference EOF ;
    public final void entryRuleUMLTypeReference() throws RecognitionException {
        try {
            // InternalCls.g:369:1: ( ruleUMLTypeReference EOF )
            // InternalCls.g:370:1: ruleUMLTypeReference EOF
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
    // InternalCls.g:377:1: ruleUMLTypeReference : ( ( rule__UMLTypeReference__TypeAssignment ) ) ;
    public final void ruleUMLTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:381:2: ( ( ( rule__UMLTypeReference__TypeAssignment ) ) )
            // InternalCls.g:382:1: ( ( rule__UMLTypeReference__TypeAssignment ) )
            {
            // InternalCls.g:382:1: ( ( rule__UMLTypeReference__TypeAssignment ) )
            // InternalCls.g:383:1: ( rule__UMLTypeReference__TypeAssignment )
            {
             before(grammarAccess.getUMLTypeReferenceAccess().getTypeAssignment()); 
            // InternalCls.g:384:1: ( rule__UMLTypeReference__TypeAssignment )
            // InternalCls.g:384:2: rule__UMLTypeReference__TypeAssignment
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
    // InternalCls.g:396:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalCls.g:397:1: ( ruleMember EOF )
            // InternalCls.g:398:1: ruleMember EOF
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
    // InternalCls.g:405:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:409:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalCls.g:410:1: ( ( rule__Member__Alternatives ) )
            {
            // InternalCls.g:410:1: ( ( rule__Member__Alternatives ) )
            // InternalCls.g:411:1: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // InternalCls.g:412:1: ( rule__Member__Alternatives )
            // InternalCls.g:412:2: rule__Member__Alternatives
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
    // InternalCls.g:424:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalCls.g:425:1: ( ruleAttribute EOF )
            // InternalCls.g:426:1: ruleAttribute EOF
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
    // InternalCls.g:433:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:437:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalCls.g:438:1: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalCls.g:438:1: ( ( rule__Attribute__Group__0 ) )
            // InternalCls.g:439:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalCls.g:440:1: ( rule__Attribute__Group__0 )
            // InternalCls.g:440:2: rule__Attribute__Group__0
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
    // InternalCls.g:452:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalCls.g:453:1: ( ruleMethod EOF )
            // InternalCls.g:454:1: ruleMethod EOF
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
    // InternalCls.g:461:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:465:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalCls.g:466:1: ( ( rule__Method__Group__0 ) )
            {
            // InternalCls.g:466:1: ( ( rule__Method__Group__0 ) )
            // InternalCls.g:467:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalCls.g:468:1: ( rule__Method__Group__0 )
            // InternalCls.g:468:2: rule__Method__Group__0
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
    // InternalCls.g:480:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalCls.g:481:1: ( ruleParameter EOF )
            // InternalCls.g:482:1: ruleParameter EOF
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
    // InternalCls.g:489:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:493:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalCls.g:494:1: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalCls.g:494:1: ( ( rule__Parameter__Group__0 ) )
            // InternalCls.g:495:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalCls.g:496:1: ( rule__Parameter__Group__0 )
            // InternalCls.g:496:2: rule__Parameter__Group__0
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
    // InternalCls.g:508:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalCls.g:509:1: ( ruleConnector EOF )
            // InternalCls.g:510:1: ruleConnector EOF
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
    // InternalCls.g:517:1: ruleConnector : ( ( rule__Connector__Alternatives ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:521:2: ( ( ( rule__Connector__Alternatives ) ) )
            // InternalCls.g:522:1: ( ( rule__Connector__Alternatives ) )
            {
            // InternalCls.g:522:1: ( ( rule__Connector__Alternatives ) )
            // InternalCls.g:523:1: ( rule__Connector__Alternatives )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives()); 
            // InternalCls.g:524:1: ( rule__Connector__Alternatives )
            // InternalCls.g:524:2: rule__Connector__Alternatives
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


    // $ANTLR start "entryRuleGeneralization"
    // InternalCls.g:536:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalCls.g:537:1: ( ruleGeneralization EOF )
            // InternalCls.g:538:1: ruleGeneralization EOF
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
    // InternalCls.g:545:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:549:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalCls.g:550:1: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalCls.g:550:1: ( ( rule__Generalization__Group__0 ) )
            // InternalCls.g:551:1: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalCls.g:552:1: ( rule__Generalization__Group__0 )
            // InternalCls.g:552:2: rule__Generalization__Group__0
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
    // InternalCls.g:564:1: entryRuleImplementation : ruleImplementation EOF ;
    public final void entryRuleImplementation() throws RecognitionException {
        try {
            // InternalCls.g:565:1: ( ruleImplementation EOF )
            // InternalCls.g:566:1: ruleImplementation EOF
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
    // InternalCls.g:573:1: ruleImplementation : ( ( rule__Implementation__Group__0 ) ) ;
    public final void ruleImplementation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:577:2: ( ( ( rule__Implementation__Group__0 ) ) )
            // InternalCls.g:578:1: ( ( rule__Implementation__Group__0 ) )
            {
            // InternalCls.g:578:1: ( ( rule__Implementation__Group__0 ) )
            // InternalCls.g:579:1: ( rule__Implementation__Group__0 )
            {
             before(grammarAccess.getImplementationAccess().getGroup()); 
            // InternalCls.g:580:1: ( rule__Implementation__Group__0 )
            // InternalCls.g:580:2: rule__Implementation__Group__0
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
    // InternalCls.g:592:1: entryRuleCommentLink : ruleCommentLink EOF ;
    public final void entryRuleCommentLink() throws RecognitionException {
        try {
            // InternalCls.g:593:1: ( ruleCommentLink EOF )
            // InternalCls.g:594:1: ruleCommentLink EOF
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
    // InternalCls.g:601:1: ruleCommentLink : ( ( rule__CommentLink__Group__0 ) ) ;
    public final void ruleCommentLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:605:2: ( ( ( rule__CommentLink__Group__0 ) ) )
            // InternalCls.g:606:1: ( ( rule__CommentLink__Group__0 ) )
            {
            // InternalCls.g:606:1: ( ( rule__CommentLink__Group__0 ) )
            // InternalCls.g:607:1: ( rule__CommentLink__Group__0 )
            {
             before(grammarAccess.getCommentLinkAccess().getGroup()); 
            // InternalCls.g:608:1: ( rule__CommentLink__Group__0 )
            // InternalCls.g:608:2: rule__CommentLink__Group__0
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
    // InternalCls.g:620:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalCls.g:621:1: ( ruleAssociation EOF )
            // InternalCls.g:622:1: ruleAssociation EOF
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
    // InternalCls.g:629:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:633:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalCls.g:634:1: ( ( rule__Association__Group__0 ) )
            {
            // InternalCls.g:634:1: ( ( rule__Association__Group__0 ) )
            // InternalCls.g:635:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalCls.g:636:1: ( rule__Association__Group__0 )
            // InternalCls.g:636:2: rule__Association__Group__0
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
    // InternalCls.g:648:1: entryRuleMultiAssociation : ruleMultiAssociation EOF ;
    public final void entryRuleMultiAssociation() throws RecognitionException {
        try {
            // InternalCls.g:649:1: ( ruleMultiAssociation EOF )
            // InternalCls.g:650:1: ruleMultiAssociation EOF
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
    // InternalCls.g:657:1: ruleMultiAssociation : ( ( rule__MultiAssociation__Group__0 ) ) ;
    public final void ruleMultiAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:661:2: ( ( ( rule__MultiAssociation__Group__0 ) ) )
            // InternalCls.g:662:1: ( ( rule__MultiAssociation__Group__0 ) )
            {
            // InternalCls.g:662:1: ( ( rule__MultiAssociation__Group__0 ) )
            // InternalCls.g:663:1: ( rule__MultiAssociation__Group__0 )
            {
             before(grammarAccess.getMultiAssociationAccess().getGroup()); 
            // InternalCls.g:664:1: ( rule__MultiAssociation__Group__0 )
            // InternalCls.g:664:2: rule__MultiAssociation__Group__0
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
    // InternalCls.g:676:1: entryRuleMemberEnd : ruleMemberEnd EOF ;
    public final void entryRuleMemberEnd() throws RecognitionException {
        try {
            // InternalCls.g:677:1: ( ruleMemberEnd EOF )
            // InternalCls.g:678:1: ruleMemberEnd EOF
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
    // InternalCls.g:685:1: ruleMemberEnd : ( ( rule__MemberEnd__Group__0 ) ) ;
    public final void ruleMemberEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:689:2: ( ( ( rule__MemberEnd__Group__0 ) ) )
            // InternalCls.g:690:1: ( ( rule__MemberEnd__Group__0 ) )
            {
            // InternalCls.g:690:1: ( ( rule__MemberEnd__Group__0 ) )
            // InternalCls.g:691:1: ( rule__MemberEnd__Group__0 )
            {
             before(grammarAccess.getMemberEndAccess().getGroup()); 
            // InternalCls.g:692:1: ( rule__MemberEnd__Group__0 )
            // InternalCls.g:692:2: rule__MemberEnd__Group__0
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
    // InternalCls.g:704:1: entryRuleAssociationProperties : ruleAssociationProperties EOF ;
    public final void entryRuleAssociationProperties() throws RecognitionException {
        try {
            // InternalCls.g:705:1: ( ruleAssociationProperties EOF )
            // InternalCls.g:706:1: ruleAssociationProperties EOF
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
    // InternalCls.g:713:1: ruleAssociationProperties : ( ( rule__AssociationProperties__Group__0 ) ) ;
    public final void ruleAssociationProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:717:2: ( ( ( rule__AssociationProperties__Group__0 ) ) )
            // InternalCls.g:718:1: ( ( rule__AssociationProperties__Group__0 ) )
            {
            // InternalCls.g:718:1: ( ( rule__AssociationProperties__Group__0 ) )
            // InternalCls.g:719:1: ( rule__AssociationProperties__Group__0 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getGroup()); 
            // InternalCls.g:720:1: ( rule__AssociationProperties__Group__0 )
            // InternalCls.g:720:2: rule__AssociationProperties__Group__0
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
    // InternalCls.g:732:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalCls.g:733:1: ( ruleCardinality EOF )
            // InternalCls.g:734:1: ruleCardinality EOF
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
    // InternalCls.g:741:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:745:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalCls.g:746:1: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalCls.g:746:1: ( ( rule__Cardinality__Group__0 ) )
            // InternalCls.g:747:1: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalCls.g:748:1: ( rule__Cardinality__Group__0 )
            // InternalCls.g:748:2: rule__Cardinality__Group__0
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
    // InternalCls.g:760:1: entryRuleCommentBody : ruleCommentBody EOF ;
    public final void entryRuleCommentBody() throws RecognitionException {
        try {
            // InternalCls.g:761:1: ( ruleCommentBody EOF )
            // InternalCls.g:762:1: ruleCommentBody EOF
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
    // InternalCls.g:769:1: ruleCommentBody : ( RULE_STRING ) ;
    public final void ruleCommentBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:773:2: ( ( RULE_STRING ) )
            // InternalCls.g:774:1: ( RULE_STRING )
            {
            // InternalCls.g:774:1: ( RULE_STRING )
            // InternalCls.g:775:1: RULE_STRING
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
    // InternalCls.g:788:1: entryRuleCardinalityBound : ruleCardinalityBound EOF ;
    public final void entryRuleCardinalityBound() throws RecognitionException {
        try {
            // InternalCls.g:789:1: ( ruleCardinalityBound EOF )
            // InternalCls.g:790:1: ruleCardinalityBound EOF
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
    // InternalCls.g:797:1: ruleCardinalityBound : ( ( rule__CardinalityBound__Alternatives ) ) ;
    public final void ruleCardinalityBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:801:2: ( ( ( rule__CardinalityBound__Alternatives ) ) )
            // InternalCls.g:802:1: ( ( rule__CardinalityBound__Alternatives ) )
            {
            // InternalCls.g:802:1: ( ( rule__CardinalityBound__Alternatives ) )
            // InternalCls.g:803:1: ( rule__CardinalityBound__Alternatives )
            {
             before(grammarAccess.getCardinalityBoundAccess().getAlternatives()); 
            // InternalCls.g:804:1: ( rule__CardinalityBound__Alternatives )
            // InternalCls.g:804:2: rule__CardinalityBound__Alternatives
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
    // InternalCls.g:817:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:821:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalCls.g:822:1: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalCls.g:822:1: ( ( rule__Visibility__Alternatives ) )
            // InternalCls.g:823:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalCls.g:824:1: ( rule__Visibility__Alternatives )
            // InternalCls.g:824:2: rule__Visibility__Alternatives
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
    // InternalCls.g:836:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:840:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalCls.g:841:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalCls.g:841:1: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalCls.g:842:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalCls.g:843:1: ( rule__PrimitiveType__Alternatives )
            // InternalCls.g:843:2: rule__PrimitiveType__Alternatives
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
    // InternalCls.g:855:1: ruleAggregationKind : ( ( rule__AggregationKind__Alternatives ) ) ;
    public final void ruleAggregationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:859:1: ( ( ( rule__AggregationKind__Alternatives ) ) )
            // InternalCls.g:860:1: ( ( rule__AggregationKind__Alternatives ) )
            {
            // InternalCls.g:860:1: ( ( rule__AggregationKind__Alternatives ) )
            // InternalCls.g:861:1: ( rule__AggregationKind__Alternatives )
            {
             before(grammarAccess.getAggregationKindAccess().getAlternatives()); 
            // InternalCls.g:862:1: ( rule__AggregationKind__Alternatives )
            // InternalCls.g:862:2: rule__AggregationKind__Alternatives
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
    // InternalCls.g:873:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );
    public final void rule__Classifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:877:1: ( ( ruleClass ) | ( ruleInterface ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCls.g:878:1: ( ruleClass )
                    {
                    // InternalCls.g:878:1: ( ruleClass )
                    // InternalCls.g:879:1: ruleClass
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
                    // InternalCls.g:884:6: ( ruleInterface )
                    {
                    // InternalCls.g:884:6: ( ruleInterface )
                    // InternalCls.g:885:1: ruleInterface
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


    // $ANTLR start "rule__Class__Alternatives_3"
    // InternalCls.g:895:1: rule__Class__Alternatives_3 : ( ( ( rule__Class__Group_3_0__0 ) ) | ( ( rule__Class__Group_3_1__0 ) ) );
    public final void rule__Class__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:899:1: ( ( ( rule__Class__Group_3_0__0 ) ) | ( ( rule__Class__Group_3_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCls.g:900:1: ( ( rule__Class__Group_3_0__0 ) )
                    {
                    // InternalCls.g:900:1: ( ( rule__Class__Group_3_0__0 ) )
                    // InternalCls.g:901:1: ( rule__Class__Group_3_0__0 )
                    {
                     before(grammarAccess.getClassAccess().getGroup_3_0()); 
                    // InternalCls.g:902:1: ( rule__Class__Group_3_0__0 )
                    // InternalCls.g:902:2: rule__Class__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:906:6: ( ( rule__Class__Group_3_1__0 ) )
                    {
                    // InternalCls.g:906:6: ( ( rule__Class__Group_3_1__0 ) )
                    // InternalCls.g:907:1: ( rule__Class__Group_3_1__0 )
                    {
                     before(grammarAccess.getClassAccess().getGroup_3_1()); 
                    // InternalCls.g:908:1: ( rule__Class__Group_3_1__0 )
                    // InternalCls.g:908:2: rule__Class__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Class__Alternatives_3"


    // $ANTLR start "rule__Interface__Alternatives_2"
    // InternalCls.g:917:1: rule__Interface__Alternatives_2 : ( ( ( rule__Interface__Group_2_0__0 ) ) | ( ( rule__Interface__Group_2_1__0 ) ) );
    public final void rule__Interface__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:921:1: ( ( ( rule__Interface__Group_2_0__0 ) ) | ( ( rule__Interface__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCls.g:922:1: ( ( rule__Interface__Group_2_0__0 ) )
                    {
                    // InternalCls.g:922:1: ( ( rule__Interface__Group_2_0__0 ) )
                    // InternalCls.g:923:1: ( rule__Interface__Group_2_0__0 )
                    {
                     before(grammarAccess.getInterfaceAccess().getGroup_2_0()); 
                    // InternalCls.g:924:1: ( rule__Interface__Group_2_0__0 )
                    // InternalCls.g:924:2: rule__Interface__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfaceAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:928:6: ( ( rule__Interface__Group_2_1__0 ) )
                    {
                    // InternalCls.g:928:6: ( ( rule__Interface__Group_2_1__0 ) )
                    // InternalCls.g:929:1: ( rule__Interface__Group_2_1__0 )
                    {
                     before(grammarAccess.getInterfaceAccess().getGroup_2_1()); 
                    // InternalCls.g:930:1: ( rule__Interface__Group_2_1__0 )
                    // InternalCls.g:930:2: rule__Interface__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfaceAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Interface__Alternatives_2"


    // $ANTLR start "rule__TypeReference__Alternatives"
    // InternalCls.g:939:1: rule__TypeReference__Alternatives : ( ( ruleDataTypeReference ) | ( ruleUMLTypeReference ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:943:1: ( ( ruleDataTypeReference ) | ( ruleUMLTypeReference ) )
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
                    // InternalCls.g:944:1: ( ruleDataTypeReference )
                    {
                    // InternalCls.g:944:1: ( ruleDataTypeReference )
                    // InternalCls.g:945:1: ruleDataTypeReference
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
                    // InternalCls.g:950:6: ( ruleUMLTypeReference )
                    {
                    // InternalCls.g:950:6: ( ruleUMLTypeReference )
                    // InternalCls.g:951:1: ruleUMLTypeReference
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
    // InternalCls.g:961:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:965:1: ( ( ruleAttribute ) | ( ruleMethod ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCls.g:966:1: ( ruleAttribute )
                    {
                    // InternalCls.g:966:1: ( ruleAttribute )
                    // InternalCls.g:967:1: ruleAttribute
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
                    // InternalCls.g:972:6: ( ruleMethod )
                    {
                    // InternalCls.g:972:6: ( ruleMethod )
                    // InternalCls.g:973:1: ruleMethod
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
    // InternalCls.g:983:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleAssociation ) | ( ruleImplementation ) | ( ruleCommentLink ) | ( ruleMultiAssociation ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:987:1: ( ( ruleGeneralization ) | ( ruleAssociation ) | ( ruleImplementation ) | ( ruleCommentLink ) | ( ruleMultiAssociation ) )
            int alt6=5;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalCls.g:988:1: ( ruleGeneralization )
                    {
                    // InternalCls.g:988:1: ( ruleGeneralization )
                    // InternalCls.g:989:1: ruleGeneralization
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
                    // InternalCls.g:994:6: ( ruleAssociation )
                    {
                    // InternalCls.g:994:6: ( ruleAssociation )
                    // InternalCls.g:995:1: ruleAssociation
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
                    // InternalCls.g:1000:6: ( ruleImplementation )
                    {
                    // InternalCls.g:1000:6: ( ruleImplementation )
                    // InternalCls.g:1001:1: ruleImplementation
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
                    // InternalCls.g:1006:6: ( ruleCommentLink )
                    {
                    // InternalCls.g:1006:6: ( ruleCommentLink )
                    // InternalCls.g:1007:1: ruleCommentLink
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
                    // InternalCls.g:1012:6: ( ruleMultiAssociation )
                    {
                    // InternalCls.g:1012:6: ( ruleMultiAssociation )
                    // InternalCls.g:1013:1: ruleMultiAssociation
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


    // $ANTLR start "rule__Association__Alternatives_3"
    // InternalCls.g:1023:1: rule__Association__Alternatives_3 : ( ( ( rule__Association__ReferencedElementAssignment_3_0 ) ) | ( ( rule__Association__ReferencedElementAssignment_3_1 ) ) );
    public final void rule__Association__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1027:1: ( ( ( rule__Association__ReferencedElementAssignment_3_0 ) ) | ( ( rule__Association__ReferencedElementAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCls.g:1028:1: ( ( rule__Association__ReferencedElementAssignment_3_0 ) )
                    {
                    // InternalCls.g:1028:1: ( ( rule__Association__ReferencedElementAssignment_3_0 ) )
                    // InternalCls.g:1029:1: ( rule__Association__ReferencedElementAssignment_3_0 )
                    {
                     before(grammarAccess.getAssociationAccess().getReferencedElementAssignment_3_0()); 
                    // InternalCls.g:1030:1: ( rule__Association__ReferencedElementAssignment_3_0 )
                    // InternalCls.g:1030:2: rule__Association__ReferencedElementAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__ReferencedElementAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getReferencedElementAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1034:6: ( ( rule__Association__ReferencedElementAssignment_3_1 ) )
                    {
                    // InternalCls.g:1034:6: ( ( rule__Association__ReferencedElementAssignment_3_1 ) )
                    // InternalCls.g:1035:1: ( rule__Association__ReferencedElementAssignment_3_1 )
                    {
                     before(grammarAccess.getAssociationAccess().getReferencedElementAssignment_3_1()); 
                    // InternalCls.g:1036:1: ( rule__Association__ReferencedElementAssignment_3_1 )
                    // InternalCls.g:1036:2: rule__Association__ReferencedElementAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__ReferencedElementAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getReferencedElementAssignment_3_1()); 

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
    // $ANTLR end "rule__Association__Alternatives_3"


    // $ANTLR start "rule__MultiAssociation__Alternatives_1"
    // InternalCls.g:1045:1: rule__MultiAssociation__Alternatives_1 : ( ( ( rule__MultiAssociation__ReferencedElementAssignment_1_0 ) ) | ( ( rule__MultiAssociation__ReferencedElementAssignment_1_1 ) ) );
    public final void rule__MultiAssociation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1049:1: ( ( ( rule__MultiAssociation__ReferencedElementAssignment_1_0 ) ) | ( ( rule__MultiAssociation__ReferencedElementAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCls.g:1050:1: ( ( rule__MultiAssociation__ReferencedElementAssignment_1_0 ) )
                    {
                    // InternalCls.g:1050:1: ( ( rule__MultiAssociation__ReferencedElementAssignment_1_0 ) )
                    // InternalCls.g:1051:1: ( rule__MultiAssociation__ReferencedElementAssignment_1_0 )
                    {
                     before(grammarAccess.getMultiAssociationAccess().getReferencedElementAssignment_1_0()); 
                    // InternalCls.g:1052:1: ( rule__MultiAssociation__ReferencedElementAssignment_1_0 )
                    // InternalCls.g:1052:2: rule__MultiAssociation__ReferencedElementAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiAssociation__ReferencedElementAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiAssociationAccess().getReferencedElementAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1056:6: ( ( rule__MultiAssociation__ReferencedElementAssignment_1_1 ) )
                    {
                    // InternalCls.g:1056:6: ( ( rule__MultiAssociation__ReferencedElementAssignment_1_1 ) )
                    // InternalCls.g:1057:1: ( rule__MultiAssociation__ReferencedElementAssignment_1_1 )
                    {
                     before(grammarAccess.getMultiAssociationAccess().getReferencedElementAssignment_1_1()); 
                    // InternalCls.g:1058:1: ( rule__MultiAssociation__ReferencedElementAssignment_1_1 )
                    // InternalCls.g:1058:2: rule__MultiAssociation__ReferencedElementAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiAssociation__ReferencedElementAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiAssociationAccess().getReferencedElementAssignment_1_1()); 

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
    // $ANTLR end "rule__MultiAssociation__Alternatives_1"


    // $ANTLR start "rule__CardinalityBound__Alternatives"
    // InternalCls.g:1067:1: rule__CardinalityBound__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CardinalityBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1071:1: ( ( '*' ) | ( RULE_INT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCls.g:1072:1: ( '*' )
                    {
                    // InternalCls.g:1072:1: ( '*' )
                    // InternalCls.g:1073:1: '*'
                    {
                     before(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1080:6: ( RULE_INT )
                    {
                    // InternalCls.g:1080:6: ( RULE_INT )
                    // InternalCls.g:1081:1: RULE_INT
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
    // InternalCls.g:1091:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1095:1: ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt10=1;
                }
                break;
            case 13:
                {
                alt10=2;
                }
                break;
            case 14:
                {
                alt10=3;
                }
                break;
            case 15:
                {
                alt10=4;
                }
                break;
            case 16:
                {
                alt10=5;
                }
                break;
            case 17:
                {
                alt10=6;
                }
                break;
            case 18:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCls.g:1096:1: ( ( '+' ) )
                    {
                    // InternalCls.g:1096:1: ( ( '+' ) )
                    // InternalCls.g:1097:1: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalCls.g:1098:1: ( '+' )
                    // InternalCls.g:1098:3: '+'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1103:6: ( ( 'public' ) )
                    {
                    // InternalCls.g:1103:6: ( ( 'public' ) )
                    // InternalCls.g:1104:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // InternalCls.g:1105:1: ( 'public' )
                    // InternalCls.g:1105:3: 'public'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1110:6: ( ( '-' ) )
                    {
                    // InternalCls.g:1110:6: ( ( '-' ) )
                    // InternalCls.g:1111:1: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2()); 
                    // InternalCls.g:1112:1: ( '-' )
                    // InternalCls.g:1112:3: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1117:6: ( ( 'private' ) )
                    {
                    // InternalCls.g:1117:6: ( ( 'private' ) )
                    // InternalCls.g:1118:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3()); 
                    // InternalCls.g:1119:1: ( 'private' )
                    // InternalCls.g:1119:3: 'private'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:1124:6: ( ( '#' ) )
                    {
                    // InternalCls.g:1124:6: ( ( '#' ) )
                    // InternalCls.g:1125:1: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4()); 
                    // InternalCls.g:1126:1: ( '#' )
                    // InternalCls.g:1126:3: '#'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:1131:6: ( ( 'protected' ) )
                    {
                    // InternalCls.g:1131:6: ( ( 'protected' ) )
                    // InternalCls.g:1132:1: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5()); 
                    // InternalCls.g:1133:1: ( 'protected' )
                    // InternalCls.g:1133:3: 'protected'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:1138:6: ( ( '~' ) )
                    {
                    // InternalCls.g:1138:6: ( ( '~' ) )
                    // InternalCls.g:1139:1: ( '~' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_6()); 
                    // InternalCls.g:1140:1: ( '~' )
                    // InternalCls.g:1140:3: '~'
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
    // InternalCls.g:1150:1: rule__PrimitiveType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'short' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1154:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'short' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            case 23:
                {
                alt11=5;
                }
                break;
            case 24:
                {
                alt11=6;
                }
                break;
            case 25:
                {
                alt11=7;
                }
                break;
            case 26:
                {
                alt11=8;
                }
                break;
            case 27:
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
                    // InternalCls.g:1155:1: ( ( 'string' ) )
                    {
                    // InternalCls.g:1155:1: ( ( 'string' ) )
                    // InternalCls.g:1156:1: ( 'string' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalCls.g:1157:1: ( 'string' )
                    // InternalCls.g:1157:3: 'string'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1162:6: ( ( 'int' ) )
                    {
                    // InternalCls.g:1162:6: ( ( 'int' ) )
                    // InternalCls.g:1163:1: ( 'int' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalCls.g:1164:1: ( 'int' )
                    // InternalCls.g:1164:3: 'int'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1169:6: ( ( 'double' ) )
                    {
                    // InternalCls.g:1169:6: ( ( 'double' ) )
                    // InternalCls.g:1170:1: ( 'double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    // InternalCls.g:1171:1: ( 'double' )
                    // InternalCls.g:1171:3: 'double'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:1176:6: ( ( 'boolean' ) )
                    {
                    // InternalCls.g:1176:6: ( ( 'boolean' ) )
                    // InternalCls.g:1177:1: ( 'boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 
                    // InternalCls.g:1178:1: ( 'boolean' )
                    // InternalCls.g:1178:3: 'boolean'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:1183:6: ( ( 'char' ) )
                    {
                    // InternalCls.g:1183:6: ( ( 'char' ) )
                    // InternalCls.g:1184:1: ( 'char' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4()); 
                    // InternalCls.g:1185:1: ( 'char' )
                    // InternalCls.g:1185:3: 'char'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getCHAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:1190:6: ( ( 'byte' ) )
                    {
                    // InternalCls.g:1190:6: ( ( 'byte' ) )
                    // InternalCls.g:1191:1: ( 'byte' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5()); 
                    // InternalCls.g:1192:1: ( 'byte' )
                    // InternalCls.g:1192:3: 'byte'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBYTEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:1197:6: ( ( 'short' ) )
                    {
                    // InternalCls.g:1197:6: ( ( 'short' ) )
                    // InternalCls.g:1198:1: ( 'short' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6()); 
                    // InternalCls.g:1199:1: ( 'short' )
                    // InternalCls.g:1199:3: 'short'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSHORTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCls.g:1204:6: ( ( 'long' ) )
                    {
                    // InternalCls.g:1204:6: ( ( 'long' ) )
                    // InternalCls.g:1205:1: ( 'long' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7()); 
                    // InternalCls.g:1206:1: ( 'long' )
                    // InternalCls.g:1206:3: 'long'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getLONGEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCls.g:1211:6: ( ( 'float' ) )
                    {
                    // InternalCls.g:1211:6: ( ( 'float' ) )
                    // InternalCls.g:1212:1: ( 'float' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalCls.g:1213:1: ( 'float' )
                    // InternalCls.g:1213:3: 'float'
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
    // InternalCls.g:1223:1: rule__AggregationKind__Alternatives : ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) );
    public final void rule__AggregationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1227:1: ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalCls.g:1228:1: ( ( 'asc' ) )
                    {
                    // InternalCls.g:1228:1: ( ( 'asc' ) )
                    // InternalCls.g:1229:1: ( 'asc' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalCls.g:1230:1: ( 'asc' )
                    // InternalCls.g:1230:3: 'asc'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:1235:6: ( ( 'agg' ) )
                    {
                    // InternalCls.g:1235:6: ( ( 'agg' ) )
                    // InternalCls.g:1236:1: ( 'agg' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 
                    // InternalCls.g:1237:1: ( 'agg' )
                    // InternalCls.g:1237:3: 'agg'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:1242:6: ( ( 'com' ) )
                    {
                    // InternalCls.g:1242:6: ( ( 'com' ) )
                    // InternalCls.g:1243:1: ( 'com' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getCOMPOSITIONEnumLiteralDeclaration_2()); 
                    // InternalCls.g:1244:1: ( 'com' )
                    // InternalCls.g:1244:3: 'com'
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
    // InternalCls.g:1256:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1260:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // InternalCls.g:1261:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
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
    // InternalCls.g:1268:1: rule__ClassDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1272:1: ( ( () ) )
            // InternalCls.g:1273:1: ( () )
            {
            // InternalCls.g:1273:1: ( () )
            // InternalCls.g:1274:1: ()
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 
            // InternalCls.g:1275:1: ()
            // InternalCls.g:1277:1: 
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
    // InternalCls.g:1287:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1291:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // InternalCls.g:1292:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
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
    // InternalCls.g:1299:1: rule__ClassDiagram__Group__1__Impl : ( '@startclass' ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1303:1: ( ( '@startclass' ) )
            // InternalCls.g:1304:1: ( '@startclass' )
            {
            // InternalCls.g:1304:1: ( '@startclass' )
            // InternalCls.g:1305:1: '@startclass'
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
    // InternalCls.g:1318:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1322:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // InternalCls.g:1323:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
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
    // InternalCls.g:1330:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__TitleAssignment_2 ) ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1334:1: ( ( ( rule__ClassDiagram__TitleAssignment_2 ) ) )
            // InternalCls.g:1335:1: ( ( rule__ClassDiagram__TitleAssignment_2 ) )
            {
            // InternalCls.g:1335:1: ( ( rule__ClassDiagram__TitleAssignment_2 ) )
            // InternalCls.g:1336:1: ( rule__ClassDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getClassDiagramAccess().getTitleAssignment_2()); 
            // InternalCls.g:1337:1: ( rule__ClassDiagram__TitleAssignment_2 )
            // InternalCls.g:1337:2: rule__ClassDiagram__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramAccess().getTitleAssignment_2()); 

            }


            }

        }
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
    // InternalCls.g:1347:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1351:1: ( rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 )
            // InternalCls.g:1352:2: rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalCls.g:1359:1: rule__ClassDiagram__Group__3__Impl : ( ( rule__ClassDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1363:1: ( ( ( rule__ClassDiagram__RootPackageAssignment_3 ) ) )
            // InternalCls.g:1364:1: ( ( rule__ClassDiagram__RootPackageAssignment_3 ) )
            {
            // InternalCls.g:1364:1: ( ( rule__ClassDiagram__RootPackageAssignment_3 ) )
            // InternalCls.g:1365:1: ( rule__ClassDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getClassDiagramAccess().getRootPackageAssignment_3()); 
            // InternalCls.g:1366:1: ( rule__ClassDiagram__RootPackageAssignment_3 )
            // InternalCls.g:1366:2: rule__ClassDiagram__RootPackageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__RootPackageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramAccess().getRootPackageAssignment_3()); 

            }


            }

        }
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
    // InternalCls.g:1376:1: rule__ClassDiagram__Group__4 : rule__ClassDiagram__Group__4__Impl ;
    public final void rule__ClassDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1380:1: ( rule__ClassDiagram__Group__4__Impl )
            // InternalCls.g:1381:2: rule__ClassDiagram__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:1387:1: rule__ClassDiagram__Group__4__Impl : ( '@endclass' ) ;
    public final void rule__ClassDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1391:1: ( ( '@endclass' ) )
            // InternalCls.g:1392:1: ( '@endclass' )
            {
            // InternalCls.g:1392:1: ( '@endclass' )
            // InternalCls.g:1393:1: '@endclass'
            {
             before(grammarAccess.getClassDiagramAccess().getEndclassKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getEndclassKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__RootPackage__Group__0"
    // InternalCls.g:1416:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1420:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalCls.g:1421:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RootPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__0"


    // $ANTLR start "rule__RootPackage__Group__0__Impl"
    // InternalCls.g:1428:1: rule__RootPackage__Group__0__Impl : ( 'rootPackage' ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1432:1: ( ( 'rootPackage' ) )
            // InternalCls.g:1433:1: ( 'rootPackage' )
            {
            // InternalCls.g:1433:1: ( 'rootPackage' )
            // InternalCls.g:1434:1: 'rootPackage'
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRootPackageAccess().getRootPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__0__Impl"


    // $ANTLR start "rule__RootPackage__Group__1"
    // InternalCls.g:1447:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1451:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalCls.g:1452:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RootPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__1"


    // $ANTLR start "rule__RootPackage__Group__1__Impl"
    // InternalCls.g:1459:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__ReferencedElementAssignment_1 ) ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1463:1: ( ( ( rule__RootPackage__ReferencedElementAssignment_1 ) ) )
            // InternalCls.g:1464:1: ( ( rule__RootPackage__ReferencedElementAssignment_1 ) )
            {
            // InternalCls.g:1464:1: ( ( rule__RootPackage__ReferencedElementAssignment_1 ) )
            // InternalCls.g:1465:1: ( rule__RootPackage__ReferencedElementAssignment_1 )
            {
             before(grammarAccess.getRootPackageAccess().getReferencedElementAssignment_1()); 
            // InternalCls.g:1466:1: ( rule__RootPackage__ReferencedElementAssignment_1 )
            // InternalCls.g:1466:2: rule__RootPackage__ReferencedElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__ReferencedElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootPackageAccess().getReferencedElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__1__Impl"


    // $ANTLR start "rule__RootPackage__Group__2"
    // InternalCls.g:1476:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1480:1: ( rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 )
            // InternalCls.g:1481:2: rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RootPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__2"


    // $ANTLR start "rule__RootPackage__Group__2__Impl"
    // InternalCls.g:1488:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__PackageImportsAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1492:1: ( ( ( rule__RootPackage__PackageImportsAssignment_2 )* ) )
            // InternalCls.g:1493:1: ( ( rule__RootPackage__PackageImportsAssignment_2 )* )
            {
            // InternalCls.g:1493:1: ( ( rule__RootPackage__PackageImportsAssignment_2 )* )
            // InternalCls.g:1494:1: ( rule__RootPackage__PackageImportsAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getPackageImportsAssignment_2()); 
            // InternalCls.g:1495:1: ( rule__RootPackage__PackageImportsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCls.g:1495:2: rule__RootPackage__PackageImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RootPackage__PackageImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRootPackageAccess().getPackageImportsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__2__Impl"


    // $ANTLR start "rule__RootPackage__Group__3"
    // InternalCls.g:1505:1: rule__RootPackage__Group__3 : rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 ;
    public final void rule__RootPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1509:1: ( rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 )
            // InternalCls.g:1510:2: rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__RootPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__3"


    // $ANTLR start "rule__RootPackage__Group__3__Impl"
    // InternalCls.g:1517:1: rule__RootPackage__Group__3__Impl : ( ( rule__RootPackage__ClassifiersAssignment_3 )* ) ;
    public final void rule__RootPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1521:1: ( ( ( rule__RootPackage__ClassifiersAssignment_3 )* ) )
            // InternalCls.g:1522:1: ( ( rule__RootPackage__ClassifiersAssignment_3 )* )
            {
            // InternalCls.g:1522:1: ( ( rule__RootPackage__ClassifiersAssignment_3 )* )
            // InternalCls.g:1523:1: ( rule__RootPackage__ClassifiersAssignment_3 )*
            {
             before(grammarAccess.getRootPackageAccess().getClassifiersAssignment_3()); 
            // InternalCls.g:1524:1: ( rule__RootPackage__ClassifiersAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=12 && LA14_0<=18)||LA14_0==39||LA14_0==41||LA14_0==54) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCls.g:1524:2: rule__RootPackage__ClassifiersAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RootPackage__ClassifiersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRootPackageAccess().getClassifiersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__3__Impl"


    // $ANTLR start "rule__RootPackage__Group__4"
    // InternalCls.g:1534:1: rule__RootPackage__Group__4 : rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5 ;
    public final void rule__RootPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1538:1: ( rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5 )
            // InternalCls.g:1539:2: rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__RootPackage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__4"


    // $ANTLR start "rule__RootPackage__Group__4__Impl"
    // InternalCls.g:1546:1: rule__RootPackage__Group__4__Impl : ( ( rule__RootPackage__ConnectorsAssignment_4 )* ) ;
    public final void rule__RootPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1550:1: ( ( ( rule__RootPackage__ConnectorsAssignment_4 )* ) )
            // InternalCls.g:1551:1: ( ( rule__RootPackage__ConnectorsAssignment_4 )* )
            {
            // InternalCls.g:1551:1: ( ( rule__RootPackage__ConnectorsAssignment_4 )* )
            // InternalCls.g:1552:1: ( rule__RootPackage__ConnectorsAssignment_4 )*
            {
             before(grammarAccess.getRootPackageAccess().getConnectorsAssignment_4()); 
            // InternalCls.g:1553:1: ( rule__RootPackage__ConnectorsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=28 && LA15_0<=30)||LA15_0==57) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCls.g:1553:2: rule__RootPackage__ConnectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RootPackage__ConnectorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRootPackageAccess().getConnectorsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__4__Impl"


    // $ANTLR start "rule__RootPackage__Group__5"
    // InternalCls.g:1563:1: rule__RootPackage__Group__5 : rule__RootPackage__Group__5__Impl ;
    public final void rule__RootPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1567:1: ( rule__RootPackage__Group__5__Impl )
            // InternalCls.g:1568:2: rule__RootPackage__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__5"


    // $ANTLR start "rule__RootPackage__Group__5__Impl"
    // InternalCls.g:1574:1: rule__RootPackage__Group__5__Impl : ( ( rule__RootPackage__PackagesAssignment_5 )* ) ;
    public final void rule__RootPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1578:1: ( ( ( rule__RootPackage__PackagesAssignment_5 )* ) )
            // InternalCls.g:1579:1: ( ( rule__RootPackage__PackagesAssignment_5 )* )
            {
            // InternalCls.g:1579:1: ( ( rule__RootPackage__PackagesAssignment_5 )* )
            // InternalCls.g:1580:1: ( rule__RootPackage__PackagesAssignment_5 )*
            {
             before(grammarAccess.getRootPackageAccess().getPackagesAssignment_5()); 
            // InternalCls.g:1581:1: ( rule__RootPackage__PackagesAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCls.g:1581:2: rule__RootPackage__PackagesAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__RootPackage__PackagesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRootPackageAccess().getPackagesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__5__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // InternalCls.g:1603:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1607:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalCls.g:1608:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalCls.g:1615:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1619:1: ( ( 'package' ) )
            // InternalCls.g:1620:1: ( 'package' )
            {
            // InternalCls.g:1620:1: ( 'package' )
            // InternalCls.g:1621:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalCls.g:1634:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1638:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalCls.g:1639:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalCls.g:1646:1: rule__Package__Group__1__Impl : ( ( rule__Package__ReferencedElementAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1650:1: ( ( ( rule__Package__ReferencedElementAssignment_1 ) ) )
            // InternalCls.g:1651:1: ( ( rule__Package__ReferencedElementAssignment_1 ) )
            {
            // InternalCls.g:1651:1: ( ( rule__Package__ReferencedElementAssignment_1 ) )
            // InternalCls.g:1652:1: ( rule__Package__ReferencedElementAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getReferencedElementAssignment_1()); 
            // InternalCls.g:1653:1: ( rule__Package__ReferencedElementAssignment_1 )
            // InternalCls.g:1653:2: rule__Package__ReferencedElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__ReferencedElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getReferencedElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalCls.g:1663:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1667:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalCls.g:1668:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalCls.g:1675:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1679:1: ( ( '{' ) )
            // InternalCls.g:1680:1: ( '{' )
            {
            // InternalCls.g:1680:1: ( '{' )
            // InternalCls.g:1681:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalCls.g:1694:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1698:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalCls.g:1699:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalCls.g:1706:1: rule__Package__Group__3__Impl : ( ( rule__Package__PackageImportsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1710:1: ( ( ( rule__Package__PackageImportsAssignment_3 )* ) )
            // InternalCls.g:1711:1: ( ( rule__Package__PackageImportsAssignment_3 )* )
            {
            // InternalCls.g:1711:1: ( ( rule__Package__PackageImportsAssignment_3 )* )
            // InternalCls.g:1712:1: ( rule__Package__PackageImportsAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getPackageImportsAssignment_3()); 
            // InternalCls.g:1713:1: ( rule__Package__PackageImportsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCls.g:1713:2: rule__Package__PackageImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Package__PackageImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getPackageImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalCls.g:1723:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1727:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalCls.g:1728:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalCls.g:1735:1: rule__Package__Group__4__Impl : ( ( rule__Package__ClassifiersAssignment_4 )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1739:1: ( ( ( rule__Package__ClassifiersAssignment_4 )* ) )
            // InternalCls.g:1740:1: ( ( rule__Package__ClassifiersAssignment_4 )* )
            {
            // InternalCls.g:1740:1: ( ( rule__Package__ClassifiersAssignment_4 )* )
            // InternalCls.g:1741:1: ( rule__Package__ClassifiersAssignment_4 )*
            {
             before(grammarAccess.getPackageAccess().getClassifiersAssignment_4()); 
            // InternalCls.g:1742:1: ( rule__Package__ClassifiersAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=18)||LA18_0==39||LA18_0==41||LA18_0==54) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCls.g:1742:2: rule__Package__ClassifiersAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Package__ClassifiersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getClassifiersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalCls.g:1752:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1756:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalCls.g:1757:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // InternalCls.g:1764:1: rule__Package__Group__5__Impl : ( ( rule__Package__ConnectorsAssignment_5 )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1768:1: ( ( ( rule__Package__ConnectorsAssignment_5 )* ) )
            // InternalCls.g:1769:1: ( ( rule__Package__ConnectorsAssignment_5 )* )
            {
            // InternalCls.g:1769:1: ( ( rule__Package__ConnectorsAssignment_5 )* )
            // InternalCls.g:1770:1: ( rule__Package__ConnectorsAssignment_5 )*
            {
             before(grammarAccess.getPackageAccess().getConnectorsAssignment_5()); 
            // InternalCls.g:1771:1: ( rule__Package__ConnectorsAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=28 && LA19_0<=30)||LA19_0==57) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCls.g:1771:2: rule__Package__ConnectorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Package__ConnectorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getConnectorsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group__6"
    // InternalCls.g:1781:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1785:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalCls.g:1786:2: rule__Package__Group__6__Impl rule__Package__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Package__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6"


    // $ANTLR start "rule__Package__Group__6__Impl"
    // InternalCls.g:1793:1: rule__Package__Group__6__Impl : ( ( rule__Package__PackagesAssignment_6 )* ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1797:1: ( ( ( rule__Package__PackagesAssignment_6 )* ) )
            // InternalCls.g:1798:1: ( ( rule__Package__PackagesAssignment_6 )* )
            {
            // InternalCls.g:1798:1: ( ( rule__Package__PackagesAssignment_6 )* )
            // InternalCls.g:1799:1: ( rule__Package__PackagesAssignment_6 )*
            {
             before(grammarAccess.getPackageAccess().getPackagesAssignment_6()); 
            // InternalCls.g:1800:1: ( rule__Package__PackagesAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCls.g:1800:2: rule__Package__PackagesAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Package__PackagesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getPackagesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__Package__Group__7"
    // InternalCls.g:1810:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1814:1: ( rule__Package__Group__7__Impl )
            // InternalCls.g:1815:2: rule__Package__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__7"


    // $ANTLR start "rule__Package__Group__7__Impl"
    // InternalCls.g:1821:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1825:1: ( ( '}' ) )
            // InternalCls.g:1826:1: ( '}' )
            {
            // InternalCls.g:1826:1: ( '}' )
            // InternalCls.g:1827:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__7__Impl"


    // $ANTLR start "rule__PackageImport__Group__0"
    // InternalCls.g:1856:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1860:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // InternalCls.g:1861:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:1868:1: rule__PackageImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1872:1: ( ( 'import' ) )
            // InternalCls.g:1873:1: ( 'import' )
            {
            // InternalCls.g:1873:1: ( 'import' )
            // InternalCls.g:1874:1: 'import'
            {
             before(grammarAccess.getPackageImportAccess().getImportKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCls.g:1887:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1891:1: ( rule__PackageImport__Group__1__Impl )
            // InternalCls.g:1892:2: rule__PackageImport__Group__1__Impl
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
    // InternalCls.g:1898:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__ReferencedElementAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1902:1: ( ( ( rule__PackageImport__ReferencedElementAssignment_1 ) ) )
            // InternalCls.g:1903:1: ( ( rule__PackageImport__ReferencedElementAssignment_1 ) )
            {
            // InternalCls.g:1903:1: ( ( rule__PackageImport__ReferencedElementAssignment_1 ) )
            // InternalCls.g:1904:1: ( rule__PackageImport__ReferencedElementAssignment_1 )
            {
             before(grammarAccess.getPackageImportAccess().getReferencedElementAssignment_1()); 
            // InternalCls.g:1905:1: ( rule__PackageImport__ReferencedElementAssignment_1 )
            // InternalCls.g:1905:2: rule__PackageImport__ReferencedElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageImport__ReferencedElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageImportAccess().getReferencedElementAssignment_1()); 

            }


            }

        }
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
    // InternalCls.g:1919:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1923:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCls.g:1924:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCls.g:1931:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1935:1: ( ( RULE_ID ) )
            // InternalCls.g:1936:1: ( RULE_ID )
            {
            // InternalCls.g:1936:1: ( RULE_ID )
            // InternalCls.g:1937:1: RULE_ID
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
    // InternalCls.g:1948:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1952:1: ( rule__FQN__Group__1__Impl )
            // InternalCls.g:1953:2: rule__FQN__Group__1__Impl
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
    // InternalCls.g:1959:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1963:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCls.g:1964:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCls.g:1964:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCls.g:1965:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCls.g:1966:1: ( rule__FQN__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCls.g:1966:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalCls.g:1980:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1984:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCls.g:1985:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:1992:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:1996:1: ( ( '.' ) )
            // InternalCls.g:1997:1: ( '.' )
            {
            // InternalCls.g:1997:1: ( '.' )
            // InternalCls.g:1998:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCls.g:2011:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2015:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCls.g:2016:2: rule__FQN__Group_1__1__Impl
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
    // InternalCls.g:2022:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2026:1: ( ( RULE_ID ) )
            // InternalCls.g:2027:1: ( RULE_ID )
            {
            // InternalCls.g:2027:1: ( RULE_ID )
            // InternalCls.g:2028:1: RULE_ID
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
    // InternalCls.g:2043:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2047:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalCls.g:2048:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCls.g:2055:1: rule__Class__Group__0__Impl : ( ( rule__Class__VisibilityAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2059:1: ( ( ( rule__Class__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2060:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2060:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            // InternalCls.g:2061:1: ( rule__Class__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2062:1: ( rule__Class__VisibilityAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=12 && LA22_0<=18)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCls.g:2062:2: rule__Class__VisibilityAssignment_0
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
    // InternalCls.g:2072:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2076:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalCls.g:2077:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCls.g:2084:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2088:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalCls.g:2089:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalCls.g:2089:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalCls.g:2090:1: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalCls.g:2091:1: ( rule__Class__AbstractAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCls.g:2091:2: rule__Class__AbstractAssignment_1
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
    // InternalCls.g:2101:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2105:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalCls.g:2106:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:2113:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2117:1: ( ( 'class' ) )
            // InternalCls.g:2118:1: ( 'class' )
            {
            // InternalCls.g:2118:1: ( 'class' )
            // InternalCls.g:2119:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCls.g:2132:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2136:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalCls.g:2137:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalCls.g:2144:1: rule__Class__Group__3__Impl : ( ( rule__Class__Alternatives_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2148:1: ( ( ( rule__Class__Alternatives_3 ) ) )
            // InternalCls.g:2149:1: ( ( rule__Class__Alternatives_3 ) )
            {
            // InternalCls.g:2149:1: ( ( rule__Class__Alternatives_3 ) )
            // InternalCls.g:2150:1: ( rule__Class__Alternatives_3 )
            {
             before(grammarAccess.getClassAccess().getAlternatives_3()); 
            // InternalCls.g:2151:1: ( rule__Class__Alternatives_3 )
            // InternalCls.g:2151:2: rule__Class__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Class__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalCls.g:2161:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2165:1: ( rule__Class__Group__4__Impl )
            // InternalCls.g:2166:2: rule__Class__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:2172:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2176:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalCls.g:2177:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalCls.g:2177:1: ( ( rule__Class__Group_4__0 )? )
            // InternalCls.g:2178:1: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalCls.g:2179:1: ( rule__Class__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCls.g:2179:2: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group_3_0__0"
    // InternalCls.g:2199:1: rule__Class__Group_3_0__0 : rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1 ;
    public final void rule__Class__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2203:1: ( rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1 )
            // InternalCls.g:2204:2: rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Class__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_0__0"


    // $ANTLR start "rule__Class__Group_3_0__0__Impl"
    // InternalCls.g:2211:1: rule__Class__Group_3_0__0__Impl : ( ( rule__Class__ReferencedElementAssignment_3_0_0 ) ) ;
    public final void rule__Class__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2215:1: ( ( ( rule__Class__ReferencedElementAssignment_3_0_0 ) ) )
            // InternalCls.g:2216:1: ( ( rule__Class__ReferencedElementAssignment_3_0_0 ) )
            {
            // InternalCls.g:2216:1: ( ( rule__Class__ReferencedElementAssignment_3_0_0 ) )
            // InternalCls.g:2217:1: ( rule__Class__ReferencedElementAssignment_3_0_0 )
            {
             before(grammarAccess.getClassAccess().getReferencedElementAssignment_3_0_0()); 
            // InternalCls.g:2218:1: ( rule__Class__ReferencedElementAssignment_3_0_0 )
            // InternalCls.g:2218:2: rule__Class__ReferencedElementAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Class__ReferencedElementAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getReferencedElementAssignment_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_0__0__Impl"


    // $ANTLR start "rule__Class__Group_3_0__1"
    // InternalCls.g:2228:1: rule__Class__Group_3_0__1 : rule__Class__Group_3_0__1__Impl ;
    public final void rule__Class__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2232:1: ( rule__Class__Group_3_0__1__Impl )
            // InternalCls.g:2233:2: rule__Class__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_0__1"


    // $ANTLR start "rule__Class__Group_3_0__1__Impl"
    // InternalCls.g:2239:1: rule__Class__Group_3_0__1__Impl : ( ( rule__Class__Group_3_0_1__0 )? ) ;
    public final void rule__Class__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2243:1: ( ( ( rule__Class__Group_3_0_1__0 )? ) )
            // InternalCls.g:2244:1: ( ( rule__Class__Group_3_0_1__0 )? )
            {
            // InternalCls.g:2244:1: ( ( rule__Class__Group_3_0_1__0 )? )
            // InternalCls.g:2245:1: ( rule__Class__Group_3_0_1__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3_0_1()); 
            // InternalCls.g:2246:1: ( rule__Class__Group_3_0_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:2246:2: rule__Class__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_0__1__Impl"


    // $ANTLR start "rule__Class__Group_3_0_1__0"
    // InternalCls.g:2260:1: rule__Class__Group_3_0_1__0 : rule__Class__Group_3_0_1__0__Impl rule__Class__Group_3_0_1__1 ;
    public final void rule__Class__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2264:1: ( rule__Class__Group_3_0_1__0__Impl rule__Class__Group_3_0_1__1 )
            // InternalCls.g:2265:2: rule__Class__Group_3_0_1__0__Impl rule__Class__Group_3_0_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_0_1__0"


    // $ANTLR start "rule__Class__Group_3_0_1__0__Impl"
    // InternalCls.g:2272:1: rule__Class__Group_3_0_1__0__Impl : ( 'as' ) ;
    public final void rule__Class__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2276:1: ( ( 'as' ) )
            // InternalCls.g:2277:1: ( 'as' )
            {
            // InternalCls.g:2277:1: ( 'as' )
            // InternalCls.g:2278:1: 'as'
            {
             before(grammarAccess.getClassAccess().getAsKeyword_3_0_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAsKeyword_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__Class__Group_3_0_1__1"
    // InternalCls.g:2291:1: rule__Class__Group_3_0_1__1 : rule__Class__Group_3_0_1__1__Impl ;
    public final void rule__Class__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2295:1: ( rule__Class__Group_3_0_1__1__Impl )
            // InternalCls.g:2296:2: rule__Class__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_0_1__1"


    // $ANTLR start "rule__Class__Group_3_0_1__1__Impl"
    // InternalCls.g:2302:1: rule__Class__Group_3_0_1__1__Impl : ( ( rule__Class__AliasExpressionAssignment_3_0_1_1 ) ) ;
    public final void rule__Class__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2306:1: ( ( ( rule__Class__AliasExpressionAssignment_3_0_1_1 ) ) )
            // InternalCls.g:2307:1: ( ( rule__Class__AliasExpressionAssignment_3_0_1_1 ) )
            {
            // InternalCls.g:2307:1: ( ( rule__Class__AliasExpressionAssignment_3_0_1_1 ) )
            // InternalCls.g:2308:1: ( rule__Class__AliasExpressionAssignment_3_0_1_1 )
            {
             before(grammarAccess.getClassAccess().getAliasExpressionAssignment_3_0_1_1()); 
            // InternalCls.g:2309:1: ( rule__Class__AliasExpressionAssignment_3_0_1_1 )
            // InternalCls.g:2309:2: rule__Class__AliasExpressionAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__AliasExpressionAssignment_3_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAliasExpressionAssignment_3_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__Class__Group_3_1__0"
    // InternalCls.g:2323:1: rule__Class__Group_3_1__0 : rule__Class__Group_3_1__0__Impl rule__Class__Group_3_1__1 ;
    public final void rule__Class__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2327:1: ( rule__Class__Group_3_1__0__Impl rule__Class__Group_3_1__1 )
            // InternalCls.g:2328:2: rule__Class__Group_3_1__0__Impl rule__Class__Group_3_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Class__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_1__0"


    // $ANTLR start "rule__Class__Group_3_1__0__Impl"
    // InternalCls.g:2335:1: rule__Class__Group_3_1__0__Impl : ( ( rule__Class__ReferencedElementAssignment_3_1_0 ) ) ;
    public final void rule__Class__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2339:1: ( ( ( rule__Class__ReferencedElementAssignment_3_1_0 ) ) )
            // InternalCls.g:2340:1: ( ( rule__Class__ReferencedElementAssignment_3_1_0 ) )
            {
            // InternalCls.g:2340:1: ( ( rule__Class__ReferencedElementAssignment_3_1_0 ) )
            // InternalCls.g:2341:1: ( rule__Class__ReferencedElementAssignment_3_1_0 )
            {
             before(grammarAccess.getClassAccess().getReferencedElementAssignment_3_1_0()); 
            // InternalCls.g:2342:1: ( rule__Class__ReferencedElementAssignment_3_1_0 )
            // InternalCls.g:2342:2: rule__Class__ReferencedElementAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Class__ReferencedElementAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getReferencedElementAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_1__0__Impl"


    // $ANTLR start "rule__Class__Group_3_1__1"
    // InternalCls.g:2352:1: rule__Class__Group_3_1__1 : rule__Class__Group_3_1__1__Impl rule__Class__Group_3_1__2 ;
    public final void rule__Class__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2356:1: ( rule__Class__Group_3_1__1__Impl rule__Class__Group_3_1__2 )
            // InternalCls.g:2357:2: rule__Class__Group_3_1__1__Impl rule__Class__Group_3_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_1__1"


    // $ANTLR start "rule__Class__Group_3_1__1__Impl"
    // InternalCls.g:2364:1: rule__Class__Group_3_1__1__Impl : ( 'as' ) ;
    public final void rule__Class__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2368:1: ( ( 'as' ) )
            // InternalCls.g:2369:1: ( 'as' )
            {
            // InternalCls.g:2369:1: ( 'as' )
            // InternalCls.g:2370:1: 'as'
            {
             before(grammarAccess.getClassAccess().getAsKeyword_3_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAsKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_1__1__Impl"


    // $ANTLR start "rule__Class__Group_3_1__2"
    // InternalCls.g:2383:1: rule__Class__Group_3_1__2 : rule__Class__Group_3_1__2__Impl ;
    public final void rule__Class__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2387:1: ( rule__Class__Group_3_1__2__Impl )
            // InternalCls.g:2388:2: rule__Class__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_1__2"


    // $ANTLR start "rule__Class__Group_3_1__2__Impl"
    // InternalCls.g:2394:1: rule__Class__Group_3_1__2__Impl : ( ( rule__Class__AliasExpressionAssignment_3_1_2 ) ) ;
    public final void rule__Class__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2398:1: ( ( ( rule__Class__AliasExpressionAssignment_3_1_2 ) ) )
            // InternalCls.g:2399:1: ( ( rule__Class__AliasExpressionAssignment_3_1_2 ) )
            {
            // InternalCls.g:2399:1: ( ( rule__Class__AliasExpressionAssignment_3_1_2 ) )
            // InternalCls.g:2400:1: ( rule__Class__AliasExpressionAssignment_3_1_2 )
            {
             before(grammarAccess.getClassAccess().getAliasExpressionAssignment_3_1_2()); 
            // InternalCls.g:2401:1: ( rule__Class__AliasExpressionAssignment_3_1_2 )
            // InternalCls.g:2401:2: rule__Class__AliasExpressionAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__AliasExpressionAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAliasExpressionAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_1__2__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalCls.g:2417:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2421:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalCls.g:2422:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalCls.g:2429:1: rule__Class__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2433:1: ( ( '{' ) )
            // InternalCls.g:2434:1: ( '{' )
            {
            // InternalCls.g:2434:1: ( '{' )
            // InternalCls.g:2435:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalCls.g:2448:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl rule__Class__Group_4__2 ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2452:1: ( rule__Class__Group_4__1__Impl rule__Class__Group_4__2 )
            // InternalCls.g:2453:2: rule__Class__Group_4__1__Impl rule__Class__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__Class__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalCls.g:2460:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__MembersAssignment_4_1 )* ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2464:1: ( ( ( rule__Class__MembersAssignment_4_1 )* ) )
            // InternalCls.g:2465:1: ( ( rule__Class__MembersAssignment_4_1 )* )
            {
            // InternalCls.g:2465:1: ( ( rule__Class__MembersAssignment_4_1 )* )
            // InternalCls.g:2466:1: ( rule__Class__MembersAssignment_4_1 )*
            {
             before(grammarAccess.getClassAccess().getMembersAssignment_4_1()); 
            // InternalCls.g:2467:1: ( rule__Class__MembersAssignment_4_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=12 && LA26_0<=18)||(LA26_0>=54 && LA26_0<=56)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCls.g:2467:2: rule__Class__MembersAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Class__MembersAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMembersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_4__2"
    // InternalCls.g:2477:1: rule__Class__Group_4__2 : rule__Class__Group_4__2__Impl ;
    public final void rule__Class__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2481:1: ( rule__Class__Group_4__2__Impl )
            // InternalCls.g:2482:2: rule__Class__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__2"


    // $ANTLR start "rule__Class__Group_4__2__Impl"
    // InternalCls.g:2488:1: rule__Class__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Class__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2492:1: ( ( '}' ) )
            // InternalCls.g:2493:1: ( '}' )
            {
            // InternalCls.g:2493:1: ( '}' )
            // InternalCls.g:2494:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__2__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalCls.g:2513:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2517:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalCls.g:2518:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCls.g:2525:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__VisibilityAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2529:1: ( ( ( rule__Interface__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2530:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2530:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            // InternalCls.g:2531:1: ( rule__Interface__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2532:1: ( rule__Interface__VisibilityAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=12 && LA27_0<=18)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:2532:2: rule__Interface__VisibilityAssignment_0
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
    // InternalCls.g:2542:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2546:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalCls.g:2547:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:2554:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2558:1: ( ( 'interface' ) )
            // InternalCls.g:2559:1: ( 'interface' )
            {
            // InternalCls.g:2559:1: ( 'interface' )
            // InternalCls.g:2560:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCls.g:2573:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2577:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalCls.g:2578:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
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
    // InternalCls.g:2585:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__Alternatives_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2589:1: ( ( ( rule__Interface__Alternatives_2 ) ) )
            // InternalCls.g:2590:1: ( ( rule__Interface__Alternatives_2 ) )
            {
            // InternalCls.g:2590:1: ( ( rule__Interface__Alternatives_2 ) )
            // InternalCls.g:2591:1: ( rule__Interface__Alternatives_2 )
            {
             before(grammarAccess.getInterfaceAccess().getAlternatives_2()); 
            // InternalCls.g:2592:1: ( rule__Interface__Alternatives_2 )
            // InternalCls.g:2592:2: rule__Interface__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalCls.g:2602:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2606:1: ( rule__Interface__Group__3__Impl )
            // InternalCls.g:2607:2: rule__Interface__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:2613:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__Group_3__0 )? ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2617:1: ( ( ( rule__Interface__Group_3__0 )? ) )
            // InternalCls.g:2618:1: ( ( rule__Interface__Group_3__0 )? )
            {
            // InternalCls.g:2618:1: ( ( rule__Interface__Group_3__0 )? )
            // InternalCls.g:2619:1: ( rule__Interface__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_3()); 
            // InternalCls.g:2620:1: ( rule__Interface__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCls.g:2620:2: rule__Interface__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interface__Group_2_0__0"
    // InternalCls.g:2638:1: rule__Interface__Group_2_0__0 : rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1 ;
    public final void rule__Interface__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2642:1: ( rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1 )
            // InternalCls.g:2643:2: rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Interface__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_0__0"


    // $ANTLR start "rule__Interface__Group_2_0__0__Impl"
    // InternalCls.g:2650:1: rule__Interface__Group_2_0__0__Impl : ( ( rule__Interface__ReferencedElementAssignment_2_0_0 ) ) ;
    public final void rule__Interface__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2654:1: ( ( ( rule__Interface__ReferencedElementAssignment_2_0_0 ) ) )
            // InternalCls.g:2655:1: ( ( rule__Interface__ReferencedElementAssignment_2_0_0 ) )
            {
            // InternalCls.g:2655:1: ( ( rule__Interface__ReferencedElementAssignment_2_0_0 ) )
            // InternalCls.g:2656:1: ( rule__Interface__ReferencedElementAssignment_2_0_0 )
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementAssignment_2_0_0()); 
            // InternalCls.g:2657:1: ( rule__Interface__ReferencedElementAssignment_2_0_0 )
            // InternalCls.g:2657:2: rule__Interface__ReferencedElementAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__ReferencedElementAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getReferencedElementAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_0__0__Impl"


    // $ANTLR start "rule__Interface__Group_2_0__1"
    // InternalCls.g:2667:1: rule__Interface__Group_2_0__1 : rule__Interface__Group_2_0__1__Impl ;
    public final void rule__Interface__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2671:1: ( rule__Interface__Group_2_0__1__Impl )
            // InternalCls.g:2672:2: rule__Interface__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_0__1"


    // $ANTLR start "rule__Interface__Group_2_0__1__Impl"
    // InternalCls.g:2678:1: rule__Interface__Group_2_0__1__Impl : ( ( rule__Interface__Group_2_0_1__0 )? ) ;
    public final void rule__Interface__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2682:1: ( ( ( rule__Interface__Group_2_0_1__0 )? ) )
            // InternalCls.g:2683:1: ( ( rule__Interface__Group_2_0_1__0 )? )
            {
            // InternalCls.g:2683:1: ( ( rule__Interface__Group_2_0_1__0 )? )
            // InternalCls.g:2684:1: ( rule__Interface__Group_2_0_1__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_2_0_1()); 
            // InternalCls.g:2685:1: ( rule__Interface__Group_2_0_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:2685:2: rule__Interface__Group_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_2_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_0__1__Impl"


    // $ANTLR start "rule__Interface__Group_2_0_1__0"
    // InternalCls.g:2699:1: rule__Interface__Group_2_0_1__0 : rule__Interface__Group_2_0_1__0__Impl rule__Interface__Group_2_0_1__1 ;
    public final void rule__Interface__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2703:1: ( rule__Interface__Group_2_0_1__0__Impl rule__Interface__Group_2_0_1__1 )
            // InternalCls.g:2704:2: rule__Interface__Group_2_0_1__0__Impl rule__Interface__Group_2_0_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Interface__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_0_1__0"


    // $ANTLR start "rule__Interface__Group_2_0_1__0__Impl"
    // InternalCls.g:2711:1: rule__Interface__Group_2_0_1__0__Impl : ( 'as' ) ;
    public final void rule__Interface__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2715:1: ( ( 'as' ) )
            // InternalCls.g:2716:1: ( 'as' )
            {
            // InternalCls.g:2716:1: ( 'as' )
            // InternalCls.g:2717:1: 'as'
            {
             before(grammarAccess.getInterfaceAccess().getAsKeyword_2_0_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getAsKeyword_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__Interface__Group_2_0_1__1"
    // InternalCls.g:2730:1: rule__Interface__Group_2_0_1__1 : rule__Interface__Group_2_0_1__1__Impl ;
    public final void rule__Interface__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2734:1: ( rule__Interface__Group_2_0_1__1__Impl )
            // InternalCls.g:2735:2: rule__Interface__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_2_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_0_1__1"


    // $ANTLR start "rule__Interface__Group_2_0_1__1__Impl"
    // InternalCls.g:2741:1: rule__Interface__Group_2_0_1__1__Impl : ( ( rule__Interface__AliasExpressionAssignment_2_0_1_1 ) ) ;
    public final void rule__Interface__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2745:1: ( ( ( rule__Interface__AliasExpressionAssignment_2_0_1_1 ) ) )
            // InternalCls.g:2746:1: ( ( rule__Interface__AliasExpressionAssignment_2_0_1_1 ) )
            {
            // InternalCls.g:2746:1: ( ( rule__Interface__AliasExpressionAssignment_2_0_1_1 ) )
            // InternalCls.g:2747:1: ( rule__Interface__AliasExpressionAssignment_2_0_1_1 )
            {
             before(grammarAccess.getInterfaceAccess().getAliasExpressionAssignment_2_0_1_1()); 
            // InternalCls.g:2748:1: ( rule__Interface__AliasExpressionAssignment_2_0_1_1 )
            // InternalCls.g:2748:2: rule__Interface__AliasExpressionAssignment_2_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__AliasExpressionAssignment_2_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getAliasExpressionAssignment_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__Interface__Group_2_1__0"
    // InternalCls.g:2762:1: rule__Interface__Group_2_1__0 : rule__Interface__Group_2_1__0__Impl rule__Interface__Group_2_1__1 ;
    public final void rule__Interface__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2766:1: ( rule__Interface__Group_2_1__0__Impl rule__Interface__Group_2_1__1 )
            // InternalCls.g:2767:2: rule__Interface__Group_2_1__0__Impl rule__Interface__Group_2_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Interface__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_1__0"


    // $ANTLR start "rule__Interface__Group_2_1__0__Impl"
    // InternalCls.g:2774:1: rule__Interface__Group_2_1__0__Impl : ( ( rule__Interface__ReferencedElementAssignment_2_1_0 ) ) ;
    public final void rule__Interface__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2778:1: ( ( ( rule__Interface__ReferencedElementAssignment_2_1_0 ) ) )
            // InternalCls.g:2779:1: ( ( rule__Interface__ReferencedElementAssignment_2_1_0 ) )
            {
            // InternalCls.g:2779:1: ( ( rule__Interface__ReferencedElementAssignment_2_1_0 ) )
            // InternalCls.g:2780:1: ( rule__Interface__ReferencedElementAssignment_2_1_0 )
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementAssignment_2_1_0()); 
            // InternalCls.g:2781:1: ( rule__Interface__ReferencedElementAssignment_2_1_0 )
            // InternalCls.g:2781:2: rule__Interface__ReferencedElementAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__ReferencedElementAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getReferencedElementAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_1__0__Impl"


    // $ANTLR start "rule__Interface__Group_2_1__1"
    // InternalCls.g:2791:1: rule__Interface__Group_2_1__1 : rule__Interface__Group_2_1__1__Impl rule__Interface__Group_2_1__2 ;
    public final void rule__Interface__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2795:1: ( rule__Interface__Group_2_1__1__Impl rule__Interface__Group_2_1__2 )
            // InternalCls.g:2796:2: rule__Interface__Group_2_1__1__Impl rule__Interface__Group_2_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Interface__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_1__1"


    // $ANTLR start "rule__Interface__Group_2_1__1__Impl"
    // InternalCls.g:2803:1: rule__Interface__Group_2_1__1__Impl : ( 'as' ) ;
    public final void rule__Interface__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2807:1: ( ( 'as' ) )
            // InternalCls.g:2808:1: ( 'as' )
            {
            // InternalCls.g:2808:1: ( 'as' )
            // InternalCls.g:2809:1: 'as'
            {
             before(grammarAccess.getInterfaceAccess().getAsKeyword_2_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getAsKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_1__1__Impl"


    // $ANTLR start "rule__Interface__Group_2_1__2"
    // InternalCls.g:2822:1: rule__Interface__Group_2_1__2 : rule__Interface__Group_2_1__2__Impl ;
    public final void rule__Interface__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2826:1: ( rule__Interface__Group_2_1__2__Impl )
            // InternalCls.g:2827:2: rule__Interface__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_1__2"


    // $ANTLR start "rule__Interface__Group_2_1__2__Impl"
    // InternalCls.g:2833:1: rule__Interface__Group_2_1__2__Impl : ( ( rule__Interface__AliasExpressionAssignment_2_1_2 ) ) ;
    public final void rule__Interface__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2837:1: ( ( ( rule__Interface__AliasExpressionAssignment_2_1_2 ) ) )
            // InternalCls.g:2838:1: ( ( rule__Interface__AliasExpressionAssignment_2_1_2 ) )
            {
            // InternalCls.g:2838:1: ( ( rule__Interface__AliasExpressionAssignment_2_1_2 ) )
            // InternalCls.g:2839:1: ( rule__Interface__AliasExpressionAssignment_2_1_2 )
            {
             before(grammarAccess.getInterfaceAccess().getAliasExpressionAssignment_2_1_2()); 
            // InternalCls.g:2840:1: ( rule__Interface__AliasExpressionAssignment_2_1_2 )
            // InternalCls.g:2840:2: rule__Interface__AliasExpressionAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Interface__AliasExpressionAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getAliasExpressionAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_1__2__Impl"


    // $ANTLR start "rule__Interface__Group_3__0"
    // InternalCls.g:2856:1: rule__Interface__Group_3__0 : rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 ;
    public final void rule__Interface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2860:1: ( rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 )
            // InternalCls.g:2861:2: rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Interface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__0"


    // $ANTLR start "rule__Interface__Group_3__0__Impl"
    // InternalCls.g:2868:1: rule__Interface__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Interface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2872:1: ( ( '{' ) )
            // InternalCls.g:2873:1: ( '{' )
            {
            // InternalCls.g:2873:1: ( '{' )
            // InternalCls.g:2874:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__0__Impl"


    // $ANTLR start "rule__Interface__Group_3__1"
    // InternalCls.g:2887:1: rule__Interface__Group_3__1 : rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 ;
    public final void rule__Interface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2891:1: ( rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 )
            // InternalCls.g:2892:2: rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__Interface__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__1"


    // $ANTLR start "rule__Interface__Group_3__1__Impl"
    // InternalCls.g:2899:1: rule__Interface__Group_3__1__Impl : ( ( rule__Interface__MembersAssignment_3_1 )* ) ;
    public final void rule__Interface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2903:1: ( ( ( rule__Interface__MembersAssignment_3_1 )* ) )
            // InternalCls.g:2904:1: ( ( rule__Interface__MembersAssignment_3_1 )* )
            {
            // InternalCls.g:2904:1: ( ( rule__Interface__MembersAssignment_3_1 )* )
            // InternalCls.g:2905:1: ( rule__Interface__MembersAssignment_3_1 )*
            {
             before(grammarAccess.getInterfaceAccess().getMembersAssignment_3_1()); 
            // InternalCls.g:2906:1: ( rule__Interface__MembersAssignment_3_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=12 && LA30_0<=18)||(LA30_0>=54 && LA30_0<=56)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCls.g:2906:2: rule__Interface__MembersAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Interface__MembersAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getMembersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__1__Impl"


    // $ANTLR start "rule__Interface__Group_3__2"
    // InternalCls.g:2916:1: rule__Interface__Group_3__2 : rule__Interface__Group_3__2__Impl ;
    public final void rule__Interface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2920:1: ( rule__Interface__Group_3__2__Impl )
            // InternalCls.g:2921:2: rule__Interface__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__2"


    // $ANTLR start "rule__Interface__Group_3__2__Impl"
    // InternalCls.g:2927:1: rule__Interface__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Interface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2931:1: ( ( '}' ) )
            // InternalCls.g:2932:1: ( '}' )
            {
            // InternalCls.g:2932:1: ( '}' )
            // InternalCls.g:2933:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalCls.g:2952:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2956:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalCls.g:2957:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:2964:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2968:1: ( ( () ) )
            // InternalCls.g:2969:1: ( () )
            {
            // InternalCls.g:2969:1: ( () )
            // InternalCls.g:2970:1: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalCls.g:2971:1: ()
            // InternalCls.g:2973:1: 
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
    // InternalCls.g:2983:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2987:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalCls.g:2988:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:2995:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__VisibilityAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:2999:1: ( ( ( rule__Attribute__VisibilityAssignment_1 )? ) )
            // InternalCls.g:3000:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            {
            // InternalCls.g:3000:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            // InternalCls.g:3001:1: ( rule__Attribute__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 
            // InternalCls.g:3002:1: ( rule__Attribute__VisibilityAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=12 && LA31_0<=18)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCls.g:3002:2: rule__Attribute__VisibilityAssignment_1
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
    // InternalCls.g:3012:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3016:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalCls.g:3017:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:3024:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__StaticAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3028:1: ( ( ( rule__Attribute__StaticAssignment_2 )? ) )
            // InternalCls.g:3029:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            {
            // InternalCls.g:3029:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            // InternalCls.g:3030:1: ( rule__Attribute__StaticAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getStaticAssignment_2()); 
            // InternalCls.g:3031:1: ( rule__Attribute__StaticAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCls.g:3031:2: rule__Attribute__StaticAssignment_2
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
    // InternalCls.g:3041:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3045:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalCls.g:3046:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:3053:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__FinalAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3057:1: ( ( ( rule__Attribute__FinalAssignment_3 )? ) )
            // InternalCls.g:3058:1: ( ( rule__Attribute__FinalAssignment_3 )? )
            {
            // InternalCls.g:3058:1: ( ( rule__Attribute__FinalAssignment_3 )? )
            // InternalCls.g:3059:1: ( rule__Attribute__FinalAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getFinalAssignment_3()); 
            // InternalCls.g:3060:1: ( rule__Attribute__FinalAssignment_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:3060:2: rule__Attribute__FinalAssignment_3
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
    // InternalCls.g:3070:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3074:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalCls.g:3075:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:3082:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__ReferencedElementAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3086:1: ( ( ( rule__Attribute__ReferencedElementAssignment_4 ) ) )
            // InternalCls.g:3087:1: ( ( rule__Attribute__ReferencedElementAssignment_4 ) )
            {
            // InternalCls.g:3087:1: ( ( rule__Attribute__ReferencedElementAssignment_4 ) )
            // InternalCls.g:3088:1: ( rule__Attribute__ReferencedElementAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getReferencedElementAssignment_4()); 
            // InternalCls.g:3089:1: ( rule__Attribute__ReferencedElementAssignment_4 )
            // InternalCls.g:3089:2: rule__Attribute__ReferencedElementAssignment_4
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
    // InternalCls.g:3099:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3103:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalCls.g:3104:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:3111:1: rule__Attribute__Group__5__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3115:1: ( ( ':' ) )
            // InternalCls.g:3116:1: ( ':' )
            {
            // InternalCls.g:3116:1: ( ':' )
            // InternalCls.g:3117:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_5()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCls.g:3130:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3134:1: ( rule__Attribute__Group__6__Impl )
            // InternalCls.g:3135:2: rule__Attribute__Group__6__Impl
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
    // InternalCls.g:3141:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__TypeAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3145:1: ( ( ( rule__Attribute__TypeAssignment_6 ) ) )
            // InternalCls.g:3146:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            {
            // InternalCls.g:3146:1: ( ( rule__Attribute__TypeAssignment_6 ) )
            // InternalCls.g:3147:1: ( rule__Attribute__TypeAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_6()); 
            // InternalCls.g:3148:1: ( rule__Attribute__TypeAssignment_6 )
            // InternalCls.g:3148:2: rule__Attribute__TypeAssignment_6
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
    // InternalCls.g:3172:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3176:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalCls.g:3177:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalCls.g:3184:1: rule__Method__Group__0__Impl : ( ( rule__Method__VisibilityAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3188:1: ( ( ( rule__Method__VisibilityAssignment_0 )? ) )
            // InternalCls.g:3189:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:3189:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            // InternalCls.g:3190:1: ( rule__Method__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:3191:1: ( rule__Method__VisibilityAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=12 && LA34_0<=18)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCls.g:3191:2: rule__Method__VisibilityAssignment_0
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
    // InternalCls.g:3201:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3205:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalCls.g:3206:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalCls.g:3213:1: rule__Method__Group__1__Impl : ( ( rule__Method__AbstractAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3217:1: ( ( ( rule__Method__AbstractAssignment_1 )? ) )
            // InternalCls.g:3218:1: ( ( rule__Method__AbstractAssignment_1 )? )
            {
            // InternalCls.g:3218:1: ( ( rule__Method__AbstractAssignment_1 )? )
            // InternalCls.g:3219:1: ( rule__Method__AbstractAssignment_1 )?
            {
             before(grammarAccess.getMethodAccess().getAbstractAssignment_1()); 
            // InternalCls.g:3220:1: ( rule__Method__AbstractAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:3220:2: rule__Method__AbstractAssignment_1
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
    // InternalCls.g:3230:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3234:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalCls.g:3235:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalCls.g:3242:1: rule__Method__Group__2__Impl : ( ( rule__Method__StaticAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3246:1: ( ( ( rule__Method__StaticAssignment_2 )? ) )
            // InternalCls.g:3247:1: ( ( rule__Method__StaticAssignment_2 )? )
            {
            // InternalCls.g:3247:1: ( ( rule__Method__StaticAssignment_2 )? )
            // InternalCls.g:3248:1: ( rule__Method__StaticAssignment_2 )?
            {
             before(grammarAccess.getMethodAccess().getStaticAssignment_2()); 
            // InternalCls.g:3249:1: ( rule__Method__StaticAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCls.g:3249:2: rule__Method__StaticAssignment_2
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
    // InternalCls.g:3259:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3263:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalCls.g:3264:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalCls.g:3271:1: rule__Method__Group__3__Impl : ( ( rule__Method__FinalAssignment_3 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3275:1: ( ( ( rule__Method__FinalAssignment_3 )? ) )
            // InternalCls.g:3276:1: ( ( rule__Method__FinalAssignment_3 )? )
            {
            // InternalCls.g:3276:1: ( ( rule__Method__FinalAssignment_3 )? )
            // InternalCls.g:3277:1: ( rule__Method__FinalAssignment_3 )?
            {
             before(grammarAccess.getMethodAccess().getFinalAssignment_3()); 
            // InternalCls.g:3278:1: ( rule__Method__FinalAssignment_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==56) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCls.g:3278:2: rule__Method__FinalAssignment_3
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
    // InternalCls.g:3288:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3292:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalCls.g:3293:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalCls.g:3300:1: rule__Method__Group__4__Impl : ( ( rule__Method__ReferencedElementAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3304:1: ( ( ( rule__Method__ReferencedElementAssignment_4 ) ) )
            // InternalCls.g:3305:1: ( ( rule__Method__ReferencedElementAssignment_4 ) )
            {
            // InternalCls.g:3305:1: ( ( rule__Method__ReferencedElementAssignment_4 ) )
            // InternalCls.g:3306:1: ( rule__Method__ReferencedElementAssignment_4 )
            {
             before(grammarAccess.getMethodAccess().getReferencedElementAssignment_4()); 
            // InternalCls.g:3307:1: ( rule__Method__ReferencedElementAssignment_4 )
            // InternalCls.g:3307:2: rule__Method__ReferencedElementAssignment_4
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
    // InternalCls.g:3317:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3321:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalCls.g:3322:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalCls.g:3329:1: rule__Method__Group__5__Impl : ( '(' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3333:1: ( ( '(' ) )
            // InternalCls.g:3334:1: ( '(' )
            {
            // InternalCls.g:3334:1: ( '(' )
            // InternalCls.g:3335:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCls.g:3348:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3352:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalCls.g:3353:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalCls.g:3360:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )* ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3364:1: ( ( ( rule__Method__Group_6__0 )* ) )
            // InternalCls.g:3365:1: ( ( rule__Method__Group_6__0 )* )
            {
            // InternalCls.g:3365:1: ( ( rule__Method__Group_6__0 )* )
            // InternalCls.g:3366:1: ( rule__Method__Group_6__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalCls.g:3367:1: ( rule__Method__Group_6__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||(LA38_0>=12 && LA38_0<=18)||(LA38_0>=55 && LA38_0<=56)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCls.g:3367:2: rule__Method__Group_6__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Method__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalCls.g:3377:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3381:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalCls.g:3382:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:3389:1: rule__Method__Group__7__Impl : ( ')' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3393:1: ( ( ')' ) )
            // InternalCls.g:3394:1: ( ')' )
            {
            // InternalCls.g:3394:1: ( ')' )
            // InternalCls.g:3395:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCls.g:3408:1: rule__Method__Group__8 : rule__Method__Group__8__Impl ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3412:1: ( rule__Method__Group__8__Impl )
            // InternalCls.g:3413:2: rule__Method__Group__8__Impl
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
    // InternalCls.g:3419:1: rule__Method__Group__8__Impl : ( ( rule__Method__Group_8__0 )? ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3423:1: ( ( ( rule__Method__Group_8__0 )? ) )
            // InternalCls.g:3424:1: ( ( rule__Method__Group_8__0 )? )
            {
            // InternalCls.g:3424:1: ( ( rule__Method__Group_8__0 )? )
            // InternalCls.g:3425:1: ( rule__Method__Group_8__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_8()); 
            // InternalCls.g:3426:1: ( rule__Method__Group_8__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCls.g:3426:2: rule__Method__Group_8__0
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
    // InternalCls.g:3454:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3458:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalCls.g:3459:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCls.g:3466:1: rule__Method__Group_6__0__Impl : ( ( rule__Method__ParametersAssignment_6_0 ) ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3470:1: ( ( ( rule__Method__ParametersAssignment_6_0 ) ) )
            // InternalCls.g:3471:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            {
            // InternalCls.g:3471:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            // InternalCls.g:3472:1: ( rule__Method__ParametersAssignment_6_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_0()); 
            // InternalCls.g:3473:1: ( rule__Method__ParametersAssignment_6_0 )
            // InternalCls.g:3473:2: rule__Method__ParametersAssignment_6_0
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
    // InternalCls.g:3483:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3487:1: ( rule__Method__Group_6__1__Impl )
            // InternalCls.g:3488:2: rule__Method__Group_6__1__Impl
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
    // InternalCls.g:3494:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Group_6_1__0 )* ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3498:1: ( ( ( rule__Method__Group_6_1__0 )* ) )
            // InternalCls.g:3499:1: ( ( rule__Method__Group_6_1__0 )* )
            {
            // InternalCls.g:3499:1: ( ( rule__Method__Group_6_1__0 )* )
            // InternalCls.g:3500:1: ( rule__Method__Group_6_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6_1()); 
            // InternalCls.g:3501:1: ( rule__Method__Group_6_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==45) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCls.g:3501:2: rule__Method__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Method__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalCls.g:3515:1: rule__Method__Group_6_1__0 : rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
    public final void rule__Method__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3519:1: ( rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
            // InternalCls.g:3520:2: rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:3527:1: rule__Method__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3531:1: ( ( ',' ) )
            // InternalCls.g:3532:1: ( ',' )
            {
            // InternalCls.g:3532:1: ( ',' )
            // InternalCls.g:3533:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_6_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCls.g:3546:1: rule__Method__Group_6_1__1 : rule__Method__Group_6_1__1__Impl ;
    public final void rule__Method__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3550:1: ( rule__Method__Group_6_1__1__Impl )
            // InternalCls.g:3551:2: rule__Method__Group_6_1__1__Impl
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
    // InternalCls.g:3557:1: rule__Method__Group_6_1__1__Impl : ( ( rule__Method__ParametersAssignment_6_1_1 ) ) ;
    public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3561:1: ( ( ( rule__Method__ParametersAssignment_6_1_1 ) ) )
            // InternalCls.g:3562:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            {
            // InternalCls.g:3562:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            // InternalCls.g:3563:1: ( rule__Method__ParametersAssignment_6_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_1_1()); 
            // InternalCls.g:3564:1: ( rule__Method__ParametersAssignment_6_1_1 )
            // InternalCls.g:3564:2: rule__Method__ParametersAssignment_6_1_1
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
    // InternalCls.g:3578:1: rule__Method__Group_8__0 : rule__Method__Group_8__0__Impl rule__Method__Group_8__1 ;
    public final void rule__Method__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3582:1: ( rule__Method__Group_8__0__Impl rule__Method__Group_8__1 )
            // InternalCls.g:3583:2: rule__Method__Group_8__0__Impl rule__Method__Group_8__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:3590:1: rule__Method__Group_8__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3594:1: ( ( ':' ) )
            // InternalCls.g:3595:1: ( ':' )
            {
            // InternalCls.g:3595:1: ( ':' )
            // InternalCls.g:3596:1: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_8_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCls.g:3609:1: rule__Method__Group_8__1 : rule__Method__Group_8__1__Impl ;
    public final void rule__Method__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3613:1: ( rule__Method__Group_8__1__Impl )
            // InternalCls.g:3614:2: rule__Method__Group_8__1__Impl
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
    // InternalCls.g:3620:1: rule__Method__Group_8__1__Impl : ( ( rule__Method__TypeAssignment_8_1 ) ) ;
    public final void rule__Method__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3624:1: ( ( ( rule__Method__TypeAssignment_8_1 ) ) )
            // InternalCls.g:3625:1: ( ( rule__Method__TypeAssignment_8_1 ) )
            {
            // InternalCls.g:3625:1: ( ( rule__Method__TypeAssignment_8_1 ) )
            // InternalCls.g:3626:1: ( rule__Method__TypeAssignment_8_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_8_1()); 
            // InternalCls.g:3627:1: ( rule__Method__TypeAssignment_8_1 )
            // InternalCls.g:3627:2: rule__Method__TypeAssignment_8_1
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
    // InternalCls.g:3641:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3645:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCls.g:3646:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:3653:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__VisibilityAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3657:1: ( ( ( rule__Parameter__VisibilityAssignment_0 )? ) )
            // InternalCls.g:3658:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:3658:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            // InternalCls.g:3659:1: ( rule__Parameter__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:3660:1: ( rule__Parameter__VisibilityAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=12 && LA41_0<=18)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCls.g:3660:2: rule__Parameter__VisibilityAssignment_0
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
    // InternalCls.g:3670:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3674:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCls.g:3675:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:3682:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__StaticAssignment_1 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3686:1: ( ( ( rule__Parameter__StaticAssignment_1 )? ) )
            // InternalCls.g:3687:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            {
            // InternalCls.g:3687:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            // InternalCls.g:3688:1: ( rule__Parameter__StaticAssignment_1 )?
            {
             before(grammarAccess.getParameterAccess().getStaticAssignment_1()); 
            // InternalCls.g:3689:1: ( rule__Parameter__StaticAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCls.g:3689:2: rule__Parameter__StaticAssignment_1
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
    // InternalCls.g:3699:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3703:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCls.g:3704:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:3711:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__FinalAssignment_2 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3715:1: ( ( ( rule__Parameter__FinalAssignment_2 )? ) )
            // InternalCls.g:3716:1: ( ( rule__Parameter__FinalAssignment_2 )? )
            {
            // InternalCls.g:3716:1: ( ( rule__Parameter__FinalAssignment_2 )? )
            // InternalCls.g:3717:1: ( rule__Parameter__FinalAssignment_2 )?
            {
             before(grammarAccess.getParameterAccess().getFinalAssignment_2()); 
            // InternalCls.g:3718:1: ( rule__Parameter__FinalAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCls.g:3718:2: rule__Parameter__FinalAssignment_2
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
    // InternalCls.g:3728:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3732:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalCls.g:3733:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:3740:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ReferencedElementAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3744:1: ( ( ( rule__Parameter__ReferencedElementAssignment_3 ) ) )
            // InternalCls.g:3745:1: ( ( rule__Parameter__ReferencedElementAssignment_3 ) )
            {
            // InternalCls.g:3745:1: ( ( rule__Parameter__ReferencedElementAssignment_3 ) )
            // InternalCls.g:3746:1: ( rule__Parameter__ReferencedElementAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getReferencedElementAssignment_3()); 
            // InternalCls.g:3747:1: ( rule__Parameter__ReferencedElementAssignment_3 )
            // InternalCls.g:3747:2: rule__Parameter__ReferencedElementAssignment_3
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
    // InternalCls.g:3757:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3761:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalCls.g:3762:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:3769:1: rule__Parameter__Group__4__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3773:1: ( ( ':' ) )
            // InternalCls.g:3774:1: ( ':' )
            {
            // InternalCls.g:3774:1: ( ':' )
            // InternalCls.g:3775:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCls.g:3788:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3792:1: ( rule__Parameter__Group__5__Impl )
            // InternalCls.g:3793:2: rule__Parameter__Group__5__Impl
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
    // InternalCls.g:3799:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__TypeAssignment_5 ) ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3803:1: ( ( ( rule__Parameter__TypeAssignment_5 ) ) )
            // InternalCls.g:3804:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            {
            // InternalCls.g:3804:1: ( ( rule__Parameter__TypeAssignment_5 ) )
            // InternalCls.g:3805:1: ( rule__Parameter__TypeAssignment_5 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_5()); 
            // InternalCls.g:3806:1: ( rule__Parameter__TypeAssignment_5 )
            // InternalCls.g:3806:2: rule__Parameter__TypeAssignment_5
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
    // InternalCls.g:3828:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3832:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalCls.g:3833:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalCls.g:3840:1: rule__Generalization__Group__0__Impl : ( ( rule__Generalization__LeftAssignment_0 ) ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3844:1: ( ( ( rule__Generalization__LeftAssignment_0 ) ) )
            // InternalCls.g:3845:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            {
            // InternalCls.g:3845:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            // InternalCls.g:3846:1: ( rule__Generalization__LeftAssignment_0 )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssignment_0()); 
            // InternalCls.g:3847:1: ( rule__Generalization__LeftAssignment_0 )
            // InternalCls.g:3847:2: rule__Generalization__LeftAssignment_0
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
    // InternalCls.g:3857:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3861:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalCls.g:3862:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:3869:1: rule__Generalization__Group__1__Impl : ( 'isa' ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3873:1: ( ( 'isa' ) )
            // InternalCls.g:3874:1: ( 'isa' )
            {
            // InternalCls.g:3874:1: ( 'isa' )
            // InternalCls.g:3875:1: 'isa'
            {
             before(grammarAccess.getGeneralizationAccess().getIsaKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCls.g:3888:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3892:1: ( rule__Generalization__Group__2__Impl )
            // InternalCls.g:3893:2: rule__Generalization__Group__2__Impl
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
    // InternalCls.g:3899:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__RightAssignment_2 ) ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3903:1: ( ( ( rule__Generalization__RightAssignment_2 ) ) )
            // InternalCls.g:3904:1: ( ( rule__Generalization__RightAssignment_2 ) )
            {
            // InternalCls.g:3904:1: ( ( rule__Generalization__RightAssignment_2 ) )
            // InternalCls.g:3905:1: ( rule__Generalization__RightAssignment_2 )
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssignment_2()); 
            // InternalCls.g:3906:1: ( rule__Generalization__RightAssignment_2 )
            // InternalCls.g:3906:2: rule__Generalization__RightAssignment_2
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
    // InternalCls.g:3922:1: rule__Implementation__Group__0 : rule__Implementation__Group__0__Impl rule__Implementation__Group__1 ;
    public final void rule__Implementation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3926:1: ( rule__Implementation__Group__0__Impl rule__Implementation__Group__1 )
            // InternalCls.g:3927:2: rule__Implementation__Group__0__Impl rule__Implementation__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalCls.g:3934:1: rule__Implementation__Group__0__Impl : ( ( rule__Implementation__LeftAssignment_0 ) ) ;
    public final void rule__Implementation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3938:1: ( ( ( rule__Implementation__LeftAssignment_0 ) ) )
            // InternalCls.g:3939:1: ( ( rule__Implementation__LeftAssignment_0 ) )
            {
            // InternalCls.g:3939:1: ( ( rule__Implementation__LeftAssignment_0 ) )
            // InternalCls.g:3940:1: ( rule__Implementation__LeftAssignment_0 )
            {
             before(grammarAccess.getImplementationAccess().getLeftAssignment_0()); 
            // InternalCls.g:3941:1: ( rule__Implementation__LeftAssignment_0 )
            // InternalCls.g:3941:2: rule__Implementation__LeftAssignment_0
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
    // InternalCls.g:3951:1: rule__Implementation__Group__1 : rule__Implementation__Group__1__Impl rule__Implementation__Group__2 ;
    public final void rule__Implementation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3955:1: ( rule__Implementation__Group__1__Impl rule__Implementation__Group__2 )
            // InternalCls.g:3956:2: rule__Implementation__Group__1__Impl rule__Implementation__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:3963:1: rule__Implementation__Group__1__Impl : ( 'impl' ) ;
    public final void rule__Implementation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3967:1: ( ( 'impl' ) )
            // InternalCls.g:3968:1: ( 'impl' )
            {
            // InternalCls.g:3968:1: ( 'impl' )
            // InternalCls.g:3969:1: 'impl'
            {
             before(grammarAccess.getImplementationAccess().getImplKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCls.g:3982:1: rule__Implementation__Group__2 : rule__Implementation__Group__2__Impl ;
    public final void rule__Implementation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3986:1: ( rule__Implementation__Group__2__Impl )
            // InternalCls.g:3987:2: rule__Implementation__Group__2__Impl
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
    // InternalCls.g:3993:1: rule__Implementation__Group__2__Impl : ( ( rule__Implementation__RightAssignment_2 ) ) ;
    public final void rule__Implementation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:3997:1: ( ( ( rule__Implementation__RightAssignment_2 ) ) )
            // InternalCls.g:3998:1: ( ( rule__Implementation__RightAssignment_2 ) )
            {
            // InternalCls.g:3998:1: ( ( rule__Implementation__RightAssignment_2 ) )
            // InternalCls.g:3999:1: ( rule__Implementation__RightAssignment_2 )
            {
             before(grammarAccess.getImplementationAccess().getRightAssignment_2()); 
            // InternalCls.g:4000:1: ( rule__Implementation__RightAssignment_2 )
            // InternalCls.g:4000:2: rule__Implementation__RightAssignment_2
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
    // InternalCls.g:4016:1: rule__CommentLink__Group__0 : rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1 ;
    public final void rule__CommentLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4020:1: ( rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1 )
            // InternalCls.g:4021:2: rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:4028:1: rule__CommentLink__Group__0__Impl : ( ( rule__CommentLink__LeftAssignment_0 ) ) ;
    public final void rule__CommentLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4032:1: ( ( ( rule__CommentLink__LeftAssignment_0 ) ) )
            // InternalCls.g:4033:1: ( ( rule__CommentLink__LeftAssignment_0 ) )
            {
            // InternalCls.g:4033:1: ( ( rule__CommentLink__LeftAssignment_0 ) )
            // InternalCls.g:4034:1: ( rule__CommentLink__LeftAssignment_0 )
            {
             before(grammarAccess.getCommentLinkAccess().getLeftAssignment_0()); 
            // InternalCls.g:4035:1: ( rule__CommentLink__LeftAssignment_0 )
            // InternalCls.g:4035:2: rule__CommentLink__LeftAssignment_0
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
    // InternalCls.g:4045:1: rule__CommentLink__Group__1 : rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2 ;
    public final void rule__CommentLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4049:1: ( rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2 )
            // InternalCls.g:4050:2: rule__CommentLink__Group__1__Impl rule__CommentLink__Group__2
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
    // InternalCls.g:4057:1: rule__CommentLink__Group__1__Impl : ( 'note' ) ;
    public final void rule__CommentLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4061:1: ( ( 'note' ) )
            // InternalCls.g:4062:1: ( 'note' )
            {
            // InternalCls.g:4062:1: ( 'note' )
            // InternalCls.g:4063:1: 'note'
            {
             before(grammarAccess.getCommentLinkAccess().getNoteKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCls.g:4076:1: rule__CommentLink__Group__2 : rule__CommentLink__Group__2__Impl ;
    public final void rule__CommentLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4080:1: ( rule__CommentLink__Group__2__Impl )
            // InternalCls.g:4081:2: rule__CommentLink__Group__2__Impl
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
    // InternalCls.g:4087:1: rule__CommentLink__Group__2__Impl : ( ( rule__CommentLink__CommentAssignment_2 ) ) ;
    public final void rule__CommentLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4091:1: ( ( ( rule__CommentLink__CommentAssignment_2 ) ) )
            // InternalCls.g:4092:1: ( ( rule__CommentLink__CommentAssignment_2 ) )
            {
            // InternalCls.g:4092:1: ( ( rule__CommentLink__CommentAssignment_2 ) )
            // InternalCls.g:4093:1: ( rule__CommentLink__CommentAssignment_2 )
            {
             before(grammarAccess.getCommentLinkAccess().getCommentAssignment_2()); 
            // InternalCls.g:4094:1: ( rule__CommentLink__CommentAssignment_2 )
            // InternalCls.g:4094:2: rule__CommentLink__CommentAssignment_2
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
    // InternalCls.g:4110:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4114:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalCls.g:4115:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalCls.g:4122:1: rule__Association__Group__0__Impl : ( ( rule__Association__BidirectionalAssignment_0 )? ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4126:1: ( ( ( rule__Association__BidirectionalAssignment_0 )? ) )
            // InternalCls.g:4127:1: ( ( rule__Association__BidirectionalAssignment_0 )? )
            {
            // InternalCls.g:4127:1: ( ( rule__Association__BidirectionalAssignment_0 )? )
            // InternalCls.g:4128:1: ( rule__Association__BidirectionalAssignment_0 )?
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalAssignment_0()); 
            // InternalCls.g:4129:1: ( rule__Association__BidirectionalAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==57) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCls.g:4129:2: rule__Association__BidirectionalAssignment_0
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
    // InternalCls.g:4139:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4143:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalCls.g:4144:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:4151:1: rule__Association__Group__1__Impl : ( ( rule__Association__AggregationKindAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4155:1: ( ( ( rule__Association__AggregationKindAssignment_1 ) ) )
            // InternalCls.g:4156:1: ( ( rule__Association__AggregationKindAssignment_1 ) )
            {
            // InternalCls.g:4156:1: ( ( rule__Association__AggregationKindAssignment_1 ) )
            // InternalCls.g:4157:1: ( rule__Association__AggregationKindAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getAggregationKindAssignment_1()); 
            // InternalCls.g:4158:1: ( rule__Association__AggregationKindAssignment_1 )
            // InternalCls.g:4158:2: rule__Association__AggregationKindAssignment_1
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
    // InternalCls.g:4168:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4172:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalCls.g:4173:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:4180:1: rule__Association__Group__2__Impl : ( ( rule__Association__LeftAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4184:1: ( ( ( rule__Association__LeftAssignment_2 ) ) )
            // InternalCls.g:4185:1: ( ( rule__Association__LeftAssignment_2 ) )
            {
            // InternalCls.g:4185:1: ( ( rule__Association__LeftAssignment_2 ) )
            // InternalCls.g:4186:1: ( rule__Association__LeftAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getLeftAssignment_2()); 
            // InternalCls.g:4187:1: ( rule__Association__LeftAssignment_2 )
            // InternalCls.g:4187:2: rule__Association__LeftAssignment_2
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
    // InternalCls.g:4197:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4201:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalCls.g:4202:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:4209:1: rule__Association__Group__3__Impl : ( ( rule__Association__Alternatives_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4213:1: ( ( ( rule__Association__Alternatives_3 ) ) )
            // InternalCls.g:4214:1: ( ( rule__Association__Alternatives_3 ) )
            {
            // InternalCls.g:4214:1: ( ( rule__Association__Alternatives_3 ) )
            // InternalCls.g:4215:1: ( rule__Association__Alternatives_3 )
            {
             before(grammarAccess.getAssociationAccess().getAlternatives_3()); 
            // InternalCls.g:4216:1: ( rule__Association__Alternatives_3 )
            // InternalCls.g:4216:2: rule__Association__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Association__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalCls.g:4226:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4230:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalCls.g:4231:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalCls.g:4238:1: rule__Association__Group__4__Impl : ( ( rule__Association__RightAssignment_4 ) ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4242:1: ( ( ( rule__Association__RightAssignment_4 ) ) )
            // InternalCls.g:4243:1: ( ( rule__Association__RightAssignment_4 ) )
            {
            // InternalCls.g:4243:1: ( ( rule__Association__RightAssignment_4 ) )
            // InternalCls.g:4244:1: ( rule__Association__RightAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getRightAssignment_4()); 
            // InternalCls.g:4245:1: ( rule__Association__RightAssignment_4 )
            // InternalCls.g:4245:2: rule__Association__RightAssignment_4
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
    // InternalCls.g:4255:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4259:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalCls.g:4260:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalCls.g:4267:1: rule__Association__Group__5__Impl : ( ( rule__Association__PropertiesAssignment_5 )? ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4271:1: ( ( ( rule__Association__PropertiesAssignment_5 )? ) )
            // InternalCls.g:4272:1: ( ( rule__Association__PropertiesAssignment_5 )? )
            {
            // InternalCls.g:4272:1: ( ( rule__Association__PropertiesAssignment_5 )? )
            // InternalCls.g:4273:1: ( rule__Association__PropertiesAssignment_5 )?
            {
             before(grammarAccess.getAssociationAccess().getPropertiesAssignment_5()); 
            // InternalCls.g:4274:1: ( rule__Association__PropertiesAssignment_5 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCls.g:4274:2: rule__Association__PropertiesAssignment_5
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
    // InternalCls.g:4284:1: rule__Association__Group__6 : rule__Association__Group__6__Impl ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4288:1: ( rule__Association__Group__6__Impl )
            // InternalCls.g:4289:2: rule__Association__Group__6__Impl
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
    // InternalCls.g:4295:1: rule__Association__Group__6__Impl : ( ( rule__Association__Group_6__0 )? ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4299:1: ( ( ( rule__Association__Group_6__0 )? ) )
            // InternalCls.g:4300:1: ( ( rule__Association__Group_6__0 )? )
            {
            // InternalCls.g:4300:1: ( ( rule__Association__Group_6__0 )? )
            // InternalCls.g:4301:1: ( rule__Association__Group_6__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_6()); 
            // InternalCls.g:4302:1: ( rule__Association__Group_6__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCls.g:4302:2: rule__Association__Group_6__0
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
    // InternalCls.g:4326:1: rule__Association__Group_6__0 : rule__Association__Group_6__0__Impl rule__Association__Group_6__1 ;
    public final void rule__Association__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4330:1: ( rule__Association__Group_6__0__Impl rule__Association__Group_6__1 )
            // InternalCls.g:4331:2: rule__Association__Group_6__0__Impl rule__Association__Group_6__1
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
    // InternalCls.g:4338:1: rule__Association__Group_6__0__Impl : ( 'note' ) ;
    public final void rule__Association__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4342:1: ( ( 'note' ) )
            // InternalCls.g:4343:1: ( 'note' )
            {
            // InternalCls.g:4343:1: ( 'note' )
            // InternalCls.g:4344:1: 'note'
            {
             before(grammarAccess.getAssociationAccess().getNoteKeyword_6_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCls.g:4357:1: rule__Association__Group_6__1 : rule__Association__Group_6__1__Impl ;
    public final void rule__Association__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4361:1: ( rule__Association__Group_6__1__Impl )
            // InternalCls.g:4362:2: rule__Association__Group_6__1__Impl
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
    // InternalCls.g:4368:1: rule__Association__Group_6__1__Impl : ( ( rule__Association__CommentAssignment_6_1 ) ) ;
    public final void rule__Association__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4372:1: ( ( ( rule__Association__CommentAssignment_6_1 ) ) )
            // InternalCls.g:4373:1: ( ( rule__Association__CommentAssignment_6_1 ) )
            {
            // InternalCls.g:4373:1: ( ( rule__Association__CommentAssignment_6_1 ) )
            // InternalCls.g:4374:1: ( rule__Association__CommentAssignment_6_1 )
            {
             before(grammarAccess.getAssociationAccess().getCommentAssignment_6_1()); 
            // InternalCls.g:4375:1: ( rule__Association__CommentAssignment_6_1 )
            // InternalCls.g:4375:2: rule__Association__CommentAssignment_6_1
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
    // InternalCls.g:4389:1: rule__MultiAssociation__Group__0 : rule__MultiAssociation__Group__0__Impl rule__MultiAssociation__Group__1 ;
    public final void rule__MultiAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4393:1: ( rule__MultiAssociation__Group__0__Impl rule__MultiAssociation__Group__1 )
            // InternalCls.g:4394:2: rule__MultiAssociation__Group__0__Impl rule__MultiAssociation__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:4401:1: rule__MultiAssociation__Group__0__Impl : ( 'asc' ) ;
    public final void rule__MultiAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4405:1: ( ( 'asc' ) )
            // InternalCls.g:4406:1: ( 'asc' )
            {
            // InternalCls.g:4406:1: ( 'asc' )
            // InternalCls.g:4407:1: 'asc'
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
    // InternalCls.g:4420:1: rule__MultiAssociation__Group__1 : rule__MultiAssociation__Group__1__Impl rule__MultiAssociation__Group__2 ;
    public final void rule__MultiAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4424:1: ( rule__MultiAssociation__Group__1__Impl rule__MultiAssociation__Group__2 )
            // InternalCls.g:4425:2: rule__MultiAssociation__Group__1__Impl rule__MultiAssociation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalCls.g:4432:1: rule__MultiAssociation__Group__1__Impl : ( ( rule__MultiAssociation__Alternatives_1 ) ) ;
    public final void rule__MultiAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4436:1: ( ( ( rule__MultiAssociation__Alternatives_1 ) ) )
            // InternalCls.g:4437:1: ( ( rule__MultiAssociation__Alternatives_1 ) )
            {
            // InternalCls.g:4437:1: ( ( rule__MultiAssociation__Alternatives_1 ) )
            // InternalCls.g:4438:1: ( rule__MultiAssociation__Alternatives_1 )
            {
             before(grammarAccess.getMultiAssociationAccess().getAlternatives_1()); 
            // InternalCls.g:4439:1: ( rule__MultiAssociation__Alternatives_1 )
            // InternalCls.g:4439:2: rule__MultiAssociation__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiAssociation__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiAssociationAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalCls.g:4449:1: rule__MultiAssociation__Group__2 : rule__MultiAssociation__Group__2__Impl rule__MultiAssociation__Group__3 ;
    public final void rule__MultiAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4453:1: ( rule__MultiAssociation__Group__2__Impl rule__MultiAssociation__Group__3 )
            // InternalCls.g:4454:2: rule__MultiAssociation__Group__2__Impl rule__MultiAssociation__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:4461:1: rule__MultiAssociation__Group__2__Impl : ( '{' ) ;
    public final void rule__MultiAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4465:1: ( ( '{' ) )
            // InternalCls.g:4466:1: ( '{' )
            {
            // InternalCls.g:4466:1: ( '{' )
            // InternalCls.g:4467:1: '{'
            {
             before(grammarAccess.getMultiAssociationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCls.g:4480:1: rule__MultiAssociation__Group__3 : rule__MultiAssociation__Group__3__Impl rule__MultiAssociation__Group__4 ;
    public final void rule__MultiAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4484:1: ( rule__MultiAssociation__Group__3__Impl rule__MultiAssociation__Group__4 )
            // InternalCls.g:4485:2: rule__MultiAssociation__Group__3__Impl rule__MultiAssociation__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalCls.g:4492:1: rule__MultiAssociation__Group__3__Impl : ( ( ( rule__MultiAssociation__Group_3__0 ) ) ( ( rule__MultiAssociation__Group_3__0 )* ) ) ;
    public final void rule__MultiAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4496:1: ( ( ( ( rule__MultiAssociation__Group_3__0 ) ) ( ( rule__MultiAssociation__Group_3__0 )* ) ) )
            // InternalCls.g:4497:1: ( ( ( rule__MultiAssociation__Group_3__0 ) ) ( ( rule__MultiAssociation__Group_3__0 )* ) )
            {
            // InternalCls.g:4497:1: ( ( ( rule__MultiAssociation__Group_3__0 ) ) ( ( rule__MultiAssociation__Group_3__0 )* ) )
            // InternalCls.g:4498:1: ( ( rule__MultiAssociation__Group_3__0 ) ) ( ( rule__MultiAssociation__Group_3__0 )* )
            {
            // InternalCls.g:4498:1: ( ( rule__MultiAssociation__Group_3__0 ) )
            // InternalCls.g:4499:1: ( rule__MultiAssociation__Group_3__0 )
            {
             before(grammarAccess.getMultiAssociationAccess().getGroup_3()); 
            // InternalCls.g:4500:1: ( rule__MultiAssociation__Group_3__0 )
            // InternalCls.g:4500:2: rule__MultiAssociation__Group_3__0
            {
            pushFollow(FOLLOW_38);
            rule__MultiAssociation__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiAssociationAccess().getGroup_3()); 

            }

            // InternalCls.g:4503:1: ( ( rule__MultiAssociation__Group_3__0 )* )
            // InternalCls.g:4504:1: ( rule__MultiAssociation__Group_3__0 )*
            {
             before(grammarAccess.getMultiAssociationAccess().getGroup_3()); 
            // InternalCls.g:4505:1: ( rule__MultiAssociation__Group_3__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalCls.g:4505:2: rule__MultiAssociation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__MultiAssociation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalCls.g:4516:1: rule__MultiAssociation__Group__4 : rule__MultiAssociation__Group__4__Impl ;
    public final void rule__MultiAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4520:1: ( rule__MultiAssociation__Group__4__Impl )
            // InternalCls.g:4521:2: rule__MultiAssociation__Group__4__Impl
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
    // InternalCls.g:4527:1: rule__MultiAssociation__Group__4__Impl : ( '}' ) ;
    public final void rule__MultiAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4531:1: ( ( '}' ) )
            // InternalCls.g:4532:1: ( '}' )
            {
            // InternalCls.g:4532:1: ( '}' )
            // InternalCls.g:4533:1: '}'
            {
             before(grammarAccess.getMultiAssociationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCls.g:4556:1: rule__MultiAssociation__Group_3__0 : rule__MultiAssociation__Group_3__0__Impl rule__MultiAssociation__Group_3__1 ;
    public final void rule__MultiAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4560:1: ( rule__MultiAssociation__Group_3__0__Impl rule__MultiAssociation__Group_3__1 )
            // InternalCls.g:4561:2: rule__MultiAssociation__Group_3__0__Impl rule__MultiAssociation__Group_3__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalCls.g:4568:1: rule__MultiAssociation__Group_3__0__Impl : ( ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 ) ) ;
    public final void rule__MultiAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4572:1: ( ( ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 ) ) )
            // InternalCls.g:4573:1: ( ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 ) )
            {
            // InternalCls.g:4573:1: ( ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 ) )
            // InternalCls.g:4574:1: ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 )
            {
             before(grammarAccess.getMultiAssociationAccess().getConnectorEndsAssignment_3_0()); 
            // InternalCls.g:4575:1: ( rule__MultiAssociation__ConnectorEndsAssignment_3_0 )
            // InternalCls.g:4575:2: rule__MultiAssociation__ConnectorEndsAssignment_3_0
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
    // InternalCls.g:4585:1: rule__MultiAssociation__Group_3__1 : rule__MultiAssociation__Group_3__1__Impl ;
    public final void rule__MultiAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4589:1: ( rule__MultiAssociation__Group_3__1__Impl )
            // InternalCls.g:4590:2: rule__MultiAssociation__Group_3__1__Impl
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
    // InternalCls.g:4596:1: rule__MultiAssociation__Group_3__1__Impl : ( ';' ) ;
    public final void rule__MultiAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4600:1: ( ( ';' ) )
            // InternalCls.g:4601:1: ( ';' )
            {
            // InternalCls.g:4601:1: ( ';' )
            // InternalCls.g:4602:1: ';'
            {
             before(grammarAccess.getMultiAssociationAccess().getSemicolonKeyword_3_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCls.g:4619:1: rule__MemberEnd__Group__0 : rule__MemberEnd__Group__0__Impl rule__MemberEnd__Group__1 ;
    public final void rule__MemberEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4623:1: ( rule__MemberEnd__Group__0__Impl rule__MemberEnd__Group__1 )
            // InternalCls.g:4624:2: rule__MemberEnd__Group__0__Impl rule__MemberEnd__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalCls.g:4631:1: rule__MemberEnd__Group__0__Impl : ( ( rule__MemberEnd__TypeAssignment_0 ) ) ;
    public final void rule__MemberEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4635:1: ( ( ( rule__MemberEnd__TypeAssignment_0 ) ) )
            // InternalCls.g:4636:1: ( ( rule__MemberEnd__TypeAssignment_0 ) )
            {
            // InternalCls.g:4636:1: ( ( rule__MemberEnd__TypeAssignment_0 ) )
            // InternalCls.g:4637:1: ( rule__MemberEnd__TypeAssignment_0 )
            {
             before(grammarAccess.getMemberEndAccess().getTypeAssignment_0()); 
            // InternalCls.g:4638:1: ( rule__MemberEnd__TypeAssignment_0 )
            // InternalCls.g:4638:2: rule__MemberEnd__TypeAssignment_0
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
    // InternalCls.g:4648:1: rule__MemberEnd__Group__1 : rule__MemberEnd__Group__1__Impl rule__MemberEnd__Group__2 ;
    public final void rule__MemberEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4652:1: ( rule__MemberEnd__Group__1__Impl rule__MemberEnd__Group__2 )
            // InternalCls.g:4653:2: rule__MemberEnd__Group__1__Impl rule__MemberEnd__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalCls.g:4660:1: rule__MemberEnd__Group__1__Impl : ( ( rule__MemberEnd__ReferencedElementAssignment_1 )? ) ;
    public final void rule__MemberEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4664:1: ( ( ( rule__MemberEnd__ReferencedElementAssignment_1 )? ) )
            // InternalCls.g:4665:1: ( ( rule__MemberEnd__ReferencedElementAssignment_1 )? )
            {
            // InternalCls.g:4665:1: ( ( rule__MemberEnd__ReferencedElementAssignment_1 )? )
            // InternalCls.g:4666:1: ( rule__MemberEnd__ReferencedElementAssignment_1 )?
            {
             before(grammarAccess.getMemberEndAccess().getReferencedElementAssignment_1()); 
            // InternalCls.g:4667:1: ( rule__MemberEnd__ReferencedElementAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCls.g:4667:2: rule__MemberEnd__ReferencedElementAssignment_1
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
    // InternalCls.g:4677:1: rule__MemberEnd__Group__2 : rule__MemberEnd__Group__2__Impl rule__MemberEnd__Group__3 ;
    public final void rule__MemberEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4681:1: ( rule__MemberEnd__Group__2__Impl rule__MemberEnd__Group__3 )
            // InternalCls.g:4682:2: rule__MemberEnd__Group__2__Impl rule__MemberEnd__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalCls.g:4689:1: rule__MemberEnd__Group__2__Impl : ( ( rule__MemberEnd__CardinalityAssignment_2 )? ) ;
    public final void rule__MemberEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4693:1: ( ( ( rule__MemberEnd__CardinalityAssignment_2 )? ) )
            // InternalCls.g:4694:1: ( ( rule__MemberEnd__CardinalityAssignment_2 )? )
            {
            // InternalCls.g:4694:1: ( ( rule__MemberEnd__CardinalityAssignment_2 )? )
            // InternalCls.g:4695:1: ( rule__MemberEnd__CardinalityAssignment_2 )?
            {
             before(grammarAccess.getMemberEndAccess().getCardinalityAssignment_2()); 
            // InternalCls.g:4696:1: ( rule__MemberEnd__CardinalityAssignment_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT||LA49_0==11) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCls.g:4696:2: rule__MemberEnd__CardinalityAssignment_2
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
    // InternalCls.g:4706:1: rule__MemberEnd__Group__3 : rule__MemberEnd__Group__3__Impl ;
    public final void rule__MemberEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4710:1: ( rule__MemberEnd__Group__3__Impl )
            // InternalCls.g:4711:2: rule__MemberEnd__Group__3__Impl
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
    // InternalCls.g:4717:1: rule__MemberEnd__Group__3__Impl : ( ( rule__MemberEnd__NavigableAssignment_3 )? ) ;
    public final void rule__MemberEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4721:1: ( ( ( rule__MemberEnd__NavigableAssignment_3 )? ) )
            // InternalCls.g:4722:1: ( ( rule__MemberEnd__NavigableAssignment_3 )? )
            {
            // InternalCls.g:4722:1: ( ( rule__MemberEnd__NavigableAssignment_3 )? )
            // InternalCls.g:4723:1: ( rule__MemberEnd__NavigableAssignment_3 )?
            {
             before(grammarAccess.getMemberEndAccess().getNavigableAssignment_3()); 
            // InternalCls.g:4724:1: ( rule__MemberEnd__NavigableAssignment_3 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==58) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCls.g:4724:2: rule__MemberEnd__NavigableAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberEnd__NavigableAssignment_3();

                    state._fsp--;


                    }
                    break;

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
    // InternalCls.g:4742:1: rule__AssociationProperties__Group__0 : rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1 ;
    public final void rule__AssociationProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4746:1: ( rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1 )
            // InternalCls.g:4747:2: rule__AssociationProperties__Group__0__Impl rule__AssociationProperties__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalCls.g:4754:1: rule__AssociationProperties__Group__0__Impl : ( '[' ) ;
    public final void rule__AssociationProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4758:1: ( ( '[' ) )
            // InternalCls.g:4759:1: ( '[' )
            {
            // InternalCls.g:4759:1: ( '[' )
            // InternalCls.g:4760:1: '['
            {
             before(grammarAccess.getAssociationPropertiesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCls.g:4773:1: rule__AssociationProperties__Group__1 : rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2 ;
    public final void rule__AssociationProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4777:1: ( rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2 )
            // InternalCls.g:4778:2: rule__AssociationProperties__Group__1__Impl rule__AssociationProperties__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalCls.g:4785:1: rule__AssociationProperties__Group__1__Impl : ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) ) ;
    public final void rule__AssociationProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4789:1: ( ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) ) )
            // InternalCls.g:4790:1: ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) )
            {
            // InternalCls.g:4790:1: ( ( rule__AssociationProperties__CardinalityLeftAssignment_1 ) )
            // InternalCls.g:4791:1: ( rule__AssociationProperties__CardinalityLeftAssignment_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCardinalityLeftAssignment_1()); 
            // InternalCls.g:4792:1: ( rule__AssociationProperties__CardinalityLeftAssignment_1 )
            // InternalCls.g:4792:2: rule__AssociationProperties__CardinalityLeftAssignment_1
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
    // InternalCls.g:4802:1: rule__AssociationProperties__Group__2 : rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3 ;
    public final void rule__AssociationProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4806:1: ( rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3 )
            // InternalCls.g:4807:2: rule__AssociationProperties__Group__2__Impl rule__AssociationProperties__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalCls.g:4814:1: rule__AssociationProperties__Group__2__Impl : ( ( rule__AssociationProperties__Group_2__0 )? ) ;
    public final void rule__AssociationProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4818:1: ( ( ( rule__AssociationProperties__Group_2__0 )? ) )
            // InternalCls.g:4819:1: ( ( rule__AssociationProperties__Group_2__0 )? )
            {
            // InternalCls.g:4819:1: ( ( rule__AssociationProperties__Group_2__0 )? )
            // InternalCls.g:4820:1: ( rule__AssociationProperties__Group_2__0 )?
            {
             before(grammarAccess.getAssociationPropertiesAccess().getGroup_2()); 
            // InternalCls.g:4821:1: ( rule__AssociationProperties__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==45) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCls.g:4821:2: rule__AssociationProperties__Group_2__0
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
    // InternalCls.g:4831:1: rule__AssociationProperties__Group__3 : rule__AssociationProperties__Group__3__Impl rule__AssociationProperties__Group__4 ;
    public final void rule__AssociationProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4835:1: ( rule__AssociationProperties__Group__3__Impl rule__AssociationProperties__Group__4 )
            // InternalCls.g:4836:2: rule__AssociationProperties__Group__3__Impl rule__AssociationProperties__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__AssociationProperties__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group__4();

            state._fsp--;


            }

        }
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
    // InternalCls.g:4843:1: rule__AssociationProperties__Group__3__Impl : ( ( rule__AssociationProperties__Group_3__0 )? ) ;
    public final void rule__AssociationProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4847:1: ( ( ( rule__AssociationProperties__Group_3__0 )? ) )
            // InternalCls.g:4848:1: ( ( rule__AssociationProperties__Group_3__0 )? )
            {
            // InternalCls.g:4848:1: ( ( rule__AssociationProperties__Group_3__0 )? )
            // InternalCls.g:4849:1: ( rule__AssociationProperties__Group_3__0 )?
            {
             before(grammarAccess.getAssociationPropertiesAccess().getGroup_3()); 
            // InternalCls.g:4850:1: ( rule__AssociationProperties__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCls.g:4850:2: rule__AssociationProperties__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationProperties__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationPropertiesAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__AssociationProperties__Group__4"
    // InternalCls.g:4860:1: rule__AssociationProperties__Group__4 : rule__AssociationProperties__Group__4__Impl ;
    public final void rule__AssociationProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4864:1: ( rule__AssociationProperties__Group__4__Impl )
            // InternalCls.g:4865:2: rule__AssociationProperties__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group__4"


    // $ANTLR start "rule__AssociationProperties__Group__4__Impl"
    // InternalCls.g:4871:1: rule__AssociationProperties__Group__4__Impl : ( ']' ) ;
    public final void rule__AssociationProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4875:1: ( ( ']' ) )
            // InternalCls.g:4876:1: ( ']' )
            {
            // InternalCls.g:4876:1: ( ']' )
            // InternalCls.g:4877:1: ']'
            {
             before(grammarAccess.getAssociationPropertiesAccess().getRightSquareBracketKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAssociationPropertiesAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group__4__Impl"


    // $ANTLR start "rule__AssociationProperties__Group_2__0"
    // InternalCls.g:4900:1: rule__AssociationProperties__Group_2__0 : rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1 ;
    public final void rule__AssociationProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4904:1: ( rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1 )
            // InternalCls.g:4905:2: rule__AssociationProperties__Group_2__0__Impl rule__AssociationProperties__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:4912:1: rule__AssociationProperties__Group_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4916:1: ( ( ',' ) )
            // InternalCls.g:4917:1: ( ',' )
            {
            // InternalCls.g:4917:1: ( ',' )
            // InternalCls.g:4918:1: ','
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCommaKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAssociationPropertiesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
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
    // InternalCls.g:4931:1: rule__AssociationProperties__Group_2__1 : rule__AssociationProperties__Group_2__1__Impl ;
    public final void rule__AssociationProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4935:1: ( rule__AssociationProperties__Group_2__1__Impl )
            // InternalCls.g:4936:2: rule__AssociationProperties__Group_2__1__Impl
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
    // InternalCls.g:4942:1: rule__AssociationProperties__Group_2__1__Impl : ( ( rule__AssociationProperties__PropertyLeftAssignment_2_1 ) ) ;
    public final void rule__AssociationProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4946:1: ( ( ( rule__AssociationProperties__PropertyLeftAssignment_2_1 ) ) )
            // InternalCls.g:4947:1: ( ( rule__AssociationProperties__PropertyLeftAssignment_2_1 ) )
            {
            // InternalCls.g:4947:1: ( ( rule__AssociationProperties__PropertyLeftAssignment_2_1 ) )
            // InternalCls.g:4948:1: ( rule__AssociationProperties__PropertyLeftAssignment_2_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getPropertyLeftAssignment_2_1()); 
            // InternalCls.g:4949:1: ( rule__AssociationProperties__PropertyLeftAssignment_2_1 )
            // InternalCls.g:4949:2: rule__AssociationProperties__PropertyLeftAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__PropertyLeftAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertiesAccess().getPropertyLeftAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AssociationProperties__Group_3__0"
    // InternalCls.g:4963:1: rule__AssociationProperties__Group_3__0 : rule__AssociationProperties__Group_3__0__Impl rule__AssociationProperties__Group_3__1 ;
    public final void rule__AssociationProperties__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4967:1: ( rule__AssociationProperties__Group_3__0__Impl rule__AssociationProperties__Group_3__1 )
            // InternalCls.g:4968:2: rule__AssociationProperties__Group_3__0__Impl rule__AssociationProperties__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__AssociationProperties__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_3__0"


    // $ANTLR start "rule__AssociationProperties__Group_3__0__Impl"
    // InternalCls.g:4975:1: rule__AssociationProperties__Group_3__0__Impl : ( '|' ) ;
    public final void rule__AssociationProperties__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4979:1: ( ( '|' ) )
            // InternalCls.g:4980:1: ( '|' )
            {
            // InternalCls.g:4980:1: ( '|' )
            // InternalCls.g:4981:1: '|'
            {
             before(grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAssociationPropertiesAccess().getVerticalLineKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_3__0__Impl"


    // $ANTLR start "rule__AssociationProperties__Group_3__1"
    // InternalCls.g:4994:1: rule__AssociationProperties__Group_3__1 : rule__AssociationProperties__Group_3__1__Impl rule__AssociationProperties__Group_3__2 ;
    public final void rule__AssociationProperties__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:4998:1: ( rule__AssociationProperties__Group_3__1__Impl rule__AssociationProperties__Group_3__2 )
            // InternalCls.g:4999:2: rule__AssociationProperties__Group_3__1__Impl rule__AssociationProperties__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__AssociationProperties__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_3__1"


    // $ANTLR start "rule__AssociationProperties__Group_3__1__Impl"
    // InternalCls.g:5006:1: rule__AssociationProperties__Group_3__1__Impl : ( ( rule__AssociationProperties__CardinalityRightAssignment_3_1 ) ) ;
    public final void rule__AssociationProperties__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5010:1: ( ( ( rule__AssociationProperties__CardinalityRightAssignment_3_1 ) ) )
            // InternalCls.g:5011:1: ( ( rule__AssociationProperties__CardinalityRightAssignment_3_1 ) )
            {
            // InternalCls.g:5011:1: ( ( rule__AssociationProperties__CardinalityRightAssignment_3_1 ) )
            // InternalCls.g:5012:1: ( rule__AssociationProperties__CardinalityRightAssignment_3_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightAssignment_3_1()); 
            // InternalCls.g:5013:1: ( rule__AssociationProperties__CardinalityRightAssignment_3_1 )
            // InternalCls.g:5013:2: rule__AssociationProperties__CardinalityRightAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__CardinalityRightAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_3__1__Impl"


    // $ANTLR start "rule__AssociationProperties__Group_3__2"
    // InternalCls.g:5023:1: rule__AssociationProperties__Group_3__2 : rule__AssociationProperties__Group_3__2__Impl ;
    public final void rule__AssociationProperties__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5027:1: ( rule__AssociationProperties__Group_3__2__Impl )
            // InternalCls.g:5028:2: rule__AssociationProperties__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_3__2"


    // $ANTLR start "rule__AssociationProperties__Group_3__2__Impl"
    // InternalCls.g:5034:1: rule__AssociationProperties__Group_3__2__Impl : ( ( rule__AssociationProperties__Group_3_2__0 )? ) ;
    public final void rule__AssociationProperties__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5038:1: ( ( ( rule__AssociationProperties__Group_3_2__0 )? ) )
            // InternalCls.g:5039:1: ( ( rule__AssociationProperties__Group_3_2__0 )? )
            {
            // InternalCls.g:5039:1: ( ( rule__AssociationProperties__Group_3_2__0 )? )
            // InternalCls.g:5040:1: ( rule__AssociationProperties__Group_3_2__0 )?
            {
             before(grammarAccess.getAssociationPropertiesAccess().getGroup_3_2()); 
            // InternalCls.g:5041:1: ( rule__AssociationProperties__Group_3_2__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==45) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCls.g:5041:2: rule__AssociationProperties__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationProperties__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationPropertiesAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_3__2__Impl"


    // $ANTLR start "rule__AssociationProperties__Group_3_2__0"
    // InternalCls.g:5057:1: rule__AssociationProperties__Group_3_2__0 : rule__AssociationProperties__Group_3_2__0__Impl rule__AssociationProperties__Group_3_2__1 ;
    public final void rule__AssociationProperties__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5061:1: ( rule__AssociationProperties__Group_3_2__0__Impl rule__AssociationProperties__Group_3_2__1 )
            // InternalCls.g:5062:2: rule__AssociationProperties__Group_3_2__0__Impl rule__AssociationProperties__Group_3_2__1
            {
            pushFollow(FOLLOW_7);
            rule__AssociationProperties__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_3_2__0"


    // $ANTLR start "rule__AssociationProperties__Group_3_2__0__Impl"
    // InternalCls.g:5069:1: rule__AssociationProperties__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationProperties__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5073:1: ( ( ',' ) )
            // InternalCls.g:5074:1: ( ',' )
            {
            // InternalCls.g:5074:1: ( ',' )
            // InternalCls.g:5075:1: ','
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCommaKeyword_3_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAssociationPropertiesAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_3_2__0__Impl"


    // $ANTLR start "rule__AssociationProperties__Group_3_2__1"
    // InternalCls.g:5088:1: rule__AssociationProperties__Group_3_2__1 : rule__AssociationProperties__Group_3_2__1__Impl ;
    public final void rule__AssociationProperties__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5092:1: ( rule__AssociationProperties__Group_3_2__1__Impl )
            // InternalCls.g:5093:2: rule__AssociationProperties__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_3_2__1"


    // $ANTLR start "rule__AssociationProperties__Group_3_2__1__Impl"
    // InternalCls.g:5099:1: rule__AssociationProperties__Group_3_2__1__Impl : ( ( rule__AssociationProperties__PropertyRightAssignment_3_2_1 ) ) ;
    public final void rule__AssociationProperties__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5103:1: ( ( ( rule__AssociationProperties__PropertyRightAssignment_3_2_1 ) ) )
            // InternalCls.g:5104:1: ( ( rule__AssociationProperties__PropertyRightAssignment_3_2_1 ) )
            {
            // InternalCls.g:5104:1: ( ( rule__AssociationProperties__PropertyRightAssignment_3_2_1 ) )
            // InternalCls.g:5105:1: ( rule__AssociationProperties__PropertyRightAssignment_3_2_1 )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getPropertyRightAssignment_3_2_1()); 
            // InternalCls.g:5106:1: ( rule__AssociationProperties__PropertyRightAssignment_3_2_1 )
            // InternalCls.g:5106:2: rule__AssociationProperties__PropertyRightAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationProperties__PropertyRightAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertiesAccess().getPropertyRightAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__Group_3_2__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalCls.g:5120:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5124:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalCls.g:5125:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalCls.g:5132:1: rule__Cardinality__Group__0__Impl : ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5136:1: ( ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) )
            // InternalCls.g:5137:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            {
            // InternalCls.g:5137:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            // InternalCls.g:5138:1: ( rule__Cardinality__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0()); 
            // InternalCls.g:5139:1: ( rule__Cardinality__LowerBoundAssignment_0 )
            // InternalCls.g:5139:2: rule__Cardinality__LowerBoundAssignment_0
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
    // InternalCls.g:5149:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5153:1: ( rule__Cardinality__Group__1__Impl )
            // InternalCls.g:5154:2: rule__Cardinality__Group__1__Impl
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
    // InternalCls.g:5160:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Group_1__0 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5164:1: ( ( ( rule__Cardinality__Group_1__0 )? ) )
            // InternalCls.g:5165:1: ( ( rule__Cardinality__Group_1__0 )? )
            {
            // InternalCls.g:5165:1: ( ( rule__Cardinality__Group_1__0 )? )
            // InternalCls.g:5166:1: ( rule__Cardinality__Group_1__0 )?
            {
             before(grammarAccess.getCardinalityAccess().getGroup_1()); 
            // InternalCls.g:5167:1: ( rule__Cardinality__Group_1__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCls.g:5167:2: rule__Cardinality__Group_1__0
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
    // InternalCls.g:5181:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5185:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // InternalCls.g:5186:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalCls.g:5193:1: rule__Cardinality__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5197:1: ( ( '..' ) )
            // InternalCls.g:5198:1: ( '..' )
            {
            // InternalCls.g:5198:1: ( '..' )
            // InternalCls.g:5199:1: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalCls.g:5212:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5216:1: ( rule__Cardinality__Group_1__1__Impl )
            // InternalCls.g:5217:2: rule__Cardinality__Group_1__1__Impl
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
    // InternalCls.g:5223:1: rule__Cardinality__Group_1__1__Impl : ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5227:1: ( ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) )
            // InternalCls.g:5228:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            {
            // InternalCls.g:5228:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            // InternalCls.g:5229:1: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1()); 
            // InternalCls.g:5230:1: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            // InternalCls.g:5230:2: rule__Cardinality__UpperBoundAssignment_1_1
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


    // $ANTLR start "rule__ClassDiagram__TitleAssignment_2"
    // InternalCls.g:5245:1: rule__ClassDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5249:1: ( ( RULE_STRING ) )
            // InternalCls.g:5250:1: ( RULE_STRING )
            {
            // InternalCls.g:5250:1: ( RULE_STRING )
            // InternalCls.g:5251:1: RULE_STRING
            {
             before(grammarAccess.getClassDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__TitleAssignment_2"


    // $ANTLR start "rule__ClassDiagram__RootPackageAssignment_3"
    // InternalCls.g:5260:1: rule__ClassDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__ClassDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5264:1: ( ( ruleRootPackage ) )
            // InternalCls.g:5265:1: ( ruleRootPackage )
            {
            // InternalCls.g:5265:1: ( ruleRootPackage )
            // InternalCls.g:5266:1: ruleRootPackage
            {
             before(grammarAccess.getClassDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRootPackage();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__RootPackageAssignment_3"


    // $ANTLR start "rule__RootPackage__ReferencedElementAssignment_1"
    // InternalCls.g:5275:1: rule__RootPackage__ReferencedElementAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__RootPackage__ReferencedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5279:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5280:1: ( ( ruleFQN ) )
            {
            // InternalCls.g:5280:1: ( ( ruleFQN ) )
            // InternalCls.g:5281:1: ( ruleFQN )
            {
             before(grammarAccess.getRootPackageAccess().getReferencedElementPackageCrossReference_1_0()); 
            // InternalCls.g:5282:1: ( ruleFQN )
            // InternalCls.g:5283:1: ruleFQN
            {
             before(grammarAccess.getRootPackageAccess().getReferencedElementPackageFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getReferencedElementPackageFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRootPackageAccess().getReferencedElementPackageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__ReferencedElementAssignment_1"


    // $ANTLR start "rule__RootPackage__PackageImportsAssignment_2"
    // InternalCls.g:5294:1: rule__RootPackage__PackageImportsAssignment_2 : ( rulePackageImport ) ;
    public final void rule__RootPackage__PackageImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5298:1: ( ( rulePackageImport ) )
            // InternalCls.g:5299:1: ( rulePackageImport )
            {
            // InternalCls.g:5299:1: ( rulePackageImport )
            // InternalCls.g:5300:1: rulePackageImport
            {
             before(grammarAccess.getRootPackageAccess().getPackageImportsPackageImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePackageImport();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getPackageImportsPackageImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__PackageImportsAssignment_2"


    // $ANTLR start "rule__RootPackage__ClassifiersAssignment_3"
    // InternalCls.g:5309:1: rule__RootPackage__ClassifiersAssignment_3 : ( ruleClassifier ) ;
    public final void rule__RootPackage__ClassifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5313:1: ( ( ruleClassifier ) )
            // InternalCls.g:5314:1: ( ruleClassifier )
            {
            // InternalCls.g:5314:1: ( ruleClassifier )
            // InternalCls.g:5315:1: ruleClassifier
            {
             before(grammarAccess.getRootPackageAccess().getClassifiersClassifierParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifier();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getClassifiersClassifierParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__ClassifiersAssignment_3"


    // $ANTLR start "rule__RootPackage__ConnectorsAssignment_4"
    // InternalCls.g:5324:1: rule__RootPackage__ConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__RootPackage__ConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5328:1: ( ( ruleConnector ) )
            // InternalCls.g:5329:1: ( ruleConnector )
            {
            // InternalCls.g:5329:1: ( ruleConnector )
            // InternalCls.g:5330:1: ruleConnector
            {
             before(grammarAccess.getRootPackageAccess().getConnectorsConnectorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getConnectorsConnectorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__ConnectorsAssignment_4"


    // $ANTLR start "rule__RootPackage__PackagesAssignment_5"
    // InternalCls.g:5339:1: rule__RootPackage__PackagesAssignment_5 : ( rulePackage ) ;
    public final void rule__RootPackage__PackagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5343:1: ( ( rulePackage ) )
            // InternalCls.g:5344:1: ( rulePackage )
            {
            // InternalCls.g:5344:1: ( rulePackage )
            // InternalCls.g:5345:1: rulePackage
            {
             before(grammarAccess.getRootPackageAccess().getPackagesPackageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getPackagesPackageParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__PackagesAssignment_5"


    // $ANTLR start "rule__Package__ReferencedElementAssignment_1"
    // InternalCls.g:5354:1: rule__Package__ReferencedElementAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Package__ReferencedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5358:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5359:1: ( ( ruleFQN ) )
            {
            // InternalCls.g:5359:1: ( ( ruleFQN ) )
            // InternalCls.g:5360:1: ( ruleFQN )
            {
             before(grammarAccess.getPackageAccess().getReferencedElementPackageCrossReference_1_0()); 
            // InternalCls.g:5361:1: ( ruleFQN )
            // InternalCls.g:5362:1: ruleFQN
            {
             before(grammarAccess.getPackageAccess().getReferencedElementPackageFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getReferencedElementPackageFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPackageAccess().getReferencedElementPackageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ReferencedElementAssignment_1"


    // $ANTLR start "rule__Package__PackageImportsAssignment_3"
    // InternalCls.g:5373:1: rule__Package__PackageImportsAssignment_3 : ( rulePackageImport ) ;
    public final void rule__Package__PackageImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5377:1: ( ( rulePackageImport ) )
            // InternalCls.g:5378:1: ( rulePackageImport )
            {
            // InternalCls.g:5378:1: ( rulePackageImport )
            // InternalCls.g:5379:1: rulePackageImport
            {
             before(grammarAccess.getPackageAccess().getPackageImportsPackageImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePackageImport();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPackageImportsPackageImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PackageImportsAssignment_3"


    // $ANTLR start "rule__Package__ClassifiersAssignment_4"
    // InternalCls.g:5388:1: rule__Package__ClassifiersAssignment_4 : ( ruleClassifier ) ;
    public final void rule__Package__ClassifiersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5392:1: ( ( ruleClassifier ) )
            // InternalCls.g:5393:1: ( ruleClassifier )
            {
            // InternalCls.g:5393:1: ( ruleClassifier )
            // InternalCls.g:5394:1: ruleClassifier
            {
             before(grammarAccess.getPackageAccess().getClassifiersClassifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifier();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getClassifiersClassifierParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ClassifiersAssignment_4"


    // $ANTLR start "rule__Package__ConnectorsAssignment_5"
    // InternalCls.g:5403:1: rule__Package__ConnectorsAssignment_5 : ( ruleConnector ) ;
    public final void rule__Package__ConnectorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5407:1: ( ( ruleConnector ) )
            // InternalCls.g:5408:1: ( ruleConnector )
            {
            // InternalCls.g:5408:1: ( ruleConnector )
            // InternalCls.g:5409:1: ruleConnector
            {
             before(grammarAccess.getPackageAccess().getConnectorsConnectorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getConnectorsConnectorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ConnectorsAssignment_5"


    // $ANTLR start "rule__Package__PackagesAssignment_6"
    // InternalCls.g:5418:1: rule__Package__PackagesAssignment_6 : ( rulePackage ) ;
    public final void rule__Package__PackagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5422:1: ( ( rulePackage ) )
            // InternalCls.g:5423:1: ( rulePackage )
            {
            // InternalCls.g:5423:1: ( rulePackage )
            // InternalCls.g:5424:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PackagesAssignment_6"


    // $ANTLR start "rule__PackageImport__ReferencedElementAssignment_1"
    // InternalCls.g:5433:1: rule__PackageImport__ReferencedElementAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__PackageImport__ReferencedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5437:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5438:1: ( ( ruleFQN ) )
            {
            // InternalCls.g:5438:1: ( ( ruleFQN ) )
            // InternalCls.g:5439:1: ( ruleFQN )
            {
             before(grammarAccess.getPackageImportAccess().getReferencedElementPackageImportCrossReference_1_0()); 
            // InternalCls.g:5440:1: ( ruleFQN )
            // InternalCls.g:5441:1: ruleFQN
            {
             before(grammarAccess.getPackageImportAccess().getReferencedElementPackageImportFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPackageImportAccess().getReferencedElementPackageImportFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPackageImportAccess().getReferencedElementPackageImportCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__ReferencedElementAssignment_1"


    // $ANTLR start "rule__Class__VisibilityAssignment_0"
    // InternalCls.g:5452:1: rule__Class__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5456:1: ( ( ruleVisibility ) )
            // InternalCls.g:5457:1: ( ruleVisibility )
            {
            // InternalCls.g:5457:1: ( ruleVisibility )
            // InternalCls.g:5458:1: ruleVisibility
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
    // InternalCls.g:5467:1: rule__Class__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5471:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:5472:1: ( ( 'abstract' ) )
            {
            // InternalCls.g:5472:1: ( ( 'abstract' ) )
            // InternalCls.g:5473:1: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:5474:1: ( 'abstract' )
            // InternalCls.g:5475:1: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,54,FOLLOW_2); 
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


    // $ANTLR start "rule__Class__ReferencedElementAssignment_3_0_0"
    // InternalCls.g:5490:1: rule__Class__ReferencedElementAssignment_3_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ReferencedElementAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5494:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:5495:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:5495:1: ( ( RULE_ID ) )
            // InternalCls.g:5496:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getReferencedElementClassCrossReference_3_0_0_0()); 
            // InternalCls.g:5497:1: ( RULE_ID )
            // InternalCls.g:5498:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getReferencedElementClassIDTerminalRuleCall_3_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getReferencedElementClassIDTerminalRuleCall_3_0_0_0_1()); 

            }

             after(grammarAccess.getClassAccess().getReferencedElementClassCrossReference_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ReferencedElementAssignment_3_0_0"


    // $ANTLR start "rule__Class__AliasExpressionAssignment_3_0_1_1"
    // InternalCls.g:5509:1: rule__Class__AliasExpressionAssignment_3_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__AliasExpressionAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5513:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:5514:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:5514:1: ( ( RULE_ID ) )
            // InternalCls.g:5515:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getAliasExpressionStringExpressionCrossReference_3_0_1_1_0()); 
            // InternalCls.g:5516:1: ( RULE_ID )
            // InternalCls.g:5517:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getAliasExpressionStringExpressionIDTerminalRuleCall_3_0_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAliasExpressionStringExpressionIDTerminalRuleCall_3_0_1_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getAliasExpressionStringExpressionCrossReference_3_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AliasExpressionAssignment_3_0_1_1"


    // $ANTLR start "rule__Class__ReferencedElementAssignment_3_1_0"
    // InternalCls.g:5528:1: rule__Class__ReferencedElementAssignment_3_1_0 : ( ( ruleNameString ) ) ;
    public final void rule__Class__ReferencedElementAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5532:1: ( ( ( ruleNameString ) ) )
            // InternalCls.g:5533:1: ( ( ruleNameString ) )
            {
            // InternalCls.g:5533:1: ( ( ruleNameString ) )
            // InternalCls.g:5534:1: ( ruleNameString )
            {
             before(grammarAccess.getClassAccess().getReferencedElementClassCrossReference_3_1_0_0()); 
            // InternalCls.g:5535:1: ( ruleNameString )
            // InternalCls.g:5536:1: ruleNameString
            {
             before(grammarAccess.getClassAccess().getReferencedElementClassNameStringParserRuleCall_3_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleNameString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getReferencedElementClassNameStringParserRuleCall_3_1_0_0_1()); 

            }

             after(grammarAccess.getClassAccess().getReferencedElementClassCrossReference_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ReferencedElementAssignment_3_1_0"


    // $ANTLR start "rule__Class__AliasExpressionAssignment_3_1_2"
    // InternalCls.g:5547:1: rule__Class__AliasExpressionAssignment_3_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Class__AliasExpressionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5551:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:5552:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:5552:1: ( ( RULE_ID ) )
            // InternalCls.g:5553:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getAliasExpressionStringExpressionCrossReference_3_1_2_0()); 
            // InternalCls.g:5554:1: ( RULE_ID )
            // InternalCls.g:5555:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getAliasExpressionStringExpressionIDTerminalRuleCall_3_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAliasExpressionStringExpressionIDTerminalRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getClassAccess().getAliasExpressionStringExpressionCrossReference_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AliasExpressionAssignment_3_1_2"


    // $ANTLR start "rule__Class__MembersAssignment_4_1"
    // InternalCls.g:5566:1: rule__Class__MembersAssignment_4_1 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5570:1: ( ( ruleMember ) )
            // InternalCls.g:5571:1: ( ruleMember )
            {
            // InternalCls.g:5571:1: ( ruleMember )
            // InternalCls.g:5572:1: ruleMember
            {
             before(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MembersAssignment_4_1"


    // $ANTLR start "rule__Interface__VisibilityAssignment_0"
    // InternalCls.g:5581:1: rule__Interface__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Interface__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5585:1: ( ( ruleVisibility ) )
            // InternalCls.g:5586:1: ( ruleVisibility )
            {
            // InternalCls.g:5586:1: ( ruleVisibility )
            // InternalCls.g:5587:1: ruleVisibility
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


    // $ANTLR start "rule__Interface__ReferencedElementAssignment_2_0_0"
    // InternalCls.g:5596:1: rule__Interface__ReferencedElementAssignment_2_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__ReferencedElementAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5600:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:5601:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:5601:1: ( ( RULE_ID ) )
            // InternalCls.g:5602:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceCrossReference_2_0_0_0()); 
            // InternalCls.g:5603:1: ( RULE_ID )
            // InternalCls.g:5604:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceIDTerminalRuleCall_2_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceIDTerminalRuleCall_2_0_0_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceCrossReference_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__ReferencedElementAssignment_2_0_0"


    // $ANTLR start "rule__Interface__AliasExpressionAssignment_2_0_1_1"
    // InternalCls.g:5615:1: rule__Interface__AliasExpressionAssignment_2_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__AliasExpressionAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5619:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:5620:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:5620:1: ( ( RULE_ID ) )
            // InternalCls.g:5621:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getAliasExpressionStringExpressionCrossReference_2_0_1_1_0()); 
            // InternalCls.g:5622:1: ( RULE_ID )
            // InternalCls.g:5623:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getAliasExpressionStringExpressionIDTerminalRuleCall_2_0_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getAliasExpressionStringExpressionIDTerminalRuleCall_2_0_1_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getAliasExpressionStringExpressionCrossReference_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__AliasExpressionAssignment_2_0_1_1"


    // $ANTLR start "rule__Interface__ReferencedElementAssignment_2_1_0"
    // InternalCls.g:5634:1: rule__Interface__ReferencedElementAssignment_2_1_0 : ( ( ruleNameString ) ) ;
    public final void rule__Interface__ReferencedElementAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5638:1: ( ( ( ruleNameString ) ) )
            // InternalCls.g:5639:1: ( ( ruleNameString ) )
            {
            // InternalCls.g:5639:1: ( ( ruleNameString ) )
            // InternalCls.g:5640:1: ( ruleNameString )
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceCrossReference_2_1_0_0()); 
            // InternalCls.g:5641:1: ( ruleNameString )
            // InternalCls.g:5642:1: ruleNameString
            {
             before(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceNameStringParserRuleCall_2_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleNameString();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceNameStringParserRuleCall_2_1_0_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getReferencedElementInterfaceCrossReference_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__ReferencedElementAssignment_2_1_0"


    // $ANTLR start "rule__Interface__AliasExpressionAssignment_2_1_2"
    // InternalCls.g:5653:1: rule__Interface__AliasExpressionAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__AliasExpressionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5657:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:5658:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:5658:1: ( ( RULE_ID ) )
            // InternalCls.g:5659:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getAliasExpressionStringExpressionCrossReference_2_1_2_0()); 
            // InternalCls.g:5660:1: ( RULE_ID )
            // InternalCls.g:5661:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getAliasExpressionStringExpressionIDTerminalRuleCall_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getAliasExpressionStringExpressionIDTerminalRuleCall_2_1_2_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getAliasExpressionStringExpressionCrossReference_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__AliasExpressionAssignment_2_1_2"


    // $ANTLR start "rule__Interface__MembersAssignment_3_1"
    // InternalCls.g:5672:1: rule__Interface__MembersAssignment_3_1 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5676:1: ( ( ruleMember ) )
            // InternalCls.g:5677:1: ( ruleMember )
            {
            // InternalCls.g:5677:1: ( ruleMember )
            // InternalCls.g:5678:1: ruleMember
            {
             before(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__MembersAssignment_3_1"


    // $ANTLR start "rule__DataTypeReference__TypeAssignment"
    // InternalCls.g:5687:1: rule__DataTypeReference__TypeAssignment : ( rulePrimitiveType ) ;
    public final void rule__DataTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5691:1: ( ( rulePrimitiveType ) )
            // InternalCls.g:5692:1: ( rulePrimitiveType )
            {
            // InternalCls.g:5692:1: ( rulePrimitiveType )
            // InternalCls.g:5693:1: rulePrimitiveType
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
    // InternalCls.g:5702:1: rule__UMLTypeReference__TypeAssignment : ( ( ruleFQN ) ) ;
    public final void rule__UMLTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5706:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5707:1: ( ( ruleFQN ) )
            {
            // InternalCls.g:5707:1: ( ( ruleFQN ) )
            // InternalCls.g:5708:1: ( ruleFQN )
            {
             before(grammarAccess.getUMLTypeReferenceAccess().getTypeTypeCrossReference_0()); 
            // InternalCls.g:5709:1: ( ruleFQN )
            // InternalCls.g:5710:1: ruleFQN
            {
             before(grammarAccess.getUMLTypeReferenceAccess().getTypeTypeFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getUMLTypeReferenceAccess().getTypeTypeFQNParserRuleCall_0_1()); 

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
    // InternalCls.g:5721:1: rule__Attribute__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5725:1: ( ( ruleVisibility ) )
            // InternalCls.g:5726:1: ( ruleVisibility )
            {
            // InternalCls.g:5726:1: ( ruleVisibility )
            // InternalCls.g:5727:1: ruleVisibility
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
    // InternalCls.g:5736:1: rule__Attribute__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5740:1: ( ( ( 'static' ) ) )
            // InternalCls.g:5741:1: ( ( 'static' ) )
            {
            // InternalCls.g:5741:1: ( ( 'static' ) )
            // InternalCls.g:5742:1: ( 'static' )
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:5743:1: ( 'static' )
            // InternalCls.g:5744:1: 'static'
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalCls.g:5759:1: rule__Attribute__FinalAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Attribute__FinalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5763:1: ( ( ( 'final' ) ) )
            // InternalCls.g:5764:1: ( ( 'final' ) )
            {
            // InternalCls.g:5764:1: ( ( 'final' ) )
            // InternalCls.g:5765:1: ( 'final' )
            {
             before(grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0()); 
            // InternalCls.g:5766:1: ( 'final' )
            // InternalCls.g:5767:1: 'final'
            {
             before(grammarAccess.getAttributeAccess().getFinalFinalKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalCls.g:5782:1: rule__Attribute__ReferencedElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__ReferencedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5786:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:5787:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:5787:1: ( ( RULE_ID ) )
            // InternalCls.g:5788:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getReferencedElementPropertyCrossReference_4_0()); 
            // InternalCls.g:5789:1: ( RULE_ID )
            // InternalCls.g:5790:1: RULE_ID
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
    // InternalCls.g:5801:1: rule__Attribute__TypeAssignment_6 : ( ruleTypeReference ) ;
    public final void rule__Attribute__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5805:1: ( ( ruleTypeReference ) )
            // InternalCls.g:5806:1: ( ruleTypeReference )
            {
            // InternalCls.g:5806:1: ( ruleTypeReference )
            // InternalCls.g:5807:1: ruleTypeReference
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
    // InternalCls.g:5816:1: rule__Method__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Method__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5820:1: ( ( ruleVisibility ) )
            // InternalCls.g:5821:1: ( ruleVisibility )
            {
            // InternalCls.g:5821:1: ( ruleVisibility )
            // InternalCls.g:5822:1: ruleVisibility
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
    // InternalCls.g:5831:1: rule__Method__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Method__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5835:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:5836:1: ( ( 'abstract' ) )
            {
            // InternalCls.g:5836:1: ( ( 'abstract' ) )
            // InternalCls.g:5837:1: ( 'abstract' )
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:5838:1: ( 'abstract' )
            // InternalCls.g:5839:1: 'abstract'
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalCls.g:5854:1: rule__Method__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Method__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5858:1: ( ( ( 'static' ) ) )
            // InternalCls.g:5859:1: ( ( 'static' ) )
            {
            // InternalCls.g:5859:1: ( ( 'static' ) )
            // InternalCls.g:5860:1: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:5861:1: ( 'static' )
            // InternalCls.g:5862:1: 'static'
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalCls.g:5877:1: rule__Method__FinalAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Method__FinalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5881:1: ( ( ( 'final' ) ) )
            // InternalCls.g:5882:1: ( ( 'final' ) )
            {
            // InternalCls.g:5882:1: ( ( 'final' ) )
            // InternalCls.g:5883:1: ( 'final' )
            {
             before(grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0()); 
            // InternalCls.g:5884:1: ( 'final' )
            // InternalCls.g:5885:1: 'final'
            {
             before(grammarAccess.getMethodAccess().getFinalFinalKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalCls.g:5900:1: rule__Method__ReferencedElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Method__ReferencedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5904:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:5905:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:5905:1: ( ( RULE_ID ) )
            // InternalCls.g:5906:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getReferencedElementOperationCrossReference_4_0()); 
            // InternalCls.g:5907:1: ( RULE_ID )
            // InternalCls.g:5908:1: RULE_ID
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
    // InternalCls.g:5919:1: rule__Method__ParametersAssignment_6_0 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5923:1: ( ( ruleParameter ) )
            // InternalCls.g:5924:1: ( ruleParameter )
            {
            // InternalCls.g:5924:1: ( ruleParameter )
            // InternalCls.g:5925:1: ruleParameter
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
    // InternalCls.g:5934:1: rule__Method__ParametersAssignment_6_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5938:1: ( ( ruleParameter ) )
            // InternalCls.g:5939:1: ( ruleParameter )
            {
            // InternalCls.g:5939:1: ( ruleParameter )
            // InternalCls.g:5940:1: ruleParameter
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
    // InternalCls.g:5949:1: rule__Method__TypeAssignment_8_1 : ( ruleTypeReference ) ;
    public final void rule__Method__TypeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5953:1: ( ( ruleTypeReference ) )
            // InternalCls.g:5954:1: ( ruleTypeReference )
            {
            // InternalCls.g:5954:1: ( ruleTypeReference )
            // InternalCls.g:5955:1: ruleTypeReference
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
    // InternalCls.g:5964:1: rule__Parameter__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Parameter__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5968:1: ( ( ruleVisibility ) )
            // InternalCls.g:5969:1: ( ruleVisibility )
            {
            // InternalCls.g:5969:1: ( ruleVisibility )
            // InternalCls.g:5970:1: ruleVisibility
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
    // InternalCls.g:5979:1: rule__Parameter__StaticAssignment_1 : ( ( 'static' ) ) ;
    public final void rule__Parameter__StaticAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:5983:1: ( ( ( 'static' ) ) )
            // InternalCls.g:5984:1: ( ( 'static' ) )
            {
            // InternalCls.g:5984:1: ( ( 'static' ) )
            // InternalCls.g:5985:1: ( 'static' )
            {
             before(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 
            // InternalCls.g:5986:1: ( 'static' )
            // InternalCls.g:5987:1: 'static'
            {
             before(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalCls.g:6002:1: rule__Parameter__FinalAssignment_2 : ( ( 'final' ) ) ;
    public final void rule__Parameter__FinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6006:1: ( ( ( 'final' ) ) )
            // InternalCls.g:6007:1: ( ( 'final' ) )
            {
            // InternalCls.g:6007:1: ( ( 'final' ) )
            // InternalCls.g:6008:1: ( 'final' )
            {
             before(grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0()); 
            // InternalCls.g:6009:1: ( 'final' )
            // InternalCls.g:6010:1: 'final'
            {
             before(grammarAccess.getParameterAccess().getFinalFinalKeyword_2_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalCls.g:6025:1: rule__Parameter__ReferencedElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__ReferencedElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6029:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:6030:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:6030:1: ( ( RULE_ID ) )
            // InternalCls.g:6031:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getReferencedElementParameterCrossReference_3_0()); 
            // InternalCls.g:6032:1: ( RULE_ID )
            // InternalCls.g:6033:1: RULE_ID
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
    // InternalCls.g:6044:1: rule__Parameter__TypeAssignment_5 : ( ruleTypeReference ) ;
    public final void rule__Parameter__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6048:1: ( ( ruleTypeReference ) )
            // InternalCls.g:6049:1: ( ruleTypeReference )
            {
            // InternalCls.g:6049:1: ( ruleTypeReference )
            // InternalCls.g:6050:1: ruleTypeReference
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
    // InternalCls.g:6059:1: rule__Generalization__LeftAssignment_0 : ( ruleUMLTypeReference ) ;
    public final void rule__Generalization__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6063:1: ( ( ruleUMLTypeReference ) )
            // InternalCls.g:6064:1: ( ruleUMLTypeReference )
            {
            // InternalCls.g:6064:1: ( ruleUMLTypeReference )
            // InternalCls.g:6065:1: ruleUMLTypeReference
            {
             before(grammarAccess.getGeneralizationAccess().getLeftUMLTypeReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUMLTypeReference();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getLeftUMLTypeReferenceParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalCls.g:6074:1: rule__Generalization__RightAssignment_2 : ( ruleUMLTypeReference ) ;
    public final void rule__Generalization__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6078:1: ( ( ruleUMLTypeReference ) )
            // InternalCls.g:6079:1: ( ruleUMLTypeReference )
            {
            // InternalCls.g:6079:1: ( ruleUMLTypeReference )
            // InternalCls.g:6080:1: ruleUMLTypeReference
            {
             before(grammarAccess.getGeneralizationAccess().getRightUMLTypeReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUMLTypeReference();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getRightUMLTypeReferenceParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalCls.g:6089:1: rule__Implementation__LeftAssignment_0 : ( ruleUMLTypeReference ) ;
    public final void rule__Implementation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6093:1: ( ( ruleUMLTypeReference ) )
            // InternalCls.g:6094:1: ( ruleUMLTypeReference )
            {
            // InternalCls.g:6094:1: ( ruleUMLTypeReference )
            // InternalCls.g:6095:1: ruleUMLTypeReference
            {
             before(grammarAccess.getImplementationAccess().getLeftUMLTypeReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUMLTypeReference();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getLeftUMLTypeReferenceParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalCls.g:6104:1: rule__Implementation__RightAssignment_2 : ( ruleUMLTypeReference ) ;
    public final void rule__Implementation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6108:1: ( ( ruleUMLTypeReference ) )
            // InternalCls.g:6109:1: ( ruleUMLTypeReference )
            {
            // InternalCls.g:6109:1: ( ruleUMLTypeReference )
            // InternalCls.g:6110:1: ruleUMLTypeReference
            {
             before(grammarAccess.getImplementationAccess().getRightUMLTypeReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUMLTypeReference();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getRightUMLTypeReferenceParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalCls.g:6119:1: rule__CommentLink__LeftAssignment_0 : ( ruleUMLTypeReference ) ;
    public final void rule__CommentLink__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6123:1: ( ( ruleUMLTypeReference ) )
            // InternalCls.g:6124:1: ( ruleUMLTypeReference )
            {
            // InternalCls.g:6124:1: ( ruleUMLTypeReference )
            // InternalCls.g:6125:1: ruleUMLTypeReference
            {
             before(grammarAccess.getCommentLinkAccess().getLeftUMLTypeReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUMLTypeReference();

            state._fsp--;

             after(grammarAccess.getCommentLinkAccess().getLeftUMLTypeReferenceParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalCls.g:6134:1: rule__CommentLink__CommentAssignment_2 : ( ( ruleCommentBody ) ) ;
    public final void rule__CommentLink__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6138:1: ( ( ( ruleCommentBody ) ) )
            // InternalCls.g:6139:1: ( ( ruleCommentBody ) )
            {
            // InternalCls.g:6139:1: ( ( ruleCommentBody ) )
            // InternalCls.g:6140:1: ( ruleCommentBody )
            {
             before(grammarAccess.getCommentLinkAccess().getCommentCommentCrossReference_2_0()); 
            // InternalCls.g:6141:1: ( ruleCommentBody )
            // InternalCls.g:6142:1: ruleCommentBody
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
    // InternalCls.g:6153:1: rule__Association__BidirectionalAssignment_0 : ( ( 'bi' ) ) ;
    public final void rule__Association__BidirectionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6157:1: ( ( ( 'bi' ) ) )
            // InternalCls.g:6158:1: ( ( 'bi' ) )
            {
            // InternalCls.g:6158:1: ( ( 'bi' ) )
            // InternalCls.g:6159:1: ( 'bi' )
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalBiKeyword_0_0()); 
            // InternalCls.g:6160:1: ( 'bi' )
            // InternalCls.g:6161:1: 'bi'
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalBiKeyword_0_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalCls.g:6176:1: rule__Association__AggregationKindAssignment_1 : ( ruleAggregationKind ) ;
    public final void rule__Association__AggregationKindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6180:1: ( ( ruleAggregationKind ) )
            // InternalCls.g:6181:1: ( ruleAggregationKind )
            {
            // InternalCls.g:6181:1: ( ruleAggregationKind )
            // InternalCls.g:6182:1: ruleAggregationKind
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
    // InternalCls.g:6191:1: rule__Association__LeftAssignment_2 : ( ruleUMLTypeReference ) ;
    public final void rule__Association__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6195:1: ( ( ruleUMLTypeReference ) )
            // InternalCls.g:6196:1: ( ruleUMLTypeReference )
            {
            // InternalCls.g:6196:1: ( ruleUMLTypeReference )
            // InternalCls.g:6197:1: ruleUMLTypeReference
            {
             before(grammarAccess.getAssociationAccess().getLeftUMLTypeReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUMLTypeReference();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getLeftUMLTypeReferenceParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Association__ReferencedElementAssignment_3_0"
    // InternalCls.g:6206:1: rule__Association__ReferencedElementAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Association__ReferencedElementAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6210:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:6211:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:6211:1: ( ( RULE_ID ) )
            // InternalCls.g:6212:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getReferencedElementAssociationCrossReference_3_0_0()); 
            // InternalCls.g:6213:1: ( RULE_ID )
            // InternalCls.g:6214:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getReferencedElementAssociationIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getReferencedElementAssociationIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getReferencedElementAssociationCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__ReferencedElementAssignment_3_0"


    // $ANTLR start "rule__Association__ReferencedElementAssignment_3_1"
    // InternalCls.g:6225:1: rule__Association__ReferencedElementAssignment_3_1 : ( ( ruleNameString ) ) ;
    public final void rule__Association__ReferencedElementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6229:1: ( ( ( ruleNameString ) ) )
            // InternalCls.g:6230:1: ( ( ruleNameString ) )
            {
            // InternalCls.g:6230:1: ( ( ruleNameString ) )
            // InternalCls.g:6231:1: ( ruleNameString )
            {
             before(grammarAccess.getAssociationAccess().getReferencedElementAssociationCrossReference_3_1_0()); 
            // InternalCls.g:6232:1: ( ruleNameString )
            // InternalCls.g:6233:1: ruleNameString
            {
             before(grammarAccess.getAssociationAccess().getReferencedElementAssociationNameStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleNameString();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getReferencedElementAssociationNameStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getReferencedElementAssociationCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__ReferencedElementAssignment_3_1"


    // $ANTLR start "rule__Association__RightAssignment_4"
    // InternalCls.g:6244:1: rule__Association__RightAssignment_4 : ( ruleUMLTypeReference ) ;
    public final void rule__Association__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6248:1: ( ( ruleUMLTypeReference ) )
            // InternalCls.g:6249:1: ( ruleUMLTypeReference )
            {
            // InternalCls.g:6249:1: ( ruleUMLTypeReference )
            // InternalCls.g:6250:1: ruleUMLTypeReference
            {
             before(grammarAccess.getAssociationAccess().getRightUMLTypeReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUMLTypeReference();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRightUMLTypeReferenceParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalCls.g:6259:1: rule__Association__PropertiesAssignment_5 : ( ruleAssociationProperties ) ;
    public final void rule__Association__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6263:1: ( ( ruleAssociationProperties ) )
            // InternalCls.g:6264:1: ( ruleAssociationProperties )
            {
            // InternalCls.g:6264:1: ( ruleAssociationProperties )
            // InternalCls.g:6265:1: ruleAssociationProperties
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
    // InternalCls.g:6274:1: rule__Association__CommentAssignment_6_1 : ( ( ruleCommentBody ) ) ;
    public final void rule__Association__CommentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6278:1: ( ( ( ruleCommentBody ) ) )
            // InternalCls.g:6279:1: ( ( ruleCommentBody ) )
            {
            // InternalCls.g:6279:1: ( ( ruleCommentBody ) )
            // InternalCls.g:6280:1: ( ruleCommentBody )
            {
             before(grammarAccess.getAssociationAccess().getCommentCommentCrossReference_6_1_0()); 
            // InternalCls.g:6281:1: ( ruleCommentBody )
            // InternalCls.g:6282:1: ruleCommentBody
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


    // $ANTLR start "rule__MultiAssociation__ReferencedElementAssignment_1_0"
    // InternalCls.g:6293:1: rule__MultiAssociation__ReferencedElementAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__MultiAssociation__ReferencedElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6297:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:6298:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:6298:1: ( ( RULE_ID ) )
            // InternalCls.g:6299:1: ( RULE_ID )
            {
             before(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationCrossReference_1_0_0()); 
            // InternalCls.g:6300:1: ( RULE_ID )
            // InternalCls.g:6301:1: RULE_ID
            {
             before(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__ReferencedElementAssignment_1_0"


    // $ANTLR start "rule__MultiAssociation__ReferencedElementAssignment_1_1"
    // InternalCls.g:6312:1: rule__MultiAssociation__ReferencedElementAssignment_1_1 : ( ( ruleNameString ) ) ;
    public final void rule__MultiAssociation__ReferencedElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6316:1: ( ( ( ruleNameString ) ) )
            // InternalCls.g:6317:1: ( ( ruleNameString ) )
            {
            // InternalCls.g:6317:1: ( ( ruleNameString ) )
            // InternalCls.g:6318:1: ( ruleNameString )
            {
             before(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationCrossReference_1_1_0()); 
            // InternalCls.g:6319:1: ( ruleNameString )
            // InternalCls.g:6320:1: ruleNameString
            {
             before(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationNameStringParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleNameString();

            state._fsp--;

             after(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationNameStringParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getMultiAssociationAccess().getReferencedElementAssociationCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAssociation__ReferencedElementAssignment_1_1"


    // $ANTLR start "rule__MultiAssociation__ConnectorEndsAssignment_3_0"
    // InternalCls.g:6331:1: rule__MultiAssociation__ConnectorEndsAssignment_3_0 : ( ruleMemberEnd ) ;
    public final void rule__MultiAssociation__ConnectorEndsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6335:1: ( ( ruleMemberEnd ) )
            // InternalCls.g:6336:1: ( ruleMemberEnd )
            {
            // InternalCls.g:6336:1: ( ruleMemberEnd )
            // InternalCls.g:6337:1: ruleMemberEnd
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
    // InternalCls.g:6346:1: rule__MemberEnd__TypeAssignment_0 : ( ruleUMLTypeReference ) ;
    public final void rule__MemberEnd__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6350:1: ( ( ruleUMLTypeReference ) )
            // InternalCls.g:6351:1: ( ruleUMLTypeReference )
            {
            // InternalCls.g:6351:1: ( ruleUMLTypeReference )
            // InternalCls.g:6352:1: ruleUMLTypeReference
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
    // InternalCls.g:6361:1: rule__MemberEnd__ReferencedElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MemberEnd__ReferencedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6365:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:6366:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:6366:1: ( ( RULE_ID ) )
            // InternalCls.g:6367:1: ( RULE_ID )
            {
             before(grammarAccess.getMemberEndAccess().getReferencedElementPropertyCrossReference_1_0()); 
            // InternalCls.g:6368:1: ( RULE_ID )
            // InternalCls.g:6369:1: RULE_ID
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
    // InternalCls.g:6380:1: rule__MemberEnd__CardinalityAssignment_2 : ( ruleCardinality ) ;
    public final void rule__MemberEnd__CardinalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6384:1: ( ( ruleCardinality ) )
            // InternalCls.g:6385:1: ( ruleCardinality )
            {
            // InternalCls.g:6385:1: ( ruleCardinality )
            // InternalCls.g:6386:1: ruleCardinality
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
    // InternalCls.g:6395:1: rule__MemberEnd__NavigableAssignment_3 : ( ( '<' ) ) ;
    public final void rule__MemberEnd__NavigableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6399:1: ( ( ( '<' ) ) )
            // InternalCls.g:6400:1: ( ( '<' ) )
            {
            // InternalCls.g:6400:1: ( ( '<' ) )
            // InternalCls.g:6401:1: ( '<' )
            {
             before(grammarAccess.getMemberEndAccess().getNavigableLessThanSignKeyword_3_0()); 
            // InternalCls.g:6402:1: ( '<' )
            // InternalCls.g:6403:1: '<'
            {
             before(grammarAccess.getMemberEndAccess().getNavigableLessThanSignKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalCls.g:6418:1: rule__AssociationProperties__CardinalityLeftAssignment_1 : ( ruleCardinality ) ;
    public final void rule__AssociationProperties__CardinalityLeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6422:1: ( ( ruleCardinality ) )
            // InternalCls.g:6423:1: ( ruleCardinality )
            {
            // InternalCls.g:6423:1: ( ruleCardinality )
            // InternalCls.g:6424:1: ruleCardinality
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


    // $ANTLR start "rule__AssociationProperties__PropertyLeftAssignment_2_1"
    // InternalCls.g:6433:1: rule__AssociationProperties__PropertyLeftAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__AssociationProperties__PropertyLeftAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6437:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:6438:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:6438:1: ( ( RULE_ID ) )
            // InternalCls.g:6439:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getPropertyLeftPropertyCrossReference_2_1_0()); 
            // InternalCls.g:6440:1: ( RULE_ID )
            // InternalCls.g:6441:1: RULE_ID
            {
             before(grammarAccess.getAssociationPropertiesAccess().getPropertyLeftPropertyIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationPropertiesAccess().getPropertyLeftPropertyIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getAssociationPropertiesAccess().getPropertyLeftPropertyCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__PropertyLeftAssignment_2_1"


    // $ANTLR start "rule__AssociationProperties__CardinalityRightAssignment_3_1"
    // InternalCls.g:6452:1: rule__AssociationProperties__CardinalityRightAssignment_3_1 : ( ruleCardinality ) ;
    public final void rule__AssociationProperties__CardinalityRightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6456:1: ( ( ruleCardinality ) )
            // InternalCls.g:6457:1: ( ruleCardinality )
            {
            // InternalCls.g:6457:1: ( ruleCardinality )
            // InternalCls.g:6458:1: ruleCardinality
            {
             before(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightCardinalityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightCardinalityParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__CardinalityRightAssignment_3_1"


    // $ANTLR start "rule__AssociationProperties__PropertyRightAssignment_3_2_1"
    // InternalCls.g:6467:1: rule__AssociationProperties__PropertyRightAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__AssociationProperties__PropertyRightAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6471:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:6472:1: ( ( RULE_ID ) )
            {
            // InternalCls.g:6472:1: ( ( RULE_ID ) )
            // InternalCls.g:6473:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationPropertiesAccess().getPropertyRightPropertyCrossReference_3_2_1_0()); 
            // InternalCls.g:6474:1: ( RULE_ID )
            // InternalCls.g:6475:1: RULE_ID
            {
             before(grammarAccess.getAssociationPropertiesAccess().getPropertyRightPropertyIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationPropertiesAccess().getPropertyRightPropertyIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getAssociationPropertiesAccess().getPropertyRightPropertyCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperties__PropertyRightAssignment_3_2_1"


    // $ANTLR start "rule__Cardinality__LowerBoundAssignment_0"
    // InternalCls.g:6486:1: rule__Cardinality__LowerBoundAssignment_0 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6490:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:6491:1: ( ruleCardinalityBound )
            {
            // InternalCls.g:6491:1: ( ruleCardinalityBound )
            // InternalCls.g:6492:1: ruleCardinalityBound
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
    // InternalCls.g:6501:1: rule__Cardinality__UpperBoundAssignment_1_1 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__UpperBoundAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCls.g:6505:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:6506:1: ( ruleCardinalityBound )
            {
            // InternalCls.g:6506:1: ( ruleCardinalityBound )
            // InternalCls.g:6507:1: ruleCardinalityBound
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
    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\14\7\47\2\uffff";
    static final String dfa_3s = "\10\66\2\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\24\uffff\1\10\1\uffff\1\11\14\uffff\1\10",
            "\1\10\1\uffff\1\11\14\uffff\1\10",
            "\1\10\1\uffff\1\11\14\uffff\1\10",
            "\1\10\1\uffff\1\11\14\uffff\1\10",
            "\1\10\1\uffff\1\11\14\uffff\1\10",
            "\1\10\1\uffff\1\11\14\uffff\1\10",
            "\1\10\1\uffff\1\11\14\uffff\1\10",
            "\1\10\1\uffff\1\11\14\uffff\1\10",
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
            return "873:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\12\6\1\52\2\uffff";
    static final String dfa_9s = "\11\70\1\6\1\53\2\uffff";
    static final String dfa_10s = "\13\uffff\1\2\1\1";
    static final String dfa_11s = "\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\12\5\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\43\uffff\1\13\1\10\1\11",
            "\1\12\57\uffff\1\13\1\10\1\11",
            "\1\12\57\uffff\1\13\1\10\1\11",
            "\1\12\57\uffff\1\13\1\10\1\11",
            "\1\12\57\uffff\1\13\1\10\1\11",
            "\1\12\57\uffff\1\13\1\10\1\11",
            "\1\12\57\uffff\1\13\1\10\1\11",
            "\1\12\57\uffff\1\13\1\10\1\11",
            "\1\12\61\uffff\1\11",
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
            return "961:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );";
        }
    }
    static final String dfa_13s = "\13\uffff";
    static final String dfa_14s = "\1\6\1\46\1\uffff\1\4\1\6\3\uffff\1\4\1\uffff\1\46";
    static final String dfa_15s = "\1\71\1\60\1\uffff\2\6\3\uffff\1\46\1\uffff\1\60";
    static final String dfa_16s = "\2\uffff\1\2\2\uffff\1\4\1\1\1\3\1\uffff\1\5\1\uffff";
    static final String dfa_17s = "\13\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\25\uffff\1\3\2\2\32\uffff\1\2",
            "\1\4\7\uffff\1\6\1\7\1\5",
            "",
            "\1\11\1\uffff\1\10",
            "\1\12",
            "",
            "",
            "",
            "\1\2\1\uffff\1\2\34\uffff\1\11\2\uffff\1\2",
            "",
            "\1\4\7\uffff\1\6\1\7\1\5"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "983:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleAssociation ) | ( ruleImplementation ) | ( ruleCommentLink ) | ( ruleMultiAssociation ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x024002A47007F040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x004002800007F002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0200000070000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x024002B47007F040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x004000800007F000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x01C000100007F040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x01C000000007F042L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x004002800007F000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x018000000007F040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000FF80040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x01C000000007F040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x018010000007F040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x018000000007F042L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000070000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0400000000000860L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0018200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});

}