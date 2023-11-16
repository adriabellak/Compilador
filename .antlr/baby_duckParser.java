// Generated from c:/Users/adria/OneDrive/Escritorio/ITC/Semestre8/Aplicaciones_Avanzadas/Compiladores/Compilador_Adriana/baby_duck.g4 by ANTLR 4.13.1

from funciones import *

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class baby_duckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, EQ=23, OPER_EXP=24, 
		OPER_TERM=25, TYPE=26, ID=27, CTE_INT=28, CTE_FLOAT=29, CTE_STRING=30, 
		WHITESPACE=31;
	public static final int
		RULE_programa = 0, RULE_vars = 1, RULE_varlist = 2, RULE_body = 3, RULE_statement = 4, 
		RULE_print = 5, RULE_assign = 6, RULE_cycle = 7, RULE_condition = 8, RULE_expresion = 9, 
		RULE_oper_rel = 10, RULE_exp = 11, RULE_termino = 12, RULE_factor = 13, 
		RULE_funcs = 14, RULE_params = 15, RULE_f_call = 16, RULE_cte = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "vars", "varlist", "body", "statement", "print", "assign", 
			"cycle", "condition", "expresion", "oper_rel", "exp", "termino", "factor", 
			"funcs", "params", "f_call", "cte"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'main'", "'end'", "'var'", "':'", "','", "'{'", 
			"'}'", "'print'", "'('", "')'", "'while'", "'do'", "'if'", "'else'", 
			"'<'", "'>'", "'!='", "'void'", "'['", "']'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "EQ", 
			"OPER_EXP", "OPER_TERM", "TYPE", "ID", "CTE_INT", "CTE_FLOAT", "CTE_STRING", 
			"WHITESPACE"
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
	public String getGrammarFileName() { return "baby_duck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public baby_duckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(baby_duckParser.ID, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public List<FuncsContext> funcs() {
			return getRuleContexts(FuncsContext.class);
		}
		public FuncsContext funcs(int i) {
			return getRuleContext(FuncsContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(ID);
			setState(38);
			match(T__1);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(39);
				vars();
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(42);
				funcs();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(T__2);
			setState(49);
			body();
			setState(50);
			match(T__3);
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
	public static class VarsContext extends ParserRuleContext {
		public VarlistContext varlist;
		public Token TYPE;
		public List<VarlistContext> varlist() {
			return getRuleContexts(VarlistContext.class);
		}
		public VarlistContext varlist(int i) {
			return getRuleContext(VarlistContext.class,i);
		}
		public List<TerminalNode> TYPE() { return getTokens(baby_duckParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(baby_duckParser.TYPE, i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__4);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				((VarsContext)_localctx).varlist = varlist();
				setState(54);
				match(T__5);
				setState(55);
				((VarsContext)_localctx).TYPE = match(TYPE);
				agregar_vars((((VarsContext)_localctx).varlist!=null?_input.getText(((VarsContext)_localctx).varlist.start,((VarsContext)_localctx).varlist.stop):null), (((VarsContext)_localctx).TYPE!=null?((VarsContext)_localctx).TYPE.getText():null))
				setState(57);
				match(T__1);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class VarlistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(baby_duckParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(baby_duckParser.ID, i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ID);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(64);
				match(T__6);
				setState(65);
				match(ID);
				}
				}
				setState(70);
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
	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__7);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134259712L) != 0)) {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				cycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				f_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				print();
				}
				break;
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
	public static class PrintContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> CTE_STRING() { return getTokens(baby_duckParser.CTE_STRING); }
		public TerminalNode CTE_STRING(int i) {
			return getToken(baby_duckParser.CTE_STRING, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__9);
			setState(88);
			match(T__10);
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case OPER_EXP:
			case ID:
			case CTE_INT:
			case CTE_FLOAT:
				{
				setState(89);
				expresion();
				print_expresion()
				}
				break;
			case CTE_STRING:
				{
				setState(92);
				match(CTE_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(95);
				match(T__6);
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
				case OPER_EXP:
				case ID:
				case CTE_INT:
				case CTE_FLOAT:
					{
					setState(96);
					expresion();
					print_expresion()
					}
					break;
				case CTE_STRING:
					{
					setState(99);
					match(CTE_STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(T__11);
			setState(108);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(baby_duckParser.ID, 0); }
		public TerminalNode EQ() { return getToken(baby_duckParser.EQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((AssignContext)_localctx).ID = match(ID);
			push_operando((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null), 'ID')
			setState(112);
			match(EQ);
			push_operador('=')
			setState(114);
			expresion();
			pop_assign()
			setState(116);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CycleContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__12);
			setState(119);
			body();
			setState(120);
			match(T__13);
			setState(121);
			match(T__10);
			setState(122);
			expresion();
			setState(123);
			match(T__11);
			setState(124);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__14);
			setState(127);
			match(T__10);
			setState(128);
			expresion();
			setState(129);
			match(T__11);
			if1()
			setState(131);
			body();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(132);
				match(T__15);
				if3()
				setState(134);
				body();
				}
			}

			setState(137);
			match(T__1);
			if2()
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
	public static class ExpresionContext extends ParserRuleContext {
		public Oper_relContext oper_rel;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Oper_relContext oper_rel() {
			return getRuleContext(Oper_relContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			exp();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				setState(141);
				((ExpresionContext)_localctx).oper_rel = oper_rel();
				punto8((((ExpresionContext)_localctx).oper_rel!=null?_input.getText(((ExpresionContext)_localctx).oper_rel.start,((ExpresionContext)_localctx).oper_rel.stop):null))
				setState(143);
				exp();
				punto9()
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

	@SuppressWarnings("CheckReturnValue")
	public static class Oper_relContext extends ParserRuleContext {
		public Oper_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_rel; }
	}

	public final Oper_relContext oper_rel() throws RecognitionException {
		Oper_relContext _localctx = new Oper_relContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_oper_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
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
	public static class ExpContext extends ParserRuleContext {
		public Token OPER_EXP;
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> OPER_EXP() { return getTokens(baby_duckParser.OPER_EXP); }
		public TerminalNode OPER_EXP(int i) {
			return getToken(baby_duckParser.OPER_EXP, i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			termino();
			punto4()
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPER_EXP) {
				{
				{
				setState(152);
				((ExpContext)_localctx).OPER_EXP = match(OPER_EXP);
				punto2((((ExpContext)_localctx).OPER_EXP!=null?((ExpContext)_localctx).OPER_EXP.getText():null))
				setState(154);
				termino();
				punto4()
				}
				}
				setState(161);
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
	public static class TerminoContext extends ParserRuleContext {
		public Token OPER_TERM;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> OPER_TERM() { return getTokens(baby_duckParser.OPER_TERM); }
		public TerminalNode OPER_TERM(int i) {
			return getToken(baby_duckParser.OPER_TERM, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			factor();
			punto5()
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPER_TERM) {
				{
				{
				setState(164);
				((TerminoContext)_localctx).OPER_TERM = match(OPER_TERM);
				punto3((((TerminoContext)_localctx).OPER_TERM!=null?((TerminoContext)_localctx).OPER_TERM.getText():null))
				setState(166);
				factor();
				punto5()
				}
				}
				setState(173);
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
	public static class FactorContext extends ParserRuleContext {
		public Token OPER_EXP;
		public Token ID;
		public CteContext cte;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode ID() { return getToken(baby_duckParser.ID, 0); }
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public TerminalNode OPER_EXP() { return getToken(baby_duckParser.OPER_EXP, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__10);
				punto6()
				setState(176);
				expresion();
				setState(177);
				match(T__11);
				punto7()
				}
				break;
			case OPER_EXP:
			case ID:
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPER_EXP) {
					{
					setState(180);
					((FactorContext)_localctx).OPER_EXP = match(OPER_EXP);
					}
				}

				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(183);
					((FactorContext)_localctx).ID = match(ID);
					punto1((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null), 'ID', (((FactorContext)_localctx).OPER_EXP!=null?((FactorContext)_localctx).OPER_EXP.getText():null))
					}
					break;
				case CTE_INT:
				case CTE_FLOAT:
					{
					setState(185);
					((FactorContext)_localctx).cte = cte();
					punto1((((FactorContext)_localctx).cte!=null?_input.getText(((FactorContext)_localctx).cte.start,((FactorContext)_localctx).cte.stop):null), 'cte', (((FactorContext)_localctx).OPER_EXP!=null?((FactorContext)_localctx).OPER_EXP.getText():null))
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class FuncsContext extends ParserRuleContext {
		public Token ID;
		public ParamsContext params;
		public TerminalNode ID() { return getToken(baby_duckParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__19);
			setState(193);
			((FuncsContext)_localctx).ID = match(ID);
			setState(194);
			((FuncsContext)_localctx).params = params();
			nueva_func((((FuncsContext)_localctx).ID!=null?((FuncsContext)_localctx).ID.getText():null), (((FuncsContext)_localctx).params!=null?_input.getText(((FuncsContext)_localctx).params.start,((FuncsContext)_localctx).params.stop):null))
			setState(196);
			match(T__20);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(197);
				vars();
				}
			}

			setState(200);
			body();
			setState(201);
			match(T__21);
			setState(202);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(baby_duckParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(baby_duckParser.ID, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(baby_duckParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(baby_duckParser.TYPE, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__10);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(205);
				match(ID);
				setState(206);
				match(T__5);
				setState(207);
				match(TYPE);
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(209);
					match(T__6);
					setState(210);
					match(ID);
					setState(211);
					match(T__5);
					setState(212);
					match(TYPE);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(220);
			match(T__11);
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
	public static class F_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(baby_duckParser.ID, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public F_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_call; }
	}

	public final F_callContext f_call() throws RecognitionException {
		F_callContext _localctx = new F_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_f_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
			setState(223);
			match(T__10);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 956303360L) != 0)) {
				{
				setState(224);
				expresion();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(225);
					match(T__6);
					setState(226);
					expresion();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(234);
			match(T__11);
			setState(235);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CteContext extends ParserRuleContext {
		public TerminalNode CTE_INT() { return getToken(baby_duckParser.CTE_INT, 0); }
		public TerminalNode CTE_FLOAT() { return getToken(baby_duckParser.CTE_FLOAT, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==CTE_INT || _la==CTE_FLOAT) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000)\b\u0000\u0001\u0000\u0005"+
		"\u0000,\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001<\b\u0001\u000b\u0001\f\u0001"+
		"=\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002C\b\u0002\n\u0002\f\u0002"+
		"F\t\u0002\u0001\u0003\u0001\u0003\u0005\u0003J\b\u0003\n\u0003\f\u0003"+
		"M\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005^\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"e\b\u0005\u0005\u0005g\b\u0005\n\u0005\f\u0005j\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0088\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0093\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u009e"+
		"\b\u000b\n\u000b\f\u000b\u00a1\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00aa\b\f\n\f\f\f\u00ad\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b6\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bd\b\r\u0003\r\u00bf\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00c7\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00d6\b\u000f\n\u000f\f\u000f\u00d9"+
		"\t\u000f\u0003\u000f\u00db\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e4\b\u0010"+
		"\n\u0010\f\u0010\u00e7\t\u0010\u0003\u0010\u00e9\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"\u0000\u0002\u0001\u0000\u0011\u0013\u0001\u0000\u001c"+
		"\u001d\u00f5\u0000$\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000"+
		"\u0004?\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bU\u0001"+
		"\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000\fn\u0001\u0000\u0000\u0000"+
		"\u000ev\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u008c"+
		"\u0001\u0000\u0000\u0000\u0014\u0094\u0001\u0000\u0000\u0000\u0016\u0096"+
		"\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a\u00be"+
		"\u0001\u0000\u0000\u0000\u001c\u00c0\u0001\u0000\u0000\u0000\u001e\u00cc"+
		"\u0001\u0000\u0000\u0000 \u00de\u0001\u0000\u0000\u0000\"\u00ed\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005\u001b\u0000\u0000"+
		"&(\u0005\u0002\u0000\u0000\')\u0003\u0002\u0001\u0000(\'\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)-\u0001\u0000\u0000\u0000*,\u0003\u001c"+
		"\u000e\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u000001\u0005\u0003\u0000\u000012\u0003\u0006\u0003"+
		"\u000023\u0005\u0004\u0000\u00003\u0001\u0001\u0000\u0000\u00004;\u0005"+
		"\u0005\u0000\u000056\u0003\u0004\u0002\u000067\u0005\u0006\u0000\u0000"+
		"78\u0005\u001a\u0000\u000089\u0006\u0001\uffff\uffff\u00009:\u0005\u0002"+
		"\u0000\u0000:<\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">\u0003\u0001\u0000\u0000\u0000?D\u0005\u001b\u0000\u0000@A\u0005\u0007"+
		"\u0000\u0000AC\u0005\u001b\u0000\u0000B@\u0001\u0000\u0000\u0000CF\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"E\u0005\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GK\u0005\b\u0000"+
		"\u0000HJ\u0003\b\u0004\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0005\t\u0000\u0000O\u0007\u0001"+
		"\u0000\u0000\u0000PV\u0003\f\u0006\u0000QV\u0003\u0010\b\u0000RV\u0003"+
		"\u000e\u0007\u0000SV\u0003 \u0010\u0000TV\u0003\n\u0005\u0000UP\u0001"+
		"\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\t\u0001\u0000\u0000"+
		"\u0000WX\u0005\n\u0000\u0000X]\u0005\u000b\u0000\u0000YZ\u0003\u0012\t"+
		"\u0000Z[\u0006\u0005\uffff\uffff\u0000[^\u0001\u0000\u0000\u0000\\^\u0005"+
		"\u001e\u0000\u0000]Y\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000"+
		"^h\u0001\u0000\u0000\u0000_d\u0005\u0007\u0000\u0000`a\u0003\u0012\t\u0000"+
		"ab\u0006\u0005\uffff\uffff\u0000be\u0001\u0000\u0000\u0000ce\u0005\u001e"+
		"\u0000\u0000d`\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000eg\u0001"+
		"\u0000\u0000\u0000f_\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000kl\u0005\f\u0000\u0000lm\u0005\u0002\u0000"+
		"\u0000m\u000b\u0001\u0000\u0000\u0000no\u0005\u001b\u0000\u0000op\u0006"+
		"\u0006\uffff\uffff\u0000pq\u0005\u0017\u0000\u0000qr\u0006\u0006\uffff"+
		"\uffff\u0000rs\u0003\u0012\t\u0000st\u0006\u0006\uffff\uffff\u0000tu\u0005"+
		"\u0002\u0000\u0000u\r\u0001\u0000\u0000\u0000vw\u0005\r\u0000\u0000wx"+
		"\u0003\u0006\u0003\u0000xy\u0005\u000e\u0000\u0000yz\u0005\u000b\u0000"+
		"\u0000z{\u0003\u0012\t\u0000{|\u0005\f\u0000\u0000|}\u0005\u0002\u0000"+
		"\u0000}\u000f\u0001\u0000\u0000\u0000~\u007f\u0005\u000f\u0000\u0000\u007f"+
		"\u0080\u0005\u000b\u0000\u0000\u0080\u0081\u0003\u0012\t\u0000\u0081\u0082"+
		"\u0005\f\u0000\u0000\u0082\u0083\u0006\b\uffff\uffff\u0000\u0083\u0087"+
		"\u0003\u0006\u0003\u0000\u0084\u0085\u0005\u0010\u0000\u0000\u0085\u0086"+
		"\u0006\b\uffff\uffff\u0000\u0086\u0088\u0003\u0006\u0003\u0000\u0087\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0002\u0000\u0000\u008a\u008b"+
		"\u0006\b\uffff\uffff\u0000\u008b\u0011\u0001\u0000\u0000\u0000\u008c\u0092"+
		"\u0003\u0016\u000b\u0000\u008d\u008e\u0003\u0014\n\u0000\u008e\u008f\u0006"+
		"\t\uffff\uffff\u0000\u008f\u0090\u0003\u0016\u000b\u0000\u0090\u0091\u0006"+
		"\t\uffff\uffff\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008d\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0013\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0007\u0000\u0000\u0000\u0095\u0015\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0003\u0018\f\u0000\u0097\u009f\u0006\u000b"+
		"\uffff\uffff\u0000\u0098\u0099\u0005\u0018\u0000\u0000\u0099\u009a\u0006"+
		"\u000b\uffff\uffff\u0000\u009a\u009b\u0003\u0018\f\u0000\u009b\u009c\u0006"+
		"\u000b\uffff\uffff\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0098"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u0017"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0003\u001a\r\u0000\u00a3\u00ab\u0006\f\uffff\uffff\u0000\u00a4\u00a5"+
		"\u0005\u0019\u0000\u0000\u00a5\u00a6\u0006\f\uffff\uffff\u0000\u00a6\u00a7"+
		"\u0003\u001a\r\u0000\u00a7\u00a8\u0006\f\uffff\uffff\u0000\u00a8\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a4\u0001\u0000\u0000\u0000\u00aa\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u000b\u0000\u0000\u00af\u00b0"+
		"\u0006\r\uffff\uffff\u0000\u00b0\u00b1\u0003\u0012\t\u0000\u00b1\u00b2"+
		"\u0005\f\u0000\u0000\u00b2\u00b3\u0006\r\uffff\uffff\u0000\u00b3\u00bf"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b6\u0005\u0018\u0000\u0000\u00b5\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00bc"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u001b\u0000\u0000\u00b8\u00bd"+
		"\u0006\r\uffff\uffff\u0000\u00b9\u00ba\u0003\"\u0011\u0000\u00ba\u00bb"+
		"\u0006\r\uffff\uffff\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b7"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bd\u00bf"+
		"\u0001\u0000\u0000\u0000\u00be\u00ae\u0001\u0000\u0000\u0000\u00be\u00b5"+
		"\u0001\u0000\u0000\u0000\u00bf\u001b\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0014\u0000\u0000\u00c1\u00c2\u0005\u001b\u0000\u0000\u00c2\u00c3"+
		"\u0003\u001e\u000f\u0000\u00c3\u00c4\u0006\u000e\uffff\uffff\u0000\u00c4"+
		"\u00c6\u0005\u0015\u0000\u0000\u00c5\u00c7\u0003\u0002\u0001\u0000\u00c6"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u0006\u0003\u0000\u00c9"+
		"\u00ca\u0005\u0016\u0000\u0000\u00ca\u00cb\u0005\u0002\u0000\u0000\u00cb"+
		"\u001d\u0001\u0000\u0000\u0000\u00cc\u00da\u0005\u000b\u0000\u0000\u00cd"+
		"\u00ce\u0005\u001b\u0000\u0000\u00ce\u00cf\u0005\u0006\u0000\u0000\u00cf"+
		"\u00d0\u0005\u001a\u0000\u0000\u00d0\u00d7\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0005\u0007\u0000\u0000\u00d2\u00d3\u0005\u001b\u0000\u0000\u00d3"+
		"\u00d4\u0005\u0006\u0000\u0000\u00d4\u00d6\u0005\u001a\u0000\u0000\u00d5"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8"+
		"\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da"+
		"\u00cd\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\f\u0000\u0000\u00dd\u001f"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u001b\u0000\u0000\u00df\u00e8"+
		"\u0005\u000b\u0000\u0000\u00e0\u00e5\u0003\u0012\t\u0000\u00e1\u00e2\u0005"+
		"\u0007\u0000\u0000\u00e2\u00e4\u0003\u0012\t\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005\f\u0000\u0000\u00eb\u00ec\u0005\u0002\u0000"+
		"\u0000\u00ec!\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0001\u0000\u0000"+
		"\u00ee#\u0001\u0000\u0000\u0000\u0015(-=DKU]dh\u0087\u0092\u009f\u00ab"+
		"\u00b5\u00bc\u00be\u00c6\u00d7\u00da\u00e5\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}