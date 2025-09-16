package Ej10;

public class RectanguloDos extends Forma{
    // 5. Luego implementa ese método en Circle y Rectangle.
    private double altura;
    private double ancho;

public RectanguloDos(double altura, double ancho){
    this.altura = altura;
    this.ancho = ancho;
}

    @Override
    public double calcularArea(){
        return area = ancho * altura;
    }
}

