package model;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Programa {
    private ArrayList<Constante> constantes;
    private ArrayList<Cabecera> cabeceras;
    private ArrayList<String> sentencias;

    public void setConstantes(ArrayList<Constante> constantes) {
        this.constantes = constantes;
    }

    public void setCabeceras(ArrayList<Cabecera> cabeceras) {
        this.cabeceras = cabeceras;
    }

    public void setSentencias(ArrayList<String> sentencias) {
        this.sentencias = sentencias;
    }

    public void printPrograma () {
        constantes.forEach(cte -> {cte.printConstante();});
        System.out.println();
        cabeceras.forEach(cab -> {cab.printCabecera();});
        System.out.println();
        System.out.println("void main (void) {");
        printSentencias(sentencias);
    }

    private void printSentencias (ArrayList<String> sentencias) {
        String identacion = "\t";
        boolean insideCase = false;
        for (String sentencia: sentencias) {
            if (sentencia.startsWith("case") || sentencia.startsWith("default")) {
                if (!insideCase) {
                    System.out.println(identacion + sentencia);
                    identacion += "\t";
                    insideCase = true;
                } else {
                    System.out.println(identacion + sentencia);
                }
            }
            else if (sentencia.startsWith("break")) {
                identacion = identacion.substring(0, identacion.length() - 1);
                System.out.println(identacion + sentencia);
                insideCase = false;
            }
            else if (sentencia.contains("{") && sentencia.contains("}")) {
                identacion = identacion.substring(0, identacion.length()-1);
                System.out.println(identacion + sentencia);
                identacion += "\t";
            }
            else if (sentencia.contains("{")) {
                System.out.println(identacion + sentencia);
                identacion += "\t";
            }
            else if (sentencia.contains("}")) {
                if (insideCase) {
                    identacion = identacion.substring(0, identacion.length() - 1);
                    insideCase = false;
                }
                identacion = identacion.substring(0, identacion.length() - 1);
                System.out.println(identacion + sentencia);
            }
            else {
                System.out.println(identacion + sentencia);
            }
        }
    }
}
