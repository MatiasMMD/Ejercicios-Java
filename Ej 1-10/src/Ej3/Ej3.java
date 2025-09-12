package Ej3;
public class Ej3 {
    public static void main (String [] args){
        String nombreUno = "Peipper";
        String nombreDos = "Doblep";
        // 1. Concatena dos cadenas de texto.
        System.out.println(nombreUno + " y " + nombreDos);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(nombreUno.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(nombreDos.charAt(0));
        System.out.println(nombreDos.charAt(nombreDos.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(nombreUno.toLowerCase());
        System.out.println(nombreDos.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(nombreUno.contains("ip"));
        System.out.println(nombreDos.contains("dob"));
        System.out.println(nombreDos.toLowerCase().contains("dob"));

        // 6. Formatea un string con un entero.
        int edadUno = 21;
        int edadDos = 24;
        System.out.println(String.format("%s tiene %d años.", nombreUno, edadUno));
        System.out.println(String.format("%s tiene %d años.", nombreDos, edadDos));
        
        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(String.format("    %s es mi cantante favorito. ", nombreDos).trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(String.format(" Es El %s es mi segundo cantante favorito ", nombreUno).replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(nombreUno.equals(nombreDos));
        System.out.println(nombreUno == nombreDos);

        // 10. Comprueba si dos strings tienen la misma longitud.  
        System.out.println(nombreUno.length() == nombreDos.length());    
        System.out.println(nombreUno.length() == nombreUno.length());  
    }

}
