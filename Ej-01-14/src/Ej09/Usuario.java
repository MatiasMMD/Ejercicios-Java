package Ej09;

public class Usuario {
    // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
    private String usuario;
    private String contraseña;

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

     public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }

    public String checkContraseña(String valideContraseña){
        if (valideContraseña.equals(contraseña)) {
            return "Sesión correctamente iniciada.";
        } return "Contraseña incorrecta.";
    }
}
