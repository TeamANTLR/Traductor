package model;

import java.util.ArrayList;

public class Cabecera {
    private String returnType; //tipo que devuelve
    private String name; //nombre
    private ArrayList<Variable> vars;
    private boolean ok = false; //Si coinciden el nombre de la función en la apertura y cierre

    public Cabecera(String name, String nameToCheck, String returnType){
        this.vars = new ArrayList<>();
        this.name = name;
        this.ok = nameToCheck.equals(this.name);
        this.returnType = returnType;
    }

    public void setVars(ArrayList<Variable> vars) {
        this.vars = vars;
    }

    public ArrayList<Variable> getVars() {
        return vars;
    }

    public void printCabecera() throws RuntimeException{
        if (!ok)
            throw new RuntimeException("Los nombres de las cabeceras no coinciden");
        System.out.print(returnType +' '+name+" ( ");
        int size = vars.size();
        if (size==0)
            System.out.print("void ");
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
