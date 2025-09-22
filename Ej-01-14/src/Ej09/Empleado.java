package Ej09;

public class Empleado {
    // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
    private double salario;

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String aumentoSalario(double aumentoPorcentaje){
        if (aumentoPorcentaje >= 1) {
            double aumentoSalario = (salario * aumentoPorcentaje) / 100;
            salario = salario + aumentoSalario;
            return "Su nuevo sueldo es: $" + salario;
        } return "Ingrese un aumento válido";
    }
}
