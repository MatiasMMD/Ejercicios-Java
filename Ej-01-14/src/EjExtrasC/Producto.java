package EjExtrasC;

public class Producto {
    //Aplicar el descuento de 10% sobre varios productos.
    private double descuento = 10;
    private String nombre;
    private double precio;

    public Producto (String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        if (precio >0) {
            this.precio = precio;
        } else {
            System.out.println("Ingrese un precio mayor a $0.");
        }
    }

    public double getPrecio(){
        return precio;
    }

    public String getNombre(){
        return nombre;
    }

    public void descuento(double precio){
        descuento = (precio * descuento) / 100;
        precio = precio - descuento;
        System.out.println("El producto te queda en $" + precio + " con el descuento del 10%.");
    }
}
