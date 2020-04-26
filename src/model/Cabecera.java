package model;

import java.util.ArrayList;

public class Cabecera {
    private String returnType; //tipo que devuelve
    private String name; //nombre
    private ArrayList<Variable> vars;
    private boolean ok = false; //Si coinciden el nombre de la función en la apertura y cierre

    public Cabecera(){
        this.vars = new ArrayList<>();
        this.returnType = "void";
    }

    public void checkName(String str){
        ok = str.equals(name);
    }

    public void setReturnType(String returnType) throws RuntimeException{
        switch (returnType) {
            case "INTEGER": {this.returnType = "int"; break;}
            case "REAL": {this.returnType = "float"; break;}
            case "CHARACTER": {this.returnType = "char"; break;}
            default: throw new RuntimeException("El tipo devuelto no esta contemplado");
        }
    }

    public void setName(String name) {
        this.name = name;
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
