package model;

import java.util.ArrayList;

public class Cabecera {
    public String ret; //tipo que devuelve
    public String name; //nombre
    public ArrayList<Variable> vars;
    private boolean ok = false; //Si coinciden el nombre de la función en la apertura y cierre

    public Cabecera(){
    }

    public void checkName(String str){
        if (str.equals(name))
            ok = true;
    }
    public void printCabecera() throws RuntimeException{
        if (!ok)
            throw new RuntimeException("Los nombres de las cabeceras no coinciden");
        System.out.print(ret+' '+name+" ( ");
        int size = vars.size();
        if (size==0)
            System.out.print(" void ");
        else {
            for(int i=0;i<size;i++) {
                System.out.print(vars.get(i).toString() + ' ');
                if (i < (size-1))
                    System.out.print(", ");
            }
        }
        System.out.println(");");
    }
}
