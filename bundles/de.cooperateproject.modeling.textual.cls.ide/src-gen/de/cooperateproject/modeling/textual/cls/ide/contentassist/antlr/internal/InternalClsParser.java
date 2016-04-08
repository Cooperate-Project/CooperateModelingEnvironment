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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'interface'", "'<'", "'>'", "'*'", "'~'", "'-'", "'#'", "'+'", "'string'", "'int'", "'double'", "'boolean'", "'char'", "'byte'", "'short'", "'long'", "'float'", "'@startclass'", "'@endclass'", "'{'", "'}'", "','", "' as '", "':'", "'('", "')'", "'isa'", "'impl'", "'['", "']'", "'|'", "'..'", "'note['", "'abstract'", "'static'", "'final'"
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


    // $ANTLR start "entryRuleElement"
    // InternalCls.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalCls.g:79:1: ( ruleElement EOF )
            // InternalCls.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalCls.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalCls.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalCls.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalCls.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalCls.g:94:3: ( rule__Element__Alternatives )
            // InternalCls.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleType"
    // InternalCls.g:103:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalCls.g:104:1: ( ruleType EOF )
            // InternalCls.g:105:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalCls.g:112:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:116:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalCls.g:117:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalCls.g:117:2: ( ( rule__Type__Alternatives ) )
            // InternalCls.g:118:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalCls.g:119:3: ( rule__Type__Alternatives )
            // InternalCls.g:119:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleClassDef"
    // InternalCls.g:128:1: entryRuleClassDef : ruleClassDef EOF ;
    public final void entryRuleClassDef() throws RecognitionException {
        try {
            // InternalCls.g:129:1: ( ruleClassDef EOF )
            // InternalCls.g:130:1: ruleClassDef EOF
            {
             before(grammarAccess.getClassDefRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDef();

            state._fsp--;

             after(grammarAccess.getClassDefRule()); 
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
    // $ANTLR end "entryRuleClassDef"


    // $ANTLR start "ruleClassDef"
    // InternalCls.g:137:1: ruleClassDef : ( ( rule__ClassDef__Group__0 ) ) ;
    public final void ruleClassDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:141:2: ( ( ( rule__ClassDef__Group__0 ) ) )
            // InternalCls.g:142:2: ( ( rule__ClassDef__Group__0 ) )
            {
            // InternalCls.g:142:2: ( ( rule__ClassDef__Group__0 ) )
            // InternalCls.g:143:3: ( rule__ClassDef__Group__0 )
            {
             before(grammarAccess.getClassDefAccess().getGroup()); 
            // InternalCls.g:144:3: ( rule__ClassDef__Group__0 )
            // InternalCls.g:144:4: rule__ClassDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDef"


    // $ANTLR start "entryRuleClassName"
    // InternalCls.g:153:1: entryRuleClassName : ruleClassName EOF ;
    public final void entryRuleClassName() throws RecognitionException {
        try {
            // InternalCls.g:154:1: ( ruleClassName EOF )
            // InternalCls.g:155:1: ruleClassName EOF
            {
             before(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_1);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getClassNameRule()); 
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
    // $ANTLR end "entryRuleClassName"


    // $ANTLR start "ruleClassName"
    // InternalCls.g:162:1: ruleClassName : ( ruleName ) ;
    public final void ruleClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:166:2: ( ( ruleName ) )
            // InternalCls.g:167:2: ( ruleName )
            {
            // InternalCls.g:167:2: ( ruleName )
            // InternalCls.g:168:3: ruleName
            {
             before(grammarAccess.getClassNameAccess().getNameParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getClassNameAccess().getNameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassName"


    // $ANTLR start "entryRuleName"
    // InternalCls.g:178:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalCls.g:179:1: ( ruleName EOF )
            // InternalCls.g:180:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalCls.g:187:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:191:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalCls.g:192:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalCls.g:192:2: ( ( rule__Name__Alternatives ) )
            // InternalCls.g:193:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalCls.g:194:3: ( rule__Name__Alternatives )
            // InternalCls.g:194:4: rule__Name__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


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


    // $ANTLR start "entryRuleMember"
    // InternalCls.g:228:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalCls.g:229:1: ( ruleMember EOF )
            // InternalCls.g:230:1: ruleMember EOF
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
    // InternalCls.g:237:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:241:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalCls.g:242:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalCls.g:242:2: ( ( rule__Member__Alternatives ) )
            // InternalCls.g:243:3: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // InternalCls.g:244:3: ( rule__Member__Alternatives )
            // InternalCls.g:244:4: rule__Member__Alternatives
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
    // InternalCls.g:253:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalCls.g:254:1: ( ruleAttribute EOF )
            // InternalCls.g:255:1: ruleAttribute EOF
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
    // InternalCls.g:262:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:266:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalCls.g:267:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalCls.g:267:2: ( ( rule__Attribute__Group__0 ) )
            // InternalCls.g:268:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalCls.g:269:3: ( rule__Attribute__Group__0 )
            // InternalCls.g:269:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRuleMethode"
    // InternalCls.g:278:1: entryRuleMethode : ruleMethode EOF ;
    public final void entryRuleMethode() throws RecognitionException {
        try {
            // InternalCls.g:279:1: ( ruleMethode EOF )
            // InternalCls.g:280:1: ruleMethode EOF
            {
             before(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_1);
            ruleMethode();

            state._fsp--;

             after(grammarAccess.getMethodeRule()); 
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
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // InternalCls.g:287:1: ruleMethode : ( ( rule__Methode__Group__0 ) ) ;
    public final void ruleMethode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:291:2: ( ( ( rule__Methode__Group__0 ) ) )
            // InternalCls.g:292:2: ( ( rule__Methode__Group__0 ) )
            {
            // InternalCls.g:292:2: ( ( rule__Methode__Group__0 ) )
            // InternalCls.g:293:3: ( rule__Methode__Group__0 )
            {
             before(grammarAccess.getMethodeAccess().getGroup()); 
            // InternalCls.g:294:3: ( rule__Methode__Group__0 )
            // InternalCls.g:294:4: rule__Methode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Methode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleConnector"
    // InternalCls.g:303:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalCls.g:304:1: ( ruleConnector EOF )
            // InternalCls.g:305:1: ruleConnector EOF
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
    // InternalCls.g:312:1: ruleConnector : ( ( rule__Connector__Alternatives ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:316:2: ( ( ( rule__Connector__Alternatives ) ) )
            // InternalCls.g:317:2: ( ( rule__Connector__Alternatives ) )
            {
            // InternalCls.g:317:2: ( ( rule__Connector__Alternatives ) )
            // InternalCls.g:318:3: ( rule__Connector__Alternatives )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives()); 
            // InternalCls.g:319:3: ( rule__Connector__Alternatives )
            // InternalCls.g:319:4: rule__Connector__Alternatives
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
    // InternalCls.g:328:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalCls.g:329:1: ( ruleGeneralization EOF )
            // InternalCls.g:330:1: ruleGeneralization EOF
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
    // InternalCls.g:337:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:341:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalCls.g:342:2: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalCls.g:342:2: ( ( rule__Generalization__Group__0 ) )
            // InternalCls.g:343:3: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalCls.g:344:3: ( rule__Generalization__Group__0 )
            // InternalCls.g:344:4: rule__Generalization__Group__0
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
    // InternalCls.g:353:1: entryRuleImplementation : ruleImplementation EOF ;
    public final void entryRuleImplementation() throws RecognitionException {
        try {
            // InternalCls.g:354:1: ( ruleImplementation EOF )
            // InternalCls.g:355:1: ruleImplementation EOF
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
    // InternalCls.g:362:1: ruleImplementation : ( ( rule__Implementation__Group__0 ) ) ;
    public final void ruleImplementation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:366:2: ( ( ( rule__Implementation__Group__0 ) ) )
            // InternalCls.g:367:2: ( ( rule__Implementation__Group__0 ) )
            {
            // InternalCls.g:367:2: ( ( rule__Implementation__Group__0 ) )
            // InternalCls.g:368:3: ( rule__Implementation__Group__0 )
            {
             before(grammarAccess.getImplementationAccess().getGroup()); 
            // InternalCls.g:369:3: ( rule__Implementation__Group__0 )
            // InternalCls.g:369:4: rule__Implementation__Group__0
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


    // $ANTLR start "entryRuleAssociation"
    // InternalCls.g:378:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalCls.g:379:1: ( ruleAssociation EOF )
            // InternalCls.g:380:1: ruleAssociation EOF
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
    // InternalCls.g:387:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:391:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalCls.g:392:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalCls.g:392:2: ( ( rule__Association__Group__0 ) )
            // InternalCls.g:393:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalCls.g:394:3: ( rule__Association__Group__0 )
            // InternalCls.g:394:4: rule__Association__Group__0
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


    // $ANTLR start "entryRuleAssociationEnd"
    // InternalCls.g:403:1: entryRuleAssociationEnd : ruleAssociationEnd EOF ;
    public final void entryRuleAssociationEnd() throws RecognitionException {
        try {
            // InternalCls.g:404:1: ( ruleAssociationEnd EOF )
            // InternalCls.g:405:1: ruleAssociationEnd EOF
            {
             before(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationEndRule()); 
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
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // InternalCls.g:412:1: ruleAssociationEnd : ( ( rule__AssociationEnd__TypeAssignment ) ) ;
    public final void ruleAssociationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:416:2: ( ( ( rule__AssociationEnd__TypeAssignment ) ) )
            // InternalCls.g:417:2: ( ( rule__AssociationEnd__TypeAssignment ) )
            {
            // InternalCls.g:417:2: ( ( rule__AssociationEnd__TypeAssignment ) )
            // InternalCls.g:418:3: ( rule__AssociationEnd__TypeAssignment )
            {
             before(grammarAccess.getAssociationEndAccess().getTypeAssignment()); 
            // InternalCls.g:419:3: ( rule__AssociationEnd__TypeAssignment )
            // InternalCls.g:419:4: rule__AssociationEnd__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleConnectorLabel"
    // InternalCls.g:428:1: entryRuleConnectorLabel : ruleConnectorLabel EOF ;
    public final void entryRuleConnectorLabel() throws RecognitionException {
        try {
            // InternalCls.g:429:1: ( ruleConnectorLabel EOF )
            // InternalCls.g:430:1: ruleConnectorLabel EOF
            {
             before(grammarAccess.getConnectorLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectorLabel();

            state._fsp--;

             after(grammarAccess.getConnectorLabelRule()); 
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
    // $ANTLR end "entryRuleConnectorLabel"


    // $ANTLR start "ruleConnectorLabel"
    // InternalCls.g:437:1: ruleConnectorLabel : ( ( rule__ConnectorLabel__NameAssignment ) ) ;
    public final void ruleConnectorLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:441:2: ( ( ( rule__ConnectorLabel__NameAssignment ) ) )
            // InternalCls.g:442:2: ( ( rule__ConnectorLabel__NameAssignment ) )
            {
            // InternalCls.g:442:2: ( ( rule__ConnectorLabel__NameAssignment ) )
            // InternalCls.g:443:3: ( rule__ConnectorLabel__NameAssignment )
            {
             before(grammarAccess.getConnectorLabelAccess().getNameAssignment()); 
            // InternalCls.g:444:3: ( rule__ConnectorLabel__NameAssignment )
            // InternalCls.g:444:4: rule__ConnectorLabel__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorLabel__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConnectorLabelAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectorLabel"


    // $ANTLR start "entryRuleConnectorCardinalitiy"
    // InternalCls.g:453:1: entryRuleConnectorCardinalitiy : ruleConnectorCardinalitiy EOF ;
    public final void entryRuleConnectorCardinalitiy() throws RecognitionException {
        try {
            // InternalCls.g:454:1: ( ruleConnectorCardinalitiy EOF )
            // InternalCls.g:455:1: ruleConnectorCardinalitiy EOF
            {
             before(grammarAccess.getConnectorCardinalitiyRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectorCardinalitiy();

            state._fsp--;

             after(grammarAccess.getConnectorCardinalitiyRule()); 
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
    // $ANTLR end "entryRuleConnectorCardinalitiy"


    // $ANTLR start "ruleConnectorCardinalitiy"
    // InternalCls.g:462:1: ruleConnectorCardinalitiy : ( ( rule__ConnectorCardinalitiy__Group__0 ) ) ;
    public final void ruleConnectorCardinalitiy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:466:2: ( ( ( rule__ConnectorCardinalitiy__Group__0 ) ) )
            // InternalCls.g:467:2: ( ( rule__ConnectorCardinalitiy__Group__0 ) )
            {
            // InternalCls.g:467:2: ( ( rule__ConnectorCardinalitiy__Group__0 ) )
            // InternalCls.g:468:3: ( rule__ConnectorCardinalitiy__Group__0 )
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getGroup()); 
            // InternalCls.g:469:3: ( rule__ConnectorCardinalitiy__Group__0 )
            // InternalCls.g:469:4: rule__ConnectorCardinalitiy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorCardinalitiyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectorCardinalitiy"


    // $ANTLR start "entryRuleCardinality"
    // InternalCls.g:478:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalCls.g:479:1: ( ruleCardinality EOF )
            // InternalCls.g:480:1: ruleCardinality EOF
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
    // InternalCls.g:487:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:491:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalCls.g:492:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalCls.g:492:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalCls.g:493:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalCls.g:494:3: ( rule__Cardinality__Alternatives )
            // InternalCls.g:494:4: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleNote"
    // InternalCls.g:503:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalCls.g:504:1: ( ruleNote EOF )
            // InternalCls.g:505:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
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
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalCls.g:512:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:516:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalCls.g:517:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalCls.g:517:2: ( ( rule__Note__Group__0 ) )
            // InternalCls.g:518:3: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // InternalCls.g:519:3: ( rule__Note__Group__0 )
            // InternalCls.g:519:4: rule__Note__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "ruleVisibility"
    // InternalCls.g:528:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:532:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalCls.g:533:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalCls.g:533:2: ( ( rule__Visibility__Alternatives ) )
            // InternalCls.g:534:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalCls.g:535:3: ( rule__Visibility__Alternatives )
            // InternalCls.g:535:4: rule__Visibility__Alternatives
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


    // $ANTLR start "ruleDataType"
    // InternalCls.g:544:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:548:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalCls.g:549:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalCls.g:549:2: ( ( rule__DataType__Alternatives ) )
            // InternalCls.g:550:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalCls.g:551:3: ( rule__DataType__Alternatives )
            // InternalCls.g:551:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalCls.g:559:1: rule__Element__Alternatives : ( ( ruleClassDef ) | ( ruleClass ) | ( ruleConnector ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:563:1: ( ( ruleClassDef ) | ( ruleClass ) | ( ruleConnector ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt1=1;
                }
                break;
            case 45:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==17||(LA1_3>=38 && LA1_3<=39)) ) {
                    alt1=3;
                }
                else if ( (LA1_3==31) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCls.g:564:2: ( ruleClassDef )
                    {
                    // InternalCls.g:564:2: ( ruleClassDef )
                    // InternalCls.g:565:3: ruleClassDef
                    {
                     before(grammarAccess.getElementAccess().getClassDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassDef();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getClassDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:570:2: ( ruleClass )
                    {
                    // InternalCls.g:570:2: ( ruleClass )
                    // InternalCls.g:571:3: ruleClass
                    {
                     before(grammarAccess.getElementAccess().getClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:576:2: ( ruleConnector )
                    {
                    // InternalCls.g:576:2: ( ruleConnector )
                    // InternalCls.g:577:3: ruleConnector
                    {
                     before(grammarAccess.getElementAccess().getConnectorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConnector();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getConnectorParserRuleCall_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalCls.g:586:1: rule__Type__Alternatives : ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ruleClassName ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:590:1: ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ruleClassName ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=20 && LA2_0<=28)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCls.g:591:2: ( ( rule__Type__TypeAssignment_0 ) )
                    {
                    // InternalCls.g:591:2: ( ( rule__Type__TypeAssignment_0 ) )
                    // InternalCls.g:592:3: ( rule__Type__TypeAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_0()); 
                    // InternalCls.g:593:3: ( rule__Type__TypeAssignment_0 )
                    // InternalCls.g:593:4: rule__Type__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:597:2: ( ruleClassName )
                    {
                    // InternalCls.g:597:2: ( ruleClassName )
                    // InternalCls.g:598:3: ruleClassName
                    {
                     before(grammarAccess.getTypeAccess().getClassNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassName();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getClassNameParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__ClassDef__Alternatives_0"
    // InternalCls.g:607:1: rule__ClassDef__Alternatives_0 : ( ( 'class' ) | ( 'interface' ) );
    public final void rule__ClassDef__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:611:1: ( ( 'class' ) | ( 'interface' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCls.g:612:2: ( 'class' )
                    {
                    // InternalCls.g:612:2: ( 'class' )
                    // InternalCls.g:613:3: 'class'
                    {
                     before(grammarAccess.getClassDefAccess().getClassKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getClassDefAccess().getClassKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:618:2: ( 'interface' )
                    {
                    // InternalCls.g:618:2: ( 'interface' )
                    // InternalCls.g:619:3: 'interface'
                    {
                     before(grammarAccess.getClassDefAccess().getInterfaceKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getClassDefAccess().getInterfaceKeyword_0_1()); 

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
    // $ANTLR end "rule__ClassDef__Alternatives_0"


    // $ANTLR start "rule__Name__Alternatives"
    // InternalCls.g:628:1: rule__Name__Alternatives : ( ( ( rule__Name__NameAssignment_0 ) ) | ( ( rule__Name__Group_1__0 ) ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:632:1: ( ( ( rule__Name__NameAssignment_0 ) ) | ( ( rule__Name__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==34) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==RULE_ID||(LA4_1>=16 && LA4_1<=19)||(LA4_1>=32 && LA4_1<=33)||LA4_1==37||(LA4_1>=45 && LA4_1<=47)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCls.g:633:2: ( ( rule__Name__NameAssignment_0 ) )
                    {
                    // InternalCls.g:633:2: ( ( rule__Name__NameAssignment_0 ) )
                    // InternalCls.g:634:3: ( rule__Name__NameAssignment_0 )
                    {
                     before(grammarAccess.getNameAccess().getNameAssignment_0()); 
                    // InternalCls.g:635:3: ( rule__Name__NameAssignment_0 )
                    // InternalCls.g:635:4: rule__Name__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Name__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNameAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:639:2: ( ( rule__Name__Group_1__0 ) )
                    {
                    // InternalCls.g:639:2: ( ( rule__Name__Group_1__0 ) )
                    // InternalCls.g:640:3: ( rule__Name__Group_1__0 )
                    {
                     before(grammarAccess.getNameAccess().getGroup_1()); 
                    // InternalCls.g:641:3: ( rule__Name__Group_1__0 )
                    // InternalCls.g:641:4: rule__Name__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Name__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Name__Alternatives"


    // $ANTLR start "rule__Name__LongnameAlternatives_1_0_0"
    // InternalCls.g:649:1: rule__Name__LongnameAlternatives_1_0_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Name__LongnameAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:653:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCls.g:654:2: ( RULE_STRING )
                    {
                    // InternalCls.g:654:2: ( RULE_STRING )
                    // InternalCls.g:655:3: RULE_STRING
                    {
                     before(grammarAccess.getNameAccess().getLongnameSTRINGTerminalRuleCall_1_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getLongnameSTRINGTerminalRuleCall_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:660:2: ( RULE_ID )
                    {
                    // InternalCls.g:660:2: ( RULE_ID )
                    // InternalCls.g:661:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getLongnameIDTerminalRuleCall_1_0_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getLongnameIDTerminalRuleCall_1_0_0_1()); 

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
    // $ANTLR end "rule__Name__LongnameAlternatives_1_0_0"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalCls.g:670:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethode ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:674:1: ( ( ruleAttribute ) | ( ruleMethode ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalCls.g:675:2: ( ruleAttribute )
                    {
                    // InternalCls.g:675:2: ( ruleAttribute )
                    // InternalCls.g:676:3: ruleAttribute
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
                    // InternalCls.g:681:2: ( ruleMethode )
                    {
                    // InternalCls.g:681:2: ( ruleMethode )
                    // InternalCls.g:682:3: ruleMethode
                    {
                     before(grammarAccess.getMemberAccess().getMethodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMethode();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getMethodeParserRuleCall_1()); 

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
    // InternalCls.g:691:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleAssociation ) | ( ruleImplementation ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:695:1: ( ( ruleGeneralization ) | ( ruleAssociation ) | ( ruleImplementation ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt7=2;
                    }
                    break;
                case 38:
                    {
                    alt7=1;
                    }
                    break;
                case 39:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCls.g:696:2: ( ruleGeneralization )
                    {
                    // InternalCls.g:696:2: ( ruleGeneralization )
                    // InternalCls.g:697:3: ruleGeneralization
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
                    // InternalCls.g:702:2: ( ruleAssociation )
                    {
                    // InternalCls.g:702:2: ( ruleAssociation )
                    // InternalCls.g:703:3: ruleAssociation
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
                    // InternalCls.g:708:2: ( ruleImplementation )
                    {
                    // InternalCls.g:708:2: ( ruleImplementation )
                    // InternalCls.g:709:3: ruleImplementation
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


    // $ANTLR start "rule__Association__Alternatives_2"
    // InternalCls.g:718:1: rule__Association__Alternatives_2 : ( ( ( rule__Association__Group_2_0__0 ) ) | ( ( rule__Association__NoteAssignment_2_1 ) ) );
    public final void rule__Association__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:722:1: ( ( ( rule__Association__Group_2_0__0 ) ) | ( ( rule__Association__NoteAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==44) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCls.g:723:2: ( ( rule__Association__Group_2_0__0 ) )
                    {
                    // InternalCls.g:723:2: ( ( rule__Association__Group_2_0__0 ) )
                    // InternalCls.g:724:3: ( rule__Association__Group_2_0__0 )
                    {
                     before(grammarAccess.getAssociationAccess().getGroup_2_0()); 
                    // InternalCls.g:725:3: ( rule__Association__Group_2_0__0 )
                    // InternalCls.g:725:4: rule__Association__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:729:2: ( ( rule__Association__NoteAssignment_2_1 ) )
                    {
                    // InternalCls.g:729:2: ( ( rule__Association__NoteAssignment_2_1 ) )
                    // InternalCls.g:730:3: ( rule__Association__NoteAssignment_2_1 )
                    {
                     before(grammarAccess.getAssociationAccess().getNoteAssignment_2_1()); 
                    // InternalCls.g:731:3: ( rule__Association__NoteAssignment_2_1 )
                    // InternalCls.g:731:4: rule__Association__NoteAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__NoteAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getNoteAssignment_2_1()); 

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
    // $ANTLR end "rule__Association__Alternatives_2"


    // $ANTLR start "rule__ConnectorCardinalitiy__Alternatives_4_2"
    // InternalCls.g:739:1: rule__ConnectorCardinalitiy__Alternatives_4_2 : ( ( '<' ) | ( '>' ) );
    public final void rule__ConnectorCardinalitiy__Alternatives_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:743:1: ( ( '<' ) | ( '>' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCls.g:744:2: ( '<' )
                    {
                    // InternalCls.g:744:2: ( '<' )
                    // InternalCls.g:745:3: '<'
                    {
                     before(grammarAccess.getConnectorCardinalitiyAccess().getLessThanSignKeyword_4_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConnectorCardinalitiyAccess().getLessThanSignKeyword_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:750:2: ( '>' )
                    {
                    // InternalCls.g:750:2: ( '>' )
                    // InternalCls.g:751:3: '>'
                    {
                     before(grammarAccess.getConnectorCardinalitiyAccess().getGreaterThanSignKeyword_4_2_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConnectorCardinalitiyAccess().getGreaterThanSignKeyword_4_2_1()); 

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
    // $ANTLR end "rule__ConnectorCardinalitiy__Alternatives_4_2"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // InternalCls.g:760:1: rule__Cardinality__Alternatives : ( ( '*' ) | ( ( rule__Cardinality__Group_1__0 ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:764:1: ( ( '*' ) | ( ( rule__Cardinality__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
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
                    // InternalCls.g:765:2: ( '*' )
                    {
                    // InternalCls.g:765:2: ( '*' )
                    // InternalCls.g:766:3: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:771:2: ( ( rule__Cardinality__Group_1__0 ) )
                    {
                    // InternalCls.g:771:2: ( ( rule__Cardinality__Group_1__0 ) )
                    // InternalCls.g:772:3: ( rule__Cardinality__Group_1__0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getGroup_1()); 
                    // InternalCls.g:773:3: ( rule__Cardinality__Group_1__0 )
                    // InternalCls.g:773:4: rule__Cardinality__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cardinality__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardinalityAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Cardinality__Alternatives"


    // $ANTLR start "rule__Cardinality__Alternatives_1_2"
    // InternalCls.g:781:1: rule__Cardinality__Alternatives_1_2 : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__Cardinality__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:785:1: ( ( '*' ) | ( RULE_INT ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCls.g:786:2: ( '*' )
                    {
                    // InternalCls.g:786:2: ( '*' )
                    // InternalCls.g:787:3: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:792:2: ( RULE_INT )
                    {
                    // InternalCls.g:792:2: ( RULE_INT )
                    // InternalCls.g:793:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_2_1()); 

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
    // $ANTLR end "rule__Cardinality__Alternatives_1_2"


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalCls.g:802:1: rule__Visibility__Alternatives : ( ( ( '~' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '+' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:806:1: ( ( ( '~' ) ) | ( ( '-' ) ) | ( ( '#' ) ) | ( ( '+' ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt12=1;
                }
                break;
            case 17:
                {
                alt12=2;
                }
                break;
            case 18:
                {
                alt12=3;
                }
                break;
            case 19:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalCls.g:807:2: ( ( '~' ) )
                    {
                    // InternalCls.g:807:2: ( ( '~' ) )
                    // InternalCls.g:808:3: ( '~' )
                    {
                     before(grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                    // InternalCls.g:809:3: ( '~' )
                    // InternalCls.g:809:4: '~'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:813:2: ( ( '-' ) )
                    {
                    // InternalCls.g:813:2: ( ( '-' ) )
                    // InternalCls.g:814:3: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalCls.g:815:3: ( '-' )
                    // InternalCls.g:815:4: '-'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:819:2: ( ( '#' ) )
                    {
                    // InternalCls.g:819:2: ( ( '#' ) )
                    // InternalCls.g:820:3: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    // InternalCls.g:821:3: ( '#' )
                    // InternalCls.g:821:4: '#'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:825:2: ( ( '+' ) )
                    {
                    // InternalCls.g:825:2: ( ( '+' ) )
                    // InternalCls.g:826:3: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_3()); 
                    // InternalCls.g:827:3: ( '+' )
                    // InternalCls.g:827:4: '+'
                    {
                    match(input,19,FOLLOW_2); 

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


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalCls.g:835:1: rule__DataType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'short' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:839:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'short' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) )
            int alt13=9;
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
            case 23:
                {
                alt13=4;
                }
                break;
            case 24:
                {
                alt13=5;
                }
                break;
            case 25:
                {
                alt13=6;
                }
                break;
            case 26:
                {
                alt13=7;
                }
                break;
            case 27:
                {
                alt13=8;
                }
                break;
            case 28:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCls.g:840:2: ( ( 'string' ) )
                    {
                    // InternalCls.g:840:2: ( ( 'string' ) )
                    // InternalCls.g:841:3: ( 'string' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalCls.g:842:3: ( 'string' )
                    // InternalCls.g:842:4: 'string'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCls.g:846:2: ( ( 'int' ) )
                    {
                    // InternalCls.g:846:2: ( ( 'int' ) )
                    // InternalCls.g:847:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalCls.g:848:3: ( 'int' )
                    // InternalCls.g:848:4: 'int'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCls.g:852:2: ( ( 'double' ) )
                    {
                    // InternalCls.g:852:2: ( ( 'double' ) )
                    // InternalCls.g:853:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    // InternalCls.g:854:3: ( 'double' )
                    // InternalCls.g:854:4: 'double'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCls.g:858:2: ( ( 'boolean' ) )
                    {
                    // InternalCls.g:858:2: ( ( 'boolean' ) )
                    // InternalCls.g:859:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 
                    // InternalCls.g:860:3: ( 'boolean' )
                    // InternalCls.g:860:4: 'boolean'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCls.g:864:2: ( ( 'char' ) )
                    {
                    // InternalCls.g:864:2: ( ( 'char' ) )
                    // InternalCls.g:865:3: ( 'char' )
                    {
                     before(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4()); 
                    // InternalCls.g:866:3: ( 'char' )
                    // InternalCls.g:866:4: 'char'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCls.g:870:2: ( ( 'byte' ) )
                    {
                    // InternalCls.g:870:2: ( ( 'byte' ) )
                    // InternalCls.g:871:3: ( 'byte' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_5()); 
                    // InternalCls.g:872:3: ( 'byte' )
                    // InternalCls.g:872:4: 'byte'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCls.g:876:2: ( ( 'short' ) )
                    {
                    // InternalCls.g:876:2: ( ( 'short' ) )
                    // InternalCls.g:877:3: ( 'short' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_6()); 
                    // InternalCls.g:878:3: ( 'short' )
                    // InternalCls.g:878:4: 'short'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCls.g:882:2: ( ( 'long' ) )
                    {
                    // InternalCls.g:882:2: ( ( 'long' ) )
                    // InternalCls.g:883:3: ( 'long' )
                    {
                     before(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7()); 
                    // InternalCls.g:884:3: ( 'long' )
                    // InternalCls.g:884:4: 'long'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCls.g:888:2: ( ( 'float' ) )
                    {
                    // InternalCls.g:888:2: ( ( 'float' ) )
                    // InternalCls.g:889:3: ( 'float' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalCls.g:890:3: ( 'float' )
                    // InternalCls.g:890:4: 'float'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__ClassDiagram__Group__0"
    // InternalCls.g:898:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:902:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // InternalCls.g:903:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
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
    // InternalCls.g:910:1: rule__ClassDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:914:1: ( ( () ) )
            // InternalCls.g:915:1: ( () )
            {
            // InternalCls.g:915:1: ( () )
            // InternalCls.g:916:2: ()
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 
            // InternalCls.g:917:2: ()
            // InternalCls.g:917:3: 
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
    // InternalCls.g:925:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:929:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // InternalCls.g:930:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
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
    // InternalCls.g:937:1: rule__ClassDiagram__Group__1__Impl : ( '@startclass' ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:941:1: ( ( '@startclass' ) )
            // InternalCls.g:942:1: ( '@startclass' )
            {
            // InternalCls.g:942:1: ( '@startclass' )
            // InternalCls.g:943:2: '@startclass'
            {
             before(grammarAccess.getClassDiagramAccess().getStartclassKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCls.g:952:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:956:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // InternalCls.g:957:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
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
    // InternalCls.g:964:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__ElementsAssignment_2 )* ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:968:1: ( ( ( rule__ClassDiagram__ElementsAssignment_2 )* ) )
            // InternalCls.g:969:1: ( ( rule__ClassDiagram__ElementsAssignment_2 )* )
            {
            // InternalCls.g:969:1: ( ( rule__ClassDiagram__ElementsAssignment_2 )* )
            // InternalCls.g:970:2: ( rule__ClassDiagram__ElementsAssignment_2 )*
            {
             before(grammarAccess.getClassDiagramAccess().getElementsAssignment_2()); 
            // InternalCls.g:971:2: ( rule__ClassDiagram__ElementsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=11 && LA14_0<=12)||LA14_0==45) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCls.g:971:3: rule__ClassDiagram__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ClassDiagram__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getClassDiagramAccess().getElementsAssignment_2()); 

            }


            }

        }
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
    // InternalCls.g:979:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:983:1: ( rule__ClassDiagram__Group__3__Impl )
            // InternalCls.g:984:2: rule__ClassDiagram__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:990:1: rule__ClassDiagram__Group__3__Impl : ( '@endclass' ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:994:1: ( ( '@endclass' ) )
            // InternalCls.g:995:1: ( '@endclass' )
            {
            // InternalCls.g:995:1: ( '@endclass' )
            // InternalCls.g:996:2: '@endclass'
            {
             before(grammarAccess.getClassDiagramAccess().getEndclassKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getEndclassKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClassDef__Group__0"
    // InternalCls.g:1006:1: rule__ClassDef__Group__0 : rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1 ;
    public final void rule__ClassDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1010:1: ( rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1 )
            // InternalCls.g:1011:2: rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ClassDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__0"


    // $ANTLR start "rule__ClassDef__Group__0__Impl"
    // InternalCls.g:1018:1: rule__ClassDef__Group__0__Impl : ( ( rule__ClassDef__Alternatives_0 ) ) ;
    public final void rule__ClassDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1022:1: ( ( ( rule__ClassDef__Alternatives_0 ) ) )
            // InternalCls.g:1023:1: ( ( rule__ClassDef__Alternatives_0 ) )
            {
            // InternalCls.g:1023:1: ( ( rule__ClassDef__Alternatives_0 ) )
            // InternalCls.g:1024:2: ( rule__ClassDef__Alternatives_0 )
            {
             before(grammarAccess.getClassDefAccess().getAlternatives_0()); 
            // InternalCls.g:1025:2: ( rule__ClassDef__Alternatives_0 )
            // InternalCls.g:1025:3: rule__ClassDef__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDef__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getClassDefAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__0__Impl"


    // $ANTLR start "rule__ClassDef__Group__1"
    // InternalCls.g:1033:1: rule__ClassDef__Group__1 : rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2 ;
    public final void rule__ClassDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1037:1: ( rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2 )
            // InternalCls.g:1038:2: rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ClassDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__1"


    // $ANTLR start "rule__ClassDef__Group__1__Impl"
    // InternalCls.g:1045:1: rule__ClassDef__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1049:1: ( ( '{' ) )
            // InternalCls.g:1050:1: ( '{' )
            {
            // InternalCls.g:1050:1: ( '{' )
            // InternalCls.g:1051:2: '{'
            {
             before(grammarAccess.getClassDefAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getClassDefAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__1__Impl"


    // $ANTLR start "rule__ClassDef__Group__2"
    // InternalCls.g:1060:1: rule__ClassDef__Group__2 : rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3 ;
    public final void rule__ClassDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1064:1: ( rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3 )
            // InternalCls.g:1065:2: rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ClassDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__2"


    // $ANTLR start "rule__ClassDef__Group__2__Impl"
    // InternalCls.g:1072:1: rule__ClassDef__Group__2__Impl : ( ( rule__ClassDef__ClassesAssignment_2 ) ) ;
    public final void rule__ClassDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1076:1: ( ( ( rule__ClassDef__ClassesAssignment_2 ) ) )
            // InternalCls.g:1077:1: ( ( rule__ClassDef__ClassesAssignment_2 ) )
            {
            // InternalCls.g:1077:1: ( ( rule__ClassDef__ClassesAssignment_2 ) )
            // InternalCls.g:1078:2: ( rule__ClassDef__ClassesAssignment_2 )
            {
             before(grammarAccess.getClassDefAccess().getClassesAssignment_2()); 
            // InternalCls.g:1079:2: ( rule__ClassDef__ClassesAssignment_2 )
            // InternalCls.g:1079:3: rule__ClassDef__ClassesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassDef__ClassesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassDefAccess().getClassesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__2__Impl"


    // $ANTLR start "rule__ClassDef__Group__3"
    // InternalCls.g:1087:1: rule__ClassDef__Group__3 : rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4 ;
    public final void rule__ClassDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1091:1: ( rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4 )
            // InternalCls.g:1092:2: rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ClassDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__3"


    // $ANTLR start "rule__ClassDef__Group__3__Impl"
    // InternalCls.g:1099:1: rule__ClassDef__Group__3__Impl : ( ( rule__ClassDef__Group_3__0 )* ) ;
    public final void rule__ClassDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1103:1: ( ( ( rule__ClassDef__Group_3__0 )* ) )
            // InternalCls.g:1104:1: ( ( rule__ClassDef__Group_3__0 )* )
            {
            // InternalCls.g:1104:1: ( ( rule__ClassDef__Group_3__0 )* )
            // InternalCls.g:1105:2: ( rule__ClassDef__Group_3__0 )*
            {
             before(grammarAccess.getClassDefAccess().getGroup_3()); 
            // InternalCls.g:1106:2: ( rule__ClassDef__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCls.g:1106:3: rule__ClassDef__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ClassDef__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getClassDefAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__3__Impl"


    // $ANTLR start "rule__ClassDef__Group__4"
    // InternalCls.g:1114:1: rule__ClassDef__Group__4 : rule__ClassDef__Group__4__Impl ;
    public final void rule__ClassDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1118:1: ( rule__ClassDef__Group__4__Impl )
            // InternalCls.g:1119:2: rule__ClassDef__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__4"


    // $ANTLR start "rule__ClassDef__Group__4__Impl"
    // InternalCls.g:1125:1: rule__ClassDef__Group__4__Impl : ( '}' ) ;
    public final void rule__ClassDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1129:1: ( ( '}' ) )
            // InternalCls.g:1130:1: ( '}' )
            {
            // InternalCls.g:1130:1: ( '}' )
            // InternalCls.g:1131:2: '}'
            {
             before(grammarAccess.getClassDefAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClassDefAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__4__Impl"


    // $ANTLR start "rule__ClassDef__Group_3__0"
    // InternalCls.g:1141:1: rule__ClassDef__Group_3__0 : rule__ClassDef__Group_3__0__Impl rule__ClassDef__Group_3__1 ;
    public final void rule__ClassDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1145:1: ( rule__ClassDef__Group_3__0__Impl rule__ClassDef__Group_3__1 )
            // InternalCls.g:1146:2: rule__ClassDef__Group_3__0__Impl rule__ClassDef__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ClassDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group_3__0"


    // $ANTLR start "rule__ClassDef__Group_3__0__Impl"
    // InternalCls.g:1153:1: rule__ClassDef__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ClassDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1157:1: ( ( ',' ) )
            // InternalCls.g:1158:1: ( ',' )
            {
            // InternalCls.g:1158:1: ( ',' )
            // InternalCls.g:1159:2: ','
            {
             before(grammarAccess.getClassDefAccess().getCommaKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClassDefAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group_3__0__Impl"


    // $ANTLR start "rule__ClassDef__Group_3__1"
    // InternalCls.g:1168:1: rule__ClassDef__Group_3__1 : rule__ClassDef__Group_3__1__Impl ;
    public final void rule__ClassDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1172:1: ( rule__ClassDef__Group_3__1__Impl )
            // InternalCls.g:1173:2: rule__ClassDef__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDef__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group_3__1"


    // $ANTLR start "rule__ClassDef__Group_3__1__Impl"
    // InternalCls.g:1179:1: rule__ClassDef__Group_3__1__Impl : ( ( rule__ClassDef__ClassesAssignment_3_1 ) ) ;
    public final void rule__ClassDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1183:1: ( ( ( rule__ClassDef__ClassesAssignment_3_1 ) ) )
            // InternalCls.g:1184:1: ( ( rule__ClassDef__ClassesAssignment_3_1 ) )
            {
            // InternalCls.g:1184:1: ( ( rule__ClassDef__ClassesAssignment_3_1 ) )
            // InternalCls.g:1185:2: ( rule__ClassDef__ClassesAssignment_3_1 )
            {
             before(grammarAccess.getClassDefAccess().getClassesAssignment_3_1()); 
            // InternalCls.g:1186:2: ( rule__ClassDef__ClassesAssignment_3_1 )
            // InternalCls.g:1186:3: rule__ClassDef__ClassesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDef__ClassesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDefAccess().getClassesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group_3__1__Impl"


    // $ANTLR start "rule__Name__Group_1__0"
    // InternalCls.g:1195:1: rule__Name__Group_1__0 : rule__Name__Group_1__0__Impl rule__Name__Group_1__1 ;
    public final void rule__Name__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1199:1: ( rule__Name__Group_1__0__Impl rule__Name__Group_1__1 )
            // InternalCls.g:1200:2: rule__Name__Group_1__0__Impl rule__Name__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Name__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_1__0"


    // $ANTLR start "rule__Name__Group_1__0__Impl"
    // InternalCls.g:1207:1: rule__Name__Group_1__0__Impl : ( ( rule__Name__LongnameAssignment_1_0 ) ) ;
    public final void rule__Name__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1211:1: ( ( ( rule__Name__LongnameAssignment_1_0 ) ) )
            // InternalCls.g:1212:1: ( ( rule__Name__LongnameAssignment_1_0 ) )
            {
            // InternalCls.g:1212:1: ( ( rule__Name__LongnameAssignment_1_0 ) )
            // InternalCls.g:1213:2: ( rule__Name__LongnameAssignment_1_0 )
            {
             before(grammarAccess.getNameAccess().getLongnameAssignment_1_0()); 
            // InternalCls.g:1214:2: ( rule__Name__LongnameAssignment_1_0 )
            // InternalCls.g:1214:3: rule__Name__LongnameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Name__LongnameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getLongnameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_1__0__Impl"


    // $ANTLR start "rule__Name__Group_1__1"
    // InternalCls.g:1222:1: rule__Name__Group_1__1 : rule__Name__Group_1__1__Impl rule__Name__Group_1__2 ;
    public final void rule__Name__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1226:1: ( rule__Name__Group_1__1__Impl rule__Name__Group_1__2 )
            // InternalCls.g:1227:2: rule__Name__Group_1__1__Impl rule__Name__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Name__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_1__1"


    // $ANTLR start "rule__Name__Group_1__1__Impl"
    // InternalCls.g:1234:1: rule__Name__Group_1__1__Impl : ( ' as ' ) ;
    public final void rule__Name__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1238:1: ( ( ' as ' ) )
            // InternalCls.g:1239:1: ( ' as ' )
            {
            // InternalCls.g:1239:1: ( ' as ' )
            // InternalCls.g:1240:2: ' as '
            {
             before(grammarAccess.getNameAccess().getAsKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getAsKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_1__1__Impl"


    // $ANTLR start "rule__Name__Group_1__2"
    // InternalCls.g:1249:1: rule__Name__Group_1__2 : rule__Name__Group_1__2__Impl ;
    public final void rule__Name__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1253:1: ( rule__Name__Group_1__2__Impl )
            // InternalCls.g:1254:2: rule__Name__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_1__2"


    // $ANTLR start "rule__Name__Group_1__2__Impl"
    // InternalCls.g:1260:1: rule__Name__Group_1__2__Impl : ( ( rule__Name__NameAssignment_1_2 ) ) ;
    public final void rule__Name__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1264:1: ( ( ( rule__Name__NameAssignment_1_2 ) ) )
            // InternalCls.g:1265:1: ( ( rule__Name__NameAssignment_1_2 ) )
            {
            // InternalCls.g:1265:1: ( ( rule__Name__NameAssignment_1_2 ) )
            // InternalCls.g:1266:2: ( rule__Name__NameAssignment_1_2 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_1_2()); 
            // InternalCls.g:1267:2: ( rule__Name__NameAssignment_1_2 )
            // InternalCls.g:1267:3: rule__Name__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Name__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_1__2__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalCls.g:1276:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1280:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalCls.g:1281:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalCls.g:1288:1: rule__Class__Group__0__Impl : ( ( rule__Class__AbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1292:1: ( ( ( rule__Class__AbstractAssignment_0 )? ) )
            // InternalCls.g:1293:1: ( ( rule__Class__AbstractAssignment_0 )? )
            {
            // InternalCls.g:1293:1: ( ( rule__Class__AbstractAssignment_0 )? )
            // InternalCls.g:1294:2: ( rule__Class__AbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_0()); 
            // InternalCls.g:1295:2: ( rule__Class__AbstractAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCls.g:1295:3: rule__Class__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAbstractAssignment_0()); 

            }


            }

        }
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
    // InternalCls.g:1303:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1307:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalCls.g:1308:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCls.g:1315:1: rule__Class__Group__1__Impl : ( ( rule__Class__TypeAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1319:1: ( ( ( rule__Class__TypeAssignment_1 ) ) )
            // InternalCls.g:1320:1: ( ( rule__Class__TypeAssignment_1 ) )
            {
            // InternalCls.g:1320:1: ( ( rule__Class__TypeAssignment_1 ) )
            // InternalCls.g:1321:2: ( rule__Class__TypeAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getTypeAssignment_1()); 
            // InternalCls.g:1322:2: ( rule__Class__TypeAssignment_1 )
            // InternalCls.g:1322:3: rule__Class__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // InternalCls.g:1330:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1334:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalCls.g:1335:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalCls.g:1342:1: rule__Class__Group__2__Impl : ( '{' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1346:1: ( ( '{' ) )
            // InternalCls.g:1347:1: ( '{' )
            {
            // InternalCls.g:1347:1: ( '{' )
            // InternalCls.g:1348:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalCls.g:1357:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1361:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalCls.g:1362:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalCls.g:1369:1: rule__Class__Group__3__Impl : ( ( rule__Class__MembersAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1373:1: ( ( ( rule__Class__MembersAssignment_3 )* ) )
            // InternalCls.g:1374:1: ( ( rule__Class__MembersAssignment_3 )* )
            {
            // InternalCls.g:1374:1: ( ( rule__Class__MembersAssignment_3 )* )
            // InternalCls.g:1375:2: ( rule__Class__MembersAssignment_3 )*
            {
             before(grammarAccess.getClassAccess().getMembersAssignment_3()); 
            // InternalCls.g:1376:2: ( rule__Class__MembersAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=16 && LA17_0<=19)||(LA17_0>=45 && LA17_0<=47)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCls.g:1376:3: rule__Class__MembersAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Class__MembersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMembersAssignment_3()); 

            }


            }

        }
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
    // InternalCls.g:1384:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1388:1: ( rule__Class__Group__4__Impl )
            // InternalCls.g:1389:2: rule__Class__Group__4__Impl
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
    // InternalCls.g:1395:1: rule__Class__Group__4__Impl : ( '}' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1399:1: ( ( '}' ) )
            // InternalCls.g:1400:1: ( '}' )
            {
            // InternalCls.g:1400:1: ( '}' )
            // InternalCls.g:1401:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalCls.g:1411:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1415:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalCls.g:1416:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCls.g:1423:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__VisibilityAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1427:1: ( ( ( rule__Attribute__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1428:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1428:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            // InternalCls.g:1429:2: ( rule__Attribute__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1430:2: ( rule__Attribute__VisibilityAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=16 && LA18_0<=19)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCls.g:1430:3: rule__Attribute__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalCls.g:1438:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1442:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalCls.g:1443:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalCls.g:1450:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__StaticAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1454:1: ( ( ( rule__Attribute__StaticAssignment_1 )? ) )
            // InternalCls.g:1455:1: ( ( rule__Attribute__StaticAssignment_1 )? )
            {
            // InternalCls.g:1455:1: ( ( rule__Attribute__StaticAssignment_1 )? )
            // InternalCls.g:1456:2: ( rule__Attribute__StaticAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getStaticAssignment_1()); 
            // InternalCls.g:1457:2: ( rule__Attribute__StaticAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCls.g:1457:3: rule__Attribute__StaticAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__StaticAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getStaticAssignment_1()); 

            }


            }

        }
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
    // InternalCls.g:1465:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1469:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalCls.g:1470:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalCls.g:1477:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__FinalAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1481:1: ( ( ( rule__Attribute__FinalAssignment_2 )? ) )
            // InternalCls.g:1482:1: ( ( rule__Attribute__FinalAssignment_2 )? )
            {
            // InternalCls.g:1482:1: ( ( rule__Attribute__FinalAssignment_2 )? )
            // InternalCls.g:1483:2: ( rule__Attribute__FinalAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getFinalAssignment_2()); 
            // InternalCls.g:1484:2: ( rule__Attribute__FinalAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==47) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCls.g:1484:3: rule__Attribute__FinalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__FinalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getFinalAssignment_2()); 

            }


            }

        }
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
    // InternalCls.g:1492:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1496:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalCls.g:1497:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalCls.g:1504:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1508:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // InternalCls.g:1509:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // InternalCls.g:1509:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // InternalCls.g:1510:2: ( rule__Attribute__NameAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            // InternalCls.g:1511:2: ( rule__Attribute__NameAssignment_3 )
            // InternalCls.g:1511:3: rule__Attribute__NameAssignment_3
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
    // InternalCls.g:1519:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1523:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalCls.g:1524:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalCls.g:1531:1: rule__Attribute__Group__4__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1535:1: ( ( ':' ) )
            // InternalCls.g:1536:1: ( ':' )
            {
            // InternalCls.g:1536:1: ( ':' )
            // InternalCls.g:1537:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCls.g:1546:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1550:1: ( rule__Attribute__Group__5__Impl )
            // InternalCls.g:1551:2: rule__Attribute__Group__5__Impl
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
    // InternalCls.g:1557:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__TypeAssignment_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1561:1: ( ( ( rule__Attribute__TypeAssignment_5 ) ) )
            // InternalCls.g:1562:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            {
            // InternalCls.g:1562:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            // InternalCls.g:1563:2: ( rule__Attribute__TypeAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 
            // InternalCls.g:1564:2: ( rule__Attribute__TypeAssignment_5 )
            // InternalCls.g:1564:3: rule__Attribute__TypeAssignment_5
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


    // $ANTLR start "rule__Methode__Group__0"
    // InternalCls.g:1573:1: rule__Methode__Group__0 : rule__Methode__Group__0__Impl rule__Methode__Group__1 ;
    public final void rule__Methode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1577:1: ( rule__Methode__Group__0__Impl rule__Methode__Group__1 )
            // InternalCls.g:1578:2: rule__Methode__Group__0__Impl rule__Methode__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Methode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__0"


    // $ANTLR start "rule__Methode__Group__0__Impl"
    // InternalCls.g:1585:1: rule__Methode__Group__0__Impl : ( ( rule__Methode__VisibilityAssignment_0 )? ) ;
    public final void rule__Methode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1589:1: ( ( ( rule__Methode__VisibilityAssignment_0 )? ) )
            // InternalCls.g:1590:1: ( ( rule__Methode__VisibilityAssignment_0 )? )
            {
            // InternalCls.g:1590:1: ( ( rule__Methode__VisibilityAssignment_0 )? )
            // InternalCls.g:1591:2: ( rule__Methode__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMethodeAccess().getVisibilityAssignment_0()); 
            // InternalCls.g:1592:2: ( rule__Methode__VisibilityAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=16 && LA21_0<=19)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCls.g:1592:3: rule__Methode__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Methode__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__0__Impl"


    // $ANTLR start "rule__Methode__Group__1"
    // InternalCls.g:1600:1: rule__Methode__Group__1 : rule__Methode__Group__1__Impl rule__Methode__Group__2 ;
    public final void rule__Methode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1604:1: ( rule__Methode__Group__1__Impl rule__Methode__Group__2 )
            // InternalCls.g:1605:2: rule__Methode__Group__1__Impl rule__Methode__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Methode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__1"


    // $ANTLR start "rule__Methode__Group__1__Impl"
    // InternalCls.g:1612:1: rule__Methode__Group__1__Impl : ( ( rule__Methode__AbstractAssignment_1 )? ) ;
    public final void rule__Methode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1616:1: ( ( ( rule__Methode__AbstractAssignment_1 )? ) )
            // InternalCls.g:1617:1: ( ( rule__Methode__AbstractAssignment_1 )? )
            {
            // InternalCls.g:1617:1: ( ( rule__Methode__AbstractAssignment_1 )? )
            // InternalCls.g:1618:2: ( rule__Methode__AbstractAssignment_1 )?
            {
             before(grammarAccess.getMethodeAccess().getAbstractAssignment_1()); 
            // InternalCls.g:1619:2: ( rule__Methode__AbstractAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCls.g:1619:3: rule__Methode__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Methode__AbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getAbstractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__1__Impl"


    // $ANTLR start "rule__Methode__Group__2"
    // InternalCls.g:1627:1: rule__Methode__Group__2 : rule__Methode__Group__2__Impl rule__Methode__Group__3 ;
    public final void rule__Methode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1631:1: ( rule__Methode__Group__2__Impl rule__Methode__Group__3 )
            // InternalCls.g:1632:2: rule__Methode__Group__2__Impl rule__Methode__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Methode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__2"


    // $ANTLR start "rule__Methode__Group__2__Impl"
    // InternalCls.g:1639:1: rule__Methode__Group__2__Impl : ( ( rule__Methode__StaticAssignment_2 )? ) ;
    public final void rule__Methode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1643:1: ( ( ( rule__Methode__StaticAssignment_2 )? ) )
            // InternalCls.g:1644:1: ( ( rule__Methode__StaticAssignment_2 )? )
            {
            // InternalCls.g:1644:1: ( ( rule__Methode__StaticAssignment_2 )? )
            // InternalCls.g:1645:2: ( rule__Methode__StaticAssignment_2 )?
            {
             before(grammarAccess.getMethodeAccess().getStaticAssignment_2()); 
            // InternalCls.g:1646:2: ( rule__Methode__StaticAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCls.g:1646:3: rule__Methode__StaticAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Methode__StaticAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getStaticAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__2__Impl"


    // $ANTLR start "rule__Methode__Group__3"
    // InternalCls.g:1654:1: rule__Methode__Group__3 : rule__Methode__Group__3__Impl rule__Methode__Group__4 ;
    public final void rule__Methode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1658:1: ( rule__Methode__Group__3__Impl rule__Methode__Group__4 )
            // InternalCls.g:1659:2: rule__Methode__Group__3__Impl rule__Methode__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Methode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__3"


    // $ANTLR start "rule__Methode__Group__3__Impl"
    // InternalCls.g:1666:1: rule__Methode__Group__3__Impl : ( ( rule__Methode__FinalAssignment_3 )? ) ;
    public final void rule__Methode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1670:1: ( ( ( rule__Methode__FinalAssignment_3 )? ) )
            // InternalCls.g:1671:1: ( ( rule__Methode__FinalAssignment_3 )? )
            {
            // InternalCls.g:1671:1: ( ( rule__Methode__FinalAssignment_3 )? )
            // InternalCls.g:1672:2: ( rule__Methode__FinalAssignment_3 )?
            {
             before(grammarAccess.getMethodeAccess().getFinalAssignment_3()); 
            // InternalCls.g:1673:2: ( rule__Methode__FinalAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==47) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCls.g:1673:3: rule__Methode__FinalAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Methode__FinalAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getFinalAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__3__Impl"


    // $ANTLR start "rule__Methode__Group__4"
    // InternalCls.g:1681:1: rule__Methode__Group__4 : rule__Methode__Group__4__Impl rule__Methode__Group__5 ;
    public final void rule__Methode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1685:1: ( rule__Methode__Group__4__Impl rule__Methode__Group__5 )
            // InternalCls.g:1686:2: rule__Methode__Group__4__Impl rule__Methode__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Methode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__4"


    // $ANTLR start "rule__Methode__Group__4__Impl"
    // InternalCls.g:1693:1: rule__Methode__Group__4__Impl : ( ( rule__Methode__NameAssignment_4 ) ) ;
    public final void rule__Methode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1697:1: ( ( ( rule__Methode__NameAssignment_4 ) ) )
            // InternalCls.g:1698:1: ( ( rule__Methode__NameAssignment_4 ) )
            {
            // InternalCls.g:1698:1: ( ( rule__Methode__NameAssignment_4 ) )
            // InternalCls.g:1699:2: ( rule__Methode__NameAssignment_4 )
            {
             before(grammarAccess.getMethodeAccess().getNameAssignment_4()); 
            // InternalCls.g:1700:2: ( rule__Methode__NameAssignment_4 )
            // InternalCls.g:1700:3: rule__Methode__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Methode__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__4__Impl"


    // $ANTLR start "rule__Methode__Group__5"
    // InternalCls.g:1708:1: rule__Methode__Group__5 : rule__Methode__Group__5__Impl rule__Methode__Group__6 ;
    public final void rule__Methode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1712:1: ( rule__Methode__Group__5__Impl rule__Methode__Group__6 )
            // InternalCls.g:1713:2: rule__Methode__Group__5__Impl rule__Methode__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Methode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__5"


    // $ANTLR start "rule__Methode__Group__5__Impl"
    // InternalCls.g:1720:1: rule__Methode__Group__5__Impl : ( '(' ) ;
    public final void rule__Methode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1724:1: ( ( '(' ) )
            // InternalCls.g:1725:1: ( '(' )
            {
            // InternalCls.g:1725:1: ( '(' )
            // InternalCls.g:1726:2: '('
            {
             before(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__5__Impl"


    // $ANTLR start "rule__Methode__Group__6"
    // InternalCls.g:1735:1: rule__Methode__Group__6 : rule__Methode__Group__6__Impl rule__Methode__Group__7 ;
    public final void rule__Methode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1739:1: ( rule__Methode__Group__6__Impl rule__Methode__Group__7 )
            // InternalCls.g:1740:2: rule__Methode__Group__6__Impl rule__Methode__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Methode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__6"


    // $ANTLR start "rule__Methode__Group__6__Impl"
    // InternalCls.g:1747:1: rule__Methode__Group__6__Impl : ( ( rule__Methode__Group_6__0 )* ) ;
    public final void rule__Methode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1751:1: ( ( ( rule__Methode__Group_6__0 )* ) )
            // InternalCls.g:1752:1: ( ( rule__Methode__Group_6__0 )* )
            {
            // InternalCls.g:1752:1: ( ( rule__Methode__Group_6__0 )* )
            // InternalCls.g:1753:2: ( rule__Methode__Group_6__0 )*
            {
             before(grammarAccess.getMethodeAccess().getGroup_6()); 
            // InternalCls.g:1754:2: ( rule__Methode__Group_6__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=16 && LA25_0<=19)||(LA25_0>=46 && LA25_0<=47)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCls.g:1754:3: rule__Methode__Group_6__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Methode__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMethodeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__6__Impl"


    // $ANTLR start "rule__Methode__Group__7"
    // InternalCls.g:1762:1: rule__Methode__Group__7 : rule__Methode__Group__7__Impl rule__Methode__Group__8 ;
    public final void rule__Methode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1766:1: ( rule__Methode__Group__7__Impl rule__Methode__Group__8 )
            // InternalCls.g:1767:2: rule__Methode__Group__7__Impl rule__Methode__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Methode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__7"


    // $ANTLR start "rule__Methode__Group__7__Impl"
    // InternalCls.g:1774:1: rule__Methode__Group__7__Impl : ( ')' ) ;
    public final void rule__Methode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1778:1: ( ( ')' ) )
            // InternalCls.g:1779:1: ( ')' )
            {
            // InternalCls.g:1779:1: ( ')' )
            // InternalCls.g:1780:2: ')'
            {
             before(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__7__Impl"


    // $ANTLR start "rule__Methode__Group__8"
    // InternalCls.g:1789:1: rule__Methode__Group__8 : rule__Methode__Group__8__Impl ;
    public final void rule__Methode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1793:1: ( rule__Methode__Group__8__Impl )
            // InternalCls.g:1794:2: rule__Methode__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Methode__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__8"


    // $ANTLR start "rule__Methode__Group__8__Impl"
    // InternalCls.g:1800:1: rule__Methode__Group__8__Impl : ( ( rule__Methode__Group_8__0 )? ) ;
    public final void rule__Methode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1804:1: ( ( ( rule__Methode__Group_8__0 )? ) )
            // InternalCls.g:1805:1: ( ( rule__Methode__Group_8__0 )? )
            {
            // InternalCls.g:1805:1: ( ( rule__Methode__Group_8__0 )? )
            // InternalCls.g:1806:2: ( rule__Methode__Group_8__0 )?
            {
             before(grammarAccess.getMethodeAccess().getGroup_8()); 
            // InternalCls.g:1807:2: ( rule__Methode__Group_8__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCls.g:1807:3: rule__Methode__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Methode__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__8__Impl"


    // $ANTLR start "rule__Methode__Group_6__0"
    // InternalCls.g:1816:1: rule__Methode__Group_6__0 : rule__Methode__Group_6__0__Impl rule__Methode__Group_6__1 ;
    public final void rule__Methode__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1820:1: ( rule__Methode__Group_6__0__Impl rule__Methode__Group_6__1 )
            // InternalCls.g:1821:2: rule__Methode__Group_6__0__Impl rule__Methode__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__Methode__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_6__0"


    // $ANTLR start "rule__Methode__Group_6__0__Impl"
    // InternalCls.g:1828:1: rule__Methode__Group_6__0__Impl : ( ( rule__Methode__AttributesAssignment_6_0 ) ) ;
    public final void rule__Methode__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1832:1: ( ( ( rule__Methode__AttributesAssignment_6_0 ) ) )
            // InternalCls.g:1833:1: ( ( rule__Methode__AttributesAssignment_6_0 ) )
            {
            // InternalCls.g:1833:1: ( ( rule__Methode__AttributesAssignment_6_0 ) )
            // InternalCls.g:1834:2: ( rule__Methode__AttributesAssignment_6_0 )
            {
             before(grammarAccess.getMethodeAccess().getAttributesAssignment_6_0()); 
            // InternalCls.g:1835:2: ( rule__Methode__AttributesAssignment_6_0 )
            // InternalCls.g:1835:3: rule__Methode__AttributesAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Methode__AttributesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getAttributesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_6__0__Impl"


    // $ANTLR start "rule__Methode__Group_6__1"
    // InternalCls.g:1843:1: rule__Methode__Group_6__1 : rule__Methode__Group_6__1__Impl ;
    public final void rule__Methode__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1847:1: ( rule__Methode__Group_6__1__Impl )
            // InternalCls.g:1848:2: rule__Methode__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Methode__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_6__1"


    // $ANTLR start "rule__Methode__Group_6__1__Impl"
    // InternalCls.g:1854:1: rule__Methode__Group_6__1__Impl : ( ( rule__Methode__Group_6_1__0 )* ) ;
    public final void rule__Methode__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1858:1: ( ( ( rule__Methode__Group_6_1__0 )* ) )
            // InternalCls.g:1859:1: ( ( rule__Methode__Group_6_1__0 )* )
            {
            // InternalCls.g:1859:1: ( ( rule__Methode__Group_6_1__0 )* )
            // InternalCls.g:1860:2: ( rule__Methode__Group_6_1__0 )*
            {
             before(grammarAccess.getMethodeAccess().getGroup_6_1()); 
            // InternalCls.g:1861:2: ( rule__Methode__Group_6_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCls.g:1861:3: rule__Methode__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Methode__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMethodeAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_6__1__Impl"


    // $ANTLR start "rule__Methode__Group_6_1__0"
    // InternalCls.g:1870:1: rule__Methode__Group_6_1__0 : rule__Methode__Group_6_1__0__Impl rule__Methode__Group_6_1__1 ;
    public final void rule__Methode__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1874:1: ( rule__Methode__Group_6_1__0__Impl rule__Methode__Group_6_1__1 )
            // InternalCls.g:1875:2: rule__Methode__Group_6_1__0__Impl rule__Methode__Group_6_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Methode__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_6_1__0"


    // $ANTLR start "rule__Methode__Group_6_1__0__Impl"
    // InternalCls.g:1882:1: rule__Methode__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Methode__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1886:1: ( ( ',' ) )
            // InternalCls.g:1887:1: ( ',' )
            {
            // InternalCls.g:1887:1: ( ',' )
            // InternalCls.g:1888:2: ','
            {
             before(grammarAccess.getMethodeAccess().getCommaKeyword_6_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_6_1__0__Impl"


    // $ANTLR start "rule__Methode__Group_6_1__1"
    // InternalCls.g:1897:1: rule__Methode__Group_6_1__1 : rule__Methode__Group_6_1__1__Impl ;
    public final void rule__Methode__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1901:1: ( rule__Methode__Group_6_1__1__Impl )
            // InternalCls.g:1902:2: rule__Methode__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Methode__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_6_1__1"


    // $ANTLR start "rule__Methode__Group_6_1__1__Impl"
    // InternalCls.g:1908:1: rule__Methode__Group_6_1__1__Impl : ( ( rule__Methode__AttributesAssignment_6_1_1 ) ) ;
    public final void rule__Methode__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1912:1: ( ( ( rule__Methode__AttributesAssignment_6_1_1 ) ) )
            // InternalCls.g:1913:1: ( ( rule__Methode__AttributesAssignment_6_1_1 ) )
            {
            // InternalCls.g:1913:1: ( ( rule__Methode__AttributesAssignment_6_1_1 ) )
            // InternalCls.g:1914:2: ( rule__Methode__AttributesAssignment_6_1_1 )
            {
             before(grammarAccess.getMethodeAccess().getAttributesAssignment_6_1_1()); 
            // InternalCls.g:1915:2: ( rule__Methode__AttributesAssignment_6_1_1 )
            // InternalCls.g:1915:3: rule__Methode__AttributesAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Methode__AttributesAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getAttributesAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_6_1__1__Impl"


    // $ANTLR start "rule__Methode__Group_8__0"
    // InternalCls.g:1924:1: rule__Methode__Group_8__0 : rule__Methode__Group_8__0__Impl rule__Methode__Group_8__1 ;
    public final void rule__Methode__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1928:1: ( rule__Methode__Group_8__0__Impl rule__Methode__Group_8__1 )
            // InternalCls.g:1929:2: rule__Methode__Group_8__0__Impl rule__Methode__Group_8__1
            {
            pushFollow(FOLLOW_17);
            rule__Methode__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_8__0"


    // $ANTLR start "rule__Methode__Group_8__0__Impl"
    // InternalCls.g:1936:1: rule__Methode__Group_8__0__Impl : ( ':' ) ;
    public final void rule__Methode__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1940:1: ( ( ':' ) )
            // InternalCls.g:1941:1: ( ':' )
            {
            // InternalCls.g:1941:1: ( ':' )
            // InternalCls.g:1942:2: ':'
            {
             before(grammarAccess.getMethodeAccess().getColonKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getColonKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_8__0__Impl"


    // $ANTLR start "rule__Methode__Group_8__1"
    // InternalCls.g:1951:1: rule__Methode__Group_8__1 : rule__Methode__Group_8__1__Impl ;
    public final void rule__Methode__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1955:1: ( rule__Methode__Group_8__1__Impl )
            // InternalCls.g:1956:2: rule__Methode__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Methode__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_8__1"


    // $ANTLR start "rule__Methode__Group_8__1__Impl"
    // InternalCls.g:1962:1: rule__Methode__Group_8__1__Impl : ( ( rule__Methode__TypeAssignment_8_1 ) ) ;
    public final void rule__Methode__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1966:1: ( ( ( rule__Methode__TypeAssignment_8_1 ) ) )
            // InternalCls.g:1967:1: ( ( rule__Methode__TypeAssignment_8_1 ) )
            {
            // InternalCls.g:1967:1: ( ( rule__Methode__TypeAssignment_8_1 ) )
            // InternalCls.g:1968:2: ( rule__Methode__TypeAssignment_8_1 )
            {
             before(grammarAccess.getMethodeAccess().getTypeAssignment_8_1()); 
            // InternalCls.g:1969:2: ( rule__Methode__TypeAssignment_8_1 )
            // InternalCls.g:1969:3: rule__Methode__TypeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Methode__TypeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getTypeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_8__1__Impl"


    // $ANTLR start "rule__Generalization__Group__0"
    // InternalCls.g:1978:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1982:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalCls.g:1983:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCls.g:1990:1: rule__Generalization__Group__0__Impl : ( ( rule__Generalization__LeftAssignment_0 ) ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:1994:1: ( ( ( rule__Generalization__LeftAssignment_0 ) ) )
            // InternalCls.g:1995:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            {
            // InternalCls.g:1995:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            // InternalCls.g:1996:2: ( rule__Generalization__LeftAssignment_0 )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssignment_0()); 
            // InternalCls.g:1997:2: ( rule__Generalization__LeftAssignment_0 )
            // InternalCls.g:1997:3: rule__Generalization__LeftAssignment_0
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
    // InternalCls.g:2005:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2009:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalCls.g:2010:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
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
    // InternalCls.g:2017:1: rule__Generalization__Group__1__Impl : ( 'isa' ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2021:1: ( ( 'isa' ) )
            // InternalCls.g:2022:1: ( 'isa' )
            {
            // InternalCls.g:2022:1: ( 'isa' )
            // InternalCls.g:2023:2: 'isa'
            {
             before(grammarAccess.getGeneralizationAccess().getIsaKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCls.g:2032:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2036:1: ( rule__Generalization__Group__2__Impl )
            // InternalCls.g:2037:2: rule__Generalization__Group__2__Impl
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
    // InternalCls.g:2043:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__RightAssignment_2 ) ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2047:1: ( ( ( rule__Generalization__RightAssignment_2 ) ) )
            // InternalCls.g:2048:1: ( ( rule__Generalization__RightAssignment_2 ) )
            {
            // InternalCls.g:2048:1: ( ( rule__Generalization__RightAssignment_2 ) )
            // InternalCls.g:2049:2: ( rule__Generalization__RightAssignment_2 )
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssignment_2()); 
            // InternalCls.g:2050:2: ( rule__Generalization__RightAssignment_2 )
            // InternalCls.g:2050:3: rule__Generalization__RightAssignment_2
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
    // InternalCls.g:2059:1: rule__Implementation__Group__0 : rule__Implementation__Group__0__Impl rule__Implementation__Group__1 ;
    public final void rule__Implementation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2063:1: ( rule__Implementation__Group__0__Impl rule__Implementation__Group__1 )
            // InternalCls.g:2064:2: rule__Implementation__Group__0__Impl rule__Implementation__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCls.g:2071:1: rule__Implementation__Group__0__Impl : ( ( rule__Implementation__LeftAssignment_0 ) ) ;
    public final void rule__Implementation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2075:1: ( ( ( rule__Implementation__LeftAssignment_0 ) ) )
            // InternalCls.g:2076:1: ( ( rule__Implementation__LeftAssignment_0 ) )
            {
            // InternalCls.g:2076:1: ( ( rule__Implementation__LeftAssignment_0 ) )
            // InternalCls.g:2077:2: ( rule__Implementation__LeftAssignment_0 )
            {
             before(grammarAccess.getImplementationAccess().getLeftAssignment_0()); 
            // InternalCls.g:2078:2: ( rule__Implementation__LeftAssignment_0 )
            // InternalCls.g:2078:3: rule__Implementation__LeftAssignment_0
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
    // InternalCls.g:2086:1: rule__Implementation__Group__1 : rule__Implementation__Group__1__Impl rule__Implementation__Group__2 ;
    public final void rule__Implementation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2090:1: ( rule__Implementation__Group__1__Impl rule__Implementation__Group__2 )
            // InternalCls.g:2091:2: rule__Implementation__Group__1__Impl rule__Implementation__Group__2
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
    // InternalCls.g:2098:1: rule__Implementation__Group__1__Impl : ( 'impl' ) ;
    public final void rule__Implementation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2102:1: ( ( 'impl' ) )
            // InternalCls.g:2103:1: ( 'impl' )
            {
            // InternalCls.g:2103:1: ( 'impl' )
            // InternalCls.g:2104:2: 'impl'
            {
             before(grammarAccess.getImplementationAccess().getImplKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCls.g:2113:1: rule__Implementation__Group__2 : rule__Implementation__Group__2__Impl ;
    public final void rule__Implementation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2117:1: ( rule__Implementation__Group__2__Impl )
            // InternalCls.g:2118:2: rule__Implementation__Group__2__Impl
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
    // InternalCls.g:2124:1: rule__Implementation__Group__2__Impl : ( ( rule__Implementation__RightAssignment_2 ) ) ;
    public final void rule__Implementation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2128:1: ( ( ( rule__Implementation__RightAssignment_2 ) ) )
            // InternalCls.g:2129:1: ( ( rule__Implementation__RightAssignment_2 ) )
            {
            // InternalCls.g:2129:1: ( ( rule__Implementation__RightAssignment_2 ) )
            // InternalCls.g:2130:2: ( rule__Implementation__RightAssignment_2 )
            {
             before(grammarAccess.getImplementationAccess().getRightAssignment_2()); 
            // InternalCls.g:2131:2: ( rule__Implementation__RightAssignment_2 )
            // InternalCls.g:2131:3: rule__Implementation__RightAssignment_2
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


    // $ANTLR start "rule__Association__Group__0"
    // InternalCls.g:2140:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2144:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalCls.g:2145:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCls.g:2152:1: rule__Association__Group__0__Impl : ( ( rule__Association__LeftAssignment_0 ) ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2156:1: ( ( ( rule__Association__LeftAssignment_0 ) ) )
            // InternalCls.g:2157:1: ( ( rule__Association__LeftAssignment_0 ) )
            {
            // InternalCls.g:2157:1: ( ( rule__Association__LeftAssignment_0 ) )
            // InternalCls.g:2158:2: ( rule__Association__LeftAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getLeftAssignment_0()); 
            // InternalCls.g:2159:2: ( rule__Association__LeftAssignment_0 )
            // InternalCls.g:2159:3: rule__Association__LeftAssignment_0
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
    // InternalCls.g:2167:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2171:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalCls.g:2172:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalCls.g:2179:1: rule__Association__Group__1__Impl : ( '-' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2183:1: ( ( '-' ) )
            // InternalCls.g:2184:1: ( '-' )
            {
            // InternalCls.g:2184:1: ( '-' )
            // InternalCls.g:2185:2: '-'
            {
             before(grammarAccess.getAssociationAccess().getHyphenMinusKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalCls.g:2194:1: rule__Association__Group__2 : rule__Association__Group__2__Impl ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2198:1: ( rule__Association__Group__2__Impl )
            // InternalCls.g:2199:2: rule__Association__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCls.g:2205:1: rule__Association__Group__2__Impl : ( ( rule__Association__Alternatives_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2209:1: ( ( ( rule__Association__Alternatives_2 ) ) )
            // InternalCls.g:2210:1: ( ( rule__Association__Alternatives_2 ) )
            {
            // InternalCls.g:2210:1: ( ( rule__Association__Alternatives_2 ) )
            // InternalCls.g:2211:2: ( rule__Association__Alternatives_2 )
            {
             before(grammarAccess.getAssociationAccess().getAlternatives_2()); 
            // InternalCls.g:2212:2: ( rule__Association__Alternatives_2 )
            // InternalCls.g:2212:3: rule__Association__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Association__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAlternatives_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Association__Group_2_0__0"
    // InternalCls.g:2221:1: rule__Association__Group_2_0__0 : rule__Association__Group_2_0__0__Impl rule__Association__Group_2_0__1 ;
    public final void rule__Association__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2225:1: ( rule__Association__Group_2_0__0__Impl rule__Association__Group_2_0__1 )
            // InternalCls.g:2226:2: rule__Association__Group_2_0__0__Impl rule__Association__Group_2_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Association__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_2_0__0"


    // $ANTLR start "rule__Association__Group_2_0__0__Impl"
    // InternalCls.g:2233:1: rule__Association__Group_2_0__0__Impl : ( ( rule__Association__RightAssignment_2_0_0 ) ) ;
    public final void rule__Association__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2237:1: ( ( ( rule__Association__RightAssignment_2_0_0 ) ) )
            // InternalCls.g:2238:1: ( ( rule__Association__RightAssignment_2_0_0 ) )
            {
            // InternalCls.g:2238:1: ( ( rule__Association__RightAssignment_2_0_0 ) )
            // InternalCls.g:2239:2: ( rule__Association__RightAssignment_2_0_0 )
            {
             before(grammarAccess.getAssociationAccess().getRightAssignment_2_0_0()); 
            // InternalCls.g:2240:2: ( rule__Association__RightAssignment_2_0_0 )
            // InternalCls.g:2240:3: rule__Association__RightAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Association__RightAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getRightAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_2_0__0__Impl"


    // $ANTLR start "rule__Association__Group_2_0__1"
    // InternalCls.g:2248:1: rule__Association__Group_2_0__1 : rule__Association__Group_2_0__1__Impl rule__Association__Group_2_0__2 ;
    public final void rule__Association__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2252:1: ( rule__Association__Group_2_0__1__Impl rule__Association__Group_2_0__2 )
            // InternalCls.g:2253:2: rule__Association__Group_2_0__1__Impl rule__Association__Group_2_0__2
            {
            pushFollow(FOLLOW_27);
            rule__Association__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_2_0__1"


    // $ANTLR start "rule__Association__Group_2_0__1__Impl"
    // InternalCls.g:2260:1: rule__Association__Group_2_0__1__Impl : ( ( rule__Association__CardinalityAssignment_2_0_1 )? ) ;
    public final void rule__Association__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2264:1: ( ( ( rule__Association__CardinalityAssignment_2_0_1 )? ) )
            // InternalCls.g:2265:1: ( ( rule__Association__CardinalityAssignment_2_0_1 )? )
            {
            // InternalCls.g:2265:1: ( ( rule__Association__CardinalityAssignment_2_0_1 )? )
            // InternalCls.g:2266:2: ( rule__Association__CardinalityAssignment_2_0_1 )?
            {
             before(grammarAccess.getAssociationAccess().getCardinalityAssignment_2_0_1()); 
            // InternalCls.g:2267:2: ( rule__Association__CardinalityAssignment_2_0_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCls.g:2267:3: rule__Association__CardinalityAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__CardinalityAssignment_2_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getCardinalityAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_2_0__1__Impl"


    // $ANTLR start "rule__Association__Group_2_0__2"
    // InternalCls.g:2275:1: rule__Association__Group_2_0__2 : rule__Association__Group_2_0__2__Impl ;
    public final void rule__Association__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2279:1: ( rule__Association__Group_2_0__2__Impl )
            // InternalCls.g:2280:2: rule__Association__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_2_0__2"


    // $ANTLR start "rule__Association__Group_2_0__2__Impl"
    // InternalCls.g:2286:1: rule__Association__Group_2_0__2__Impl : ( ( rule__Association__NoteAssignment_2_0_2 )? ) ;
    public final void rule__Association__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2290:1: ( ( ( rule__Association__NoteAssignment_2_0_2 )? ) )
            // InternalCls.g:2291:1: ( ( rule__Association__NoteAssignment_2_0_2 )? )
            {
            // InternalCls.g:2291:1: ( ( rule__Association__NoteAssignment_2_0_2 )? )
            // InternalCls.g:2292:2: ( rule__Association__NoteAssignment_2_0_2 )?
            {
             before(grammarAccess.getAssociationAccess().getNoteAssignment_2_0_2()); 
            // InternalCls.g:2293:2: ( rule__Association__NoteAssignment_2_0_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCls.g:2293:3: rule__Association__NoteAssignment_2_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__NoteAssignment_2_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getNoteAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_2_0__2__Impl"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__0"
    // InternalCls.g:2302:1: rule__ConnectorCardinalitiy__Group__0 : rule__ConnectorCardinalitiy__Group__0__Impl rule__ConnectorCardinalitiy__Group__1 ;
    public final void rule__ConnectorCardinalitiy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2306:1: ( rule__ConnectorCardinalitiy__Group__0__Impl rule__ConnectorCardinalitiy__Group__1 )
            // InternalCls.g:2307:2: rule__ConnectorCardinalitiy__Group__0__Impl rule__ConnectorCardinalitiy__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ConnectorCardinalitiy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__0"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__0__Impl"
    // InternalCls.g:2314:1: rule__ConnectorCardinalitiy__Group__0__Impl : ( () ) ;
    public final void rule__ConnectorCardinalitiy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2318:1: ( ( () ) )
            // InternalCls.g:2319:1: ( () )
            {
            // InternalCls.g:2319:1: ( () )
            // InternalCls.g:2320:2: ()
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getConnectorCardinalitiyAction_0()); 
            // InternalCls.g:2321:2: ()
            // InternalCls.g:2321:3: 
            {
            }

             after(grammarAccess.getConnectorCardinalitiyAccess().getConnectorCardinalitiyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__0__Impl"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__1"
    // InternalCls.g:2329:1: rule__ConnectorCardinalitiy__Group__1 : rule__ConnectorCardinalitiy__Group__1__Impl rule__ConnectorCardinalitiy__Group__2 ;
    public final void rule__ConnectorCardinalitiy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2333:1: ( rule__ConnectorCardinalitiy__Group__1__Impl rule__ConnectorCardinalitiy__Group__2 )
            // InternalCls.g:2334:2: rule__ConnectorCardinalitiy__Group__1__Impl rule__ConnectorCardinalitiy__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ConnectorCardinalitiy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__1"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__1__Impl"
    // InternalCls.g:2341:1: rule__ConnectorCardinalitiy__Group__1__Impl : ( '[' ) ;
    public final void rule__ConnectorCardinalitiy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2345:1: ( ( '[' ) )
            // InternalCls.g:2346:1: ( '[' )
            {
            // InternalCls.g:2346:1: ( '[' )
            // InternalCls.g:2347:2: '['
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getLeftSquareBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConnectorCardinalitiyAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__1__Impl"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__2"
    // InternalCls.g:2356:1: rule__ConnectorCardinalitiy__Group__2 : rule__ConnectorCardinalitiy__Group__2__Impl rule__ConnectorCardinalitiy__Group__3 ;
    public final void rule__ConnectorCardinalitiy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2360:1: ( rule__ConnectorCardinalitiy__Group__2__Impl rule__ConnectorCardinalitiy__Group__3 )
            // InternalCls.g:2361:2: rule__ConnectorCardinalitiy__Group__2__Impl rule__ConnectorCardinalitiy__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ConnectorCardinalitiy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__2"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__2__Impl"
    // InternalCls.g:2368:1: rule__ConnectorCardinalitiy__Group__2__Impl : ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2372:1: ( ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? ) )
            // InternalCls.g:2373:1: ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? )
            {
            // InternalCls.g:2373:1: ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? )
            // InternalCls.g:2374:2: ( rule__ConnectorCardinalitiy__LeftAssignment_2 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getLeftAssignment_2()); 
            // InternalCls.g:2375:2: ( rule__ConnectorCardinalitiy__LeftAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==15) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCls.g:2375:3: rule__ConnectorCardinalitiy__LeftAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorCardinalitiy__LeftAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorCardinalitiyAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__2__Impl"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__3"
    // InternalCls.g:2383:1: rule__ConnectorCardinalitiy__Group__3 : rule__ConnectorCardinalitiy__Group__3__Impl rule__ConnectorCardinalitiy__Group__4 ;
    public final void rule__ConnectorCardinalitiy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2387:1: ( rule__ConnectorCardinalitiy__Group__3__Impl rule__ConnectorCardinalitiy__Group__4 )
            // InternalCls.g:2388:2: rule__ConnectorCardinalitiy__Group__3__Impl rule__ConnectorCardinalitiy__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__ConnectorCardinalitiy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__3"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__3__Impl"
    // InternalCls.g:2395:1: rule__ConnectorCardinalitiy__Group__3__Impl : ( ( rule__ConnectorCardinalitiy__Group_3__0 ) ) ;
    public final void rule__ConnectorCardinalitiy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2399:1: ( ( ( rule__ConnectorCardinalitiy__Group_3__0 ) ) )
            // InternalCls.g:2400:1: ( ( rule__ConnectorCardinalitiy__Group_3__0 ) )
            {
            // InternalCls.g:2400:1: ( ( rule__ConnectorCardinalitiy__Group_3__0 ) )
            // InternalCls.g:2401:2: ( rule__ConnectorCardinalitiy__Group_3__0 )
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getGroup_3()); 
            // InternalCls.g:2402:2: ( rule__ConnectorCardinalitiy__Group_3__0 )
            // InternalCls.g:2402:3: rule__ConnectorCardinalitiy__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorCardinalitiyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__3__Impl"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__4"
    // InternalCls.g:2410:1: rule__ConnectorCardinalitiy__Group__4 : rule__ConnectorCardinalitiy__Group__4__Impl rule__ConnectorCardinalitiy__Group__5 ;
    public final void rule__ConnectorCardinalitiy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2414:1: ( rule__ConnectorCardinalitiy__Group__4__Impl rule__ConnectorCardinalitiy__Group__5 )
            // InternalCls.g:2415:2: rule__ConnectorCardinalitiy__Group__4__Impl rule__ConnectorCardinalitiy__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__ConnectorCardinalitiy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__4"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__4__Impl"
    // InternalCls.g:2422:1: rule__ConnectorCardinalitiy__Group__4__Impl : ( ( rule__ConnectorCardinalitiy__Group_4__0 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2426:1: ( ( ( rule__ConnectorCardinalitiy__Group_4__0 )? ) )
            // InternalCls.g:2427:1: ( ( rule__ConnectorCardinalitiy__Group_4__0 )? )
            {
            // InternalCls.g:2427:1: ( ( rule__ConnectorCardinalitiy__Group_4__0 )? )
            // InternalCls.g:2428:2: ( rule__ConnectorCardinalitiy__Group_4__0 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getGroup_4()); 
            // InternalCls.g:2429:2: ( rule__ConnectorCardinalitiy__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCls.g:2429:3: rule__ConnectorCardinalitiy__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorCardinalitiy__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorCardinalitiyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__4__Impl"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__5"
    // InternalCls.g:2437:1: rule__ConnectorCardinalitiy__Group__5 : rule__ConnectorCardinalitiy__Group__5__Impl ;
    public final void rule__ConnectorCardinalitiy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2441:1: ( rule__ConnectorCardinalitiy__Group__5__Impl )
            // InternalCls.g:2442:2: rule__ConnectorCardinalitiy__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__5"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__5__Impl"
    // InternalCls.g:2448:1: rule__ConnectorCardinalitiy__Group__5__Impl : ( ']' ) ;
    public final void rule__ConnectorCardinalitiy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2452:1: ( ( ']' ) )
            // InternalCls.g:2453:1: ( ']' )
            {
            // InternalCls.g:2453:1: ( ']' )
            // InternalCls.g:2454:2: ']'
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getRightSquareBracketKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConnectorCardinalitiyAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group__5__Impl"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group_3__0"
    // InternalCls.g:2464:1: rule__ConnectorCardinalitiy__Group_3__0 : rule__ConnectorCardinalitiy__Group_3__0__Impl rule__ConnectorCardinalitiy__Group_3__1 ;
    public final void rule__ConnectorCardinalitiy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2468:1: ( rule__ConnectorCardinalitiy__Group_3__0__Impl rule__ConnectorCardinalitiy__Group_3__1 )
            // InternalCls.g:2469:2: rule__ConnectorCardinalitiy__Group_3__0__Impl rule__ConnectorCardinalitiy__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__ConnectorCardinalitiy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group_3__0"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group_3__0__Impl"
    // InternalCls.g:2476:1: rule__ConnectorCardinalitiy__Group_3__0__Impl : ( '|' ) ;
    public final void rule__ConnectorCardinalitiy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2480:1: ( ( '|' ) )
            // InternalCls.g:2481:1: ( '|' )
            {
            // InternalCls.g:2481:1: ( '|' )
            // InternalCls.g:2482:2: '|'
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group_3__0__Impl"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group_3__1"
    // InternalCls.g:2491:1: rule__ConnectorCardinalitiy__Group_3__1 : rule__ConnectorCardinalitiy__Group_3__1__Impl ;
    public final void rule__ConnectorCardinalitiy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2495:1: ( rule__ConnectorCardinalitiy__Group_3__1__Impl )
            // InternalCls.g:2496:2: rule__ConnectorCardinalitiy__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group_3__1"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group_3__1__Impl"
    // InternalCls.g:2502:1: rule__ConnectorCardinalitiy__Group_3__1__Impl : ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2506:1: ( ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? ) )
            // InternalCls.g:2507:1: ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? )
            {
            // InternalCls.g:2507:1: ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? )
            // InternalCls.g:2508:2: ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getMiddleAssignment_3_1()); 
            // InternalCls.g:2509:2: ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT||LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCls.g:2509:3: rule__ConnectorCardinalitiy__MiddleAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorCardinalitiy__MiddleAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorCardinalitiyAccess().getMiddleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group_3__1__Impl"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group_4__0"
    // InternalCls.g:2518:1: rule__ConnectorCardinalitiy__Group_4__0 : rule__ConnectorCardinalitiy__Group_4__0__Impl rule__ConnectorCardinalitiy__Group_4__1 ;
    public final void rule__ConnectorCardinalitiy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2522:1: ( rule__ConnectorCardinalitiy__Group_4__0__Impl rule__ConnectorCardinalitiy__Group_4__1 )
            // InternalCls.g:2523:2: rule__ConnectorCardinalitiy__Group_4__0__Impl rule__ConnectorCardinalitiy__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__ConnectorCardinalitiy__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group_4__0"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group_4__0__Impl"
    // InternalCls.g:2530:1: rule__ConnectorCardinalitiy__Group_4__0__Impl : ( '|' ) ;
    public final void rule__ConnectorCardinalitiy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2534:1: ( ( '|' ) )
            // InternalCls.g:2535:1: ( '|' )
            {
            // InternalCls.g:2535:1: ( '|' )
            // InternalCls.g:2536:2: '|'
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group_4__0__Impl"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group_4__1"
    // InternalCls.g:2545:1: rule__ConnectorCardinalitiy__Group_4__1 : rule__ConnectorCardinalitiy__Group_4__1__Impl rule__ConnectorCardinalitiy__Group_4__2 ;
    public final void rule__ConnectorCardinalitiy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2549:1: ( rule__ConnectorCardinalitiy__Group_4__1__Impl rule__ConnectorCardinalitiy__Group_4__2 )
            // InternalCls.g:2550:2: rule__ConnectorCardinalitiy__Group_4__1__Impl rule__ConnectorCardinalitiy__Group_4__2
            {
            pushFollow(FOLLOW_32);
            rule__ConnectorCardinalitiy__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group_4__1"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group_4__1__Impl"
    // InternalCls.g:2557:1: rule__ConnectorCardinalitiy__Group_4__1__Impl : ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2561:1: ( ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? ) )
            // InternalCls.g:2562:1: ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? )
            {
            // InternalCls.g:2562:1: ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? )
            // InternalCls.g:2563:2: ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getRightAssignment_4_1()); 
            // InternalCls.g:2564:2: ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCls.g:2564:3: rule__ConnectorCardinalitiy__RightAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorCardinalitiy__RightAssignment_4_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorCardinalitiyAccess().getRightAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group_4__1__Impl"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group_4__2"
    // InternalCls.g:2572:1: rule__ConnectorCardinalitiy__Group_4__2 : rule__ConnectorCardinalitiy__Group_4__2__Impl ;
    public final void rule__ConnectorCardinalitiy__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2576:1: ( rule__ConnectorCardinalitiy__Group_4__2__Impl )
            // InternalCls.g:2577:2: rule__ConnectorCardinalitiy__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorCardinalitiy__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group_4__2"


    // $ANTLR start "rule__ConnectorCardinalitiy__Group_4__2__Impl"
    // InternalCls.g:2583:1: rule__ConnectorCardinalitiy__Group_4__2__Impl : ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2587:1: ( ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? ) )
            // InternalCls.g:2588:1: ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? )
            {
            // InternalCls.g:2588:1: ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? )
            // InternalCls.g:2589:2: ( rule__ConnectorCardinalitiy__Alternatives_4_2 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getAlternatives_4_2()); 
            // InternalCls.g:2590:2: ( rule__ConnectorCardinalitiy__Alternatives_4_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=13 && LA34_0<=14)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCls.g:2590:3: rule__ConnectorCardinalitiy__Alternatives_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorCardinalitiy__Alternatives_4_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorCardinalitiyAccess().getAlternatives_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__Group_4__2__Impl"


    // $ANTLR start "rule__Cardinality__Group_1__0"
    // InternalCls.g:2599:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2603:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // InternalCls.g:2604:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
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
    // InternalCls.g:2611:1: rule__Cardinality__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2615:1: ( ( RULE_INT ) )
            // InternalCls.g:2616:1: ( RULE_INT )
            {
            // InternalCls.g:2616:1: ( RULE_INT )
            // InternalCls.g:2617:2: RULE_INT
            {
             before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCls.g:2626:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl rule__Cardinality__Group_1__2 ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2630:1: ( rule__Cardinality__Group_1__1__Impl rule__Cardinality__Group_1__2 )
            // InternalCls.g:2631:2: rule__Cardinality__Group_1__1__Impl rule__Cardinality__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Cardinality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalCls.g:2638:1: rule__Cardinality__Group_1__1__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2642:1: ( ( '..' ) )
            // InternalCls.g:2643:1: ( '..' )
            {
            // InternalCls.g:2643:1: ( '..' )
            // InternalCls.g:2644:2: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Cardinality__Group_1__2"
    // InternalCls.g:2653:1: rule__Cardinality__Group_1__2 : rule__Cardinality__Group_1__2__Impl ;
    public final void rule__Cardinality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2657:1: ( rule__Cardinality__Group_1__2__Impl )
            // InternalCls.g:2658:2: rule__Cardinality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1__2"


    // $ANTLR start "rule__Cardinality__Group_1__2__Impl"
    // InternalCls.g:2664:1: rule__Cardinality__Group_1__2__Impl : ( ( rule__Cardinality__Alternatives_1_2 ) ) ;
    public final void rule__Cardinality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2668:1: ( ( ( rule__Cardinality__Alternatives_1_2 ) ) )
            // InternalCls.g:2669:1: ( ( rule__Cardinality__Alternatives_1_2 ) )
            {
            // InternalCls.g:2669:1: ( ( rule__Cardinality__Alternatives_1_2 ) )
            // InternalCls.g:2670:2: ( rule__Cardinality__Alternatives_1_2 )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives_1_2()); 
            // InternalCls.g:2671:2: ( rule__Cardinality__Alternatives_1_2 )
            // InternalCls.g:2671:3: rule__Cardinality__Alternatives_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Alternatives_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1__2__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // InternalCls.g:2680:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2684:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalCls.g:2685:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0"


    // $ANTLR start "rule__Note__Group__0__Impl"
    // InternalCls.g:2692:1: rule__Note__Group__0__Impl : ( 'note[' ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2696:1: ( ( 'note[' ) )
            // InternalCls.g:2697:1: ( 'note[' )
            {
            // InternalCls.g:2697:1: ( 'note[' )
            // InternalCls.g:2698:2: 'note['
            {
             before(grammarAccess.getNoteAccess().getNoteKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getNoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0__Impl"


    // $ANTLR start "rule__Note__Group__1"
    // InternalCls.g:2707:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2711:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // InternalCls.g:2712:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1"


    // $ANTLR start "rule__Note__Group__1__Impl"
    // InternalCls.g:2719:1: rule__Note__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2723:1: ( ( RULE_STRING ) )
            // InternalCls.g:2724:1: ( RULE_STRING )
            {
            // InternalCls.g:2724:1: ( RULE_STRING )
            // InternalCls.g:2725:2: RULE_STRING
            {
             before(grammarAccess.getNoteAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1__Impl"


    // $ANTLR start "rule__Note__Group__2"
    // InternalCls.g:2734:1: rule__Note__Group__2 : rule__Note__Group__2__Impl ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2738:1: ( rule__Note__Group__2__Impl )
            // InternalCls.g:2739:2: rule__Note__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__2"


    // $ANTLR start "rule__Note__Group__2__Impl"
    // InternalCls.g:2745:1: rule__Note__Group__2__Impl : ( ']' ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2749:1: ( ( ']' ) )
            // InternalCls.g:2750:1: ( ']' )
            {
            // InternalCls.g:2750:1: ( ']' )
            // InternalCls.g:2751:2: ']'
            {
             before(grammarAccess.getNoteAccess().getRightSquareBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__2__Impl"


    // $ANTLR start "rule__ClassDiagram__ElementsAssignment_2"
    // InternalCls.g:2761:1: rule__ClassDiagram__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__ClassDiagram__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2765:1: ( ( ruleElement ) )
            // InternalCls.g:2766:2: ( ruleElement )
            {
            // InternalCls.g:2766:2: ( ruleElement )
            // InternalCls.g:2767:3: ruleElement
            {
             before(grammarAccess.getClassDiagramAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getElementsElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__ElementsAssignment_2"


    // $ANTLR start "rule__Type__TypeAssignment_0"
    // InternalCls.g:2776:1: rule__Type__TypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__Type__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2780:1: ( ( ruleDataType ) )
            // InternalCls.g:2781:2: ( ruleDataType )
            {
            // InternalCls.g:2781:2: ( ruleDataType )
            // InternalCls.g:2782:3: ruleDataType
            {
             before(grammarAccess.getTypeAccess().getTypeDataTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeDataTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_0"


    // $ANTLR start "rule__ClassDef__ClassesAssignment_2"
    // InternalCls.g:2791:1: rule__ClassDef__ClassesAssignment_2 : ( ruleClassName ) ;
    public final void rule__ClassDef__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2795:1: ( ( ruleClassName ) )
            // InternalCls.g:2796:2: ( ruleClassName )
            {
            // InternalCls.g:2796:2: ( ruleClassName )
            // InternalCls.g:2797:3: ruleClassName
            {
             before(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__ClassesAssignment_2"


    // $ANTLR start "rule__ClassDef__ClassesAssignment_3_1"
    // InternalCls.g:2806:1: rule__ClassDef__ClassesAssignment_3_1 : ( ruleClassName ) ;
    public final void rule__ClassDef__ClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2810:1: ( ( ruleClassName ) )
            // InternalCls.g:2811:2: ( ruleClassName )
            {
            // InternalCls.g:2811:2: ( ruleClassName )
            // InternalCls.g:2812:3: ruleClassName
            {
             before(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__ClassesAssignment_3_1"


    // $ANTLR start "rule__Name__NameAssignment_0"
    // InternalCls.g:2821:1: rule__Name__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2825:1: ( ( RULE_ID ) )
            // InternalCls.g:2826:2: ( RULE_ID )
            {
            // InternalCls.g:2826:2: ( RULE_ID )
            // InternalCls.g:2827:3: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__NameAssignment_0"


    // $ANTLR start "rule__Name__LongnameAssignment_1_0"
    // InternalCls.g:2836:1: rule__Name__LongnameAssignment_1_0 : ( ( rule__Name__LongnameAlternatives_1_0_0 ) ) ;
    public final void rule__Name__LongnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2840:1: ( ( ( rule__Name__LongnameAlternatives_1_0_0 ) ) )
            // InternalCls.g:2841:2: ( ( rule__Name__LongnameAlternatives_1_0_0 ) )
            {
            // InternalCls.g:2841:2: ( ( rule__Name__LongnameAlternatives_1_0_0 ) )
            // InternalCls.g:2842:3: ( rule__Name__LongnameAlternatives_1_0_0 )
            {
             before(grammarAccess.getNameAccess().getLongnameAlternatives_1_0_0()); 
            // InternalCls.g:2843:3: ( rule__Name__LongnameAlternatives_1_0_0 )
            // InternalCls.g:2843:4: rule__Name__LongnameAlternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Name__LongnameAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getLongnameAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__LongnameAssignment_1_0"


    // $ANTLR start "rule__Name__NameAssignment_1_2"
    // InternalCls.g:2851:1: rule__Name__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2855:1: ( ( RULE_ID ) )
            // InternalCls.g:2856:2: ( RULE_ID )
            {
            // InternalCls.g:2856:2: ( RULE_ID )
            // InternalCls.g:2857:3: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__NameAssignment_1_2"


    // $ANTLR start "rule__Class__AbstractAssignment_0"
    // InternalCls.g:2866:1: rule__Class__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2870:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:2871:2: ( ( 'abstract' ) )
            {
            // InternalCls.g:2871:2: ( ( 'abstract' ) )
            // InternalCls.g:2872:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalCls.g:2873:3: ( 'abstract' )
            // InternalCls.g:2874:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AbstractAssignment_0"


    // $ANTLR start "rule__Class__TypeAssignment_1"
    // InternalCls.g:2885:1: rule__Class__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2889:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:2890:2: ( ( RULE_ID ) )
            {
            // InternalCls.g:2890:2: ( ( RULE_ID ) )
            // InternalCls.g:2891:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getTypeClassNameCrossReference_1_0()); 
            // InternalCls.g:2892:3: ( RULE_ID )
            // InternalCls.g:2893:4: RULE_ID
            {
             before(grammarAccess.getClassAccess().getTypeClassNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getTypeClassNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getTypeClassNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__TypeAssignment_1"


    // $ANTLR start "rule__Class__MembersAssignment_3"
    // InternalCls.g:2904:1: rule__Class__MembersAssignment_3 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2908:1: ( ( ruleMember ) )
            // InternalCls.g:2909:2: ( ruleMember )
            {
            // InternalCls.g:2909:2: ( ruleMember )
            // InternalCls.g:2910:3: ruleMember
            {
             before(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MembersAssignment_3"


    // $ANTLR start "rule__Attribute__VisibilityAssignment_0"
    // InternalCls.g:2919:1: rule__Attribute__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2923:1: ( ( ruleVisibility ) )
            // InternalCls.g:2924:2: ( ruleVisibility )
            {
            // InternalCls.g:2924:2: ( ruleVisibility )
            // InternalCls.g:2925:3: ruleVisibility
            {
             before(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__VisibilityAssignment_0"


    // $ANTLR start "rule__Attribute__StaticAssignment_1"
    // InternalCls.g:2934:1: rule__Attribute__StaticAssignment_1 : ( ( 'static' ) ) ;
    public final void rule__Attribute__StaticAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2938:1: ( ( ( 'static' ) ) )
            // InternalCls.g:2939:2: ( ( 'static' ) )
            {
            // InternalCls.g:2939:2: ( ( 'static' ) )
            // InternalCls.g:2940:3: ( 'static' )
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_1_0()); 
            // InternalCls.g:2941:3: ( 'static' )
            // InternalCls.g:2942:4: 'static'
            {
             before(grammarAccess.getAttributeAccess().getStaticStaticKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getStaticStaticKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getStaticStaticKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__StaticAssignment_1"


    // $ANTLR start "rule__Attribute__FinalAssignment_2"
    // InternalCls.g:2953:1: rule__Attribute__FinalAssignment_2 : ( ( 'final' ) ) ;
    public final void rule__Attribute__FinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2957:1: ( ( ( 'final' ) ) )
            // InternalCls.g:2958:2: ( ( 'final' ) )
            {
            // InternalCls.g:2958:2: ( ( 'final' ) )
            // InternalCls.g:2959:3: ( 'final' )
            {
             before(grammarAccess.getAttributeAccess().getFinalFinalKeyword_2_0()); 
            // InternalCls.g:2960:3: ( 'final' )
            // InternalCls.g:2961:4: 'final'
            {
             before(grammarAccess.getAttributeAccess().getFinalFinalKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFinalFinalKeyword_2_0()); 

            }

             after(grammarAccess.getAttributeAccess().getFinalFinalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__FinalAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_3"
    // InternalCls.g:2972:1: rule__Attribute__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2976:1: ( ( RULE_ID ) )
            // InternalCls.g:2977:2: ( RULE_ID )
            {
            // InternalCls.g:2977:2: ( RULE_ID )
            // InternalCls.g:2978:3: RULE_ID
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
    // InternalCls.g:2987:1: rule__Attribute__TypeAssignment_5 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:2991:1: ( ( ruleType ) )
            // InternalCls.g:2992:2: ( ruleType )
            {
            // InternalCls.g:2992:2: ( ruleType )
            // InternalCls.g:2993:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Methode__VisibilityAssignment_0"
    // InternalCls.g:3002:1: rule__Methode__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Methode__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3006:1: ( ( ruleVisibility ) )
            // InternalCls.g:3007:2: ( ruleVisibility )
            {
            // InternalCls.g:3007:2: ( ruleVisibility )
            // InternalCls.g:3008:3: ruleVisibility
            {
             before(grammarAccess.getMethodeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__VisibilityAssignment_0"


    // $ANTLR start "rule__Methode__AbstractAssignment_1"
    // InternalCls.g:3017:1: rule__Methode__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Methode__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3021:1: ( ( ( 'abstract' ) ) )
            // InternalCls.g:3022:2: ( ( 'abstract' ) )
            {
            // InternalCls.g:3022:2: ( ( 'abstract' ) )
            // InternalCls.g:3023:3: ( 'abstract' )
            {
             before(grammarAccess.getMethodeAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalCls.g:3024:3: ( 'abstract' )
            // InternalCls.g:3025:4: 'abstract'
            {
             before(grammarAccess.getMethodeAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getAbstractAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getMethodeAccess().getAbstractAbstractKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__AbstractAssignment_1"


    // $ANTLR start "rule__Methode__StaticAssignment_2"
    // InternalCls.g:3036:1: rule__Methode__StaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Methode__StaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3040:1: ( ( ( 'static' ) ) )
            // InternalCls.g:3041:2: ( ( 'static' ) )
            {
            // InternalCls.g:3041:2: ( ( 'static' ) )
            // InternalCls.g:3042:3: ( 'static' )
            {
             before(grammarAccess.getMethodeAccess().getStaticStaticKeyword_2_0()); 
            // InternalCls.g:3043:3: ( 'static' )
            // InternalCls.g:3044:4: 'static'
            {
             before(grammarAccess.getMethodeAccess().getStaticStaticKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getStaticStaticKeyword_2_0()); 

            }

             after(grammarAccess.getMethodeAccess().getStaticStaticKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__StaticAssignment_2"


    // $ANTLR start "rule__Methode__FinalAssignment_3"
    // InternalCls.g:3055:1: rule__Methode__FinalAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__Methode__FinalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3059:1: ( ( ( 'final' ) ) )
            // InternalCls.g:3060:2: ( ( 'final' ) )
            {
            // InternalCls.g:3060:2: ( ( 'final' ) )
            // InternalCls.g:3061:3: ( 'final' )
            {
             before(grammarAccess.getMethodeAccess().getFinalFinalKeyword_3_0()); 
            // InternalCls.g:3062:3: ( 'final' )
            // InternalCls.g:3063:4: 'final'
            {
             before(grammarAccess.getMethodeAccess().getFinalFinalKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getFinalFinalKeyword_3_0()); 

            }

             after(grammarAccess.getMethodeAccess().getFinalFinalKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__FinalAssignment_3"


    // $ANTLR start "rule__Methode__NameAssignment_4"
    // InternalCls.g:3074:1: rule__Methode__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Methode__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3078:1: ( ( RULE_ID ) )
            // InternalCls.g:3079:2: ( RULE_ID )
            {
            // InternalCls.g:3079:2: ( RULE_ID )
            // InternalCls.g:3080:3: RULE_ID
            {
             before(grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__NameAssignment_4"


    // $ANTLR start "rule__Methode__AttributesAssignment_6_0"
    // InternalCls.g:3089:1: rule__Methode__AttributesAssignment_6_0 : ( ruleAttribute ) ;
    public final void rule__Methode__AttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3093:1: ( ( ruleAttribute ) )
            // InternalCls.g:3094:2: ( ruleAttribute )
            {
            // InternalCls.g:3094:2: ( ruleAttribute )
            // InternalCls.g:3095:3: ruleAttribute
            {
             before(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__AttributesAssignment_6_0"


    // $ANTLR start "rule__Methode__AttributesAssignment_6_1_1"
    // InternalCls.g:3104:1: rule__Methode__AttributesAssignment_6_1_1 : ( ruleAttribute ) ;
    public final void rule__Methode__AttributesAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3108:1: ( ( ruleAttribute ) )
            // InternalCls.g:3109:2: ( ruleAttribute )
            {
            // InternalCls.g:3109:2: ( ruleAttribute )
            // InternalCls.g:3110:3: ruleAttribute
            {
             before(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__AttributesAssignment_6_1_1"


    // $ANTLR start "rule__Methode__TypeAssignment_8_1"
    // InternalCls.g:3119:1: rule__Methode__TypeAssignment_8_1 : ( ruleType ) ;
    public final void rule__Methode__TypeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3123:1: ( ( ruleType ) )
            // InternalCls.g:3124:2: ( ruleType )
            {
            // InternalCls.g:3124:2: ( ruleType )
            // InternalCls.g:3125:3: ruleType
            {
             before(grammarAccess.getMethodeAccess().getTypeTypeParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getTypeTypeParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__TypeAssignment_8_1"


    // $ANTLR start "rule__Generalization__LeftAssignment_0"
    // InternalCls.g:3134:1: rule__Generalization__LeftAssignment_0 : ( ruleAssociationEnd ) ;
    public final void rule__Generalization__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3138:1: ( ( ruleAssociationEnd ) )
            // InternalCls.g:3139:2: ( ruleAssociationEnd )
            {
            // InternalCls.g:3139:2: ( ruleAssociationEnd )
            // InternalCls.g:3140:3: ruleAssociationEnd
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssociationEndParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getLeftAssociationEndParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalCls.g:3149:1: rule__Generalization__RightAssignment_2 : ( ruleAssociationEnd ) ;
    public final void rule__Generalization__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3153:1: ( ( ruleAssociationEnd ) )
            // InternalCls.g:3154:2: ( ruleAssociationEnd )
            {
            // InternalCls.g:3154:2: ( ruleAssociationEnd )
            // InternalCls.g:3155:3: ruleAssociationEnd
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssociationEndParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getRightAssociationEndParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalCls.g:3164:1: rule__Implementation__LeftAssignment_0 : ( ruleAssociationEnd ) ;
    public final void rule__Implementation__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3168:1: ( ( ruleAssociationEnd ) )
            // InternalCls.g:3169:2: ( ruleAssociationEnd )
            {
            // InternalCls.g:3169:2: ( ruleAssociationEnd )
            // InternalCls.g:3170:3: ruleAssociationEnd
            {
             before(grammarAccess.getImplementationAccess().getLeftAssociationEndParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getLeftAssociationEndParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalCls.g:3179:1: rule__Implementation__RightAssignment_2 : ( ruleAssociationEnd ) ;
    public final void rule__Implementation__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3183:1: ( ( ruleAssociationEnd ) )
            // InternalCls.g:3184:2: ( ruleAssociationEnd )
            {
            // InternalCls.g:3184:2: ( ruleAssociationEnd )
            // InternalCls.g:3185:3: ruleAssociationEnd
            {
             before(grammarAccess.getImplementationAccess().getRightAssociationEndParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getImplementationAccess().getRightAssociationEndParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Association__LeftAssignment_0"
    // InternalCls.g:3194:1: rule__Association__LeftAssignment_0 : ( ruleAssociationEnd ) ;
    public final void rule__Association__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3198:1: ( ( ruleAssociationEnd ) )
            // InternalCls.g:3199:2: ( ruleAssociationEnd )
            {
            // InternalCls.g:3199:2: ( ruleAssociationEnd )
            // InternalCls.g:3200:3: ruleAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getLeftAssociationEndParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getLeftAssociationEndParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Association__RightAssignment_2_0_0"
    // InternalCls.g:3209:1: rule__Association__RightAssignment_2_0_0 : ( ruleAssociationEnd ) ;
    public final void rule__Association__RightAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3213:1: ( ( ruleAssociationEnd ) )
            // InternalCls.g:3214:2: ( ruleAssociationEnd )
            {
            // InternalCls.g:3214:2: ( ruleAssociationEnd )
            // InternalCls.g:3215:3: ruleAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getRightAssociationEndParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRightAssociationEndParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__RightAssignment_2_0_0"


    // $ANTLR start "rule__Association__CardinalityAssignment_2_0_1"
    // InternalCls.g:3224:1: rule__Association__CardinalityAssignment_2_0_1 : ( ruleConnectorCardinalitiy ) ;
    public final void rule__Association__CardinalityAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3228:1: ( ( ruleConnectorCardinalitiy ) )
            // InternalCls.g:3229:2: ( ruleConnectorCardinalitiy )
            {
            // InternalCls.g:3229:2: ( ruleConnectorCardinalitiy )
            // InternalCls.g:3230:3: ruleConnectorCardinalitiy
            {
             before(grammarAccess.getAssociationAccess().getCardinalityConnectorCardinalitiyParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectorCardinalitiy();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getCardinalityConnectorCardinalitiyParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__CardinalityAssignment_2_0_1"


    // $ANTLR start "rule__Association__NoteAssignment_2_0_2"
    // InternalCls.g:3239:1: rule__Association__NoteAssignment_2_0_2 : ( ruleNote ) ;
    public final void rule__Association__NoteAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3243:1: ( ( ruleNote ) )
            // InternalCls.g:3244:2: ( ruleNote )
            {
            // InternalCls.g:3244:2: ( ruleNote )
            // InternalCls.g:3245:3: ruleNote
            {
             before(grammarAccess.getAssociationAccess().getNoteNoteParserRuleCall_2_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getNoteNoteParserRuleCall_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NoteAssignment_2_0_2"


    // $ANTLR start "rule__Association__NoteAssignment_2_1"
    // InternalCls.g:3254:1: rule__Association__NoteAssignment_2_1 : ( ruleNote ) ;
    public final void rule__Association__NoteAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3258:1: ( ( ruleNote ) )
            // InternalCls.g:3259:2: ( ruleNote )
            {
            // InternalCls.g:3259:2: ( ruleNote )
            // InternalCls.g:3260:3: ruleNote
            {
             before(grammarAccess.getAssociationAccess().getNoteNoteParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getNoteNoteParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NoteAssignment_2_1"


    // $ANTLR start "rule__AssociationEnd__TypeAssignment"
    // InternalCls.g:3269:1: rule__AssociationEnd__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__AssociationEnd__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3273:1: ( ( ( RULE_ID ) ) )
            // InternalCls.g:3274:2: ( ( RULE_ID ) )
            {
            // InternalCls.g:3274:2: ( ( RULE_ID ) )
            // InternalCls.g:3275:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationEndAccess().getTypeClassNameCrossReference_0()); 
            // InternalCls.g:3276:3: ( RULE_ID )
            // InternalCls.g:3277:4: RULE_ID
            {
             before(grammarAccess.getAssociationEndAccess().getTypeClassNameIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getTypeClassNameIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getAssociationEndAccess().getTypeClassNameCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__TypeAssignment"


    // $ANTLR start "rule__ConnectorLabel__NameAssignment"
    // InternalCls.g:3288:1: rule__ConnectorLabel__NameAssignment : ( RULE_ID ) ;
    public final void rule__ConnectorLabel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3292:1: ( ( RULE_ID ) )
            // InternalCls.g:3293:2: ( RULE_ID )
            {
            // InternalCls.g:3293:2: ( RULE_ID )
            // InternalCls.g:3294:3: RULE_ID
            {
             before(grammarAccess.getConnectorLabelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectorLabelAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorLabel__NameAssignment"


    // $ANTLR start "rule__ConnectorCardinalitiy__LeftAssignment_2"
    // InternalCls.g:3303:1: rule__ConnectorCardinalitiy__LeftAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ConnectorCardinalitiy__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3307:1: ( ( ruleCardinality ) )
            // InternalCls.g:3308:2: ( ruleCardinality )
            {
            // InternalCls.g:3308:2: ( ruleCardinality )
            // InternalCls.g:3309:3: ruleCardinality
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getLeftCardinalityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getConnectorCardinalitiyAccess().getLeftCardinalityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__LeftAssignment_2"


    // $ANTLR start "rule__ConnectorCardinalitiy__MiddleAssignment_3_1"
    // InternalCls.g:3318:1: rule__ConnectorCardinalitiy__MiddleAssignment_3_1 : ( ruleCardinality ) ;
    public final void rule__ConnectorCardinalitiy__MiddleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3322:1: ( ( ruleCardinality ) )
            // InternalCls.g:3323:2: ( ruleCardinality )
            {
            // InternalCls.g:3323:2: ( ruleCardinality )
            // InternalCls.g:3324:3: ruleCardinality
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getMiddleCardinalityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getConnectorCardinalitiyAccess().getMiddleCardinalityParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__MiddleAssignment_3_1"


    // $ANTLR start "rule__ConnectorCardinalitiy__RightAssignment_4_1"
    // InternalCls.g:3333:1: rule__ConnectorCardinalitiy__RightAssignment_4_1 : ( ruleConnectorLabel ) ;
    public final void rule__ConnectorCardinalitiy__RightAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCls.g:3337:1: ( ( ruleConnectorLabel ) )
            // InternalCls.g:3338:2: ( ruleConnectorLabel )
            {
            // InternalCls.g:3338:2: ( ruleConnectorLabel )
            // InternalCls.g:3339:3: ruleConnectorLabel
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getRightConnectorLabelParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectorLabel();

            state._fsp--;

             after(grammarAccess.getConnectorCardinalitiyAccess().getRightConnectorLabelParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorCardinalitiy__RightAssignment_4_1"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\7\5\1\43\2\uffff";
    static final String dfa_3s = "\6\57\1\5\1\44\2\uffff";
    static final String dfa_4s = "\10\uffff\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\12\uffff\1\1\1\2\1\3\1\4\31\uffff\1\10\1\5\1\6",
            "\1\7\47\uffff\1\10\1\5\1\6",
            "\1\7\47\uffff\1\10\1\5\1\6",
            "\1\7\47\uffff\1\10\1\5\1\6",
            "\1\7\47\uffff\1\10\1\5\1\6",
            "\1\7\51\uffff\1\6",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "670:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethode ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000200040001820L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000200000001822L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000E001000F0020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000E000000F0022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000C000000F0020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000001FF00030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000E000000F0020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000C020000F0020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000C000000F0022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000110000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000008040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});

}