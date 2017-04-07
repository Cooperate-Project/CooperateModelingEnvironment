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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'", "'~'", "'asc'", "'agg'", "'com'", "'@start-clsd'", "'@end-clsd'", "'rootPackage'", "'package'", "'{'", "'}'", "'import'", "'.'", "'class'", "'as'", "'interface'", "':'", "'('", "')'", "','", "'isa'", "'impl'", "'role'", "'['", "']'", "'card'", "'note'", "'..'", "'abstract'", "'static'", "'bi'"
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


    // $ANTLR start "ruleVisibility"
    // InternalCls.g:578:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:582:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalCls.g:583:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalCls.g:583:2: ( ( rule__Visibility__Alternatives ) )
            // InternalCls.g:584:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalCls.g:585:3: ( rule__Visibility__Alternatives )
            // InternalCls.g:585:4: rule__Visibility__Alternatives
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
    // InternalCls.g:594:1: ruleAggregationKind : ( ( rule__AggregationKind__Alternatives ) ) ;
    public final void ruleAggregationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:598:1: ( ( ( rule__AggregationKind__Alternatives ) ) )
            // InternalCls.g:599:2: ( ( rule__AggregationKind__Alternatives ) )
            {
            // InternalCls.g:599:2: ( ( rule__AggregationKind__Alternatives ) )
            // InternalCls.g:600:3: ( rule__AggregationKind__Alternatives )
            {
             before(grammarAccess.getAggregationKindAccess().getAlternatives()); 
            // InternalCls.g:601:3: ( rule__AggregationKind__Alternatives )
            // InternalCls.g:601:4: rule__AggregationKind__Alternatives
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
    // InternalCls.g:609:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );
    public final void rule__Classifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:613:1: ( ( ruleClass ) | ( ruleInterface ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCls.g:614:2: ( ruleClass )
                    {
                    // InternalCls.g:614:2: ( ruleClass )
                    // InternalCls.g:615:3: ruleClass
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
                    // InternalCls.g:620:2: ( ruleInterface )
                    {
                    // InternalCls.g:620:2: ( ruleInterface )
                    // InternalCls.g:621:3: ruleInterface
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
    // InternalCls.g:630:1: rule__Class__Alternatives_3 : ( ( ( rule__Class__Group_3_0__0 ) ) | ( ( rule__Class__NameAssignment_3_1 ) ) );
    public final void rule__Class__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:634:1: ( ( ( rule__Class__Group_3_0__0 ) ) | ( ( rule__Class__NameAssignment_3_1 ) ) )
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
                    // InternalCls.g:635:2: ( ( rule__Class__Group_3_0__0 ) )
                    {
                    // InternalCls.g:635:2: ( ( rule__Class__Group_3_0__0 ) )
                    // InternalCls.g:636:3: ( rule__Class__Group_3_0__0 )
                    {
                     before(grammarAccess.getClassAccess().getGroup_3_0()); 
                    // InternalCls.g:637:3: ( rule__Class__Group_3_0__0 )
                    // InternalCls.g:637:4: rule__Class__Group_3_0__0
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
                    // InternalCls.g:641:2: ( ( rule__Class__NameAssignment_3_1 ) )
                    {
                    // InternalCls.g:641:2: ( ( rule__Class__NameAssignment_3_1 ) )
                    // InternalCls.g:642:3: ( rule__Class__NameAssignment_3_1 )
                    {
                     before(grammarAccess.getClassAccess().getNameAssignment_3_1()); 
                    // InternalCls.g:643:3: ( rule__Class__NameAssignment_3_1 )
                    // InternalCls.g:643:4: rule__Class__NameAssignment_3_1
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


    // $ANTLR start "rule__Class__Alternatives_4"
    // InternalCls.g:651:1: rule__Class__Alternatives_4 : ( ( ( rule__Class__CommentsAssignment_4_0 )? ) | ( ( rule__Class__Group_4_1__0 ) ) );
    public final void rule__Class__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:655:1: ( ( ( rule__Class__CommentsAssignment_4_0 )? ) | ( ( rule__Class__Group_4_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOF||(LA4_0>=12 && LA4_0<=21)||LA4_0==23||LA4_0==25||LA4_0==27||LA4_0==30||LA4_0==32||(LA4_0>=37 && LA4_0<=38)||LA4_0==43||LA4_0==45||LA4_0==47) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCls.g:656:2: ( ( rule__Class__CommentsAssignment_4_0 )? )
                    {
                    // InternalCls.g:656:2: ( ( rule__Class__CommentsAssignment_4_0 )? )
                    // InternalCls.g:657:3: ( rule__Class__CommentsAssignment_4_0 )?
                    {
                     before(grammarAccess.getClassAccess().getCommentsAssignment_4_0()); 
                    // InternalCls.g:658:3: ( rule__Class__CommentsAssignment_4_0 )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==43) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalCls.g:658:4: rule__Class__CommentsAssignment_4_0
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
                    // InternalCls.g:662:2: ( ( rule__Class__Group_4_1__0 ) )
                    {
                    // InternalCls.g:662:2: ( ( rule__Class__Group_4_1__0 ) )
                    // InternalCls.g:663:3: ( rule__Class__Group_4_1__0 )
                    {
                     before(grammarAccess.getClassAccess().getGroup_4_1()); 
                    // InternalCls.g:664:3: ( rule__Class__Group_4_1__0 )
                    // InternalCls.g:664:4: rule__Class__Group_4_1__0
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
    // InternalCls.g:672:1: rule__Interface__Alternatives_2 : ( ( ( rule__Interface__Group_2_0__0 ) ) | ( ( rule__Interface__NameAssignment_2_1 ) ) );
    public final void rule__Interface__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:676:1: ( ( ( rule__Interface__Group_2_0__0 ) ) | ( ( rule__Interface__NameAssignment_2_1 ) ) )
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
                    // InternalCls.g:677:2: ( ( rule__Interface__Group_2_0__0 ) )
                    {
                    // InternalCls.g:677:2: ( ( rule__Interface__Group_2_0__0 ) )
                    // InternalCls.g:678:3: ( rule__Interface__Group_2_0__0 )
                    {
                     before(grammarAccess.getInterfaceAccess().getGroup_2_0()); 
                    // InternalCls.g:679:3: ( rule__Interface__Group_2_0__0 )
                    // InternalCls.g:679:4: rule__Interface__Group_2_0__0
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
                    // InternalCls.g:683:2: ( ( rule__Interface__NameAssignment_2_1 ) )
                    {
                    // InternalCls.g:683:2: ( ( rule__Interface__NameAssignment_2_1 ) )
                    // InternalCls.g:684:3: ( rule__Interface__NameAssignment_2_1 )
                    {
                     before(grammarAccess.getInterfaceAccess().getNameAssignment_2_1()); 
                    // InternalCls.g:685:3: ( rule__Interface__NameAssignment_2_1 )
                    // InternalCls.g:685:4: rule__Interface__NameAssignment_2_1
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


    // $ANTLR start "rule__Interface__Alternatives_3"
    // InternalCls.g:693:1: rule__Interface__Alternatives_3 : ( ( ( rule__Interface__CommentsAssignment_3_0 )? ) | ( ( rule__Interface__Group_3_1__0 ) ) );
    public final void rule__Interface__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:697:1: ( ( ( rule__Interface__CommentsAssignment_3_0 )? ) | ( ( rule__Interface__Group_3_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||(LA7_0>=12 && LA7_0<=21)||LA7_0==23||LA7_0==25||LA7_0==27||LA7_0==30||LA7_0==32||(LA7_0>=37 && LA7_0<=38)||LA7_0==43||LA7_0==45||LA7_0==47) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCls.g:698:2: ( ( rule__Interface__CommentsAssignment_3_0 )? )
                    {
                    // InternalCls.g:698:2: ( ( rule__Interface__CommentsAssignment_3_0 )? )
                    // InternalCls.g:699:3: ( rule__Interface__CommentsAssignment_3_0 )?
                    {
                     before(grammarAccess.getInterfaceAccess().getCommentsAssignment_3_0()); 
                    // InternalCls.g:700:3: ( rule__Interface__CommentsAssignment_3_0 )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==43) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCls.g:700:4: rule__Interface__CommentsAssignment_3_0
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
                    // InternalCls.g:704:2: ( ( rule__Interface__Group_3_1__0 ) )
                    {
                    // InternalCls.g:704:2: ( ( rule__Interface__Group_3_1__0 ) )
                    // InternalCls.g:705:3: ( rule__Interface__Group_3_1__0 )
                    {
                     before(grammarAccess.getInterfaceAccess().getGroup_3_1()); 
                    // InternalCls.g:706:3: ( rule__Interface__Group_3_1__0 )
                    // InternalCls.g:706:4: rule__Interface__Group_3_1__0
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
    // InternalCls.g:714:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:718:1: ( ( ruleAttribute ) | ( ruleMethod ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalCls.g:719:2: ( ruleAttribute )
                    {
                    // InternalCls.g:719:2: ( ruleAttribute )
                    // InternalCls.g:720:3: ruleAttribute
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
                    // InternalCls.g:725:2: ( ruleMethod )
                    {
                    // InternalCls.g:725:2: ( ruleMethod )
                    // InternalCls.g:726:3: ruleMethod
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
    // InternalCls.g:735:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleXtextAssociation ) | ( ruleImplementation ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:739:1: ( ( ruleGeneralization ) | ( ruleXtextAssociation ) | ( ruleImplementation ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt9=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 47:
                {
                alt9=2;
                }
                break;
            case 38:
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
                    // InternalCls.g:740:2: ( ruleGeneralization )
                    {
                    // InternalCls.g:740:2: ( ruleGeneralization )
                    // InternalCls.g:741:3: ruleGeneralization
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
                    // InternalCls.g:746:2: ( ruleXtextAssociation )
                    {
                    // InternalCls.g:746:2: ( ruleXtextAssociation )
                    // InternalCls.g:747:3: ruleXtextAssociation
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
                    // InternalCls.g:752:2: ( ruleImplementation )
                    {
                    // InternalCls.g:752:2: ( ruleImplementation )
                    // InternalCls.g:753:3: ruleImplementation
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
    // InternalCls.g:762:1: rule__CardinalityBound__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CardinalityBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:766:1: ( ( '*' ) | ( RULE_INT ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
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
                    // InternalCls.g:767:2: ( '*' )
                    {
                    // InternalCls.g:767:2: ( '*' )
                    // InternalCls.g:768:3: '*'
                    {
                     before(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:773:2: ( RULE_INT )
                    {
                    // InternalCls.g:773:2: ( RULE_INT )
                    // InternalCls.g:774:3: RULE_INT
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
    // InternalCls.g:783:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:787:1: ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt11=1;
                }
                break;
            case 13:
                {
                alt11=2;
                }
                break;
            case 14:
                {
                alt11=3;
                }
                break;
            case 15:
                {
                alt11=4;
                }
                break;
            case 16:
                {
                alt11=5;
                }
                break;
            case 17:
                {
                alt11=6;
                }
                break;
            case 18:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCls.g:788:2: ( ( '+' ) )
                    {
                    // InternalCls.g:788:2: ( ( '+' ) )
                    // InternalCls.g:789:3: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalCls.g:790:3: ( '+' )
                    // InternalCls.g:790:4: '+'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:794:2: ( ( 'public' ) )
                    {
                    // InternalCls.g:794:2: ( ( 'public' ) )
                    // InternalCls.g:795:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // InternalCls.g:796:3: ( 'public' )
                    // InternalCls.g:796:4: 'public'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:800:2: ( ( '-' ) )
                    {
                    // InternalCls.g:800:2: ( ( '-' ) )
                    // InternalCls.g:801:3: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2()); 
                    // InternalCls.g:802:3: ( '-' )
                    // InternalCls.g:802:4: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:806:2: ( ( 'private' ) )
                    {
                    // InternalCls.g:806:2: ( ( 'private' ) )
                    // InternalCls.g:807:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3()); 
                    // InternalCls.g:808:3: ( 'private' )
                    // InternalCls.g:808:4: 'private'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:812:2: ( ( '#' ) )
                    {
                    // InternalCls.g:812:2: ( ( '#' ) )
                    // InternalCls.g:813:3: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4()); 
                    // InternalCls.g:814:3: ( '#' )
                    // InternalCls.g:814:4: '#'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:818:2: ( ( 'protected' ) )
                    {
                    // InternalCls.g:818:2: ( ( 'protected' ) )
                    // InternalCls.g:819:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5()); 
                    // InternalCls.g:820:3: ( 'protected' )
                    // InternalCls.g:820:4: 'protected'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:824:2: ( ( '~' ) )
                    {
                    // InternalCls.g:824:2: ( ( '~' ) )
                    // InternalCls.g:825:3: ( '~' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_6()); 
                    // InternalCls.g:826:3: ( '~' )
                    // InternalCls.g:826:4: '~'
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


    // $ANTLR start "rule__AggregationKind__Alternatives"
    // InternalCls.g:834:1: rule__AggregationKind__Alternatives : ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) );
    public final void rule__AggregationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:838:1: ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt12=1;
                }
                break;
            case 20:
                {
                alt12=2;
                }
                break;
            case 21:
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
                    // InternalCls.g:839:2: ( ( 'asc' ) )
                    {
                    // InternalCls.g:839:2: ( ( 'asc' ) )
                    // InternalCls.g:840:3: ( 'asc' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalCls.g:841:3: ( 'asc' )
                    // InternalCls.g:841:4: 'asc'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:845:2: ( ( 'agg' ) )
                    {
                    // InternalCls.g:845:2: ( ( 'agg' ) )
                    // InternalCls.g:846:3: ( 'agg' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 
                    // InternalCls.g:847:3: ( 'agg' )
                    // InternalCls.g:847:4: 'agg'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:851:2: ( ( 'com' ) )
                    {
                    // InternalCls.g:851:2: ( ( 'com' ) )
                    // InternalCls.g:852:3: ( 'com' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getCOMPOSITIONEnumLiteralDeclaration_2()); 
                    // InternalCls.g:853:3: ( 'com' )
                    // InternalCls.g:853:4: 'com'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalCls.g:861:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:865:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // InternalCls.g:866:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
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
    // InternalCls.g:873:1: rule__ClassDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:877:1: ( ( () ) )
            // InternalCls.g:878:1: ( () )
            {
            // InternalCls.g:878:1: ( () )
            // InternalCls.g:879:2: ()
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 
            // InternalCls.g:880:2: ()
            // InternalCls.g:880:3: 
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
    // InternalCls.g:888:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:892:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // InternalCls.g:893:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
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
    // InternalCls.g:900:1: rule__ClassDiagram__Group__1__Impl : ( '@start-clsd' ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:904:1: ( ( '@start-clsd' ) )
            // InternalCls.g:905:1: ( '@start-clsd' )
            {
            // InternalCls.g:905:1: ( '@start-clsd' )
            // InternalCls.g:906:2: '@start-clsd'
            {
             before(grammarAccess.getClassDiagramAccess().getStartClsdKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCls.g:915:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:919:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // InternalCls.g:920:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
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
    // InternalCls.g:927:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__TitleAssignment_2 ) ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:931:1: ( ( ( rule__ClassDiagram__TitleAssignment_2 ) ) )
            // InternalCls.g:932:1: ( ( rule__ClassDiagram__TitleAssignment_2 ) )
            {
            // InternalCls.g:932:1: ( ( rule__ClassDiagram__TitleAssignment_2 ) )
            // InternalCls.g:933:2: ( rule__ClassDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getClassDiagramAccess().getTitleAssignment_2()); 
            // InternalCls.g:934:2: ( rule__ClassDiagram__TitleAssignment_2 )
            // InternalCls.g:934:3: rule__ClassDiagram__TitleAssignment_2
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
    // InternalCls.g:942:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:946:1: ( rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 )
            // InternalCls.g:947:2: rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4
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
    // InternalCls.g:954:1: rule__ClassDiagram__Group__3__Impl : ( ( rule__ClassDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:958:1: ( ( ( rule__ClassDiagram__RootPackageAssignment_3 ) ) )
            // InternalCls.g:959:1: ( ( rule__ClassDiagram__RootPackageAssignment_3 ) )
            {
            // InternalCls.g:959:1: ( ( rule__ClassDiagram__RootPackageAssignment_3 ) )
            // InternalCls.g:960:2: ( rule__ClassDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getClassDiagramAccess().getRootPackageAssignment_3()); 
            // InternalCls.g:961:2: ( rule__ClassDiagram__RootPackageAssignment_3 )
            // InternalCls.g:961:3: rule__ClassDiagram__RootPackageAssignment_3
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
    // InternalCls.g:969:1: rule__ClassDiagram__Group__4 : rule__ClassDiagram__Group__4__Impl ;
    public final void rule__ClassDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:973:1: ( rule__ClassDiagram__Group__4__Impl )
            // InternalCls.g:974:2: rule__ClassDiagram__Group__4__Impl
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
    // InternalCls.g:980:1: rule__ClassDiagram__Group__4__Impl : ( '@end-clsd' ) ;
    public final void rule__ClassDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:984:1: ( ( '@end-clsd' ) )
            // InternalCls.g:985:1: ( '@end-clsd' )
            {
            // InternalCls.g:985:1: ( '@end-clsd' )
            // InternalCls.g:986:2: '@end-clsd'
            {
             before(grammarAccess.getClassDiagramAccess().getEndClsdKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCls.g:996:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1000:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalCls.g:1001:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
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
    // InternalCls.g:1008:1: rule__RootPackage__Group__0__Impl : ( 'rootPackage' ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1012:1: ( ( 'rootPackage' ) )
            // InternalCls.g:1013:1: ( 'rootPackage' )
            {
            // InternalCls.g:1013:1: ( 'rootPackage' )
            // InternalCls.g:1014:2: 'rootPackage'
            {
             before(grammarAccess.getRootPackageAccess().getRootPackageKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCls.g:1023:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1027:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalCls.g:1028:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
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
    // InternalCls.g:1035:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__NameAssignment_1 ) ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1039:1: ( ( ( rule__RootPackage__NameAssignment_1 ) ) )
            // InternalCls.g:1040:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            {
            // InternalCls.g:1040:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            // InternalCls.g:1041:2: ( rule__RootPackage__NameAssignment_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1()); 
            // InternalCls.g:1042:2: ( rule__RootPackage__NameAssignment_1 )
            // InternalCls.g:1042:3: rule__RootPackage__NameAssignment_1
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
    // InternalCls.g:1050:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1054:1: ( rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 )
            // InternalCls.g:1055:2: rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3
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
    // InternalCls.g:1062:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__PackageImportsAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1066:1: ( ( ( rule__RootPackage__PackageImportsAssignment_2 )* ) )
            // InternalCls.g:1067:1: ( ( rule__RootPackage__PackageImportsAssignment_2 )* )
            {
            // InternalCls.g:1067:1: ( ( rule__RootPackage__PackageImportsAssignment_2 )* )
            // InternalCls.g:1068:2: ( rule__RootPackage__PackageImportsAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getPackageImportsAssignment_2()); 
            // InternalCls.g:1069:2: ( rule__RootPackage__PackageImportsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCls.g:1069:3: rule__RootPackage__PackageImportsAssignment_2
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
    // InternalCls.g:1077:1: rule__RootPackage__Group__3 : rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 ;
    public final void rule__RootPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1081:1: ( rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 )
            // InternalCls.g:1082:2: rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4
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
    // InternalCls.g:1089:1: rule__RootPackage__Group__3__Impl : ( ( rule__RootPackage__ClassifiersAssignment_3 )* ) ;
    public final void rule__RootPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1093:1: ( ( ( rule__RootPackage__ClassifiersAssignment_3 )* ) )
            // InternalCls.g:1094:1: ( ( rule__RootPackage__ClassifiersAssignment_3 )* )
            {
            // InternalCls.g:1094:1: ( ( rule__RootPackage__ClassifiersAssignment_3 )* )
            // InternalCls.g:1095:2: ( rule__RootPackage__ClassifiersAssignment_3 )*
            {
             before(grammarAccess.getRootPackageAccess().getClassifiersAssignment_3()); 
            // InternalCls.g:1096:2: ( rule__RootPackage__ClassifiersAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=12 && LA14_0<=18)||LA14_0==30||LA14_0==32||LA14_0==45) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCls.g:1096:3: rule__RootPackage__ClassifiersAssignment_3
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
    // InternalCls.g:1104:1: rule__RootPackage__Group__4 : rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5 ;
    public final void rule__RootPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1108:1: ( rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5 )
            // InternalCls.g:1109:2: rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5
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
    // InternalCls.g:1116:1: rule__RootPackage__Group__4__Impl : ( ( rule__RootPackage__ConnectorsAssignment_4 )* ) ;
    public final void rule__RootPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1120:1: ( ( ( rule__RootPackage__ConnectorsAssignment_4 )* ) )
            // InternalCls.g:1121:1: ( ( rule__RootPackage__ConnectorsAssignment_4 )* )
            {
            // InternalCls.g:1121:1: ( ( rule__RootPackage__ConnectorsAssignment_4 )* )
            // InternalCls.g:1122:2: ( rule__RootPackage__ConnectorsAssignment_4 )*
            {
             before(grammarAccess.getRootPackageAccess().getConnectorsAssignment_4()); 
            // InternalCls.g:1123:2: ( rule__RootPackage__ConnectorsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=19 && LA15_0<=21)||(LA15_0>=37 && LA15_0<=38)||LA15_0==47) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCls.g:1123:3: rule__RootPackage__ConnectorsAssignment_4
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
    // InternalCls.g:1131:1: rule__RootPackage__Group__5 : rule__RootPackage__Group__5__Impl ;
    public final void rule__RootPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1135:1: ( rule__RootPackage__Group__5__Impl )
            // InternalCls.g:1136:2: rule__RootPackage__Group__5__Impl
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
    // InternalCls.g:1142:1: rule__RootPackage__Group__5__Impl : ( ( rule__RootPackage__PackagesAssignment_5 )* ) ;
    public final void rule__RootPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1146:1: ( ( ( rule__RootPackage__PackagesAssignment_5 )* ) )
            // InternalCls.g:1147:1: ( ( rule__RootPackage__PackagesAssignment_5 )* )
            {
            // InternalCls.g:1147:1: ( ( rule__RootPackage__PackagesAssignment_5 )* )
            // InternalCls.g:1148:2: ( rule__RootPackage__PackagesAssignment_5 )*
            {
             before(grammarAccess.getRootPackageAccess().getPackagesAssignment_5()); 
            // InternalCls.g:1149:2: ( rule__RootPackage__PackagesAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCls.g:1149:3: rule__RootPackage__PackagesAssignment_5
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
    // InternalCls.g:1158:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1162:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalCls.g:1163:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalCls.g:1170:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1174:1: ( ( 'package' ) )
            // InternalCls.g:1175:1: ( 'package' )
            {
            // InternalCls.g:1175:1: ( 'package' )
            // InternalCls.g:1176:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCls.g:1185:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1189:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalCls.g:1190:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalCls.g:1197:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1201:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalCls.g:1202:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalCls.g:1202:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalCls.g:1203:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalCls.g:1204:2: ( rule__Package__NameAssignment_1 )
            // InternalCls.g:1204:3: rule__Package__NameAssignment_1
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
    // InternalCls.g:1212:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1216:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalCls.g:1217:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalCls.g:1224:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1228:1: ( ( '{' ) )
            // InternalCls.g:1229:1: ( '{' )
            {
            // InternalCls.g:1229:1: ( '{' )
            // InternalCls.g:1230:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCls.g:1239:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1243:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalCls.g:1244:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalCls.g:1251:1: rule__Package__Group__3__Impl : ( ( rule__Package__PackageImportsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1255:1: ( ( ( rule__Package__PackageImportsAssignment_3 )* ) )
            // InternalCls.g:1256:1: ( ( rule__Package__PackageImportsAssignment_3 )* )
            {
            // InternalCls.g:1256:1: ( ( rule__Package__PackageImportsAssignment_3 )* )
            // InternalCls.g:1257:2: ( rule__Package__PackageImportsAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getPackageImportsAssignment_3()); 
            // InternalCls.g:1258:2: ( rule__Package__PackageImportsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCls.g:1258:3: rule__Package__PackageImportsAssignment_3
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
    // InternalCls.g:1266:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1270:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalCls.g:1271:2: rule__Package__Group__4__Impl rule__Package__Group__5
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
    // InternalCls.g:1278:1: rule__Package__Group__4__Impl : ( ( rule__Package__ClassifiersAssignment_4 )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1282:1: ( ( ( rule__Package__ClassifiersAssignment_4 )* ) )
            // InternalCls.g:1283:1: ( ( rule__Package__ClassifiersAssignment_4 )* )
            {
            // InternalCls.g:1283:1: ( ( rule__Package__ClassifiersAssignment_4 )* )
            // InternalCls.g:1284:2: ( rule__Package__ClassifiersAssignment_4 )*
            {
             before(grammarAccess.getPackageAccess().getClassifiersAssignment_4()); 
            // InternalCls.g:1285:2: ( rule__Package__ClassifiersAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=18)||LA18_0==30||LA18_0==32||LA18_0==45) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCls.g:1285:3: rule__Package__ClassifiersAssignment_4
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
    // InternalCls.g:1293:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1297:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalCls.g:1298:2: rule__Package__Group__5__Impl rule__Package__Group__6
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
    // InternalCls.g:1305:1: rule__Package__Group__5__Impl : ( ( rule__Package__ConnectorsAssignment_5 )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1309:1: ( ( ( rule__Package__ConnectorsAssignment_5 )* ) )
            // InternalCls.g:1310:1: ( ( rule__Package__ConnectorsAssignment_5 )* )
            {
            // InternalCls.g:1310:1: ( ( rule__Package__ConnectorsAssignment_5 )* )
            // InternalCls.g:1311:2: ( rule__Package__ConnectorsAssignment_5 )*
            {
             before(grammarAccess.getPackageAccess().getConnectorsAssignment_5()); 
            // InternalCls.g:1312:2: ( rule__Package__ConnectorsAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=19 && LA19_0<=21)||(LA19_0>=37 && LA19_0<=38)||LA19_0==47) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCls.g:1312:3: rule__Package__ConnectorsAssignment_5
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
    // InternalCls.g:1320:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1324:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalCls.g:1325:2: rule__Package__Group__6__Impl rule__Package__Group__7
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
    // InternalCls.g:1332:1: rule__Package__Group__6__Impl : ( ( rule__Package__PackagesAssignment_6 )* ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1336:1: ( ( ( rule__Package__PackagesAssignment_6 )* ) )
            // InternalCls.g:1337:1: ( ( rule__Package__PackagesAssignment_6 )* )
            {
            // InternalCls.g:1337:1: ( ( rule__Package__PackagesAssignment_6 )* )
            // InternalCls.g:1338:2: ( rule__Package__PackagesAssignment_6 )*
            {
             before(grammarAccess.getPackageAccess().getPackagesAssignment_6()); 
            // InternalCls.g:1339:2: ( rule__Package__PackagesAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCls.g:1339:3: rule__Package__PackagesAssignment_6
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
    // InternalCls.g:1347:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1351:1: ( rule__Package__Group__7__Impl )
            // InternalCls.g:1352:2: rule__Package__Group__7__Impl
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
    // InternalCls.g:1358:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1362:1: ( ( '}' ) )
            // InternalCls.g:1363:1: ( '}' )
            {
            // InternalCls.g:1363:1: ( '}' )
            // InternalCls.g:1364:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCls.g:1374:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1378:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // InternalCls.g:1379:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
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
    // InternalCls.g:1386:1: rule__PackageImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1390:1: ( ( 'import' ) )
            // InternalCls.g:1391:1: ( 'import' )
            {
            // InternalCls.g:1391:1: ( 'import' )
            // InternalCls.g:1392:2: 'import'
            {
             before(grammarAccess.getPackageImportAccess().getImportKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCls.g:1401:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1405:1: ( rule__PackageImport__Group__1__Impl )
            // InternalCls.g:1406:2: rule__PackageImport__Group__1__Impl
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
    // InternalCls.g:1412:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__ImportedPackageAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1416:1: ( ( ( rule__PackageImport__ImportedPackageAssignment_1 ) ) )
            // InternalCls.g:1417:1: ( ( rule__PackageImport__ImportedPackageAssignment_1 ) )
            {
            // InternalCls.g:1417:1: ( ( rule__PackageImport__ImportedPackageAssignment_1 ) )
            // InternalCls.g:1418:2: ( rule__PackageImport__ImportedPackageAssignment_1 )
            {
             before(grammarAccess.getPackageImportAccess().getImportedPackageAssignment_1()); 
            // InternalCls.g:1419:2: ( rule__PackageImport__ImportedPackageAssignment_1 )
            // InternalCls.g:1419:3: rule__PackageImport__ImportedPackageAssignment_1
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
    // InternalCls.g:1428:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1432:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCls.g:1433:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalCls.g:1440:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1444:1: ( ( RULE_ID ) )
            // InternalCls.g:1445:1: ( RULE_ID )
            {
            // InternalCls.g:1445:1: ( RULE_ID )
            // InternalCls.g:1446:2: RULE_ID
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
    // InternalCls.g:1455:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1459:1: ( rule__FQN__Group__1__Impl )
            // InternalCls.g:1460:2: rule__FQN__Group__1__Impl
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
    // InternalCls.g:1466:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1470:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCls.g:1471:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCls.g:1471:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCls.g:1472:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCls.g:1473:2: ( rule__FQN__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCls.g:1473:3: rule__FQN__Group_1__0
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
    // InternalCls.g:1482:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1486:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCls.g:1487:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalCls.g:1494:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1498:1: ( ( '.' ) )
            // InternalCls.g:1499:1: ( '.' )
            {
            // InternalCls.g:1499:1: ( '.' )
            // InternalCls.g:1500:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCls.g:1509:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1513:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCls.g:1514:2: rule__FQN__Group_1__1__Impl
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
    // InternalCls.g:1520:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1524:1: ( ( RULE_ID ) )
            // InternalCls.g:1525:1: ( RULE_ID )
            {
            // InternalCls.g:1525:1: ( RULE_ID )
            // InternalCls.g:1526:2: RULE_ID
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
    // InternalCls.g:1536:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1540:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalCls.g:1541:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalCls.g:1548:1: rule__Class__Group__0__Impl : ( ( rule__Class__VisibilityAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1552:1: ( ( ( rule__Class__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1553:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1553:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            // InternalCls.g:1554:2: ( rule__Class__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1555:2: ( rule__Class__VisibilityAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=12 && LA22_0<=18)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCls.g:1555:3: rule__Class__VisibilityAssignment_0
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
    // InternalCls.g:1563:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1567:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalCls.g:1568:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalCls.g:1575:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1579:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalCls.g:1580:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalCls.g:1580:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalCls.g:1581:2: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalCls.g:1582:2: ( rule__Class__AbstractAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCls.g:1582:3: rule__Class__AbstractAssignment_1
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
    // InternalCls.g:1590:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1594:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalCls.g:1595:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalCls.g:1602:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1606:1: ( ( 'class' ) )
            // InternalCls.g:1607:1: ( 'class' )
            {
            // InternalCls.g:1607:1: ( 'class' )
            // InternalCls.g:1608:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCls.g:1617:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1621:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalCls.g:1622:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalCls.g:1629:1: rule__Class__Group__3__Impl : ( ( rule__Class__Alternatives_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1633:1: ( ( ( rule__Class__Alternatives_3 ) ) )
            // InternalCls.g:1634:1: ( ( rule__Class__Alternatives_3 ) )
            {
            // InternalCls.g:1634:1: ( ( rule__Class__Alternatives_3 ) )
            // InternalCls.g:1635:2: ( rule__Class__Alternatives_3 )
            {
             before(grammarAccess.getClassAccess().getAlternatives_3()); 
            // InternalCls.g:1636:2: ( rule__Class__Alternatives_3 )
            // InternalCls.g:1636:3: rule__Class__Alternatives_3
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
    // InternalCls.g:1644:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1648:1: ( rule__Class__Group__4__Impl )
            // InternalCls.g:1649:2: rule__Class__Group__4__Impl
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
    // InternalCls.g:1655:1: rule__Class__Group__4__Impl : ( ( rule__Class__Alternatives_4 ) ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1659:1: ( ( ( rule__Class__Alternatives_4 ) ) )
            // InternalCls.g:1660:1: ( ( rule__Class__Alternatives_4 ) )
            {
            // InternalCls.g:1660:1: ( ( rule__Class__Alternatives_4 ) )
            // InternalCls.g:1661:2: ( rule__Class__Alternatives_4 )
            {
             before(grammarAccess.getClassAccess().getAlternatives_4()); 
            // InternalCls.g:1662:2: ( rule__Class__Alternatives_4 )
            // InternalCls.g:1662:3: rule__Class__Alternatives_4
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


    // $ANTLR start "rule__Class__Group_3_0__0"
    // InternalCls.g:1671:1: rule__Class__Group_3_0__0 : rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1 ;
    public final void rule__Class__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1675:1: ( rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1 )
            // InternalCls.g:1676:2: rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCls.g:1683:1: rule__Class__Group_3_0__0__Impl : ( ( rule__Class__NameAssignment_3_0_0 ) ) ;
    public final void rule__Class__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1687:1: ( ( ( rule__Class__NameAssignment_3_0_0 ) ) )
            // InternalCls.g:1688:1: ( ( rule__Class__NameAssignment_3_0_0 ) )
            {
            // InternalCls.g:1688:1: ( ( rule__Class__NameAssignment_3_0_0 ) )
            // InternalCls.g:1689:2: ( rule__Class__NameAssignment_3_0_0 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3_0_0()); 
            // InternalCls.g:1690:2: ( rule__Class__NameAssignment_3_0_0 )
            // InternalCls.g:1690:3: rule__Class__NameAssignment_3_0_0
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
    // InternalCls.g:1698:1: rule__Class__Group_3_0__1 : rule__Class__Group_3_0__1__Impl rule__Class__Group_3_0__2 ;
    public final void rule__Class__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1702:1: ( rule__Class__Group_3_0__1__Impl rule__Class__Group_3_0__2 )
            // InternalCls.g:1703:2: rule__Class__Group_3_0__1__Impl rule__Class__Group_3_0__2
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
    // InternalCls.g:1710:1: rule__Class__Group_3_0__1__Impl : ( 'as' ) ;
    public final void rule__Class__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1714:1: ( ( 'as' ) )
            // InternalCls.g:1715:1: ( 'as' )
            {
            // InternalCls.g:1715:1: ( 'as' )
            // InternalCls.g:1716:2: 'as'
            {
             before(grammarAccess.getClassAccess().getAsKeyword_3_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCls.g:1725:1: rule__Class__Group_3_0__2 : rule__Class__Group_3_0__2__Impl ;
    public final void rule__Class__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1729:1: ( rule__Class__Group_3_0__2__Impl )
            // InternalCls.g:1730:2: rule__Class__Group_3_0__2__Impl
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
    // InternalCls.g:1736:1: rule__Class__Group_3_0__2__Impl : ( ( rule__Class__AliasAssignment_3_0_2 ) ) ;
    public final void rule__Class__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1740:1: ( ( ( rule__Class__AliasAssignment_3_0_2 ) ) )
            // InternalCls.g:1741:1: ( ( rule__Class__AliasAssignment_3_0_2 ) )
            {
            // InternalCls.g:1741:1: ( ( rule__Class__AliasAssignment_3_0_2 ) )
            // InternalCls.g:1742:2: ( rule__Class__AliasAssignment_3_0_2 )
            {
             before(grammarAccess.getClassAccess().getAliasAssignment_3_0_2()); 
            // InternalCls.g:1743:2: ( rule__Class__AliasAssignment_3_0_2 )
            // InternalCls.g:1743:3: rule__Class__AliasAssignment_3_0_2
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


    // $ANTLR start "rule__Class__Group_4_1__0"
    // InternalCls.g:1752:1: rule__Class__Group_4_1__0 : rule__Class__Group_4_1__0__Impl rule__Class__Group_4_1__1 ;
    public final void rule__Class__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1756:1: ( rule__Class__Group_4_1__0__Impl rule__Class__Group_4_1__1 )
            // InternalCls.g:1757:2: rule__Class__Group_4_1__0__Impl rule__Class__Group_4_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:1764:1: rule__Class__Group_4_1__0__Impl : ( '{' ) ;
    public final void rule__Class__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1768:1: ( ( '{' ) )
            // InternalCls.g:1769:1: ( '{' )
            {
            // InternalCls.g:1769:1: ( '{' )
            // InternalCls.g:1770:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCls.g:1779:1: rule__Class__Group_4_1__1 : rule__Class__Group_4_1__1__Impl rule__Class__Group_4_1__2 ;
    public final void rule__Class__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1783:1: ( rule__Class__Group_4_1__1__Impl rule__Class__Group_4_1__2 )
            // InternalCls.g:1784:2: rule__Class__Group_4_1__1__Impl rule__Class__Group_4_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:1791:1: rule__Class__Group_4_1__1__Impl : ( ( rule__Class__CommentsAssignment_4_1_1 )? ) ;
    public final void rule__Class__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1795:1: ( ( ( rule__Class__CommentsAssignment_4_1_1 )? ) )
            // InternalCls.g:1796:1: ( ( rule__Class__CommentsAssignment_4_1_1 )? )
            {
            // InternalCls.g:1796:1: ( ( rule__Class__CommentsAssignment_4_1_1 )? )
            // InternalCls.g:1797:2: ( rule__Class__CommentsAssignment_4_1_1 )?
            {
             before(grammarAccess.getClassAccess().getCommentsAssignment_4_1_1()); 
            // InternalCls.g:1798:2: ( rule__Class__CommentsAssignment_4_1_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCls.g:1798:3: rule__Class__CommentsAssignment_4_1_1
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
    // InternalCls.g:1806:1: rule__Class__Group_4_1__2 : rule__Class__Group_4_1__2__Impl rule__Class__Group_4_1__3 ;
    public final void rule__Class__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1810:1: ( rule__Class__Group_4_1__2__Impl rule__Class__Group_4_1__3 )
            // InternalCls.g:1811:2: rule__Class__Group_4_1__2__Impl rule__Class__Group_4_1__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:1818:1: rule__Class__Group_4_1__2__Impl : ( ( rule__Class__MembersAssignment_4_1_2 )* ) ;
    public final void rule__Class__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1822:1: ( ( ( rule__Class__MembersAssignment_4_1_2 )* ) )
            // InternalCls.g:1823:1: ( ( rule__Class__MembersAssignment_4_1_2 )* )
            {
            // InternalCls.g:1823:1: ( ( rule__Class__MembersAssignment_4_1_2 )* )
            // InternalCls.g:1824:2: ( rule__Class__MembersAssignment_4_1_2 )*
            {
             before(grammarAccess.getClassAccess().getMembersAssignment_4_1_2()); 
            // InternalCls.g:1825:2: ( rule__Class__MembersAssignment_4_1_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=12 && LA25_0<=18)||(LA25_0>=45 && LA25_0<=46)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCls.g:1825:3: rule__Class__MembersAssignment_4_1_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Class__MembersAssignment_4_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalCls.g:1833:1: rule__Class__Group_4_1__3 : rule__Class__Group_4_1__3__Impl ;
    public final void rule__Class__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1837:1: ( rule__Class__Group_4_1__3__Impl )
            // InternalCls.g:1838:2: rule__Class__Group_4_1__3__Impl
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
    // InternalCls.g:1844:1: rule__Class__Group_4_1__3__Impl : ( '}' ) ;
    public final void rule__Class__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1848:1: ( ( '}' ) )
            // InternalCls.g:1849:1: ( '}' )
            {
            // InternalCls.g:1849:1: ( '}' )
            // InternalCls.g:1850:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_1_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCls.g:1860:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1864:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalCls.g:1865:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:1872:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__VisibilityAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1876:1: ( ( ( rule__Interface__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1877:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1877:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            // InternalCls.g:1878:2: ( rule__Interface__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1879:2: ( rule__Interface__VisibilityAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=12 && LA26_0<=18)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:1879:3: rule__Interface__VisibilityAssignment_0
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
    // InternalCls.g:1887:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1891:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalCls.g:1892:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
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
    // InternalCls.g:1899:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1903:1: ( ( 'interface' ) )
            // InternalCls.g:1904:1: ( 'interface' )
            {
            // InternalCls.g:1904:1: ( 'interface' )
            // InternalCls.g:1905:2: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCls.g:1914:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1918:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalCls.g:1919:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalCls.g:1926:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__Alternatives_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1930:1: ( ( ( rule__Interface__Alternatives_2 ) ) )
            // InternalCls.g:1931:1: ( ( rule__Interface__Alternatives_2 ) )
            {
            // InternalCls.g:1931:1: ( ( rule__Interface__Alternatives_2 ) )
            // InternalCls.g:1932:2: ( rule__Interface__Alternatives_2 )
            {
             before(grammarAccess.getInterfaceAccess().getAlternatives_2()); 
            // InternalCls.g:1933:2: ( rule__Interface__Alternatives_2 )
            // InternalCls.g:1933:3: rule__Interface__Alternatives_2
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
    // InternalCls.g:1941:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1945:1: ( rule__Interface__Group__3__Impl )
            // InternalCls.g:1946:2: rule__Interface__Group__3__Impl
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
    // InternalCls.g:1952:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__Alternatives_3 ) ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1956:1: ( ( ( rule__Interface__Alternatives_3 ) ) )
            // InternalCls.g:1957:1: ( ( rule__Interface__Alternatives_3 ) )
            {
            // InternalCls.g:1957:1: ( ( rule__Interface__Alternatives_3 ) )
            // InternalCls.g:1958:2: ( rule__Interface__Alternatives_3 )
            {
             before(grammarAccess.getInterfaceAccess().getAlternatives_3()); 
            // InternalCls.g:1959:2: ( rule__Interface__Alternatives_3 )
            // InternalCls.g:1959:3: rule__Interface__Alternatives_3
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


    // $ANTLR start "rule__Interface__Group_2_0__0"
    // InternalCls.g:1968:1: rule__Interface__Group_2_0__0 : rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1 ;
    public final void rule__Interface__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1972:1: ( rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1 )
            // InternalCls.g:1973:2: rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCls.g:1980:1: rule__Interface__Group_2_0__0__Impl : ( ( rule__Interface__NameAssignment_2_0_0 ) ) ;
    public final void rule__Interface__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1984:1: ( ( ( rule__Interface__NameAssignment_2_0_0 ) ) )
            // InternalCls.g:1985:1: ( ( rule__Interface__NameAssignment_2_0_0 ) )
            {
            // InternalCls.g:1985:1: ( ( rule__Interface__NameAssignment_2_0_0 ) )
            // InternalCls.g:1986:2: ( rule__Interface__NameAssignment_2_0_0 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2_0_0()); 
            // InternalCls.g:1987:2: ( rule__Interface__NameAssignment_2_0_0 )
            // InternalCls.g:1987:3: rule__Interface__NameAssignment_2_0_0
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
    // InternalCls.g:1995:1: rule__Interface__Group_2_0__1 : rule__Interface__Group_2_0__1__Impl rule__Interface__Group_2_0__2 ;
    public final void rule__Interface__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1999:1: ( rule__Interface__Group_2_0__1__Impl rule__Interface__Group_2_0__2 )
            // InternalCls.g:2000:2: rule__Interface__Group_2_0__1__Impl rule__Interface__Group_2_0__2
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
    // InternalCls.g:2007:1: rule__Interface__Group_2_0__1__Impl : ( 'as' ) ;
    public final void rule__Interface__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2011:1: ( ( 'as' ) )
            // InternalCls.g:2012:1: ( 'as' )
            {
            // InternalCls.g:2012:1: ( 'as' )
            // InternalCls.g:2013:2: 'as'
            {
             before(grammarAccess.getInterfaceAccess().getAsKeyword_2_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCls.g:2022:1: rule__Interface__Group_2_0__2 : rule__Interface__Group_2_0__2__Impl ;
    public final void rule__Interface__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2026:1: ( rule__Interface__Group_2_0__2__Impl )
            // InternalCls.g:2027:2: rule__Interface__Group_2_0__2__Impl
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
    // InternalCls.g:2033:1: rule__Interface__Group_2_0__2__Impl : ( ( rule__Interface__AliasAssignment_2_0_2 ) ) ;
    public final void rule__Interface__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2037:1: ( ( ( rule__Interface__AliasAssignment_2_0_2 ) ) )
            // InternalCls.g:2038:1: ( ( rule__Interface__AliasAssignment_2_0_2 ) )
            {
            // InternalCls.g:2038:1: ( ( rule__Interface__AliasAssignment_2_0_2 ) )
            // InternalCls.g:2039:2: ( rule__Interface__AliasAssignment_2_0_2 )
            {
             before(grammarAccess.getInterfaceAccess().getAliasAssignment_2_0_2()); 
            // InternalCls.g:2040:2: ( rule__Interface__AliasAssignment_2_0_2 )
            // InternalCls.g:2040:3: rule__Interface__AliasAssignment_2_0_2
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


    // $ANTLR start "rule__Interface__Group_3_1__0"
    // InternalCls.g:2049:1: rule__Interface__Group_3_1__0 : rule__Interface__Group_3_1__0__Impl rule__Interface__Group_3_1__1 ;
    public final void rule__Interface__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2053:1: ( rule__Interface__Group_3_1__0__Impl rule__Interface__Group_3_1__1 )
            // InternalCls.g:2054:2: rule__Interface__Group_3_1__0__Impl rule__Interface__Group_3_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:2061:1: rule__Interface__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__Interface__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2065:1: ( ( '{' ) )
            // InternalCls.g:2066:1: ( '{' )
            {
            // InternalCls.g:2066:1: ( '{' )
            // InternalCls.g:2067:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCls.g:2076:1: rule__Interface__Group_3_1__1 : rule__Interface__Group_3_1__1__Impl rule__Interface__Group_3_1__2 ;
    public final void rule__Interface__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2080:1: ( rule__Interface__Group_3_1__1__Impl rule__Interface__Group_3_1__2 )
            // InternalCls.g:2081:2: rule__Interface__Group_3_1__1__Impl rule__Interface__Group_3_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:2088:1: rule__Interface__Group_3_1__1__Impl : ( ( rule__Interface__CommentsAssignment_3_1_1 )? ) ;
    public final void rule__Interface__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2092:1: ( ( ( rule__Interface__CommentsAssignment_3_1_1 )? ) )
            // InternalCls.g:2093:1: ( ( rule__Interface__CommentsAssignment_3_1_1 )? )
            {
            // InternalCls.g:2093:1: ( ( rule__Interface__CommentsAssignment_3_1_1 )? )
            // InternalCls.g:2094:2: ( rule__Interface__CommentsAssignment_3_1_1 )?
            {
             before(grammarAccess.getInterfaceAccess().getCommentsAssignment_3_1_1()); 
            // InternalCls.g:2095:2: ( rule__Interface__CommentsAssignment_3_1_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:2095:3: rule__Interface__CommentsAssignment_3_1_1
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
    // InternalCls.g:2103:1: rule__Interface__Group_3_1__2 : rule__Interface__Group_3_1__2__Impl rule__Interface__Group_3_1__3 ;
    public final void rule__Interface__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2107:1: ( rule__Interface__Group_3_1__2__Impl rule__Interface__Group_3_1__3 )
            // InternalCls.g:2108:2: rule__Interface__Group_3_1__2__Impl rule__Interface__Group_3_1__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalCls.g:2115:1: rule__Interface__Group_3_1__2__Impl : ( ( rule__Interface__MembersAssignment_3_1_2 )* ) ;
    public final void rule__Interface__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2119:1: ( ( ( rule__Interface__MembersAssignment_3_1_2 )* ) )
            // InternalCls.g:2120:1: ( ( rule__Interface__MembersAssignment_3_1_2 )* )
            {
            // InternalCls.g:2120:1: ( ( rule__Interface__MembersAssignment_3_1_2 )* )
            // InternalCls.g:2121:2: ( rule__Interface__MembersAssignment_3_1_2 )*
            {
             before(grammarAccess.getInterfaceAccess().getMembersAssignment_3_1_2()); 
            // InternalCls.g:2122:2: ( rule__Interface__MembersAssignment_3_1_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=12 && LA28_0<=18)||(LA28_0>=45 && LA28_0<=46)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCls.g:2122:3: rule__Interface__MembersAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Interface__MembersAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalCls.g:2130:1: rule__Interface__Group_3_1__3 : rule__Interface__Group_3_1__3__Impl ;
    public final void rule__Interface__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2134:1: ( rule__Interface__Group_3_1__3__Impl )
            // InternalCls.g:2135:2: rule__Interface__Group_3_1__3__Impl
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
    // InternalCls.g:2141:1: rule__Interface__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__Interface__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2145:1: ( ( '}' ) )
            // InternalCls.g:2146:1: ( '}' )
            {
            // InternalCls.g:2146:1: ( '}' )
            // InternalCls.g:2147:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCls.g:2157:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2161:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalCls.g:2162:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:2169:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2173:1: ( ( () ) )
            // InternalCls.g:2174:1: ( () )
            {
            // InternalCls.g:2174:1: ( () )
            // InternalCls.g:2175:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalCls.g:2176:2: ()
            // InternalCls.g:2176:3: 
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
    // InternalCls.g:2184:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2188:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalCls.g:2189:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:2196:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__VisibilityAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2200:1: ( ( ( rule__Attribute__VisibilityAssignment_1 )? ) )
            // InternalCls.g:2201:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            {
            // InternalCls.g:2201:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            // InternalCls.g:2202:2: ( rule__Attribute__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 
            // InternalCls.g:2203:2: ( rule__Attribute__VisibilityAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=12 && LA29_0<=18)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:2203:3: rule__Attribute__VisibilityAssignment_1
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
    // InternalCls.g:2211:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2215:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalCls.g:2216:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:2223:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__StaticAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2227:1: ( ( ( rule__Attribute__StaticAssignment_2 )? ) )
            // InternalCls.g:2228:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            {
            // InternalCls.g:2228:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            // InternalCls.g:2229:2: ( rule__Attribute__StaticAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getStaticAssignment_2()); 
            // InternalCls.g:2230:2: ( rule__Attribute__StaticAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCls.g:2230:3: rule__Attribute__StaticAssignment_2
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
    // InternalCls.g:2238:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2242:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalCls.g:2243:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:2250:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2254:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // InternalCls.g:2255:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // InternalCls.g:2255:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // InternalCls.g:2256:2: ( rule__Attribute__NameAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            // InternalCls.g:2257:2: ( rule__Attribute__NameAssignment_3 )
            // InternalCls.g:2257:3: rule__Attribute__NameAssignment_3
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
    // InternalCls.g:2265:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2269:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalCls.g:2270:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalCls.g:2277:1: rule__Attribute__Group__4__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2281:1: ( ( ':' ) )
            // InternalCls.g:2282:1: ( ':' )
            {
            // InternalCls.g:2282:1: ( ':' )
            // InternalCls.g:2283:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCls.g:2292:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2296:1: ( rule__Attribute__Group__5__Impl )
            // InternalCls.g:2297:2: rule__Attribute__Group__5__Impl
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
    // InternalCls.g:2303:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__TypeAssignment_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2307:1: ( ( ( rule__Attribute__TypeAssignment_5 ) ) )
            // InternalCls.g:2308:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            {
            // InternalCls.g:2308:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            // InternalCls.g:2309:2: ( rule__Attribute__TypeAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 
            // InternalCls.g:2310:2: ( rule__Attribute__TypeAssignment_5 )
            // InternalCls.g:2310:3: rule__Attribute__TypeAssignment_5
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
    // InternalCls.g:2319:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2323:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalCls.g:2324:2: rule__Method__Group__0__Impl rule__Method__Group__1
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
    // InternalCls.g:2331:1: rule__Method__Group__0__Impl : ( ( rule__Method__VisibilityAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2335:1: ( ( ( rule__Method__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2336:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2336:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            // InternalCls.g:2337:2: ( rule__Method__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2338:2: ( rule__Method__VisibilityAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=12 && LA31_0<=18)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCls.g:2338:3: rule__Method__VisibilityAssignment_0
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
    // InternalCls.g:2346:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2350:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalCls.g:2351:2: rule__Method__Group__1__Impl rule__Method__Group__2
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
    // InternalCls.g:2358:1: rule__Method__Group__1__Impl : ( ( rule__Method__AbstractAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2362:1: ( ( ( rule__Method__AbstractAssignment_1 )? ) )
            // InternalCls.g:2363:1: ( ( rule__Method__AbstractAssignment_1 )? )
            {
            // InternalCls.g:2363:1: ( ( rule__Method__AbstractAssignment_1 )? )
            // InternalCls.g:2364:2: ( rule__Method__AbstractAssignment_1 )?
            {
             before(grammarAccess.getMethodAccess().getAbstractAssignment_1()); 
            // InternalCls.g:2365:2: ( rule__Method__AbstractAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCls.g:2365:3: rule__Method__AbstractAssignment_1
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
    // InternalCls.g:2373:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2377:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalCls.g:2378:2: rule__Method__Group__2__Impl rule__Method__Group__3
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
    // InternalCls.g:2385:1: rule__Method__Group__2__Impl : ( ( rule__Method__StaticAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2389:1: ( ( ( rule__Method__StaticAssignment_2 )? ) )
            // InternalCls.g:2390:1: ( ( rule__Method__StaticAssignment_2 )? )
            {
            // InternalCls.g:2390:1: ( ( rule__Method__StaticAssignment_2 )? )
            // InternalCls.g:2391:2: ( rule__Method__StaticAssignment_2 )?
            {
             before(grammarAccess.getMethodAccess().getStaticAssignment_2()); 
            // InternalCls.g:2392:2: ( rule__Method__StaticAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:2392:3: rule__Method__StaticAssignment_2
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
    // InternalCls.g:2400:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2404:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalCls.g:2405:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalCls.g:2412:1: rule__Method__Group__3__Impl : ( ( rule__Method__NameAssignment_3 ) ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2416:1: ( ( ( rule__Method__NameAssignment_3 ) ) )
            // InternalCls.g:2417:1: ( ( rule__Method__NameAssignment_3 ) )
            {
            // InternalCls.g:2417:1: ( ( rule__Method__NameAssignment_3 ) )
            // InternalCls.g:2418:2: ( rule__Method__NameAssignment_3 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_3()); 
            // InternalCls.g:2419:2: ( rule__Method__NameAssignment_3 )
            // InternalCls.g:2419:3: rule__Method__NameAssignment_3
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
    // InternalCls.g:2427:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2431:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalCls.g:2432:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalCls.g:2439:1: rule__Method__Group__4__Impl : ( '(' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2443:1: ( ( '(' ) )
            // InternalCls.g:2444:1: ( '(' )
            {
            // InternalCls.g:2444:1: ( '(' )
            // InternalCls.g:2445:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCls.g:2454:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2458:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalCls.g:2459:2: rule__Method__Group__5__Impl rule__Method__Group__6
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
    // InternalCls.g:2466:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )* ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2470:1: ( ( ( rule__Method__Group_5__0 )* ) )
            // InternalCls.g:2471:1: ( ( rule__Method__Group_5__0 )* )
            {
            // InternalCls.g:2471:1: ( ( rule__Method__Group_5__0 )* )
            // InternalCls.g:2472:2: ( rule__Method__Group_5__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // InternalCls.g:2473:2: ( rule__Method__Group_5__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||(LA34_0>=12 && LA34_0<=18)||LA34_0==46) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCls.g:2473:3: rule__Method__Group_5__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Method__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalCls.g:2481:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2485:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalCls.g:2486:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:2493:1: rule__Method__Group__6__Impl : ( ')' ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2497:1: ( ( ')' ) )
            // InternalCls.g:2498:1: ( ')' )
            {
            // InternalCls.g:2498:1: ( ')' )
            // InternalCls.g:2499:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCls.g:2508:1: rule__Method__Group__7 : rule__Method__Group__7__Impl ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2512:1: ( rule__Method__Group__7__Impl )
            // InternalCls.g:2513:2: rule__Method__Group__7__Impl
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
    // InternalCls.g:2519:1: rule__Method__Group__7__Impl : ( ( rule__Method__Group_7__0 )? ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2523:1: ( ( ( rule__Method__Group_7__0 )? ) )
            // InternalCls.g:2524:1: ( ( rule__Method__Group_7__0 )? )
            {
            // InternalCls.g:2524:1: ( ( rule__Method__Group_7__0 )? )
            // InternalCls.g:2525:2: ( rule__Method__Group_7__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_7()); 
            // InternalCls.g:2526:2: ( rule__Method__Group_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:2526:3: rule__Method__Group_7__0
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
    // InternalCls.g:2535:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2539:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // InternalCls.g:2540:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCls.g:2547:1: rule__Method__Group_5__0__Impl : ( ( rule__Method__ParametersAssignment_5_0 ) ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2551:1: ( ( ( rule__Method__ParametersAssignment_5_0 ) ) )
            // InternalCls.g:2552:1: ( ( rule__Method__ParametersAssignment_5_0 ) )
            {
            // InternalCls.g:2552:1: ( ( rule__Method__ParametersAssignment_5_0 ) )
            // InternalCls.g:2553:2: ( rule__Method__ParametersAssignment_5_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_5_0()); 
            // InternalCls.g:2554:2: ( rule__Method__ParametersAssignment_5_0 )
            // InternalCls.g:2554:3: rule__Method__ParametersAssignment_5_0
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
    // InternalCls.g:2562:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2566:1: ( rule__Method__Group_5__1__Impl )
            // InternalCls.g:2567:2: rule__Method__Group_5__1__Impl
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
    // InternalCls.g:2573:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__Group_5_1__0 )* ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2577:1: ( ( ( rule__Method__Group_5_1__0 )* ) )
            // InternalCls.g:2578:1: ( ( rule__Method__Group_5_1__0 )* )
            {
            // InternalCls.g:2578:1: ( ( rule__Method__Group_5_1__0 )* )
            // InternalCls.g:2579:2: ( rule__Method__Group_5_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_5_1()); 
            // InternalCls.g:2580:2: ( rule__Method__Group_5_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalCls.g:2580:3: rule__Method__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Method__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalCls.g:2589:1: rule__Method__Group_5_1__0 : rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1 ;
    public final void rule__Method__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2593:1: ( rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1 )
            // InternalCls.g:2594:2: rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:2601:1: rule__Method__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2605:1: ( ( ',' ) )
            // InternalCls.g:2606:1: ( ',' )
            {
            // InternalCls.g:2606:1: ( ',' )
            // InternalCls.g:2607:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_5_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCls.g:2616:1: rule__Method__Group_5_1__1 : rule__Method__Group_5_1__1__Impl ;
    public final void rule__Method__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2620:1: ( rule__Method__Group_5_1__1__Impl )
            // InternalCls.g:2621:2: rule__Method__Group_5_1__1__Impl
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
    // InternalCls.g:2627:1: rule__Method__Group_5_1__1__Impl : ( ( rule__Method__ParametersAssignment_5_1_1 ) ) ;
    public final void rule__Method__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2631:1: ( ( ( rule__Method__ParametersAssignment_5_1_1 ) ) )
            // InternalCls.g:2632:1: ( ( rule__Method__ParametersAssignment_5_1_1 ) )
            {
            // InternalCls.g:2632:1: ( ( rule__Method__ParametersAssignment_5_1_1 ) )
            // InternalCls.g:2633:2: ( rule__Method__ParametersAssignment_5_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_5_1_1()); 
            // InternalCls.g:2634:2: ( rule__Method__ParametersAssignment_5_1_1 )
            // InternalCls.g:2634:3: rule__Method__ParametersAssignment_5_1_1
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
    // InternalCls.g:2643:1: rule__Method__Group_7__0 : rule__Method__Group_7__0__Impl rule__Method__Group_7__1 ;
    public final void rule__Method__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2647:1: ( rule__Method__Group_7__0__Impl rule__Method__Group_7__1 )
            // InternalCls.g:2648:2: rule__Method__Group_7__0__Impl rule__Method__Group_7__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:2655:1: rule__Method__Group_7__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2659:1: ( ( ':' ) )
            // InternalCls.g:2660:1: ( ':' )
            {
            // InternalCls.g:2660:1: ( ':' )
            // InternalCls.g:2661:2: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_7_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCls.g:2670:1: rule__Method__Group_7__1 : rule__Method__Group_7__1__Impl ;
    public final void rule__Method__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2674:1: ( rule__Method__Group_7__1__Impl )
            // InternalCls.g:2675:2: rule__Method__Group_7__1__Impl
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
    // InternalCls.g:2681:1: rule__Method__Group_7__1__Impl : ( ( rule__Method__TypeAssignment_7_1 ) ) ;
    public final void rule__Method__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2685:1: ( ( ( rule__Method__TypeAssignment_7_1 ) ) )
            // InternalCls.g:2686:1: ( ( rule__Method__TypeAssignment_7_1 ) )
            {
            // InternalCls.g:2686:1: ( ( rule__Method__TypeAssignment_7_1 ) )
            // InternalCls.g:2687:2: ( rule__Method__TypeAssignment_7_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_7_1()); 
            // InternalCls.g:2688:2: ( rule__Method__TypeAssignment_7_1 )
            // InternalCls.g:2688:3: rule__Method__TypeAssignment_7_1
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
    // InternalCls.g:2697:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2701:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCls.g:2702:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:2709:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__VisibilityAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2713:1: ( ( ( rule__Parameter__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2714:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2714:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            // InternalCls.g:2715:2: ( rule__Parameter__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2716:2: ( rule__Parameter__VisibilityAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=12 && LA37_0<=18)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCls.g:2716:3: rule__Parameter__VisibilityAssignment_0
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
    // InternalCls.g:2724:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2728:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCls.g:2729:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalCls.g:2736:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__StaticAssignment_1 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2740:1: ( ( ( rule__Parameter__StaticAssignment_1 )? ) )
            // InternalCls.g:2741:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            {
            // InternalCls.g:2741:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            // InternalCls.g:2742:2: ( rule__Parameter__StaticAssignment_1 )?
            {
             before(grammarAccess.getParameterAccess().getStaticAssignment_1()); 
            // InternalCls.g:2743:2: ( rule__Parameter__StaticAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:2743:3: rule__Parameter__StaticAssignment_1
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
    // InternalCls.g:2751:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2755:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCls.g:2756:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:2763:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2767:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalCls.g:2768:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalCls.g:2768:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalCls.g:2769:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalCls.g:2770:2: ( rule__Parameter__NameAssignment_2 )
            // InternalCls.g:2770:3: rule__Parameter__NameAssignment_2
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
    // InternalCls.g:2778:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2782:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalCls.g:2783:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
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
    // InternalCls.g:2790:1: rule__Parameter__Group__3__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2794:1: ( ( ':' ) )
            // InternalCls.g:2795:1: ( ':' )
            {
            // InternalCls.g:2795:1: ( ':' )
            // InternalCls.g:2796:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCls.g:2805:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2809:1: ( rule__Parameter__Group__4__Impl )
            // InternalCls.g:2810:2: rule__Parameter__Group__4__Impl
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
    // InternalCls.g:2816:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__TypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2820:1: ( ( ( rule__Parameter__TypeAssignment_4 ) ) )
            // InternalCls.g:2821:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            {
            // InternalCls.g:2821:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            // InternalCls.g:2822:2: ( rule__Parameter__TypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_4()); 
            // InternalCls.g:2823:2: ( rule__Parameter__TypeAssignment_4 )
            // InternalCls.g:2823:3: rule__Parameter__TypeAssignment_4
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
    // InternalCls.g:2832:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2836:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalCls.g:2837:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
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
    // InternalCls.g:2844:1: rule__Generalization__Group__0__Impl : ( 'isa' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2848:1: ( ( 'isa' ) )
            // InternalCls.g:2849:1: ( 'isa' )
            {
            // InternalCls.g:2849:1: ( 'isa' )
            // InternalCls.g:2850:2: 'isa'
            {
             before(grammarAccess.getGeneralizationAccess().getIsaKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCls.g:2859:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2863:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalCls.g:2864:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
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
    // InternalCls.g:2871:1: rule__Generalization__Group__1__Impl : ( '(' ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2875:1: ( ( '(' ) )
            // InternalCls.g:2876:1: ( '(' )
            {
            // InternalCls.g:2876:1: ( '(' )
            // InternalCls.g:2877:2: '('
            {
             before(grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCls.g:2886:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2890:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalCls.g:2891:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalCls.g:2898:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__LeftAssignment_2 ) ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2902:1: ( ( ( rule__Generalization__LeftAssignment_2 ) ) )
            // InternalCls.g:2903:1: ( ( rule__Generalization__LeftAssignment_2 ) )
            {
            // InternalCls.g:2903:1: ( ( rule__Generalization__LeftAssignment_2 ) )
            // InternalCls.g:2904:2: ( rule__Generalization__LeftAssignment_2 )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssignment_2()); 
            // InternalCls.g:2905:2: ( rule__Generalization__LeftAssignment_2 )
            // InternalCls.g:2905:3: rule__Generalization__LeftAssignment_2
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
    // InternalCls.g:2913:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2917:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalCls.g:2918:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
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
    // InternalCls.g:2925:1: rule__Generalization__Group__3__Impl : ( ',' ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2929:1: ( ( ',' ) )
            // InternalCls.g:2930:1: ( ',' )
            {
            // InternalCls.g:2930:1: ( ',' )
            // InternalCls.g:2931:2: ','
            {
             before(grammarAccess.getGeneralizationAccess().getCommaKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCls.g:2940:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2944:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalCls.g:2945:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
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
    // InternalCls.g:2952:1: rule__Generalization__Group__4__Impl : ( ( rule__Generalization__RightAssignment_4 ) ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2956:1: ( ( ( rule__Generalization__RightAssignment_4 ) ) )
            // InternalCls.g:2957:1: ( ( rule__Generalization__RightAssignment_4 ) )
            {
            // InternalCls.g:2957:1: ( ( rule__Generalization__RightAssignment_4 ) )
            // InternalCls.g:2958:2: ( rule__Generalization__RightAssignment_4 )
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssignment_4()); 
            // InternalCls.g:2959:2: ( rule__Generalization__RightAssignment_4 )
            // InternalCls.g:2959:3: rule__Generalization__RightAssignment_4
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
    // InternalCls.g:2967:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2971:1: ( rule__Generalization__Group__5__Impl )
            // InternalCls.g:2972:2: rule__Generalization__Group__5__Impl
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
    // InternalCls.g:2978:1: rule__Generalization__Group__5__Impl : ( ')' ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2982:1: ( ( ')' ) )
            // InternalCls.g:2983:1: ( ')' )
            {
            // InternalCls.g:2983:1: ( ')' )
            // InternalCls.g:2984:2: ')'
            {
             before(grammarAccess.getGeneralizationAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCls.g:2994:1: rule__Implementation__Group__0 : rule__Implementation__Group__0__Impl rule__Implementation__Group__1 ;
    public final void rule__Implementation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2998:1: ( rule__Implementation__Group__0__Impl rule__Implementation__Group__1 )
            // InternalCls.g:2999:2: rule__Implementation__Group__0__Impl rule__Implementation__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalCls.g:3006:1: rule__Implementation__Group__0__Impl : ( 'impl' ) ;
    public final void rule__Implementation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3010:1: ( ( 'impl' ) )
            // InternalCls.g:3011:1: ( 'impl' )
            {
            // InternalCls.g:3011:1: ( 'impl' )
            // InternalCls.g:3012:2: 'impl'
            {
             before(grammarAccess.getImplementationAccess().getImplKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCls.g:3021:1: rule__Implementation__Group__1 : rule__Implementation__Group__1__Impl rule__Implementation__Group__2 ;
    public final void rule__Implementation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3025:1: ( rule__Implementation__Group__1__Impl rule__Implementation__Group__2 )
            // InternalCls.g:3026:2: rule__Implementation__Group__1__Impl rule__Implementation__Group__2
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
    // InternalCls.g:3033:1: rule__Implementation__Group__1__Impl : ( '(' ) ;
    public final void rule__Implementation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3037:1: ( ( '(' ) )
            // InternalCls.g:3038:1: ( '(' )
            {
            // InternalCls.g:3038:1: ( '(' )
            // InternalCls.g:3039:2: '('
            {
             before(grammarAccess.getImplementationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCls.g:3048:1: rule__Implementation__Group__2 : rule__Implementation__Group__2__Impl rule__Implementation__Group__3 ;
    public final void rule__Implementation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3052:1: ( rule__Implementation__Group__2__Impl rule__Implementation__Group__3 )
            // InternalCls.g:3053:2: rule__Implementation__Group__2__Impl rule__Implementation__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalCls.g:3060:1: rule__Implementation__Group__2__Impl : ( ( rule__Implementation__LeftAssignment_2 ) ) ;
    public final void rule__Implementation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3064:1: ( ( ( rule__Implementation__LeftAssignment_2 ) ) )
            // InternalCls.g:3065:1: ( ( rule__Implementation__LeftAssignment_2 ) )
            {
            // InternalCls.g:3065:1: ( ( rule__Implementation__LeftAssignment_2 ) )
            // InternalCls.g:3066:2: ( rule__Implementation__LeftAssignment_2 )
            {
             before(grammarAccess.getImplementationAccess().getLeftAssignment_2()); 
            // InternalCls.g:3067:2: ( rule__Implementation__LeftAssignment_2 )
            // InternalCls.g:3067:3: rule__Implementation__LeftAssignment_2
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
    // InternalCls.g:3075:1: rule__Implementation__Group__3 : rule__Implementation__Group__3__Impl rule__Implementation__Group__4 ;
    public final void rule__Implementation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3079:1: ( rule__Implementation__Group__3__Impl rule__Implementation__Group__4 )
            // InternalCls.g:3080:2: rule__Implementation__Group__3__Impl rule__Implementation__Group__4
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
    // InternalCls.g:3087:1: rule__Implementation__Group__3__Impl : ( ',' ) ;
    public final void rule__Implementation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3091:1: ( ( ',' ) )
            // InternalCls.g:3092:1: ( ',' )
            {
            // InternalCls.g:3092:1: ( ',' )
            // InternalCls.g:3093:2: ','
            {
             before(grammarAccess.getImplementationAccess().getCommaKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCls.g:3102:1: rule__Implementation__Group__4 : rule__Implementation__Group__4__Impl rule__Implementation__Group__5 ;
    public final void rule__Implementation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3106:1: ( rule__Implementation__Group__4__Impl rule__Implementation__Group__5 )
            // InternalCls.g:3107:2: rule__Implementation__Group__4__Impl rule__Implementation__Group__5
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
    // InternalCls.g:3114:1: rule__Implementation__Group__4__Impl : ( ( rule__Implementation__RightAssignment_4 ) ) ;
    public final void rule__Implementation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3118:1: ( ( ( rule__Implementation__RightAssignment_4 ) ) )
            // InternalCls.g:3119:1: ( ( rule__Implementation__RightAssignment_4 ) )
            {
            // InternalCls.g:3119:1: ( ( rule__Implementation__RightAssignment_4 ) )
            // InternalCls.g:3120:2: ( rule__Implementation__RightAssignment_4 )
            {
             before(grammarAccess.getImplementationAccess().getRightAssignment_4()); 
            // InternalCls.g:3121:2: ( rule__Implementation__RightAssignment_4 )
            // InternalCls.g:3121:3: rule__Implementation__RightAssignment_4
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
    // InternalCls.g:3129:1: rule__Implementation__Group__5 : rule__Implementation__Group__5__Impl ;
    public final void rule__Implementation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3133:1: ( rule__Implementation__Group__5__Impl )
            // InternalCls.g:3134:2: rule__Implementation__Group__5__Impl
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
    // InternalCls.g:3140:1: rule__Implementation__Group__5__Impl : ( ')' ) ;
    public final void rule__Implementation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3144:1: ( ( ')' ) )
            // InternalCls.g:3145:1: ( ')' )
            {
            // InternalCls.g:3145:1: ( ')' )
            // InternalCls.g:3146:2: ')'
            {
             before(grammarAccess.getImplementationAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCls.g:3156:1: rule__XtextAssociation__Group__0 : rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1 ;
    public final void rule__XtextAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3160:1: ( rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1 )
            // InternalCls.g:3161:2: rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1
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
    // InternalCls.g:3168:1: rule__XtextAssociation__Group__0__Impl : ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? ) ;
    public final void rule__XtextAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3172:1: ( ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? ) )
            // InternalCls.g:3173:1: ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? )
            {
            // InternalCls.g:3173:1: ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? )
            // InternalCls.g:3174:2: ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityAssignment_0()); 
            // InternalCls.g:3175:2: ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCls.g:3175:3: rule__XtextAssociation__TwoSideBidirectionalityAssignment_0
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
    // InternalCls.g:3183:1: rule__XtextAssociation__Group__1 : rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2 ;
    public final void rule__XtextAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3187:1: ( rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2 )
            // InternalCls.g:3188:2: rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2
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
    // InternalCls.g:3195:1: rule__XtextAssociation__Group__1__Impl : ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) ) ;
    public final void rule__XtextAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3199:1: ( ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) ) )
            // InternalCls.g:3200:1: ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) )
            {
            // InternalCls.g:3200:1: ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) )
            // InternalCls.g:3201:2: ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideAggregationKindAssignment_1()); 
            // InternalCls.g:3202:2: ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 )
            // InternalCls.g:3202:3: rule__XtextAssociation__TwoSideAggregationKindAssignment_1
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
    // InternalCls.g:3210:1: rule__XtextAssociation__Group__2 : rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3 ;
    public final void rule__XtextAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3214:1: ( rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3 )
            // InternalCls.g:3215:2: rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalCls.g:3222:1: rule__XtextAssociation__Group__2__Impl : ( ( rule__XtextAssociation__NameAssignment_2 ) ) ;
    public final void rule__XtextAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3226:1: ( ( ( rule__XtextAssociation__NameAssignment_2 ) ) )
            // InternalCls.g:3227:1: ( ( rule__XtextAssociation__NameAssignment_2 ) )
            {
            // InternalCls.g:3227:1: ( ( rule__XtextAssociation__NameAssignment_2 ) )
            // InternalCls.g:3228:2: ( rule__XtextAssociation__NameAssignment_2 )
            {
             before(grammarAccess.getXtextAssociationAccess().getNameAssignment_2()); 
            // InternalCls.g:3229:2: ( rule__XtextAssociation__NameAssignment_2 )
            // InternalCls.g:3229:3: rule__XtextAssociation__NameAssignment_2
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
    // InternalCls.g:3237:1: rule__XtextAssociation__Group__3 : rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4 ;
    public final void rule__XtextAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3241:1: ( rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4 )
            // InternalCls.g:3242:2: rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:3249:1: rule__XtextAssociation__Group__3__Impl : ( '(' ) ;
    public final void rule__XtextAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3253:1: ( ( '(' ) )
            // InternalCls.g:3254:1: ( '(' )
            {
            // InternalCls.g:3254:1: ( '(' )
            // InternalCls.g:3255:2: '('
            {
             before(grammarAccess.getXtextAssociationAccess().getLeftParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCls.g:3264:1: rule__XtextAssociation__Group__4 : rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5 ;
    public final void rule__XtextAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3268:1: ( rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5 )
            // InternalCls.g:3269:2: rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:3276:1: rule__XtextAssociation__Group__4__Impl : ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) ) ;
    public final void rule__XtextAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3280:1: ( ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) ) )
            // InternalCls.g:3281:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) )
            {
            // InternalCls.g:3281:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) )
            // InternalCls.g:3282:2: ( rule__XtextAssociation__MemberEndTypesAssignment_4 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_4()); 
            // InternalCls.g:3283:2: ( rule__XtextAssociation__MemberEndTypesAssignment_4 )
            // InternalCls.g:3283:3: rule__XtextAssociation__MemberEndTypesAssignment_4
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
    // InternalCls.g:3291:1: rule__XtextAssociation__Group__5 : rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6 ;
    public final void rule__XtextAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3295:1: ( rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6 )
            // InternalCls.g:3296:2: rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:3303:1: rule__XtextAssociation__Group__5__Impl : ( ( rule__XtextAssociation__Group_5__0 )* ) ;
    public final void rule__XtextAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3307:1: ( ( ( rule__XtextAssociation__Group_5__0 )* ) )
            // InternalCls.g:3308:1: ( ( rule__XtextAssociation__Group_5__0 )* )
            {
            // InternalCls.g:3308:1: ( ( rule__XtextAssociation__Group_5__0 )* )
            // InternalCls.g:3309:2: ( rule__XtextAssociation__Group_5__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_5()); 
            // InternalCls.g:3310:2: ( rule__XtextAssociation__Group_5__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==36) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCls.g:3310:3: rule__XtextAssociation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__XtextAssociation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalCls.g:3318:1: rule__XtextAssociation__Group__6 : rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7 ;
    public final void rule__XtextAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3322:1: ( rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7 )
            // InternalCls.g:3323:2: rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalCls.g:3330:1: rule__XtextAssociation__Group__6__Impl : ( ')' ) ;
    public final void rule__XtextAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3334:1: ( ( ')' ) )
            // InternalCls.g:3335:1: ( ')' )
            {
            // InternalCls.g:3335:1: ( ')' )
            // InternalCls.g:3336:2: ')'
            {
             before(grammarAccess.getXtextAssociationAccess().getRightParenthesisKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCls.g:3345:1: rule__XtextAssociation__Group__7 : rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8 ;
    public final void rule__XtextAssociation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3349:1: ( rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8 )
            // InternalCls.g:3350:2: rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8
            {
            pushFollow(FOLLOW_35);
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
    // InternalCls.g:3357:1: rule__XtextAssociation__Group__7__Impl : ( ( rule__XtextAssociation__Group_7__0 )? ) ;
    public final void rule__XtextAssociation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3361:1: ( ( ( rule__XtextAssociation__Group_7__0 )? ) )
            // InternalCls.g:3362:1: ( ( rule__XtextAssociation__Group_7__0 )? )
            {
            // InternalCls.g:3362:1: ( ( rule__XtextAssociation__Group_7__0 )? )
            // InternalCls.g:3363:2: ( rule__XtextAssociation__Group_7__0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_7()); 
            // InternalCls.g:3364:2: ( rule__XtextAssociation__Group_7__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCls.g:3364:3: rule__XtextAssociation__Group_7__0
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
    // InternalCls.g:3372:1: rule__XtextAssociation__Group__8 : rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9 ;
    public final void rule__XtextAssociation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3376:1: ( rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9 )
            // InternalCls.g:3377:2: rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9
            {
            pushFollow(FOLLOW_35);
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
    // InternalCls.g:3384:1: rule__XtextAssociation__Group__8__Impl : ( ( rule__XtextAssociation__Group_8__0 )? ) ;
    public final void rule__XtextAssociation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3388:1: ( ( ( rule__XtextAssociation__Group_8__0 )? ) )
            // InternalCls.g:3389:1: ( ( rule__XtextAssociation__Group_8__0 )? )
            {
            // InternalCls.g:3389:1: ( ( rule__XtextAssociation__Group_8__0 )? )
            // InternalCls.g:3390:2: ( rule__XtextAssociation__Group_8__0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_8()); 
            // InternalCls.g:3391:2: ( rule__XtextAssociation__Group_8__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCls.g:3391:3: rule__XtextAssociation__Group_8__0
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
    // InternalCls.g:3399:1: rule__XtextAssociation__Group__9 : rule__XtextAssociation__Group__9__Impl ;
    public final void rule__XtextAssociation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3403:1: ( rule__XtextAssociation__Group__9__Impl )
            // InternalCls.g:3404:2: rule__XtextAssociation__Group__9__Impl
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
    // InternalCls.g:3410:1: rule__XtextAssociation__Group__9__Impl : ( ( rule__XtextAssociation__CommentsAssignment_9 )? ) ;
    public final void rule__XtextAssociation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3414:1: ( ( ( rule__XtextAssociation__CommentsAssignment_9 )? ) )
            // InternalCls.g:3415:1: ( ( rule__XtextAssociation__CommentsAssignment_9 )? )
            {
            // InternalCls.g:3415:1: ( ( rule__XtextAssociation__CommentsAssignment_9 )? )
            // InternalCls.g:3416:2: ( rule__XtextAssociation__CommentsAssignment_9 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getCommentsAssignment_9()); 
            // InternalCls.g:3417:2: ( rule__XtextAssociation__CommentsAssignment_9 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCls.g:3417:3: rule__XtextAssociation__CommentsAssignment_9
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
    // InternalCls.g:3426:1: rule__XtextAssociation__Group_5__0 : rule__XtextAssociation__Group_5__0__Impl rule__XtextAssociation__Group_5__1 ;
    public final void rule__XtextAssociation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3430:1: ( rule__XtextAssociation__Group_5__0__Impl rule__XtextAssociation__Group_5__1 )
            // InternalCls.g:3431:2: rule__XtextAssociation__Group_5__0__Impl rule__XtextAssociation__Group_5__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:3438:1: rule__XtextAssociation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__XtextAssociation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3442:1: ( ( ',' ) )
            // InternalCls.g:3443:1: ( ',' )
            {
            // InternalCls.g:3443:1: ( ',' )
            // InternalCls.g:3444:2: ','
            {
             before(grammarAccess.getXtextAssociationAccess().getCommaKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCls.g:3453:1: rule__XtextAssociation__Group_5__1 : rule__XtextAssociation__Group_5__1__Impl ;
    public final void rule__XtextAssociation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3457:1: ( rule__XtextAssociation__Group_5__1__Impl )
            // InternalCls.g:3458:2: rule__XtextAssociation__Group_5__1__Impl
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
    // InternalCls.g:3464:1: rule__XtextAssociation__Group_5__1__Impl : ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) ) ;
    public final void rule__XtextAssociation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3468:1: ( ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) ) )
            // InternalCls.g:3469:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) )
            {
            // InternalCls.g:3469:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) )
            // InternalCls.g:3470:2: ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_5_1()); 
            // InternalCls.g:3471:2: ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 )
            // InternalCls.g:3471:3: rule__XtextAssociation__MemberEndTypesAssignment_5_1
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
    // InternalCls.g:3480:1: rule__XtextAssociation__Group_7__0 : rule__XtextAssociation__Group_7__0__Impl rule__XtextAssociation__Group_7__1 ;
    public final void rule__XtextAssociation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3484:1: ( rule__XtextAssociation__Group_7__0__Impl rule__XtextAssociation__Group_7__1 )
            // InternalCls.g:3485:2: rule__XtextAssociation__Group_7__0__Impl rule__XtextAssociation__Group_7__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalCls.g:3492:1: rule__XtextAssociation__Group_7__0__Impl : ( 'role' ) ;
    public final void rule__XtextAssociation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3496:1: ( ( 'role' ) )
            // InternalCls.g:3497:1: ( 'role' )
            {
            // InternalCls.g:3497:1: ( 'role' )
            // InternalCls.g:3498:2: 'role'
            {
             before(grammarAccess.getXtextAssociationAccess().getRoleKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCls.g:3507:1: rule__XtextAssociation__Group_7__1 : rule__XtextAssociation__Group_7__1__Impl rule__XtextAssociation__Group_7__2 ;
    public final void rule__XtextAssociation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3511:1: ( rule__XtextAssociation__Group_7__1__Impl rule__XtextAssociation__Group_7__2 )
            // InternalCls.g:3512:2: rule__XtextAssociation__Group_7__1__Impl rule__XtextAssociation__Group_7__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:3519:1: rule__XtextAssociation__Group_7__1__Impl : ( '[' ) ;
    public final void rule__XtextAssociation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3523:1: ( ( '[' ) )
            // InternalCls.g:3524:1: ( '[' )
            {
            // InternalCls.g:3524:1: ( '[' )
            // InternalCls.g:3525:2: '['
            {
             before(grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCls.g:3534:1: rule__XtextAssociation__Group_7__2 : rule__XtextAssociation__Group_7__2__Impl rule__XtextAssociation__Group_7__3 ;
    public final void rule__XtextAssociation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3538:1: ( rule__XtextAssociation__Group_7__2__Impl rule__XtextAssociation__Group_7__3 )
            // InternalCls.g:3539:2: rule__XtextAssociation__Group_7__2__Impl rule__XtextAssociation__Group_7__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalCls.g:3546:1: rule__XtextAssociation__Group_7__2__Impl : ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) ) ;
    public final void rule__XtextAssociation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3550:1: ( ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) ) )
            // InternalCls.g:3551:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) )
            {
            // InternalCls.g:3551:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) )
            // InternalCls.g:3552:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_7_2()); 
            // InternalCls.g:3553:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 )
            // InternalCls.g:3553:3: rule__XtextAssociation__MemberEndNamesAssignment_7_2
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
    // InternalCls.g:3561:1: rule__XtextAssociation__Group_7__3 : rule__XtextAssociation__Group_7__3__Impl rule__XtextAssociation__Group_7__4 ;
    public final void rule__XtextAssociation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3565:1: ( rule__XtextAssociation__Group_7__3__Impl rule__XtextAssociation__Group_7__4 )
            // InternalCls.g:3566:2: rule__XtextAssociation__Group_7__3__Impl rule__XtextAssociation__Group_7__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalCls.g:3573:1: rule__XtextAssociation__Group_7__3__Impl : ( ( rule__XtextAssociation__Group_7_3__0 )* ) ;
    public final void rule__XtextAssociation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3577:1: ( ( ( rule__XtextAssociation__Group_7_3__0 )* ) )
            // InternalCls.g:3578:1: ( ( rule__XtextAssociation__Group_7_3__0 )* )
            {
            // InternalCls.g:3578:1: ( ( rule__XtextAssociation__Group_7_3__0 )* )
            // InternalCls.g:3579:2: ( rule__XtextAssociation__Group_7_3__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_7_3()); 
            // InternalCls.g:3580:2: ( rule__XtextAssociation__Group_7_3__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==36) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalCls.g:3580:3: rule__XtextAssociation__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__XtextAssociation__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalCls.g:3588:1: rule__XtextAssociation__Group_7__4 : rule__XtextAssociation__Group_7__4__Impl ;
    public final void rule__XtextAssociation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3592:1: ( rule__XtextAssociation__Group_7__4__Impl )
            // InternalCls.g:3593:2: rule__XtextAssociation__Group_7__4__Impl
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
    // InternalCls.g:3599:1: rule__XtextAssociation__Group_7__4__Impl : ( ']' ) ;
    public final void rule__XtextAssociation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3603:1: ( ( ']' ) )
            // InternalCls.g:3604:1: ( ']' )
            {
            // InternalCls.g:3604:1: ( ']' )
            // InternalCls.g:3605:2: ']'
            {
             before(grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_7_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCls.g:3615:1: rule__XtextAssociation__Group_7_3__0 : rule__XtextAssociation__Group_7_3__0__Impl rule__XtextAssociation__Group_7_3__1 ;
    public final void rule__XtextAssociation__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3619:1: ( rule__XtextAssociation__Group_7_3__0__Impl rule__XtextAssociation__Group_7_3__1 )
            // InternalCls.g:3620:2: rule__XtextAssociation__Group_7_3__0__Impl rule__XtextAssociation__Group_7_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:3627:1: rule__XtextAssociation__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__XtextAssociation__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3631:1: ( ( ',' ) )
            // InternalCls.g:3632:1: ( ',' )
            {
            // InternalCls.g:3632:1: ( ',' )
            // InternalCls.g:3633:2: ','
            {
             before(grammarAccess.getXtextAssociationAccess().getCommaKeyword_7_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCls.g:3642:1: rule__XtextAssociation__Group_7_3__1 : rule__XtextAssociation__Group_7_3__1__Impl ;
    public final void rule__XtextAssociation__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3646:1: ( rule__XtextAssociation__Group_7_3__1__Impl )
            // InternalCls.g:3647:2: rule__XtextAssociation__Group_7_3__1__Impl
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
    // InternalCls.g:3653:1: rule__XtextAssociation__Group_7_3__1__Impl : ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) ) ;
    public final void rule__XtextAssociation__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3657:1: ( ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) ) )
            // InternalCls.g:3658:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) )
            {
            // InternalCls.g:3658:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) )
            // InternalCls.g:3659:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_7_3_1()); 
            // InternalCls.g:3660:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 )
            // InternalCls.g:3660:3: rule__XtextAssociation__MemberEndNamesAssignment_7_3_1
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
    // InternalCls.g:3669:1: rule__XtextAssociation__Group_8__0 : rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1 ;
    public final void rule__XtextAssociation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3673:1: ( rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1 )
            // InternalCls.g:3674:2: rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalCls.g:3681:1: rule__XtextAssociation__Group_8__0__Impl : ( 'card' ) ;
    public final void rule__XtextAssociation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3685:1: ( ( 'card' ) )
            // InternalCls.g:3686:1: ( 'card' )
            {
            // InternalCls.g:3686:1: ( 'card' )
            // InternalCls.g:3687:2: 'card'
            {
             before(grammarAccess.getXtextAssociationAccess().getCardKeyword_8_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCls.g:3696:1: rule__XtextAssociation__Group_8__1 : rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2 ;
    public final void rule__XtextAssociation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3700:1: ( rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2 )
            // InternalCls.g:3701:2: rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalCls.g:3708:1: rule__XtextAssociation__Group_8__1__Impl : ( '[' ) ;
    public final void rule__XtextAssociation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3712:1: ( ( '[' ) )
            // InternalCls.g:3713:1: ( '[' )
            {
            // InternalCls.g:3713:1: ( '[' )
            // InternalCls.g:3714:2: '['
            {
             before(grammarAccess.getXtextAssociationAccess().getLeftSquareBracketKeyword_8_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCls.g:3723:1: rule__XtextAssociation__Group_8__2 : rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3 ;
    public final void rule__XtextAssociation__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3727:1: ( rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3 )
            // InternalCls.g:3728:2: rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalCls.g:3735:1: rule__XtextAssociation__Group_8__2__Impl : ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) ) ;
    public final void rule__XtextAssociation__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3739:1: ( ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) ) )
            // InternalCls.g:3740:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) )
            {
            // InternalCls.g:3740:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) )
            // InternalCls.g:3741:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_8_2()); 
            // InternalCls.g:3742:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 )
            // InternalCls.g:3742:3: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2
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
    // InternalCls.g:3750:1: rule__XtextAssociation__Group_8__3 : rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4 ;
    public final void rule__XtextAssociation__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3754:1: ( rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4 )
            // InternalCls.g:3755:2: rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalCls.g:3762:1: rule__XtextAssociation__Group_8__3__Impl : ( ( rule__XtextAssociation__Group_8_3__0 )* ) ;
    public final void rule__XtextAssociation__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3766:1: ( ( ( rule__XtextAssociation__Group_8_3__0 )* ) )
            // InternalCls.g:3767:1: ( ( rule__XtextAssociation__Group_8_3__0 )* )
            {
            // InternalCls.g:3767:1: ( ( rule__XtextAssociation__Group_8_3__0 )* )
            // InternalCls.g:3768:2: ( rule__XtextAssociation__Group_8_3__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_8_3()); 
            // InternalCls.g:3769:2: ( rule__XtextAssociation__Group_8_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==33) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalCls.g:3769:3: rule__XtextAssociation__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__XtextAssociation__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalCls.g:3777:1: rule__XtextAssociation__Group_8__4 : rule__XtextAssociation__Group_8__4__Impl ;
    public final void rule__XtextAssociation__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3781:1: ( rule__XtextAssociation__Group_8__4__Impl )
            // InternalCls.g:3782:2: rule__XtextAssociation__Group_8__4__Impl
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
    // InternalCls.g:3788:1: rule__XtextAssociation__Group_8__4__Impl : ( ']' ) ;
    public final void rule__XtextAssociation__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3792:1: ( ( ']' ) )
            // InternalCls.g:3793:1: ( ']' )
            {
            // InternalCls.g:3793:1: ( ']' )
            // InternalCls.g:3794:2: ']'
            {
             before(grammarAccess.getXtextAssociationAccess().getRightSquareBracketKeyword_8_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCls.g:3804:1: rule__XtextAssociation__Group_8_3__0 : rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1 ;
    public final void rule__XtextAssociation__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3808:1: ( rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1 )
            // InternalCls.g:3809:2: rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalCls.g:3816:1: rule__XtextAssociation__Group_8_3__0__Impl : ( ':' ) ;
    public final void rule__XtextAssociation__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3820:1: ( ( ':' ) )
            // InternalCls.g:3821:1: ( ':' )
            {
            // InternalCls.g:3821:1: ( ':' )
            // InternalCls.g:3822:2: ':'
            {
             before(grammarAccess.getXtextAssociationAccess().getColonKeyword_8_3_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCls.g:3831:1: rule__XtextAssociation__Group_8_3__1 : rule__XtextAssociation__Group_8_3__1__Impl ;
    public final void rule__XtextAssociation__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3835:1: ( rule__XtextAssociation__Group_8_3__1__Impl )
            // InternalCls.g:3836:2: rule__XtextAssociation__Group_8_3__1__Impl
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
    // InternalCls.g:3842:1: rule__XtextAssociation__Group_8_3__1__Impl : ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) ) ;
    public final void rule__XtextAssociation__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3846:1: ( ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) ) )
            // InternalCls.g:3847:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) )
            {
            // InternalCls.g:3847:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) )
            // InternalCls.g:3848:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_8_3_1()); 
            // InternalCls.g:3849:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 )
            // InternalCls.g:3849:3: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1
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
    // InternalCls.g:3858:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3862:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalCls.g:3863:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
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
    // InternalCls.g:3870:1: rule__Comment__Group__0__Impl : ( 'note' ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3874:1: ( ( 'note' ) )
            // InternalCls.g:3875:1: ( 'note' )
            {
            // InternalCls.g:3875:1: ( 'note' )
            // InternalCls.g:3876:2: 'note'
            {
             before(grammarAccess.getCommentAccess().getNoteKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCls.g:3885:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3889:1: ( rule__Comment__Group__1__Impl )
            // InternalCls.g:3890:2: rule__Comment__Group__1__Impl
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
    // InternalCls.g:3896:1: rule__Comment__Group__1__Impl : ( ( rule__Comment__BodyAssignment_1 ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3900:1: ( ( ( rule__Comment__BodyAssignment_1 ) ) )
            // InternalCls.g:3901:1: ( ( rule__Comment__BodyAssignment_1 ) )
            {
            // InternalCls.g:3901:1: ( ( rule__Comment__BodyAssignment_1 ) )
            // InternalCls.g:3902:2: ( rule__Comment__BodyAssignment_1 )
            {
             before(grammarAccess.getCommentAccess().getBodyAssignment_1()); 
            // InternalCls.g:3903:2: ( rule__Comment__BodyAssignment_1 )
            // InternalCls.g:3903:3: rule__Comment__BodyAssignment_1
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
    // InternalCls.g:3912:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3916:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalCls.g:3917:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalCls.g:3924:1: rule__Cardinality__Group__0__Impl : ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3928:1: ( ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) )
            // InternalCls.g:3929:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            {
            // InternalCls.g:3929:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            // InternalCls.g:3930:2: ( rule__Cardinality__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0()); 
            // InternalCls.g:3931:2: ( rule__Cardinality__LowerBoundAssignment_0 )
            // InternalCls.g:3931:3: rule__Cardinality__LowerBoundAssignment_0
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
    // InternalCls.g:3939:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3943:1: ( rule__Cardinality__Group__1__Impl )
            // InternalCls.g:3944:2: rule__Cardinality__Group__1__Impl
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
    // InternalCls.g:3950:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Group_1__0 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3954:1: ( ( ( rule__Cardinality__Group_1__0 )? ) )
            // InternalCls.g:3955:1: ( ( rule__Cardinality__Group_1__0 )? )
            {
            // InternalCls.g:3955:1: ( ( rule__Cardinality__Group_1__0 )? )
            // InternalCls.g:3956:2: ( rule__Cardinality__Group_1__0 )?
            {
             before(grammarAccess.getCardinalityAccess().getGroup_1()); 
            // InternalCls.g:3957:2: ( rule__Cardinality__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCls.g:3957:3: rule__Cardinality__Group_1__0
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
    // InternalCls.g:3966:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3970:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // InternalCls.g:3971:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalCls.g:3978:1: rule__Cardinality__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3982:1: ( ( '..' ) )
            // InternalCls.g:3983:1: ( '..' )
            {
            // InternalCls.g:3983:1: ( '..' )
            // InternalCls.g:3984:2: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCls.g:3993:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3997:1: ( rule__Cardinality__Group_1__1__Impl )
            // InternalCls.g:3998:2: rule__Cardinality__Group_1__1__Impl
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
    // InternalCls.g:4004:1: rule__Cardinality__Group_1__1__Impl : ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4008:1: ( ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) )
            // InternalCls.g:4009:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            {
            // InternalCls.g:4009:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            // InternalCls.g:4010:2: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1()); 
            // InternalCls.g:4011:2: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            // InternalCls.g:4011:3: rule__Cardinality__UpperBoundAssignment_1_1
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
    // InternalCls.g:4020:1: rule__ClassDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4024:1: ( ( RULE_STRING ) )
            // InternalCls.g:4025:2: ( RULE_STRING )
            {
            // InternalCls.g:4025:2: ( RULE_STRING )
            // InternalCls.g:4026:3: RULE_STRING
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
    // InternalCls.g:4035:1: rule__ClassDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__ClassDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4039:1: ( ( ruleRootPackage ) )
            // InternalCls.g:4040:2: ( ruleRootPackage )
            {
            // InternalCls.g:4040:2: ( ruleRootPackage )
            // InternalCls.g:4041:3: ruleRootPackage
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
    // InternalCls.g:4050:1: rule__RootPackage__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4054:1: ( ( ruleFQN ) )
            // InternalCls.g:4055:2: ( ruleFQN )
            {
            // InternalCls.g:4055:2: ( ruleFQN )
            // InternalCls.g:4056:3: ruleFQN
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
    // InternalCls.g:4065:1: rule__RootPackage__PackageImportsAssignment_2 : ( rulePackageImport ) ;
    public final void rule__RootPackage__PackageImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4069:1: ( ( rulePackageImport ) )
            // InternalCls.g:4070:2: ( rulePackageImport )
            {
            // InternalCls.g:4070:2: ( rulePackageImport )
            // InternalCls.g:4071:3: rulePackageImport
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
    // InternalCls.g:4080:1: rule__RootPackage__ClassifiersAssignment_3 : ( ruleClassifier ) ;
    public final void rule__RootPackage__ClassifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4084:1: ( ( ruleClassifier ) )
            // InternalCls.g:4085:2: ( ruleClassifier )
            {
            // InternalCls.g:4085:2: ( ruleClassifier )
            // InternalCls.g:4086:3: ruleClassifier
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
    // InternalCls.g:4095:1: rule__RootPackage__ConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__RootPackage__ConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4099:1: ( ( ruleConnector ) )
            // InternalCls.g:4100:2: ( ruleConnector )
            {
            // InternalCls.g:4100:2: ( ruleConnector )
            // InternalCls.g:4101:3: ruleConnector
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
    // InternalCls.g:4110:1: rule__RootPackage__PackagesAssignment_5 : ( rulePackage ) ;
    public final void rule__RootPackage__PackagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4114:1: ( ( rulePackage ) )
            // InternalCls.g:4115:2: ( rulePackage )
            {
            // InternalCls.g:4115:2: ( rulePackage )
            // InternalCls.g:4116:3: rulePackage
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
    // InternalCls.g:4125:1: rule__Package__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4129:1: ( ( ruleFQN ) )
            // InternalCls.g:4130:2: ( ruleFQN )
            {
            // InternalCls.g:4130:2: ( ruleFQN )
            // InternalCls.g:4131:3: ruleFQN
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
    // InternalCls.g:4140:1: rule__Package__PackageImportsAssignment_3 : ( rulePackageImport ) ;
    public final void rule__Package__PackageImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4144:1: ( ( rulePackageImport ) )
            // InternalCls.g:4145:2: ( rulePackageImport )
            {
            // InternalCls.g:4145:2: ( rulePackageImport )
            // InternalCls.g:4146:3: rulePackageImport
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
    // InternalCls.g:4155:1: rule__Package__ClassifiersAssignment_4 : ( ruleClassifier ) ;
    public final void rule__Package__ClassifiersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4159:1: ( ( ruleClassifier ) )
            // InternalCls.g:4160:2: ( ruleClassifier )
            {
            // InternalCls.g:4160:2: ( ruleClassifier )
            // InternalCls.g:4161:3: ruleClassifier
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
    // InternalCls.g:4170:1: rule__Package__ConnectorsAssignment_5 : ( ruleConnector ) ;
    public final void rule__Package__ConnectorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4174:1: ( ( ruleConnector ) )
            // InternalCls.g:4175:2: ( ruleConnector )
            {
            // InternalCls.g:4175:2: ( ruleConnector )
            // InternalCls.g:4176:3: ruleConnector
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
    // InternalCls.g:4185:1: rule__Package__PackagesAssignment_6 : ( rulePackage ) ;
    public final void rule__Package__PackagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4189:1: ( ( rulePackage ) )
            // InternalCls.g:4190:2: ( rulePackage )
            {
            // InternalCls.g:4190:2: ( rulePackage )
            // InternalCls.g:4191:3: rulePackage
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
    // InternalCls.g:4200:1: rule__PackageImport__ImportedPackageAssignment_1 : ( ruleFQN ) ;
    public final void rule__PackageImport__ImportedPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4204:1: ( ( ruleFQN ) )
            // InternalCls.g:4205:2: ( ruleFQN )
            {
            // InternalCls.g:4205:2: ( ruleFQN )
            // InternalCls.g:4206:3: ruleFQN
            {
             before(grammarAccess.getPackageImportAccess().getImportedPackageFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPackageImportAccess().getImportedPackageFQNParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCls.g:4215:1: rule__Class__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4219:1: ( ( ruleVisibility ) )
            // InternalCls.g:4220:2: ( ruleVisibility )
            {
            // InternalCls.g:4220:2: ( ruleVisibility )
            // InternalCls.g:4221:3: ruleVisibility
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
    // InternalCls.g:4230:1: rule__Class__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4234:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4235:2: ( ( 'abstract' ) )
            {
            // InternalCls.g:4235:2: ( ( 'abstract' ) )
            // InternalCls.g:4236:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4237:3: ( 'abstract' )
            // InternalCls.g:4238:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCls.g:4249:1: rule__Class__NameAssignment_3_0_0 : ( RULE_STRING ) ;
    public final void rule__Class__NameAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4253:1: ( ( RULE_STRING ) )
            // InternalCls.g:4254:2: ( RULE_STRING )
            {
            // InternalCls.g:4254:2: ( RULE_STRING )
            // InternalCls.g:4255:3: RULE_STRING
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
    // InternalCls.g:4264:1: rule__Class__AliasAssignment_3_0_2 : ( RULE_ID ) ;
    public final void rule__Class__AliasAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4268:1: ( ( RULE_ID ) )
            // InternalCls.g:4269:2: ( RULE_ID )
            {
            // InternalCls.g:4269:2: ( RULE_ID )
            // InternalCls.g:4270:3: RULE_ID
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
    // InternalCls.g:4279:1: rule__Class__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4283:1: ( ( RULE_ID ) )
            // InternalCls.g:4284:2: ( RULE_ID )
            {
            // InternalCls.g:4284:2: ( RULE_ID )
            // InternalCls.g:4285:3: RULE_ID
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


    // $ANTLR start "rule__Class__CommentsAssignment_4_0"
    // InternalCls.g:4294:1: rule__Class__CommentsAssignment_4_0 : ( ruleComment ) ;
    public final void rule__Class__CommentsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4298:1: ( ( ruleComment ) )
            // InternalCls.g:4299:2: ( ruleComment )
            {
            // InternalCls.g:4299:2: ( ruleComment )
            // InternalCls.g:4300:3: ruleComment
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
    // InternalCls.g:4309:1: rule__Class__CommentsAssignment_4_1_1 : ( ruleComment ) ;
    public final void rule__Class__CommentsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4313:1: ( ( ruleComment ) )
            // InternalCls.g:4314:2: ( ruleComment )
            {
            // InternalCls.g:4314:2: ( ruleComment )
            // InternalCls.g:4315:3: ruleComment
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
    // InternalCls.g:4324:1: rule__Class__MembersAssignment_4_1_2 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4328:1: ( ( ruleMember ) )
            // InternalCls.g:4329:2: ( ruleMember )
            {
            // InternalCls.g:4329:2: ( ruleMember )
            // InternalCls.g:4330:3: ruleMember
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
    // InternalCls.g:4339:1: rule__Interface__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Interface__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4343:1: ( ( ruleVisibility ) )
            // InternalCls.g:4344:2: ( ruleVisibility )
            {
            // InternalCls.g:4344:2: ( ruleVisibility )
            // InternalCls.g:4345:3: ruleVisibility
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
    // InternalCls.g:4354:1: rule__Interface__NameAssignment_2_0_0 : ( RULE_STRING ) ;
    public final void rule__Interface__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4358:1: ( ( RULE_STRING ) )
            // InternalCls.g:4359:2: ( RULE_STRING )
            {
            // InternalCls.g:4359:2: ( RULE_STRING )
            // InternalCls.g:4360:3: RULE_STRING
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
    // InternalCls.g:4369:1: rule__Interface__AliasAssignment_2_0_2 : ( RULE_ID ) ;
    public final void rule__Interface__AliasAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4373:1: ( ( RULE_ID ) )
            // InternalCls.g:4374:2: ( RULE_ID )
            {
            // InternalCls.g:4374:2: ( RULE_ID )
            // InternalCls.g:4375:3: RULE_ID
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
    // InternalCls.g:4384:1: rule__Interface__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4388:1: ( ( RULE_ID ) )
            // InternalCls.g:4389:2: ( RULE_ID )
            {
            // InternalCls.g:4389:2: ( RULE_ID )
            // InternalCls.g:4390:3: RULE_ID
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


    // $ANTLR start "rule__Interface__CommentsAssignment_3_0"
    // InternalCls.g:4399:1: rule__Interface__CommentsAssignment_3_0 : ( ruleComment ) ;
    public final void rule__Interface__CommentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4403:1: ( ( ruleComment ) )
            // InternalCls.g:4404:2: ( ruleComment )
            {
            // InternalCls.g:4404:2: ( ruleComment )
            // InternalCls.g:4405:3: ruleComment
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
    // InternalCls.g:4414:1: rule__Interface__CommentsAssignment_3_1_1 : ( ruleComment ) ;
    public final void rule__Interface__CommentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4418:1: ( ( ruleComment ) )
            // InternalCls.g:4419:2: ( ruleComment )
            {
            // InternalCls.g:4419:2: ( ruleComment )
            // InternalCls.g:4420:3: ruleComment
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
    // InternalCls.g:4429:1: rule__Interface__MembersAssignment_3_1_2 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4433:1: ( ( ruleMember ) )
            // InternalCls.g:4434:2: ( ruleMember )
            {
            // InternalCls.g:4434:2: ( ruleMember )
            // InternalCls.g:4435:3: ruleMember
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
    // InternalCls.g:4444:1: rule__Attribute__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4448:1: ( ( ruleVisibility ) )
            // InternalCls.g:4449:2: ( ruleVisibility )
            {
            // InternalCls.g:4449:2: ( ruleVisibility )
            // InternalCls.g:4450:3: ruleVisibility
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
    // InternalCls.g:4459:1: rule__Attribute__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4463:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4464:2: ( ( 'static' ) )
            {
            // InternalCls.g:4464:2: ( ( 'static' ) )
            // InternalCls.g:4465:3: ( 'static' )
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4466:3: ( 'static' )
            // InternalCls.g:4467:4: 'static'
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCls.g:4478:1: rule__Attribute__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4482:1: ( ( RULE_ID ) )
            // InternalCls.g:4483:2: ( RULE_ID )
            {
            // InternalCls.g:4483:2: ( RULE_ID )
            // InternalCls.g:4484:3: RULE_ID
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
    // InternalCls.g:4493:1: rule__Attribute__TypeAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4497:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4498:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4498:2: ( ( ruleFQN ) )
            // InternalCls.g:4499:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getTypeClassifierCrossReference_5_0()); 
            // InternalCls.g:4500:3: ( ruleFQN )
            // InternalCls.g:4501:4: ruleFQN
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
    // InternalCls.g:4512:1: rule__Method__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Method__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4516:1: ( ( ruleVisibility ) )
            // InternalCls.g:4517:2: ( ruleVisibility )
            {
            // InternalCls.g:4517:2: ( ruleVisibility )
            // InternalCls.g:4518:3: ruleVisibility
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
    // InternalCls.g:4527:1: rule__Method__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Method__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4531:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4532:2: ( ( 'abstract' ) )
            {
            // InternalCls.g:4532:2: ( ( 'abstract' ) )
            // InternalCls.g:4533:3: ( 'abstract' )
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4534:3: ( 'abstract' )
            // InternalCls.g:4535:4: 'abstract'
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCls.g:4546:1: rule__Method__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Method__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4550:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4551:2: ( ( 'static' ) )
            {
            // InternalCls.g:4551:2: ( ( 'static' ) )
            // InternalCls.g:4552:3: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4553:3: ( 'static' )
            // InternalCls.g:4554:4: 'static'
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCls.g:4565:1: rule__Method__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4569:1: ( ( RULE_ID ) )
            // InternalCls.g:4570:2: ( RULE_ID )
            {
            // InternalCls.g:4570:2: ( RULE_ID )
            // InternalCls.g:4571:3: RULE_ID
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
    // InternalCls.g:4580:1: rule__Method__ParametersAssignment_5_0 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4584:1: ( ( ruleParameter ) )
            // InternalCls.g:4585:2: ( ruleParameter )
            {
            // InternalCls.g:4585:2: ( ruleParameter )
            // InternalCls.g:4586:3: ruleParameter
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
    // InternalCls.g:4595:1: rule__Method__ParametersAssignment_5_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4599:1: ( ( ruleParameter ) )
            // InternalCls.g:4600:2: ( ruleParameter )
            {
            // InternalCls.g:4600:2: ( ruleParameter )
            // InternalCls.g:4601:3: ruleParameter
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
    // InternalCls.g:4610:1: rule__Method__TypeAssignment_7_1 : ( ( ruleFQN ) ) ;
    public final void rule__Method__TypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4614:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4615:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4615:2: ( ( ruleFQN ) )
            // InternalCls.g:4616:3: ( ruleFQN )
            {
             before(grammarAccess.getMethodAccess().getTypeClassifierCrossReference_7_1_0()); 
            // InternalCls.g:4617:3: ( ruleFQN )
            // InternalCls.g:4618:4: ruleFQN
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
    // InternalCls.g:4629:1: rule__Parameter__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Parameter__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4633:1: ( ( ruleVisibility ) )
            // InternalCls.g:4634:2: ( ruleVisibility )
            {
            // InternalCls.g:4634:2: ( ruleVisibility )
            // InternalCls.g:4635:3: ruleVisibility
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
    // InternalCls.g:4644:1: rule__Parameter__StaticAssignment_1 : ( ( 'static' ) ) ;
    public final void rule__Parameter__StaticAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4648:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4649:2: ( ( 'static' ) )
            {
            // InternalCls.g:4649:2: ( ( 'static' ) )
            // InternalCls.g:4650:3: ( 'static' )
            {
             before(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 
            // InternalCls.g:4651:3: ( 'static' )
            // InternalCls.g:4652:4: 'static'
            {
             before(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalCls.g:4663:1: rule__Parameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4667:1: ( ( RULE_ID ) )
            // InternalCls.g:4668:2: ( RULE_ID )
            {
            // InternalCls.g:4668:2: ( RULE_ID )
            // InternalCls.g:4669:3: RULE_ID
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
    // InternalCls.g:4678:1: rule__Parameter__TypeAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Parameter__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4682:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4683:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4683:2: ( ( ruleFQN ) )
            // InternalCls.g:4684:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterAccess().getTypeClassifierCrossReference_4_0()); 
            // InternalCls.g:4685:3: ( ruleFQN )
            // InternalCls.g:4686:4: ruleFQN
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
    // InternalCls.g:4697:1: rule__Generalization__LeftAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Generalization__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4701:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4702:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4702:2: ( ( ruleFQN ) )
            // InternalCls.g:4703:3: ( ruleFQN )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftClassifierCrossReference_2_0()); 
            // InternalCls.g:4704:3: ( ruleFQN )
            // InternalCls.g:4705:4: ruleFQN
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
    // InternalCls.g:4716:1: rule__Generalization__RightAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Generalization__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4720:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4721:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4721:2: ( ( ruleFQN ) )
            // InternalCls.g:4722:3: ( ruleFQN )
            {
             before(grammarAccess.getGeneralizationAccess().getRightClassifierCrossReference_4_0()); 
            // InternalCls.g:4723:3: ( ruleFQN )
            // InternalCls.g:4724:4: ruleFQN
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
    // InternalCls.g:4735:1: rule__Implementation__LeftAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Implementation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4739:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4740:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4740:2: ( ( ruleFQN ) )
            // InternalCls.g:4741:3: ( ruleFQN )
            {
             before(grammarAccess.getImplementationAccess().getLeftClassifierCrossReference_2_0()); 
            // InternalCls.g:4742:3: ( ruleFQN )
            // InternalCls.g:4743:4: ruleFQN
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
    // InternalCls.g:4754:1: rule__Implementation__RightAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Implementation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4758:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4759:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4759:2: ( ( ruleFQN ) )
            // InternalCls.g:4760:3: ( ruleFQN )
            {
             before(grammarAccess.getImplementationAccess().getRightClassifierCrossReference_4_0()); 
            // InternalCls.g:4761:3: ( ruleFQN )
            // InternalCls.g:4762:4: ruleFQN
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
    // InternalCls.g:4773:1: rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 : ( ( 'bi' ) ) ;
    public final void rule__XtextAssociation__TwoSideBidirectionalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4777:1: ( ( ( 'bi' ) ) )
            // InternalCls.g:4778:2: ( ( 'bi' ) )
            {
            // InternalCls.g:4778:2: ( ( 'bi' ) )
            // InternalCls.g:4779:3: ( 'bi' )
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityBiKeyword_0_0()); 
            // InternalCls.g:4780:3: ( 'bi' )
            // InternalCls.g:4781:4: 'bi'
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityBiKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCls.g:4792:1: rule__XtextAssociation__TwoSideAggregationKindAssignment_1 : ( ruleAggregationKind ) ;
    public final void rule__XtextAssociation__TwoSideAggregationKindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4796:1: ( ( ruleAggregationKind ) )
            // InternalCls.g:4797:2: ( ruleAggregationKind )
            {
            // InternalCls.g:4797:2: ( ruleAggregationKind )
            // InternalCls.g:4798:3: ruleAggregationKind
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
    // InternalCls.g:4807:1: rule__XtextAssociation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XtextAssociation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4811:1: ( ( RULE_ID ) )
            // InternalCls.g:4812:2: ( RULE_ID )
            {
            // InternalCls.g:4812:2: ( RULE_ID )
            // InternalCls.g:4813:3: RULE_ID
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
    // InternalCls.g:4822:1: rule__XtextAssociation__MemberEndTypesAssignment_4 : ( ruleXtextAssociationMemberEndReferencedType ) ;
    public final void rule__XtextAssociation__MemberEndTypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4826:1: ( ( ruleXtextAssociationMemberEndReferencedType ) )
            // InternalCls.g:4827:2: ( ruleXtextAssociationMemberEndReferencedType )
            {
            // InternalCls.g:4827:2: ( ruleXtextAssociationMemberEndReferencedType )
            // InternalCls.g:4828:3: ruleXtextAssociationMemberEndReferencedType
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
    // InternalCls.g:4837:1: rule__XtextAssociation__MemberEndTypesAssignment_5_1 : ( ruleXtextAssociationMemberEndReferencedType ) ;
    public final void rule__XtextAssociation__MemberEndTypesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4841:1: ( ( ruleXtextAssociationMemberEndReferencedType ) )
            // InternalCls.g:4842:2: ( ruleXtextAssociationMemberEndReferencedType )
            {
            // InternalCls.g:4842:2: ( ruleXtextAssociationMemberEndReferencedType )
            // InternalCls.g:4843:3: ruleXtextAssociationMemberEndReferencedType
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
    // InternalCls.g:4852:1: rule__XtextAssociation__MemberEndNamesAssignment_7_2 : ( RULE_ID ) ;
    public final void rule__XtextAssociation__MemberEndNamesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4856:1: ( ( RULE_ID ) )
            // InternalCls.g:4857:2: ( RULE_ID )
            {
            // InternalCls.g:4857:2: ( RULE_ID )
            // InternalCls.g:4858:3: RULE_ID
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesIDTerminalRuleCall_7_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getMemberEndNamesIDTerminalRuleCall_7_2_0()); 

            }


            }

        }
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
    // InternalCls.g:4867:1: rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 : ( RULE_ID ) ;
    public final void rule__XtextAssociation__MemberEndNamesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4871:1: ( ( RULE_ID ) )
            // InternalCls.g:4872:2: ( RULE_ID )
            {
            // InternalCls.g:4872:2: ( RULE_ID )
            // InternalCls.g:4873:3: RULE_ID
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesIDTerminalRuleCall_7_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXtextAssociationAccess().getMemberEndNamesIDTerminalRuleCall_7_3_1_0()); 

            }


            }

        }
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
    // InternalCls.g:4882:1: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 : ( ruleCardinality ) ;
    public final void rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4886:1: ( ( ruleCardinality ) )
            // InternalCls.g:4887:2: ( ruleCardinality )
            {
            // InternalCls.g:4887:2: ( ruleCardinality )
            // InternalCls.g:4888:3: ruleCardinality
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
    // InternalCls.g:4897:1: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 : ( ruleCardinality ) ;
    public final void rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4901:1: ( ( ruleCardinality ) )
            // InternalCls.g:4902:2: ( ruleCardinality )
            {
            // InternalCls.g:4902:2: ( ruleCardinality )
            // InternalCls.g:4903:3: ruleCardinality
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
    // InternalCls.g:4912:1: rule__XtextAssociation__CommentsAssignment_9 : ( ruleComment ) ;
    public final void rule__XtextAssociation__CommentsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4916:1: ( ( ruleComment ) )
            // InternalCls.g:4917:2: ( ruleComment )
            {
            // InternalCls.g:4917:2: ( ruleComment )
            // InternalCls.g:4918:3: ruleComment
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
    // InternalCls.g:4927:1: rule__XtextAssociationMemberEndReferencedType__TypeAssignment : ( ( ruleFQN ) ) ;
    public final void rule__XtextAssociationMemberEndReferencedType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4931:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4932:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4932:2: ( ( ruleFQN ) )
            // InternalCls.g:4933:3: ( ruleFQN )
            {
             before(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeClassifierCrossReference_0()); 
            // InternalCls.g:4934:3: ( ruleFQN )
            // InternalCls.g:4935:4: ruleFQN
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
    // InternalCls.g:4946:1: rule__Comment__BodyAssignment_1 : ( ruleCommentBody ) ;
    public final void rule__Comment__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4950:1: ( ( ruleCommentBody ) )
            // InternalCls.g:4951:2: ( ruleCommentBody )
            {
            // InternalCls.g:4951:2: ( ruleCommentBody )
            // InternalCls.g:4952:3: ruleCommentBody
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
    // InternalCls.g:4961:1: rule__Cardinality__LowerBoundAssignment_0 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4965:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:4966:2: ( ruleCardinalityBound )
            {
            // InternalCls.g:4966:2: ( ruleCardinalityBound )
            // InternalCls.g:4967:3: ruleCardinalityBound
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
    // InternalCls.g:4976:1: rule__Cardinality__UpperBoundAssignment_1_1 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__UpperBoundAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4980:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:4981:2: ( ruleCardinalityBound )
            {
            // InternalCls.g:4981:2: ( ruleCardinalityBound )
            // InternalCls.g:4982:3: ruleCardinalityBound
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
    static final String dfa_2s = "\1\14\7\36\2\uffff";
    static final String dfa_3s = "\10\55\2\uffff";
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
            return "609:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\11\6\1\41\2\uffff";
    static final String dfa_9s = "\10\56\1\6\1\42\2\uffff";
    static final String dfa_10s = "\12\uffff\1\2\1\1";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\11\5\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\32\uffff\1\12\1\10",
            "\1\11\46\uffff\1\12\1\10",
            "\1\11\46\uffff\1\12\1\10",
            "\1\11\46\uffff\1\12\1\10",
            "\1\11\46\uffff\1\12\1\10",
            "\1\11\46\uffff\1\12\1\10",
            "\1\11\46\uffff\1\12\1\10",
            "\1\11\46\uffff\1\12\1\10",
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
            return "714:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000A061523FF000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000020014007F002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000806000380002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000A0615A3FF000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000020004007F000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000068000807F040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000060000007F042L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000020014007F000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000040000007F040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000060000007F040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000040080007F040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000040000007F042L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000380000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000C8000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});

}