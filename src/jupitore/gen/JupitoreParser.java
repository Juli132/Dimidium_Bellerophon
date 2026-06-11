// Generated from Jupitore.g4 by ANTLR 4.9.3
package jupitore.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JupitoreParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitMacro(this);
			else return visitor.visitChildren(this);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HOME) | (1L << MOVE) | (1L << HEAT) | (1L << LEVEL) | (1L << CALL) | (1L << IF) | (1L << REPEAT) | (1L << BREPEAT) | (1L << PAUSE) | (1L << RESPOND) | (1L << RESUME) | (1L << SET_HEATER) | (1L << WAITFORTEMP) | (1L << DWELL) | (1L << MOVEEX) | (1L << ABSOLUTE) | (1L << RELATIVE) | (1L << TIMEOUT_SET) | (1L << RELATIVEEXTRUSION) | (1L << LOAD_BED_MESH) | (1L << SET_PRESSURE_ADVANCE) | (1L << RESET_EXTRUDER) | (1L << BED_MESH_CALIBRATE) | (1L << PROBE_CALIBRATE) | (1L << COOLDOWN) | (1L << SET_SPEED) | (1L << SET_FAN) | (1L << PRINTFILE) | (1L << SET_NOZZLE) | (1L << SET_FILAMENT) | (1L << SET_LAYER_HEIGHT) | (1L << SET_EXTRUSION_MULTIPLIER) | (1L << LAYER) | (1L << ENABLE_AUTO_EXTRUDE))) != 0)) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
					{
					setState(173);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitRepeat_statement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitBrepeat_statement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitLayer_statement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HOME) | (1L << MOVE) | (1L << HEAT) | (1L << LEVEL) | (1L << CALL) | (1L << IF) | (1L << REPEAT) | (1L << BREPEAT) | (1L << PAUSE) | (1L << RESPOND) | (1L << RESUME) | (1L << SET_HEATER) | (1L << WAITFORTEMP) | (1L << DWELL) | (1L << MOVEEX) | (1L << ABSOLUTE) | (1L << RELATIVE) | (1L << TIMEOUT_SET) | (1L << RELATIVEEXTRUSION) | (1L << LOAD_BED_MESH) | (1L << SET_PRESSURE_ADVANCE) | (1L << RESET_EXTRUDER) | (1L << BED_MESH_CALIBRATE) | (1L << PROBE_CALIBRATE) | (1L << COOLDOWN) | (1L << SET_SPEED) | (1L << SET_FAN) | (1L << PRINTFILE) | (1L << SET_NOZZLE) | (1L << SET_FILAMENT) | (1L << SET_LAYER_HEIGHT) | (1L << SET_EXTRUSION_MULTIPLIER) | (1L << LAYER) | (1L << ENABLE_AUTO_EXTRUDE))) != 0) );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitCoordList(this);
			else return visitor.visitChildren(this);
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
			while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (WS - 72)) | (1L << (X - 72)) | (1L << (Y - 72)) | (1L << (Z - 72)) | (1L << (E - 72)))) != 0)) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitCoord(this);
			else return visitor.visitChildren(this);
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
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (PLUSEQ - 60)) | (1L << (MINUSEQ - 60)) | (1L << (MULTEQ - 60)) | (1L << (DIVEQ - 60)) | (1L << (EQUALS - 60)))) != 0)) ) {
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
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (PLUSEQ - 60)) | (1L << (MINUSEQ - 60)) | (1L << (MULTEQ - 60)) | (1L << (DIVEQ - 60)) | (1L << (EQUALS - 60)))) != 0)) ) {
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
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (PLUSEQ - 60)) | (1L << (MINUSEQ - 60)) | (1L << (MULTEQ - 60)) | (1L << (DIVEQ - 60)) | (1L << (EQUALS - 60)))) != 0)) ) {
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
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (PLUSEQ - 60)) | (1L << (MINUSEQ - 60)) | (1L << (MULTEQ - 60)) | (1L << (DIVEQ - 60)) | (1L << (EQUALS - 60)))) != 0)) {
					{
					setState(247);
					_la = _input.LA(1);
					if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (PLUSEQ - 60)) | (1L << (MINUSEQ - 60)) | (1L << (MULTEQ - 60)) | (1L << (DIVEQ - 60)) | (1L << (EQUALS - 60)))) != 0)) ) {
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
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__9 - 5)) | (1L << (SIN - 5)) | (1L << (COS - 5)) | (1L << (TAN - 5)) | (1L << (SQRT - 5)) | (1L << (ABS - 5)) | (1L << (SIGN - 5)) | (1L << (NUMBER - 5)))) != 0)) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitIterator(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIN) | (1L << COS) | (1L << TAN) | (1L << SQRT) | (1L << ABS) | (1L << SIGN))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JupitoreVisitor ) return ((JupitoreVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Q\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\7\2\61\n\2\f\2"+
		"\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\6\3;\n\3\r\3\16\3<\3\3\7\3@\n\3\f\3"+
		"\16\3C\13\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\4\3\4\3\4\3\4\5\4P\n\4\5"+
		"\4R\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\5\4\\\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0093\n\4\3\4"+
		"\3\4\3\4\3\4\5\4\u0099\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b1\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c3\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\6\b\u00db\n\b\r\b\16\b\u00dc\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\5\n\u00e8\n\n\3\n\7\n\u00eb\n\n\f\n\16\n\u00ee\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00fb\n\13\3\13"+
		"\5\13\u00fe\n\13\5\13\u0100\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u010e\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0119"+
		"\n\f\f\f\16\f\u011c\13\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\2\3\26\17\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\2\t\3\2IJ\3\2\3\6\3\3II\3\2>B\3\2\n\13"+
		"\3\2CD\4\2\33\36 !\2\u0153\2\37\3\2\2\2\4\67\3\2\2\2\6\u00c2\3\2\2\2\b"+
		"\u00c4\3\2\2\2\n\u00cb\3\2\2\2\f\u00d2\3\2\2\2\16\u00da\3\2\2\2\20\u00de"+
		"\3\2\2\2\22\u00e5\3\2\2\2\24\u00ff\3\2\2\2\26\u010d\3\2\2\2\30\u011d\3"+
		"\2\2\2\32\u011f\3\2\2\2\34\36\t\2\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\",\5\4\3\2#%\t\2\2\2$#\3\2"+
		"\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)+\5\4\3\2*&\3"+
		"\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\62\3\2\2\2.,\3\2\2\2/\61\t\2\2\2"+
		"\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64"+
		"\62\3\2\2\2\65\66\7\2\2\3\66\3\3\2\2\2\678\7\r\2\28:\7G\2\29;\t\2\2\2"+
		":9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=A\3\2\2\2>@\5\6\4\2?>\3\2\2\2"+
		"@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DH\7\16\2\2EG\t\2\2"+
		"\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2\2JH\3\2\2\2KQ\7\17"+
		"\2\2LM\7+\2\2MO\5\22\n\2NP\7H\2\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QL\3\2"+
		"\2\2QR\3\2\2\2RS\3\2\2\2S\u00c3\7I\2\2TU\7\20\2\2U[\7\21\2\2VW\7+\2\2"+
		"WY\5\22\n\2XZ\7H\2\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[V\3\2\2\2[\\\3\2\2"+
		"\2\\]\3\2\2\2]\u00c3\7I\2\2^_\7\22\2\2_`\7\23\2\2`a\7B\2\2ab\7F\2\2b\u00c3"+
		"\7I\2\2cd\7\24\2\2d\u00c3\7I\2\2ef\7\25\2\2fg\7G\2\2g\u00c3\7I\2\2hi\7"+
		"8\2\2ij\7B\2\2jk\7F\2\2k\u00c3\7I\2\2lm\79\2\2mn\7B\2\2no\7F\2\2o\u00c3"+
		"\7I\2\2pq\7:\2\2qr\7B\2\2rs\7F\2\2s\u00c3\7I\2\2tu\7;\2\2uv\7B\2\2vw\7"+
		"F\2\2w\u00c3\7I\2\2x\u00c3\5\f\7\2yz\7=\2\2z{\7B\2\2{|\7F\2\2|\u00c3\7"+
		"I\2\2}\u00c3\5\b\5\2~\u00c3\5\20\t\2\177\u00c3\5\n\6\2\u0080\u0081\7\""+
		"\2\2\u0081\u00c3\7I\2\2\u0082\u0083\7#\2\2\u0083\u0084\7)\2\2\u0084\u0085"+
		"\7G\2\2\u0085\u00c3\7I\2\2\u0086\u0087\7$\2\2\u0087\u00c3\7I\2\2\u0088"+
		"\u0089\7%\2\2\u0089\u008a\7\23\2\2\u008a\u008b\7B\2\2\u008b\u008c\7F\2"+
		"\2\u008c\u00c3\7I\2\2\u008d\u008e\7&\2\2\u008e\u008f\7\23\2\2\u008f\u00c3"+
		"\7I\2\2\u0090\u0092\7\64\2\2\u0091\u0093\7\23\2\2\u0092\u0091\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u00c3\7I\2\2\u0095\u0096"+
		"\7(\2\2\u0096\u0098\5\22\n\2\u0097\u0099\7H\2\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7I\2\2\u009b\u00c3\3\2"+
		"\2\2\u009c\u009d\7*\2\2\u009d\u00c3\7I\2\2\u009e\u009f\7,\2\2\u009f\u00c3"+
		"\7I\2\2\u00a0\u00a1\7-\2\2\u00a1\u00a2\7F\2\2\u00a2\u00c3\7I\2\2\u00a3"+
		"\u00a4\7.\2\2\u00a4\u00c3\7I\2\2\u00a5\u00a6\7/\2\2\u00a6\u00a7\7G\2\2"+
		"\u00a7\u00c3\7I\2\2\u00a8\u00a9\7\60\2\2\u00a9\u00aa\7F\2\2\u00aa\u00c3"+
		"\7I\2\2\u00ab\u00ac\7\61\2\2\u00ac\u00c3\7I\2\2\u00ad\u00ae\7\'\2\2\u00ae"+
		"\u00b0\7F\2\2\u00af\u00b1\t\3\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00c3\7I\2\2\u00b3\u00b4\7\62\2\2\u00b4"+
		"\u00c3\7I\2\2\u00b5\u00b6\7\63\2\2\u00b6\u00c3\7I\2\2\u00b7\u00b8\7\65"+
		"\2\2\u00b8\u00b9\7B\2\2\u00b9\u00ba\7F\2\2\u00ba\u00c3\7I\2\2\u00bb\u00bc"+
		"\7\66\2\2\u00bc\u00bd\7B\2\2\u00bd\u00be\7F\2\2\u00be\u00c3\7I\2\2\u00bf"+
		"\u00c0\7\67\2\2\u00c0\u00c1\7G\2\2\u00c1\u00c3\7I\2\2\u00c2K\3\2\2\2\u00c2"+
		"T\3\2\2\2\u00c2^\3\2\2\2\u00c2c\3\2\2\2\u00c2e\3\2\2\2\u00c2h\3\2\2\2"+
		"\u00c2l\3\2\2\2\u00c2p\3\2\2\2\u00c2t\3\2\2\2\u00c2x\3\2\2\2\u00c2y\3"+
		"\2\2\2\u00c2}\3\2\2\2\u00c2~\3\2\2\2\u00c2\177\3\2\2\2\u00c2\u0080\3\2"+
		"\2\2\u00c2\u0082\3\2\2\2\u00c2\u0086\3\2\2\2\u00c2\u0088\3\2\2\2\u00c2"+
		"\u008d\3\2\2\2\u00c2\u0090\3\2\2\2\u00c2\u0095\3\2\2\2\u00c2\u009c\3\2"+
		"\2\2\u00c2\u009e\3\2\2\2\u00c2\u00a0\3\2\2\2\u00c2\u00a3\3\2\2\2\u00c2"+
		"\u00a5\3\2\2\2\u00c2\u00a8\3\2\2\2\u00c2\u00ab\3\2\2\2\u00c2\u00ad\3\2"+
		"\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00b5\3\2\2\2\u00c2\u00b7\3\2\2\2\u00c2"+
		"\u00bb\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\7\3\2\2\2\u00c4\u00c5\7\30\2"+
		"\2\u00c5\u00c6\7F\2\2\u00c6\u00c7\7I\2\2\u00c7\u00c8\5\16\b\2\u00c8\u00c9"+
		"\7\32\2\2\u00c9\u00ca\t\4\2\2\u00ca\t\3\2\2\2\u00cb\u00cc\7\31\2\2\u00cc"+
		"\u00cd\7F\2\2\u00cd\u00ce\7I\2\2\u00ce\u00cf\5\16\b\2\u00cf\u00d0\7\32"+
		"\2\2\u00d0\u00d1\t\4\2\2\u00d1\13\3\2\2\2\u00d2\u00d3\7<\2\2\u00d3\u00d4"+
		"\7F\2\2\u00d4\u00d5\7I\2\2\u00d5\u00d6\5\16\b\2\u00d6\u00d7\7\32\2\2\u00d7"+
		"\u00d8\t\4\2\2\u00d8\r\3\2\2\2\u00d9\u00db\5\6\4\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\17"+
		"\3\2\2\2\u00de\u00df\7\26\2\2\u00df\u00e0\5\32\16\2\u00e0\u00e1\7I\2\2"+
		"\u00e1\u00e2\5\16\b\2\u00e2\u00e3\7\27\2\2\u00e3\u00e4\t\4\2\2\u00e4\21"+
		"\3\2\2\2\u00e5\u00ec\5\24\13\2\u00e6\u00e8\7J\2\2\u00e7\u00e6\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\5\24\13\2\u00ea\u00e7"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\23\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7K\2\2\u00f0\u00f1\t\5\2\2"+
		"\u00f1\u0100\5\26\f\2\u00f2\u00f3\7L\2\2\u00f3\u00f4\t\5\2\2\u00f4\u0100"+
		"\5\26\f\2\u00f5\u00f6\7M\2\2\u00f6\u00f7\t\5\2\2\u00f7\u0100\5\26\f\2"+
		"\u00f8\u00fa\7N\2\2\u00f9\u00fb\t\5\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fe\5\26\f\2\u00fd\u00fc\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00ef\3\2\2\2\u00ff\u00f2"+
		"\3\2\2\2\u00ff\u00f5\3\2\2\2\u00ff\u00f8\3\2\2\2\u0100\25\3\2\2\2\u0101"+
		"\u0102\b\f\1\2\u0102\u0103\7\7\2\2\u0103\u0104\5\26\f\2\u0104\u0105\7"+
		"\b\2\2\u0105\u010e\3\2\2\2\u0106\u0107\5\30\r\2\u0107\u0108\7\7\2\2\u0108"+
		"\u0109\5\26\f\2\u0109\u010a\7\b\2\2\u010a\u010e\3\2\2\2\u010b\u010e\7"+
		"F\2\2\u010c\u010e\7\f\2\2\u010d\u0101\3\2\2\2\u010d\u0106\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u011a\3\2\2\2\u010f\u0110\f\7"+
		"\2\2\u0110\u0111\7\t\2\2\u0111\u0119\5\26\f\7\u0112\u0113\f\6\2\2\u0113"+
		"\u0114\t\6\2\2\u0114\u0119\5\26\f\7\u0115\u0116\f\5\2\2\u0116\u0117\t"+
		"\7\2\2\u0117\u0119\5\26\f\6\u0118\u010f\3\2\2\2\u0118\u0112\3\2\2\2\u0118"+
		"\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\27\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\t\b\2\2\u011e\31"+
		"\3\2\2\2\u011f\u0120\7\23\2\2\u0120\u0121\7E\2\2\u0121\u0122\7F\2\2\u0122"+
		"\33\3\2\2\2\32\37&,\62<AHOQY[\u0092\u0098\u00b0\u00c2\u00dc\u00e7\u00ec"+
		"\u00fa\u00fd\u00ff\u010d\u0118\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}