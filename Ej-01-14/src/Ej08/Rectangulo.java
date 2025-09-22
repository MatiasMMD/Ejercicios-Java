package Ej08;

public class Rectangulo {
    // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
    int ladoA;
    int ladoL;

    public Rectangulo(int ladoA, int ladoL){
        this.ladoA = ladoA;
        this.ladoL = ladoL;
    }

    public int perimetroR(){
        return (ladoA + ladoL) * 2;
    }

    public int areaR(){
        return ladoA * ladoL;
    }
}
