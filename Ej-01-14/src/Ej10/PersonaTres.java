package Ej10;

public class PersonaTres {
    // 2. Define una clase Person con los atributos name y age. 
    private String nombre;
    private int edad;

    public String getNombre(){
        return nombre;
    }

    public PersonaTres(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}
