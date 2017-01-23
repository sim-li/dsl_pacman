// Generated from ./src/main/java/ai/Ai.g4 by ANTLR 4.6
package ai.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, DIRECTION_EXPR=6, DIRECTION=7, 
		NAME_IDENTIFIER=8, RATIO_EXPR=9, RATIO=10, NTH_FREE=11, WS=12, LINE_BREAK=13, 
		PARENTHESIS_OPEN=14, PARENTHESIS_CLOSE=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "DIRECTION_EXPR", "DIRECTION", 
		"NAME_IDENTIFIER", "RATIO_EXPR", "RATIO", "NTH_FREE", "WS", "LINE_BREAK", 
		"PARENTHESIS_OPEN", "PARENTHESIS_CLOSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'if *('", "'%'", "'**'", null, null, null, null, 
		null, null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "DIRECTION_EXPR", "DIRECTION", "NAME_IDENTIFIER", 
		"RATIO_EXPR", "RATIO", "NTH_FREE", "WS", "LINE_BREAK", "PARENTHESIS_OPEN", 
		"PARENTHESIS_CLOSE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ai.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7\64\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b>\n\b\3\t\6\tA\n\t\r\t\16\tB\3\n\3\n\5\n"+
		"G\n\n\3\13\3\13\5\13K\n\13\3\f\3\f\6\fO\n\f\r\f\16\fP\3\r\3\r\3\16\5\16"+
		"V\n\16\3\16\3\16\5\16Z\n\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\6\2"+
		"\62;C\\aac|\3\2\62;\4\2\13\13\"\"h\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t+\3\2\2\2\13-\3\2\2"+
		"\2\r\60\3\2\2\2\17=\3\2\2\2\21@\3\2\2\2\23D\3\2\2\2\25H\3\2\2\2\27L\3"+
		"\2\2\2\31R\3\2\2\2\33Y\3\2\2\2\35[\3\2\2\2\37]\3\2\2\2!\"\7}\2\2\"\4\3"+
		"\2\2\2#$\7\177\2\2$\6\3\2\2\2%&\7k\2\2&\'\7h\2\2\'(\7\"\2\2()\7,\2\2)"+
		"*\7*\2\2*\b\3\2\2\2+,\7\'\2\2,\n\3\2\2\2-.\7,\2\2./\7,\2\2/\f\3\2\2\2"+
		"\60\61\5\17\b\2\61\63\7=\2\2\62\64\5\33\16\2\63\62\3\2\2\2\63\64\3\2\2"+
		"\2\64\16\3\2\2\2\65\66\7/\2\2\66>\7@\2\2\678\7>\2\28>\7/\2\29:\7?\2\2"+
		":>\7@\2\2;<\7>\2\2<>\7?\2\2=\65\3\2\2\2=\67\3\2\2\2=9\3\2\2\2=;\3\2\2"+
		"\2>\20\3\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\22\3"+
		"\2\2\2DF\5\25\13\2EG\7<\2\2FE\3\2\2\2FG\3\2\2\2G\24\3\2\2\2HJ\t\3\2\2"+
		"IK\t\3\2\2JI\3\2\2\2JK\3\2\2\2K\26\3\2\2\2LN\7,\2\2MO\t\3\2\2NM\3\2\2"+
		"\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\30\3\2\2\2RS\t\4\2\2S\32\3\2\2\2TV\7"+
		"\17\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WZ\7\f\2\2XZ\7\17\2\2YU\3\2\2\2Y"+
		"X\3\2\2\2Z\34\3\2\2\2[\\\7*\2\2\\\36\3\2\2\2]^\7+\2\2^ \3\2\2\2\13\2\63"+
		"=BFJPUY\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}