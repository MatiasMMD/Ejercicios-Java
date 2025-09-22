package Ej08;

public class Perro {
    // 2. Crea una clase Dog con un método bark() que imprima su sonido.
    // 3. Añade un constructor a la clase Dog que reciba raza y nombre.
    String raza;
    String nombre;

    public Perro (String raza, String nombre){
        this.raza = raza;
        this.nombre = nombre;
    } 

    public static void ladrar(){
        System.out.println("¡Woof Woof!");
    }
}
