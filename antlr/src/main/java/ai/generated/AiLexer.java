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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, DIRECTION=6, NTH_FREE=7, RATIO_EXPR=8, 
		RATIO=9, AI_NAME=10, WS=11, LINE_BREAK=12, PARENTHESIS_OPEN=13, PARENTHESIS_CLOSE=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "DIRECTION", "NTH_FREE", "RATIO_EXPR", 
		"RATIO", "AI_NAME", "WS", "LINE_BREAK", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'if *('", "'%'", "'**'", null, null, null, null, 
		null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "DIRECTION", "NTH_FREE", "RATIO_EXPR", 
		"RATIO", "AI_NAME", "WS", "LINE_BREAK", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\\\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\67"+
		"\n\7\3\7\3\7\5\7;\n\7\3\b\3\b\6\b?\n\b\r\b\16\b@\3\t\3\t\5\tE\n\t\3\n"+
		"\3\n\5\nI\n\n\3\13\6\13L\n\13\r\13\16\13M\3\f\3\f\3\r\5\rS\n\r\3\r\3\r"+
		"\5\rW\n\r\3\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\5\3\2\62;\5\2\62;C\\c|\4\2\13"+
		"\13\"\"e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2"+
		"\2\7#\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r\66\3\2\2\2\17<\3\2\2\2\21B\3\2"+
		"\2\2\23F\3\2\2\2\25K\3\2\2\2\27O\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35Z\3"+
		"\2\2\2\37 \7}\2\2 \4\3\2\2\2!\"\7\177\2\2\"\6\3\2\2\2#$\7k\2\2$%\7h\2"+
		"\2%&\7\"\2\2&\'\7,\2\2\'(\7*\2\2(\b\3\2\2\2)*\7\'\2\2*\n\3\2\2\2+,\7,"+
		"\2\2,-\7,\2\2-\f\3\2\2\2./\7/\2\2/\67\7@\2\2\60\61\7>\2\2\61\67\7/\2\2"+
		"\62\63\7?\2\2\63\67\7@\2\2\64\65\7>\2\2\65\67\7?\2\2\66.\3\2\2\2\66\60"+
		"\3\2\2\2\66\62\3\2\2\2\66\64\3\2\2\2\678\3\2\2\28:\7=\2\29;\5\31\r\2:"+
		"9\3\2\2\2:;\3\2\2\2;\16\3\2\2\2<>\7,\2\2=?\t\2\2\2>=\3\2\2\2?@\3\2\2\2"+
		"@>\3\2\2\2@A\3\2\2\2A\20\3\2\2\2BD\5\23\n\2CE\7<\2\2DC\3\2\2\2DE\3\2\2"+
		"\2E\22\3\2\2\2FH\t\2\2\2GI\t\2\2\2HG\3\2\2\2HI\3\2\2\2I\24\3\2\2\2JL\t"+
		"\3\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\26\3\2\2\2OP\t\4\2\2P"+
		"\30\3\2\2\2QS\7\17\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TW\7\f\2\2UW\7\17"+
		"\2\2VR\3\2\2\2VU\3\2\2\2W\32\3\2\2\2XY\7*\2\2Y\34\3\2\2\2Z[\7+\2\2[\36"+
		"\3\2\2\2\13\2\66:@DHMRV\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}