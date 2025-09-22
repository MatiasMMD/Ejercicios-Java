package Ej11;

public class Bike extends Vehicle{
    // 5. Luego crea Car, Bike y Truck que sobrescriban ese método.
    private String model;
    
    public Bike(String model){
        super(model);
        this.model = model;
    }

    @Override
    public void start(){
        System.out.println("Pedaleo la bici y arranca");
    }
}
