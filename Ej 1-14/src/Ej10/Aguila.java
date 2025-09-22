package Ej10;

public class Aguila extends Pajaro{
    // 6. Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
    private String nombre;

    public Aguila(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void volar(){
        super.volar();
        System.out.println("El aguila " + nombre + " esta volando");
    }
}
