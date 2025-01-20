- ONLY use $$ for inline math, and \[\] for display math.
- Nesting is handled very poorly
# **1. Lexical Analysis:**

Lexical analysis defines the rules for tokenizing the input text. The lexer identifies basic units (tokens) from the input LaTeX document. Key points include:

- **Token Definitions**:
    - **Command Tokens**: Tokens like `BEGIN_itemize`, `END_itemize`, and `MATH_CMD` identify LaTeX commands (e.g., `\begin{itemize}` or `\math`).
    - **Environment Tokens**: Tokens for environments like `BEGIN_tabular` and `END_tabular`.
    - **Special Characters and Escapes**: Handles escaped sequences (e.g., `\&`, `\%`) and math-related symbols.
    - **Whitespace and Comments**: Whitespace (`WS`) and comments (`COMMENT`) are ignored using lexer rules with the `-> skip` directive.

---

# **2. Syntactic Analysis:**

Syntactic analysis defines the rules for parsing sequences of tokens into a structured representation (parse tree). It ensures that the LaTeX syntax adheres to the grammar. Key aspects include:

- **Document Structure**:
    
    - A LaTeX document (`latexDocument`) comprises a `preamble` followed by a `document` body, ending with `EOF`.
- **Preamble**:
    
    - Defines metadata like `\title`, `\author`, `\date`, and document class via rules such as `documentclass` and `usepackage`.
- **Commands**:
    
    - Specific rules for commands like `\section`, `\textbf`, and `\maketitle` map LaTeX commands to their syntactic constructs.
    - General commands are defined under `command` and `format_command`.
- **Environments**:
    
    - Handles environments like `itemize`, `enumerate`, `description`, and `tabular` using environment rules.
- **Math Expressions**:
    
    - Inline (`math_inline`) and display (`math_display`) math expressions are parsed separately. Nested math structures and common operators are supported.
- **Nesting and Content**:
    
    - Handles nested structures like `{...}` within `nested_text`, and ensures proper scoping of content.


# Semantic Analysis

1. **Structural Validation**:
    
    - Ensures the presence and proper sequence of critical commands, such as `\maketitle`.
    - Issues warnings for semantic inconsistencies, like using `\chapter` in an `article` class document.
2. **Context Management**:
    
    - Tracks document metadata (e.g., `\title`, `\author`, `\date`) and ensures these are processed correctly.
    - Maintains context for sections, subsections, and labels to support referencing (`\ref`).
3. **Command Semantics**:
    
    - Maps LaTeX commands to appropriate HTML elements (`\section` to `<h1>`, `\textbf` to `<strong>`, etc.).
    - Issues warnings for unknown or misused commands.
4. **Environment Handling**:
    
    - Converts LaTeX environments (e.g., `itemize`, `enumerate`, `tabular`) to corresponding HTML structures (`<ul>`, `<ol>`, `<table>`).
    - Handles nested or context-specific content in these environments.
5. **Error Reporting**:
    
    - Logs warnings for semantic violations, such as missing labels or undefined references.

By integrating semantic checks with HTML generation, the program ensures that both the output's structure and the document's logical consistency are preserved.
