package Ej11;

public class Truck extends Vehicle{
    // 5. Luego crea Car, Bike y Truck que sobrescriban ese método. 
    private String model;
    
    public Truck(String model){
        super(model);
        this.model = model;
    }

    @Override
    public void start(){
        System.out.println("Enciendo el motor y el camion arranca");
    }
}
