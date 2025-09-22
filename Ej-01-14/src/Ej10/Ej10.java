package Ej10;

import java.util.ArrayList;

public class Ej10 {
    public static void main (String []args){  
        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        var auto = new AutoDos();
        auto.setNombre("Peugeot 208");
        auto.mover();
        System.out.println("El " + auto.getNombre() + " toca un " + auto.bocina());

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        var estudiante = new EstudianteTres("Matias", 22, 8);
        System.out.println(estudiante.getNombre() + " te sacaste un " + estudiante.getNota() + ". " + estudiante.estudiar());

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        var gato = new Gato();
        gato.hacerSonido();

        var perro = new PerroDos();
        perro.hacerSonido();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        var encargado = new Encargado("Matias", 2000000, "IT");
        System.out.println(encargado.getNombre() + " es el encargado del área de " + encargado.getAreaTrabajo() + " y cobra $" + encargado.getSalario());

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        var circulo = new Circulo(5);
        System.out.println(circulo.calcularArea());

        var rectangulo = new RectanguloDos(10,5);
        System.out.println(rectangulo.calcularArea());

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        var aguila = new Aguila("Manolo");
        aguila.volar();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        var telefono = new Telefono();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        var cajaAhorro = new CajaAhorro(50000, 15);
        cajaAhorro.retiro(20000);
        cajaAhorro.deposito(2000000);
        cajaAhorro.agregarInteres();

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        var autoTres = new AutoTres();
        autoTres.describir();

        var bicicleta = new Bicicleta();
        bicicleta.describir();

        var camion = new Camion();
        camion.describir();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        var perroDos = new PerroDos();
        perroDos.setNombre("Luli");

        var gatoDos = new Gato();
        gatoDos.setNombre("Obito");

        var pajaroDos = new Pajaro();
        pajaroDos.setNombre("Madara");

        var animales = new ArrayList<Animal>();
        animales.add(perroDos);
        animales.add(gatoDos);
        animales.add(pajaroDos);
    
        for (Animal animal : animales) {
            System.out.println(animal.getNombre());
            animal.hacerSonido();
        }

    }
}
