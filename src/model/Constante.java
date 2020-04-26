package model;

public class Constante {
    private String name;
    private String value;

    public Constante(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void printConstante () {
        System.out.println("#define " + this.name + " " + this.value + ";");
    }
    
    
}
