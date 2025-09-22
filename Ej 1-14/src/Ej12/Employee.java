package Ej12;

public abstract class Employee {
    // 5. Crea una clase abstracta Employee con un método calculateSalary(). 
    private String name;
    private double salary;

    public  Employee(String name, double salary){
        this.name = name;
        this.setSalary(salary); 
    }

    public void setSalary(double salary){
        if (salary>0) {
            this.salary = salary;
        } else {
            System.out.println("Ingrese un salario válido");
    }
}

    public abstract double calculateSalary();
}
