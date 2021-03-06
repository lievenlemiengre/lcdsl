package com.wamas.ide.launching.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLcDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_VERSION=13;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=9;
    public static final int RULE_INT=11;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int RULE_BLOCK_END=5;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_BRACKET_CLOSE=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=12;
    public static final int T__19=19;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_BLOCK_BEGIN=4;
    public static final int RULE_BRACKET_OPEN=6;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_EQ=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_QUALIFIER=14;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalLcDslLexer() {;} 
    public InternalLcDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLcDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLcDsl.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:11:7: ( 'stdin' )
            // InternalLcDsl.g:11:9: 'stdin'
            {
            match("stdin"); 


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
            // InternalLcDsl.g:12:7: ( 'internal' )
            // InternalLcDsl.g:12:9: 'internal'
            {
            match("internal"); 


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
            // InternalLcDsl.g:13:7: ( 'external' )
            // InternalLcDsl.g:13:9: 'external'
            {
            match("external"); 


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
            // InternalLcDsl.g:14:7: ( 'none' )
            // InternalLcDsl.g:14:9: 'none'
            {
            match("none"); 


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
            // InternalLcDsl.g:15:7: ( 'java' )
            // InternalLcDsl.g:15:9: 'java'
            {
            match("java"); 


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
            // InternalLcDsl.g:16:7: ( 'eclipse' )
            // InternalLcDsl.g:16:9: 'eclipse'
            {
            match("eclipse"); 


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
            // InternalLcDsl.g:17:7: ( 'rap' )
            // InternalLcDsl.g:17:9: 'rap'
            {
            match("rap"); 


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
            // InternalLcDsl.g:18:7: ( 'group' )
            // InternalLcDsl.g:18:9: 'group'
            {
            match("group"); 


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
            // InternalLcDsl.g:19:7: ( 'inherit' )
            // InternalLcDsl.g:19:9: 'inherit'
            {
            match("inherit"); 


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
            // InternalLcDsl.g:20:7: ( 'run' )
            // InternalLcDsl.g:20:9: 'run'
            {
            match("run"); 


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
            // InternalLcDsl.g:21:7: ( 'debug' )
            // InternalLcDsl.g:21:9: 'debug'
            {
            match("debug"); 


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
            // InternalLcDsl.g:22:7: ( 'profile' )
            // InternalLcDsl.g:22:9: 'profile'
            {
            match("profile"); 


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
            // InternalLcDsl.g:23:7: ( 'coverage' )
            // InternalLcDsl.g:23:9: 'coverage'
            {
            match("coverage"); 


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
            // InternalLcDsl.g:24:7: ( 'M' )
            // InternalLcDsl.g:24:9: 'M'
            {
            match('M'); 

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
            // InternalLcDsl.g:25:7: ( 'mb' )
            // InternalLcDsl.g:25:9: 'mb'
            {
            match("mb"); 


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
            // InternalLcDsl.g:26:7: ( 'MB' )
            // InternalLcDsl.g:26:9: 'MB'
            {
            match("MB"); 


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
            // InternalLcDsl.g:27:7: ( 'm' )
            // InternalLcDsl.g:27:9: 'm'
            {
            match('m'); 

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
            // InternalLcDsl.g:28:7: ( 'G' )
            // InternalLcDsl.g:28:9: 'G'
            {
            match('G'); 

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
            // InternalLcDsl.g:29:7: ( 'gb' )
            // InternalLcDsl.g:29:9: 'gb'
            {
            match("gb"); 


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
            // InternalLcDsl.g:30:7: ( 'GB' )
            // InternalLcDsl.g:30:9: 'GB'
            {
            match("GB"); 


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
            // InternalLcDsl.g:31:7: ( 'g' )
            // InternalLcDsl.g:31:9: 'g'
            {
            match('g'); 

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
            // InternalLcDsl.g:32:7: ( 'stdout' )
            // InternalLcDsl.g:32:9: 'stdout'
            {
            match("stdout"); 


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
            // InternalLcDsl.g:33:7: ( 'stderr' )
            // InternalLcDsl.g:33:9: 'stderr'
            {
            match("stderr"); 


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
            // InternalLcDsl.g:34:7: ( 'both-out' )
            // InternalLcDsl.g:34:9: 'both-out'
            {
            match("both-out"); 


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
            // InternalLcDsl.g:35:7: ( 'configuration' )
            // InternalLcDsl.g:35:9: 'configuration'
            {
            match("configuration"); 


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
            // InternalLcDsl.g:36:7: ( ':' )
            // InternalLcDsl.g:36:9: ':'
            {
            match(':'); 

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
            // InternalLcDsl.g:37:7: ( 'workspace' )
            // InternalLcDsl.g:37:9: 'workspace'
            {
            match("workspace"); 


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
            // InternalLcDsl.g:38:7: ( ';' )
            // InternalLcDsl.g:38:9: ';'
            {
            match(';'); 

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
            // InternalLcDsl.g:39:7: ( 'working-dir' )
            // InternalLcDsl.g:39:9: 'working-dir'
            {
            match("working-dir"); 


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
            // InternalLcDsl.g:40:7: ( 'project' )
            // InternalLcDsl.g:40:9: 'project'
            {
            match("project"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:41:7: ( 'main-class' )
            // InternalLcDsl.g:41:9: 'main-class'
            {
            match("main-class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:42:7: ( 'plugin' )
            // InternalLcDsl.g:42:9: 'plugin'
            {
            match("plugin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:43:7: ( 'feature' )
            // InternalLcDsl.g:43:9: 'feature'
            {
            match("feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:44:7: ( 'content-provider' )
            // InternalLcDsl.g:44:9: 'content-provider'
            {
            match("content-provider"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:45:7: ( 'ignore' )
            // InternalLcDsl.g:45:9: 'ignore'
            {
            match("ignore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:46:7: ( 'vm-argument' )
            // InternalLcDsl.g:46:9: 'vm-argument'
            {
            match("vm-argument"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:47:7: ( 'argument' )
            // InternalLcDsl.g:47:9: 'argument'
            {
            match("argument"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:48:7: ( 'environment' )
            // InternalLcDsl.g:48:9: 'environment'
            {
            match("environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:49:7: ( 'application' )
            // InternalLcDsl.g:49:9: 'application'
            {
            match("application"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:50:7: ( 'product' )
            // InternalLcDsl.g:50:9: 'product'
            {
            match("product"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:51:7: ( 'favorite' )
            // InternalLcDsl.g:51:9: 'favorite'
            {
            match("favorite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:52:7: ( 'redirect' )
            // InternalLcDsl.g:52:9: 'redirect'
            {
            match("redirect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:53:7: ( 'to' )
            // InternalLcDsl.g:53:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:54:7: ( 'from' )
            // InternalLcDsl.g:54:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:55:7: ( 'execution-environment' )
            // InternalLcDsl.g:55:9: 'execution-environment'
            {
            match("execution-environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:56:7: ( 'config-ini-template' )
            // InternalLcDsl.g:56:9: 'config-ini-template'
            {
            match("config-ini-template"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:57:7: ( 'trace' )
            // InternalLcDsl.g:57:9: 'trace'
            {
            match("trace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:58:7: ( 'search-main' )
            // InternalLcDsl.g:58:9: 'search-main'
            {
            match("search-main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:59:7: ( 'servlet' )
            // InternalLcDsl.g:59:9: 'servlet'
            {
            match("servlet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:60:7: ( 'path' )
            // InternalLcDsl.g:60:9: 'path'
            {
            match("path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:61:7: ( 'browser' )
            // InternalLcDsl.g:61:9: 'browser'
            {
            match("browser"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:62:7: ( 'port' )
            // InternalLcDsl.g:62:9: 'port'
            {
            match("port"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:63:7: ( 'session-timeout' )
            // InternalLcDsl.g:63:9: 'session-timeout'
            {
            match("session-timeout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:64:7: ( 'context-path' )
            // InternalLcDsl.g:64:9: 'context-path'
            {
            match("context-path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:65:7: ( 'dev-mode' )
            // InternalLcDsl.g:65:9: 'dev-mode'
            {
            match("dev-mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:66:7: ( 'startlevel' )
            // InternalLcDsl.g:66:9: 'startlevel'
            {
            match("startlevel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:67:7: ( 'clear' )
            // InternalLcDsl.g:67:9: 'clear'
            {
            match("clear"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:68:7: ( 'memory' )
            // InternalLcDsl.g:68:9: 'memory'
            {
            match("memory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:69:7: ( 'min' )
            // InternalLcDsl.g:69:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:70:7: ( 'max' )
            // InternalLcDsl.g:70:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:71:7: ( 'perm' )
            // InternalLcDsl.g:71:9: 'perm'
            {
            match("perm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:72:7: ( 'member' )
            // InternalLcDsl.g:72:9: 'member'
            {
            match("member"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:73:7: ( 'delay' )
            // InternalLcDsl.g:73:9: 'delay'
            {
            match("delay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:74:7: ( 'regex' )
            // InternalLcDsl.g:74:9: 'regex'
            {
            match("regex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:75:7: ( 'wait' )
            // InternalLcDsl.g:75:9: 'wait'
            {
            match("wait"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:76:7: ( '.' )
            // InternalLcDsl.g:76:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:77:7: ( 'explicit' )
            // InternalLcDsl.g:77:9: 'explicit'
            {
            match("explicit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:78:7: ( 'manual' )
            // InternalLcDsl.g:78:9: 'manual'
            {
            match("manual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:79:7: ( 'abstract' )
            // InternalLcDsl.g:79:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:80:7: ( 'foreground' )
            // InternalLcDsl.g:80:9: 'foreground'
            {
            match("foreground"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:81:7: ( 'no-console' )
            // InternalLcDsl.g:81:9: 'no-console'
            {
            match("no-console"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:82:7: ( 'no-validate' )
            // InternalLcDsl.g:82:9: 'no-validate'
            {
            match("no-validate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:83:7: ( 'sw-install-allowed' )
            // InternalLcDsl.g:83:9: 'sw-install-allowed'
            {
            match("sw-install-allowed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:84:7: ( 'replace-env' )
            // InternalLcDsl.g:84:9: 'replace-env'
            {
            match("replace-env"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:85:7: ( 'stop-in-main' )
            // InternalLcDsl.g:85:9: 'stop-in-main'
            {
            match("stop-in-main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:86:7: ( 'qualified' )
            // InternalLcDsl.g:86:9: 'qualified'
            {
            match("qualified"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:87:7: ( 'self' )
            // InternalLcDsl.g:87:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:88:7: ( 'optional' )
            // InternalLcDsl.g:88:9: 'optional'
            {
            match("optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:89:7: ( '!' )
            // InternalLcDsl.g:89:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:90:7: ( 'system' )
            // InternalLcDsl.g:90:9: 'system'
            {
            match("system"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:91:7: ( 'inherited' )
            // InternalLcDsl.g:91:9: 'inherited'
            {
            match("inherited"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:92:8: ( 'autostart' )
            // InternalLcDsl.g:92:10: 'autostart'
            {
            match("autostart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:93:8: ( 'log' )
            // InternalLcDsl.g:93:10: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:94:8: ( 'config' )
            // InternalLcDsl.g:94:10: 'config'
            {
            match("config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:95:8: ( 'adopt' )
            // InternalLcDsl.g:95:10: 'adopt'
            {
            match("adopt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:8921:10: ( ( '0' .. '9' )+ )
            // InternalLcDsl.g:8921:12: ( '0' .. '9' )+
            {
            // InternalLcDsl.g:8921:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLcDsl.g:8921:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:8923:14: ( ( 'true' | 'false' ) )
            // InternalLcDsl.g:8923:16: ( 'true' | 'false' )
            {
            // InternalLcDsl.g:8923:16: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLcDsl.g:8923:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:8923:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:8925:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' ) )* )
            // InternalLcDsl.g:8925:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' ) )*
            {
            // InternalLcDsl.g:8925:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLcDsl.g:8925:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLcDsl.g:8925:40: ( ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='-' && LA5_0<='.')||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='^' && LA5_0<='_')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLcDsl.g:8925:41: ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' )
            	    {
            	    // InternalLcDsl.g:8925:41: ( '.' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0=='.') ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalLcDsl.g:8925:41: '.'
            	            {
            	            match('.'); 

            	            }
            	            break;

            	    }

            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_QUALIFIER"
    public final void mRULE_QUALIFIER() throws RecognitionException {
        try {
            // InternalLcDsl.g:8927:25: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // InternalLcDsl.g:8927:27: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            // InternalLcDsl.g:8927:27: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLcDsl.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUALIFIER"

    // $ANTLR start "RULE_VERSION"
    public final void mRULE_VERSION() throws RecognitionException {
        try {
            int _type = RULE_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:8929:14: ( RULE_INT ( '.' RULE_INT ( '.' RULE_INT ( '.' RULE_QUALIFIER )? )? )? )
            // InternalLcDsl.g:8929:16: RULE_INT ( '.' RULE_INT ( '.' RULE_INT ( '.' RULE_QUALIFIER )? )? )?
            {
            mRULE_INT(); 
            // InternalLcDsl.g:8929:25: ( '.' RULE_INT ( '.' RULE_INT ( '.' RULE_QUALIFIER )? )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='.') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLcDsl.g:8929:26: '.' RULE_INT ( '.' RULE_INT ( '.' RULE_QUALIFIER )? )?
                    {
                    match('.'); 
                    mRULE_INT(); 
                    // InternalLcDsl.g:8929:39: ( '.' RULE_INT ( '.' RULE_QUALIFIER )? )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalLcDsl.g:8929:40: '.' RULE_INT ( '.' RULE_QUALIFIER )?
                            {
                            match('.'); 
                            mRULE_INT(); 
                            // InternalLcDsl.g:8929:53: ( '.' RULE_QUALIFIER )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='.') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalLcDsl.g:8929:54: '.' RULE_QUALIFIER
                                    {
                                    match('.'); 
                                    mRULE_QUALIFIER(); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "RULE_VERSION"

    // $ANTLR start "RULE_EQ"
    public final void mRULE_EQ() throws RecognitionException {
        try {
            int _type = RULE_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:8931:9: ( '=' )
            // InternalLcDsl.g:8931:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQ"

    // $ANTLR start "RULE_BLOCK_BEGIN"
    public final void mRULE_BLOCK_BEGIN() throws RecognitionException {
        try {
            int _type = RULE_BLOCK_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:8933:18: ( '{' )
            // InternalLcDsl.g:8933:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BLOCK_BEGIN"

    // $ANTLR start "RULE_BLOCK_END"
    public final void mRULE_BLOCK_END() throws RecognitionException {
        try {
            int _type = RULE_BLOCK_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:8935:16: ( '}' )
            // InternalLcDsl.g:8935:18: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BLOCK_END"

    // $ANTLR start "RULE_BRACKET_OPEN"
    public final void mRULE_BRACKET_OPEN() throws RecognitionException {
        try {
            int _type = RULE_BRACKET_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:8937:19: ( '(' )
            // InternalLcDsl.g:8937:21: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACKET_OPEN"

    // $ANTLR start "RULE_BRACKET_CLOSE"
    public final void mRULE_BRACKET_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_BRACKET_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:8939:20: ( ')' )
            // InternalLcDsl.g:8939:22: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACKET_CLOSE"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:8941:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLcDsl.g:8941:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLcDsl.g:8941:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLcDsl.g:8941:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLcDsl.g:8941:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalLcDsl.g:8941:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLcDsl.g:8941:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:8941:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLcDsl.g:8941:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalLcDsl.g:8941:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLcDsl.g:8941:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // InternalLcDsl.g:8943:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLcDsl.g:8943:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLcDsl.g:8943:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLcDsl.g:8943:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalLcDsl.g:8945:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLcDsl.g:8945:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLcDsl.g:8945:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLcDsl.g:8945:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // InternalLcDsl.g:8945:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLcDsl.g:8945:41: ( '\\r' )? '\\n'
                    {
                    // InternalLcDsl.g:8945:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalLcDsl.g:8945:41: '\\r'
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
            // InternalLcDsl.g:8947:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLcDsl.g:8947:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLcDsl.g:8947:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLcDsl.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalLcDsl.g:8949:16: ( . )
            // InternalLcDsl.g:8949:18: .
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
        // InternalLcDsl.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_VERSION | RULE_EQ | RULE_BLOCK_BEGIN | RULE_BLOCK_END | RULE_BRACKET_OPEN | RULE_BRACKET_CLOSE | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=99;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalLcDsl.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalLcDsl.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalLcDsl.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalLcDsl.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalLcDsl.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalLcDsl.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalLcDsl.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalLcDsl.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalLcDsl.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalLcDsl.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalLcDsl.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalLcDsl.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalLcDsl.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalLcDsl.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalLcDsl.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // InternalLcDsl.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // InternalLcDsl.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // InternalLcDsl.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // InternalLcDsl.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // InternalLcDsl.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // InternalLcDsl.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // InternalLcDsl.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // InternalLcDsl.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // InternalLcDsl.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // InternalLcDsl.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // InternalLcDsl.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // InternalLcDsl.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // InternalLcDsl.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // InternalLcDsl.g:1:178: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // InternalLcDsl.g:1:184: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // InternalLcDsl.g:1:190: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // InternalLcDsl.g:1:196: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // InternalLcDsl.g:1:202: T__51
                {
                mT__51(); 

                }
                break;
            case 34 :
                // InternalLcDsl.g:1:208: T__52
                {
                mT__52(); 

                }
                break;
            case 35 :
                // InternalLcDsl.g:1:214: T__53
                {
                mT__53(); 

                }
                break;
            case 36 :
                // InternalLcDsl.g:1:220: T__54
                {
                mT__54(); 

                }
                break;
            case 37 :
                // InternalLcDsl.g:1:226: T__55
                {
                mT__55(); 

                }
                break;
            case 38 :
                // InternalLcDsl.g:1:232: T__56
                {
                mT__56(); 

                }
                break;
            case 39 :
                // InternalLcDsl.g:1:238: T__57
                {
                mT__57(); 

                }
                break;
            case 40 :
                // InternalLcDsl.g:1:244: T__58
                {
                mT__58(); 

                }
                break;
            case 41 :
                // InternalLcDsl.g:1:250: T__59
                {
                mT__59(); 

                }
                break;
            case 42 :
                // InternalLcDsl.g:1:256: T__60
                {
                mT__60(); 

                }
                break;
            case 43 :
                // InternalLcDsl.g:1:262: T__61
                {
                mT__61(); 

                }
                break;
            case 44 :
                // InternalLcDsl.g:1:268: T__62
                {
                mT__62(); 

                }
                break;
            case 45 :
                // InternalLcDsl.g:1:274: T__63
                {
                mT__63(); 

                }
                break;
            case 46 :
                // InternalLcDsl.g:1:280: T__64
                {
                mT__64(); 

                }
                break;
            case 47 :
                // InternalLcDsl.g:1:286: T__65
                {
                mT__65(); 

                }
                break;
            case 48 :
                // InternalLcDsl.g:1:292: T__66
                {
                mT__66(); 

                }
                break;
            case 49 :
                // InternalLcDsl.g:1:298: T__67
                {
                mT__67(); 

                }
                break;
            case 50 :
                // InternalLcDsl.g:1:304: T__68
                {
                mT__68(); 

                }
                break;
            case 51 :
                // InternalLcDsl.g:1:310: T__69
                {
                mT__69(); 

                }
                break;
            case 52 :
                // InternalLcDsl.g:1:316: T__70
                {
                mT__70(); 

                }
                break;
            case 53 :
                // InternalLcDsl.g:1:322: T__71
                {
                mT__71(); 

                }
                break;
            case 54 :
                // InternalLcDsl.g:1:328: T__72
                {
                mT__72(); 

                }
                break;
            case 55 :
                // InternalLcDsl.g:1:334: T__73
                {
                mT__73(); 

                }
                break;
            case 56 :
                // InternalLcDsl.g:1:340: T__74
                {
                mT__74(); 

                }
                break;
            case 57 :
                // InternalLcDsl.g:1:346: T__75
                {
                mT__75(); 

                }
                break;
            case 58 :
                // InternalLcDsl.g:1:352: T__76
                {
                mT__76(); 

                }
                break;
            case 59 :
                // InternalLcDsl.g:1:358: T__77
                {
                mT__77(); 

                }
                break;
            case 60 :
                // InternalLcDsl.g:1:364: T__78
                {
                mT__78(); 

                }
                break;
            case 61 :
                // InternalLcDsl.g:1:370: T__79
                {
                mT__79(); 

                }
                break;
            case 62 :
                // InternalLcDsl.g:1:376: T__80
                {
                mT__80(); 

                }
                break;
            case 63 :
                // InternalLcDsl.g:1:382: T__81
                {
                mT__81(); 

                }
                break;
            case 64 :
                // InternalLcDsl.g:1:388: T__82
                {
                mT__82(); 

                }
                break;
            case 65 :
                // InternalLcDsl.g:1:394: T__83
                {
                mT__83(); 

                }
                break;
            case 66 :
                // InternalLcDsl.g:1:400: T__84
                {
                mT__84(); 

                }
                break;
            case 67 :
                // InternalLcDsl.g:1:406: T__85
                {
                mT__85(); 

                }
                break;
            case 68 :
                // InternalLcDsl.g:1:412: T__86
                {
                mT__86(); 

                }
                break;
            case 69 :
                // InternalLcDsl.g:1:418: T__87
                {
                mT__87(); 

                }
                break;
            case 70 :
                // InternalLcDsl.g:1:424: T__88
                {
                mT__88(); 

                }
                break;
            case 71 :
                // InternalLcDsl.g:1:430: T__89
                {
                mT__89(); 

                }
                break;
            case 72 :
                // InternalLcDsl.g:1:436: T__90
                {
                mT__90(); 

                }
                break;
            case 73 :
                // InternalLcDsl.g:1:442: T__91
                {
                mT__91(); 

                }
                break;
            case 74 :
                // InternalLcDsl.g:1:448: T__92
                {
                mT__92(); 

                }
                break;
            case 75 :
                // InternalLcDsl.g:1:454: T__93
                {
                mT__93(); 

                }
                break;
            case 76 :
                // InternalLcDsl.g:1:460: T__94
                {
                mT__94(); 

                }
                break;
            case 77 :
                // InternalLcDsl.g:1:466: T__95
                {
                mT__95(); 

                }
                break;
            case 78 :
                // InternalLcDsl.g:1:472: T__96
                {
                mT__96(); 

                }
                break;
            case 79 :
                // InternalLcDsl.g:1:478: T__97
                {
                mT__97(); 

                }
                break;
            case 80 :
                // InternalLcDsl.g:1:484: T__98
                {
                mT__98(); 

                }
                break;
            case 81 :
                // InternalLcDsl.g:1:490: T__99
                {
                mT__99(); 

                }
                break;
            case 82 :
                // InternalLcDsl.g:1:496: T__100
                {
                mT__100(); 

                }
                break;
            case 83 :
                // InternalLcDsl.g:1:503: T__101
                {
                mT__101(); 

                }
                break;
            case 84 :
                // InternalLcDsl.g:1:510: T__102
                {
                mT__102(); 

                }
                break;
            case 85 :
                // InternalLcDsl.g:1:517: T__103
                {
                mT__103(); 

                }
                break;
            case 86 :
                // InternalLcDsl.g:1:524: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 87 :
                // InternalLcDsl.g:1:533: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 88 :
                // InternalLcDsl.g:1:546: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 89 :
                // InternalLcDsl.g:1:554: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 90 :
                // InternalLcDsl.g:1:567: RULE_EQ
                {
                mRULE_EQ(); 

                }
                break;
            case 91 :
                // InternalLcDsl.g:1:575: RULE_BLOCK_BEGIN
                {
                mRULE_BLOCK_BEGIN(); 

                }
                break;
            case 92 :
                // InternalLcDsl.g:1:592: RULE_BLOCK_END
                {
                mRULE_BLOCK_END(); 

                }
                break;
            case 93 :
                // InternalLcDsl.g:1:607: RULE_BRACKET_OPEN
                {
                mRULE_BRACKET_OPEN(); 

                }
                break;
            case 94 :
                // InternalLcDsl.g:1:625: RULE_BRACKET_CLOSE
                {
                mRULE_BRACKET_CLOSE(); 

                }
                break;
            case 95 :
                // InternalLcDsl.g:1:644: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 96 :
                // InternalLcDsl.g:1:656: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 97 :
                // InternalLcDsl.g:1:672: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 98 :
                // InternalLcDsl.g:1:688: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 99 :
                // InternalLcDsl.g:1:696: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\6\54\1\71\3\54\1\103\1\110\1\112\1\54\1\uffff\1\54\1\uffff\4\54\1\uffff\2\54\1\uffff\1\54\1\142\1\47\6\uffff\3\47\2\uffff\4\54\1\uffff\13\54\1\u0088\1\uffff\10\54\1\u0094\1\uffff\1\u0095\3\54\1\uffff\1\u009b\1\uffff\2\54\1\uffff\2\54\1\uffff\12\54\1\u00ab\1\54\1\uffff\2\54\1\uffff\1\54\1\uffff\1\142\12\uffff\24\54\1\u00c8\1\u00c9\4\54\1\uffff\13\54\2\uffff\1\54\1\u00dd\2\54\1\u00e1\1\uffff\17\54\1\uffff\4\54\1\u00f5\10\54\1\u00fe\12\54\1\u0109\2\54\1\u010c\2\uffff\13\54\1\u0118\1\u0119\1\u011a\5\54\1\uffff\3\54\1\uffff\3\54\1\u0127\3\54\1\u012b\10\54\1\u0134\2\54\1\uffff\1\u0137\7\54\1\uffff\12\54\1\uffff\2\54\1\uffff\1\54\1\u014c\1\54\1\u014e\1\u014f\1\54\1\u0151\4\54\3\uffff\3\54\1\u015a\10\54\1\uffff\2\54\1\u0134\1\uffff\6\54\1\u016b\1\u016c\1\uffff\2\54\1\uffff\1\u016f\1\u0170\6\54\1\u0177\2\54\1\u017a\10\54\1\uffff\1\54\2\uffff\1\54\1\uffff\3\54\1\u0188\1\54\1\u018c\2\54\1\uffff\1\54\1\u0190\1\u0191\1\u0192\14\54\2\uffff\2\54\2\uffff\3\54\1\u01a4\2\54\1\uffff\1\54\1\u01a9\1\uffff\3\54\1\u01ad\6\54\1\u01b4\1\u01b5\1\u01b6\1\uffff\3\54\1\uffff\3\54\3\uffff\1\54\1\u01be\2\54\1\u01c1\14\54\1\uffff\2\54\1\u01d0\1\54\1\uffff\1\u01d2\1\54\1\u01d4\1\uffff\3\54\1\u01d8\1\54\1\u01da\3\uffff\1\u01db\5\54\1\u01e1\1\uffff\2\54\1\uffff\1\u01e4\2\54\1\u01e7\1\54\1\u01e9\2\54\1\u01ec\5\54\1\uffff\1\u01f2\1\uffff\1\54\1\uffff\3\54\1\uffff\1\54\2\uffff\5\54\1\uffff\1\u01fd\1\54\1\uffff\2\54\1\uffff\1\54\1\uffff\1\u0202\1\u0203\1\uffff\1\u0204\4\54\1\uffff\2\54\1\u020b\6\54\1\u0212\1\uffff\1\54\1\u0214\2\54\3\uffff\1\54\1\u0218\3\54\1\u021c\1\uffff\1\u021d\1\u021e\4\54\1\uffff\1\u0223\1\uffff\1\u0224\1\u0225\1\u0226\1\uffff\3\54\3\uffff\3\54\1\u022d\4\uffff\3\54\1\u0231\2\54\1\uffff\3\54\1\uffff\2\54\1\u0239\4\54\1\uffff\3\54\1\u0241\3\54\1\uffff\1\u0245\2\54\1\uffff\1\54\1\u0249\1\54\1\uffff\1\u024b\1\uffff";
    static final String DFA18_eofS =
        "\u024c\uffff";
    static final String DFA18_minS =
        "\1\0\1\145\1\147\1\143\1\157\2\141\1\55\1\145\1\141\1\154\3\55\1\157\1\uffff\1\141\1\uffff\1\141\1\155\1\142\1\157\1\uffff\1\165\1\160\1\uffff\1\157\1\56\1\101\6\uffff\2\0\1\52\2\uffff\2\141\1\55\1\163\1\uffff\1\150\1\156\1\145\1\154\1\166\1\55\1\166\1\160\1\156\1\144\1\157\1\55\1\uffff\1\142\1\157\1\165\1\164\2\162\1\156\1\145\1\55\1\uffff\1\55\1\151\1\155\1\156\1\uffff\1\55\1\uffff\1\164\1\157\1\uffff\1\162\1\151\1\uffff\1\141\1\154\1\157\1\162\1\55\1\147\1\160\1\163\1\164\1\157\1\55\1\141\1\uffff\1\141\1\164\1\uffff\1\147\1\uffff\1\56\12\uffff\1\145\1\162\1\160\1\162\1\166\1\163\1\146\1\151\1\164\2\145\1\157\1\145\1\143\1\154\2\151\1\145\1\143\1\141\2\55\1\151\1\145\1\154\1\165\1\uffff\1\165\1\55\1\141\1\144\1\147\1\150\1\164\1\155\1\145\1\146\1\141\2\uffff\1\156\1\55\1\165\1\142\1\55\1\uffff\1\150\1\167\1\153\2\164\1\157\1\163\1\155\1\145\1\141\1\165\1\154\1\164\1\157\1\160\1\uffff\1\143\1\145\1\154\1\151\1\55\1\156\1\165\1\162\1\164\1\55\1\143\1\154\1\151\1\55\1\156\1\145\4\162\1\165\1\151\1\160\1\162\1\55\1\157\1\141\1\55\2\uffff\1\162\1\170\1\141\1\160\1\147\1\155\1\171\1\151\1\145\1\165\1\151\3\55\1\162\1\151\1\145\1\162\1\55\1\uffff\1\141\1\162\1\145\1\uffff\1\55\1\163\1\151\1\55\1\165\1\162\1\145\1\55\1\147\1\162\1\155\1\151\1\162\1\163\1\164\1\145\1\55\1\151\1\157\1\uffff\1\55\1\164\1\162\1\154\1\151\1\150\1\145\1\157\1\uffff\1\163\1\155\1\156\1\151\1\145\1\156\1\164\1\143\1\163\1\157\1\uffff\1\156\1\154\1\uffff\1\145\1\55\1\143\2\55\1\157\1\55\1\154\2\143\1\156\3\uffff\1\141\1\147\1\156\1\55\1\143\1\154\1\171\1\162\1\157\1\145\1\160\1\156\1\uffff\1\162\1\151\1\55\1\uffff\1\162\1\147\1\145\1\143\1\141\1\164\2\55\1\uffff\1\146\1\156\1\uffff\2\55\1\145\1\156\1\55\1\164\1\156\1\164\1\55\1\141\1\164\1\55\1\141\2\151\1\145\1\156\1\163\1\151\1\143\1\uffff\1\145\2\uffff\1\144\1\uffff\1\145\2\164\1\55\1\147\1\55\2\164\1\uffff\1\154\3\55\1\165\1\162\1\141\1\147\1\145\1\164\1\157\1\165\1\156\1\141\1\143\1\141\2\uffff\1\151\1\141\2\uffff\1\166\1\55\1\155\2\55\1\141\1\uffff\1\154\1\55\1\uffff\1\154\1\157\1\164\1\55\1\155\1\157\1\144\1\164\1\55\1\145\3\55\1\uffff\1\145\1\162\1\151\1\uffff\2\55\1\141\3\uffff\1\164\1\55\1\143\2\55\1\145\1\165\1\155\3\164\1\162\1\145\1\154\1\145\1\155\1\141\1\uffff\1\164\1\154\1\55\1\144\1\uffff\1\55\1\156\1\55\1\uffff\1\145\1\154\1\141\1\55\1\145\1\55\3\uffff\1\55\1\141\1\156\2\160\1\163\1\55\1\uffff\1\145\1\144\1\uffff\1\55\1\156\1\145\1\55\1\151\1\55\1\164\1\144\1\55\1\154\1\141\2\151\1\154\1\uffff\1\55\1\uffff\1\55\1\uffff\1\156\1\145\1\164\1\uffff\1\156\2\uffff\1\164\1\151\1\162\1\141\1\163\1\uffff\1\55\1\151\1\uffff\1\144\1\156\1\uffff\1\157\1\uffff\2\55\1\uffff\1\55\1\151\1\156\1\155\1\55\1\uffff\1\145\1\164\1\55\1\145\1\166\1\151\1\55\1\157\1\164\1\55\1\uffff\1\162\1\55\1\164\1\156\3\uffff\1\156\1\55\1\145\1\141\1\156\1\55\1\uffff\2\55\1\157\1\164\1\166\1\150\1\uffff\1\55\1\uffff\3\55\1\uffff\1\157\1\154\1\166\3\uffff\1\156\1\145\1\151\1\55\4\uffff\1\165\1\154\1\151\1\55\1\155\1\144\1\uffff\1\164\1\157\1\162\1\uffff\1\160\1\145\1\55\1\167\1\157\1\154\1\162\1\uffff\1\145\1\156\1\141\1\55\1\144\1\155\1\164\1\uffff\1\55\2\145\1\uffff\1\156\1\55\1\164\1\uffff\1\55\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\171\1\156\1\170\1\157\1\141\1\165\1\172\1\145\1\162\1\157\3\172\1\162\1\uffff\1\157\1\uffff\1\162\1\155\1\165\1\162\1\uffff\1\165\1\160\1\uffff\1\157\1\71\1\172\6\uffff\2\uffff\1\57\2\uffff\1\157\1\163\1\55\1\163\1\uffff\1\164\1\156\1\164\1\154\1\166\1\156\1\166\1\160\1\156\1\160\1\157\1\172\1\uffff\1\166\1\157\1\165\1\164\2\162\1\166\1\145\1\172\1\uffff\1\172\1\170\1\155\1\156\1\uffff\1\172\1\uffff\1\164\1\157\1\uffff\1\162\1\151\1\uffff\1\141\1\166\1\157\1\162\1\55\1\147\1\160\1\163\1\164\1\157\1\172\1\165\1\uffff\1\141\1\164\1\uffff\1\147\1\uffff\1\71\12\uffff\1\157\1\162\1\160\1\162\1\166\1\163\1\146\1\151\1\164\2\145\1\157\1\145\1\143\1\154\2\151\1\145\1\166\1\141\2\172\1\151\1\145\1\154\1\165\1\uffff\1\165\1\55\1\141\1\152\1\147\1\150\1\164\1\155\1\145\1\164\1\141\2\uffff\1\156\1\172\1\165\1\157\1\172\1\uffff\1\150\1\167\1\153\2\164\1\157\1\163\1\155\1\145\1\141\1\165\1\154\1\164\1\157\1\160\1\uffff\1\143\1\145\1\154\1\151\1\172\1\156\1\165\1\162\1\164\1\55\1\143\1\154\1\151\1\172\1\156\1\145\4\162\1\165\1\151\1\160\1\162\1\172\1\157\1\141\1\172\2\uffff\1\162\1\170\1\141\1\160\1\147\1\155\1\171\1\151\1\145\1\165\1\151\3\172\1\162\1\151\1\145\1\162\1\55\1\uffff\1\141\1\162\1\145\1\uffff\1\55\2\163\1\172\1\165\1\162\1\145\1\172\1\147\1\162\1\155\1\151\1\162\1\163\1\164\1\145\1\172\1\151\1\157\1\uffff\1\172\1\164\1\162\1\154\1\151\1\150\1\145\1\157\1\uffff\1\163\1\155\1\156\1\151\1\145\1\156\1\164\1\143\1\163\1\157\1\uffff\1\156\1\154\1\uffff\1\145\1\172\1\143\2\172\1\157\1\172\1\154\2\143\1\156\3\uffff\1\141\1\147\1\170\1\172\1\143\1\154\1\171\1\162\1\157\1\145\1\160\1\156\1\uffff\1\162\1\151\1\172\1\uffff\1\162\1\147\1\145\1\143\1\141\1\164\2\172\1\uffff\1\146\1\156\1\uffff\2\172\1\145\1\156\1\55\1\164\1\156\1\164\1\172\1\141\1\164\1\172\1\141\2\151\1\145\1\156\1\163\1\151\1\143\1\uffff\1\145\2\uffff\1\144\1\uffff\1\145\2\164\1\172\1\147\1\172\2\164\1\uffff\1\154\3\172\1\165\1\162\1\141\1\147\1\145\1\164\1\157\1\165\1\156\1\141\1\143\1\141\2\uffff\1\151\1\141\2\uffff\1\166\1\55\1\155\1\172\1\55\1\141\1\uffff\1\154\1\172\1\uffff\1\154\1\157\1\164\1\172\1\155\1\157\1\144\1\164\1\55\1\145\3\172\1\uffff\1\145\1\162\1\151\1\uffff\2\55\1\141\3\uffff\1\164\1\172\1\143\1\55\1\172\1\145\1\165\1\155\3\164\1\162\1\145\1\154\1\145\1\155\1\141\1\uffff\1\164\1\154\1\172\1\144\1\uffff\1\172\1\156\1\172\1\uffff\1\145\1\154\1\141\1\172\1\145\1\172\3\uffff\1\172\1\141\1\156\2\160\1\163\1\172\1\uffff\1\145\1\144\1\uffff\1\172\1\156\1\145\1\172\1\151\1\172\1\164\1\144\1\172\1\154\1\141\2\151\1\154\1\uffff\1\172\1\uffff\1\55\1\uffff\1\156\1\145\1\164\1\uffff\1\156\2\uffff\1\164\1\151\1\162\1\141\1\163\1\uffff\1\172\1\151\1\uffff\1\144\1\156\1\uffff\1\157\1\uffff\2\172\1\uffff\1\172\1\151\1\156\1\155\1\55\1\uffff\1\145\1\164\1\172\1\145\1\166\1\151\1\55\1\157\1\164\1\172\1\uffff\1\162\1\172\1\164\1\156\3\uffff\1\156\1\172\1\145\1\141\1\156\1\172\1\uffff\2\172\1\157\1\164\1\166\1\150\1\uffff\1\172\1\uffff\3\172\1\uffff\1\157\1\154\1\166\3\uffff\1\156\1\145\1\151\1\172\4\uffff\1\165\1\154\1\151\1\172\1\155\1\144\1\uffff\1\164\1\157\1\162\1\uffff\1\160\1\145\1\172\1\167\1\157\1\154\1\162\1\uffff\1\145\1\156\1\141\1\172\1\144\1\155\1\164\1\uffff\1\172\2\145\1\uffff\1\156\1\172\1\164\1\uffff\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\17\uffff\1\32\1\uffff\1\34\4\uffff\1\102\2\uffff\1\117\3\uffff\1\130\1\132\1\133\1\134\1\135\1\136\3\uffff\1\142\1\143\4\uffff\1\130\14\uffff\1\25\11\uffff\1\16\4\uffff\1\21\1\uffff\1\22\2\uffff\1\32\2\uffff\1\34\14\uffff\1\102\2\uffff\1\117\1\uffff\1\126\1\uffff\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\32\uffff\1\23\13\uffff\1\20\1\17\5\uffff\1\24\17\uffff\1\53\34\uffff\1\7\1\12\23\uffff\1\74\3\uffff\1\73\23\uffff\1\123\10\uffff\1\115\12\uffff\1\4\2\uffff\1\5\13\uffff\1\62\1\64\1\75\14\uffff\1\101\3\uffff\1\54\10\uffff\1\127\2\uffff\1\1\24\uffff\1\100\1\uffff\1\10\1\13\1\uffff\1\77\10\uffff\1\71\20\uffff\1\125\1\57\2\uffff\1\26\1\27\6\uffff\1\120\2\uffff\1\43\15\uffff\1\40\3\uffff\1\124\3\uffff\1\104\1\72\1\76\21\uffff\1\61\4\uffff\1\11\3\uffff\1\6\6\uffff\1\14\1\36\1\50\7\uffff\1\63\2\uffff\1\41\16\uffff\1\2\1\uffff\1\3\1\uffff\1\103\3\uffff\1\52\1\uffff\1\67\1\15\5\uffff\1\30\2\uffff\1\51\2\uffff\1\45\1\uffff\1\105\2\uffff\1\116\5\uffff\1\121\12\uffff\1\33\4\uffff\1\122\1\114\1\70\6\uffff\1\107\6\uffff\1\37\1\uffff\1\106\3\uffff\1\60\3\uffff\1\46\1\110\1\112\4\uffff\1\35\1\44\1\47\1\113\6\uffff\1\66\3\uffff\1\31\7\uffff\1\65\7\uffff\1\42\3\uffff\1\111\3\uffff\1\56\1\uffff\1\55";
    static final String DFA18_specialS =
        "\1\2\42\uffff\1\0\1\1\u0227\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\31\1\43\4\47\1\44\1\41\1\42\4\47\1\26\1\45\12\33\1\17\1\21\1\47\1\36\3\47\6\35\1\15\5\35\1\13\15\35\3\47\1\34\1\35\1\47\1\24\1\16\1\12\1\10\1\3\1\22\1\7\1\35\1\2\1\5\1\35\1\32\1\14\1\4\1\30\1\11\1\27\1\6\1\1\1\25\1\35\1\23\1\20\3\35\1\37\1\47\1\40\uff82\47",
            "\1\51\16\uffff\1\50\2\uffff\1\52\1\uffff\1\53",
            "\1\56\6\uffff\1\55",
            "\1\60\12\uffff\1\61\11\uffff\1\57",
            "\1\62",
            "\1\63",
            "\1\64\3\uffff\1\66\17\uffff\1\65",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\1\54\1\70\17\54\1\67\10\54",
            "\1\72",
            "\1\75\3\uffff\1\77\6\uffff\1\74\2\uffff\1\76\2\uffff\1\73",
            "\1\101\2\uffff\1\100",
            "\2\54\1\uffff\12\54\7\uffff\1\54\1\102\30\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\1\105\1\104\2\54\1\106\3\54\1\107\21\54",
            "\2\54\1\uffff\12\54\7\uffff\1\54\1\111\30\54\3\uffff\2\54\1\uffff\32\54",
            "\1\113\2\uffff\1\114",
            "",
            "\1\117\15\uffff\1\116",
            "",
            "\1\122\3\uffff\1\121\11\uffff\1\124\2\uffff\1\123",
            "\1\125",
            "\1\130\1\uffff\1\132\13\uffff\1\127\1\uffff\1\126\2\uffff\1\131",
            "\1\133\2\uffff\1\134",
            "",
            "\1\136",
            "\1\137",
            "",
            "\1\141",
            "\1\144\1\uffff\12\143",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\152",
            "\0\152",
            "\1\153\4\uffff\1\154",
            "",
            "",
            "\1\157\2\uffff\1\156\12\uffff\1\160",
            "\1\161\12\uffff\1\164\5\uffff\1\162\1\163",
            "\1\165",
            "\1\166",
            "",
            "\1\170\13\uffff\1\167",
            "\1\171",
            "\1\173\12\uffff\1\174\3\uffff\1\172",
            "\1\175",
            "\1\176",
            "\1\u0080\100\uffff\1\177",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084\2\uffff\1\u0085\10\uffff\1\u0086",
            "\1\u0087",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\1\u0089\11\uffff\1\u008b\11\uffff\1\u008a",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0092\7\uffff\1\u0091",
            "\1\u0093",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0096\4\uffff\1\u0098\11\uffff\1\u0097",
            "\1\u0099",
            "\1\u009a",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\1\u00a2\11\uffff\1\u00a1",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u00ac\23\uffff\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "",
            "\1\144\1\uffff\12\143",
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
            "\1\u00b3\3\uffff\1\u00b1\5\uffff\1\u00b2",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5\22\uffff\1\u00c6",
            "\1\u00c7",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d3\1\uffff\1\u00d1\3\uffff\1\u00d2",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9\15\uffff\1\u00da",
            "\1\u00db",
            "",
            "",
            "\1\u00dc",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u00de",
            "\1\u00e0\14\uffff\1\u00df",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u010a",
            "\1\u010b",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "\1\u0126\11\uffff\1\u0125",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0135",
            "\1\u0136",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\u014b",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u014d",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0150",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158\11\uffff\1\u0159",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "",
            "\1\u0163",
            "\1\u0164",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\1\u016d",
            "\1\u016e",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0178",
            "\1\u0179",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "",
            "\1\u0183",
            "",
            "",
            "\1\u0184",
            "",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0189",
            "\1\u018b\1\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\24\54\1\u018a\5\54",
            "\1\u018d",
            "\1\u018e",
            "",
            "\1\u018f",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "",
            "",
            "\1\u019f",
            "\1\u01a0",
            "",
            "",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "\1\u01a7",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\4\54\1\u01a8\25\54",
            "",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "",
            "",
            "",
            "\1\u01bd",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01bf",
            "\1\u01c0",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "",
            "\1\u01ce",
            "\1\u01cf",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01d1",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01d3",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01d9",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\1\u01e2",
            "\1\u01e3",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01e5",
            "\1\u01e6",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01e8",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01ea",
            "\1\u01eb",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\1\u01f3",
            "",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "",
            "\1\u01f7",
            "",
            "",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u01fe",
            "",
            "\1\u01ff",
            "\1\u0200",
            "",
            "\1\u0201",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "",
            "\1\u0209",
            "\1\u020a",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\1\u0213",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0215",
            "\1\u0216",
            "",
            "",
            "",
            "\1\u0217",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "",
            "",
            "",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0232",
            "\1\u0233",
            "",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "",
            "\1\u0237",
            "\1\u0238",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u0246",
            "\1\u0247",
            "",
            "\1\u0248",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            "\1\u024a",
            "",
            "\2\54\1\uffff\12\54\7\uffff\32\54\3\uffff\2\54\1\uffff\32\54",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_VERSION | RULE_EQ | RULE_BLOCK_BEGIN | RULE_BLOCK_END | RULE_BRACKET_OPEN | RULE_BRACKET_CLOSE | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_35 = input.LA(1);

                        s = -1;
                        if ( ((LA18_35>='\u0000' && LA18_35<='\uFFFF')) ) {s = 106;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_36 = input.LA(1);

                        s = -1;
                        if ( ((LA18_36>='\u0000' && LA18_36<='\uFFFF')) ) {s = 106;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='s') ) {s = 1;}

                        else if ( (LA18_0=='i') ) {s = 2;}

                        else if ( (LA18_0=='e') ) {s = 3;}

                        else if ( (LA18_0=='n') ) {s = 4;}

                        else if ( (LA18_0=='j') ) {s = 5;}

                        else if ( (LA18_0=='r') ) {s = 6;}

                        else if ( (LA18_0=='g') ) {s = 7;}

                        else if ( (LA18_0=='d') ) {s = 8;}

                        else if ( (LA18_0=='p') ) {s = 9;}

                        else if ( (LA18_0=='c') ) {s = 10;}

                        else if ( (LA18_0=='M') ) {s = 11;}

                        else if ( (LA18_0=='m') ) {s = 12;}

                        else if ( (LA18_0=='G') ) {s = 13;}

                        else if ( (LA18_0=='b') ) {s = 14;}

                        else if ( (LA18_0==':') ) {s = 15;}

                        else if ( (LA18_0=='w') ) {s = 16;}

                        else if ( (LA18_0==';') ) {s = 17;}

                        else if ( (LA18_0=='f') ) {s = 18;}

                        else if ( (LA18_0=='v') ) {s = 19;}

                        else if ( (LA18_0=='a') ) {s = 20;}

                        else if ( (LA18_0=='t') ) {s = 21;}

                        else if ( (LA18_0=='.') ) {s = 22;}

                        else if ( (LA18_0=='q') ) {s = 23;}

                        else if ( (LA18_0=='o') ) {s = 24;}

                        else if ( (LA18_0=='!') ) {s = 25;}

                        else if ( (LA18_0=='l') ) {s = 26;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 27;}

                        else if ( (LA18_0=='^') ) {s = 28;}

                        else if ( ((LA18_0>='A' && LA18_0<='F')||(LA18_0>='H' && LA18_0<='L')||(LA18_0>='N' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='h'||LA18_0=='k'||LA18_0=='u'||(LA18_0>='x' && LA18_0<='z')) ) {s = 29;}

                        else if ( (LA18_0=='=') ) {s = 30;}

                        else if ( (LA18_0=='{') ) {s = 31;}

                        else if ( (LA18_0=='}') ) {s = 32;}

                        else if ( (LA18_0=='(') ) {s = 33;}

                        else if ( (LA18_0==')') ) {s = 34;}

                        else if ( (LA18_0=='\"') ) {s = 35;}

                        else if ( (LA18_0=='\'') ) {s = 36;}

                        else if ( (LA18_0=='/') ) {s = 37;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 38;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='*' && LA18_0<='-')||LA18_0=='<'||(LA18_0>='>' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}