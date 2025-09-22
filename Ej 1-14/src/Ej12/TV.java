package Ej12;

public class TV extends Appliance{
    // 7. Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
    @Override
    public void turnOn(){
        System.out.println("La television se enciende");
    }

    @Override
    public void turnOff(){
        System.out.println("La television se apaga");
    }
}
