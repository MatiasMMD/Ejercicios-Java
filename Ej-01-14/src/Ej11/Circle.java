package Ej11;

public class Circle extends Shape{
    // 2. Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
    private double radius;
    final private double PI = 3.14159;
    
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return  PI * (radius * radius);
    }


}
