package Cajero;

public class SaldoInsuficienteException extends Exception{
    SaldoInsuficienteException(){
        super("Saldo Insuficiente");
    }    
}
