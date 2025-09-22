package Ej13;

public class LoginSystem {
    // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
    private String user;
    private String password;

    public LoginSystem (String user, String password){
        this.user = user;
        this.password = password;
    }

    public void login(String usuario, String contraseña) throws LoginFailedException{
        if (user.equals(usuario) && password.equals(contraseña)) {
            System.out.println("Sesión iniciada correctamente.");
        } else {
            throw new LoginFailedException("Usuario o contraseña inválido.");
        }
    }
}
