package gen;// Generated from C:/Users/leula/IdeaProjects/PCDLaTeXToHTML/src/LaTeXSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaTeXSubsetParser}.
 */
public interface LaTeXSubsetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#latexDocument}.
	 * @param ctx the parse tree
	 */
	void enterLatexDocument(LaTeXSubsetParser.LatexDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#latexDocument}.
	 * @param ctx the parse tree
	 */
	void exitLatexDocument(LaTeXSubsetParser.LatexDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#preamble}.
	 * @param ctx the parse tree
	 */
	void enterPreamble(LaTeXSubsetParser.PreambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#preamble}.
	 * @param ctx the parse tree
	 */
	void exitPreamble(LaTeXSubsetParser.PreambleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#documentclass}.
	 * @param ctx the parse tree
	 */
	void enterDocumentclass(LaTeXSubsetParser.DocumentclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#documentclass}.
	 * @param ctx the parse tree
	 */
	void exitDocumentclass(LaTeXSubsetParser.DocumentclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#usepackage}.
	 * @param ctx the parse tree
	 */
	void enterUsepackage(LaTeXSubsetParser.UsepackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#usepackage}.
	 * @param ctx the parse tree
	 */
	void exitUsepackage(LaTeXSubsetParser.UsepackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(LaTeXSubsetParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(LaTeXSubsetParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#author}.
	 * @param ctx the parse tree
	 */
	void enterAuthor(LaTeXSubsetParser.AuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#author}.
	 * @param ctx the parse tree
	 */
	void exitAuthor(LaTeXSubsetParser.AuthorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(LaTeXSubsetParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(LaTeXSubsetParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#otherCommand}.
	 * @param ctx the parse tree
	 */
	void enterOtherCommand(LaTeXSubsetParser.OtherCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#otherCommand}.
	 * @param ctx the parse tree
	 */
	void exitOtherCommand(LaTeXSubsetParser.OtherCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(LaTeXSubsetParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(LaTeXSubsetParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(LaTeXSubsetParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(LaTeXSubsetParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#format_command}.
	 * @param ctx the parse tree
	 */
	void enterFormat_command(LaTeXSubsetParser.Format_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#format_command}.
	 * @param ctx the parse tree
	 */
	void exitFormat_command(LaTeXSubsetParser.Format_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#environment}.
	 * @param ctx the parse tree
	 */
	void enterEnvironment(LaTeXSubsetParser.EnvironmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#environment}.
	 * @param ctx the parse tree
	 */
	void exitEnvironment(LaTeXSubsetParser.EnvironmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#description_item}.
	 * @param ctx the parse tree
	 */
	void enterDescription_item(LaTeXSubsetParser.Description_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#description_item}.
	 * @param ctx the parse tree
	 */
	void exitDescription_item(LaTeXSubsetParser.Description_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(LaTeXSubsetParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(LaTeXSubsetParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#nested_text}.
	 * @param ctx the parse tree
	 */
	void enterNested_text(LaTeXSubsetParser.Nested_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#nested_text}.
	 * @param ctx the parse tree
	 */
	void exitNested_text(LaTeXSubsetParser.Nested_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#table_content}.
	 * @param ctx the parse tree
	 */
	void enterTable_content(LaTeXSubsetParser.Table_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#table_content}.
	 * @param ctx the parse tree
	 */
	void exitTable_content(LaTeXSubsetParser.Table_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#math_inline}.
	 * @param ctx the parse tree
	 */
	void enterMath_inline(LaTeXSubsetParser.Math_inlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#math_inline}.
	 * @param ctx the parse tree
	 */
	void exitMath_inline(LaTeXSubsetParser.Math_inlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#math_display}.
	 * @param ctx the parse tree
	 */
	void enterMath_display(LaTeXSubsetParser.Math_displayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#math_display}.
	 * @param ctx the parse tree
	 */
	void exitMath_display(LaTeXSubsetParser.Math_displayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaTeXSubsetParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr(LaTeXSubsetParser.Math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaTeXSubsetParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr(LaTeXSubsetParser.Math_exprContext ctx);
}