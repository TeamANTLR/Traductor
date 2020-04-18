package model;

public class Variable {
    public String name;
    public String type;

    public Variable(){
    }

    public void modType(String str){
        if (str.equals("INOUT") || str.equals("OUT"))
            type = '*'+type;
    }
    public void modSize(){
        name += "[]";
    }

    @Override
    public String toString(){
        return (type+' '+name);
    }
}
