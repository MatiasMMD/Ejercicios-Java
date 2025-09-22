package Ej12;

public class Ej12 {
    public static void main (String []args){
    // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
    var circulo = new Circle(4);
    var rectangulo = new Rectangle(2,6);

    circulo.calculateArea();
    rectangulo.calculateArea();
    
    // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
    var guitarra = new Guitar();
    guitarra.setGuitar("Slash");
    guitarra.play();

    var piano = new Piano();
    piano.setPiano("Yamaha");
    piano.play();

    // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
    var perro = new Dog("Luli");
    var gato = new Cat("Obito");
    Animal animales [] = {perro, gato};

    for (Animal animal : animales) {
        animal.makeSound();
    }

    // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
    var circuloDos = new Circle(2);
    var cuadrado = new Square();
    var triangulo = new Triangle();

    circuloDos.draw();
    cuadrado.draw();
    triangulo.draw();

    // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
    var empleadoUno = new FullTimeEmployee("Matias", 2000000);
    var empleadoDos = new PartTimeEmployee("Tute", 850000);

    System.out.println("El salario es de $" + empleadoUno.calculateSalary());
    System.out.println("El salario es de $" + empleadoDos.calculateSalary());

    // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
    var auto = new Car();
    var robot = new Robot();

    auto.move();
    robot.move();

    // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
    var television = new TV();
    var lavavajilla = new WashingMachine();

    television.turnOn();
    television.turnOff();

    lavavajilla.turnOn();
    lavavajilla.turnOff();

    // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
    var pato = new Duck();
    pato.setName("Pato lucas");
    pato.fly();
    pato.swim();

    // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
    var pdf = new PDFDocument();
    var word = new WordDocument();

    pdf.print();
    word.print();

    // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
    var factura = new Invoice();
    var pago = new EmployeePayment();

    factura.pay();
    pago.pay();
    }
}
