package ai;
// Generated from AI.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NEWLINE=4, INT=5, CHAR=6, WS=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "NEWLINE", "INT", "CHAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Der Computer feuert auf'", "'.'", "'Der Computer feuert per Zufall auf eine noch nicht getroffene Zelle.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "NEWLINE", "INT", "CHAR", "WS"
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


	public AILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u0080\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\6\5r\n\5\r\5\16\5s\3\6\3\6\3\7\3\7\3\b\6\b{\n\b\r\b\16"+
		"\b|\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\6\4\2\f\f\17\17\3"+
		"\2\639\3\2CI\4\2\13\13\"\"\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5)\3\2\2"+
		"\2\7+\3\2\2\2\tq\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2\17z\3\2\2\2\21\22\7F\2"+
		"\2\22\23\7g\2\2\23\24\7t\2\2\24\25\7\"\2\2\25\26\7E\2\2\26\27\7q\2\2\27"+
		"\30\7o\2\2\30\31\7r\2\2\31\32\7w\2\2\32\33\7v\2\2\33\34\7g\2\2\34\35\7"+
		"t\2\2\35\36\7\"\2\2\36\37\7h\2\2\37 \7g\2\2 !\7w\2\2!\"\7g\2\2\"#\7t\2"+
		"\2#$\7v\2\2$%\7\"\2\2%&\7c\2\2&\'\7w\2\2\'(\7h\2\2(\4\3\2\2\2)*\7\60\2"+
		"\2*\6\3\2\2\2+,\7F\2\2,-\7g\2\2-.\7t\2\2./\7\"\2\2/\60\7E\2\2\60\61\7"+
		"q\2\2\61\62\7o\2\2\62\63\7r\2\2\63\64\7w\2\2\64\65\7v\2\2\65\66\7g\2\2"+
		"\66\67\7t\2\2\678\7\"\2\289\7h\2\29:\7g\2\2:;\7w\2\2;<\7g\2\2<=\7t\2\2"+
		"=>\7v\2\2>?\7\"\2\2?@\7r\2\2@A\7g\2\2AB\7t\2\2BC\7\"\2\2CD\7\\\2\2DE\7"+
		"w\2\2EF\7h\2\2FG\7c\2\2GH\7n\2\2HI\7n\2\2IJ\7\"\2\2JK\7c\2\2KL\7w\2\2"+
		"LM\7h\2\2MN\7\"\2\2NO\7g\2\2OP\7k\2\2PQ\7p\2\2QR\7g\2\2RS\7\"\2\2ST\7"+
		"p\2\2TU\7q\2\2UV\7e\2\2VW\7j\2\2WX\7\"\2\2XY\7p\2\2YZ\7k\2\2Z[\7e\2\2"+
		"[\\\7j\2\2\\]\7v\2\2]^\7\"\2\2^_\7i\2\2_`\7g\2\2`a\7v\2\2ab\7t\2\2bc\7"+
		"q\2\2cd\7h\2\2de\7h\2\2ef\7g\2\2fg\7p\2\2gh\7g\2\2hi\7\"\2\2ij\7\\\2\2"+
		"jk\7g\2\2kl\7n\2\2lm\7n\2\2mn\7g\2\2no\7\60\2\2o\b\3\2\2\2pr\t\2\2\2q"+
		"p\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\n\3\2\2\2uv\t\3\2\2v\f\3\2\2"+
		"\2wx\t\4\2\2x\16\3\2\2\2y{\t\5\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}~\3\2\2\2~\177\b\b\2\2\177\20\3\2\2\2\5\2s|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
