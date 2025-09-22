package Ej04;
public class Ej4 {
    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 22;
        if (edad>= 18) {
            System.out.println("Podes votar!");
        } else{
            System.out.println("No podes votar :(");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int X = 22;
        var Y = 23;

        if (X<Y) {
            System.out.println("X es menor que Y");
        } else if (X>Y) {
            System.out.println("X es mayor que Y");
        } else {
            System.out.println("X es igual a Y");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int Z = -32;

       if (Z>0) {
        System.out.println("Z es positivo");
       } else if (Z<0) {
        System.out.println("Z es negativo");
       } else{
        System.out.println("Z es igual a cero");
       }

        // 4. Crea un programa que diga si un número es par o impar.
        int numero = 44;

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int Q = 121;

        if (Q>=1 && Q<=100) {
            System.out.println("Q esta entre 1 y 100");
        } else {
            System.out.println("Q no esta entre 1 y 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int dias = 4;

        switch (dias) {
            case 1:
                System.out.println("Hoy es Lunes");
                break;

            case 2:
                System.out.println("Hoy es Martes");
                break;

            case 3:
                System.out.println("Hoy es Miercoles");
                break;

            case 4:
                System.out.println("Hoy es Jueves");
                break;

            case 5:
                System.out.println("Hoy es Viernes");
                break;

            case 6:
                System.out.println("Hoy es Sabado");
                break;

            case 7:
                System.out.println("Hoy es Domingo");
                break;

            default:
                System.out.println("Inserte un número entre 1 y 7");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 100;

        if (nota>=90) {
            System.out.println("Sobresaliente");
        } else if (nota<=89 && nota >=60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int persona = 13;
        boolean acompañante = false;

        if (persona>=15 || acompañante) {
            System.out.println("Podes entrar al cine");
        } else {
            System.out.println("No podes entrar al cine");
        }

        //El mismo ejercicio con operador ternario.
        String mensaje = (persona>=15 || acompañante) ? "Podes entrar al cine" : "No podes entrar al cine";
        System.out.println(mensaje);

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'M';

        switch (letra) {
            case 'A':
                System.out.println(letra + " Es una vocal");
                break;
        
            case 'E':
                System.out.println(letra + " Es una vocal");
                break;
              
            case 'I':
                System.out.println(letra + " Es una vocal");
                break;
            
            case 'O':
                System.out.println(letra + " Es una vocal");
                break;
        
            case 'U':
                System.out.println(letra + " Es una vocal");
                break;
            
            case 'a':
                System.out.println(letra + " Es una vocal");
                break;
        
            case 'e':
                System.out.println(letra + " Es una vocal");
                break;
              
            case 'i':
                System.out.println(letra + " Es una vocal");
                break;
            
            case 'o':
                System.out.println(letra + " Es una vocal");
                break;
        
            case 'u':
                System.out.println(letra + " Es una vocal");
                break;
                            
            default:
            System.out.println(letra + " Es una consonante");
                break;
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 18;
        int b = 28;
        int c = 8;

        if (a>b && a>c) {
            System.out.println("a es el mayor de los tres");
        } else if (b>a && b>c) {
            System.out.println("b es el mayor de los tres");
        } else if (c>a && c>b) {
            System.out.println("c es el mayor de los tres");
        } else {
            System.out.println("Son iguales");
        }

}
}