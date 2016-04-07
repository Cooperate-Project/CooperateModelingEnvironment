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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'interface'", "'<'", "'>'", "'*'", "'@startclass'", "'@endclass'", "'datatype'", "'{'", "'}'", "','", "' as '", "'abstract'", "'extends'", "'implements'", "'static'", "'final'", "':'", "'('", "')'", "'isa'", "'-'", "'['", "']'", "'|'", "'..'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
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


    // $ANTLR start "rule__Element__Alternatives"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:566:1: rule__Element__Alternatives : ( ( ruleClassDef ) | ( ruleClass ) | ( ruleDataType ) | ( ruleConnector ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:570:1: ( ( ruleClassDef ) | ( ruleClass ) | ( ruleDataType ) | ( ruleConnector ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                int LA1_3 = input.LA(2);

                if ( ((LA1_3>=31 && LA1_3<=32)) ) {
                    alt1=4;
                }
                else if ( (LA1_3==19||(LA1_3>=24 && LA1_3<=25)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 18:
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:571:1: ( ruleClassDef )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:571:1: ( ruleClassDef )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:572:1: ruleClassDef
                    {
                     before(grammarAccess.getElementAccess().getClassDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleClassDef_in_rule__Element__Alternatives1151);
                    ruleClassDef();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getClassDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:577:6: ( ruleClass )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:577:6: ( ruleClass )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:578:1: ruleClass
                    {
                     before(grammarAccess.getElementAccess().getClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClass_in_rule__Element__Alternatives1168);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:583:6: ( ruleDataType )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:583:6: ( ruleDataType )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:584:1: ruleDataType
                    {
                     before(grammarAccess.getElementAccess().getDataTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Element__Alternatives1185);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDataTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:589:6: ( ruleConnector )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:589:6: ( ruleConnector )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:590:1: ruleConnector
                    {
                     before(grammarAccess.getElementAccess().getConnectorParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleConnector_in_rule__Element__Alternatives1202);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:601:1: rule__ClassDef__Alternatives_0 : ( ( 'class' ) | ( 'interface' ) );
    public final void rule__ClassDef__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:605:1: ( ( 'class' ) | ( 'interface' ) )
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:606:1: ( 'class' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:606:1: ( 'class' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:607:1: 'class'
                    {
                     before(grammarAccess.getClassDefAccess().getClassKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__ClassDef__Alternatives_01236); 
                     after(grammarAccess.getClassDefAccess().getClassKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:614:6: ( 'interface' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:614:6: ( 'interface' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:615:1: 'interface'
                    {
                     before(grammarAccess.getClassDefAccess().getInterfaceKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__ClassDef__Alternatives_01256); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:627:1: rule__Name__Alternatives : ( ( ( rule__Name__NameAssignment_0 ) ) | ( ( rule__Name__Group_1__0 ) ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:631:1: ( ( ( rule__Name__NameAssignment_0 ) ) | ( ( rule__Name__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=20 && LA3_1<=21)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==22) ) {
                    alt3=2;
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:632:1: ( ( rule__Name__NameAssignment_0 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:632:1: ( ( rule__Name__NameAssignment_0 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:633:1: ( rule__Name__NameAssignment_0 )
                    {
                     before(grammarAccess.getNameAccess().getNameAssignment_0()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:634:1: ( rule__Name__NameAssignment_0 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:634:2: rule__Name__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Name__NameAssignment_0_in_rule__Name__Alternatives1290);
                    rule__Name__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNameAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:638:6: ( ( rule__Name__Group_1__0 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:638:6: ( ( rule__Name__Group_1__0 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:639:1: ( rule__Name__Group_1__0 )
                    {
                     before(grammarAccess.getNameAccess().getGroup_1()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:640:1: ( rule__Name__Group_1__0 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:640:2: rule__Name__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Name__Group_1__0_in_rule__Name__Alternatives1308);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:649:1: rule__Name__LongnameAlternatives_1_0_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Name__LongnameAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:653:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:654:1: ( RULE_STRING )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:654:1: ( RULE_STRING )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:655:1: RULE_STRING
                    {
                     before(grammarAccess.getNameAccess().getLongnameSTRINGTerminalRuleCall_1_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Name__LongnameAlternatives_1_0_01341); 
                     after(grammarAccess.getNameAccess().getLongnameSTRINGTerminalRuleCall_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:660:6: ( RULE_ID )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:660:6: ( RULE_ID )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:661:1: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getLongnameIDTerminalRuleCall_1_0_0_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__LongnameAlternatives_1_0_01358); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:671:1: rule__Inheritance__Alternatives : ( ( ( rule__Inheritance__Group_0__0 ) ) | ( ( rule__Inheritance__Group_1__0 ) ) );
    public final void rule__Inheritance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:675:1: ( ( ( rule__Inheritance__Group_0__0 ) ) | ( ( rule__Inheritance__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:676:1: ( ( rule__Inheritance__Group_0__0 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:676:1: ( ( rule__Inheritance__Group_0__0 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:677:1: ( rule__Inheritance__Group_0__0 )
                    {
                     before(grammarAccess.getInheritanceAccess().getGroup_0()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:678:1: ( rule__Inheritance__Group_0__0 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:678:2: rule__Inheritance__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Inheritance__Group_0__0_in_rule__Inheritance__Alternatives1390);
                    rule__Inheritance__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInheritanceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:682:6: ( ( rule__Inheritance__Group_1__0 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:682:6: ( ( rule__Inheritance__Group_1__0 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:683:1: ( rule__Inheritance__Group_1__0 )
                    {
                     before(grammarAccess.getInheritanceAccess().getGroup_1()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:684:1: ( rule__Inheritance__Group_1__0 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:684:2: rule__Inheritance__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Inheritance__Group_1__0_in_rule__Inheritance__Alternatives1408);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:693:1: rule__Member__Alternatives : ( ( ruleAttribute ) | ( ruleMethode ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:697:1: ( ( ruleAttribute ) | ( ruleMethode ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==27) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==RULE_ID) ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==29) ) {
                            alt6=2;
                        }
                        else if ( (LA6_3==28) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==RULE_ID) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==29) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==28) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_ID) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==29) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==28) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==29) ) {
                    alt6=2;
                }
                else if ( (LA6_3==28) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:698:1: ( ruleAttribute )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:698:1: ( ruleAttribute )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:699:1: ruleAttribute
                    {
                     before(grammarAccess.getMemberAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Member__Alternatives1441);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:704:6: ( ruleMethode )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:704:6: ( ruleMethode )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:705:1: ruleMethode
                    {
                     before(grammarAccess.getMemberAccess().getMethodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMethode_in_rule__Member__Alternatives1458);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:715:1: rule__Connector__Alternatives : ( ( ruleGeneralization ) | ( ruleAssociation ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:719:1: ( ( ruleGeneralization ) | ( ruleAssociation ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==32) ) {
                    alt7=2;
                }
                else if ( (LA7_1==31) ) {
                    alt7=1;
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:720:1: ( ruleGeneralization )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:720:1: ( ruleGeneralization )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:721:1: ruleGeneralization
                    {
                     before(grammarAccess.getConnectorAccess().getGeneralizationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGeneralization_in_rule__Connector__Alternatives1490);
                    ruleGeneralization();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getGeneralizationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:726:6: ( ruleAssociation )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:726:6: ( ruleAssociation )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:727:1: ruleAssociation
                    {
                     before(grammarAccess.getConnectorAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssociation_in_rule__Connector__Alternatives1507);
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


    // $ANTLR start "rule__ConnectorCardinalitiy__Alternatives_4_2"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:737:1: rule__ConnectorCardinalitiy__Alternatives_4_2 : ( ( '<' ) | ( '>' ) );
    public final void rule__ConnectorCardinalitiy__Alternatives_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:741:1: ( ( '<' ) | ( '>' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:742:1: ( '<' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:742:1: ( '<' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:743:1: '<'
                    {
                     before(grammarAccess.getConnectorCardinalitiyAccess().getLessThanSignKeyword_4_2_0()); 
                    match(input,13,FOLLOW_13_in_rule__ConnectorCardinalitiy__Alternatives_4_21540); 
                     after(grammarAccess.getConnectorCardinalitiyAccess().getLessThanSignKeyword_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:750:6: ( '>' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:750:6: ( '>' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:751:1: '>'
                    {
                     before(grammarAccess.getConnectorCardinalitiyAccess().getGreaterThanSignKeyword_4_2_1()); 
                    match(input,14,FOLLOW_14_in_rule__ConnectorCardinalitiy__Alternatives_4_21560); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:763:1: rule__Cardinality__Alternatives : ( ( '*' ) | ( ( rule__Cardinality__Group_1__0 ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:767:1: ( ( '*' ) | ( ( rule__Cardinality__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:768:1: ( '*' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:768:1: ( '*' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:769:1: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__Cardinality__Alternatives1595); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:776:6: ( ( rule__Cardinality__Group_1__0 ) )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:776:6: ( ( rule__Cardinality__Group_1__0 ) )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:777:1: ( rule__Cardinality__Group_1__0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getGroup_1()); 
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:778:1: ( rule__Cardinality__Group_1__0 )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:778:2: rule__Cardinality__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__Group_1__0_in_rule__Cardinality__Alternatives1614);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:787:1: rule__Cardinality__Alternatives_1_2 : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__Cardinality__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:791:1: ( ( '*' ) | ( RULE_INT ) )
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
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:792:1: ( '*' )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:792:1: ( '*' )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:793:1: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_2_0()); 
                    match(input,15,FOLLOW_15_in_rule__Cardinality__Alternatives_1_21648); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:800:6: ( RULE_INT )
                    {
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:800:6: ( RULE_INT )
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:801:1: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_2_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Cardinality__Alternatives_1_21667); 
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


    // $ANTLR start "rule__ClassDiagram__Group__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:813:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:817:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:818:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__ClassDiagram__Group__0__Impl_in_rule__ClassDiagram__Group__01697);
            rule__ClassDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDiagram__Group__1_in_rule__ClassDiagram__Group__01700);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:825:1: rule__ClassDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:829:1: ( ( () ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:830:1: ( () )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:830:1: ( () )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:831:1: ()
            {
             before(grammarAccess.getClassDiagramAccess().getClassDiagramAction_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:832:1: ()
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:834:1: 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:844:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:848:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:849:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__ClassDiagram__Group__1__Impl_in_rule__ClassDiagram__Group__11758);
            rule__ClassDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDiagram__Group__2_in_rule__ClassDiagram__Group__11761);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:856:1: rule__ClassDiagram__Group__1__Impl : ( '@startclass' ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:860:1: ( ( '@startclass' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:861:1: ( '@startclass' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:861:1: ( '@startclass' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:862:1: '@startclass'
            {
             before(grammarAccess.getClassDiagramAccess().getStartclassKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__ClassDiagram__Group__1__Impl1789); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:875:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:879:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:880:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
            {
            pushFollow(FOLLOW_rule__ClassDiagram__Group__2__Impl_in_rule__ClassDiagram__Group__21820);
            rule__ClassDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDiagram__Group__3_in_rule__ClassDiagram__Group__21823);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:887:1: rule__ClassDiagram__Group__2__Impl : ( ( rule__ClassDiagram__ElementsAssignment_2 )* ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:891:1: ( ( ( rule__ClassDiagram__ElementsAssignment_2 )* ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:892:1: ( ( rule__ClassDiagram__ElementsAssignment_2 )* )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:892:1: ( ( rule__ClassDiagram__ElementsAssignment_2 )* )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:893:1: ( rule__ClassDiagram__ElementsAssignment_2 )*
            {
             before(grammarAccess.getClassDiagramAccess().getElementsAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:894:1: ( rule__ClassDiagram__ElementsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=11 && LA11_0<=12)||LA11_0==18||LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:894:2: rule__ClassDiagram__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ClassDiagram__ElementsAssignment_2_in_rule__ClassDiagram__Group__2__Impl1850);
            	    rule__ClassDiagram__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:904:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:908:1: ( rule__ClassDiagram__Group__3__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:909:2: rule__ClassDiagram__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ClassDiagram__Group__3__Impl_in_rule__ClassDiagram__Group__31881);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:915:1: rule__ClassDiagram__Group__3__Impl : ( '@endclass' ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:919:1: ( ( '@endclass' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:920:1: ( '@endclass' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:920:1: ( '@endclass' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:921:1: '@endclass'
            {
             before(grammarAccess.getClassDiagramAccess().getEndclassKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__ClassDiagram__Group__3__Impl1909); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:942:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:946:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:947:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01948);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__01951);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:954:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:958:1: ( ( 'datatype' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:959:1: ( 'datatype' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:959:1: ( 'datatype' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:960:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__DataType__Group__0__Impl1979); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:973:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:977:1: ( rule__DataType__Group__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:978:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12010);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:984:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:988:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:989:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:989:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:990:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:991:1: ( rule__DataType__NameAssignment_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:991:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2037);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1005:1: rule__ClassDef__Group__0 : rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1 ;
    public final void rule__ClassDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1009:1: ( rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1010:2: rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1
            {
            pushFollow(FOLLOW_rule__ClassDef__Group__0__Impl_in_rule__ClassDef__Group__02071);
            rule__ClassDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDef__Group__1_in_rule__ClassDef__Group__02074);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1017:1: rule__ClassDef__Group__0__Impl : ( ( rule__ClassDef__Alternatives_0 ) ) ;
    public final void rule__ClassDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1021:1: ( ( ( rule__ClassDef__Alternatives_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1022:1: ( ( rule__ClassDef__Alternatives_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1022:1: ( ( rule__ClassDef__Alternatives_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1023:1: ( rule__ClassDef__Alternatives_0 )
            {
             before(grammarAccess.getClassDefAccess().getAlternatives_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1024:1: ( rule__ClassDef__Alternatives_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1024:2: rule__ClassDef__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ClassDef__Alternatives_0_in_rule__ClassDef__Group__0__Impl2101);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1034:1: rule__ClassDef__Group__1 : rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2 ;
    public final void rule__ClassDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1038:1: ( rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1039:2: rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2
            {
            pushFollow(FOLLOW_rule__ClassDef__Group__1__Impl_in_rule__ClassDef__Group__12131);
            rule__ClassDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDef__Group__2_in_rule__ClassDef__Group__12134);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1046:1: rule__ClassDef__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1050:1: ( ( '{' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1051:1: ( '{' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1051:1: ( '{' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1052:1: '{'
            {
             before(grammarAccess.getClassDefAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ClassDef__Group__1__Impl2162); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1065:1: rule__ClassDef__Group__2 : rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3 ;
    public final void rule__ClassDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1069:1: ( rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1070:2: rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3
            {
            pushFollow(FOLLOW_rule__ClassDef__Group__2__Impl_in_rule__ClassDef__Group__22193);
            rule__ClassDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDef__Group__3_in_rule__ClassDef__Group__22196);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1077:1: rule__ClassDef__Group__2__Impl : ( ( rule__ClassDef__ClassesAssignment_2 ) ) ;
    public final void rule__ClassDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1081:1: ( ( ( rule__ClassDef__ClassesAssignment_2 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1082:1: ( ( rule__ClassDef__ClassesAssignment_2 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1082:1: ( ( rule__ClassDef__ClassesAssignment_2 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1083:1: ( rule__ClassDef__ClassesAssignment_2 )
            {
             before(grammarAccess.getClassDefAccess().getClassesAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1084:1: ( rule__ClassDef__ClassesAssignment_2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1084:2: rule__ClassDef__ClassesAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassDef__ClassesAssignment_2_in_rule__ClassDef__Group__2__Impl2223);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1094:1: rule__ClassDef__Group__3 : rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4 ;
    public final void rule__ClassDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1098:1: ( rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1099:2: rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4
            {
            pushFollow(FOLLOW_rule__ClassDef__Group__3__Impl_in_rule__ClassDef__Group__32253);
            rule__ClassDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDef__Group__4_in_rule__ClassDef__Group__32256);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1106:1: rule__ClassDef__Group__3__Impl : ( ( rule__ClassDef__Group_3__0 )* ) ;
    public final void rule__ClassDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1110:1: ( ( ( rule__ClassDef__Group_3__0 )* ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1111:1: ( ( rule__ClassDef__Group_3__0 )* )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1111:1: ( ( rule__ClassDef__Group_3__0 )* )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1112:1: ( rule__ClassDef__Group_3__0 )*
            {
             before(grammarAccess.getClassDefAccess().getGroup_3()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1113:1: ( rule__ClassDef__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1113:2: rule__ClassDef__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ClassDef__Group_3__0_in_rule__ClassDef__Group__3__Impl2283);
            	    rule__ClassDef__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1123:1: rule__ClassDef__Group__4 : rule__ClassDef__Group__4__Impl ;
    public final void rule__ClassDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1127:1: ( rule__ClassDef__Group__4__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1128:2: rule__ClassDef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ClassDef__Group__4__Impl_in_rule__ClassDef__Group__42314);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1134:1: rule__ClassDef__Group__4__Impl : ( '}' ) ;
    public final void rule__ClassDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1138:1: ( ( '}' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1139:1: ( '}' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1139:1: ( '}' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1140:1: '}'
            {
             before(grammarAccess.getClassDefAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__ClassDef__Group__4__Impl2342); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1163:1: rule__ClassDef__Group_3__0 : rule__ClassDef__Group_3__0__Impl rule__ClassDef__Group_3__1 ;
    public final void rule__ClassDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1167:1: ( rule__ClassDef__Group_3__0__Impl rule__ClassDef__Group_3__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1168:2: rule__ClassDef__Group_3__0__Impl rule__ClassDef__Group_3__1
            {
            pushFollow(FOLLOW_rule__ClassDef__Group_3__0__Impl_in_rule__ClassDef__Group_3__02383);
            rule__ClassDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDef__Group_3__1_in_rule__ClassDef__Group_3__02386);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1175:1: rule__ClassDef__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ClassDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1179:1: ( ( ',' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1180:1: ( ',' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1180:1: ( ',' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1181:1: ','
            {
             before(grammarAccess.getClassDefAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__ClassDef__Group_3__0__Impl2414); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1194:1: rule__ClassDef__Group_3__1 : rule__ClassDef__Group_3__1__Impl ;
    public final void rule__ClassDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1198:1: ( rule__ClassDef__Group_3__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1199:2: rule__ClassDef__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassDef__Group_3__1__Impl_in_rule__ClassDef__Group_3__12445);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1205:1: rule__ClassDef__Group_3__1__Impl : ( ( rule__ClassDef__ClassesAssignment_3_1 ) ) ;
    public final void rule__ClassDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1209:1: ( ( ( rule__ClassDef__ClassesAssignment_3_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1210:1: ( ( rule__ClassDef__ClassesAssignment_3_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1210:1: ( ( rule__ClassDef__ClassesAssignment_3_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1211:1: ( rule__ClassDef__ClassesAssignment_3_1 )
            {
             before(grammarAccess.getClassDefAccess().getClassesAssignment_3_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1212:1: ( rule__ClassDef__ClassesAssignment_3_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1212:2: rule__ClassDef__ClassesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ClassDef__ClassesAssignment_3_1_in_rule__ClassDef__Group_3__1__Impl2472);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1226:1: rule__Name__Group_1__0 : rule__Name__Group_1__0__Impl rule__Name__Group_1__1 ;
    public final void rule__Name__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1230:1: ( rule__Name__Group_1__0__Impl rule__Name__Group_1__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1231:2: rule__Name__Group_1__0__Impl rule__Name__Group_1__1
            {
            pushFollow(FOLLOW_rule__Name__Group_1__0__Impl_in_rule__Name__Group_1__02506);
            rule__Name__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group_1__1_in_rule__Name__Group_1__02509);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1238:1: rule__Name__Group_1__0__Impl : ( ( rule__Name__LongnameAssignment_1_0 ) ) ;
    public final void rule__Name__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1242:1: ( ( ( rule__Name__LongnameAssignment_1_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1243:1: ( ( rule__Name__LongnameAssignment_1_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1243:1: ( ( rule__Name__LongnameAssignment_1_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1244:1: ( rule__Name__LongnameAssignment_1_0 )
            {
             before(grammarAccess.getNameAccess().getLongnameAssignment_1_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1245:1: ( rule__Name__LongnameAssignment_1_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1245:2: rule__Name__LongnameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Name__LongnameAssignment_1_0_in_rule__Name__Group_1__0__Impl2536);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1255:1: rule__Name__Group_1__1 : rule__Name__Group_1__1__Impl rule__Name__Group_1__2 ;
    public final void rule__Name__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1259:1: ( rule__Name__Group_1__1__Impl rule__Name__Group_1__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1260:2: rule__Name__Group_1__1__Impl rule__Name__Group_1__2
            {
            pushFollow(FOLLOW_rule__Name__Group_1__1__Impl_in_rule__Name__Group_1__12566);
            rule__Name__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group_1__2_in_rule__Name__Group_1__12569);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1267:1: rule__Name__Group_1__1__Impl : ( ' as ' ) ;
    public final void rule__Name__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1271:1: ( ( ' as ' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1272:1: ( ' as ' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1272:1: ( ' as ' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1273:1: ' as '
            {
             before(grammarAccess.getNameAccess().getAsKeyword_1_1()); 
            match(input,22,FOLLOW_22_in_rule__Name__Group_1__1__Impl2597); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1286:1: rule__Name__Group_1__2 : rule__Name__Group_1__2__Impl ;
    public final void rule__Name__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1290:1: ( rule__Name__Group_1__2__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1291:2: rule__Name__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Name__Group_1__2__Impl_in_rule__Name__Group_1__22628);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1297:1: rule__Name__Group_1__2__Impl : ( ( rule__Name__NameAssignment_1_2 ) ) ;
    public final void rule__Name__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1301:1: ( ( ( rule__Name__NameAssignment_1_2 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1302:1: ( ( rule__Name__NameAssignment_1_2 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1302:1: ( ( rule__Name__NameAssignment_1_2 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1303:1: ( rule__Name__NameAssignment_1_2 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_1_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1304:1: ( rule__Name__NameAssignment_1_2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1304:2: rule__Name__NameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Name__NameAssignment_1_2_in_rule__Name__Group_1__2__Impl2655);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1320:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1324:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1325:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__02691);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__02694);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1332:1: rule__Class__Group__0__Impl : ( ( 'abstract' )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1336:1: ( ( ( 'abstract' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1337:1: ( ( 'abstract' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1337:1: ( ( 'abstract' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1338:1: ( 'abstract' )?
            {
             before(grammarAccess.getClassAccess().getAbstractKeyword_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1339:1: ( 'abstract' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1340:2: 'abstract'
                    {
                    match(input,23,FOLLOW_23_in_rule__Class__Group__0__Impl2723); 

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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1351:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1355:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1356:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__12756);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__12759);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1363:1: rule__Class__Group__1__Impl : ( ( rule__Class__TypeAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1367:1: ( ( ( rule__Class__TypeAssignment_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1368:1: ( ( rule__Class__TypeAssignment_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1368:1: ( ( rule__Class__TypeAssignment_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1369:1: ( rule__Class__TypeAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getTypeAssignment_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1370:1: ( rule__Class__TypeAssignment_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1370:2: rule__Class__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__TypeAssignment_1_in_rule__Class__Group__1__Impl2786);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1380:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1384:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1385:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22816);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22819);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1392:1: rule__Class__Group__2__Impl : ( ( rule__Class__InheritanceAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1396:1: ( ( ( rule__Class__InheritanceAssignment_2 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1397:1: ( ( rule__Class__InheritanceAssignment_2 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1397:1: ( ( rule__Class__InheritanceAssignment_2 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1398:1: ( rule__Class__InheritanceAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getInheritanceAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1399:1: ( rule__Class__InheritanceAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=24 && LA14_0<=25)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1399:2: rule__Class__InheritanceAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Class__InheritanceAssignment_2_in_rule__Class__Group__2__Impl2846);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1409:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1413:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1414:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32877);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32880);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1421:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1425:1: ( ( '{' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1426:1: ( '{' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1426:1: ( '{' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1427:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Class__Group__3__Impl2908); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1440:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1444:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1445:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42939);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__42942);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1452:1: rule__Class__Group__4__Impl : ( ( rule__Class__MembersAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1456:1: ( ( ( rule__Class__MembersAssignment_4 )* ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1457:1: ( ( rule__Class__MembersAssignment_4 )* )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1457:1: ( ( rule__Class__MembersAssignment_4 )* )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1458:1: ( rule__Class__MembersAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getMembersAssignment_4()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1459:1: ( rule__Class__MembersAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==23||(LA15_0>=26 && LA15_0<=27)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1459:2: rule__Class__MembersAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Class__MembersAssignment_4_in_rule__Class__Group__4__Impl2969);
            	    rule__Class__MembersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1469:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1473:1: ( rule__Class__Group__5__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1474:2: rule__Class__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__53000);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1480:1: rule__Class__Group__5__Impl : ( '}' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1484:1: ( ( '}' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1485:1: ( '}' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1485:1: ( '}' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1486:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Class__Group__5__Impl3028); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1511:1: rule__Inheritance__Group_0__0 : rule__Inheritance__Group_0__0__Impl rule__Inheritance__Group_0__1 ;
    public final void rule__Inheritance__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1515:1: ( rule__Inheritance__Group_0__0__Impl rule__Inheritance__Group_0__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1516:2: rule__Inheritance__Group_0__0__Impl rule__Inheritance__Group_0__1
            {
            pushFollow(FOLLOW_rule__Inheritance__Group_0__0__Impl_in_rule__Inheritance__Group_0__03071);
            rule__Inheritance__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Inheritance__Group_0__1_in_rule__Inheritance__Group_0__03074);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1523:1: rule__Inheritance__Group_0__0__Impl : ( 'extends' ) ;
    public final void rule__Inheritance__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1527:1: ( ( 'extends' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1528:1: ( 'extends' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1528:1: ( 'extends' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1529:1: 'extends'
            {
             before(grammarAccess.getInheritanceAccess().getExtendsKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Inheritance__Group_0__0__Impl3102); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1542:1: rule__Inheritance__Group_0__1 : rule__Inheritance__Group_0__1__Impl ;
    public final void rule__Inheritance__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1546:1: ( rule__Inheritance__Group_0__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1547:2: rule__Inheritance__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Inheritance__Group_0__1__Impl_in_rule__Inheritance__Group_0__13133);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1553:1: rule__Inheritance__Group_0__1__Impl : ( ( rule__Inheritance__TypeAssignment_0_1 ) ) ;
    public final void rule__Inheritance__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1557:1: ( ( ( rule__Inheritance__TypeAssignment_0_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1558:1: ( ( rule__Inheritance__TypeAssignment_0_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1558:1: ( ( rule__Inheritance__TypeAssignment_0_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1559:1: ( rule__Inheritance__TypeAssignment_0_1 )
            {
             before(grammarAccess.getInheritanceAccess().getTypeAssignment_0_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1560:1: ( rule__Inheritance__TypeAssignment_0_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1560:2: rule__Inheritance__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Inheritance__TypeAssignment_0_1_in_rule__Inheritance__Group_0__1__Impl3160);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1574:1: rule__Inheritance__Group_1__0 : rule__Inheritance__Group_1__0__Impl rule__Inheritance__Group_1__1 ;
    public final void rule__Inheritance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1578:1: ( rule__Inheritance__Group_1__0__Impl rule__Inheritance__Group_1__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1579:2: rule__Inheritance__Group_1__0__Impl rule__Inheritance__Group_1__1
            {
            pushFollow(FOLLOW_rule__Inheritance__Group_1__0__Impl_in_rule__Inheritance__Group_1__03194);
            rule__Inheritance__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Inheritance__Group_1__1_in_rule__Inheritance__Group_1__03197);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1586:1: rule__Inheritance__Group_1__0__Impl : ( 'implements' ) ;
    public final void rule__Inheritance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1590:1: ( ( 'implements' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1591:1: ( 'implements' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1591:1: ( 'implements' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1592:1: 'implements'
            {
             before(grammarAccess.getInheritanceAccess().getImplementsKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Inheritance__Group_1__0__Impl3225); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1605:1: rule__Inheritance__Group_1__1 : rule__Inheritance__Group_1__1__Impl ;
    public final void rule__Inheritance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1609:1: ( rule__Inheritance__Group_1__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1610:2: rule__Inheritance__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Inheritance__Group_1__1__Impl_in_rule__Inheritance__Group_1__13256);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1616:1: rule__Inheritance__Group_1__1__Impl : ( ( rule__Inheritance__TypeAssignment_1_1 ) ) ;
    public final void rule__Inheritance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1620:1: ( ( ( rule__Inheritance__TypeAssignment_1_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1621:1: ( ( rule__Inheritance__TypeAssignment_1_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1621:1: ( ( rule__Inheritance__TypeAssignment_1_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1622:1: ( rule__Inheritance__TypeAssignment_1_1 )
            {
             before(grammarAccess.getInheritanceAccess().getTypeAssignment_1_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1623:1: ( rule__Inheritance__TypeAssignment_1_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1623:2: rule__Inheritance__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Inheritance__TypeAssignment_1_1_in_rule__Inheritance__Group_1__1__Impl3283);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1637:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1641:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1642:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03317);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03320);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1649:1: rule__Attribute__Group__0__Impl : ( ( 'static' )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1653:1: ( ( ( 'static' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1654:1: ( ( 'static' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1654:1: ( ( 'static' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1655:1: ( 'static' )?
            {
             before(grammarAccess.getAttributeAccess().getStaticKeyword_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1656:1: ( 'static' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1657:2: 'static'
                    {
                    match(input,26,FOLLOW_26_in_rule__Attribute__Group__0__Impl3349); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getStaticKeyword_0()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1668:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1672:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1673:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13382);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13385);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1680:1: rule__Attribute__Group__1__Impl : ( ( 'final' )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1684:1: ( ( ( 'final' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1685:1: ( ( 'final' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1685:1: ( ( 'final' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1686:1: ( 'final' )?
            {
             before(grammarAccess.getAttributeAccess().getFinalKeyword_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1687:1: ( 'final' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1688:2: 'final'
                    {
                    match(input,27,FOLLOW_27_in_rule__Attribute__Group__1__Impl3414); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getFinalKeyword_1()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1699:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1703:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1704:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23447);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__23450);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1711:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1715:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1716:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1716:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1717:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1718:1: ( rule__Attribute__NameAssignment_2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1718:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl3477);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1728:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1732:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1733:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__33507);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__33510);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1740:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1744:1: ( ( ':' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1745:1: ( ':' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1745:1: ( ':' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1746:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Attribute__Group__3__Impl3538); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1759:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1763:1: ( rule__Attribute__Group__4__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1764:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__43569);
            rule__Attribute__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1770:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1774:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1775:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1775:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1776:1: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1777:1: ( rule__Attribute__TypeAssignment_4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1777:2: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl3596);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Methode__Group__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1797:1: rule__Methode__Group__0 : rule__Methode__Group__0__Impl rule__Methode__Group__1 ;
    public final void rule__Methode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1801:1: ( rule__Methode__Group__0__Impl rule__Methode__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1802:2: rule__Methode__Group__0__Impl rule__Methode__Group__1
            {
            pushFollow(FOLLOW_rule__Methode__Group__0__Impl_in_rule__Methode__Group__03636);
            rule__Methode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__1_in_rule__Methode__Group__03639);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1809:1: rule__Methode__Group__0__Impl : ( ( 'abstract' )? ) ;
    public final void rule__Methode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1813:1: ( ( ( 'abstract' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1814:1: ( ( 'abstract' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1814:1: ( ( 'abstract' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1815:1: ( 'abstract' )?
            {
             before(grammarAccess.getMethodeAccess().getAbstractKeyword_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1816:1: ( 'abstract' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1817:2: 'abstract'
                    {
                    match(input,23,FOLLOW_23_in_rule__Methode__Group__0__Impl3668); 

                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getAbstractKeyword_0()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1828:1: rule__Methode__Group__1 : rule__Methode__Group__1__Impl rule__Methode__Group__2 ;
    public final void rule__Methode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1832:1: ( rule__Methode__Group__1__Impl rule__Methode__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1833:2: rule__Methode__Group__1__Impl rule__Methode__Group__2
            {
            pushFollow(FOLLOW_rule__Methode__Group__1__Impl_in_rule__Methode__Group__13701);
            rule__Methode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__2_in_rule__Methode__Group__13704);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1840:1: rule__Methode__Group__1__Impl : ( ( 'static' )? ) ;
    public final void rule__Methode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1844:1: ( ( ( 'static' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1845:1: ( ( 'static' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1845:1: ( ( 'static' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1846:1: ( 'static' )?
            {
             before(grammarAccess.getMethodeAccess().getStaticKeyword_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1847:1: ( 'static' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1848:2: 'static'
                    {
                    match(input,26,FOLLOW_26_in_rule__Methode__Group__1__Impl3733); 

                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getStaticKeyword_1()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1859:1: rule__Methode__Group__2 : rule__Methode__Group__2__Impl rule__Methode__Group__3 ;
    public final void rule__Methode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1863:1: ( rule__Methode__Group__2__Impl rule__Methode__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1864:2: rule__Methode__Group__2__Impl rule__Methode__Group__3
            {
            pushFollow(FOLLOW_rule__Methode__Group__2__Impl_in_rule__Methode__Group__23766);
            rule__Methode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__3_in_rule__Methode__Group__23769);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1871:1: rule__Methode__Group__2__Impl : ( ( 'final' )? ) ;
    public final void rule__Methode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1875:1: ( ( ( 'final' )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1876:1: ( ( 'final' )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1876:1: ( ( 'final' )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1877:1: ( 'final' )?
            {
             before(grammarAccess.getMethodeAccess().getFinalKeyword_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1878:1: ( 'final' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1879:2: 'final'
                    {
                    match(input,27,FOLLOW_27_in_rule__Methode__Group__2__Impl3798); 

                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getFinalKeyword_2()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1890:1: rule__Methode__Group__3 : rule__Methode__Group__3__Impl rule__Methode__Group__4 ;
    public final void rule__Methode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1894:1: ( rule__Methode__Group__3__Impl rule__Methode__Group__4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1895:2: rule__Methode__Group__3__Impl rule__Methode__Group__4
            {
            pushFollow(FOLLOW_rule__Methode__Group__3__Impl_in_rule__Methode__Group__33831);
            rule__Methode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__4_in_rule__Methode__Group__33834);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1902:1: rule__Methode__Group__3__Impl : ( ( rule__Methode__NameAssignment_3 ) ) ;
    public final void rule__Methode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1906:1: ( ( ( rule__Methode__NameAssignment_3 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1907:1: ( ( rule__Methode__NameAssignment_3 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1907:1: ( ( rule__Methode__NameAssignment_3 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1908:1: ( rule__Methode__NameAssignment_3 )
            {
             before(grammarAccess.getMethodeAccess().getNameAssignment_3()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1909:1: ( rule__Methode__NameAssignment_3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1909:2: rule__Methode__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Methode__NameAssignment_3_in_rule__Methode__Group__3__Impl3861);
            rule__Methode__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1919:1: rule__Methode__Group__4 : rule__Methode__Group__4__Impl rule__Methode__Group__5 ;
    public final void rule__Methode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1923:1: ( rule__Methode__Group__4__Impl rule__Methode__Group__5 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1924:2: rule__Methode__Group__4__Impl rule__Methode__Group__5
            {
            pushFollow(FOLLOW_rule__Methode__Group__4__Impl_in_rule__Methode__Group__43891);
            rule__Methode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__5_in_rule__Methode__Group__43894);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1931:1: rule__Methode__Group__4__Impl : ( '(' ) ;
    public final void rule__Methode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1935:1: ( ( '(' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1936:1: ( '(' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1936:1: ( '(' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1937:1: '('
            {
             before(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Methode__Group__4__Impl3922); 
             after(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1950:1: rule__Methode__Group__5 : rule__Methode__Group__5__Impl rule__Methode__Group__6 ;
    public final void rule__Methode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1954:1: ( rule__Methode__Group__5__Impl rule__Methode__Group__6 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1955:2: rule__Methode__Group__5__Impl rule__Methode__Group__6
            {
            pushFollow(FOLLOW_rule__Methode__Group__5__Impl_in_rule__Methode__Group__53953);
            rule__Methode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__6_in_rule__Methode__Group__53956);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1962:1: rule__Methode__Group__5__Impl : ( ( rule__Methode__Group_5__0 )* ) ;
    public final void rule__Methode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1966:1: ( ( ( rule__Methode__Group_5__0 )* ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1967:1: ( ( rule__Methode__Group_5__0 )* )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1967:1: ( ( rule__Methode__Group_5__0 )* )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1968:1: ( rule__Methode__Group_5__0 )*
            {
             before(grammarAccess.getMethodeAccess().getGroup_5()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1969:1: ( rule__Methode__Group_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=26 && LA21_0<=27)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1969:2: rule__Methode__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Methode__Group_5__0_in_rule__Methode__Group__5__Impl3983);
            	    rule__Methode__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMethodeAccess().getGroup_5()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1979:1: rule__Methode__Group__6 : rule__Methode__Group__6__Impl rule__Methode__Group__7 ;
    public final void rule__Methode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1983:1: ( rule__Methode__Group__6__Impl rule__Methode__Group__7 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1984:2: rule__Methode__Group__6__Impl rule__Methode__Group__7
            {
            pushFollow(FOLLOW_rule__Methode__Group__6__Impl_in_rule__Methode__Group__64014);
            rule__Methode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__7_in_rule__Methode__Group__64017);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1991:1: rule__Methode__Group__6__Impl : ( ')' ) ;
    public final void rule__Methode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1995:1: ( ( ')' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1996:1: ( ')' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1996:1: ( ')' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:1997:1: ')'
            {
             before(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__Methode__Group__6__Impl4045); 
             after(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2010:1: rule__Methode__Group__7 : rule__Methode__Group__7__Impl ;
    public final void rule__Methode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2014:1: ( rule__Methode__Group__7__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2015:2: rule__Methode__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group__7__Impl_in_rule__Methode__Group__74076);
            rule__Methode__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2021:1: rule__Methode__Group__7__Impl : ( ( rule__Methode__Group_7__0 )? ) ;
    public final void rule__Methode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2025:1: ( ( ( rule__Methode__Group_7__0 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2026:1: ( ( rule__Methode__Group_7__0 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2026:1: ( ( rule__Methode__Group_7__0 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2027:1: ( rule__Methode__Group_7__0 )?
            {
             before(grammarAccess.getMethodeAccess().getGroup_7()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2028:1: ( rule__Methode__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2028:2: rule__Methode__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Methode__Group_7__0_in_rule__Methode__Group__7__Impl4103);
                    rule__Methode__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodeAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Methode__Group_5__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2054:1: rule__Methode__Group_5__0 : rule__Methode__Group_5__0__Impl rule__Methode__Group_5__1 ;
    public final void rule__Methode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2058:1: ( rule__Methode__Group_5__0__Impl rule__Methode__Group_5__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2059:2: rule__Methode__Group_5__0__Impl rule__Methode__Group_5__1
            {
            pushFollow(FOLLOW_rule__Methode__Group_5__0__Impl_in_rule__Methode__Group_5__04150);
            rule__Methode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group_5__1_in_rule__Methode__Group_5__04153);
            rule__Methode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_5__0"


    // $ANTLR start "rule__Methode__Group_5__0__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2066:1: rule__Methode__Group_5__0__Impl : ( ( rule__Methode__AttributesAssignment_5_0 ) ) ;
    public final void rule__Methode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2070:1: ( ( ( rule__Methode__AttributesAssignment_5_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2071:1: ( ( rule__Methode__AttributesAssignment_5_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2071:1: ( ( rule__Methode__AttributesAssignment_5_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2072:1: ( rule__Methode__AttributesAssignment_5_0 )
            {
             before(grammarAccess.getMethodeAccess().getAttributesAssignment_5_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2073:1: ( rule__Methode__AttributesAssignment_5_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2073:2: rule__Methode__AttributesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Methode__AttributesAssignment_5_0_in_rule__Methode__Group_5__0__Impl4180);
            rule__Methode__AttributesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getAttributesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_5__0__Impl"


    // $ANTLR start "rule__Methode__Group_5__1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2083:1: rule__Methode__Group_5__1 : rule__Methode__Group_5__1__Impl ;
    public final void rule__Methode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2087:1: ( rule__Methode__Group_5__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2088:2: rule__Methode__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group_5__1__Impl_in_rule__Methode__Group_5__14210);
            rule__Methode__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_5__1"


    // $ANTLR start "rule__Methode__Group_5__1__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2094:1: rule__Methode__Group_5__1__Impl : ( ( rule__Methode__Group_5_1__0 )* ) ;
    public final void rule__Methode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2098:1: ( ( ( rule__Methode__Group_5_1__0 )* ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2099:1: ( ( rule__Methode__Group_5_1__0 )* )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2099:1: ( ( rule__Methode__Group_5_1__0 )* )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2100:1: ( rule__Methode__Group_5_1__0 )*
            {
             before(grammarAccess.getMethodeAccess().getGroup_5_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2101:1: ( rule__Methode__Group_5_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2101:2: rule__Methode__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Methode__Group_5_1__0_in_rule__Methode__Group_5__1__Impl4237);
            	    rule__Methode__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMethodeAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_5__1__Impl"


    // $ANTLR start "rule__Methode__Group_5_1__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2115:1: rule__Methode__Group_5_1__0 : rule__Methode__Group_5_1__0__Impl rule__Methode__Group_5_1__1 ;
    public final void rule__Methode__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2119:1: ( rule__Methode__Group_5_1__0__Impl rule__Methode__Group_5_1__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2120:2: rule__Methode__Group_5_1__0__Impl rule__Methode__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__Methode__Group_5_1__0__Impl_in_rule__Methode__Group_5_1__04272);
            rule__Methode__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group_5_1__1_in_rule__Methode__Group_5_1__04275);
            rule__Methode__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_5_1__0"


    // $ANTLR start "rule__Methode__Group_5_1__0__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2127:1: rule__Methode__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Methode__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2131:1: ( ( ',' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2132:1: ( ',' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2132:1: ( ',' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2133:1: ','
            {
             before(grammarAccess.getMethodeAccess().getCommaKeyword_5_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Methode__Group_5_1__0__Impl4303); 
             after(grammarAccess.getMethodeAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_5_1__0__Impl"


    // $ANTLR start "rule__Methode__Group_5_1__1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2146:1: rule__Methode__Group_5_1__1 : rule__Methode__Group_5_1__1__Impl ;
    public final void rule__Methode__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2150:1: ( rule__Methode__Group_5_1__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2151:2: rule__Methode__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group_5_1__1__Impl_in_rule__Methode__Group_5_1__14334);
            rule__Methode__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_5_1__1"


    // $ANTLR start "rule__Methode__Group_5_1__1__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2157:1: rule__Methode__Group_5_1__1__Impl : ( ( rule__Methode__AttributesAssignment_5_1_1 ) ) ;
    public final void rule__Methode__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2161:1: ( ( ( rule__Methode__AttributesAssignment_5_1_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2162:1: ( ( rule__Methode__AttributesAssignment_5_1_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2162:1: ( ( rule__Methode__AttributesAssignment_5_1_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2163:1: ( rule__Methode__AttributesAssignment_5_1_1 )
            {
             before(grammarAccess.getMethodeAccess().getAttributesAssignment_5_1_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2164:1: ( rule__Methode__AttributesAssignment_5_1_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2164:2: rule__Methode__AttributesAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__Methode__AttributesAssignment_5_1_1_in_rule__Methode__Group_5_1__1__Impl4361);
            rule__Methode__AttributesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getAttributesAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_5_1__1__Impl"


    // $ANTLR start "rule__Methode__Group_7__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2178:1: rule__Methode__Group_7__0 : rule__Methode__Group_7__0__Impl rule__Methode__Group_7__1 ;
    public final void rule__Methode__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2182:1: ( rule__Methode__Group_7__0__Impl rule__Methode__Group_7__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2183:2: rule__Methode__Group_7__0__Impl rule__Methode__Group_7__1
            {
            pushFollow(FOLLOW_rule__Methode__Group_7__0__Impl_in_rule__Methode__Group_7__04395);
            rule__Methode__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group_7__1_in_rule__Methode__Group_7__04398);
            rule__Methode__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_7__0"


    // $ANTLR start "rule__Methode__Group_7__0__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2190:1: rule__Methode__Group_7__0__Impl : ( ':' ) ;
    public final void rule__Methode__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2194:1: ( ( ':' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2195:1: ( ':' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2195:1: ( ':' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2196:1: ':'
            {
             before(grammarAccess.getMethodeAccess().getColonKeyword_7_0()); 
            match(input,28,FOLLOW_28_in_rule__Methode__Group_7__0__Impl4426); 
             after(grammarAccess.getMethodeAccess().getColonKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_7__0__Impl"


    // $ANTLR start "rule__Methode__Group_7__1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2209:1: rule__Methode__Group_7__1 : rule__Methode__Group_7__1__Impl ;
    public final void rule__Methode__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2213:1: ( rule__Methode__Group_7__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2214:2: rule__Methode__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group_7__1__Impl_in_rule__Methode__Group_7__14457);
            rule__Methode__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_7__1"


    // $ANTLR start "rule__Methode__Group_7__1__Impl"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2220:1: rule__Methode__Group_7__1__Impl : ( ( rule__Methode__TypeAssignment_7_1 ) ) ;
    public final void rule__Methode__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2224:1: ( ( ( rule__Methode__TypeAssignment_7_1 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2225:1: ( ( rule__Methode__TypeAssignment_7_1 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2225:1: ( ( rule__Methode__TypeAssignment_7_1 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2226:1: ( rule__Methode__TypeAssignment_7_1 )
            {
             before(grammarAccess.getMethodeAccess().getTypeAssignment_7_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2227:1: ( rule__Methode__TypeAssignment_7_1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2227:2: rule__Methode__TypeAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Methode__TypeAssignment_7_1_in_rule__Methode__Group_7__1__Impl4484);
            rule__Methode__TypeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getTypeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group_7__1__Impl"


    // $ANTLR start "rule__Generalization__Group__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2241:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2245:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2246:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_rule__Generalization__Group__0__Impl_in_rule__Generalization__Group__04518);
            rule__Generalization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalization__Group__1_in_rule__Generalization__Group__04521);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2253:1: rule__Generalization__Group__0__Impl : ( ( rule__Generalization__LeftAssignment_0 ) ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2257:1: ( ( ( rule__Generalization__LeftAssignment_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2258:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2258:1: ( ( rule__Generalization__LeftAssignment_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2259:1: ( rule__Generalization__LeftAssignment_0 )
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssignment_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2260:1: ( rule__Generalization__LeftAssignment_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2260:2: rule__Generalization__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Generalization__LeftAssignment_0_in_rule__Generalization__Group__0__Impl4548);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2270:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2274:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2275:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_rule__Generalization__Group__1__Impl_in_rule__Generalization__Group__14578);
            rule__Generalization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generalization__Group__2_in_rule__Generalization__Group__14581);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2282:1: rule__Generalization__Group__1__Impl : ( 'isa' ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2286:1: ( ( 'isa' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2287:1: ( 'isa' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2287:1: ( 'isa' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2288:1: 'isa'
            {
             before(grammarAccess.getGeneralizationAccess().getIsaKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Generalization__Group__1__Impl4609); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2301:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2305:1: ( rule__Generalization__Group__2__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2306:2: rule__Generalization__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Generalization__Group__2__Impl_in_rule__Generalization__Group__24640);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2312:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__RightAssignment_2 ) ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2316:1: ( ( ( rule__Generalization__RightAssignment_2 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2317:1: ( ( rule__Generalization__RightAssignment_2 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2317:1: ( ( rule__Generalization__RightAssignment_2 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2318:1: ( rule__Generalization__RightAssignment_2 )
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2319:1: ( rule__Generalization__RightAssignment_2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2319:2: rule__Generalization__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Generalization__RightAssignment_2_in_rule__Generalization__Group__2__Impl4667);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2335:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2339:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2340:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__04703);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__04706);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2347:1: rule__Association__Group__0__Impl : ( ( rule__Association__LeftAssignment_0 ) ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2351:1: ( ( ( rule__Association__LeftAssignment_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2352:1: ( ( rule__Association__LeftAssignment_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2352:1: ( ( rule__Association__LeftAssignment_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2353:1: ( rule__Association__LeftAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getLeftAssignment_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2354:1: ( rule__Association__LeftAssignment_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2354:2: rule__Association__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Association__LeftAssignment_0_in_rule__Association__Group__0__Impl4733);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2364:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2368:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2369:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__14763);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__14766);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2376:1: rule__Association__Group__1__Impl : ( '-' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2380:1: ( ( '-' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2381:1: ( '-' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2381:1: ( '-' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2382:1: '-'
            {
             before(grammarAccess.getAssociationAccess().getHyphenMinusKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Association__Group__1__Impl4794); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2395:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2399:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2400:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24825);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__3_in_rule__Association__Group__24828);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2407:1: rule__Association__Group__2__Impl : ( ( rule__Association__RightAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2411:1: ( ( ( rule__Association__RightAssignment_2 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2412:1: ( ( rule__Association__RightAssignment_2 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2412:1: ( ( rule__Association__RightAssignment_2 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2413:1: ( rule__Association__RightAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getRightAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2414:1: ( rule__Association__RightAssignment_2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2414:2: rule__Association__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Association__RightAssignment_2_in_rule__Association__Group__2__Impl4855);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2424:1: rule__Association__Group__3 : rule__Association__Group__3__Impl ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2428:1: ( rule__Association__Group__3__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2429:2: rule__Association__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__34885);
            rule__Association__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2435:1: rule__Association__Group__3__Impl : ( ( rule__Association__CardinalityAssignment_3 )? ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2439:1: ( ( ( rule__Association__CardinalityAssignment_3 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2440:1: ( ( rule__Association__CardinalityAssignment_3 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2440:1: ( ( rule__Association__CardinalityAssignment_3 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2441:1: ( rule__Association__CardinalityAssignment_3 )?
            {
             before(grammarAccess.getAssociationAccess().getCardinalityAssignment_3()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2442:1: ( rule__Association__CardinalityAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2442:2: rule__Association__CardinalityAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Association__CardinalityAssignment_3_in_rule__Association__Group__3__Impl4912);
                    rule__Association__CardinalityAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getCardinalityAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConnectorCardinalitiy__Group__0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2460:1: rule__ConnectorCardinalitiy__Group__0 : rule__ConnectorCardinalitiy__Group__0__Impl rule__ConnectorCardinalitiy__Group__1 ;
    public final void rule__ConnectorCardinalitiy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2464:1: ( rule__ConnectorCardinalitiy__Group__0__Impl rule__ConnectorCardinalitiy__Group__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2465:2: rule__ConnectorCardinalitiy__Group__0__Impl rule__ConnectorCardinalitiy__Group__1
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__0__Impl_in_rule__ConnectorCardinalitiy__Group__04951);
            rule__ConnectorCardinalitiy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__1_in_rule__ConnectorCardinalitiy__Group__04954);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2472:1: rule__ConnectorCardinalitiy__Group__0__Impl : ( () ) ;
    public final void rule__ConnectorCardinalitiy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2476:1: ( ( () ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2477:1: ( () )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2477:1: ( () )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2478:1: ()
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getConnectorCardinalitiyAction_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2479:1: ()
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2481:1: 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2491:1: rule__ConnectorCardinalitiy__Group__1 : rule__ConnectorCardinalitiy__Group__1__Impl rule__ConnectorCardinalitiy__Group__2 ;
    public final void rule__ConnectorCardinalitiy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2495:1: ( rule__ConnectorCardinalitiy__Group__1__Impl rule__ConnectorCardinalitiy__Group__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2496:2: rule__ConnectorCardinalitiy__Group__1__Impl rule__ConnectorCardinalitiy__Group__2
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__1__Impl_in_rule__ConnectorCardinalitiy__Group__15012);
            rule__ConnectorCardinalitiy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__2_in_rule__ConnectorCardinalitiy__Group__15015);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2503:1: rule__ConnectorCardinalitiy__Group__1__Impl : ( '[' ) ;
    public final void rule__ConnectorCardinalitiy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2507:1: ( ( '[' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2508:1: ( '[' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2508:1: ( '[' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2509:1: '['
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getLeftSquareBracketKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__ConnectorCardinalitiy__Group__1__Impl5043); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2522:1: rule__ConnectorCardinalitiy__Group__2 : rule__ConnectorCardinalitiy__Group__2__Impl rule__ConnectorCardinalitiy__Group__3 ;
    public final void rule__ConnectorCardinalitiy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2526:1: ( rule__ConnectorCardinalitiy__Group__2__Impl rule__ConnectorCardinalitiy__Group__3 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2527:2: rule__ConnectorCardinalitiy__Group__2__Impl rule__ConnectorCardinalitiy__Group__3
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__2__Impl_in_rule__ConnectorCardinalitiy__Group__25074);
            rule__ConnectorCardinalitiy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__3_in_rule__ConnectorCardinalitiy__Group__25077);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2534:1: rule__ConnectorCardinalitiy__Group__2__Impl : ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2538:1: ( ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2539:1: ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2539:1: ( ( rule__ConnectorCardinalitiy__LeftAssignment_2 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2540:1: ( rule__ConnectorCardinalitiy__LeftAssignment_2 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getLeftAssignment_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2541:1: ( rule__ConnectorCardinalitiy__LeftAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT||LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2541:2: rule__ConnectorCardinalitiy__LeftAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__LeftAssignment_2_in_rule__ConnectorCardinalitiy__Group__2__Impl5104);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2551:1: rule__ConnectorCardinalitiy__Group__3 : rule__ConnectorCardinalitiy__Group__3__Impl rule__ConnectorCardinalitiy__Group__4 ;
    public final void rule__ConnectorCardinalitiy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2555:1: ( rule__ConnectorCardinalitiy__Group__3__Impl rule__ConnectorCardinalitiy__Group__4 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2556:2: rule__ConnectorCardinalitiy__Group__3__Impl rule__ConnectorCardinalitiy__Group__4
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__3__Impl_in_rule__ConnectorCardinalitiy__Group__35135);
            rule__ConnectorCardinalitiy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__4_in_rule__ConnectorCardinalitiy__Group__35138);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2563:1: rule__ConnectorCardinalitiy__Group__3__Impl : ( ( rule__ConnectorCardinalitiy__Group_3__0 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2567:1: ( ( ( rule__ConnectorCardinalitiy__Group_3__0 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2568:1: ( ( rule__ConnectorCardinalitiy__Group_3__0 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2568:1: ( ( rule__ConnectorCardinalitiy__Group_3__0 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2569:1: ( rule__ConnectorCardinalitiy__Group_3__0 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getGroup_3()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2570:1: ( rule__ConnectorCardinalitiy__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2570:2: rule__ConnectorCardinalitiy__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_3__0_in_rule__ConnectorCardinalitiy__Group__3__Impl5165);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2580:1: rule__ConnectorCardinalitiy__Group__4 : rule__ConnectorCardinalitiy__Group__4__Impl rule__ConnectorCardinalitiy__Group__5 ;
    public final void rule__ConnectorCardinalitiy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2584:1: ( rule__ConnectorCardinalitiy__Group__4__Impl rule__ConnectorCardinalitiy__Group__5 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2585:2: rule__ConnectorCardinalitiy__Group__4__Impl rule__ConnectorCardinalitiy__Group__5
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__4__Impl_in_rule__ConnectorCardinalitiy__Group__45196);
            rule__ConnectorCardinalitiy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__5_in_rule__ConnectorCardinalitiy__Group__45199);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2592:1: rule__ConnectorCardinalitiy__Group__4__Impl : ( ( rule__ConnectorCardinalitiy__Group_4__0 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2596:1: ( ( ( rule__ConnectorCardinalitiy__Group_4__0 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2597:1: ( ( rule__ConnectorCardinalitiy__Group_4__0 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2597:1: ( ( rule__ConnectorCardinalitiy__Group_4__0 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2598:1: ( rule__ConnectorCardinalitiy__Group_4__0 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getGroup_4()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2599:1: ( rule__ConnectorCardinalitiy__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2599:2: rule__ConnectorCardinalitiy__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__0_in_rule__ConnectorCardinalitiy__Group__4__Impl5226);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2609:1: rule__ConnectorCardinalitiy__Group__5 : rule__ConnectorCardinalitiy__Group__5__Impl ;
    public final void rule__ConnectorCardinalitiy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2613:1: ( rule__ConnectorCardinalitiy__Group__5__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2614:2: rule__ConnectorCardinalitiy__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group__5__Impl_in_rule__ConnectorCardinalitiy__Group__55257);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2620:1: rule__ConnectorCardinalitiy__Group__5__Impl : ( ']' ) ;
    public final void rule__ConnectorCardinalitiy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2624:1: ( ( ']' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2625:1: ( ']' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2625:1: ( ']' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2626:1: ']'
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getRightSquareBracketKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__ConnectorCardinalitiy__Group__5__Impl5285); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2651:1: rule__ConnectorCardinalitiy__Group_3__0 : rule__ConnectorCardinalitiy__Group_3__0__Impl rule__ConnectorCardinalitiy__Group_3__1 ;
    public final void rule__ConnectorCardinalitiy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2655:1: ( rule__ConnectorCardinalitiy__Group_3__0__Impl rule__ConnectorCardinalitiy__Group_3__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2656:2: rule__ConnectorCardinalitiy__Group_3__0__Impl rule__ConnectorCardinalitiy__Group_3__1
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_3__0__Impl_in_rule__ConnectorCardinalitiy__Group_3__05328);
            rule__ConnectorCardinalitiy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_3__1_in_rule__ConnectorCardinalitiy__Group_3__05331);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2663:1: rule__ConnectorCardinalitiy__Group_3__0__Impl : ( '|' ) ;
    public final void rule__ConnectorCardinalitiy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2667:1: ( ( '|' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2668:1: ( '|' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2668:1: ( '|' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2669:1: '|'
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__ConnectorCardinalitiy__Group_3__0__Impl5359); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2682:1: rule__ConnectorCardinalitiy__Group_3__1 : rule__ConnectorCardinalitiy__Group_3__1__Impl ;
    public final void rule__ConnectorCardinalitiy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2686:1: ( rule__ConnectorCardinalitiy__Group_3__1__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2687:2: rule__ConnectorCardinalitiy__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_3__1__Impl_in_rule__ConnectorCardinalitiy__Group_3__15390);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2693:1: rule__ConnectorCardinalitiy__Group_3__1__Impl : ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2697:1: ( ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2698:1: ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2698:1: ( ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2699:1: ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getMiddleAssignment_3_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2700:1: ( rule__ConnectorCardinalitiy__MiddleAssignment_3_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT||LA28_0==15) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2700:2: rule__ConnectorCardinalitiy__MiddleAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__MiddleAssignment_3_1_in_rule__ConnectorCardinalitiy__Group_3__1__Impl5417);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2714:1: rule__ConnectorCardinalitiy__Group_4__0 : rule__ConnectorCardinalitiy__Group_4__0__Impl rule__ConnectorCardinalitiy__Group_4__1 ;
    public final void rule__ConnectorCardinalitiy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2718:1: ( rule__ConnectorCardinalitiy__Group_4__0__Impl rule__ConnectorCardinalitiy__Group_4__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2719:2: rule__ConnectorCardinalitiy__Group_4__0__Impl rule__ConnectorCardinalitiy__Group_4__1
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__0__Impl_in_rule__ConnectorCardinalitiy__Group_4__05452);
            rule__ConnectorCardinalitiy__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__1_in_rule__ConnectorCardinalitiy__Group_4__05455);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2726:1: rule__ConnectorCardinalitiy__Group_4__0__Impl : ( '|' ) ;
    public final void rule__ConnectorCardinalitiy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2730:1: ( ( '|' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2731:1: ( '|' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2731:1: ( '|' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2732:1: '|'
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__ConnectorCardinalitiy__Group_4__0__Impl5483); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2745:1: rule__ConnectorCardinalitiy__Group_4__1 : rule__ConnectorCardinalitiy__Group_4__1__Impl rule__ConnectorCardinalitiy__Group_4__2 ;
    public final void rule__ConnectorCardinalitiy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2749:1: ( rule__ConnectorCardinalitiy__Group_4__1__Impl rule__ConnectorCardinalitiy__Group_4__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2750:2: rule__ConnectorCardinalitiy__Group_4__1__Impl rule__ConnectorCardinalitiy__Group_4__2
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__1__Impl_in_rule__ConnectorCardinalitiy__Group_4__15514);
            rule__ConnectorCardinalitiy__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__2_in_rule__ConnectorCardinalitiy__Group_4__15517);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2757:1: rule__ConnectorCardinalitiy__Group_4__1__Impl : ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2761:1: ( ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2762:1: ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2762:1: ( ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2763:1: ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getRightAssignment_4_1()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2764:1: ( rule__ConnectorCardinalitiy__RightAssignment_4_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2764:2: rule__ConnectorCardinalitiy__RightAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__RightAssignment_4_1_in_rule__ConnectorCardinalitiy__Group_4__1__Impl5544);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2774:1: rule__ConnectorCardinalitiy__Group_4__2 : rule__ConnectorCardinalitiy__Group_4__2__Impl ;
    public final void rule__ConnectorCardinalitiy__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2778:1: ( rule__ConnectorCardinalitiy__Group_4__2__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2779:2: rule__ConnectorCardinalitiy__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Group_4__2__Impl_in_rule__ConnectorCardinalitiy__Group_4__25575);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2785:1: rule__ConnectorCardinalitiy__Group_4__2__Impl : ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? ) ;
    public final void rule__ConnectorCardinalitiy__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2789:1: ( ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2790:1: ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2790:1: ( ( rule__ConnectorCardinalitiy__Alternatives_4_2 )? )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2791:1: ( rule__ConnectorCardinalitiy__Alternatives_4_2 )?
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getAlternatives_4_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2792:1: ( rule__ConnectorCardinalitiy__Alternatives_4_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=13 && LA30_0<=14)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2792:2: rule__ConnectorCardinalitiy__Alternatives_4_2
                    {
                    pushFollow(FOLLOW_rule__ConnectorCardinalitiy__Alternatives_4_2_in_rule__ConnectorCardinalitiy__Group_4__2__Impl5602);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2808:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2812:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2813:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1__0__Impl_in_rule__Cardinality__Group_1__05639);
            rule__Cardinality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group_1__1_in_rule__Cardinality__Group_1__05642);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2820:1: rule__Cardinality__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2824:1: ( ( RULE_INT ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2825:1: ( RULE_INT )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2825:1: ( RULE_INT )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2826:1: RULE_INT
            {
             before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Cardinality__Group_1__0__Impl5669); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2837:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl rule__Cardinality__Group_1__2 ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2841:1: ( rule__Cardinality__Group_1__1__Impl rule__Cardinality__Group_1__2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2842:2: rule__Cardinality__Group_1__1__Impl rule__Cardinality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1__1__Impl_in_rule__Cardinality__Group_1__15698);
            rule__Cardinality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group_1__2_in_rule__Cardinality__Group_1__15701);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2849:1: rule__Cardinality__Group_1__1__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2853:1: ( ( '..' ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2854:1: ( '..' )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2854:1: ( '..' )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2855:1: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_1()); 
            match(input,36,FOLLOW_36_in_rule__Cardinality__Group_1__1__Impl5729); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2868:1: rule__Cardinality__Group_1__2 : rule__Cardinality__Group_1__2__Impl ;
    public final void rule__Cardinality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2872:1: ( rule__Cardinality__Group_1__2__Impl )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2873:2: rule__Cardinality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1__2__Impl_in_rule__Cardinality__Group_1__25760);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2879:1: rule__Cardinality__Group_1__2__Impl : ( ( rule__Cardinality__Alternatives_1_2 ) ) ;
    public final void rule__Cardinality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2883:1: ( ( ( rule__Cardinality__Alternatives_1_2 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2884:1: ( ( rule__Cardinality__Alternatives_1_2 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2884:1: ( ( rule__Cardinality__Alternatives_1_2 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2885:1: ( rule__Cardinality__Alternatives_1_2 )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives_1_2()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2886:1: ( rule__Cardinality__Alternatives_1_2 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2886:2: rule__Cardinality__Alternatives_1_2
            {
            pushFollow(FOLLOW_rule__Cardinality__Alternatives_1_2_in_rule__Cardinality__Group_1__2__Impl5787);
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


    // $ANTLR start "rule__ClassDiagram__ElementsAssignment_2"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2903:1: rule__ClassDiagram__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__ClassDiagram__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2907:1: ( ( ruleElement ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2908:1: ( ruleElement )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2908:1: ( ruleElement )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2909:1: ruleElement
            {
             before(grammarAccess.getClassDiagramAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__ClassDiagram__ElementsAssignment_25828);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2918:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2922:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2923:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2923:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2924:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_15859); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2933:1: rule__ClassDef__ClassesAssignment_2 : ( ruleClassName ) ;
    public final void rule__ClassDef__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2937:1: ( ( ruleClassName ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2938:1: ( ruleClassName )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2938:1: ( ruleClassName )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2939:1: ruleClassName
            {
             before(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ClassDef__ClassesAssignment_25890);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2948:1: rule__ClassDef__ClassesAssignment_3_1 : ( ruleClassName ) ;
    public final void rule__ClassDef__ClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2952:1: ( ( ruleClassName ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2953:1: ( ruleClassName )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2953:1: ( ruleClassName )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2954:1: ruleClassName
            {
             before(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__ClassDef__ClassesAssignment_3_15921);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2963:1: rule__Name__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2967:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2968:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2968:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2969:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__NameAssignment_05952); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2978:1: rule__Name__LongnameAssignment_1_0 : ( ( rule__Name__LongnameAlternatives_1_0_0 ) ) ;
    public final void rule__Name__LongnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2982:1: ( ( ( rule__Name__LongnameAlternatives_1_0_0 ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2983:1: ( ( rule__Name__LongnameAlternatives_1_0_0 ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2983:1: ( ( rule__Name__LongnameAlternatives_1_0_0 ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2984:1: ( rule__Name__LongnameAlternatives_1_0_0 )
            {
             before(grammarAccess.getNameAccess().getLongnameAlternatives_1_0_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2985:1: ( rule__Name__LongnameAlternatives_1_0_0 )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2985:2: rule__Name__LongnameAlternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__Name__LongnameAlternatives_1_0_0_in_rule__Name__LongnameAssignment_1_05983);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2994:1: rule__Name__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2998:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2999:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:2999:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3000:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__NameAssignment_1_26016); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3009:1: rule__Class__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3013:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3014:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3014:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3015:1: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getTypeClassNameCrossReference_1_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3016:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3017:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getTypeClassNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__TypeAssignment_16051); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3028:1: rule__Class__InheritanceAssignment_2 : ( ruleInheritance ) ;
    public final void rule__Class__InheritanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3032:1: ( ( ruleInheritance ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3033:1: ( ruleInheritance )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3033:1: ( ruleInheritance )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3034:1: ruleInheritance
            {
             before(grammarAccess.getClassAccess().getInheritanceInheritanceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInheritance_in_rule__Class__InheritanceAssignment_26086);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3043:1: rule__Class__MembersAssignment_4 : ( ruleMember ) ;
    public final void rule__Class__MembersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3047:1: ( ( ruleMember ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3048:1: ( ruleMember )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3048:1: ( ruleMember )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3049:1: ruleMember
            {
             before(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__Class__MembersAssignment_46117);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3058:1: rule__Inheritance__TypeAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Inheritance__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3062:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3063:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3063:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3064:1: ( RULE_ID )
            {
             before(grammarAccess.getInheritanceAccess().getTypeClassNameCrossReference_0_1_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3065:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3066:1: RULE_ID
            {
             before(grammarAccess.getInheritanceAccess().getTypeClassNameIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Inheritance__TypeAssignment_0_16152); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3077:1: rule__Inheritance__TypeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Inheritance__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3081:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3082:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3082:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3083:1: ( RULE_ID )
            {
             before(grammarAccess.getInheritanceAccess().getTypeClassNameCrossReference_1_1_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3084:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3085:1: RULE_ID
            {
             before(grammarAccess.getInheritanceAccess().getTypeClassNameIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Inheritance__TypeAssignment_1_16191); 
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


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3096:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3100:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3101:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3101:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3102:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_26226); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3111:1: rule__Attribute__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3115:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3116:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3116:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3117:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_4_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3118:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3119:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_46261); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__Methode__NameAssignment_3"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3130:1: rule__Methode__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Methode__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3134:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3135:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3135:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3136:1: RULE_ID
            {
             before(grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Methode__NameAssignment_36296); 
             after(grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__NameAssignment_3"


    // $ANTLR start "rule__Methode__AttributesAssignment_5_0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3145:1: rule__Methode__AttributesAssignment_5_0 : ( ruleAttribute ) ;
    public final void rule__Methode__AttributesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3149:1: ( ( ruleAttribute ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3150:1: ( ruleAttribute )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3150:1: ( ruleAttribute )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3151:1: ruleAttribute
            {
             before(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Methode__AttributesAssignment_5_06327);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__AttributesAssignment_5_0"


    // $ANTLR start "rule__Methode__AttributesAssignment_5_1_1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3160:1: rule__Methode__AttributesAssignment_5_1_1 : ( ruleAttribute ) ;
    public final void rule__Methode__AttributesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3164:1: ( ( ruleAttribute ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3165:1: ( ruleAttribute )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3165:1: ( ruleAttribute )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3166:1: ruleAttribute
            {
             before(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Methode__AttributesAssignment_5_1_16358);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__AttributesAssignment_5_1_1"


    // $ANTLR start "rule__Methode__TypeAssignment_7_1"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3175:1: rule__Methode__TypeAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Methode__TypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3179:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3180:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3180:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3181:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodeAccess().getTypeTypeCrossReference_7_1_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3182:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3183:1: RULE_ID
            {
             before(grammarAccess.getMethodeAccess().getTypeTypeIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Methode__TypeAssignment_7_16393); 
             after(grammarAccess.getMethodeAccess().getTypeTypeIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getMethodeAccess().getTypeTypeCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__TypeAssignment_7_1"


    // $ANTLR start "rule__Generalization__LeftAssignment_0"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3194:1: rule__Generalization__LeftAssignment_0 : ( ruleAssociationEnd ) ;
    public final void rule__Generalization__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3198:1: ( ( ruleAssociationEnd ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3199:1: ( ruleAssociationEnd )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3199:1: ( ruleAssociationEnd )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3200:1: ruleAssociationEnd
            {
             before(grammarAccess.getGeneralizationAccess().getLeftAssociationEndParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAssociationEnd_in_rule__Generalization__LeftAssignment_06428);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3209:1: rule__Generalization__RightAssignment_2 : ( ruleAssociationEnd ) ;
    public final void rule__Generalization__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3213:1: ( ( ruleAssociationEnd ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3214:1: ( ruleAssociationEnd )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3214:1: ( ruleAssociationEnd )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3215:1: ruleAssociationEnd
            {
             before(grammarAccess.getGeneralizationAccess().getRightAssociationEndParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssociationEnd_in_rule__Generalization__RightAssignment_26459);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3224:1: rule__Association__LeftAssignment_0 : ( ruleAssociationEnd ) ;
    public final void rule__Association__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3228:1: ( ( ruleAssociationEnd ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3229:1: ( ruleAssociationEnd )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3229:1: ( ruleAssociationEnd )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3230:1: ruleAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getLeftAssociationEndParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAssociationEnd_in_rule__Association__LeftAssignment_06490);
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


    // $ANTLR start "rule__Association__RightAssignment_2"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3239:1: rule__Association__RightAssignment_2 : ( ruleAssociationEnd ) ;
    public final void rule__Association__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3243:1: ( ( ruleAssociationEnd ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3244:1: ( ruleAssociationEnd )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3244:1: ( ruleAssociationEnd )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3245:1: ruleAssociationEnd
            {
             before(grammarAccess.getAssociationAccess().getRightAssociationEndParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssociationEnd_in_rule__Association__RightAssignment_26521);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRightAssociationEndParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Association__CardinalityAssignment_3"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3254:1: rule__Association__CardinalityAssignment_3 : ( ruleConnectorCardinalitiy ) ;
    public final void rule__Association__CardinalityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3258:1: ( ( ruleConnectorCardinalitiy ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3259:1: ( ruleConnectorCardinalitiy )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3259:1: ( ruleConnectorCardinalitiy )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3260:1: ruleConnectorCardinalitiy
            {
             before(grammarAccess.getAssociationAccess().getCardinalityConnectorCardinalitiyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConnectorCardinalitiy_in_rule__Association__CardinalityAssignment_36552);
            ruleConnectorCardinalitiy();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getCardinalityConnectorCardinalitiyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__CardinalityAssignment_3"


    // $ANTLR start "rule__AssociationEnd__TypeAssignment"
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3269:1: rule__AssociationEnd__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__AssociationEnd__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3273:1: ( ( ( RULE_ID ) ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3274:1: ( ( RULE_ID ) )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3274:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3275:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationEndAccess().getTypeClassNameCrossReference_0()); 
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3276:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3277:1: RULE_ID
            {
             before(grammarAccess.getAssociationEndAccess().getTypeClassNameIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationEnd__TypeAssignment6587); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3288:1: rule__ConnectorLabel__NameAssignment : ( RULE_ID ) ;
    public final void rule__ConnectorLabel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3292:1: ( ( RULE_ID ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3293:1: ( RULE_ID )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3293:1: ( RULE_ID )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3294:1: RULE_ID
            {
             before(grammarAccess.getConnectorLabelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorLabel__NameAssignment6622); 
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3303:1: rule__ConnectorCardinalitiy__LeftAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ConnectorCardinalitiy__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3307:1: ( ( ruleCardinality ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3308:1: ( ruleCardinality )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3308:1: ( ruleCardinality )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3309:1: ruleCardinality
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getLeftCardinalityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__ConnectorCardinalitiy__LeftAssignment_26653);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3318:1: rule__ConnectorCardinalitiy__MiddleAssignment_3_1 : ( ruleCardinality ) ;
    public final void rule__ConnectorCardinalitiy__MiddleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3322:1: ( ( ruleCardinality ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3323:1: ( ruleCardinality )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3323:1: ( ruleCardinality )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3324:1: ruleCardinality
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getMiddleCardinalityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__ConnectorCardinalitiy__MiddleAssignment_3_16684);
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
    // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3333:1: rule__ConnectorCardinalitiy__RightAssignment_4_1 : ( ruleConnectorLabel ) ;
    public final void rule__ConnectorCardinalitiy__RightAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3337:1: ( ( ruleConnectorLabel ) )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3338:1: ( ruleConnectorLabel )
            {
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3338:1: ( ruleConnectorLabel )
            // ../de.cooperateproject.uml.xtext.clazz.ui/src-gen/de/cooperateproject/uml/xtext/clazz/ui/contentassist/antlr/internal/InternalUmlDsl.g:3339:1: ruleConnectorLabel
            {
             before(grammarAccess.getConnectorCardinalitiyAccess().getRightConnectorLabelParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleConnectorLabel_in_rule__ConnectorCardinalitiy__RightAssignment_4_16715);
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
    public static final BitSet FOLLOW_ruleClassDef_in_rule__Element__Alternatives1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Element__Alternatives1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Element__Alternatives1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__Element__Alternatives1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ClassDef__Alternatives_01236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ClassDef__Alternatives_01256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__NameAssignment_0_in_rule__Name__Alternatives1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group_1__0_in_rule__Name__Alternatives1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Name__LongnameAlternatives_1_0_01341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__LongnameAlternatives_1_0_01358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_0__0_in_rule__Inheritance__Alternatives1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_1__0_in_rule__Inheritance__Alternatives1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Member__Alternatives1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_rule__Member__Alternatives1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_rule__Connector__Alternatives1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Connector__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ConnectorCardinalitiy__Alternatives_4_21540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConnectorCardinalitiy__Alternatives_4_21560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__0_in_rule__Cardinality__Alternatives1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Alternatives_1_21648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Cardinality__Alternatives_1_21667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__0__Impl_in_rule__ClassDiagram__Group__01697 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__1_in_rule__ClassDiagram__Group__01700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__1__Impl_in_rule__ClassDiagram__Group__11758 = new BitSet(new long[]{0x0000000000861820L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__2_in_rule__ClassDiagram__Group__11761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ClassDiagram__Group__1__Impl1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__2__Impl_in_rule__ClassDiagram__Group__21820 = new BitSet(new long[]{0x0000000000861820L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__3_in_rule__ClassDiagram__Group__21823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDiagram__ElementsAssignment_2_in_rule__ClassDiagram__Group__2__Impl1850 = new BitSet(new long[]{0x0000000000841822L});
    public static final BitSet FOLLOW_rule__ClassDiagram__Group__3__Impl_in_rule__ClassDiagram__Group__31881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ClassDiagram__Group__3__Impl1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__01948 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__01951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataType__Group__0__Impl1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__0__Impl_in_rule__ClassDef__Group__02071 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__1_in_rule__ClassDef__Group__02074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Alternatives_0_in_rule__ClassDef__Group__0__Impl2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__1__Impl_in_rule__ClassDef__Group__12131 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__2_in_rule__ClassDef__Group__12134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ClassDef__Group__1__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__2__Impl_in_rule__ClassDef__Group__22193 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__3_in_rule__ClassDef__Group__22196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__ClassesAssignment_2_in_rule__ClassDef__Group__2__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__3__Impl_in_rule__ClassDef__Group__32253 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__4_in_rule__ClassDef__Group__32256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group_3__0_in_rule__ClassDef__Group__3__Impl2283 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group__4__Impl_in_rule__ClassDef__Group__42314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ClassDef__Group__4__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group_3__0__Impl_in_rule__ClassDef__Group_3__02383 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ClassDef__Group_3__1_in_rule__ClassDef__Group_3__02386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ClassDef__Group_3__0__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__Group_3__1__Impl_in_rule__ClassDef__Group_3__12445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDef__ClassesAssignment_3_1_in_rule__ClassDef__Group_3__1__Impl2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group_1__0__Impl_in_rule__Name__Group_1__02506 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Name__Group_1__1_in_rule__Name__Group_1__02509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__LongnameAssignment_1_0_in_rule__Name__Group_1__0__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group_1__1__Impl_in_rule__Name__Group_1__12566 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Name__Group_1__2_in_rule__Name__Group_1__12569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Name__Group_1__1__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group_1__2__Impl_in_rule__Name__Group_1__22628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__NameAssignment_1_2_in_rule__Name__Group_1__2__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__02691 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__02694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class__Group__0__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__12756 = new BitSet(new long[]{0x0000000003080000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__12759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__TypeAssignment_1_in_rule__Class__Group__1__Impl2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22816 = new BitSet(new long[]{0x0000000003080000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__InheritanceAssignment_2_in_rule__Class__Group__2__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32877 = new BitSet(new long[]{0x000000000C900020L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Class__Group__3__Impl2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42939 = new BitSet(new long[]{0x000000000C900020L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__42942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__MembersAssignment_4_in_rule__Class__Group__4__Impl2969 = new BitSet(new long[]{0x000000000C800022L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__53000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Class__Group__5__Impl3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_0__0__Impl_in_rule__Inheritance__Group_0__03071 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_0__1_in_rule__Inheritance__Group_0__03074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Inheritance__Group_0__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_0__1__Impl_in_rule__Inheritance__Group_0__13133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__TypeAssignment_0_1_in_rule__Inheritance__Group_0__1__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_1__0__Impl_in_rule__Inheritance__Group_1__03194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_1__1_in_rule__Inheritance__Group_1__03197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Inheritance__Group_1__0__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group_1__1__Impl_in_rule__Inheritance__Group_1__13256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__TypeAssignment_1_1_in_rule__Inheritance__Group_1__1__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03317 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Attribute__Group__0__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13382 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Attribute__Group__1__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23447 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__23450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__33507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__33510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Attribute__Group__3__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__43569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__0__Impl_in_rule__Methode__Group__03636 = new BitSet(new long[]{0x000000000C800020L});
    public static final BitSet FOLLOW_rule__Methode__Group__1_in_rule__Methode__Group__03639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Methode__Group__0__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__1__Impl_in_rule__Methode__Group__13701 = new BitSet(new long[]{0x000000000C800020L});
    public static final BitSet FOLLOW_rule__Methode__Group__2_in_rule__Methode__Group__13704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Methode__Group__1__Impl3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__2__Impl_in_rule__Methode__Group__23766 = new BitSet(new long[]{0x000000000C800020L});
    public static final BitSet FOLLOW_rule__Methode__Group__3_in_rule__Methode__Group__23769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Methode__Group__2__Impl3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__3__Impl_in_rule__Methode__Group__33831 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Methode__Group__4_in_rule__Methode__Group__33834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__NameAssignment_3_in_rule__Methode__Group__3__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__4__Impl_in_rule__Methode__Group__43891 = new BitSet(new long[]{0x000000004C000020L});
    public static final BitSet FOLLOW_rule__Methode__Group__5_in_rule__Methode__Group__43894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Methode__Group__4__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__5__Impl_in_rule__Methode__Group__53953 = new BitSet(new long[]{0x000000004C000020L});
    public static final BitSet FOLLOW_rule__Methode__Group__6_in_rule__Methode__Group__53956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_5__0_in_rule__Methode__Group__5__Impl3983 = new BitSet(new long[]{0x000000000C000022L});
    public static final BitSet FOLLOW_rule__Methode__Group__6__Impl_in_rule__Methode__Group__64014 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Methode__Group__7_in_rule__Methode__Group__64017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Methode__Group__6__Impl4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__7__Impl_in_rule__Methode__Group__74076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_7__0_in_rule__Methode__Group__7__Impl4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_5__0__Impl_in_rule__Methode__Group_5__04150 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Methode__Group_5__1_in_rule__Methode__Group_5__04153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__AttributesAssignment_5_0_in_rule__Methode__Group_5__0__Impl4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_5__1__Impl_in_rule__Methode__Group_5__14210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_5_1__0_in_rule__Methode__Group_5__1__Impl4237 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Methode__Group_5_1__0__Impl_in_rule__Methode__Group_5_1__04272 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_rule__Methode__Group_5_1__1_in_rule__Methode__Group_5_1__04275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Methode__Group_5_1__0__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_5_1__1__Impl_in_rule__Methode__Group_5_1__14334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__AttributesAssignment_5_1_1_in_rule__Methode__Group_5_1__1__Impl4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_7__0__Impl_in_rule__Methode__Group_7__04395 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Methode__Group_7__1_in_rule__Methode__Group_7__04398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Methode__Group_7__0__Impl4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group_7__1__Impl_in_rule__Methode__Group_7__14457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__TypeAssignment_7_1_in_rule__Methode__Group_7__1__Impl4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__0__Impl_in_rule__Generalization__Group__04518 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Generalization__Group__1_in_rule__Generalization__Group__04521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__LeftAssignment_0_in_rule__Generalization__Group__0__Impl4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__1__Impl_in_rule__Generalization__Group__14578 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generalization__Group__2_in_rule__Generalization__Group__14581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Generalization__Group__1__Impl4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__Group__2__Impl_in_rule__Generalization__Group__24640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generalization__RightAssignment_2_in_rule__Generalization__Group__2__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__04703 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__04706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__LeftAssignment_0_in_rule__Association__Group__0__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__14763 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__14766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Association__Group__1__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24825 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__24828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__RightAssignment_2_in_rule__Association__Group__2__Impl4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__34885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__CardinalityAssignment_3_in_rule__Association__Group__3__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__0__Impl_in_rule__ConnectorCardinalitiy__Group__04951 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__1_in_rule__ConnectorCardinalitiy__Group__04954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__1__Impl_in_rule__ConnectorCardinalitiy__Group__15012 = new BitSet(new long[]{0x0000000C00008040L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__2_in_rule__ConnectorCardinalitiy__Group__15015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ConnectorCardinalitiy__Group__1__Impl5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__2__Impl_in_rule__ConnectorCardinalitiy__Group__25074 = new BitSet(new long[]{0x0000000C00008040L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__3_in_rule__ConnectorCardinalitiy__Group__25077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__LeftAssignment_2_in_rule__ConnectorCardinalitiy__Group__2__Impl5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__3__Impl_in_rule__ConnectorCardinalitiy__Group__35135 = new BitSet(new long[]{0x0000000C00008040L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__4_in_rule__ConnectorCardinalitiy__Group__35138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_3__0_in_rule__ConnectorCardinalitiy__Group__3__Impl5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__4__Impl_in_rule__ConnectorCardinalitiy__Group__45196 = new BitSet(new long[]{0x0000000C00008040L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__5_in_rule__ConnectorCardinalitiy__Group__45199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__0_in_rule__ConnectorCardinalitiy__Group__4__Impl5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group__5__Impl_in_rule__ConnectorCardinalitiy__Group__55257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ConnectorCardinalitiy__Group__5__Impl5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_3__0__Impl_in_rule__ConnectorCardinalitiy__Group_3__05328 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_3__1_in_rule__ConnectorCardinalitiy__Group_3__05331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ConnectorCardinalitiy__Group_3__0__Impl5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_3__1__Impl_in_rule__ConnectorCardinalitiy__Group_3__15390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__MiddleAssignment_3_1_in_rule__ConnectorCardinalitiy__Group_3__1__Impl5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__0__Impl_in_rule__ConnectorCardinalitiy__Group_4__05452 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__1_in_rule__ConnectorCardinalitiy__Group_4__05455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ConnectorCardinalitiy__Group_4__0__Impl5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__1__Impl_in_rule__ConnectorCardinalitiy__Group_4__15514 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__2_in_rule__ConnectorCardinalitiy__Group_4__15517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__RightAssignment_4_1_in_rule__ConnectorCardinalitiy__Group_4__1__Impl5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Group_4__2__Impl_in_rule__ConnectorCardinalitiy__Group_4__25575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorCardinalitiy__Alternatives_4_2_in_rule__ConnectorCardinalitiy__Group_4__2__Impl5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__0__Impl_in_rule__Cardinality__Group_1__05639 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__1_in_rule__Cardinality__Group_1__05642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Cardinality__Group_1__0__Impl5669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__1__Impl_in_rule__Cardinality__Group_1__15698 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__2_in_rule__Cardinality__Group_1__15701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Cardinality__Group_1__1__Impl5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1__2__Impl_in_rule__Cardinality__Group_1__25760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_1_2_in_rule__Cardinality__Group_1__2__Impl5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__ClassDiagram__ElementsAssignment_25828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_15859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ClassDef__ClassesAssignment_25890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__ClassDef__ClassesAssignment_3_15921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__NameAssignment_05952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__LongnameAlternatives_1_0_0_in_rule__Name__LongnameAssignment_1_05983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__NameAssignment_1_26016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__TypeAssignment_16051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_rule__Class__InheritanceAssignment_26086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__Class__MembersAssignment_46117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Inheritance__TypeAssignment_0_16152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Inheritance__TypeAssignment_1_16191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_26226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_46261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Methode__NameAssignment_36296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Methode__AttributesAssignment_5_06327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Methode__AttributesAssignment_5_1_16358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Methode__TypeAssignment_7_16393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_rule__Generalization__LeftAssignment_06428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_rule__Generalization__RightAssignment_26459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_rule__Association__LeftAssignment_06490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationEnd_in_rule__Association__RightAssignment_26521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorCardinalitiy_in_rule__Association__CardinalityAssignment_36552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationEnd__TypeAssignment6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorLabel__NameAssignment6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__ConnectorCardinalitiy__LeftAssignment_26653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__ConnectorCardinalitiy__MiddleAssignment_3_16684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorLabel_in_rule__ConnectorCardinalitiy__RightAssignment_4_16715 = new BitSet(new long[]{0x0000000000000002L});

}