package Ej10;

public class Circulo extends Forma{
    // 5. Luego implementa ese método en Circle y Rectangle.
    private double radio;
    final private double PI = 3.14159;
    
    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return area = PI * (radio * radio);
    }
}
