import java.util.ArrayList;
import java.util.Arrays;

public class Ej7 {
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        public static void bienvenida() {
            System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
        }

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        public static void saludar(String nombre) {
            System.out.println("¡Hola, " + nombre + "!");
        }

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        public static int resta(int a, int b){
            return a - b;
        }

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        public static int cuadradoNumero(int a){
            return a*a;
        }

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        public static String parImpar (int a){
            if (a % 2 ==0) {
                return "Es par";
            }
            return "Es impar";
        }

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        public static boolean mayorEdad (int a){
            if (a >= 18) {
                return true;
            }
            return false;
        }

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        public static int longitud(String nombre){
            return nombre.length();
        }

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        public static double mediaArray (int [] enteros){
            double sumaArray = 0;
            for (int y : enteros){
            sumaArray += y;
        }
        double media = sumaArray / enteros.length;
        return media;
        }

        // 9. Escribe un método que reciba un número y retorna su factorial.
        public static int factorial (int a){
           int resultadoFactorial = 1;

        for (int f = 1; f <= a; f++){
            resultadoFactorial = resultadoFactorial * f;
        }
        return resultadoFactorial;
        }

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento. 
        public static void mostrarAgentes (ArrayList<String> agentes){
            for (String i : agentes) {
                System.out.println(i);
            }
        }  


        public static void main (String [] args) {
        // 1.
        bienvenida();

        // 2.
        saludar("Matias");

        // 3. 
        System.out.println("El resultado de la resta es: " + resta(3, 2));

        // 4. 
        System.out.println("El resultado es " + cuadradoNumero(4));

        // 5. 
        System.out.println(parImpar(5));
        System.out.println(parImpar(2));

        // 6. 
        System.out.println("¿Es mayor de edad? " + mayorEdad(22));

        // 7. 
        System.out.println(longitud("Catalina"));

        // 8.
        int [] enteros = {1,2,3,4,5,6};
        System.out.println(mediaArray(enteros)); 

        // 9. 
        System.out.println(factorial(5));

        // 10.   
        mostrarAgentes(new ArrayList<>(Arrays.asList("Jett", "Omen", "Chamber", "Iso")));

    
    }
}