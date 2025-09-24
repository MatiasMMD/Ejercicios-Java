package Ej14;


public class AgeException {
    // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
    public void checkAge (int age) throws IllegalArgumentException {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Ingrese una edad válida");
        }
    }
}
