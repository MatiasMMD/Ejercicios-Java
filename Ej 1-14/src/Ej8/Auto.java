package Ej8;

public class Auto {
    // 4. Crea una clase Car con atributos brand y model y un método showData().
    String modelo;
    String marca;

    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDatos (){
        System.out.println("El auto es un " + marca + " " + modelo);
    }

}
