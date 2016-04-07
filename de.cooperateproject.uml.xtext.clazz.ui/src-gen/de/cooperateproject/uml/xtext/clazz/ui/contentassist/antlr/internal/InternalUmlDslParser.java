package de.cooperateproject.uml.xtext.clazz.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.cooperateproject.uml.xtext.clazz.services.UmlDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUmlDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'interface'", "'<'", "'>'", "'*'", "'#'", "'-'", "'~'", "'+'", "'@startclass'", "'@endclass'", "'datatype'", "'{'", "'}'", "','", "' as '", "'abstract'", "'extends'", "'implements'", "'static'", "'final'", "':'", "'('", "')'", "'isa'", "'['", "']'", "'|'", "'..'", "'note['"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalUmlDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUmlDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUmlDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g"; }


     
     	private UmlDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(UmlDslGrammarAccess grammarAccess) {
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:60:1: entryRuleClassDiagram : ruleClassDiagram EOF ;
    public final void entryRuleClassDiagram() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:61:1: ( ruleClassDiagram EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:62:1: ruleClassDiagram EOF
            {
             before(grammarAccess.getClassDiagramRule()); 
            pushFollow(FOLLOW_ruleClassDiagram_in_entryRuleClassDiagram61);
            ruleClassDiagram();

            state._fsp--;

             after(grammarAccess.getClassDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDiagram68); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:69:1: ruleClassDiagram : ( ( rule__ClassDiagram__Group__0 ) ) ;
    public final void ruleClassDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:73:2: ( ( ( rule__ClassDiagram__Group__0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:74:1: ( ( rule__ClassDiagram__Group__0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:74:1: ( ( rule__ClassDiagram__Group__0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:75:1: ( rule__ClassDiagram__Group__0 )
            {
             before(grammarAccess.getClassDiagramAccess().getGroup()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:76:1: ( rule__ClassDiagram__Group__0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:76:2: rule__ClassDiagram__Group__0
            {
            pushFollow(FOLLOW_rule__ClassDiagram__Group__0_in_ruleClassDiagram94);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:89:1: ( ruleElement EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement121);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement128); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:102:1: ( ( rule__Element__Alternatives ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:104:1: ( rule__Element__Alternatives )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement154);
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


    // $ANTLR start "entryRuleDataType"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:116:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:117:1: ( ruleDataType EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:118:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType181);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType188); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:125:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:129:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:130:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:130:1: ( ( rule__DataType__Group__0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:131:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:132:1: ( rule__DataType__Group__0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:132:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType214);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleClassDef"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:146:1: entryRuleClassDef : ruleClassDef EOF ;
    public final void entryRuleClassDef() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:147:1: ( ruleClassDef EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:148:1: ruleClassDef EOF
            {
             before(grammarAccess.getClassDefRule()); 
            pushFollow(FOLLOW_ruleClassDef_in_entryRuleClassDef243);
            ruleClassDef();

            state._fsp--;

             after(grammarAccess.getClassDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDef250); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:155:1: ruleClassDef : ( ( rule__ClassDef__Group__0 ) ) ;
    public final void ruleClassDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:159:2: ( ( ( rule__ClassDef__Group__0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:160:1: ( ( rule__ClassDef__Group__0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:160:1: ( ( rule__ClassDef__Group__0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:161:1: ( rule__ClassDef__Group__0 )
            {
             before(grammarAccess.getClassDefAccess().getGroup()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:162:1: ( rule__ClassDef__Group__0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:162:2: rule__ClassDef__Group__0
            {
            pushFollow(FOLLOW_rule__ClassDef__Group__0_in_ruleClassDef276);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:174:1: entryRuleClassName : ruleClassName EOF ;
    public final void entryRuleClassName() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:175:1: ( ruleClassName EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:176:1: ruleClassName EOF
            {
             before(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_ruleClassName_in_entryRuleClassName303);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getClassNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassName310); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:183:1: ruleClassName : ( ruleName ) ;
    public final void ruleClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:187:2: ( ( ruleName ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:188:1: ( ruleName )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:188:1: ( ruleName )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:189:1: ruleName
            {
             before(grammarAccess.getClassNameAccess().getNameParserRuleCall()); 
            pushFollow(FOLLOW_ruleName_in_ruleClassName336);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:202:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:203:1: ( ruleName EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:204:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName362);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName369); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:211:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:215:2: ( ( ( rule__Name__Alternatives ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:216:1: ( ( rule__Name__Alternatives ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:216:1: ( ( rule__Name__Alternatives ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:217:1: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:218:1: ( rule__Name__Alternatives )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:218:2: rule__Name__Alternatives
            {
            pushFollow(FOLLOW_rule__Name__Alternatives_in_ruleName395);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:230:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:231:1: ( ruleClass EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:232:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass422);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass429); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:239:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:243:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:244:1: ( ( rule__Class__Group__0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:244:1: ( ( rule__Class__Group__0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:245:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:246:1: ( rule__Class__Group__0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:246:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass455);
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


    // $ANTLR start "entryRuleInheritance"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:258:1: entryRuleInheritance : ruleInheritance EOF ;
    public final void entryRuleInheritance() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:259:1: ( ruleInheritance EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:260:1: ruleInheritance EOF
            {
             before(grammarAccess.getInheritanceRule()); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance482);
            ruleInheritance();

            state._fsp--;

             after(grammarAccess.getInheritanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance489); 

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
    // $ANTLR end "entryRuleInheritance"


    // $ANTLR start "ruleInheritance"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:267:1: ruleInheritance : ( ( rule__Inheritance__Alternatives ) ) ;
    public final void ruleInheritance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:271:2: ( ( ( rule__Inheritance__Alternatives ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:272:1: ( ( rule__Inheritance__Alternatives ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:272:1: ( ( rule__Inheritance__Alternatives ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:273:1: ( rule__Inheritance__Alternatives )
            {
             before(grammarAccess.getInheritanceAccess().getAlternatives()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:274:1: ( rule__Inheritance__Alternatives )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:274:2: rule__Inheritance__Alternatives
            {
            pushFollow(FOLLOW_rule__Inheritance__Alternatives_in_ruleInheritance515);
            rule__Inheritance__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInheritance"


    // $ANTLR start "entryRuleMember"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:286:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:287:1: ( ruleMember EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:288:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember542);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember549); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:295:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:299:2: ( ( ( rule__Member__Alternatives ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:300:1: ( ( rule__Member__Alternatives ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:300:1: ( ( rule__Member__Alternatives ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:301:1: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:302:1: ( rule__Member__Alternatives )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:302:2: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_rule__Member__Alternatives_in_ruleMember575);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:314:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:315:1: ( ruleAttribute EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:316:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute602);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute609); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:323:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:327:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:328:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:328:1: ( ( rule__Attribute__Group__0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:329:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:330:1: ( rule__Attribute__Group__0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:330:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute635);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:342:1: entryRuleMethode : ruleMethode EOF ;
    public final void entryRuleMethode() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:343:1: ( ruleMethode EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:344:1: ruleMethode EOF
            {
             before(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_ruleMethode_in_entryRuleMethode662);
            ruleMethode();

            state._fsp--;

             after(grammarAccess.getMethodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethode669); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:351:1: ruleMethode : ( ( rule__Methode__Group__0 ) ) ;
    public final void ruleMethode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:355:2: ( ( ( rule__Methode__Group__0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:356:1: ( ( rule__Methode__Group__0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:356:1: ( ( rule__Methode__Group__0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:357:1: ( rule__Methode__Group__0 )
            {
             before(grammarAccess.getMethodeAccess().getGroup()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:358:1: ( rule__Methode__Group__0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:358:2: rule__Methode__Group__0
            {
            pushFollow(FOLLOW_rule__Methode__Group__0_in_ruleMethode695);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:370:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:371:1: ( ruleConnector EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:372:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector722);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector729); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:379:1: ruleConnector : ( ( rule__Connector__Alternatives ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:383:2: ( ( ( rule__Connector__Alternatives ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:384:1: ( ( rule__Connector__Alternatives ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:384:1: ( ( rule__Connector__Alternatives ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:385:1: ( rule__Connector__Alternatives )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:386:1: ( rule__Connector__Alternatives )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:386:2: rule__Connector__Alternatives
            {
            pushFollow(FOLLOW_rule__Connector__Alternatives_in_ruleConnector755);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:398:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:399:1: ( ruleGeneralization EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:400:1: ruleGeneralization EOF
            {
             before(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_ruleGeneralization_in_entryRuleGeneralization782);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getGeneralizationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralization789); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:407:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:411:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:412:1: ( ( rule__Generalization__Group__0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:412:1: ( ( rule__Generalization__Group__0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:413:1: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:414:1: ( rule__Generalization__Group__0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:414:2: rule__Generalization__Group__0
            {
            pushFollow(FOLLOW_rule__Generalization__Group__0_in_ruleGeneralization815);
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


    // $ANTLR start "entryRuleAssociation"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:426:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:427:1: ( ruleAssociation EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:428:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation842);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation849); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:435:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:439:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:440:1: ( ( rule__Association__Group__0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:440:1: ( ( rule__Association__Group__0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:441:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:442:1: ( rule__Association__Group__0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:442:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation875);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:454:1: entryRuleAssociationEnd : ruleAssociationEnd EOF ;
    public final void entryRuleAssociationEnd() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:455:1: ( ruleAssociationEnd EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:456:1: ruleAssociationEnd EOF
            {
             before(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_ruleAssociationEnd_in_entryRuleAssociationEnd902);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationEndRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationEnd909); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:463:1: ruleAssociationEnd : ( ( rule__AssociationEnd__TypeAssignment ) ) ;
    public final void ruleAssociationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:467:2: ( ( ( rule__AssociationEnd__TypeAssignment ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:468:1: ( ( rule__AssociationEnd__TypeAssignment ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:468:1: ( ( rule__AssociationEnd__TypeAssignment ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:469:1: ( rule__AssociationEnd__TypeAssignment )
            {
             before(grammarAccess.getAssociationEndAccess().getTypeAssignment()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:470:1: ( rule__AssociationEnd__TypeAssignment )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:470:2: rule__AssociationEnd__TypeAssignment
            {
            pushFollow(FOLLOW_rule__AssociationEnd__TypeAssignment_in_ruleAssociationEnd935);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:482:1: entryRuleConnectorLabel : ruleConnectorLabel EOF ;
    public final void entryRuleConnectorLabel() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:483:1: ( ruleConnectorLabel EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:484:1: ruleConnectorLabel EOF
            {
             before(grammarAccess.getConnectorLabelRule()); 
            pushFollow(FOLLOW_ruleConnectorLabel_in_entryRuleConnectorLabel962);
            ruleConnectorLabel();

            state._fsp--;

             after(grammarAccess.getConnectorLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectorLabel969); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:491:1: ruleConnectorLabel : ( ( rule__ConnectorLabel__NameAssignment ) ) ;
    public final void ruleConnectorLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:495:2: ( ( ( rule__ConnectorLabel__NameAssignment ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:496:1: ( ( rule__ConnectorLabel__NameAssignment ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:496:1: ( ( rule__ConnectorLabel__NameAssignment ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:497:1: ( rule__ConnectorLabel__NameAssignment )
            {
             before(grammarAccess.getConnectorLabelAccess().getNameAssignment()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:498:1: ( rule__ConnectorLabel__NameAssignment )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:498:2: rule__ConnectorLabel__NameAssignment
            {
            pushFollow(FOLLOW_rule__ConnectorLabel__NameAssignment_in_ruleConnectorLabel995);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:510:1: entryRuleConnectorCardinalitiy : ruleConnectorCardinalitiy EOF ;
    public final void entryRuleConnectorCardinalitiy() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:511:1: ( ruleConnectorCardinalitiy EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:512:1: ruleConnectorCardinalitiy EOF
            {
             before(grammarAccess.getConnectorCardinalitiyRule()); 
            pushFollow(FOLLOW_ruleConnectorCardinalitiy_in_entryRuleConnectorCardinalitiy1022);
            ruleConnectorCardinalitiy();

            state._fsp--;

             after(grammarAccess.getConnectorCardinalitiyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectorCardinalitiy1029); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:519:1: ruleConnectorCardinalitiy : ( ( rule__ConnectorCardinalitiy__Group__0 ) ) ;
    public final void ruleConnectorCardinalitiy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:523:2: ( ( ( rule__ConnectorCardinalitiy__Group__0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:524:1: ( ( rule__ConnectorCardinalitiy__Group__0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:524:1: ( ( rule__ConnectorCardinalitiy__Group__0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:525:1: ( rule__ConnectorCardinalitiy__Group__0 )
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getGroup()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:526:1: ( rule__ConnectorCardinalitiy__Group__0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:526:2: rule__ConnectorCardinalitiy__Group__0
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__0_in_ruleConnectorCardinalitiy1055);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:538:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:539:1: ( ruleCardinality EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:540:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1082);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1089); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:547:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:551:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:552:1: ( ( rule__Cardinality__Alternatives ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:552:1: ( ( rule__Cardinality__Alternatives ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:553:1: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:554:1: ( rule__Cardinality__Alternatives )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:554:2: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1115);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:566:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:567:1: ( ruleNote EOF )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:568:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote1142);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote1149); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:575:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:579:2: ( ( ( rule__Note__Group__0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:580:1: ( ( rule__Note__Group__0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:580:1: ( ( rule__Note__Group__0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:581:1: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:582:1: ( rule__Note__Group__0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:582:2: rule__Note__Group__0
            {
            pushFollow(FOLLOW_rule__Note__Group__0_in_ruleNote1175);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:595:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:599:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:600:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:600:1: ( ( rule__Visibility__Alternatives ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:601:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:602:1: ( rule__Visibility__Alternatives )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:602:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1212);
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


    // $ANTLR start "rule__Element__Alternatives"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:613:1: rule__Element__Alternatives : ( ( ruleClassDef ) | ( ruleClass ) | ( ruleDataType ) | ( ruleConnector ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:617:1: ( ( ruleClassDef ) | ( ruleClass ) | ( ruleDataType ) | ( ruleConnector ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==17||LA1_3==35) ) {
                    alt1=4;
                }
                else if ( (LA1_3==23||(LA1_3>=28 && LA1_3<=29)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:618:1: ( ruleClassDef )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:618:1: ( ruleClassDef )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:619:1: ruleClassDef
                    {
                     before(grammarAccess.getElementAccess().getClassDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleClassDef_in_rule__Element__Alternatives1247);
                    ruleClassDef();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getClassDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:624:6: ( ruleClass )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:624:6: ( ruleClass )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:625:1: ruleClass
                    {
                     before(grammarAccess.getElementAccess().getClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClass_in_rule__Element__Alternatives1264);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:630:6: ( ruleDataType )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:630:6: ( ruleDataType )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:631:1: ruleDataType
                    {
                     before(grammarAccess.getElementAccess().getDataTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Element__Alternatives1281);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDataTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:636:6: ( ruleConnector )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:636:6: ( ruleConnector )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:637:1: ruleConnector
                    {
                     before(grammarAccess.getElementAccess().getConnectorParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleConnector_in_rule__Element__Alternatives1298);
                    ruleConnector();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getConnectorParserRuleCall_3()); 

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


    // $ANTLR start "rule__ClassDef__Alternatives_0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:648:1: rule__ClassDef__Alternatives_0 : ( ( 'class' ) | ( 'interface' ) );
    public final void rule__ClassDef__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:652:1: ( ( 'class' ) | ( 'interface' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:653:1: ( 'class' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:653:1: ( 'class' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:654:1: 'class'
                    {
                     before(grammarAccess.getClassDefAccess().getClassKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__ClassDef__Alternatives_01332); 
                     after(grammarAccess.getClassDefAccess().getClassKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:661:6: ( 'interface' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:661:6: ( 'interface' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:662:1: 'interface'
                    {
                     before(grammarAccess.getClassDefAccess().getInterfaceKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__ClassDef__Alternatives_01352); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:674:1: rule__Name__Alternatives : ( ( ( rule__Name__NameAssignment_0 ) ) | ( ( rule__Name__Group_1__0 ) ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:678:1: ( ( ( rule__Name__NameAssignment_0 ) ) | ( ( rule__Name__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==26) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||(LA3_1>=24 && LA3_1<=25)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:679:1: ( ( rule__Name__NameAssignment_0 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:679:1: ( ( rule__Name__NameAssignment_0 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:680:1: ( rule__Name__NameAssignment_0 )
                    {
                     before(grammarAccess.getNameAccess().getNameAssignment_0()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:681:1: ( rule__Name__NameAssignment_0 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:681:2: rule__Name__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Name__NameAssignment_0_in_rule__Name__Alternatives1386);
                    rule__Name__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNameAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:685:6: ( ( rule__Name__Group_1__0 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:685:6: ( ( rule__Name__Group_1__0 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:686:1: ( rule__Name__Group_1__0 )
                    {
                     before(grammarAccess.getNameAccess().getGroup_1()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:687:1: ( rule__Name__Group_1__0 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:687:2: rule__Name__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Name__Group_1__0_in_rule__Name__Alternatives1404);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:696:1: rule__Name__LongnameAlternatives_1_0_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Name__LongnameAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:700:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:701:1: ( RULE_STRING )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:701:1: ( RULE_STRING )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:702:1: RULE_STRING
                    {
                     before(grammarAccess.getNameAccess().getLongnameSTRINGTerminalRuleCall_1_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Name__LongnameAlternatives_1_0_01437); 
                     after(grammarAccess.getNameAccess().getLongnameSTRINGTerminalRuleCall_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:707:6: ( RULE_ID )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:707:6: ( RULE_ID )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:708:1: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getLongnameIDTerminalRuleCall_1_0_0_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__LongnameAlternatives_1_0_01454); 
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


    // $ANTLR start "rule__Inheritance__Alternatives"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:718:1: rule__Inheritance__Alternatives : ( ( ( rule__Inheritance__Group_0__0 ) ) | ( ( rule__Inheritance__Group_1__0 ) ) );
    public final void rule__Inheritance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:722:1: ( ( ( rule__Inheritance__Group_0__0 ) ) | ( ( rule__Inheritance__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:723:1: ( ( rule__Inheritance__Group_0__0 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:723:1: ( ( rule__Inheritance__Group_0__0 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:724:1: ( rule__Inheritance__Group_0__0 )
                    {
                     before(grammarAccess.getInheritanceAccess().getGroup_0()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:725:1: ( rule__Inheritance__Group_0__0 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:725:2: rule__Inheritance__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Inheritance__Group_0__0_in_rule__Inheritance__Alternatives1486);
                    rule__Inheritance__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInheritanceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:729:6: ( ( rule__Inheritance__Group_1__0 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:729:6: ( ( rule__Inheritance__Group_1__0 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:730:1: ( rule__Inheritance__Group_1__0 )
                    {
                     before(grammarAccess.getInheritanceAccess().getGroup_1()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:731:1: ( rule__Inheritance__Group_1__0 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:731:2: rule__Inheritance__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Inheritance__Group_1__0_in_rule__Inheritance__Alternatives1504);
                    rule__Inheritance__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInheritanceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Inheritance__Alternatives"


    // $ANTLR start "rule__Member__Alternatives"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:740:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethode ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:744:1: ( ( ruleAttribute ) | ( ruleMethode ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:745:1: ( ruleAttribute )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:745:1: ( ruleAttribute )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:746:1: ruleAttribute
                    {
                     before(grammarAccess.getMemberAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Member__Alternatives1537);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:751:6: ( ruleMethode )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:751:6: ( ruleMethode )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:752:1: ruleMethode
                    {
                     before(grammarAccess.getMemberAccess().getMethodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMethode_in_rule__Member__Alternatives1554);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:762:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleAssociation ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:766:1: ( ( ruleGeneralization ) | ( ruleAssociation ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==35) ) {
                    alt7=1;
                }
                else if ( (LA7_1==17) ) {
                    alt7=2;
                }
                else {
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:767:1: ( ruleGeneralization )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:767:1: ( ruleGeneralization )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:768:1: ruleGeneralization
                    {
                     before(grammarAccess.getConnectorAccess().getGeneralizationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGeneralization_in_rule__Connector__Alternatives1586);
                    ruleGeneralization();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getGeneralizationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:773:6: ( ruleAssociation )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:773:6: ( ruleAssociation )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:774:1: ruleAssociation
                    {
                     before(grammarAccess.getConnectorAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssociation_in_rule__Connector__Alternatives1603);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getAssociationParserRuleCall_1()); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:784:1: rule__Association__Alternatives_2 : ( ( ( rule__Association__Group_2_0__0 ) ) | ( ( rule__Association__NoteAssignment_2_1 ) ) );
    public final void rule__Association__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:788:1: ( ( ( rule__Association__Group_2_0__0 ) ) | ( ( rule__Association__NoteAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==40) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:789:1: ( ( rule__Association__Group_2_0__0 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:789:1: ( ( rule__Association__Group_2_0__0 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:790:1: ( rule__Association__Group_2_0__0 )
                    {
                     before(grammarAccess.getAssociationAccess().getGroup_2_0()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:791:1: ( rule__Association__Group_2_0__0 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:791:2: rule__Association__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_2_0__0_in_rule__Association__Alternatives_21635);
                    rule__Association__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:795:6: ( ( rule__Association__NoteAssignment_2_1 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:795:6: ( ( rule__Association__NoteAssignment_2_1 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:796:1: ( rule__Association__NoteAssignment_2_1 )
                    {
                     before(grammarAccess.getAssociationAccess().getNoteAssignment_2_1()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:797:1: ( rule__Association__NoteAssignment_2_1 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:797:2: rule__Association__NoteAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Association__NoteAssignment_2_1_in_rule__Association__Alternatives_21653);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:806:1: rule__ConnectorCardinalitiy__Alternatives_4_2 : ( ( '<' ) | ( '>' ) );
    public final void rule__ConnectorCardinalitiy__Alternatives_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:810:1: ( ( '<' ) | ( '>' ) )
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:811:1: ( '<' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:811:1: ( '<' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:812:1: '<'
                    {
                     before(grammarAccess.getConnectorCardinalitiyAccess().getLessThanSignKeyword_4_2_0()); 
                    match(input,13,FOLLOW_13_in_rule__ConnectorCardinalitiy__Alternatives_4_21687); 
                     after(grammarAccess.getConnectorCardinalitiyAccess().getLessThanSignKeyword_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:819:6: ( '>' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:819:6: ( '>' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:820:1: '>'
                    {
                     before(grammarAccess.getConnectorCardinalitiyAccess().getGreaterThanSignKeyword_4_2_1()); 
                    match(input,14,FOLLOW_14_in_rule__ConnectorCardinalitiy__Alternatives_4_21707); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:832:1: rule__Cardinality__Alternatives : ( ( '*' ) | ( ( rule__Cardinality__Group_1__0 ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:836:1: ( ( '*' ) | ( ( rule__Cardinality__Group_1__0 ) ) )
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:837:1: ( '*' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:837:1: ( '*' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:838:1: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__Cardinality__Alternatives1742); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:845:6: ( ( rule__Cardinality__Group_1__0 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:845:6: ( ( rule__Cardinality__Group_1__0 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:846:1: ( rule__Cardinality__Group_1__0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getGroup_1()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:847:1: ( rule__Cardinality__Group_1__0 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:847:2: rule__Cardinality__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__Group_1__0_in_rule__Cardinality__Alternatives1761);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:856:1: rule__Cardinality__Alternatives_1_2 : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__Cardinality__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:860:1: ( ( '*' ) | ( RULE_INT ) )
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:861:1: ( '*' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:861:1: ( '*' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:862:1: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_2_0()); 
                    match(input,15,FOLLOW_15_in_rule__Cardinality__Alternatives_1_21795); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:869:6: ( RULE_INT )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:869:6: ( RULE_INT )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:870:1: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_2_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Cardinality__Alternatives_1_21814); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:880:1: rule__Visibility__Alternatives : ( ( ( '#' ) ) | ( ( '-' ) ) | ( ( '~' ) ) | ( ( '+' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:884:1: ( ( ( '#' ) ) | ( ( '-' ) ) | ( ( '~' ) ) | ( ( '+' ) ) )
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:885:1: ( ( '#' ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:885:1: ( ( '#' ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:886:1: ( '#' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_0()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:887:1: ( '#' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:887:3: '#'
                    {
                    match(input,16,FOLLOW_16_in_rule__Visibility__Alternatives1847); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:892:6: ( ( '-' ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:892:6: ( ( '-' ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:893:1: ( '-' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:894:1: ( '-' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:894:3: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__Visibility__Alternatives1868); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:899:6: ( ( '~' ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:899:6: ( ( '~' ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:900:1: ( '~' )
                    {
                     before(grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_2()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:901:1: ( '~' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:901:3: '~'
                    {
                    match(input,18,FOLLOW_18_in_rule__Visibility__Alternatives1889); 

                    }

                     after(grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:906:6: ( ( '+' ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:906:6: ( ( '+' ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:907:1: ( '+' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_3()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:908:1: ( '+' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:908:3: '+'
                    {
                    match(input,19,FOLLOW_19_in_rule__Visibility__Alternatives1910); 

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


    // $ANTLR start "rule__ClassDiagram__Group__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:920:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:924:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:925:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__ClassDiagram__Group__0__Impl_in_rule__ClassDiagram__Group__01943);
            rule__ClassDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDiagram__Group__1_in_rule__ClassDiagram__Group__01946);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:932:1: rule__ClassDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:936:1: ( ( () ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:937:1: ( () )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:937:1: ( () )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:938:1: ()
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:939:1: ()
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:941:1: 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:951:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:955:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:956:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__ClassDiagram__Group__1__Impl_in_rule__ClassDiagram__Group__12004);
            rule__ClassDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDiagram__Group__2_in_rule__ClassDiagram__Group__12007);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:963:1: rule__ClassDiagram__Group__1__Impl : ( '@startclass' ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:967:1: ( ( '@startclass' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:968:1: ( '@startclass' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:968:1: ( '@startclass' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:969:1: '@startclass'
            {
             before(grammarAccess.getClassDiagramAccess().getStartclassKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ClassDiagram__Group__1__Impl2035); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:982:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:986:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:987:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
            {
            pushFollow(FOLLOW_rule__ClassDiagram__Group__2__Impl_in_rule__ClassDiagram__Group__22066);
            rule__ClassDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDiagram__Group__3_in_rule__ClassDiagram__Group__22069);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:994:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__ElementsAssignment_2 )* ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:998:1: ( ( ( rule__ClassDiagram__ElementsAssignment_2 )* ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:999:1: ( ( rule__ClassDiagram__ElementsAssignment_2 )* )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:999:1: ( ( rule__ClassDiagram__ElementsAssignment_2 )* )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1000:1: ( rule__ClassDiagram__ElementsAssignment_2 )*
            {
             before(grammarAccess.getClassDiagramAccess().getElementsAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1001:1: ( rule__ClassDiagram__ElementsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=11 && LA13_0<=12)||LA13_0==22||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1001:2: rule__ClassDiagram__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ClassDiagram__ElementsAssignment_2_in_rule__ClassDiagram__Group__2__Impl2096);
            	    rule__ClassDiagram__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1011:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1015:1: ( rule__ClassDiagram__Group__3__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1016:2: rule__ClassDiagram__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ClassDiagram__Group__3__Impl_in_rule__ClassDiagram__Group__32127);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1022:1: rule__ClassDiagram__Group__3__Impl : ( '@endclass' ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1026:1: ( ( '@endclass' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1027:1: ( '@endclass' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1027:1: ( '@endclass' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1028:1: '@endclass'
            {
             before(grammarAccess.getClassDiagramAccess().getEndclassKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ClassDiagram__Group__3__Impl2155); 
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


    // $ANTLR start "rule__DataType__Group__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1049:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1053:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1054:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02194);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02197);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1061:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1065:1: ( ( 'datatype' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1066:1: ( 'datatype' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1066:1: ( 'datatype' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1067:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__DataType__Group__0__Impl2225); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1080:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1084:1: ( rule__DataType__Group__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1085:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12256);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1091:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1095:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1096:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1096:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1097:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1098:1: ( rule__DataType__NameAssignment_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1098:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2283);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__ClassDef__Group__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1112:1: rule__ClassDef__Group__0 : rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1 ;
    public final void rule__ClassDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1116:1: ( rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1117:2: rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1
            {
            pushFollow(FOLLOW_rule__ClassDef__Group__0__Impl_in_rule__ClassDef__Group__02317);
            rule__ClassDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDef__Group__1_in_rule__ClassDef__Group__02320);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1124:1: rule__ClassDef__Group__0__Impl : ( ( rule__ClassDef__Alternatives_0 ) ) ;
    public final void rule__ClassDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1128:1: ( ( ( rule__ClassDef__Alternatives_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1129:1: ( ( rule__ClassDef__Alternatives_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1129:1: ( ( rule__ClassDef__Alternatives_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1130:1: ( rule__ClassDef__Alternatives_0 )
            {
             before(grammarAccess.getClassDefAccess().getAlternatives_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1131:1: ( rule__ClassDef__Alternatives_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1131:2: rule__ClassDef__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ClassDef__Alternatives_0_in_rule__ClassDef__Group__0__Impl2347);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1141:1: rule__ClassDef__Group__1 : rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2 ;
    public final void rule__ClassDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1145:1: ( rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1146:2: rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2
            {
            pushFollow(FOLLOW_rule__ClassDef__Group__1__Impl_in_rule__ClassDef__Group__12377);
            rule__ClassDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDef__Group__2_in_rule__ClassDef__Group__12380);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1153:1: rule__ClassDef__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1157:1: ( ( '{' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1158:1: ( '{' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1158:1: ( '{' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1159:1: '{'
            {
             before(grammarAccess.getClassDefAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ClassDef__Group__1__Impl2408); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1172:1: rule__ClassDef__Group__2 : rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3 ;
    public final void rule__ClassDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1176:1: ( rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1177:2: rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3
            {
            pushFollow(FOLLOW_rule__ClassDef__Group__2__Impl_in_rule__ClassDef__Group__22439);
            rule__ClassDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDef__Group__3_in_rule__ClassDef__Group__22442);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1184:1: rule__ClassDef__Group__2__Impl : ( ( rule__ClassDef__ClassesAssignment_2 ) ) ;
    public final void rule__ClassDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1188:1: ( ( ( rule__ClassDef__ClassesAssignment_2 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1189:1: ( ( rule__ClassDef__ClassesAssignment_2 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1189:1: ( ( rule__ClassDef__ClassesAssignment_2 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1190:1: ( rule__ClassDef__ClassesAssignment_2 )
            {
             before(grammarAccess.getClassDefAccess().getClassesAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1191:1: ( rule__ClassDef__ClassesAssignment_2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1191:2: rule__ClassDef__ClassesAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassDef__ClassesAssignment_2_in_rule__ClassDef__Group__2__Impl2469);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1201:1: rule__ClassDef__Group__3 : rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4 ;
    public final void rule__ClassDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1205:1: ( rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1206:2: rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4
            {
            pushFollow(FOLLOW_rule__ClassDef__Group__3__Impl_in_rule__ClassDef__Group__32499);
            rule__ClassDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDef__Group__4_in_rule__ClassDef__Group__32502);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1213:1: rule__ClassDef__Group__3__Impl : ( ( rule__ClassDef__Group_3__0 )* ) ;
    public final void rule__ClassDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1217:1: ( ( ( rule__ClassDef__Group_3__0 )* ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1218:1: ( ( rule__ClassDef__Group_3__0 )* )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1218:1: ( ( rule__ClassDef__Group_3__0 )* )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1219:1: ( rule__ClassDef__Group_3__0 )*
            {
             before(grammarAccess.getClassDefAccess().getGroup_3()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1220:1: ( rule__ClassDef__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1220:2: rule__ClassDef__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ClassDef__Group_3__0_in_rule__ClassDef__Group__3__Impl2529);
            	    rule__ClassDef__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1230:1: rule__ClassDef__Group__4 : rule__ClassDef__Group__4__Impl ;
    public final void rule__ClassDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1234:1: ( rule__ClassDef__Group__4__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1235:2: rule__ClassDef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ClassDef__Group__4__Impl_in_rule__ClassDef__Group__42560);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1241:1: rule__ClassDef__Group__4__Impl : ( '}' ) ;
    public final void rule__ClassDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1245:1: ( ( '}' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1246:1: ( '}' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1246:1: ( '}' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1247:1: '}'
            {
             before(grammarAccess.getClassDefAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__ClassDef__Group__4__Impl2588); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1270:1: rule__ClassDef__Group_3__0 : rule__ClassDef__Group_3__0__Impl rule__ClassDef__Group_3__1 ;
    public final void rule__ClassDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1274:1: ( rule__ClassDef__Group_3__0__Impl rule__ClassDef__Group_3__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1275:2: rule__ClassDef__Group_3__0__Impl rule__ClassDef__Group_3__1
            {
            pushFollow(FOLLOW_rule__ClassDef__Group_3__0__Impl_in_rule__ClassDef__Group_3__02629);
            rule__ClassDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDef__Group_3__1_in_rule__ClassDef__Group_3__02632);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1282:1: rule__ClassDef__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ClassDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1286:1: ( ( ',' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1287:1: ( ',' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1287:1: ( ',' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1288:1: ','
            {
             before(grammarAccess.getClassDefAccess().getCommaKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__ClassDef__Group_3__0__Impl2660); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1301:1: rule__ClassDef__Group_3__1 : rule__ClassDef__Group_3__1__Impl ;
    public final void rule__ClassDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1305:1: ( rule__ClassDef__Group_3__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1306:2: rule__ClassDef__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassDef__Group_3__1__Impl_in_rule__ClassDef__Group_3__12691);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1312:1: rule__ClassDef__Group_3__1__Impl : ( ( rule__ClassDef__ClassesAssignment_3_1 ) ) ;
    public final void rule__ClassDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1316:1: ( ( ( rule__ClassDef__ClassesAssignment_3_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1317:1: ( ( rule__ClassDef__ClassesAssignment_3_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1317:1: ( ( rule__ClassDef__ClassesAssignment_3_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1318:1: ( rule__ClassDef__ClassesAssignment_3_1 )
            {
             before(grammarAccess.getClassDefAccess().getClassesAssignment_3_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1319:1: ( rule__ClassDef__ClassesAssignment_3_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1319:2: rule__ClassDef__ClassesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ClassDef__ClassesAssignment_3_1_in_rule__ClassDef__Group_3__1__Impl2718);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1333:1: rule__Name__Group_1__0 : rule__Name__Group_1__0__Impl rule__Name__Group_1__1 ;
    public final void rule__Name__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1337:1: ( rule__Name__Group_1__0__Impl rule__Name__Group_1__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1338:2: rule__Name__Group_1__0__Impl rule__Name__Group_1__1
            {
            pushFollow(FOLLOW_rule__Name__Group_1__0__Impl_in_rule__Name__Group_1__02752);
            rule__Name__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group_1__1_in_rule__Name__Group_1__02755);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1345:1: rule__Name__Group_1__0__Impl : ( ( rule__Name__LongnameAssignment_1_0 ) ) ;
    public final void rule__Name__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1349:1: ( ( ( rule__Name__LongnameAssignment_1_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1350:1: ( ( rule__Name__LongnameAssignment_1_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1350:1: ( ( rule__Name__LongnameAssignment_1_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1351:1: ( rule__Name__LongnameAssignment_1_0 )
            {
             before(grammarAccess.getNameAccess().getLongnameAssignment_1_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1352:1: ( rule__Name__LongnameAssignment_1_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1352:2: rule__Name__LongnameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Name__LongnameAssignment_1_0_in_rule__Name__Group_1__0__Impl2782);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1362:1: rule__Name__Group_1__1 : rule__Name__Group_1__1__Impl rule__Name__Group_1__2 ;
    public final void rule__Name__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1366:1: ( rule__Name__Group_1__1__Impl rule__Name__Group_1__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1367:2: rule__Name__Group_1__1__Impl rule__Name__Group_1__2
            {
            pushFollow(FOLLOW_rule__Name__Group_1__1__Impl_in_rule__Name__Group_1__12812);
            rule__Name__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group_1__2_in_rule__Name__Group_1__12815);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1374:1: rule__Name__Group_1__1__Impl : ( ' as ' ) ;
    public final void rule__Name__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1378:1: ( ( ' as ' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1379:1: ( ' as ' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1379:1: ( ' as ' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1380:1: ' as '
            {
             before(grammarAccess.getNameAccess().getAsKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__Name__Group_1__1__Impl2843); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1393:1: rule__Name__Group_1__2 : rule__Name__Group_1__2__Impl ;
    public final void rule__Name__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1397:1: ( rule__Name__Group_1__2__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1398:2: rule__Name__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Name__Group_1__2__Impl_in_rule__Name__Group_1__22874);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1404:1: rule__Name__Group_1__2__Impl : ( ( rule__Name__NameAssignment_1_2 ) ) ;
    public final void rule__Name__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1408:1: ( ( ( rule__Name__NameAssignment_1_2 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1409:1: ( ( rule__Name__NameAssignment_1_2 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1409:1: ( ( rule__Name__NameAssignment_1_2 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1410:1: ( rule__Name__NameAssignment_1_2 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_1_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1411:1: ( rule__Name__NameAssignment_1_2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1411:2: rule__Name__NameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Name__NameAssignment_1_2_in_rule__Name__Group_1__2__Impl2901);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1427:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1431:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1432:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__02937);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__02940);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1439:1: rule__Class__Group__0__Impl : ( ( 'abstract' )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1443:1: ( ( ( 'abstract' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1444:1: ( ( 'abstract' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1444:1: ( ( 'abstract' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1445:1: ( 'abstract' )?
            {
             before(grammarAccess.getClassAccess().getAbstractKeyword_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1446:1: ( 'abstract' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1447:2: 'abstract'
                    {
                    match(input,27,FOLLOW_27_in_rule__Class__Group__0__Impl2969); 

                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAbstractKeyword_0()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1458:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1462:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1463:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__13002);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__13005);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1470:1: rule__Class__Group__1__Impl : ( ( rule__Class__TypeAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1474:1: ( ( ( rule__Class__TypeAssignment_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1475:1: ( ( rule__Class__TypeAssignment_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1475:1: ( ( rule__Class__TypeAssignment_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1476:1: ( rule__Class__TypeAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getTypeAssignment_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1477:1: ( rule__Class__TypeAssignment_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1477:2: rule__Class__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__TypeAssignment_1_in_rule__Class__Group__1__Impl3032);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1487:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1491:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1492:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__23062);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__23065);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1499:1: rule__Class__Group__2__Impl : ( ( rule__Class__InheritanceAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1503:1: ( ( ( rule__Class__InheritanceAssignment_2 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1504:1: ( ( rule__Class__InheritanceAssignment_2 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1504:1: ( ( rule__Class__InheritanceAssignment_2 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1505:1: ( rule__Class__InheritanceAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getInheritanceAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1506:1: ( rule__Class__InheritanceAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=28 && LA16_0<=29)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1506:2: rule__Class__InheritanceAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Class__InheritanceAssignment_2_in_rule__Class__Group__2__Impl3092);
                    rule__Class__InheritanceAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getInheritanceAssignment_2()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1516:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1520:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1521:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__33123);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__33126);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1528:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1532:1: ( ( '{' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1533:1: ( '{' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1533:1: ( '{' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1534:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Class__Group__3__Impl3154); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1547:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1551:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1552:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__43185);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__43188);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1559:1: rule__Class__Group__4__Impl : ( ( rule__Class__MembersAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1563:1: ( ( ( rule__Class__MembersAssignment_4 )* ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1564:1: ( ( rule__Class__MembersAssignment_4 )* )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1564:1: ( ( rule__Class__MembersAssignment_4 )* )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1565:1: ( rule__Class__MembersAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getMembersAssignment_4()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1566:1: ( rule__Class__MembersAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=16 && LA17_0<=19)||LA17_0==27||(LA17_0>=30 && LA17_0<=31)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1566:2: rule__Class__MembersAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Class__MembersAssignment_4_in_rule__Class__Group__4__Impl3215);
            	    rule__Class__MembersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMembersAssignment_4()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1576:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1580:1: ( rule__Class__Group__5__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1581:2: rule__Class__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__53246);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1587:1: rule__Class__Group__5__Impl : ( '}' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1591:1: ( ( '}' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1592:1: ( '}' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1592:1: ( '}' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1593:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Class__Group__5__Impl3274); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Inheritance__Group_0__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1618:1: rule__Inheritance__Group_0__0 : rule__Inheritance__Group_0__0__Impl rule__Inheritance__Group_0__1 ;
    public final void rule__Inheritance__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1622:1: ( rule__Inheritance__Group_0__0__Impl rule__Inheritance__Group_0__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1623:2: rule__Inheritance__Group_0__0__Impl rule__Inheritance__Group_0__1
            {
            pushFollow(FOLLOW_rule__Inheritance__Group_0__0__Impl_in_rule__Inheritance__Group_0__03317);
            rule__Inheritance__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Inheritance__Group_0__1_in_rule__Inheritance__Group_0__03320);
            rule__Inheritance__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group_0__0"


    // $ANTLR start "rule__Inheritance__Group_0__0__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1630:1: rule__Inheritance__Group_0__0__Impl : ( 'extends' ) ;
    public final void rule__Inheritance__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1634:1: ( ( 'extends' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1635:1: ( 'extends' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1635:1: ( 'extends' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1636:1: 'extends'
            {
             before(grammarAccess.getInheritanceAccess().getExtendsKeyword_0_0()); 
            match(input,28,FOLLOW_28_in_rule__Inheritance__Group_0__0__Impl3348); 
             after(grammarAccess.getInheritanceAccess().getExtendsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group_0__0__Impl"


    // $ANTLR start "rule__Inheritance__Group_0__1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1649:1: rule__Inheritance__Group_0__1 : rule__Inheritance__Group_0__1__Impl ;
    public final void rule__Inheritance__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1653:1: ( rule__Inheritance__Group_0__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1654:2: rule__Inheritance__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Inheritance__Group_0__1__Impl_in_rule__Inheritance__Group_0__13379);
            rule__Inheritance__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group_0__1"


    // $ANTLR start "rule__Inheritance__Group_0__1__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1660:1: rule__Inheritance__Group_0__1__Impl : ( ( rule__Inheritance__TypeAssignment_0_1 ) ) ;
    public final void rule__Inheritance__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1664:1: ( ( ( rule__Inheritance__TypeAssignment_0_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1665:1: ( ( rule__Inheritance__TypeAssignment_0_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1665:1: ( ( rule__Inheritance__TypeAssignment_0_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1666:1: ( rule__Inheritance__TypeAssignment_0_1 )
            {
             before(grammarAccess.getInheritanceAccess().getTypeAssignment_0_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1667:1: ( rule__Inheritance__TypeAssignment_0_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1667:2: rule__Inheritance__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Inheritance__TypeAssignment_0_1_in_rule__Inheritance__Group_0__1__Impl3406);
            rule__Inheritance__TypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceAccess().getTypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group_0__1__Impl"


    // $ANTLR start "rule__Inheritance__Group_1__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1681:1: rule__Inheritance__Group_1__0 : rule__Inheritance__Group_1__0__Impl rule__Inheritance__Group_1__1 ;
    public final void rule__Inheritance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1685:1: ( rule__Inheritance__Group_1__0__Impl rule__Inheritance__Group_1__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1686:2: rule__Inheritance__Group_1__0__Impl rule__Inheritance__Group_1__1
            {
            pushFollow(FOLLOW_rule__Inheritance__Group_1__0__Impl_in_rule__Inheritance__Group_1__03440);
            rule__Inheritance__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Inheritance__Group_1__1_in_rule__Inheritance__Group_1__03443);
            rule__Inheritance__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group_1__0"


    // $ANTLR start "rule__Inheritance__Group_1__0__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1693:1: rule__Inheritance__Group_1__0__Impl : ( 'implements' ) ;
    public final void rule__Inheritance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1697:1: ( ( 'implements' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1698:1: ( 'implements' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1698:1: ( 'implements' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1699:1: 'implements'
            {
             before(grammarAccess.getInheritanceAccess().getImplementsKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Inheritance__Group_1__0__Impl3471); 
             after(grammarAccess.getInheritanceAccess().getImplementsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group_1__0__Impl"


    // $ANTLR start "rule__Inheritance__Group_1__1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1712:1: rule__Inheritance__Group_1__1 : rule__Inheritance__Group_1__1__Impl ;
    public final void rule__Inheritance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1716:1: ( rule__Inheritance__Group_1__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1717:2: rule__Inheritance__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Inheritance__Group_1__1__Impl_in_rule__Inheritance__Group_1__13502);
            rule__Inheritance__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group_1__1"


    // $ANTLR start "rule__Inheritance__Group_1__1__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1723:1: rule__Inheritance__Group_1__1__Impl : ( ( rule__Inheritance__TypeAssignment_1_1 ) ) ;
    public final void rule__Inheritance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1727:1: ( ( ( rule__Inheritance__TypeAssignment_1_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1728:1: ( ( rule__Inheritance__TypeAssignment_1_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1728:1: ( ( rule__Inheritance__TypeAssignment_1_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1729:1: ( rule__Inheritance__TypeAssignment_1_1 )
            {
             before(grammarAccess.getInheritanceAccess().getTypeAssignment_1_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1730:1: ( rule__Inheritance__TypeAssignment_1_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1730:2: rule__Inheritance__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Inheritance__TypeAssignment_1_1_in_rule__Inheritance__Group_1__1__Impl3529);
            rule__Inheritance__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceAccess().getTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1744:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1748:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1749:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03563);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03566);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1756:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__VisibilityAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1760:1: ( ( ( rule__Attribute__VisibilityAssignment_0 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1761:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1761:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1762:1: ( rule__Attribute__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1763:1: ( rule__Attribute__VisibilityAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=16 && LA18_0<=19)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1763:2: rule__Attribute__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__VisibilityAssignment_0_in_rule__Attribute__Group__0__Impl3593);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1773:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1777:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1778:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13624);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13627);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1785:1: rule__Attribute__Group__1__Impl : ( ( 'static' )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1789:1: ( ( ( 'static' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1790:1: ( ( 'static' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1790:1: ( ( 'static' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1791:1: ( 'static' )?
            {
             before(grammarAccess.getAttributeAccess().getStaticKeyword_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1792:1: ( 'static' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1793:2: 'static'
                    {
                    match(input,30,FOLLOW_30_in_rule__Attribute__Group__1__Impl3656); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getStaticKeyword_1()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1804:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1808:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1809:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23689);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__23692);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1816:1: rule__Attribute__Group__2__Impl : ( ( 'final' )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1820:1: ( ( ( 'final' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1821:1: ( ( 'final' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1821:1: ( ( 'final' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1822:1: ( 'final' )?
            {
             before(grammarAccess.getAttributeAccess().getFinalKeyword_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1823:1: ( 'final' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1824:2: 'final'
                    {
                    match(input,31,FOLLOW_31_in_rule__Attribute__Group__2__Impl3721); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getFinalKeyword_2()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1835:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1839:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1840:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__33754);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__33757);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1847:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1851:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1852:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1852:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1853:1: ( rule__Attribute__NameAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1854:1: ( rule__Attribute__NameAssignment_3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1854:2: rule__Attribute__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_3_in_rule__Attribute__Group__3__Impl3784);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1864:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1868:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1869:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__43814);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__43817);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1876:1: rule__Attribute__Group__4__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1880:1: ( ( ':' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1881:1: ( ':' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1881:1: ( ':' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1882:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Attribute__Group__4__Impl3845); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1895:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1899:1: ( rule__Attribute__Group__5__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1900:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__53876);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1906:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__TypeAssignment_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1910:1: ( ( ( rule__Attribute__TypeAssignment_5 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1911:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1911:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1912:1: ( rule__Attribute__TypeAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1913:1: ( rule__Attribute__TypeAssignment_5 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1913:2: rule__Attribute__TypeAssignment_5
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_5_in_rule__Attribute__Group__5__Impl3903);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1935:1: rule__Methode__Group__0 : rule__Methode__Group__0__Impl rule__Methode__Group__1 ;
    public final void rule__Methode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1939:1: ( rule__Methode__Group__0__Impl rule__Methode__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1940:2: rule__Methode__Group__0__Impl rule__Methode__Group__1
            {
            pushFollow(FOLLOW_rule__Methode__Group__0__Impl_in_rule__Methode__Group__03945);
            rule__Methode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__1_in_rule__Methode__Group__03948);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1947:1: rule__Methode__Group__0__Impl : ( ( rule__Methode__VisibilityAssignment_0 )? ) ;
    public final void rule__Methode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1951:1: ( ( ( rule__Methode__VisibilityAssignment_0 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1952:1: ( ( rule__Methode__VisibilityAssignment_0 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1952:1: ( ( rule__Methode__VisibilityAssignment_0 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1953:1: ( rule__Methode__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getMethodeAccess().getVisibilityAssignment_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1954:1: ( rule__Methode__VisibilityAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=16 && LA21_0<=19)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1954:2: rule__Methode__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Methode__VisibilityAssignment_0_in_rule__Methode__Group__0__Impl3975);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1964:1: rule__Methode__Group__1 : rule__Methode__Group__1__Impl rule__Methode__Group__2 ;
    public final void rule__Methode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1968:1: ( rule__Methode__Group__1__Impl rule__Methode__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1969:2: rule__Methode__Group__1__Impl rule__Methode__Group__2
            {
            pushFollow(FOLLOW_rule__Methode__Group__1__Impl_in_rule__Methode__Group__14006);
            rule__Methode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__2_in_rule__Methode__Group__14009);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1976:1: rule__Methode__Group__1__Impl : ( ( 'abstract' )? ) ;
    public final void rule__Methode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1980:1: ( ( ( 'abstract' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1981:1: ( ( 'abstract' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1981:1: ( ( 'abstract' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1982:1: ( 'abstract' )?
            {
             before(grammarAccess.getMethodeAccess().getAbstractKeyword_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1983:1: ( 'abstract' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1984:2: 'abstract'
                    {
                    match(input,27,FOLLOW_27_in_rule__Methode__Group__1__Impl4038); 

                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getAbstractKeyword_1()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1995:1: rule__Methode__Group__2 : rule__Methode__Group__2__Impl rule__Methode__Group__3 ;
    public final void rule__Methode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1999:1: ( rule__Methode__Group__2__Impl rule__Methode__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2000:2: rule__Methode__Group__2__Impl rule__Methode__Group__3
            {
            pushFollow(FOLLOW_rule__Methode__Group__2__Impl_in_rule__Methode__Group__24071);
            rule__Methode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__3_in_rule__Methode__Group__24074);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2007:1: rule__Methode__Group__2__Impl : ( ( 'static' )? ) ;
    public final void rule__Methode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2011:1: ( ( ( 'static' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2012:1: ( ( 'static' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2012:1: ( ( 'static' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2013:1: ( 'static' )?
            {
             before(grammarAccess.getMethodeAccess().getStaticKeyword_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2014:1: ( 'static' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2015:2: 'static'
                    {
                    match(input,30,FOLLOW_30_in_rule__Methode__Group__2__Impl4103); 

                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getStaticKeyword_2()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2026:1: rule__Methode__Group__3 : rule__Methode__Group__3__Impl rule__Methode__Group__4 ;
    public final void rule__Methode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2030:1: ( rule__Methode__Group__3__Impl rule__Methode__Group__4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2031:2: rule__Methode__Group__3__Impl rule__Methode__Group__4
            {
            pushFollow(FOLLOW_rule__Methode__Group__3__Impl_in_rule__Methode__Group__34136);
            rule__Methode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__4_in_rule__Methode__Group__34139);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2038:1: rule__Methode__Group__3__Impl : ( ( 'final' )? ) ;
    public final void rule__Methode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2042:1: ( ( ( 'final' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2043:1: ( ( 'final' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2043:1: ( ( 'final' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2044:1: ( 'final' )?
            {
             before(grammarAccess.getMethodeAccess().getFinalKeyword_3()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2045:1: ( 'final' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2046:2: 'final'
                    {
                    match(input,31,FOLLOW_31_in_rule__Methode__Group__3__Impl4168); 

                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getFinalKeyword_3()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2057:1: rule__Methode__Group__4 : rule__Methode__Group__4__Impl rule__Methode__Group__5 ;
    public final void rule__Methode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2061:1: ( rule__Methode__Group__4__Impl rule__Methode__Group__5 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2062:2: rule__Methode__Group__4__Impl rule__Methode__Group__5
            {
            pushFollow(FOLLOW_rule__Methode__Group__4__Impl_in_rule__Methode__Group__44201);
            rule__Methode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__5_in_rule__Methode__Group__44204);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2069:1: rule__Methode__Group__4__Impl : ( ( rule__Methode__NameAssignment_4 ) ) ;
    public final void rule__Methode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2073:1: ( ( ( rule__Methode__NameAssignment_4 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2074:1: ( ( rule__Methode__NameAssignment_4 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2074:1: ( ( rule__Methode__NameAssignment_4 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2075:1: ( rule__Methode__NameAssignment_4 )
            {
             before(grammarAccess.getMethodeAccess().getNameAssignment_4()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2076:1: ( rule__Methode__NameAssignment_4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2076:2: rule__Methode__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Methode__NameAssignment_4_in_rule__Methode__Group__4__Impl4231);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2086:1: rule__Methode__Group__5 : rule__Methode__Group__5__Impl rule__Methode__Group__6 ;
    public final void rule__Methode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2090:1: ( rule__Methode__Group__5__Impl rule__Methode__Group__6 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2091:2: rule__Methode__Group__5__Impl rule__Methode__Group__6
            {
            pushFollow(FOLLOW_rule__Methode__Group__5__Impl_in_rule__Methode__Group__54261);
            rule__Methode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__6_in_rule__Methode__Group__54264);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2098:1: rule__Methode__Group__5__Impl : ( '(' ) ;
    public final void rule__Methode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2102:1: ( ( '(' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2103:1: ( '(' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2103:1: ( '(' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2104:1: '('
            {
             before(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__Methode__Group__5__Impl4292); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2117:1: rule__Methode__Group__6 : rule__Methode__Group__6__Impl rule__Methode__Group__7 ;
    public final void rule__Methode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2121:1: ( rule__Methode__Group__6__Impl rule__Methode__Group__7 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2122:2: rule__Methode__Group__6__Impl rule__Methode__Group__7
            {
            pushFollow(FOLLOW_rule__Methode__Group__6__Impl_in_rule__Methode__Group__64323);
            rule__Methode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__7_in_rule__Methode__Group__64326);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2129:1: rule__Methode__Group__6__Impl : ( ( rule__Methode__Group_6__0 )* ) ;
    public final void rule__Methode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2133:1: ( ( ( rule__Methode__Group_6__0 )* ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2134:1: ( ( rule__Methode__Group_6__0 )* )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2134:1: ( ( rule__Methode__Group_6__0 )* )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2135:1: ( rule__Methode__Group_6__0 )*
            {
             before(grammarAccess.getMethodeAccess().getGroup_6()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2136:1: ( rule__Methode__Group_6__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=16 && LA25_0<=19)||(LA25_0>=30 && LA25_0<=31)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2136:2: rule__Methode__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Methode__Group_6__0_in_rule__Methode__Group__6__Impl4353);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2146:1: rule__Methode__Group__7 : rule__Methode__Group__7__Impl rule__Methode__Group__8 ;
    public final void rule__Methode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2150:1: ( rule__Methode__Group__7__Impl rule__Methode__Group__8 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2151:2: rule__Methode__Group__7__Impl rule__Methode__Group__8
            {
            pushFollow(FOLLOW_rule__Methode__Group__7__Impl_in_rule__Methode__Group__74384);
            rule__Methode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__8_in_rule__Methode__Group__74387);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2158:1: rule__Methode__Group__7__Impl : ( ')' ) ;
    public final void rule__Methode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2162:1: ( ( ')' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2163:1: ( ')' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2163:1: ( ')' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2164:1: ')'
            {
             before(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_7()); 
            match(input,34,FOLLOW_34_in_rule__Methode__Group__7__Impl4415); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2177:1: rule__Methode__Group__8 : rule__Methode__Group__8__Impl ;
    public final void rule__Methode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2181:1: ( rule__Methode__Group__8__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2182:2: rule__Methode__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group__8__Impl_in_rule__Methode__Group__84446);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2188:1: rule__Methode__Group__8__Impl : ( ( rule__Methode__Group_8__0 )? ) ;
    public final void rule__Methode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2192:1: ( ( ( rule__Methode__Group_8__0 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2193:1: ( ( rule__Methode__Group_8__0 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2193:1: ( ( rule__Methode__Group_8__0 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2194:1: ( rule__Methode__Group_8__0 )?
            {
             before(grammarAccess.getMethodeAccess().getGroup_8()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2195:1: ( rule__Methode__Group_8__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2195:2: rule__Methode__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Methode__Group_8__0_in_rule__Methode__Group__8__Impl4473);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2223:1: rule__Methode__Group_6__0 : rule__Methode__Group_6__0__Impl rule__Methode__Group_6__1 ;
    public final void rule__Methode__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2227:1: ( rule__Methode__Group_6__0__Impl rule__Methode__Group_6__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2228:2: rule__Methode__Group_6__0__Impl rule__Methode__Group_6__1
            {
            pushFollow(FOLLOW_rule__Methode__Group_6__0__Impl_in_rule__Methode__Group_6__04522);
            rule__Methode__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group_6__1_in_rule__Methode__Group_6__04525);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2235:1: rule__Methode__Group_6__0__Impl : ( ( rule__Methode__AttributesAssignment_6_0 ) ) ;
    public final void rule__Methode__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2239:1: ( ( ( rule__Methode__AttributesAssignment_6_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2240:1: ( ( rule__Methode__AttributesAssignment_6_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2240:1: ( ( rule__Methode__AttributesAssignment_6_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2241:1: ( rule__Methode__AttributesAssignment_6_0 )
            {
             before(grammarAccess.getMethodeAccess().getAttributesAssignment_6_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2242:1: ( rule__Methode__AttributesAssignment_6_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2242:2: rule__Methode__AttributesAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Methode__AttributesAssignment_6_0_in_rule__Methode__Group_6__0__Impl4552);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2252:1: rule__Methode__Group_6__1 : rule__Methode__Group_6__1__Impl ;
    public final void rule__Methode__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2256:1: ( rule__Methode__Group_6__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2257:2: rule__Methode__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group_6__1__Impl_in_rule__Methode__Group_6__14582);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2263:1: rule__Methode__Group_6__1__Impl : ( ( rule__Methode__Group_6_1__0 )* ) ;
    public final void rule__Methode__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2267:1: ( ( ( rule__Methode__Group_6_1__0 )* ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2268:1: ( ( rule__Methode__Group_6_1__0 )* )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2268:1: ( ( rule__Methode__Group_6_1__0 )* )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2269:1: ( rule__Methode__Group_6_1__0 )*
            {
             before(grammarAccess.getMethodeAccess().getGroup_6_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2270:1: ( rule__Methode__Group_6_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2270:2: rule__Methode__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Methode__Group_6_1__0_in_rule__Methode__Group_6__1__Impl4609);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2284:1: rule__Methode__Group_6_1__0 : rule__Methode__Group_6_1__0__Impl rule__Methode__Group_6_1__1 ;
    public final void rule__Methode__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2288:1: ( rule__Methode__Group_6_1__0__Impl rule__Methode__Group_6_1__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2289:2: rule__Methode__Group_6_1__0__Impl rule__Methode__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__Methode__Group_6_1__0__Impl_in_rule__Methode__Group_6_1__04644);
            rule__Methode__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group_6_1__1_in_rule__Methode__Group_6_1__04647);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2296:1: rule__Methode__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Methode__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2300:1: ( ( ',' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2301:1: ( ',' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2301:1: ( ',' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2302:1: ','
            {
             before(grammarAccess.getMethodeAccess().getCommaKeyword_6_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Methode__Group_6_1__0__Impl4675); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2315:1: rule__Methode__Group_6_1__1 : rule__Methode__Group_6_1__1__Impl ;
    public final void rule__Methode__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2319:1: ( rule__Methode__Group_6_1__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2320:2: rule__Methode__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group_6_1__1__Impl_in_rule__Methode__Group_6_1__14706);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2326:1: rule__Methode__Group_6_1__1__Impl : ( ( rule__Methode__AttributesAssignment_6_1_1 ) ) ;
    public final void rule__Methode__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2330:1: ( ( ( rule__Methode__AttributesAssignment_6_1_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2331:1: ( ( rule__Methode__AttributesAssignment_6_1_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2331:1: ( ( rule__Methode__AttributesAssignment_6_1_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2332:1: ( rule__Methode__AttributesAssignment_6_1_1 )
            {
             before(grammarAccess.getMethodeAccess().getAttributesAssignment_6_1_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2333:1: ( rule__Methode__AttributesAssignment_6_1_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2333:2: rule__Methode__AttributesAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__Methode__AttributesAssignment_6_1_1_in_rule__Methode__Group_6_1__1__Impl4733);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2347:1: rule__Methode__Group_8__0 : rule__Methode__Group_8__0__Impl rule__Methode__Group_8__1 ;
    public final void rule__Methode__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2351:1: ( rule__Methode__Group_8__0__Impl rule__Methode__Group_8__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2352:2: rule__Methode__Group_8__0__Impl rule__Methode__Group_8__1
            {
            pushFollow(FOLLOW_rule__Methode__Group_8__0__Impl_in_rule__Methode__Group_8__04767);
            rule__Methode__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group_8__1_in_rule__Methode__Group_8__04770);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2359:1: rule__Methode__Group_8__0__Impl : ( ':' ) ;
    public final void rule__Methode__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2363:1: ( ( ':' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2364:1: ( ':' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2364:1: ( ':' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2365:1: ':'
            {
             before(grammarAccess.getMethodeAccess().getColonKeyword_8_0()); 
            match(input,32,FOLLOW_32_in_rule__Methode__Group_8__0__Impl4798); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2378:1: rule__Methode__Group_8__1 : rule__Methode__Group_8__1__Impl ;
    public final void rule__Methode__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2382:1: ( rule__Methode__Group_8__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2383:2: rule__Methode__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group_8__1__Impl_in_rule__Methode__Group_8__14829);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2389:1: rule__Methode__Group_8__1__Impl : ( ( rule__Methode__TypeAssignment_8_1 ) ) ;
    public final void rule__Methode__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2393:1: ( ( ( rule__Methode__TypeAssignment_8_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2394:1: ( ( rule__Methode__TypeAssignment_8_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2394:1: ( ( rule__Methode__TypeAssignment_8_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2395:1: ( rule__Methode__TypeAssignment_8_1 )
            {
             before(grammarAccess.getMethodeAccess().getTypeAssignment_8_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2396:1: ( rule__Methode__TypeAssignment_8_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2396:2: rule__Methode__TypeAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Methode__TypeAssignment_8_1_in_rule__Methode__Group_8__1__Impl4856);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2410:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2414:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2415:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_rule__Generalization__Group__0__Impl_in_rule__Generalization__Group__04890);
            rule__Generalization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalization__Group__1_in_rule__Generalization__Group__04893);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2422:1: rule__Generalization__Group__0__Impl : ( ( rule__Generalization__LeftAssignment_0 ) ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2426:1: ( ( ( rule__Generalization__LeftAssignment_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2427:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2427:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2428:1: ( rule__Generalization__LeftAssignment_0 )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssignment_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2429:1: ( rule__Generalization__LeftAssignment_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2429:2: rule__Generalization__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Generalization__LeftAssignment_0_in_rule__Generalization__Group__0__Impl4920);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2439:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2443:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2444:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_rule__Generalization__Group__1__Impl_in_rule__Generalization__Group__14950);
            rule__Generalization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalization__Group__2_in_rule__Generalization__Group__14953);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2451:1: rule__Generalization__Group__1__Impl : ( 'isa' ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2455:1: ( ( 'isa' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2456:1: ( 'isa' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2456:1: ( 'isa' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2457:1: 'isa'
            {
             before(grammarAccess.getGeneralizationAccess().getIsaKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__Generalization__Group__1__Impl4981); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2470:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2474:1: ( rule__Generalization__Group__2__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2475:2: rule__Generalization__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Generalization__Group__2__Impl_in_rule__Generalization__Group__25012);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2481:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__RightAssignment_2 ) ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2485:1: ( ( ( rule__Generalization__RightAssignment_2 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2486:1: ( ( rule__Generalization__RightAssignment_2 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2486:1: ( ( rule__Generalization__RightAssignment_2 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2487:1: ( rule__Generalization__RightAssignment_2 )
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2488:1: ( rule__Generalization__RightAssignment_2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2488:2: rule__Generalization__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Generalization__RightAssignment_2_in_rule__Generalization__Group__2__Impl5039);
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


    // $ANTLR start "rule__Association__Group__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2504:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2508:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2509:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__05075);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__05078);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2516:1: rule__Association__Group__0__Impl : ( ( rule__Association__LeftAssignment_0 ) ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2520:1: ( ( ( rule__Association__LeftAssignment_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2521:1: ( ( rule__Association__LeftAssignment_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2521:1: ( ( rule__Association__LeftAssignment_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2522:1: ( rule__Association__LeftAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getLeftAssignment_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2523:1: ( rule__Association__LeftAssignment_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2523:2: rule__Association__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Association__LeftAssignment_0_in_rule__Association__Group__0__Impl5105);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2533:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2537:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2538:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__15135);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__15138);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2545:1: rule__Association__Group__1__Impl : ( '-' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2549:1: ( ( '-' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2550:1: ( '-' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2550:1: ( '-' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2551:1: '-'
            {
             before(grammarAccess.getAssociationAccess().getHyphenMinusKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Association__Group__1__Impl5166); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2564:1: rule__Association__Group__2 : rule__Association__Group__2__Impl ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2568:1: ( rule__Association__Group__2__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2569:2: rule__Association__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__25197);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2575:1: rule__Association__Group__2__Impl : ( ( rule__Association__Alternatives_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2579:1: ( ( ( rule__Association__Alternatives_2 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2580:1: ( ( rule__Association__Alternatives_2 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2580:1: ( ( rule__Association__Alternatives_2 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2581:1: ( rule__Association__Alternatives_2 )
            {
             before(grammarAccess.getAssociationAccess().getAlternatives_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2582:1: ( rule__Association__Alternatives_2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2582:2: rule__Association__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Association__Alternatives_2_in_rule__Association__Group__2__Impl5224);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2598:1: rule__Association__Group_2_0__0 : rule__Association__Group_2_0__0__Impl rule__Association__Group_2_0__1 ;
    public final void rule__Association__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2602:1: ( rule__Association__Group_2_0__0__Impl rule__Association__Group_2_0__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2603:2: rule__Association__Group_2_0__0__Impl rule__Association__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Association__Group_2_0__0__Impl_in_rule__Association__Group_2_0__05260);
            rule__Association__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_2_0__1_in_rule__Association__Group_2_0__05263);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2610:1: rule__Association__Group_2_0__0__Impl : ( ( rule__Association__RightAssignment_2_0_0 ) ) ;
    public final void rule__Association__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2614:1: ( ( ( rule__Association__RightAssignment_2_0_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2615:1: ( ( rule__Association__RightAssignment_2_0_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2615:1: ( ( rule__Association__RightAssignment_2_0_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2616:1: ( rule__Association__RightAssignment_2_0_0 )
            {
             before(grammarAccess.getAssociationAccess().getRightAssignment_2_0_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2617:1: ( rule__Association__RightAssignment_2_0_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2617:2: rule__Association__RightAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__Association__RightAssignment_2_0_0_in_rule__Association__Group_2_0__0__Impl5290);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2627:1: rule__Association__Group_2_0__1 : rule__Association__Group_2_0__1__Impl rule__Association__Group_2_0__2 ;
    public final void rule__Association__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2631:1: ( rule__Association__Group_2_0__1__Impl rule__Association__Group_2_0__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2632:2: rule__Association__Group_2_0__1__Impl rule__Association__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Association__Group_2_0__1__Impl_in_rule__Association__Group_2_0__15320);
            rule__Association__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_2_0__2_in_rule__Association__Group_2_0__15323);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2639:1: rule__Association__Group_2_0__1__Impl : ( ( rule__Association__CardinalityAssignment_2_0_1 )? ) ;
    public final void rule__Association__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2643:1: ( ( ( rule__Association__CardinalityAssignment_2_0_1 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2644:1: ( ( rule__Association__CardinalityAssignment_2_0_1 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2644:1: ( ( rule__Association__CardinalityAssignment_2_0_1 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2645:1: ( rule__Association__CardinalityAssignment_2_0_1 )?
            {
             before(grammarAccess.getAssociationAccess().getCardinalityAssignment_2_0_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2646:1: ( rule__Association__CardinalityAssignment_2_0_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2646:2: rule__Association__CardinalityAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_rule__Association__CardinalityAssignment_2_0_1_in_rule__Association__Group_2_0__1__Impl5350);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2656:1: rule__Association__Group_2_0__2 : rule__Association__Group_2_0__2__Impl ;
    public final void rule__Association__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2660:1: ( rule__Association__Group_2_0__2__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2661:2: rule__Association__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group_2_0__2__Impl_in_rule__Association__Group_2_0__25381);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2667:1: rule__Association__Group_2_0__2__Impl : ( ( rule__Association__NoteAssignment_2_0_2 )? ) ;
    public final void rule__Association__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2671:1: ( ( ( rule__Association__NoteAssignment_2_0_2 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2672:1: ( ( rule__Association__NoteAssignment_2_0_2 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2672:1: ( ( rule__Association__NoteAssignment_2_0_2 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2673:1: ( rule__Association__NoteAssignment_2_0_2 )?
            {
             before(grammarAccess.getAssociationAccess().getNoteAssignment_2_0_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2674:1: ( rule__Association__NoteAssignment_2_0_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2674:2: rule__Association__NoteAssignment_2_0_2
                    {
                    pushFollow(FOLLOW_rule__Association__NoteAssignment_2_0_2_in_rule__Association__Group_2_0__2__Impl5408);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2690:1: rule__ConnectorCardinalitiy__Group__0 : rule__ConnectorCardinalitiy__Group__0__Impl rule__ConnectorCardinalitiy__Group__1 ;
    public final void rule__ConnectorCardinalitiy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2694:1: ( rule__ConnectorCardinalitiy__Group__0__Impl rule__ConnectorCardinalitiy__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2695:2: rule__ConnectorCardinalitiy__Group__0__Impl rule__ConnectorCardinalitiy__Group__1
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__0__Impl_in_rule__ConnectorCardinalitiy__Group__05445);
            rule__ConnectorCardinalitiy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__1_in_rule__ConnectorCardinalitiy__Group__05448);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2702:1: rule__ConnectorCardinalitiy__Group__0__Impl : ( () ) ;
    public final void rule__ConnectorCardinalitiy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2706:1: ( ( () ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2707:1: ( () )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2707:1: ( () )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2708:1: ()
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getConnectorCardinalitiyAction_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2709:1: ()
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2711:1: 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2721:1: rule__ConnectorCardinalitiy__Group__1 : rule__ConnectorCardinalitiy__Group__1__Impl rule__ConnectorCardinalitiy__Group__2 ;
    public final void rule__ConnectorCardinalitiy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2725:1: ( rule__ConnectorCardinalitiy__Group__1__Impl rule__ConnectorCardinalitiy__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2726:2: rule__ConnectorCardinalitiy__Group__1__Impl rule__ConnectorCardinalitiy__Group__2
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__1__Impl_in_rule__ConnectorCardinalitiy__Group__15506);
            rule__ConnectorCardinalitiy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__2_in_rule__ConnectorCardinalitiy__Group__15509);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2733:1: rule__ConnectorCardinalitiy__Group__1__Impl : ( '[' ) ;
    public final void rule__ConnectorCardinalitiy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2737:1: ( ( '[' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2738:1: ( '[' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2738:1: ( '[' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2739:1: '['
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getLeftSquareBracketKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__ConnectorCardinalitiy__Group__1__Impl5537); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2752:1: rule__ConnectorCardinalitiy__Group__2 : rule__ConnectorCardinalitiy__Group__2__Impl rule__ConnectorCardinalitiy__Group__3 ;
    public final void rule__ConnectorCardinalitiy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2756:1: ( rule__ConnectorCardinalitiy__Group__2__Impl rule__ConnectorCardinalitiy__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2757:2: rule__ConnectorCardinalitiy__Group__2__Impl rule__ConnectorCardinalitiy__Group__3
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__2__Impl_in_rule__ConnectorCardinalitiy__Group__25568);
            rule__ConnectorCardinalitiy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__3_in_rule__ConnectorCardinalitiy__Group__25571);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2764:1: rule__ConnectorCardinalitiy__Group__2__Impl : ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2768:1: ( ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2769:1: ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2769:1: ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2770:1: ( rule__ConnectorCardinalitiy__LeftAssignment_2 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getLeftAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2771:1: ( rule__ConnectorCardinalitiy__LeftAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==15) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2771:2: rule__ConnectorCardinalitiy__LeftAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__LeftAssignment_2_in_rule__ConnectorCardinalitiy__Group__2__Impl5598);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2781:1: rule__ConnectorCardinalitiy__Group__3 : rule__ConnectorCardinalitiy__Group__3__Impl rule__ConnectorCardinalitiy__Group__4 ;
    public final void rule__ConnectorCardinalitiy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2785:1: ( rule__ConnectorCardinalitiy__Group__3__Impl rule__ConnectorCardinalitiy__Group__4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2786:2: rule__ConnectorCardinalitiy__Group__3__Impl rule__ConnectorCardinalitiy__Group__4
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__3__Impl_in_rule__ConnectorCardinalitiy__Group__35629);
            rule__ConnectorCardinalitiy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__4_in_rule__ConnectorCardinalitiy__Group__35632);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2793:1: rule__ConnectorCardinalitiy__Group__3__Impl : ( ( rule__ConnectorCardinalitiy__Group_3__0 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2797:1: ( ( ( rule__ConnectorCardinalitiy__Group_3__0 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2798:1: ( ( rule__ConnectorCardinalitiy__Group_3__0 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2798:1: ( ( rule__ConnectorCardinalitiy__Group_3__0 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2799:1: ( rule__ConnectorCardinalitiy__Group_3__0 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getGroup_3()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2800:1: ( rule__ConnectorCardinalitiy__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2800:2: rule__ConnectorCardinalitiy__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_3__0_in_rule__ConnectorCardinalitiy__Group__3__Impl5659);
                    rule__ConnectorCardinalitiy__Group_3__0();

                    state._fsp--;


                    }
                    break;

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2810:1: rule__ConnectorCardinalitiy__Group__4 : rule__ConnectorCardinalitiy__Group__4__Impl rule__ConnectorCardinalitiy__Group__5 ;
    public final void rule__ConnectorCardinalitiy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2814:1: ( rule__ConnectorCardinalitiy__Group__4__Impl rule__ConnectorCardinalitiy__Group__5 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2815:2: rule__ConnectorCardinalitiy__Group__4__Impl rule__ConnectorCardinalitiy__Group__5
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__4__Impl_in_rule__ConnectorCardinalitiy__Group__45690);
            rule__ConnectorCardinalitiy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__5_in_rule__ConnectorCardinalitiy__Group__45693);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2822:1: rule__ConnectorCardinalitiy__Group__4__Impl : ( ( rule__ConnectorCardinalitiy__Group_4__0 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2826:1: ( ( ( rule__ConnectorCardinalitiy__Group_4__0 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2827:1: ( ( rule__ConnectorCardinalitiy__Group_4__0 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2827:1: ( ( rule__ConnectorCardinalitiy__Group_4__0 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2828:1: ( rule__ConnectorCardinalitiy__Group_4__0 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getGroup_4()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2829:1: ( rule__ConnectorCardinalitiy__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2829:2: rule__ConnectorCardinalitiy__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__0_in_rule__ConnectorCardinalitiy__Group__4__Impl5720);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2839:1: rule__ConnectorCardinalitiy__Group__5 : rule__ConnectorCardinalitiy__Group__5__Impl ;
    public final void rule__ConnectorCardinalitiy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2843:1: ( rule__ConnectorCardinalitiy__Group__5__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2844:2: rule__ConnectorCardinalitiy__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__5__Impl_in_rule__ConnectorCardinalitiy__Group__55751);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2850:1: rule__ConnectorCardinalitiy__Group__5__Impl : ( ']' ) ;
    public final void rule__ConnectorCardinalitiy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2854:1: ( ( ']' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2855:1: ( ']' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2855:1: ( ']' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2856:1: ']'
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getRightSquareBracketKeyword_5()); 
            match(input,37,FOLLOW_37_in_rule__ConnectorCardinalitiy__Group__5__Impl5779); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2881:1: rule__ConnectorCardinalitiy__Group_3__0 : rule__ConnectorCardinalitiy__Group_3__0__Impl rule__ConnectorCardinalitiy__Group_3__1 ;
    public final void rule__ConnectorCardinalitiy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2885:1: ( rule__ConnectorCardinalitiy__Group_3__0__Impl rule__ConnectorCardinalitiy__Group_3__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2886:2: rule__ConnectorCardinalitiy__Group_3__0__Impl rule__ConnectorCardinalitiy__Group_3__1
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_3__0__Impl_in_rule__ConnectorCardinalitiy__Group_3__05822);
            rule__ConnectorCardinalitiy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_3__1_in_rule__ConnectorCardinalitiy__Group_3__05825);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2893:1: rule__ConnectorCardinalitiy__Group_3__0__Impl : ( '|' ) ;
    public final void rule__ConnectorCardinalitiy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2897:1: ( ( '|' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2898:1: ( '|' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2898:1: ( '|' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2899:1: '|'
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_3_0()); 
            match(input,38,FOLLOW_38_in_rule__ConnectorCardinalitiy__Group_3__0__Impl5853); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2912:1: rule__ConnectorCardinalitiy__Group_3__1 : rule__ConnectorCardinalitiy__Group_3__1__Impl ;
    public final void rule__ConnectorCardinalitiy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2916:1: ( rule__ConnectorCardinalitiy__Group_3__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2917:2: rule__ConnectorCardinalitiy__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_3__1__Impl_in_rule__ConnectorCardinalitiy__Group_3__15884);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2923:1: rule__ConnectorCardinalitiy__Group_3__1__Impl : ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2927:1: ( ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2928:1: ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2928:1: ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2929:1: ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getMiddleAssignment_3_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2930:1: ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT||LA33_0==15) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2930:2: rule__ConnectorCardinalitiy__MiddleAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__MiddleAssignment_3_1_in_rule__ConnectorCardinalitiy__Group_3__1__Impl5911);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2944:1: rule__ConnectorCardinalitiy__Group_4__0 : rule__ConnectorCardinalitiy__Group_4__0__Impl rule__ConnectorCardinalitiy__Group_4__1 ;
    public final void rule__ConnectorCardinalitiy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2948:1: ( rule__ConnectorCardinalitiy__Group_4__0__Impl rule__ConnectorCardinalitiy__Group_4__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2949:2: rule__ConnectorCardinalitiy__Group_4__0__Impl rule__ConnectorCardinalitiy__Group_4__1
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__0__Impl_in_rule__ConnectorCardinalitiy__Group_4__05946);
            rule__ConnectorCardinalitiy__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__1_in_rule__ConnectorCardinalitiy__Group_4__05949);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2956:1: rule__ConnectorCardinalitiy__Group_4__0__Impl : ( '|' ) ;
    public final void rule__ConnectorCardinalitiy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2960:1: ( ( '|' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2961:1: ( '|' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2961:1: ( '|' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2962:1: '|'
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_4_0()); 
            match(input,38,FOLLOW_38_in_rule__ConnectorCardinalitiy__Group_4__0__Impl5977); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2975:1: rule__ConnectorCardinalitiy__Group_4__1 : rule__ConnectorCardinalitiy__Group_4__1__Impl rule__ConnectorCardinalitiy__Group_4__2 ;
    public final void rule__ConnectorCardinalitiy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2979:1: ( rule__ConnectorCardinalitiy__Group_4__1__Impl rule__ConnectorCardinalitiy__Group_4__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2980:2: rule__ConnectorCardinalitiy__Group_4__1__Impl rule__ConnectorCardinalitiy__Group_4__2
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__1__Impl_in_rule__ConnectorCardinalitiy__Group_4__16008);
            rule__ConnectorCardinalitiy__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__2_in_rule__ConnectorCardinalitiy__Group_4__16011);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2987:1: rule__ConnectorCardinalitiy__Group_4__1__Impl : ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2991:1: ( ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2992:1: ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2992:1: ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2993:1: ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getRightAssignment_4_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2994:1: ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2994:2: rule__ConnectorCardinalitiy__RightAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__RightAssignment_4_1_in_rule__ConnectorCardinalitiy__Group_4__1__Impl6038);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3004:1: rule__ConnectorCardinalitiy__Group_4__2 : rule__ConnectorCardinalitiy__Group_4__2__Impl ;
    public final void rule__ConnectorCardinalitiy__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3008:1: ( rule__ConnectorCardinalitiy__Group_4__2__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3009:2: rule__ConnectorCardinalitiy__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__2__Impl_in_rule__ConnectorCardinalitiy__Group_4__26069);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3015:1: rule__ConnectorCardinalitiy__Group_4__2__Impl : ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3019:1: ( ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3020:1: ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3020:1: ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3021:1: ( rule__ConnectorCardinalitiy__Alternatives_4_2 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getAlternatives_4_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3022:1: ( rule__ConnectorCardinalitiy__Alternatives_4_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=13 && LA35_0<=14)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3022:2: rule__ConnectorCardinalitiy__Alternatives_4_2
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Alternatives_4_2_in_rule__ConnectorCardinalitiy__Group_4__2__Impl6096);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3038:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3042:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3043:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1__0__Impl_in_rule__Cardinality__Group_1__06133);
            rule__Cardinality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group_1__1_in_rule__Cardinality__Group_1__06136);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3050:1: rule__Cardinality__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3054:1: ( ( RULE_INT ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3055:1: ( RULE_INT )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3055:1: ( RULE_INT )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3056:1: RULE_INT
            {
             before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Cardinality__Group_1__0__Impl6163); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3067:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl rule__Cardinality__Group_1__2 ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3071:1: ( rule__Cardinality__Group_1__1__Impl rule__Cardinality__Group_1__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3072:2: rule__Cardinality__Group_1__1__Impl rule__Cardinality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1__1__Impl_in_rule__Cardinality__Group_1__16192);
            rule__Cardinality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group_1__2_in_rule__Cardinality__Group_1__16195);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3079:1: rule__Cardinality__Group_1__1__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3083:1: ( ( '..' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3084:1: ( '..' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3084:1: ( '..' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3085:1: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_1()); 
            match(input,39,FOLLOW_39_in_rule__Cardinality__Group_1__1__Impl6223); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3098:1: rule__Cardinality__Group_1__2 : rule__Cardinality__Group_1__2__Impl ;
    public final void rule__Cardinality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3102:1: ( rule__Cardinality__Group_1__2__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3103:2: rule__Cardinality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1__2__Impl_in_rule__Cardinality__Group_1__26254);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3109:1: rule__Cardinality__Group_1__2__Impl : ( ( rule__Cardinality__Alternatives_1_2 ) ) ;
    public final void rule__Cardinality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3113:1: ( ( ( rule__Cardinality__Alternatives_1_2 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3114:1: ( ( rule__Cardinality__Alternatives_1_2 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3114:1: ( ( rule__Cardinality__Alternatives_1_2 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3115:1: ( rule__Cardinality__Alternatives_1_2 )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives_1_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3116:1: ( rule__Cardinality__Alternatives_1_2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3116:2: rule__Cardinality__Alternatives_1_2
            {
            pushFollow(FOLLOW_rule__Cardinality__Alternatives_1_2_in_rule__Cardinality__Group_1__2__Impl6281);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3132:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3136:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3137:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__06317);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__1_in_rule__Note__Group__06320);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3144:1: rule__Note__Group__0__Impl : ( 'note[' ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3148:1: ( ( 'note[' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3149:1: ( 'note[' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3149:1: ( 'note[' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3150:1: 'note['
            {
             before(grammarAccess.getNoteAccess().getNoteKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Note__Group__0__Impl6348); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3163:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3167:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3168:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__16379);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__2_in_rule__Note__Group__16382);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3175:1: rule__Note__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3179:1: ( ( RULE_STRING ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3180:1: ( RULE_STRING )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3180:1: ( RULE_STRING )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3181:1: RULE_STRING
            {
             before(grammarAccess.getNoteAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Note__Group__1__Impl6409); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3192:1: rule__Note__Group__2 : rule__Note__Group__2__Impl ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3196:1: ( rule__Note__Group__2__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3197:2: rule__Note__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__26438);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3203:1: rule__Note__Group__2__Impl : ( ']' ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3207:1: ( ( ']' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3208:1: ( ']' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3208:1: ( ']' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3209:1: ']'
            {
             before(grammarAccess.getNoteAccess().getRightSquareBracketKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__Note__Group__2__Impl6466); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3229:1: rule__ClassDiagram__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__ClassDiagram__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3233:1: ( ( ruleElement ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3234:1: ( ruleElement )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3234:1: ( ruleElement )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3235:1: ruleElement
            {
             before(grammarAccess.getClassDiagramAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__ClassDiagram__ElementsAssignment_26508);
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


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3244:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3248:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3249:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3249:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3250:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_16539); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__ClassDef__ClassesAssignment_2"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3259:1: rule__ClassDef__ClassesAssignment_2 : ( ruleClassName ) ;
    public final void rule__ClassDef__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3263:1: ( ( ruleClassName ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3264:1: ( ruleClassName )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3264:1: ( ruleClassName )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3265:1: ruleClassName
            {
             before(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ClassDef__ClassesAssignment_26570);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3274:1: rule__ClassDef__ClassesAssignment_3_1 : ( ruleClassName ) ;
    public final void rule__ClassDef__ClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3278:1: ( ( ruleClassName ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3279:1: ( ruleClassName )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3279:1: ( ruleClassName )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3280:1: ruleClassName
            {
             before(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ClassDef__ClassesAssignment_3_16601);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3289:1: rule__Name__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3293:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3294:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3294:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3295:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__NameAssignment_06632); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3304:1: rule__Name__LongnameAssignment_1_0 : ( ( rule__Name__LongnameAlternatives_1_0_0 ) ) ;
    public final void rule__Name__LongnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3308:1: ( ( ( rule__Name__LongnameAlternatives_1_0_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3309:1: ( ( rule__Name__LongnameAlternatives_1_0_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3309:1: ( ( rule__Name__LongnameAlternatives_1_0_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3310:1: ( rule__Name__LongnameAlternatives_1_0_0 )
            {
             before(grammarAccess.getNameAccess().getLongnameAlternatives_1_0_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3311:1: ( rule__Name__LongnameAlternatives_1_0_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3311:2: rule__Name__LongnameAlternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__Name__LongnameAlternatives_1_0_0_in_rule__Name__LongnameAssignment_1_06663);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3320:1: rule__Name__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3324:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3325:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3325:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3326:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__NameAssignment_1_26696); 
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


    // $ANTLR start "rule__Class__TypeAssignment_1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3335:1: rule__Class__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3339:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3340:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3340:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3341:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getTypeClassNameCrossReference_1_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3342:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3343:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getTypeClassNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__TypeAssignment_16731); 
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


    // $ANTLR start "rule__Class__InheritanceAssignment_2"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3354:1: rule__Class__InheritanceAssignment_2 : ( ruleInheritance ) ;
    public final void rule__Class__InheritanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3358:1: ( ( ruleInheritance ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3359:1: ( ruleInheritance )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3359:1: ( ruleInheritance )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3360:1: ruleInheritance
            {
             before(grammarAccess.getClassAccess().getInheritanceInheritanceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInheritance_in_rule__Class__InheritanceAssignment_26766);
            ruleInheritance();

            state._fsp--;

             after(grammarAccess.getClassAccess().getInheritanceInheritanceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__InheritanceAssignment_2"


    // $ANTLR start "rule__Class__MembersAssignment_4"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3369:1: rule__Class__MembersAssignment_4 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3373:1: ( ( ruleMember ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3374:1: ( ruleMember )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3374:1: ( ruleMember )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3375:1: ruleMember
            {
             before(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__Class__MembersAssignment_46797);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MembersAssignment_4"


    // $ANTLR start "rule__Inheritance__TypeAssignment_0_1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3384:1: rule__Inheritance__TypeAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Inheritance__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3388:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3389:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3389:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3390:1: ( RULE_ID )
            {
             before(grammarAccess.getInheritanceAccess().getTypeClassNameCrossReference_0_1_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3391:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3392:1: RULE_ID
            {
             before(grammarAccess.getInheritanceAccess().getTypeClassNameIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Inheritance__TypeAssignment_0_16832); 
             after(grammarAccess.getInheritanceAccess().getTypeClassNameIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getInheritanceAccess().getTypeClassNameCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__TypeAssignment_0_1"


    // $ANTLR start "rule__Inheritance__TypeAssignment_1_1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3403:1: rule__Inheritance__TypeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Inheritance__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3407:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3408:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3408:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3409:1: ( RULE_ID )
            {
             before(grammarAccess.getInheritanceAccess().getTypeClassNameCrossReference_1_1_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3410:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3411:1: RULE_ID
            {
             before(grammarAccess.getInheritanceAccess().getTypeClassNameIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Inheritance__TypeAssignment_1_16871); 
             after(grammarAccess.getInheritanceAccess().getTypeClassNameIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getInheritanceAccess().getTypeClassNameCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__TypeAssignment_1_1"


    // $ANTLR start "rule__Attribute__VisibilityAssignment_0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3422:1: rule__Attribute__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3426:1: ( ( ruleVisibility ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3427:1: ( ruleVisibility )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3427:1: ( ruleVisibility )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3428:1: ruleVisibility
            {
             before(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibility_in_rule__Attribute__VisibilityAssignment_06906);
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


    // $ANTLR start "rule__Attribute__NameAssignment_3"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3437:1: rule__Attribute__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3441:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3442:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3442:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3443:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_36937); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3452:1: rule__Attribute__TypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3456:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3457:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3457:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3458:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_5_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3459:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3460:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_56972); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_5_0()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3471:1: rule__Methode__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Methode__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3475:1: ( ( ruleVisibility ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3476:1: ( ruleVisibility )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3476:1: ( ruleVisibility )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3477:1: ruleVisibility
            {
             before(grammarAccess.getMethodeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVisibility_in_rule__Methode__VisibilityAssignment_07007);
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


    // $ANTLR start "rule__Methode__NameAssignment_4"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3486:1: rule__Methode__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Methode__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3490:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3491:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3491:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3492:1: RULE_ID
            {
             before(grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Methode__NameAssignment_47038); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3501:1: rule__Methode__AttributesAssignment_6_0 : ( ruleAttribute ) ;
    public final void rule__Methode__AttributesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3505:1: ( ( ruleAttribute ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3506:1: ( ruleAttribute )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3506:1: ( ruleAttribute )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3507:1: ruleAttribute
            {
             before(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Methode__AttributesAssignment_6_07069);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3516:1: rule__Methode__AttributesAssignment_6_1_1 : ( ruleAttribute ) ;
    public final void rule__Methode__AttributesAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3520:1: ( ( ruleAttribute ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3521:1: ( ruleAttribute )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3521:1: ( ruleAttribute )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3522:1: ruleAttribute
            {
             before(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Methode__AttributesAssignment_6_1_17100);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3531:1: rule__Methode__TypeAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Methode__TypeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3535:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3536:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3536:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3537:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodeAccess().getTypeTypeCrossReference_8_1_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3538:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3539:1: RULE_ID
            {
             before(grammarAccess.getMethodeAccess().getTypeTypeIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Methode__TypeAssignment_8_17135); 
             after(grammarAccess.getMethodeAccess().getTypeTypeIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getMethodeAccess().getTypeTypeCrossReference_8_1_0()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3550:1: rule__Generalization__LeftAssignment_0 : ( ruleAssociationEnd ) ;
    public final void rule__Generalization__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3554:1: ( ( ruleAssociationEnd ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3555:1: ( ruleAssociationEnd )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3555:1: ( ruleAssociationEnd )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3556:1: ruleAssociationEnd
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssociationEndParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAssociationEnd_in_rule__Generalization__LeftAssignment_07170);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3565:1: rule__Generalization__RightAssignment_2 : ( ruleAssociationEnd ) ;
    public final void rule__Generalization__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3569:1: ( ( ruleAssociationEnd ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3570:1: ( ruleAssociationEnd )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3570:1: ( ruleAssociationEnd )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3571:1: ruleAssociationEnd
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssociationEndParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssociationEnd_in_rule__Generalization__RightAssignment_27201);
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


    // $ANTLR start "rule__Association__LeftAssignment_0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3580:1: rule__Association__LeftAssignment_0 : ( ruleAssociationEnd ) ;
    public final void rule__Association__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3584:1: ( ( ruleAssociationEnd ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3585:1: ( ruleAssociationEnd )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3585:1: ( ruleAssociationEnd )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3586:1: ruleAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getLeftAssociationEndParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAssociationEnd_in_rule__Association__LeftAssignment_07232);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3595:1: rule__Association__RightAssignment_2_0_0 : ( ruleAssociationEnd ) ;
    public final void rule__Association__RightAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3599:1: ( ( ruleAssociationEnd ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3600:1: ( ruleAssociationEnd )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3600:1: ( ruleAssociationEnd )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3601:1: ruleAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getRightAssociationEndParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_ruleAssociationEnd_in_rule__Association__RightAssignment_2_0_07263);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3610:1: rule__Association__CardinalityAssignment_2_0_1 : ( ruleConnectorCardinalitiy ) ;
    public final void rule__Association__CardinalityAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3614:1: ( ( ruleConnectorCardinalitiy ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3615:1: ( ruleConnectorCardinalitiy )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3615:1: ( ruleConnectorCardinalitiy )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3616:1: ruleConnectorCardinalitiy
            {
             before(grammarAccess.getAssociationAccess().getCardinalityConnectorCardinalitiyParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleConnectorCardinalitiy_in_rule__Association__CardinalityAssignment_2_0_17294);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3625:1: rule__Association__NoteAssignment_2_0_2 : ( ruleNote ) ;
    public final void rule__Association__NoteAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3629:1: ( ( ruleNote ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3630:1: ( ruleNote )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3630:1: ( ruleNote )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3631:1: ruleNote
            {
             before(grammarAccess.getAssociationAccess().getNoteNoteParserRuleCall_2_0_2_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Association__NoteAssignment_2_0_27325);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3640:1: rule__Association__NoteAssignment_2_1 : ( ruleNote ) ;
    public final void rule__Association__NoteAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3644:1: ( ( ruleNote ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3645:1: ( ruleNote )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3645:1: ( ruleNote )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3646:1: ruleNote
            {
             before(grammarAccess.getAssociationAccess().getNoteNoteParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__Association__NoteAssignment_2_17356);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3655:1: rule__AssociationEnd__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__AssociationEnd__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3659:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3660:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3660:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3661:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationEndAccess().getTypeClassNameCrossReference_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3662:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3663:1: RULE_ID
            {
             before(grammarAccess.getAssociationEndAccess().getTypeClassNameIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationEnd__TypeAssignment7391); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3674:1: rule__ConnectorLabel__NameAssignment : ( RULE_ID ) ;
    public final void rule__ConnectorLabel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3678:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3679:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3679:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3680:1: RULE_ID
            {
             before(grammarAccess.getConnectorLabelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorLabel__NameAssignment7426); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3689:1: rule__ConnectorCardinalitiy__LeftAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ConnectorCardinalitiy__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3693:1: ( ( ruleCardinality ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3694:1: ( ruleCardinality )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3694:1: ( ruleCardinality )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3695:1: ruleCardinality
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getLeftCardinalityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__ConnectorCardinalitiy__LeftAssignment_27457);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3704:1: rule__ConnectorCardinalitiy__MiddleAssignment_3_1 : ( ruleCardinality ) ;
    public final void rule__ConnectorCardinalitiy__MiddleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3708:1: ( ( ruleCardinality ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3709:1: ( ruleCardinality )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3709:1: ( ruleCardinality )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3710:1: ruleCardinality
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getMiddleCardinalityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__ConnectorCardinalitiy__MiddleAssignment_3_17488);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3719:1: rule__ConnectorCardinalitiy__RightAssignment_4_1 : ( ruleConnectorLabel ) ;
    public final void rule__ConnectorCardinalitiy__RightAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3723:1: ( ( ruleConnectorLabel ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3724:1: ( ruleConnectorLabel )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3724:1: ( ruleConnectorLabel )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3725:1: ruleConnectorLabel
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getRightConnectorLabelParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleConnectorLabel_in_rule__ConnectorCardinalitiy__RightAssignment_4_17519);
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
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\7\5\1\40\2\uffff";
    static final String DFA6_maxS =
        "\6\37\1\5\1\41\2\uffff";
    static final String DFA6_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\7\12\uffff\1\1\1\2\1\3\1\4\7\uffff\1\10\2\uffff\1\5\1\6",
            "\1\7\25\uffff\1\10\2\uffff\1\5\1\6",
            "\1\7\25\uffff\1\10\2\uffff\1\5\1\6",
            "\1\7\25\uffff\1\10\2\uffff\1\5\1\6",
            "\1\7\25\uffff\1\10\2\uffff\1\5\1\6",
            "\1\7\31\uffff\1\6",
            "\1\7",
            "\1\11\1\10",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "740:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethode ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleClassDiagram_in_entryRuleClassDiagram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDiagram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__0_in_ruleClassDiagram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDef_in_entryRuleClassDef243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDef250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__0_in_ruleClassDef276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_entryRuleClassName303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassName310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleClassName336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Alternatives_in_ruleName395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Alternatives_in_ruleInheritance515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Alternatives_in_ruleMember575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_entryRuleMethode662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethode669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__0_in_ruleMethode695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Alternatives_in_ruleConnector755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_entryRuleGeneralization782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralization789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__0_in_ruleGeneralization815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_entryRuleAssociationEnd902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationEnd909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationEnd__TypeAssignment_in_ruleAssociationEnd935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorLabel_in_entryRuleConnectorLabel962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectorLabel969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorLabel__NameAssignment_in_ruleConnectorLabel995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorCardinalitiy_in_entryRuleConnectorCardinalitiy1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectorCardinalitiy1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__0_in_ruleConnectorCardinalitiy1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0_in_ruleNote1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDef_in_rule__Element__Alternatives1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Element__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Element__Alternatives1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__Element__Alternatives1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ClassDef__Alternatives_01332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ClassDef__Alternatives_01352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__NameAssignment_0_in_rule__Name__Alternatives1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group_1__0_in_rule__Name__Alternatives1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Name__LongnameAlternatives_1_0_01437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__LongnameAlternatives_1_0_01454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_0__0_in_rule__Inheritance__Alternatives1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_1__0_in_rule__Inheritance__Alternatives1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Member__Alternatives1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_rule__Member__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_rule__Connector__Alternatives1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Connector__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_2_0__0_in_rule__Association__Alternatives_21635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__NoteAssignment_2_1_in_rule__Association__Alternatives_21653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ConnectorCardinalitiy__Alternatives_4_21687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConnectorCardinalitiy__Alternatives_4_21707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Alternatives1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__0_in_rule__Cardinality__Alternatives1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Alternatives_1_21795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Cardinality__Alternatives_1_21814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Visibility__Alternatives1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Visibility__Alternatives1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Visibility__Alternatives1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Visibility__Alternatives1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__0__Impl_in_rule__ClassDiagram__Group__01943 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__1_in_rule__ClassDiagram__Group__01946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__1__Impl_in_rule__ClassDiagram__Group__12004 = new BitSet(new long[]{0x0000000008601820L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__2_in_rule__ClassDiagram__Group__12007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ClassDiagram__Group__1__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__2__Impl_in_rule__ClassDiagram__Group__22066 = new BitSet(new long[]{0x0000000008601820L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__3_in_rule__ClassDiagram__Group__22069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDiagram__ElementsAssignment_2_in_rule__ClassDiagram__Group__2__Impl2096 = new BitSet(new long[]{0x0000000008401822L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__3__Impl_in_rule__ClassDiagram__Group__32127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ClassDiagram__Group__3__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataType__Group__0__Impl2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__0__Impl_in_rule__ClassDef__Group__02317 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__1_in_rule__ClassDef__Group__02320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Alternatives_0_in_rule__ClassDef__Group__0__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__1__Impl_in_rule__ClassDef__Group__12377 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__2_in_rule__ClassDef__Group__12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClassDef__Group__1__Impl2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__2__Impl_in_rule__ClassDef__Group__22439 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__3_in_rule__ClassDef__Group__22442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__ClassesAssignment_2_in_rule__ClassDef__Group__2__Impl2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__3__Impl_in_rule__ClassDef__Group__32499 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__4_in_rule__ClassDef__Group__32502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group_3__0_in_rule__ClassDef__Group__3__Impl2529 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__4__Impl_in_rule__ClassDef__Group__42560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ClassDef__Group__4__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group_3__0__Impl_in_rule__ClassDef__Group_3__02629 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ClassDef__Group_3__1_in_rule__ClassDef__Group_3__02632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ClassDef__Group_3__0__Impl2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group_3__1__Impl_in_rule__ClassDef__Group_3__12691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__ClassesAssignment_3_1_in_rule__ClassDef__Group_3__1__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group_1__0__Impl_in_rule__Name__Group_1__02752 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Name__Group_1__1_in_rule__Name__Group_1__02755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__LongnameAssignment_1_0_in_rule__Name__Group_1__0__Impl2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group_1__1__Impl_in_rule__Name__Group_1__12812 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Name__Group_1__2_in_rule__Name__Group_1__12815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Name__Group_1__1__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group_1__2__Impl_in_rule__Name__Group_1__22874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__NameAssignment_1_2_in_rule__Name__Group_1__2__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__02937 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__02940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Class__Group__0__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__13002 = new BitSet(new long[]{0x0000000030800000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__13005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__TypeAssignment_1_in_rule__Class__Group__1__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__23062 = new BitSet(new long[]{0x0000000030800000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__23065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__InheritanceAssignment_2_in_rule__Class__Group__2__Impl3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__33123 = new BitSet(new long[]{0x00000000C90F0020L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__33126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class__Group__3__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__43185 = new BitSet(new long[]{0x00000000C90F0020L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__43188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__MembersAssignment_4_in_rule__Class__Group__4__Impl3215 = new BitSet(new long[]{0x00000000C80F0022L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__53246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Class__Group__5__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_0__0__Impl_in_rule__Inheritance__Group_0__03317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_0__1_in_rule__Inheritance__Group_0__03320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Inheritance__Group_0__0__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_0__1__Impl_in_rule__Inheritance__Group_0__13379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__TypeAssignment_0_1_in_rule__Inheritance__Group_0__1__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_1__0__Impl_in_rule__Inheritance__Group_1__03440 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_1__1_in_rule__Inheritance__Group_1__03443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Inheritance__Group_1__0__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_1__1__Impl_in_rule__Inheritance__Group_1__13502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__TypeAssignment_1_1_in_rule__Inheritance__Group_1__1__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03563 = new BitSet(new long[]{0x00000000C00F0020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__VisibilityAssignment_0_in_rule__Attribute__Group__0__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13624 = new BitSet(new long[]{0x00000000C00F0020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Attribute__Group__1__Impl3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23689 = new BitSet(new long[]{0x00000000C00F0020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__23692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Attribute__Group__2__Impl3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__33754 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__33757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_3_in_rule__Attribute__Group__3__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__43814 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__43817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Attribute__Group__4__Impl3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__53876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_5_in_rule__Attribute__Group__5__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__0__Impl_in_rule__Methode__Group__03945 = new BitSet(new long[]{0x00000000C80F0020L});
    public static final BitSet FOLLOW_rule__Methode__Group__1_in_rule__Methode__Group__03948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__VisibilityAssignment_0_in_rule__Methode__Group__0__Impl3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__1__Impl_in_rule__Methode__Group__14006 = new BitSet(new long[]{0x00000000C80F0020L});
    public static final BitSet FOLLOW_rule__Methode__Group__2_in_rule__Methode__Group__14009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Methode__Group__1__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__2__Impl_in_rule__Methode__Group__24071 = new BitSet(new long[]{0x00000000C80F0020L});
    public static final BitSet FOLLOW_rule__Methode__Group__3_in_rule__Methode__Group__24074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Methode__Group__2__Impl4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__3__Impl_in_rule__Methode__Group__34136 = new BitSet(new long[]{0x00000000C80F0020L});
    public static final BitSet FOLLOW_rule__Methode__Group__4_in_rule__Methode__Group__34139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Methode__Group__3__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__4__Impl_in_rule__Methode__Group__44201 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Methode__Group__5_in_rule__Methode__Group__44204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__NameAssignment_4_in_rule__Methode__Group__4__Impl4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__5__Impl_in_rule__Methode__Group__54261 = new BitSet(new long[]{0x00000004C00F0020L});
    public static final BitSet FOLLOW_rule__Methode__Group__6_in_rule__Methode__Group__54264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Methode__Group__5__Impl4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__6__Impl_in_rule__Methode__Group__64323 = new BitSet(new long[]{0x00000004C00F0020L});
    public static final BitSet FOLLOW_rule__Methode__Group__7_in_rule__Methode__Group__64326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_6__0_in_rule__Methode__Group__6__Impl4353 = new BitSet(new long[]{0x00000000C00F0022L});
    public static final BitSet FOLLOW_rule__Methode__Group__7__Impl_in_rule__Methode__Group__74384 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Methode__Group__8_in_rule__Methode__Group__74387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Methode__Group__7__Impl4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__8__Impl_in_rule__Methode__Group__84446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_8__0_in_rule__Methode__Group__8__Impl4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_6__0__Impl_in_rule__Methode__Group_6__04522 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Methode__Group_6__1_in_rule__Methode__Group_6__04525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__AttributesAssignment_6_0_in_rule__Methode__Group_6__0__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_6__1__Impl_in_rule__Methode__Group_6__14582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_6_1__0_in_rule__Methode__Group_6__1__Impl4609 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_6_1__0__Impl_in_rule__Methode__Group_6_1__04644 = new BitSet(new long[]{0x00000000C00F0020L});
    public static final BitSet FOLLOW_rule__Methode__Group_6_1__1_in_rule__Methode__Group_6_1__04647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Methode__Group_6_1__0__Impl4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_6_1__1__Impl_in_rule__Methode__Group_6_1__14706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__AttributesAssignment_6_1_1_in_rule__Methode__Group_6_1__1__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_8__0__Impl_in_rule__Methode__Group_8__04767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Methode__Group_8__1_in_rule__Methode__Group_8__04770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Methode__Group_8__0__Impl4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_8__1__Impl_in_rule__Methode__Group_8__14829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__TypeAssignment_8_1_in_rule__Methode__Group_8__1__Impl4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__0__Impl_in_rule__Generalization__Group__04890 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Generalization__Group__1_in_rule__Generalization__Group__04893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__LeftAssignment_0_in_rule__Generalization__Group__0__Impl4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__1__Impl_in_rule__Generalization__Group__14950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalization__Group__2_in_rule__Generalization__Group__14953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Generalization__Group__1__Impl4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__2__Impl_in_rule__Generalization__Group__25012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__RightAssignment_2_in_rule__Generalization__Group__2__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__05075 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__05078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__LeftAssignment_0_in_rule__Association__Group__0__Impl5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__15135 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__15138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Association__Group__1__Impl5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__25197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Alternatives_2_in_rule__Association__Group__2__Impl5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_2_0__0__Impl_in_rule__Association__Group_2_0__05260 = new BitSet(new long[]{0x0000011000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_2_0__1_in_rule__Association__Group_2_0__05263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__RightAssignment_2_0_0_in_rule__Association__Group_2_0__0__Impl5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_2_0__1__Impl_in_rule__Association__Group_2_0__15320 = new BitSet(new long[]{0x0000011000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_2_0__2_in_rule__Association__Group_2_0__15323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__CardinalityAssignment_2_0_1_in_rule__Association__Group_2_0__1__Impl5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_2_0__2__Impl_in_rule__Association__Group_2_0__25381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__NoteAssignment_2_0_2_in_rule__Association__Group_2_0__2__Impl5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__0__Impl_in_rule__ConnectorCardinalitiy__Group__05445 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__1_in_rule__ConnectorCardinalitiy__Group__05448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__1__Impl_in_rule__ConnectorCardinalitiy__Group__15506 = new BitSet(new long[]{0x0000006000008040L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__2_in_rule__ConnectorCardinalitiy__Group__15509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ConnectorCardinalitiy__Group__1__Impl5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__2__Impl_in_rule__ConnectorCardinalitiy__Group__25568 = new BitSet(new long[]{0x0000006000008040L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__3_in_rule__ConnectorCardinalitiy__Group__25571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__LeftAssignment_2_in_rule__ConnectorCardinalitiy__Group__2__Impl5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__3__Impl_in_rule__ConnectorCardinalitiy__Group__35629 = new BitSet(new long[]{0x0000006000008040L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__4_in_rule__ConnectorCardinalitiy__Group__35632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_3__0_in_rule__ConnectorCardinalitiy__Group__3__Impl5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__4__Impl_in_rule__ConnectorCardinalitiy__Group__45690 = new BitSet(new long[]{0x0000006000008040L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__5_in_rule__ConnectorCardinalitiy__Group__45693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__0_in_rule__ConnectorCardinalitiy__Group__4__Impl5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__5__Impl_in_rule__ConnectorCardinalitiy__Group__55751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ConnectorCardinalitiy__Group__5__Impl5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_3__0__Impl_in_rule__ConnectorCardinalitiy__Group_3__05822 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_3__1_in_rule__ConnectorCardinalitiy__Group_3__05825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ConnectorCardinalitiy__Group_3__0__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_3__1__Impl_in_rule__ConnectorCardinalitiy__Group_3__15884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__MiddleAssignment_3_1_in_rule__ConnectorCardinalitiy__Group_3__1__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__0__Impl_in_rule__ConnectorCardinalitiy__Group_4__05946 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__1_in_rule__ConnectorCardinalitiy__Group_4__05949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ConnectorCardinalitiy__Group_4__0__Impl5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__1__Impl_in_rule__ConnectorCardinalitiy__Group_4__16008 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__2_in_rule__ConnectorCardinalitiy__Group_4__16011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__RightAssignment_4_1_in_rule__ConnectorCardinalitiy__Group_4__1__Impl6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__2__Impl_in_rule__ConnectorCardinalitiy__Group_4__26069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Alternatives_4_2_in_rule__ConnectorCardinalitiy__Group_4__2__Impl6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__0__Impl_in_rule__Cardinality__Group_1__06133 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__1_in_rule__Cardinality__Group_1__06136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Cardinality__Group_1__0__Impl6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__1__Impl_in_rule__Cardinality__Group_1__16192 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__2_in_rule__Cardinality__Group_1__16195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Cardinality__Group_1__1__Impl6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__2__Impl_in_rule__Cardinality__Group_1__26254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_1_2_in_rule__Cardinality__Group_1__2__Impl6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__06317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Note__Group__1_in_rule__Note__Group__06320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Note__Group__0__Impl6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__16379 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Note__Group__2_in_rule__Note__Group__16382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Note__Group__1__Impl6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__2__Impl_in_rule__Note__Group__26438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Note__Group__2__Impl6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__ClassDiagram__ElementsAssignment_26508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_16539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ClassDef__ClassesAssignment_26570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ClassDef__ClassesAssignment_3_16601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__NameAssignment_06632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__LongnameAlternatives_1_0_0_in_rule__Name__LongnameAssignment_1_06663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__NameAssignment_1_26696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__TypeAssignment_16731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_rule__Class__InheritanceAssignment_26766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__Class__MembersAssignment_46797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Inheritance__TypeAssignment_0_16832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Inheritance__TypeAssignment_1_16871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Attribute__VisibilityAssignment_06906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_36937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_56972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_rule__Methode__VisibilityAssignment_07007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Methode__NameAssignment_47038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Methode__AttributesAssignment_6_07069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Methode__AttributesAssignment_6_1_17100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Methode__TypeAssignment_8_17135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_rule__Generalization__LeftAssignment_07170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_rule__Generalization__RightAssignment_27201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_rule__Association__LeftAssignment_07232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_rule__Association__RightAssignment_2_0_07263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorCardinalitiy_in_rule__Association__CardinalityAssignment_2_0_17294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Association__NoteAssignment_2_0_27325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__Association__NoteAssignment_2_17356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationEnd__TypeAssignment7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorLabel__NameAssignment7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__ConnectorCardinalitiy__LeftAssignment_27457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__ConnectorCardinalitiy__MiddleAssignment_3_17488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorLabel_in_rule__ConnectorCardinalitiy__RightAssignment_4_17519 = new BitSet(new long[]{0x0000000000000002L});

}