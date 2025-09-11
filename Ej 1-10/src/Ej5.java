import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Ej5 {
    public static void main (String [] args){     
        // 1. Crea un Array con 5 valores e imprime su longitud.
        int [] edad = {18,28,8,14,16};
        System.out.println(edad.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(edad[3]);
        edad [3] = 38;
        System.out.println(edad[3]);

        // 3. Crea un ArrayList vacío.
        var nombres = new ArrayList<String>();
        System.out.println(nombres.isEmpty());

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        nombres.add("Benjamin");
        nombres.add("Franco");
        nombres.add("Mariano");
        nombres.add("Lucas");
        System.out.println(nombres);
        nombres.remove(1);
        System.out.println(nombres);

        // 5. Crea un HashSet con 2 valores diferentes.
        var winrateValo = new HashSet<Integer>();
        winrateValo.add(57);
        winrateValo.add(48);
        System.out.println(winrateValo);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        winrateValo.add(57);
        winrateValo.add(67);
        System.out.println(winrateValo);

        // 7. Elimina uno de los elementos del HashSet.
        winrateValo.remove(67);
        System.out.println(winrateValo);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var contactos = new HashMap<String, Integer>();
        contactos.put("Matias", 1111111111);
        contactos.put("Catalina", 1154034779);
        contactos.put("Jett", 1142006900);
        System.out.println(contactos);

        // 9. Modifica uno de los contactos y elimina otro.
        contactos.replace("Matias", 1132691016);
        contactos.remove("Jett", 1142006900);
        System.out.println(contactos);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] agentesValoArray = {"Clove", "Omen", "Brimstone", "Astra", "Harbor", "Clove"};
        System.out.println(agentesValoArray.length);
        System.out.println(agentesValoArray[0] + " " + agentesValoArray[1] + " "+ agentesValoArray[2] + " " + agentesValoArray[3] + " " + agentesValoArray[4] + " " + agentesValoArray[5]);

        var agentesValoList = new ArrayList<String>(Arrays.asList(agentesValoArray));
        System.out.println(agentesValoList);

        var agentesValoSet = new HashSet<String>(agentesValoList);
        System.out.println(agentesValoSet);

        var agentesValoMap = new HashMap<String,String>();
        for (String elemento : agentesValoSet){
            agentesValoMap.put(elemento, elemento);
        }
        System.out.println(agentesValoMap);
    }

}
