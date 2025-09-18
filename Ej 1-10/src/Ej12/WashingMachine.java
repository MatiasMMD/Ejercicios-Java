package Ej12;

public class WashingMachine extends Appliance{
    // 7. Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
    @Override
    public void turnOn(){
        System.out.println("El lavavajilla se enciende");
    }

    @Override
    public void turnOff(){
        System.out.println("El lavavajilla se apaga");
    }
}
