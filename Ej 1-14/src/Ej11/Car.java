package Ej11;

public class Car extends Vehicle{
    // 5. Luego crea Car, Bike y Truck que sobrescriban ese método.
    private String model;
    
    public Car(String model){
        super(model);
        this.model = model;
    }

    @Override
    public void start(){
        System.out.println("El auto enciende el motor y arranca");
    } 
}
