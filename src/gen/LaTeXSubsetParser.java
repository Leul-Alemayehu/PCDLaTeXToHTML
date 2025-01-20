package gen;// Generated from C:/Users/leula/IdeaProjects/PCDLaTeXToHTML/src/LaTeXSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LaTeXSubsetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, BEGIN_itemize=48, END_itemize=49, BEGIN_enumerate=50, 
		END_enumerate=51, BEGIN_description=52, END_description=53, BEGIN_tabular=54, 
		END_tabular=55, BEGIN_center=56, END_center=57, BEGIN_quote=58, END_quote=59, 
		BEGIN_document=60, END_document=61, HLINE=62, MATH_CMD=63, ESCAPE_SEQ_MATH=64, 
		CLASS=65, TAB_COL_SPEC=66, TAB_ROW_SEP=67, ESCAPE_SEQ=68, COMMENT=69, 
		WS=70, TEXT=71, NUMBER=72;
	public static final int
		RULE_latexDocument = 0, RULE_preamble = 1, RULE_documentclass = 2, RULE_usepackage = 3, 
		RULE_title = 4, RULE_author = 5, RULE_date = 6, RULE_otherCommand = 7, 
		RULE_document = 8, RULE_command = 9, RULE_format_command = 10, RULE_environment = 11, 
		RULE_description_item = 12, RULE_item = 13, RULE_nested_text = 14, RULE_table_content = 15, 
		RULE_math_inline = 16, RULE_math_display = 17, RULE_math_expr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"latexDocument", "preamble", "documentclass", "usepackage", "title", 
			"author", "date", "otherCommand", "document", "command", "format_command", 
			"environment", "description_item", "item", "nested_text", "table_content", 
			"math_inline", "math_display", "math_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\documentclass'", "'{'", "'}'", "'\\usepackage'", "'\\title'", 
			"'\\author'", "'\\date'", "'\\'", "'\\maketitle'", "'\\newline'", "'\\chapter'", 
			"'\\section'", "'\\subsection'", "'\\subsubsection'", "'\\paragraph'", 
			"'\\subparagraph'", "'\\textbf'", "'\\textit'", "'\\underline'", "'\\texttt'", 
			"'\\label'", "'\\ref'", "'\\include'", "'\\item'", "'['", "']'", "'&'", 
			"'$'", "'\\('", "'\\)'", "'\\begin{math}'", "'\\end{math}'", "'\\['", 
			"'\\]'", "'\\begin{equation}'", "'\\end{equation}'", "'\\begin{displaymath}'", 
			"'\\end{displaymath}'", "'+'", "'-'", "'*'", "'/'", "'^'", "'_'", "'\\frac'", 
			"'('", "')'", "'\\begin{itemize}'", "'\\end{itemize}'", "'\\begin{enumerate}'", 
			"'\\end{enumerate}'", "'\\begin{description}'", "'\\end{description}'", 
			"'\\begin{tabular}'", "'\\end{tabular}'", "'\\begin{center}'", "'\\end{center}'", 
			"'\\begin{quote}'", "'\\end{quote}'", "'\\begin{document}'", "'\\end{document}'", 
			"'\\hline'", null, null, null, null, "'\\\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"BEGIN_itemize", "END_itemize", "BEGIN_enumerate", "END_enumerate", "BEGIN_description", 
			"END_description", "BEGIN_tabular", "END_tabular", "BEGIN_center", "END_center", 
			"BEGIN_quote", "END_quote", "BEGIN_document", "END_document", "HLINE", 
			"MATH_CMD", "ESCAPE_SEQ_MATH", "CLASS", "TAB_COL_SPEC", "TAB_ROW_SEP", 
			"ESCAPE_SEQ", "COMMENT", "WS", "TEXT", "NUMBER"
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
	public String getGrammarFileName() { return "LaTeXSubset.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LaTeXSubsetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LatexDocumentContext extends ParserRuleContext {
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
		}
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LaTeXSubsetParser.EOF, 0); }
		public LatexDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latexDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterLatexDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitLatexDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitLatexDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatexDocumentContext latexDocument() throws RecognitionException {
		LatexDocumentContext _localctx = new LatexDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_latexDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			preamble();
			setState(39);
			document();
			setState(40);
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
	public static class PreambleContext extends ParserRuleContext {
		public List<DocumentclassContext> documentclass() {
			return getRuleContexts(DocumentclassContext.class);
		}
		public DocumentclassContext documentclass(int i) {
			return getRuleContext(DocumentclassContext.class,i);
		}
		public List<UsepackageContext> usepackage() {
			return getRuleContexts(UsepackageContext.class);
		}
		public UsepackageContext usepackage(int i) {
			return getRuleContext(UsepackageContext.class,i);
		}
		public List<TitleContext> title() {
			return getRuleContexts(TitleContext.class);
		}
		public TitleContext title(int i) {
			return getRuleContext(TitleContext.class,i);
		}
		public List<AuthorContext> author() {
			return getRuleContexts(AuthorContext.class);
		}
		public AuthorContext author(int i) {
			return getRuleContext(AuthorContext.class,i);
		}
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<OtherCommandContext> otherCommand() {
			return getRuleContexts(OtherCommandContext.class);
		}
		public OtherCommandContext otherCommand(int i) {
			return getRuleContext(OtherCommandContext.class,i);
		}
		public PreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterPreamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitPreamble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitPreamble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreambleContext preamble() throws RecognitionException {
		PreambleContext _localctx = new PreambleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 498L) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(42);
					documentclass();
					}
					break;
				case T__3:
					{
					setState(43);
					usepackage();
					}
					break;
				case T__4:
					{
					setState(44);
					title();
					}
					break;
				case T__5:
					{
					setState(45);
					author();
					}
					break;
				case T__6:
					{
					setState(46);
					date();
					}
					break;
				case T__7:
					{
					setState(47);
					otherCommand();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52);
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
	public static class DocumentclassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(LaTeXSubsetParser.CLASS, 0); }
		public DocumentclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterDocumentclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitDocumentclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitDocumentclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentclassContext documentclass() throws RecognitionException {
		DocumentclassContext _localctx = new DocumentclassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_documentclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(54);
			match(T__1);
			setState(55);
			match(CLASS);
			setState(56);
			match(T__2);
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
	public static class UsepackageContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(LaTeXSubsetParser.TEXT, 0); }
		public UsepackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usepackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterUsepackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitUsepackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitUsepackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsepackageContext usepackage() throws RecognitionException {
		UsepackageContext _localctx = new UsepackageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_usepackage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__3);
			setState(59);
			match(T__1);
			setState(60);
			match(TEXT);
			setState(61);
			match(T__2);
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
	public static class TitleContext extends ParserRuleContext {
		public Nested_textContext nested_text() {
			return getRuleContext(Nested_textContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__4);
			setState(64);
			match(T__1);
			setState(65);
			nested_text();
			setState(66);
			match(T__2);
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
	public static class AuthorContext extends ParserRuleContext {
		public Nested_textContext nested_text() {
			return getRuleContext(Nested_textContext.class,0);
		}
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterAuthor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitAuthor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitAuthor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_author);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__5);
			setState(69);
			match(T__1);
			setState(70);
			nested_text();
			setState(71);
			match(T__2);
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
	public static class DateContext extends ParserRuleContext {
		public Nested_textContext nested_text() {
			return getRuleContext(Nested_textContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__6);
			setState(74);
			match(T__1);
			setState(75);
			nested_text();
			setState(76);
			match(T__2);
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
	public static class OtherCommandContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(LaTeXSubsetParser.TEXT, 0); }
		public List<Nested_textContext> nested_text() {
			return getRuleContexts(Nested_textContext.class);
		}
		public Nested_textContext nested_text(int i) {
			return getRuleContext(Nested_textContext.class,i);
		}
		public OtherCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterOtherCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitOtherCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitOtherCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherCommandContext otherCommand() throws RecognitionException {
		OtherCommandContext _localctx = new OtherCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_otherCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__7);
			setState(79);
			match(TEXT);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(80);
				match(T__1);
				setState(81);
				nested_text();
				setState(82);
				match(T__2);
				}
				}
				setState(88);
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
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode BEGIN_document() { return getToken(LaTeXSubsetParser.BEGIN_document, 0); }
		public TerminalNode END_document() { return getToken(LaTeXSubsetParser.END_document, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<EnvironmentContext> environment() {
			return getRuleContexts(EnvironmentContext.class);
		}
		public EnvironmentContext environment(int i) {
			return getRuleContext(EnvironmentContext.class,i);
		}
		public List<Math_inlineContext> math_inline() {
			return getRuleContexts(Math_inlineContext.class);
		}
		public Math_inlineContext math_inline(int i) {
			return getRuleContext(Math_inlineContext.class,i);
		}
		public List<Math_displayContext> math_display() {
			return getRuleContexts(Math_displayContext.class);
		}
		public Math_displayContext math_display(int i) {
			return getRuleContext(Math_displayContext.class,i);
		}
		public List<Nested_textContext> nested_text() {
			return getRuleContexts(Nested_textContext.class);
		}
		public Nested_textContext nested_text(int i) {
			return getRuleContext(Nested_textContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(BEGIN_document);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(90);
					command();
					}
					break;
				case 2:
					{
					setState(91);
					environment();
					}
					break;
				case 3:
					{
					setState(92);
					math_inline();
					}
					break;
				case 4:
					{
					setState(93);
					math_display();
					}
					break;
				case 5:
					{
					setState(94);
					nested_text();
					}
					break;
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4995899545129844228L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 19L) != 0) );
			setState(99);
			match(END_document);
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
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode HLINE() { return getToken(LaTeXSubsetParser.HLINE, 0); }
		public Nested_textContext nested_text() {
			return getRuleContext(Nested_textContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(LaTeXSubsetParser.TEXT, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_command);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__9);
				}
				break;
			case HLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(HLINE);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(T__10);
				setState(105);
				match(T__1);
				setState(106);
				nested_text();
				setState(107);
				match(T__2);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(T__11);
				setState(110);
				match(T__1);
				setState(111);
				nested_text();
				setState(112);
				match(T__2);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(T__12);
				setState(115);
				match(T__1);
				setState(116);
				nested_text();
				setState(117);
				match(T__2);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				match(T__13);
				setState(120);
				match(T__1);
				setState(121);
				nested_text();
				setState(122);
				match(T__2);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				match(T__14);
				setState(125);
				match(T__1);
				setState(126);
				nested_text();
				setState(127);
				match(T__2);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				match(T__15);
				setState(130);
				match(T__1);
				setState(131);
				nested_text();
				setState(132);
				match(T__2);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 10);
				{
				setState(134);
				match(T__16);
				setState(135);
				match(T__1);
				setState(136);
				nested_text();
				setState(137);
				match(T__2);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 11);
				{
				setState(139);
				match(T__17);
				setState(140);
				match(T__1);
				setState(141);
				nested_text();
				setState(142);
				match(T__2);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 12);
				{
				setState(144);
				match(T__18);
				setState(145);
				match(T__1);
				setState(146);
				nested_text();
				setState(147);
				match(T__2);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 13);
				{
				setState(149);
				match(T__19);
				setState(150);
				match(T__1);
				setState(151);
				nested_text();
				setState(152);
				match(T__2);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 14);
				{
				setState(154);
				match(T__20);
				setState(155);
				match(T__1);
				setState(156);
				match(TEXT);
				setState(157);
				match(T__2);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 15);
				{
				setState(158);
				match(T__21);
				setState(159);
				match(T__1);
				setState(160);
				match(TEXT);
				setState(161);
				match(T__2);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 16);
				{
				setState(162);
				match(T__22);
				setState(163);
				match(T__1);
				setState(164);
				match(TEXT);
				setState(165);
				match(T__2);
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
	public static class Format_commandContext extends ParserRuleContext {
		public Nested_textContext nested_text() {
			return getRuleContext(Nested_textContext.class,0);
		}
		public Format_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterFormat_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitFormat_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitFormat_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Format_commandContext format_command() throws RecognitionException {
		Format_commandContext _localctx = new Format_commandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_format_command);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__16);
				setState(169);
				match(T__1);
				setState(170);
				nested_text();
				setState(171);
				match(T__2);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__17);
				setState(174);
				match(T__1);
				setState(175);
				nested_text();
				setState(176);
				match(T__2);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(T__18);
				setState(179);
				match(T__1);
				setState(180);
				nested_text();
				setState(181);
				match(T__2);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(T__19);
				setState(184);
				match(T__1);
				setState(185);
				nested_text();
				setState(186);
				match(T__2);
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
	public static class EnvironmentContext extends ParserRuleContext {
		public TerminalNode BEGIN_itemize() { return getToken(LaTeXSubsetParser.BEGIN_itemize, 0); }
		public TerminalNode END_itemize() { return getToken(LaTeXSubsetParser.END_itemize, 0); }
		public List<TerminalNode> TEXT() { return getTokens(LaTeXSubsetParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(LaTeXSubsetParser.TEXT, i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public TerminalNode BEGIN_enumerate() { return getToken(LaTeXSubsetParser.BEGIN_enumerate, 0); }
		public TerminalNode END_enumerate() { return getToken(LaTeXSubsetParser.END_enumerate, 0); }
		public TerminalNode BEGIN_center() { return getToken(LaTeXSubsetParser.BEGIN_center, 0); }
		public TerminalNode END_center() { return getToken(LaTeXSubsetParser.END_center, 0); }
		public List<Nested_textContext> nested_text() {
			return getRuleContexts(Nested_textContext.class);
		}
		public Nested_textContext nested_text(int i) {
			return getRuleContext(Nested_textContext.class,i);
		}
		public List<EnvironmentContext> environment() {
			return getRuleContexts(EnvironmentContext.class);
		}
		public EnvironmentContext environment(int i) {
			return getRuleContext(EnvironmentContext.class,i);
		}
		public TerminalNode BEGIN_quote() { return getToken(LaTeXSubsetParser.BEGIN_quote, 0); }
		public TerminalNode END_quote() { return getToken(LaTeXSubsetParser.END_quote, 0); }
		public TerminalNode BEGIN_tabular() { return getToken(LaTeXSubsetParser.BEGIN_tabular, 0); }
		public TerminalNode TAB_COL_SPEC() { return getToken(LaTeXSubsetParser.TAB_COL_SPEC, 0); }
		public TerminalNode END_tabular() { return getToken(LaTeXSubsetParser.END_tabular, 0); }
		public List<Table_contentContext> table_content() {
			return getRuleContexts(Table_contentContext.class);
		}
		public Table_contentContext table_content(int i) {
			return getRuleContext(Table_contentContext.class,i);
		}
		public List<TerminalNode> TAB_ROW_SEP() { return getTokens(LaTeXSubsetParser.TAB_ROW_SEP); }
		public TerminalNode TAB_ROW_SEP(int i) {
			return getToken(LaTeXSubsetParser.TAB_ROW_SEP, i);
		}
		public List<TerminalNode> HLINE() { return getTokens(LaTeXSubsetParser.HLINE); }
		public TerminalNode HLINE(int i) {
			return getToken(LaTeXSubsetParser.HLINE, i);
		}
		public TerminalNode BEGIN_description() { return getToken(LaTeXSubsetParser.BEGIN_description, 0); }
		public TerminalNode END_description() { return getToken(LaTeXSubsetParser.END_description, 0); }
		public List<Description_itemContext> description_item() {
			return getRuleContexts(Description_itemContext.class);
		}
		public Description_itemContext description_item(int i) {
			return getRuleContext(Description_itemContext.class,i);
		}
		public EnvironmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterEnvironment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitEnvironment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitEnvironment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironmentContext environment() throws RecognitionException {
		EnvironmentContext _localctx = new EnvironmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_environment);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN_itemize:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(BEGIN_itemize);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXT) {
					{
					{
					setState(191);
					match(TEXT);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(197);
					item();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(END_itemize);
				}
				break;
			case BEGIN_enumerate:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(BEGIN_enumerate);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXT) {
					{
					{
					setState(205);
					match(TEXT);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(211);
					item();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(END_enumerate);
				}
				break;
			case BEGIN_center:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(BEGIN_center);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 384213343346229252L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 19L) != 0)) {
					{
					setState(221);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__26:
					case TAB_ROW_SEP:
					case ESCAPE_SEQ:
					case TEXT:
						{
						setState(219);
						nested_text();
						}
						break;
					case BEGIN_itemize:
					case BEGIN_enumerate:
					case BEGIN_description:
					case BEGIN_tabular:
					case BEGIN_center:
					case BEGIN_quote:
						{
						setState(220);
						environment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(END_center);
				}
				break;
			case BEGIN_quote:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(BEGIN_quote);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 384213343346229252L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 19L) != 0)) {
					{
					setState(230);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__26:
					case TAB_ROW_SEP:
					case ESCAPE_SEQ:
					case TEXT:
						{
						setState(228);
						nested_text();
						}
						break;
					case BEGIN_itemize:
					case BEGIN_enumerate:
					case BEGIN_description:
					case BEGIN_tabular:
					case BEGIN_center:
					case BEGIN_quote:
						{
						setState(229);
						environment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(END_quote);
				}
				break;
			case BEGIN_tabular:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(BEGIN_tabular);
				setState(237);
				match(TAB_COL_SPEC);
				{
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & 20927943278593L) != 0)) {
					{
					setState(242);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__26:
					case ESCAPE_SEQ:
					case TEXT:
						{
						setState(238);
						table_content();
						}
						break;
					case TAB_ROW_SEP:
						{
						setState(239);
						match(TAB_ROW_SEP);
						}
						break;
					case HLINE:
						{
						setState(240);
						match(HLINE);
						}
						break;
					case BEGIN_itemize:
					case BEGIN_enumerate:
					case BEGIN_description:
					case BEGIN_tabular:
					case BEGIN_center:
					case BEGIN_quote:
						{
						setState(241);
						environment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(247);
				match(END_tabular);
				}
				break;
			case BEGIN_description:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(BEGIN_description);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXT) {
					{
					{
					setState(249);
					match(TEXT);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(255);
					description_item();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				match(END_description);
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
	public static class Description_itemContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(LaTeXSubsetParser.TEXT, 0); }
		public Nested_textContext nested_text() {
			return getRuleContext(Nested_textContext.class,0);
		}
		public EnvironmentContext environment() {
			return getRuleContext(EnvironmentContext.class,0);
		}
		public Description_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterDescription_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitDescription_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitDescription_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Description_itemContext description_item() throws RecognitionException {
		Description_itemContext _localctx = new Description_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_description_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__23);
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				{
				setState(265);
				match(T__24);
				setState(266);
				match(TEXT);
				setState(267);
				match(T__25);
				setState(270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__26:
				case TAB_ROW_SEP:
				case ESCAPE_SEQ:
				case TEXT:
					{
					setState(268);
					nested_text();
					}
					break;
				case BEGIN_itemize:
				case BEGIN_enumerate:
				case BEGIN_description:
				case BEGIN_tabular:
				case BEGIN_center:
				case BEGIN_quote:
					{
					setState(269);
					environment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__1:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__26:
			case BEGIN_itemize:
			case BEGIN_enumerate:
			case BEGIN_description:
			case BEGIN_tabular:
			case BEGIN_center:
			case BEGIN_quote:
			case TAB_ROW_SEP:
			case ESCAPE_SEQ:
			case TEXT:
				{
				setState(274);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__26:
				case TAB_ROW_SEP:
				case ESCAPE_SEQ:
				case TEXT:
					{
					setState(272);
					nested_text();
					}
					break;
				case BEGIN_itemize:
				case BEGIN_enumerate:
				case BEGIN_description:
				case BEGIN_tabular:
				case BEGIN_center:
				case BEGIN_quote:
					{
					setState(273);
					environment();
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
	public static class ItemContext extends ParserRuleContext {
		public Nested_textContext nested_text() {
			return getRuleContext(Nested_textContext.class,0);
		}
		public EnvironmentContext environment() {
			return getRuleContext(EnvironmentContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__23);
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__26:
			case TAB_ROW_SEP:
			case ESCAPE_SEQ:
			case TEXT:
				{
				setState(279);
				nested_text();
				}
				break;
			case BEGIN_itemize:
			case BEGIN_enumerate:
			case BEGIN_description:
			case BEGIN_tabular:
			case BEGIN_center:
			case BEGIN_quote:
				{
				setState(280);
				environment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nested_textContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(LaTeXSubsetParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(LaTeXSubsetParser.TEXT, i);
		}
		public List<TerminalNode> ESCAPE_SEQ() { return getTokens(LaTeXSubsetParser.ESCAPE_SEQ); }
		public TerminalNode ESCAPE_SEQ(int i) {
			return getToken(LaTeXSubsetParser.ESCAPE_SEQ, i);
		}
		public List<Format_commandContext> format_command() {
			return getRuleContexts(Format_commandContext.class);
		}
		public Format_commandContext format_command(int i) {
			return getRuleContext(Format_commandContext.class,i);
		}
		public List<TerminalNode> TAB_ROW_SEP() { return getTokens(LaTeXSubsetParser.TAB_ROW_SEP); }
		public TerminalNode TAB_ROW_SEP(int i) {
			return getToken(LaTeXSubsetParser.TAB_ROW_SEP, i);
		}
		public List<Nested_textContext> nested_text() {
			return getRuleContexts(Nested_textContext.class);
		}
		public Nested_textContext nested_text(int i) {
			return getRuleContext(Nested_textContext.class,i);
		}
		public Nested_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterNested_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitNested_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitNested_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_textContext nested_text() throws RecognitionException {
		Nested_textContext _localctx = new Nested_textContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nested_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(296);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXT:
						{
						setState(283);
						match(TEXT);
						}
						break;
					case ESCAPE_SEQ:
						{
						setState(284);
						match(ESCAPE_SEQ);
						}
						break;
					case T__16:
					case T__17:
					case T__18:
					case T__19:
						{
						setState(285);
						format_command();
						}
						break;
					case T__1:
						{
						setState(286);
						match(T__1);
						setState(288); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(287);
							nested_text();
							}
							}
							setState(290); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 136183812L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 19L) != 0) );
						setState(292);
						match(T__2);
						}
						break;
					case T__26:
						{
						setState(294);
						match(T__26);
						}
						break;
					case TAB_ROW_SEP:
						{
						setState(295);
						match(TAB_ROW_SEP);
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
				setState(298); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Table_contentContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(LaTeXSubsetParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(LaTeXSubsetParser.TEXT, i);
		}
		public List<TerminalNode> ESCAPE_SEQ() { return getTokens(LaTeXSubsetParser.ESCAPE_SEQ); }
		public TerminalNode ESCAPE_SEQ(int i) {
			return getToken(LaTeXSubsetParser.ESCAPE_SEQ, i);
		}
		public Table_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterTable_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitTable_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitTable_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_contentContext table_content() throws RecognitionException {
		Table_contentContext _localctx = new Table_contentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_table_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(300);
					_la = _input.LA(1);
					if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & 19791209299969L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(303); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Math_inlineContext extends ParserRuleContext {
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public Math_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterMath_inline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitMath_inline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitMath_inline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_inlineContext math_inline() throws RecognitionException {
		Math_inlineContext _localctx = new Math_inlineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_math_inline);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__27);
				setState(307); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(306);
					math_expr();
					}
					}
					setState(309); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9223231849122234108L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 385L) != 0) );
				setState(311);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(T__28);
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(314);
					math_expr();
					}
					}
					setState(317); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9223231849122234108L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 385L) != 0) );
				setState(319);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(T__30);
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(322);
					math_expr();
					}
					}
					setState(325); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -9223231849122234108L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 385L) != 0) );
				setState(327);
				match(T__31);
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
	public static class Math_displayContext extends ParserRuleContext {
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public Math_displayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_display; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterMath_display(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitMath_display(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitMath_display(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_displayContext math_display() throws RecognitionException {
		Math_displayContext _localctx = new Math_displayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_math_display);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(T__32);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223231849122234108L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 385L) != 0)) {
					{
					{
					setState(332);
					math_expr();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(T__34);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223231849122234108L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 385L) != 0)) {
					{
					{
					setState(340);
					math_expr();
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(346);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(T__36);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223231849122234108L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 385L) != 0)) {
					{
					{
					setState(348);
					math_expr();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
				match(T__37);
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
	public static class Math_exprContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(LaTeXSubsetParser.TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(LaTeXSubsetParser.NUMBER, 0); }
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public TerminalNode ESCAPE_SEQ_MATH() { return getToken(LaTeXSubsetParser.ESCAPE_SEQ_MATH, 0); }
		public TerminalNode MATH_CMD() { return getToken(LaTeXSubsetParser.MATH_CMD, 0); }
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).enterMath_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaTeXSubsetListener ) ((LaTeXSubsetListener)listener).exitMath_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaTeXSubsetVisitor ) return ((LaTeXSubsetVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		Math_exprContext _localctx = new Math_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_math_expr);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(TEXT);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(NUMBER);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 8);
				{
				setState(364);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 9);
				{
				setState(365);
				match(T__44);
				setState(366);
				match(T__1);
				setState(367);
				math_expr();
				setState(368);
				match(T__2);
				setState(369);
				match(T__1);
				setState(370);
				math_expr();
				setState(371);
				match(T__2);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 10);
				{
				setState(373);
				match(T__45);
				setState(374);
				math_expr();
				setState(375);
				match(T__46);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 11);
				{
				setState(377);
				match(T__1);
				setState(378);
				math_expr();
				setState(379);
				match(T__2);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 12);
				{
				setState(381);
				match(T__7);
				setState(382);
				match(TEXT);
				}
				break;
			case ESCAPE_SEQ_MATH:
				enterOuterAlt(_localctx, 13);
				{
				setState(383);
				match(ESCAPE_SEQ_MATH);
				}
				break;
			case MATH_CMD:
				enterOuterAlt(_localctx, 14);
				{
				setState(384);
				match(MATH_CMD);
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

	public static final String _serializedATN =
		"\u0004\u0001H\u0184\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b\u0001"+
		"\n\u0001\f\u00014\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007U\b\u0007\n\u0007\f\u0007"+
		"X\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b`\b\b"+
		"\u000b\b\f\ba\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a7\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00bd\b\n\u0001\u000b\u0001\u000b\u0005\u000b\u00c1"+
		"\b\u000b\n\u000b\f\u000b\u00c4\t\u000b\u0001\u000b\u0005\u000b\u00c7\b"+
		"\u000b\n\u000b\f\u000b\u00ca\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00cf\b\u000b\n\u000b\f\u000b\u00d2\t\u000b\u0001\u000b\u0005"+
		"\u000b\u00d5\b\u000b\n\u000b\f\u000b\u00d8\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00de\b\u000b\n\u000b\f\u000b\u00e1"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e7"+
		"\b\u000b\n\u000b\f\u000b\u00ea\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f3\b\u000b"+
		"\n\u000b\f\u000b\u00f6\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00fb\b\u000b\n\u000b\f\u000b\u00fe\t\u000b\u0001\u000b\u0005\u000b"+
		"\u0101\b\u000b\n\u000b\f\u000b\u0104\t\u000b\u0001\u000b\u0003\u000b\u0107"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u010f"+
		"\b\f\u0001\f\u0001\f\u0003\f\u0113\b\f\u0003\f\u0115\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u011a\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u0121\b\u000e\u000b\u000e\f\u000e\u0122"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0129\b\u000e"+
		"\u000b\u000e\f\u000e\u012a\u0001\u000f\u0004\u000f\u012e\b\u000f\u000b"+
		"\u000f\f\u000f\u012f\u0001\u0010\u0001\u0010\u0004\u0010\u0134\b\u0010"+
		"\u000b\u0010\f\u0010\u0135\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u013c\b\u0010\u000b\u0010\f\u0010\u013d\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0144\b\u0010\u000b\u0010\f"+
		"\u0010\u0145\u0001\u0010\u0001\u0010\u0003\u0010\u014a\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u014e\b\u0011\n\u0011\f\u0011\u0151\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0156\b\u0011\n\u0011\f\u0011"+
		"\u0159\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u015e\b"+
		"\u0011\n\u0011\f\u0011\u0161\t\u0011\u0001\u0011\u0003\u0011\u0164\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0182\b\u0012"+
		"\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0001\u0003\u0000"+
		"\u001b\u001bDDGG\u01c4\u0000&\u0001\u0000\u0000\u0000\u00022\u0001\u0000"+
		"\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000"+
		"\b?\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000\fI\u0001\u0000"+
		"\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000"+
		"\u0012\u00a6\u0001\u0000\u0000\u0000\u0014\u00bc\u0001\u0000\u0000\u0000"+
		"\u0016\u0106\u0001\u0000\u0000\u0000\u0018\u0108\u0001\u0000\u0000\u0000"+
		"\u001a\u0116\u0001\u0000\u0000\u0000\u001c\u0128\u0001\u0000\u0000\u0000"+
		"\u001e\u012d\u0001\u0000\u0000\u0000 \u0149\u0001\u0000\u0000\u0000\""+
		"\u0163\u0001\u0000\u0000\u0000$\u0181\u0001\u0000\u0000\u0000&\'\u0003"+
		"\u0002\u0001\u0000\'(\u0003\u0010\b\u0000()\u0005\u0000\u0000\u0001)\u0001"+
		"\u0001\u0000\u0000\u0000*1\u0003\u0004\u0002\u0000+1\u0003\u0006\u0003"+
		"\u0000,1\u0003\b\u0004\u0000-1\u0003\n\u0005\u0000.1\u0003\f\u0006\u0000"+
		"/1\u0003\u000e\u0007\u00000*\u0001\u0000\u0000\u00000+\u0001\u0000\u0000"+
		"\u00000,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0003\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000056\u0005\u0001\u0000\u000067\u0005\u0002"+
		"\u0000\u000078\u0005A\u0000\u000089\u0005\u0003\u0000\u00009\u0005\u0001"+
		"\u0000\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0005\u0002\u0000\u0000"+
		"<=\u0005G\u0000\u0000=>\u0005\u0003\u0000\u0000>\u0007\u0001\u0000\u0000"+
		"\u0000?@\u0005\u0005\u0000\u0000@A\u0005\u0002\u0000\u0000AB\u0003\u001c"+
		"\u000e\u0000BC\u0005\u0003\u0000\u0000C\t\u0001\u0000\u0000\u0000DE\u0005"+
		"\u0006\u0000\u0000EF\u0005\u0002\u0000\u0000FG\u0003\u001c\u000e\u0000"+
		"GH\u0005\u0003\u0000\u0000H\u000b\u0001\u0000\u0000\u0000IJ\u0005\u0007"+
		"\u0000\u0000JK\u0005\u0002\u0000\u0000KL\u0003\u001c\u000e\u0000LM\u0005"+
		"\u0003\u0000\u0000M\r\u0001\u0000\u0000\u0000NO\u0005\b\u0000\u0000OV"+
		"\u0005G\u0000\u0000PQ\u0005\u0002\u0000\u0000QR\u0003\u001c\u000e\u0000"+
		"RS\u0005\u0003\u0000\u0000SU\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000W\u000f\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"Y_\u0005<\u0000\u0000Z`\u0003\u0012\t\u0000[`\u0003\u0016\u000b\u0000"+
		"\\`\u0003 \u0010\u0000]`\u0003\"\u0011\u0000^`\u0003\u001c\u000e\u0000"+
		"_Z\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000cd\u0005=\u0000\u0000d\u0011\u0001\u0000\u0000\u0000"+
		"e\u00a7\u0005\t\u0000\u0000f\u00a7\u0005\n\u0000\u0000g\u00a7\u0005>\u0000"+
		"\u0000hi\u0005\u000b\u0000\u0000ij\u0005\u0002\u0000\u0000jk\u0003\u001c"+
		"\u000e\u0000kl\u0005\u0003\u0000\u0000l\u00a7\u0001\u0000\u0000\u0000"+
		"mn\u0005\f\u0000\u0000no\u0005\u0002\u0000\u0000op\u0003\u001c\u000e\u0000"+
		"pq\u0005\u0003\u0000\u0000q\u00a7\u0001\u0000\u0000\u0000rs\u0005\r\u0000"+
		"\u0000st\u0005\u0002\u0000\u0000tu\u0003\u001c\u000e\u0000uv\u0005\u0003"+
		"\u0000\u0000v\u00a7\u0001\u0000\u0000\u0000wx\u0005\u000e\u0000\u0000"+
		"xy\u0005\u0002\u0000\u0000yz\u0003\u001c\u000e\u0000z{\u0005\u0003\u0000"+
		"\u0000{\u00a7\u0001\u0000\u0000\u0000|}\u0005\u000f\u0000\u0000}~\u0005"+
		"\u0002\u0000\u0000~\u007f\u0003\u001c\u000e\u0000\u007f\u0080\u0005\u0003"+
		"\u0000\u0000\u0080\u00a7\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0010"+
		"\u0000\u0000\u0082\u0083\u0005\u0002\u0000\u0000\u0083\u0084\u0003\u001c"+
		"\u000e\u0000\u0084\u0085\u0005\u0003\u0000\u0000\u0085\u00a7\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005\u0011\u0000\u0000\u0087\u0088\u0005\u0002"+
		"\u0000\u0000\u0088\u0089\u0003\u001c\u000e\u0000\u0089\u008a\u0005\u0003"+
		"\u0000\u0000\u008a\u00a7\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0012"+
		"\u0000\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d\u008e\u0003\u001c"+
		"\u000e\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u00a7\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u0013\u0000\u0000\u0091\u0092\u0005\u0002"+
		"\u0000\u0000\u0092\u0093\u0003\u001c\u000e\u0000\u0093\u0094\u0005\u0003"+
		"\u0000\u0000\u0094\u00a7\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0014"+
		"\u0000\u0000\u0096\u0097\u0005\u0002\u0000\u0000\u0097\u0098\u0003\u001c"+
		"\u000e\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u00a7\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\u0015\u0000\u0000\u009b\u009c\u0005\u0002"+
		"\u0000\u0000\u009c\u009d\u0005G\u0000\u0000\u009d\u00a7\u0005\u0003\u0000"+
		"\u0000\u009e\u009f\u0005\u0016\u0000\u0000\u009f\u00a0\u0005\u0002\u0000"+
		"\u0000\u00a0\u00a1\u0005G\u0000\u0000\u00a1\u00a7\u0005\u0003\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0017\u0000\u0000\u00a3\u00a4\u0005\u0002\u0000\u0000"+
		"\u00a4\u00a5\u0005G\u0000\u0000\u00a5\u00a7\u0005\u0003\u0000\u0000\u00a6"+
		"e\u0001\u0000\u0000\u0000\u00a6f\u0001\u0000\u0000\u0000\u00a6g\u0001"+
		"\u0000\u0000\u0000\u00a6h\u0001\u0000\u0000\u0000\u00a6m\u0001\u0000\u0000"+
		"\u0000\u00a6r\u0001\u0000\u0000\u0000\u00a6w\u0001\u0000\u0000\u0000\u00a6"+
		"|\u0001\u0000\u0000\u0000\u00a6\u0081\u0001\u0000\u0000\u0000\u00a6\u0086"+
		"\u0001\u0000\u0000\u0000\u00a6\u008b\u0001\u0000\u0000\u0000\u00a6\u0090"+
		"\u0001\u0000\u0000\u0000\u00a6\u0095\u0001\u0000\u0000\u0000\u00a6\u009a"+
		"\u0001\u0000\u0000\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a6\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a7\u0013\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005\u0011\u0000\u0000\u00a9\u00aa\u0005\u0002\u0000\u0000\u00aa\u00ab"+
		"\u0003\u001c\u000e\u0000\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac\u00bd"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0012\u0000\u0000\u00ae\u00af"+
		"\u0005\u0002\u0000\u0000\u00af\u00b0\u0003\u001c\u000e\u0000\u00b0\u00b1"+
		"\u0005\u0003\u0000\u0000\u00b1\u00bd\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0013\u0000\u0000\u00b3\u00b4\u0005\u0002\u0000\u0000\u00b4\u00b5"+
		"\u0003\u001c\u000e\u0000\u00b5\u00b6\u0005\u0003\u0000\u0000\u00b6\u00bd"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0014\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0002\u0000\u0000\u00b9\u00ba\u0003\u001c\u000e\u0000\u00ba\u00bb"+
		"\u0005\u0003\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00a8"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ad\u0001\u0000\u0000\u0000\u00bc\u00b2"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bd\u0015"+
		"\u0001\u0000\u0000\u0000\u00be\u00c2\u00050\u0000\u0000\u00bf\u00c1\u0005"+
		"G\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c8\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c7\u0003\u001a\r\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u0107\u00051\u0000\u0000"+
		"\u00cc\u00d0\u00052\u0000\u0000\u00cd\u00cf\u0005G\u0000\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d5"+
		"\u0003\u001a\r\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u0107\u00053\u0000\u0000\u00da\u00df\u00058\u0000"+
		"\u0000\u00db\u00de\u0003\u001c\u000e\u0000\u00dc\u00de\u0003\u0016\u000b"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u0107\u00059\u0000\u0000"+
		"\u00e3\u00e8\u0005:\u0000\u0000\u00e4\u00e7\u0003\u001c\u000e\u0000\u00e5"+
		"\u00e7\u0003\u0016\u000b\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb"+
		"\u0107\u0005;\u0000\u0000\u00ec\u00ed\u00056\u0000\u0000\u00ed\u00f4\u0005"+
		"B\u0000\u0000\u00ee\u00f3\u0003\u001e\u000f\u0000\u00ef\u00f3\u0005C\u0000"+
		"\u0000\u00f0\u00f3\u0005>\u0000\u0000\u00f1\u00f3\u0003\u0016\u000b\u0000"+
		"\u00f2\u00ee\u0001\u0000\u0000\u0000\u00f2\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u0107\u00057\u0000\u0000\u00f8"+
		"\u00fc\u00054\u0000\u0000\u00f9\u00fb\u0005G\u0000\u0000\u00fa\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0102\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0101\u0003"+
		"\u0018\f\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0105\u0107\u00055\u0000\u0000\u0106\u00be\u0001\u0000\u0000"+
		"\u0000\u0106\u00cc\u0001\u0000\u0000\u0000\u0106\u00da\u0001\u0000\u0000"+
		"\u0000\u0106\u00e3\u0001\u0000\u0000\u0000\u0106\u00ec\u0001\u0000\u0000"+
		"\u0000\u0106\u00f8\u0001\u0000\u0000\u0000\u0107\u0017\u0001\u0000\u0000"+
		"\u0000\u0108\u0114\u0005\u0018\u0000\u0000\u0109\u010a\u0005\u0019\u0000"+
		"\u0000\u010a\u010b\u0005G\u0000\u0000\u010b\u010e\u0005\u001a\u0000\u0000"+
		"\u010c\u010f\u0003\u001c\u000e\u0000\u010d\u010f\u0003\u0016\u000b\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0115\u0001\u0000\u0000\u0000\u0110\u0113\u0003\u001c\u000e\u0000"+
		"\u0111\u0113\u0003\u0016\u000b\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000"+
		"\u0114\u0109\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000"+
		"\u0115\u0019\u0001\u0000\u0000\u0000\u0116\u0119\u0005\u0018\u0000\u0000"+
		"\u0117\u011a\u0003\u001c\u000e\u0000\u0118\u011a\u0003\u0016\u000b\u0000"+
		"\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000"+
		"\u011a\u001b\u0001\u0000\u0000\u0000\u011b\u0129\u0005G\u0000\u0000\u011c"+
		"\u0129\u0005D\u0000\u0000\u011d\u0129\u0003\u0014\n\u0000\u011e\u0120"+
		"\u0005\u0002\u0000\u0000\u011f\u0121\u0003\u001c\u000e\u0000\u0120\u011f"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0003\u0000\u0000\u0125\u0129"+
		"\u0001\u0000\u0000\u0000\u0126\u0129\u0005\u001b\u0000\u0000\u0127\u0129"+
		"\u0005C\u0000\u0000\u0128\u011b\u0001\u0000\u0000\u0000\u0128\u011c\u0001"+
		"\u0000\u0000\u0000\u0128\u011d\u0001\u0000\u0000\u0000\u0128\u011e\u0001"+
		"\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u0128\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u001d\u0001"+
		"\u0000\u0000\u0000\u012c\u012e\u0007\u0000\u0000\u0000\u012d\u012c\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u001f\u0001"+
		"\u0000\u0000\u0000\u0131\u0133\u0005\u001c\u0000\u0000\u0132\u0134\u0003"+
		"$\u0012\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u001c"+
		"\u0000\u0000\u0138\u014a\u0001\u0000\u0000\u0000\u0139\u013b\u0005\u001d"+
		"\u0000\u0000\u013a\u013c\u0003$\u0012\u0000\u013b\u013a\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0005\u001e\u0000\u0000\u0140\u014a\u0001\u0000\u0000"+
		"\u0000\u0141\u0143\u0005\u001f\u0000\u0000\u0142\u0144\u0003$\u0012\u0000"+
		"\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0005 \u0000\u0000\u0148"+
		"\u014a\u0001\u0000\u0000\u0000\u0149\u0131\u0001\u0000\u0000\u0000\u0149"+
		"\u0139\u0001\u0000\u0000\u0000\u0149\u0141\u0001\u0000\u0000\u0000\u014a"+
		"!\u0001\u0000\u0000\u0000\u014b\u014f\u0005!\u0000\u0000\u014c\u014e\u0003"+
		"$\u0012\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000"+
		"\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000"+
		"\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000"+
		"\u0000\u0000\u0152\u0164\u0005\"\u0000\u0000\u0153\u0157\u0005#\u0000"+
		"\u0000\u0154\u0156\u0003$\u0012\u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000"+
		"\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u0164\u0005$\u0000\u0000\u015b"+
		"\u015f\u0005%\u0000\u0000\u015c\u015e\u0003$\u0012\u0000\u015d\u015c\u0001"+
		"\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162\u0001"+
		"\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0164\u0005"+
		"&\u0000\u0000\u0163\u014b\u0001\u0000\u0000\u0000\u0163\u0153\u0001\u0000"+
		"\u0000\u0000\u0163\u015b\u0001\u0000\u0000\u0000\u0164#\u0001\u0000\u0000"+
		"\u0000\u0165\u0182\u0005G\u0000\u0000\u0166\u0182\u0005H\u0000\u0000\u0167"+
		"\u0182\u0005\'\u0000\u0000\u0168\u0182\u0005(\u0000\u0000\u0169\u0182"+
		"\u0005)\u0000\u0000\u016a\u0182\u0005*\u0000\u0000\u016b\u0182\u0005+"+
		"\u0000\u0000\u016c\u0182\u0005,\u0000\u0000\u016d\u016e\u0005-\u0000\u0000"+
		"\u016e\u016f\u0005\u0002\u0000\u0000\u016f\u0170\u0003$\u0012\u0000\u0170"+
		"\u0171\u0005\u0003\u0000\u0000\u0171\u0172\u0005\u0002\u0000\u0000\u0172"+
		"\u0173\u0003$\u0012\u0000\u0173\u0174\u0005\u0003\u0000\u0000\u0174\u0182"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0005.\u0000\u0000\u0176\u0177\u0003"+
		"$\u0012\u0000\u0177\u0178\u0005/\u0000\u0000\u0178\u0182\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0005\u0002\u0000\u0000\u017a\u017b\u0003$\u0012\u0000"+
		"\u017b\u017c\u0005\u0003\u0000\u0000\u017c\u0182\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0005\b\u0000\u0000\u017e\u0182\u0005G\u0000\u0000\u017f"+
		"\u0182\u0005@\u0000\u0000\u0180\u0182\u0005?\u0000\u0000\u0181\u0165\u0001"+
		"\u0000\u0000\u0000\u0181\u0166\u0001\u0000\u0000\u0000\u0181\u0167\u0001"+
		"\u0000\u0000\u0000\u0181\u0168\u0001\u0000\u0000\u0000\u0181\u0169\u0001"+
		"\u0000\u0000\u0000\u0181\u016a\u0001\u0000\u0000\u0000\u0181\u016b\u0001"+
		"\u0000\u0000\u0000\u0181\u016c\u0001\u0000\u0000\u0000\u0181\u016d\u0001"+
		"\u0000\u0000\u0000\u0181\u0175\u0001\u0000\u0000\u0000\u0181\u0179\u0001"+
		"\u0000\u0000\u0000\u0181\u017d\u0001\u0000\u0000\u0000\u0181\u017f\u0001"+
		"\u0000\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182%\u0001\u0000"+
		"\u0000\u0000%02V_a\u00a6\u00bc\u00c2\u00c8\u00d0\u00d6\u00dd\u00df\u00e6"+
		"\u00e8\u00f2\u00f4\u00fc\u0102\u0106\u010e\u0112\u0114\u0119\u0122\u0128"+
		"\u012a\u012f\u0135\u013d\u0145\u0149\u014f\u0157\u015f\u0163\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}