package Ej13;

public class Ej13 {
    public static void main (String[]args){
    // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
    var a = 4;
    var b = 0;

    try {
       var result = a / b;
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        System.out.println("Ingrese divisor válido");
    }

    // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
    String [] names = {"Catalina", "Matias", "Susi"};
    
    try {
        System.out.println(names[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error: " + e.getMessage());
    }

    // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
    String ahre = null;

    try {
        System.out.println(ahre.length());
    } catch (NullPointerException e) {
        System.out.println("Error: " + e.getMessage());
    }

    // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
    var textNumber = new TextoNumero();

    try {
        System.out.println(textNumber.textoANumero("3"));
    } catch (NumberFormatException e) {
        System.out.println("Error: " + e.getMessage());
    }

    try {
        System.out.println(textNumber.textoANumero("Tres"));
    } catch (NumberFormatException e) {
        System.out.println("Error: " + e.getMessage());
    }

    // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
    String name = null;
    
    try {
        System.out.println(name.charAt(1));
    } catch (NullPointerException e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        System.out.println("Finalizo el bloque try-catch");
    }

    // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
    var exception = new Throw();

    try {
        exception.checkNumber(-7);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
    
    try {
        exception.checkNumber(7);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

    // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
    var temperatura = new TemperatureChecker();

    try {
        temperatura.checkTemperature(60);
    } catch (TemperatureException e) {
        System.out.println("Error: " + e.getMessage());
    }

    try {
        temperatura.checkTemperature(16);
    } catch (TemperatureException e) {
        System.out.println("Error: " + e.getMessage());
    }

    // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
    int x = 5;
    int y = 5;

    String [] rango = {"Diamante", "Ascendente", "Inmortal"};

    try {
        int resultDos = x / y;
        System.out.println(resultDos);

        System.out.println(rango[3]);
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error: " + e.getMessage());
    }

    // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
    var contraseña = new CheckPassword();

    try {
        contraseña.checkPassword("Tute");
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

    try {
        contraseña.checkPassword("MatiasMMD");
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

    // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
    var userUno = new LoginSystem("EsElPeipper", "remolino123");
    var userDos = new LoginSystem("alfafredy", "remera123");

    try {
        userUno.login("EsElPeipper", "remolino");
    } catch (LoginFailedException e) {
        System.out.println("Error: " + e.getMessage());
    }

    try {
        userDos.login("EsElPeipper", "remolino123");
    } catch (LoginFailedException e) {
        System.out.println("Error: " + e.getMessage());
    }

        try {
        userDos.login("alfafredy", "remera123");
    } catch (LoginFailedException e) {
        System.out.println("Error: " + e.getMessage());
    }

    }
}
