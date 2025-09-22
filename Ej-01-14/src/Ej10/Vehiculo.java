package Ej10;

public class Vehiculo {
    // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
    private String nombre;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void mover(){
        System.out.println("El " + nombre + " se mueve");
    }

}
