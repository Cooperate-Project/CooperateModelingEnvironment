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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_UNDERSCORE", "RULE_STEREOTYPE_O", "RULE_STEREOTYPE_C", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'asc'", "'agg'", "'com'", "'@start-clsd'", "'@end-clsd'", "'rootPackage'", "'package'", "'{'", "'}'", "'import'", "'.'", "'class'", "'as'", "'interface'", "':'", "'('", "')'", "','", "'isa'", "'impl'", "'role'", "'['", "']'", "'card'", "'note'", "'..'", "'abstract'", "'static'", "'bi'"
    };
    public static final int T__50=50;
    public static final int RULE_STEREOTYPE_C=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_UNDERSCORE=7;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_STEREOTYPE_O=8;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
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
    // InternalCls.g:53:1: entryRuleClassDiagram : ruleClassDiagram EOF ;
    public final void entryRuleClassDiagram() throws RecognitionException {
        try {
            // InternalCls.g:54:1: ( ruleClassDiagram EOF )
            // InternalCls.g:55:1: ruleClassDiagram EOF
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
    // InternalCls.g:62:1: ruleClassDiagram : ( ( rule__ClassDiagram__Group__0 ) ) ;
    public final void ruleClassDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:66:2: ( ( ( rule__ClassDiagram__Group__0 ) ) )
            // InternalCls.g:67:2: ( ( rule__ClassDiagram__Group__0 ) )
            {
            // InternalCls.g:67:2: ( ( rule__ClassDiagram__Group__0 ) )
            // InternalCls.g:68:3: ( rule__ClassDiagram__Group__0 )
            {
             before(grammarAccess.getClassDiagramAccess().getGroup()); 
            // InternalCls.g:69:3: ( rule__ClassDiagram__Group__0 )
            // InternalCls.g:69:4: rule__ClassDiagram__Group__0
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
    // InternalCls.g:78:1: entryRuleRootPackage : ruleRootPackage EOF ;
    public final void entryRuleRootPackage() throws RecognitionException {
        try {
            // InternalCls.g:79:1: ( ruleRootPackage EOF )
            // InternalCls.g:80:1: ruleRootPackage EOF
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
    // InternalCls.g:87:1: ruleRootPackage : ( ( rule__RootPackage__Group__0 ) ) ;
    public final void ruleRootPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:91:2: ( ( ( rule__RootPackage__Group__0 ) ) )
            // InternalCls.g:92:2: ( ( rule__RootPackage__Group__0 ) )
            {
            // InternalCls.g:92:2: ( ( rule__RootPackage__Group__0 ) )
            // InternalCls.g:93:3: ( rule__RootPackage__Group__0 )
            {
             before(grammarAccess.getRootPackageAccess().getGroup()); 
            // InternalCls.g:94:3: ( rule__RootPackage__Group__0 )
            // InternalCls.g:94:4: rule__RootPackage__Group__0
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
    // InternalCls.g:103:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalCls.g:104:1: ( rulePackage EOF )
            // InternalCls.g:105:1: rulePackage EOF
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
    // InternalCls.g:112:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:116:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalCls.g:117:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalCls.g:117:2: ( ( rule__Package__Group__0 ) )
            // InternalCls.g:118:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalCls.g:119:3: ( rule__Package__Group__0 )
            // InternalCls.g:119:4: rule__Package__Group__0
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
    // InternalCls.g:128:1: entryRulePackageImport : rulePackageImport EOF ;
    public final void entryRulePackageImport() throws RecognitionException {
        try {
            // InternalCls.g:129:1: ( rulePackageImport EOF )
            // InternalCls.g:130:1: rulePackageImport EOF
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
    // InternalCls.g:137:1: rulePackageImport : ( ( rule__PackageImport__Group__0 ) ) ;
    public final void rulePackageImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:141:2: ( ( ( rule__PackageImport__Group__0 ) ) )
            // InternalCls.g:142:2: ( ( rule__PackageImport__Group__0 ) )
            {
            // InternalCls.g:142:2: ( ( rule__PackageImport__Group__0 ) )
            // InternalCls.g:143:3: ( rule__PackageImport__Group__0 )
            {
             before(grammarAccess.getPackageImportAccess().getGroup()); 
            // InternalCls.g:144:3: ( rule__PackageImport__Group__0 )
            // InternalCls.g:144:4: rule__PackageImport__Group__0
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
    // InternalCls.g:153:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalCls.g:154:1: ( ruleFQN EOF )
            // InternalCls.g:155:1: ruleFQN EOF
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
    // InternalCls.g:162:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:166:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalCls.g:167:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalCls.g:167:2: ( ( rule__FQN__Group__0 ) )
            // InternalCls.g:168:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalCls.g:169:3: ( rule__FQN__Group__0 )
            // InternalCls.g:169:4: rule__FQN__Group__0
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
    // InternalCls.g:178:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // InternalCls.g:179:1: ( ruleClassifier EOF )
            // InternalCls.g:180:1: ruleClassifier EOF
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
    // InternalCls.g:187:1: ruleClassifier : ( ( rule__Classifier__Alternatives ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:191:2: ( ( ( rule__Classifier__Alternatives ) ) )
            // InternalCls.g:192:2: ( ( rule__Classifier__Alternatives ) )
            {
            // InternalCls.g:192:2: ( ( rule__Classifier__Alternatives ) )
            // InternalCls.g:193:3: ( rule__Classifier__Alternatives )
            {
             before(grammarAccess.getClassifierAccess().getAlternatives()); 
            // InternalCls.g:194:3: ( rule__Classifier__Alternatives )
            // InternalCls.g:194:4: rule__Classifier__Alternatives
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
    // InternalCls.g:203:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalCls.g:204:1: ( ruleClass EOF )
            // InternalCls.g:205:1: ruleClass EOF
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
    // InternalCls.g:212:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:216:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalCls.g:217:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalCls.g:217:2: ( ( rule__Class__Group__0 ) )
            // InternalCls.g:218:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalCls.g:219:3: ( rule__Class__Group__0 )
            // InternalCls.g:219:4: rule__Class__Group__0
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
    // InternalCls.g:228:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalCls.g:229:1: ( ruleInterface EOF )
            // InternalCls.g:230:1: ruleInterface EOF
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
    // InternalCls.g:237:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:241:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalCls.g:242:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalCls.g:242:2: ( ( rule__Interface__Group__0 ) )
            // InternalCls.g:243:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalCls.g:244:3: ( rule__Interface__Group__0 )
            // InternalCls.g:244:4: rule__Interface__Group__0
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


    // $ANTLR start "entryRuleMember"
    // InternalCls.g:253:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalCls.g:254:1: ( ruleMember EOF )
            // InternalCls.g:255:1: ruleMember EOF
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
    // InternalCls.g:262:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:266:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalCls.g:267:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalCls.g:267:2: ( ( rule__Member__Alternatives ) )
            // InternalCls.g:268:3: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // InternalCls.g:269:3: ( rule__Member__Alternatives )
            // InternalCls.g:269:4: rule__Member__Alternatives
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
    // InternalCls.g:278:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalCls.g:279:1: ( ruleAttribute EOF )
            // InternalCls.g:280:1: ruleAttribute EOF
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
    // InternalCls.g:287:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:291:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalCls.g:292:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalCls.g:292:2: ( ( rule__Attribute__Group__0 ) )
            // InternalCls.g:293:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalCls.g:294:3: ( rule__Attribute__Group__0 )
            // InternalCls.g:294:4: rule__Attribute__Group__0
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
    // InternalCls.g:303:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalCls.g:304:1: ( ruleMethod EOF )
            // InternalCls.g:305:1: ruleMethod EOF
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
    // InternalCls.g:312:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:316:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalCls.g:317:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalCls.g:317:2: ( ( rule__Method__Group__0 ) )
            // InternalCls.g:318:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalCls.g:319:3: ( rule__Method__Group__0 )
            // InternalCls.g:319:4: rule__Method__Group__0
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
    // InternalCls.g:328:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalCls.g:329:1: ( ruleParameter EOF )
            // InternalCls.g:330:1: ruleParameter EOF
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
    // InternalCls.g:337:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:341:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalCls.g:342:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalCls.g:342:2: ( ( rule__Parameter__Group__0 ) )
            // InternalCls.g:343:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalCls.g:344:3: ( rule__Parameter__Group__0 )
            // InternalCls.g:344:4: rule__Parameter__Group__0
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
    // InternalCls.g:353:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalCls.g:354:1: ( ruleConnector EOF )
            // InternalCls.g:355:1: ruleConnector EOF
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
    // InternalCls.g:362:1: ruleConnector : ( ( rule__Connector__Alternatives ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:366:2: ( ( ( rule__Connector__Alternatives ) ) )
            // InternalCls.g:367:2: ( ( rule__Connector__Alternatives ) )
            {
            // InternalCls.g:367:2: ( ( rule__Connector__Alternatives ) )
            // InternalCls.g:368:3: ( rule__Connector__Alternatives )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives()); 
            // InternalCls.g:369:3: ( rule__Connector__Alternatives )
            // InternalCls.g:369:4: rule__Connector__Alternatives
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
    // InternalCls.g:378:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalCls.g:379:1: ( ruleGeneralization EOF )
            // InternalCls.g:380:1: ruleGeneralization EOF
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
    // InternalCls.g:387:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:391:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalCls.g:392:2: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalCls.g:392:2: ( ( rule__Generalization__Group__0 ) )
            // InternalCls.g:393:3: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalCls.g:394:3: ( rule__Generalization__Group__0 )
            // InternalCls.g:394:4: rule__Generalization__Group__0
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
    // InternalCls.g:403:1: entryRuleImplementation : ruleImplementation EOF ;
    public final void entryRuleImplementation() throws RecognitionException {
        try {
            // InternalCls.g:404:1: ( ruleImplementation EOF )
            // InternalCls.g:405:1: ruleImplementation EOF
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
    // InternalCls.g:412:1: ruleImplementation : ( ( rule__Implementation__Group__0 ) ) ;
    public final void ruleImplementation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:416:2: ( ( ( rule__Implementation__Group__0 ) ) )
            // InternalCls.g:417:2: ( ( rule__Implementation__Group__0 ) )
            {
            // InternalCls.g:417:2: ( ( rule__Implementation__Group__0 ) )
            // InternalCls.g:418:3: ( rule__Implementation__Group__0 )
            {
             before(grammarAccess.getImplementationAccess().getGroup()); 
            // InternalCls.g:419:3: ( rule__Implementation__Group__0 )
            // InternalCls.g:419:4: rule__Implementation__Group__0
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


    // $ANTLR start "entryRuleXtextAssociation"
    // InternalCls.g:428:1: entryRuleXtextAssociation : ruleXtextAssociation EOF ;
    public final void entryRuleXtextAssociation() throws RecognitionException {
        try {
            // InternalCls.g:429:1: ( ruleXtextAssociation EOF )
            // InternalCls.g:430:1: ruleXtextAssociation EOF
            {
             before(grammarAccess.getXtextAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleXtextAssociation();

            state._fsp--;

             after(grammarAccess.getXtextAssociationRule()); 
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
    // $ANTLR end "entryRuleXtextAssociation"


    // $ANTLR start "ruleXtextAssociation"
    // InternalCls.g:437:1: ruleXtextAssociation : ( ( rule__XtextAssociation__Group__0 ) ) ;
    public final void ruleXtextAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:441:2: ( ( ( rule__XtextAssociation__Group__0 ) ) )
            // InternalCls.g:442:2: ( ( rule__XtextAssociation__Group__0 ) )
            {
            // InternalCls.g:442:2: ( ( rule__XtextAssociation__Group__0 ) )
            // InternalCls.g:443:3: ( rule__XtextAssociation__Group__0 )
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup()); 
            // InternalCls.g:444:3: ( rule__XtextAssociation__Group__0 )
            // InternalCls.g:444:4: rule__XtextAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXtextAssociation"


    // $ANTLR start "entryRuleXtextAssociationMemberEndReferencedType"
    // InternalCls.g:453:1: entryRuleXtextAssociationMemberEndReferencedType : ruleXtextAssociationMemberEndReferencedType EOF ;
    public final void entryRuleXtextAssociationMemberEndReferencedType() throws RecognitionException {
        try {
            // InternalCls.g:454:1: ( ruleXtextAssociationMemberEndReferencedType EOF )
            // InternalCls.g:455:1: ruleXtextAssociationMemberEndReferencedType EOF
            {
             before(grammarAccess.getXtextAssociationMemberEndReferencedTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleXtextAssociationMemberEndReferencedType();

            state._fsp--;

             after(grammarAccess.getXtextAssociationMemberEndReferencedTypeRule()); 
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
    // $ANTLR end "entryRuleXtextAssociationMemberEndReferencedType"


    // $ANTLR start "ruleXtextAssociationMemberEndReferencedType"
    // InternalCls.g:462:1: ruleXtextAssociationMemberEndReferencedType : ( ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment ) ) ;
    public final void ruleXtextAssociationMemberEndReferencedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:466:2: ( ( ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment ) ) )
            // InternalCls.g:467:2: ( ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment ) )
            {
            // InternalCls.g:467:2: ( ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment ) )
            // InternalCls.g:468:3: ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment )
            {
             before(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeAssignment()); 
            // InternalCls.g:469:3: ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment )
            // InternalCls.g:469:4: rule__XtextAssociationMemberEndReferencedType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociationMemberEndReferencedType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXtextAssociationMemberEndReferencedType"


    // $ANTLR start "entryRuleComment"
    // InternalCls.g:478:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalCls.g:479:1: ( ruleComment EOF )
            // InternalCls.g:480:1: ruleComment EOF
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
    // InternalCls.g:487:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:491:2: ( ( ( rule__Comment__Group__0 ) ) )
            // InternalCls.g:492:2: ( ( rule__Comment__Group__0 ) )
            {
            // InternalCls.g:492:2: ( ( rule__Comment__Group__0 ) )
            // InternalCls.g:493:3: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // InternalCls.g:494:3: ( rule__Comment__Group__0 )
            // InternalCls.g:494:4: rule__Comment__Group__0
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


    // $ANTLR start "entryRuleCardinality"
    // InternalCls.g:503:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalCls.g:504:1: ( ruleCardinality EOF )
            // InternalCls.g:505:1: ruleCardinality EOF
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
    // InternalCls.g:512:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:516:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalCls.g:517:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalCls.g:517:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalCls.g:518:3: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalCls.g:519:3: ( rule__Cardinality__Group__0 )
            // InternalCls.g:519:4: rule__Cardinality__Group__0
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
    // InternalCls.g:528:1: entryRuleCommentBody : ruleCommentBody EOF ;
    public final void entryRuleCommentBody() throws RecognitionException {
        try {
            // InternalCls.g:529:1: ( ruleCommentBody EOF )
            // InternalCls.g:530:1: ruleCommentBody EOF
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
    // InternalCls.g:537:1: ruleCommentBody : ( RULE_STRING ) ;
    public final void ruleCommentBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:541:2: ( ( RULE_STRING ) )
            // InternalCls.g:542:2: ( RULE_STRING )
            {
            // InternalCls.g:542:2: ( RULE_STRING )
            // InternalCls.g:543:3: RULE_STRING
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
    // InternalCls.g:553:1: entryRuleCardinalityBound : ruleCardinalityBound EOF ;
    public final void entryRuleCardinalityBound() throws RecognitionException {
        try {
            // InternalCls.g:554:1: ( ruleCardinalityBound EOF )
            // InternalCls.g:555:1: ruleCardinalityBound EOF
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
    // InternalCls.g:562:1: ruleCardinalityBound : ( ( rule__CardinalityBound__Alternatives ) ) ;
    public final void ruleCardinalityBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:566:2: ( ( ( rule__CardinalityBound__Alternatives ) ) )
            // InternalCls.g:567:2: ( ( rule__CardinalityBound__Alternatives ) )
            {
            // InternalCls.g:567:2: ( ( rule__CardinalityBound__Alternatives ) )
            // InternalCls.g:568:3: ( rule__CardinalityBound__Alternatives )
            {
             before(grammarAccess.getCardinalityBoundAccess().getAlternatives()); 
            // InternalCls.g:569:3: ( rule__CardinalityBound__Alternatives )
            // InternalCls.g:569:4: rule__CardinalityBound__Alternatives
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


    // $ANTLR start "entryRuleStereotypeApplication"
    // InternalCls.g:578:1: entryRuleStereotypeApplication : ruleStereotypeApplication EOF ;
    public final void entryRuleStereotypeApplication() throws RecognitionException {
        try {
            // InternalCls.g:579:1: ( ruleStereotypeApplication EOF )
            // InternalCls.g:580:1: ruleStereotypeApplication EOF
            {
             before(grammarAccess.getStereotypeApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleStereotypeApplication();

            state._fsp--;

             after(grammarAccess.getStereotypeApplicationRule()); 
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
    // $ANTLR end "entryRuleStereotypeApplication"


    // $ANTLR start "ruleStereotypeApplication"
    // InternalCls.g:587:1: ruleStereotypeApplication : ( ( rule__StereotypeApplication__Group__0 ) ) ;
    public final void ruleStereotypeApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:591:2: ( ( ( rule__StereotypeApplication__Group__0 ) ) )
            // InternalCls.g:592:2: ( ( rule__StereotypeApplication__Group__0 ) )
            {
            // InternalCls.g:592:2: ( ( rule__StereotypeApplication__Group__0 ) )
            // InternalCls.g:593:3: ( rule__StereotypeApplication__Group__0 )
            {
             before(grammarAccess.getStereotypeApplicationAccess().getGroup()); 
            // InternalCls.g:594:3: ( rule__StereotypeApplication__Group__0 )
            // InternalCls.g:594:4: rule__StereotypeApplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStereotypeApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStereotypeApplication"


    // $ANTLR start "entryRuleTaggedValue"
    // InternalCls.g:603:1: entryRuleTaggedValue : ruleTaggedValue EOF ;
    public final void entryRuleTaggedValue() throws RecognitionException {
        try {
            // InternalCls.g:604:1: ( ruleTaggedValue EOF )
            // InternalCls.g:605:1: ruleTaggedValue EOF
            {
             before(grammarAccess.getTaggedValueRule()); 
            pushFollow(FOLLOW_1);
            ruleTaggedValue();

            state._fsp--;

             after(grammarAccess.getTaggedValueRule()); 
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
    // $ANTLR end "entryRuleTaggedValue"


    // $ANTLR start "ruleTaggedValue"
    // InternalCls.g:612:1: ruleTaggedValue : ( ( rule__TaggedValue__Group__0 ) ) ;
    public final void ruleTaggedValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:616:2: ( ( ( rule__TaggedValue__Group__0 ) ) )
            // InternalCls.g:617:2: ( ( rule__TaggedValue__Group__0 ) )
            {
            // InternalCls.g:617:2: ( ( rule__TaggedValue__Group__0 ) )
            // InternalCls.g:618:3: ( rule__TaggedValue__Group__0 )
            {
             before(grammarAccess.getTaggedValueAccess().getGroup()); 
            // InternalCls.g:619:3: ( rule__TaggedValue__Group__0 )
            // InternalCls.g:619:4: rule__TaggedValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaggedValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaggedValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaggedValue"


    // $ANTLR start "entryRuleRoleName"
    // InternalCls.g:628:1: entryRuleRoleName : ruleRoleName EOF ;
    public final void entryRuleRoleName() throws RecognitionException {
        try {
            // InternalCls.g:629:1: ( ruleRoleName EOF )
            // InternalCls.g:630:1: ruleRoleName EOF
            {
             before(grammarAccess.getRoleNameRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleName();

            state._fsp--;

             after(grammarAccess.getRoleNameRule()); 
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
    // $ANTLR end "entryRuleRoleName"


    // $ANTLR start "ruleRoleName"
    // InternalCls.g:637:1: ruleRoleName : ( ( rule__RoleName__Alternatives ) ) ;
    public final void ruleRoleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:641:2: ( ( ( rule__RoleName__Alternatives ) ) )
            // InternalCls.g:642:2: ( ( rule__RoleName__Alternatives ) )
            {
            // InternalCls.g:642:2: ( ( rule__RoleName__Alternatives ) )
            // InternalCls.g:643:3: ( rule__RoleName__Alternatives )
            {
             before(grammarAccess.getRoleNameAccess().getAlternatives()); 
            // InternalCls.g:644:3: ( rule__RoleName__Alternatives )
            // InternalCls.g:644:4: rule__RoleName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoleName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoleName"


    // $ANTLR start "ruleVisibility"
    // InternalCls.g:653:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:657:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalCls.g:658:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalCls.g:658:2: ( ( rule__Visibility__Alternatives ) )
            // InternalCls.g:659:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalCls.g:660:3: ( rule__Visibility__Alternatives )
            // InternalCls.g:660:4: rule__Visibility__Alternatives
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


    // $ANTLR start "ruleAggregationKind"
    // InternalCls.g:669:1: ruleAggregationKind : ( ( rule__AggregationKind__Alternatives ) ) ;
    public final void ruleAggregationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:673:1: ( ( ( rule__AggregationKind__Alternatives ) ) )
            // InternalCls.g:674:2: ( ( rule__AggregationKind__Alternatives ) )
            {
            // InternalCls.g:674:2: ( ( rule__AggregationKind__Alternatives ) )
            // InternalCls.g:675:3: ( rule__AggregationKind__Alternatives )
            {
             before(grammarAccess.getAggregationKindAccess().getAlternatives()); 
            // InternalCls.g:676:3: ( rule__AggregationKind__Alternatives )
            // InternalCls.g:676:4: rule__AggregationKind__Alternatives
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
    // InternalCls.g:684:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );
    public final void rule__Classifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:688:1: ( ( ruleClass ) | ( ruleInterface ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCls.g:689:2: ( ruleClass )
                    {
                    // InternalCls.g:689:2: ( ruleClass )
                    // InternalCls.g:690:3: ruleClass
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
                    // InternalCls.g:695:2: ( ruleInterface )
                    {
                    // InternalCls.g:695:2: ( ruleInterface )
                    // InternalCls.g:696:3: ruleInterface
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
    // InternalCls.g:705:1: rule__Class__Alternatives_3 : ( ( ( rule__Class__Group_3_0__0 ) ) | ( ( rule__Class__NameAssignment_3_1 ) ) );
    public final void rule__Class__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:709:1: ( ( ( rule__Class__Group_3_0__0 ) ) | ( ( rule__Class__NameAssignment_3_1 ) ) )
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
                    // InternalCls.g:710:2: ( ( rule__Class__Group_3_0__0 ) )
                    {
                    // InternalCls.g:710:2: ( ( rule__Class__Group_3_0__0 ) )
                    // InternalCls.g:711:3: ( rule__Class__Group_3_0__0 )
                    {
                     before(grammarAccess.getClassAccess().getGroup_3_0()); 
                    // InternalCls.g:712:3: ( rule__Class__Group_3_0__0 )
                    // InternalCls.g:712:4: rule__Class__Group_3_0__0
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
                    // InternalCls.g:716:2: ( ( rule__Class__NameAssignment_3_1 ) )
                    {
                    // InternalCls.g:716:2: ( ( rule__Class__NameAssignment_3_1 ) )
                    // InternalCls.g:717:3: ( rule__Class__NameAssignment_3_1 )
                    {
                     before(grammarAccess.getClassAccess().getNameAssignment_3_1()); 
                    // InternalCls.g:718:3: ( rule__Class__NameAssignment_3_1 )
                    // InternalCls.g:718:4: rule__Class__NameAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__NameAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getNameAssignment_3_1()); 

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


    // $ANTLR start "rule__Class__Alternatives_5"
    // InternalCls.g:726:1: rule__Class__Alternatives_5 : ( ( ( rule__Class__CommentsAssignment_5_0 )? ) | ( ( rule__Class__Group_5_1__0 ) ) );
    public final void rule__Class__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:730:1: ( ( ( rule__Class__CommentsAssignment_5_0 )? ) | ( ( rule__Class__Group_5_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOF||(LA4_0>=15 && LA4_0<=24)||LA4_0==26||LA4_0==28||LA4_0==30||LA4_0==33||LA4_0==35||(LA4_0>=40 && LA4_0<=41)||LA4_0==46||LA4_0==48||LA4_0==50) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCls.g:731:2: ( ( rule__Class__CommentsAssignment_5_0 )? )
                    {
                    // InternalCls.g:731:2: ( ( rule__Class__CommentsAssignment_5_0 )? )
                    // InternalCls.g:732:3: ( rule__Class__CommentsAssignment_5_0 )?
                    {
                     before(grammarAccess.getClassAccess().getCommentsAssignment_5_0()); 
                    // InternalCls.g:733:3: ( rule__Class__CommentsAssignment_5_0 )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==46) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalCls.g:733:4: rule__Class__CommentsAssignment_5_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Class__CommentsAssignment_5_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getClassAccess().getCommentsAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:737:2: ( ( rule__Class__Group_5_1__0 ) )
                    {
                    // InternalCls.g:737:2: ( ( rule__Class__Group_5_1__0 ) )
                    // InternalCls.g:738:3: ( rule__Class__Group_5_1__0 )
                    {
                     before(grammarAccess.getClassAccess().getGroup_5_1()); 
                    // InternalCls.g:739:3: ( rule__Class__Group_5_1__0 )
                    // InternalCls.g:739:4: rule__Class__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__Class__Alternatives_5"


    // $ANTLR start "rule__Interface__Alternatives_2"
    // InternalCls.g:747:1: rule__Interface__Alternatives_2 : ( ( ( rule__Interface__Group_2_0__0 ) ) | ( ( rule__Interface__NameAssignment_2_1 ) ) );
    public final void rule__Interface__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:751:1: ( ( ( rule__Interface__Group_2_0__0 ) ) | ( ( rule__Interface__NameAssignment_2_1 ) ) )
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
                    // InternalCls.g:752:2: ( ( rule__Interface__Group_2_0__0 ) )
                    {
                    // InternalCls.g:752:2: ( ( rule__Interface__Group_2_0__0 ) )
                    // InternalCls.g:753:3: ( rule__Interface__Group_2_0__0 )
                    {
                     before(grammarAccess.getInterfaceAccess().getGroup_2_0()); 
                    // InternalCls.g:754:3: ( rule__Interface__Group_2_0__0 )
                    // InternalCls.g:754:4: rule__Interface__Group_2_0__0
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
                    // InternalCls.g:758:2: ( ( rule__Interface__NameAssignment_2_1 ) )
                    {
                    // InternalCls.g:758:2: ( ( rule__Interface__NameAssignment_2_1 ) )
                    // InternalCls.g:759:3: ( rule__Interface__NameAssignment_2_1 )
                    {
                     before(grammarAccess.getInterfaceAccess().getNameAssignment_2_1()); 
                    // InternalCls.g:760:3: ( rule__Interface__NameAssignment_2_1 )
                    // InternalCls.g:760:4: rule__Interface__NameAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__NameAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfaceAccess().getNameAssignment_2_1()); 

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


    // $ANTLR start "rule__Interface__Alternatives_4"
    // InternalCls.g:768:1: rule__Interface__Alternatives_4 : ( ( ( rule__Interface__CommentsAssignment_4_0 )? ) | ( ( rule__Interface__Group_4_1__0 ) ) );
    public final void rule__Interface__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:772:1: ( ( ( rule__Interface__CommentsAssignment_4_0 )? ) | ( ( rule__Interface__Group_4_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||(LA7_0>=15 && LA7_0<=24)||LA7_0==26||LA7_0==28||LA7_0==30||LA7_0==33||LA7_0==35||(LA7_0>=40 && LA7_0<=41)||LA7_0==46||LA7_0==48||LA7_0==50) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCls.g:773:2: ( ( rule__Interface__CommentsAssignment_4_0 )? )
                    {
                    // InternalCls.g:773:2: ( ( rule__Interface__CommentsAssignment_4_0 )? )
                    // InternalCls.g:774:3: ( rule__Interface__CommentsAssignment_4_0 )?
                    {
                     before(grammarAccess.getInterfaceAccess().getCommentsAssignment_4_0()); 
                    // InternalCls.g:775:3: ( rule__Interface__CommentsAssignment_4_0 )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==46) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCls.g:775:4: rule__Interface__CommentsAssignment_4_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Interface__CommentsAssignment_4_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getInterfaceAccess().getCommentsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:779:2: ( ( rule__Interface__Group_4_1__0 ) )
                    {
                    // InternalCls.g:779:2: ( ( rule__Interface__Group_4_1__0 ) )
                    // InternalCls.g:780:3: ( rule__Interface__Group_4_1__0 )
                    {
                     before(grammarAccess.getInterfaceAccess().getGroup_4_1()); 
                    // InternalCls.g:781:3: ( rule__Interface__Group_4_1__0 )
                    // InternalCls.g:781:4: rule__Interface__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfaceAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Interface__Alternatives_4"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalCls.g:789:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:793:1: ( ( ruleAttribute ) | ( ruleMethod ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalCls.g:794:2: ( ruleAttribute )
                    {
                    // InternalCls.g:794:2: ( ruleAttribute )
                    // InternalCls.g:795:3: ruleAttribute
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
                    // InternalCls.g:800:2: ( ruleMethod )
                    {
                    // InternalCls.g:800:2: ( ruleMethod )
                    // InternalCls.g:801:3: ruleMethod
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
    // InternalCls.g:810:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleXtextAssociation ) | ( ruleImplementation ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:814:1: ( ( ruleGeneralization ) | ( ruleXtextAssociation ) | ( ruleImplementation ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt9=1;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 50:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCls.g:815:2: ( ruleGeneralization )
                    {
                    // InternalCls.g:815:2: ( ruleGeneralization )
                    // InternalCls.g:816:3: ruleGeneralization
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
                    // InternalCls.g:821:2: ( ruleXtextAssociation )
                    {
                    // InternalCls.g:821:2: ( ruleXtextAssociation )
                    // InternalCls.g:822:3: ruleXtextAssociation
                    {
                     before(grammarAccess.getConnectorAccess().getXtextAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXtextAssociation();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getXtextAssociationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:827:2: ( ruleImplementation )
                    {
                    // InternalCls.g:827:2: ( ruleImplementation )
                    // InternalCls.g:828:3: ruleImplementation
                    {
                     before(grammarAccess.getConnectorAccess().getImplementationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImplementation();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getImplementationParserRuleCall_2()); 

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
    // InternalCls.g:837:1: rule__CardinalityBound__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CardinalityBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:841:1: ( ( '*' ) | ( RULE_INT ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCls.g:842:2: ( '*' )
                    {
                    // InternalCls.g:842:2: ( '*' )
                    // InternalCls.g:843:3: '*'
                    {
                     before(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:848:2: ( RULE_INT )
                    {
                    // InternalCls.g:848:2: ( RULE_INT )
                    // InternalCls.g:849:3: RULE_INT
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


    // $ANTLR start "rule__RoleName__Alternatives"
    // InternalCls.g:858:1: rule__RoleName__Alternatives : ( ( RULE_ID ) | ( RULE_UNDERSCORE ) );
    public final void rule__RoleName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:862:1: ( ( RULE_ID ) | ( RULE_UNDERSCORE ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_UNDERSCORE) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCls.g:863:2: ( RULE_ID )
                    {
                    // InternalCls.g:863:2: ( RULE_ID )
                    // InternalCls.g:864:3: RULE_ID
                    {
                     before(grammarAccess.getRoleNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getRoleNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:869:2: ( RULE_UNDERSCORE )
                    {
                    // InternalCls.g:869:2: ( RULE_UNDERSCORE )
                    // InternalCls.g:870:3: RULE_UNDERSCORE
                    {
                     before(grammarAccess.getRoleNameAccess().getUNDERSCORETerminalRuleCall_1()); 
                    match(input,RULE_UNDERSCORE,FOLLOW_2); 
                     after(grammarAccess.getRoleNameAccess().getUNDERSCORETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__RoleName__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalCls.g:879:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:883:1: ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt12=1;
                }
                break;
            case 16:
                {
                alt12=2;
                }
                break;
            case 17:
                {
                alt12=3;
                }
                break;
            case 18:
                {
                alt12=4;
                }
                break;
            case 19:
                {
                alt12=5;
                }
                break;
            case 20:
                {
                alt12=6;
                }
                break;
            case 21:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalCls.g:884:2: ( ( '+' ) )
                    {
                    // InternalCls.g:884:2: ( ( '+' ) )
                    // InternalCls.g:885:3: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalCls.g:886:3: ( '+' )
                    // InternalCls.g:886:4: '+'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:890:2: ( ( 'public' ) )
                    {
                    // InternalCls.g:890:2: ( ( 'public' ) )
                    // InternalCls.g:891:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1()); 
                    // InternalCls.g:892:3: ( 'public' )
                    // InternalCls.g:892:4: 'public'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:896:2: ( ( '-' ) )
                    {
                    // InternalCls.g:896:2: ( ( '-' ) )
                    // InternalCls.g:897:3: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2()); 
                    // InternalCls.g:898:3: ( '-' )
                    // InternalCls.g:898:4: '-'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:902:2: ( ( 'private' ) )
                    {
                    // InternalCls.g:902:2: ( ( 'private' ) )
                    // InternalCls.g:903:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3()); 
                    // InternalCls.g:904:3: ( 'private' )
                    // InternalCls.g:904:4: 'private'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:908:2: ( ( '#' ) )
                    {
                    // InternalCls.g:908:2: ( ( '#' ) )
                    // InternalCls.g:909:3: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4()); 
                    // InternalCls.g:910:3: ( '#' )
                    // InternalCls.g:910:4: '#'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:914:2: ( ( 'protected' ) )
                    {
                    // InternalCls.g:914:2: ( ( 'protected' ) )
                    // InternalCls.g:915:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5()); 
                    // InternalCls.g:916:3: ( 'protected' )
                    // InternalCls.g:916:4: 'protected'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:920:2: ( ( '~' ) )
                    {
                    // InternalCls.g:920:2: ( ( '~' ) )
                    // InternalCls.g:921:3: ( '~' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6()); 
                    // InternalCls.g:922:3: ( '~' )
                    // InternalCls.g:922:4: '~'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6()); 

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


    // $ANTLR start "rule__AggregationKind__Alternatives"
    // InternalCls.g:930:1: rule__AggregationKind__Alternatives : ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) );
    public final void rule__AggregationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:934:1: ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCls.g:935:2: ( ( 'asc' ) )
                    {
                    // InternalCls.g:935:2: ( ( 'asc' ) )
                    // InternalCls.g:936:3: ( 'asc' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalCls.g:937:3: ( 'asc' )
                    // InternalCls.g:937:4: 'asc'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:941:2: ( ( 'agg' ) )
                    {
                    // InternalCls.g:941:2: ( ( 'agg' ) )
                    // InternalCls.g:942:3: ( 'agg' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 
                    // InternalCls.g:943:3: ( 'agg' )
                    // InternalCls.g:943:4: 'agg'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:947:2: ( ( 'com' ) )
                    {
                    // InternalCls.g:947:2: ( ( 'com' ) )
                    // InternalCls.g:948:3: ( 'com' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getCOMPOSITIONEnumLiteralDeclaration_2()); 
                    // InternalCls.g:949:3: ( 'com' )
                    // InternalCls.g:949:4: 'com'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalCls.g:957:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:961:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // InternalCls.g:962:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
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
    // InternalCls.g:969:1: rule__ClassDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:973:1: ( ( () ) )
            // InternalCls.g:974:1: ( () )
            {
            // InternalCls.g:974:1: ( () )
            // InternalCls.g:975:2: ()
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 
            // InternalCls.g:976:2: ()
            // InternalCls.g:976:3: 
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
    // InternalCls.g:984:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:988:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // InternalCls.g:989:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
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
    // InternalCls.g:996:1: rule__ClassDiagram__Group__1__Impl : ( '@start-clsd' ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1000:1: ( ( '@start-clsd' ) )
            // InternalCls.g:1001:1: ( '@start-clsd' )
            {
            // InternalCls.g:1001:1: ( '@start-clsd' )
            // InternalCls.g:1002:2: '@start-clsd'
            {
             before(grammarAccess.getClassDiagramAccess().getStartClsdKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getStartClsdKeyword_1()); 

            }


            }

        }
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
    // InternalCls.g:1011:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1015:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // InternalCls.g:1016:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
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
    // InternalCls.g:1023:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__TitleAssignment_2 ) ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1027:1: ( ( ( rule__ClassDiagram__TitleAssignment_2 ) ) )
            // InternalCls.g:1028:1: ( ( rule__ClassDiagram__TitleAssignment_2 ) )
            {
            // InternalCls.g:1028:1: ( ( rule__ClassDiagram__TitleAssignment_2 ) )
            // InternalCls.g:1029:2: ( rule__ClassDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getClassDiagramAccess().getTitleAssignment_2()); 
            // InternalCls.g:1030:2: ( rule__ClassDiagram__TitleAssignment_2 )
            // InternalCls.g:1030:3: rule__ClassDiagram__TitleAssignment_2
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
    // InternalCls.g:1038:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1042:1: ( rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 )
            // InternalCls.g:1043:2: rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4
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
    // InternalCls.g:1050:1: rule__ClassDiagram__Group__3__Impl : ( ( rule__ClassDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1054:1: ( ( ( rule__ClassDiagram__RootPackageAssignment_3 ) ) )
            // InternalCls.g:1055:1: ( ( rule__ClassDiagram__RootPackageAssignment_3 ) )
            {
            // InternalCls.g:1055:1: ( ( rule__ClassDiagram__RootPackageAssignment_3 ) )
            // InternalCls.g:1056:2: ( rule__ClassDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getClassDiagramAccess().getRootPackageAssignment_3()); 
            // InternalCls.g:1057:2: ( rule__ClassDiagram__RootPackageAssignment_3 )
            // InternalCls.g:1057:3: rule__ClassDiagram__RootPackageAssignment_3
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
    // InternalCls.g:1065:1: rule__ClassDiagram__Group__4 : rule__ClassDiagram__Group__4__Impl ;
    public final void rule__ClassDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1069:1: ( rule__ClassDiagram__Group__4__Impl )
            // InternalCls.g:1070:2: rule__ClassDiagram__Group__4__Impl
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
    // InternalCls.g:1076:1: rule__ClassDiagram__Group__4__Impl : ( '@end-clsd' ) ;
    public final void rule__ClassDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1080:1: ( ( '@end-clsd' ) )
            // InternalCls.g:1081:1: ( '@end-clsd' )
            {
            // InternalCls.g:1081:1: ( '@end-clsd' )
            // InternalCls.g:1082:2: '@end-clsd'
            {
             before(grammarAccess.getClassDiagramAccess().getEndClsdKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getEndClsdKeyword_4()); 

            }


            }

        }
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
    // InternalCls.g:1092:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1096:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalCls.g:1097:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
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
    // InternalCls.g:1104:1: rule__RootPackage__Group__0__Impl : ( 'rootPackage' ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1108:1: ( ( 'rootPackage' ) )
            // InternalCls.g:1109:1: ( 'rootPackage' )
            {
            // InternalCls.g:1109:1: ( 'rootPackage' )
            // InternalCls.g:1110:2: 'rootPackage'
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCls.g:1119:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1123:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalCls.g:1124:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
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
    // InternalCls.g:1131:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__NameAssignment_1 ) ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1135:1: ( ( ( rule__RootPackage__NameAssignment_1 ) ) )
            // InternalCls.g:1136:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            {
            // InternalCls.g:1136:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            // InternalCls.g:1137:2: ( rule__RootPackage__NameAssignment_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1()); 
            // InternalCls.g:1138:2: ( rule__RootPackage__NameAssignment_1 )
            // InternalCls.g:1138:3: rule__RootPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootPackageAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalCls.g:1146:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1150:1: ( rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 )
            // InternalCls.g:1151:2: rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3
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
    // InternalCls.g:1158:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__PackageImportsAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1162:1: ( ( ( rule__RootPackage__PackageImportsAssignment_2 )* ) )
            // InternalCls.g:1163:1: ( ( rule__RootPackage__PackageImportsAssignment_2 )* )
            {
            // InternalCls.g:1163:1: ( ( rule__RootPackage__PackageImportsAssignment_2 )* )
            // InternalCls.g:1164:2: ( rule__RootPackage__PackageImportsAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getPackageImportsAssignment_2()); 
            // InternalCls.g:1165:2: ( rule__RootPackage__PackageImportsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCls.g:1165:3: rule__RootPackage__PackageImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RootPackage__PackageImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalCls.g:1173:1: rule__RootPackage__Group__3 : rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 ;
    public final void rule__RootPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1177:1: ( rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 )
            // InternalCls.g:1178:2: rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4
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
    // InternalCls.g:1185:1: rule__RootPackage__Group__3__Impl : ( ( rule__RootPackage__ClassifiersAssignment_3 )* ) ;
    public final void rule__RootPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1189:1: ( ( ( rule__RootPackage__ClassifiersAssignment_3 )* ) )
            // InternalCls.g:1190:1: ( ( rule__RootPackage__ClassifiersAssignment_3 )* )
            {
            // InternalCls.g:1190:1: ( ( rule__RootPackage__ClassifiersAssignment_3 )* )
            // InternalCls.g:1191:2: ( rule__RootPackage__ClassifiersAssignment_3 )*
            {
             before(grammarAccess.getRootPackageAccess().getClassifiersAssignment_3()); 
            // InternalCls.g:1192:2: ( rule__RootPackage__ClassifiersAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=15 && LA15_0<=21)||LA15_0==33||LA15_0==35||LA15_0==48) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCls.g:1192:3: rule__RootPackage__ClassifiersAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RootPackage__ClassifiersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCls.g:1200:1: rule__RootPackage__Group__4 : rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5 ;
    public final void rule__RootPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1204:1: ( rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5 )
            // InternalCls.g:1205:2: rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5
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
    // InternalCls.g:1212:1: rule__RootPackage__Group__4__Impl : ( ( rule__RootPackage__ConnectorsAssignment_4 )* ) ;
    public final void rule__RootPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1216:1: ( ( ( rule__RootPackage__ConnectorsAssignment_4 )* ) )
            // InternalCls.g:1217:1: ( ( rule__RootPackage__ConnectorsAssignment_4 )* )
            {
            // InternalCls.g:1217:1: ( ( rule__RootPackage__ConnectorsAssignment_4 )* )
            // InternalCls.g:1218:2: ( rule__RootPackage__ConnectorsAssignment_4 )*
            {
             before(grammarAccess.getRootPackageAccess().getConnectorsAssignment_4()); 
            // InternalCls.g:1219:2: ( rule__RootPackage__ConnectorsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=22 && LA16_0<=24)||(LA16_0>=40 && LA16_0<=41)||LA16_0==50) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCls.g:1219:3: rule__RootPackage__ConnectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RootPackage__ConnectorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalCls.g:1227:1: rule__RootPackage__Group__5 : rule__RootPackage__Group__5__Impl ;
    public final void rule__RootPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1231:1: ( rule__RootPackage__Group__5__Impl )
            // InternalCls.g:1232:2: rule__RootPackage__Group__5__Impl
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
    // InternalCls.g:1238:1: rule__RootPackage__Group__5__Impl : ( ( rule__RootPackage__PackagesAssignment_5 )* ) ;
    public final void rule__RootPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1242:1: ( ( ( rule__RootPackage__PackagesAssignment_5 )* ) )
            // InternalCls.g:1243:1: ( ( rule__RootPackage__PackagesAssignment_5 )* )
            {
            // InternalCls.g:1243:1: ( ( rule__RootPackage__PackagesAssignment_5 )* )
            // InternalCls.g:1244:2: ( rule__RootPackage__PackagesAssignment_5 )*
            {
             before(grammarAccess.getRootPackageAccess().getPackagesAssignment_5()); 
            // InternalCls.g:1245:2: ( rule__RootPackage__PackagesAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCls.g:1245:3: rule__RootPackage__PackagesAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__RootPackage__PackagesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalCls.g:1254:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1258:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalCls.g:1259:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalCls.g:1266:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1270:1: ( ( 'package' ) )
            // InternalCls.g:1271:1: ( 'package' )
            {
            // InternalCls.g:1271:1: ( 'package' )
            // InternalCls.g:1272:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCls.g:1281:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1285:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalCls.g:1286:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalCls.g:1293:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1297:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalCls.g:1298:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalCls.g:1298:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalCls.g:1299:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalCls.g:1300:2: ( rule__Package__NameAssignment_1 )
            // InternalCls.g:1300:3: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalCls.g:1308:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1312:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalCls.g:1313:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalCls.g:1320:1: rule__Package__Group__2__Impl : ( ( rule__Package__AppliedStereotypesAssignment_2 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1324:1: ( ( ( rule__Package__AppliedStereotypesAssignment_2 )* ) )
            // InternalCls.g:1325:1: ( ( rule__Package__AppliedStereotypesAssignment_2 )* )
            {
            // InternalCls.g:1325:1: ( ( rule__Package__AppliedStereotypesAssignment_2 )* )
            // InternalCls.g:1326:2: ( rule__Package__AppliedStereotypesAssignment_2 )*
            {
             before(grammarAccess.getPackageAccess().getAppliedStereotypesAssignment_2()); 
            // InternalCls.g:1327:2: ( rule__Package__AppliedStereotypesAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STEREOTYPE_O) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCls.g:1327:3: rule__Package__AppliedStereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Package__AppliedStereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getAppliedStereotypesAssignment_2()); 

            }


            }

        }
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
    // InternalCls.g:1335:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1339:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalCls.g:1340:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalCls.g:1347:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1351:1: ( ( '{' ) )
            // InternalCls.g:1352:1: ( '{' )
            {
            // InternalCls.g:1352:1: ( '{' )
            // InternalCls.g:1353:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalCls.g:1362:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1366:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalCls.g:1367:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalCls.g:1374:1: rule__Package__Group__4__Impl : ( ( rule__Package__PackageImportsAssignment_4 )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1378:1: ( ( ( rule__Package__PackageImportsAssignment_4 )* ) )
            // InternalCls.g:1379:1: ( ( rule__Package__PackageImportsAssignment_4 )* )
            {
            // InternalCls.g:1379:1: ( ( rule__Package__PackageImportsAssignment_4 )* )
            // InternalCls.g:1380:2: ( rule__Package__PackageImportsAssignment_4 )*
            {
             before(grammarAccess.getPackageAccess().getPackageImportsAssignment_4()); 
            // InternalCls.g:1381:2: ( rule__Package__PackageImportsAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCls.g:1381:3: rule__Package__PackageImportsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Package__PackageImportsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getPackageImportsAssignment_4()); 

            }


            }

        }
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
    // InternalCls.g:1389:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1393:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalCls.g:1394:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalCls.g:1401:1: rule__Package__Group__5__Impl : ( ( rule__Package__ClassifiersAssignment_5 )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1405:1: ( ( ( rule__Package__ClassifiersAssignment_5 )* ) )
            // InternalCls.g:1406:1: ( ( rule__Package__ClassifiersAssignment_5 )* )
            {
            // InternalCls.g:1406:1: ( ( rule__Package__ClassifiersAssignment_5 )* )
            // InternalCls.g:1407:2: ( rule__Package__ClassifiersAssignment_5 )*
            {
             before(grammarAccess.getPackageAccess().getClassifiersAssignment_5()); 
            // InternalCls.g:1408:2: ( rule__Package__ClassifiersAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=15 && LA20_0<=21)||LA20_0==33||LA20_0==35||LA20_0==48) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCls.g:1408:3: rule__Package__ClassifiersAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Package__ClassifiersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getClassifiersAssignment_5()); 

            }


            }

        }
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
    // InternalCls.g:1416:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1420:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalCls.g:1421:2: rule__Package__Group__6__Impl rule__Package__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalCls.g:1428:1: rule__Package__Group__6__Impl : ( ( rule__Package__ConnectorsAssignment_6 )* ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1432:1: ( ( ( rule__Package__ConnectorsAssignment_6 )* ) )
            // InternalCls.g:1433:1: ( ( rule__Package__ConnectorsAssignment_6 )* )
            {
            // InternalCls.g:1433:1: ( ( rule__Package__ConnectorsAssignment_6 )* )
            // InternalCls.g:1434:2: ( rule__Package__ConnectorsAssignment_6 )*
            {
             before(grammarAccess.getPackageAccess().getConnectorsAssignment_6()); 
            // InternalCls.g:1435:2: ( rule__Package__ConnectorsAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=22 && LA21_0<=24)||(LA21_0>=40 && LA21_0<=41)||LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCls.g:1435:3: rule__Package__ConnectorsAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Package__ConnectorsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getConnectorsAssignment_6()); 

            }


            }

        }
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
    // InternalCls.g:1443:1: rule__Package__Group__7 : rule__Package__Group__7__Impl rule__Package__Group__8 ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1447:1: ( rule__Package__Group__7__Impl rule__Package__Group__8 )
            // InternalCls.g:1448:2: rule__Package__Group__7__Impl rule__Package__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Package__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__8();

            state._fsp--;


            }

        }
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
    // InternalCls.g:1455:1: rule__Package__Group__7__Impl : ( ( rule__Package__PackagesAssignment_7 )* ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1459:1: ( ( ( rule__Package__PackagesAssignment_7 )* ) )
            // InternalCls.g:1460:1: ( ( rule__Package__PackagesAssignment_7 )* )
            {
            // InternalCls.g:1460:1: ( ( rule__Package__PackagesAssignment_7 )* )
            // InternalCls.g:1461:2: ( rule__Package__PackagesAssignment_7 )*
            {
             before(grammarAccess.getPackageAccess().getPackagesAssignment_7()); 
            // InternalCls.g:1462:2: ( rule__Package__PackagesAssignment_7 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCls.g:1462:3: rule__Package__PackagesAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Package__PackagesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getPackagesAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Package__Group__8"
    // InternalCls.g:1470:1: rule__Package__Group__8 : rule__Package__Group__8__Impl ;
    public final void rule__Package__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1474:1: ( rule__Package__Group__8__Impl )
            // InternalCls.g:1475:2: rule__Package__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__8"


    // $ANTLR start "rule__Package__Group__8__Impl"
    // InternalCls.g:1481:1: rule__Package__Group__8__Impl : ( '}' ) ;
    public final void rule__Package__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1485:1: ( ( '}' ) )
            // InternalCls.g:1486:1: ( '}' )
            {
            // InternalCls.g:1486:1: ( '}' )
            // InternalCls.g:1487:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__8__Impl"


    // $ANTLR start "rule__PackageImport__Group__0"
    // InternalCls.g:1497:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1501:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // InternalCls.g:1502:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
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
    // InternalCls.g:1509:1: rule__PackageImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1513:1: ( ( 'import' ) )
            // InternalCls.g:1514:1: ( 'import' )
            {
            // InternalCls.g:1514:1: ( 'import' )
            // InternalCls.g:1515:2: 'import'
            {
             before(grammarAccess.getPackageImportAccess().getImportKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCls.g:1524:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1528:1: ( rule__PackageImport__Group__1__Impl )
            // InternalCls.g:1529:2: rule__PackageImport__Group__1__Impl
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
    // InternalCls.g:1535:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__ImportedPackageAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1539:1: ( ( ( rule__PackageImport__ImportedPackageAssignment_1 ) ) )
            // InternalCls.g:1540:1: ( ( rule__PackageImport__ImportedPackageAssignment_1 ) )
            {
            // InternalCls.g:1540:1: ( ( rule__PackageImport__ImportedPackageAssignment_1 ) )
            // InternalCls.g:1541:2: ( rule__PackageImport__ImportedPackageAssignment_1 )
            {
             before(grammarAccess.getPackageImportAccess().getImportedPackageAssignment_1()); 
            // InternalCls.g:1542:2: ( rule__PackageImport__ImportedPackageAssignment_1 )
            // InternalCls.g:1542:3: rule__PackageImport__ImportedPackageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageImport__ImportedPackageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageImportAccess().getImportedPackageAssignment_1()); 

            }


            }

        }
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
    // InternalCls.g:1551:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1555:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCls.g:1556:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCls.g:1563:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1567:1: ( ( RULE_ID ) )
            // InternalCls.g:1568:1: ( RULE_ID )
            {
            // InternalCls.g:1568:1: ( RULE_ID )
            // InternalCls.g:1569:2: RULE_ID
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
    // InternalCls.g:1578:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1582:1: ( rule__FQN__Group__1__Impl )
            // InternalCls.g:1583:2: rule__FQN__Group__1__Impl
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
    // InternalCls.g:1589:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1593:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCls.g:1594:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCls.g:1594:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCls.g:1595:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCls.g:1596:2: ( rule__FQN__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCls.g:1596:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalCls.g:1605:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1609:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCls.g:1610:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalCls.g:1617:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1621:1: ( ( '.' ) )
            // InternalCls.g:1622:1: ( '.' )
            {
            // InternalCls.g:1622:1: ( '.' )
            // InternalCls.g:1623:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCls.g:1632:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1636:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCls.g:1637:2: rule__FQN__Group_1__1__Impl
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
    // InternalCls.g:1643:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1647:1: ( ( RULE_ID ) )
            // InternalCls.g:1648:1: ( RULE_ID )
            {
            // InternalCls.g:1648:1: ( RULE_ID )
            // InternalCls.g:1649:2: RULE_ID
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
    // InternalCls.g:1659:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1663:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalCls.g:1664:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:1671:1: rule__Class__Group__0__Impl : ( ( rule__Class__VisibilityAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1675:1: ( ( ( rule__Class__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1676:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1676:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            // InternalCls.g:1677:2: ( rule__Class__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1678:2: ( rule__Class__VisibilityAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=15 && LA24_0<=21)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCls.g:1678:3: rule__Class__VisibilityAssignment_0
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
    // InternalCls.g:1686:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1690:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalCls.g:1691:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:1698:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1702:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalCls.g:1703:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalCls.g:1703:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalCls.g:1704:2: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalCls.g:1705:2: ( rule__Class__AbstractAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==48) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:1705:3: rule__Class__AbstractAssignment_1
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
    // InternalCls.g:1713:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1717:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalCls.g:1718:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalCls.g:1725:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1729:1: ( ( 'class' ) )
            // InternalCls.g:1730:1: ( 'class' )
            {
            // InternalCls.g:1730:1: ( 'class' )
            // InternalCls.g:1731:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCls.g:1740:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1744:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalCls.g:1745:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalCls.g:1752:1: rule__Class__Group__3__Impl : ( ( rule__Class__Alternatives_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1756:1: ( ( ( rule__Class__Alternatives_3 ) ) )
            // InternalCls.g:1757:1: ( ( rule__Class__Alternatives_3 ) )
            {
            // InternalCls.g:1757:1: ( ( rule__Class__Alternatives_3 ) )
            // InternalCls.g:1758:2: ( rule__Class__Alternatives_3 )
            {
             before(grammarAccess.getClassAccess().getAlternatives_3()); 
            // InternalCls.g:1759:2: ( rule__Class__Alternatives_3 )
            // InternalCls.g:1759:3: rule__Class__Alternatives_3
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
    // InternalCls.g:1767:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1771:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalCls.g:1772:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalCls.g:1779:1: rule__Class__Group__4__Impl : ( ( rule__Class__AppliedStereotypesAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1783:1: ( ( ( rule__Class__AppliedStereotypesAssignment_4 )* ) )
            // InternalCls.g:1784:1: ( ( rule__Class__AppliedStereotypesAssignment_4 )* )
            {
            // InternalCls.g:1784:1: ( ( rule__Class__AppliedStereotypesAssignment_4 )* )
            // InternalCls.g:1785:2: ( rule__Class__AppliedStereotypesAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getAppliedStereotypesAssignment_4()); 
            // InternalCls.g:1786:2: ( rule__Class__AppliedStereotypesAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STEREOTYPE_O) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCls.g:1786:3: rule__Class__AppliedStereotypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Class__AppliedStereotypesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAppliedStereotypesAssignment_4()); 

            }


            }

        }
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
    // InternalCls.g:1794:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1798:1: ( rule__Class__Group__5__Impl )
            // InternalCls.g:1799:2: rule__Class__Group__5__Impl
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
    // InternalCls.g:1805:1: rule__Class__Group__5__Impl : ( ( rule__Class__Alternatives_5 ) ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1809:1: ( ( ( rule__Class__Alternatives_5 ) ) )
            // InternalCls.g:1810:1: ( ( rule__Class__Alternatives_5 ) )
            {
            // InternalCls.g:1810:1: ( ( rule__Class__Alternatives_5 ) )
            // InternalCls.g:1811:2: ( rule__Class__Alternatives_5 )
            {
             before(grammarAccess.getClassAccess().getAlternatives_5()); 
            // InternalCls.g:1812:2: ( rule__Class__Alternatives_5 )
            // InternalCls.g:1812:3: rule__Class__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Class__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAlternatives_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group_3_0__0"
    // InternalCls.g:1821:1: rule__Class__Group_3_0__0 : rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1 ;
    public final void rule__Class__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1825:1: ( rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1 )
            // InternalCls.g:1826:2: rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:1833:1: rule__Class__Group_3_0__0__Impl : ( ( rule__Class__NameAssignment_3_0_0 ) ) ;
    public final void rule__Class__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1837:1: ( ( ( rule__Class__NameAssignment_3_0_0 ) ) )
            // InternalCls.g:1838:1: ( ( rule__Class__NameAssignment_3_0_0 ) )
            {
            // InternalCls.g:1838:1: ( ( rule__Class__NameAssignment_3_0_0 ) )
            // InternalCls.g:1839:2: ( rule__Class__NameAssignment_3_0_0 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3_0_0()); 
            // InternalCls.g:1840:2: ( rule__Class__NameAssignment_3_0_0 )
            // InternalCls.g:1840:3: rule__Class__NameAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_3_0_0()); 

            }


            }

        }
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
    // InternalCls.g:1848:1: rule__Class__Group_3_0__1 : rule__Class__Group_3_0__1__Impl rule__Class__Group_3_0__2 ;
    public final void rule__Class__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1852:1: ( rule__Class__Group_3_0__1__Impl rule__Class__Group_3_0__2 )
            // InternalCls.g:1853:2: rule__Class__Group_3_0__1__Impl rule__Class__Group_3_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3_0__2();

            state._fsp--;


            }

        }
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
    // InternalCls.g:1860:1: rule__Class__Group_3_0__1__Impl : ( 'as' ) ;
    public final void rule__Class__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1864:1: ( ( 'as' ) )
            // InternalCls.g:1865:1: ( 'as' )
            {
            // InternalCls.g:1865:1: ( 'as' )
            // InternalCls.g:1866:2: 'as'
            {
             before(grammarAccess.getClassAccess().getAsKeyword_3_0_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAsKeyword_3_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group_3_0__2"
    // InternalCls.g:1875:1: rule__Class__Group_3_0__2 : rule__Class__Group_3_0__2__Impl ;
    public final void rule__Class__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1879:1: ( rule__Class__Group_3_0__2__Impl )
            // InternalCls.g:1880:2: rule__Class__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_0__2"


    // $ANTLR start "rule__Class__Group_3_0__2__Impl"
    // InternalCls.g:1886:1: rule__Class__Group_3_0__2__Impl : ( ( rule__Class__AliasAssignment_3_0_2 ) ) ;
    public final void rule__Class__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1890:1: ( ( ( rule__Class__AliasAssignment_3_0_2 ) ) )
            // InternalCls.g:1891:1: ( ( rule__Class__AliasAssignment_3_0_2 ) )
            {
            // InternalCls.g:1891:1: ( ( rule__Class__AliasAssignment_3_0_2 ) )
            // InternalCls.g:1892:2: ( rule__Class__AliasAssignment_3_0_2 )
            {
             before(grammarAccess.getClassAccess().getAliasAssignment_3_0_2()); 
            // InternalCls.g:1893:2: ( rule__Class__AliasAssignment_3_0_2 )
            // InternalCls.g:1893:3: rule__Class__AliasAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__AliasAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAliasAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3_0__2__Impl"


    // $ANTLR start "rule__Class__Group_5_1__0"
    // InternalCls.g:1902:1: rule__Class__Group_5_1__0 : rule__Class__Group_5_1__0__Impl rule__Class__Group_5_1__1 ;
    public final void rule__Class__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1906:1: ( rule__Class__Group_5_1__0__Impl rule__Class__Group_5_1__1 )
            // InternalCls.g:1907:2: rule__Class__Group_5_1__0__Impl rule__Class__Group_5_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Class__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_1__0"


    // $ANTLR start "rule__Class__Group_5_1__0__Impl"
    // InternalCls.g:1914:1: rule__Class__Group_5_1__0__Impl : ( '{' ) ;
    public final void rule__Class__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1918:1: ( ( '{' ) )
            // InternalCls.g:1919:1: ( '{' )
            {
            // InternalCls.g:1919:1: ( '{' )
            // InternalCls.g:1920:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_1__0__Impl"


    // $ANTLR start "rule__Class__Group_5_1__1"
    // InternalCls.g:1929:1: rule__Class__Group_5_1__1 : rule__Class__Group_5_1__1__Impl rule__Class__Group_5_1__2 ;
    public final void rule__Class__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1933:1: ( rule__Class__Group_5_1__1__Impl rule__Class__Group_5_1__2 )
            // InternalCls.g:1934:2: rule__Class__Group_5_1__1__Impl rule__Class__Group_5_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Class__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_1__1"


    // $ANTLR start "rule__Class__Group_5_1__1__Impl"
    // InternalCls.g:1941:1: rule__Class__Group_5_1__1__Impl : ( ( rule__Class__CommentsAssignment_5_1_1 )? ) ;
    public final void rule__Class__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1945:1: ( ( ( rule__Class__CommentsAssignment_5_1_1 )? ) )
            // InternalCls.g:1946:1: ( ( rule__Class__CommentsAssignment_5_1_1 )? )
            {
            // InternalCls.g:1946:1: ( ( rule__Class__CommentsAssignment_5_1_1 )? )
            // InternalCls.g:1947:2: ( rule__Class__CommentsAssignment_5_1_1 )?
            {
             before(grammarAccess.getClassAccess().getCommentsAssignment_5_1_1()); 
            // InternalCls.g:1948:2: ( rule__Class__CommentsAssignment_5_1_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:1948:3: rule__Class__CommentsAssignment_5_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__CommentsAssignment_5_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getCommentsAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_1__1__Impl"


    // $ANTLR start "rule__Class__Group_5_1__2"
    // InternalCls.g:1956:1: rule__Class__Group_5_1__2 : rule__Class__Group_5_1__2__Impl rule__Class__Group_5_1__3 ;
    public final void rule__Class__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1960:1: ( rule__Class__Group_5_1__2__Impl rule__Class__Group_5_1__3 )
            // InternalCls.g:1961:2: rule__Class__Group_5_1__2__Impl rule__Class__Group_5_1__3
            {
            pushFollow(FOLLOW_22);
            rule__Class__Group_5_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_1__2"


    // $ANTLR start "rule__Class__Group_5_1__2__Impl"
    // InternalCls.g:1968:1: rule__Class__Group_5_1__2__Impl : ( ( rule__Class__MembersAssignment_5_1_2 )* ) ;
    public final void rule__Class__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1972:1: ( ( ( rule__Class__MembersAssignment_5_1_2 )* ) )
            // InternalCls.g:1973:1: ( ( rule__Class__MembersAssignment_5_1_2 )* )
            {
            // InternalCls.g:1973:1: ( ( rule__Class__MembersAssignment_5_1_2 )* )
            // InternalCls.g:1974:2: ( rule__Class__MembersAssignment_5_1_2 )*
            {
             before(grammarAccess.getClassAccess().getMembersAssignment_5_1_2()); 
            // InternalCls.g:1975:2: ( rule__Class__MembersAssignment_5_1_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=15 && LA28_0<=21)||(LA28_0>=48 && LA28_0<=49)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCls.g:1975:3: rule__Class__MembersAssignment_5_1_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Class__MembersAssignment_5_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMembersAssignment_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_1__2__Impl"


    // $ANTLR start "rule__Class__Group_5_1__3"
    // InternalCls.g:1983:1: rule__Class__Group_5_1__3 : rule__Class__Group_5_1__3__Impl ;
    public final void rule__Class__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1987:1: ( rule__Class__Group_5_1__3__Impl )
            // InternalCls.g:1988:2: rule__Class__Group_5_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_1__3"


    // $ANTLR start "rule__Class__Group_5_1__3__Impl"
    // InternalCls.g:1994:1: rule__Class__Group_5_1__3__Impl : ( '}' ) ;
    public final void rule__Class__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1998:1: ( ( '}' ) )
            // InternalCls.g:1999:1: ( '}' )
            {
            // InternalCls.g:1999:1: ( '}' )
            // InternalCls.g:2000:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_1_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_1__3__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalCls.g:2010:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2014:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalCls.g:2015:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:2022:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__VisibilityAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2026:1: ( ( ( rule__Interface__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2027:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2027:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            // InternalCls.g:2028:2: ( rule__Interface__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2029:2: ( rule__Interface__VisibilityAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=15 && LA29_0<=21)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:2029:3: rule__Interface__VisibilityAssignment_0
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
    // InternalCls.g:2037:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2041:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalCls.g:2042:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalCls.g:2049:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2053:1: ( ( 'interface' ) )
            // InternalCls.g:2054:1: ( 'interface' )
            {
            // InternalCls.g:2054:1: ( 'interface' )
            // InternalCls.g:2055:2: 'interface'
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
    // InternalCls.g:2064:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2068:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalCls.g:2069:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalCls.g:2076:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__Alternatives_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2080:1: ( ( ( rule__Interface__Alternatives_2 ) ) )
            // InternalCls.g:2081:1: ( ( rule__Interface__Alternatives_2 ) )
            {
            // InternalCls.g:2081:1: ( ( rule__Interface__Alternatives_2 ) )
            // InternalCls.g:2082:2: ( rule__Interface__Alternatives_2 )
            {
             before(grammarAccess.getInterfaceAccess().getAlternatives_2()); 
            // InternalCls.g:2083:2: ( rule__Interface__Alternatives_2 )
            // InternalCls.g:2083:3: rule__Interface__Alternatives_2
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
    // InternalCls.g:2091:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2095:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalCls.g:2096:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalCls.g:2103:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__AppliedStereotypesAssignment_3 )* ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2107:1: ( ( ( rule__Interface__AppliedStereotypesAssignment_3 )* ) )
            // InternalCls.g:2108:1: ( ( rule__Interface__AppliedStereotypesAssignment_3 )* )
            {
            // InternalCls.g:2108:1: ( ( rule__Interface__AppliedStereotypesAssignment_3 )* )
            // InternalCls.g:2109:2: ( rule__Interface__AppliedStereotypesAssignment_3 )*
            {
             before(grammarAccess.getInterfaceAccess().getAppliedStereotypesAssignment_3()); 
            // InternalCls.g:2110:2: ( rule__Interface__AppliedStereotypesAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STEREOTYPE_O) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCls.g:2110:3: rule__Interface__AppliedStereotypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Interface__AppliedStereotypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getAppliedStereotypesAssignment_3()); 

            }


            }

        }
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
    // InternalCls.g:2118:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2122:1: ( rule__Interface__Group__4__Impl )
            // InternalCls.g:2123:2: rule__Interface__Group__4__Impl
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
    // InternalCls.g:2129:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__Alternatives_4 ) ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2133:1: ( ( ( rule__Interface__Alternatives_4 ) ) )
            // InternalCls.g:2134:1: ( ( rule__Interface__Alternatives_4 ) )
            {
            // InternalCls.g:2134:1: ( ( rule__Interface__Alternatives_4 ) )
            // InternalCls.g:2135:2: ( rule__Interface__Alternatives_4 )
            {
             before(grammarAccess.getInterfaceAccess().getAlternatives_4()); 
            // InternalCls.g:2136:2: ( rule__Interface__Alternatives_4 )
            // InternalCls.g:2136:3: rule__Interface__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getAlternatives_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interface__Group_2_0__0"
    // InternalCls.g:2145:1: rule__Interface__Group_2_0__0 : rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1 ;
    public final void rule__Interface__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2149:1: ( rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1 )
            // InternalCls.g:2150:2: rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:2157:1: rule__Interface__Group_2_0__0__Impl : ( ( rule__Interface__NameAssignment_2_0_0 ) ) ;
    public final void rule__Interface__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2161:1: ( ( ( rule__Interface__NameAssignment_2_0_0 ) ) )
            // InternalCls.g:2162:1: ( ( rule__Interface__NameAssignment_2_0_0 ) )
            {
            // InternalCls.g:2162:1: ( ( rule__Interface__NameAssignment_2_0_0 ) )
            // InternalCls.g:2163:2: ( rule__Interface__NameAssignment_2_0_0 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2_0_0()); 
            // InternalCls.g:2164:2: ( rule__Interface__NameAssignment_2_0_0 )
            // InternalCls.g:2164:3: rule__Interface__NameAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_2_0_0()); 

            }


            }

        }
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
    // InternalCls.g:2172:1: rule__Interface__Group_2_0__1 : rule__Interface__Group_2_0__1__Impl rule__Interface__Group_2_0__2 ;
    public final void rule__Interface__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2176:1: ( rule__Interface__Group_2_0__1__Impl rule__Interface__Group_2_0__2 )
            // InternalCls.g:2177:2: rule__Interface__Group_2_0__1__Impl rule__Interface__Group_2_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Interface__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_2_0__2();

            state._fsp--;


            }

        }
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
    // InternalCls.g:2184:1: rule__Interface__Group_2_0__1__Impl : ( 'as' ) ;
    public final void rule__Interface__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2188:1: ( ( 'as' ) )
            // InternalCls.g:2189:1: ( 'as' )
            {
            // InternalCls.g:2189:1: ( 'as' )
            // InternalCls.g:2190:2: 'as'
            {
             before(grammarAccess.getInterfaceAccess().getAsKeyword_2_0_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getAsKeyword_2_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interface__Group_2_0__2"
    // InternalCls.g:2199:1: rule__Interface__Group_2_0__2 : rule__Interface__Group_2_0__2__Impl ;
    public final void rule__Interface__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2203:1: ( rule__Interface__Group_2_0__2__Impl )
            // InternalCls.g:2204:2: rule__Interface__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_0__2"


    // $ANTLR start "rule__Interface__Group_2_0__2__Impl"
    // InternalCls.g:2210:1: rule__Interface__Group_2_0__2__Impl : ( ( rule__Interface__AliasAssignment_2_0_2 ) ) ;
    public final void rule__Interface__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2214:1: ( ( ( rule__Interface__AliasAssignment_2_0_2 ) ) )
            // InternalCls.g:2215:1: ( ( rule__Interface__AliasAssignment_2_0_2 ) )
            {
            // InternalCls.g:2215:1: ( ( rule__Interface__AliasAssignment_2_0_2 ) )
            // InternalCls.g:2216:2: ( rule__Interface__AliasAssignment_2_0_2 )
            {
             before(grammarAccess.getInterfaceAccess().getAliasAssignment_2_0_2()); 
            // InternalCls.g:2217:2: ( rule__Interface__AliasAssignment_2_0_2 )
            // InternalCls.g:2217:3: rule__Interface__AliasAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Interface__AliasAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getAliasAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_0__2__Impl"


    // $ANTLR start "rule__Interface__Group_4_1__0"
    // InternalCls.g:2226:1: rule__Interface__Group_4_1__0 : rule__Interface__Group_4_1__0__Impl rule__Interface__Group_4_1__1 ;
    public final void rule__Interface__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2230:1: ( rule__Interface__Group_4_1__0__Impl rule__Interface__Group_4_1__1 )
            // InternalCls.g:2231:2: rule__Interface__Group_4_1__0__Impl rule__Interface__Group_4_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Interface__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_1__0"


    // $ANTLR start "rule__Interface__Group_4_1__0__Impl"
    // InternalCls.g:2238:1: rule__Interface__Group_4_1__0__Impl : ( '{' ) ;
    public final void rule__Interface__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2242:1: ( ( '{' ) )
            // InternalCls.g:2243:1: ( '{' )
            {
            // InternalCls.g:2243:1: ( '{' )
            // InternalCls.g:2244:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_1__0__Impl"


    // $ANTLR start "rule__Interface__Group_4_1__1"
    // InternalCls.g:2253:1: rule__Interface__Group_4_1__1 : rule__Interface__Group_4_1__1__Impl rule__Interface__Group_4_1__2 ;
    public final void rule__Interface__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2257:1: ( rule__Interface__Group_4_1__1__Impl rule__Interface__Group_4_1__2 )
            // InternalCls.g:2258:2: rule__Interface__Group_4_1__1__Impl rule__Interface__Group_4_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Interface__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_1__1"


    // $ANTLR start "rule__Interface__Group_4_1__1__Impl"
    // InternalCls.g:2265:1: rule__Interface__Group_4_1__1__Impl : ( ( rule__Interface__CommentsAssignment_4_1_1 )? ) ;
    public final void rule__Interface__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2269:1: ( ( ( rule__Interface__CommentsAssignment_4_1_1 )? ) )
            // InternalCls.g:2270:1: ( ( rule__Interface__CommentsAssignment_4_1_1 )? )
            {
            // InternalCls.g:2270:1: ( ( rule__Interface__CommentsAssignment_4_1_1 )? )
            // InternalCls.g:2271:2: ( rule__Interface__CommentsAssignment_4_1_1 )?
            {
             before(grammarAccess.getInterfaceAccess().getCommentsAssignment_4_1_1()); 
            // InternalCls.g:2272:2: ( rule__Interface__CommentsAssignment_4_1_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCls.g:2272:3: rule__Interface__CommentsAssignment_4_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__CommentsAssignment_4_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getCommentsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_1__1__Impl"


    // $ANTLR start "rule__Interface__Group_4_1__2"
    // InternalCls.g:2280:1: rule__Interface__Group_4_1__2 : rule__Interface__Group_4_1__2__Impl rule__Interface__Group_4_1__3 ;
    public final void rule__Interface__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2284:1: ( rule__Interface__Group_4_1__2__Impl rule__Interface__Group_4_1__3 )
            // InternalCls.g:2285:2: rule__Interface__Group_4_1__2__Impl rule__Interface__Group_4_1__3
            {
            pushFollow(FOLLOW_22);
            rule__Interface__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_1__2"


    // $ANTLR start "rule__Interface__Group_4_1__2__Impl"
    // InternalCls.g:2292:1: rule__Interface__Group_4_1__2__Impl : ( ( rule__Interface__MembersAssignment_4_1_2 )* ) ;
    public final void rule__Interface__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2296:1: ( ( ( rule__Interface__MembersAssignment_4_1_2 )* ) )
            // InternalCls.g:2297:1: ( ( rule__Interface__MembersAssignment_4_1_2 )* )
            {
            // InternalCls.g:2297:1: ( ( rule__Interface__MembersAssignment_4_1_2 )* )
            // InternalCls.g:2298:2: ( rule__Interface__MembersAssignment_4_1_2 )*
            {
             before(grammarAccess.getInterfaceAccess().getMembersAssignment_4_1_2()); 
            // InternalCls.g:2299:2: ( rule__Interface__MembersAssignment_4_1_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=15 && LA32_0<=21)||(LA32_0>=48 && LA32_0<=49)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCls.g:2299:3: rule__Interface__MembersAssignment_4_1_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Interface__MembersAssignment_4_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getMembersAssignment_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_1__2__Impl"


    // $ANTLR start "rule__Interface__Group_4_1__3"
    // InternalCls.g:2307:1: rule__Interface__Group_4_1__3 : rule__Interface__Group_4_1__3__Impl ;
    public final void rule__Interface__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2311:1: ( rule__Interface__Group_4_1__3__Impl )
            // InternalCls.g:2312:2: rule__Interface__Group_4_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_4_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_1__3"


    // $ANTLR start "rule__Interface__Group_4_1__3__Impl"
    // InternalCls.g:2318:1: rule__Interface__Group_4_1__3__Impl : ( '}' ) ;
    public final void rule__Interface__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2322:1: ( ( '}' ) )
            // InternalCls.g:2323:1: ( '}' )
            {
            // InternalCls.g:2323:1: ( '}' )
            // InternalCls.g:2324:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_1_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalCls.g:2334:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2338:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalCls.g:2339:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:2346:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2350:1: ( ( () ) )
            // InternalCls.g:2351:1: ( () )
            {
            // InternalCls.g:2351:1: ( () )
            // InternalCls.g:2352:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalCls.g:2353:2: ()
            // InternalCls.g:2353:3: 
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
    // InternalCls.g:2361:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2365:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalCls.g:2366:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:2373:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__VisibilityAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2377:1: ( ( ( rule__Attribute__VisibilityAssignment_1 )? ) )
            // InternalCls.g:2378:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            {
            // InternalCls.g:2378:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            // InternalCls.g:2379:2: ( rule__Attribute__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 
            // InternalCls.g:2380:2: ( rule__Attribute__VisibilityAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=15 && LA33_0<=21)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:2380:3: rule__Attribute__VisibilityAssignment_1
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
    // InternalCls.g:2388:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2392:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalCls.g:2393:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:2400:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__StaticAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2404:1: ( ( ( rule__Attribute__StaticAssignment_2 )? ) )
            // InternalCls.g:2405:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            {
            // InternalCls.g:2405:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            // InternalCls.g:2406:2: ( rule__Attribute__StaticAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getStaticAssignment_2()); 
            // InternalCls.g:2407:2: ( rule__Attribute__StaticAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCls.g:2407:3: rule__Attribute__StaticAssignment_2
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
    // InternalCls.g:2415:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2419:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalCls.g:2420:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalCls.g:2427:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2431:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // InternalCls.g:2432:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // InternalCls.g:2432:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // InternalCls.g:2433:2: ( rule__Attribute__NameAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            // InternalCls.g:2434:2: ( rule__Attribute__NameAssignment_3 )
            // InternalCls.g:2434:3: rule__Attribute__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalCls.g:2442:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2446:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalCls.g:2447:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:2454:1: rule__Attribute__Group__4__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2458:1: ( ( ':' ) )
            // InternalCls.g:2459:1: ( ':' )
            {
            // InternalCls.g:2459:1: ( ':' )
            // InternalCls.g:2460:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_4()); 

            }


            }

        }
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
    // InternalCls.g:2469:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2473:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalCls.g:2474:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalCls.g:2481:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__TypeAssignment_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2485:1: ( ( ( rule__Attribute__TypeAssignment_5 ) ) )
            // InternalCls.g:2486:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            {
            // InternalCls.g:2486:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            // InternalCls.g:2487:2: ( rule__Attribute__TypeAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 
            // InternalCls.g:2488:2: ( rule__Attribute__TypeAssignment_5 )
            // InternalCls.g:2488:3: rule__Attribute__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 

            }


            }

        }
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
    // InternalCls.g:2496:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2500:1: ( rule__Attribute__Group__6__Impl )
            // InternalCls.g:2501:2: rule__Attribute__Group__6__Impl
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
    // InternalCls.g:2507:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__AppliedStereotypesAssignment_6 )* ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2511:1: ( ( ( rule__Attribute__AppliedStereotypesAssignment_6 )* ) )
            // InternalCls.g:2512:1: ( ( rule__Attribute__AppliedStereotypesAssignment_6 )* )
            {
            // InternalCls.g:2512:1: ( ( rule__Attribute__AppliedStereotypesAssignment_6 )* )
            // InternalCls.g:2513:2: ( rule__Attribute__AppliedStereotypesAssignment_6 )*
            {
             before(grammarAccess.getAttributeAccess().getAppliedStereotypesAssignment_6()); 
            // InternalCls.g:2514:2: ( rule__Attribute__AppliedStereotypesAssignment_6 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_STEREOTYPE_O) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCls.g:2514:3: rule__Attribute__AppliedStereotypesAssignment_6
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Attribute__AppliedStereotypesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getAppliedStereotypesAssignment_6()); 

            }


            }

        }
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
    // InternalCls.g:2523:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2527:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalCls.g:2528:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCls.g:2535:1: rule__Method__Group__0__Impl : ( ( rule__Method__VisibilityAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2539:1: ( ( ( rule__Method__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2540:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2540:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            // InternalCls.g:2541:2: ( rule__Method__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2542:2: ( rule__Method__VisibilityAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=15 && LA36_0<=21)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCls.g:2542:3: rule__Method__VisibilityAssignment_0
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
    // InternalCls.g:2550:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2554:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalCls.g:2555:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalCls.g:2562:1: rule__Method__Group__1__Impl : ( ( rule__Method__AbstractAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2566:1: ( ( ( rule__Method__AbstractAssignment_1 )? ) )
            // InternalCls.g:2567:1: ( ( rule__Method__AbstractAssignment_1 )? )
            {
            // InternalCls.g:2567:1: ( ( rule__Method__AbstractAssignment_1 )? )
            // InternalCls.g:2568:2: ( rule__Method__AbstractAssignment_1 )?
            {
             before(grammarAccess.getMethodAccess().getAbstractAssignment_1()); 
            // InternalCls.g:2569:2: ( rule__Method__AbstractAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCls.g:2569:3: rule__Method__AbstractAssignment_1
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
    // InternalCls.g:2577:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2581:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalCls.g:2582:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalCls.g:2589:1: rule__Method__Group__2__Impl : ( ( rule__Method__StaticAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2593:1: ( ( ( rule__Method__StaticAssignment_2 )? ) )
            // InternalCls.g:2594:1: ( ( rule__Method__StaticAssignment_2 )? )
            {
            // InternalCls.g:2594:1: ( ( rule__Method__StaticAssignment_2 )? )
            // InternalCls.g:2595:2: ( rule__Method__StaticAssignment_2 )?
            {
             before(grammarAccess.getMethodAccess().getStaticAssignment_2()); 
            // InternalCls.g:2596:2: ( rule__Method__StaticAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:2596:3: rule__Method__StaticAssignment_2
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
    // InternalCls.g:2604:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2608:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalCls.g:2609:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalCls.g:2616:1: rule__Method__Group__3__Impl : ( ( rule__Method__NameAssignment_3 ) ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2620:1: ( ( ( rule__Method__NameAssignment_3 ) ) )
            // InternalCls.g:2621:1: ( ( rule__Method__NameAssignment_3 ) )
            {
            // InternalCls.g:2621:1: ( ( rule__Method__NameAssignment_3 ) )
            // InternalCls.g:2622:2: ( rule__Method__NameAssignment_3 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_3()); 
            // InternalCls.g:2623:2: ( rule__Method__NameAssignment_3 )
            // InternalCls.g:2623:3: rule__Method__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalCls.g:2631:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2635:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalCls.g:2636:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalCls.g:2643:1: rule__Method__Group__4__Impl : ( ( rule__Method__AppliedStereotypesAssignment_4 )* ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2647:1: ( ( ( rule__Method__AppliedStereotypesAssignment_4 )* ) )
            // InternalCls.g:2648:1: ( ( rule__Method__AppliedStereotypesAssignment_4 )* )
            {
            // InternalCls.g:2648:1: ( ( rule__Method__AppliedStereotypesAssignment_4 )* )
            // InternalCls.g:2649:2: ( rule__Method__AppliedStereotypesAssignment_4 )*
            {
             before(grammarAccess.getMethodAccess().getAppliedStereotypesAssignment_4()); 
            // InternalCls.g:2650:2: ( rule__Method__AppliedStereotypesAssignment_4 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_STEREOTYPE_O) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalCls.g:2650:3: rule__Method__AppliedStereotypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Method__AppliedStereotypesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getAppliedStereotypesAssignment_4()); 

            }


            }

        }
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
    // InternalCls.g:2658:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2662:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalCls.g:2663:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalCls.g:2670:1: rule__Method__Group__5__Impl : ( '(' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2674:1: ( ( '(' ) )
            // InternalCls.g:2675:1: ( '(' )
            {
            // InternalCls.g:2675:1: ( '(' )
            // InternalCls.g:2676:2: '('
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
    // InternalCls.g:2685:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2689:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalCls.g:2690:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalCls.g:2697:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )* ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2701:1: ( ( ( rule__Method__Group_6__0 )* ) )
            // InternalCls.g:2702:1: ( ( rule__Method__Group_6__0 )* )
            {
            // InternalCls.g:2702:1: ( ( rule__Method__Group_6__0 )* )
            // InternalCls.g:2703:2: ( rule__Method__Group_6__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalCls.g:2704:2: ( rule__Method__Group_6__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==RULE_STEREOTYPE_O||(LA40_0>=15 && LA40_0<=21)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCls.g:2704:3: rule__Method__Group_6__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Method__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalCls.g:2712:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2716:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalCls.g:2717:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_26);
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
    // InternalCls.g:2724:1: rule__Method__Group__7__Impl : ( ')' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2728:1: ( ( ')' ) )
            // InternalCls.g:2729:1: ( ')' )
            {
            // InternalCls.g:2729:1: ( ')' )
            // InternalCls.g:2730:2: ')'
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
    // InternalCls.g:2739:1: rule__Method__Group__8 : rule__Method__Group__8__Impl ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2743:1: ( rule__Method__Group__8__Impl )
            // InternalCls.g:2744:2: rule__Method__Group__8__Impl
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
    // InternalCls.g:2750:1: rule__Method__Group__8__Impl : ( ( rule__Method__Group_8__0 )? ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2754:1: ( ( ( rule__Method__Group_8__0 )? ) )
            // InternalCls.g:2755:1: ( ( rule__Method__Group_8__0 )? )
            {
            // InternalCls.g:2755:1: ( ( rule__Method__Group_8__0 )? )
            // InternalCls.g:2756:2: ( rule__Method__Group_8__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_8()); 
            // InternalCls.g:2757:2: ( rule__Method__Group_8__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCls.g:2757:3: rule__Method__Group_8__0
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
    // InternalCls.g:2766:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2770:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalCls.g:2771:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalCls.g:2778:1: rule__Method__Group_6__0__Impl : ( ( rule__Method__ParametersAssignment_6_0 ) ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2782:1: ( ( ( rule__Method__ParametersAssignment_6_0 ) ) )
            // InternalCls.g:2783:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            {
            // InternalCls.g:2783:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            // InternalCls.g:2784:2: ( rule__Method__ParametersAssignment_6_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_0()); 
            // InternalCls.g:2785:2: ( rule__Method__ParametersAssignment_6_0 )
            // InternalCls.g:2785:3: rule__Method__ParametersAssignment_6_0
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
    // InternalCls.g:2793:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2797:1: ( rule__Method__Group_6__1__Impl )
            // InternalCls.g:2798:2: rule__Method__Group_6__1__Impl
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
    // InternalCls.g:2804:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Group_6_1__0 )* ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2808:1: ( ( ( rule__Method__Group_6_1__0 )* ) )
            // InternalCls.g:2809:1: ( ( rule__Method__Group_6_1__0 )* )
            {
            // InternalCls.g:2809:1: ( ( rule__Method__Group_6_1__0 )* )
            // InternalCls.g:2810:2: ( rule__Method__Group_6_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6_1()); 
            // InternalCls.g:2811:2: ( rule__Method__Group_6_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==39) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCls.g:2811:3: rule__Method__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Method__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalCls.g:2820:1: rule__Method__Group_6_1__0 : rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
    public final void rule__Method__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2824:1: ( rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
            // InternalCls.g:2825:2: rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:2832:1: rule__Method__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2836:1: ( ( ',' ) )
            // InternalCls.g:2837:1: ( ',' )
            {
            // InternalCls.g:2837:1: ( ',' )
            // InternalCls.g:2838:2: ','
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
    // InternalCls.g:2847:1: rule__Method__Group_6_1__1 : rule__Method__Group_6_1__1__Impl ;
    public final void rule__Method__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2851:1: ( rule__Method__Group_6_1__1__Impl )
            // InternalCls.g:2852:2: rule__Method__Group_6_1__1__Impl
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
    // InternalCls.g:2858:1: rule__Method__Group_6_1__1__Impl : ( ( rule__Method__ParametersAssignment_6_1_1 ) ) ;
    public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2862:1: ( ( ( rule__Method__ParametersAssignment_6_1_1 ) ) )
            // InternalCls.g:2863:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            {
            // InternalCls.g:2863:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            // InternalCls.g:2864:2: ( rule__Method__ParametersAssignment_6_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_1_1()); 
            // InternalCls.g:2865:2: ( rule__Method__ParametersAssignment_6_1_1 )
            // InternalCls.g:2865:3: rule__Method__ParametersAssignment_6_1_1
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
    // InternalCls.g:2874:1: rule__Method__Group_8__0 : rule__Method__Group_8__0__Impl rule__Method__Group_8__1 ;
    public final void rule__Method__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2878:1: ( rule__Method__Group_8__0__Impl rule__Method__Group_8__1 )
            // InternalCls.g:2879:2: rule__Method__Group_8__0__Impl rule__Method__Group_8__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:2886:1: rule__Method__Group_8__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2890:1: ( ( ':' ) )
            // InternalCls.g:2891:1: ( ':' )
            {
            // InternalCls.g:2891:1: ( ':' )
            // InternalCls.g:2892:2: ':'
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
    // InternalCls.g:2901:1: rule__Method__Group_8__1 : rule__Method__Group_8__1__Impl ;
    public final void rule__Method__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2905:1: ( rule__Method__Group_8__1__Impl )
            // InternalCls.g:2906:2: rule__Method__Group_8__1__Impl
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
    // InternalCls.g:2912:1: rule__Method__Group_8__1__Impl : ( ( rule__Method__TypeAssignment_8_1 ) ) ;
    public final void rule__Method__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2916:1: ( ( ( rule__Method__TypeAssignment_8_1 ) ) )
            // InternalCls.g:2917:1: ( ( rule__Method__TypeAssignment_8_1 ) )
            {
            // InternalCls.g:2917:1: ( ( rule__Method__TypeAssignment_8_1 ) )
            // InternalCls.g:2918:2: ( rule__Method__TypeAssignment_8_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_8_1()); 
            // InternalCls.g:2919:2: ( rule__Method__TypeAssignment_8_1 )
            // InternalCls.g:2919:3: rule__Method__TypeAssignment_8_1
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
    // InternalCls.g:2928:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2932:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCls.g:2933:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:2940:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__VisibilityAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2944:1: ( ( ( rule__Parameter__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2945:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2945:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            // InternalCls.g:2946:2: ( rule__Parameter__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2947:2: ( rule__Parameter__VisibilityAssignment_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=15 && LA43_0<=21)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCls.g:2947:3: rule__Parameter__VisibilityAssignment_0
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
    // InternalCls.g:2955:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2959:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCls.g:2960:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:2967:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__AppliedStereotypesAssignment_1 )* ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2971:1: ( ( ( rule__Parameter__AppliedStereotypesAssignment_1 )* ) )
            // InternalCls.g:2972:1: ( ( rule__Parameter__AppliedStereotypesAssignment_1 )* )
            {
            // InternalCls.g:2972:1: ( ( rule__Parameter__AppliedStereotypesAssignment_1 )* )
            // InternalCls.g:2973:2: ( rule__Parameter__AppliedStereotypesAssignment_1 )*
            {
             before(grammarAccess.getParameterAccess().getAppliedStereotypesAssignment_1()); 
            // InternalCls.g:2974:2: ( rule__Parameter__AppliedStereotypesAssignment_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_STEREOTYPE_O) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalCls.g:2974:3: rule__Parameter__AppliedStereotypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Parameter__AppliedStereotypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getParameterAccess().getAppliedStereotypesAssignment_1()); 

            }


            }

        }
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
    // InternalCls.g:2982:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2986:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCls.g:2987:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalCls.g:2994:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2998:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalCls.g:2999:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalCls.g:2999:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalCls.g:3000:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalCls.g:3001:2: ( rule__Parameter__NameAssignment_2 )
            // InternalCls.g:3001:3: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalCls.g:3009:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3013:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalCls.g:3014:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:3021:1: rule__Parameter__Group__3__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3025:1: ( ( ':' ) )
            // InternalCls.g:3026:1: ( ':' )
            {
            // InternalCls.g:3026:1: ( ':' )
            // InternalCls.g:3027:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalCls.g:3036:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3040:1: ( rule__Parameter__Group__4__Impl )
            // InternalCls.g:3041:2: rule__Parameter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:3047:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__TypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3051:1: ( ( ( rule__Parameter__TypeAssignment_4 ) ) )
            // InternalCls.g:3052:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            {
            // InternalCls.g:3052:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            // InternalCls.g:3053:2: ( rule__Parameter__TypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_4()); 
            // InternalCls.g:3054:2: ( rule__Parameter__TypeAssignment_4 )
            // InternalCls.g:3054:3: rule__Parameter__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Generalization__Group__0"
    // InternalCls.g:3063:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3067:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalCls.g:3068:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalCls.g:3075:1: rule__Generalization__Group__0__Impl : ( 'isa' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3079:1: ( ( 'isa' ) )
            // InternalCls.g:3080:1: ( 'isa' )
            {
            // InternalCls.g:3080:1: ( 'isa' )
            // InternalCls.g:3081:2: 'isa'
            {
             before(grammarAccess.getGeneralizationAccess().getIsaKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getIsaKeyword_0()); 

            }


            }

        }
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
    // InternalCls.g:3090:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3094:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalCls.g:3095:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
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
    // InternalCls.g:3102:1: rule__Generalization__Group__1__Impl : ( '(' ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3106:1: ( ( '(' ) )
            // InternalCls.g:3107:1: ( '(' )
            {
            // InternalCls.g:3107:1: ( '(' )
            // InternalCls.g:3108:2: '('
            {
             before(grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalCls.g:3117:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3121:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalCls.g:3122:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Generalization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCls.g:3129:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__LeftAssignment_2 ) ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3133:1: ( ( ( rule__Generalization__LeftAssignment_2 ) ) )
            // InternalCls.g:3134:1: ( ( rule__Generalization__LeftAssignment_2 ) )
            {
            // InternalCls.g:3134:1: ( ( rule__Generalization__LeftAssignment_2 ) )
            // InternalCls.g:3135:2: ( rule__Generalization__LeftAssignment_2 )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssignment_2()); 
            // InternalCls.g:3136:2: ( rule__Generalization__LeftAssignment_2 )
            // InternalCls.g:3136:3: rule__Generalization__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getLeftAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Generalization__Group__3"
    // InternalCls.g:3144:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3148:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalCls.g:3149:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Generalization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__3"


    // $ANTLR start "rule__Generalization__Group__3__Impl"
    // InternalCls.g:3156:1: rule__Generalization__Group__3__Impl : ( ',' ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3160:1: ( ( ',' ) )
            // InternalCls.g:3161:1: ( ',' )
            {
            // InternalCls.g:3161:1: ( ',' )
            // InternalCls.g:3162:2: ','
            {
             before(grammarAccess.getGeneralizationAccess().getCommaKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__3__Impl"


    // $ANTLR start "rule__Generalization__Group__4"
    // InternalCls.g:3171:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3175:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalCls.g:3176:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Generalization__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__4"


    // $ANTLR start "rule__Generalization__Group__4__Impl"
    // InternalCls.g:3183:1: rule__Generalization__Group__4__Impl : ( ( rule__Generalization__RightAssignment_4 ) ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3187:1: ( ( ( rule__Generalization__RightAssignment_4 ) ) )
            // InternalCls.g:3188:1: ( ( rule__Generalization__RightAssignment_4 ) )
            {
            // InternalCls.g:3188:1: ( ( rule__Generalization__RightAssignment_4 ) )
            // InternalCls.g:3189:2: ( rule__Generalization__RightAssignment_4 )
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssignment_4()); 
            // InternalCls.g:3190:2: ( rule__Generalization__RightAssignment_4 )
            // InternalCls.g:3190:3: rule__Generalization__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getRightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__4__Impl"


    // $ANTLR start "rule__Generalization__Group__5"
    // InternalCls.g:3198:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3202:1: ( rule__Generalization__Group__5__Impl )
            // InternalCls.g:3203:2: rule__Generalization__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__5"


    // $ANTLR start "rule__Generalization__Group__5__Impl"
    // InternalCls.g:3209:1: rule__Generalization__Group__5__Impl : ( ')' ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3213:1: ( ( ')' ) )
            // InternalCls.g:3214:1: ( ')' )
            {
            // InternalCls.g:3214:1: ( ')' )
            // InternalCls.g:3215:2: ')'
            {
             before(grammarAccess.getGeneralizationAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__5__Impl"


    // $ANTLR start "rule__Implementation__Group__0"
    // InternalCls.g:3225:1: rule__Implementation__Group__0 : rule__Implementation__Group__0__Impl rule__Implementation__Group__1 ;
    public final void rule__Implementation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3229:1: ( rule__Implementation__Group__0__Impl rule__Implementation__Group__1 )
            // InternalCls.g:3230:2: rule__Implementation__Group__0__Impl rule__Implementation__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalCls.g:3237:1: rule__Implementation__Group__0__Impl : ( 'impl' ) ;
    public final void rule__Implementation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3241:1: ( ( 'impl' ) )
            // InternalCls.g:3242:1: ( 'impl' )
            {
            // InternalCls.g:3242:1: ( 'impl' )
            // InternalCls.g:3243:2: 'impl'
            {
             before(grammarAccess.getImplementationAccess().getImplKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getImplementationAccess().getImplKeyword_0()); 

            }


            }

        }
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
    // InternalCls.g:3252:1: rule__Implementation__Group__1 : rule__Implementation__Group__1__Impl rule__Implementation__Group__2 ;
    public final void rule__Implementation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3256:1: ( rule__Implementation__Group__1__Impl rule__Implementation__Group__2 )
            // InternalCls.g:3257:2: rule__Implementation__Group__1__Impl rule__Implementation__Group__2
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
    // InternalCls.g:3264:1: rule__Implementation__Group__1__Impl : ( '(' ) ;
    public final void rule__Implementation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3268:1: ( ( '(' ) )
            // InternalCls.g:3269:1: ( '(' )
            {
            // InternalCls.g:3269:1: ( '(' )
            // InternalCls.g:3270:2: '('
            {
             before(grammarAccess.getImplementationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getImplementationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalCls.g:3279:1: rule__Implementation__Group__2 : rule__Implementation__Group__2__Impl rule__Implementation__Group__3 ;
    public final void rule__Implementation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3283:1: ( rule__Implementation__Group__2__Impl rule__Implementation__Group__3 )
            // InternalCls.g:3284:2: rule__Implementation__Group__2__Impl rule__Implementation__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Implementation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCls.g:3291:1: rule__Implementation__Group__2__Impl : ( ( rule__Implementation__LeftAssignment_2 ) ) ;
    public final void rule__Implementation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3295:1: ( ( ( rule__Implementation__LeftAssignment_2 ) ) )
            // InternalCls.g:3296:1: ( ( rule__Implementation__LeftAssignment_2 ) )
            {
            // InternalCls.g:3296:1: ( ( rule__Implementation__LeftAssignment_2 ) )
            // InternalCls.g:3297:2: ( rule__Implementation__LeftAssignment_2 )
            {
             before(grammarAccess.getImplementationAccess().getLeftAssignment_2()); 
            // InternalCls.g:3298:2: ( rule__Implementation__LeftAssignment_2 )
            // InternalCls.g:3298:3: rule__Implementation__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImplementationAccess().getLeftAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Implementation__Group__3"
    // InternalCls.g:3306:1: rule__Implementation__Group__3 : rule__Implementation__Group__3__Impl rule__Implementation__Group__4 ;
    public final void rule__Implementation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3310:1: ( rule__Implementation__Group__3__Impl rule__Implementation__Group__4 )
            // InternalCls.g:3311:2: rule__Implementation__Group__3__Impl rule__Implementation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Implementation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__3"


    // $ANTLR start "rule__Implementation__Group__3__Impl"
    // InternalCls.g:3318:1: rule__Implementation__Group__3__Impl : ( ',' ) ;
    public final void rule__Implementation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3322:1: ( ( ',' ) )
            // InternalCls.g:3323:1: ( ',' )
            {
            // InternalCls.g:3323:1: ( ',' )
            // InternalCls.g:3324:2: ','
            {
             before(grammarAccess.getImplementationAccess().getCommaKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getImplementationAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__3__Impl"


    // $ANTLR start "rule__Implementation__Group__4"
    // InternalCls.g:3333:1: rule__Implementation__Group__4 : rule__Implementation__Group__4__Impl rule__Implementation__Group__5 ;
    public final void rule__Implementation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3337:1: ( rule__Implementation__Group__4__Impl rule__Implementation__Group__5 )
            // InternalCls.g:3338:2: rule__Implementation__Group__4__Impl rule__Implementation__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Implementation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__4"


    // $ANTLR start "rule__Implementation__Group__4__Impl"
    // InternalCls.g:3345:1: rule__Implementation__Group__4__Impl : ( ( rule__Implementation__RightAssignment_4 ) ) ;
    public final void rule__Implementation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3349:1: ( ( ( rule__Implementation__RightAssignment_4 ) ) )
            // InternalCls.g:3350:1: ( ( rule__Implementation__RightAssignment_4 ) )
            {
            // InternalCls.g:3350:1: ( ( rule__Implementation__RightAssignment_4 ) )
            // InternalCls.g:3351:2: ( rule__Implementation__RightAssignment_4 )
            {
             before(grammarAccess.getImplementationAccess().getRightAssignment_4()); 
            // InternalCls.g:3352:2: ( rule__Implementation__RightAssignment_4 )
            // InternalCls.g:3352:3: rule__Implementation__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getImplementationAccess().getRightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__4__Impl"


    // $ANTLR start "rule__Implementation__Group__5"
    // InternalCls.g:3360:1: rule__Implementation__Group__5 : rule__Implementation__Group__5__Impl ;
    public final void rule__Implementation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3364:1: ( rule__Implementation__Group__5__Impl )
            // InternalCls.g:3365:2: rule__Implementation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__5"


    // $ANTLR start "rule__Implementation__Group__5__Impl"
    // InternalCls.g:3371:1: rule__Implementation__Group__5__Impl : ( ')' ) ;
    public final void rule__Implementation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3375:1: ( ( ')' ) )
            // InternalCls.g:3376:1: ( ')' )
            {
            // InternalCls.g:3376:1: ( ')' )
            // InternalCls.g:3377:2: ')'
            {
             before(grammarAccess.getImplementationAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getImplementationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__5__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__0"
    // InternalCls.g:3387:1: rule__XtextAssociation__Group__0 : rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1 ;
    public final void rule__XtextAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3391:1: ( rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1 )
            // InternalCls.g:3392:2: rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__XtextAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__0"


    // $ANTLR start "rule__XtextAssociation__Group__0__Impl"
    // InternalCls.g:3399:1: rule__XtextAssociation__Group__0__Impl : ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? ) ;
    public final void rule__XtextAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3403:1: ( ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? ) )
            // InternalCls.g:3404:1: ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? )
            {
            // InternalCls.g:3404:1: ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? )
            // InternalCls.g:3405:2: ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityAssignment_0()); 
            // InternalCls.g:3406:2: ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCls.g:3406:3: rule__XtextAssociation__TwoSideBidirectionalityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XtextAssociation__TwoSideBidirectionalityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__0__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__1"
    // InternalCls.g:3414:1: rule__XtextAssociation__Group__1 : rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2 ;
    public final void rule__XtextAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3418:1: ( rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2 )
            // InternalCls.g:3419:2: rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__XtextAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__1"


    // $ANTLR start "rule__XtextAssociation__Group__1__Impl"
    // InternalCls.g:3426:1: rule__XtextAssociation__Group__1__Impl : ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) ) ;
    public final void rule__XtextAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3430:1: ( ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) ) )
            // InternalCls.g:3431:1: ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) )
            {
            // InternalCls.g:3431:1: ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) )
            // InternalCls.g:3432:2: ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideAggregationKindAssignment_1()); 
            // InternalCls.g:3433:2: ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 )
            // InternalCls.g:3433:3: rule__XtextAssociation__TwoSideAggregationKindAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__TwoSideAggregationKindAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getTwoSideAggregationKindAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__1__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__2"
    // InternalCls.g:3441:1: rule__XtextAssociation__Group__2 : rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3 ;
    public final void rule__XtextAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3445:1: ( rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3 )
            // InternalCls.g:3446:2: rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__XtextAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__2"


    // $ANTLR start "rule__XtextAssociation__Group__2__Impl"
    // InternalCls.g:3453:1: rule__XtextAssociation__Group__2__Impl : ( ( rule__XtextAssociation__NameAssignment_2 ) ) ;
    public final void rule__XtextAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3457:1: ( ( ( rule__XtextAssociation__NameAssignment_2 ) ) )
            // InternalCls.g:3458:1: ( ( rule__XtextAssociation__NameAssignment_2 ) )
            {
            // InternalCls.g:3458:1: ( ( rule__XtextAssociation__NameAssignment_2 ) )
            // InternalCls.g:3459:2: ( rule__XtextAssociation__NameAssignment_2 )
            {
             before(grammarAccess.getXtextAssociationAccess().getNameAssignment_2()); 
            // InternalCls.g:3460:2: ( rule__XtextAssociation__NameAssignment_2 )
            // InternalCls.g:3460:3: rule__XtextAssociation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__2__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__3"
    // InternalCls.g:3468:1: rule__XtextAssociation__Group__3 : rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4 ;
    public final void rule__XtextAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3472:1: ( rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4 )
            // InternalCls.g:3473:2: rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__XtextAssociation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__3"


    // $ANTLR start "rule__XtextAssociation__Group__3__Impl"
    // InternalCls.g:3480:1: rule__XtextAssociation__Group__3__Impl : ( ( rule__XtextAssociation__AppliedStereotypesAssignment_3 )* ) ;
    public final void rule__XtextAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3484:1: ( ( ( rule__XtextAssociation__AppliedStereotypesAssignment_3 )* ) )
            // InternalCls.g:3485:1: ( ( rule__XtextAssociation__AppliedStereotypesAssignment_3 )* )
            {
            // InternalCls.g:3485:1: ( ( rule__XtextAssociation__AppliedStereotypesAssignment_3 )* )
            // InternalCls.g:3486:2: ( rule__XtextAssociation__AppliedStereotypesAssignment_3 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getAppliedStereotypesAssignment_3()); 
            // InternalCls.g:3487:2: ( rule__XtextAssociation__AppliedStereotypesAssignment_3 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_STEREOTYPE_O) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalCls.g:3487:3: rule__XtextAssociation__AppliedStereotypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__XtextAssociation__AppliedStereotypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getXtextAssociationAccess().getAppliedStereotypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__3__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__4"
    // InternalCls.g:3495:1: rule__XtextAssociation__Group__4 : rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5 ;
    public final void rule__XtextAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3499:1: ( rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5 )
            // InternalCls.g:3500:2: rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__XtextAssociation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__4"


    // $ANTLR start "rule__XtextAssociation__Group__4__Impl"
    // InternalCls.g:3507:1: rule__XtextAssociation__Group__4__Impl : ( '(' ) ;
    public final void rule__XtextAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3511:1: ( ( '(' ) )
            // InternalCls.g:3512:1: ( '(' )
            {
            // InternalCls.g:3512:1: ( '(' )
            // InternalCls.g:3513:2: '('
            {
             before(grammarAccess.getXtextAssociationAccess().getLeftParenthesisKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__4__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__5"
    // InternalCls.g:3522:1: rule__XtextAssociation__Group__5 : rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6 ;
    public final void rule__XtextAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3526:1: ( rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6 )
            // InternalCls.g:3527:2: rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__XtextAssociation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__5"


    // $ANTLR start "rule__XtextAssociation__Group__5__Impl"
    // InternalCls.g:3534:1: rule__XtextAssociation__Group__5__Impl : ( ( rule__XtextAssociation__MemberEndTypesAssignment_5 ) ) ;
    public final void rule__XtextAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3538:1: ( ( ( rule__XtextAssociation__MemberEndTypesAssignment_5 ) ) )
            // InternalCls.g:3539:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_5 ) )
            {
            // InternalCls.g:3539:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_5 ) )
            // InternalCls.g:3540:2: ( rule__XtextAssociation__MemberEndTypesAssignment_5 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_5()); 
            // InternalCls.g:3541:2: ( rule__XtextAssociation__MemberEndTypesAssignment_5 )
            // InternalCls.g:3541:3: rule__XtextAssociation__MemberEndTypesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndTypesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__5__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__6"
    // InternalCls.g:3549:1: rule__XtextAssociation__Group__6 : rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7 ;
    public final void rule__XtextAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3553:1: ( rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7 )
            // InternalCls.g:3554:2: rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__XtextAssociation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__6"


    // $ANTLR start "rule__XtextAssociation__Group__6__Impl"
    // InternalCls.g:3561:1: rule__XtextAssociation__Group__6__Impl : ( ( rule__XtextAssociation__Group_6__0 )* ) ;
    public final void rule__XtextAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3565:1: ( ( ( rule__XtextAssociation__Group_6__0 )* ) )
            // InternalCls.g:3566:1: ( ( rule__XtextAssociation__Group_6__0 )* )
            {
            // InternalCls.g:3566:1: ( ( rule__XtextAssociation__Group_6__0 )* )
            // InternalCls.g:3567:2: ( rule__XtextAssociation__Group_6__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_6()); 
            // InternalCls.g:3568:2: ( rule__XtextAssociation__Group_6__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==39) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalCls.g:3568:3: rule__XtextAssociation__Group_6__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__XtextAssociation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getXtextAssociationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__6__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__7"
    // InternalCls.g:3576:1: rule__XtextAssociation__Group__7 : rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8 ;
    public final void rule__XtextAssociation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3580:1: ( rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8 )
            // InternalCls.g:3581:2: rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__XtextAssociation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__7"


    // $ANTLR start "rule__XtextAssociation__Group__7__Impl"
    // InternalCls.g:3588:1: rule__XtextAssociation__Group__7__Impl : ( ')' ) ;
    public final void rule__XtextAssociation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3592:1: ( ( ')' ) )
            // InternalCls.g:3593:1: ( ')' )
            {
            // InternalCls.g:3593:1: ( ')' )
            // InternalCls.g:3594:2: ')'
            {
             before(grammarAccess.getXtextAssociationAccess().getRightParenthesisKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__7__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__8"
    // InternalCls.g:3603:1: rule__XtextAssociation__Group__8 : rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9 ;
    public final void rule__XtextAssociation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3607:1: ( rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9 )
            // InternalCls.g:3608:2: rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9
            {
            pushFollow(FOLLOW_39);
            rule__XtextAssociation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__8"


    // $ANTLR start "rule__XtextAssociation__Group__8__Impl"
    // InternalCls.g:3615:1: rule__XtextAssociation__Group__8__Impl : ( ( rule__XtextAssociation__Group_8__0 )? ) ;
    public final void rule__XtextAssociation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3619:1: ( ( ( rule__XtextAssociation__Group_8__0 )? ) )
            // InternalCls.g:3620:1: ( ( rule__XtextAssociation__Group_8__0 )? )
            {
            // InternalCls.g:3620:1: ( ( rule__XtextAssociation__Group_8__0 )? )
            // InternalCls.g:3621:2: ( rule__XtextAssociation__Group_8__0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_8()); 
            // InternalCls.g:3622:2: ( rule__XtextAssociation__Group_8__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCls.g:3622:3: rule__XtextAssociation__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XtextAssociation__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXtextAssociationAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__8__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__9"
    // InternalCls.g:3630:1: rule__XtextAssociation__Group__9 : rule__XtextAssociation__Group__9__Impl rule__XtextAssociation__Group__10 ;
    public final void rule__XtextAssociation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3634:1: ( rule__XtextAssociation__Group__9__Impl rule__XtextAssociation__Group__10 )
            // InternalCls.g:3635:2: rule__XtextAssociation__Group__9__Impl rule__XtextAssociation__Group__10
            {
            pushFollow(FOLLOW_39);
            rule__XtextAssociation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__9"


    // $ANTLR start "rule__XtextAssociation__Group__9__Impl"
    // InternalCls.g:3642:1: rule__XtextAssociation__Group__9__Impl : ( ( rule__XtextAssociation__Group_9__0 )? ) ;
    public final void rule__XtextAssociation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3646:1: ( ( ( rule__XtextAssociation__Group_9__0 )? ) )
            // InternalCls.g:3647:1: ( ( rule__XtextAssociation__Group_9__0 )? )
            {
            // InternalCls.g:3647:1: ( ( rule__XtextAssociation__Group_9__0 )? )
            // InternalCls.g:3648:2: ( rule__XtextAssociation__Group_9__0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_9()); 
            // InternalCls.g:3649:2: ( rule__XtextAssociation__Group_9__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==45) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCls.g:3649:3: rule__XtextAssociation__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XtextAssociation__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXtextAssociationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__9__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__10"
    // InternalCls.g:3657:1: rule__XtextAssociation__Group__10 : rule__XtextAssociation__Group__10__Impl ;
    public final void rule__XtextAssociation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3661:1: ( rule__XtextAssociation__Group__10__Impl )
            // InternalCls.g:3662:2: rule__XtextAssociation__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__10"


    // $ANTLR start "rule__XtextAssociation__Group__10__Impl"
    // InternalCls.g:3668:1: rule__XtextAssociation__Group__10__Impl : ( ( rule__XtextAssociation__CommentsAssignment_10 )? ) ;
    public final void rule__XtextAssociation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3672:1: ( ( ( rule__XtextAssociation__CommentsAssignment_10 )? ) )
            // InternalCls.g:3673:1: ( ( rule__XtextAssociation__CommentsAssignment_10 )? )
            {
            // InternalCls.g:3673:1: ( ( rule__XtextAssociation__CommentsAssignment_10 )? )
            // InternalCls.g:3674:2: ( rule__XtextAssociation__CommentsAssignment_10 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getCommentsAssignment_10()); 
            // InternalCls.g:3675:2: ( rule__XtextAssociation__CommentsAssignment_10 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCls.g:3675:3: rule__XtextAssociation__CommentsAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__XtextAssociation__CommentsAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXtextAssociationAccess().getCommentsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group__10__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_6__0"
    // InternalCls.g:3684:1: rule__XtextAssociation__Group_6__0 : rule__XtextAssociation__Group_6__0__Impl rule__XtextAssociation__Group_6__1 ;
    public final void rule__XtextAssociation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3688:1: ( rule__XtextAssociation__Group_6__0__Impl rule__XtextAssociation__Group_6__1 )
            // InternalCls.g:3689:2: rule__XtextAssociation__Group_6__0__Impl rule__XtextAssociation__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__XtextAssociation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_6__0"


    // $ANTLR start "rule__XtextAssociation__Group_6__0__Impl"
    // InternalCls.g:3696:1: rule__XtextAssociation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__XtextAssociation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3700:1: ( ( ',' ) )
            // InternalCls.g:3701:1: ( ',' )
            {
            // InternalCls.g:3701:1: ( ',' )
            // InternalCls.g:3702:2: ','
            {
             before(grammarAccess.getXtextAssociationAccess().getCommaKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_6__0__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_6__1"
    // InternalCls.g:3711:1: rule__XtextAssociation__Group_6__1 : rule__XtextAssociation__Group_6__1__Impl ;
    public final void rule__XtextAssociation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3715:1: ( rule__XtextAssociation__Group_6__1__Impl )
            // InternalCls.g:3716:2: rule__XtextAssociation__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_6__1"


    // $ANTLR start "rule__XtextAssociation__Group_6__1__Impl"
    // InternalCls.g:3722:1: rule__XtextAssociation__Group_6__1__Impl : ( ( rule__XtextAssociation__MemberEndTypesAssignment_6_1 ) ) ;
    public final void rule__XtextAssociation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3726:1: ( ( ( rule__XtextAssociation__MemberEndTypesAssignment_6_1 ) ) )
            // InternalCls.g:3727:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_6_1 ) )
            {
            // InternalCls.g:3727:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_6_1 ) )
            // InternalCls.g:3728:2: ( rule__XtextAssociation__MemberEndTypesAssignment_6_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_6_1()); 
            // InternalCls.g:3729:2: ( rule__XtextAssociation__MemberEndTypesAssignment_6_1 )
            // InternalCls.g:3729:3: rule__XtextAssociation__MemberEndTypesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndTypesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_6__1__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_8__0"
    // InternalCls.g:3738:1: rule__XtextAssociation__Group_8__0 : rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1 ;
    public final void rule__XtextAssociation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3742:1: ( rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1 )
            // InternalCls.g:3743:2: rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1
            {
            pushFollow(FOLLOW_40);
            rule__XtextAssociation__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8__0"


    // $ANTLR start "rule__XtextAssociation__Group_8__0__Impl"
    // InternalCls.g:3750:1: rule__XtextAssociation__Group_8__0__Impl : ( 'role' ) ;
    public final void rule__XtextAssociation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3754:1: ( ( 'role' ) )
            // InternalCls.g:3755:1: ( 'role' )
            {
            // InternalCls.g:3755:1: ( 'role' )
            // InternalCls.g:3756:2: 'role'
            {
             before(grammarAccess.getXtextAssociationAccess().getRoleKeyword_8_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getRoleKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8__0__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_8__1"
    // InternalCls.g:3765:1: rule__XtextAssociation__Group_8__1 : rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2 ;
    public final void rule__XtextAssociation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3769:1: ( rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2 )
            // InternalCls.g:3770:2: rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2
            {
            pushFollow(FOLLOW_41);
            rule__XtextAssociation__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8__1"


    // $ANTLR start "rule__XtextAssociation__Group_8__1__Impl"
    // InternalCls.g:3777:1: rule__XtextAssociation__Group_8__1__Impl : ( '[' ) ;
    public final void rule__XtextAssociation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3781:1: ( ( '[' ) )
            // InternalCls.g:3782:1: ( '[' )
            {
            // InternalCls.g:3782:1: ( '[' )
            // InternalCls.g:3783:2: '['
            {
             before(grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_8_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8__1__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_8__2"
    // InternalCls.g:3792:1: rule__XtextAssociation__Group_8__2 : rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3 ;
    public final void rule__XtextAssociation__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3796:1: ( rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3 )
            // InternalCls.g:3797:2: rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3
            {
            pushFollow(FOLLOW_42);
            rule__XtextAssociation__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8__2"


    // $ANTLR start "rule__XtextAssociation__Group_8__2__Impl"
    // InternalCls.g:3804:1: rule__XtextAssociation__Group_8__2__Impl : ( ( rule__XtextAssociation__MemberEndNamesAssignment_8_2 ) ) ;
    public final void rule__XtextAssociation__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3808:1: ( ( ( rule__XtextAssociation__MemberEndNamesAssignment_8_2 ) ) )
            // InternalCls.g:3809:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_8_2 ) )
            {
            // InternalCls.g:3809:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_8_2 ) )
            // InternalCls.g:3810:2: ( rule__XtextAssociation__MemberEndNamesAssignment_8_2 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_8_2()); 
            // InternalCls.g:3811:2: ( rule__XtextAssociation__MemberEndNamesAssignment_8_2 )
            // InternalCls.g:3811:3: rule__XtextAssociation__MemberEndNamesAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndNamesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8__2__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_8__3"
    // InternalCls.g:3819:1: rule__XtextAssociation__Group_8__3 : rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4 ;
    public final void rule__XtextAssociation__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3823:1: ( rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4 )
            // InternalCls.g:3824:2: rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4
            {
            pushFollow(FOLLOW_42);
            rule__XtextAssociation__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8__3"


    // $ANTLR start "rule__XtextAssociation__Group_8__3__Impl"
    // InternalCls.g:3831:1: rule__XtextAssociation__Group_8__3__Impl : ( ( rule__XtextAssociation__Group_8_3__0 )* ) ;
    public final void rule__XtextAssociation__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3835:1: ( ( ( rule__XtextAssociation__Group_8_3__0 )* ) )
            // InternalCls.g:3836:1: ( ( rule__XtextAssociation__Group_8_3__0 )* )
            {
            // InternalCls.g:3836:1: ( ( rule__XtextAssociation__Group_8_3__0 )* )
            // InternalCls.g:3837:2: ( rule__XtextAssociation__Group_8_3__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_8_3()); 
            // InternalCls.g:3838:2: ( rule__XtextAssociation__Group_8_3__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==39) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalCls.g:3838:3: rule__XtextAssociation__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__XtextAssociation__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getXtextAssociationAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8__3__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_8__4"
    // InternalCls.g:3846:1: rule__XtextAssociation__Group_8__4 : rule__XtextAssociation__Group_8__4__Impl ;
    public final void rule__XtextAssociation__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3850:1: ( rule__XtextAssociation__Group_8__4__Impl )
            // InternalCls.g:3851:2: rule__XtextAssociation__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8__4"


    // $ANTLR start "rule__XtextAssociation__Group_8__4__Impl"
    // InternalCls.g:3857:1: rule__XtextAssociation__Group_8__4__Impl : ( ']' ) ;
    public final void rule__XtextAssociation__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3861:1: ( ( ']' ) )
            // InternalCls.g:3862:1: ( ']' )
            {
            // InternalCls.g:3862:1: ( ']' )
            // InternalCls.g:3863:2: ']'
            {
             before(grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_8_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8__4__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_8_3__0"
    // InternalCls.g:3873:1: rule__XtextAssociation__Group_8_3__0 : rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1 ;
    public final void rule__XtextAssociation__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3877:1: ( rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1 )
            // InternalCls.g:3878:2: rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1
            {
            pushFollow(FOLLOW_41);
            rule__XtextAssociation__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8_3__0"


    // $ANTLR start "rule__XtextAssociation__Group_8_3__0__Impl"
    // InternalCls.g:3885:1: rule__XtextAssociation__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__XtextAssociation__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3889:1: ( ( ',' ) )
            // InternalCls.g:3890:1: ( ',' )
            {
            // InternalCls.g:3890:1: ( ',' )
            // InternalCls.g:3891:2: ','
            {
             before(grammarAccess.getXtextAssociationAccess().getCommaKeyword_8_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8_3__0__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_8_3__1"
    // InternalCls.g:3900:1: rule__XtextAssociation__Group_8_3__1 : rule__XtextAssociation__Group_8_3__1__Impl ;
    public final void rule__XtextAssociation__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3904:1: ( rule__XtextAssociation__Group_8_3__1__Impl )
            // InternalCls.g:3905:2: rule__XtextAssociation__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8_3__1"


    // $ANTLR start "rule__XtextAssociation__Group_8_3__1__Impl"
    // InternalCls.g:3911:1: rule__XtextAssociation__Group_8_3__1__Impl : ( ( rule__XtextAssociation__MemberEndNamesAssignment_8_3_1 ) ) ;
    public final void rule__XtextAssociation__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3915:1: ( ( ( rule__XtextAssociation__MemberEndNamesAssignment_8_3_1 ) ) )
            // InternalCls.g:3916:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_8_3_1 ) )
            {
            // InternalCls.g:3916:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_8_3_1 ) )
            // InternalCls.g:3917:2: ( rule__XtextAssociation__MemberEndNamesAssignment_8_3_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_8_3_1()); 
            // InternalCls.g:3918:2: ( rule__XtextAssociation__MemberEndNamesAssignment_8_3_1 )
            // InternalCls.g:3918:3: rule__XtextAssociation__MemberEndNamesAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndNamesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_8_3__1__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_9__0"
    // InternalCls.g:3927:1: rule__XtextAssociation__Group_9__0 : rule__XtextAssociation__Group_9__0__Impl rule__XtextAssociation__Group_9__1 ;
    public final void rule__XtextAssociation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3931:1: ( rule__XtextAssociation__Group_9__0__Impl rule__XtextAssociation__Group_9__1 )
            // InternalCls.g:3932:2: rule__XtextAssociation__Group_9__0__Impl rule__XtextAssociation__Group_9__1
            {
            pushFollow(FOLLOW_40);
            rule__XtextAssociation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9__0"


    // $ANTLR start "rule__XtextAssociation__Group_9__0__Impl"
    // InternalCls.g:3939:1: rule__XtextAssociation__Group_9__0__Impl : ( 'card' ) ;
    public final void rule__XtextAssociation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3943:1: ( ( 'card' ) )
            // InternalCls.g:3944:1: ( 'card' )
            {
            // InternalCls.g:3944:1: ( 'card' )
            // InternalCls.g:3945:2: 'card'
            {
             before(grammarAccess.getXtextAssociationAccess().getCardKeyword_9_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getCardKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9__0__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_9__1"
    // InternalCls.g:3954:1: rule__XtextAssociation__Group_9__1 : rule__XtextAssociation__Group_9__1__Impl rule__XtextAssociation__Group_9__2 ;
    public final void rule__XtextAssociation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3958:1: ( rule__XtextAssociation__Group_9__1__Impl rule__XtextAssociation__Group_9__2 )
            // InternalCls.g:3959:2: rule__XtextAssociation__Group_9__1__Impl rule__XtextAssociation__Group_9__2
            {
            pushFollow(FOLLOW_43);
            rule__XtextAssociation__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9__1"


    // $ANTLR start "rule__XtextAssociation__Group_9__1__Impl"
    // InternalCls.g:3966:1: rule__XtextAssociation__Group_9__1__Impl : ( '[' ) ;
    public final void rule__XtextAssociation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3970:1: ( ( '[' ) )
            // InternalCls.g:3971:1: ( '[' )
            {
            // InternalCls.g:3971:1: ( '[' )
            // InternalCls.g:3972:2: '['
            {
             before(grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_9_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9__1__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_9__2"
    // InternalCls.g:3981:1: rule__XtextAssociation__Group_9__2 : rule__XtextAssociation__Group_9__2__Impl rule__XtextAssociation__Group_9__3 ;
    public final void rule__XtextAssociation__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3985:1: ( rule__XtextAssociation__Group_9__2__Impl rule__XtextAssociation__Group_9__3 )
            // InternalCls.g:3986:2: rule__XtextAssociation__Group_9__2__Impl rule__XtextAssociation__Group_9__3
            {
            pushFollow(FOLLOW_44);
            rule__XtextAssociation__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9__2"


    // $ANTLR start "rule__XtextAssociation__Group_9__2__Impl"
    // InternalCls.g:3993:1: rule__XtextAssociation__Group_9__2__Impl : ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2 ) ) ;
    public final void rule__XtextAssociation__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3997:1: ( ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2 ) ) )
            // InternalCls.g:3998:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2 ) )
            {
            // InternalCls.g:3998:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2 ) )
            // InternalCls.g:3999:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_9_2()); 
            // InternalCls.g:4000:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2 )
            // InternalCls.g:4000:3: rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9__2__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_9__3"
    // InternalCls.g:4008:1: rule__XtextAssociation__Group_9__3 : rule__XtextAssociation__Group_9__3__Impl rule__XtextAssociation__Group_9__4 ;
    public final void rule__XtextAssociation__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4012:1: ( rule__XtextAssociation__Group_9__3__Impl rule__XtextAssociation__Group_9__4 )
            // InternalCls.g:4013:2: rule__XtextAssociation__Group_9__3__Impl rule__XtextAssociation__Group_9__4
            {
            pushFollow(FOLLOW_44);
            rule__XtextAssociation__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9__3"


    // $ANTLR start "rule__XtextAssociation__Group_9__3__Impl"
    // InternalCls.g:4020:1: rule__XtextAssociation__Group_9__3__Impl : ( ( rule__XtextAssociation__Group_9_3__0 )* ) ;
    public final void rule__XtextAssociation__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4024:1: ( ( ( rule__XtextAssociation__Group_9_3__0 )* ) )
            // InternalCls.g:4025:1: ( ( rule__XtextAssociation__Group_9_3__0 )* )
            {
            // InternalCls.g:4025:1: ( ( rule__XtextAssociation__Group_9_3__0 )* )
            // InternalCls.g:4026:2: ( rule__XtextAssociation__Group_9_3__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_9_3()); 
            // InternalCls.g:4027:2: ( rule__XtextAssociation__Group_9_3__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==36) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalCls.g:4027:3: rule__XtextAssociation__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__XtextAssociation__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getXtextAssociationAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9__3__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_9__4"
    // InternalCls.g:4035:1: rule__XtextAssociation__Group_9__4 : rule__XtextAssociation__Group_9__4__Impl ;
    public final void rule__XtextAssociation__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4039:1: ( rule__XtextAssociation__Group_9__4__Impl )
            // InternalCls.g:4040:2: rule__XtextAssociation__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9__4"


    // $ANTLR start "rule__XtextAssociation__Group_9__4__Impl"
    // InternalCls.g:4046:1: rule__XtextAssociation__Group_9__4__Impl : ( ']' ) ;
    public final void rule__XtextAssociation__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4050:1: ( ( ']' ) )
            // InternalCls.g:4051:1: ( ']' )
            {
            // InternalCls.g:4051:1: ( ']' )
            // InternalCls.g:4052:2: ']'
            {
             before(grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_9_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9__4__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_9_3__0"
    // InternalCls.g:4062:1: rule__XtextAssociation__Group_9_3__0 : rule__XtextAssociation__Group_9_3__0__Impl rule__XtextAssociation__Group_9_3__1 ;
    public final void rule__XtextAssociation__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4066:1: ( rule__XtextAssociation__Group_9_3__0__Impl rule__XtextAssociation__Group_9_3__1 )
            // InternalCls.g:4067:2: rule__XtextAssociation__Group_9_3__0__Impl rule__XtextAssociation__Group_9_3__1
            {
            pushFollow(FOLLOW_43);
            rule__XtextAssociation__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9_3__0"


    // $ANTLR start "rule__XtextAssociation__Group_9_3__0__Impl"
    // InternalCls.g:4074:1: rule__XtextAssociation__Group_9_3__0__Impl : ( ':' ) ;
    public final void rule__XtextAssociation__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4078:1: ( ( ':' ) )
            // InternalCls.g:4079:1: ( ':' )
            {
            // InternalCls.g:4079:1: ( ':' )
            // InternalCls.g:4080:2: ':'
            {
             before(grammarAccess.getXtextAssociationAccess().getColonKeyword_9_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getColonKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9_3__0__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_9_3__1"
    // InternalCls.g:4089:1: rule__XtextAssociation__Group_9_3__1 : rule__XtextAssociation__Group_9_3__1__Impl ;
    public final void rule__XtextAssociation__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4093:1: ( rule__XtextAssociation__Group_9_3__1__Impl )
            // InternalCls.g:4094:2: rule__XtextAssociation__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9_3__1"


    // $ANTLR start "rule__XtextAssociation__Group_9_3__1__Impl"
    // InternalCls.g:4100:1: rule__XtextAssociation__Group_9_3__1__Impl : ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1 ) ) ;
    public final void rule__XtextAssociation__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4104:1: ( ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1 ) ) )
            // InternalCls.g:4105:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1 ) )
            {
            // InternalCls.g:4105:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1 ) )
            // InternalCls.g:4106:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_9_3_1()); 
            // InternalCls.g:4107:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1 )
            // InternalCls.g:4107:3: rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_9_3__1__Impl"


    // $ANTLR start "rule__Comment__Group__0"
    // InternalCls.g:4116:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4120:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalCls.g:4121:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCls.g:4128:1: rule__Comment__Group__0__Impl : ( 'note' ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4132:1: ( ( 'note' ) )
            // InternalCls.g:4133:1: ( 'note' )
            {
            // InternalCls.g:4133:1: ( 'note' )
            // InternalCls.g:4134:2: 'note'
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
    // InternalCls.g:4143:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4147:1: ( rule__Comment__Group__1__Impl )
            // InternalCls.g:4148:2: rule__Comment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:4154:1: rule__Comment__Group__1__Impl : ( ( rule__Comment__BodyAssignment_1 ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4158:1: ( ( ( rule__Comment__BodyAssignment_1 ) ) )
            // InternalCls.g:4159:1: ( ( rule__Comment__BodyAssignment_1 ) )
            {
            // InternalCls.g:4159:1: ( ( rule__Comment__BodyAssignment_1 ) )
            // InternalCls.g:4160:2: ( rule__Comment__BodyAssignment_1 )
            {
             before(grammarAccess.getCommentAccess().getBodyAssignment_1()); 
            // InternalCls.g:4161:2: ( rule__Comment__BodyAssignment_1 )
            // InternalCls.g:4161:3: rule__Comment__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comment__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getBodyAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalCls.g:4170:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4174:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalCls.g:4175:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalCls.g:4182:1: rule__Cardinality__Group__0__Impl : ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4186:1: ( ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) )
            // InternalCls.g:4187:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            {
            // InternalCls.g:4187:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            // InternalCls.g:4188:2: ( rule__Cardinality__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0()); 
            // InternalCls.g:4189:2: ( rule__Cardinality__LowerBoundAssignment_0 )
            // InternalCls.g:4189:3: rule__Cardinality__LowerBoundAssignment_0
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
    // InternalCls.g:4197:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4201:1: ( rule__Cardinality__Group__1__Impl )
            // InternalCls.g:4202:2: rule__Cardinality__Group__1__Impl
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
    // InternalCls.g:4208:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Group_1__0 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4212:1: ( ( ( rule__Cardinality__Group_1__0 )? ) )
            // InternalCls.g:4213:1: ( ( rule__Cardinality__Group_1__0 )? )
            {
            // InternalCls.g:4213:1: ( ( rule__Cardinality__Group_1__0 )? )
            // InternalCls.g:4214:2: ( rule__Cardinality__Group_1__0 )?
            {
             before(grammarAccess.getCardinalityAccess().getGroup_1()); 
            // InternalCls.g:4215:2: ( rule__Cardinality__Group_1__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCls.g:4215:3: rule__Cardinality__Group_1__0
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
    // InternalCls.g:4224:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4228:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // InternalCls.g:4229:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalCls.g:4236:1: rule__Cardinality__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4240:1: ( ( '..' ) )
            // InternalCls.g:4241:1: ( '..' )
            {
            // InternalCls.g:4241:1: ( '..' )
            // InternalCls.g:4242:2: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCls.g:4251:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4255:1: ( rule__Cardinality__Group_1__1__Impl )
            // InternalCls.g:4256:2: rule__Cardinality__Group_1__1__Impl
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
    // InternalCls.g:4262:1: rule__Cardinality__Group_1__1__Impl : ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4266:1: ( ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) )
            // InternalCls.g:4267:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            {
            // InternalCls.g:4267:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            // InternalCls.g:4268:2: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1()); 
            // InternalCls.g:4269:2: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            // InternalCls.g:4269:3: rule__Cardinality__UpperBoundAssignment_1_1
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


    // $ANTLR start "rule__StereotypeApplication__Group__0"
    // InternalCls.g:4278:1: rule__StereotypeApplication__Group__0 : rule__StereotypeApplication__Group__0__Impl rule__StereotypeApplication__Group__1 ;
    public final void rule__StereotypeApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4282:1: ( rule__StereotypeApplication__Group__0__Impl rule__StereotypeApplication__Group__1 )
            // InternalCls.g:4283:2: rule__StereotypeApplication__Group__0__Impl rule__StereotypeApplication__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__StereotypeApplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group__0"


    // $ANTLR start "rule__StereotypeApplication__Group__0__Impl"
    // InternalCls.g:4290:1: rule__StereotypeApplication__Group__0__Impl : ( RULE_STEREOTYPE_O ) ;
    public final void rule__StereotypeApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4294:1: ( ( RULE_STEREOTYPE_O ) )
            // InternalCls.g:4295:1: ( RULE_STEREOTYPE_O )
            {
            // InternalCls.g:4295:1: ( RULE_STEREOTYPE_O )
            // InternalCls.g:4296:2: RULE_STEREOTYPE_O
            {
             before(grammarAccess.getStereotypeApplicationAccess().getSTEREOTYPE_OTerminalRuleCall_0()); 
            match(input,RULE_STEREOTYPE_O,FOLLOW_2); 
             after(grammarAccess.getStereotypeApplicationAccess().getSTEREOTYPE_OTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group__0__Impl"


    // $ANTLR start "rule__StereotypeApplication__Group__1"
    // InternalCls.g:4305:1: rule__StereotypeApplication__Group__1 : rule__StereotypeApplication__Group__1__Impl rule__StereotypeApplication__Group__2 ;
    public final void rule__StereotypeApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4309:1: ( rule__StereotypeApplication__Group__1__Impl rule__StereotypeApplication__Group__2 )
            // InternalCls.g:4310:2: rule__StereotypeApplication__Group__1__Impl rule__StereotypeApplication__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__StereotypeApplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group__1"


    // $ANTLR start "rule__StereotypeApplication__Group__1__Impl"
    // InternalCls.g:4317:1: rule__StereotypeApplication__Group__1__Impl : ( ( rule__StereotypeApplication__StereotypeAssignment_1 ) ) ;
    public final void rule__StereotypeApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4321:1: ( ( ( rule__StereotypeApplication__StereotypeAssignment_1 ) ) )
            // InternalCls.g:4322:1: ( ( rule__StereotypeApplication__StereotypeAssignment_1 ) )
            {
            // InternalCls.g:4322:1: ( ( rule__StereotypeApplication__StereotypeAssignment_1 ) )
            // InternalCls.g:4323:2: ( rule__StereotypeApplication__StereotypeAssignment_1 )
            {
             before(grammarAccess.getStereotypeApplicationAccess().getStereotypeAssignment_1()); 
            // InternalCls.g:4324:2: ( rule__StereotypeApplication__StereotypeAssignment_1 )
            // InternalCls.g:4324:3: rule__StereotypeApplication__StereotypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__StereotypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStereotypeApplicationAccess().getStereotypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group__1__Impl"


    // $ANTLR start "rule__StereotypeApplication__Group__2"
    // InternalCls.g:4332:1: rule__StereotypeApplication__Group__2 : rule__StereotypeApplication__Group__2__Impl rule__StereotypeApplication__Group__3 ;
    public final void rule__StereotypeApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4336:1: ( rule__StereotypeApplication__Group__2__Impl rule__StereotypeApplication__Group__3 )
            // InternalCls.g:4337:2: rule__StereotypeApplication__Group__2__Impl rule__StereotypeApplication__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__StereotypeApplication__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group__2"


    // $ANTLR start "rule__StereotypeApplication__Group__2__Impl"
    // InternalCls.g:4344:1: rule__StereotypeApplication__Group__2__Impl : ( RULE_STEREOTYPE_C ) ;
    public final void rule__StereotypeApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4348:1: ( ( RULE_STEREOTYPE_C ) )
            // InternalCls.g:4349:1: ( RULE_STEREOTYPE_C )
            {
            // InternalCls.g:4349:1: ( RULE_STEREOTYPE_C )
            // InternalCls.g:4350:2: RULE_STEREOTYPE_C
            {
             before(grammarAccess.getStereotypeApplicationAccess().getSTEREOTYPE_CTerminalRuleCall_2()); 
            match(input,RULE_STEREOTYPE_C,FOLLOW_2); 
             after(grammarAccess.getStereotypeApplicationAccess().getSTEREOTYPE_CTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group__2__Impl"


    // $ANTLR start "rule__StereotypeApplication__Group__3"
    // InternalCls.g:4359:1: rule__StereotypeApplication__Group__3 : rule__StereotypeApplication__Group__3__Impl ;
    public final void rule__StereotypeApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4363:1: ( rule__StereotypeApplication__Group__3__Impl )
            // InternalCls.g:4364:2: rule__StereotypeApplication__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group__3"


    // $ANTLR start "rule__StereotypeApplication__Group__3__Impl"
    // InternalCls.g:4370:1: rule__StereotypeApplication__Group__3__Impl : ( ( rule__StereotypeApplication__Group_3__0 )? ) ;
    public final void rule__StereotypeApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4374:1: ( ( ( rule__StereotypeApplication__Group_3__0 )? ) )
            // InternalCls.g:4375:1: ( ( rule__StereotypeApplication__Group_3__0 )? )
            {
            // InternalCls.g:4375:1: ( ( rule__StereotypeApplication__Group_3__0 )? )
            // InternalCls.g:4376:2: ( rule__StereotypeApplication__Group_3__0 )?
            {
             before(grammarAccess.getStereotypeApplicationAccess().getGroup_3()); 
            // InternalCls.g:4377:2: ( rule__StereotypeApplication__Group_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==29) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_STRING) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // InternalCls.g:4377:3: rule__StereotypeApplication__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StereotypeApplication__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStereotypeApplicationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group__3__Impl"


    // $ANTLR start "rule__StereotypeApplication__Group_3__0"
    // InternalCls.g:4386:1: rule__StereotypeApplication__Group_3__0 : rule__StereotypeApplication__Group_3__0__Impl rule__StereotypeApplication__Group_3__1 ;
    public final void rule__StereotypeApplication__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4390:1: ( rule__StereotypeApplication__Group_3__0__Impl rule__StereotypeApplication__Group_3__1 )
            // InternalCls.g:4391:2: rule__StereotypeApplication__Group_3__0__Impl rule__StereotypeApplication__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__StereotypeApplication__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3__0"


    // $ANTLR start "rule__StereotypeApplication__Group_3__0__Impl"
    // InternalCls.g:4398:1: rule__StereotypeApplication__Group_3__0__Impl : ( '{' ) ;
    public final void rule__StereotypeApplication__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4402:1: ( ( '{' ) )
            // InternalCls.g:4403:1: ( '{' )
            {
            // InternalCls.g:4403:1: ( '{' )
            // InternalCls.g:4404:2: '{'
            {
             before(grammarAccess.getStereotypeApplicationAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStereotypeApplicationAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3__0__Impl"


    // $ANTLR start "rule__StereotypeApplication__Group_3__1"
    // InternalCls.g:4413:1: rule__StereotypeApplication__Group_3__1 : rule__StereotypeApplication__Group_3__1__Impl rule__StereotypeApplication__Group_3__2 ;
    public final void rule__StereotypeApplication__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4417:1: ( rule__StereotypeApplication__Group_3__1__Impl rule__StereotypeApplication__Group_3__2 )
            // InternalCls.g:4418:2: rule__StereotypeApplication__Group_3__1__Impl rule__StereotypeApplication__Group_3__2
            {
            pushFollow(FOLLOW_49);
            rule__StereotypeApplication__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3__1"


    // $ANTLR start "rule__StereotypeApplication__Group_3__1__Impl"
    // InternalCls.g:4425:1: rule__StereotypeApplication__Group_3__1__Impl : ( ( rule__StereotypeApplication__ValuesAssignment_3_1 ) ) ;
    public final void rule__StereotypeApplication__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4429:1: ( ( ( rule__StereotypeApplication__ValuesAssignment_3_1 ) ) )
            // InternalCls.g:4430:1: ( ( rule__StereotypeApplication__ValuesAssignment_3_1 ) )
            {
            // InternalCls.g:4430:1: ( ( rule__StereotypeApplication__ValuesAssignment_3_1 ) )
            // InternalCls.g:4431:2: ( rule__StereotypeApplication__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getStereotypeApplicationAccess().getValuesAssignment_3_1()); 
            // InternalCls.g:4432:2: ( rule__StereotypeApplication__ValuesAssignment_3_1 )
            // InternalCls.g:4432:3: rule__StereotypeApplication__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStereotypeApplicationAccess().getValuesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3__1__Impl"


    // $ANTLR start "rule__StereotypeApplication__Group_3__2"
    // InternalCls.g:4440:1: rule__StereotypeApplication__Group_3__2 : rule__StereotypeApplication__Group_3__2__Impl rule__StereotypeApplication__Group_3__3 ;
    public final void rule__StereotypeApplication__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4444:1: ( rule__StereotypeApplication__Group_3__2__Impl rule__StereotypeApplication__Group_3__3 )
            // InternalCls.g:4445:2: rule__StereotypeApplication__Group_3__2__Impl rule__StereotypeApplication__Group_3__3
            {
            pushFollow(FOLLOW_49);
            rule__StereotypeApplication__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3__2"


    // $ANTLR start "rule__StereotypeApplication__Group_3__2__Impl"
    // InternalCls.g:4452:1: rule__StereotypeApplication__Group_3__2__Impl : ( ( rule__StereotypeApplication__Group_3_2__0 )* ) ;
    public final void rule__StereotypeApplication__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4456:1: ( ( ( rule__StereotypeApplication__Group_3_2__0 )* ) )
            // InternalCls.g:4457:1: ( ( rule__StereotypeApplication__Group_3_2__0 )* )
            {
            // InternalCls.g:4457:1: ( ( rule__StereotypeApplication__Group_3_2__0 )* )
            // InternalCls.g:4458:2: ( rule__StereotypeApplication__Group_3_2__0 )*
            {
             before(grammarAccess.getStereotypeApplicationAccess().getGroup_3_2()); 
            // InternalCls.g:4459:2: ( rule__StereotypeApplication__Group_3_2__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==39) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalCls.g:4459:3: rule__StereotypeApplication__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__StereotypeApplication__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getStereotypeApplicationAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3__2__Impl"


    // $ANTLR start "rule__StereotypeApplication__Group_3__3"
    // InternalCls.g:4467:1: rule__StereotypeApplication__Group_3__3 : rule__StereotypeApplication__Group_3__3__Impl ;
    public final void rule__StereotypeApplication__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4471:1: ( rule__StereotypeApplication__Group_3__3__Impl )
            // InternalCls.g:4472:2: rule__StereotypeApplication__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3__3"


    // $ANTLR start "rule__StereotypeApplication__Group_3__3__Impl"
    // InternalCls.g:4478:1: rule__StereotypeApplication__Group_3__3__Impl : ( '}' ) ;
    public final void rule__StereotypeApplication__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4482:1: ( ( '}' ) )
            // InternalCls.g:4483:1: ( '}' )
            {
            // InternalCls.g:4483:1: ( '}' )
            // InternalCls.g:4484:2: '}'
            {
             before(grammarAccess.getStereotypeApplicationAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStereotypeApplicationAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3__3__Impl"


    // $ANTLR start "rule__StereotypeApplication__Group_3_2__0"
    // InternalCls.g:4494:1: rule__StereotypeApplication__Group_3_2__0 : rule__StereotypeApplication__Group_3_2__0__Impl rule__StereotypeApplication__Group_3_2__1 ;
    public final void rule__StereotypeApplication__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4498:1: ( rule__StereotypeApplication__Group_3_2__0__Impl rule__StereotypeApplication__Group_3_2__1 )
            // InternalCls.g:4499:2: rule__StereotypeApplication__Group_3_2__0__Impl rule__StereotypeApplication__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__StereotypeApplication__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3_2__0"


    // $ANTLR start "rule__StereotypeApplication__Group_3_2__0__Impl"
    // InternalCls.g:4506:1: rule__StereotypeApplication__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__StereotypeApplication__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4510:1: ( ( ',' ) )
            // InternalCls.g:4511:1: ( ',' )
            {
            // InternalCls.g:4511:1: ( ',' )
            // InternalCls.g:4512:2: ','
            {
             before(grammarAccess.getStereotypeApplicationAccess().getCommaKeyword_3_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStereotypeApplicationAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3_2__0__Impl"


    // $ANTLR start "rule__StereotypeApplication__Group_3_2__1"
    // InternalCls.g:4521:1: rule__StereotypeApplication__Group_3_2__1 : rule__StereotypeApplication__Group_3_2__1__Impl ;
    public final void rule__StereotypeApplication__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4525:1: ( rule__StereotypeApplication__Group_3_2__1__Impl )
            // InternalCls.g:4526:2: rule__StereotypeApplication__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3_2__1"


    // $ANTLR start "rule__StereotypeApplication__Group_3_2__1__Impl"
    // InternalCls.g:4532:1: rule__StereotypeApplication__Group_3_2__1__Impl : ( ( rule__StereotypeApplication__ValuesAssignment_3_2_1 ) ) ;
    public final void rule__StereotypeApplication__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4536:1: ( ( ( rule__StereotypeApplication__ValuesAssignment_3_2_1 ) ) )
            // InternalCls.g:4537:1: ( ( rule__StereotypeApplication__ValuesAssignment_3_2_1 ) )
            {
            // InternalCls.g:4537:1: ( ( rule__StereotypeApplication__ValuesAssignment_3_2_1 ) )
            // InternalCls.g:4538:2: ( rule__StereotypeApplication__ValuesAssignment_3_2_1 )
            {
             before(grammarAccess.getStereotypeApplicationAccess().getValuesAssignment_3_2_1()); 
            // InternalCls.g:4539:2: ( rule__StereotypeApplication__ValuesAssignment_3_2_1 )
            // InternalCls.g:4539:3: rule__StereotypeApplication__ValuesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StereotypeApplication__ValuesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStereotypeApplicationAccess().getValuesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__Group_3_2__1__Impl"


    // $ANTLR start "rule__TaggedValue__Group__0"
    // InternalCls.g:4548:1: rule__TaggedValue__Group__0 : rule__TaggedValue__Group__0__Impl rule__TaggedValue__Group__1 ;
    public final void rule__TaggedValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4552:1: ( rule__TaggedValue__Group__0__Impl rule__TaggedValue__Group__1 )
            // InternalCls.g:4553:2: rule__TaggedValue__Group__0__Impl rule__TaggedValue__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__TaggedValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaggedValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaggedValue__Group__0"


    // $ANTLR start "rule__TaggedValue__Group__0__Impl"
    // InternalCls.g:4560:1: rule__TaggedValue__Group__0__Impl : ( ( rule__TaggedValue__NameAssignment_0 ) ) ;
    public final void rule__TaggedValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4564:1: ( ( ( rule__TaggedValue__NameAssignment_0 ) ) )
            // InternalCls.g:4565:1: ( ( rule__TaggedValue__NameAssignment_0 ) )
            {
            // InternalCls.g:4565:1: ( ( rule__TaggedValue__NameAssignment_0 ) )
            // InternalCls.g:4566:2: ( rule__TaggedValue__NameAssignment_0 )
            {
             before(grammarAccess.getTaggedValueAccess().getNameAssignment_0()); 
            // InternalCls.g:4567:2: ( rule__TaggedValue__NameAssignment_0 )
            // InternalCls.g:4567:3: rule__TaggedValue__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TaggedValue__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTaggedValueAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaggedValue__Group__0__Impl"


    // $ANTLR start "rule__TaggedValue__Group__1"
    // InternalCls.g:4575:1: rule__TaggedValue__Group__1 : rule__TaggedValue__Group__1__Impl rule__TaggedValue__Group__2 ;
    public final void rule__TaggedValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4579:1: ( rule__TaggedValue__Group__1__Impl rule__TaggedValue__Group__2 )
            // InternalCls.g:4580:2: rule__TaggedValue__Group__1__Impl rule__TaggedValue__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TaggedValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaggedValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaggedValue__Group__1"


    // $ANTLR start "rule__TaggedValue__Group__1__Impl"
    // InternalCls.g:4587:1: rule__TaggedValue__Group__1__Impl : ( ':' ) ;
    public final void rule__TaggedValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4591:1: ( ( ':' ) )
            // InternalCls.g:4592:1: ( ':' )
            {
            // InternalCls.g:4592:1: ( ':' )
            // InternalCls.g:4593:2: ':'
            {
             before(grammarAccess.getTaggedValueAccess().getColonKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTaggedValueAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaggedValue__Group__1__Impl"


    // $ANTLR start "rule__TaggedValue__Group__2"
    // InternalCls.g:4602:1: rule__TaggedValue__Group__2 : rule__TaggedValue__Group__2__Impl ;
    public final void rule__TaggedValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4606:1: ( rule__TaggedValue__Group__2__Impl )
            // InternalCls.g:4607:2: rule__TaggedValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaggedValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaggedValue__Group__2"


    // $ANTLR start "rule__TaggedValue__Group__2__Impl"
    // InternalCls.g:4613:1: rule__TaggedValue__Group__2__Impl : ( ( rule__TaggedValue__ValueAssignment_2 ) ) ;
    public final void rule__TaggedValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4617:1: ( ( ( rule__TaggedValue__ValueAssignment_2 ) ) )
            // InternalCls.g:4618:1: ( ( rule__TaggedValue__ValueAssignment_2 ) )
            {
            // InternalCls.g:4618:1: ( ( rule__TaggedValue__ValueAssignment_2 ) )
            // InternalCls.g:4619:2: ( rule__TaggedValue__ValueAssignment_2 )
            {
             before(grammarAccess.getTaggedValueAccess().getValueAssignment_2()); 
            // InternalCls.g:4620:2: ( rule__TaggedValue__ValueAssignment_2 )
            // InternalCls.g:4620:3: rule__TaggedValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TaggedValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaggedValueAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaggedValue__Group__2__Impl"


    // $ANTLR start "rule__ClassDiagram__TitleAssignment_2"
    // InternalCls.g:4629:1: rule__ClassDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4633:1: ( ( RULE_STRING ) )
            // InternalCls.g:4634:2: ( RULE_STRING )
            {
            // InternalCls.g:4634:2: ( RULE_STRING )
            // InternalCls.g:4635:3: RULE_STRING
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
    // InternalCls.g:4644:1: rule__ClassDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__ClassDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4648:1: ( ( ruleRootPackage ) )
            // InternalCls.g:4649:2: ( ruleRootPackage )
            {
            // InternalCls.g:4649:2: ( ruleRootPackage )
            // InternalCls.g:4650:3: ruleRootPackage
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


    // $ANTLR start "rule__RootPackage__NameAssignment_1"
    // InternalCls.g:4659:1: rule__RootPackage__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4663:1: ( ( ruleFQN ) )
            // InternalCls.g:4664:2: ( ruleFQN )
            {
            // InternalCls.g:4664:2: ( ruleFQN )
            // InternalCls.g:4665:3: ruleFQN
            {
             before(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__NameAssignment_1"


    // $ANTLR start "rule__RootPackage__PackageImportsAssignment_2"
    // InternalCls.g:4674:1: rule__RootPackage__PackageImportsAssignment_2 : ( rulePackageImport ) ;
    public final void rule__RootPackage__PackageImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4678:1: ( ( rulePackageImport ) )
            // InternalCls.g:4679:2: ( rulePackageImport )
            {
            // InternalCls.g:4679:2: ( rulePackageImport )
            // InternalCls.g:4680:3: rulePackageImport
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
    // InternalCls.g:4689:1: rule__RootPackage__ClassifiersAssignment_3 : ( ruleClassifier ) ;
    public final void rule__RootPackage__ClassifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4693:1: ( ( ruleClassifier ) )
            // InternalCls.g:4694:2: ( ruleClassifier )
            {
            // InternalCls.g:4694:2: ( ruleClassifier )
            // InternalCls.g:4695:3: ruleClassifier
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
    // InternalCls.g:4704:1: rule__RootPackage__ConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__RootPackage__ConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4708:1: ( ( ruleConnector ) )
            // InternalCls.g:4709:2: ( ruleConnector )
            {
            // InternalCls.g:4709:2: ( ruleConnector )
            // InternalCls.g:4710:3: ruleConnector
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
    // InternalCls.g:4719:1: rule__RootPackage__PackagesAssignment_5 : ( rulePackage ) ;
    public final void rule__RootPackage__PackagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4723:1: ( ( rulePackage ) )
            // InternalCls.g:4724:2: ( rulePackage )
            {
            // InternalCls.g:4724:2: ( rulePackage )
            // InternalCls.g:4725:3: rulePackage
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


    // $ANTLR start "rule__Package__NameAssignment_1"
    // InternalCls.g:4734:1: rule__Package__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4738:1: ( ( ruleFQN ) )
            // InternalCls.g:4739:2: ( ruleFQN )
            {
            // InternalCls.g:4739:2: ( ruleFQN )
            // InternalCls.g:4740:3: ruleFQN
            {
             before(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__AppliedStereotypesAssignment_2"
    // InternalCls.g:4749:1: rule__Package__AppliedStereotypesAssignment_2 : ( ruleStereotypeApplication ) ;
    public final void rule__Package__AppliedStereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4753:1: ( ( ruleStereotypeApplication ) )
            // InternalCls.g:4754:2: ( ruleStereotypeApplication )
            {
            // InternalCls.g:4754:2: ( ruleStereotypeApplication )
            // InternalCls.g:4755:3: ruleStereotypeApplication
            {
             before(grammarAccess.getPackageAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStereotypeApplication();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AppliedStereotypesAssignment_2"


    // $ANTLR start "rule__Package__PackageImportsAssignment_4"
    // InternalCls.g:4764:1: rule__Package__PackageImportsAssignment_4 : ( rulePackageImport ) ;
    public final void rule__Package__PackageImportsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4768:1: ( ( rulePackageImport ) )
            // InternalCls.g:4769:2: ( rulePackageImport )
            {
            // InternalCls.g:4769:2: ( rulePackageImport )
            // InternalCls.g:4770:3: rulePackageImport
            {
             before(grammarAccess.getPackageAccess().getPackageImportsPackageImportParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePackageImport();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPackageImportsPackageImportParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PackageImportsAssignment_4"


    // $ANTLR start "rule__Package__ClassifiersAssignment_5"
    // InternalCls.g:4779:1: rule__Package__ClassifiersAssignment_5 : ( ruleClassifier ) ;
    public final void rule__Package__ClassifiersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4783:1: ( ( ruleClassifier ) )
            // InternalCls.g:4784:2: ( ruleClassifier )
            {
            // InternalCls.g:4784:2: ( ruleClassifier )
            // InternalCls.g:4785:3: ruleClassifier
            {
             before(grammarAccess.getPackageAccess().getClassifiersClassifierParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleClassifier();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getClassifiersClassifierParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ClassifiersAssignment_5"


    // $ANTLR start "rule__Package__ConnectorsAssignment_6"
    // InternalCls.g:4794:1: rule__Package__ConnectorsAssignment_6 : ( ruleConnector ) ;
    public final void rule__Package__ConnectorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4798:1: ( ( ruleConnector ) )
            // InternalCls.g:4799:2: ( ruleConnector )
            {
            // InternalCls.g:4799:2: ( ruleConnector )
            // InternalCls.g:4800:3: ruleConnector
            {
             before(grammarAccess.getPackageAccess().getConnectorsConnectorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getConnectorsConnectorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ConnectorsAssignment_6"


    // $ANTLR start "rule__Package__PackagesAssignment_7"
    // InternalCls.g:4809:1: rule__Package__PackagesAssignment_7 : ( rulePackage ) ;
    public final void rule__Package__PackagesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4813:1: ( ( rulePackage ) )
            // InternalCls.g:4814:2: ( rulePackage )
            {
            // InternalCls.g:4814:2: ( rulePackage )
            // InternalCls.g:4815:3: rulePackage
            {
             before(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PackagesAssignment_7"


    // $ANTLR start "rule__PackageImport__ImportedPackageAssignment_1"
    // InternalCls.g:4824:1: rule__PackageImport__ImportedPackageAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__PackageImport__ImportedPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4828:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4829:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4829:2: ( ( ruleFQN ) )
            // InternalCls.g:4830:3: ( ruleFQN )
            {
             before(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_1_0()); 
            // InternalCls.g:4831:3: ( ruleFQN )
            // InternalCls.g:4832:4: ruleFQN
            {
             before(grammarAccess.getPackageImportAccess().getImportedPackagePackageFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPackageImportAccess().getImportedPackagePackageFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__ImportedPackageAssignment_1"


    // $ANTLR start "rule__Class__VisibilityAssignment_0"
    // InternalCls.g:4843:1: rule__Class__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4847:1: ( ( ruleVisibility ) )
            // InternalCls.g:4848:2: ( ruleVisibility )
            {
            // InternalCls.g:4848:2: ( ruleVisibility )
            // InternalCls.g:4849:3: ruleVisibility
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
    // InternalCls.g:4858:1: rule__Class__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4862:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4863:2: ( ( 'abstract' ) )
            {
            // InternalCls.g:4863:2: ( ( 'abstract' ) )
            // InternalCls.g:4864:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4865:3: ( 'abstract' )
            // InternalCls.g:4866:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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


    // $ANTLR start "rule__Class__NameAssignment_3_0_0"
    // InternalCls.g:4877:1: rule__Class__NameAssignment_3_0_0 : ( RULE_STRING ) ;
    public final void rule__Class__NameAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4881:1: ( ( RULE_STRING ) )
            // InternalCls.g:4882:2: ( RULE_STRING )
            {
            // InternalCls.g:4882:2: ( RULE_STRING )
            // InternalCls.g:4883:3: RULE_STRING
            {
             before(grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_3_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_3_0_0"


    // $ANTLR start "rule__Class__AliasAssignment_3_0_2"
    // InternalCls.g:4892:1: rule__Class__AliasAssignment_3_0_2 : ( RULE_ID ) ;
    public final void rule__Class__AliasAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4896:1: ( ( RULE_ID ) )
            // InternalCls.g:4897:2: ( RULE_ID )
            {
            // InternalCls.g:4897:2: ( RULE_ID )
            // InternalCls.g:4898:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getAliasIDTerminalRuleCall_3_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAliasIDTerminalRuleCall_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AliasAssignment_3_0_2"


    // $ANTLR start "rule__Class__NameAssignment_3_1"
    // InternalCls.g:4907:1: rule__Class__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4911:1: ( ( RULE_ID ) )
            // InternalCls.g:4912:2: ( RULE_ID )
            {
            // InternalCls.g:4912:2: ( RULE_ID )
            // InternalCls.g:4913:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_3_1"


    // $ANTLR start "rule__Class__AppliedStereotypesAssignment_4"
    // InternalCls.g:4922:1: rule__Class__AppliedStereotypesAssignment_4 : ( ruleStereotypeApplication ) ;
    public final void rule__Class__AppliedStereotypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4926:1: ( ( ruleStereotypeApplication ) )
            // InternalCls.g:4927:2: ( ruleStereotypeApplication )
            {
            // InternalCls.g:4927:2: ( ruleStereotypeApplication )
            // InternalCls.g:4928:3: ruleStereotypeApplication
            {
             before(grammarAccess.getClassAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStereotypeApplication();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AppliedStereotypesAssignment_4"


    // $ANTLR start "rule__Class__CommentsAssignment_5_0"
    // InternalCls.g:4937:1: rule__Class__CommentsAssignment_5_0 : ( ruleComment ) ;
    public final void rule__Class__CommentsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4941:1: ( ( ruleComment ) )
            // InternalCls.g:4942:2: ( ruleComment )
            {
            // InternalCls.g:4942:2: ( ruleComment )
            // InternalCls.g:4943:3: ruleComment
            {
             before(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__CommentsAssignment_5_0"


    // $ANTLR start "rule__Class__CommentsAssignment_5_1_1"
    // InternalCls.g:4952:1: rule__Class__CommentsAssignment_5_1_1 : ( ruleComment ) ;
    public final void rule__Class__CommentsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4956:1: ( ( ruleComment ) )
            // InternalCls.g:4957:2: ( ruleComment )
            {
            // InternalCls.g:4957:2: ( ruleComment )
            // InternalCls.g:4958:3: ruleComment
            {
             before(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__CommentsAssignment_5_1_1"


    // $ANTLR start "rule__Class__MembersAssignment_5_1_2"
    // InternalCls.g:4967:1: rule__Class__MembersAssignment_5_1_2 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4971:1: ( ( ruleMember ) )
            // InternalCls.g:4972:2: ( ruleMember )
            {
            // InternalCls.g:4972:2: ( ruleMember )
            // InternalCls.g:4973:3: ruleMember
            {
             before(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_5_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_5_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MembersAssignment_5_1_2"


    // $ANTLR start "rule__Interface__VisibilityAssignment_0"
    // InternalCls.g:4982:1: rule__Interface__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Interface__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4986:1: ( ( ruleVisibility ) )
            // InternalCls.g:4987:2: ( ruleVisibility )
            {
            // InternalCls.g:4987:2: ( ruleVisibility )
            // InternalCls.g:4988:3: ruleVisibility
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


    // $ANTLR start "rule__Interface__NameAssignment_2_0_0"
    // InternalCls.g:4997:1: rule__Interface__NameAssignment_2_0_0 : ( RULE_STRING ) ;
    public final void rule__Interface__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5001:1: ( ( RULE_STRING ) )
            // InternalCls.g:5002:2: ( RULE_STRING )
            {
            // InternalCls.g:5002:2: ( RULE_STRING )
            // InternalCls.g:5003:3: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_2_0_0"


    // $ANTLR start "rule__Interface__AliasAssignment_2_0_2"
    // InternalCls.g:5012:1: rule__Interface__AliasAssignment_2_0_2 : ( RULE_ID ) ;
    public final void rule__Interface__AliasAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5016:1: ( ( RULE_ID ) )
            // InternalCls.g:5017:2: ( RULE_ID )
            {
            // InternalCls.g:5017:2: ( RULE_ID )
            // InternalCls.g:5018:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getAliasIDTerminalRuleCall_2_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getAliasIDTerminalRuleCall_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__AliasAssignment_2_0_2"


    // $ANTLR start "rule__Interface__NameAssignment_2_1"
    // InternalCls.g:5027:1: rule__Interface__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5031:1: ( ( RULE_ID ) )
            // InternalCls.g:5032:2: ( RULE_ID )
            {
            // InternalCls.g:5032:2: ( RULE_ID )
            // InternalCls.g:5033:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_2_1"


    // $ANTLR start "rule__Interface__AppliedStereotypesAssignment_3"
    // InternalCls.g:5042:1: rule__Interface__AppliedStereotypesAssignment_3 : ( ruleStereotypeApplication ) ;
    public final void rule__Interface__AppliedStereotypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5046:1: ( ( ruleStereotypeApplication ) )
            // InternalCls.g:5047:2: ( ruleStereotypeApplication )
            {
            // InternalCls.g:5047:2: ( ruleStereotypeApplication )
            // InternalCls.g:5048:3: ruleStereotypeApplication
            {
             before(grammarAccess.getInterfaceAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStereotypeApplication();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__AppliedStereotypesAssignment_3"


    // $ANTLR start "rule__Interface__CommentsAssignment_4_0"
    // InternalCls.g:5057:1: rule__Interface__CommentsAssignment_4_0 : ( ruleComment ) ;
    public final void rule__Interface__CommentsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5061:1: ( ( ruleComment ) )
            // InternalCls.g:5062:2: ( ruleComment )
            {
            // InternalCls.g:5062:2: ( ruleComment )
            // InternalCls.g:5063:3: ruleComment
            {
             before(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__CommentsAssignment_4_0"


    // $ANTLR start "rule__Interface__CommentsAssignment_4_1_1"
    // InternalCls.g:5072:1: rule__Interface__CommentsAssignment_4_1_1 : ( ruleComment ) ;
    public final void rule__Interface__CommentsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5076:1: ( ( ruleComment ) )
            // InternalCls.g:5077:2: ( ruleComment )
            {
            // InternalCls.g:5077:2: ( ruleComment )
            // InternalCls.g:5078:3: ruleComment
            {
             before(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__CommentsAssignment_4_1_1"


    // $ANTLR start "rule__Interface__MembersAssignment_4_1_2"
    // InternalCls.g:5087:1: rule__Interface__MembersAssignment_4_1_2 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5091:1: ( ( ruleMember ) )
            // InternalCls.g:5092:2: ( ruleMember )
            {
            // InternalCls.g:5092:2: ( ruleMember )
            // InternalCls.g:5093:3: ruleMember
            {
             before(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_4_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__MembersAssignment_4_1_2"


    // $ANTLR start "rule__Attribute__VisibilityAssignment_1"
    // InternalCls.g:5102:1: rule__Attribute__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5106:1: ( ( ruleVisibility ) )
            // InternalCls.g:5107:2: ( ruleVisibility )
            {
            // InternalCls.g:5107:2: ( ruleVisibility )
            // InternalCls.g:5108:3: ruleVisibility
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
    // InternalCls.g:5117:1: rule__Attribute__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5121:1: ( ( ( 'static' ) ) )
            // InternalCls.g:5122:2: ( ( 'static' ) )
            {
            // InternalCls.g:5122:2: ( ( 'static' ) )
            // InternalCls.g:5123:3: ( 'static' )
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:5124:3: ( 'static' )
            // InternalCls.g:5125:4: 'static'
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
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


    // $ANTLR start "rule__Attribute__NameAssignment_3"
    // InternalCls.g:5136:1: rule__Attribute__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5140:1: ( ( RULE_ID ) )
            // InternalCls.g:5141:2: ( RULE_ID )
            {
            // InternalCls.g:5141:2: ( RULE_ID )
            // InternalCls.g:5142:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_3"


    // $ANTLR start "rule__Attribute__TypeAssignment_5"
    // InternalCls.g:5151:1: rule__Attribute__TypeAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5155:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5156:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:5156:2: ( ( ruleFQN ) )
            // InternalCls.g:5157:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getTypeClassifierCrossReference_5_0()); 
            // InternalCls.g:5158:3: ( ruleFQN )
            // InternalCls.g:5159:4: ruleFQN
            {
             before(grammarAccess.getAttributeAccess().getTypeClassifierFQNParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeClassifierFQNParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeClassifierCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_5"


    // $ANTLR start "rule__Attribute__AppliedStereotypesAssignment_6"
    // InternalCls.g:5170:1: rule__Attribute__AppliedStereotypesAssignment_6 : ( ruleStereotypeApplication ) ;
    public final void rule__Attribute__AppliedStereotypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5174:1: ( ( ruleStereotypeApplication ) )
            // InternalCls.g:5175:2: ( ruleStereotypeApplication )
            {
            // InternalCls.g:5175:2: ( ruleStereotypeApplication )
            // InternalCls.g:5176:3: ruleStereotypeApplication
            {
             before(grammarAccess.getAttributeAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStereotypeApplication();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AppliedStereotypesAssignment_6"


    // $ANTLR start "rule__Method__VisibilityAssignment_0"
    // InternalCls.g:5185:1: rule__Method__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Method__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5189:1: ( ( ruleVisibility ) )
            // InternalCls.g:5190:2: ( ruleVisibility )
            {
            // InternalCls.g:5190:2: ( ruleVisibility )
            // InternalCls.g:5191:3: ruleVisibility
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
    // InternalCls.g:5200:1: rule__Method__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Method__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5204:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:5205:2: ( ( 'abstract' ) )
            {
            // InternalCls.g:5205:2: ( ( 'abstract' ) )
            // InternalCls.g:5206:3: ( 'abstract' )
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:5207:3: ( 'abstract' )
            // InternalCls.g:5208:4: 'abstract'
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCls.g:5219:1: rule__Method__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Method__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5223:1: ( ( ( 'static' ) ) )
            // InternalCls.g:5224:2: ( ( 'static' ) )
            {
            // InternalCls.g:5224:2: ( ( 'static' ) )
            // InternalCls.g:5225:3: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:5226:3: ( 'static' )
            // InternalCls.g:5227:4: 'static'
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
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


    // $ANTLR start "rule__Method__NameAssignment_3"
    // InternalCls.g:5238:1: rule__Method__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5242:1: ( ( RULE_ID ) )
            // InternalCls.g:5243:2: ( RULE_ID )
            {
            // InternalCls.g:5243:2: ( RULE_ID )
            // InternalCls.g:5244:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_3"


    // $ANTLR start "rule__Method__AppliedStereotypesAssignment_4"
    // InternalCls.g:5253:1: rule__Method__AppliedStereotypesAssignment_4 : ( ruleStereotypeApplication ) ;
    public final void rule__Method__AppliedStereotypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5257:1: ( ( ruleStereotypeApplication ) )
            // InternalCls.g:5258:2: ( ruleStereotypeApplication )
            {
            // InternalCls.g:5258:2: ( ruleStereotypeApplication )
            // InternalCls.g:5259:3: ruleStereotypeApplication
            {
             before(grammarAccess.getMethodAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStereotypeApplication();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__AppliedStereotypesAssignment_4"


    // $ANTLR start "rule__Method__ParametersAssignment_6_0"
    // InternalCls.g:5268:1: rule__Method__ParametersAssignment_6_0 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5272:1: ( ( ruleParameter ) )
            // InternalCls.g:5273:2: ( ruleParameter )
            {
            // InternalCls.g:5273:2: ( ruleParameter )
            // InternalCls.g:5274:3: ruleParameter
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
    // InternalCls.g:5283:1: rule__Method__ParametersAssignment_6_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5287:1: ( ( ruleParameter ) )
            // InternalCls.g:5288:2: ( ruleParameter )
            {
            // InternalCls.g:5288:2: ( ruleParameter )
            // InternalCls.g:5289:3: ruleParameter
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
    // InternalCls.g:5298:1: rule__Method__TypeAssignment_8_1 : ( ( ruleFQN ) ) ;
    public final void rule__Method__TypeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5302:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5303:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:5303:2: ( ( ruleFQN ) )
            // InternalCls.g:5304:3: ( ruleFQN )
            {
             before(grammarAccess.getMethodAccess().getTypeClassifierCrossReference_8_1_0()); 
            // InternalCls.g:5305:3: ( ruleFQN )
            // InternalCls.g:5306:4: ruleFQN
            {
             before(grammarAccess.getMethodAccess().getTypeClassifierFQNParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypeClassifierFQNParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getTypeClassifierCrossReference_8_1_0()); 

            }


            }

        }
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
    // InternalCls.g:5317:1: rule__Parameter__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Parameter__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5321:1: ( ( ruleVisibility ) )
            // InternalCls.g:5322:2: ( ruleVisibility )
            {
            // InternalCls.g:5322:2: ( ruleVisibility )
            // InternalCls.g:5323:3: ruleVisibility
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


    // $ANTLR start "rule__Parameter__AppliedStereotypesAssignment_1"
    // InternalCls.g:5332:1: rule__Parameter__AppliedStereotypesAssignment_1 : ( ruleStereotypeApplication ) ;
    public final void rule__Parameter__AppliedStereotypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5336:1: ( ( ruleStereotypeApplication ) )
            // InternalCls.g:5337:2: ( ruleStereotypeApplication )
            {
            // InternalCls.g:5337:2: ( ruleStereotypeApplication )
            // InternalCls.g:5338:3: ruleStereotypeApplication
            {
             before(grammarAccess.getParameterAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStereotypeApplication();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__AppliedStereotypesAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalCls.g:5347:1: rule__Parameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5351:1: ( ( RULE_ID ) )
            // InternalCls.g:5352:2: ( RULE_ID )
            {
            // InternalCls.g:5352:2: ( RULE_ID )
            // InternalCls.g:5353:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_4"
    // InternalCls.g:5362:1: rule__Parameter__TypeAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Parameter__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5366:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5367:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:5367:2: ( ( ruleFQN ) )
            // InternalCls.g:5368:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterAccess().getTypeClassifierCrossReference_4_0()); 
            // InternalCls.g:5369:3: ( ruleFQN )
            // InternalCls.g:5370:4: ruleFQN
            {
             before(grammarAccess.getParameterAccess().getTypeClassifierFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeClassifierFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeClassifierCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_4"


    // $ANTLR start "rule__Generalization__LeftAssignment_2"
    // InternalCls.g:5381:1: rule__Generalization__LeftAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Generalization__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5385:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5386:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:5386:2: ( ( ruleFQN ) )
            // InternalCls.g:5387:3: ( ruleFQN )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftClassifierCrossReference_2_0()); 
            // InternalCls.g:5388:3: ( ruleFQN )
            // InternalCls.g:5389:4: ruleFQN
            {
             before(grammarAccess.getGeneralizationAccess().getLeftClassifierFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getLeftClassifierFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGeneralizationAccess().getLeftClassifierCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__LeftAssignment_2"


    // $ANTLR start "rule__Generalization__RightAssignment_4"
    // InternalCls.g:5400:1: rule__Generalization__RightAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Generalization__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5404:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5405:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:5405:2: ( ( ruleFQN ) )
            // InternalCls.g:5406:3: ( ruleFQN )
            {
             before(grammarAccess.getGeneralizationAccess().getRightClassifierCrossReference_4_0()); 
            // InternalCls.g:5407:3: ( ruleFQN )
            // InternalCls.g:5408:4: ruleFQN
            {
             before(grammarAccess.getGeneralizationAccess().getRightClassifierFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getRightClassifierFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGeneralizationAccess().getRightClassifierCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__RightAssignment_4"


    // $ANTLR start "rule__Implementation__LeftAssignment_2"
    // InternalCls.g:5419:1: rule__Implementation__LeftAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Implementation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5423:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5424:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:5424:2: ( ( ruleFQN ) )
            // InternalCls.g:5425:3: ( ruleFQN )
            {
             before(grammarAccess.getImplementationAccess().getLeftClassifierCrossReference_2_0()); 
            // InternalCls.g:5426:3: ( ruleFQN )
            // InternalCls.g:5427:4: ruleFQN
            {
             before(grammarAccess.getImplementationAccess().getLeftClassifierFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getLeftClassifierFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getImplementationAccess().getLeftClassifierCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__LeftAssignment_2"


    // $ANTLR start "rule__Implementation__RightAssignment_4"
    // InternalCls.g:5438:1: rule__Implementation__RightAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Implementation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5442:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5443:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:5443:2: ( ( ruleFQN ) )
            // InternalCls.g:5444:3: ( ruleFQN )
            {
             before(grammarAccess.getImplementationAccess().getRightClassifierCrossReference_4_0()); 
            // InternalCls.g:5445:3: ( ruleFQN )
            // InternalCls.g:5446:4: ruleFQN
            {
             before(grammarAccess.getImplementationAccess().getRightClassifierFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getRightClassifierFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getImplementationAccess().getRightClassifierCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__RightAssignment_4"


    // $ANTLR start "rule__XtextAssociation__TwoSideBidirectionalityAssignment_0"
    // InternalCls.g:5457:1: rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 : ( ( 'bi' ) ) ;
    public final void rule__XtextAssociation__TwoSideBidirectionalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5461:1: ( ( ( 'bi' ) ) )
            // InternalCls.g:5462:2: ( ( 'bi' ) )
            {
            // InternalCls.g:5462:2: ( ( 'bi' ) )
            // InternalCls.g:5463:3: ( 'bi' )
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityBiKeyword_0_0()); 
            // InternalCls.g:5464:3: ( 'bi' )
            // InternalCls.g:5465:4: 'bi'
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityBiKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityBiKeyword_0_0()); 

            }

             after(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityBiKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__TwoSideBidirectionalityAssignment_0"


    // $ANTLR start "rule__XtextAssociation__TwoSideAggregationKindAssignment_1"
    // InternalCls.g:5476:1: rule__XtextAssociation__TwoSideAggregationKindAssignment_1 : ( ruleAggregationKind ) ;
    public final void rule__XtextAssociation__TwoSideAggregationKindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5480:1: ( ( ruleAggregationKind ) )
            // InternalCls.g:5481:2: ( ruleAggregationKind )
            {
            // InternalCls.g:5481:2: ( ruleAggregationKind )
            // InternalCls.g:5482:3: ruleAggregationKind
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideAggregationKindAggregationKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregationKind();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getTwoSideAggregationKindAggregationKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__TwoSideAggregationKindAssignment_1"


    // $ANTLR start "rule__XtextAssociation__NameAssignment_2"
    // InternalCls.g:5491:1: rule__XtextAssociation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XtextAssociation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5495:1: ( ( RULE_ID ) )
            // InternalCls.g:5496:2: ( RULE_ID )
            {
            // InternalCls.g:5496:2: ( RULE_ID )
            // InternalCls.g:5497:3: RULE_ID
            {
             before(grammarAccess.getXtextAssociationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__NameAssignment_2"


    // $ANTLR start "rule__XtextAssociation__AppliedStereotypesAssignment_3"
    // InternalCls.g:5506:1: rule__XtextAssociation__AppliedStereotypesAssignment_3 : ( ruleStereotypeApplication ) ;
    public final void rule__XtextAssociation__AppliedStereotypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5510:1: ( ( ruleStereotypeApplication ) )
            // InternalCls.g:5511:2: ( ruleStereotypeApplication )
            {
            // InternalCls.g:5511:2: ( ruleStereotypeApplication )
            // InternalCls.g:5512:3: ruleStereotypeApplication
            {
             before(grammarAccess.getXtextAssociationAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStereotypeApplication();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getAppliedStereotypesStereotypeApplicationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__AppliedStereotypesAssignment_3"


    // $ANTLR start "rule__XtextAssociation__MemberEndTypesAssignment_5"
    // InternalCls.g:5521:1: rule__XtextAssociation__MemberEndTypesAssignment_5 : ( ruleXtextAssociationMemberEndReferencedType ) ;
    public final void rule__XtextAssociation__MemberEndTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5525:1: ( ( ruleXtextAssociationMemberEndReferencedType ) )
            // InternalCls.g:5526:2: ( ruleXtextAssociationMemberEndReferencedType )
            {
            // InternalCls.g:5526:2: ( ruleXtextAssociationMemberEndReferencedType )
            // InternalCls.g:5527:3: ruleXtextAssociationMemberEndReferencedType
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleXtextAssociationMemberEndReferencedType();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndTypesAssignment_5"


    // $ANTLR start "rule__XtextAssociation__MemberEndTypesAssignment_6_1"
    // InternalCls.g:5536:1: rule__XtextAssociation__MemberEndTypesAssignment_6_1 : ( ruleXtextAssociationMemberEndReferencedType ) ;
    public final void rule__XtextAssociation__MemberEndTypesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5540:1: ( ( ruleXtextAssociationMemberEndReferencedType ) )
            // InternalCls.g:5541:2: ( ruleXtextAssociationMemberEndReferencedType )
            {
            // InternalCls.g:5541:2: ( ruleXtextAssociationMemberEndReferencedType )
            // InternalCls.g:5542:3: ruleXtextAssociationMemberEndReferencedType
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXtextAssociationMemberEndReferencedType();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndTypesAssignment_6_1"


    // $ANTLR start "rule__XtextAssociation__MemberEndNamesAssignment_8_2"
    // InternalCls.g:5551:1: rule__XtextAssociation__MemberEndNamesAssignment_8_2 : ( ruleRoleName ) ;
    public final void rule__XtextAssociation__MemberEndNamesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5555:1: ( ( ruleRoleName ) )
            // InternalCls.g:5556:2: ( ruleRoleName )
            {
            // InternalCls.g:5556:2: ( ruleRoleName )
            // InternalCls.g:5557:3: ruleRoleName
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleName();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndNamesAssignment_8_2"


    // $ANTLR start "rule__XtextAssociation__MemberEndNamesAssignment_8_3_1"
    // InternalCls.g:5566:1: rule__XtextAssociation__MemberEndNamesAssignment_8_3_1 : ( ruleRoleName ) ;
    public final void rule__XtextAssociation__MemberEndNamesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5570:1: ( ( ruleRoleName ) )
            // InternalCls.g:5571:2: ( ruleRoleName )
            {
            // InternalCls.g:5571:2: ( ruleRoleName )
            // InternalCls.g:5572:3: ruleRoleName
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleName();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndNamesAssignment_8_3_1"


    // $ANTLR start "rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2"
    // InternalCls.g:5581:1: rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2 : ( ruleCardinality ) ;
    public final void rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5585:1: ( ( ruleCardinality ) )
            // InternalCls.g:5586:2: ( ruleCardinality )
            {
            // InternalCls.g:5586:2: ( ruleCardinality )
            // InternalCls.g:5587:3: ruleCardinality
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_2"


    // $ANTLR start "rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1"
    // InternalCls.g:5596:1: rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1 : ( ruleCardinality ) ;
    public final void rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5600:1: ( ( ruleCardinality ) )
            // InternalCls.g:5601:2: ( ruleCardinality )
            {
            // InternalCls.g:5601:2: ( ruleCardinality )
            // InternalCls.g:5602:3: ruleCardinality
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndCardinalitiesAssignment_9_3_1"


    // $ANTLR start "rule__XtextAssociation__CommentsAssignment_10"
    // InternalCls.g:5611:1: rule__XtextAssociation__CommentsAssignment_10 : ( ruleComment ) ;
    public final void rule__XtextAssociation__CommentsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5615:1: ( ( ruleComment ) )
            // InternalCls.g:5616:2: ( ruleComment )
            {
            // InternalCls.g:5616:2: ( ruleComment )
            // InternalCls.g:5617:3: ruleComment
            {
             before(grammarAccess.getXtextAssociationAccess().getCommentsCommentParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getCommentsCommentParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__CommentsAssignment_10"


    // $ANTLR start "rule__XtextAssociationMemberEndReferencedType__TypeAssignment"
    // InternalCls.g:5626:1: rule__XtextAssociationMemberEndReferencedType__TypeAssignment : ( ( ruleFQN ) ) ;
    public final void rule__XtextAssociationMemberEndReferencedType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5630:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5631:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:5631:2: ( ( ruleFQN ) )
            // InternalCls.g:5632:3: ( ruleFQN )
            {
             before(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeClassifierCrossReference_0()); 
            // InternalCls.g:5633:3: ( ruleFQN )
            // InternalCls.g:5634:4: ruleFQN
            {
             before(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeClassifierFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeClassifierFQNParserRuleCall_0_1()); 

            }

             after(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeClassifierCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociationMemberEndReferencedType__TypeAssignment"


    // $ANTLR start "rule__Comment__BodyAssignment_1"
    // InternalCls.g:5645:1: rule__Comment__BodyAssignment_1 : ( ruleCommentBody ) ;
    public final void rule__Comment__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5649:1: ( ( ruleCommentBody ) )
            // InternalCls.g:5650:2: ( ruleCommentBody )
            {
            // InternalCls.g:5650:2: ( ruleCommentBody )
            // InternalCls.g:5651:3: ruleCommentBody
            {
             before(grammarAccess.getCommentAccess().getBodyCommentBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommentBody();

            state._fsp--;

             after(grammarAccess.getCommentAccess().getBodyCommentBodyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__BodyAssignment_1"


    // $ANTLR start "rule__Cardinality__LowerBoundAssignment_0"
    // InternalCls.g:5660:1: rule__Cardinality__LowerBoundAssignment_0 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5664:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:5665:2: ( ruleCardinalityBound )
            {
            // InternalCls.g:5665:2: ( ruleCardinalityBound )
            // InternalCls.g:5666:3: ruleCardinalityBound
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
    // InternalCls.g:5675:1: rule__Cardinality__UpperBoundAssignment_1_1 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__UpperBoundAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5679:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:5680:2: ( ruleCardinalityBound )
            {
            // InternalCls.g:5680:2: ( ruleCardinalityBound )
            // InternalCls.g:5681:3: ruleCardinalityBound
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


    // $ANTLR start "rule__StereotypeApplication__StereotypeAssignment_1"
    // InternalCls.g:5690:1: rule__StereotypeApplication__StereotypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__StereotypeApplication__StereotypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5694:1: ( ( RULE_ID ) )
            // InternalCls.g:5695:2: ( RULE_ID )
            {
            // InternalCls.g:5695:2: ( RULE_ID )
            // InternalCls.g:5696:3: RULE_ID
            {
             before(grammarAccess.getStereotypeApplicationAccess().getStereotypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStereotypeApplicationAccess().getStereotypeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__StereotypeAssignment_1"


    // $ANTLR start "rule__StereotypeApplication__ValuesAssignment_3_1"
    // InternalCls.g:5705:1: rule__StereotypeApplication__ValuesAssignment_3_1 : ( ruleTaggedValue ) ;
    public final void rule__StereotypeApplication__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5709:1: ( ( ruleTaggedValue ) )
            // InternalCls.g:5710:2: ( ruleTaggedValue )
            {
            // InternalCls.g:5710:2: ( ruleTaggedValue )
            // InternalCls.g:5711:3: ruleTaggedValue
            {
             before(grammarAccess.getStereotypeApplicationAccess().getValuesTaggedValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaggedValue();

            state._fsp--;

             after(grammarAccess.getStereotypeApplicationAccess().getValuesTaggedValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__ValuesAssignment_3_1"


    // $ANTLR start "rule__StereotypeApplication__ValuesAssignment_3_2_1"
    // InternalCls.g:5720:1: rule__StereotypeApplication__ValuesAssignment_3_2_1 : ( ruleTaggedValue ) ;
    public final void rule__StereotypeApplication__ValuesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5724:1: ( ( ruleTaggedValue ) )
            // InternalCls.g:5725:2: ( ruleTaggedValue )
            {
            // InternalCls.g:5725:2: ( ruleTaggedValue )
            // InternalCls.g:5726:3: ruleTaggedValue
            {
             before(grammarAccess.getStereotypeApplicationAccess().getValuesTaggedValueParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaggedValue();

            state._fsp--;

             after(grammarAccess.getStereotypeApplicationAccess().getValuesTaggedValueParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StereotypeApplication__ValuesAssignment_3_2_1"


    // $ANTLR start "rule__TaggedValue__NameAssignment_0"
    // InternalCls.g:5735:1: rule__TaggedValue__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TaggedValue__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5739:1: ( ( RULE_STRING ) )
            // InternalCls.g:5740:2: ( RULE_STRING )
            {
            // InternalCls.g:5740:2: ( RULE_STRING )
            // InternalCls.g:5741:3: RULE_STRING
            {
             before(grammarAccess.getTaggedValueAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaggedValueAccess().getNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaggedValue__NameAssignment_0"


    // $ANTLR start "rule__TaggedValue__ValueAssignment_2"
    // InternalCls.g:5750:1: rule__TaggedValue__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TaggedValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5754:1: ( ( RULE_STRING ) )
            // InternalCls.g:5755:2: ( RULE_STRING )
            {
            // InternalCls.g:5755:2: ( RULE_STRING )
            // InternalCls.g:5756:3: RULE_STRING
            {
             before(grammarAccess.getTaggedValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaggedValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaggedValue__ValueAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\17\7\41\2\uffff";
    static final String dfa_3s = "\10\60\2\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\13\uffff\1\10\1\uffff\1\11\14\uffff\1\10",
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
            return "684:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\11\6\1\10\2\uffff";
    static final String dfa_9s = "\10\61\1\6\1\45\2\uffff";
    static final String dfa_10s = "\12\uffff\1\2\1\1";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\11\10\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\32\uffff\1\12\1\10",
            "\1\11\51\uffff\1\12\1\10",
            "\1\11\51\uffff\1\12\1\10",
            "\1\11\51\uffff\1\12\1\10",
            "\1\11\51\uffff\1\12\1\10",
            "\1\11\51\uffff\1\12\1\10",
            "\1\11\51\uffff\1\12\1\10",
            "\1\11\51\uffff\1\12\1\10",
            "\1\11",
            "\1\12\33\uffff\1\13\1\12",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "789:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0005030A91FF8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001000A003F8002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0004030001C00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0005030AD1FF8000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00010002003F8000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400020000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00034000403F8040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00030000003F8042L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000A003F8000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00020000003F8040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00030000003F8040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000040003F8140L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000003F8142L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000003F8140L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000001C00000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000640000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000101000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008040000000L});

}