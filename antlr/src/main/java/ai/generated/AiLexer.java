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
		T__0=1, T__1=2, DIRECTION=3, RATIO_EXPR=4, RATIO=5, AI_NAME=6, WS=7, LINE_BREAK=8, 
		PARENTHESIS_OPEN=9, PARENTHESIS_CLOSE=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "DIRECTION", "RATIO_EXPR", "RATIO", "AI_NAME", "WS", "LINE_BREAK", 
		"PARENTHESIS_OPEN", "PARENTHESIS_CLOSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if *('", "'%'", null, null, null, null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "DIRECTION", "RATIO_EXPR", "RATIO", "AI_NAME", "WS", 
		"LINE_BREAK", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fG\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4(\n\4\3\5\3\5\5\5,\n\5\3\6\3\6\5\6\60\n\6\3\7\6\7\63\n\7\r\7\16\7\64"+
		"\3\b\7\b8\n\b\f\b\16\b;\13\b\3\t\5\t>\n\t\3\t\3\t\5\tB\n\t\3\n\3\n\3\13"+
		"\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\5\3\2\62"+
		";\5\2\62;C\\c|\4\2\13\13\"\"O\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\3\27\3\2\2\2\5\35\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13-\3"+
		"\2\2\2\r\62\3\2\2\2\179\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27"+
		"\30\7k\2\2\30\31\7h\2\2\31\32\7\"\2\2\32\33\7,\2\2\33\34\7*\2\2\34\4\3"+
		"\2\2\2\35\36\7\'\2\2\36\6\3\2\2\2\37 \7/\2\2 (\7@\2\2!\"\7>\2\2\"(\7/"+
		"\2\2#$\7?\2\2$(\7@\2\2%&\7>\2\2&(\7?\2\2\'\37\3\2\2\2\'!\3\2\2\2\'#\3"+
		"\2\2\2\'%\3\2\2\2(\b\3\2\2\2)+\5\13\6\2*,\7<\2\2+*\3\2\2\2+,\3\2\2\2,"+
		"\n\3\2\2\2-/\t\2\2\2.\60\t\2\2\2/.\3\2\2\2/\60\3\2\2\2\60\f\3\2\2\2\61"+
		"\63\t\3\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\16\3\2\2\2\668\t\4\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2"+
		":\20\3\2\2\2;9\3\2\2\2<>\7\17\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?B\7\f"+
		"\2\2@B\7\17\2\2A=\3\2\2\2A@\3\2\2\2B\22\3\2\2\2CD\7*\2\2D\24\3\2\2\2E"+
		"F\7+\2\2F\26\3\2\2\2\n\2\'+/\649=A\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}