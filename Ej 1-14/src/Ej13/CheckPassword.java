package Ej13;

public class CheckPassword {
    // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
    public void checkPassword(String pass) throws IllegalArgumentException{
        if (pass.length() < 6){
            throw new IllegalArgumentException("La contraseña es muy corta, ingrese una contraseña valida.");
        } else {
            System.out.println("Su nueva contraseña es: " + pass);
        }
    }
}
