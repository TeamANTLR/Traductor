package model;

public class Constante {
    public String constante = "";

    public Constante() {
    }   

    public void setName(String name) {
        this.constante += "#define " + name + " ";
    }
    
    public void setValue(String value) {
        this.constante += value + ";";
    }
    
    
}
