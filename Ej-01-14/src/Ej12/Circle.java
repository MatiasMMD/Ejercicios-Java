package Ej12;

public class Circle extends Shape implements Drawable{
    // 1. Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
    // 4. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
    private double radius;
    final private double PI = 3.14159;
    
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        double area = (radius * radius) * PI;
        System.out.println("El área del circulo es igual a " + area);
    }
    
    @Override
    public void draw(){
        System.out.println("Agarra el compás y dibuja un circulo apoyando ambas partes del mismo y girandolo hasta completar la figura.");
    }
}
