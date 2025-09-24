package Ej14;

public class User {
    // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
    final private String APPNAME = "Valorant";
    static String user = "tute"; 

    public void showUserGame (){
    System.out.println("Me llamo " + user + " en el " + APPNAME);
    }
}
