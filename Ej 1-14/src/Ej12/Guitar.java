package Ej12;

public class Guitar implements Playable{
    // 2. Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
    private String guitar;

    public void setGuitar(String guitar){
        this.guitar = guitar;
    }

    public String getGuitar(){
        return guitar;
    }

    public void play(){
        System.out.println("Toco la guitarra de " + guitar);
    }
}
