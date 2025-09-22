package Ej9;

public class PersonaDos {
    // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
       private String nombre;
       private int edad;

    public PersonaDos(String nombre, int edad){
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public void setNombre(String nombre){
       if (nombre.length() > 0) {
        this.nombre = nombre;
       } else {
        System.out.println("Nombre inválido.");
       }
    }

    public void setEdad(int edad){
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida.");
        }
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
}
