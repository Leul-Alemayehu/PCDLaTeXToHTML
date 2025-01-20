    grammar LaTeXSubset;

    // Lexer Rules
    BEGIN_itemize: '\\begin{itemize}';
    END_itemize: '\\end{itemize}';
    BEGIN_enumerate: '\\begin{enumerate}';
    END_enumerate: '\\end{enumerate}';
    BEGIN_description: '\\begin{description}';
    END_description: '\\end{description}';
    BEGIN_tabular: '\\begin{tabular}';
    END_tabular: '\\end{tabular}';
    BEGIN_center: '\\begin{center}';
    END_center: '\\end{center}';
    BEGIN_quote: '\\begin{quote}';
    END_quote: '\\end{quote}';
    BEGIN_document: '\\begin{document}';
    END_document: '\\end{document}';
    HLINE: '\\hline';
    MATH_CMD: '\\' [a-zA-Z]+;
    ESCAPE_SEQ_MATH: '\\' ( '%' | '$' | '{' | '}' | '&' | '#' | '_' | '^' | '[' | ']');
    CLASS: 'article' | 'book' | 'report';
    TAB_COL_SPEC: '{' [ \t]* [c|l|r|p|*|{|}|!|>|<|@] ([ \t]* [c|l|r|p|*|{|}|!|>|<|@])* [ \t]* '}';
    TAB_ROW_SEP: '\\\\';
    ESCAPE_SEQ: '\\' ( '%' | '{' | '}' | '&' );
    COMMENT: '%' ~('\n')* -> skip;
    WS: [ \t\r\n]+ -> skip; // Skips all whitespace and newlines.


    // Parser Rules
    latexDocument: preamble document EOF;

    preamble: (documentclass | usepackage | title | author | date | otherCommand)*;

    documentclass: '\\documentclass' '{' CLASS '}';
    usepackage: '\\usepackage' '{' TEXT '}';
    title: '\\title' '{' nested_text '}';
    author: '\\author' '{' nested_text '}';
    date: '\\date' '{' nested_text '}';
    otherCommand: '\\' TEXT ('{' nested_text '}')*;

    TEXT: ~('\\' | '$' | '{' | '}' | '\n' | '&')+;

    document: BEGIN_document (command | environment | math_inline | math_display | nested_text)+ END_document;

    command:
        '\\maketitle'
        | '\\newline'
        | '\\hline'
        | '\\chapter' '{' nested_text '}'
        | '\\section' '{' nested_text '}'
        | '\\subsection' '{' nested_text '}'
        | '\\subsubsection' '{' nested_text '}'
        | '\\paragraph' '{' nested_text '}'
        | '\\subparagraph' '{' nested_text '}'
        | '\\textbf' '{' nested_text '}'
        | '\\textit' '{' nested_text '}'
        | '\\underline' '{' nested_text '}'
        | '\\texttt' '{' nested_text '}'
        | '\\label' '{' TEXT '}'
        | '\\ref' '{' TEXT '}'
        | '\\include' '{' TEXT '}'
        ;

    format_command: // New rule for formatting commands
        '\\textbf' '{' nested_text '}'
        | '\\textit' '{' nested_text '}'
        | '\\underline' '{' nested_text '}'
        | '\\texttt' '{' nested_text '}'
        ;

environment:
    BEGIN_itemize TEXT* (item)* END_itemize
    | BEGIN_enumerate TEXT* (item)* END_enumerate
    | BEGIN_center (nested_text | environment)* END_center
    | BEGIN_quote (nested_text | environment)* END_quote
    | BEGIN_tabular TAB_COL_SPEC ((table_content | TAB_ROW_SEP | HLINE | environment)*) END_tabular
    | BEGIN_description TEXT* (description_item)* END_description
    ;

description_item: '\\item' ('[' TEXT ']' (nested_text | environment) | (nested_text | environment)); // Modified item rule
item: '\\item' (nested_text | environment);
nested_text: (TEXT | ESCAPE_SEQ | format_command | '{' nested_text+ '}' | '&' | TAB_ROW_SEP)+;
table_content: (TEXT | ESCAPE_SEQ | '&')+;

    math_inline:
        '$' math_expr+ '$'
        | '\\(' math_expr+ '\\)'
        | '\\begin{math}' math_expr+ '\\end{math}'
        ;
    math_display:
        '\\[' math_expr* '\\]'
        | '\\begin{equation}' math_expr* '\\end{equation}'
        | '\\begin{displaymath}' math_expr* '\\end{displaymath}'
        ;

    math_expr:
        TEXT
        | NUMBER
        | '+' | '-' | '*' | '/'
        | '^' | '_'
        | '\\frac' '{' math_expr '}' '{' math_expr '}'
        | '(' math_expr ')'
        | '{' math_expr '}' // Allow curly braces for grouping
        | '\\' TEXT            // Allow backslashed commands
        | ESCAPE_SEQ_MATH     // Allow escaped characters within math
        | MATH_CMD           // More general math commands
        ;

    NUMBER: [0-9]+;