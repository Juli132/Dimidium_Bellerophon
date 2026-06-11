// this progam was a tester for the Jupitore parser. it reads .jup files, extracts macros, and checks if they parse correctly using the ANTLR-generated lexer and parser.
// it reports any syntax errors and provides a summary of which macros succeeded or failed.
package testers;
import org.antlr.v4.runtime.*;
// THIS IS NOW DEPRECIATED OR WHATEVER THAT WORD IS. our favorite hardhitter is now GcodeVisitor and MarlinVisitor 

import jupitore.gen.*;
import jupitore.gen.JupitoreLexer;
import jupitore.gen.JupitoreParser;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
public class TestJupitore {

    // Parse ONE macro and return true if it parse is SUCCESSFULLLLL
    private static boolean parseMacro(String macroText, String macroName) {
        
        ANTLRInputStream input = new ANTLRInputStream(macroText);
        JupitoreLexer lexer = new JupitoreLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JupitoreParser parser = new JupitoreParser(tokens);

        final boolean[] hasError = {false};

        // Remove default error listeners...
        lexer.removeErrorListeners();
        parser.removeErrorListeners();

        BaseErrorListener errorListener = new BaseErrorListener() {
            @Override
            public void syntaxError(
                    Recognizer<?, ?> recognizer,
                    Object offendingSymbol,
                    int line,
                    int charPositionInLine,
                    String msg,
                    RecognitionException e
            ) {
                hasError[0] = true;
                System.err.println("[FAIL] Macro: " + macroName + " line " + line + ":" + charPositionInLine + " → " + msg);
            }
        };

        lexer.addErrorListener(errorListener);
        parser.addErrorListener(errorListener);

        try {
            parser.macro(); // parse only a single macro
        } catch (Exception e) {
            hasError[0] = true;
            System.err.println("[EXCEPTION] Macro: " + macroName + " → " + e.getMessage());
        }

        return !hasError[0];
    }

    // Main method to parse file macro by macro ;D
    public static void parseFile(String filename) throws IOException {
        System.out.println("\nParsing file: " + filename);

        String content = new String(Files.readAllBytes(Paths.get(filename)));

        // Capture each macro from M.title to M.end
        Pattern macroPattern = Pattern.compile("M\\.title\\s+\"[^\"]+\".*?M\\.end", Pattern.DOTALL);
        Matcher matcher = macroPattern.matcher(content);

        List<String> failed = new ArrayList<>();
        List<String> succeeded = new ArrayList<>();

        int lastIndex = 0;

        while (matcher.find()) {
            String macroText = matcher.group().trim();

            // Extract macro name
            Pattern titlePattern = Pattern.compile("M\\.title\\s+\"([^\"]+)\"");
            Matcher titleMatcher = titlePattern.matcher(macroText);
            String macroName = titleMatcher.find() ? titleMatcher.group(1) : "<Unknown>";

            // Check for anything between last macro end and this macro start
            String between = content.substring(lastIndex, matcher.start());
            String[] lines = between.split("\n");
            boolean stray = false;
            for (String line : lines) {
                String trimmed = line.trim();
                if (!trimmed.isEmpty() && !trimmed.startsWith("#")) {
                    stray = true;
                    break;
                }
            }
            if (stray) {
                System.err.println("[FAIL] Macro: " + macroName + " → stray code before M.title");
                failed.add(macroName);
                lastIndex = matcher.end();
                continue;
            }

            // Parse this 
            if (parseMacro(macroText, macroName)) {
                succeeded.add(macroName);
            } else {
                failed.add(macroName);
            }

            lastIndex = matcher.end();
        }

        // Print summary
        System.out.println("\n=========SUMMARRRYYYYYYYY===============");
        System.out.println("File: " + filename);
        System.out.println(" Successful macros: " + succeeded);
        System.out.println(" Failed macros: " + failed);
        System.out.println("========================\n");
    }

    public static void main(String[] args) throws IOException {
        parseFile("test_macro.jup");          // success cases
        parseFile("fail_test_macro.jup");     // failure cases
    }

    

}
