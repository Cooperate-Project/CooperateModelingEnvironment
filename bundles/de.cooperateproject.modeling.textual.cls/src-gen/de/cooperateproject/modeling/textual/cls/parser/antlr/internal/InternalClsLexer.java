package de.cooperateproject.modeling.textual.cls.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClsLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_UNDERSCORE=7;
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

    public InternalClsLexer() {;} 
    public InternalClsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalClsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCls.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:11:7: ( '@start-clsd' )
            // InternalCls.g:11:9: '@start-clsd'
            {
            match("@start-clsd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:12:7: ( '@end-clsd' )
            // InternalCls.g:12:9: '@end-clsd'
            {
            match("@end-clsd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:13:7: ( 'rootPackage' )
            // InternalCls.g:13:9: 'rootPackage'
            {
            match("rootPackage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:14:7: ( 'package' )
            // InternalCls.g:14:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:15:7: ( '{' )
            // InternalCls.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:16:7: ( '}' )
            // InternalCls.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:17:7: ( 'import' )
            // InternalCls.g:17:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:18:7: ( '.' )
            // InternalCls.g:18:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:19:7: ( 'abstract' )
            // InternalCls.g:19:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:20:7: ( 'class' )
            // InternalCls.g:20:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:21:7: ( 'as' )
            // InternalCls.g:21:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:22:7: ( 'interface' )
            // InternalCls.g:22:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:23:7: ( 'static' )
            // InternalCls.g:23:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:24:7: ( ':' )
            // InternalCls.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:25:7: ( '(' )
            // InternalCls.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:26:7: ( ',' )
            // InternalCls.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:27:7: ( ')' )
            // InternalCls.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:28:7: ( 'isa' )
            // InternalCls.g:28:9: 'isa'
            {
            match("isa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:29:7: ( 'impl' )
            // InternalCls.g:29:9: 'impl'
            {
            match("impl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:30:7: ( 'bi' )
            // InternalCls.g:30:9: 'bi'
            {
            match("bi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:31:7: ( 'role' )
            // InternalCls.g:31:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:32:7: ( '[' )
            // InternalCls.g:32:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:33:7: ( ']' )
            // InternalCls.g:33:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:34:7: ( 'card' )
            // InternalCls.g:34:9: 'card'
            {
            match("card"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:35:7: ( 'note' )
            // InternalCls.g:35:9: 'note'
            {
            match("note"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:36:7: ( '..' )
            // InternalCls.g:36:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:37:7: ( '*' )
            // InternalCls.g:37:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:38:7: ( '+' )
            // InternalCls.g:38:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:39:7: ( 'public' )
            // InternalCls.g:39:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:40:7: ( '-' )
            // InternalCls.g:40:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:41:7: ( 'private' )
            // InternalCls.g:41:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:42:7: ( '#' )
            // InternalCls.g:42:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:43:7: ( 'protected' )
            // InternalCls.g:43:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:44:7: ( '~' )
            // InternalCls.g:44:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:45:7: ( 'asc' )
            // InternalCls.g:45:9: 'asc'
            {
            match("asc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:46:7: ( 'agg' )
            // InternalCls.g:46:9: 'agg'
            {
            match("agg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:47:7: ( 'com' )
            // InternalCls.g:47:9: 'com'
            {
            match("com"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:1993:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCls.g:1993:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCls.g:1993:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCls.g:1993:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCls.g:1993:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCls.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_UNDERSCORE"
    public final void mRULE_UNDERSCORE() throws RecognitionException {
        try {
            int _type = RULE_UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:1995:17: ( '_' )
            // InternalCls.g:1995:19: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNDERSCORE"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:1997:10: ( ( '0' .. '9' )+ )
            // InternalCls.g:1997:12: ( '0' .. '9' )+
            {
            // InternalCls.g:1997:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCls.g:1997:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:1999:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCls.g:1999:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCls.g:1999:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCls.g:1999:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCls.g:1999:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCls.g:1999:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCls.g:1999:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCls.g:1999:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCls.g:1999:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCls.g:1999:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCls.g:1999:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2001:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCls.g:2001:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCls.g:2001:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCls.g:2001:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2003:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCls.g:2003:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCls.g:2003:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCls.g:2003:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalCls.g:2003:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCls.g:2003:41: ( '\\r' )? '\\n'
                    {
                    // InternalCls.g:2003:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCls.g:2003:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2005:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCls.g:2005:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCls.g:2005:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCls.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCls.g:2007:16: ( . )
            // InternalCls.g:2007:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCls.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_ID | RULE_UNDERSCORE | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=45;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalCls.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalCls.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalCls.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalCls.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalCls.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalCls.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalCls.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalCls.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalCls.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalCls.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalCls.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalCls.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalCls.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalCls.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalCls.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalCls.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalCls.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalCls.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalCls.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalCls.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalCls.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalCls.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalCls.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalCls.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalCls.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalCls.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalCls.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalCls.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalCls.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalCls.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalCls.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalCls.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalCls.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalCls.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalCls.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalCls.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalCls.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalCls.g:1:232: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // InternalCls.g:1:240: RULE_UNDERSCORE
                {
                mRULE_UNDERSCORE(); 

                }
                break;
            case 40 :
                // InternalCls.g:1:256: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // InternalCls.g:1:265: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // InternalCls.g:1:277: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // InternalCls.g:1:293: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 44 :
                // InternalCls.g:1:309: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 45 :
                // InternalCls.g:1:317: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\40\2\44\2\uffff\1\44\1\56\3\44\4\uffff\1\44\2\uffff\1\44\5\uffff\1\40\3\uffff\3\40\4\uffff\1\44\1\uffff\3\44\2\uffff\3\44\2\uffff\1\44\1\124\5\44\4\uffff\1\132\2\uffff\1\44\13\uffff\10\44\1\145\1\44\1\147\1\uffff\1\150\2\44\1\153\1\44\1\uffff\2\44\1\157\5\44\1\165\1\44\1\uffff\1\44\2\uffff\1\44\1\171\1\uffff\1\44\1\173\1\44\1\uffff\5\44\1\uffff\2\44\1\u0084\1\uffff\1\44\1\uffff\2\44\1\u0088\2\44\1\u008b\2\44\1\uffff\1\u008e\1\44\1\u0090\1\uffff\1\u0091\1\44\1\uffff\2\44\1\uffff\1\44\2\uffff\2\44\1\u0098\1\44\1\u009a\1\u009b\1\uffff\1\44\2\uffff\1\u009d\1\uffff";
    static final String DFA12_eofS =
        "\u009e\uffff";
    static final String DFA12_minS =
        "\1\0\1\145\1\157\1\141\2\uffff\1\155\1\56\1\142\1\141\1\164\4\uffff\1\151\2\uffff\1\157\5\uffff\1\101\3\uffff\2\0\1\52\4\uffff\1\154\1\uffff\1\143\1\142\1\151\2\uffff\1\160\1\164\1\141\2\uffff\1\163\1\60\1\147\1\141\1\162\1\155\1\141\4\uffff\1\60\2\uffff\1\164\13\uffff\1\164\1\145\1\153\1\154\1\166\1\164\1\154\1\145\1\60\1\164\1\60\1\uffff\1\60\1\163\1\144\1\60\1\164\1\uffff\1\145\1\120\1\60\1\141\1\151\1\141\1\145\1\162\1\60\1\162\1\uffff\1\162\2\uffff\1\163\1\60\1\uffff\1\151\1\60\1\141\1\uffff\1\147\1\143\1\164\1\143\1\164\1\uffff\1\146\1\141\1\60\1\uffff\1\143\1\uffff\1\143\1\145\1\60\1\145\1\164\1\60\1\141\1\143\1\uffff\1\60\1\153\1\60\1\uffff\1\60\1\145\1\uffff\1\143\1\164\1\uffff\1\141\2\uffff\1\144\1\145\1\60\1\147\2\60\1\uffff\1\145\2\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\163\1\157\1\165\2\uffff\1\163\1\56\1\163\1\157\1\164\4\uffff\1\151\2\uffff\1\157\5\uffff\1\172\3\uffff\2\uffff\1\57\4\uffff\1\157\1\uffff\1\143\1\142\1\157\2\uffff\1\160\1\164\1\141\2\uffff\1\163\1\172\1\147\1\141\1\162\1\155\1\141\4\uffff\1\172\2\uffff\1\164\13\uffff\1\164\1\145\1\153\1\154\1\166\1\164\1\157\1\145\1\172\1\164\1\172\1\uffff\1\172\1\163\1\144\1\172\1\164\1\uffff\1\145\1\120\1\172\1\141\1\151\1\141\1\145\1\162\1\172\1\162\1\uffff\1\162\2\uffff\1\163\1\172\1\uffff\1\151\1\172\1\141\1\uffff\1\147\1\143\1\164\1\143\1\164\1\uffff\1\146\1\141\1\172\1\uffff\1\143\1\uffff\1\143\1\145\1\172\1\145\1\164\1\172\1\141\1\143\1\uffff\1\172\1\153\1\172\1\uffff\1\172\1\145\1\uffff\1\143\1\164\1\uffff\1\141\2\uffff\1\144\1\145\1\172\1\147\2\172\1\uffff\1\145\2\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\5\1\6\5\uffff\1\16\1\17\1\20\1\21\1\uffff\1\26\1\27\1\uffff\1\33\1\34\1\36\1\40\1\42\1\uffff\1\46\1\47\1\50\3\uffff\1\54\1\55\1\1\1\2\1\uffff\1\46\3\uffff\1\5\1\6\3\uffff\1\32\1\10\7\uffff\1\16\1\17\1\20\1\21\1\uffff\1\26\1\27\1\uffff\1\33\1\34\1\36\1\40\1\42\1\47\1\50\1\51\1\52\1\53\1\54\13\uffff\1\13\5\uffff\1\24\12\uffff\1\22\1\uffff\1\43\1\44\2\uffff\1\45\3\uffff\1\25\5\uffff\1\23\3\uffff\1\30\1\uffff\1\31\10\uffff\1\12\3\uffff\1\35\2\uffff\1\7\2\uffff\1\15\1\uffff\1\4\1\37\6\uffff\1\11\1\uffff\1\41\1\14\1\uffff\1\3";
    static final String DFA12_specialS =
        "\1\2\33\uffff\1\0\1\1\u0080\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\34\1\26\3\40\1\35\1\14\1\16\1\23\1\24\1\15\1\25\1\7\1\36\12\33\1\13\5\40\1\1\32\31\1\20\1\40\1\21\1\30\1\32\1\40\1\10\1\17\1\11\5\31\1\6\4\31\1\22\1\31\1\3\1\31\1\2\1\12\7\31\1\4\1\40\1\5\1\27\uff81\40",
            "\1\42\15\uffff\1\41",
            "\1\43",
            "\1\45\20\uffff\1\47\2\uffff\1\46",
            "",
            "",
            "\1\52\1\53\4\uffff\1\54",
            "\1\55",
            "\1\57\4\uffff\1\61\13\uffff\1\60",
            "\1\63\12\uffff\1\62\2\uffff\1\64",
            "\1\65",
            "",
            "",
            "",
            "",
            "\1\72",
            "",
            "",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "\32\44\6\uffff\32\44",
            "",
            "",
            "",
            "\0\105",
            "\0\105",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "",
            "",
            "\1\112\2\uffff\1\111",
            "",
            "\1\113",
            "\1\114",
            "\1\115\5\uffff\1\116",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "\1\122",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\2\44\1\123\27\44",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\143\2\uffff\1\142",
            "\1\144",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\146",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\151",
            "\1\152",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\166",
            "",
            "\1\167",
            "",
            "",
            "\1\170",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\172",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0089",
            "\1\u008a",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008c",
            "\1\u008d",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008f",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0099",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u009c",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_ID | RULE_UNDERSCORE | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_28 = input.LA(1);

                        s = -1;
                        if ( ((LA12_28>='\u0000' && LA12_28<='\uFFFF')) ) {s = 69;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFF')) ) {s = 69;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='@') ) {s = 1;}

                        else if ( (LA12_0=='r') ) {s = 2;}

                        else if ( (LA12_0=='p') ) {s = 3;}

                        else if ( (LA12_0=='{') ) {s = 4;}

                        else if ( (LA12_0=='}') ) {s = 5;}

                        else if ( (LA12_0=='i') ) {s = 6;}

                        else if ( (LA12_0=='.') ) {s = 7;}

                        else if ( (LA12_0=='a') ) {s = 8;}

                        else if ( (LA12_0=='c') ) {s = 9;}

                        else if ( (LA12_0=='s') ) {s = 10;}

                        else if ( (LA12_0==':') ) {s = 11;}

                        else if ( (LA12_0=='(') ) {s = 12;}

                        else if ( (LA12_0==',') ) {s = 13;}

                        else if ( (LA12_0==')') ) {s = 14;}

                        else if ( (LA12_0=='b') ) {s = 15;}

                        else if ( (LA12_0=='[') ) {s = 16;}

                        else if ( (LA12_0==']') ) {s = 17;}

                        else if ( (LA12_0=='n') ) {s = 18;}

                        else if ( (LA12_0=='*') ) {s = 19;}

                        else if ( (LA12_0=='+') ) {s = 20;}

                        else if ( (LA12_0=='-') ) {s = 21;}

                        else if ( (LA12_0=='#') ) {s = 22;}

                        else if ( (LA12_0=='~') ) {s = 23;}

                        else if ( (LA12_0=='^') ) {s = 24;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||(LA12_0>='d' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||LA12_0=='o'||LA12_0=='q'||(LA12_0>='t' && LA12_0<='z')) ) {s = 25;}

                        else if ( (LA12_0=='_') ) {s = 26;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 27;}

                        else if ( (LA12_0=='\"') ) {s = 28;}

                        else if ( (LA12_0=='\'') ) {s = 29;}

                        else if ( (LA12_0=='/') ) {s = 30;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 31;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||(LA12_0>=';' && LA12_0<='?')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='\u007F' && LA12_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}