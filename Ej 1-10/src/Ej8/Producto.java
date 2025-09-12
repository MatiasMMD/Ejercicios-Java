package Ej8;

public class Producto {
    // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
    int precio;
    int descuento;

    public Producto(int precio, int descuento){
        this.precio = precio;
        this.descuento = descuento;
    }

    public void descuentoR(){
        var precioConDescuento = (precio * descuento) / 100;
        System.out.println("El producto te queda en $" + precioConDescuento + " con el descuento.");
    }

}
