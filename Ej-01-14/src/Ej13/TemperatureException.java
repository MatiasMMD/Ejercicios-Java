package Ej13;

public class TemperatureException extends Exception{
    // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
    public TemperatureException (String message){
        super(message);
    }
}
