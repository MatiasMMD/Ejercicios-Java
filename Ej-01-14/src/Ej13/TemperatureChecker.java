package Ej13;

public class TemperatureChecker {
    // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
    public void checkTemperature(int temperature) throws TemperatureException{
        if (temperature < -50 || temperature > 50) {
            throw new TemperatureException("La temperatura tiene que estar entre -50° y 50°.");
        } else {
            System.out.println("Hacen " + temperature + "°");
        }
    }
}
