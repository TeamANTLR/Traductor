package model;

public class Variable {
    private String name;
    private String type;
    private String size = "";

    public Variable(String name, String type, String size){
        this.name = name;
        if (!size.isEmpty()) {
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
