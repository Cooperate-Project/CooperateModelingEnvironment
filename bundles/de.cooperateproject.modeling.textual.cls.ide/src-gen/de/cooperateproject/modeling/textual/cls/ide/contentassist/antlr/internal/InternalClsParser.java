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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_UNDERSCORE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'asc'", "'agg'", "'com'", "'@start-clsd'", "'@end-clsd'", "'rootPackage'", "'package'", "'{'", "'}'", "'import'", "'.'", "'class'", "'as'", "'interface'", "':'", "'('", "')'", "','", "'isa'", "'impl'", "'role'", "'['", "']'", "'card'", "'note'", "'..'", "'abstract'", "'static'", "'bi'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_UNDERSCORE=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int T__48=48;
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


    // $ANTLR start "entryRuleRoleName"
    // InternalCls.g:578:1: entryRuleRoleName : ruleRoleName EOF ;
    public final void entryRuleRoleName() throws RecognitionException {
        try {
            // InternalCls.g:579:1: ( ruleRoleName EOF )
            // InternalCls.g:580:1: ruleRoleName EOF
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
    // InternalCls.g:587:1: ruleRoleName : ( ( rule__RoleName__Alternatives ) ) ;
    public final void ruleRoleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:591:2: ( ( ( rule__RoleName__Alternatives ) ) )
            // InternalCls.g:592:2: ( ( rule__RoleName__Alternatives ) )
            {
            // InternalCls.g:592:2: ( ( rule__RoleName__Alternatives ) )
            // InternalCls.g:593:3: ( rule__RoleName__Alternatives )
            {
             before(grammarAccess.getRoleNameAccess().getAlternatives()); 
            // InternalCls.g:594:3: ( rule__RoleName__Alternatives )
            // InternalCls.g:594:4: rule__RoleName__Alternatives
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
    // InternalCls.g:603:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:607:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalCls.g:608:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalCls.g:608:2: ( ( rule__Visibility__Alternatives ) )
            // InternalCls.g:609:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalCls.g:610:3: ( rule__Visibility__Alternatives )
            // InternalCls.g:610:4: rule__Visibility__Alternatives
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
    // InternalCls.g:619:1: ruleAggregationKind : ( ( rule__AggregationKind__Alternatives ) ) ;
    public final void ruleAggregationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:623:1: ( ( ( rule__AggregationKind__Alternatives ) ) )
            // InternalCls.g:624:2: ( ( rule__AggregationKind__Alternatives ) )
            {
            // InternalCls.g:624:2: ( ( rule__AggregationKind__Alternatives ) )
            // InternalCls.g:625:3: ( rule__AggregationKind__Alternatives )
            {
             before(grammarAccess.getAggregationKindAccess().getAlternatives()); 
            // InternalCls.g:626:3: ( rule__AggregationKind__Alternatives )
            // InternalCls.g:626:4: rule__AggregationKind__Alternatives
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
    // InternalCls.g:634:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );
    public final void rule__Classifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:638:1: ( ( ruleClass ) | ( ruleInterface ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCls.g:639:2: ( ruleClass )
                    {
                    // InternalCls.g:639:2: ( ruleClass )
                    // InternalCls.g:640:3: ruleClass
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
                    // InternalCls.g:645:2: ( ruleInterface )
                    {
                    // InternalCls.g:645:2: ( ruleInterface )
                    // InternalCls.g:646:3: ruleInterface
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
    // InternalCls.g:655:1: rule__Class__Alternatives_3 : ( ( ( rule__Class__NameAssignment_3_0 ) ) | ( ( rule__Class__Group_3_1__0 ) ) );
    public final void rule__Class__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:659:1: ( ( ( rule__Class__NameAssignment_3_0 ) ) | ( ( rule__Class__Group_3_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=13 && LA2_1<=22)||LA2_1==24||(LA2_1>=26 && LA2_1<=28)||LA2_1==31||LA2_1==33||(LA2_1>=38 && LA2_1<=39)||LA2_1==44||LA2_1==46||LA2_1==48) ) {
                    alt2=1;
                }
                else if ( (LA2_1==32) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCls.g:660:2: ( ( rule__Class__NameAssignment_3_0 ) )
                    {
                    // InternalCls.g:660:2: ( ( rule__Class__NameAssignment_3_0 ) )
                    // InternalCls.g:661:3: ( rule__Class__NameAssignment_3_0 )
                    {
                     before(grammarAccess.getClassAccess().getNameAssignment_3_0()); 
                    // InternalCls.g:662:3: ( rule__Class__NameAssignment_3_0 )
                    // InternalCls.g:662:4: rule__Class__NameAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__NameAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getNameAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:666:2: ( ( rule__Class__Group_3_1__0 ) )
                    {
                    // InternalCls.g:666:2: ( ( rule__Class__Group_3_1__0 ) )
                    // InternalCls.g:667:3: ( rule__Class__Group_3_1__0 )
                    {
                     before(grammarAccess.getClassAccess().getGroup_3_1()); 
                    // InternalCls.g:668:3: ( rule__Class__Group_3_1__0 )
                    // InternalCls.g:668:4: rule__Class__Group_3_1__0
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


    // $ANTLR start "rule__Class__Alternatives_4"
    // InternalCls.g:676:1: rule__Class__Alternatives_4 : ( ( ( rule__Class__CommentsAssignment_4_0 )? ) | ( ( rule__Class__Group_4_1__0 ) ) );
    public final void rule__Class__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:680:1: ( ( ( rule__Class__CommentsAssignment_4_0 )? ) | ( ( rule__Class__Group_4_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOF||(LA4_0>=13 && LA4_0<=22)||LA4_0==24||LA4_0==26||LA4_0==28||LA4_0==31||LA4_0==33||(LA4_0>=38 && LA4_0<=39)||LA4_0==44||LA4_0==46||LA4_0==48) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCls.g:681:2: ( ( rule__Class__CommentsAssignment_4_0 )? )
                    {
                    // InternalCls.g:681:2: ( ( rule__Class__CommentsAssignment_4_0 )? )
                    // InternalCls.g:682:3: ( rule__Class__CommentsAssignment_4_0 )?
                    {
                     before(grammarAccess.getClassAccess().getCommentsAssignment_4_0()); 
                    // InternalCls.g:683:3: ( rule__Class__CommentsAssignment_4_0 )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==44) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalCls.g:683:4: rule__Class__CommentsAssignment_4_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Class__CommentsAssignment_4_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getClassAccess().getCommentsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:687:2: ( ( rule__Class__Group_4_1__0 ) )
                    {
                    // InternalCls.g:687:2: ( ( rule__Class__Group_4_1__0 ) )
                    // InternalCls.g:688:3: ( rule__Class__Group_4_1__0 )
                    {
                     before(grammarAccess.getClassAccess().getGroup_4_1()); 
                    // InternalCls.g:689:3: ( rule__Class__Group_4_1__0 )
                    // InternalCls.g:689:4: rule__Class__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Class__Alternatives_4"


    // $ANTLR start "rule__Interface__Alternatives_2"
    // InternalCls.g:697:1: rule__Interface__Alternatives_2 : ( ( ( rule__Interface__NameAssignment_2_0 ) ) | ( ( rule__Interface__Group_2_1__0 ) ) );
    public final void rule__Interface__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:701:1: ( ( ( rule__Interface__NameAssignment_2_0 ) ) | ( ( rule__Interface__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=13 && LA5_1<=22)||LA5_1==24||(LA5_1>=26 && LA5_1<=28)||LA5_1==31||LA5_1==33||(LA5_1>=38 && LA5_1<=39)||LA5_1==44||LA5_1==46||LA5_1==48) ) {
                    alt5=1;
                }
                else if ( (LA5_1==32) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCls.g:702:2: ( ( rule__Interface__NameAssignment_2_0 ) )
                    {
                    // InternalCls.g:702:2: ( ( rule__Interface__NameAssignment_2_0 ) )
                    // InternalCls.g:703:3: ( rule__Interface__NameAssignment_2_0 )
                    {
                     before(grammarAccess.getInterfaceAccess().getNameAssignment_2_0()); 
                    // InternalCls.g:704:3: ( rule__Interface__NameAssignment_2_0 )
                    // InternalCls.g:704:4: rule__Interface__NameAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__NameAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfaceAccess().getNameAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:708:2: ( ( rule__Interface__Group_2_1__0 ) )
                    {
                    // InternalCls.g:708:2: ( ( rule__Interface__Group_2_1__0 ) )
                    // InternalCls.g:709:3: ( rule__Interface__Group_2_1__0 )
                    {
                     before(grammarAccess.getInterfaceAccess().getGroup_2_1()); 
                    // InternalCls.g:710:3: ( rule__Interface__Group_2_1__0 )
                    // InternalCls.g:710:4: rule__Interface__Group_2_1__0
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


    // $ANTLR start "rule__Interface__Alternatives_3"
    // InternalCls.g:718:1: rule__Interface__Alternatives_3 : ( ( ( rule__Interface__CommentsAssignment_3_0 )? ) | ( ( rule__Interface__Group_3_1__0 ) ) );
    public final void rule__Interface__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:722:1: ( ( ( rule__Interface__CommentsAssignment_3_0 )? ) | ( ( rule__Interface__Group_3_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||(LA7_0>=13 && LA7_0<=22)||LA7_0==24||LA7_0==26||LA7_0==28||LA7_0==31||LA7_0==33||(LA7_0>=38 && LA7_0<=39)||LA7_0==44||LA7_0==46||LA7_0==48) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCls.g:723:2: ( ( rule__Interface__CommentsAssignment_3_0 )? )
                    {
                    // InternalCls.g:723:2: ( ( rule__Interface__CommentsAssignment_3_0 )? )
                    // InternalCls.g:724:3: ( rule__Interface__CommentsAssignment_3_0 )?
                    {
                     before(grammarAccess.getInterfaceAccess().getCommentsAssignment_3_0()); 
                    // InternalCls.g:725:3: ( rule__Interface__CommentsAssignment_3_0 )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==44) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCls.g:725:4: rule__Interface__CommentsAssignment_3_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Interface__CommentsAssignment_3_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getInterfaceAccess().getCommentsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:729:2: ( ( rule__Interface__Group_3_1__0 ) )
                    {
                    // InternalCls.g:729:2: ( ( rule__Interface__Group_3_1__0 ) )
                    // InternalCls.g:730:3: ( rule__Interface__Group_3_1__0 )
                    {
                     before(grammarAccess.getInterfaceAccess().getGroup_3_1()); 
                    // InternalCls.g:731:3: ( rule__Interface__Group_3_1__0 )
                    // InternalCls.g:731:4: rule__Interface__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfaceAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Interface__Alternatives_3"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalCls.g:739:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:743:1: ( ( ruleAttribute ) | ( ruleMethod ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalCls.g:744:2: ( ruleAttribute )
                    {
                    // InternalCls.g:744:2: ( ruleAttribute )
                    // InternalCls.g:745:3: ruleAttribute
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
                    // InternalCls.g:750:2: ( ruleMethod )
                    {
                    // InternalCls.g:750:2: ( ruleMethod )
                    // InternalCls.g:751:3: ruleMethod
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
    // InternalCls.g:760:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleXtextAssociation ) | ( ruleImplementation ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:764:1: ( ( ruleGeneralization ) | ( ruleXtextAssociation ) | ( ruleImplementation ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt9=1;
                }
                break;
            case 20:
            case 21:
            case 22:
            case 48:
                {
                alt9=2;
                }
                break;
            case 39:
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
                    // InternalCls.g:765:2: ( ruleGeneralization )
                    {
                    // InternalCls.g:765:2: ( ruleGeneralization )
                    // InternalCls.g:766:3: ruleGeneralization
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
                    // InternalCls.g:771:2: ( ruleXtextAssociation )
                    {
                    // InternalCls.g:771:2: ( ruleXtextAssociation )
                    // InternalCls.g:772:3: ruleXtextAssociation
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
                    // InternalCls.g:777:2: ( ruleImplementation )
                    {
                    // InternalCls.g:777:2: ( ruleImplementation )
                    // InternalCls.g:778:3: ruleImplementation
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
    // InternalCls.g:787:1: rule__CardinalityBound__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CardinalityBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:791:1: ( ( '*' ) | ( RULE_INT ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
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
                    // InternalCls.g:792:2: ( '*' )
                    {
                    // InternalCls.g:792:2: ( '*' )
                    // InternalCls.g:793:3: '*'
                    {
                     before(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:798:2: ( RULE_INT )
                    {
                    // InternalCls.g:798:2: ( RULE_INT )
                    // InternalCls.g:799:3: RULE_INT
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
    // InternalCls.g:808:1: rule__RoleName__Alternatives : ( ( RULE_ID ) | ( RULE_UNDERSCORE ) );
    public final void rule__RoleName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:812:1: ( ( RULE_ID ) | ( RULE_UNDERSCORE ) )
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
                    // InternalCls.g:813:2: ( RULE_ID )
                    {
                    // InternalCls.g:813:2: ( RULE_ID )
                    // InternalCls.g:814:3: RULE_ID
                    {
                     before(grammarAccess.getRoleNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getRoleNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:819:2: ( RULE_UNDERSCORE )
                    {
                    // InternalCls.g:819:2: ( RULE_UNDERSCORE )
                    // InternalCls.g:820:3: RULE_UNDERSCORE
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
    // InternalCls.g:829:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:833:1: ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt12=1;
                }
                break;
            case 14:
                {
                alt12=2;
                }
                break;
            case 15:
                {
                alt12=3;
                }
                break;
            case 16:
                {
                alt12=4;
                }
                break;
            case 17:
                {
                alt12=5;
                }
                break;
            case 18:
                {
                alt12=6;
                }
                break;
            case 19:
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
                    // InternalCls.g:834:2: ( ( '+' ) )
                    {
                    // InternalCls.g:834:2: ( ( '+' ) )
                    // InternalCls.g:835:3: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalCls.g:836:3: ( '+' )
                    // InternalCls.g:836:4: '+'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:840:2: ( ( 'public' ) )
                    {
                    // InternalCls.g:840:2: ( ( 'public' ) )
                    // InternalCls.g:841:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1()); 
                    // InternalCls.g:842:3: ( 'public' )
                    // InternalCls.g:842:4: 'public'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:846:2: ( ( '-' ) )
                    {
                    // InternalCls.g:846:2: ( ( '-' ) )
                    // InternalCls.g:847:3: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2()); 
                    // InternalCls.g:848:3: ( '-' )
                    // InternalCls.g:848:4: '-'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:852:2: ( ( 'private' ) )
                    {
                    // InternalCls.g:852:2: ( ( 'private' ) )
                    // InternalCls.g:853:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3()); 
                    // InternalCls.g:854:3: ( 'private' )
                    // InternalCls.g:854:4: 'private'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:858:2: ( ( '#' ) )
                    {
                    // InternalCls.g:858:2: ( ( '#' ) )
                    // InternalCls.g:859:3: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4()); 
                    // InternalCls.g:860:3: ( '#' )
                    // InternalCls.g:860:4: '#'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:864:2: ( ( 'protected' ) )
                    {
                    // InternalCls.g:864:2: ( ( 'protected' ) )
                    // InternalCls.g:865:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5()); 
                    // InternalCls.g:866:3: ( 'protected' )
                    // InternalCls.g:866:4: 'protected'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:870:2: ( ( '~' ) )
                    {
                    // InternalCls.g:870:2: ( ( '~' ) )
                    // InternalCls.g:871:3: ( '~' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6()); 
                    // InternalCls.g:872:3: ( '~' )
                    // InternalCls.g:872:4: '~'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalCls.g:880:1: rule__AggregationKind__Alternatives : ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) );
    public final void rule__AggregationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:884:1: ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 22:
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
                    // InternalCls.g:885:2: ( ( 'asc' ) )
                    {
                    // InternalCls.g:885:2: ( ( 'asc' ) )
                    // InternalCls.g:886:3: ( 'asc' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalCls.g:887:3: ( 'asc' )
                    // InternalCls.g:887:4: 'asc'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:891:2: ( ( 'agg' ) )
                    {
                    // InternalCls.g:891:2: ( ( 'agg' ) )
                    // InternalCls.g:892:3: ( 'agg' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 
                    // InternalCls.g:893:3: ( 'agg' )
                    // InternalCls.g:893:4: 'agg'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:897:2: ( ( 'com' ) )
                    {
                    // InternalCls.g:897:2: ( ( 'com' ) )
                    // InternalCls.g:898:3: ( 'com' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getCOMPOSITIONEnumLiteralDeclaration_2()); 
                    // InternalCls.g:899:3: ( 'com' )
                    // InternalCls.g:899:4: 'com'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalCls.g:907:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:911:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // InternalCls.g:912:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
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
    // InternalCls.g:919:1: rule__ClassDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:923:1: ( ( () ) )
            // InternalCls.g:924:1: ( () )
            {
            // InternalCls.g:924:1: ( () )
            // InternalCls.g:925:2: ()
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 
            // InternalCls.g:926:2: ()
            // InternalCls.g:926:3: 
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
    // InternalCls.g:934:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:938:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // InternalCls.g:939:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
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
    // InternalCls.g:946:1: rule__ClassDiagram__Group__1__Impl : ( '@start-clsd' ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:950:1: ( ( '@start-clsd' ) )
            // InternalCls.g:951:1: ( '@start-clsd' )
            {
            // InternalCls.g:951:1: ( '@start-clsd' )
            // InternalCls.g:952:2: '@start-clsd'
            {
             before(grammarAccess.getClassDiagramAccess().getStartClsdKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCls.g:961:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:965:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // InternalCls.g:966:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
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
    // InternalCls.g:973:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__TitleAssignment_2 ) ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:977:1: ( ( ( rule__ClassDiagram__TitleAssignment_2 ) ) )
            // InternalCls.g:978:1: ( ( rule__ClassDiagram__TitleAssignment_2 ) )
            {
            // InternalCls.g:978:1: ( ( rule__ClassDiagram__TitleAssignment_2 ) )
            // InternalCls.g:979:2: ( rule__ClassDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getClassDiagramAccess().getTitleAssignment_2()); 
            // InternalCls.g:980:2: ( rule__ClassDiagram__TitleAssignment_2 )
            // InternalCls.g:980:3: rule__ClassDiagram__TitleAssignment_2
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
    // InternalCls.g:988:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:992:1: ( rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 )
            // InternalCls.g:993:2: rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4
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
    // InternalCls.g:1000:1: rule__ClassDiagram__Group__3__Impl : ( ( rule__ClassDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1004:1: ( ( ( rule__ClassDiagram__RootPackageAssignment_3 ) ) )
            // InternalCls.g:1005:1: ( ( rule__ClassDiagram__RootPackageAssignment_3 ) )
            {
            // InternalCls.g:1005:1: ( ( rule__ClassDiagram__RootPackageAssignment_3 ) )
            // InternalCls.g:1006:2: ( rule__ClassDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getClassDiagramAccess().getRootPackageAssignment_3()); 
            // InternalCls.g:1007:2: ( rule__ClassDiagram__RootPackageAssignment_3 )
            // InternalCls.g:1007:3: rule__ClassDiagram__RootPackageAssignment_3
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
    // InternalCls.g:1015:1: rule__ClassDiagram__Group__4 : rule__ClassDiagram__Group__4__Impl ;
    public final void rule__ClassDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1019:1: ( rule__ClassDiagram__Group__4__Impl )
            // InternalCls.g:1020:2: rule__ClassDiagram__Group__4__Impl
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
    // InternalCls.g:1026:1: rule__ClassDiagram__Group__4__Impl : ( '@end-clsd' ) ;
    public final void rule__ClassDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1030:1: ( ( '@end-clsd' ) )
            // InternalCls.g:1031:1: ( '@end-clsd' )
            {
            // InternalCls.g:1031:1: ( '@end-clsd' )
            // InternalCls.g:1032:2: '@end-clsd'
            {
             before(grammarAccess.getClassDiagramAccess().getEndClsdKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCls.g:1042:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1046:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalCls.g:1047:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCls.g:1054:1: rule__RootPackage__Group__0__Impl : ( () ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1058:1: ( ( () ) )
            // InternalCls.g:1059:1: ( () )
            {
            // InternalCls.g:1059:1: ( () )
            // InternalCls.g:1060:2: ()
            {
             before(grammarAccess.getRootPackageAccess().getPackageAction_0()); 
            // InternalCls.g:1061:2: ()
            // InternalCls.g:1061:3: 
            {
            }

             after(grammarAccess.getRootPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group__0__Impl"


    // $ANTLR start "rule__RootPackage__Group__1"
    // InternalCls.g:1069:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1073:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalCls.g:1074:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCls.g:1081:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__Group_1__0 )? ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1085:1: ( ( ( rule__RootPackage__Group_1__0 )? ) )
            // InternalCls.g:1086:1: ( ( rule__RootPackage__Group_1__0 )? )
            {
            // InternalCls.g:1086:1: ( ( rule__RootPackage__Group_1__0 )? )
            // InternalCls.g:1087:2: ( rule__RootPackage__Group_1__0 )?
            {
             before(grammarAccess.getRootPackageAccess().getGroup_1()); 
            // InternalCls.g:1088:2: ( rule__RootPackage__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCls.g:1088:3: rule__RootPackage__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RootPackage__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootPackageAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalCls.g:1096:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1100:1: ( rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 )
            // InternalCls.g:1101:2: rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalCls.g:1108:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__PackageImportsAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1112:1: ( ( ( rule__RootPackage__PackageImportsAssignment_2 )* ) )
            // InternalCls.g:1113:1: ( ( rule__RootPackage__PackageImportsAssignment_2 )* )
            {
            // InternalCls.g:1113:1: ( ( rule__RootPackage__PackageImportsAssignment_2 )* )
            // InternalCls.g:1114:2: ( rule__RootPackage__PackageImportsAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getPackageImportsAssignment_2()); 
            // InternalCls.g:1115:2: ( rule__RootPackage__PackageImportsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCls.g:1115:3: rule__RootPackage__PackageImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RootPackage__PackageImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCls.g:1123:1: rule__RootPackage__Group__3 : rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 ;
    public final void rule__RootPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1127:1: ( rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 )
            // InternalCls.g:1128:2: rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalCls.g:1135:1: rule__RootPackage__Group__3__Impl : ( ( rule__RootPackage__ClassifiersAssignment_3 )* ) ;
    public final void rule__RootPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1139:1: ( ( ( rule__RootPackage__ClassifiersAssignment_3 )* ) )
            // InternalCls.g:1140:1: ( ( rule__RootPackage__ClassifiersAssignment_3 )* )
            {
            // InternalCls.g:1140:1: ( ( rule__RootPackage__ClassifiersAssignment_3 )* )
            // InternalCls.g:1141:2: ( rule__RootPackage__ClassifiersAssignment_3 )*
            {
             before(grammarAccess.getRootPackageAccess().getClassifiersAssignment_3()); 
            // InternalCls.g:1142:2: ( rule__RootPackage__ClassifiersAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=13 && LA16_0<=19)||LA16_0==31||LA16_0==33||LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCls.g:1142:3: rule__RootPackage__ClassifiersAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RootPackage__ClassifiersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalCls.g:1150:1: rule__RootPackage__Group__4 : rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5 ;
    public final void rule__RootPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1154:1: ( rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5 )
            // InternalCls.g:1155:2: rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalCls.g:1162:1: rule__RootPackage__Group__4__Impl : ( ( rule__RootPackage__ConnectorsAssignment_4 )* ) ;
    public final void rule__RootPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1166:1: ( ( ( rule__RootPackage__ConnectorsAssignment_4 )* ) )
            // InternalCls.g:1167:1: ( ( rule__RootPackage__ConnectorsAssignment_4 )* )
            {
            // InternalCls.g:1167:1: ( ( rule__RootPackage__ConnectorsAssignment_4 )* )
            // InternalCls.g:1168:2: ( rule__RootPackage__ConnectorsAssignment_4 )*
            {
             before(grammarAccess.getRootPackageAccess().getConnectorsAssignment_4()); 
            // InternalCls.g:1169:2: ( rule__RootPackage__ConnectorsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=20 && LA17_0<=22)||(LA17_0>=38 && LA17_0<=39)||LA17_0==48) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCls.g:1169:3: rule__RootPackage__ConnectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RootPackage__ConnectorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalCls.g:1177:1: rule__RootPackage__Group__5 : rule__RootPackage__Group__5__Impl ;
    public final void rule__RootPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1181:1: ( rule__RootPackage__Group__5__Impl )
            // InternalCls.g:1182:2: rule__RootPackage__Group__5__Impl
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
    // InternalCls.g:1188:1: rule__RootPackage__Group__5__Impl : ( ( rule__RootPackage__PackagesAssignment_5 )* ) ;
    public final void rule__RootPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1192:1: ( ( ( rule__RootPackage__PackagesAssignment_5 )* ) )
            // InternalCls.g:1193:1: ( ( rule__RootPackage__PackagesAssignment_5 )* )
            {
            // InternalCls.g:1193:1: ( ( rule__RootPackage__PackagesAssignment_5 )* )
            // InternalCls.g:1194:2: ( rule__RootPackage__PackagesAssignment_5 )*
            {
             before(grammarAccess.getRootPackageAccess().getPackagesAssignment_5()); 
            // InternalCls.g:1195:2: ( rule__RootPackage__PackagesAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCls.g:1195:3: rule__RootPackage__PackagesAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RootPackage__PackagesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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


    // $ANTLR start "rule__RootPackage__Group_1__0"
    // InternalCls.g:1204:1: rule__RootPackage__Group_1__0 : rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 ;
    public final void rule__RootPackage__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1208:1: ( rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1 )
            // InternalCls.g:1209:2: rule__RootPackage__Group_1__0__Impl rule__RootPackage__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__RootPackage__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RootPackage__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group_1__0"


    // $ANTLR start "rule__RootPackage__Group_1__0__Impl"
    // InternalCls.g:1216:1: rule__RootPackage__Group_1__0__Impl : ( 'rootPackage' ) ;
    public final void rule__RootPackage__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1220:1: ( ( 'rootPackage' ) )
            // InternalCls.g:1221:1: ( 'rootPackage' )
            {
            // InternalCls.g:1221:1: ( 'rootPackage' )
            // InternalCls.g:1222:2: 'rootPackage'
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group_1__0__Impl"


    // $ANTLR start "rule__RootPackage__Group_1__1"
    // InternalCls.g:1231:1: rule__RootPackage__Group_1__1 : rule__RootPackage__Group_1__1__Impl ;
    public final void rule__RootPackage__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1235:1: ( rule__RootPackage__Group_1__1__Impl )
            // InternalCls.g:1236:2: rule__RootPackage__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group_1__1"


    // $ANTLR start "rule__RootPackage__Group_1__1__Impl"
    // InternalCls.g:1242:1: rule__RootPackage__Group_1__1__Impl : ( ( rule__RootPackage__NameAssignment_1_1 ) ) ;
    public final void rule__RootPackage__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1246:1: ( ( ( rule__RootPackage__NameAssignment_1_1 ) ) )
            // InternalCls.g:1247:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            {
            // InternalCls.g:1247:1: ( ( rule__RootPackage__NameAssignment_1_1 ) )
            // InternalCls.g:1248:2: ( rule__RootPackage__NameAssignment_1_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1_1()); 
            // InternalCls.g:1249:2: ( rule__RootPackage__NameAssignment_1_1 )
            // InternalCls.g:1249:3: rule__RootPackage__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RootPackage__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRootPackageAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__Group_1__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // InternalCls.g:1258:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1262:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalCls.g:1263:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:1270:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1274:1: ( ( 'package' ) )
            // InternalCls.g:1275:1: ( 'package' )
            {
            // InternalCls.g:1275:1: ( 'package' )
            // InternalCls.g:1276:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCls.g:1285:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1289:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalCls.g:1290:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalCls.g:1297:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1301:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalCls.g:1302:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalCls.g:1302:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalCls.g:1303:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalCls.g:1304:2: ( rule__Package__NameAssignment_1 )
            // InternalCls.g:1304:3: rule__Package__NameAssignment_1
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
    // InternalCls.g:1312:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1316:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalCls.g:1317:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalCls.g:1324:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1328:1: ( ( '{' ) )
            // InternalCls.g:1329:1: ( '{' )
            {
            // InternalCls.g:1329:1: ( '{' )
            // InternalCls.g:1330:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCls.g:1339:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1343:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalCls.g:1344:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalCls.g:1351:1: rule__Package__Group__3__Impl : ( ( rule__Package__PackageImportsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1355:1: ( ( ( rule__Package__PackageImportsAssignment_3 )* ) )
            // InternalCls.g:1356:1: ( ( rule__Package__PackageImportsAssignment_3 )* )
            {
            // InternalCls.g:1356:1: ( ( rule__Package__PackageImportsAssignment_3 )* )
            // InternalCls.g:1357:2: ( rule__Package__PackageImportsAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getPackageImportsAssignment_3()); 
            // InternalCls.g:1358:2: ( rule__Package__PackageImportsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCls.g:1358:3: rule__Package__PackageImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Package__PackageImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalCls.g:1366:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1370:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalCls.g:1371:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalCls.g:1378:1: rule__Package__Group__4__Impl : ( ( rule__Package__ClassifiersAssignment_4 )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1382:1: ( ( ( rule__Package__ClassifiersAssignment_4 )* ) )
            // InternalCls.g:1383:1: ( ( rule__Package__ClassifiersAssignment_4 )* )
            {
            // InternalCls.g:1383:1: ( ( rule__Package__ClassifiersAssignment_4 )* )
            // InternalCls.g:1384:2: ( rule__Package__ClassifiersAssignment_4 )*
            {
             before(grammarAccess.getPackageAccess().getClassifiersAssignment_4()); 
            // InternalCls.g:1385:2: ( rule__Package__ClassifiersAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=13 && LA20_0<=19)||LA20_0==31||LA20_0==33||LA20_0==46) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCls.g:1385:3: rule__Package__ClassifiersAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Package__ClassifiersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalCls.g:1393:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1397:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalCls.g:1398:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalCls.g:1405:1: rule__Package__Group__5__Impl : ( ( rule__Package__ConnectorsAssignment_5 )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1409:1: ( ( ( rule__Package__ConnectorsAssignment_5 )* ) )
            // InternalCls.g:1410:1: ( ( rule__Package__ConnectorsAssignment_5 )* )
            {
            // InternalCls.g:1410:1: ( ( rule__Package__ConnectorsAssignment_5 )* )
            // InternalCls.g:1411:2: ( rule__Package__ConnectorsAssignment_5 )*
            {
             before(grammarAccess.getPackageAccess().getConnectorsAssignment_5()); 
            // InternalCls.g:1412:2: ( rule__Package__ConnectorsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=20 && LA21_0<=22)||(LA21_0>=38 && LA21_0<=39)||LA21_0==48) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCls.g:1412:3: rule__Package__ConnectorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Package__ConnectorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalCls.g:1420:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1424:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalCls.g:1425:2: rule__Package__Group__6__Impl rule__Package__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalCls.g:1432:1: rule__Package__Group__6__Impl : ( ( rule__Package__PackagesAssignment_6 )* ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1436:1: ( ( ( rule__Package__PackagesAssignment_6 )* ) )
            // InternalCls.g:1437:1: ( ( rule__Package__PackagesAssignment_6 )* )
            {
            // InternalCls.g:1437:1: ( ( rule__Package__PackagesAssignment_6 )* )
            // InternalCls.g:1438:2: ( rule__Package__PackagesAssignment_6 )*
            {
             before(grammarAccess.getPackageAccess().getPackagesAssignment_6()); 
            // InternalCls.g:1439:2: ( rule__Package__PackagesAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCls.g:1439:3: rule__Package__PackagesAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Package__PackagesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalCls.g:1447:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1451:1: ( rule__Package__Group__7__Impl )
            // InternalCls.g:1452:2: rule__Package__Group__7__Impl
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
    // InternalCls.g:1458:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1462:1: ( ( '}' ) )
            // InternalCls.g:1463:1: ( '}' )
            {
            // InternalCls.g:1463:1: ( '}' )
            // InternalCls.g:1464:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCls.g:1474:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1478:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // InternalCls.g:1479:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:1486:1: rule__PackageImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1490:1: ( ( 'import' ) )
            // InternalCls.g:1491:1: ( 'import' )
            {
            // InternalCls.g:1491:1: ( 'import' )
            // InternalCls.g:1492:2: 'import'
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
    // InternalCls.g:1501:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2 ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1505:1: ( rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2 )
            // InternalCls.g:1506:2: rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PackageImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageImport__Group__2();

            state._fsp--;


            }

        }
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
    // InternalCls.g:1513:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__ImportedPackageAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1517:1: ( ( ( rule__PackageImport__ImportedPackageAssignment_1 ) ) )
            // InternalCls.g:1518:1: ( ( rule__PackageImport__ImportedPackageAssignment_1 ) )
            {
            // InternalCls.g:1518:1: ( ( rule__PackageImport__ImportedPackageAssignment_1 ) )
            // InternalCls.g:1519:2: ( rule__PackageImport__ImportedPackageAssignment_1 )
            {
             before(grammarAccess.getPackageImportAccess().getImportedPackageAssignment_1()); 
            // InternalCls.g:1520:2: ( rule__PackageImport__ImportedPackageAssignment_1 )
            // InternalCls.g:1520:3: rule__PackageImport__ImportedPackageAssignment_1
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


    // $ANTLR start "rule__PackageImport__Group__2"
    // InternalCls.g:1528:1: rule__PackageImport__Group__2 : rule__PackageImport__Group__2__Impl ;
    public final void rule__PackageImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1532:1: ( rule__PackageImport__Group__2__Impl )
            // InternalCls.g:1533:2: rule__PackageImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageImport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__Group__2"


    // $ANTLR start "rule__PackageImport__Group__2__Impl"
    // InternalCls.g:1539:1: rule__PackageImport__Group__2__Impl : ( ( rule__PackageImport__CommentsAssignment_2 )? ) ;
    public final void rule__PackageImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1543:1: ( ( ( rule__PackageImport__CommentsAssignment_2 )? ) )
            // InternalCls.g:1544:1: ( ( rule__PackageImport__CommentsAssignment_2 )? )
            {
            // InternalCls.g:1544:1: ( ( rule__PackageImport__CommentsAssignment_2 )? )
            // InternalCls.g:1545:2: ( rule__PackageImport__CommentsAssignment_2 )?
            {
             before(grammarAccess.getPackageImportAccess().getCommentsAssignment_2()); 
            // InternalCls.g:1546:2: ( rule__PackageImport__CommentsAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCls.g:1546:3: rule__PackageImport__CommentsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackageImport__CommentsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageImportAccess().getCommentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__Group__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalCls.g:1555:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1559:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCls.g:1560:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalCls.g:1567:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1571:1: ( ( RULE_ID ) )
            // InternalCls.g:1572:1: ( RULE_ID )
            {
            // InternalCls.g:1572:1: ( RULE_ID )
            // InternalCls.g:1573:2: RULE_ID
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
    // InternalCls.g:1582:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1586:1: ( rule__FQN__Group__1__Impl )
            // InternalCls.g:1587:2: rule__FQN__Group__1__Impl
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
    // InternalCls.g:1593:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1597:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCls.g:1598:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCls.g:1598:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCls.g:1599:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCls.g:1600:2: ( rule__FQN__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCls.g:1600:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalCls.g:1609:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1613:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCls.g:1614:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:1621:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1625:1: ( ( '.' ) )
            // InternalCls.g:1626:1: ( '.' )
            {
            // InternalCls.g:1626:1: ( '.' )
            // InternalCls.g:1627:2: '.'
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
    // InternalCls.g:1636:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1640:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCls.g:1641:2: rule__FQN__Group_1__1__Impl
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
    // InternalCls.g:1647:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1651:1: ( ( RULE_ID ) )
            // InternalCls.g:1652:1: ( RULE_ID )
            {
            // InternalCls.g:1652:1: ( RULE_ID )
            // InternalCls.g:1653:2: RULE_ID
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
    // InternalCls.g:1663:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1667:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalCls.g:1668:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalCls.g:1675:1: rule__Class__Group__0__Impl : ( ( rule__Class__VisibilityAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1679:1: ( ( ( rule__Class__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1680:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1680:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            // InternalCls.g:1681:2: ( rule__Class__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1682:2: ( rule__Class__VisibilityAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=13 && LA25_0<=19)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:1682:3: rule__Class__VisibilityAssignment_0
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
    // InternalCls.g:1690:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1694:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalCls.g:1695:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalCls.g:1702:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1706:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalCls.g:1707:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalCls.g:1707:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalCls.g:1708:2: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalCls.g:1709:2: ( rule__Class__AbstractAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:1709:3: rule__Class__AbstractAssignment_1
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
    // InternalCls.g:1717:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1721:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalCls.g:1722:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:1729:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1733:1: ( ( 'class' ) )
            // InternalCls.g:1734:1: ( 'class' )
            {
            // InternalCls.g:1734:1: ( 'class' )
            // InternalCls.g:1735:2: 'class'
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
    // InternalCls.g:1744:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1748:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalCls.g:1749:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:1756:1: rule__Class__Group__3__Impl : ( ( rule__Class__Alternatives_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1760:1: ( ( ( rule__Class__Alternatives_3 ) ) )
            // InternalCls.g:1761:1: ( ( rule__Class__Alternatives_3 ) )
            {
            // InternalCls.g:1761:1: ( ( rule__Class__Alternatives_3 ) )
            // InternalCls.g:1762:2: ( rule__Class__Alternatives_3 )
            {
             before(grammarAccess.getClassAccess().getAlternatives_3()); 
            // InternalCls.g:1763:2: ( rule__Class__Alternatives_3 )
            // InternalCls.g:1763:3: rule__Class__Alternatives_3
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
    // InternalCls.g:1771:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1775:1: ( rule__Class__Group__4__Impl )
            // InternalCls.g:1776:2: rule__Class__Group__4__Impl
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
    // InternalCls.g:1782:1: rule__Class__Group__4__Impl : ( ( rule__Class__Alternatives_4 ) ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1786:1: ( ( ( rule__Class__Alternatives_4 ) ) )
            // InternalCls.g:1787:1: ( ( rule__Class__Alternatives_4 ) )
            {
            // InternalCls.g:1787:1: ( ( rule__Class__Alternatives_4 ) )
            // InternalCls.g:1788:2: ( rule__Class__Alternatives_4 )
            {
             before(grammarAccess.getClassAccess().getAlternatives_4()); 
            // InternalCls.g:1789:2: ( rule__Class__Alternatives_4 )
            // InternalCls.g:1789:3: rule__Class__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Class__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAlternatives_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group_3_1__0"
    // InternalCls.g:1798:1: rule__Class__Group_3_1__0 : rule__Class__Group_3_1__0__Impl rule__Class__Group_3_1__1 ;
    public final void rule__Class__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1802:1: ( rule__Class__Group_3_1__0__Impl rule__Class__Group_3_1__1 )
            // InternalCls.g:1803:2: rule__Class__Group_3_1__0__Impl rule__Class__Group_3_1__1
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
    // InternalCls.g:1810:1: rule__Class__Group_3_1__0__Impl : ( ( rule__Class__AliasAssignment_3_1_0 ) ) ;
    public final void rule__Class__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1814:1: ( ( ( rule__Class__AliasAssignment_3_1_0 ) ) )
            // InternalCls.g:1815:1: ( ( rule__Class__AliasAssignment_3_1_0 ) )
            {
            // InternalCls.g:1815:1: ( ( rule__Class__AliasAssignment_3_1_0 ) )
            // InternalCls.g:1816:2: ( rule__Class__AliasAssignment_3_1_0 )
            {
             before(grammarAccess.getClassAccess().getAliasAssignment_3_1_0()); 
            // InternalCls.g:1817:2: ( rule__Class__AliasAssignment_3_1_0 )
            // InternalCls.g:1817:3: rule__Class__AliasAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Class__AliasAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAliasAssignment_3_1_0()); 

            }


            }

        }
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
    // InternalCls.g:1825:1: rule__Class__Group_3_1__1 : rule__Class__Group_3_1__1__Impl rule__Class__Group_3_1__2 ;
    public final void rule__Class__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1829:1: ( rule__Class__Group_3_1__1__Impl rule__Class__Group_3_1__2 )
            // InternalCls.g:1830:2: rule__Class__Group_3_1__1__Impl rule__Class__Group_3_1__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalCls.g:1837:1: rule__Class__Group_3_1__1__Impl : ( 'as' ) ;
    public final void rule__Class__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1841:1: ( ( 'as' ) )
            // InternalCls.g:1842:1: ( 'as' )
            {
            // InternalCls.g:1842:1: ( 'as' )
            // InternalCls.g:1843:2: 'as'
            {
             before(grammarAccess.getClassAccess().getAsKeyword_3_1_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCls.g:1852:1: rule__Class__Group_3_1__2 : rule__Class__Group_3_1__2__Impl ;
    public final void rule__Class__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1856:1: ( rule__Class__Group_3_1__2__Impl )
            // InternalCls.g:1857:2: rule__Class__Group_3_1__2__Impl
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
    // InternalCls.g:1863:1: rule__Class__Group_3_1__2__Impl : ( ( rule__Class__NameAssignment_3_1_2 ) ) ;
    public final void rule__Class__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1867:1: ( ( ( rule__Class__NameAssignment_3_1_2 ) ) )
            // InternalCls.g:1868:1: ( ( rule__Class__NameAssignment_3_1_2 ) )
            {
            // InternalCls.g:1868:1: ( ( rule__Class__NameAssignment_3_1_2 ) )
            // InternalCls.g:1869:2: ( rule__Class__NameAssignment_3_1_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3_1_2()); 
            // InternalCls.g:1870:2: ( rule__Class__NameAssignment_3_1_2 )
            // InternalCls.g:1870:3: rule__Class__NameAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_3_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group_4_1__0"
    // InternalCls.g:1879:1: rule__Class__Group_4_1__0 : rule__Class__Group_4_1__0__Impl rule__Class__Group_4_1__1 ;
    public final void rule__Class__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1883:1: ( rule__Class__Group_4_1__0__Impl rule__Class__Group_4_1__1 )
            // InternalCls.g:1884:2: rule__Class__Group_4_1__0__Impl rule__Class__Group_4_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Class__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_1__0"


    // $ANTLR start "rule__Class__Group_4_1__0__Impl"
    // InternalCls.g:1891:1: rule__Class__Group_4_1__0__Impl : ( '{' ) ;
    public final void rule__Class__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1895:1: ( ( '{' ) )
            // InternalCls.g:1896:1: ( '{' )
            {
            // InternalCls.g:1896:1: ( '{' )
            // InternalCls.g:1897:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_1__0__Impl"


    // $ANTLR start "rule__Class__Group_4_1__1"
    // InternalCls.g:1906:1: rule__Class__Group_4_1__1 : rule__Class__Group_4_1__1__Impl rule__Class__Group_4_1__2 ;
    public final void rule__Class__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1910:1: ( rule__Class__Group_4_1__1__Impl rule__Class__Group_4_1__2 )
            // InternalCls.g:1911:2: rule__Class__Group_4_1__1__Impl rule__Class__Group_4_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Class__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_1__1"


    // $ANTLR start "rule__Class__Group_4_1__1__Impl"
    // InternalCls.g:1918:1: rule__Class__Group_4_1__1__Impl : ( ( rule__Class__CommentsAssignment_4_1_1 )? ) ;
    public final void rule__Class__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1922:1: ( ( ( rule__Class__CommentsAssignment_4_1_1 )? ) )
            // InternalCls.g:1923:1: ( ( rule__Class__CommentsAssignment_4_1_1 )? )
            {
            // InternalCls.g:1923:1: ( ( rule__Class__CommentsAssignment_4_1_1 )? )
            // InternalCls.g:1924:2: ( rule__Class__CommentsAssignment_4_1_1 )?
            {
             before(grammarAccess.getClassAccess().getCommentsAssignment_4_1_1()); 
            // InternalCls.g:1925:2: ( rule__Class__CommentsAssignment_4_1_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:1925:3: rule__Class__CommentsAssignment_4_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__CommentsAssignment_4_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getCommentsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_1__1__Impl"


    // $ANTLR start "rule__Class__Group_4_1__2"
    // InternalCls.g:1933:1: rule__Class__Group_4_1__2 : rule__Class__Group_4_1__2__Impl rule__Class__Group_4_1__3 ;
    public final void rule__Class__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1937:1: ( rule__Class__Group_4_1__2__Impl rule__Class__Group_4_1__3 )
            // InternalCls.g:1938:2: rule__Class__Group_4_1__2__Impl rule__Class__Group_4_1__3
            {
            pushFollow(FOLLOW_20);
            rule__Class__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_1__2"


    // $ANTLR start "rule__Class__Group_4_1__2__Impl"
    // InternalCls.g:1945:1: rule__Class__Group_4_1__2__Impl : ( ( rule__Class__MembersAssignment_4_1_2 )* ) ;
    public final void rule__Class__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1949:1: ( ( ( rule__Class__MembersAssignment_4_1_2 )* ) )
            // InternalCls.g:1950:1: ( ( rule__Class__MembersAssignment_4_1_2 )* )
            {
            // InternalCls.g:1950:1: ( ( rule__Class__MembersAssignment_4_1_2 )* )
            // InternalCls.g:1951:2: ( rule__Class__MembersAssignment_4_1_2 )*
            {
             before(grammarAccess.getClassAccess().getMembersAssignment_4_1_2()); 
            // InternalCls.g:1952:2: ( rule__Class__MembersAssignment_4_1_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=13 && LA28_0<=19)||(LA28_0>=46 && LA28_0<=47)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCls.g:1952:3: rule__Class__MembersAssignment_4_1_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Class__MembersAssignment_4_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMembersAssignment_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_1__2__Impl"


    // $ANTLR start "rule__Class__Group_4_1__3"
    // InternalCls.g:1960:1: rule__Class__Group_4_1__3 : rule__Class__Group_4_1__3__Impl ;
    public final void rule__Class__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1964:1: ( rule__Class__Group_4_1__3__Impl )
            // InternalCls.g:1965:2: rule__Class__Group_4_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_1__3"


    // $ANTLR start "rule__Class__Group_4_1__3__Impl"
    // InternalCls.g:1971:1: rule__Class__Group_4_1__3__Impl : ( '}' ) ;
    public final void rule__Class__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1975:1: ( ( '}' ) )
            // InternalCls.g:1976:1: ( '}' )
            {
            // InternalCls.g:1976:1: ( '}' )
            // InternalCls.g:1977:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_1_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4_1__3__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalCls.g:1987:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1991:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalCls.g:1992:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
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
    // InternalCls.g:1999:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__VisibilityAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2003:1: ( ( ( rule__Interface__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2004:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2004:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            // InternalCls.g:2005:2: ( rule__Interface__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2006:2: ( rule__Interface__VisibilityAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=13 && LA29_0<=19)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:2006:3: rule__Interface__VisibilityAssignment_0
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
    // InternalCls.g:2014:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2018:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalCls.g:2019:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:2026:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2030:1: ( ( 'interface' ) )
            // InternalCls.g:2031:1: ( 'interface' )
            {
            // InternalCls.g:2031:1: ( 'interface' )
            // InternalCls.g:2032:2: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCls.g:2041:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2045:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalCls.g:2046:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCls.g:2053:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__Alternatives_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2057:1: ( ( ( rule__Interface__Alternatives_2 ) ) )
            // InternalCls.g:2058:1: ( ( rule__Interface__Alternatives_2 ) )
            {
            // InternalCls.g:2058:1: ( ( rule__Interface__Alternatives_2 ) )
            // InternalCls.g:2059:2: ( rule__Interface__Alternatives_2 )
            {
             before(grammarAccess.getInterfaceAccess().getAlternatives_2()); 
            // InternalCls.g:2060:2: ( rule__Interface__Alternatives_2 )
            // InternalCls.g:2060:3: rule__Interface__Alternatives_2
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
    // InternalCls.g:2068:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2072:1: ( rule__Interface__Group__3__Impl )
            // InternalCls.g:2073:2: rule__Interface__Group__3__Impl
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
    // InternalCls.g:2079:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__Alternatives_3 ) ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2083:1: ( ( ( rule__Interface__Alternatives_3 ) ) )
            // InternalCls.g:2084:1: ( ( rule__Interface__Alternatives_3 ) )
            {
            // InternalCls.g:2084:1: ( ( rule__Interface__Alternatives_3 ) )
            // InternalCls.g:2085:2: ( rule__Interface__Alternatives_3 )
            {
             before(grammarAccess.getInterfaceAccess().getAlternatives_3()); 
            // InternalCls.g:2086:2: ( rule__Interface__Alternatives_3 )
            // InternalCls.g:2086:3: rule__Interface__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getAlternatives_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interface__Group_2_1__0"
    // InternalCls.g:2095:1: rule__Interface__Group_2_1__0 : rule__Interface__Group_2_1__0__Impl rule__Interface__Group_2_1__1 ;
    public final void rule__Interface__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2099:1: ( rule__Interface__Group_2_1__0__Impl rule__Interface__Group_2_1__1 )
            // InternalCls.g:2100:2: rule__Interface__Group_2_1__0__Impl rule__Interface__Group_2_1__1
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
    // InternalCls.g:2107:1: rule__Interface__Group_2_1__0__Impl : ( ( rule__Interface__AliasAssignment_2_1_0 ) ) ;
    public final void rule__Interface__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2111:1: ( ( ( rule__Interface__AliasAssignment_2_1_0 ) ) )
            // InternalCls.g:2112:1: ( ( rule__Interface__AliasAssignment_2_1_0 ) )
            {
            // InternalCls.g:2112:1: ( ( rule__Interface__AliasAssignment_2_1_0 ) )
            // InternalCls.g:2113:2: ( rule__Interface__AliasAssignment_2_1_0 )
            {
             before(grammarAccess.getInterfaceAccess().getAliasAssignment_2_1_0()); 
            // InternalCls.g:2114:2: ( rule__Interface__AliasAssignment_2_1_0 )
            // InternalCls.g:2114:3: rule__Interface__AliasAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__AliasAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getAliasAssignment_2_1_0()); 

            }


            }

        }
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
    // InternalCls.g:2122:1: rule__Interface__Group_2_1__1 : rule__Interface__Group_2_1__1__Impl rule__Interface__Group_2_1__2 ;
    public final void rule__Interface__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2126:1: ( rule__Interface__Group_2_1__1__Impl rule__Interface__Group_2_1__2 )
            // InternalCls.g:2127:2: rule__Interface__Group_2_1__1__Impl rule__Interface__Group_2_1__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalCls.g:2134:1: rule__Interface__Group_2_1__1__Impl : ( 'as' ) ;
    public final void rule__Interface__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2138:1: ( ( 'as' ) )
            // InternalCls.g:2139:1: ( 'as' )
            {
            // InternalCls.g:2139:1: ( 'as' )
            // InternalCls.g:2140:2: 'as'
            {
             before(grammarAccess.getInterfaceAccess().getAsKeyword_2_1_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCls.g:2149:1: rule__Interface__Group_2_1__2 : rule__Interface__Group_2_1__2__Impl ;
    public final void rule__Interface__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2153:1: ( rule__Interface__Group_2_1__2__Impl )
            // InternalCls.g:2154:2: rule__Interface__Group_2_1__2__Impl
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
    // InternalCls.g:2160:1: rule__Interface__Group_2_1__2__Impl : ( ( rule__Interface__NameAssignment_2_1_2 ) ) ;
    public final void rule__Interface__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2164:1: ( ( ( rule__Interface__NameAssignment_2_1_2 ) ) )
            // InternalCls.g:2165:1: ( ( rule__Interface__NameAssignment_2_1_2 ) )
            {
            // InternalCls.g:2165:1: ( ( rule__Interface__NameAssignment_2_1_2 ) )
            // InternalCls.g:2166:2: ( rule__Interface__NameAssignment_2_1_2 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2_1_2()); 
            // InternalCls.g:2167:2: ( rule__Interface__NameAssignment_2_1_2 )
            // InternalCls.g:2167:3: rule__Interface__NameAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_2_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interface__Group_3_1__0"
    // InternalCls.g:2176:1: rule__Interface__Group_3_1__0 : rule__Interface__Group_3_1__0__Impl rule__Interface__Group_3_1__1 ;
    public final void rule__Interface__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2180:1: ( rule__Interface__Group_3_1__0__Impl rule__Interface__Group_3_1__1 )
            // InternalCls.g:2181:2: rule__Interface__Group_3_1__0__Impl rule__Interface__Group_3_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Interface__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_1__0"


    // $ANTLR start "rule__Interface__Group_3_1__0__Impl"
    // InternalCls.g:2188:1: rule__Interface__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__Interface__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2192:1: ( ( '{' ) )
            // InternalCls.g:2193:1: ( '{' )
            {
            // InternalCls.g:2193:1: ( '{' )
            // InternalCls.g:2194:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_1__0__Impl"


    // $ANTLR start "rule__Interface__Group_3_1__1"
    // InternalCls.g:2203:1: rule__Interface__Group_3_1__1 : rule__Interface__Group_3_1__1__Impl rule__Interface__Group_3_1__2 ;
    public final void rule__Interface__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2207:1: ( rule__Interface__Group_3_1__1__Impl rule__Interface__Group_3_1__2 )
            // InternalCls.g:2208:2: rule__Interface__Group_3_1__1__Impl rule__Interface__Group_3_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Interface__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_1__1"


    // $ANTLR start "rule__Interface__Group_3_1__1__Impl"
    // InternalCls.g:2215:1: rule__Interface__Group_3_1__1__Impl : ( ( rule__Interface__CommentsAssignment_3_1_1 )? ) ;
    public final void rule__Interface__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2219:1: ( ( ( rule__Interface__CommentsAssignment_3_1_1 )? ) )
            // InternalCls.g:2220:1: ( ( rule__Interface__CommentsAssignment_3_1_1 )? )
            {
            // InternalCls.g:2220:1: ( ( rule__Interface__CommentsAssignment_3_1_1 )? )
            // InternalCls.g:2221:2: ( rule__Interface__CommentsAssignment_3_1_1 )?
            {
             before(grammarAccess.getInterfaceAccess().getCommentsAssignment_3_1_1()); 
            // InternalCls.g:2222:2: ( rule__Interface__CommentsAssignment_3_1_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCls.g:2222:3: rule__Interface__CommentsAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__CommentsAssignment_3_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getCommentsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_1__1__Impl"


    // $ANTLR start "rule__Interface__Group_3_1__2"
    // InternalCls.g:2230:1: rule__Interface__Group_3_1__2 : rule__Interface__Group_3_1__2__Impl rule__Interface__Group_3_1__3 ;
    public final void rule__Interface__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2234:1: ( rule__Interface__Group_3_1__2__Impl rule__Interface__Group_3_1__3 )
            // InternalCls.g:2235:2: rule__Interface__Group_3_1__2__Impl rule__Interface__Group_3_1__3
            {
            pushFollow(FOLLOW_20);
            rule__Interface__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_1__2"


    // $ANTLR start "rule__Interface__Group_3_1__2__Impl"
    // InternalCls.g:2242:1: rule__Interface__Group_3_1__2__Impl : ( ( rule__Interface__MembersAssignment_3_1_2 )* ) ;
    public final void rule__Interface__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2246:1: ( ( ( rule__Interface__MembersAssignment_3_1_2 )* ) )
            // InternalCls.g:2247:1: ( ( rule__Interface__MembersAssignment_3_1_2 )* )
            {
            // InternalCls.g:2247:1: ( ( rule__Interface__MembersAssignment_3_1_2 )* )
            // InternalCls.g:2248:2: ( rule__Interface__MembersAssignment_3_1_2 )*
            {
             before(grammarAccess.getInterfaceAccess().getMembersAssignment_3_1_2()); 
            // InternalCls.g:2249:2: ( rule__Interface__MembersAssignment_3_1_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=13 && LA31_0<=19)||(LA31_0>=46 && LA31_0<=47)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCls.g:2249:3: rule__Interface__MembersAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Interface__MembersAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getMembersAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_1__2__Impl"


    // $ANTLR start "rule__Interface__Group_3_1__3"
    // InternalCls.g:2257:1: rule__Interface__Group_3_1__3 : rule__Interface__Group_3_1__3__Impl ;
    public final void rule__Interface__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2261:1: ( rule__Interface__Group_3_1__3__Impl )
            // InternalCls.g:2262:2: rule__Interface__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_1__3"


    // $ANTLR start "rule__Interface__Group_3_1__3__Impl"
    // InternalCls.g:2268:1: rule__Interface__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__Interface__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2272:1: ( ( '}' ) )
            // InternalCls.g:2273:1: ( '}' )
            {
            // InternalCls.g:2273:1: ( '}' )
            // InternalCls.g:2274:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalCls.g:2284:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2288:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalCls.g:2289:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalCls.g:2296:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2300:1: ( ( () ) )
            // InternalCls.g:2301:1: ( () )
            {
            // InternalCls.g:2301:1: ( () )
            // InternalCls.g:2302:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalCls.g:2303:2: ()
            // InternalCls.g:2303:3: 
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
    // InternalCls.g:2311:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2315:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalCls.g:2316:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalCls.g:2323:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__VisibilityAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2327:1: ( ( ( rule__Attribute__VisibilityAssignment_1 )? ) )
            // InternalCls.g:2328:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            {
            // InternalCls.g:2328:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            // InternalCls.g:2329:2: ( rule__Attribute__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 
            // InternalCls.g:2330:2: ( rule__Attribute__VisibilityAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=13 && LA32_0<=19)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCls.g:2330:3: rule__Attribute__VisibilityAssignment_1
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
    // InternalCls.g:2338:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2342:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalCls.g:2343:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalCls.g:2350:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__StaticAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2354:1: ( ( ( rule__Attribute__StaticAssignment_2 )? ) )
            // InternalCls.g:2355:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            {
            // InternalCls.g:2355:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            // InternalCls.g:2356:2: ( rule__Attribute__StaticAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getStaticAssignment_2()); 
            // InternalCls.g:2357:2: ( rule__Attribute__StaticAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:2357:3: rule__Attribute__StaticAssignment_2
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
    // InternalCls.g:2365:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2369:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalCls.g:2370:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:2377:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2381:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // InternalCls.g:2382:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // InternalCls.g:2382:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // InternalCls.g:2383:2: ( rule__Attribute__NameAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            // InternalCls.g:2384:2: ( rule__Attribute__NameAssignment_3 )
            // InternalCls.g:2384:3: rule__Attribute__NameAssignment_3
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
    // InternalCls.g:2392:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2396:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalCls.g:2397:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:2404:1: rule__Attribute__Group__4__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2408:1: ( ( ':' ) )
            // InternalCls.g:2409:1: ( ':' )
            {
            // InternalCls.g:2409:1: ( ':' )
            // InternalCls.g:2410:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCls.g:2419:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2423:1: ( rule__Attribute__Group__5__Impl )
            // InternalCls.g:2424:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:2430:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__TypeAssignment_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2434:1: ( ( ( rule__Attribute__TypeAssignment_5 ) ) )
            // InternalCls.g:2435:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            {
            // InternalCls.g:2435:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            // InternalCls.g:2436:2: ( rule__Attribute__TypeAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 
            // InternalCls.g:2437:2: ( rule__Attribute__TypeAssignment_5 )
            // InternalCls.g:2437:3: rule__Attribute__TypeAssignment_5
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


    // $ANTLR start "rule__Method__Group__0"
    // InternalCls.g:2446:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2450:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalCls.g:2451:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_25);
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
            // InternalCls.g:2464:2: ( rule__Method__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2465:2: ( rule__Method__VisibilityAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=13 && LA34_0<=19)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCls.g:2465:3: rule__Method__VisibilityAssignment_0
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
    // InternalCls.g:2473:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2477:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalCls.g:2478:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:2485:1: rule__Method__Group__1__Impl : ( ( rule__Method__AbstractAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2489:1: ( ( ( rule__Method__AbstractAssignment_1 )? ) )
            // InternalCls.g:2490:1: ( ( rule__Method__AbstractAssignment_1 )? )
            {
            // InternalCls.g:2490:1: ( ( rule__Method__AbstractAssignment_1 )? )
            // InternalCls.g:2491:2: ( rule__Method__AbstractAssignment_1 )?
            {
             before(grammarAccess.getMethodAccess().getAbstractAssignment_1()); 
            // InternalCls.g:2492:2: ( rule__Method__AbstractAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:2492:3: rule__Method__AbstractAssignment_1
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
    // InternalCls.g:2500:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2504:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalCls.g:2505:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:2512:1: rule__Method__Group__2__Impl : ( ( rule__Method__StaticAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2516:1: ( ( ( rule__Method__StaticAssignment_2 )? ) )
            // InternalCls.g:2517:1: ( ( rule__Method__StaticAssignment_2 )? )
            {
            // InternalCls.g:2517:1: ( ( rule__Method__StaticAssignment_2 )? )
            // InternalCls.g:2518:2: ( rule__Method__StaticAssignment_2 )?
            {
             before(grammarAccess.getMethodAccess().getStaticAssignment_2()); 
            // InternalCls.g:2519:2: ( rule__Method__StaticAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCls.g:2519:3: rule__Method__StaticAssignment_2
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
    // InternalCls.g:2527:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2531:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalCls.g:2532:2: rule__Method__Group__3__Impl rule__Method__Group__4
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
    // InternalCls.g:2539:1: rule__Method__Group__3__Impl : ( ( rule__Method__NameAssignment_3 ) ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2543:1: ( ( ( rule__Method__NameAssignment_3 ) ) )
            // InternalCls.g:2544:1: ( ( rule__Method__NameAssignment_3 ) )
            {
            // InternalCls.g:2544:1: ( ( rule__Method__NameAssignment_3 ) )
            // InternalCls.g:2545:2: ( rule__Method__NameAssignment_3 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_3()); 
            // InternalCls.g:2546:2: ( rule__Method__NameAssignment_3 )
            // InternalCls.g:2546:3: rule__Method__NameAssignment_3
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
    // InternalCls.g:2554:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2558:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalCls.g:2559:2: rule__Method__Group__4__Impl rule__Method__Group__5
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
    // InternalCls.g:2566:1: rule__Method__Group__4__Impl : ( '(' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2570:1: ( ( '(' ) )
            // InternalCls.g:2571:1: ( '(' )
            {
            // InternalCls.g:2571:1: ( '(' )
            // InternalCls.g:2572:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalCls.g:2581:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2585:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalCls.g:2586:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalCls.g:2593:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )* ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2597:1: ( ( ( rule__Method__Group_5__0 )* ) )
            // InternalCls.g:2598:1: ( ( rule__Method__Group_5__0 )* )
            {
            // InternalCls.g:2598:1: ( ( rule__Method__Group_5__0 )* )
            // InternalCls.g:2599:2: ( rule__Method__Group_5__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // InternalCls.g:2600:2: ( rule__Method__Group_5__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||(LA37_0>=13 && LA37_0<=19)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalCls.g:2600:3: rule__Method__Group_5__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Method__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalCls.g:2608:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2612:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalCls.g:2613:2: rule__Method__Group__6__Impl rule__Method__Group__7
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
    // InternalCls.g:2620:1: rule__Method__Group__6__Impl : ( ')' ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2624:1: ( ( ')' ) )
            // InternalCls.g:2625:1: ( ')' )
            {
            // InternalCls.g:2625:1: ( ')' )
            // InternalCls.g:2626:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
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
    // InternalCls.g:2635:1: rule__Method__Group__7 : rule__Method__Group__7__Impl ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2639:1: ( rule__Method__Group__7__Impl )
            // InternalCls.g:2640:2: rule__Method__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:2646:1: rule__Method__Group__7__Impl : ( ( rule__Method__Group_7__0 )? ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2650:1: ( ( ( rule__Method__Group_7__0 )? ) )
            // InternalCls.g:2651:1: ( ( rule__Method__Group_7__0 )? )
            {
            // InternalCls.g:2651:1: ( ( rule__Method__Group_7__0 )? )
            // InternalCls.g:2652:2: ( rule__Method__Group_7__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_7()); 
            // InternalCls.g:2653:2: ( rule__Method__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:2653:3: rule__Method__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Method__Group_5__0"
    // InternalCls.g:2662:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2666:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // InternalCls.g:2667:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__Method__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__0"


    // $ANTLR start "rule__Method__Group_5__0__Impl"
    // InternalCls.g:2674:1: rule__Method__Group_5__0__Impl : ( ( rule__Method__ParametersAssignment_5_0 ) ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2678:1: ( ( ( rule__Method__ParametersAssignment_5_0 ) ) )
            // InternalCls.g:2679:1: ( ( rule__Method__ParametersAssignment_5_0 ) )
            {
            // InternalCls.g:2679:1: ( ( rule__Method__ParametersAssignment_5_0 ) )
            // InternalCls.g:2680:2: ( rule__Method__ParametersAssignment_5_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_5_0()); 
            // InternalCls.g:2681:2: ( rule__Method__ParametersAssignment_5_0 )
            // InternalCls.g:2681:3: rule__Method__ParametersAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__0__Impl"


    // $ANTLR start "rule__Method__Group_5__1"
    // InternalCls.g:2689:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2693:1: ( rule__Method__Group_5__1__Impl )
            // InternalCls.g:2694:2: rule__Method__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__1"


    // $ANTLR start "rule__Method__Group_5__1__Impl"
    // InternalCls.g:2700:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__Group_5_1__0 )* ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2704:1: ( ( ( rule__Method__Group_5_1__0 )* ) )
            // InternalCls.g:2705:1: ( ( rule__Method__Group_5_1__0 )* )
            {
            // InternalCls.g:2705:1: ( ( rule__Method__Group_5_1__0 )* )
            // InternalCls.g:2706:2: ( rule__Method__Group_5_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_5_1()); 
            // InternalCls.g:2707:2: ( rule__Method__Group_5_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==37) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalCls.g:2707:3: rule__Method__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Method__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__1__Impl"


    // $ANTLR start "rule__Method__Group_5_1__0"
    // InternalCls.g:2716:1: rule__Method__Group_5_1__0 : rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1 ;
    public final void rule__Method__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2720:1: ( rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1 )
            // InternalCls.g:2721:2: rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1
            {
            pushFollow(FOLLOW_31);
            rule__Method__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__0"


    // $ANTLR start "rule__Method__Group_5_1__0__Impl"
    // InternalCls.g:2728:1: rule__Method__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2732:1: ( ( ',' ) )
            // InternalCls.g:2733:1: ( ',' )
            {
            // InternalCls.g:2733:1: ( ',' )
            // InternalCls.g:2734:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_5_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__0__Impl"


    // $ANTLR start "rule__Method__Group_5_1__1"
    // InternalCls.g:2743:1: rule__Method__Group_5_1__1 : rule__Method__Group_5_1__1__Impl ;
    public final void rule__Method__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2747:1: ( rule__Method__Group_5_1__1__Impl )
            // InternalCls.g:2748:2: rule__Method__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__1"


    // $ANTLR start "rule__Method__Group_5_1__1__Impl"
    // InternalCls.g:2754:1: rule__Method__Group_5_1__1__Impl : ( ( rule__Method__ParametersAssignment_5_1_1 ) ) ;
    public final void rule__Method__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2758:1: ( ( ( rule__Method__ParametersAssignment_5_1_1 ) ) )
            // InternalCls.g:2759:1: ( ( rule__Method__ParametersAssignment_5_1_1 ) )
            {
            // InternalCls.g:2759:1: ( ( rule__Method__ParametersAssignment_5_1_1 ) )
            // InternalCls.g:2760:2: ( rule__Method__ParametersAssignment_5_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_5_1_1()); 
            // InternalCls.g:2761:2: ( rule__Method__ParametersAssignment_5_1_1 )
            // InternalCls.g:2761:3: rule__Method__ParametersAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5_1__1__Impl"


    // $ANTLR start "rule__Method__Group_7__0"
    // InternalCls.g:2770:1: rule__Method__Group_7__0 : rule__Method__Group_7__0__Impl rule__Method__Group_7__1 ;
    public final void rule__Method__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2774:1: ( rule__Method__Group_7__0__Impl rule__Method__Group_7__1 )
            // InternalCls.g:2775:2: rule__Method__Group_7__0__Impl rule__Method__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Method__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_7__0"


    // $ANTLR start "rule__Method__Group_7__0__Impl"
    // InternalCls.g:2782:1: rule__Method__Group_7__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2786:1: ( ( ':' ) )
            // InternalCls.g:2787:1: ( ':' )
            {
            // InternalCls.g:2787:1: ( ':' )
            // InternalCls.g:2788:2: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_7__0__Impl"


    // $ANTLR start "rule__Method__Group_7__1"
    // InternalCls.g:2797:1: rule__Method__Group_7__1 : rule__Method__Group_7__1__Impl ;
    public final void rule__Method__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2801:1: ( rule__Method__Group_7__1__Impl )
            // InternalCls.g:2802:2: rule__Method__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_7__1"


    // $ANTLR start "rule__Method__Group_7__1__Impl"
    // InternalCls.g:2808:1: rule__Method__Group_7__1__Impl : ( ( rule__Method__TypeAssignment_7_1 ) ) ;
    public final void rule__Method__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2812:1: ( ( ( rule__Method__TypeAssignment_7_1 ) ) )
            // InternalCls.g:2813:1: ( ( rule__Method__TypeAssignment_7_1 ) )
            {
            // InternalCls.g:2813:1: ( ( rule__Method__TypeAssignment_7_1 ) )
            // InternalCls.g:2814:2: ( rule__Method__TypeAssignment_7_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_7_1()); 
            // InternalCls.g:2815:2: ( rule__Method__TypeAssignment_7_1 )
            // InternalCls.g:2815:3: rule__Method__TypeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__TypeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_7__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalCls.g:2824:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2828:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCls.g:2829:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalCls.g:2836:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__VisibilityAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2840:1: ( ( ( rule__Parameter__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2841:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2841:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            // InternalCls.g:2842:2: ( rule__Parameter__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2843:2: ( rule__Parameter__VisibilityAssignment_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=13 && LA40_0<=19)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCls.g:2843:3: rule__Parameter__VisibilityAssignment_0
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
    // InternalCls.g:2851:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2855:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCls.g:2856:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:2863:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2867:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalCls.g:2868:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalCls.g:2868:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalCls.g:2869:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalCls.g:2870:2: ( rule__Parameter__NameAssignment_1 )
            // InternalCls.g:2870:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalCls.g:2878:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2882:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCls.g:2883:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:2890:1: rule__Parameter__Group__2__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2894:1: ( ( ':' ) )
            // InternalCls.g:2895:1: ( ':' )
            {
            // InternalCls.g:2895:1: ( ':' )
            // InternalCls.g:2896:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalCls.g:2905:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2909:1: ( rule__Parameter__Group__3__Impl )
            // InternalCls.g:2910:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:2916:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__TypeAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2920:1: ( ( ( rule__Parameter__TypeAssignment_3 ) ) )
            // InternalCls.g:2921:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            {
            // InternalCls.g:2921:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            // InternalCls.g:2922:2: ( rule__Parameter__TypeAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_3()); 
            // InternalCls.g:2923:2: ( rule__Parameter__TypeAssignment_3 )
            // InternalCls.g:2923:3: rule__Parameter__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Generalization__Group__0"
    // InternalCls.g:2932:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2936:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalCls.g:2937:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalCls.g:2944:1: rule__Generalization__Group__0__Impl : ( 'isa' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2948:1: ( ( 'isa' ) )
            // InternalCls.g:2949:1: ( 'isa' )
            {
            // InternalCls.g:2949:1: ( 'isa' )
            // InternalCls.g:2950:2: 'isa'
            {
             before(grammarAccess.getGeneralizationAccess().getIsaKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCls.g:2959:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2963:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalCls.g:2964:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:2971:1: rule__Generalization__Group__1__Impl : ( '(' ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2975:1: ( ( '(' ) )
            // InternalCls.g:2976:1: ( '(' )
            {
            // InternalCls.g:2976:1: ( '(' )
            // InternalCls.g:2977:2: '('
            {
             before(grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCls.g:2986:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2990:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalCls.g:2991:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalCls.g:2998:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__LeftAssignment_2 ) ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3002:1: ( ( ( rule__Generalization__LeftAssignment_2 ) ) )
            // InternalCls.g:3003:1: ( ( rule__Generalization__LeftAssignment_2 ) )
            {
            // InternalCls.g:3003:1: ( ( rule__Generalization__LeftAssignment_2 ) )
            // InternalCls.g:3004:2: ( rule__Generalization__LeftAssignment_2 )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssignment_2()); 
            // InternalCls.g:3005:2: ( rule__Generalization__LeftAssignment_2 )
            // InternalCls.g:3005:3: rule__Generalization__LeftAssignment_2
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
    // InternalCls.g:3013:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3017:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalCls.g:3018:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:3025:1: rule__Generalization__Group__3__Impl : ( ',' ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3029:1: ( ( ',' ) )
            // InternalCls.g:3030:1: ( ',' )
            {
            // InternalCls.g:3030:1: ( ',' )
            // InternalCls.g:3031:2: ','
            {
             before(grammarAccess.getGeneralizationAccess().getCommaKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCls.g:3040:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3044:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalCls.g:3045:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalCls.g:3052:1: rule__Generalization__Group__4__Impl : ( ( rule__Generalization__RightAssignment_4 ) ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3056:1: ( ( ( rule__Generalization__RightAssignment_4 ) ) )
            // InternalCls.g:3057:1: ( ( rule__Generalization__RightAssignment_4 ) )
            {
            // InternalCls.g:3057:1: ( ( rule__Generalization__RightAssignment_4 ) )
            // InternalCls.g:3058:2: ( rule__Generalization__RightAssignment_4 )
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssignment_4()); 
            // InternalCls.g:3059:2: ( rule__Generalization__RightAssignment_4 )
            // InternalCls.g:3059:3: rule__Generalization__RightAssignment_4
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
    // InternalCls.g:3067:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl rule__Generalization__Group__6 ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3071:1: ( rule__Generalization__Group__5__Impl rule__Generalization__Group__6 )
            // InternalCls.g:3072:2: rule__Generalization__Group__5__Impl rule__Generalization__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Generalization__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__6();

            state._fsp--;


            }

        }
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
    // InternalCls.g:3079:1: rule__Generalization__Group__5__Impl : ( ')' ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3083:1: ( ( ')' ) )
            // InternalCls.g:3084:1: ( ')' )
            {
            // InternalCls.g:3084:1: ( ')' )
            // InternalCls.g:3085:2: ')'
            {
             before(grammarAccess.getGeneralizationAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__Generalization__Group__6"
    // InternalCls.g:3094:1: rule__Generalization__Group__6 : rule__Generalization__Group__6__Impl ;
    public final void rule__Generalization__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3098:1: ( rule__Generalization__Group__6__Impl )
            // InternalCls.g:3099:2: rule__Generalization__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__6"


    // $ANTLR start "rule__Generalization__Group__6__Impl"
    // InternalCls.g:3105:1: rule__Generalization__Group__6__Impl : ( ( rule__Generalization__CommentsAssignment_6 )? ) ;
    public final void rule__Generalization__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3109:1: ( ( ( rule__Generalization__CommentsAssignment_6 )? ) )
            // InternalCls.g:3110:1: ( ( rule__Generalization__CommentsAssignment_6 )? )
            {
            // InternalCls.g:3110:1: ( ( rule__Generalization__CommentsAssignment_6 )? )
            // InternalCls.g:3111:2: ( rule__Generalization__CommentsAssignment_6 )?
            {
             before(grammarAccess.getGeneralizationAccess().getCommentsAssignment_6()); 
            // InternalCls.g:3112:2: ( rule__Generalization__CommentsAssignment_6 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCls.g:3112:3: rule__Generalization__CommentsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Generalization__CommentsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationAccess().getCommentsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__6__Impl"


    // $ANTLR start "rule__Implementation__Group__0"
    // InternalCls.g:3121:1: rule__Implementation__Group__0 : rule__Implementation__Group__0__Impl rule__Implementation__Group__1 ;
    public final void rule__Implementation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3125:1: ( rule__Implementation__Group__0__Impl rule__Implementation__Group__1 )
            // InternalCls.g:3126:2: rule__Implementation__Group__0__Impl rule__Implementation__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalCls.g:3133:1: rule__Implementation__Group__0__Impl : ( 'impl' ) ;
    public final void rule__Implementation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3137:1: ( ( 'impl' ) )
            // InternalCls.g:3138:1: ( 'impl' )
            {
            // InternalCls.g:3138:1: ( 'impl' )
            // InternalCls.g:3139:2: 'impl'
            {
             before(grammarAccess.getImplementationAccess().getImplKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCls.g:3148:1: rule__Implementation__Group__1 : rule__Implementation__Group__1__Impl rule__Implementation__Group__2 ;
    public final void rule__Implementation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3152:1: ( rule__Implementation__Group__1__Impl rule__Implementation__Group__2 )
            // InternalCls.g:3153:2: rule__Implementation__Group__1__Impl rule__Implementation__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:3160:1: rule__Implementation__Group__1__Impl : ( '(' ) ;
    public final void rule__Implementation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3164:1: ( ( '(' ) )
            // InternalCls.g:3165:1: ( '(' )
            {
            // InternalCls.g:3165:1: ( '(' )
            // InternalCls.g:3166:2: '('
            {
             before(grammarAccess.getImplementationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCls.g:3175:1: rule__Implementation__Group__2 : rule__Implementation__Group__2__Impl rule__Implementation__Group__3 ;
    public final void rule__Implementation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3179:1: ( rule__Implementation__Group__2__Impl rule__Implementation__Group__3 )
            // InternalCls.g:3180:2: rule__Implementation__Group__2__Impl rule__Implementation__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalCls.g:3187:1: rule__Implementation__Group__2__Impl : ( ( rule__Implementation__LeftAssignment_2 ) ) ;
    public final void rule__Implementation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3191:1: ( ( ( rule__Implementation__LeftAssignment_2 ) ) )
            // InternalCls.g:3192:1: ( ( rule__Implementation__LeftAssignment_2 ) )
            {
            // InternalCls.g:3192:1: ( ( rule__Implementation__LeftAssignment_2 ) )
            // InternalCls.g:3193:2: ( rule__Implementation__LeftAssignment_2 )
            {
             before(grammarAccess.getImplementationAccess().getLeftAssignment_2()); 
            // InternalCls.g:3194:2: ( rule__Implementation__LeftAssignment_2 )
            // InternalCls.g:3194:3: rule__Implementation__LeftAssignment_2
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
    // InternalCls.g:3202:1: rule__Implementation__Group__3 : rule__Implementation__Group__3__Impl rule__Implementation__Group__4 ;
    public final void rule__Implementation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3206:1: ( rule__Implementation__Group__3__Impl rule__Implementation__Group__4 )
            // InternalCls.g:3207:2: rule__Implementation__Group__3__Impl rule__Implementation__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:3214:1: rule__Implementation__Group__3__Impl : ( ',' ) ;
    public final void rule__Implementation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3218:1: ( ( ',' ) )
            // InternalCls.g:3219:1: ( ',' )
            {
            // InternalCls.g:3219:1: ( ',' )
            // InternalCls.g:3220:2: ','
            {
             before(grammarAccess.getImplementationAccess().getCommaKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCls.g:3229:1: rule__Implementation__Group__4 : rule__Implementation__Group__4__Impl rule__Implementation__Group__5 ;
    public final void rule__Implementation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3233:1: ( rule__Implementation__Group__4__Impl rule__Implementation__Group__5 )
            // InternalCls.g:3234:2: rule__Implementation__Group__4__Impl rule__Implementation__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalCls.g:3241:1: rule__Implementation__Group__4__Impl : ( ( rule__Implementation__RightAssignment_4 ) ) ;
    public final void rule__Implementation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3245:1: ( ( ( rule__Implementation__RightAssignment_4 ) ) )
            // InternalCls.g:3246:1: ( ( rule__Implementation__RightAssignment_4 ) )
            {
            // InternalCls.g:3246:1: ( ( rule__Implementation__RightAssignment_4 ) )
            // InternalCls.g:3247:2: ( rule__Implementation__RightAssignment_4 )
            {
             before(grammarAccess.getImplementationAccess().getRightAssignment_4()); 
            // InternalCls.g:3248:2: ( rule__Implementation__RightAssignment_4 )
            // InternalCls.g:3248:3: rule__Implementation__RightAssignment_4
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
    // InternalCls.g:3256:1: rule__Implementation__Group__5 : rule__Implementation__Group__5__Impl rule__Implementation__Group__6 ;
    public final void rule__Implementation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3260:1: ( rule__Implementation__Group__5__Impl rule__Implementation__Group__6 )
            // InternalCls.g:3261:2: rule__Implementation__Group__5__Impl rule__Implementation__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Implementation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Implementation__Group__6();

            state._fsp--;


            }

        }
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
    // InternalCls.g:3268:1: rule__Implementation__Group__5__Impl : ( ')' ) ;
    public final void rule__Implementation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3272:1: ( ( ')' ) )
            // InternalCls.g:3273:1: ( ')' )
            {
            // InternalCls.g:3273:1: ( ')' )
            // InternalCls.g:3274:2: ')'
            {
             before(grammarAccess.getImplementationAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__Implementation__Group__6"
    // InternalCls.g:3283:1: rule__Implementation__Group__6 : rule__Implementation__Group__6__Impl ;
    public final void rule__Implementation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3287:1: ( rule__Implementation__Group__6__Impl )
            // InternalCls.g:3288:2: rule__Implementation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Implementation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__6"


    // $ANTLR start "rule__Implementation__Group__6__Impl"
    // InternalCls.g:3294:1: rule__Implementation__Group__6__Impl : ( ( rule__Implementation__CommentsAssignment_6 )? ) ;
    public final void rule__Implementation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3298:1: ( ( ( rule__Implementation__CommentsAssignment_6 )? ) )
            // InternalCls.g:3299:1: ( ( rule__Implementation__CommentsAssignment_6 )? )
            {
            // InternalCls.g:3299:1: ( ( rule__Implementation__CommentsAssignment_6 )? )
            // InternalCls.g:3300:2: ( rule__Implementation__CommentsAssignment_6 )?
            {
             before(grammarAccess.getImplementationAccess().getCommentsAssignment_6()); 
            // InternalCls.g:3301:2: ( rule__Implementation__CommentsAssignment_6 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCls.g:3301:3: rule__Implementation__CommentsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Implementation__CommentsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImplementationAccess().getCommentsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__Group__6__Impl"


    // $ANTLR start "rule__XtextAssociation__Group__0"
    // InternalCls.g:3310:1: rule__XtextAssociation__Group__0 : rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1 ;
    public final void rule__XtextAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3314:1: ( rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1 )
            // InternalCls.g:3315:2: rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalCls.g:3322:1: rule__XtextAssociation__Group__0__Impl : ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? ) ;
    public final void rule__XtextAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3326:1: ( ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? ) )
            // InternalCls.g:3327:1: ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? )
            {
            // InternalCls.g:3327:1: ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? )
            // InternalCls.g:3328:2: ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityAssignment_0()); 
            // InternalCls.g:3329:2: ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==48) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCls.g:3329:3: rule__XtextAssociation__TwoSideBidirectionalityAssignment_0
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
    // InternalCls.g:3337:1: rule__XtextAssociation__Group__1 : rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2 ;
    public final void rule__XtextAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3341:1: ( rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2 )
            // InternalCls.g:3342:2: rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:3349:1: rule__XtextAssociation__Group__1__Impl : ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) ) ;
    public final void rule__XtextAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3353:1: ( ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) ) )
            // InternalCls.g:3354:1: ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) )
            {
            // InternalCls.g:3354:1: ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) )
            // InternalCls.g:3355:2: ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideAggregationKindAssignment_1()); 
            // InternalCls.g:3356:2: ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 )
            // InternalCls.g:3356:3: rule__XtextAssociation__TwoSideAggregationKindAssignment_1
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
    // InternalCls.g:3364:1: rule__XtextAssociation__Group__2 : rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3 ;
    public final void rule__XtextAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3368:1: ( rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3 )
            // InternalCls.g:3369:2: rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:3376:1: rule__XtextAssociation__Group__2__Impl : ( ( rule__XtextAssociation__NameAssignment_2 )? ) ;
    public final void rule__XtextAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3380:1: ( ( ( rule__XtextAssociation__NameAssignment_2 )? ) )
            // InternalCls.g:3381:1: ( ( rule__XtextAssociation__NameAssignment_2 )? )
            {
            // InternalCls.g:3381:1: ( ( rule__XtextAssociation__NameAssignment_2 )? )
            // InternalCls.g:3382:2: ( rule__XtextAssociation__NameAssignment_2 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getNameAssignment_2()); 
            // InternalCls.g:3383:2: ( rule__XtextAssociation__NameAssignment_2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCls.g:3383:3: rule__XtextAssociation__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__XtextAssociation__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

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
    // InternalCls.g:3391:1: rule__XtextAssociation__Group__3 : rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4 ;
    public final void rule__XtextAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3395:1: ( rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4 )
            // InternalCls.g:3396:2: rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalCls.g:3403:1: rule__XtextAssociation__Group__3__Impl : ( '(' ) ;
    public final void rule__XtextAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3407:1: ( ( '(' ) )
            // InternalCls.g:3408:1: ( '(' )
            {
            // InternalCls.g:3408:1: ( '(' )
            // InternalCls.g:3409:2: '('
            {
             before(grammarAccess.getXtextAssociationAccess().getLeftParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalCls.g:3418:1: rule__XtextAssociation__Group__4 : rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5 ;
    public final void rule__XtextAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3422:1: ( rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5 )
            // InternalCls.g:3423:2: rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalCls.g:3430:1: rule__XtextAssociation__Group__4__Impl : ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) ) ;
    public final void rule__XtextAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3434:1: ( ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) ) )
            // InternalCls.g:3435:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) )
            {
            // InternalCls.g:3435:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) )
            // InternalCls.g:3436:2: ( rule__XtextAssociation__MemberEndTypesAssignment_4 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_4()); 
            // InternalCls.g:3437:2: ( rule__XtextAssociation__MemberEndTypesAssignment_4 )
            // InternalCls.g:3437:3: rule__XtextAssociation__MemberEndTypesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndTypesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_4()); 

            }


            }

        }
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
    // InternalCls.g:3445:1: rule__XtextAssociation__Group__5 : rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6 ;
    public final void rule__XtextAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3449:1: ( rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6 )
            // InternalCls.g:3450:2: rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalCls.g:3457:1: rule__XtextAssociation__Group__5__Impl : ( ( rule__XtextAssociation__Group_5__0 )* ) ;
    public final void rule__XtextAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3461:1: ( ( ( rule__XtextAssociation__Group_5__0 )* ) )
            // InternalCls.g:3462:1: ( ( rule__XtextAssociation__Group_5__0 )* )
            {
            // InternalCls.g:3462:1: ( ( rule__XtextAssociation__Group_5__0 )* )
            // InternalCls.g:3463:2: ( rule__XtextAssociation__Group_5__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_5()); 
            // InternalCls.g:3464:2: ( rule__XtextAssociation__Group_5__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==37) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalCls.g:3464:3: rule__XtextAssociation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__XtextAssociation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getXtextAssociationAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalCls.g:3472:1: rule__XtextAssociation__Group__6 : rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7 ;
    public final void rule__XtextAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3476:1: ( rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7 )
            // InternalCls.g:3477:2: rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7
            {
            pushFollow(FOLLOW_36);
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
    // InternalCls.g:3484:1: rule__XtextAssociation__Group__6__Impl : ( ')' ) ;
    public final void rule__XtextAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3488:1: ( ( ')' ) )
            // InternalCls.g:3489:1: ( ')' )
            {
            // InternalCls.g:3489:1: ( ')' )
            // InternalCls.g:3490:2: ')'
            {
             before(grammarAccess.getXtextAssociationAccess().getRightParenthesisKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
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
    // InternalCls.g:3499:1: rule__XtextAssociation__Group__7 : rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8 ;
    public final void rule__XtextAssociation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3503:1: ( rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8 )
            // InternalCls.g:3504:2: rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8
            {
            pushFollow(FOLLOW_36);
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
    // InternalCls.g:3511:1: rule__XtextAssociation__Group__7__Impl : ( ( rule__XtextAssociation__Group_7__0 )? ) ;
    public final void rule__XtextAssociation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3515:1: ( ( ( rule__XtextAssociation__Group_7__0 )? ) )
            // InternalCls.g:3516:1: ( ( rule__XtextAssociation__Group_7__0 )? )
            {
            // InternalCls.g:3516:1: ( ( rule__XtextAssociation__Group_7__0 )? )
            // InternalCls.g:3517:2: ( rule__XtextAssociation__Group_7__0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_7()); 
            // InternalCls.g:3518:2: ( rule__XtextAssociation__Group_7__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCls.g:3518:3: rule__XtextAssociation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XtextAssociation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXtextAssociationAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalCls.g:3526:1: rule__XtextAssociation__Group__8 : rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9 ;
    public final void rule__XtextAssociation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3530:1: ( rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9 )
            // InternalCls.g:3531:2: rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9
            {
            pushFollow(FOLLOW_36);
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
    // InternalCls.g:3538:1: rule__XtextAssociation__Group__8__Impl : ( ( rule__XtextAssociation__Group_8__0 )? ) ;
    public final void rule__XtextAssociation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3542:1: ( ( ( rule__XtextAssociation__Group_8__0 )? ) )
            // InternalCls.g:3543:1: ( ( rule__XtextAssociation__Group_8__0 )? )
            {
            // InternalCls.g:3543:1: ( ( rule__XtextAssociation__Group_8__0 )? )
            // InternalCls.g:3544:2: ( rule__XtextAssociation__Group_8__0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_8()); 
            // InternalCls.g:3545:2: ( rule__XtextAssociation__Group_8__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==43) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCls.g:3545:3: rule__XtextAssociation__Group_8__0
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
    // InternalCls.g:3553:1: rule__XtextAssociation__Group__9 : rule__XtextAssociation__Group__9__Impl ;
    public final void rule__XtextAssociation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3557:1: ( rule__XtextAssociation__Group__9__Impl )
            // InternalCls.g:3558:2: rule__XtextAssociation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:3564:1: rule__XtextAssociation__Group__9__Impl : ( ( rule__XtextAssociation__CommentsAssignment_9 )? ) ;
    public final void rule__XtextAssociation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3568:1: ( ( ( rule__XtextAssociation__CommentsAssignment_9 )? ) )
            // InternalCls.g:3569:1: ( ( rule__XtextAssociation__CommentsAssignment_9 )? )
            {
            // InternalCls.g:3569:1: ( ( rule__XtextAssociation__CommentsAssignment_9 )? )
            // InternalCls.g:3570:2: ( rule__XtextAssociation__CommentsAssignment_9 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getCommentsAssignment_9()); 
            // InternalCls.g:3571:2: ( rule__XtextAssociation__CommentsAssignment_9 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==44) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCls.g:3571:3: rule__XtextAssociation__CommentsAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__XtextAssociation__CommentsAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXtextAssociationAccess().getCommentsAssignment_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__XtextAssociation__Group_5__0"
    // InternalCls.g:3580:1: rule__XtextAssociation__Group_5__0 : rule__XtextAssociation__Group_5__0__Impl rule__XtextAssociation__Group_5__1 ;
    public final void rule__XtextAssociation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3584:1: ( rule__XtextAssociation__Group_5__0__Impl rule__XtextAssociation__Group_5__1 )
            // InternalCls.g:3585:2: rule__XtextAssociation__Group_5__0__Impl rule__XtextAssociation__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__XtextAssociation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_5__0"


    // $ANTLR start "rule__XtextAssociation__Group_5__0__Impl"
    // InternalCls.g:3592:1: rule__XtextAssociation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__XtextAssociation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3596:1: ( ( ',' ) )
            // InternalCls.g:3597:1: ( ',' )
            {
            // InternalCls.g:3597:1: ( ',' )
            // InternalCls.g:3598:2: ','
            {
             before(grammarAccess.getXtextAssociationAccess().getCommaKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_5__0__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_5__1"
    // InternalCls.g:3607:1: rule__XtextAssociation__Group_5__1 : rule__XtextAssociation__Group_5__1__Impl ;
    public final void rule__XtextAssociation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3611:1: ( rule__XtextAssociation__Group_5__1__Impl )
            // InternalCls.g:3612:2: rule__XtextAssociation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_5__1"


    // $ANTLR start "rule__XtextAssociation__Group_5__1__Impl"
    // InternalCls.g:3618:1: rule__XtextAssociation__Group_5__1__Impl : ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) ) ;
    public final void rule__XtextAssociation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3622:1: ( ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) ) )
            // InternalCls.g:3623:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) )
            {
            // InternalCls.g:3623:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) )
            // InternalCls.g:3624:2: ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_5_1()); 
            // InternalCls.g:3625:2: ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 )
            // InternalCls.g:3625:3: rule__XtextAssociation__MemberEndTypesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndTypesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_5__1__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_7__0"
    // InternalCls.g:3634:1: rule__XtextAssociation__Group_7__0 : rule__XtextAssociation__Group_7__0__Impl rule__XtextAssociation__Group_7__1 ;
    public final void rule__XtextAssociation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3638:1: ( rule__XtextAssociation__Group_7__0__Impl rule__XtextAssociation__Group_7__1 )
            // InternalCls.g:3639:2: rule__XtextAssociation__Group_7__0__Impl rule__XtextAssociation__Group_7__1
            {
            pushFollow(FOLLOW_37);
            rule__XtextAssociation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7__0"


    // $ANTLR start "rule__XtextAssociation__Group_7__0__Impl"
    // InternalCls.g:3646:1: rule__XtextAssociation__Group_7__0__Impl : ( 'role' ) ;
    public final void rule__XtextAssociation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3650:1: ( ( 'role' ) )
            // InternalCls.g:3651:1: ( 'role' )
            {
            // InternalCls.g:3651:1: ( 'role' )
            // InternalCls.g:3652:2: 'role'
            {
             before(grammarAccess.getXtextAssociationAccess().getRoleKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getRoleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7__0__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_7__1"
    // InternalCls.g:3661:1: rule__XtextAssociation__Group_7__1 : rule__XtextAssociation__Group_7__1__Impl rule__XtextAssociation__Group_7__2 ;
    public final void rule__XtextAssociation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3665:1: ( rule__XtextAssociation__Group_7__1__Impl rule__XtextAssociation__Group_7__2 )
            // InternalCls.g:3666:2: rule__XtextAssociation__Group_7__1__Impl rule__XtextAssociation__Group_7__2
            {
            pushFollow(FOLLOW_38);
            rule__XtextAssociation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7__1"


    // $ANTLR start "rule__XtextAssociation__Group_7__1__Impl"
    // InternalCls.g:3673:1: rule__XtextAssociation__Group_7__1__Impl : ( '[' ) ;
    public final void rule__XtextAssociation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3677:1: ( ( '[' ) )
            // InternalCls.g:3678:1: ( '[' )
            {
            // InternalCls.g:3678:1: ( '[' )
            // InternalCls.g:3679:2: '['
            {
             before(grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7__1__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_7__2"
    // InternalCls.g:3688:1: rule__XtextAssociation__Group_7__2 : rule__XtextAssociation__Group_7__2__Impl rule__XtextAssociation__Group_7__3 ;
    public final void rule__XtextAssociation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3692:1: ( rule__XtextAssociation__Group_7__2__Impl rule__XtextAssociation__Group_7__3 )
            // InternalCls.g:3693:2: rule__XtextAssociation__Group_7__2__Impl rule__XtextAssociation__Group_7__3
            {
            pushFollow(FOLLOW_39);
            rule__XtextAssociation__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7__2"


    // $ANTLR start "rule__XtextAssociation__Group_7__2__Impl"
    // InternalCls.g:3700:1: rule__XtextAssociation__Group_7__2__Impl : ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) ) ;
    public final void rule__XtextAssociation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3704:1: ( ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) ) )
            // InternalCls.g:3705:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) )
            {
            // InternalCls.g:3705:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) )
            // InternalCls.g:3706:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_7_2()); 
            // InternalCls.g:3707:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 )
            // InternalCls.g:3707:3: rule__XtextAssociation__MemberEndNamesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndNamesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7__2__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_7__3"
    // InternalCls.g:3715:1: rule__XtextAssociation__Group_7__3 : rule__XtextAssociation__Group_7__3__Impl rule__XtextAssociation__Group_7__4 ;
    public final void rule__XtextAssociation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3719:1: ( rule__XtextAssociation__Group_7__3__Impl rule__XtextAssociation__Group_7__4 )
            // InternalCls.g:3720:2: rule__XtextAssociation__Group_7__3__Impl rule__XtextAssociation__Group_7__4
            {
            pushFollow(FOLLOW_39);
            rule__XtextAssociation__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7__3"


    // $ANTLR start "rule__XtextAssociation__Group_7__3__Impl"
    // InternalCls.g:3727:1: rule__XtextAssociation__Group_7__3__Impl : ( ( rule__XtextAssociation__Group_7_3__0 )* ) ;
    public final void rule__XtextAssociation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3731:1: ( ( ( rule__XtextAssociation__Group_7_3__0 )* ) )
            // InternalCls.g:3732:1: ( ( rule__XtextAssociation__Group_7_3__0 )* )
            {
            // InternalCls.g:3732:1: ( ( rule__XtextAssociation__Group_7_3__0 )* )
            // InternalCls.g:3733:2: ( rule__XtextAssociation__Group_7_3__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_7_3()); 
            // InternalCls.g:3734:2: ( rule__XtextAssociation__Group_7_3__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==37) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalCls.g:3734:3: rule__XtextAssociation__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__XtextAssociation__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getXtextAssociationAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7__3__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_7__4"
    // InternalCls.g:3742:1: rule__XtextAssociation__Group_7__4 : rule__XtextAssociation__Group_7__4__Impl ;
    public final void rule__XtextAssociation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3746:1: ( rule__XtextAssociation__Group_7__4__Impl )
            // InternalCls.g:3747:2: rule__XtextAssociation__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7__4"


    // $ANTLR start "rule__XtextAssociation__Group_7__4__Impl"
    // InternalCls.g:3753:1: rule__XtextAssociation__Group_7__4__Impl : ( ']' ) ;
    public final void rule__XtextAssociation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3757:1: ( ( ']' ) )
            // InternalCls.g:3758:1: ( ']' )
            {
            // InternalCls.g:3758:1: ( ']' )
            // InternalCls.g:3759:2: ']'
            {
             before(grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_7_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7__4__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_7_3__0"
    // InternalCls.g:3769:1: rule__XtextAssociation__Group_7_3__0 : rule__XtextAssociation__Group_7_3__0__Impl rule__XtextAssociation__Group_7_3__1 ;
    public final void rule__XtextAssociation__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3773:1: ( rule__XtextAssociation__Group_7_3__0__Impl rule__XtextAssociation__Group_7_3__1 )
            // InternalCls.g:3774:2: rule__XtextAssociation__Group_7_3__0__Impl rule__XtextAssociation__Group_7_3__1
            {
            pushFollow(FOLLOW_38);
            rule__XtextAssociation__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7_3__0"


    // $ANTLR start "rule__XtextAssociation__Group_7_3__0__Impl"
    // InternalCls.g:3781:1: rule__XtextAssociation__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__XtextAssociation__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3785:1: ( ( ',' ) )
            // InternalCls.g:3786:1: ( ',' )
            {
            // InternalCls.g:3786:1: ( ',' )
            // InternalCls.g:3787:2: ','
            {
             before(grammarAccess.getXtextAssociationAccess().getCommaKeyword_7_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7_3__0__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_7_3__1"
    // InternalCls.g:3796:1: rule__XtextAssociation__Group_7_3__1 : rule__XtextAssociation__Group_7_3__1__Impl ;
    public final void rule__XtextAssociation__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3800:1: ( rule__XtextAssociation__Group_7_3__1__Impl )
            // InternalCls.g:3801:2: rule__XtextAssociation__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7_3__1"


    // $ANTLR start "rule__XtextAssociation__Group_7_3__1__Impl"
    // InternalCls.g:3807:1: rule__XtextAssociation__Group_7_3__1__Impl : ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) ) ;
    public final void rule__XtextAssociation__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3811:1: ( ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) ) )
            // InternalCls.g:3812:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) )
            {
            // InternalCls.g:3812:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) )
            // InternalCls.g:3813:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_7_3_1()); 
            // InternalCls.g:3814:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 )
            // InternalCls.g:3814:3: rule__XtextAssociation__MemberEndNamesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndNamesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__Group_7_3__1__Impl"


    // $ANTLR start "rule__XtextAssociation__Group_8__0"
    // InternalCls.g:3823:1: rule__XtextAssociation__Group_8__0 : rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1 ;
    public final void rule__XtextAssociation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3827:1: ( rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1 )
            // InternalCls.g:3828:2: rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalCls.g:3835:1: rule__XtextAssociation__Group_8__0__Impl : ( 'card' ) ;
    public final void rule__XtextAssociation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3839:1: ( ( 'card' ) )
            // InternalCls.g:3840:1: ( 'card' )
            {
            // InternalCls.g:3840:1: ( 'card' )
            // InternalCls.g:3841:2: 'card'
            {
             before(grammarAccess.getXtextAssociationAccess().getCardKeyword_8_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getCardKeyword_8_0()); 

            }


            }

        }
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
    // InternalCls.g:3850:1: rule__XtextAssociation__Group_8__1 : rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2 ;
    public final void rule__XtextAssociation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3854:1: ( rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2 )
            // InternalCls.g:3855:2: rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalCls.g:3862:1: rule__XtextAssociation__Group_8__1__Impl : ( '[' ) ;
    public final void rule__XtextAssociation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3866:1: ( ( '[' ) )
            // InternalCls.g:3867:1: ( '[' )
            {
            // InternalCls.g:3867:1: ( '[' )
            // InternalCls.g:3868:2: '['
            {
             before(grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_8_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCls.g:3877:1: rule__XtextAssociation__Group_8__2 : rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3 ;
    public final void rule__XtextAssociation__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3881:1: ( rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3 )
            // InternalCls.g:3882:2: rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalCls.g:3889:1: rule__XtextAssociation__Group_8__2__Impl : ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) ) ;
    public final void rule__XtextAssociation__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3893:1: ( ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) ) )
            // InternalCls.g:3894:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) )
            {
            // InternalCls.g:3894:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) )
            // InternalCls.g:3895:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_8_2()); 
            // InternalCls.g:3896:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 )
            // InternalCls.g:3896:3: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_8_2()); 

            }


            }

        }
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
    // InternalCls.g:3904:1: rule__XtextAssociation__Group_8__3 : rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4 ;
    public final void rule__XtextAssociation__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3908:1: ( rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4 )
            // InternalCls.g:3909:2: rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalCls.g:3916:1: rule__XtextAssociation__Group_8__3__Impl : ( ( rule__XtextAssociation__Group_8_3__0 )* ) ;
    public final void rule__XtextAssociation__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3920:1: ( ( ( rule__XtextAssociation__Group_8_3__0 )* ) )
            // InternalCls.g:3921:1: ( ( rule__XtextAssociation__Group_8_3__0 )* )
            {
            // InternalCls.g:3921:1: ( ( rule__XtextAssociation__Group_8_3__0 )* )
            // InternalCls.g:3922:2: ( rule__XtextAssociation__Group_8_3__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_8_3()); 
            // InternalCls.g:3923:2: ( rule__XtextAssociation__Group_8_3__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==34) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalCls.g:3923:3: rule__XtextAssociation__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__XtextAssociation__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalCls.g:3931:1: rule__XtextAssociation__Group_8__4 : rule__XtextAssociation__Group_8__4__Impl ;
    public final void rule__XtextAssociation__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3935:1: ( rule__XtextAssociation__Group_8__4__Impl )
            // InternalCls.g:3936:2: rule__XtextAssociation__Group_8__4__Impl
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
    // InternalCls.g:3942:1: rule__XtextAssociation__Group_8__4__Impl : ( ']' ) ;
    public final void rule__XtextAssociation__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3946:1: ( ( ']' ) )
            // InternalCls.g:3947:1: ( ']' )
            {
            // InternalCls.g:3947:1: ( ']' )
            // InternalCls.g:3948:2: ']'
            {
             before(grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_8_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCls.g:3958:1: rule__XtextAssociation__Group_8_3__0 : rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1 ;
    public final void rule__XtextAssociation__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3962:1: ( rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1 )
            // InternalCls.g:3963:2: rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalCls.g:3970:1: rule__XtextAssociation__Group_8_3__0__Impl : ( ':' ) ;
    public final void rule__XtextAssociation__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3974:1: ( ( ':' ) )
            // InternalCls.g:3975:1: ( ':' )
            {
            // InternalCls.g:3975:1: ( ':' )
            // InternalCls.g:3976:2: ':'
            {
             before(grammarAccess.getXtextAssociationAccess().getColonKeyword_8_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getColonKeyword_8_3_0()); 

            }


            }

        }
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
    // InternalCls.g:3985:1: rule__XtextAssociation__Group_8_3__1 : rule__XtextAssociation__Group_8_3__1__Impl ;
    public final void rule__XtextAssociation__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3989:1: ( rule__XtextAssociation__Group_8_3__1__Impl )
            // InternalCls.g:3990:2: rule__XtextAssociation__Group_8_3__1__Impl
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
    // InternalCls.g:3996:1: rule__XtextAssociation__Group_8_3__1__Impl : ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) ) ;
    public final void rule__XtextAssociation__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4000:1: ( ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) ) )
            // InternalCls.g:4001:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) )
            {
            // InternalCls.g:4001:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) )
            // InternalCls.g:4002:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_8_3_1()); 
            // InternalCls.g:4003:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 )
            // InternalCls.g:4003:3: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_8_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Comment__Group__0"
    // InternalCls.g:4012:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4016:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalCls.g:4017:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
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
    // InternalCls.g:4024:1: rule__Comment__Group__0__Impl : ( 'note' ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4028:1: ( ( 'note' ) )
            // InternalCls.g:4029:1: ( 'note' )
            {
            // InternalCls.g:4029:1: ( 'note' )
            // InternalCls.g:4030:2: 'note'
            {
             before(grammarAccess.getCommentAccess().getNoteKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCls.g:4039:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4043:1: ( rule__Comment__Group__1__Impl )
            // InternalCls.g:4044:2: rule__Comment__Group__1__Impl
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
    // InternalCls.g:4050:1: rule__Comment__Group__1__Impl : ( ( rule__Comment__BodyAssignment_1 ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4054:1: ( ( ( rule__Comment__BodyAssignment_1 ) ) )
            // InternalCls.g:4055:1: ( ( rule__Comment__BodyAssignment_1 ) )
            {
            // InternalCls.g:4055:1: ( ( rule__Comment__BodyAssignment_1 ) )
            // InternalCls.g:4056:2: ( rule__Comment__BodyAssignment_1 )
            {
             before(grammarAccess.getCommentAccess().getBodyAssignment_1()); 
            // InternalCls.g:4057:2: ( rule__Comment__BodyAssignment_1 )
            // InternalCls.g:4057:3: rule__Comment__BodyAssignment_1
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
    // InternalCls.g:4066:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4070:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalCls.g:4071:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
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
    // InternalCls.g:4078:1: rule__Cardinality__Group__0__Impl : ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4082:1: ( ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) )
            // InternalCls.g:4083:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            {
            // InternalCls.g:4083:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            // InternalCls.g:4084:2: ( rule__Cardinality__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0()); 
            // InternalCls.g:4085:2: ( rule__Cardinality__LowerBoundAssignment_0 )
            // InternalCls.g:4085:3: rule__Cardinality__LowerBoundAssignment_0
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
    // InternalCls.g:4093:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4097:1: ( rule__Cardinality__Group__1__Impl )
            // InternalCls.g:4098:2: rule__Cardinality__Group__1__Impl
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
    // InternalCls.g:4104:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Group_1__0 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4108:1: ( ( ( rule__Cardinality__Group_1__0 )? ) )
            // InternalCls.g:4109:1: ( ( rule__Cardinality__Group_1__0 )? )
            {
            // InternalCls.g:4109:1: ( ( rule__Cardinality__Group_1__0 )? )
            // InternalCls.g:4110:2: ( rule__Cardinality__Group_1__0 )?
            {
             before(grammarAccess.getCardinalityAccess().getGroup_1()); 
            // InternalCls.g:4111:2: ( rule__Cardinality__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==45) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCls.g:4111:3: rule__Cardinality__Group_1__0
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
    // InternalCls.g:4120:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4124:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // InternalCls.g:4125:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalCls.g:4132:1: rule__Cardinality__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4136:1: ( ( '..' ) )
            // InternalCls.g:4137:1: ( '..' )
            {
            // InternalCls.g:4137:1: ( '..' )
            // InternalCls.g:4138:2: '..'
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
    // InternalCls.g:4147:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4151:1: ( rule__Cardinality__Group_1__1__Impl )
            // InternalCls.g:4152:2: rule__Cardinality__Group_1__1__Impl
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
    // InternalCls.g:4158:1: rule__Cardinality__Group_1__1__Impl : ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4162:1: ( ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) )
            // InternalCls.g:4163:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            {
            // InternalCls.g:4163:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            // InternalCls.g:4164:2: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1()); 
            // InternalCls.g:4165:2: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            // InternalCls.g:4165:3: rule__Cardinality__UpperBoundAssignment_1_1
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
    // InternalCls.g:4174:1: rule__ClassDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4178:1: ( ( RULE_STRING ) )
            // InternalCls.g:4179:2: ( RULE_STRING )
            {
            // InternalCls.g:4179:2: ( RULE_STRING )
            // InternalCls.g:4180:3: RULE_STRING
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
    // InternalCls.g:4189:1: rule__ClassDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__ClassDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4193:1: ( ( ruleRootPackage ) )
            // InternalCls.g:4194:2: ( ruleRootPackage )
            {
            // InternalCls.g:4194:2: ( ruleRootPackage )
            // InternalCls.g:4195:3: ruleRootPackage
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


    // $ANTLR start "rule__RootPackage__NameAssignment_1_1"
    // InternalCls.g:4204:1: rule__RootPackage__NameAssignment_1_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4208:1: ( ( ruleFQN ) )
            // InternalCls.g:4209:2: ( ruleFQN )
            {
            // InternalCls.g:4209:2: ( ruleFQN )
            // InternalCls.g:4210:3: ruleFQN
            {
             before(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootPackage__NameAssignment_1_1"


    // $ANTLR start "rule__RootPackage__PackageImportsAssignment_2"
    // InternalCls.g:4219:1: rule__RootPackage__PackageImportsAssignment_2 : ( rulePackageImport ) ;
    public final void rule__RootPackage__PackageImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4223:1: ( ( rulePackageImport ) )
            // InternalCls.g:4224:2: ( rulePackageImport )
            {
            // InternalCls.g:4224:2: ( rulePackageImport )
            // InternalCls.g:4225:3: rulePackageImport
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
    // InternalCls.g:4234:1: rule__RootPackage__ClassifiersAssignment_3 : ( ruleClassifier ) ;
    public final void rule__RootPackage__ClassifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4238:1: ( ( ruleClassifier ) )
            // InternalCls.g:4239:2: ( ruleClassifier )
            {
            // InternalCls.g:4239:2: ( ruleClassifier )
            // InternalCls.g:4240:3: ruleClassifier
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
    // InternalCls.g:4249:1: rule__RootPackage__ConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__RootPackage__ConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4253:1: ( ( ruleConnector ) )
            // InternalCls.g:4254:2: ( ruleConnector )
            {
            // InternalCls.g:4254:2: ( ruleConnector )
            // InternalCls.g:4255:3: ruleConnector
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
    // InternalCls.g:4264:1: rule__RootPackage__PackagesAssignment_5 : ( rulePackage ) ;
    public final void rule__RootPackage__PackagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4268:1: ( ( rulePackage ) )
            // InternalCls.g:4269:2: ( rulePackage )
            {
            // InternalCls.g:4269:2: ( rulePackage )
            // InternalCls.g:4270:3: rulePackage
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
    // InternalCls.g:4279:1: rule__Package__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4283:1: ( ( ruleFQN ) )
            // InternalCls.g:4284:2: ( ruleFQN )
            {
            // InternalCls.g:4284:2: ( ruleFQN )
            // InternalCls.g:4285:3: ruleFQN
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


    // $ANTLR start "rule__Package__PackageImportsAssignment_3"
    // InternalCls.g:4294:1: rule__Package__PackageImportsAssignment_3 : ( rulePackageImport ) ;
    public final void rule__Package__PackageImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4298:1: ( ( rulePackageImport ) )
            // InternalCls.g:4299:2: ( rulePackageImport )
            {
            // InternalCls.g:4299:2: ( rulePackageImport )
            // InternalCls.g:4300:3: rulePackageImport
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
    // InternalCls.g:4309:1: rule__Package__ClassifiersAssignment_4 : ( ruleClassifier ) ;
    public final void rule__Package__ClassifiersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4313:1: ( ( ruleClassifier ) )
            // InternalCls.g:4314:2: ( ruleClassifier )
            {
            // InternalCls.g:4314:2: ( ruleClassifier )
            // InternalCls.g:4315:3: ruleClassifier
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
    // InternalCls.g:4324:1: rule__Package__ConnectorsAssignment_5 : ( ruleConnector ) ;
    public final void rule__Package__ConnectorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4328:1: ( ( ruleConnector ) )
            // InternalCls.g:4329:2: ( ruleConnector )
            {
            // InternalCls.g:4329:2: ( ruleConnector )
            // InternalCls.g:4330:3: ruleConnector
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
    // InternalCls.g:4339:1: rule__Package__PackagesAssignment_6 : ( rulePackage ) ;
    public final void rule__Package__PackagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4343:1: ( ( rulePackage ) )
            // InternalCls.g:4344:2: ( rulePackage )
            {
            // InternalCls.g:4344:2: ( rulePackage )
            // InternalCls.g:4345:3: rulePackage
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


    // $ANTLR start "rule__PackageImport__ImportedPackageAssignment_1"
    // InternalCls.g:4354:1: rule__PackageImport__ImportedPackageAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__PackageImport__ImportedPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4358:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4359:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4359:2: ( ( ruleFQN ) )
            // InternalCls.g:4360:3: ( ruleFQN )
            {
             before(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_1_0()); 
            // InternalCls.g:4361:3: ( ruleFQN )
            // InternalCls.g:4362:4: ruleFQN
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


    // $ANTLR start "rule__PackageImport__CommentsAssignment_2"
    // InternalCls.g:4373:1: rule__PackageImport__CommentsAssignment_2 : ( ruleComment ) ;
    public final void rule__PackageImport__CommentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4377:1: ( ( ruleComment ) )
            // InternalCls.g:4378:2: ( ruleComment )
            {
            // InternalCls.g:4378:2: ( ruleComment )
            // InternalCls.g:4379:3: ruleComment
            {
             before(grammarAccess.getPackageImportAccess().getCommentsCommentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getPackageImportAccess().getCommentsCommentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__CommentsAssignment_2"


    // $ANTLR start "rule__Class__VisibilityAssignment_0"
    // InternalCls.g:4388:1: rule__Class__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4392:1: ( ( ruleVisibility ) )
            // InternalCls.g:4393:2: ( ruleVisibility )
            {
            // InternalCls.g:4393:2: ( ruleVisibility )
            // InternalCls.g:4394:3: ruleVisibility
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
    // InternalCls.g:4403:1: rule__Class__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4407:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4408:2: ( ( 'abstract' ) )
            {
            // InternalCls.g:4408:2: ( ( 'abstract' ) )
            // InternalCls.g:4409:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4410:3: ( 'abstract' )
            // InternalCls.g:4411:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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


    // $ANTLR start "rule__Class__NameAssignment_3_0"
    // InternalCls.g:4422:1: rule__Class__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4426:1: ( ( RULE_ID ) )
            // InternalCls.g:4427:2: ( RULE_ID )
            {
            // InternalCls.g:4427:2: ( RULE_ID )
            // InternalCls.g:4428:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_3_0"


    // $ANTLR start "rule__Class__AliasAssignment_3_1_0"
    // InternalCls.g:4437:1: rule__Class__AliasAssignment_3_1_0 : ( RULE_ID ) ;
    public final void rule__Class__AliasAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4441:1: ( ( RULE_ID ) )
            // InternalCls.g:4442:2: ( RULE_ID )
            {
            // InternalCls.g:4442:2: ( RULE_ID )
            // InternalCls.g:4443:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getAliasIDTerminalRuleCall_3_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAliasIDTerminalRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AliasAssignment_3_1_0"


    // $ANTLR start "rule__Class__NameAssignment_3_1_2"
    // InternalCls.g:4452:1: rule__Class__NameAssignment_3_1_2 : ( RULE_STRING ) ;
    public final void rule__Class__NameAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4456:1: ( ( RULE_STRING ) )
            // InternalCls.g:4457:2: ( RULE_STRING )
            {
            // InternalCls.g:4457:2: ( RULE_STRING )
            // InternalCls.g:4458:3: RULE_STRING
            {
             before(grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_3_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_3_1_2"


    // $ANTLR start "rule__Class__CommentsAssignment_4_0"
    // InternalCls.g:4467:1: rule__Class__CommentsAssignment_4_0 : ( ruleComment ) ;
    public final void rule__Class__CommentsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4471:1: ( ( ruleComment ) )
            // InternalCls.g:4472:2: ( ruleComment )
            {
            // InternalCls.g:4472:2: ( ruleComment )
            // InternalCls.g:4473:3: ruleComment
            {
             before(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__CommentsAssignment_4_0"


    // $ANTLR start "rule__Class__CommentsAssignment_4_1_1"
    // InternalCls.g:4482:1: rule__Class__CommentsAssignment_4_1_1 : ( ruleComment ) ;
    public final void rule__Class__CommentsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4486:1: ( ( ruleComment ) )
            // InternalCls.g:4487:2: ( ruleComment )
            {
            // InternalCls.g:4487:2: ( ruleComment )
            // InternalCls.g:4488:3: ruleComment
            {
             before(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__CommentsAssignment_4_1_1"


    // $ANTLR start "rule__Class__MembersAssignment_4_1_2"
    // InternalCls.g:4497:1: rule__Class__MembersAssignment_4_1_2 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4501:1: ( ( ruleMember ) )
            // InternalCls.g:4502:2: ( ruleMember )
            {
            // InternalCls.g:4502:2: ( ruleMember )
            // InternalCls.g:4503:3: ruleMember
            {
             before(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MembersAssignment_4_1_2"


    // $ANTLR start "rule__Interface__VisibilityAssignment_0"
    // InternalCls.g:4512:1: rule__Interface__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Interface__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4516:1: ( ( ruleVisibility ) )
            // InternalCls.g:4517:2: ( ruleVisibility )
            {
            // InternalCls.g:4517:2: ( ruleVisibility )
            // InternalCls.g:4518:3: ruleVisibility
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


    // $ANTLR start "rule__Interface__NameAssignment_2_0"
    // InternalCls.g:4527:1: rule__Interface__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4531:1: ( ( RULE_ID ) )
            // InternalCls.g:4532:2: ( RULE_ID )
            {
            // InternalCls.g:4532:2: ( RULE_ID )
            // InternalCls.g:4533:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_2_0"


    // $ANTLR start "rule__Interface__AliasAssignment_2_1_0"
    // InternalCls.g:4542:1: rule__Interface__AliasAssignment_2_1_0 : ( RULE_ID ) ;
    public final void rule__Interface__AliasAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4546:1: ( ( RULE_ID ) )
            // InternalCls.g:4547:2: ( RULE_ID )
            {
            // InternalCls.g:4547:2: ( RULE_ID )
            // InternalCls.g:4548:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getAliasIDTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getAliasIDTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__AliasAssignment_2_1_0"


    // $ANTLR start "rule__Interface__NameAssignment_2_1_2"
    // InternalCls.g:4557:1: rule__Interface__NameAssignment_2_1_2 : ( RULE_STRING ) ;
    public final void rule__Interface__NameAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4561:1: ( ( RULE_STRING ) )
            // InternalCls.g:4562:2: ( RULE_STRING )
            {
            // InternalCls.g:4562:2: ( RULE_STRING )
            // InternalCls.g:4563:3: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getNameSTRINGTerminalRuleCall_2_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getNameSTRINGTerminalRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_2_1_2"


    // $ANTLR start "rule__Interface__CommentsAssignment_3_0"
    // InternalCls.g:4572:1: rule__Interface__CommentsAssignment_3_0 : ( ruleComment ) ;
    public final void rule__Interface__CommentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4576:1: ( ( ruleComment ) )
            // InternalCls.g:4577:2: ( ruleComment )
            {
            // InternalCls.g:4577:2: ( ruleComment )
            // InternalCls.g:4578:3: ruleComment
            {
             before(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__CommentsAssignment_3_0"


    // $ANTLR start "rule__Interface__CommentsAssignment_3_1_1"
    // InternalCls.g:4587:1: rule__Interface__CommentsAssignment_3_1_1 : ( ruleComment ) ;
    public final void rule__Interface__CommentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4591:1: ( ( ruleComment ) )
            // InternalCls.g:4592:2: ( ruleComment )
            {
            // InternalCls.g:4592:2: ( ruleComment )
            // InternalCls.g:4593:3: ruleComment
            {
             before(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__CommentsAssignment_3_1_1"


    // $ANTLR start "rule__Interface__MembersAssignment_3_1_2"
    // InternalCls.g:4602:1: rule__Interface__MembersAssignment_3_1_2 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4606:1: ( ( ruleMember ) )
            // InternalCls.g:4607:2: ( ruleMember )
            {
            // InternalCls.g:4607:2: ( ruleMember )
            // InternalCls.g:4608:3: ruleMember
            {
             before(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__MembersAssignment_3_1_2"


    // $ANTLR start "rule__Attribute__VisibilityAssignment_1"
    // InternalCls.g:4617:1: rule__Attribute__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4621:1: ( ( ruleVisibility ) )
            // InternalCls.g:4622:2: ( ruleVisibility )
            {
            // InternalCls.g:4622:2: ( ruleVisibility )
            // InternalCls.g:4623:3: ruleVisibility
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
    // InternalCls.g:4632:1: rule__Attribute__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4636:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4637:2: ( ( 'static' ) )
            {
            // InternalCls.g:4637:2: ( ( 'static' ) )
            // InternalCls.g:4638:3: ( 'static' )
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4639:3: ( 'static' )
            // InternalCls.g:4640:4: 'static'
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCls.g:4651:1: rule__Attribute__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4655:1: ( ( RULE_ID ) )
            // InternalCls.g:4656:2: ( RULE_ID )
            {
            // InternalCls.g:4656:2: ( RULE_ID )
            // InternalCls.g:4657:3: RULE_ID
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
    // InternalCls.g:4666:1: rule__Attribute__TypeAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4670:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4671:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4671:2: ( ( ruleFQN ) )
            // InternalCls.g:4672:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getTypeClassifierCrossReference_5_0()); 
            // InternalCls.g:4673:3: ( ruleFQN )
            // InternalCls.g:4674:4: ruleFQN
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


    // $ANTLR start "rule__Method__VisibilityAssignment_0"
    // InternalCls.g:4685:1: rule__Method__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Method__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4689:1: ( ( ruleVisibility ) )
            // InternalCls.g:4690:2: ( ruleVisibility )
            {
            // InternalCls.g:4690:2: ( ruleVisibility )
            // InternalCls.g:4691:3: ruleVisibility
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
    // InternalCls.g:4700:1: rule__Method__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Method__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4704:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4705:2: ( ( 'abstract' ) )
            {
            // InternalCls.g:4705:2: ( ( 'abstract' ) )
            // InternalCls.g:4706:3: ( 'abstract' )
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4707:3: ( 'abstract' )
            // InternalCls.g:4708:4: 'abstract'
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCls.g:4719:1: rule__Method__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Method__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4723:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4724:2: ( ( 'static' ) )
            {
            // InternalCls.g:4724:2: ( ( 'static' ) )
            // InternalCls.g:4725:3: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4726:3: ( 'static' )
            // InternalCls.g:4727:4: 'static'
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCls.g:4738:1: rule__Method__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4742:1: ( ( RULE_ID ) )
            // InternalCls.g:4743:2: ( RULE_ID )
            {
            // InternalCls.g:4743:2: ( RULE_ID )
            // InternalCls.g:4744:3: RULE_ID
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


    // $ANTLR start "rule__Method__ParametersAssignment_5_0"
    // InternalCls.g:4753:1: rule__Method__ParametersAssignment_5_0 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4757:1: ( ( ruleParameter ) )
            // InternalCls.g:4758:2: ( ruleParameter )
            {
            // InternalCls.g:4758:2: ( ruleParameter )
            // InternalCls.g:4759:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_5_0"


    // $ANTLR start "rule__Method__ParametersAssignment_5_1_1"
    // InternalCls.g:4768:1: rule__Method__ParametersAssignment_5_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4772:1: ( ( ruleParameter ) )
            // InternalCls.g:4773:2: ( ruleParameter )
            {
            // InternalCls.g:4773:2: ( ruleParameter )
            // InternalCls.g:4774:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_5_1_1"


    // $ANTLR start "rule__Method__TypeAssignment_7_1"
    // InternalCls.g:4783:1: rule__Method__TypeAssignment_7_1 : ( ( ruleFQN ) ) ;
    public final void rule__Method__TypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4787:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4788:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4788:2: ( ( ruleFQN ) )
            // InternalCls.g:4789:3: ( ruleFQN )
            {
             before(grammarAccess.getMethodAccess().getTypeClassifierCrossReference_7_1_0()); 
            // InternalCls.g:4790:3: ( ruleFQN )
            // InternalCls.g:4791:4: ruleFQN
            {
             before(grammarAccess.getMethodAccess().getTypeClassifierFQNParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypeClassifierFQNParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getTypeClassifierCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypeAssignment_7_1"


    // $ANTLR start "rule__Parameter__VisibilityAssignment_0"
    // InternalCls.g:4802:1: rule__Parameter__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Parameter__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4806:1: ( ( ruleVisibility ) )
            // InternalCls.g:4807:2: ( ruleVisibility )
            {
            // InternalCls.g:4807:2: ( ruleVisibility )
            // InternalCls.g:4808:3: ruleVisibility
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


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalCls.g:4817:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4821:1: ( ( RULE_ID ) )
            // InternalCls.g:4822:2: ( RULE_ID )
            {
            // InternalCls.g:4822:2: ( RULE_ID )
            // InternalCls.g:4823:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_3"
    // InternalCls.g:4832:1: rule__Parameter__TypeAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Parameter__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4836:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4837:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4837:2: ( ( ruleFQN ) )
            // InternalCls.g:4838:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterAccess().getTypeClassifierCrossReference_3_0()); 
            // InternalCls.g:4839:3: ( ruleFQN )
            // InternalCls.g:4840:4: ruleFQN
            {
             before(grammarAccess.getParameterAccess().getTypeClassifierFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeClassifierFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeClassifierCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_3"


    // $ANTLR start "rule__Generalization__LeftAssignment_2"
    // InternalCls.g:4851:1: rule__Generalization__LeftAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Generalization__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4855:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4856:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4856:2: ( ( ruleFQN ) )
            // InternalCls.g:4857:3: ( ruleFQN )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftClassifierCrossReference_2_0()); 
            // InternalCls.g:4858:3: ( ruleFQN )
            // InternalCls.g:4859:4: ruleFQN
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
    // InternalCls.g:4870:1: rule__Generalization__RightAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Generalization__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4874:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4875:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4875:2: ( ( ruleFQN ) )
            // InternalCls.g:4876:3: ( ruleFQN )
            {
             before(grammarAccess.getGeneralizationAccess().getRightClassifierCrossReference_4_0()); 
            // InternalCls.g:4877:3: ( ruleFQN )
            // InternalCls.g:4878:4: ruleFQN
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


    // $ANTLR start "rule__Generalization__CommentsAssignment_6"
    // InternalCls.g:4889:1: rule__Generalization__CommentsAssignment_6 : ( ruleComment ) ;
    public final void rule__Generalization__CommentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4893:1: ( ( ruleComment ) )
            // InternalCls.g:4894:2: ( ruleComment )
            {
            // InternalCls.g:4894:2: ( ruleComment )
            // InternalCls.g:4895:3: ruleComment
            {
             before(grammarAccess.getGeneralizationAccess().getCommentsCommentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getCommentsCommentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__CommentsAssignment_6"


    // $ANTLR start "rule__Implementation__LeftAssignment_2"
    // InternalCls.g:4904:1: rule__Implementation__LeftAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Implementation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4908:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4909:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4909:2: ( ( ruleFQN ) )
            // InternalCls.g:4910:3: ( ruleFQN )
            {
             before(grammarAccess.getImplementationAccess().getLeftClassifierCrossReference_2_0()); 
            // InternalCls.g:4911:3: ( ruleFQN )
            // InternalCls.g:4912:4: ruleFQN
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
    // InternalCls.g:4923:1: rule__Implementation__RightAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Implementation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4927:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4928:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4928:2: ( ( ruleFQN ) )
            // InternalCls.g:4929:3: ( ruleFQN )
            {
             before(grammarAccess.getImplementationAccess().getRightClassifierCrossReference_4_0()); 
            // InternalCls.g:4930:3: ( ruleFQN )
            // InternalCls.g:4931:4: ruleFQN
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


    // $ANTLR start "rule__Implementation__CommentsAssignment_6"
    // InternalCls.g:4942:1: rule__Implementation__CommentsAssignment_6 : ( ruleComment ) ;
    public final void rule__Implementation__CommentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4946:1: ( ( ruleComment ) )
            // InternalCls.g:4947:2: ( ruleComment )
            {
            // InternalCls.g:4947:2: ( ruleComment )
            // InternalCls.g:4948:3: ruleComment
            {
             before(grammarAccess.getImplementationAccess().getCommentsCommentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getCommentsCommentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implementation__CommentsAssignment_6"


    // $ANTLR start "rule__XtextAssociation__TwoSideBidirectionalityAssignment_0"
    // InternalCls.g:4957:1: rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 : ( ( 'bi' ) ) ;
    public final void rule__XtextAssociation__TwoSideBidirectionalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4961:1: ( ( ( 'bi' ) ) )
            // InternalCls.g:4962:2: ( ( 'bi' ) )
            {
            // InternalCls.g:4962:2: ( ( 'bi' ) )
            // InternalCls.g:4963:3: ( 'bi' )
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityBiKeyword_0_0()); 
            // InternalCls.g:4964:3: ( 'bi' )
            // InternalCls.g:4965:4: 'bi'
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityBiKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCls.g:4976:1: rule__XtextAssociation__TwoSideAggregationKindAssignment_1 : ( ruleAggregationKind ) ;
    public final void rule__XtextAssociation__TwoSideAggregationKindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4980:1: ( ( ruleAggregationKind ) )
            // InternalCls.g:4981:2: ( ruleAggregationKind )
            {
            // InternalCls.g:4981:2: ( ruleAggregationKind )
            // InternalCls.g:4982:3: ruleAggregationKind
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
    // InternalCls.g:4991:1: rule__XtextAssociation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XtextAssociation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4995:1: ( ( RULE_ID ) )
            // InternalCls.g:4996:2: ( RULE_ID )
            {
            // InternalCls.g:4996:2: ( RULE_ID )
            // InternalCls.g:4997:3: RULE_ID
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


    // $ANTLR start "rule__XtextAssociation__MemberEndTypesAssignment_4"
    // InternalCls.g:5006:1: rule__XtextAssociation__MemberEndTypesAssignment_4 : ( ruleXtextAssociationMemberEndReferencedType ) ;
    public final void rule__XtextAssociation__MemberEndTypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5010:1: ( ( ruleXtextAssociationMemberEndReferencedType ) )
            // InternalCls.g:5011:2: ( ruleXtextAssociationMemberEndReferencedType )
            {
            // InternalCls.g:5011:2: ( ruleXtextAssociationMemberEndReferencedType )
            // InternalCls.g:5012:3: ruleXtextAssociationMemberEndReferencedType
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleXtextAssociationMemberEndReferencedType();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndTypesAssignment_4"


    // $ANTLR start "rule__XtextAssociation__MemberEndTypesAssignment_5_1"
    // InternalCls.g:5021:1: rule__XtextAssociation__MemberEndTypesAssignment_5_1 : ( ruleXtextAssociationMemberEndReferencedType ) ;
    public final void rule__XtextAssociation__MemberEndTypesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5025:1: ( ( ruleXtextAssociationMemberEndReferencedType ) )
            // InternalCls.g:5026:2: ( ruleXtextAssociationMemberEndReferencedType )
            {
            // InternalCls.g:5026:2: ( ruleXtextAssociationMemberEndReferencedType )
            // InternalCls.g:5027:3: ruleXtextAssociationMemberEndReferencedType
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXtextAssociationMemberEndReferencedType();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndTypesXtextAssociationMemberEndReferencedTypeParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndTypesAssignment_5_1"


    // $ANTLR start "rule__XtextAssociation__MemberEndNamesAssignment_7_2"
    // InternalCls.g:5036:1: rule__XtextAssociation__MemberEndNamesAssignment_7_2 : ( ruleRoleName ) ;
    public final void rule__XtextAssociation__MemberEndNamesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5040:1: ( ( ruleRoleName ) )
            // InternalCls.g:5041:2: ( ruleRoleName )
            {
            // InternalCls.g:5041:2: ( ruleRoleName )
            // InternalCls.g:5042:3: ruleRoleName
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleName();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndNamesAssignment_7_2"


    // $ANTLR start "rule__XtextAssociation__MemberEndNamesAssignment_7_3_1"
    // InternalCls.g:5051:1: rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 : ( ruleRoleName ) ;
    public final void rule__XtextAssociation__MemberEndNamesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5055:1: ( ( ruleRoleName ) )
            // InternalCls.g:5056:2: ( ruleRoleName )
            {
            // InternalCls.g:5056:2: ( ruleRoleName )
            // InternalCls.g:5057:3: ruleRoleName
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleName();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndNamesRoleNameParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndNamesAssignment_7_3_1"


    // $ANTLR start "rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2"
    // InternalCls.g:5066:1: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 : ( ruleCardinality ) ;
    public final void rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5070:1: ( ( ruleCardinality ) )
            // InternalCls.g:5071:2: ( ruleCardinality )
            {
            // InternalCls.g:5071:2: ( ruleCardinality )
            // InternalCls.g:5072:3: ruleCardinality
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2"


    // $ANTLR start "rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1"
    // InternalCls.g:5081:1: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 : ( ruleCardinality ) ;
    public final void rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5085:1: ( ( ruleCardinality ) )
            // InternalCls.g:5086:2: ( ruleCardinality )
            {
            // InternalCls.g:5086:2: ( ruleCardinality )
            // InternalCls.g:5087:3: ruleCardinality
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesCardinalityParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1"


    // $ANTLR start "rule__XtextAssociation__CommentsAssignment_9"
    // InternalCls.g:5096:1: rule__XtextAssociation__CommentsAssignment_9 : ( ruleComment ) ;
    public final void rule__XtextAssociation__CommentsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5100:1: ( ( ruleComment ) )
            // InternalCls.g:5101:2: ( ruleComment )
            {
            // InternalCls.g:5101:2: ( ruleComment )
            // InternalCls.g:5102:3: ruleComment
            {
             before(grammarAccess.getXtextAssociationAccess().getCommentsCommentParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getXtextAssociationAccess().getCommentsCommentParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtextAssociation__CommentsAssignment_9"


    // $ANTLR start "rule__XtextAssociationMemberEndReferencedType__TypeAssignment"
    // InternalCls.g:5111:1: rule__XtextAssociationMemberEndReferencedType__TypeAssignment : ( ( ruleFQN ) ) ;
    public final void rule__XtextAssociationMemberEndReferencedType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5115:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:5116:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:5116:2: ( ( ruleFQN ) )
            // InternalCls.g:5117:3: ( ruleFQN )
            {
             before(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeClassifierCrossReference_0()); 
            // InternalCls.g:5118:3: ( ruleFQN )
            // InternalCls.g:5119:4: ruleFQN
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
    // InternalCls.g:5130:1: rule__Comment__BodyAssignment_1 : ( ruleCommentBody ) ;
    public final void rule__Comment__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5134:1: ( ( ruleCommentBody ) )
            // InternalCls.g:5135:2: ( ruleCommentBody )
            {
            // InternalCls.g:5135:2: ( ruleCommentBody )
            // InternalCls.g:5136:3: ruleCommentBody
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
    // InternalCls.g:5145:1: rule__Cardinality__LowerBoundAssignment_0 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5149:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:5150:2: ( ruleCardinalityBound )
            {
            // InternalCls.g:5150:2: ( ruleCardinalityBound )
            // InternalCls.g:5151:3: ruleCardinalityBound
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
    // InternalCls.g:5160:1: rule__Cardinality__UpperBoundAssignment_1_1 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__UpperBoundAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:5164:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:5165:2: ( ruleCardinalityBound )
            {
            // InternalCls.g:5165:2: ( ruleCardinalityBound )
            // InternalCls.g:5166:3: ruleCardinalityBound
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
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\15\7\37\2\uffff";
    static final String dfa_3s = "\10\56\2\uffff";
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
            return "634:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\11\6\1\42\2\uffff";
    static final String dfa_9s = "\10\57\1\6\1\43\2\uffff";
    static final String dfa_10s = "\12\uffff\1\2\1\1";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\11\6\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\32\uffff\1\12\1\10",
            "\1\11\47\uffff\1\12\1\10",
            "\1\11\47\uffff\1\12\1\10",
            "\1\11\47\uffff\1\12\1\10",
            "\1\11\47\uffff\1\12\1\10",
            "\1\11\47\uffff\1\12\1\10",
            "\1\11\47\uffff\1\12\1\10",
            "\1\11\47\uffff\1\12\1\10",
            "\1\11",
            "\1\13\1\12",
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
            return "739:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000140C2A67FE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00004002800FE002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000100C000700002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000140C2B47FE000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00004000800FE000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000D000100FE040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000C000000FE042L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00004002800FE000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00008000000FE040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000C000000FE040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000010000FE040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000FE042L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000FE040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000700000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000190000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040400000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});

}