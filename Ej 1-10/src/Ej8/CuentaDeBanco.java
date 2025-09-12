package Ej8;

public class CuentaDeBanco {
    // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
    int balance;
    int sueldo;

    public CuentaDeBanco(int balance, int sueldo){
        this.balance = balance;
        this.sueldo = sueldo;
    }

    public void deposito(){
        int nuevoBalance = balance + sueldo;
        System.out.println("Su nuevo balance es de $" + nuevoBalance + ".");
    }
}
