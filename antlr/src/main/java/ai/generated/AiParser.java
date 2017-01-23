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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		COMMENT=10, DIRECTION_EXPR=11, DIRECTION=12, NAME_IDENTIFIER=13, RATIO_EXPR=14, 
		RATIO=15, NTH_FREE=16, DIGIT=17, WS=18, LINE_BREAK=19, PARENTHESIS_OPEN=20, 
		PARENTHESIS_CLOSE=21;
	public static final int
		RULE_ai = 0, RULE_startai = 1, RULE_ai_body = 2, RULE_bracket_open = 3, 
		RULE_bracket_close = 4, RULE_reference = 5, RULE_block_declaration = 6, 
		RULE_assignment = 7, RULE_if_free_statement = 8, RULE_else_free_statement = 9, 
		RULE_random_statement = 10, RULE_ratio_expr = 11, RULE_leave_free_statement = 12, 
		RULE_get_nth_free_statement = 13, RULE_end_ai = 14;
	public static final String[] ruleNames = {
		"ai", "startai", "ai_body", "bracket_open", "bracket_close", "reference", 
		"block_declaration", "assignment", "if_free_statement", "else_free_statement", 
		"random_statement", "ratio_expr", "leave_free_statement", "get_nth_free_statement", 
		"end_ai"
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
			setState(30);
			startai();
			setState(31);
			match(LINE_BREAK);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				ai_body();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << COMMENT) | (1L << DIRECTION_EXPR) | (1L << DIRECTION) | (1L << NTH_FREE) | (1L << WS) | (1L << LINE_BREAK))) != 0) );
			setState(37);
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
			setState(39);
			match(NAME_IDENTIFIER);
			setState(40);
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
		public TerminalNode COMMENT() { return getToken(AiParser.COMMENT, 0); }
		public Bracket_openContext bracket_open() {
			return getRuleContext(Bracket_openContext.class,0);
		}
		public Bracket_closeContext bracket_close() {
			return getRuleContext(Bracket_closeContext.class,0);
		}
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(42);
				match(WS);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_BREAK:
				{
				setState(48);
				match(LINE_BREAK);
				}
				break;
			case COMMENT:
				{
				setState(49);
				match(COMMENT);
				}
				break;
			case T__0:
				{
				setState(50);
				bracket_open();
				}
				break;
			case T__1:
				{
				setState(51);
				bracket_close();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case NTH_FREE:
				{
				setState(52);
				block_declaration();
				}
				break;
			case DIRECTION:
				{
				setState(53);
				assignment();
				}
				break;
			case T__2:
				{
				setState(54);
				reference();
				}
				break;
			case DIRECTION_EXPR:
				{
				setState(55);
				match(DIRECTION_EXPR);
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

	public static class Bracket_openContext extends ParserRuleContext {
		public Bracket_openContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterBracket_open(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitBracket_open(this);
		}
	}

	public final Bracket_openContext bracket_open() throws RecognitionException {
		Bracket_openContext _localctx = new Bracket_openContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bracket_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
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

	public static class Bracket_closeContext extends ParserRuleContext {
		public Bracket_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterBracket_close(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitBracket_close(this);
		}
	}

	public final Bracket_closeContext bracket_close() throws RecognitionException {
		Bracket_closeContext _localctx = new Bracket_closeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bracket_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__1);
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
		enterRule(_localctx, 10, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__2);
			setState(63);
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
		public Else_free_statementContext else_free_statement() {
			return getRuleContext(Else_free_statementContext.class,0);
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
		enterRule(_localctx, 12, RULE_block_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(65);
				if_free_statement();
				}
				break;
			case T__6:
				{
				setState(66);
				else_free_statement();
				}
				break;
			case T__7:
				{
				setState(67);
				random_statement();
				}
				break;
			case T__8:
				{
				setState(68);
				leave_free_statement();
				}
				break;
			case NTH_FREE:
				{
				setState(69);
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
		enterRule(_localctx, 14, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(DIRECTION);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(73);
				match(WS);
				}
			}

			setState(76);
			match(T__3);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(77);
				match(WS);
				}
			}

			setState(80);
			match(T__4);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(81);
				match(WS);
				}
			}

			setState(84);
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
		enterRule(_localctx, 16, RULE_if_free_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__5);
			setState(87);
			match(DIRECTION);
			setState(88);
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

	public static class Else_free_statementContext extends ParserRuleContext {
		public Bracket_openContext bracket_open() {
			return getRuleContext(Bracket_openContext.class,0);
		}
		public Else_free_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_free_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterElse_free_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitElse_free_statement(this);
		}
	}

	public final Else_free_statementContext else_free_statement() throws RecognitionException {
		Else_free_statementContext _localctx = new Else_free_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else_free_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__6);
			setState(91);
			bracket_open();
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
		enterRule(_localctx, 20, RULE_random_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__7);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESIS_OPEN) {
				{
				setState(94);
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
		enterRule(_localctx, 22, RULE_ratio_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(PARENTHESIS_OPEN);
			setState(98);
			match(RATIO_EXPR);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				match(RATIO_EXPR);
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RATIO_EXPR );
			setState(104);
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
		enterRule(_localctx, 24, RULE_leave_free_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__8);
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
		enterRule(_localctx, 26, RULE_get_nth_free_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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
		enterRule(_localctx, 28, RULE_end_ai);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(PARENTHESIS_CLOSE);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(111);
				match(WS);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_BREAK) {
				{
				{
				setState(117);
				match(LINE_BREAK);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\2\3\2\3\3\3\3\3\3\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\5\bI\n\b\3\t\3\t\5\tM\n\t\3\t\3\t\5\tQ\n\t\3\t\3\t\5\tU\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\fb\n\f\3\r\3\r\3\r"+
		"\6\rg\n\r\r\r\16\rh\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20s\n\20\f"+
		"\20\16\20v\13\20\3\20\7\20y\n\20\f\20\16\20|\13\20\3\20\3\20\3\20\2\2"+
		"\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\u0084\2 \3\2\2\2\4)\3\2"+
		"\2\2\6/\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\f@\3\2\2\2\16H\3\2\2\2\20J\3\2\2"+
		"\2\22X\3\2\2\2\24\\\3\2\2\2\26_\3\2\2\2\30c\3\2\2\2\32l\3\2\2\2\34n\3"+
		"\2\2\2\36p\3\2\2\2 !\5\4\3\2!#\7\25\2\2\"$\5\6\4\2#\"\3\2\2\2$%\3\2\2"+
		"\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\5\36\20\2(\3\3\2\2\2)*\7\17\2\2*"+
		"+\7\26\2\2+\5\3\2\2\2,.\7\24\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60:\3\2\2\2\61/\3\2\2\2\62;\7\25\2\2\63;\7\f\2\2\64;\5\b\5\2\65"+
		";\5\n\6\2\66;\5\16\b\2\67;\5\20\t\28;\5\f\7\29;\7\r\2\2:\62\3\2\2\2:\63"+
		"\3\2\2\2:\64\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3"+
		"\2\2\2;\7\3\2\2\2<=\7\3\2\2=\t\3\2\2\2>?\7\4\2\2?\13\3\2\2\2@A\7\5\2\2"+
		"AB\7\17\2\2B\r\3\2\2\2CI\5\22\n\2DI\5\24\13\2EI\5\26\f\2FI\5\32\16\2G"+
		"I\5\34\17\2HC\3\2\2\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\17\3\2"+
		"\2\2JL\7\16\2\2KM\7\24\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NP\7\6\2\2OQ\7"+
		"\24\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RT\7\7\2\2SU\7\24\2\2TS\3\2\2\2T"+
		"U\3\2\2\2UV\3\2\2\2VW\7\17\2\2W\21\3\2\2\2XY\7\b\2\2YZ\7\16\2\2Z[\7\27"+
		"\2\2[\23\3\2\2\2\\]\7\t\2\2]^\5\b\5\2^\25\3\2\2\2_a\7\n\2\2`b\5\30\r\2"+
		"a`\3\2\2\2ab\3\2\2\2b\27\3\2\2\2cd\7\26\2\2df\7\20\2\2eg\7\20\2\2fe\3"+
		"\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\27\2\2k\31\3\2\2\2"+
		"lm\7\13\2\2m\33\3\2\2\2no\7\22\2\2o\35\3\2\2\2pt\7\27\2\2qs\7\24\2\2r"+
		"q\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uz\3\2\2\2vt\3\2\2\2wy\7\25\2\2"+
		"xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\2\2\3"+
		"~\37\3\2\2\2\r%/:HLPTahtz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}