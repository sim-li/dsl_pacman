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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, DIRECTION=6, NTH_FREE=7, RATIO_EXPR=8, 
		RATIO=9, AI_NAME=10, WS=11, LINE_BREAK=12, PARENTHESIS_OPEN=13, PARENTHESIS_CLOSE=14;
	public static final int
		RULE_ai = 0, RULE_startai = 1, RULE_ai_body = 2, RULE_block_declaration = 3, 
		RULE_if_free_statement = 4, RULE_random_statement = 5, RULE_ratio_expr = 6, 
		RULE_leave_free_statement = 7, RULE_get_nth_free_statement = 8, RULE_end_ai = 9;
	public static final String[] ruleNames = {
		"ai", "startai", "ai_body", "block_declaration", "if_free_statement", 
		"random_statement", "ratio_expr", "leave_free_statement", "get_nth_free_statement", 
		"end_ai"
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
		public StartaiContext startai() {
			return getRuleContext(StartaiContext.class,0);
		}
		public List<TerminalNode> LINE_BREAK() { return getTokens(AiParser.LINE_BREAK); }
		public TerminalNode LINE_BREAK(int i) {
			return getToken(AiParser.LINE_BREAK, i);
		}
		public End_aiContext end_ai() {
			return getRuleContext(End_aiContext.class,0);
		}
		public List<Ai_bodyContext> ai_body() {
			return getRuleContexts(Ai_bodyContext.class);
		}
		public Ai_bodyContext ai_body(int i) {
			return getRuleContext(Ai_bodyContext.class,i);
		}
		public List<TerminalNode> DIRECTION() { return getTokens(AiParser.DIRECTION); }
		public TerminalNode DIRECTION(int i) {
			return getToken(AiParser.DIRECTION, i);
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
			setState(20);
			startai();
			setState(21);
			match(LINE_BREAK);
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(25);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					ai_body(0);
					}
					break;
				case 2:
					{
					setState(23);
					match(LINE_BREAK);
					}
					break;
				case 3:
					{
					setState(24);
					match(DIRECTION);
					}
					break;
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DIRECTION) | (1L << NTH_FREE) | (1L << LINE_BREAK))) != 0) );
			setState(29);
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

	public static class StartaiContext extends ParserRuleContext {
		public TerminalNode AI_NAME() { return getToken(AiParser.AI_NAME, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(AiParser.PARENTHESIS_OPEN, 0); }
		public StartaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterStartai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitStartai(this);
		}
	}

	public final StartaiContext startai() throws RecognitionException {
		StartaiContext _localctx = new StartaiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_startai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(AI_NAME);
			setState(32);
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

	public static class Ai_bodyContext extends ParserRuleContext {
		public Block_declarationContext block_declaration() {
			return getRuleContext(Block_declarationContext.class,0);
		}
		public List<TerminalNode> LINE_BREAK() { return getTokens(AiParser.LINE_BREAK); }
		public TerminalNode LINE_BREAK(int i) {
			return getToken(AiParser.LINE_BREAK, i);
		}
		public List<TerminalNode> DIRECTION() { return getTokens(AiParser.DIRECTION); }
		public TerminalNode DIRECTION(int i) {
			return getToken(AiParser.DIRECTION, i);
		}
		public Ai_bodyContext ai_body() {
			return getRuleContext(Ai_bodyContext.class,0);
		}
		public Ai_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterAi_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitAi_body(this);
		}
	}

	public final Ai_bodyContext ai_body() throws RecognitionException {
		return ai_body(0);
	}

	private Ai_bodyContext ai_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Ai_bodyContext _localctx = new Ai_bodyContext(_ctx, _parentState);
		Ai_bodyContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_ai_body, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_BREAK) {
				{
				setState(35);
				match(LINE_BREAK);
				}
			}

			setState(38);
			block_declaration();
			setState(39);
			match(T__0);
			setState(40);
			match(LINE_BREAK);
			setState(42); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(41);
					match(DIRECTION);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(44); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ai_bodyContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ai_body);
					setState(46);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(47);
					match(T__1);
					setState(49);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(48);
						match(LINE_BREAK);
						}
						break;
					}
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Block_declarationContext extends ParserRuleContext {
		public If_free_statementContext if_free_statement() {
			return getRuleContext(If_free_statementContext.class,0);
		}
		public Random_statementContext random_statement() {
			return getRuleContext(Random_statementContext.class,0);
		}
		public Leave_free_statementContext leave_free_statement() {
			return getRuleContext(Leave_free_statementContext.class,0);
		}
		public Get_nth_free_statementContext get_nth_free_statement() {
			return getRuleContext(Get_nth_free_statementContext.class,0);
		}
		public Block_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterBlock_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitBlock_declaration(this);
		}
	}

	public final Block_declarationContext block_declaration() throws RecognitionException {
		Block_declarationContext _localctx = new Block_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block_declaration);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				if_free_statement();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				random_statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				leave_free_statement();
				}
				break;
			case NTH_FREE:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				get_nth_free_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class If_free_statementContext extends ParserRuleContext {
		public TerminalNode DIRECTION() { return getToken(AiParser.DIRECTION, 0); }
		public If_free_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_free_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterIf_free_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitIf_free_statement(this);
		}
	}

	public final If_free_statementContext if_free_statement() throws RecognitionException {
		If_free_statementContext _localctx = new If_free_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_free_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__2);
			setState(63);
			match(DIRECTION);
			setState(64);
			match(PARENTHESIS_CLOSE);
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

	public static class Random_statementContext extends ParserRuleContext {
		public Ratio_exprContext ratio_expr() {
			return getRuleContext(Ratio_exprContext.class,0);
		}
		public Random_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterRandom_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitRandom_statement(this);
		}
	}

	public final Random_statementContext random_statement() throws RecognitionException {
		Random_statementContext _localctx = new Random_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_random_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__3);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESIS_OPEN) {
				{
				setState(67);
				ratio_expr();
				}
			}

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

	public static class Ratio_exprContext extends ParserRuleContext {
		public List<TerminalNode> RATIO_EXPR() { return getTokens(AiParser.RATIO_EXPR); }
		public TerminalNode RATIO_EXPR(int i) {
			return getToken(AiParser.RATIO_EXPR, i);
		}
		public Ratio_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratio_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterRatio_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitRatio_expr(this);
		}
	}

	public final Ratio_exprContext ratio_expr() throws RecognitionException {
		Ratio_exprContext _localctx = new Ratio_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ratio_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(PARENTHESIS_OPEN);
			setState(71);
			match(RATIO_EXPR);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				match(RATIO_EXPR);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RATIO_EXPR );
			setState(77);
			match(PARENTHESIS_CLOSE);
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

	public static class Leave_free_statementContext extends ParserRuleContext {
		public Leave_free_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leave_free_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterLeave_free_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitLeave_free_statement(this);
		}
	}

	public final Leave_free_statementContext leave_free_statement() throws RecognitionException {
		Leave_free_statementContext _localctx = new Leave_free_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_leave_free_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__4);
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

	public static class Get_nth_free_statementContext extends ParserRuleContext {
		public TerminalNode NTH_FREE() { return getToken(AiParser.NTH_FREE, 0); }
		public Get_nth_free_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_nth_free_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterGet_nth_free_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitGet_nth_free_statement(this);
		}
	}

	public final Get_nth_free_statementContext get_nth_free_statement() throws RecognitionException {
		Get_nth_free_statementContext _localctx = new Get_nth_free_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_get_nth_free_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(NTH_FREE);
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
		enterRule(_localctx, 18, RULE_end_ai);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(PARENTHESIS_CLOSE);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(84);
				match(WS);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_BREAK) {
				{
				{
				setState(90);
				match(LINE_BREAK);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return ai_body_sempred((Ai_bodyContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ai_body_sempred(Ai_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\5\4\'\n\4\3\4\3\4\3\4\3\4\6\4-\n\4\r\4\16\4.\3\4\3\4\3\4\5\4\64\n\4\7"+
		"\4\66\n\4\f\4\16\49\13\4\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\5\7G\n\7\3\b\3\b\3\b\6\bL\n\b\r\b\16\bM\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\7\13X\n\13\f\13\16\13[\13\13\3\13\7\13^\n\13\f\13\16\13a\13\13"+
		"\3\13\3\13\3\13\2\3\6\f\2\4\6\b\n\f\16\20\22\24\2\2h\2\26\3\2\2\2\4!\3"+
		"\2\2\2\6$\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fD\3\2\2\2\16H\3\2\2\2\20Q\3\2"+
		"\2\2\22S\3\2\2\2\24U\3\2\2\2\26\27\5\4\3\2\27\33\7\16\2\2\30\34\5\6\4"+
		"\2\31\34\7\16\2\2\32\34\7\b\2\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2"+
		"\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \5\24"+
		"\13\2 \3\3\2\2\2!\"\7\f\2\2\"#\7\17\2\2#\5\3\2\2\2$&\b\4\1\2%\'\7\16\2"+
		"\2&%\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\5\b\5\2)*\7\3\2\2*,\7\16\2\2+-\7"+
		"\b\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\67\3\2\2\2\60\61\f\3\2"+
		"\2\61\63\7\4\2\2\62\64\7\16\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2"+
		"\2\2\65\60\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29\67"+
		"\3\2\2\2:?\5\n\6\2;?\5\f\7\2<?\5\20\t\2=?\5\22\n\2>:\3\2\2\2>;\3\2\2\2"+
		"><\3\2\2\2>=\3\2\2\2?\t\3\2\2\2@A\7\5\2\2AB\7\b\2\2BC\7\20\2\2C\13\3\2"+
		"\2\2DF\7\6\2\2EG\5\16\b\2FE\3\2\2\2FG\3\2\2\2G\r\3\2\2\2HI\7\17\2\2IK"+
		"\7\n\2\2JL\7\n\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2O"+
		"P\7\20\2\2P\17\3\2\2\2QR\7\7\2\2R\21\3\2\2\2ST\7\t\2\2T\23\3\2\2\2UY\7"+
		"\20\2\2VX\7\r\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z_\3\2\2\2[Y"+
		"\3\2\2\2\\^\7\16\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2"+
		"\2a_\3\2\2\2bc\7\2\2\3c\25\3\2\2\2\r\33\35&.\63\67>FMY_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}