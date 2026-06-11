package testers;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import jupitore.gen.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import maindeveloper.GCodeVisitor;
import maindeveloper.MarlinVisitor;
// this is not part of the project, just a driver to test the code for the grader. 
public class Driver {
    public static void main(String[] args) throws Exception {
        // check if filename is used! just in case 
        if (args.length == 0) {
            System.err.println("Usage: ./Micro.sh <input_file>");
            return;
        }

        String filename = args[0];
        String inputText = Files.readString(Paths.get(filename));
        
        CharStream input = CharStreams.fromString(inputText);
        JupitoreLexer lexer = new JupitoreLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        JupitoreParser parser = new JupitoreParser(tokens);
        ParseTree tree = parser.program();
        
        // Pass default hardware limits (e.g., 300x300x300)
        // just going to pass default limits here since we dont have the UI available
       // GCodeVisitor visitor = new GCodeVisitor(300, 300, 300);
        
      
      //  String gcode = visitor.visit(tree);

        // This is what the grader's 'diff' command will look at
       // System.out.println(gcode);
    }
}