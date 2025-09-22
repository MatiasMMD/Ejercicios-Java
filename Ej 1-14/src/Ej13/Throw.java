package Ej13;

public class Throw {
    // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
    public void checkNumber (int number) throws IllegalArgumentException{
        if (number < 0) {
            throw new IllegalArgumentException("Ingrese un número valido.");
        } else {
            System.out.println(number + " es positivo.");
        }
    }
}
