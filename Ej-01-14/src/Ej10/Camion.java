package Ej10;

public class Camion extends VehiculoDos {
    // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
    @Override
    public void describir(){
        System.out.println("Un camion es un metodo de transporte de mercaderia de cuatro ruedas");
    }
}
