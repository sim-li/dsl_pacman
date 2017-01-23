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
		AI_NAME=1, ANY_CHAR=2, LINE_BREAK=3, PARENTHESIS_OPEN=4, PARENTHESIS_CLOSE=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AI_NAME", "ANY_CHAR", "LINE_BREAK", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AI_NAME", "ANY_CHAR", "LINE_BREAK", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7\"\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\17\n\2\r\2\16\2\20\3\3\6\3\24\n"+
		"\3\r\3\16\3\25\3\4\5\4\31\n\4\3\4\3\4\5\4\35\n\4\3\5\3\5\3\6\3\6\2\2\7"+
		"\3\3\5\4\7\5\t\6\13\7\3\2\3\5\2\62;C\\c|%\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\16\3\2\2\2\5\23\3\2\2\2\7\34\3\2\2"+
		"\2\t\36\3\2\2\2\13 \3\2\2\2\r\17\t\2\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20"+
		"\16\3\2\2\2\20\21\3\2\2\2\21\4\3\2\2\2\22\24\t\2\2\2\23\22\3\2\2\2\24"+
		"\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\6\3\2\2\2\27\31\7\17\2\2\30"+
		"\27\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\35\7\f\2\2\33\35\7\17\2\2\34"+
		"\30\3\2\2\2\34\33\3\2\2\2\35\b\3\2\2\2\36\37\7*\2\2\37\n\3\2\2\2 !\7+"+
		"\2\2!\f\3\2\2\2\7\2\20\25\30\34\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}