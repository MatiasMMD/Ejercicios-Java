package EjExtrasC;

import java.util.ArrayList;
import java.util.Scanner;

public class EjExtras {
    public static void main (String []args) {
    //Aplicar 10% de desucuento sobre varios productos.
    var scanner = new Scanner(System.in);
    String opcion = "s";
    var listaProductos = new ArrayList<Producto>();

    while ((opcion.toLowerCase()).equals("s")) {
        System.out.println("Ingrese el nombre del producto que quiera aplicar el descuento: ");
        var producto = new Producto(scanner.nextLine());
        System.out.println("Ingrese el precio de " +  producto.getNombre() + " para aplicar el descuento: ");
        producto.setPrecio(scanner.nextDouble());
        producto.descuento(producto.getPrecio());
        scanner.nextLine();
        listaProductos.add(producto);
        System.out.println("¿Queres seguir ingresando productos?");
        opcion = scanner.nextLine();
    }

    for (Producto producto : listaProductos) {
        System.out.println(producto.getNombre() + " $" + producto.getPrecio());
    }
    
    }

}
