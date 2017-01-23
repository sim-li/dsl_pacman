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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		COMMENT=10, DIRECTION_EXPR=11, DIRECTION=12, NAME_IDENTIFIER=13, RATIO_EXPR=14, 
		RATIO=15, NTH_FREE=16, DIGIT=17, WS=18, LINE_BREAK=19, PARENTHESIS_OPEN=20, 
		PARENTHESIS_CLOSE=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"COMMENT", "DIRECTION_EXPR", "DIRECTION", "NAME_IDENTIFIER", "RATIO_EXPR", 
		"RATIO", "NTH_FREE", "DIGIT", "WS", "LINE_BREAK", "PARENTHESIS_OPEN", 
		"PARENTHESIS_CLOSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'!'", "'='", "'::'", "'if *('", "'else '", "'%'", 
		"'**'", null, null, null, null, null, null, null, null, null, null, "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "COMMENT", 
		"DIRECTION_EXPR", "DIRECTION", "NAME_IDENTIFIER", "RATIO_EXPR", "RATIO", 
		"NTH_FREE", "DIGIT", "WS", "LINE_BREAK", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\7\13K\n\13\f\13\16\13N\13\13\3\13\3\13\3\13\3"+
		"\13\7\13T\n\13\f\13\16\13W\13\13\3\f\3\f\3\f\5\f\\\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\rf\n\r\3\16\6\16i\n\16\r\16\16\16j\3\17\3\17\5\17o"+
		"\n\17\3\20\3\20\5\20s\n\20\3\21\3\21\6\21w\n\21\r\21\16\21x\3\22\3\22"+
		"\3\23\3\23\3\24\5\24\u0080\n\24\3\24\3\24\5\24\u0084\n\24\3\25\3\25\3"+
		"\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\5\5\2C\\aac|\3\2\62"+
		";\4\2\13\13\"\"\u0096\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r8\3"+
		"\2\2\2\17>\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25L\3\2\2\2\27X\3\2\2\2\31"+
		"e\3\2\2\2\33h\3\2\2\2\35l\3\2\2\2\37p\3\2\2\2!t\3\2\2\2#z\3\2\2\2%|\3"+
		"\2\2\2\'\u0083\3\2\2\2)\u0085\3\2\2\2+\u0087\3\2\2\2-.\7}\2\2.\4\3\2\2"+
		"\2/\60\7\177\2\2\60\6\3\2\2\2\61\62\7#\2\2\62\b\3\2\2\2\63\64\7?\2\2\64"+
		"\n\3\2\2\2\65\66\7<\2\2\66\67\7<\2\2\67\f\3\2\2\289\7k\2\29:\7h\2\2:;"+
		"\7\"\2\2;<\7,\2\2<=\7*\2\2=\16\3\2\2\2>?\7g\2\2?@\7n\2\2@A\7u\2\2AB\7"+
		"g\2\2BC\7\"\2\2C\20\3\2\2\2DE\7\'\2\2E\22\3\2\2\2FG\7,\2\2GH\7,\2\2H\24"+
		"\3\2\2\2IK\5%\23\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2N"+
		"L\3\2\2\2OU\7%\2\2PT\5%\23\2QT\5\33\16\2RT\5#\22\2SP\3\2\2\2SQ\3\2\2\2"+
		"SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\26\3\2\2\2WU\3\2\2\2XY\5\31"+
		"\r\2Y[\7=\2\2Z\\\5\'\24\2[Z\3\2\2\2[\\\3\2\2\2\\\30\3\2\2\2]^\7/\2\2^"+
		"f\7@\2\2_`\7>\2\2`f\7/\2\2ab\7?\2\2bf\7@\2\2cd\7>\2\2df\7?\2\2e]\3\2\2"+
		"\2e_\3\2\2\2ea\3\2\2\2ec\3\2\2\2f\32\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2k\34\3\2\2\2ln\5\37\20\2mo\7<\2\2nm\3\2\2\2no"+
		"\3\2\2\2o\36\3\2\2\2pr\5#\22\2qs\5#\22\2rq\3\2\2\2rs\3\2\2\2s \3\2\2\2"+
		"tv\7,\2\2uw\5#\22\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\"\3\2\2\2"+
		"z{\t\3\2\2{$\3\2\2\2|}\t\4\2\2}&\3\2\2\2~\u0080\7\17\2\2\177~\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\7\f\2\2\u0082\u0084"+
		"\7\17\2\2\u0083\177\3\2\2\2\u0083\u0082\3\2\2\2\u0084(\3\2\2\2\u0085\u0086"+
		"\7*\2\2\u0086*\3\2\2\2\u0087\u0088\7+\2\2\u0088,\3\2\2\2\16\2LSU[ejnr"+
		"x\177\u0083\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}