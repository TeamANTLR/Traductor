import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;
import org.antlr.v4.runtime.*;

public class FortranToC {

    public static void main(String[] args) throws IOException {
        
        // Preparar el fichero de entrada para asignarlo al analizador léxico
        CharStream input = CharStreams.fromFileName("EjemploSobresaliente.txt");

        // Crear el objeto correspondiente al analizador léxico con el fichero de entrada
        FortranToCLexer analex = new FortranToCLexer(input);
        // Identificar al analizador léxico como fuente de tokens para el sintactico
        CommonTokenStream tokens = new CommonTokenStream(analex);
        // Crear el objeto correspondiente al analizador sintáctico
        FortranToCParser parser = new FortranToCParser(tokens);
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new NewListener()); // add ours
        parser.prg(); // parse as usual

        //crear una clase raiz programa con constantes, cabeceras y bloques del main
        //pasarsela al Parser y y mostrarla con una llamada desde el main
    }
}
