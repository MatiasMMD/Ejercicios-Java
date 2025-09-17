package Ej11;

public class Greeter {
    // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
    public void greet(){
        System.out.println("Hola, ¿Como andas?");
    }

    public void greet(String nombre){
        System.out.println("Hola " + nombre + ", ¿Como andas?");
    }
}
