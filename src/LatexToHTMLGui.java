import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LatexToHTMLGui {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("LaTeX to HTML Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Layout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Input text area
        JTextArea inputTextArea = new JTextArea();
        JScrollPane inputScrollPane = new JScrollPane(inputTextArea);
        inputScrollPane.setBorder(BorderFactory.createTitledBorder("LaTeX Input"));
        panel.add(inputScrollPane, BorderLayout.CENTER);

        // Buttons panel
        JPanel buttonsPanel = new JPanel();

        JButton uploadButton = new JButton("Upload File");
        JButton convertButton = new JButton("Convert to HTML");
        JButton saveButton = new JButton("Save HTML to File");
        saveButton.setEnabled(false);

        buttonsPanel.add(uploadButton);
        buttonsPanel.add(convertButton);
        buttonsPanel.add(saveButton);

        panel.add(buttonsPanel, BorderLayout.SOUTH);

        // Output text area
        JTextArea outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        JScrollPane outputScrollPane = new JScrollPane(outputTextArea);
        outputScrollPane.setBorder(BorderFactory.createTitledBorder("HTML Output"));
        panel.add(outputScrollPane, BorderLayout.EAST);
        outputScrollPane.setPreferredSize(new Dimension(300, 0));

        frame.add(panel);
        frame.setVisible(true);

        // Event listeners
        uploadButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    inputTextArea.setText(reader.lines().reduce("", (a, b) -> a + "\n" + b));
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error reading file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        convertButton.addActionListener(e -> {
            String latexInput = inputTextArea.getText();
            if (latexInput.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter or upload LaTeX input.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                // Convert LaTeX to HTML
                CharStream input = CharStreams.fromString(latexInput);
                LaTeXSubsetLexer lexer = new LaTeXSubsetLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                LaTeXSubsetParser parser = new LaTeXSubsetParser(tokens);

                ParseTree tree = parser.latexDocument();
                LaTeXToHTMLConverter converter = new LaTeXToHTMLConverter();
                String htmlOutput = converter.visit(tree);

                outputTextArea.setText(htmlOutput);
                saveButton.setEnabled(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error during conversion: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        saveButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                    writer.write(outputTextArea.getText());
                    JOptionPane.showMessageDialog(frame, "HTML successfully saved.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
