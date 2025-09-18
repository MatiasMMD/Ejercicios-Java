package Ej12;

public class FullTimeEmployee extends Employee{
    // 5. Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
    private String name;
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        double extraSalary = salary * 1.5;
        salary = extraSalary + salary;
        return salary;
    }
    
}
