package Ej12;

public class EmployeePayment implements Payable{
    // 10. Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
    @Override
    public void pay(){
        System.out.println("Se pago el sueldo del empleado correctamente");   
    }
}
