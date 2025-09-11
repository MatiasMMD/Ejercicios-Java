public class Ej2 {
    public static void main (String []args){
        // 1. Crea una variable con el resultado de cada operación aritmética.
        var a = 3;
        var b = 2;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        // 2. Crea una variable para cada tipo de operación de asignación.
        a = b;
        System.out.println(a);

        a = a * 2;
        System.out.println(a);

        a += 1;
        System.out.println(a);

        a -= 3;
        System.out.println(a);

        a *= 3;
        System.out.println(a);

        a /= 2;
        System.out.println(a);

        a %= 1;
        System.out.println(a);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a != 4);
        System.out.println(a <= b);
        System.out.println(a < 7);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(a == b);
        System.out.println(7 < b);
        System.out.println(a >= 1);

        // 5. Utiliza el operador lógico and.
        System.out.println(a <= 1 && a != 0);

        // 6. Utiliza el operador lógico or.
        System.out.println(b<4 || b==1);

        // 7. Combina ambos operadores lógicos.
        System.out.println(a != b || b > 8 && 8>a);

        // 8. Añade alguna negación.
        System.out.println(a != b || !(b > 8) && 8>a);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(-a);
        System.out.println(++a);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println("El valor de a = " + a);
        System.out.println("El valor de b = " + b);
        System.out.println(a + b == b + a && a - 1 <= b);
    } 

}
