package Ej12;

public class PartTimeEmployee extends Employee{
    // 5. Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
    private String name;
    private double salary;

    public PartTimeEmployee(String name, double salary) {
        super(name, salary);
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        double extraSalary = salary * 0.75;
        salary = salary + extraSalary;
        return salary;
    }
    
}
