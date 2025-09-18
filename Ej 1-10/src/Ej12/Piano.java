package Ej12;

public class Piano implements Playable{
    // 2. Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
    private String piano;

    public void setPiano(String piano){
        this.piano = piano;
    }

    public String getPiano(){
        return piano;
    }

    public void play(){
        System.out.println("Toco el Piano de " + piano);
    }
}
