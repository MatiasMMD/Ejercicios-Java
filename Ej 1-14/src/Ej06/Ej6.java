package Ej06;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ej6 {
    public static void main (String [] args){
        // 1. Imprime los números del 1 al 10 usando while.
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        int pj = 0;
        var personajesGuilty = new ArrayList<String>();
        personajesGuilty.add("Ky Kiske");
        personajesGuilty.add("Slayer");
        personajesGuilty.add("Lucy");
        personajesGuilty.add("Happy Chaos");

        do {
            System.out.println(personajesGuilty.get(pj));
            pj++;
        } while (pj < personajesGuilty.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int i = 5; i <= 50; i+=5){
            System.out.println(i);
        }

        for (int x = 1; x<=50; x++){
            if (x % 5 == 0 ) {
                System.out.println(x);   
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int [] numeros = {1,2,3,4,5};

        for (int y : numeros) {
            System.out.println(y); 
        }

        int sumaArray = 0;
        for (int y : numeros){
            sumaArray += y;
        }
        System.out.println(sumaArray); 

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String [] borralo = {"tute", "tito", "iGussz", "200GIAN"};
          for (String y : borralo) {
            System.out.println(y); 
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        var winrateValo = new HashSet<Integer>();
        winrateValo.add(57);
        winrateValo.add(48);
        winrateValo.add(67);
        
        var contactos = new HashMap<String, Integer>();
        contactos.put("Matias", 1132691016);
        contactos.put("Catalina", 1154034779);
        contactos.put("Jett", 1142006900);

        for (Integer integer : winrateValo) {
            System.out.println("El winrate es " + integer);
        }

        for (Map.Entry <String, Integer> contacto : contactos.entrySet()) {
            System.out.println(contacto);
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int u = 10; u >= 1; u--){
            System.out.println(u);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int t = 1; t<=20; t++){
            if (t % 3 == 0) {
                continue;
            }
        System.out.println(t);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] numerosDos = {2,3,4,-5,6,0};

        for (int numeroNegativo : numerosDos){
            if (numeroNegativo < 0) {
                break;
            }
        System.out.println(numeroNegativo);    
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int numeroDado = 5;
        int resultadoFactorial = 1;

        for (int f = 1; f <= numeroDado; f++){
            resultadoFactorial = resultadoFactorial * f;
        }
        System.out.println(resultadoFactorial);
    }

}
