package model;

public class Variable {
    private String name;
    private String type;
    private String size = "";

    public Variable(String name, String type, String inOut){
        if (inOut.equals("INOUT") || inOut.equals("OUT"))
            this.name = "*" + name;
        else
            this.name = name;

        if (type.contains("(")) {
            this.name += "[]";
            this.type = "char";
        } else
            this.type = type;
    }

    @Override
    public String toString(){
        return (this.type + ' ' + this.name + this.size);
    }
}
