package Cajero;

public class Cuenta {
    private double saldo;
    
    public Cuenta(){
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }
       
    public void depositar(double monto){
        System.out.println("Depositando: "+monto+ " pesos");
        saldo+=monto;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando monto");
        if(saldo<monto)
            throw new SaldoInsuficienteException();
        else{
            saldo -= monto;
        }
        System.out.println("Nuevo saldo "+saldo+" pesos");
    }
}
