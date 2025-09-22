package Ej09;

public class CuentaDeBancoDos {
    // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
    private double balance;

    public CuentaDeBancoDos(double balance){
        this.setBalance(balance);
    }

     public double getBalance(){
            return this.balance;
        }

    public void setBalance(double balance){
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance inválido.");
        }
    }

    public void deposito(double monto){
        if (monto > 0) {
            balance = balance + monto;
            System.out.println("Su nuevo blance es de: $" + balance);
        } else {
            System.out.println("Ingrese un monto válido para depositar.");
        }
    }

    public void retiro(double monto){
        if (monto < balance || monto == balance) {
            balance = balance - monto;
            System.out.println("Realiza un retiro de: $" + monto + " y su nuevo balance es de: $" + balance);
        } else {
            System.out.println("Ingrese un monto válido para retirar");
        }    
    }
}
