// Generated from FortranToC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import model.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FortranToCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, IDENT=51, NUM_INT_CONST_B=52, 
		NUM_INT_CONST_O=53, NUM_INT_CONST_H=54, NUM_INT_CONST=55, NUM_REAL_CONST=56, 
		STRING_CONST=57, LINE_COMMENT=58, WS=59;
	public static final int
		RULE_prg = 0, RULE_prgmal = 1, RULE_dcllist = 2, RULE_cabecera = 3, RULE_cabeceramal = 4, 
		RULE_cablist = 5, RULE_decsubprog = 6, RULE_sentlist = 7, RULE_dcl = 8, 
		RULE_dcl2 = 9, RULE_defcte = 10, RULE_defvar = 11, RULE_ctelist = 12, 
		RULE_simpvalue = 13, RULE_tipo = 14, RULE_charlength = 15, RULE_varlist = 16, 
		RULE_varlist2 = 17, RULE_init = 18, RULE_decproc = 19, RULE_formal_paramlist = 20, 
		RULE_nomparamlist = 21, RULE_nomparamlist2 = 22, RULE_dec_s_paramlist = 23, 
		RULE_tipoparam = 24, RULE_decfun = 25, RULE_dec_f_paramlist = 26, RULE_sent = 27, 
		RULE_sent2 = 28, RULE_sent3 = 29, RULE_sent4 = 30, RULE_doval = 31, RULE_casos = 32, 
		RULE_casos2 = 33, RULE_etiquetas = 34, RULE_etiquetas2 = 35, RULE_etiquetas3 = 36, 
		RULE_listaetiquetas = 37, RULE_exp = 38, RULE_expAux = 39, RULE_op = 40, 
		RULE_oparit = 41, RULE_expcond = 42, RULE_expcondAux = 43, RULE_oplog = 44, 
		RULE_factorcond = 45, RULE_opcomp = 46, RULE_factor = 47, RULE_factor2 = 48, 
		RULE_explist = 49, RULE_proc_call = 50, RULE_subpparamlist = 51, RULE_subproglist = 52, 
		RULE_codproc = 53, RULE_codfun = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "prgmal", "dcllist", "cabecera", "cabeceramal", "cablist", "decsubprog", 
			"sentlist", "dcl", "dcl2", "defcte", "defvar", "ctelist", "simpvalue", 
			"tipo", "charlength", "varlist", "varlist2", "init", "decproc", "formal_paramlist", 
			"nomparamlist", "nomparamlist2", "dec_s_paramlist", "tipoparam", "decfun", 
			"dec_f_paramlist", "sent", "sent2", "sent3", "sent4", "doval", "casos", 
			"casos2", "etiquetas", "etiquetas2", "etiquetas3", "listaetiquetas", 
			"exp", "expAux", "op", "oparit", "expcond", "expcondAux", "oplog", "factorcond", 
			"opcomp", "factor", "factor2", "explist", "proc_call", "subpparamlist", 
			"subproglist", "codproc", "codfun"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "';'", "'END'", "'program'", "'INTERFACE'", "'interface'", 
			"','", "'PARAMETER'", "'::'", "'='", "'INTEGER'", "'REAL'", "'CHARACTER'", 
			"'('", "')'", "'SUBROUTINE'", "'INTENT'", "'IN'", "'OUT'", "'INOUT'", 
			"'FUNCTION'", "'IF'", "'DO'", "'SELECT'", "'CASE'", "'THEN'", "'ENDIF'", 
			"'ELSE'", "'WHILE'", "'ENDDO'", "'DEFAULT'", "':'", "'+'", "'-'", "'*'", 
			"'/'", "'.OR.'", "'.AND.'", "'.EQV.'", "'.NEQV.'", "'.NOT.'", "'.TRUE.'", 
			"'.FALSE.'", "'<'", "'>'", "'<='", "'>='", "'=='", "'/='", "'CALL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IDENT", "NUM_INT_CONST_B", "NUM_INT_CONST_O", "NUM_INT_CONST_H", 
			"NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "FortranToC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		ArrayList<Constante> constantes = new ArrayList<>();
		ArrayList<Cabecera> cabeceras = new ArrayList<>();
		ArrayList<Variable> functionVarList = new ArrayList<>();
		ArrayList<String> sentencias = new ArrayList<>();
		Programa programa = new Programa();

		String varListToString (ArrayList<Variable> vars) {
		    String result = "";
		    int size = vars.size();
		    for(int i=0;i<size;i++) {
	            result += vars.get(i).toString();
	            result = result.replace('*','&');
	            if (i < (size-1))
	                result += " , ";
	        }
	        return result;
		}

	public FortranToCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrgContext extends ParserRuleContext {
		public PrgmalContext prgmal() {
			return getRuleContext(PrgmalContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitPrg(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				prgmal();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__0);
				setState(112);
				match(IDENT);
				setState(113);
				match(T__1);
				setState(114);
				dcllist();
				setState(115);
				cabecera();
				programa.setCabeceras(cabeceras);
				setState(117);
				sent();
				setState(118);
				sentlist();
				setState(119);
				match(T__2);
				setState(120);
				match(T__0);
				sentencias.add("}");
				setState(122);
				match(IDENT);
				setState(123);
				subproglist();
				programa.setConstantes(constantes); programa.setSentencias(sentencias); programa.printPrograma();
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

	public static class PrgmalContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public PrgmalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prgmal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterPrgmal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitPrgmal(this);
		}
	}

	public final PrgmalContext prgmal() throws RecognitionException {
		PrgmalContext _localctx = new PrgmalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prgmal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__3);
			setState(129);
			match(IDENT);
			setState(130);
			match(T__1);
			setState(131);
			dcllist();
			setState(132);
			cabecera();
			setState(133);
			sent();
			setState(134);
			sentlist();
			setState(135);
			match(T__2);
			setState(136);
			match(T__3);
			setState(137);
			match(IDENT);
			setState(138);
			subproglist();
			System.err.println("PROGRAM debe ir con mayusculas");
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

	public static class DcllistContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDcllist(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcllist);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				dcl();
				setState(142);
				dcllist();
				}
				break;
			case T__4:
			case T__5:
			case T__21:
			case T__22:
			case T__23:
			case T__49:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CabeceraContext extends ParserRuleContext {
		public CabeceramalContext cabeceramal() {
			return getRuleContext(CabeceramalContext.class,0);
		}
		public CablistContext cablist() {
			return getRuleContext(CablistContext.class,0);
		}
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCabecera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCabecera(this);
		}
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cabecera);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				cabeceramal();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__4);
				setState(149);
				cablist();
				setState(150);
				match(T__2);
				setState(151);
				match(T__4);
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__49:
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class CabeceramalContext extends ParserRuleContext {
		public CablistContext cablist() {
			return getRuleContext(CablistContext.class,0);
		}
		public CabeceramalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabeceramal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCabeceramal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCabeceramal(this);
		}
	}

	public final CabeceramalContext cabeceramal() throws RecognitionException {
		CabeceramalContext _localctx = new CabeceramalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cabeceramal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__5);
			setState(157);
			cablist();
			setState(158);
			match(T__2);
			setState(159);
			match(T__5);
			System.err.println("INTERFACE debe ir con mayusculas");
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

	public static class CablistContext extends ParserRuleContext {
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public CablistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cablist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCablist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCablist(this);
		}
	}

	public final CablistContext cablist() throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cablist);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				decproc();
				setState(163);
				decsubprog();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				decfun();
				setState(166);
				decsubprog();
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

	public static class DecsubprogContext extends ParserRuleContext {
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public DecsubprogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decsubprog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDecsubprog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDecsubprog(this);
		}
	}

	public final DecsubprogContext decsubprog() throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decsubprog);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				decproc();
				setState(171);
				decsubprog();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				decfun();
				setState(174);
				decsubprog();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class SentlistContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSentlist(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentlist);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				sent();
				setState(180);
				sentlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DclContext extends ParserRuleContext {
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dcl2Context dcl2() {
			return getRuleContext(Dcl2Context.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDcl(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			((DclContext)_localctx).tipo = tipo();
			setState(186);
			dcl2(((DclContext)_localctx).tipo.tipoValue, ((DclContext)_localctx).tipo.charSize);
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

	public static class Dcl2Context extends ParserRuleContext {
		public String tipoValue;
		public String charSize;
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public Dcl2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dcl2Context(ParserRuleContext parent, int invokingState, String tipoValue, String charSize) {
			super(parent, invokingState);
			this.tipoValue = tipoValue;
			this.charSize = charSize;
		}
		@Override public int getRuleIndex() { return RULE_dcl2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDcl2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDcl2(this);
		}
	}

	public final Dcl2Context dcl2(String tipoValue,String charSize) throws RecognitionException {
		Dcl2Context _localctx = new Dcl2Context(_ctx, getState(), tipoValue, charSize);
		enterRule(_localctx, 18, RULE_dcl2);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(T__6);
				setState(189);
				match(T__7);
				setState(190);
				match(T__8);
				setState(191);
				((Dcl2Context)_localctx).IDENT = match(IDENT);
				setState(192);
				match(T__9);
				setState(193);
				((Dcl2Context)_localctx).simpvalue = simpvalue();
				constantes.add(new Constante((((Dcl2Context)_localctx).IDENT!=null?((Dcl2Context)_localctx).IDENT.getText():null), ((Dcl2Context)_localctx).simpvalue.simpvalueValue));
				setState(195);
				ctelist();
				setState(196);
				match(T__1);
				setState(197);
				defcte();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(T__8);
				setState(200);
				varlist(_localctx.tipoValue, _localctx.charSize);
				setState(201);
				match(T__1);
				setState(202);
				defvar();
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

	public static class DefcteContext extends ParserRuleContext {
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDefcte(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defcte);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				tipo();
				setState(207);
				match(T__6);
				setState(208);
				match(T__7);
				setState(209);
				match(T__8);
				setState(210);
				((DefcteContext)_localctx).IDENT = match(IDENT);
				setState(211);
				match(T__9);
				setState(212);
				((DefcteContext)_localctx).simpvalue = simpvalue();
				constantes.add(new Constante((((DefcteContext)_localctx).IDENT!=null?((DefcteContext)_localctx).IDENT.getText():null), ((DefcteContext)_localctx).simpvalue.simpvalueValue));
				setState(214);
				ctelist();
				setState(215);
				match(T__1);
				setState(216);
				defcte();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DefvarContext extends ParserRuleContext {
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDefvar(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defvar);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				((DefvarContext)_localctx).tipo = tipo();
				setState(222);
				match(T__8);
				setState(223);
				varlist(((DefvarContext)_localctx).tipo.tipoValue, ((DefvarContext)_localctx).tipo.charSize);
				setState(224);
				match(T__1);
				setState(225);
				defvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CtelistContext extends ParserRuleContext {
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCtelist(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ctelist);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(T__6);
				setState(231);
				((CtelistContext)_localctx).IDENT = match(IDENT);
				setState(232);
				match(T__9);
				setState(233);
				((CtelistContext)_localctx).simpvalue = simpvalue();
				constantes.add(new Constante((((CtelistContext)_localctx).IDENT!=null?((CtelistContext)_localctx).IDENT.getText():null), ((CtelistContext)_localctx).simpvalue.simpvalueValue));
				setState(235);
				ctelist();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SimpvalueContext extends ParserRuleContext {
		public String simpvalueValue;
		public Token NUM_INT_CONST;
		public Token NUM_REAL_CONST;
		public Token STRING_CONST;
		public Token NUM_INT_CONST_B;
		public Token NUM_INT_CONST_O;
		public Token NUM_INT_CONST_H;
		public TerminalNode NUM_INT_CONST() { return getToken(FortranToCParser.NUM_INT_CONST, 0); }
		public TerminalNode NUM_REAL_CONST() { return getToken(FortranToCParser.NUM_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(FortranToCParser.STRING_CONST, 0); }
		public TerminalNode NUM_INT_CONST_B() { return getToken(FortranToCParser.NUM_INT_CONST_B, 0); }
		public TerminalNode NUM_INT_CONST_O() { return getToken(FortranToCParser.NUM_INT_CONST_O, 0); }
		public TerminalNode NUM_INT_CONST_H() { return getToken(FortranToCParser.NUM_INT_CONST_H, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSimpvalue(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simpvalue);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((SimpvalueContext)_localctx).simpvalueValue =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				((SimpvalueContext)_localctx).simpvalueValue =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null);
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).simpvalueValue =  (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null);
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				((SimpvalueContext)_localctx).simpvalueValue =  (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null);
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				((SimpvalueContext)_localctx).simpvalueValue =  (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null);
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				((SimpvalueContext)_localctx).NUM_INT_CONST_H = match(NUM_INT_CONST_H);
				((SimpvalueContext)_localctx).simpvalueValue =  (((SimpvalueContext)_localctx).NUM_INT_CONST_H!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_H.getText():null);
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

	public static class TipoContext extends ParserRuleContext {
		public String tipoValue;
		public String charSize;
		public CharlengthContext charlength;
		public CharlengthContext charlength() {
			return getRuleContext(CharlengthContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(T__10);
				((TipoContext)_localctx).tipoValue =  "int"; ((TipoContext)_localctx).charSize =  "";
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(T__11);
				((TipoContext)_localctx).tipoValue =  "float"; ((TipoContext)_localctx).charSize =  "";
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(T__12);
				setState(259);
				((TipoContext)_localctx).charlength = charlength();
				((TipoContext)_localctx).tipoValue =  "char"; ((TipoContext)_localctx).charSize =  ((TipoContext)_localctx).charlength.charlengthValue;
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

	public static class CharlengthContext extends ParserRuleContext {
		public String charlengthValue;
		public Token NUM_INT_CONST;
		public TerminalNode NUM_INT_CONST() { return getToken(FortranToCParser.NUM_INT_CONST, 0); }
		public CharlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCharlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCharlength(this);
		}
	}

	public final CharlengthContext charlength() throws RecognitionException {
		CharlengthContext _localctx = new CharlengthContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_charlength);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(T__13);
				setState(265);
				((CharlengthContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(266);
				match(T__14);
				((CharlengthContext)_localctx).charlengthValue =  "[" + (((CharlengthContext)_localctx).NUM_INT_CONST!=null?((CharlengthContext)_localctx).NUM_INT_CONST.getText():null) + "]";
				}
				break;
			case T__6:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				((CharlengthContext)_localctx).charlengthValue =  "";
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

	public static class VarlistContext extends ParserRuleContext {
		public String tipoValue;
		public String charSize;
		public Token IDENT;
		public InitContext init;
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Varlist2Context varlist2() {
			return getRuleContext(Varlist2Context.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistContext(ParserRuleContext parent, int invokingState, String tipoValue, String charSize) {
			super(parent, invokingState);
			this.tipoValue = tipoValue;
			this.charSize = charSize;
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist(String tipoValue,String charSize) throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState(), tipoValue, charSize);
		enterRule(_localctx, 32, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			((VarlistContext)_localctx).IDENT = match(IDENT);
			setState(272);
			((VarlistContext)_localctx).init = init();
			sentencias.add(_localctx.tipoValue + " " + (((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null) + _localctx.charSize + ((VarlistContext)_localctx).init.initValue + ";");
			setState(274);
			varlist2(_localctx.tipoValue, _localctx.charSize);
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

	public static class Varlist2Context extends ParserRuleContext {
		public String tipoValue;
		public String charSize;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Varlist2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Varlist2Context(ParserRuleContext parent, int invokingState, String tipoValue, String charSize) {
			super(parent, invokingState);
			this.tipoValue = tipoValue;
			this.charSize = charSize;
		}
		@Override public int getRuleIndex() { return RULE_varlist2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterVarlist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitVarlist2(this);
		}
	}

	public final Varlist2Context varlist2(String tipoValue,String charSize) throws RecognitionException {
		Varlist2Context _localctx = new Varlist2Context(_ctx, getState(), tipoValue, charSize);
		enterRule(_localctx, 34, RULE_varlist2);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(T__6);
				setState(278);
				varlist(_localctx.tipoValue, _localctx.charSize);
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

	public static class InitContext extends ParserRuleContext {
		public String initValue;
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_init);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(T__9);
				setState(282);
				((InitContext)_localctx).simpvalue = simpvalue();
				((InitContext)_localctx).initValue =  " = " + ((InitContext)_localctx).simpvalue.simpvalueValue;
				}
				break;
			case T__1:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				((InitContext)_localctx).initValue =  "";
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

	public static class DecprocContext extends ParserRuleContext {
		public Token IDENT1;
		public Token IDENT2;
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
		}
		public DecprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDecproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDecproc(this);
		}
	}

	public final DecprocContext decproc() throws RecognitionException {
		DecprocContext _localctx = new DecprocContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__15);
			setState(289);
			((DecprocContext)_localctx).IDENT1 = match(IDENT);
			setState(290);
			formal_paramlist();
			setState(291);
			dec_s_paramlist();
			setState(292);
			match(T__2);
			setState(293);
			match(T__15);
			setState(294);
			((DecprocContext)_localctx).IDENT2 = match(IDENT);
			Cabecera cab = new Cabecera((((DecprocContext)_localctx).IDENT1!=null?((DecprocContext)_localctx).IDENT1.getText():null), (((DecprocContext)_localctx).IDENT2!=null?((DecprocContext)_localctx).IDENT2.getText():null), "void"); cab.setVars(functionVarList);
			  functionVarList = new ArrayList<>(); cabeceras.add(cab);
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

	public static class Formal_paramlistContext extends ParserRuleContext {
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitFormal_paramlist(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formal_paramlist);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__10:
			case T__11:
			case T__12:
			case T__21:
			case T__22:
			case T__23:
			case T__49:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(T__13);
				setState(299);
				nomparamlist();
				setState(300);
				match(T__14);
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

	public static class NomparamlistContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public Nomparamlist2Context nomparamlist2() {
			return getRuleContext(Nomparamlist2Context.class,0);
		}
		public NomparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterNomparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitNomparamlist(this);
		}
	}

	public final NomparamlistContext nomparamlist() throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nomparamlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IDENT);
			setState(305);
			nomparamlist2();
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

	public static class Nomparamlist2Context extends ParserRuleContext {
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Nomparamlist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterNomparamlist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitNomparamlist2(this);
		}
	}

	public final Nomparamlist2Context nomparamlist2() throws RecognitionException {
		Nomparamlist2Context _localctx = new Nomparamlist2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_nomparamlist2);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(T__6);
				setState(309);
				nomparamlist();
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

	public static class Dec_s_paramlistContext extends ParserRuleContext {
		public TipoContext tipo;
		public TipoparamContext tipoparam;
		public Token IDENT;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoparamContext tipoparam() {
			return getRuleContext(TipoparamContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_s_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDec_s_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDec_s_paramlist(this);
		}
	}

	public final Dec_s_paramlistContext dec_s_paramlist() throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dec_s_paramlist);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				((Dec_s_paramlistContext)_localctx).tipo = tipo();
				setState(313);
				match(T__6);
				setState(314);
				match(T__16);
				setState(315);
				match(T__13);
				setState(316);
				((Dec_s_paramlistContext)_localctx).tipoparam = tipoparam();
				setState(317);
				match(T__14);
				setState(318);
				((Dec_s_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(319);
				match(T__1);
				functionVarList.add(new Variable(((Dec_s_paramlistContext)_localctx).tipoparam.tipoparamValue + (((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null), ((Dec_s_paramlistContext)_localctx).tipo.tipoValue, ((Dec_s_paramlistContext)_localctx).tipo.charSize));
				setState(321);
				dec_s_paramlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TipoparamContext extends ParserRuleContext {
		public String tipoparamValue;
		public TipoparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterTipoparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitTipoparam(this);
		}
	}

	public final TipoparamContext tipoparam() throws RecognitionException {
		TipoparamContext _localctx = new TipoparamContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tipoparam);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(T__17);
				((TipoparamContext)_localctx).tipoparamValue =  "";
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(T__18);
				((TipoparamContext)_localctx).tipoparamValue =  "*";
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(T__19);
				((TipoparamContext)_localctx).tipoparamValue =  "*";
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

	public static class DecfunContext extends ParserRuleContext {
		public Token IDENT1;
		public TipoContext tipo;
		public Token IDENT2;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
		}
		public DecfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDecfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDecfun(this);
		}
	}

	public final DecfunContext decfun() throws RecognitionException {
		DecfunContext _localctx = new DecfunContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_decfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__20);
			setState(335);
			((DecfunContext)_localctx).IDENT1 = match(IDENT);
			setState(336);
			match(T__13);
			setState(337);
			nomparamlist();
			setState(338);
			match(T__14);
			setState(339);
			((DecfunContext)_localctx).tipo = tipo();
			setState(340);
			match(T__8);
			setState(341);
			((DecfunContext)_localctx).IDENT2 = match(IDENT);
			setState(342);
			match(T__1);
			setState(343);
			dec_f_paramlist();
			Cabecera cab = new Cabecera((((DecfunContext)_localctx).IDENT1!=null?((DecfunContext)_localctx).IDENT1.getText():null), (((DecfunContext)_localctx).IDENT2!=null?((DecfunContext)_localctx).IDENT2.getText():null), ((DecfunContext)_localctx).tipo.tipoValue); cab.setVars(functionVarList);
			 functionVarList = new ArrayList<>(); cabeceras.add(cab);
			setState(345);
			match(T__2);
			setState(346);
			match(T__20);
			setState(347);
			match(IDENT);
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

	public static class Dec_f_paramlistContext extends ParserRuleContext {
		public TipoContext tipo;
		public Token IDENT;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_f_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDec_f_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDec_f_paramlist(this);
		}
	}

	public final Dec_f_paramlistContext dec_f_paramlist() throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dec_f_paramlist);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				((Dec_f_paramlistContext)_localctx).tipo = tipo();
				setState(350);
				match(T__6);
				setState(351);
				match(T__16);
				setState(352);
				match(T__13);
				setState(353);
				match(T__17);
				setState(354);
				match(T__14);
				setState(355);
				((Dec_f_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(356);
				match(T__1);
				functionVarList.add(new Variable((((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null), ((Dec_f_paramlistContext)_localctx).tipo.tipoValue, ((Dec_f_paramlistContext)_localctx).tipo.charSize));
				setState(358);
				dec_f_paramlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SentContext extends ParserRuleContext {
		public Token IDENT;
		public ExpContext exp;
		public Proc_callContext proc_call;
		public ExpcondContext expcond;
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public Sent2Context sent2() {
			return getRuleContext(Sent2Context.class,0);
		}
		public Sent4Context sent4() {
			return getRuleContext(Sent4Context.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSent(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sent);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(364);
				match(T__9);
				setState(365);
				((SentContext)_localctx).exp = exp();
				setState(366);
				match(T__1);
				sentencias.add((((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " = " + ((SentContext)_localctx).exp.expValue + ";");
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				((SentContext)_localctx).proc_call = proc_call();
				setState(370);
				match(T__1);
				sentencias.add(((SentContext)_localctx).proc_call.proc_callValue);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(T__21);
				setState(374);
				match(T__13);
				setState(375);
				((SentContext)_localctx).expcond = expcond();
				sentencias.add("if ( " + ((SentContext)_localctx).expcond.expcondValue + " ) {");
				setState(377);
				match(T__14);
				setState(378);
				sent2();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				match(T__22);
				setState(381);
				sent4();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				match(T__23);
				setState(383);
				match(T__24);
				setState(384);
				match(T__13);
				setState(385);
				((SentContext)_localctx).exp = exp();
				setState(386);
				match(T__14);
				sentencias.add("switch (" + ((SentContext)_localctx).exp.expValue + ") {");
				setState(388);
				casos();
				setState(389);
				match(T__2);
				setState(390);
				match(T__23);
				sentencias.add("}");
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

	public static class Sent2Context extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public Sent3Context sent3() {
			return getRuleContext(Sent3Context.class,0);
		}
		public Sent2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSent2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSent2(this);
		}
	}

	public final Sent2Context sent2() throws RecognitionException {
		Sent2Context _localctx = new Sent2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_sent2);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__49:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				sent();
				sentencias.add("}");
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(T__25);
				setState(399);
				sentlist();
				setState(400);
				sent3();
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

	public static class Sent3Context extends ParserRuleContext {
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public Sent3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSent3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSent3(this);
		}
	}

	public final Sent3Context sent3() throws RecognitionException {
		Sent3Context _localctx = new Sent3Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_sent3);
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(T__26);
				sentencias.add("}");
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				sentencias.add("} else {");
				setState(407);
				match(T__27);
				setState(408);
				sentlist();
				setState(409);
				match(T__26);
				sentencias.add("}");
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

	public static class Sent4Context extends ParserRuleContext {
		public ExpcondContext expcond;
		public Token IDENT;
		public DovalContext doval1;
		public DovalContext doval2;
		public DovalContext doval3;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public List<DovalContext> doval() {
			return getRuleContexts(DovalContext.class);
		}
		public DovalContext doval(int i) {
			return getRuleContext(DovalContext.class,i);
		}
		public Sent4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSent4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSent4(this);
		}
	}

	public final Sent4Context sent4() throws RecognitionException {
		Sent4Context _localctx = new Sent4Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_sent4);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(T__28);
				setState(415);
				match(T__13);
				setState(416);
				((Sent4Context)_localctx).expcond = expcond();
				setState(417);
				match(T__14);
				sentencias.add("while ( " + ((Sent4Context)_localctx).expcond.expcondValue + " ) {");
				setState(419);
				sentlist();
				setState(420);
				match(T__29);
				sentencias.add("}");
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				((Sent4Context)_localctx).IDENT = match(IDENT);
				setState(424);
				match(T__9);
				setState(425);
				((Sent4Context)_localctx).doval1 = doval();
				setState(426);
				match(T__6);
				setState(427);
				((Sent4Context)_localctx).doval2 = doval();
				setState(428);
				match(T__6);
				setState(429);
				((Sent4Context)_localctx).doval3 = doval();
				sentencias.add("for ( " + (((Sent4Context)_localctx).IDENT!=null?((Sent4Context)_localctx).IDENT.getText():null) + "=" + ((Sent4Context)_localctx).doval1.dovalValue + " ; "
				     + (((Sent4Context)_localctx).IDENT!=null?((Sent4Context)_localctx).IDENT.getText():null) + "!=" + ((Sent4Context)_localctx).doval2.dovalValue + " ; " + (((Sent4Context)_localctx).IDENT!=null?((Sent4Context)_localctx).IDENT.getText():null) + "=" + (((Sent4Context)_localctx).IDENT!=null?((Sent4Context)_localctx).IDENT.getText():null) + "+" + ((Sent4Context)_localctx).doval3.dovalValue + " ) {");
				setState(431);
				sentlist();
				setState(432);
				match(T__29);
				sentencias.add("}");
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

	public static class DovalContext extends ParserRuleContext {
		public String dovalValue;
		public Token NUM_INT_CONST;
		public Token IDENT;
		public TerminalNode NUM_INT_CONST() { return getToken(FortranToCParser.NUM_INT_CONST, 0); }
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public DovalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterDoval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitDoval(this);
		}
	}

	public final DovalContext doval() throws RecognitionException {
		DovalContext _localctx = new DovalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_doval);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				((DovalContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((DovalContext)_localctx).dovalValue =  (((DovalContext)_localctx).NUM_INT_CONST!=null?((DovalContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				((DovalContext)_localctx).IDENT = match(IDENT);
				((DovalContext)_localctx).dovalValue =  (((DovalContext)_localctx).IDENT!=null?((DovalContext)_localctx).IDENT.getText():null);
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

	public static class CasosContext extends ParserRuleContext {
		public Casos2Context casos2() {
			return getRuleContext(Casos2Context.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCasos(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_casos);
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(T__24);
				setState(444);
				casos2();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Casos2Context extends ParserRuleContext {
		public EtiquetasContext etiquetas() {
			return getRuleContext(EtiquetasContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public Casos2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCasos2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCasos2(this);
		}
	}

	public final Casos2Context casos2() throws RecognitionException {
		Casos2Context _localctx = new Casos2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_casos2);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(T__13);
				setState(449);
				etiquetas();
				setState(450);
				match(T__14);
				setState(451);
				sentlist();
				sentencias.add("break;");
				setState(453);
				casos();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(T__30);
				sentencias.add("default :");
				setState(457);
				sentlist();
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

	public static class EtiquetasContext extends ParserRuleContext {
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Etiquetas2Context etiquetas2() {
			return getRuleContext(Etiquetas2Context.class,0);
		}
		public EtiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterEtiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitEtiquetas(this);
		}
	}

	public final EtiquetasContext etiquetas() throws RecognitionException {
		EtiquetasContext _localctx = new EtiquetasContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_etiquetas);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				setState(461);
				etiquetas2(((EtiquetasContext)_localctx).simpvalue.simpvalueValue);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(T__31);
				setState(464);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				sentencias.add("case < " + ((EtiquetasContext)_localctx).simpvalue.simpvalueValue + " :");
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

	public static class Etiquetas2Context extends ParserRuleContext {
		public String simpvalueValue;
		public ListaetiquetasContext listaetiquetas() {
			return getRuleContext(ListaetiquetasContext.class,0);
		}
		public Etiquetas3Context etiquetas3() {
			return getRuleContext(Etiquetas3Context.class,0);
		}
		public Etiquetas2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Etiquetas2Context(ParserRuleContext parent, int invokingState, String simpvalueValue) {
			super(parent, invokingState);
			this.simpvalueValue = simpvalueValue;
		}
		@Override public int getRuleIndex() { return RULE_etiquetas2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterEtiquetas2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitEtiquetas2(this);
		}
	}

	public final Etiquetas2Context etiquetas2(String simpvalueValue) throws RecognitionException {
		Etiquetas2Context _localctx = new Etiquetas2Context(_ctx, getState(), simpvalueValue);
		enterRule(_localctx, 70, RULE_etiquetas2);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				listaetiquetas();
				sentencias.add("case " + _localctx.simpvalueValue + " :");
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(T__31);
				setState(473);
				etiquetas3(_localctx.simpvalueValue);
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

	public static class Etiquetas3Context extends ParserRuleContext {
		public String simpvalueValue1;
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Etiquetas3Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Etiquetas3Context(ParserRuleContext parent, int invokingState, String simpvalueValue1) {
			super(parent, invokingState);
			this.simpvalueValue1 = simpvalueValue1;
		}
		@Override public int getRuleIndex() { return RULE_etiquetas3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterEtiquetas3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitEtiquetas3(this);
		}
	}

	public final Etiquetas3Context etiquetas3(String simpvalueValue1) throws RecognitionException {
		Etiquetas3Context _localctx = new Etiquetas3Context(_ctx, getState(), simpvalueValue1);
		enterRule(_localctx, 72, RULE_etiquetas3);
		try {
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				((Etiquetas3Context)_localctx).simpvalue = simpvalue();
				sentencias.add("case " + _localctx.simpvalueValue1 + " to " + ((Etiquetas3Context)_localctx).simpvalue.simpvalueValue + " :");
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				sentencias.add("case > " + _localctx.simpvalueValue1 + " :");
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

	public static class ListaetiquetasContext extends ParserRuleContext {
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ListaetiquetasContext listaetiquetas() {
			return getRuleContext(ListaetiquetasContext.class,0);
		}
		public ListaetiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaetiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterListaetiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitListaetiquetas(this);
		}
	}

	public final ListaetiquetasContext listaetiquetas() throws RecognitionException {
		ListaetiquetasContext _localctx = new ListaetiquetasContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_listaetiquetas);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(T__6);
				setState(483);
				((ListaetiquetasContext)_localctx).simpvalue = simpvalue();
				sentencias.add("case " + ((ListaetiquetasContext)_localctx).simpvalue.simpvalueValue + " :");
				setState(485);
				listaetiquetas();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpContext extends ParserRuleContext {
		public String expValue;
		public FactorContext factor;
		public ExpAuxContext expAux;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpAuxContext expAux() {
			return getRuleContext(ExpAuxContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			((ExpContext)_localctx).factor = factor();
			setState(491);
			((ExpContext)_localctx).expAux = expAux();
			((ExpContext)_localctx).expValue =  ((ExpContext)_localctx).factor.factorValue + ((ExpContext)_localctx).expAux.expAuxValue;
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

	public static class ExpAuxContext extends ParserRuleContext {
		public String expAuxValue;
		public OpContext op;
		public ExpContext exp;
		public ExpAuxContext expAux2;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpAuxContext expAux() {
			return getRuleContext(ExpAuxContext.class,0);
		}
		public ExpAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterExpAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitExpAux(this);
		}
	}

	public final ExpAuxContext expAux() throws RecognitionException {
		ExpAuxContext _localctx = new ExpAuxContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expAux);
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				((ExpAuxContext)_localctx).op = op();
				setState(495);
				((ExpAuxContext)_localctx).exp = exp();
				setState(496);
				((ExpAuxContext)_localctx).expAux2 = expAux();
				((ExpAuxContext)_localctx).expAuxValue =  ((ExpAuxContext)_localctx).op.opValue + ((ExpAuxContext)_localctx).exp.expValue + ((ExpAuxContext)_localctx).expAux2.expAuxValue;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((ExpAuxContext)_localctx).expAuxValue =  "";
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

	public static class OpContext extends ParserRuleContext {
		public String opValue;
		public OparitContext oparit;
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			((OpContext)_localctx).oparit = oparit();
			((OpContext)_localctx).opValue =  ((OpContext)_localctx).oparit.oparitValue;
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

	public static class OparitContext extends ParserRuleContext {
		public String oparitValue;
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterOparit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitOparit(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_oparit);
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(T__32);
				((OparitContext)_localctx).oparitValue =  " + ";
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(T__33);
				((OparitContext)_localctx).oparitValue =  " - ";
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(T__34);
				((OparitContext)_localctx).oparitValue =  " * ";
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(T__35);
				((OparitContext)_localctx).oparitValue =  " / ";
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

	public static class ExpcondContext extends ParserRuleContext {
		public String expcondValue;
		public FactorcondContext factorcond;
		public ExpcondAuxContext expcondAux;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public ExpcondAuxContext expcondAux() {
			return getRuleContext(ExpcondAuxContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitExpcond(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			((ExpcondContext)_localctx).factorcond = factorcond();
			setState(516);
			((ExpcondContext)_localctx).expcondAux = expcondAux();
			((ExpcondContext)_localctx).expcondValue =  ((ExpcondContext)_localctx).factorcond.factorcondValue + ((ExpcondContext)_localctx).expcondAux.expcondAuxValue;
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

	public static class ExpcondAuxContext extends ParserRuleContext {
		public String expcondAuxValue;
		public OplogContext oplog;
		public ExpcondContext expcond;
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public ExpcondAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcondAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterExpcondAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitExpcondAux(this);
		}
	}

	public final ExpcondAuxContext expcondAux() throws RecognitionException {
		ExpcondAuxContext _localctx = new ExpcondAuxContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expcondAux);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				((ExpcondAuxContext)_localctx).oplog = oplog();
				setState(520);
				((ExpcondAuxContext)_localctx).expcond = expcond();
				((ExpcondAuxContext)_localctx).expcondAuxValue =  ((ExpcondAuxContext)_localctx).oplog.oplogValue + ((ExpcondAuxContext)_localctx).expcond.expcondValue;
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				((ExpcondAuxContext)_localctx).expcondAuxValue =  "";
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

	public static class OplogContext extends ParserRuleContext {
		public String oplogValue;
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitOplog(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_oplog);
		try {
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(T__36);
				((OplogContext)_localctx).oplogValue =  " || ";
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(T__37);
				((OplogContext)_localctx).oplogValue =  " && ";
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				match(T__38);
				((OplogContext)_localctx).oplogValue =  " !^ ";
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				match(T__39);
				((OplogContext)_localctx).oplogValue =  " ^ ";
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

	public static class FactorcondContext extends ParserRuleContext {
		public String factorcondValue;
		public ExpContext exp1;
		public OpcompContext opcomp;
		public ExpContext exp2;
		public ExpcondContext expcond;
		public FactorcondContext factorcond2;
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitFactorcond(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_factorcond);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				((FactorcondContext)_localctx).exp1 = exp();
				setState(537);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(538);
				((FactorcondContext)_localctx).exp2 = exp();
				((FactorcondContext)_localctx).factorcondValue =  ((FactorcondContext)_localctx).exp1.expValue + ((FactorcondContext)_localctx).opcomp.opcompValue + ((FactorcondContext)_localctx).exp2.expValue;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(T__13);
				setState(542);
				((FactorcondContext)_localctx).expcond = expcond();
				setState(543);
				match(T__14);
				((FactorcondContext)_localctx).factorcondValue =  "(" + ((FactorcondContext)_localctx).expcond.expcondValue + ")";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
				match(T__40);
				setState(547);
				((FactorcondContext)_localctx).factorcond2 = factorcond();
				((FactorcondContext)_localctx).factorcondValue =  "!" + ((FactorcondContext)_localctx).factorcond2.factorcondValue;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
				match(T__41);
				((FactorcondContext)_localctx).factorcondValue =  "true";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(552);
				match(T__42);
				((FactorcondContext)_localctx).factorcondValue =  "false";
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

	public static class OpcompContext extends ParserRuleContext {
		public String opcompValue;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitOpcomp(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_opcomp);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(T__43);
				((OpcompContext)_localctx).opcompValue =  " < ";
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(T__44);
				((OpcompContext)_localctx).opcompValue =  " > ";
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				match(T__45);
				((OpcompContext)_localctx).opcompValue =  " <= ";
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
				match(T__46);
				((OpcompContext)_localctx).opcompValue =  " >= ";
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 5);
				{
				setState(564);
				match(T__47);
				((OpcompContext)_localctx).opcompValue =  " == ";
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 6);
				{
				setState(566);
				match(T__48);
				((OpcompContext)_localctx).opcompValue =  " != ";
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

	public static class FactorContext extends ParserRuleContext {
		public String factorValue;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public Token IDENT;
		public Factor2Context factor2;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public Factor2Context factor2() {
			return getRuleContext(Factor2Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_factor);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				((FactorContext)_localctx).simpvalue = simpvalue();
				((FactorContext)_localctx).factorValue =  ((FactorContext)_localctx).simpvalue.simpvalueValue;
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(T__13);
				setState(574);
				((FactorContext)_localctx).exp = exp();
				setState(575);
				match(T__14);
				((FactorContext)_localctx).factorValue =  "(" + ((FactorContext)_localctx).exp.expValue + ")";
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(579);
				((FactorContext)_localctx).factor2 = factor2();
				((FactorContext)_localctx).factorValue =  (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null) + ((FactorContext)_localctx).factor2.factor2Value;
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

	public static class Factor2Context extends ParserRuleContext {
		public String factor2Value;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterFactor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitFactor2(this);
		}
	}

	public final Factor2Context factor2() throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_factor2);
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__6:
			case T__14:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				((Factor2Context)_localctx).factor2Value =  "";
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(T__13);
				setState(586);
				((Factor2Context)_localctx).exp = exp();
				setState(587);
				((Factor2Context)_localctx).explist = explist();
				setState(588);
				match(T__14);
				((Factor2Context)_localctx).factor2Value =  "(" + ((Factor2Context)_localctx).exp.expValue + ((Factor2Context)_localctx).explist.explistValue + ")";
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

	public static class ExplistContext extends ParserRuleContext {
		public String explistValue;
		public ExpContext exp;
		public ExplistContext explist2;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitExplist(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_explist);
		try {
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(T__6);
				setState(594);
				((ExplistContext)_localctx).exp = exp();
				setState(595);
				((ExplistContext)_localctx).explist2 = explist();
				((ExplistContext)_localctx).explistValue =  "," + ((ExplistContext)_localctx).exp.expValue + ((ExplistContext)_localctx).explist2.explistValue;
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				((ExplistContext)_localctx).explistValue =  "";
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

	public static class Proc_callContext extends ParserRuleContext {
		public String proc_callValue;
		public Token IDENT;
		public SubpparamlistContext subpparamlist;
		public TerminalNode IDENT() { return getToken(FortranToCParser.IDENT, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitProc_call(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(T__49);
			setState(602);
			((Proc_callContext)_localctx).IDENT = match(IDENT);
			setState(603);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist();
			((Proc_callContext)_localctx).proc_callValue =  (((Proc_callContext)_localctx).IDENT!=null?((Proc_callContext)_localctx).IDENT.getText():null) + " (" + ((Proc_callContext)_localctx).subpparamlist.subpparamlistValue + ") ;"; 
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

	public static class SubpparamlistContext extends ParserRuleContext {
		public String subpparamlistValue;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSubpparamlist(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_subpparamlist);
		try {
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(T__13);
				setState(607);
				((SubpparamlistContext)_localctx).exp = exp();
				setState(608);
				((SubpparamlistContext)_localctx).explist = explist();
				setState(609);
				match(T__14);
				((SubpparamlistContext)_localctx).subpparamlistValue =  ((SubpparamlistContext)_localctx).exp.expValue + ((SubpparamlistContext)_localctx).explist.explistValue;
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				((SubpparamlistContext)_localctx).subpparamlistValue =  "";
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

	public static class SubproglistContext extends ParserRuleContext {
		public CodprocContext codproc() {
			return getRuleContext(CodprocContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public CodfunContext codfun() {
			return getRuleContext(CodfunContext.class,0);
		}
		public SubproglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterSubproglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitSubproglist(this);
		}
	}

	public final SubproglistContext subproglist() throws RecognitionException {
		SubproglistContext _localctx = new SubproglistContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_subproglist);
		try {
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				codproc();
				setState(616);
				subproglist();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				codfun();
				setState(619);
				subproglist();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class CodprocContext extends ParserRuleContext {
		public Token IDENT;
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public CodprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCodproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCodproc(this);
		}
	}

	public final CodprocContext codproc() throws RecognitionException {
		CodprocContext _localctx = new CodprocContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_codproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(T__15);
			setState(625);
			((CodprocContext)_localctx).IDENT = match(IDENT);
			functionVarList = new ArrayList<>();
			setState(627);
			formal_paramlist();
			setState(628);
			dec_s_paramlist();
			sentencias.add("void " + (((CodprocContext)_localctx).IDENT!=null?((CodprocContext)_localctx).IDENT.getText():null) + " (" + varListToString(functionVarList) + ") {");
			setState(630);
			dcllist();
			setState(631);
			sent();
			setState(632);
			sentlist();
			setState(633);
			match(T__2);
			setState(634);
			match(T__15);
			setState(635);
			((CodprocContext)_localctx).IDENT = match(IDENT);
			sentencias.add("}");
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

	public static class CodfunContext extends ParserRuleContext {
		public Token IDENT;
		public TipoContext tipo;
		public ExpContext exp;
		public List<TerminalNode> IDENT() { return getTokens(FortranToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FortranToCParser.IDENT, i);
		}
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CodfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).enterCodfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortranToCListener ) ((FortranToCListener)listener).exitCodfun(this);
		}
	}

	public final CodfunContext codfun() throws RecognitionException {
		CodfunContext _localctx = new CodfunContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_codfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(T__20);
			setState(639);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(640);
			match(T__13);
			setState(641);
			nomparamlist();
			setState(642);
			match(T__14);
			setState(643);
			((CodfunContext)_localctx).tipo = tipo();
			setState(644);
			match(T__8);
			setState(645);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(646);
			match(T__1);
			functionVarList = new ArrayList<>();
			setState(648);
			dec_f_paramlist();
			sentencias.add(((CodfunContext)_localctx).tipo.tipoValue + " " + (((CodfunContext)_localctx).IDENT!=null?((CodfunContext)_localctx).IDENT.getText():null) + " (" + varListToString(functionVarList) + ") {");
			setState(650);
			dcllist();
			setState(651);
			sent();
			setState(652);
			sentlist();
			setState(653);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(654);
			match(T__9);
			setState(655);
			((CodfunContext)_localctx).exp = exp();
			sentencias.add("return " + ((CodfunContext)_localctx).exp.expValue);
			setState(657);
			match(T__1);
			setState(658);
			match(T__2);
			setState(659);
			match(T__20);
			setState(660);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			sentencias.add("}");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u029a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0081\n\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0094\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u009d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00ab\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b4\n\b\3\t"+
		"\3\t\3\t\3\t\5\t\u00ba\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00cf\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00de\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00e7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00f1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00ff\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0109\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0110\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\5\23\u011a\n\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0121\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0131\n\26\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0139\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0147"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014f\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016c\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u018c\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0195\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u019f\n\37\3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01b6\n \3!\3!\3!"+
		"\3!\5!\u01bc\n!\3\"\3\"\3\"\5\"\u01c1\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\5#\u01cd\n#\3$\3$\3$\3$\3$\3$\3$\5$\u01d6\n$\3%\3%\3%\3%\3%\5%\u01dd"+
		"\n%\3&\3&\3&\3&\5&\u01e3\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01eb\n\'\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\5)\u01f7\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\5+\u0204\n+\3,\3,\3,\3,\3-\3-\3-\3-\3-\5-\u020f\n-\3.\3.\3.\3.\3.\3"+
		".\3.\3.\5.\u0219\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\5/\u022d\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u023b\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u0249\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0252"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u025a\n\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0268\n\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u0271\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\2\29\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2"+
		"\2\2\u02a4\2\u0080\3\2\2\2\4\u0082\3\2\2\2\6\u0093\3\2\2\2\b\u009c\3\2"+
		"\2\2\n\u009e\3\2\2\2\f\u00aa\3\2\2\2\16\u00b3\3\2\2\2\20\u00b9\3\2\2\2"+
		"\22\u00bb\3\2\2\2\24\u00ce\3\2\2\2\26\u00dd\3\2\2\2\30\u00e6\3\2\2\2\32"+
		"\u00f0\3\2\2\2\34\u00fe\3\2\2\2\36\u0108\3\2\2\2 \u010f\3\2\2\2\"\u0111"+
		"\3\2\2\2$\u0119\3\2\2\2&\u0120\3\2\2\2(\u0122\3\2\2\2*\u0130\3\2\2\2,"+
		"\u0132\3\2\2\2.\u0138\3\2\2\2\60\u0146\3\2\2\2\62\u014e\3\2\2\2\64\u0150"+
		"\3\2\2\2\66\u016b\3\2\2\28\u018b\3\2\2\2:\u0194\3\2\2\2<\u019e\3\2\2\2"+
		">\u01b5\3\2\2\2@\u01bb\3\2\2\2B\u01c0\3\2\2\2D\u01cc\3\2\2\2F\u01d5\3"+
		"\2\2\2H\u01dc\3\2\2\2J\u01e2\3\2\2\2L\u01ea\3\2\2\2N\u01ec\3\2\2\2P\u01f6"+
		"\3\2\2\2R\u01f8\3\2\2\2T\u0203\3\2\2\2V\u0205\3\2\2\2X\u020e\3\2\2\2Z"+
		"\u0218\3\2\2\2\\\u022c\3\2\2\2^\u023a\3\2\2\2`\u0248\3\2\2\2b\u0251\3"+
		"\2\2\2d\u0259\3\2\2\2f\u025b\3\2\2\2h\u0267\3\2\2\2j\u0270\3\2\2\2l\u0272"+
		"\3\2\2\2n\u0280\3\2\2\2p\u0081\5\4\3\2qr\7\3\2\2rs\7\65\2\2st\7\4\2\2"+
		"tu\5\6\4\2uv\5\b\5\2vw\b\2\1\2wx\58\35\2xy\5\20\t\2yz\7\5\2\2z{\7\3\2"+
		"\2{|\b\2\1\2|}\7\65\2\2}~\5j\66\2~\177\b\2\1\2\177\u0081\3\2\2\2\u0080"+
		"p\3\2\2\2\u0080q\3\2\2\2\u0081\3\3\2\2\2\u0082\u0083\7\6\2\2\u0083\u0084"+
		"\7\65\2\2\u0084\u0085\7\4\2\2\u0085\u0086\5\6\4\2\u0086\u0087\5\b\5\2"+
		"\u0087\u0088\58\35\2\u0088\u0089\5\20\t\2\u0089\u008a\7\5\2\2\u008a\u008b"+
		"\7\6\2\2\u008b\u008c\7\65\2\2\u008c\u008d\5j\66\2\u008d\u008e\b\3\1\2"+
		"\u008e\5\3\2\2\2\u008f\u0090\5\22\n\2\u0090\u0091\5\6\4\2\u0091\u0094"+
		"\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\7\3\2\2\2\u0095\u009d\5\n\6\2\u0096\u0097\7\7\2\2\u0097\u0098\5\f\7\2"+
		"\u0098\u0099\7\5\2\2\u0099\u009a\7\7\2\2\u009a\u009d\3\2\2\2\u009b\u009d"+
		"\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\t\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\5\f\7\2\u00a0\u00a1\7\5\2\2"+
		"\u00a1\u00a2\7\b\2\2\u00a2\u00a3\b\6\1\2\u00a3\13\3\2\2\2\u00a4\u00a5"+
		"\5(\25\2\u00a5\u00a6\5\16\b\2\u00a6\u00ab\3\2\2\2\u00a7\u00a8\5\64\33"+
		"\2\u00a8\u00a9\5\16\b\2\u00a9\u00ab\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00ab\r\3\2\2\2\u00ac\u00ad\5(\25\2\u00ad\u00ae\5\16\b"+
		"\2\u00ae\u00b4\3\2\2\2\u00af\u00b0\5\64\33\2\u00b0\u00b1\5\16\b\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00af\3\2"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b4\17\3\2\2\2\u00b5\u00b6\58\35\2\u00b6\u00b7"+
		"\5\20\t\2\u00b7\u00ba\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba\21\3\2\2\2\u00bb\u00bc\5\36\20\2\u00bc\u00bd"+
		"\5\24\13\2\u00bd\23\3\2\2\2\u00be\u00bf\7\t\2\2\u00bf\u00c0\7\n\2\2\u00c0"+
		"\u00c1\7\13\2\2\u00c1\u00c2\7\65\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\5"+
		"\34\17\2\u00c4\u00c5\b\13\1\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7\4\2"+
		"\2\u00c7\u00c8\5\26\f\2\u00c8\u00cf\3\2\2\2\u00c9\u00ca\7\13\2\2\u00ca"+
		"\u00cb\5\"\22\2\u00cb\u00cc\7\4\2\2\u00cc\u00cd\5\30\r\2\u00cd\u00cf\3"+
		"\2\2\2\u00ce\u00be\3\2\2\2\u00ce\u00c9\3\2\2\2\u00cf\25\3\2\2\2\u00d0"+
		"\u00d1\5\36\20\2\u00d1\u00d2\7\t\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00d4\7"+
		"\13\2\2\u00d4\u00d5\7\65\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\5\34\17\2"+
		"\u00d7\u00d8\b\f\1\2\u00d8\u00d9\5\32\16\2\u00d9\u00da\7\4\2\2\u00da\u00db"+
		"\5\26\f\2\u00db\u00de\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d0\3\2\2\2"+
		"\u00dd\u00dc\3\2\2\2\u00de\27\3\2\2\2\u00df\u00e0\5\36\20\2\u00e0\u00e1"+
		"\7\13\2\2\u00e1\u00e2\5\"\22\2\u00e2\u00e3\7\4\2\2\u00e3\u00e4\5\30\r"+
		"\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\31\3\2\2\2\u00e8\u00e9\7\t\2\2\u00e9\u00ea\7\65\2\2\u00ea"+
		"\u00eb\7\f\2\2\u00eb\u00ec\5\34\17\2\u00ec\u00ed\b\16\1\2\u00ed\u00ee"+
		"\5\32\16\2\u00ee\u00f1\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00e8\3\2\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\33\3\2\2\2\u00f2\u00f3\79\2\2\u00f3\u00ff\b"+
		"\17\1\2\u00f4\u00f5\7:\2\2\u00f5\u00ff\b\17\1\2\u00f6\u00f7\7;\2\2\u00f7"+
		"\u00ff\b\17\1\2\u00f8\u00f9\7\66\2\2\u00f9\u00ff\b\17\1\2\u00fa\u00fb"+
		"\7\67\2\2\u00fb\u00ff\b\17\1\2\u00fc\u00fd\78\2\2\u00fd\u00ff\b\17\1\2"+
		"\u00fe\u00f2\3\2\2\2\u00fe\u00f4\3\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00f8"+
		"\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\35\3\2\2\2\u0100"+
		"\u0101\7\r\2\2\u0101\u0109\b\20\1\2\u0102\u0103\7\16\2\2\u0103\u0109\b"+
		"\20\1\2\u0104\u0105\7\17\2\2\u0105\u0106\5 \21\2\u0106\u0107\b\20\1\2"+
		"\u0107\u0109\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0104"+
		"\3\2\2\2\u0109\37\3\2\2\2\u010a\u010b\7\20\2\2\u010b\u010c\79\2\2\u010c"+
		"\u010d\7\21\2\2\u010d\u0110\b\21\1\2\u010e\u0110\b\21\1\2\u010f\u010a"+
		"\3\2\2\2\u010f\u010e\3\2\2\2\u0110!\3\2\2\2\u0111\u0112\7\65\2\2\u0112"+
		"\u0113\5&\24\2\u0113\u0114\b\22\1\2\u0114\u0115\5$\23\2\u0115#\3\2\2\2"+
		"\u0116\u011a\3\2\2\2\u0117\u0118\7\t\2\2\u0118\u011a\5\"\22\2\u0119\u0116"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u011a%\3\2\2\2\u011b\u011c\7\f\2\2\u011c"+
		"\u011d\5\34\17\2\u011d\u011e\b\24\1\2\u011e\u0121\3\2\2\2\u011f\u0121"+
		"\b\24\1\2\u0120\u011b\3\2\2\2\u0120\u011f\3\2\2\2\u0121\'\3\2\2\2\u0122"+
		"\u0123\7\22\2\2\u0123\u0124\7\65\2\2\u0124\u0125\5*\26\2\u0125\u0126\5"+
		"\60\31\2\u0126\u0127\7\5\2\2\u0127\u0128\7\22\2\2\u0128\u0129\7\65\2\2"+
		"\u0129\u012a\b\25\1\2\u012a)\3\2\2\2\u012b\u0131\3\2\2\2\u012c\u012d\7"+
		"\20\2\2\u012d\u012e\5,\27\2\u012e\u012f\7\21\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012b\3\2\2\2\u0130\u012c\3\2\2\2\u0131+\3\2\2\2\u0132\u0133\7\65\2\2"+
		"\u0133\u0134\5.\30\2\u0134-\3\2\2\2\u0135\u0139\3\2\2\2\u0136\u0137\7"+
		"\t\2\2\u0137\u0139\5,\27\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"/\3\2\2\2\u013a\u013b\5\36\20\2\u013b\u013c\7\t\2\2\u013c\u013d\7\23\2"+
		"\2\u013d\u013e\7\20\2\2\u013e\u013f\5\62\32\2\u013f\u0140\7\21\2\2\u0140"+
		"\u0141\7\65\2\2\u0141\u0142\7\4\2\2\u0142\u0143\b\31\1\2\u0143\u0144\5"+
		"\60\31\2\u0144\u0147\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u013a\3\2\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\61\3\2\2\2\u0148\u0149\7\24\2\2\u0149\u014f\b\32"+
		"\1\2\u014a\u014b\7\25\2\2\u014b\u014f\b\32\1\2\u014c\u014d\7\26\2\2\u014d"+
		"\u014f\b\32\1\2\u014e\u0148\3\2\2\2\u014e\u014a\3\2\2\2\u014e\u014c\3"+
		"\2\2\2\u014f\63\3\2\2\2\u0150\u0151\7\27\2\2\u0151\u0152\7\65\2\2\u0152"+
		"\u0153\7\20\2\2\u0153\u0154\5,\27\2\u0154\u0155\7\21\2\2\u0155\u0156\5"+
		"\36\20\2\u0156\u0157\7\13\2\2\u0157\u0158\7\65\2\2\u0158\u0159\7\4\2\2"+
		"\u0159\u015a\5\66\34\2\u015a\u015b\b\33\1\2\u015b\u015c\7\5\2\2\u015c"+
		"\u015d\7\27\2\2\u015d\u015e\7\65\2\2\u015e\65\3\2\2\2\u015f\u0160\5\36"+
		"\20\2\u0160\u0161\7\t\2\2\u0161\u0162\7\23\2\2\u0162\u0163\7\20\2\2\u0163"+
		"\u0164\7\24\2\2\u0164\u0165\7\21\2\2\u0165\u0166\7\65\2\2\u0166\u0167"+
		"\7\4\2\2\u0167\u0168\b\34\1\2\u0168\u0169\5\66\34\2\u0169\u016c\3\2\2"+
		"\2\u016a\u016c\3\2\2\2\u016b\u015f\3\2\2\2\u016b\u016a\3\2\2\2\u016c\67"+
		"\3\2\2\2\u016d\u016e\7\65\2\2\u016e\u016f\7\f\2\2\u016f\u0170\5N(\2\u0170"+
		"\u0171\7\4\2\2\u0171\u0172\b\35\1\2\u0172\u018c\3\2\2\2\u0173\u0174\5"+
		"f\64\2\u0174\u0175\7\4\2\2\u0175\u0176\b\35\1\2\u0176\u018c\3\2\2\2\u0177"+
		"\u0178\7\30\2\2\u0178\u0179\7\20\2\2\u0179\u017a\5V,\2\u017a\u017b\b\35"+
		"\1\2\u017b\u017c\7\21\2\2\u017c\u017d\5:\36\2\u017d\u018c\3\2\2\2\u017e"+
		"\u017f\7\31\2\2\u017f\u018c\5> \2\u0180\u0181\7\32\2\2\u0181\u0182\7\33"+
		"\2\2\u0182\u0183\7\20\2\2\u0183\u0184\5N(\2\u0184\u0185\7\21\2\2\u0185"+
		"\u0186\b\35\1\2\u0186\u0187\5B\"\2\u0187\u0188\7\5\2\2\u0188\u0189\7\32"+
		"\2\2\u0189\u018a\b\35\1\2\u018a\u018c\3\2\2\2\u018b\u016d\3\2\2\2\u018b"+
		"\u0173\3\2\2\2\u018b\u0177\3\2\2\2\u018b\u017e\3\2\2\2\u018b\u0180\3\2"+
		"\2\2\u018c9\3\2\2\2\u018d\u018e\58\35\2\u018e\u018f\b\36\1\2\u018f\u0195"+
		"\3\2\2\2\u0190\u0191\7\34\2\2\u0191\u0192\5\20\t\2\u0192\u0193\5<\37\2"+
		"\u0193\u0195\3\2\2\2\u0194\u018d\3\2\2\2\u0194\u0190\3\2\2\2\u0195;\3"+
		"\2\2\2\u0196\u0197\7\35\2\2\u0197\u019f\b\37\1\2\u0198\u0199\b\37\1\2"+
		"\u0199\u019a\7\36\2\2\u019a\u019b\5\20\t\2\u019b\u019c\7\35\2\2\u019c"+
		"\u019d\b\37\1\2\u019d\u019f\3\2\2\2\u019e\u0196\3\2\2\2\u019e\u0198\3"+
		"\2\2\2\u019f=\3\2\2\2\u01a0\u01a1\7\37\2\2\u01a1\u01a2\7\20\2\2\u01a2"+
		"\u01a3\5V,\2\u01a3\u01a4\7\21\2\2\u01a4\u01a5\b \1\2\u01a5\u01a6\5\20"+
		"\t\2\u01a6\u01a7\7 \2\2\u01a7\u01a8\b \1\2\u01a8\u01b6\3\2\2\2\u01a9\u01aa"+
		"\7\65\2\2\u01aa\u01ab\7\f\2\2\u01ab\u01ac\5@!\2\u01ac\u01ad\7\t\2\2\u01ad"+
		"\u01ae\5@!\2\u01ae\u01af\7\t\2\2\u01af\u01b0\5@!\2\u01b0\u01b1\b \1\2"+
		"\u01b1\u01b2\5\20\t\2\u01b2\u01b3\7 \2\2\u01b3\u01b4\b \1\2\u01b4\u01b6"+
		"\3\2\2\2\u01b5\u01a0\3\2\2\2\u01b5\u01a9\3\2\2\2\u01b6?\3\2\2\2\u01b7"+
		"\u01b8\79\2\2\u01b8\u01bc\b!\1\2\u01b9\u01ba\7\65\2\2\u01ba\u01bc\b!\1"+
		"\2\u01bb\u01b7\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bcA\3\2\2\2\u01bd\u01be"+
		"\7\33\2\2\u01be\u01c1\5D#\2\u01bf\u01c1\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c0"+
		"\u01bf\3\2\2\2\u01c1C\3\2\2\2\u01c2\u01c3\7\20\2\2\u01c3\u01c4\5F$\2\u01c4"+
		"\u01c5\7\21\2\2\u01c5\u01c6\5\20\t\2\u01c6\u01c7\b#\1\2\u01c7\u01c8\5"+
		"B\"\2\u01c8\u01cd\3\2\2\2\u01c9\u01ca\7!\2\2\u01ca\u01cb\b#\1\2\u01cb"+
		"\u01cd\5\20\t\2\u01cc\u01c2\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cdE\3\2\2\2"+
		"\u01ce\u01cf\5\34\17\2\u01cf\u01d0\5H%\2\u01d0\u01d6\3\2\2\2\u01d1\u01d2"+
		"\7\"\2\2\u01d2\u01d3\5\34\17\2\u01d3\u01d4\b$\1\2\u01d4\u01d6\3\2\2\2"+
		"\u01d5\u01ce\3\2\2\2\u01d5\u01d1\3\2\2\2\u01d6G\3\2\2\2\u01d7\u01d8\5"+
		"L\'\2\u01d8\u01d9\b%\1\2\u01d9\u01dd\3\2\2\2\u01da\u01db\7\"\2\2\u01db"+
		"\u01dd\5J&\2\u01dc\u01d7\3\2\2\2\u01dc\u01da\3\2\2\2\u01ddI\3\2\2\2\u01de"+
		"\u01df\5\34\17\2\u01df\u01e0\b&\1\2\u01e0\u01e3\3\2\2\2\u01e1\u01e3\b"+
		"&\1\2\u01e2\u01de\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3K\3\2\2\2\u01e4\u01e5"+
		"\7\t\2\2\u01e5\u01e6\5\34\17\2\u01e6\u01e7\b\'\1\2\u01e7\u01e8\5L\'\2"+
		"\u01e8\u01eb\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea\u01e9"+
		"\3\2\2\2\u01ebM\3\2\2\2\u01ec\u01ed\5`\61\2\u01ed\u01ee\5P)\2\u01ee\u01ef"+
		"\b(\1\2\u01efO\3\2\2\2\u01f0\u01f1\5R*\2\u01f1\u01f2\5N(\2\u01f2\u01f3"+
		"\5P)\2\u01f3\u01f4\b)\1\2\u01f4\u01f7\3\2\2\2\u01f5\u01f7\b)\1\2\u01f6"+
		"\u01f0\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7Q\3\2\2\2\u01f8\u01f9\5T+\2\u01f9"+
		"\u01fa\b*\1\2\u01faS\3\2\2\2\u01fb\u01fc\7#\2\2\u01fc\u0204\b+\1\2\u01fd"+
		"\u01fe\7$\2\2\u01fe\u0204\b+\1\2\u01ff\u0200\7%\2\2\u0200\u0204\b+\1\2"+
		"\u0201\u0202\7&\2\2\u0202\u0204\b+\1\2\u0203\u01fb\3\2\2\2\u0203\u01fd"+
		"\3\2\2\2\u0203\u01ff\3\2\2\2\u0203\u0201\3\2\2\2\u0204U\3\2\2\2\u0205"+
		"\u0206\5\\/\2\u0206\u0207\5X-\2\u0207\u0208\b,\1\2\u0208W\3\2\2\2\u0209"+
		"\u020a\5Z.\2\u020a\u020b\5V,\2\u020b\u020c\b-\1\2\u020c\u020f\3\2\2\2"+
		"\u020d\u020f\b-\1\2\u020e\u0209\3\2\2\2\u020e\u020d\3\2\2\2\u020fY\3\2"+
		"\2\2\u0210\u0211\7\'\2\2\u0211\u0219\b.\1\2\u0212\u0213\7(\2\2\u0213\u0219"+
		"\b.\1\2\u0214\u0215\7)\2\2\u0215\u0219\b.\1\2\u0216\u0217\7*\2\2\u0217"+
		"\u0219\b.\1\2\u0218\u0210\3\2\2\2\u0218\u0212\3\2\2\2\u0218\u0214\3\2"+
		"\2\2\u0218\u0216\3\2\2\2\u0219[\3\2\2\2\u021a\u021b\5N(\2\u021b\u021c"+
		"\5^\60\2\u021c\u021d\5N(\2\u021d\u021e\b/\1\2\u021e\u022d\3\2\2\2\u021f"+
		"\u0220\7\20\2\2\u0220\u0221\5V,\2\u0221\u0222\7\21\2\2\u0222\u0223\b/"+
		"\1\2\u0223\u022d\3\2\2\2\u0224\u0225\7+\2\2\u0225\u0226\5\\/\2\u0226\u0227"+
		"\b/\1\2\u0227\u022d\3\2\2\2\u0228\u0229\7,\2\2\u0229\u022d\b/\1\2\u022a"+
		"\u022b\7-\2\2\u022b\u022d\b/\1\2\u022c\u021a\3\2\2\2\u022c\u021f\3\2\2"+
		"\2\u022c\u0224\3\2\2\2\u022c\u0228\3\2\2\2\u022c\u022a\3\2\2\2\u022d]"+
		"\3\2\2\2\u022e\u022f\7.\2\2\u022f\u023b\b\60\1\2\u0230\u0231\7/\2\2\u0231"+
		"\u023b\b\60\1\2\u0232\u0233\7\60\2\2\u0233\u023b\b\60\1\2\u0234\u0235"+
		"\7\61\2\2\u0235\u023b\b\60\1\2\u0236\u0237\7\62\2\2\u0237\u023b\b\60\1"+
		"\2\u0238\u0239\7\63\2\2\u0239\u023b\b\60\1\2\u023a\u022e\3\2\2\2\u023a"+
		"\u0230\3\2\2\2\u023a\u0232\3\2\2\2\u023a\u0234\3\2\2\2\u023a\u0236\3\2"+
		"\2\2\u023a\u0238\3\2\2\2\u023b_\3\2\2\2\u023c\u023d\5\34\17\2\u023d\u023e"+
		"\b\61\1\2\u023e\u0249\3\2\2\2\u023f\u0240\7\20\2\2\u0240\u0241\5N(\2\u0241"+
		"\u0242\7\21\2\2\u0242\u0243\b\61\1\2\u0243\u0249\3\2\2\2\u0244\u0245\7"+
		"\65\2\2\u0245\u0246\5b\62\2\u0246\u0247\b\61\1\2\u0247\u0249\3\2\2\2\u0248"+
		"\u023c\3\2\2\2\u0248\u023f\3\2\2\2\u0248\u0244\3\2\2\2\u0249a\3\2\2\2"+
		"\u024a\u0252\b\62\1\2\u024b\u024c\7\20\2\2\u024c\u024d\5N(\2\u024d\u024e"+
		"\5d\63\2\u024e\u024f\7\21\2\2\u024f\u0250\b\62\1\2\u0250\u0252\3\2\2\2"+
		"\u0251\u024a\3\2\2\2\u0251\u024b\3\2\2\2\u0252c\3\2\2\2\u0253\u0254\7"+
		"\t\2\2\u0254\u0255\5N(\2\u0255\u0256\5d\63\2\u0256\u0257\b\63\1\2\u0257"+
		"\u025a\3\2\2\2\u0258\u025a\b\63\1\2\u0259\u0253\3\2\2\2\u0259\u0258\3"+
		"\2\2\2\u025ae\3\2\2\2\u025b\u025c\7\64\2\2\u025c\u025d\7\65\2\2\u025d"+
		"\u025e\5h\65\2\u025e\u025f\b\64\1\2\u025fg\3\2\2\2\u0260\u0261\7\20\2"+
		"\2\u0261\u0262\5N(\2\u0262\u0263\5d\63\2\u0263\u0264\7\21\2\2\u0264\u0265"+
		"\b\65\1\2\u0265\u0268\3\2\2\2\u0266\u0268\b\65\1\2\u0267\u0260\3\2\2\2"+
		"\u0267\u0266\3\2\2\2\u0268i\3\2\2\2\u0269\u026a\5l\67\2\u026a\u026b\5"+
		"j\66\2\u026b\u0271\3\2\2\2\u026c\u026d\5n8\2\u026d\u026e\5j\66\2\u026e"+
		"\u0271\3\2\2\2\u026f\u0271\3\2\2\2\u0270\u0269\3\2\2\2\u0270\u026c\3\2"+
		"\2\2\u0270\u026f\3\2\2\2\u0271k\3\2\2\2\u0272\u0273\7\22\2\2\u0273\u0274"+
		"\7\65\2\2\u0274\u0275\b\67\1\2\u0275\u0276\5*\26\2\u0276\u0277\5\60\31"+
		"\2\u0277\u0278\b\67\1\2\u0278\u0279\5\6\4\2\u0279\u027a\58\35\2\u027a"+
		"\u027b\5\20\t\2\u027b\u027c\7\5\2\2\u027c\u027d\7\22\2\2\u027d\u027e\7"+
		"\65\2\2\u027e\u027f\b\67\1\2\u027fm\3\2\2\2\u0280\u0281\7\27\2\2\u0281"+
		"\u0282\7\65\2\2\u0282\u0283\7\20\2\2\u0283\u0284\5,\27\2\u0284\u0285\7"+
		"\21\2\2\u0285\u0286\5\36\20\2\u0286\u0287\7\13\2\2\u0287\u0288\7\65\2"+
		"\2\u0288\u0289\7\4\2\2\u0289\u028a\b8\1\2\u028a\u028b\5\66\34\2\u028b"+
		"\u028c\b8\1\2\u028c\u028d\5\6\4\2\u028d\u028e\58\35\2\u028e\u028f\5\20"+
		"\t\2\u028f\u0290\7\65\2\2\u0290\u0291\7\f\2\2\u0291\u0292\5N(\2\u0292"+
		"\u0293\b8\1\2\u0293\u0294\7\4\2\2\u0294\u0295\7\5\2\2\u0295\u0296\7\27"+
		"\2\2\u0296\u0297\7\65\2\2\u0297\u0298\b8\1\2\u0298o\3\2\2\2,\u0080\u0093"+
		"\u009c\u00aa\u00b3\u00b9\u00ce\u00dd\u00e6\u00f0\u00fe\u0108\u010f\u0119"+
		"\u0120\u0130\u0138\u0146\u014e\u016b\u018b\u0194\u019e\u01b5\u01bb\u01c0"+
		"\u01cc\u01d5\u01dc\u01e2\u01ea\u01f6\u0203\u020e\u0218\u022c\u023a\u0248"+
		"\u0251\u0259\u0267\u0270";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}