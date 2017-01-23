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
		public TerminalNode LINE_BREAK() { return getToken(AiParser.LINE_BREAK, 0); }
		public End_aiContext end_ai() {
			return getRuleContext(End_aiContext.class,0);
		}
		public List<Ai_bodyContext> ai_body() {
			return getRuleContexts(Ai_bodyContext.class);
		}
		public Ai_bodyContext ai_body(int i) {
			return getRuleContext(Ai_bodyContext.class,i);
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				ai_body();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << DIRECTION) | (1L << NTH_FREE) | (1L << WS) | (1L << LINE_BREAK))) != 0) );
			setState(27);
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
			setState(29);
			match(AI_NAME);
			setState(30);
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
		public TerminalNode LINE_BREAK() { return getToken(AiParser.LINE_BREAK, 0); }
		public Block_declarationContext block_declaration() {
			return getRuleContext(Block_declarationContext.class,0);
		}
		public TerminalNode DIRECTION() { return getToken(AiParser.DIRECTION, 0); }
		public List<TerminalNode> WS() { return getTokens(AiParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AiParser.WS, i);
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
		Ai_bodyContext _localctx = new Ai_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ai_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(32);
				match(WS);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_BREAK:
				{
				setState(38);
				match(LINE_BREAK);
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case NTH_FREE:
				{
				setState(39);
				block_declaration();
				}
				break;
			case DIRECTION:
				{
				setState(40);
				match(DIRECTION);
				}
				break;
			case T__0:
				{
				setState(41);
				match(T__0);
				}
				break;
			case T__1:
				{
				setState(42);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(45);
				if_free_statement();
				}
				break;
			case T__3:
				{
				setState(46);
				random_statement();
				}
				break;
			case T__4:
				{
				setState(47);
				leave_free_statement();
				}
				break;
			case NTH_FREE:
				{
				setState(48);
				get_nth_free_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(51);
			match(T__2);
			setState(52);
			match(DIRECTION);
			setState(53);
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
			setState(55);
			match(T__3);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESIS_OPEN) {
				{
				setState(56);
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
			setState(59);
			match(PARENTHESIS_OPEN);
			setState(60);
			match(RATIO_EXPR);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				match(RATIO_EXPR);
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RATIO_EXPR );
			setState(66);
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
			setState(68);
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
			setState(70);
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
			setState(72);
			match(PARENTHESIS_CLOSE);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(73);
				match(WS);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_BREAK) {
				{
				{
				setState(79);
				match(LINE_BREAK);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\3\4\7\4$\n\4\f\4"+
		"\16\4\'\13\4\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\5\5\64\n\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\5\7<\n\7\3\b\3\b\3\b\6\bA\n\b\r\b\16\bB\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\7\13M\n\13\f\13\16\13P\13\13\3\13\7\13S\n\13"+
		"\f\13\16\13V\13\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\\"+
		"\2\26\3\2\2\2\4\37\3\2\2\2\6%\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\f9\3\2"+
		"\2\2\16=\3\2\2\2\20F\3\2\2\2\22H\3\2\2\2\24J\3\2\2\2\26\27\5\4\3\2\27"+
		"\31\7\16\2\2\30\32\5\6\4\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33"+
		"\34\3\2\2\2\34\35\3\2\2\2\35\36\5\24\13\2\36\3\3\2\2\2\37 \7\f\2\2 !\7"+
		"\17\2\2!\5\3\2\2\2\"$\7\r\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2"+
		"\2&-\3\2\2\2\'%\3\2\2\2(.\7\16\2\2).\5\b\5\2*.\7\b\2\2+.\7\3\2\2,.\7\4"+
		"\2\2-(\3\2\2\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\7\3\2\2\2/\64"+
		"\5\n\6\2\60\64\5\f\7\2\61\64\5\20\t\2\62\64\5\22\n\2\63/\3\2\2\2\63\60"+
		"\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\t\3\2\2\2\65\66\7\5\2\2\66\67"+
		"\7\b\2\2\678\7\20\2\28\13\3\2\2\29;\7\6\2\2:<\5\16\b\2;:\3\2\2\2;<\3\2"+
		"\2\2<\r\3\2\2\2=>\7\17\2\2>@\7\n\2\2?A\7\n\2\2@?\3\2\2\2AB\3\2\2\2B@\3"+
		"\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\20\2\2E\17\3\2\2\2FG\7\7\2\2G\21\3\2\2"+
		"\2HI\7\t\2\2I\23\3\2\2\2JN\7\20\2\2KM\7\r\2\2LK\3\2\2\2MP\3\2\2\2NL\3"+
		"\2\2\2NO\3\2\2\2OT\3\2\2\2PN\3\2\2\2QS\7\16\2\2RQ\3\2\2\2SV\3\2\2\2TR"+
		"\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\2\2\3X\25\3\2\2\2\n\33%-\63"+
		";BNT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}