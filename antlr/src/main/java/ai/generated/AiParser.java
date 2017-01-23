// Generated from ./src/main/java/ai/Ai.g4 by ANTLR 4.6
package ai.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, AI_NAME=2, LINE_BREAK=3, PARENTHESIS_OPEN=4, PARENTHESIS_CLOSE=5, 
		ANY_CHAR=6;
	public static final int
		RULE_ai = 0, RULE_start_ai = 1, RULE_end_ai = 2;
	public static final String[] ruleNames = {
		"ai", "start_ai", "end_ai"
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

	@Override
	public String getGrammarFileName() { return "Ai.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AiContext extends ParserRuleContext {
		public Start_aiContext start_ai() {
			return getRuleContext(Start_aiContext.class,0);
		}
		public List<TerminalNode> LINE_BREAK() { return getTokens(AiParser.LINE_BREAK); }
		public TerminalNode LINE_BREAK(int i) {
			return getToken(AiParser.LINE_BREAK, i);
		}
		public End_aiContext end_ai() {
			return getRuleContext(End_aiContext.class,0);
		}
		public List<TerminalNode> ANY_CHAR() { return getTokens(AiParser.ANY_CHAR); }
		public TerminalNode ANY_CHAR(int i) {
			return getToken(AiParser.ANY_CHAR, i);
		}
		public AiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterAi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitAi(this);
		}
	}

	public final AiContext ai() throws RecognitionException {
		AiContext _localctx = new AiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ai);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			start_ai();
			setState(7);
			match(LINE_BREAK);
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				match(ANY_CHAR);
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANY_CHAR );
			setState(13);
			match(LINE_BREAK);
			setState(14);
			end_ai();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_aiContext extends ParserRuleContext {
		public TerminalNode AI_NAME() { return getToken(AiParser.AI_NAME, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(AiParser.PARENTHESIS_OPEN, 0); }
		public Start_aiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_ai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterStart_ai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitStart_ai(this);
		}
	}

	public final Start_aiContext start_ai() throws RecognitionException {
		Start_aiContext _localctx = new Start_aiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start_ai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(AI_NAME);
			setState(17);
			match(PARENTHESIS_OPEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_aiContext extends ParserRuleContext {
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(AiParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode EOF() { return getToken(AiParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(AiParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AiParser.WS, i);
		}
		public List<TerminalNode> LINE_BREAK() { return getTokens(AiParser.LINE_BREAK); }
		public TerminalNode LINE_BREAK(int i) {
			return getToken(AiParser.LINE_BREAK, i);
		}
		public End_aiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_ai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterEnd_ai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitEnd_ai(this);
		}
	}

	public final End_aiContext end_ai() throws RecognitionException {
		End_aiContext _localctx = new End_aiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_end_ai);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(PARENTHESIS_CLOSE);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(20);
				match(WS);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_BREAK) {
				{
				{
				setState(26);
				match(LINE_BREAK);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\7\4\30\n\4\f\4\16\4\33\13\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\4\3"+
		"\4\3\4\2\2\5\2\4\6\2\2$\2\b\3\2\2\2\4\22\3\2\2\2\6\25\3\2\2\2\b\t\5\4"+
		"\3\2\t\13\7\5\2\2\n\f\7\b\2\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r"+
		"\16\3\2\2\2\16\17\3\2\2\2\17\20\7\5\2\2\20\21\5\6\4\2\21\3\3\2\2\2\22"+
		"\23\7\4\2\2\23\24\7\6\2\2\24\5\3\2\2\2\25\31\7\7\2\2\26\30\7\3\2\2\27"+
		"\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\37\3\2\2\2\33"+
		"\31\3\2\2\2\34\36\7\5\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 "+
		"\3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\7\3\2\2\2\5\r\31\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}