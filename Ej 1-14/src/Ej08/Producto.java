package Ej08;

public class Producto {
    // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
    int precio;
    int descuento;

    public Producto(int precio, int descuento){
        this.precio = precio;
        this.descuento = descuento;
    }

    public void descuentoR(){
        descuento = (precio * descuento) / 100;
        precio = precio - descuento;
        System.out.println("El producto te queda en $" + precio + " con el descuento.");
    }

}
