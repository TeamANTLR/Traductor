package model;

public class Variable {
    private String name = "";
    private String type;
    private String size = "";

    public Variable(){
    }

    public void setName(String name) {
        this.name += name;
    }

    public void setType(String type) throws RuntimeException{
        switch (type) {
            case "INTEGER": {
                this.type = "int";
                break;
            }
            case "REAL": {
                this.type = "float";
                break;
            }
            case "CHARACTER": {
                this.type = "char";
                break;
            }
            default: {
                if (type.contains("CHARACTER")) {
                    this.type = "char";
                    this.size = "[]";
                }
                else
                    throw new RuntimeException("El tipo devuelto no esta contemplado");
            }
        }
    }

    public void modType (String str) {
        if (str.equals("INOUT") || str.equals("OUT"))
            this.name = "*";
    }
    public void modSize(){
        this.name += "[]";
    }

    @Override
    public String toString(){
        return (this.type + ' ' + this.name + this.size);
    }
}
