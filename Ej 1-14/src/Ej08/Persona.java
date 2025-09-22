package Ej08;

public class Persona {
    // 9. Crea varios objetos Person y guárdalos en un ArrayList.
    String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

        @Override
    public String toString() {
        return nombre;
    }
}
