package Ej10;

public class Encargado extends EmpleadoDos{
    // 4. Manager hereda de Employee y agrega el atributo department.
    private String areaTrabajo;

    public Encargado(String nombre, double salario, String areaTrabajo) {
        super(nombre, salario);
        this.areaTrabajo = areaTrabajo;
    }

    public String getAreaTrabajo(){
        return areaTrabajo;
    }
   
}
