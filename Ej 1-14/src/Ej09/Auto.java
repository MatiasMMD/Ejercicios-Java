package Ej09;

public class Auto {
    // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
    private int velocidad;
    private boolean velocidadLimite = false;

    public void setVelocidad(int velocidad){
        if (velocidad <= 120 && velocidad >= 0) {
            this.velocidad = velocidad;
            velocidadLimite = true;
        } else {
            System.out.println("Ingrese una velocidad válida.");
        }
        }

    public String acelerar(int amountA){
        if (velocidadLimite == true){
        if ((velocidad + amountA) <= 120) {
            velocidad += amountA;
            return "Estas a " + velocidad + "K/H.";
        } 
        } return "Ingrese una aceleración válida.";
    }

    public String frenar(int amountF){
        if (velocidadLimite == true){
        if ((velocidad - amountF) >= 0) {
            velocidad -= amountF;
            return "Estas a " + velocidad + "K/H.";
        }
        } return "Ingrese una desaceleración válida.";
    }
}
