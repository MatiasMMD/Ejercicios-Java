package Ej11;

import java.util.ArrayList;

public class Ej11 {
    public static void main (String []args){
    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
    var dog = new Dog("Luli");
    var cat = new Cat("Obito");
    var cow = new Cow("Kakashi");

    var animals = new ArrayList<Animal>();
    animals.add(cat);
    animals.add(dog);
    animals.add(cow);

    for (Animal animal : animals) {
        animal.makeSound();
    }

    // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
    var circle = new Circle(6);
    var rectangle = new Rectangle();
    rectangle.setLenght(10);
    rectangle.setWidth(2);

    System.out.println(circle.calculateArea());
    System.out.println(rectangle.calculateArea());
     
    // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
    var printer = new Printer();
    printer.print("Matias", "Marino Dans");
    printer.print(3.5, 2.3);
    printer.print(3, 7);

    // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
    var greeter = new Greeter();
    greeter.greet();
    greeter.greet("Catalina");

    // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
    var car = new Car("Ford Maverick");
    var bike = new Bike("Venzo rodado 28");
    var truck = new Truck("Iveco 2000");

    var vehicles = new ArrayList<Vehicle>();
    vehicles.add(car);
    vehicles.add(bike);
    vehicles.add(truck);

    for (Vehicle vehicle : vehicles) {
        vehicle.start();
    }

    // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
    var notification = new Notification();
    var emailNotification = new EmailNotification();
    var wppNotification = new WppNotification();

    notification.sendNotification(notification);
    notification.sendNotification(wppNotification);
    notification.sendNotification(emailNotification);

    // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
    var animales = new Animal("Animal");
    var dogDos = new Dog("Caro");
    var catDos = new Cat("Madara");
    var cowDos = new Cow("Sasuke");
    var horse = new Horse("Sakura");

    animales.showAnimalType(dogDos);
    animales.showAnimalType(catDos);
    animales.showAnimalType(cowDos);
    animales.showAnimalType(horse);

    // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
    var converter = new Converter();

    converter.convert(7);
    converter.convert(7);
    converter.convert("Siete");

    // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
    var book = new Book("La oscuridad de las colores");
    book.setPrice(24000);
    book.setDiscount(10);

    var microwave = new Microwave("Philips J230X");
    microwave.setPrice(250000);
    microwave.setDiscount(25);

    System.out.println("El precio del libro es de $" + book.getPrice());
    System.out.println("El precio del microondas es de $" + microwave.getPrice());
    
    // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
    var warrior = new Warrior("Tute");
    var mage = new Mage("Tutezinho");
    var archer = new Archer("Tutanka");


    Character[] characters = {warrior, mage, archer};

    for (Character character : characters) {
        System.out.println(character.getName());
        character.attack();
    }
    }
}
