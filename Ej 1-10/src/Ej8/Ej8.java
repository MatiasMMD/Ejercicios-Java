package Ej8;

import java.util.ArrayList;

public class Ej8 {
    public static void main (String []args){
        // 1. Crea un objeto y muestra sus datos.
        var libro = new Libro("La oscuridad de los colores", "Martin Blasco");
        System.out.println("El nombre del libro es: " + libro.titulo + " " + "escrito por " + libro.autor + ".");

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var perro = new Perro("Labrador", "Luli");
        Perro.ladrar();

        // 3. Añade un constructor a la clase Dog que reciba raza y nombre.
        var perroDos = new Perro("Labrador", "Caro");
        System.out.println(perroDos.nombre + " es un " + perroDos.raza);

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        var auto = new Auto("Peugeot","208");
        auto.mostrarDatos();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var estudiante = new Estudiante(8,"Catalina");
        System.out.println(estudiante.calificacion());

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var cuentaDeBanco = new CuentaDeBanco(2900000, 890000);
        cuentaDeBanco.deposito();

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangulo = new Rectangulo(5,10);
        System.out.println(rectangulo.perimetroR());
        System.out.println(rectangulo.areaR());

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var empleado = new Empleado("Matias", 1200000);
        empleado.salario();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        var personaUno = new Persona("Matias");
        var personaDos = new Persona("Catalina");
        var personaTres = new Persona("Benjamin");
        var personaCuatro = new Persona("Marta");
        var personaCinco = new Persona("Suzi");

        var personas = new ArrayList<>();
        personas.add(personaUno);
        personas.add(personaDos);
        personas.add(personaTres);
        personas.add(personaCuatro);
        personas.add(personaCinco);

        System.out.println(personas);

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var producto = new Producto(320000, 25);
        producto.descuentoR();
    }

}
