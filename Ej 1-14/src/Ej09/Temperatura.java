package Ej09;

public class Temperatura {
    // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
    private double celsius;

    public void setCelsius(double celsius){
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;            
        } else {
            System.out.println("Ingrese una temperatura válida");
        }
    }

    public double getCelsius(){
        return celsius;
    }
}
