package Ej01;
public class Ej1 {
    public static void main (String[]args) {
        //1 declarar variable String
        String nombre = "Matias"; 
        System.out.println (nombre);

        //1.1 modifico la variable de nombre
        nombre="Marino Dans";  
        System.out.println(nombre);

        //2 declarar variable integer
        int edad= 22;  
        System.out.println(edad);

        //3 double punto flotante (numero con coma)
        double altura = 1.79;       
        System.out.println(altura);

        //4 boolean
        boolean programarBoolean = true;
        System.out.println("¿Me gusta programar? " + programarBoolean);

        //5 constante
        final String EMAIL = "mmarinodans@gmail.com";  
        System.out.println(EMAIL);
        
        //6 char
        char inicial = 'M';  
        System.out.println(inicial);

        //7 declaro variable y la modifico
        String barrio = "Mataderos"; 
        barrio = "Liniers";
        System.out.println(barrio);

        //8 sumar 2 int a y b
        int a = 22;  
        int b = 22;
        System.out.println (a+b);

        //imprimir el tipo de dos variables crreadas anteriormente
        System.out.println(nombre+ " " + barrio);
    }
}