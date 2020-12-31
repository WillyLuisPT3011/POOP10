package Cajero;
import java.util.Scanner; //Sirve para que el usuario ponga el monto deseado a depositar o retirar
public class Cajero {
    public static void main(String[] args){
        int a; //Monto a depositar
        int b; //Monto a retirar
        Scanner S = new Scanner(System.in); 
        Scanner Sb = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        System.out.println("Ponga el saldo a depositar: ");
        a = S.nextInt();
        cuenta.depositar(a);
        try {
            System.out.println("Ponga el saldo a retirar: ");
            b = Sb.nextInt();
            cuenta.retirar(b);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Saldo Insuficiente");
        }   
    }
}
