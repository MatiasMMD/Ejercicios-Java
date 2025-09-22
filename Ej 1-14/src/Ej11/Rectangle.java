package Ej11;

public class Rectangle extends Shape{
    // 2. Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
    private double length;
    private double width;
    

    public void setLenght(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }
}
