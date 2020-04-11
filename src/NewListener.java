import java.util.HashSet;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class NewListener extends BaseErrorListener {

    HashSet<String> set = new HashSet<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        if (!set.contains(Integer.toString(line) + Integer.toString(charPositionInLine))) { //solo un error por linea+columna
            set.add(Integer.toString(line) + Integer.toString(charPositionInLine));
        
            String excepcion;
            try {
                excepcion = e.getClass().toString().substring(e.getClass().toString().lastIndexOf(".") + 1, e.getClass().toString().length());
            } catch (NullPointerException noExcepcion) {
                //recuperable, sin excepcion
                if (msg.contains("missing")) {
                    excepcion = "MissingTokenException";
                } else if (msg.contains("extraneous"))
                    excepcion = "ExtraneousTokenException";
                else
                    excepcion = "";
            }
            String mensajeDeExcepcion = "";
            switch (excepcion) {
                case ("InputMismatchException"): { //Faltan o sobran tokens
                    String[] wrongToken = msg.split("expecting");
                    mensajeDeExcepcion += "se esperaba lo siguiente" + wrongToken[1];
                    break;
                }
                case ("MissingTokenException"): { //Falta un único token
                    msg = msg.replace("missing", "falta");
                    msg = msg.replace("at", "en");
                    mensajeDeExcepcion = "Error recuperable, " + msg;
                    break;
                }
                case ("ExtraneousTokenException"): { //Sobra un único token
                    msg = msg.replace("extraneous input", "sobra el elemento");
                    msg = msg.replace("expecting", "se esperaba");
                    mensajeDeExcepcion = "Error recuperable, " + msg;
                    break;
                }
                case ("NoViableAltException"): {
                    mensajeDeExcepcion += "Error recuperable, no hay alternativa viable, revisa posibles ambigüedades.";
                    break;
                }
                case ("FailedPredicateException"): {
                    mensajeDeExcepcion += "predicado fallido a la hora de evaluarlo";
                    break;
                }
                default: {
                    mensajeDeExcepcion += "not supported--------" + excepcion + "-------" + msg;
                }
            }

            //Obtener el token que causo el problema, se guarda en wrongToken
            String wrongToken = offendingSymbol.toString().substring(offendingSymbol.toString().indexOf("=") + 1, offendingSymbol.toString().length());
            wrongToken = wrongToken.substring(0, wrongToken.indexOf("<") - 1);


            System.err.println("Error encontrado en la linea " + line + ", detectado al evaluar la columna " + charPositionInLine + " con la entrada " +
                    wrongToken + ": " + mensajeDeExcepcion);

        }

    }

}
