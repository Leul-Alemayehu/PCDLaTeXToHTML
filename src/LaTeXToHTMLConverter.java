import org.antlr.v4.runtime.tree.*;
import gen.*;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.stringtemplate.v4.StringRenderer.escapeHTML;

public class LaTeXToHTMLConverter extends LaTeXSubsetBaseVisitor<String> {
    private final Map<String, String> labels = new HashMap<>();
    private String currentSectionTitle;
    private String title = null;
    private String author = null;
    private String date = null;
    private boolean maketitleUsed = false;
    private boolean maketitleFirst = true; // Assume it's the first until proven otherwise
    private boolean bodyStarted = false;
    private String documentClass = null;

    @Override
    public String visitLatexDocument(LaTeXSubsetParser.LatexDocumentContext ctx) {
        StringBuilder html = new StringBuilder();

        // Process the preamble
        if (ctx.preamble() != null) {
            visit(ctx.preamble());
        }

        // Process the document body
        if (ctx.document() != null) {
            String bodyHtml = visit(ctx.document());
            if (maketitleUsed) {
                html.append(generatePreambleHTML());
            } else {
                System.out.println("Semantics Warning: No \\maketitle found. Preamble content will be ignored.");
            }
            html.append(bodyHtml);
        }

        return html.toString();
    }

    @Override
    public String visitPreamble(LaTeXSubsetParser.PreambleContext ctx) {
        for (LaTeXSubsetParser.DocumentclassContext docCtx : ctx.documentclass()) {
            documentClass = docCtx.getChild(2).getText();
        }
        for (LaTeXSubsetParser.TitleContext titleCtx : ctx.title()) {
            title = titleCtx.getChild(2).getText();
        }
        for (LaTeXSubsetParser.AuthorContext authorCtx : ctx.author()) {
            author = authorCtx.getChild(2).getText();
        }
        for (LaTeXSubsetParser.DateContext dateCtx : ctx.date()) {
            date = dateCtx.getChild(2).getText();
        }
        for (LaTeXSubsetParser.UsepackageContext pkgCtx : ctx.usepackage()) {
        }
        // Other commands
        for (LaTeXSubsetParser.OtherCommandContext cmdCtx : ctx.otherCommand()) {
            visit(cmdCtx);
        }
        return null;
    }

    @Override
    public String visitDocument(LaTeXSubsetParser.DocumentContext ctx) {
        StringBuilder html = new StringBuilder();

        for (ParseTree child : ctx.children) {
            if (child.getText().equals("\\begin{document}") || child.getText().equals("\\end{document}")) {
                continue;
            }
            String childResult = visit(child);
            if (childResult != null) { // Handle null returns from visits
                html.append(childResult);
            }
        }
        return html.toString();
    }

    @Override
    public String visitCommand(LaTeXSubsetParser.CommandContext ctx) {
        if (ctx.getChild(0) == null) return null;
        String commandName = ctx.getChild(0).getText();

        if (commandName.equals("\\title")) {
            return null; // No direct HTML output
        } else if (commandName.equals("\\author")) {
            return null; // No direct HTML output
        } else if (commandName.equals("\\date")) {
            date = visit(ctx.nested_text());
            return null; // No direct HTML output
        } else if (commandName.equals("\\maketitle")) {
            bodyStarted = true;
            if (maketitleUsed) {
                System.out.println("Semantics Warning: Multiple \\maketitle commands found.");
            }
            if (!maketitleFirst) {
                System.out.println("Semantics Warning: \\maketitle is not the first item in the body.");
            }
            maketitleUsed = true;
            return ""; // Handled separately in `visitLatexDocument`
        }

        // Handle body commands (existing logic)
        bodyStarted = true;
        if (!maketitleUsed) maketitleFirst = false;

        if (commandName.equals("\\section")) {
            currentSectionTitle = visit(ctx.nested_text());
            return "<h1>" + currentSectionTitle + "</h1>";
        } else if (commandName.equals("\\subsection")) {
            currentSectionTitle = visit(ctx.nested_text());
            return "<h2>" + currentSectionTitle + "</h2>";
        } else if (commandName.equals("\\subsubsection")) {
            currentSectionTitle = visit(ctx.nested_text());
            return "<h3>" + currentSectionTitle + "</h3>";
        } else if (commandName.equals("\\paragraph")) {
            return "<p><strong>" + visit(ctx.nested_text()) + "</strong></p>";
        } else if(commandName.equals("\\chapter")) {
            if ("article".equals(documentClass)) {
                System.out.println("Semantics Warning: \\chapter used in document with 'article' class, which does not support chapters.");
            }
            return "<p><em>" + visit(ctx.nested_text()) + "</em></p>";
        }
        else if (commandName.equals("\\subparagraph")) {
            return "<p><em>" + visit(ctx.nested_text()) + "</em></p>";
        } else if (commandName.equals("\\textbf")) {
            return "<strong>" + visit(ctx.nested_text()) + "</strong>";
        } else if (commandName.equals("\\textit")) {
            return "<em>" + visit(ctx.nested_text()) + "</em>";
        } else if (commandName.equals("\\underline")) {
            return "<u>" + visit(ctx.nested_text()) + "</u>";
        } else if (commandName.equals("\\texttt")) {
            return "<tt>" + visit(ctx.nested_text()) + "</tt>";
        } else if (commandName.equals("\\newline")) {
            return "<br>";
        } else if (commandName.equals("\\hline")) {
            return "<hr>";
        }
        else if (commandName.equals("\\label")) {
            String label = ctx.TEXT().getText();
            labels.put(label, currentSectionTitle);
            return ""; // Labels don't generate HTML directly.
        } else if (commandName.equals("\\ref")) {
            String label = ctx.TEXT().getText();
            return labels.containsKey(label) ? "<a href='#" + label + "'>" + labels.get(label) + "</a>" : "<em>[labeling undefined]</em>";
        }
        System.out.println("Warning: unknown command: " + commandName);
        return null; // Important: Return null if the command is not handled
    }


    @Override
    public String visitFormat_command(LaTeXSubsetParser.Format_commandContext ctx) {
        if (ctx.getChild(0) == null) return null;
        String commandName = ctx.getChild(0).getText();
        if (commandName.equals("\\textbf")) {
            return "<strong>" + visit(ctx.nested_text()) + "</strong>";
        } else if (commandName.equals("\\textit")) {
            return "<em>" + visit(ctx.nested_text()) + "</em>";
        } else if (commandName.equals("\\underline")) {
            return "<u>" + visit(ctx.nested_text()) + "</u>";
        } else if (commandName.equals("\\texttt")) {
            return "<tt>" + visit(ctx.nested_text()) + "</tt>";
        }
        return null;
    }

    @Override
    public String visitEnvironment(LaTeXSubsetParser.EnvironmentContext ctx) {
        if (ctx.BEGIN_itemize() != null) {
            if(ctx.item() != null) {
                return "<ul>" + ctx.item().stream().map(this::visit).collect(Collectors.joining()) + "</ul>";
            } else{
                System.out.println("Warning: undefined itemize BEGIN item");
            }
        } else if (ctx.BEGIN_enumerate() != null) {
            if(ctx.item() != null) {
                return "<ol>" + ctx.item().stream().map(this::visit).collect(Collectors.joining()) + "</ol>";
            } else{
                System.out.println("Warning: undefined enumerate BEGIN");
            }
        } else if (ctx.BEGIN_description() != null) {
            // Create a description list
            StringBuilder descriptionList = new StringBuilder("<dl>");

            // Pair each `\item` with its corresponding nested_text if available
            int textIndex = 0;
            for (LaTeXSubsetParser.ItemContext itemCtx : ctx.item()) {
                String term = visit(itemCtx); // The term of the description
                String definition = ""; // The definition (optional)

                if (textIndex < ctx.nested_text().size()) {
                    definition = visit(ctx.nested_text(textIndex));
                    textIndex++; // Increment index for the next nested_text
                }

                // Add to the description list
                descriptionList.append("<dt>").append(term).append("</dt>");
                descriptionList.append("<dd>").append(definition).append("</dd>");
            }
            descriptionList.append("</dl>");
            return descriptionList.toString();
        } else if (ctx.BEGIN_center() != null) {
            return "<div style=\"text-align:center;\">" + visit(ctx.nested_text(0)) + "</div>";
        } else if (ctx.BEGIN_quote() != null) {
            return "<blockquote>" + visit(ctx.nested_text(0)) + "</blockquote>";
        } else if (ctx.BEGIN_tabular() != null) {
            StringBuilder table = new StringBuilder("<table border='1'>");

            // Process each row of the table
            for (LaTeXSubsetParser.Table_contentContext content : ctx.table_content()) {
                String rowText = visit(content);  // Get the content of the row

                // Split the row into individual cells (using '&' as the separator)
                String[] cells = rowText.split("&");

                // Wrap each cell's content in <td> tags
                table.append("<tr>");
                for (String cell : cells) {
                    table.append("<td>").append(cell.trim()).append("</td>");
                }
                table.append("</tr>");
            }

            table.append("</table>");
            return table.toString();
        }
        return null;
    }


    @Override
    public String visitTable_content(LaTeXSubsetParser.Table_contentContext ctx) {
        StringBuilder content = new StringBuilder();

        // First, handle the regular TEXT nodes within the table cell
        if (ctx.TEXT() != null) {
            for (TerminalNode text : ctx.TEXT()) {
                content.append(text.getText());
            }
        }

        // Handle ESCAPE_SEQ separately, and append it to the content
        if (ctx.ESCAPE_SEQ() != null) {
            for (TerminalNode esc : ctx.ESCAPE_SEQ()) {
                content.append(esc.getText());
            }
        }

        return content.toString();
    }

    @Override
    public String visitItem(LaTeXSubsetParser.ItemContext ctx) {
        if (ctx.getChildCount() < 2) {
            System.out.println("Warning: \\item with insufficient children.");
            return "<li></li>";
        }

        // Process the second child (index 1)
        ParseTree content = ctx.getChild(1);
        String processedContent = visit(content);

        // Wrap the result in <li> tags
        return "<li>" + (processedContent != null ? processedContent : "") + "</li>";
    }

    @Override
    public String visitMath_inline(LaTeXSubsetParser.Math_inlineContext ctx) {
        String mathContent = ctx.getText().substring(1, ctx.getText().length() - 1); // Remove $...$
        return "<span class='math-inline'>" + escapeHTML(mathContent) + "</span>";
    }

    @Override
    public String visitMath_display(LaTeXSubsetParser.Math_displayContext ctx) {
        String mathContent = ctx.getText().substring(2, ctx.getText().length() - 2); // Remove \[...\]
        return "<div class='math-display'>" + escapeHTML(mathContent) + "</div>";
    }

    @Override
    public String visitNested_text(LaTeXSubsetParser.Nested_textContext ctx) {
        if (ctx == null || ctx.getChildCount() == 0) return "";
        StringBuilder result = new StringBuilder();
        for (ParseTree child : ctx.children) {
            String childResult = visit(child);
            if (childResult != null) result.append(childResult);
        }
        return result.toString();
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        String text = node.getText();
        if (text.equals("&")) return "&amp;";
        if (text.equals("<")) return "&lt;";
        if (text.equals(">")) return "&gt;";
        return text; // Default behavior.
    }

    private String generatePreambleHTML() {
        StringBuilder html = new StringBuilder();
        html.append("<div class='preamble'>");
        if (title != null) html.append("<h1>").append(escapeHTML(title)).append("</h1>");
        if (author != null) html.append("<p class='author'>").append(escapeHTML(author)).append("</p>");
        if (date != null) html.append("<p class='date'>").append(escapeHTML(date)).append("</p>");
        html.append("</div>");
        return html.toString();
    }
}