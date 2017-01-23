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
		T__0=1, T__1=2, T__2=3, T__3=4, DIRECTION=5, NTH_FREE=6, RATIO_EXPR=7, 
		RATIO=8, AI_NAME=9, WS=10, LINE_BREAK=11, PARENTHESIS_OPEN=12, PARENTHESIS_CLOSE=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "DIRECTION", "NTH_FREE", "RATIO_EXPR", 
		"RATIO", "AI_NAME", "WS", "LINE_BREAK", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if *('", "'%'", "'**'", "'*'", null, null, null, null, null, null, 
		null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "DIRECTION", "NTH_FREE", "RATIO_EXPR", "RATIO", 
		"AI_NAME", "WS", "LINE_BREAK", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3\7\6\7\66\n\7"+
		"\r\7\16\7\67\3\b\3\b\5\b<\n\b\3\t\3\t\5\t@\n\t\3\n\6\nC\n\n\r\n\16\nD"+
		"\3\13\7\13H\n\13\f\13\16\13K\13\13\3\f\5\fN\n\f\3\f\3\f\5\fR\n\f\3\r\3"+
		"\r\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\3\2\5\3\2\62;\5\2\62;C\\c|\4\2\13\13\"\"`\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\3\35\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t(\3\2\2\2\13\62\3\2\2\2\r"+
		"\65\3\2\2\2\179\3\2\2\2\21=\3\2\2\2\23B\3\2\2\2\25I\3\2\2\2\27Q\3\2\2"+
		"\2\31S\3\2\2\2\33U\3\2\2\2\35\36\7k\2\2\36\37\7h\2\2\37 \7\"\2\2 !\7,"+
		"\2\2!\"\7*\2\2\"\4\3\2\2\2#$\7\'\2\2$\6\3\2\2\2%&\7,\2\2&\'\7,\2\2\'\b"+
		"\3\2\2\2()\7,\2\2)\n\3\2\2\2*+\7/\2\2+\63\7@\2\2,-\7>\2\2-\63\7/\2\2."+
		"/\7?\2\2/\63\7@\2\2\60\61\7>\2\2\61\63\7?\2\2\62*\3\2\2\2\62,\3\2\2\2"+
		"\62.\3\2\2\2\62\60\3\2\2\2\63\f\3\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66"+
		"\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\16\3\2\2\29;\5\21\t\2:<\7<\2\2"+
		";:\3\2\2\2;<\3\2\2\2<\20\3\2\2\2=?\t\2\2\2>@\t\2\2\2?>\3\2\2\2?@\3\2\2"+
		"\2@\22\3\2\2\2AC\t\3\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\24\3"+
		"\2\2\2FH\t\4\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\26\3\2\2\2K"+
		"I\3\2\2\2LN\7\17\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OR\7\f\2\2PR\7\17\2"+
		"\2QM\3\2\2\2QP\3\2\2\2R\30\3\2\2\2ST\7*\2\2T\32\3\2\2\2UV\7+\2\2V\34\3"+
		"\2\2\2\13\2\62\67;?DIMQ\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}