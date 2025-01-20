import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.*;

public class LaTeXParserDemo {
    public static void main(String[] args) {
        String latexInput = """
                \\documentclass{article}
                \\begin{document}
                \\begin{itemize}
                \\item one
                \\item two
                \\item \\begin{enumerate}
                \\item first nested item
                \\item second nested item
                \\item third nested item
                \\end{enumerate}
                \\end{itemize}
                \\chapter{HELLO!}
                \\end{document}
                
                """;
        System.out.println(latexInput);

        // Create a lexer and parser
        CharStream input = CharStreams.fromString(latexInput);
        LaTeXSubsetLexer lexer = new LaTeXSubsetLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LaTeXSubsetParser parser = new LaTeXSubsetParser(tokens);

        // Parse the input
        ParseTree tree = parser.latexDocument();

        // Visit the parse tree to generate HTML
        LaTeXToHTMLConverter converter = new LaTeXToHTMLConverter();
        String htmlOutput = converter.visit(tree);

        System.out.println(htmlOutput);
    }
}
