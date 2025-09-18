package Ej12;

public class Rectangle extends Shape{
    // 1. Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void calculateArea(){
        double area = length * width;
        System.out.println("El área del rectangulo es igual a " + area);
    }
}
