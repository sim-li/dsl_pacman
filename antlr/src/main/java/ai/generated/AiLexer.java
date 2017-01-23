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
		WS=1, AI_NAME=2, LINE_BREAK=3, PARENTHESIS_OPEN=4, PARENTHESIS_CLOSE=5, 
		ANY_CHAR=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "AI_NAME", "LINE_BREAK", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", 
		"ANY_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "AI_NAME", "LINE_BREAK", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", 
		"ANY_CHAR"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\b*\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\3\6\3\27\n\3\r\3\16\3\30\3\4\5\4\34\n\4\3\4\3\4\5\4 \n\4\3\5\3\5\3"+
		"\6\3\6\3\7\6\7\'\n\7\r\7\16\7(\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\4\4"+
		"\2\13\13\"\"\5\2\62;C\\c|.\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\22\3\2\2\2\5\26\3\2\2\2\7\37\3\2\2\2\t"+
		"!\3\2\2\2\13#\3\2\2\2\r&\3\2\2\2\17\21\t\2\2\2\20\17\3\2\2\2\21\24\3\2"+
		"\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\4\3\2\2\2\24\22\3\2\2\2\25\27\t\3"+
		"\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\6\3\2"+
		"\2\2\32\34\7\17\2\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35 \7\f"+
		"\2\2\36 \7\17\2\2\37\33\3\2\2\2\37\36\3\2\2\2 \b\3\2\2\2!\"\7*\2\2\"\n"+
		"\3\2\2\2#$\7+\2\2$\f\3\2\2\2%\'\4c|\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2("+
		")\3\2\2\2)\16\3\2\2\2\b\2\22\30\33\37(\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}