package Ej10;

public class Pajaro extends Animal {
    // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
    private String nombre;

    public void volar(){
        System.out.println("El pajaro esta volando");
    }

    @Override
    public void hacerSonido(){
        System.out.println("Pio Pio");
    }
}
