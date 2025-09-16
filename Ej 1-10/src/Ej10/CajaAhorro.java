package Ej10;

public class CajaAhorro extends CuentaBanco {
    // 8. SavingsAccount hereda y agrega un método addInterest().
    private double balance;
    private double interes;

    public CajaAhorro(double balance, double interes) {
        super(balance);
        this.interes = interes;
    }
    
    public void agregarInteres(){
        double interesFinal = (interes * super.getBalance()) / 100;
        balance = super.getBalance() + interesFinal;
        System.out.println("Deposito su balance de $" + super.getBalance() + " y con el interes del " + interes + "%. Su nuevo balance es de $" + balance);
    }
    
}
