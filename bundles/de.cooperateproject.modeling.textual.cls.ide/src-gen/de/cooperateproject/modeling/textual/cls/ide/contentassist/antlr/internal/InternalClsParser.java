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


    // $ANTLR start "entryRuleCommentLink"
    // InternalCls.g:428:1: entryRuleCommentLink : ruleCommentLink EOF ;
    public final void entryRuleCommentLink() throws RecognitionException {
        try {
            // InternalCls.g:429:1: ( ruleCommentLink EOF )
            // InternalCls.g:430:1: ruleCommentLink EOF
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
    // InternalCls.g:437:1: ruleCommentLink : ( ( rule__CommentLink__Group__0 ) ) ;
    public final void ruleCommentLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:441:2: ( ( ( rule__CommentLink__Group__0 ) ) )
            // InternalCls.g:442:2: ( ( rule__CommentLink__Group__0 ) )
            {
            // InternalCls.g:442:2: ( ( rule__CommentLink__Group__0 ) )
            // InternalCls.g:443:3: ( rule__CommentLink__Group__0 )
            {
             before(grammarAccess.getCommentLinkAccess().getGroup()); 
            // InternalCls.g:444:3: ( rule__CommentLink__Group__0 )
            // InternalCls.g:444:4: rule__CommentLink__Group__0
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


    // $ANTLR start "entryRuleXtextAssociation"
    // InternalCls.g:453:1: entryRuleXtextAssociation : ruleXtextAssociation EOF ;
    public final void entryRuleXtextAssociation() throws RecognitionException {
        try {
            // InternalCls.g:454:1: ( ruleXtextAssociation EOF )
            // InternalCls.g:455:1: ruleXtextAssociation EOF
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
    // InternalCls.g:462:1: ruleXtextAssociation : ( ( rule__XtextAssociation__Group__0 ) ) ;
    public final void ruleXtextAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:466:2: ( ( ( rule__XtextAssociation__Group__0 ) ) )
            // InternalCls.g:467:2: ( ( rule__XtextAssociation__Group__0 ) )
            {
            // InternalCls.g:467:2: ( ( rule__XtextAssociation__Group__0 ) )
            // InternalCls.g:468:3: ( rule__XtextAssociation__Group__0 )
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup()); 
            // InternalCls.g:469:3: ( rule__XtextAssociation__Group__0 )
            // InternalCls.g:469:4: rule__XtextAssociation__Group__0
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
    // InternalCls.g:478:1: entryRuleXtextAssociationMemberEndReferencedType : ruleXtextAssociationMemberEndReferencedType EOF ;
    public final void entryRuleXtextAssociationMemberEndReferencedType() throws RecognitionException {
        try {
            // InternalCls.g:479:1: ( ruleXtextAssociationMemberEndReferencedType EOF )
            // InternalCls.g:480:1: ruleXtextAssociationMemberEndReferencedType EOF
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
    // InternalCls.g:487:1: ruleXtextAssociationMemberEndReferencedType : ( ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment ) ) ;
    public final void ruleXtextAssociationMemberEndReferencedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:491:2: ( ( ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment ) ) )
            // InternalCls.g:492:2: ( ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment ) )
            {
            // InternalCls.g:492:2: ( ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment ) )
            // InternalCls.g:493:3: ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment )
            {
             before(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeAssignment()); 
            // InternalCls.g:494:3: ( rule__XtextAssociationMemberEndReferencedType__TypeAssignment )
            // InternalCls.g:494:4: rule__XtextAssociationMemberEndReferencedType__TypeAssignment
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
    // InternalCls.g:503:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalCls.g:504:1: ( ruleComment EOF )
            // InternalCls.g:505:1: ruleComment EOF
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
    // InternalCls.g:512:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:516:2: ( ( ( rule__Comment__Group__0 ) ) )
            // InternalCls.g:517:2: ( ( rule__Comment__Group__0 ) )
            {
            // InternalCls.g:517:2: ( ( rule__Comment__Group__0 ) )
            // InternalCls.g:518:3: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // InternalCls.g:519:3: ( rule__Comment__Group__0 )
            // InternalCls.g:519:4: rule__Comment__Group__0
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
    // InternalCls.g:528:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalCls.g:529:1: ( ruleCardinality EOF )
            // InternalCls.g:530:1: ruleCardinality EOF
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
    // InternalCls.g:537:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:541:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalCls.g:542:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalCls.g:542:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalCls.g:543:3: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalCls.g:544:3: ( rule__Cardinality__Group__0 )
            // InternalCls.g:544:4: rule__Cardinality__Group__0
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
    // InternalCls.g:553:1: entryRuleCommentBody : ruleCommentBody EOF ;
    public final void entryRuleCommentBody() throws RecognitionException {
        try {
            // InternalCls.g:554:1: ( ruleCommentBody EOF )
            // InternalCls.g:555:1: ruleCommentBody EOF
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
    // InternalCls.g:562:1: ruleCommentBody : ( RULE_STRING ) ;
    public final void ruleCommentBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:566:2: ( ( RULE_STRING ) )
            // InternalCls.g:567:2: ( RULE_STRING )
            {
            // InternalCls.g:567:2: ( RULE_STRING )
            // InternalCls.g:568:3: RULE_STRING
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
    // InternalCls.g:578:1: entryRuleCardinalityBound : ruleCardinalityBound EOF ;
    public final void entryRuleCardinalityBound() throws RecognitionException {
        try {
            // InternalCls.g:579:1: ( ruleCardinalityBound EOF )
            // InternalCls.g:580:1: ruleCardinalityBound EOF
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
    // InternalCls.g:587:1: ruleCardinalityBound : ( ( rule__CardinalityBound__Alternatives ) ) ;
    public final void ruleCardinalityBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:591:2: ( ( ( rule__CardinalityBound__Alternatives ) ) )
            // InternalCls.g:592:2: ( ( rule__CardinalityBound__Alternatives ) )
            {
            // InternalCls.g:592:2: ( ( rule__CardinalityBound__Alternatives ) )
            // InternalCls.g:593:3: ( rule__CardinalityBound__Alternatives )
            {
             before(grammarAccess.getCardinalityBoundAccess().getAlternatives()); 
            // InternalCls.g:594:3: ( rule__CardinalityBound__Alternatives )
            // InternalCls.g:594:4: rule__CardinalityBound__Alternatives
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
    // InternalCls.g:655:1: rule__Class__Alternatives_3 : ( ( ( rule__Class__Group_3_0__0 ) ) | ( ( rule__Class__NameAssignment_3_1 ) ) );
    public final void rule__Class__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:659:1: ( ( ( rule__Class__Group_3_0__0 ) ) | ( ( rule__Class__NameAssignment_3_1 ) ) )
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
                    // InternalCls.g:660:2: ( ( rule__Class__Group_3_0__0 ) )
                    {
                    // InternalCls.g:660:2: ( ( rule__Class__Group_3_0__0 ) )
                    // InternalCls.g:661:3: ( rule__Class__Group_3_0__0 )
                    {
                     before(grammarAccess.getClassAccess().getGroup_3_0()); 
                    // InternalCls.g:662:3: ( rule__Class__Group_3_0__0 )
                    // InternalCls.g:662:4: rule__Class__Group_3_0__0
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
                    // InternalCls.g:666:2: ( ( rule__Class__NameAssignment_3_1 ) )
                    {
                    // InternalCls.g:666:2: ( ( rule__Class__NameAssignment_3_1 ) )
                    // InternalCls.g:667:3: ( rule__Class__NameAssignment_3_1 )
                    {
                     before(grammarAccess.getClassAccess().getNameAssignment_3_1()); 
                    // InternalCls.g:668:3: ( rule__Class__NameAssignment_3_1 )
                    // InternalCls.g:668:4: rule__Class__NameAssignment_3_1
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


    // $ANTLR start "rule__Interface__Alternatives_2"
    // InternalCls.g:676:1: rule__Interface__Alternatives_2 : ( ( ( rule__Interface__Group_2_0__0 ) ) | ( ( rule__Interface__NameAssignment_2_1 ) ) );
    public final void rule__Interface__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:680:1: ( ( ( rule__Interface__Group_2_0__0 ) ) | ( ( rule__Interface__NameAssignment_2_1 ) ) )
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
                    // InternalCls.g:681:2: ( ( rule__Interface__Group_2_0__0 ) )
                    {
                    // InternalCls.g:681:2: ( ( rule__Interface__Group_2_0__0 ) )
                    // InternalCls.g:682:3: ( rule__Interface__Group_2_0__0 )
                    {
                     before(grammarAccess.getInterfaceAccess().getGroup_2_0()); 
                    // InternalCls.g:683:3: ( rule__Interface__Group_2_0__0 )
                    // InternalCls.g:683:4: rule__Interface__Group_2_0__0
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
                    // InternalCls.g:687:2: ( ( rule__Interface__NameAssignment_2_1 ) )
                    {
                    // InternalCls.g:687:2: ( ( rule__Interface__NameAssignment_2_1 ) )
                    // InternalCls.g:688:3: ( rule__Interface__NameAssignment_2_1 )
                    {
                     before(grammarAccess.getInterfaceAccess().getNameAssignment_2_1()); 
                    // InternalCls.g:689:3: ( rule__Interface__NameAssignment_2_1 )
                    // InternalCls.g:689:4: rule__Interface__NameAssignment_2_1
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


    // $ANTLR start "rule__Member__Alternatives"
    // InternalCls.g:697:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:701:1: ( ( ruleAttribute ) | ( ruleMethod ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCls.g:702:2: ( ruleAttribute )
                    {
                    // InternalCls.g:702:2: ( ruleAttribute )
                    // InternalCls.g:703:3: ruleAttribute
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
                    // InternalCls.g:708:2: ( ruleMethod )
                    {
                    // InternalCls.g:708:2: ( ruleMethod )
                    // InternalCls.g:709:3: ruleMethod
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
    // InternalCls.g:718:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleXtextAssociation ) | ( ruleImplementation ) | ( ruleCommentLink ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:722:1: ( ( ruleGeneralization ) | ( ruleXtextAssociation ) | ( ruleImplementation ) | ( ruleCommentLink ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt5=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 47:
                {
                alt5=2;
                }
                break;
            case 38:
                {
                alt5=3;
                }
                break;
            case 43:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCls.g:723:2: ( ruleGeneralization )
                    {
                    // InternalCls.g:723:2: ( ruleGeneralization )
                    // InternalCls.g:724:3: ruleGeneralization
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
                    // InternalCls.g:729:2: ( ruleXtextAssociation )
                    {
                    // InternalCls.g:729:2: ( ruleXtextAssociation )
                    // InternalCls.g:730:3: ruleXtextAssociation
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
                    // InternalCls.g:735:2: ( ruleImplementation )
                    {
                    // InternalCls.g:735:2: ( ruleImplementation )
                    // InternalCls.g:736:3: ruleImplementation
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
                    // InternalCls.g:741:2: ( ruleCommentLink )
                    {
                    // InternalCls.g:741:2: ( ruleCommentLink )
                    // InternalCls.g:742:3: ruleCommentLink
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
    // InternalCls.g:751:1: rule__CardinalityBound__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CardinalityBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:755:1: ( ( '*' ) | ( RULE_INT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCls.g:756:2: ( '*' )
                    {
                    // InternalCls.g:756:2: ( '*' )
                    // InternalCls.g:757:3: '*'
                    {
                     before(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:762:2: ( RULE_INT )
                    {
                    // InternalCls.g:762:2: ( RULE_INT )
                    // InternalCls.g:763:3: RULE_INT
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
    // InternalCls.g:772:1: rule__Visibility__Alternatives : ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:776:1: ( ( ( '+' ) ) | ( ( 'public' ) ) | ( ( '-' ) ) | ( ( 'private' ) ) | ( ( '#' ) ) | ( ( 'protected' ) ) | ( ( '~' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            case 16:
                {
                alt7=5;
                }
                break;
            case 17:
                {
                alt7=6;
                }
                break;
            case 18:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCls.g:777:2: ( ( '+' ) )
                    {
                    // InternalCls.g:777:2: ( ( '+' ) )
                    // InternalCls.g:778:3: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalCls.g:779:3: ( '+' )
                    // InternalCls.g:779:4: '+'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:783:2: ( ( 'public' ) )
                    {
                    // InternalCls.g:783:2: ( ( 'public' ) )
                    // InternalCls.g:784:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    // InternalCls.g:785:3: ( 'public' )
                    // InternalCls.g:785:4: 'public'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:789:2: ( ( '-' ) )
                    {
                    // InternalCls.g:789:2: ( ( '-' ) )
                    // InternalCls.g:790:3: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2()); 
                    // InternalCls.g:791:3: ( '-' )
                    // InternalCls.g:791:4: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:795:2: ( ( 'private' ) )
                    {
                    // InternalCls.g:795:2: ( ( 'private' ) )
                    // InternalCls.g:796:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3()); 
                    // InternalCls.g:797:3: ( 'private' )
                    // InternalCls.g:797:4: 'private'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:801:2: ( ( '#' ) )
                    {
                    // InternalCls.g:801:2: ( ( '#' ) )
                    // InternalCls.g:802:3: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4()); 
                    // InternalCls.g:803:3: ( '#' )
                    // InternalCls.g:803:4: '#'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:807:2: ( ( 'protected' ) )
                    {
                    // InternalCls.g:807:2: ( ( 'protected' ) )
                    // InternalCls.g:808:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5()); 
                    // InternalCls.g:809:3: ( 'protected' )
                    // InternalCls.g:809:4: 'protected'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:813:2: ( ( '~' ) )
                    {
                    // InternalCls.g:813:2: ( ( '~' ) )
                    // InternalCls.g:814:3: ( '~' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_6()); 
                    // InternalCls.g:815:3: ( '~' )
                    // InternalCls.g:815:4: '~'
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
    // InternalCls.g:823:1: rule__AggregationKind__Alternatives : ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) );
    public final void rule__AggregationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:827:1: ( ( ( 'asc' ) ) | ( ( 'agg' ) ) | ( ( 'com' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCls.g:828:2: ( ( 'asc' ) )
                    {
                    // InternalCls.g:828:2: ( ( 'asc' ) )
                    // InternalCls.g:829:3: ( 'asc' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalCls.g:830:3: ( 'asc' )
                    // InternalCls.g:830:4: 'asc'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:834:2: ( ( 'agg' ) )
                    {
                    // InternalCls.g:834:2: ( ( 'agg' ) )
                    // InternalCls.g:835:3: ( 'agg' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 
                    // InternalCls.g:836:3: ( 'agg' )
                    // InternalCls.g:836:4: 'agg'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getAGGREGATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:840:2: ( ( 'com' ) )
                    {
                    // InternalCls.g:840:2: ( ( 'com' ) )
                    // InternalCls.g:841:3: ( 'com' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getCOMPOSITIONEnumLiteralDeclaration_2()); 
                    // InternalCls.g:842:3: ( 'com' )
                    // InternalCls.g:842:4: 'com'
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
    // InternalCls.g:850:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:854:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // InternalCls.g:855:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
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
    // InternalCls.g:862:1: rule__ClassDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:866:1: ( ( () ) )
            // InternalCls.g:867:1: ( () )
            {
            // InternalCls.g:867:1: ( () )
            // InternalCls.g:868:2: ()
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 
            // InternalCls.g:869:2: ()
            // InternalCls.g:869:3: 
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
    // InternalCls.g:877:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:881:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // InternalCls.g:882:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
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
    // InternalCls.g:889:1: rule__ClassDiagram__Group__1__Impl : ( '@start-clsd' ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:893:1: ( ( '@start-clsd' ) )
            // InternalCls.g:894:1: ( '@start-clsd' )
            {
            // InternalCls.g:894:1: ( '@start-clsd' )
            // InternalCls.g:895:2: '@start-clsd'
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
    // InternalCls.g:904:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:908:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // InternalCls.g:909:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
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
    // InternalCls.g:916:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__TitleAssignment_2 ) ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:920:1: ( ( ( rule__ClassDiagram__TitleAssignment_2 ) ) )
            // InternalCls.g:921:1: ( ( rule__ClassDiagram__TitleAssignment_2 ) )
            {
            // InternalCls.g:921:1: ( ( rule__ClassDiagram__TitleAssignment_2 ) )
            // InternalCls.g:922:2: ( rule__ClassDiagram__TitleAssignment_2 )
            {
             before(grammarAccess.getClassDiagramAccess().getTitleAssignment_2()); 
            // InternalCls.g:923:2: ( rule__ClassDiagram__TitleAssignment_2 )
            // InternalCls.g:923:3: rule__ClassDiagram__TitleAssignment_2
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
    // InternalCls.g:931:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:935:1: ( rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 )
            // InternalCls.g:936:2: rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4
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
    // InternalCls.g:943:1: rule__ClassDiagram__Group__3__Impl : ( ( rule__ClassDiagram__RootPackageAssignment_3 ) ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:947:1: ( ( ( rule__ClassDiagram__RootPackageAssignment_3 ) ) )
            // InternalCls.g:948:1: ( ( rule__ClassDiagram__RootPackageAssignment_3 ) )
            {
            // InternalCls.g:948:1: ( ( rule__ClassDiagram__RootPackageAssignment_3 ) )
            // InternalCls.g:949:2: ( rule__ClassDiagram__RootPackageAssignment_3 )
            {
             before(grammarAccess.getClassDiagramAccess().getRootPackageAssignment_3()); 
            // InternalCls.g:950:2: ( rule__ClassDiagram__RootPackageAssignment_3 )
            // InternalCls.g:950:3: rule__ClassDiagram__RootPackageAssignment_3
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
    // InternalCls.g:958:1: rule__ClassDiagram__Group__4 : rule__ClassDiagram__Group__4__Impl ;
    public final void rule__ClassDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:962:1: ( rule__ClassDiagram__Group__4__Impl )
            // InternalCls.g:963:2: rule__ClassDiagram__Group__4__Impl
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
    // InternalCls.g:969:1: rule__ClassDiagram__Group__4__Impl : ( '@end-clsd' ) ;
    public final void rule__ClassDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:973:1: ( ( '@end-clsd' ) )
            // InternalCls.g:974:1: ( '@end-clsd' )
            {
            // InternalCls.g:974:1: ( '@end-clsd' )
            // InternalCls.g:975:2: '@end-clsd'
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
    // InternalCls.g:985:1: rule__RootPackage__Group__0 : rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 ;
    public final void rule__RootPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:989:1: ( rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1 )
            // InternalCls.g:990:2: rule__RootPackage__Group__0__Impl rule__RootPackage__Group__1
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
    // InternalCls.g:997:1: rule__RootPackage__Group__0__Impl : ( 'rootPackage' ) ;
    public final void rule__RootPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1001:1: ( ( 'rootPackage' ) )
            // InternalCls.g:1002:1: ( 'rootPackage' )
            {
            // InternalCls.g:1002:1: ( 'rootPackage' )
            // InternalCls.g:1003:2: 'rootPackage'
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
    // InternalCls.g:1012:1: rule__RootPackage__Group__1 : rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 ;
    public final void rule__RootPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1016:1: ( rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2 )
            // InternalCls.g:1017:2: rule__RootPackage__Group__1__Impl rule__RootPackage__Group__2
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
    // InternalCls.g:1024:1: rule__RootPackage__Group__1__Impl : ( ( rule__RootPackage__NameAssignment_1 ) ) ;
    public final void rule__RootPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1028:1: ( ( ( rule__RootPackage__NameAssignment_1 ) ) )
            // InternalCls.g:1029:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            {
            // InternalCls.g:1029:1: ( ( rule__RootPackage__NameAssignment_1 ) )
            // InternalCls.g:1030:2: ( rule__RootPackage__NameAssignment_1 )
            {
             before(grammarAccess.getRootPackageAccess().getNameAssignment_1()); 
            // InternalCls.g:1031:2: ( rule__RootPackage__NameAssignment_1 )
            // InternalCls.g:1031:3: rule__RootPackage__NameAssignment_1
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
    // InternalCls.g:1039:1: rule__RootPackage__Group__2 : rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 ;
    public final void rule__RootPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1043:1: ( rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3 )
            // InternalCls.g:1044:2: rule__RootPackage__Group__2__Impl rule__RootPackage__Group__3
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
    // InternalCls.g:1051:1: rule__RootPackage__Group__2__Impl : ( ( rule__RootPackage__PackageImportsAssignment_2 )* ) ;
    public final void rule__RootPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1055:1: ( ( ( rule__RootPackage__PackageImportsAssignment_2 )* ) )
            // InternalCls.g:1056:1: ( ( rule__RootPackage__PackageImportsAssignment_2 )* )
            {
            // InternalCls.g:1056:1: ( ( rule__RootPackage__PackageImportsAssignment_2 )* )
            // InternalCls.g:1057:2: ( rule__RootPackage__PackageImportsAssignment_2 )*
            {
             before(grammarAccess.getRootPackageAccess().getPackageImportsAssignment_2()); 
            // InternalCls.g:1058:2: ( rule__RootPackage__PackageImportsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCls.g:1058:3: rule__RootPackage__PackageImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RootPackage__PackageImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCls.g:1066:1: rule__RootPackage__Group__3 : rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 ;
    public final void rule__RootPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1070:1: ( rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4 )
            // InternalCls.g:1071:2: rule__RootPackage__Group__3__Impl rule__RootPackage__Group__4
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
    // InternalCls.g:1078:1: rule__RootPackage__Group__3__Impl : ( ( rule__RootPackage__ClassifiersAssignment_3 )* ) ;
    public final void rule__RootPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1082:1: ( ( ( rule__RootPackage__ClassifiersAssignment_3 )* ) )
            // InternalCls.g:1083:1: ( ( rule__RootPackage__ClassifiersAssignment_3 )* )
            {
            // InternalCls.g:1083:1: ( ( rule__RootPackage__ClassifiersAssignment_3 )* )
            // InternalCls.g:1084:2: ( rule__RootPackage__ClassifiersAssignment_3 )*
            {
             before(grammarAccess.getRootPackageAccess().getClassifiersAssignment_3()); 
            // InternalCls.g:1085:2: ( rule__RootPackage__ClassifiersAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=12 && LA10_0<=18)||LA10_0==30||LA10_0==32||LA10_0==45) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCls.g:1085:3: rule__RootPackage__ClassifiersAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RootPackage__ClassifiersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCls.g:1093:1: rule__RootPackage__Group__4 : rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5 ;
    public final void rule__RootPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1097:1: ( rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5 )
            // InternalCls.g:1098:2: rule__RootPackage__Group__4__Impl rule__RootPackage__Group__5
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
    // InternalCls.g:1105:1: rule__RootPackage__Group__4__Impl : ( ( rule__RootPackage__ConnectorsAssignment_4 )* ) ;
    public final void rule__RootPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1109:1: ( ( ( rule__RootPackage__ConnectorsAssignment_4 )* ) )
            // InternalCls.g:1110:1: ( ( rule__RootPackage__ConnectorsAssignment_4 )* )
            {
            // InternalCls.g:1110:1: ( ( rule__RootPackage__ConnectorsAssignment_4 )* )
            // InternalCls.g:1111:2: ( rule__RootPackage__ConnectorsAssignment_4 )*
            {
             before(grammarAccess.getRootPackageAccess().getConnectorsAssignment_4()); 
            // InternalCls.g:1112:2: ( rule__RootPackage__ConnectorsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=19 && LA11_0<=21)||(LA11_0>=37 && LA11_0<=38)||LA11_0==43||LA11_0==47) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCls.g:1112:3: rule__RootPackage__ConnectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RootPackage__ConnectorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCls.g:1120:1: rule__RootPackage__Group__5 : rule__RootPackage__Group__5__Impl ;
    public final void rule__RootPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1124:1: ( rule__RootPackage__Group__5__Impl )
            // InternalCls.g:1125:2: rule__RootPackage__Group__5__Impl
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
    // InternalCls.g:1131:1: rule__RootPackage__Group__5__Impl : ( ( rule__RootPackage__PackagesAssignment_5 )* ) ;
    public final void rule__RootPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1135:1: ( ( ( rule__RootPackage__PackagesAssignment_5 )* ) )
            // InternalCls.g:1136:1: ( ( rule__RootPackage__PackagesAssignment_5 )* )
            {
            // InternalCls.g:1136:1: ( ( rule__RootPackage__PackagesAssignment_5 )* )
            // InternalCls.g:1137:2: ( rule__RootPackage__PackagesAssignment_5 )*
            {
             before(grammarAccess.getRootPackageAccess().getPackagesAssignment_5()); 
            // InternalCls.g:1138:2: ( rule__RootPackage__PackagesAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCls.g:1138:3: rule__RootPackage__PackagesAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__RootPackage__PackagesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalCls.g:1147:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1151:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalCls.g:1152:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalCls.g:1159:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1163:1: ( ( 'package' ) )
            // InternalCls.g:1164:1: ( 'package' )
            {
            // InternalCls.g:1164:1: ( 'package' )
            // InternalCls.g:1165:2: 'package'
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
    // InternalCls.g:1174:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1178:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalCls.g:1179:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalCls.g:1186:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1190:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalCls.g:1191:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalCls.g:1191:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalCls.g:1192:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalCls.g:1193:2: ( rule__Package__NameAssignment_1 )
            // InternalCls.g:1193:3: rule__Package__NameAssignment_1
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
    // InternalCls.g:1201:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1205:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalCls.g:1206:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalCls.g:1213:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1217:1: ( ( '{' ) )
            // InternalCls.g:1218:1: ( '{' )
            {
            // InternalCls.g:1218:1: ( '{' )
            // InternalCls.g:1219:2: '{'
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
    // InternalCls.g:1228:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1232:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalCls.g:1233:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalCls.g:1240:1: rule__Package__Group__3__Impl : ( ( rule__Package__PackageImportsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1244:1: ( ( ( rule__Package__PackageImportsAssignment_3 )* ) )
            // InternalCls.g:1245:1: ( ( rule__Package__PackageImportsAssignment_3 )* )
            {
            // InternalCls.g:1245:1: ( ( rule__Package__PackageImportsAssignment_3 )* )
            // InternalCls.g:1246:2: ( rule__Package__PackageImportsAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getPackageImportsAssignment_3()); 
            // InternalCls.g:1247:2: ( rule__Package__PackageImportsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCls.g:1247:3: rule__Package__PackageImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Package__PackageImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalCls.g:1255:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1259:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalCls.g:1260:2: rule__Package__Group__4__Impl rule__Package__Group__5
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
    // InternalCls.g:1267:1: rule__Package__Group__4__Impl : ( ( rule__Package__ClassifiersAssignment_4 )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1271:1: ( ( ( rule__Package__ClassifiersAssignment_4 )* ) )
            // InternalCls.g:1272:1: ( ( rule__Package__ClassifiersAssignment_4 )* )
            {
            // InternalCls.g:1272:1: ( ( rule__Package__ClassifiersAssignment_4 )* )
            // InternalCls.g:1273:2: ( rule__Package__ClassifiersAssignment_4 )*
            {
             before(grammarAccess.getPackageAccess().getClassifiersAssignment_4()); 
            // InternalCls.g:1274:2: ( rule__Package__ClassifiersAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=12 && LA14_0<=18)||LA14_0==30||LA14_0==32||LA14_0==45) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCls.g:1274:3: rule__Package__ClassifiersAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Package__ClassifiersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalCls.g:1282:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1286:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalCls.g:1287:2: rule__Package__Group__5__Impl rule__Package__Group__6
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
    // InternalCls.g:1294:1: rule__Package__Group__5__Impl : ( ( rule__Package__ConnectorsAssignment_5 )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1298:1: ( ( ( rule__Package__ConnectorsAssignment_5 )* ) )
            // InternalCls.g:1299:1: ( ( rule__Package__ConnectorsAssignment_5 )* )
            {
            // InternalCls.g:1299:1: ( ( rule__Package__ConnectorsAssignment_5 )* )
            // InternalCls.g:1300:2: ( rule__Package__ConnectorsAssignment_5 )*
            {
             before(grammarAccess.getPackageAccess().getConnectorsAssignment_5()); 
            // InternalCls.g:1301:2: ( rule__Package__ConnectorsAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=19 && LA15_0<=21)||(LA15_0>=37 && LA15_0<=38)||LA15_0==43||LA15_0==47) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCls.g:1301:3: rule__Package__ConnectorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Package__ConnectorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCls.g:1309:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1313:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalCls.g:1314:2: rule__Package__Group__6__Impl rule__Package__Group__7
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
    // InternalCls.g:1321:1: rule__Package__Group__6__Impl : ( ( rule__Package__PackagesAssignment_6 )* ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1325:1: ( ( ( rule__Package__PackagesAssignment_6 )* ) )
            // InternalCls.g:1326:1: ( ( rule__Package__PackagesAssignment_6 )* )
            {
            // InternalCls.g:1326:1: ( ( rule__Package__PackagesAssignment_6 )* )
            // InternalCls.g:1327:2: ( rule__Package__PackagesAssignment_6 )*
            {
             before(grammarAccess.getPackageAccess().getPackagesAssignment_6()); 
            // InternalCls.g:1328:2: ( rule__Package__PackagesAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCls.g:1328:3: rule__Package__PackagesAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Package__PackagesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalCls.g:1336:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1340:1: ( rule__Package__Group__7__Impl )
            // InternalCls.g:1341:2: rule__Package__Group__7__Impl
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
    // InternalCls.g:1347:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1351:1: ( ( '}' ) )
            // InternalCls.g:1352:1: ( '}' )
            {
            // InternalCls.g:1352:1: ( '}' )
            // InternalCls.g:1353:2: '}'
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
    // InternalCls.g:1363:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1367:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // InternalCls.g:1368:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
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
    // InternalCls.g:1375:1: rule__PackageImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1379:1: ( ( 'import' ) )
            // InternalCls.g:1380:1: ( 'import' )
            {
            // InternalCls.g:1380:1: ( 'import' )
            // InternalCls.g:1381:2: 'import'
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
    // InternalCls.g:1390:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1394:1: ( rule__PackageImport__Group__1__Impl )
            // InternalCls.g:1395:2: rule__PackageImport__Group__1__Impl
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
    // InternalCls.g:1401:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__ImportedPackageAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1405:1: ( ( ( rule__PackageImport__ImportedPackageAssignment_1 ) ) )
            // InternalCls.g:1406:1: ( ( rule__PackageImport__ImportedPackageAssignment_1 ) )
            {
            // InternalCls.g:1406:1: ( ( rule__PackageImport__ImportedPackageAssignment_1 ) )
            // InternalCls.g:1407:2: ( rule__PackageImport__ImportedPackageAssignment_1 )
            {
             before(grammarAccess.getPackageImportAccess().getImportedPackageAssignment_1()); 
            // InternalCls.g:1408:2: ( rule__PackageImport__ImportedPackageAssignment_1 )
            // InternalCls.g:1408:3: rule__PackageImport__ImportedPackageAssignment_1
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
    // InternalCls.g:1417:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1421:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCls.g:1422:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalCls.g:1429:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1433:1: ( ( RULE_ID ) )
            // InternalCls.g:1434:1: ( RULE_ID )
            {
            // InternalCls.g:1434:1: ( RULE_ID )
            // InternalCls.g:1435:2: RULE_ID
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
    // InternalCls.g:1444:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1448:1: ( rule__FQN__Group__1__Impl )
            // InternalCls.g:1449:2: rule__FQN__Group__1__Impl
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
    // InternalCls.g:1455:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1459:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCls.g:1460:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCls.g:1460:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCls.g:1461:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCls.g:1462:2: ( rule__FQN__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCls.g:1462:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalCls.g:1471:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1475:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCls.g:1476:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalCls.g:1483:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1487:1: ( ( '.' ) )
            // InternalCls.g:1488:1: ( '.' )
            {
            // InternalCls.g:1488:1: ( '.' )
            // InternalCls.g:1489:2: '.'
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
    // InternalCls.g:1498:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1502:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCls.g:1503:2: rule__FQN__Group_1__1__Impl
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
    // InternalCls.g:1509:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1513:1: ( ( RULE_ID ) )
            // InternalCls.g:1514:1: ( RULE_ID )
            {
            // InternalCls.g:1514:1: ( RULE_ID )
            // InternalCls.g:1515:2: RULE_ID
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
    // InternalCls.g:1525:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1529:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalCls.g:1530:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalCls.g:1537:1: rule__Class__Group__0__Impl : ( ( rule__Class__VisibilityAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1541:1: ( ( ( rule__Class__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1542:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1542:1: ( ( rule__Class__VisibilityAssignment_0 )? )
            // InternalCls.g:1543:2: ( rule__Class__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1544:2: ( rule__Class__VisibilityAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=12 && LA18_0<=18)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCls.g:1544:3: rule__Class__VisibilityAssignment_0
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
    // InternalCls.g:1552:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1556:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalCls.g:1557:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalCls.g:1564:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1568:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalCls.g:1569:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalCls.g:1569:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalCls.g:1570:2: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalCls.g:1571:2: ( rule__Class__AbstractAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCls.g:1571:3: rule__Class__AbstractAssignment_1
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
    // InternalCls.g:1579:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1583:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalCls.g:1584:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalCls.g:1591:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1595:1: ( ( 'class' ) )
            // InternalCls.g:1596:1: ( 'class' )
            {
            // InternalCls.g:1596:1: ( 'class' )
            // InternalCls.g:1597:2: 'class'
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
    // InternalCls.g:1606:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1610:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalCls.g:1611:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalCls.g:1618:1: rule__Class__Group__3__Impl : ( ( rule__Class__Alternatives_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1622:1: ( ( ( rule__Class__Alternatives_3 ) ) )
            // InternalCls.g:1623:1: ( ( rule__Class__Alternatives_3 ) )
            {
            // InternalCls.g:1623:1: ( ( rule__Class__Alternatives_3 ) )
            // InternalCls.g:1624:2: ( rule__Class__Alternatives_3 )
            {
             before(grammarAccess.getClassAccess().getAlternatives_3()); 
            // InternalCls.g:1625:2: ( rule__Class__Alternatives_3 )
            // InternalCls.g:1625:3: rule__Class__Alternatives_3
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
    // InternalCls.g:1633:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1637:1: ( rule__Class__Group__4__Impl )
            // InternalCls.g:1638:2: rule__Class__Group__4__Impl
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
    // InternalCls.g:1644:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1648:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalCls.g:1649:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalCls.g:1649:1: ( ( rule__Class__Group_4__0 )? )
            // InternalCls.g:1650:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalCls.g:1651:2: ( rule__Class__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCls.g:1651:3: rule__Class__Group_4__0
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
    // InternalCls.g:1660:1: rule__Class__Group_3_0__0 : rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1 ;
    public final void rule__Class__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1664:1: ( rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1 )
            // InternalCls.g:1665:2: rule__Class__Group_3_0__0__Impl rule__Class__Group_3_0__1
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
    // InternalCls.g:1672:1: rule__Class__Group_3_0__0__Impl : ( ( rule__Class__NameAssignment_3_0_0 ) ) ;
    public final void rule__Class__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1676:1: ( ( ( rule__Class__NameAssignment_3_0_0 ) ) )
            // InternalCls.g:1677:1: ( ( rule__Class__NameAssignment_3_0_0 ) )
            {
            // InternalCls.g:1677:1: ( ( rule__Class__NameAssignment_3_0_0 ) )
            // InternalCls.g:1678:2: ( rule__Class__NameAssignment_3_0_0 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3_0_0()); 
            // InternalCls.g:1679:2: ( rule__Class__NameAssignment_3_0_0 )
            // InternalCls.g:1679:3: rule__Class__NameAssignment_3_0_0
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
    // InternalCls.g:1687:1: rule__Class__Group_3_0__1 : rule__Class__Group_3_0__1__Impl rule__Class__Group_3_0__2 ;
    public final void rule__Class__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1691:1: ( rule__Class__Group_3_0__1__Impl rule__Class__Group_3_0__2 )
            // InternalCls.g:1692:2: rule__Class__Group_3_0__1__Impl rule__Class__Group_3_0__2
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
    // InternalCls.g:1699:1: rule__Class__Group_3_0__1__Impl : ( 'as' ) ;
    public final void rule__Class__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1703:1: ( ( 'as' ) )
            // InternalCls.g:1704:1: ( 'as' )
            {
            // InternalCls.g:1704:1: ( 'as' )
            // InternalCls.g:1705:2: 'as'
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
    // InternalCls.g:1714:1: rule__Class__Group_3_0__2 : rule__Class__Group_3_0__2__Impl ;
    public final void rule__Class__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1718:1: ( rule__Class__Group_3_0__2__Impl )
            // InternalCls.g:1719:2: rule__Class__Group_3_0__2__Impl
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
    // InternalCls.g:1725:1: rule__Class__Group_3_0__2__Impl : ( ( rule__Class__AliasAssignment_3_0_2 ) ) ;
    public final void rule__Class__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1729:1: ( ( ( rule__Class__AliasAssignment_3_0_2 ) ) )
            // InternalCls.g:1730:1: ( ( rule__Class__AliasAssignment_3_0_2 ) )
            {
            // InternalCls.g:1730:1: ( ( rule__Class__AliasAssignment_3_0_2 ) )
            // InternalCls.g:1731:2: ( rule__Class__AliasAssignment_3_0_2 )
            {
             before(grammarAccess.getClassAccess().getAliasAssignment_3_0_2()); 
            // InternalCls.g:1732:2: ( rule__Class__AliasAssignment_3_0_2 )
            // InternalCls.g:1732:3: rule__Class__AliasAssignment_3_0_2
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


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalCls.g:1741:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1745:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalCls.g:1746:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
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
    // InternalCls.g:1753:1: rule__Class__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1757:1: ( ( '{' ) )
            // InternalCls.g:1758:1: ( '{' )
            {
            // InternalCls.g:1758:1: ( '{' )
            // InternalCls.g:1759:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCls.g:1768:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl rule__Class__Group_4__2 ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1772:1: ( rule__Class__Group_4__1__Impl rule__Class__Group_4__2 )
            // InternalCls.g:1773:2: rule__Class__Group_4__1__Impl rule__Class__Group_4__2
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
    // InternalCls.g:1780:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__MembersAssignment_4_1 )* ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1784:1: ( ( ( rule__Class__MembersAssignment_4_1 )* ) )
            // InternalCls.g:1785:1: ( ( rule__Class__MembersAssignment_4_1 )* )
            {
            // InternalCls.g:1785:1: ( ( rule__Class__MembersAssignment_4_1 )* )
            // InternalCls.g:1786:2: ( rule__Class__MembersAssignment_4_1 )*
            {
             before(grammarAccess.getClassAccess().getMembersAssignment_4_1()); 
            // InternalCls.g:1787:2: ( rule__Class__MembersAssignment_4_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=12 && LA21_0<=18)||(LA21_0>=45 && LA21_0<=46)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCls.g:1787:3: rule__Class__MembersAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Class__MembersAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalCls.g:1795:1: rule__Class__Group_4__2 : rule__Class__Group_4__2__Impl ;
    public final void rule__Class__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1799:1: ( rule__Class__Group_4__2__Impl )
            // InternalCls.g:1800:2: rule__Class__Group_4__2__Impl
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
    // InternalCls.g:1806:1: rule__Class__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Class__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1810:1: ( ( '}' ) )
            // InternalCls.g:1811:1: ( '}' )
            {
            // InternalCls.g:1811:1: ( '}' )
            // InternalCls.g:1812:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCls.g:1822:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1826:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalCls.g:1827:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
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
    // InternalCls.g:1834:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__VisibilityAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1838:1: ( ( ( rule__Interface__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1839:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1839:1: ( ( rule__Interface__VisibilityAssignment_0 )? )
            // InternalCls.g:1840:2: ( rule__Interface__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1841:2: ( rule__Interface__VisibilityAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=12 && LA22_0<=18)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCls.g:1841:3: rule__Interface__VisibilityAssignment_0
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
    // InternalCls.g:1849:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1853:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalCls.g:1854:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
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
    // InternalCls.g:1861:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1865:1: ( ( 'interface' ) )
            // InternalCls.g:1866:1: ( 'interface' )
            {
            // InternalCls.g:1866:1: ( 'interface' )
            // InternalCls.g:1867:2: 'interface'
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
    // InternalCls.g:1876:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1880:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalCls.g:1881:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
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
    // InternalCls.g:1888:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__Alternatives_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1892:1: ( ( ( rule__Interface__Alternatives_2 ) ) )
            // InternalCls.g:1893:1: ( ( rule__Interface__Alternatives_2 ) )
            {
            // InternalCls.g:1893:1: ( ( rule__Interface__Alternatives_2 ) )
            // InternalCls.g:1894:2: ( rule__Interface__Alternatives_2 )
            {
             before(grammarAccess.getInterfaceAccess().getAlternatives_2()); 
            // InternalCls.g:1895:2: ( rule__Interface__Alternatives_2 )
            // InternalCls.g:1895:3: rule__Interface__Alternatives_2
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
    // InternalCls.g:1903:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1907:1: ( rule__Interface__Group__3__Impl )
            // InternalCls.g:1908:2: rule__Interface__Group__3__Impl
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
    // InternalCls.g:1914:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__Group_3__0 )? ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1918:1: ( ( ( rule__Interface__Group_3__0 )? ) )
            // InternalCls.g:1919:1: ( ( rule__Interface__Group_3__0 )? )
            {
            // InternalCls.g:1919:1: ( ( rule__Interface__Group_3__0 )? )
            // InternalCls.g:1920:2: ( rule__Interface__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_3()); 
            // InternalCls.g:1921:2: ( rule__Interface__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCls.g:1921:3: rule__Interface__Group_3__0
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
    // InternalCls.g:1930:1: rule__Interface__Group_2_0__0 : rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1 ;
    public final void rule__Interface__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1934:1: ( rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1 )
            // InternalCls.g:1935:2: rule__Interface__Group_2_0__0__Impl rule__Interface__Group_2_0__1
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
    // InternalCls.g:1942:1: rule__Interface__Group_2_0__0__Impl : ( ( rule__Interface__NameAssignment_2_0_0 ) ) ;
    public final void rule__Interface__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1946:1: ( ( ( rule__Interface__NameAssignment_2_0_0 ) ) )
            // InternalCls.g:1947:1: ( ( rule__Interface__NameAssignment_2_0_0 ) )
            {
            // InternalCls.g:1947:1: ( ( rule__Interface__NameAssignment_2_0_0 ) )
            // InternalCls.g:1948:2: ( rule__Interface__NameAssignment_2_0_0 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2_0_0()); 
            // InternalCls.g:1949:2: ( rule__Interface__NameAssignment_2_0_0 )
            // InternalCls.g:1949:3: rule__Interface__NameAssignment_2_0_0
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
    // InternalCls.g:1957:1: rule__Interface__Group_2_0__1 : rule__Interface__Group_2_0__1__Impl rule__Interface__Group_2_0__2 ;
    public final void rule__Interface__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1961:1: ( rule__Interface__Group_2_0__1__Impl rule__Interface__Group_2_0__2 )
            // InternalCls.g:1962:2: rule__Interface__Group_2_0__1__Impl rule__Interface__Group_2_0__2
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
    // InternalCls.g:1969:1: rule__Interface__Group_2_0__1__Impl : ( 'as' ) ;
    public final void rule__Interface__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1973:1: ( ( 'as' ) )
            // InternalCls.g:1974:1: ( 'as' )
            {
            // InternalCls.g:1974:1: ( 'as' )
            // InternalCls.g:1975:2: 'as'
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
    // InternalCls.g:1984:1: rule__Interface__Group_2_0__2 : rule__Interface__Group_2_0__2__Impl ;
    public final void rule__Interface__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1988:1: ( rule__Interface__Group_2_0__2__Impl )
            // InternalCls.g:1989:2: rule__Interface__Group_2_0__2__Impl
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
    // InternalCls.g:1995:1: rule__Interface__Group_2_0__2__Impl : ( ( rule__Interface__AliasAssignment_2_0_2 ) ) ;
    public final void rule__Interface__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1999:1: ( ( ( rule__Interface__AliasAssignment_2_0_2 ) ) )
            // InternalCls.g:2000:1: ( ( rule__Interface__AliasAssignment_2_0_2 ) )
            {
            // InternalCls.g:2000:1: ( ( rule__Interface__AliasAssignment_2_0_2 ) )
            // InternalCls.g:2001:2: ( rule__Interface__AliasAssignment_2_0_2 )
            {
             before(grammarAccess.getInterfaceAccess().getAliasAssignment_2_0_2()); 
            // InternalCls.g:2002:2: ( rule__Interface__AliasAssignment_2_0_2 )
            // InternalCls.g:2002:3: rule__Interface__AliasAssignment_2_0_2
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


    // $ANTLR start "rule__Interface__Group_3__0"
    // InternalCls.g:2011:1: rule__Interface__Group_3__0 : rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 ;
    public final void rule__Interface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2015:1: ( rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 )
            // InternalCls.g:2016:2: rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1
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
    // InternalCls.g:2023:1: rule__Interface__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Interface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2027:1: ( ( '{' ) )
            // InternalCls.g:2028:1: ( '{' )
            {
            // InternalCls.g:2028:1: ( '{' )
            // InternalCls.g:2029:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCls.g:2038:1: rule__Interface__Group_3__1 : rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 ;
    public final void rule__Interface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2042:1: ( rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 )
            // InternalCls.g:2043:2: rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2
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
    // InternalCls.g:2050:1: rule__Interface__Group_3__1__Impl : ( ( rule__Interface__MembersAssignment_3_1 )* ) ;
    public final void rule__Interface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2054:1: ( ( ( rule__Interface__MembersAssignment_3_1 )* ) )
            // InternalCls.g:2055:1: ( ( rule__Interface__MembersAssignment_3_1 )* )
            {
            // InternalCls.g:2055:1: ( ( rule__Interface__MembersAssignment_3_1 )* )
            // InternalCls.g:2056:2: ( rule__Interface__MembersAssignment_3_1 )*
            {
             before(grammarAccess.getInterfaceAccess().getMembersAssignment_3_1()); 
            // InternalCls.g:2057:2: ( rule__Interface__MembersAssignment_3_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=12 && LA24_0<=18)||(LA24_0>=45 && LA24_0<=46)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCls.g:2057:3: rule__Interface__MembersAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Interface__MembersAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalCls.g:2065:1: rule__Interface__Group_3__2 : rule__Interface__Group_3__2__Impl ;
    public final void rule__Interface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2069:1: ( rule__Interface__Group_3__2__Impl )
            // InternalCls.g:2070:2: rule__Interface__Group_3__2__Impl
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
    // InternalCls.g:2076:1: rule__Interface__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Interface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2080:1: ( ( '}' ) )
            // InternalCls.g:2081:1: ( '}' )
            {
            // InternalCls.g:2081:1: ( '}' )
            // InternalCls.g:2082:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCls.g:2092:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2096:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalCls.g:2097:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalCls.g:2104:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2108:1: ( ( () ) )
            // InternalCls.g:2109:1: ( () )
            {
            // InternalCls.g:2109:1: ( () )
            // InternalCls.g:2110:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalCls.g:2111:2: ()
            // InternalCls.g:2111:3: 
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
    // InternalCls.g:2119:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2123:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalCls.g:2124:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalCls.g:2131:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__VisibilityAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2135:1: ( ( ( rule__Attribute__VisibilityAssignment_1 )? ) )
            // InternalCls.g:2136:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            {
            // InternalCls.g:2136:1: ( ( rule__Attribute__VisibilityAssignment_1 )? )
            // InternalCls.g:2137:2: ( rule__Attribute__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_1()); 
            // InternalCls.g:2138:2: ( rule__Attribute__VisibilityAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=12 && LA25_0<=18)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCls.g:2138:3: rule__Attribute__VisibilityAssignment_1
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
    // InternalCls.g:2146:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2150:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalCls.g:2151:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalCls.g:2158:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__StaticAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2162:1: ( ( ( rule__Attribute__StaticAssignment_2 )? ) )
            // InternalCls.g:2163:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            {
            // InternalCls.g:2163:1: ( ( rule__Attribute__StaticAssignment_2 )? )
            // InternalCls.g:2164:2: ( rule__Attribute__StaticAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getStaticAssignment_2()); 
            // InternalCls.g:2165:2: ( rule__Attribute__StaticAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:2165:3: rule__Attribute__StaticAssignment_2
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
    // InternalCls.g:2173:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2177:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalCls.g:2178:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalCls.g:2185:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2189:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // InternalCls.g:2190:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // InternalCls.g:2190:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // InternalCls.g:2191:2: ( rule__Attribute__NameAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            // InternalCls.g:2192:2: ( rule__Attribute__NameAssignment_3 )
            // InternalCls.g:2192:3: rule__Attribute__NameAssignment_3
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
    // InternalCls.g:2200:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2204:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalCls.g:2205:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalCls.g:2212:1: rule__Attribute__Group__4__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2216:1: ( ( ':' ) )
            // InternalCls.g:2217:1: ( ':' )
            {
            // InternalCls.g:2217:1: ( ':' )
            // InternalCls.g:2218:2: ':'
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
    // InternalCls.g:2227:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2231:1: ( rule__Attribute__Group__5__Impl )
            // InternalCls.g:2232:2: rule__Attribute__Group__5__Impl
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
    // InternalCls.g:2238:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__TypeAssignment_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2242:1: ( ( ( rule__Attribute__TypeAssignment_5 ) ) )
            // InternalCls.g:2243:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            {
            // InternalCls.g:2243:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            // InternalCls.g:2244:2: ( rule__Attribute__TypeAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 
            // InternalCls.g:2245:2: ( rule__Attribute__TypeAssignment_5 )
            // InternalCls.g:2245:3: rule__Attribute__TypeAssignment_5
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
    // InternalCls.g:2254:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2258:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalCls.g:2259:2: rule__Method__Group__0__Impl rule__Method__Group__1
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
    // InternalCls.g:2266:1: rule__Method__Group__0__Impl : ( ( rule__Method__VisibilityAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2270:1: ( ( ( rule__Method__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2271:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2271:1: ( ( rule__Method__VisibilityAssignment_0 )? )
            // InternalCls.g:2272:2: ( rule__Method__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2273:2: ( rule__Method__VisibilityAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=12 && LA27_0<=18)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCls.g:2273:3: rule__Method__VisibilityAssignment_0
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
    // InternalCls.g:2281:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2285:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalCls.g:2286:2: rule__Method__Group__1__Impl rule__Method__Group__2
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
    // InternalCls.g:2293:1: rule__Method__Group__1__Impl : ( ( rule__Method__AbstractAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2297:1: ( ( ( rule__Method__AbstractAssignment_1 )? ) )
            // InternalCls.g:2298:1: ( ( rule__Method__AbstractAssignment_1 )? )
            {
            // InternalCls.g:2298:1: ( ( rule__Method__AbstractAssignment_1 )? )
            // InternalCls.g:2299:2: ( rule__Method__AbstractAssignment_1 )?
            {
             before(grammarAccess.getMethodAccess().getAbstractAssignment_1()); 
            // InternalCls.g:2300:2: ( rule__Method__AbstractAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCls.g:2300:3: rule__Method__AbstractAssignment_1
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
    // InternalCls.g:2308:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2312:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalCls.g:2313:2: rule__Method__Group__2__Impl rule__Method__Group__3
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
    // InternalCls.g:2320:1: rule__Method__Group__2__Impl : ( ( rule__Method__StaticAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2324:1: ( ( ( rule__Method__StaticAssignment_2 )? ) )
            // InternalCls.g:2325:1: ( ( rule__Method__StaticAssignment_2 )? )
            {
            // InternalCls.g:2325:1: ( ( rule__Method__StaticAssignment_2 )? )
            // InternalCls.g:2326:2: ( rule__Method__StaticAssignment_2 )?
            {
             before(grammarAccess.getMethodAccess().getStaticAssignment_2()); 
            // InternalCls.g:2327:2: ( rule__Method__StaticAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:2327:3: rule__Method__StaticAssignment_2
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
    // InternalCls.g:2335:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2339:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalCls.g:2340:2: rule__Method__Group__3__Impl rule__Method__Group__4
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
    // InternalCls.g:2347:1: rule__Method__Group__3__Impl : ( ( rule__Method__NameAssignment_3 ) ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2351:1: ( ( ( rule__Method__NameAssignment_3 ) ) )
            // InternalCls.g:2352:1: ( ( rule__Method__NameAssignment_3 ) )
            {
            // InternalCls.g:2352:1: ( ( rule__Method__NameAssignment_3 ) )
            // InternalCls.g:2353:2: ( rule__Method__NameAssignment_3 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_3()); 
            // InternalCls.g:2354:2: ( rule__Method__NameAssignment_3 )
            // InternalCls.g:2354:3: rule__Method__NameAssignment_3
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
    // InternalCls.g:2362:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2366:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalCls.g:2367:2: rule__Method__Group__4__Impl rule__Method__Group__5
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
    // InternalCls.g:2374:1: rule__Method__Group__4__Impl : ( '(' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2378:1: ( ( '(' ) )
            // InternalCls.g:2379:1: ( '(' )
            {
            // InternalCls.g:2379:1: ( '(' )
            // InternalCls.g:2380:2: '('
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
    // InternalCls.g:2389:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2393:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalCls.g:2394:2: rule__Method__Group__5__Impl rule__Method__Group__6
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
    // InternalCls.g:2401:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )* ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2405:1: ( ( ( rule__Method__Group_5__0 )* ) )
            // InternalCls.g:2406:1: ( ( rule__Method__Group_5__0 )* )
            {
            // InternalCls.g:2406:1: ( ( rule__Method__Group_5__0 )* )
            // InternalCls.g:2407:2: ( rule__Method__Group_5__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // InternalCls.g:2408:2: ( rule__Method__Group_5__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=12 && LA30_0<=18)||LA30_0==46) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCls.g:2408:3: rule__Method__Group_5__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Method__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalCls.g:2416:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2420:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalCls.g:2421:2: rule__Method__Group__6__Impl rule__Method__Group__7
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
    // InternalCls.g:2428:1: rule__Method__Group__6__Impl : ( ')' ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2432:1: ( ( ')' ) )
            // InternalCls.g:2433:1: ( ')' )
            {
            // InternalCls.g:2433:1: ( ')' )
            // InternalCls.g:2434:2: ')'
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
    // InternalCls.g:2443:1: rule__Method__Group__7 : rule__Method__Group__7__Impl ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2447:1: ( rule__Method__Group__7__Impl )
            // InternalCls.g:2448:2: rule__Method__Group__7__Impl
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
    // InternalCls.g:2454:1: rule__Method__Group__7__Impl : ( ( rule__Method__Group_7__0 )? ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2458:1: ( ( ( rule__Method__Group_7__0 )? ) )
            // InternalCls.g:2459:1: ( ( rule__Method__Group_7__0 )? )
            {
            // InternalCls.g:2459:1: ( ( rule__Method__Group_7__0 )? )
            // InternalCls.g:2460:2: ( rule__Method__Group_7__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_7()); 
            // InternalCls.g:2461:2: ( rule__Method__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCls.g:2461:3: rule__Method__Group_7__0
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
    // InternalCls.g:2470:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2474:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // InternalCls.g:2475:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
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
    // InternalCls.g:2482:1: rule__Method__Group_5__0__Impl : ( ( rule__Method__ParametersAssignment_5_0 ) ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2486:1: ( ( ( rule__Method__ParametersAssignment_5_0 ) ) )
            // InternalCls.g:2487:1: ( ( rule__Method__ParametersAssignment_5_0 ) )
            {
            // InternalCls.g:2487:1: ( ( rule__Method__ParametersAssignment_5_0 ) )
            // InternalCls.g:2488:2: ( rule__Method__ParametersAssignment_5_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_5_0()); 
            // InternalCls.g:2489:2: ( rule__Method__ParametersAssignment_5_0 )
            // InternalCls.g:2489:3: rule__Method__ParametersAssignment_5_0
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
    // InternalCls.g:2497:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2501:1: ( rule__Method__Group_5__1__Impl )
            // InternalCls.g:2502:2: rule__Method__Group_5__1__Impl
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
    // InternalCls.g:2508:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__Group_5_1__0 )* ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2512:1: ( ( ( rule__Method__Group_5_1__0 )* ) )
            // InternalCls.g:2513:1: ( ( rule__Method__Group_5_1__0 )* )
            {
            // InternalCls.g:2513:1: ( ( rule__Method__Group_5_1__0 )* )
            // InternalCls.g:2514:2: ( rule__Method__Group_5_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_5_1()); 
            // InternalCls.g:2515:2: ( rule__Method__Group_5_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCls.g:2515:3: rule__Method__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Method__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalCls.g:2524:1: rule__Method__Group_5_1__0 : rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1 ;
    public final void rule__Method__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2528:1: ( rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1 )
            // InternalCls.g:2529:2: rule__Method__Group_5_1__0__Impl rule__Method__Group_5_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:2536:1: rule__Method__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2540:1: ( ( ',' ) )
            // InternalCls.g:2541:1: ( ',' )
            {
            // InternalCls.g:2541:1: ( ',' )
            // InternalCls.g:2542:2: ','
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
    // InternalCls.g:2551:1: rule__Method__Group_5_1__1 : rule__Method__Group_5_1__1__Impl ;
    public final void rule__Method__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2555:1: ( rule__Method__Group_5_1__1__Impl )
            // InternalCls.g:2556:2: rule__Method__Group_5_1__1__Impl
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
    // InternalCls.g:2562:1: rule__Method__Group_5_1__1__Impl : ( ( rule__Method__ParametersAssignment_5_1_1 ) ) ;
    public final void rule__Method__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2566:1: ( ( ( rule__Method__ParametersAssignment_5_1_1 ) ) )
            // InternalCls.g:2567:1: ( ( rule__Method__ParametersAssignment_5_1_1 ) )
            {
            // InternalCls.g:2567:1: ( ( rule__Method__ParametersAssignment_5_1_1 ) )
            // InternalCls.g:2568:2: ( rule__Method__ParametersAssignment_5_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_5_1_1()); 
            // InternalCls.g:2569:2: ( rule__Method__ParametersAssignment_5_1_1 )
            // InternalCls.g:2569:3: rule__Method__ParametersAssignment_5_1_1
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
    // InternalCls.g:2578:1: rule__Method__Group_7__0 : rule__Method__Group_7__0__Impl rule__Method__Group_7__1 ;
    public final void rule__Method__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2582:1: ( rule__Method__Group_7__0__Impl rule__Method__Group_7__1 )
            // InternalCls.g:2583:2: rule__Method__Group_7__0__Impl rule__Method__Group_7__1
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
    // InternalCls.g:2590:1: rule__Method__Group_7__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2594:1: ( ( ':' ) )
            // InternalCls.g:2595:1: ( ':' )
            {
            // InternalCls.g:2595:1: ( ':' )
            // InternalCls.g:2596:2: ':'
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
    // InternalCls.g:2605:1: rule__Method__Group_7__1 : rule__Method__Group_7__1__Impl ;
    public final void rule__Method__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2609:1: ( rule__Method__Group_7__1__Impl )
            // InternalCls.g:2610:2: rule__Method__Group_7__1__Impl
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
    // InternalCls.g:2616:1: rule__Method__Group_7__1__Impl : ( ( rule__Method__TypeAssignment_7_1 ) ) ;
    public final void rule__Method__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2620:1: ( ( ( rule__Method__TypeAssignment_7_1 ) ) )
            // InternalCls.g:2621:1: ( ( rule__Method__TypeAssignment_7_1 ) )
            {
            // InternalCls.g:2621:1: ( ( rule__Method__TypeAssignment_7_1 ) )
            // InternalCls.g:2622:2: ( rule__Method__TypeAssignment_7_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_7_1()); 
            // InternalCls.g:2623:2: ( rule__Method__TypeAssignment_7_1 )
            // InternalCls.g:2623:3: rule__Method__TypeAssignment_7_1
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
    // InternalCls.g:2632:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2636:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCls.g:2637:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalCls.g:2644:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__VisibilityAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2648:1: ( ( ( rule__Parameter__VisibilityAssignment_0 )? ) )
            // InternalCls.g:2649:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:2649:1: ( ( rule__Parameter__VisibilityAssignment_0 )? )
            // InternalCls.g:2650:2: ( rule__Parameter__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:2651:2: ( rule__Parameter__VisibilityAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=12 && LA33_0<=18)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:2651:3: rule__Parameter__VisibilityAssignment_0
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
    // InternalCls.g:2659:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2663:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCls.g:2664:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalCls.g:2671:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__StaticAssignment_1 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2675:1: ( ( ( rule__Parameter__StaticAssignment_1 )? ) )
            // InternalCls.g:2676:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            {
            // InternalCls.g:2676:1: ( ( rule__Parameter__StaticAssignment_1 )? )
            // InternalCls.g:2677:2: ( rule__Parameter__StaticAssignment_1 )?
            {
             before(grammarAccess.getParameterAccess().getStaticAssignment_1()); 
            // InternalCls.g:2678:2: ( rule__Parameter__StaticAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCls.g:2678:3: rule__Parameter__StaticAssignment_1
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
    // InternalCls.g:2686:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2690:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCls.g:2691:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:2698:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2702:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalCls.g:2703:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalCls.g:2703:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalCls.g:2704:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalCls.g:2705:2: ( rule__Parameter__NameAssignment_2 )
            // InternalCls.g:2705:3: rule__Parameter__NameAssignment_2
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
    // InternalCls.g:2713:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2717:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalCls.g:2718:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
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
    // InternalCls.g:2725:1: rule__Parameter__Group__3__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2729:1: ( ( ':' ) )
            // InternalCls.g:2730:1: ( ':' )
            {
            // InternalCls.g:2730:1: ( ':' )
            // InternalCls.g:2731:2: ':'
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
    // InternalCls.g:2740:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2744:1: ( rule__Parameter__Group__4__Impl )
            // InternalCls.g:2745:2: rule__Parameter__Group__4__Impl
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
    // InternalCls.g:2751:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__TypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2755:1: ( ( ( rule__Parameter__TypeAssignment_4 ) ) )
            // InternalCls.g:2756:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            {
            // InternalCls.g:2756:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            // InternalCls.g:2757:2: ( rule__Parameter__TypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_4()); 
            // InternalCls.g:2758:2: ( rule__Parameter__TypeAssignment_4 )
            // InternalCls.g:2758:3: rule__Parameter__TypeAssignment_4
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
    // InternalCls.g:2767:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2771:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalCls.g:2772:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
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
    // InternalCls.g:2779:1: rule__Generalization__Group__0__Impl : ( 'isa' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2783:1: ( ( 'isa' ) )
            // InternalCls.g:2784:1: ( 'isa' )
            {
            // InternalCls.g:2784:1: ( 'isa' )
            // InternalCls.g:2785:2: 'isa'
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
    // InternalCls.g:2794:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2798:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalCls.g:2799:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
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
    // InternalCls.g:2806:1: rule__Generalization__Group__1__Impl : ( '(' ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2810:1: ( ( '(' ) )
            // InternalCls.g:2811:1: ( '(' )
            {
            // InternalCls.g:2811:1: ( '(' )
            // InternalCls.g:2812:2: '('
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
    // InternalCls.g:2821:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2825:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalCls.g:2826:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
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
    // InternalCls.g:2833:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__LeftAssignment_2 ) ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2837:1: ( ( ( rule__Generalization__LeftAssignment_2 ) ) )
            // InternalCls.g:2838:1: ( ( rule__Generalization__LeftAssignment_2 ) )
            {
            // InternalCls.g:2838:1: ( ( rule__Generalization__LeftAssignment_2 ) )
            // InternalCls.g:2839:2: ( rule__Generalization__LeftAssignment_2 )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssignment_2()); 
            // InternalCls.g:2840:2: ( rule__Generalization__LeftAssignment_2 )
            // InternalCls.g:2840:3: rule__Generalization__LeftAssignment_2
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
    // InternalCls.g:2848:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2852:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalCls.g:2853:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
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
    // InternalCls.g:2860:1: rule__Generalization__Group__3__Impl : ( ',' ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2864:1: ( ( ',' ) )
            // InternalCls.g:2865:1: ( ',' )
            {
            // InternalCls.g:2865:1: ( ',' )
            // InternalCls.g:2866:2: ','
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
    // InternalCls.g:2875:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2879:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalCls.g:2880:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalCls.g:2887:1: rule__Generalization__Group__4__Impl : ( ( rule__Generalization__RightAssignment_4 ) ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2891:1: ( ( ( rule__Generalization__RightAssignment_4 ) ) )
            // InternalCls.g:2892:1: ( ( rule__Generalization__RightAssignment_4 ) )
            {
            // InternalCls.g:2892:1: ( ( rule__Generalization__RightAssignment_4 ) )
            // InternalCls.g:2893:2: ( rule__Generalization__RightAssignment_4 )
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssignment_4()); 
            // InternalCls.g:2894:2: ( rule__Generalization__RightAssignment_4 )
            // InternalCls.g:2894:3: rule__Generalization__RightAssignment_4
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
    // InternalCls.g:2902:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2906:1: ( rule__Generalization__Group__5__Impl )
            // InternalCls.g:2907:2: rule__Generalization__Group__5__Impl
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
    // InternalCls.g:2913:1: rule__Generalization__Group__5__Impl : ( ')' ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2917:1: ( ( ')' ) )
            // InternalCls.g:2918:1: ( ')' )
            {
            // InternalCls.g:2918:1: ( ')' )
            // InternalCls.g:2919:2: ')'
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
    // InternalCls.g:2929:1: rule__Implementation__Group__0 : rule__Implementation__Group__0__Impl rule__Implementation__Group__1 ;
    public final void rule__Implementation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2933:1: ( rule__Implementation__Group__0__Impl rule__Implementation__Group__1 )
            // InternalCls.g:2934:2: rule__Implementation__Group__0__Impl rule__Implementation__Group__1
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
    // InternalCls.g:2941:1: rule__Implementation__Group__0__Impl : ( 'impl' ) ;
    public final void rule__Implementation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2945:1: ( ( 'impl' ) )
            // InternalCls.g:2946:1: ( 'impl' )
            {
            // InternalCls.g:2946:1: ( 'impl' )
            // InternalCls.g:2947:2: 'impl'
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
    // InternalCls.g:2956:1: rule__Implementation__Group__1 : rule__Implementation__Group__1__Impl rule__Implementation__Group__2 ;
    public final void rule__Implementation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2960:1: ( rule__Implementation__Group__1__Impl rule__Implementation__Group__2 )
            // InternalCls.g:2961:2: rule__Implementation__Group__1__Impl rule__Implementation__Group__2
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
    // InternalCls.g:2968:1: rule__Implementation__Group__1__Impl : ( '(' ) ;
    public final void rule__Implementation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2972:1: ( ( '(' ) )
            // InternalCls.g:2973:1: ( '(' )
            {
            // InternalCls.g:2973:1: ( '(' )
            // InternalCls.g:2974:2: '('
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
    // InternalCls.g:2983:1: rule__Implementation__Group__2 : rule__Implementation__Group__2__Impl rule__Implementation__Group__3 ;
    public final void rule__Implementation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2987:1: ( rule__Implementation__Group__2__Impl rule__Implementation__Group__3 )
            // InternalCls.g:2988:2: rule__Implementation__Group__2__Impl rule__Implementation__Group__3
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
    // InternalCls.g:2995:1: rule__Implementation__Group__2__Impl : ( ( rule__Implementation__LeftAssignment_2 ) ) ;
    public final void rule__Implementation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2999:1: ( ( ( rule__Implementation__LeftAssignment_2 ) ) )
            // InternalCls.g:3000:1: ( ( rule__Implementation__LeftAssignment_2 ) )
            {
            // InternalCls.g:3000:1: ( ( rule__Implementation__LeftAssignment_2 ) )
            // InternalCls.g:3001:2: ( rule__Implementation__LeftAssignment_2 )
            {
             before(grammarAccess.getImplementationAccess().getLeftAssignment_2()); 
            // InternalCls.g:3002:2: ( rule__Implementation__LeftAssignment_2 )
            // InternalCls.g:3002:3: rule__Implementation__LeftAssignment_2
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
    // InternalCls.g:3010:1: rule__Implementation__Group__3 : rule__Implementation__Group__3__Impl rule__Implementation__Group__4 ;
    public final void rule__Implementation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3014:1: ( rule__Implementation__Group__3__Impl rule__Implementation__Group__4 )
            // InternalCls.g:3015:2: rule__Implementation__Group__3__Impl rule__Implementation__Group__4
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
    // InternalCls.g:3022:1: rule__Implementation__Group__3__Impl : ( ',' ) ;
    public final void rule__Implementation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3026:1: ( ( ',' ) )
            // InternalCls.g:3027:1: ( ',' )
            {
            // InternalCls.g:3027:1: ( ',' )
            // InternalCls.g:3028:2: ','
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
    // InternalCls.g:3037:1: rule__Implementation__Group__4 : rule__Implementation__Group__4__Impl rule__Implementation__Group__5 ;
    public final void rule__Implementation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3041:1: ( rule__Implementation__Group__4__Impl rule__Implementation__Group__5 )
            // InternalCls.g:3042:2: rule__Implementation__Group__4__Impl rule__Implementation__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalCls.g:3049:1: rule__Implementation__Group__4__Impl : ( ( rule__Implementation__RightAssignment_4 ) ) ;
    public final void rule__Implementation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3053:1: ( ( ( rule__Implementation__RightAssignment_4 ) ) )
            // InternalCls.g:3054:1: ( ( rule__Implementation__RightAssignment_4 ) )
            {
            // InternalCls.g:3054:1: ( ( rule__Implementation__RightAssignment_4 ) )
            // InternalCls.g:3055:2: ( rule__Implementation__RightAssignment_4 )
            {
             before(grammarAccess.getImplementationAccess().getRightAssignment_4()); 
            // InternalCls.g:3056:2: ( rule__Implementation__RightAssignment_4 )
            // InternalCls.g:3056:3: rule__Implementation__RightAssignment_4
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
    // InternalCls.g:3064:1: rule__Implementation__Group__5 : rule__Implementation__Group__5__Impl ;
    public final void rule__Implementation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3068:1: ( rule__Implementation__Group__5__Impl )
            // InternalCls.g:3069:2: rule__Implementation__Group__5__Impl
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
    // InternalCls.g:3075:1: rule__Implementation__Group__5__Impl : ( ')' ) ;
    public final void rule__Implementation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3079:1: ( ( ')' ) )
            // InternalCls.g:3080:1: ( ')' )
            {
            // InternalCls.g:3080:1: ( ')' )
            // InternalCls.g:3081:2: ')'
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


    // $ANTLR start "rule__CommentLink__Group__0"
    // InternalCls.g:3091:1: rule__CommentLink__Group__0 : rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1 ;
    public final void rule__CommentLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3095:1: ( rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1 )
            // InternalCls.g:3096:2: rule__CommentLink__Group__0__Impl rule__CommentLink__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCls.g:3103:1: rule__CommentLink__Group__0__Impl : ( ( rule__CommentLink__CommentsAssignment_0 ) ) ;
    public final void rule__CommentLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3107:1: ( ( ( rule__CommentLink__CommentsAssignment_0 ) ) )
            // InternalCls.g:3108:1: ( ( rule__CommentLink__CommentsAssignment_0 ) )
            {
            // InternalCls.g:3108:1: ( ( rule__CommentLink__CommentsAssignment_0 ) )
            // InternalCls.g:3109:2: ( rule__CommentLink__CommentsAssignment_0 )
            {
             before(grammarAccess.getCommentLinkAccess().getCommentsAssignment_0()); 
            // InternalCls.g:3110:2: ( rule__CommentLink__CommentsAssignment_0 )
            // InternalCls.g:3110:3: rule__CommentLink__CommentsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CommentLink__CommentsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommentLinkAccess().getCommentsAssignment_0()); 

            }


            }

        }
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
    // InternalCls.g:3118:1: rule__CommentLink__Group__1 : rule__CommentLink__Group__1__Impl ;
    public final void rule__CommentLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3122:1: ( rule__CommentLink__Group__1__Impl )
            // InternalCls.g:3123:2: rule__CommentLink__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommentLink__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:3129:1: rule__CommentLink__Group__1__Impl : ( ( rule__CommentLink__CommentedElementAssignment_1 ) ) ;
    public final void rule__CommentLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3133:1: ( ( ( rule__CommentLink__CommentedElementAssignment_1 ) ) )
            // InternalCls.g:3134:1: ( ( rule__CommentLink__CommentedElementAssignment_1 ) )
            {
            // InternalCls.g:3134:1: ( ( rule__CommentLink__CommentedElementAssignment_1 ) )
            // InternalCls.g:3135:2: ( rule__CommentLink__CommentedElementAssignment_1 )
            {
             before(grammarAccess.getCommentLinkAccess().getCommentedElementAssignment_1()); 
            // InternalCls.g:3136:2: ( rule__CommentLink__CommentedElementAssignment_1 )
            // InternalCls.g:3136:3: rule__CommentLink__CommentedElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommentLink__CommentedElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentLinkAccess().getCommentedElementAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XtextAssociation__Group__0"
    // InternalCls.g:3145:1: rule__XtextAssociation__Group__0 : rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1 ;
    public final void rule__XtextAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3149:1: ( rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1 )
            // InternalCls.g:3150:2: rule__XtextAssociation__Group__0__Impl rule__XtextAssociation__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalCls.g:3157:1: rule__XtextAssociation__Group__0__Impl : ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? ) ;
    public final void rule__XtextAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3161:1: ( ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? ) )
            // InternalCls.g:3162:1: ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? )
            {
            // InternalCls.g:3162:1: ( ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )? )
            // InternalCls.g:3163:2: ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityAssignment_0()); 
            // InternalCls.g:3164:2: ( rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCls.g:3164:3: rule__XtextAssociation__TwoSideBidirectionalityAssignment_0
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
    // InternalCls.g:3172:1: rule__XtextAssociation__Group__1 : rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2 ;
    public final void rule__XtextAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3176:1: ( rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2 )
            // InternalCls.g:3177:2: rule__XtextAssociation__Group__1__Impl rule__XtextAssociation__Group__2
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
    // InternalCls.g:3184:1: rule__XtextAssociation__Group__1__Impl : ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) ) ;
    public final void rule__XtextAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3188:1: ( ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) ) )
            // InternalCls.g:3189:1: ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) )
            {
            // InternalCls.g:3189:1: ( ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 ) )
            // InternalCls.g:3190:2: ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideAggregationKindAssignment_1()); 
            // InternalCls.g:3191:2: ( rule__XtextAssociation__TwoSideAggregationKindAssignment_1 )
            // InternalCls.g:3191:3: rule__XtextAssociation__TwoSideAggregationKindAssignment_1
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
    // InternalCls.g:3199:1: rule__XtextAssociation__Group__2 : rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3 ;
    public final void rule__XtextAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3203:1: ( rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3 )
            // InternalCls.g:3204:2: rule__XtextAssociation__Group__2__Impl rule__XtextAssociation__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalCls.g:3211:1: rule__XtextAssociation__Group__2__Impl : ( ( rule__XtextAssociation__NameAssignment_2 ) ) ;
    public final void rule__XtextAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3215:1: ( ( ( rule__XtextAssociation__NameAssignment_2 ) ) )
            // InternalCls.g:3216:1: ( ( rule__XtextAssociation__NameAssignment_2 ) )
            {
            // InternalCls.g:3216:1: ( ( rule__XtextAssociation__NameAssignment_2 ) )
            // InternalCls.g:3217:2: ( rule__XtextAssociation__NameAssignment_2 )
            {
             before(grammarAccess.getXtextAssociationAccess().getNameAssignment_2()); 
            // InternalCls.g:3218:2: ( rule__XtextAssociation__NameAssignment_2 )
            // InternalCls.g:3218:3: rule__XtextAssociation__NameAssignment_2
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
    // InternalCls.g:3226:1: rule__XtextAssociation__Group__3 : rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4 ;
    public final void rule__XtextAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3230:1: ( rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4 )
            // InternalCls.g:3231:2: rule__XtextAssociation__Group__3__Impl rule__XtextAssociation__Group__4
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
    // InternalCls.g:3238:1: rule__XtextAssociation__Group__3__Impl : ( '(' ) ;
    public final void rule__XtextAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3242:1: ( ( '(' ) )
            // InternalCls.g:3243:1: ( '(' )
            {
            // InternalCls.g:3243:1: ( '(' )
            // InternalCls.g:3244:2: '('
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
    // InternalCls.g:3253:1: rule__XtextAssociation__Group__4 : rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5 ;
    public final void rule__XtextAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3257:1: ( rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5 )
            // InternalCls.g:3258:2: rule__XtextAssociation__Group__4__Impl rule__XtextAssociation__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalCls.g:3265:1: rule__XtextAssociation__Group__4__Impl : ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) ) ;
    public final void rule__XtextAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3269:1: ( ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) ) )
            // InternalCls.g:3270:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) )
            {
            // InternalCls.g:3270:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_4 ) )
            // InternalCls.g:3271:2: ( rule__XtextAssociation__MemberEndTypesAssignment_4 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_4()); 
            // InternalCls.g:3272:2: ( rule__XtextAssociation__MemberEndTypesAssignment_4 )
            // InternalCls.g:3272:3: rule__XtextAssociation__MemberEndTypesAssignment_4
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
    // InternalCls.g:3280:1: rule__XtextAssociation__Group__5 : rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6 ;
    public final void rule__XtextAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3284:1: ( rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6 )
            // InternalCls.g:3285:2: rule__XtextAssociation__Group__5__Impl rule__XtextAssociation__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalCls.g:3292:1: rule__XtextAssociation__Group__5__Impl : ( ( rule__XtextAssociation__Group_5__0 )* ) ;
    public final void rule__XtextAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3296:1: ( ( ( rule__XtextAssociation__Group_5__0 )* ) )
            // InternalCls.g:3297:1: ( ( rule__XtextAssociation__Group_5__0 )* )
            {
            // InternalCls.g:3297:1: ( ( rule__XtextAssociation__Group_5__0 )* )
            // InternalCls.g:3298:2: ( rule__XtextAssociation__Group_5__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_5()); 
            // InternalCls.g:3299:2: ( rule__XtextAssociation__Group_5__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalCls.g:3299:3: rule__XtextAssociation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__XtextAssociation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalCls.g:3307:1: rule__XtextAssociation__Group__6 : rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7 ;
    public final void rule__XtextAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3311:1: ( rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7 )
            // InternalCls.g:3312:2: rule__XtextAssociation__Group__6__Impl rule__XtextAssociation__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:3319:1: rule__XtextAssociation__Group__6__Impl : ( ')' ) ;
    public final void rule__XtextAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3323:1: ( ( ')' ) )
            // InternalCls.g:3324:1: ( ')' )
            {
            // InternalCls.g:3324:1: ( ')' )
            // InternalCls.g:3325:2: ')'
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
    // InternalCls.g:3334:1: rule__XtextAssociation__Group__7 : rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8 ;
    public final void rule__XtextAssociation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3338:1: ( rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8 )
            // InternalCls.g:3339:2: rule__XtextAssociation__Group__7__Impl rule__XtextAssociation__Group__8
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:3346:1: rule__XtextAssociation__Group__7__Impl : ( ( rule__XtextAssociation__Group_7__0 )? ) ;
    public final void rule__XtextAssociation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3350:1: ( ( ( rule__XtextAssociation__Group_7__0 )? ) )
            // InternalCls.g:3351:1: ( ( rule__XtextAssociation__Group_7__0 )? )
            {
            // InternalCls.g:3351:1: ( ( rule__XtextAssociation__Group_7__0 )? )
            // InternalCls.g:3352:2: ( rule__XtextAssociation__Group_7__0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_7()); 
            // InternalCls.g:3353:2: ( rule__XtextAssociation__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCls.g:3353:3: rule__XtextAssociation__Group_7__0
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
    // InternalCls.g:3361:1: rule__XtextAssociation__Group__8 : rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9 ;
    public final void rule__XtextAssociation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3365:1: ( rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9 )
            // InternalCls.g:3366:2: rule__XtextAssociation__Group__8__Impl rule__XtextAssociation__Group__9
            {
            pushFollow(FOLLOW_34);
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
    // InternalCls.g:3373:1: rule__XtextAssociation__Group__8__Impl : ( ( rule__XtextAssociation__Group_8__0 )? ) ;
    public final void rule__XtextAssociation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3377:1: ( ( ( rule__XtextAssociation__Group_8__0 )? ) )
            // InternalCls.g:3378:1: ( ( rule__XtextAssociation__Group_8__0 )? )
            {
            // InternalCls.g:3378:1: ( ( rule__XtextAssociation__Group_8__0 )? )
            // InternalCls.g:3379:2: ( rule__XtextAssociation__Group_8__0 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_8()); 
            // InternalCls.g:3380:2: ( rule__XtextAssociation__Group_8__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCls.g:3380:3: rule__XtextAssociation__Group_8__0
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
    // InternalCls.g:3388:1: rule__XtextAssociation__Group__9 : rule__XtextAssociation__Group__9__Impl ;
    public final void rule__XtextAssociation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3392:1: ( rule__XtextAssociation__Group__9__Impl )
            // InternalCls.g:3393:2: rule__XtextAssociation__Group__9__Impl
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
    // InternalCls.g:3399:1: rule__XtextAssociation__Group__9__Impl : ( ( rule__XtextAssociation__CommentsAssignment_9 )? ) ;
    public final void rule__XtextAssociation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3403:1: ( ( ( rule__XtextAssociation__CommentsAssignment_9 )? ) )
            // InternalCls.g:3404:1: ( ( rule__XtextAssociation__CommentsAssignment_9 )? )
            {
            // InternalCls.g:3404:1: ( ( rule__XtextAssociation__CommentsAssignment_9 )? )
            // InternalCls.g:3405:2: ( rule__XtextAssociation__CommentsAssignment_9 )?
            {
             before(grammarAccess.getXtextAssociationAccess().getCommentsAssignment_9()); 
            // InternalCls.g:3406:2: ( rule__XtextAssociation__CommentsAssignment_9 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==RULE_STRING) ) {
                    int LA39_3 = input.LA(3);

                    if ( (LA39_3==EOF||(LA39_3>=19 && LA39_3<=21)||LA39_3==23||LA39_3==25||LA39_3==27||(LA39_3>=37 && LA39_3<=38)||LA39_3==43||LA39_3==47) ) {
                        alt39=1;
                    }
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalCls.g:3406:3: rule__XtextAssociation__CommentsAssignment_9
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
    // InternalCls.g:3415:1: rule__XtextAssociation__Group_5__0 : rule__XtextAssociation__Group_5__0__Impl rule__XtextAssociation__Group_5__1 ;
    public final void rule__XtextAssociation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3419:1: ( rule__XtextAssociation__Group_5__0__Impl rule__XtextAssociation__Group_5__1 )
            // InternalCls.g:3420:2: rule__XtextAssociation__Group_5__0__Impl rule__XtextAssociation__Group_5__1
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
    // InternalCls.g:3427:1: rule__XtextAssociation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__XtextAssociation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3431:1: ( ( ',' ) )
            // InternalCls.g:3432:1: ( ',' )
            {
            // InternalCls.g:3432:1: ( ',' )
            // InternalCls.g:3433:2: ','
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
    // InternalCls.g:3442:1: rule__XtextAssociation__Group_5__1 : rule__XtextAssociation__Group_5__1__Impl ;
    public final void rule__XtextAssociation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3446:1: ( rule__XtextAssociation__Group_5__1__Impl )
            // InternalCls.g:3447:2: rule__XtextAssociation__Group_5__1__Impl
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
    // InternalCls.g:3453:1: rule__XtextAssociation__Group_5__1__Impl : ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) ) ;
    public final void rule__XtextAssociation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3457:1: ( ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) ) )
            // InternalCls.g:3458:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) )
            {
            // InternalCls.g:3458:1: ( ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 ) )
            // InternalCls.g:3459:2: ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndTypesAssignment_5_1()); 
            // InternalCls.g:3460:2: ( rule__XtextAssociation__MemberEndTypesAssignment_5_1 )
            // InternalCls.g:3460:3: rule__XtextAssociation__MemberEndTypesAssignment_5_1
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
    // InternalCls.g:3469:1: rule__XtextAssociation__Group_7__0 : rule__XtextAssociation__Group_7__0__Impl rule__XtextAssociation__Group_7__1 ;
    public final void rule__XtextAssociation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3473:1: ( rule__XtextAssociation__Group_7__0__Impl rule__XtextAssociation__Group_7__1 )
            // InternalCls.g:3474:2: rule__XtextAssociation__Group_7__0__Impl rule__XtextAssociation__Group_7__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalCls.g:3481:1: rule__XtextAssociation__Group_7__0__Impl : ( 'role' ) ;
    public final void rule__XtextAssociation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3485:1: ( ( 'role' ) )
            // InternalCls.g:3486:1: ( 'role' )
            {
            // InternalCls.g:3486:1: ( 'role' )
            // InternalCls.g:3487:2: 'role'
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
    // InternalCls.g:3496:1: rule__XtextAssociation__Group_7__1 : rule__XtextAssociation__Group_7__1__Impl rule__XtextAssociation__Group_7__2 ;
    public final void rule__XtextAssociation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3500:1: ( rule__XtextAssociation__Group_7__1__Impl rule__XtextAssociation__Group_7__2 )
            // InternalCls.g:3501:2: rule__XtextAssociation__Group_7__1__Impl rule__XtextAssociation__Group_7__2
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
    // InternalCls.g:3508:1: rule__XtextAssociation__Group_7__1__Impl : ( '[' ) ;
    public final void rule__XtextAssociation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3512:1: ( ( '[' ) )
            // InternalCls.g:3513:1: ( '[' )
            {
            // InternalCls.g:3513:1: ( '[' )
            // InternalCls.g:3514:2: '['
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
    // InternalCls.g:3523:1: rule__XtextAssociation__Group_7__2 : rule__XtextAssociation__Group_7__2__Impl rule__XtextAssociation__Group_7__3 ;
    public final void rule__XtextAssociation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3527:1: ( rule__XtextAssociation__Group_7__2__Impl rule__XtextAssociation__Group_7__3 )
            // InternalCls.g:3528:2: rule__XtextAssociation__Group_7__2__Impl rule__XtextAssociation__Group_7__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalCls.g:3535:1: rule__XtextAssociation__Group_7__2__Impl : ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) ) ;
    public final void rule__XtextAssociation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3539:1: ( ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) ) )
            // InternalCls.g:3540:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) )
            {
            // InternalCls.g:3540:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 ) )
            // InternalCls.g:3541:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_7_2()); 
            // InternalCls.g:3542:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_2 )
            // InternalCls.g:3542:3: rule__XtextAssociation__MemberEndNamesAssignment_7_2
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
    // InternalCls.g:3550:1: rule__XtextAssociation__Group_7__3 : rule__XtextAssociation__Group_7__3__Impl rule__XtextAssociation__Group_7__4 ;
    public final void rule__XtextAssociation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3554:1: ( rule__XtextAssociation__Group_7__3__Impl rule__XtextAssociation__Group_7__4 )
            // InternalCls.g:3555:2: rule__XtextAssociation__Group_7__3__Impl rule__XtextAssociation__Group_7__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalCls.g:3562:1: rule__XtextAssociation__Group_7__3__Impl : ( ( rule__XtextAssociation__Group_7_3__0 )* ) ;
    public final void rule__XtextAssociation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3566:1: ( ( ( rule__XtextAssociation__Group_7_3__0 )* ) )
            // InternalCls.g:3567:1: ( ( rule__XtextAssociation__Group_7_3__0 )* )
            {
            // InternalCls.g:3567:1: ( ( rule__XtextAssociation__Group_7_3__0 )* )
            // InternalCls.g:3568:2: ( rule__XtextAssociation__Group_7_3__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_7_3()); 
            // InternalCls.g:3569:2: ( rule__XtextAssociation__Group_7_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==36) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCls.g:3569:3: rule__XtextAssociation__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__XtextAssociation__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalCls.g:3577:1: rule__XtextAssociation__Group_7__4 : rule__XtextAssociation__Group_7__4__Impl ;
    public final void rule__XtextAssociation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3581:1: ( rule__XtextAssociation__Group_7__4__Impl )
            // InternalCls.g:3582:2: rule__XtextAssociation__Group_7__4__Impl
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
    // InternalCls.g:3588:1: rule__XtextAssociation__Group_7__4__Impl : ( ']' ) ;
    public final void rule__XtextAssociation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3592:1: ( ( ']' ) )
            // InternalCls.g:3593:1: ( ']' )
            {
            // InternalCls.g:3593:1: ( ']' )
            // InternalCls.g:3594:2: ']'
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
    // InternalCls.g:3604:1: rule__XtextAssociation__Group_7_3__0 : rule__XtextAssociation__Group_7_3__0__Impl rule__XtextAssociation__Group_7_3__1 ;
    public final void rule__XtextAssociation__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3608:1: ( rule__XtextAssociation__Group_7_3__0__Impl rule__XtextAssociation__Group_7_3__1 )
            // InternalCls.g:3609:2: rule__XtextAssociation__Group_7_3__0__Impl rule__XtextAssociation__Group_7_3__1
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
    // InternalCls.g:3616:1: rule__XtextAssociation__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__XtextAssociation__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3620:1: ( ( ',' ) )
            // InternalCls.g:3621:1: ( ',' )
            {
            // InternalCls.g:3621:1: ( ',' )
            // InternalCls.g:3622:2: ','
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
    // InternalCls.g:3631:1: rule__XtextAssociation__Group_7_3__1 : rule__XtextAssociation__Group_7_3__1__Impl ;
    public final void rule__XtextAssociation__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3635:1: ( rule__XtextAssociation__Group_7_3__1__Impl )
            // InternalCls.g:3636:2: rule__XtextAssociation__Group_7_3__1__Impl
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
    // InternalCls.g:3642:1: rule__XtextAssociation__Group_7_3__1__Impl : ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) ) ;
    public final void rule__XtextAssociation__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3646:1: ( ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) ) )
            // InternalCls.g:3647:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) )
            {
            // InternalCls.g:3647:1: ( ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 ) )
            // InternalCls.g:3648:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndNamesAssignment_7_3_1()); 
            // InternalCls.g:3649:2: ( rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 )
            // InternalCls.g:3649:3: rule__XtextAssociation__MemberEndNamesAssignment_7_3_1
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
    // InternalCls.g:3658:1: rule__XtextAssociation__Group_8__0 : rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1 ;
    public final void rule__XtextAssociation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3662:1: ( rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1 )
            // InternalCls.g:3663:2: rule__XtextAssociation__Group_8__0__Impl rule__XtextAssociation__Group_8__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalCls.g:3670:1: rule__XtextAssociation__Group_8__0__Impl : ( 'card' ) ;
    public final void rule__XtextAssociation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3674:1: ( ( 'card' ) )
            // InternalCls.g:3675:1: ( 'card' )
            {
            // InternalCls.g:3675:1: ( 'card' )
            // InternalCls.g:3676:2: 'card'
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
    // InternalCls.g:3685:1: rule__XtextAssociation__Group_8__1 : rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2 ;
    public final void rule__XtextAssociation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3689:1: ( rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2 )
            // InternalCls.g:3690:2: rule__XtextAssociation__Group_8__1__Impl rule__XtextAssociation__Group_8__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalCls.g:3697:1: rule__XtextAssociation__Group_8__1__Impl : ( '[' ) ;
    public final void rule__XtextAssociation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3701:1: ( ( '[' ) )
            // InternalCls.g:3702:1: ( '[' )
            {
            // InternalCls.g:3702:1: ( '[' )
            // InternalCls.g:3703:2: '['
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
    // InternalCls.g:3712:1: rule__XtextAssociation__Group_8__2 : rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3 ;
    public final void rule__XtextAssociation__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3716:1: ( rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3 )
            // InternalCls.g:3717:2: rule__XtextAssociation__Group_8__2__Impl rule__XtextAssociation__Group_8__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalCls.g:3724:1: rule__XtextAssociation__Group_8__2__Impl : ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) ) ;
    public final void rule__XtextAssociation__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3728:1: ( ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) ) )
            // InternalCls.g:3729:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) )
            {
            // InternalCls.g:3729:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 ) )
            // InternalCls.g:3730:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_8_2()); 
            // InternalCls.g:3731:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 )
            // InternalCls.g:3731:3: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2
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
    // InternalCls.g:3739:1: rule__XtextAssociation__Group_8__3 : rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4 ;
    public final void rule__XtextAssociation__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3743:1: ( rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4 )
            // InternalCls.g:3744:2: rule__XtextAssociation__Group_8__3__Impl rule__XtextAssociation__Group_8__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalCls.g:3751:1: rule__XtextAssociation__Group_8__3__Impl : ( ( rule__XtextAssociation__Group_8_3__0 )* ) ;
    public final void rule__XtextAssociation__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3755:1: ( ( ( rule__XtextAssociation__Group_8_3__0 )* ) )
            // InternalCls.g:3756:1: ( ( rule__XtextAssociation__Group_8_3__0 )* )
            {
            // InternalCls.g:3756:1: ( ( rule__XtextAssociation__Group_8_3__0 )* )
            // InternalCls.g:3757:2: ( rule__XtextAssociation__Group_8_3__0 )*
            {
             before(grammarAccess.getXtextAssociationAccess().getGroup_8_3()); 
            // InternalCls.g:3758:2: ( rule__XtextAssociation__Group_8_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==33) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCls.g:3758:3: rule__XtextAssociation__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__XtextAssociation__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalCls.g:3766:1: rule__XtextAssociation__Group_8__4 : rule__XtextAssociation__Group_8__4__Impl ;
    public final void rule__XtextAssociation__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3770:1: ( rule__XtextAssociation__Group_8__4__Impl )
            // InternalCls.g:3771:2: rule__XtextAssociation__Group_8__4__Impl
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
    // InternalCls.g:3777:1: rule__XtextAssociation__Group_8__4__Impl : ( ']' ) ;
    public final void rule__XtextAssociation__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3781:1: ( ( ']' ) )
            // InternalCls.g:3782:1: ( ']' )
            {
            // InternalCls.g:3782:1: ( ']' )
            // InternalCls.g:3783:2: ']'
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
    // InternalCls.g:3793:1: rule__XtextAssociation__Group_8_3__0 : rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1 ;
    public final void rule__XtextAssociation__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3797:1: ( rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1 )
            // InternalCls.g:3798:2: rule__XtextAssociation__Group_8_3__0__Impl rule__XtextAssociation__Group_8_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalCls.g:3805:1: rule__XtextAssociation__Group_8_3__0__Impl : ( ':' ) ;
    public final void rule__XtextAssociation__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3809:1: ( ( ':' ) )
            // InternalCls.g:3810:1: ( ':' )
            {
            // InternalCls.g:3810:1: ( ':' )
            // InternalCls.g:3811:2: ':'
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
    // InternalCls.g:3820:1: rule__XtextAssociation__Group_8_3__1 : rule__XtextAssociation__Group_8_3__1__Impl ;
    public final void rule__XtextAssociation__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3824:1: ( rule__XtextAssociation__Group_8_3__1__Impl )
            // InternalCls.g:3825:2: rule__XtextAssociation__Group_8_3__1__Impl
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
    // InternalCls.g:3831:1: rule__XtextAssociation__Group_8_3__1__Impl : ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) ) ;
    public final void rule__XtextAssociation__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3835:1: ( ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) ) )
            // InternalCls.g:3836:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) )
            {
            // InternalCls.g:3836:1: ( ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 ) )
            // InternalCls.g:3837:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 )
            {
             before(grammarAccess.getXtextAssociationAccess().getMemberEndCardinalitiesAssignment_8_3_1()); 
            // InternalCls.g:3838:2: ( rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 )
            // InternalCls.g:3838:3: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1
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
    // InternalCls.g:3847:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3851:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalCls.g:3852:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
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
    // InternalCls.g:3859:1: rule__Comment__Group__0__Impl : ( 'note' ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3863:1: ( ( 'note' ) )
            // InternalCls.g:3864:1: ( 'note' )
            {
            // InternalCls.g:3864:1: ( 'note' )
            // InternalCls.g:3865:2: 'note'
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
    // InternalCls.g:3874:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3878:1: ( rule__Comment__Group__1__Impl )
            // InternalCls.g:3879:2: rule__Comment__Group__1__Impl
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
    // InternalCls.g:3885:1: rule__Comment__Group__1__Impl : ( ( rule__Comment__BodyAssignment_1 ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3889:1: ( ( ( rule__Comment__BodyAssignment_1 ) ) )
            // InternalCls.g:3890:1: ( ( rule__Comment__BodyAssignment_1 ) )
            {
            // InternalCls.g:3890:1: ( ( rule__Comment__BodyAssignment_1 ) )
            // InternalCls.g:3891:2: ( rule__Comment__BodyAssignment_1 )
            {
             before(grammarAccess.getCommentAccess().getBodyAssignment_1()); 
            // InternalCls.g:3892:2: ( rule__Comment__BodyAssignment_1 )
            // InternalCls.g:3892:3: rule__Comment__BodyAssignment_1
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
    // InternalCls.g:3901:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3905:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalCls.g:3906:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalCls.g:3913:1: rule__Cardinality__Group__0__Impl : ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3917:1: ( ( ( rule__Cardinality__LowerBoundAssignment_0 ) ) )
            // InternalCls.g:3918:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            {
            // InternalCls.g:3918:1: ( ( rule__Cardinality__LowerBoundAssignment_0 ) )
            // InternalCls.g:3919:2: ( rule__Cardinality__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0()); 
            // InternalCls.g:3920:2: ( rule__Cardinality__LowerBoundAssignment_0 )
            // InternalCls.g:3920:3: rule__Cardinality__LowerBoundAssignment_0
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
    // InternalCls.g:3928:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3932:1: ( rule__Cardinality__Group__1__Impl )
            // InternalCls.g:3933:2: rule__Cardinality__Group__1__Impl
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
    // InternalCls.g:3939:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Group_1__0 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3943:1: ( ( ( rule__Cardinality__Group_1__0 )? ) )
            // InternalCls.g:3944:1: ( ( rule__Cardinality__Group_1__0 )? )
            {
            // InternalCls.g:3944:1: ( ( rule__Cardinality__Group_1__0 )? )
            // InternalCls.g:3945:2: ( rule__Cardinality__Group_1__0 )?
            {
             before(grammarAccess.getCardinalityAccess().getGroup_1()); 
            // InternalCls.g:3946:2: ( rule__Cardinality__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCls.g:3946:3: rule__Cardinality__Group_1__0
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
    // InternalCls.g:3955:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3959:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // InternalCls.g:3960:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
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
    // InternalCls.g:3967:1: rule__Cardinality__Group_1__0__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3971:1: ( ( '..' ) )
            // InternalCls.g:3972:1: ( '..' )
            {
            // InternalCls.g:3972:1: ( '..' )
            // InternalCls.g:3973:2: '..'
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
    // InternalCls.g:3982:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3986:1: ( rule__Cardinality__Group_1__1__Impl )
            // InternalCls.g:3987:2: rule__Cardinality__Group_1__1__Impl
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
    // InternalCls.g:3993:1: rule__Cardinality__Group_1__1__Impl : ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3997:1: ( ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) ) )
            // InternalCls.g:3998:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            {
            // InternalCls.g:3998:1: ( ( rule__Cardinality__UpperBoundAssignment_1_1 ) )
            // InternalCls.g:3999:2: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1()); 
            // InternalCls.g:4000:2: ( rule__Cardinality__UpperBoundAssignment_1_1 )
            // InternalCls.g:4000:3: rule__Cardinality__UpperBoundAssignment_1_1
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
    // InternalCls.g:4009:1: rule__ClassDiagram__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassDiagram__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4013:1: ( ( RULE_STRING ) )
            // InternalCls.g:4014:2: ( RULE_STRING )
            {
            // InternalCls.g:4014:2: ( RULE_STRING )
            // InternalCls.g:4015:3: RULE_STRING
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
    // InternalCls.g:4024:1: rule__ClassDiagram__RootPackageAssignment_3 : ( ruleRootPackage ) ;
    public final void rule__ClassDiagram__RootPackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4028:1: ( ( ruleRootPackage ) )
            // InternalCls.g:4029:2: ( ruleRootPackage )
            {
            // InternalCls.g:4029:2: ( ruleRootPackage )
            // InternalCls.g:4030:3: ruleRootPackage
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
    // InternalCls.g:4039:1: rule__RootPackage__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__RootPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4043:1: ( ( ruleFQN ) )
            // InternalCls.g:4044:2: ( ruleFQN )
            {
            // InternalCls.g:4044:2: ( ruleFQN )
            // InternalCls.g:4045:3: ruleFQN
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
    // InternalCls.g:4054:1: rule__RootPackage__PackageImportsAssignment_2 : ( rulePackageImport ) ;
    public final void rule__RootPackage__PackageImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4058:1: ( ( rulePackageImport ) )
            // InternalCls.g:4059:2: ( rulePackageImport )
            {
            // InternalCls.g:4059:2: ( rulePackageImport )
            // InternalCls.g:4060:3: rulePackageImport
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
    // InternalCls.g:4069:1: rule__RootPackage__ClassifiersAssignment_3 : ( ruleClassifier ) ;
    public final void rule__RootPackage__ClassifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4073:1: ( ( ruleClassifier ) )
            // InternalCls.g:4074:2: ( ruleClassifier )
            {
            // InternalCls.g:4074:2: ( ruleClassifier )
            // InternalCls.g:4075:3: ruleClassifier
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
    // InternalCls.g:4084:1: rule__RootPackage__ConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__RootPackage__ConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4088:1: ( ( ruleConnector ) )
            // InternalCls.g:4089:2: ( ruleConnector )
            {
            // InternalCls.g:4089:2: ( ruleConnector )
            // InternalCls.g:4090:3: ruleConnector
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
    // InternalCls.g:4099:1: rule__RootPackage__PackagesAssignment_5 : ( rulePackage ) ;
    public final void rule__RootPackage__PackagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4103:1: ( ( rulePackage ) )
            // InternalCls.g:4104:2: ( rulePackage )
            {
            // InternalCls.g:4104:2: ( rulePackage )
            // InternalCls.g:4105:3: rulePackage
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
    // InternalCls.g:4114:1: rule__Package__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4118:1: ( ( ruleFQN ) )
            // InternalCls.g:4119:2: ( ruleFQN )
            {
            // InternalCls.g:4119:2: ( ruleFQN )
            // InternalCls.g:4120:3: ruleFQN
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
    // InternalCls.g:4129:1: rule__Package__PackageImportsAssignment_3 : ( rulePackageImport ) ;
    public final void rule__Package__PackageImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4133:1: ( ( rulePackageImport ) )
            // InternalCls.g:4134:2: ( rulePackageImport )
            {
            // InternalCls.g:4134:2: ( rulePackageImport )
            // InternalCls.g:4135:3: rulePackageImport
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
    // InternalCls.g:4144:1: rule__Package__ClassifiersAssignment_4 : ( ruleClassifier ) ;
    public final void rule__Package__ClassifiersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4148:1: ( ( ruleClassifier ) )
            // InternalCls.g:4149:2: ( ruleClassifier )
            {
            // InternalCls.g:4149:2: ( ruleClassifier )
            // InternalCls.g:4150:3: ruleClassifier
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
    // InternalCls.g:4159:1: rule__Package__ConnectorsAssignment_5 : ( ruleConnector ) ;
    public final void rule__Package__ConnectorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4163:1: ( ( ruleConnector ) )
            // InternalCls.g:4164:2: ( ruleConnector )
            {
            // InternalCls.g:4164:2: ( ruleConnector )
            // InternalCls.g:4165:3: ruleConnector
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
    // InternalCls.g:4174:1: rule__Package__PackagesAssignment_6 : ( rulePackage ) ;
    public final void rule__Package__PackagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4178:1: ( ( rulePackage ) )
            // InternalCls.g:4179:2: ( rulePackage )
            {
            // InternalCls.g:4179:2: ( rulePackage )
            // InternalCls.g:4180:3: rulePackage
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
    // InternalCls.g:4189:1: rule__PackageImport__ImportedPackageAssignment_1 : ( ruleFQN ) ;
    public final void rule__PackageImport__ImportedPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4193:1: ( ( ruleFQN ) )
            // InternalCls.g:4194:2: ( ruleFQN )
            {
            // InternalCls.g:4194:2: ( ruleFQN )
            // InternalCls.g:4195:3: ruleFQN
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
    // InternalCls.g:4204:1: rule__Class__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4208:1: ( ( ruleVisibility ) )
            // InternalCls.g:4209:2: ( ruleVisibility )
            {
            // InternalCls.g:4209:2: ( ruleVisibility )
            // InternalCls.g:4210:3: ruleVisibility
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
    // InternalCls.g:4219:1: rule__Class__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4223:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4224:2: ( ( 'abstract' ) )
            {
            // InternalCls.g:4224:2: ( ( 'abstract' ) )
            // InternalCls.g:4225:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4226:3: ( 'abstract' )
            // InternalCls.g:4227:4: 'abstract'
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
    // InternalCls.g:4238:1: rule__Class__NameAssignment_3_0_0 : ( RULE_STRING ) ;
    public final void rule__Class__NameAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4242:1: ( ( RULE_STRING ) )
            // InternalCls.g:4243:2: ( RULE_STRING )
            {
            // InternalCls.g:4243:2: ( RULE_STRING )
            // InternalCls.g:4244:3: RULE_STRING
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
    // InternalCls.g:4253:1: rule__Class__AliasAssignment_3_0_2 : ( RULE_ID ) ;
    public final void rule__Class__AliasAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4257:1: ( ( RULE_ID ) )
            // InternalCls.g:4258:2: ( RULE_ID )
            {
            // InternalCls.g:4258:2: ( RULE_ID )
            // InternalCls.g:4259:3: RULE_ID
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
    // InternalCls.g:4268:1: rule__Class__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4272:1: ( ( RULE_ID ) )
            // InternalCls.g:4273:2: ( RULE_ID )
            {
            // InternalCls.g:4273:2: ( RULE_ID )
            // InternalCls.g:4274:3: RULE_ID
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


    // $ANTLR start "rule__Class__MembersAssignment_4_1"
    // InternalCls.g:4283:1: rule__Class__MembersAssignment_4_1 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4287:1: ( ( ruleMember ) )
            // InternalCls.g:4288:2: ( ruleMember )
            {
            // InternalCls.g:4288:2: ( ruleMember )
            // InternalCls.g:4289:3: ruleMember
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
    // InternalCls.g:4298:1: rule__Interface__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Interface__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4302:1: ( ( ruleVisibility ) )
            // InternalCls.g:4303:2: ( ruleVisibility )
            {
            // InternalCls.g:4303:2: ( ruleVisibility )
            // InternalCls.g:4304:3: ruleVisibility
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
    // InternalCls.g:4313:1: rule__Interface__NameAssignment_2_0_0 : ( RULE_STRING ) ;
    public final void rule__Interface__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4317:1: ( ( RULE_STRING ) )
            // InternalCls.g:4318:2: ( RULE_STRING )
            {
            // InternalCls.g:4318:2: ( RULE_STRING )
            // InternalCls.g:4319:3: RULE_STRING
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
    // InternalCls.g:4328:1: rule__Interface__AliasAssignment_2_0_2 : ( RULE_ID ) ;
    public final void rule__Interface__AliasAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4332:1: ( ( RULE_ID ) )
            // InternalCls.g:4333:2: ( RULE_ID )
            {
            // InternalCls.g:4333:2: ( RULE_ID )
            // InternalCls.g:4334:3: RULE_ID
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
    // InternalCls.g:4343:1: rule__Interface__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4347:1: ( ( RULE_ID ) )
            // InternalCls.g:4348:2: ( RULE_ID )
            {
            // InternalCls.g:4348:2: ( RULE_ID )
            // InternalCls.g:4349:3: RULE_ID
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


    // $ANTLR start "rule__Interface__MembersAssignment_3_1"
    // InternalCls.g:4358:1: rule__Interface__MembersAssignment_3_1 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4362:1: ( ( ruleMember ) )
            // InternalCls.g:4363:2: ( ruleMember )
            {
            // InternalCls.g:4363:2: ( ruleMember )
            // InternalCls.g:4364:3: ruleMember
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


    // $ANTLR start "rule__Attribute__VisibilityAssignment_1"
    // InternalCls.g:4373:1: rule__Attribute__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4377:1: ( ( ruleVisibility ) )
            // InternalCls.g:4378:2: ( ruleVisibility )
            {
            // InternalCls.g:4378:2: ( ruleVisibility )
            // InternalCls.g:4379:3: ruleVisibility
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
    // InternalCls.g:4388:1: rule__Attribute__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4392:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4393:2: ( ( 'static' ) )
            {
            // InternalCls.g:4393:2: ( ( 'static' ) )
            // InternalCls.g:4394:3: ( 'static' )
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4395:3: ( 'static' )
            // InternalCls.g:4396:4: 'static'
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
    // InternalCls.g:4407:1: rule__Attribute__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4411:1: ( ( RULE_ID ) )
            // InternalCls.g:4412:2: ( RULE_ID )
            {
            // InternalCls.g:4412:2: ( RULE_ID )
            // InternalCls.g:4413:3: RULE_ID
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
    // InternalCls.g:4422:1: rule__Attribute__TypeAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__Attribute__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4426:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4427:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4427:2: ( ( ruleFQN ) )
            // InternalCls.g:4428:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeAccess().getTypeClassifierCrossReference_5_0()); 
            // InternalCls.g:4429:3: ( ruleFQN )
            // InternalCls.g:4430:4: ruleFQN
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
    // InternalCls.g:4441:1: rule__Method__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Method__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4445:1: ( ( ruleVisibility ) )
            // InternalCls.g:4446:2: ( ruleVisibility )
            {
            // InternalCls.g:4446:2: ( ruleVisibility )
            // InternalCls.g:4447:3: ruleVisibility
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
    // InternalCls.g:4456:1: rule__Method__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Method__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4460:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:4461:2: ( ( 'abstract' ) )
            {
            // InternalCls.g:4461:2: ( ( 'abstract' ) )
            // InternalCls.g:4462:3: ( 'abstract' )
            {
             before(grammarAccess.getMethodAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:4463:3: ( 'abstract' )
            // InternalCls.g:4464:4: 'abstract'
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
    // InternalCls.g:4475:1: rule__Method__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Method__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4479:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4480:2: ( ( 'static' ) )
            {
            // InternalCls.g:4480:2: ( ( 'static' ) )
            // InternalCls.g:4481:3: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:4482:3: ( 'static' )
            // InternalCls.g:4483:4: 'static'
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
    // InternalCls.g:4494:1: rule__Method__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4498:1: ( ( RULE_ID ) )
            // InternalCls.g:4499:2: ( RULE_ID )
            {
            // InternalCls.g:4499:2: ( RULE_ID )
            // InternalCls.g:4500:3: RULE_ID
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
    // InternalCls.g:4509:1: rule__Method__ParametersAssignment_5_0 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4513:1: ( ( ruleParameter ) )
            // InternalCls.g:4514:2: ( ruleParameter )
            {
            // InternalCls.g:4514:2: ( ruleParameter )
            // InternalCls.g:4515:3: ruleParameter
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
    // InternalCls.g:4524:1: rule__Method__ParametersAssignment_5_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4528:1: ( ( ruleParameter ) )
            // InternalCls.g:4529:2: ( ruleParameter )
            {
            // InternalCls.g:4529:2: ( ruleParameter )
            // InternalCls.g:4530:3: ruleParameter
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
    // InternalCls.g:4539:1: rule__Method__TypeAssignment_7_1 : ( ( ruleFQN ) ) ;
    public final void rule__Method__TypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4543:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4544:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4544:2: ( ( ruleFQN ) )
            // InternalCls.g:4545:3: ( ruleFQN )
            {
             before(grammarAccess.getMethodAccess().getTypeClassifierCrossReference_7_1_0()); 
            // InternalCls.g:4546:3: ( ruleFQN )
            // InternalCls.g:4547:4: ruleFQN
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
    // InternalCls.g:4558:1: rule__Parameter__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Parameter__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4562:1: ( ( ruleVisibility ) )
            // InternalCls.g:4563:2: ( ruleVisibility )
            {
            // InternalCls.g:4563:2: ( ruleVisibility )
            // InternalCls.g:4564:3: ruleVisibility
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
    // InternalCls.g:4573:1: rule__Parameter__StaticAssignment_1 : ( ( 'static' ) ) ;
    public final void rule__Parameter__StaticAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4577:1: ( ( ( 'static' ) ) )
            // InternalCls.g:4578:2: ( ( 'static' ) )
            {
            // InternalCls.g:4578:2: ( ( 'static' ) )
            // InternalCls.g:4579:3: ( 'static' )
            {
             before(grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0()); 
            // InternalCls.g:4580:3: ( 'static' )
            // InternalCls.g:4581:4: 'static'
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
    // InternalCls.g:4592:1: rule__Parameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4596:1: ( ( RULE_ID ) )
            // InternalCls.g:4597:2: ( RULE_ID )
            {
            // InternalCls.g:4597:2: ( RULE_ID )
            // InternalCls.g:4598:3: RULE_ID
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
    // InternalCls.g:4607:1: rule__Parameter__TypeAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Parameter__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4611:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4612:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4612:2: ( ( ruleFQN ) )
            // InternalCls.g:4613:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterAccess().getTypeClassifierCrossReference_4_0()); 
            // InternalCls.g:4614:3: ( ruleFQN )
            // InternalCls.g:4615:4: ruleFQN
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
    // InternalCls.g:4626:1: rule__Generalization__LeftAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Generalization__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4630:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4631:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4631:2: ( ( ruleFQN ) )
            // InternalCls.g:4632:3: ( ruleFQN )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftClassifierCrossReference_2_0()); 
            // InternalCls.g:4633:3: ( ruleFQN )
            // InternalCls.g:4634:4: ruleFQN
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
    // InternalCls.g:4645:1: rule__Generalization__RightAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Generalization__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4649:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4650:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4650:2: ( ( ruleFQN ) )
            // InternalCls.g:4651:3: ( ruleFQN )
            {
             before(grammarAccess.getGeneralizationAccess().getRightClassifierCrossReference_4_0()); 
            // InternalCls.g:4652:3: ( ruleFQN )
            // InternalCls.g:4653:4: ruleFQN
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
    // InternalCls.g:4664:1: rule__Implementation__LeftAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Implementation__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4668:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4669:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4669:2: ( ( ruleFQN ) )
            // InternalCls.g:4670:3: ( ruleFQN )
            {
             before(grammarAccess.getImplementationAccess().getLeftClassifierCrossReference_2_0()); 
            // InternalCls.g:4671:3: ( ruleFQN )
            // InternalCls.g:4672:4: ruleFQN
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
    // InternalCls.g:4683:1: rule__Implementation__RightAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Implementation__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4687:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4688:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4688:2: ( ( ruleFQN ) )
            // InternalCls.g:4689:3: ( ruleFQN )
            {
             before(grammarAccess.getImplementationAccess().getRightClassifierCrossReference_4_0()); 
            // InternalCls.g:4690:3: ( ruleFQN )
            // InternalCls.g:4691:4: ruleFQN
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


    // $ANTLR start "rule__CommentLink__CommentsAssignment_0"
    // InternalCls.g:4702:1: rule__CommentLink__CommentsAssignment_0 : ( ruleComment ) ;
    public final void rule__CommentLink__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4706:1: ( ( ruleComment ) )
            // InternalCls.g:4707:2: ( ruleComment )
            {
            // InternalCls.g:4707:2: ( ruleComment )
            // InternalCls.g:4708:3: ruleComment
            {
             before(grammarAccess.getCommentLinkAccess().getCommentsCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentLinkAccess().getCommentsCommentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentLink__CommentsAssignment_0"


    // $ANTLR start "rule__CommentLink__CommentedElementAssignment_1"
    // InternalCls.g:4717:1: rule__CommentLink__CommentedElementAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__CommentLink__CommentedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4721:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4722:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4722:2: ( ( ruleFQN ) )
            // InternalCls.g:4723:3: ( ruleFQN )
            {
             before(grammarAccess.getCommentLinkAccess().getCommentedElementClassifierCrossReference_1_0()); 
            // InternalCls.g:4724:3: ( ruleFQN )
            // InternalCls.g:4725:4: ruleFQN
            {
             before(grammarAccess.getCommentLinkAccess().getCommentedElementClassifierFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCommentLinkAccess().getCommentedElementClassifierFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCommentLinkAccess().getCommentedElementClassifierCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentLink__CommentedElementAssignment_1"


    // $ANTLR start "rule__XtextAssociation__TwoSideBidirectionalityAssignment_0"
    // InternalCls.g:4736:1: rule__XtextAssociation__TwoSideBidirectionalityAssignment_0 : ( ( 'bi' ) ) ;
    public final void rule__XtextAssociation__TwoSideBidirectionalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4740:1: ( ( ( 'bi' ) ) )
            // InternalCls.g:4741:2: ( ( 'bi' ) )
            {
            // InternalCls.g:4741:2: ( ( 'bi' ) )
            // InternalCls.g:4742:3: ( 'bi' )
            {
             before(grammarAccess.getXtextAssociationAccess().getTwoSideBidirectionalityBiKeyword_0_0()); 
            // InternalCls.g:4743:3: ( 'bi' )
            // InternalCls.g:4744:4: 'bi'
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
    // InternalCls.g:4755:1: rule__XtextAssociation__TwoSideAggregationKindAssignment_1 : ( ruleAggregationKind ) ;
    public final void rule__XtextAssociation__TwoSideAggregationKindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4759:1: ( ( ruleAggregationKind ) )
            // InternalCls.g:4760:2: ( ruleAggregationKind )
            {
            // InternalCls.g:4760:2: ( ruleAggregationKind )
            // InternalCls.g:4761:3: ruleAggregationKind
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
    // InternalCls.g:4770:1: rule__XtextAssociation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XtextAssociation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4774:1: ( ( RULE_ID ) )
            // InternalCls.g:4775:2: ( RULE_ID )
            {
            // InternalCls.g:4775:2: ( RULE_ID )
            // InternalCls.g:4776:3: RULE_ID
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
    // InternalCls.g:4785:1: rule__XtextAssociation__MemberEndTypesAssignment_4 : ( ruleXtextAssociationMemberEndReferencedType ) ;
    public final void rule__XtextAssociation__MemberEndTypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4789:1: ( ( ruleXtextAssociationMemberEndReferencedType ) )
            // InternalCls.g:4790:2: ( ruleXtextAssociationMemberEndReferencedType )
            {
            // InternalCls.g:4790:2: ( ruleXtextAssociationMemberEndReferencedType )
            // InternalCls.g:4791:3: ruleXtextAssociationMemberEndReferencedType
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
    // InternalCls.g:4800:1: rule__XtextAssociation__MemberEndTypesAssignment_5_1 : ( ruleXtextAssociationMemberEndReferencedType ) ;
    public final void rule__XtextAssociation__MemberEndTypesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4804:1: ( ( ruleXtextAssociationMemberEndReferencedType ) )
            // InternalCls.g:4805:2: ( ruleXtextAssociationMemberEndReferencedType )
            {
            // InternalCls.g:4805:2: ( ruleXtextAssociationMemberEndReferencedType )
            // InternalCls.g:4806:3: ruleXtextAssociationMemberEndReferencedType
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
    // InternalCls.g:4815:1: rule__XtextAssociation__MemberEndNamesAssignment_7_2 : ( RULE_ID ) ;
    public final void rule__XtextAssociation__MemberEndNamesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4819:1: ( ( RULE_ID ) )
            // InternalCls.g:4820:2: ( RULE_ID )
            {
            // InternalCls.g:4820:2: ( RULE_ID )
            // InternalCls.g:4821:3: RULE_ID
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
    // InternalCls.g:4830:1: rule__XtextAssociation__MemberEndNamesAssignment_7_3_1 : ( RULE_ID ) ;
    public final void rule__XtextAssociation__MemberEndNamesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4834:1: ( ( RULE_ID ) )
            // InternalCls.g:4835:2: ( RULE_ID )
            {
            // InternalCls.g:4835:2: ( RULE_ID )
            // InternalCls.g:4836:3: RULE_ID
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
    // InternalCls.g:4845:1: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2 : ( ruleCardinality ) ;
    public final void rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4849:1: ( ( ruleCardinality ) )
            // InternalCls.g:4850:2: ( ruleCardinality )
            {
            // InternalCls.g:4850:2: ( ruleCardinality )
            // InternalCls.g:4851:3: ruleCardinality
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
    // InternalCls.g:4860:1: rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1 : ( ruleCardinality ) ;
    public final void rule__XtextAssociation__MemberEndCardinalitiesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4864:1: ( ( ruleCardinality ) )
            // InternalCls.g:4865:2: ( ruleCardinality )
            {
            // InternalCls.g:4865:2: ( ruleCardinality )
            // InternalCls.g:4866:3: ruleCardinality
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
    // InternalCls.g:4875:1: rule__XtextAssociation__CommentsAssignment_9 : ( ruleComment ) ;
    public final void rule__XtextAssociation__CommentsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4879:1: ( ( ruleComment ) )
            // InternalCls.g:4880:2: ( ruleComment )
            {
            // InternalCls.g:4880:2: ( ruleComment )
            // InternalCls.g:4881:3: ruleComment
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
    // InternalCls.g:4890:1: rule__XtextAssociationMemberEndReferencedType__TypeAssignment : ( ( ruleFQN ) ) ;
    public final void rule__XtextAssociationMemberEndReferencedType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4894:1: ( ( ( ruleFQN ) ) )
            // InternalCls.g:4895:2: ( ( ruleFQN ) )
            {
            // InternalCls.g:4895:2: ( ( ruleFQN ) )
            // InternalCls.g:4896:3: ( ruleFQN )
            {
             before(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeClassifierCrossReference_0()); 
            // InternalCls.g:4897:3: ( ruleFQN )
            // InternalCls.g:4898:4: ruleFQN
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
    // InternalCls.g:4909:1: rule__Comment__BodyAssignment_1 : ( ruleCommentBody ) ;
    public final void rule__Comment__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4913:1: ( ( ruleCommentBody ) )
            // InternalCls.g:4914:2: ( ruleCommentBody )
            {
            // InternalCls.g:4914:2: ( ruleCommentBody )
            // InternalCls.g:4915:3: ruleCommentBody
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
    // InternalCls.g:4924:1: rule__Cardinality__LowerBoundAssignment_0 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4928:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:4929:2: ( ruleCardinalityBound )
            {
            // InternalCls.g:4929:2: ( ruleCardinalityBound )
            // InternalCls.g:4930:3: ruleCardinalityBound
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
    // InternalCls.g:4939:1: rule__Cardinality__UpperBoundAssignment_1_1 : ( ruleCardinalityBound ) ;
    public final void rule__Cardinality__UpperBoundAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:4943:1: ( ( ruleCardinalityBound ) )
            // InternalCls.g:4944:2: ( ruleCardinalityBound )
            {
            // InternalCls.g:4944:2: ( ruleCardinalityBound )
            // InternalCls.g:4945:3: ruleCardinalityBound
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
    protected DFA4 dfa4 = new DFA4(this);
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
            return "634:1: rule__Classifier__Alternatives : ( ( ruleClass ) | ( ruleInterface ) );";
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "697:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethod ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000A861523FF000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000020014007F002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000886000380002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000A8615A3FF000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000020004007F000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000060000807F040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000060000007F042L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000020014007F000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000040000007F040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000060000007F040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000040080007F040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000040000007F042L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000380000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00008CE000380000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});

}