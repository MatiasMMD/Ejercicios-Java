package Ej14;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ej14 {
    static String message = "Global";
    public static void main(String[] args) {
    // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
    String name = null;
    try {
        System.out.println(name.isEmpty());
    } catch (NullPointerException e) {
        System.out.println("Error: " + e.getMessage());
    }

    // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
    var scanner = new Scanner(System.in);
    var ageException = new AgeException();
    int age;

    System.out.println("Introduce tu nombre y apellido: ");
    name = scanner.nextLine();
    
    System.out.println("Introduce tu edad: ");

    try {
        age = scanner.nextInt();
        ageException.checkAge(age);
    } catch (InputMismatchException e) {
        System.out.println("Error: " + e.getMessage());
        throw new InputMismatchException("Ingrese una edad válida.");
    }
    
    System.out.println("Te llamas " + name + " y tenes " + age + " años.");

    // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
    final int maxScore = 100;
    System.out.println("Tu nota es " + maxScore);

    // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
    var message = "Local";
    System.out.println("Variable: " + Ej14.message + " y Varibale: " + message);
 
    // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
     var number = scanner.nextInt();

    if (number < 0) {
        System.out.println("Es negativo");
    } else {
        System.out.println("Es positivo");
    } 

    // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
    System.out.println("Mi perra se llama " + Dog.name + " y es una " + Dog.raza); 

    // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
    var randomizer = new Random();
    var randomNum = randomizer.nextInt(10);
    randomNum += 1;

    System.out.println(randomNum);

    // 8. Crea una clase con comentarios adecuados explicando cada sección del código.
    //Indicador para entender que atributo poner.
    //Con el scanner (instanciado mas arriba en el ej 2.), hago que el usuario ingrese sus datos personalizados
    System.out.println("Ingrese su nombre: ");            
    var personName = scanner.nextLine();                   
    System.out.println("Ingrese su DNI: ");
    var personDNI = scanner.nextLine();
    System.out.println("Ingrese su edad: ");
    int personAge;

    //try & catch estandar con una excpeción personalizada (instanciada mas arriba y creada en la clase AgeException) para que el age no pueda ser negativo.
    try {                                                 
        personAge = scanner.nextInt();
        ageException.checkAge(personAge);
    } catch (InputMismatchException e) {
        System.out.println("Error: " + e.getMessage());
        throw new InputMismatchException("Ingrese una edad válida.");
    }

    //Creo el objeto person a partir de la clase
    var person = new Person(personName, personAge, personDNI);

    //Utilizo las funciones que cree en la clase Person.
    person.greet("Catalina");
    System.out.println("Me llamo " + personName + " tengo " + personAge + " y mi DNI es " + personDNI);
    person.eat("Alfajaro de chocotorta"); 

    // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
    var user = new User();
    user.showUserGame();

    // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.
    
    }
}
