package Ej11;

public class Printer {
    // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
    public void print(String name, String surname){
        System.out.println("Mi nombre es " + name + " " + surname);
    }

    public void print(int a, int b){
        System.out.println(a * b);
    }

    public void print (double x, double y){
        System.out.println(x + y);
    }

}
