package Ej10;

public class EmpleadoDos {
    // 4. La clase Employee tiene los atributos name y salary. 
    private String nombre;
    private double salario;

    public EmpleadoDos(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre(){
        return nombre;
    }

    public double getSalario(){
        return salario;
    }
}
