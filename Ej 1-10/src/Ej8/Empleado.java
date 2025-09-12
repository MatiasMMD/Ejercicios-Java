package Ej8;

public class Empleado {
    // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
    String nombre;
    int salario;

    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public void salario(){
        System.out.println("El salario de " + nombre + " es de $" + salario + ".");
    }
}
