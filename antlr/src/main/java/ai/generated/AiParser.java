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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, DIRECTION_EXPR=9, 
		DIRECTION=10, NAME_IDENTIFIER=11, RATIO_EXPR=12, RATIO=13, NTH_FREE=14, 
		DIGIT=15, WS=16, LINE_BREAK=17, PARENTHESIS_OPEN=18, PARENTHESIS_CLOSE=19;
	public static final int
		RULE_ai = 0, RULE_startai = 1, RULE_ai_body = 2, RULE_reference = 3, RULE_block_declaration = 4, 
		RULE_assignment = 5, RULE_if_free_statement = 6, RULE_random_statement = 7, 
		RULE_ratio_expr = 8, RULE_leave_free_statement = 9, RULE_get_nth_free_statement = 10, 
		RULE_end_ai = 11;
	public static final String[] ruleNames = {
		"ai", "startai", "ai_body", "reference", "block_declaration", "assignment", 
		"if_free_statement", "random_statement", "ratio_expr", "leave_free_statement", 
		"get_nth_free_statement", "end_ai"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'!'", "'='", "'::'", "'if *('", "'%'", "'**'", null, 
		null, null, null, null, null, null, null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "DIRECTION_EXPR", 
		"DIRECTION", "NAME_IDENTIFIER", "RATIO_EXPR", "RATIO", "NTH_FREE", "DIGIT", 
		"WS", "LINE_BREAK", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE"
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
			setState(24);
			startai();
			setState(25);
			match(LINE_BREAK);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				ai_body();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << DIRECTION_EXPR) | (1L << DIRECTION) | (1L << NTH_FREE) | (1L << WS) | (1L << LINE_BREAK))) != 0) );
			setState(31);
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
		public TerminalNode NAME_IDENTIFIER() { return getToken(AiParser.NAME_IDENTIFIER, 0); }
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
			setState(33);
			match(NAME_IDENTIFIER);
			setState(34);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode DIRECTION_EXPR() { return getToken(AiParser.DIRECTION_EXPR, 0); }
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(36);
				match(WS);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_BREAK:
				{
				setState(42);
				match(LINE_BREAK);
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case NTH_FREE:
				{
				setState(43);
				block_declaration();
				}
				break;
			case DIRECTION:
				{
				setState(44);
				assignment();
				}
				break;
			case T__2:
				{
				setState(45);
				reference();
				}
				break;
			case DIRECTION_EXPR:
				{
				setState(46);
				match(DIRECTION_EXPR);
				}
				break;
			case T__0:
				{
				setState(47);
				match(T__0);
				}
				break;
			case T__1:
				{
				setState(48);
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode NAME_IDENTIFIER() { return getToken(AiParser.NAME_IDENTIFIER, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__2);
			setState(52);
			match(NAME_IDENTIFIER);
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
		enterRule(_localctx, 8, RULE_block_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(54);
				if_free_statement();
				}
				break;
			case T__6:
				{
				setState(55);
				random_statement();
				}
				break;
			case T__7:
				{
				setState(56);
				leave_free_statement();
				}
				break;
			case NTH_FREE:
				{
				setState(57);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode DIRECTION() { return getToken(AiParser.DIRECTION, 0); }
		public TerminalNode NAME_IDENTIFIER() { return getToken(AiParser.NAME_IDENTIFIER, 0); }
		public List<TerminalNode> WS() { return getTokens(AiParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AiParser.WS, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(DIRECTION);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(61);
				match(WS);
				}
			}

			setState(64);
			match(T__3);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(65);
				match(WS);
				}
			}

			setState(68);
			match(T__4);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(69);
				match(WS);
				}
			}

			setState(72);
			match(NAME_IDENTIFIER);
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
		public TerminalNode DIRECTION_EXPR() { return getToken(AiParser.DIRECTION_EXPR, 0); }
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
		enterRule(_localctx, 12, RULE_if_free_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__5);
			setState(75);
			match(DIRECTION_EXPR);
			setState(76);
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
		enterRule(_localctx, 14, RULE_random_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__6);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESIS_OPEN) {
				{
				setState(79);
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
		enterRule(_localctx, 16, RULE_ratio_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(PARENTHESIS_OPEN);
			setState(83);
			match(RATIO_EXPR);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				match(RATIO_EXPR);
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RATIO_EXPR );
			setState(89);
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
		enterRule(_localctx, 18, RULE_leave_free_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__7);
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
		enterRule(_localctx, 20, RULE_get_nth_free_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		enterRule(_localctx, 22, RULE_end_ai);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(PARENTHESIS_CLOSE);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(96);
				match(WS);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_BREAK) {
				{
				{
				setState(102);
				match(LINE_BREAK);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\5\7A\n\7\3\7\3\7\5\7E\n\7"+
		"\3\7\3\7\5\7I\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\5\tS\n\t\3\n\3\n\3\n"+
		"\6\nX\n\n\r\n\16\nY\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\rd\n\r\f\r\16"+
		"\rg\13\r\3\r\7\rj\n\r\f\r\16\rm\13\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\2\2v\2\32\3\2\2\2\4#\3\2\2\2\6)\3\2\2\2\b\65\3\2\2\2\n"+
		"<\3\2\2\2\f>\3\2\2\2\16L\3\2\2\2\20P\3\2\2\2\22T\3\2\2\2\24]\3\2\2\2\26"+
		"_\3\2\2\2\30a\3\2\2\2\32\33\5\4\3\2\33\35\7\23\2\2\34\36\5\6\4\2\35\34"+
		"\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\5\30\r\2"+
		"\"\3\3\2\2\2#$\7\r\2\2$%\7\24\2\2%\5\3\2\2\2&(\7\22\2\2\'&\3\2\2\2(+\3"+
		"\2\2\2)\'\3\2\2\2)*\3\2\2\2*\63\3\2\2\2+)\3\2\2\2,\64\7\23\2\2-\64\5\n"+
		"\6\2.\64\5\f\7\2/\64\5\b\5\2\60\64\7\13\2\2\61\64\7\3\2\2\62\64\7\4\2"+
		"\2\63,\3\2\2\2\63-\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61"+
		"\3\2\2\2\63\62\3\2\2\2\64\7\3\2\2\2\65\66\7\5\2\2\66\67\7\r\2\2\67\t\3"+
		"\2\2\28=\5\16\b\29=\5\20\t\2:=\5\24\13\2;=\5\26\f\2<8\3\2\2\2<9\3\2\2"+
		"\2<:\3\2\2\2<;\3\2\2\2=\13\3\2\2\2>@\7\f\2\2?A\7\22\2\2@?\3\2\2\2@A\3"+
		"\2\2\2AB\3\2\2\2BD\7\6\2\2CE\7\22\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FH"+
		"\7\7\2\2GI\7\22\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\r\2\2K\r\3\2\2\2"+
		"LM\7\b\2\2MN\7\13\2\2NO\7\25\2\2O\17\3\2\2\2PR\7\t\2\2QS\5\22\n\2RQ\3"+
		"\2\2\2RS\3\2\2\2S\21\3\2\2\2TU\7\24\2\2UW\7\16\2\2VX\7\16\2\2WV\3\2\2"+
		"\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\25\2\2\\\23\3\2\2\2]^"+
		"\7\n\2\2^\25\3\2\2\2_`\7\20\2\2`\27\3\2\2\2ae\7\25\2\2bd\7\22\2\2cb\3"+
		"\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fk\3\2\2\2ge\3\2\2\2hj\7\23\2\2ih"+
		"\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\2\2\3o"+
		"\31\3\2\2\2\r\37)\63<@DHRYek";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}