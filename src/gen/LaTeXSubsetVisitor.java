package gen;// Generated from C:/Users/leula/IdeaProjects/PCDLaTeXToHTML/src/LaTeXSubset.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LaTeXSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LaTeXSubsetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#latexDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatexDocument(LaTeXSubsetParser.LatexDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#preamble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreamble(LaTeXSubsetParser.PreambleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#documentclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentclass(LaTeXSubsetParser.DocumentclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#usepackage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsepackage(LaTeXSubsetParser.UsepackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(LaTeXSubsetParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#author}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthor(LaTeXSubsetParser.AuthorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(LaTeXSubsetParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#otherCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherCommand(LaTeXSubsetParser.OtherCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(LaTeXSubsetParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(LaTeXSubsetParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#format_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_command(LaTeXSubsetParser.Format_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#environment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironment(LaTeXSubsetParser.EnvironmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#description_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription_item(LaTeXSubsetParser.Description_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(LaTeXSubsetParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#nested_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_text(LaTeXSubsetParser.Nested_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#table_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_content(LaTeXSubsetParser.Table_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#math_inline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_inline(LaTeXSubsetParser.Math_inlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#math_display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_display(LaTeXSubsetParser.Math_displayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaTeXSubsetParser#math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr(LaTeXSubsetParser.Math_exprContext ctx);
}