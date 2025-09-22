package Ej9;

public class ProductoDos {
    // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        private double precio;

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
}
