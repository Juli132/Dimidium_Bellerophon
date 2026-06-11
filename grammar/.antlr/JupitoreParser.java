// Generated from c:/Users/jlmug/OneDrive/Desktop/Released_Dimidium/SyntaxN/grammar/Jupitore.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JupitoreParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TITLE=11, MEND=12, HOME=13, MOVE=14, DIRECTION=15, HEAT=16, TARGET=17, 
		LEVEL=18, CALL=19, IF=20, ENDIF=21, REPEAT=22, BREPEAT=23, END=24, SIN=25, 
		COS=26, TAN=27, SQRT=28, PI=29, ABS=30, SIGN=31, PAUSE=32, RESPOND=33, 
		RESUME=34, SET_HEATER=35, WAITFORTEMP=36, DWELL=37, MOVEEX=38, MSG=39, 
		ABSOLUTE=40, ARROW=41, RELATIVE=42, TIMEOUT_SET=43, RELATIVEEXTRUSION=44, 
		LOAD_BED_MESH=45, SET_PRESSURE_ADVANCE=46, RESET_EXTRUDER=47, BED_MESH_CALIBRATE=48, 
		PROBE_CALIBRATE=49, COOLDOWN=50, SET_SPEED=51, SET_FAN=52, PRINTFILE=53, 
		SET_NOZZLE=54, SET_FILAMENT=55, SET_LAYER_HEIGHT=56, SET_EXTRUSION_MULTIPLIER=57, 
		LAYER=58, ENABLE_AUTO_EXTRUDE=59, PLUSEQ=60, MINUSEQ=61, MULTEQ=62, DIVEQ=63, 
		EQUALS=64, PLUS=65, MINUS=66, COMPARE=67, NUMBER=68, STRING=69, SEMICOLON=70, 
		NEWLINE=71, WS=72, X=73, Y=74, Z=75, E=76, COMMENT=77, ID=78, UNRECOGNIZED=79;
	public static final int
		RULE_program = 0, RULE_macro = 1, RULE_statement = 2, RULE_repeat_statement = 3, 
		RULE_brepeat_statement = 4, RULE_layer_statement = 5, RULE_statement_block = 6, 
		RULE_if_statement = 7, RULE_coordList = 8, RULE_coord = 9, RULE_expr = 10, 
		RULE_func = 11, RULE_condition = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "macro", "statement", "repeat_statement", "brepeat_statement", 
			"layer_statement", "statement_block", "if_statement", "coordList", "coord", 
			"expr", "func", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'S'", "'s'", "'MS'", "'ms'", "'('", "')'", "'^'", "'*'", "'/'", 
			"'i'", "'M.title'", "'M.end'", "'Home'", "'Move'", null, "'Heat'", null, 
			"'Level'", "'M.call'", "'if'", "'endif'", "'repeat'", "'Brepeat'", "'end'", 
			"'sin'", "'cos'", "'tan'", "'sqrt'", "'pi'", "'abs'", "'sign'", null, 
			null, null, "'Set_Heater_Temperature'", "'WaitForTemp'", "'Dwell'", "'MoveTo'", 
			"'MSG'", "'Absolute'", "'->'", "'Relative'", "'TIMEOUT_SET'", "'RelativeExtrusion'", 
			null, null, "'ResetExtruder'", null, null, null, "'SetSpeed'", "'SetFan'", 
			"'PRINTFILE'", "'SetNozzle'", "'SetFilament'", "'SetLayerHeight'", "'SetExtrusionMultiplier'", 
			"'Layer'", "'EnableAutoExtrude'", "'+='", "'-='", "'*='", "'/='", "'='", 
			"'+'", "'-'", null, null, null, "';'", null, null, "'x'", "'y'", "'z'", 
			"'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "TITLE", 
			"MEND", "HOME", "MOVE", "DIRECTION", "HEAT", "TARGET", "LEVEL", "CALL", 
			"IF", "ENDIF", "REPEAT", "BREPEAT", "END", "SIN", "COS", "TAN", "SQRT", 
			"PI", "ABS", "SIGN", "PAUSE", "RESPOND", "RESUME", "SET_HEATER", "WAITFORTEMP", 
			"DWELL", "MOVEEX", "MSG", "ABSOLUTE", "ARROW", "RELATIVE", "TIMEOUT_SET", 
			"RELATIVEEXTRUSION", "LOAD_BED_MESH", "SET_PRESSURE_ADVANCE", "RESET_EXTRUDER", 
			"BED_MESH_CALIBRATE", "PROBE_CALIBRATE", "COOLDOWN", "SET_SPEED", "SET_FAN", 
			"PRINTFILE", "SET_NOZZLE", "SET_FILAMENT", "SET_LAYER_HEIGHT", "SET_EXTRUSION_MULTIPLIER", 
			"LAYER", "ENABLE_AUTO_EXTRUDE", "PLUSEQ", "MINUSEQ", "MULTEQ", "DIVEQ", 
			"EQUALS", "PLUS", "MINUS", "COMPARE", "NUMBER", "STRING", "SEMICOLON", 
			"NEWLINE", "WS", "X", "Y", "Z", "E", "COMMENT", "ID", "UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Jupitore.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JupitoreParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public TerminalNode EOF() { return getToken(JupitoreParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JupitoreParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JupitoreParser.NEWLINE, i);
		}
		public List<TerminalNode> WS() { return getTokens(JupitoreParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JupitoreParser.WS, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==WS) {
				{
				{
				setState(26);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			macro();
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE || _la==WS) {
						{
						{
						setState(33);
						_la = _input.LA(1);
						if ( !(_la==NEWLINE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(38);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(39);
					macro();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==WS) {
				{
				{
				setState(45);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(JupitoreParser.TITLE, 0); }
		public TerminalNode STRING() { return getToken(JupitoreParser.STRING, 0); }
		public TerminalNode MEND() { return getToken(JupitoreParser.MEND, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JupitoreParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JupitoreParser.NEWLINE, i);
		}
		public List<TerminalNode> WS() { return getTokens(JupitoreParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JupitoreParser.WS, i);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitMacro(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_macro);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(TITLE);
			setState(54);
			match(STRING);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE || _la==WS );
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152918751547318272L) != 0)) {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(MEND);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode HOME() { return getToken(JupitoreParser.HOME, 0); }
		public TerminalNode NEWLINE() { return getToken(JupitoreParser.NEWLINE, 0); }
		public TerminalNode ARROW() { return getToken(JupitoreParser.ARROW, 0); }
		public CoordListContext coordList() {
			return getRuleContext(CoordListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JupitoreParser.SEMICOLON, 0); }
		public TerminalNode MOVE() { return getToken(JupitoreParser.MOVE, 0); }
		public TerminalNode DIRECTION() { return getToken(JupitoreParser.DIRECTION, 0); }
		public TerminalNode HEAT() { return getToken(JupitoreParser.HEAT, 0); }
		public TerminalNode TARGET() { return getToken(JupitoreParser.TARGET, 0); }
		public TerminalNode EQUALS() { return getToken(JupitoreParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(JupitoreParser.NUMBER, 0); }
		public TerminalNode LEVEL() { return getToken(JupitoreParser.LEVEL, 0); }
		public TerminalNode CALL() { return getToken(JupitoreParser.CALL, 0); }
		public TerminalNode STRING() { return getToken(JupitoreParser.STRING, 0); }
		public TerminalNode SET_NOZZLE() { return getToken(JupitoreParser.SET_NOZZLE, 0); }
		public TerminalNode SET_FILAMENT() { return getToken(JupitoreParser.SET_FILAMENT, 0); }
		public TerminalNode SET_LAYER_HEIGHT() { return getToken(JupitoreParser.SET_LAYER_HEIGHT, 0); }
		public TerminalNode SET_EXTRUSION_MULTIPLIER() { return getToken(JupitoreParser.SET_EXTRUSION_MULTIPLIER, 0); }
		public Layer_statementContext layer_statement() {
			return getRuleContext(Layer_statementContext.class,0);
		}
		public TerminalNode ENABLE_AUTO_EXTRUDE() { return getToken(JupitoreParser.ENABLE_AUTO_EXTRUDE, 0); }
		public Repeat_statementContext repeat_statement() {
			return getRuleContext(Repeat_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Brepeat_statementContext brepeat_statement() {
			return getRuleContext(Brepeat_statementContext.class,0);
		}
		public TerminalNode PAUSE() { return getToken(JupitoreParser.PAUSE, 0); }
		public TerminalNode RESPOND() { return getToken(JupitoreParser.RESPOND, 0); }
		public TerminalNode MSG() { return getToken(JupitoreParser.MSG, 0); }
		public TerminalNode RESUME() { return getToken(JupitoreParser.RESUME, 0); }
		public TerminalNode SET_HEATER() { return getToken(JupitoreParser.SET_HEATER, 0); }
		public TerminalNode WAITFORTEMP() { return getToken(JupitoreParser.WAITFORTEMP, 0); }
		public TerminalNode COOLDOWN() { return getToken(JupitoreParser.COOLDOWN, 0); }
		public TerminalNode MOVEEX() { return getToken(JupitoreParser.MOVEEX, 0); }
		public TerminalNode ABSOLUTE() { return getToken(JupitoreParser.ABSOLUTE, 0); }
		public TerminalNode RELATIVE() { return getToken(JupitoreParser.RELATIVE, 0); }
		public TerminalNode TIMEOUT_SET() { return getToken(JupitoreParser.TIMEOUT_SET, 0); }
		public TerminalNode RELATIVEEXTRUSION() { return getToken(JupitoreParser.RELATIVEEXTRUSION, 0); }
		public TerminalNode LOAD_BED_MESH() { return getToken(JupitoreParser.LOAD_BED_MESH, 0); }
		public TerminalNode SET_PRESSURE_ADVANCE() { return getToken(JupitoreParser.SET_PRESSURE_ADVANCE, 0); }
		public TerminalNode RESET_EXTRUDER() { return getToken(JupitoreParser.RESET_EXTRUDER, 0); }
		public TerminalNode DWELL() { return getToken(JupitoreParser.DWELL, 0); }
		public TerminalNode BED_MESH_CALIBRATE() { return getToken(JupitoreParser.BED_MESH_CALIBRATE, 0); }
		public TerminalNode PROBE_CALIBRATE() { return getToken(JupitoreParser.PROBE_CALIBRATE, 0); }
		public TerminalNode SET_SPEED() { return getToken(JupitoreParser.SET_SPEED, 0); }
		public TerminalNode SET_FAN() { return getToken(JupitoreParser.SET_FAN, 0); }
		public TerminalNode PRINTFILE() { return getToken(JupitoreParser.PRINTFILE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(HOME);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARROW) {
					{
					setState(74);
					match(ARROW);
					setState(75);
					coordList();
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(76);
						match(SEMICOLON);
						}
					}

					}
				}

				setState(81);
				match(NEWLINE);
				}
				break;
			case MOVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(MOVE);
				setState(83);
				match(DIRECTION);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARROW) {
					{
					setState(84);
					match(ARROW);
					setState(85);
					coordList();
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(86);
						match(SEMICOLON);
						}
					}

					}
				}

				setState(91);
				match(NEWLINE);
				}
				break;
			case HEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(HEAT);
				setState(93);
				match(TARGET);
				setState(94);
				match(EQUALS);
				setState(95);
				match(NUMBER);
				setState(96);
				match(NEWLINE);
				}
				break;
			case LEVEL:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(LEVEL);
				setState(98);
				match(NEWLINE);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				match(CALL);
				setState(100);
				match(STRING);
				setState(101);
				match(NEWLINE);
				}
				break;
			case SET_NOZZLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				match(SET_NOZZLE);
				setState(103);
				match(EQUALS);
				setState(104);
				match(NUMBER);
				setState(105);
				match(NEWLINE);
				}
				break;
			case SET_FILAMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				match(SET_FILAMENT);
				setState(107);
				match(EQUALS);
				setState(108);
				match(NUMBER);
				setState(109);
				match(NEWLINE);
				}
				break;
			case SET_LAYER_HEIGHT:
				enterOuterAlt(_localctx, 8);
				{
				setState(110);
				match(SET_LAYER_HEIGHT);
				setState(111);
				match(EQUALS);
				setState(112);
				match(NUMBER);
				setState(113);
				match(NEWLINE);
				}
				break;
			case SET_EXTRUSION_MULTIPLIER:
				enterOuterAlt(_localctx, 9);
				{
				setState(114);
				match(SET_EXTRUSION_MULTIPLIER);
				setState(115);
				match(EQUALS);
				setState(116);
				match(NUMBER);
				setState(117);
				match(NEWLINE);
				}
				break;
			case LAYER:
				enterOuterAlt(_localctx, 10);
				{
				setState(118);
				layer_statement();
				}
				break;
			case ENABLE_AUTO_EXTRUDE:
				enterOuterAlt(_localctx, 11);
				{
				setState(119);
				match(ENABLE_AUTO_EXTRUDE);
				setState(120);
				match(EQUALS);
				setState(121);
				match(NUMBER);
				setState(122);
				match(NEWLINE);
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 12);
				{
				setState(123);
				repeat_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 13);
				{
				setState(124);
				if_statement();
				}
				break;
			case BREPEAT:
				enterOuterAlt(_localctx, 14);
				{
				setState(125);
				brepeat_statement();
				}
				break;
			case PAUSE:
				enterOuterAlt(_localctx, 15);
				{
				setState(126);
				match(PAUSE);
				setState(127);
				match(NEWLINE);
				}
				break;
			case RESPOND:
				enterOuterAlt(_localctx, 16);
				{
				setState(128);
				match(RESPOND);
				setState(129);
				match(MSG);
				setState(130);
				match(STRING);
				setState(131);
				match(NEWLINE);
				}
				break;
			case RESUME:
				enterOuterAlt(_localctx, 17);
				{
				setState(132);
				match(RESUME);
				setState(133);
				match(NEWLINE);
				}
				break;
			case SET_HEATER:
				enterOuterAlt(_localctx, 18);
				{
				setState(134);
				match(SET_HEATER);
				setState(135);
				match(TARGET);
				setState(136);
				match(EQUALS);
				setState(137);
				match(NUMBER);
				setState(138);
				match(NEWLINE);
				}
				break;
			case WAITFORTEMP:
				enterOuterAlt(_localctx, 19);
				{
				setState(139);
				match(WAITFORTEMP);
				setState(140);
				match(TARGET);
				setState(141);
				match(NEWLINE);
				}
				break;
			case COOLDOWN:
				enterOuterAlt(_localctx, 20);
				{
				setState(142);
				match(COOLDOWN);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TARGET) {
					{
					setState(143);
					match(TARGET);
					}
				}

				setState(146);
				match(NEWLINE);
				}
				break;
			case MOVEEX:
				enterOuterAlt(_localctx, 21);
				{
				setState(147);
				match(MOVEEX);
				setState(148);
				coordList();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(149);
					match(SEMICOLON);
					}
				}

				setState(152);
				match(NEWLINE);
				}
				break;
			case ABSOLUTE:
				enterOuterAlt(_localctx, 22);
				{
				setState(154);
				match(ABSOLUTE);
				setState(155);
				match(NEWLINE);
				}
				break;
			case RELATIVE:
				enterOuterAlt(_localctx, 23);
				{
				setState(156);
				match(RELATIVE);
				setState(157);
				match(NEWLINE);
				}
				break;
			case TIMEOUT_SET:
				enterOuterAlt(_localctx, 24);
				{
				setState(158);
				match(TIMEOUT_SET);
				setState(159);
				match(NUMBER);
				setState(160);
				match(NEWLINE);
				}
				break;
			case RELATIVEEXTRUSION:
				enterOuterAlt(_localctx, 25);
				{
				setState(161);
				match(RELATIVEEXTRUSION);
				setState(162);
				match(NEWLINE);
				}
				break;
			case LOAD_BED_MESH:
				enterOuterAlt(_localctx, 26);
				{
				setState(163);
				match(LOAD_BED_MESH);
				setState(164);
				match(STRING);
				setState(165);
				match(NEWLINE);
				}
				break;
			case SET_PRESSURE_ADVANCE:
				enterOuterAlt(_localctx, 27);
				{
				setState(166);
				match(SET_PRESSURE_ADVANCE);
				setState(167);
				match(NUMBER);
				setState(168);
				match(NEWLINE);
				}
				break;
			case RESET_EXTRUDER:
				enterOuterAlt(_localctx, 28);
				{
				setState(169);
				match(RESET_EXTRUDER);
				setState(170);
				match(NEWLINE);
				}
				break;
			case DWELL:
				enterOuterAlt(_localctx, 29);
				{
				setState(171);
				match(DWELL);
				setState(172);
				match(NUMBER);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
					{
					setState(173);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(176);
				match(NEWLINE);
				}
				break;
			case BED_MESH_CALIBRATE:
				enterOuterAlt(_localctx, 30);
				{
				setState(177);
				match(BED_MESH_CALIBRATE);
				setState(178);
				match(NEWLINE);
				}
				break;
			case PROBE_CALIBRATE:
				enterOuterAlt(_localctx, 31);
				{
				setState(179);
				match(PROBE_CALIBRATE);
				setState(180);
				match(NEWLINE);
				}
				break;
			case SET_SPEED:
				enterOuterAlt(_localctx, 32);
				{
				setState(181);
				match(SET_SPEED);
				setState(182);
				match(EQUALS);
				setState(183);
				match(NUMBER);
				setState(184);
				match(NEWLINE);
				}
				break;
			case SET_FAN:
				enterOuterAlt(_localctx, 33);
				{
				setState(185);
				match(SET_FAN);
				setState(186);
				match(EQUALS);
				setState(187);
				match(NUMBER);
				setState(188);
				match(NEWLINE);
				}
				break;
			case PRINTFILE:
				enterOuterAlt(_localctx, 34);
				{
				setState(189);
				match(PRINTFILE);
				setState(190);
				match(STRING);
				setState(191);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_statementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(JupitoreParser.REPEAT, 0); }
		public TerminalNode NUMBER() { return getToken(JupitoreParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JupitoreParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JupitoreParser.NEWLINE, i);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(JupitoreParser.END, 0); }
		public TerminalNode EOF() { return getToken(JupitoreParser.EOF, 0); }
		public Repeat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterRepeat_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitRepeat_statement(this);
		}
	}

	public final Repeat_statementContext repeat_statement() throws RecognitionException {
		Repeat_statementContext _localctx = new Repeat_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_repeat_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(REPEAT);
			setState(195);
			match(NUMBER);
			setState(196);
			match(NEWLINE);
			setState(197);
			statement_block();
			setState(198);
			match(END);
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Brepeat_statementContext extends ParserRuleContext {
		public TerminalNode BREPEAT() { return getToken(JupitoreParser.BREPEAT, 0); }
		public TerminalNode NUMBER() { return getToken(JupitoreParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JupitoreParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JupitoreParser.NEWLINE, i);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(JupitoreParser.END, 0); }
		public TerminalNode EOF() { return getToken(JupitoreParser.EOF, 0); }
		public Brepeat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brepeat_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterBrepeat_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitBrepeat_statement(this);
		}
	}

	public final Brepeat_statementContext brepeat_statement() throws RecognitionException {
		Brepeat_statementContext _localctx = new Brepeat_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_brepeat_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(BREPEAT);
			setState(202);
			match(NUMBER);
			setState(203);
			match(NEWLINE);
			setState(204);
			statement_block();
			setState(205);
			match(END);
			setState(206);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Layer_statementContext extends ParserRuleContext {
		public TerminalNode LAYER() { return getToken(JupitoreParser.LAYER, 0); }
		public TerminalNode NUMBER() { return getToken(JupitoreParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JupitoreParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JupitoreParser.NEWLINE, i);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(JupitoreParser.END, 0); }
		public TerminalNode EOF() { return getToken(JupitoreParser.EOF, 0); }
		public Layer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layer_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterLayer_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitLayer_statement(this);
		}
	}

	public final Layer_statementContext layer_statement() throws RecognitionException {
		Layer_statementContext _localctx = new Layer_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_layer_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LAYER);
			setState(209);
			match(NUMBER);
			setState(210);
			match(NEWLINE);
			setState(211);
			statement_block();
			setState(212);
			match(END);
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_blockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitStatement_block(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				statement();
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1152918751547318272L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JupitoreParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JupitoreParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JupitoreParser.NEWLINE, i);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(JupitoreParser.ENDIF, 0); }
		public TerminalNode EOF() { return getToken(JupitoreParser.EOF, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(IF);
			setState(221);
			condition();
			setState(222);
			match(NEWLINE);
			setState(223);
			statement_block();
			setState(224);
			match(ENDIF);
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CoordListContext extends ParserRuleContext {
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(JupitoreParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JupitoreParser.WS, i);
		}
		public CoordListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterCoordList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitCoordList(this);
		}
	}

	public final CoordListContext coordList() throws RecognitionException {
		CoordListContext _localctx = new CoordListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_coordList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			coord();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 31L) != 0)) {
				{
				{
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(228);
					match(WS);
					}
				}

				setState(231);
				coord();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CoordContext extends ParserRuleContext {
		public TerminalNode X() { return getToken(JupitoreParser.X, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(JupitoreParser.EQUALS, 0); }
		public TerminalNode PLUSEQ() { return getToken(JupitoreParser.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(JupitoreParser.MINUSEQ, 0); }
		public TerminalNode MULTEQ() { return getToken(JupitoreParser.MULTEQ, 0); }
		public TerminalNode DIVEQ() { return getToken(JupitoreParser.DIVEQ, 0); }
		public TerminalNode Y() { return getToken(JupitoreParser.Y, 0); }
		public TerminalNode Z() { return getToken(JupitoreParser.Z, 0); }
		public TerminalNode E() { return getToken(JupitoreParser.E, 0); }
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterCoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitCoord(this);
		}
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_coord);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case X:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(X);
				setState(238);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 31L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(239);
				expr(0);
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(Y);
				setState(241);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 31L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				expr(0);
				}
				break;
			case Z:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(Z);
				setState(244);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 31L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				expr(0);
				}
				break;
			case E:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				match(E);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 31L) != 0)) {
					{
					setState(247);
					_la = _input.LA(1);
					if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 31L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -9223372036738383839L) != 0)) {
					{
					setState(250);
					expr(0);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(JupitoreParser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitNumber(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitParens(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IteratorContext extends ExprContext {
		public IteratorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterIterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitIterator(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(JupitoreParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JupitoreParser.MINUS, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitAddSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ExprContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitFuncCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitPower(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitMulDiv(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(256);
				match(T__4);
				setState(257);
				expr(0);
				setState(258);
				match(T__5);
				}
				break;
			case SIN:
			case COS:
			case TAN:
			case SQRT:
			case ABS:
			case SIGN:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				func();
				setState(261);
				match(T__4);
				setState(262);
				expr(0);
				setState(263);
				match(T__5);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				match(NUMBER);
				}
				break;
			case T__9:
				{
				_localctx = new IteratorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(270);
						match(T__6);
						setState(271);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(273);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(274);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(276);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(277);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(JupitoreParser.SIN, 0); }
		public TerminalNode COS() { return getToken(JupitoreParser.COS, 0); }
		public TerminalNode TAN() { return getToken(JupitoreParser.TAN, 0); }
		public TerminalNode SQRT() { return getToken(JupitoreParser.SQRT, 0); }
		public TerminalNode ABS() { return getToken(JupitoreParser.ABS, 0); }
		public TerminalNode SIGN() { return getToken(JupitoreParser.SIGN, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3724541952L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode TARGET() { return getToken(JupitoreParser.TARGET, 0); }
		public TerminalNode COMPARE() { return getToken(JupitoreParser.COMPARE, 0); }
		public TerminalNode NUMBER() { return getToken(JupitoreParser.NUMBER, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JupitoreListener ) ((JupitoreListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(TARGET);
			setState(286);
			match(COMPARE);
			setState(287);
			match(NUMBER);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001O\u0122\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000"+
		"&\t\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000\u0001"+
		"\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u00019\b\u0001\u000b"+
		"\u0001\f\u0001:\u0001\u0001\u0005\u0001>\b\u0001\n\u0001\f\u0001A\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001E\b\u0001\n\u0001\f\u0001H\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002N\b\u0002"+
		"\u0003\u0002P\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002X\b\u0002\u0003\u0002Z\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0091"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0097"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00af"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00c1"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006\u00d9"+
		"\b\u0006\u000b\u0006\f\u0006\u00da\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003"+
		"\b\u00e6\b\b\u0001\b\u0005\b\u00e9\b\b\n\b\f\b\u00ec\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00f9\b\t\u0001\t\u0003\t\u00fc\b\t\u0003\t\u00fe\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u010c\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0117\b\n\n\n\f\n\u011a\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000"+
		"\u0001\u0014\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u0000\u0007\u0001\u0000GH\u0001\u0000\u0001\u0004\u0001\u0001G"+
		"G\u0001\u0000<@\u0001\u0000\b\t\u0001\u0000AB\u0002\u0000\u0019\u001c"+
		"\u001e\u001f\u0151\u0000\u001d\u0001\u0000\u0000\u0000\u00025\u0001\u0000"+
		"\u0000\u0000\u0004\u00c0\u0001\u0000\u0000\u0000\u0006\u00c2\u0001\u0000"+
		"\u0000\u0000\b\u00c9\u0001\u0000\u0000\u0000\n\u00d0\u0001\u0000\u0000"+
		"\u0000\f\u00d8\u0001\u0000\u0000\u0000\u000e\u00dc\u0001\u0000\u0000\u0000"+
		"\u0010\u00e3\u0001\u0000\u0000\u0000\u0012\u00fd\u0001\u0000\u0000\u0000"+
		"\u0014\u010b\u0001\u0000\u0000\u0000\u0016\u011b\u0001\u0000\u0000\u0000"+
		"\u0018\u011d\u0001\u0000\u0000\u0000\u001a\u001c\u0007\u0000\u0000\u0000"+
		"\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 *"+
		"\u0003\u0002\u0001\u0000!#\u0007\u0000\u0000\u0000\"!\u0001\u0000\u0000"+
		"\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\')\u0003"+
		"\u0002\u0001\u0000($\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+0\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-/\u0007\u0000\u0000\u0000.-\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"34\u0005\u0000\u0000\u00014\u0001\u0001\u0000\u0000\u000056\u0005\u000b"+
		"\u0000\u000068\u0005E\u0000\u000079\u0007\u0000\u0000\u000087\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;?\u0001\u0000\u0000\u0000<>\u0003\u0004\u0002\u0000"+
		"=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000BF\u0005\f\u0000\u0000CE\u0007\u0000\u0000\u0000DC\u0001\u0000"+
		"\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000G\u0003\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000IO\u0005\r\u0000\u0000JK\u0005)\u0000\u0000KM\u0003\u0010\b\u0000"+
		"LN\u0005F\u0000\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NP\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000Q\u00c1\u0005G\u0000\u0000RS\u0005\u000e"+
		"\u0000\u0000SY\u0005\u000f\u0000\u0000TU\u0005)\u0000\u0000UW\u0003\u0010"+
		"\b\u0000VX\u0005F\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XZ\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u00c1\u0005G\u0000\u0000"+
		"\\]\u0005\u0010\u0000\u0000]^\u0005\u0011\u0000\u0000^_\u0005@\u0000\u0000"+
		"_`\u0005D\u0000\u0000`\u00c1\u0005G\u0000\u0000ab\u0005\u0012\u0000\u0000"+
		"b\u00c1\u0005G\u0000\u0000cd\u0005\u0013\u0000\u0000de\u0005E\u0000\u0000"+
		"e\u00c1\u0005G\u0000\u0000fg\u00056\u0000\u0000gh\u0005@\u0000\u0000h"+
		"i\u0005D\u0000\u0000i\u00c1\u0005G\u0000\u0000jk\u00057\u0000\u0000kl"+
		"\u0005@\u0000\u0000lm\u0005D\u0000\u0000m\u00c1\u0005G\u0000\u0000no\u0005"+
		"8\u0000\u0000op\u0005@\u0000\u0000pq\u0005D\u0000\u0000q\u00c1\u0005G"+
		"\u0000\u0000rs\u00059\u0000\u0000st\u0005@\u0000\u0000tu\u0005D\u0000"+
		"\u0000u\u00c1\u0005G\u0000\u0000v\u00c1\u0003\n\u0005\u0000wx\u0005;\u0000"+
		"\u0000xy\u0005@\u0000\u0000yz\u0005D\u0000\u0000z\u00c1\u0005G\u0000\u0000"+
		"{\u00c1\u0003\u0006\u0003\u0000|\u00c1\u0003\u000e\u0007\u0000}\u00c1"+
		"\u0003\b\u0004\u0000~\u007f\u0005 \u0000\u0000\u007f\u00c1\u0005G\u0000"+
		"\u0000\u0080\u0081\u0005!\u0000\u0000\u0081\u0082\u0005\'\u0000\u0000"+
		"\u0082\u0083\u0005E\u0000\u0000\u0083\u00c1\u0005G\u0000\u0000\u0084\u0085"+
		"\u0005\"\u0000\u0000\u0085\u00c1\u0005G\u0000\u0000\u0086\u0087\u0005"+
		"#\u0000\u0000\u0087\u0088\u0005\u0011\u0000\u0000\u0088\u0089\u0005@\u0000"+
		"\u0000\u0089\u008a\u0005D\u0000\u0000\u008a\u00c1\u0005G\u0000\u0000\u008b"+
		"\u008c\u0005$\u0000\u0000\u008c\u008d\u0005\u0011\u0000\u0000\u008d\u00c1"+
		"\u0005G\u0000\u0000\u008e\u0090\u00052\u0000\u0000\u008f\u0091\u0005\u0011"+
		"\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u00c1\u0005G\u0000"+
		"\u0000\u0093\u0094\u0005&\u0000\u0000\u0094\u0096\u0003\u0010\b\u0000"+
		"\u0095\u0097\u0005F\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005G\u0000\u0000\u0099\u00c1\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005(\u0000\u0000\u009b\u00c1\u0005G\u0000\u0000\u009c\u009d\u0005*"+
		"\u0000\u0000\u009d\u00c1\u0005G\u0000\u0000\u009e\u009f\u0005+\u0000\u0000"+
		"\u009f\u00a0\u0005D\u0000\u0000\u00a0\u00c1\u0005G\u0000\u0000\u00a1\u00a2"+
		"\u0005,\u0000\u0000\u00a2\u00c1\u0005G\u0000\u0000\u00a3\u00a4\u0005-"+
		"\u0000\u0000\u00a4\u00a5\u0005E\u0000\u0000\u00a5\u00c1\u0005G\u0000\u0000"+
		"\u00a6\u00a7\u0005.\u0000\u0000\u00a7\u00a8\u0005D\u0000\u0000\u00a8\u00c1"+
		"\u0005G\u0000\u0000\u00a9\u00aa\u0005/\u0000\u0000\u00aa\u00c1\u0005G"+
		"\u0000\u0000\u00ab\u00ac\u0005%\u0000\u0000\u00ac\u00ae\u0005D\u0000\u0000"+
		"\u00ad\u00af\u0007\u0001\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00c1\u0005G\u0000\u0000\u00b1\u00b2\u00050\u0000\u0000\u00b2\u00c1"+
		"\u0005G\u0000\u0000\u00b3\u00b4\u00051\u0000\u0000\u00b4\u00c1\u0005G"+
		"\u0000\u0000\u00b5\u00b6\u00053\u0000\u0000\u00b6\u00b7\u0005@\u0000\u0000"+
		"\u00b7\u00b8\u0005D\u0000\u0000\u00b8\u00c1\u0005G\u0000\u0000\u00b9\u00ba"+
		"\u00054\u0000\u0000\u00ba\u00bb\u0005@\u0000\u0000\u00bb\u00bc\u0005D"+
		"\u0000\u0000\u00bc\u00c1\u0005G\u0000\u0000\u00bd\u00be\u00055\u0000\u0000"+
		"\u00be\u00bf\u0005E\u0000\u0000\u00bf\u00c1\u0005G\u0000\u0000\u00c0I"+
		"\u0001\u0000\u0000\u0000\u00c0R\u0001\u0000\u0000\u0000\u00c0\\\u0001"+
		"\u0000\u0000\u0000\u00c0a\u0001\u0000\u0000\u0000\u00c0c\u0001\u0000\u0000"+
		"\u0000\u00c0f\u0001\u0000\u0000\u0000\u00c0j\u0001\u0000\u0000\u0000\u00c0"+
		"n\u0001\u0000\u0000\u0000\u00c0r\u0001\u0000\u0000\u0000\u00c0v\u0001"+
		"\u0000\u0000\u0000\u00c0w\u0001\u0000\u0000\u0000\u00c0{\u0001\u0000\u0000"+
		"\u0000\u00c0|\u0001\u0000\u0000\u0000\u00c0}\u0001\u0000\u0000\u0000\u00c0"+
		"~\u0001\u0000\u0000\u0000\u00c0\u0080\u0001\u0000\u0000\u0000\u00c0\u0084"+
		"\u0001\u0000\u0000\u0000\u00c0\u0086\u0001\u0000\u0000\u0000\u00c0\u008b"+
		"\u0001\u0000\u0000\u0000\u00c0\u008e\u0001\u0000\u0000\u0000\u00c0\u0093"+
		"\u0001\u0000\u0000\u0000\u00c0\u009a\u0001\u0000\u0000\u0000\u00c0\u009c"+
		"\u0001\u0000\u0000\u0000\u00c0\u009e\u0001\u0000\u0000\u0000\u00c0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00c0\u00a3\u0001\u0000\u0000\u0000\u00c0\u00a6"+
		"\u0001\u0000\u0000\u0000\u00c0\u00a9\u0001\u0000\u0000\u0000\u00c0\u00ab"+
		"\u0001\u0000\u0000\u0000\u00c0\u00b1\u0001\u0000\u0000\u0000\u00c0\u00b3"+
		"\u0001\u0000\u0000\u0000\u00c0\u00b5\u0001\u0000\u0000\u0000\u00c0\u00b9"+
		"\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c1\u0005"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0016\u0000\u0000\u00c3\u00c4"+
		"\u0005D\u0000\u0000\u00c4\u00c5\u0005G\u0000\u0000\u00c5\u00c6\u0003\f"+
		"\u0006\u0000\u00c6\u00c7\u0005\u0018\u0000\u0000\u00c7\u00c8\u0007\u0002"+
		"\u0000\u0000\u00c8\u0007\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0017"+
		"\u0000\u0000\u00ca\u00cb\u0005D\u0000\u0000\u00cb\u00cc\u0005G\u0000\u0000"+
		"\u00cc\u00cd\u0003\f\u0006\u0000\u00cd\u00ce\u0005\u0018\u0000\u0000\u00ce"+
		"\u00cf\u0007\u0002\u0000\u0000\u00cf\t\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0005:\u0000\u0000\u00d1\u00d2\u0005D\u0000\u0000\u00d2\u00d3\u0005G"+
		"\u0000\u0000\u00d3\u00d4\u0003\f\u0006\u0000\u00d4\u00d5\u0005\u0018\u0000"+
		"\u0000\u00d5\u00d6\u0007\u0002\u0000\u0000\u00d6\u000b\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d9\u0003\u0004\u0002\u0000\u00d8\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\r\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0005\u0014\u0000\u0000\u00dd\u00de\u0003\u0018\f\u0000\u00de"+
		"\u00df\u0005G\u0000\u0000\u00df\u00e0\u0003\f\u0006\u0000\u00e0\u00e1"+
		"\u0005\u0015\u0000\u0000\u00e1\u00e2\u0007\u0002\u0000\u0000\u00e2\u000f"+
		"\u0001\u0000\u0000\u0000\u00e3\u00ea\u0003\u0012\t\u0000\u00e4\u00e6\u0005"+
		"H\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9\u0003\u0012"+
		"\t\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u0011\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0005I\u0000\u0000\u00ee\u00ef\u0007\u0003\u0000\u0000"+
		"\u00ef\u00fe\u0003\u0014\n\u0000\u00f0\u00f1\u0005J\u0000\u0000\u00f1"+
		"\u00f2\u0007\u0003\u0000\u0000\u00f2\u00fe\u0003\u0014\n\u0000\u00f3\u00f4"+
		"\u0005K\u0000\u0000\u00f4\u00f5\u0007\u0003\u0000\u0000\u00f5\u00fe\u0003"+
		"\u0014\n\u0000\u00f6\u00f8\u0005L\u0000\u0000\u00f7\u00f9\u0007\u0003"+
		"\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003\u0014"+
		"\n\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00ed\u0001\u0000\u0000"+
		"\u0000\u00fd\u00f0\u0001\u0000\u0000\u0000\u00fd\u00f3\u0001\u0000\u0000"+
		"\u0000\u00fd\u00f6\u0001\u0000\u0000\u0000\u00fe\u0013\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0006\n\uffff\uffff\u0000\u0100\u0101\u0005\u0005\u0000"+
		"\u0000\u0101\u0102\u0003\u0014\n\u0000\u0102\u0103\u0005\u0006\u0000\u0000"+
		"\u0103\u010c\u0001\u0000\u0000\u0000\u0104\u0105\u0003\u0016\u000b\u0000"+
		"\u0105\u0106\u0005\u0005\u0000\u0000\u0106\u0107\u0003\u0014\n\u0000\u0107"+
		"\u0108\u0005\u0006\u0000\u0000\u0108\u010c\u0001\u0000\u0000\u0000\u0109"+
		"\u010c\u0005D\u0000\u0000\u010a\u010c\u0005\n\u0000\u0000\u010b\u00ff"+
		"\u0001\u0000\u0000\u0000\u010b\u0104\u0001\u0000\u0000\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u0118"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\n\u0005\u0000\u0000\u010e\u010f\u0005"+
		"\u0007\u0000\u0000\u010f\u0117\u0003\u0014\n\u0005\u0110\u0111\n\u0004"+
		"\u0000\u0000\u0111\u0112\u0007\u0004\u0000\u0000\u0112\u0117\u0003\u0014"+
		"\n\u0005\u0113\u0114\n\u0003\u0000\u0000\u0114\u0115\u0007\u0005\u0000"+
		"\u0000\u0115\u0117\u0003\u0014\n\u0004\u0116\u010d\u0001\u0000\u0000\u0000"+
		"\u0116\u0110\u0001\u0000\u0000\u0000\u0116\u0113\u0001\u0000\u0000\u0000"+
		"\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0015\u0001\u0000\u0000\u0000"+
		"\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0007\u0006\u0000\u0000"+
		"\u011c\u0017\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0011\u0000\u0000"+
		"\u011e\u011f\u0005C\u0000\u0000\u011f\u0120\u0005D\u0000\u0000\u0120\u0019"+
		"\u0001\u0000\u0000\u0000\u0018\u001d$*0:?FMOWY\u0090\u0096\u00ae\u00c0"+
		"\u00da\u00e5\u00ea\u00f8\u00fb\u00fd\u010b\u0116\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}