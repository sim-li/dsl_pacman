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
		T__9=10, COMMENT=11, DIRECTION=12, NAME_IDENTIFIER=13, RATIO_EXPR=14, 
		RATIO=15, NTH_FREE=16, DIGIT=17, WS=18, LINE_BREAK=19, PARENTHESIS_OPEN=20, 
		PARENTHESIS_CLOSE=21;
	public static final int
		RULE_ai = 0, RULE_startai = 1, RULE_ai_body = 2, RULE_bracket_open = 3, 
		RULE_bracket_close = 4, RULE_reference = 5, RULE_block_declaration = 6, 
		RULE_assignment = 7, RULE_if_free_statement = 8, RULE_else_free_statement = 9, 
		RULE_random_statement = 10, RULE_ratio_expr = 11, RULE_leave_free_statement = 12, 
		RULE_get_nth_free_statement = 13, RULE_end_ai = 14, RULE_direction_statement = 15;
	public static final String[] ruleNames = {
		"ai", "startai", "ai_body", "bracket_open", "bracket_close", "reference", 
		"block_declaration", "assignment", "if_free_statement", "else_free_statement", 
		"random_statement", "ratio_expr", "leave_free_statement", "get_nth_free_statement", 
		"end_ai", "direction_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'!'", "'='", "'::'", "'if *('", "'else'", "'%'", 
		"'**'", "';'", null, null, null, null, null, null, null, null, null, "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "COMMENT", 
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
			setState(32);
			startai();
			setState(33);
			match(LINE_BREAK);
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				ai_body();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << COMMENT) | (1L << DIRECTION) | (1L << NTH_FREE) | (1L << WS) | (1L << LINE_BREAK))) != 0) );
			setState(39);
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
			setState(41);
			match(NAME_IDENTIFIER);
			setState(42);
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
		public Direction_statementContext direction_statement() {
			return getRuleContext(Direction_statementContext.class,0);
		}
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(44);
				match(WS);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(50);
				match(LINE_BREAK);
				}
				break;
			case 2:
				{
				setState(51);
				match(COMMENT);
				}
				break;
			case 3:
				{
				setState(52);
				bracket_close();
				}
				break;
			case 4:
				{
				setState(53);
				block_declaration();
				}
				break;
			case 5:
				{
				setState(54);
				assignment();
				}
				break;
			case 6:
				{
				setState(55);
				reference();
				}
				break;
			case 7:
				{
				setState(56);
				direction_statement();
				}
				break;
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
			setState(59);
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
			setState(61);
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
			setState(63);
			match(T__2);
			setState(64);
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(66);
				if_free_statement();
				}
				break;
			case T__6:
				{
				setState(67);
				else_free_statement();
				}
				break;
			case T__7:
				{
				setState(68);
				random_statement();
				}
				break;
			case T__8:
				{
				setState(69);
				leave_free_statement();
				}
				break;
			case NTH_FREE:
				{
				setState(70);
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
			setState(73);
			match(DIRECTION);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(74);
				match(WS);
				}
			}

			setState(77);
			match(T__3);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(78);
				match(WS);
				}
			}

			setState(81);
			match(T__4);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(82);
				match(WS);
				}
			}

			setState(85);
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
		public Bracket_openContext bracket_open() {
			return getRuleContext(Bracket_openContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AiParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AiParser.WS, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__5);
			setState(88);
			match(DIRECTION);
			setState(89);
			match(PARENTHESIS_CLOSE);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(90);
				match(WS);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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

	public static class Else_free_statementContext extends ParserRuleContext {
		public Bracket_openContext bracket_open() {
			return getRuleContext(Bracket_openContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AiParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AiParser.WS, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__6);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(99);
				match(WS);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
		public Bracket_openContext bracket_open() {
			return getRuleContext(Bracket_openContext.class,0);
		}
		public Ratio_exprContext ratio_expr() {
			return getRuleContext(Ratio_exprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AiParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AiParser.WS, i);
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
			setState(107);
			match(T__7);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESIS_OPEN) {
				{
				setState(108);
				ratio_expr();
				}
			}

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
			setState(117);
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
			setState(119);
			match(PARENTHESIS_OPEN);
			setState(120);
			match(RATIO_EXPR);
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				match(RATIO_EXPR);
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RATIO_EXPR );
			setState(126);
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
		public Bracket_openContext bracket_open() {
			return getRuleContext(Bracket_openContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AiParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AiParser.WS, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__8);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(129);
				match(WS);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
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

	public static class Get_nth_free_statementContext extends ParserRuleContext {
		public TerminalNode NTH_FREE() { return getToken(AiParser.NTH_FREE, 0); }
		public Bracket_openContext bracket_open() {
			return getRuleContext(Bracket_openContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AiParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AiParser.WS, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(NTH_FREE);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(138);
				match(WS);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
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
			setState(146);
			match(PARENTHESIS_CLOSE);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(147);
				match(WS);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_BREAK) {
				{
				{
				setState(153);
				match(LINE_BREAK);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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

	public static class Direction_statementContext extends ParserRuleContext {
		public TerminalNode DIRECTION() { return getToken(AiParser.DIRECTION, 0); }
		public TerminalNode LINE_BREAK() { return getToken(AiParser.LINE_BREAK, 0); }
		public Direction_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).enterDirection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiListener ) ((AiListener)listener).exitDirection_statement(this);
		}
	}

	public final Direction_statementContext direction_statement() throws RecognitionException {
		Direction_statementContext _localctx = new Direction_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_direction_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(DIRECTION);
			setState(162);
			match(T__9);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(163);
				match(LINE_BREAK);
				}
				break;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u00a9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\3\3\3\3\3\3\3\4\7\4\60\n\4\f\4\16\4\63"+
		"\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\5\bJ\n\b\3\t\3\t\5\tN\n\t\3\t\3\t\5\tR\n\t\3\t\3"+
		"\t\5\tV\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n^\n\n\f\n\16\na\13\n\3\n\3\n\3"+
		"\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\13\3\13\3\f\3\f\5\fp\n\f\3\f\7"+
		"\fs\n\f\f\f\16\fv\13\f\3\f\3\f\3\r\3\r\3\r\6\r}\n\r\r\r\16\r~\3\r\3\r"+
		"\3\16\3\16\7\16\u0085\n\16\f\16\16\16\u0088\13\16\3\16\3\16\3\17\3\17"+
		"\7\17\u008e\n\17\f\17\16\17\u0091\13\17\3\17\3\17\3\20\3\20\7\20\u0097"+
		"\n\20\f\20\16\20\u009a\13\20\3\20\7\20\u009d\n\20\f\20\16\20\u00a0\13"+
		"\20\3\20\3\20\3\21\3\21\3\21\5\21\u00a7\n\21\3\21\2\2\22\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \2\2\u00b1\2\"\3\2\2\2\4+\3\2\2\2\6\61\3\2\2"+
		"\2\b=\3\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16I\3\2\2\2\20K\3\2\2\2\22Y\3\2\2"+
		"\2\24d\3\2\2\2\26m\3\2\2\2\30y\3\2\2\2\32\u0082\3\2\2\2\34\u008b\3\2\2"+
		"\2\36\u0094\3\2\2\2 \u00a3\3\2\2\2\"#\5\4\3\2#%\7\25\2\2$&\5\6\4\2%$\3"+
		"\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\5\36\20\2*\3\3\2\2"+
		"\2+,\7\17\2\2,-\7\26\2\2-\5\3\2\2\2.\60\7\24\2\2/.\3\2\2\2\60\63\3\2\2"+
		"\2\61/\3\2\2\2\61\62\3\2\2\2\62;\3\2\2\2\63\61\3\2\2\2\64<\7\25\2\2\65"+
		"<\7\r\2\2\66<\5\n\6\2\67<\5\16\b\28<\5\20\t\29<\5\f\7\2:<\5 \21\2;\64"+
		"\3\2\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2"+
		"\2\2<\7\3\2\2\2=>\7\3\2\2>\t\3\2\2\2?@\7\4\2\2@\13\3\2\2\2AB\7\5\2\2B"+
		"C\7\17\2\2C\r\3\2\2\2DJ\5\22\n\2EJ\5\24\13\2FJ\5\26\f\2GJ\5\32\16\2HJ"+
		"\5\34\17\2ID\3\2\2\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\17\3\2\2"+
		"\2KM\7\16\2\2LN\7\24\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\7\6\2\2PR\7\24"+
		"\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2SU\7\7\2\2TV\7\24\2\2UT\3\2\2\2UV\3"+
		"\2\2\2VW\3\2\2\2WX\7\17\2\2X\21\3\2\2\2YZ\7\b\2\2Z[\7\16\2\2[_\7\27\2"+
		"\2\\^\7\24\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3"+
		"\2\2\2bc\5\b\5\2c\23\3\2\2\2dh\7\t\2\2eg\7\24\2\2fe\3\2\2\2gj\3\2\2\2"+
		"hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\5\b\5\2l\25\3\2\2\2mo\7\n\2"+
		"\2np\5\30\r\2on\3\2\2\2op\3\2\2\2pt\3\2\2\2qs\7\24\2\2rq\3\2\2\2sv\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\5\b\5\2x\27\3\2\2\2yz\7"+
		"\26\2\2z|\7\20\2\2{}\7\20\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\7\27\2\2\u0081\31\3\2\2\2\u0082\u0086"+
		"\7\13\2\2\u0083\u0085\7\24\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008a\5\b\5\2\u008a\33\3\2\2\2\u008b\u008f\7\22\2\2\u008c"+
		"\u008e\7\24\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\5\b\5\2\u0093\35\3\2\2\2\u0094\u0098\7\27\2\2\u0095\u0097\7\24"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009e\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\25"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\2"+
		"\2\3\u00a2\37\3\2\2\2\u00a3\u00a4\7\16\2\2\u00a4\u00a6\7\f\2\2\u00a5\u00a7"+
		"\7\25\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7!\3\2\2\2\23\'"+
		"\61;IMQU_hot~\u0086\u008f\u0098\u009e\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}