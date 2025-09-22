package Ej9;

public class Rectangulo {
    // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
    private int altura;
    private int ancho;

    public void setAltura (int altura){
        this.altura = altura;
    }

    public void setAncho (int ancho){
        this.ancho = ancho;
    }

    public int calcularArea(){
        return altura * ancho;
    }
}
