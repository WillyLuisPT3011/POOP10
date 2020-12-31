package poop9;
import java.util.Scanner;
public class POOP9 {

    public static void main(String[] args) {
        
        System.out.println("1**********************************************");
        
        try{
            String mensajes[] = {"Antonio", "Javier", "Gabriela"};
            for (int i = 0; i < 4; i++){
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: apuntador fuera de rango");
        }
        
        System.out.println("2**********************************************");
        try{
            int n;
            int m;
            Scanner Sn = new Scanner(System.in); 
            Scanner Sm = new Scanner(System.in);
            System.out.println("Pon el dividiendo:");
            n = Sn.nextInt();
            System.out.println("Pon el divisor:");
            m = Sm.nextInt();
            float equis = n/m; 
            System.out.println("Equis = "+equis);
        }catch(ArithmeticException ae){
            System.out.println("Error: division entre cero");
        }finally{
            System.out.println("A pesar de todo, se ejecuta finally");
        }
        System.out.println("Fuera de try-catch");
        
        System.out.println("3**********************************************");
        try{
            int a;
            int b;
            Scanner Sa = new Scanner(System.in); 
            Scanner Sb = new Scanner(System.in);
            System.out.println("Pon el dividiendo:");
            a = Sa.nextInt();
            System.out.println("Pon el divisor:");
            b = Sb.nextInt();
            float equis = a/b; 
            System.out.println("Equis = "+equis);
        }catch(Exception e){
            System.out.println("Excepcion general");
        }finally{
            System.out.println("A pesar de todo, se ejecuta finally");
        }
        System.out.println("Fuera de try-catch");
        
        System.out.println("4**********************************************");
        //Propagancia de exceptions
        try{
            int a;
            int b;
            Scanner Sa = new Scanner(System.in); 
            Scanner Sb = new Scanner(System.in);
            System.out.println("Pon el dividiendo:");
            a = Sa.nextInt();
            System.out.println("Pon el divisor:");
            b = Sb.nextInt();
            int division = division(a,b);
            System.out.println("Division = "+division);
        }catch(ArithmeticException e){
            System.out.println("Exception aritmetica");
        }
        
        System.out.println("5**********************************************");
        try{
            int a;
            int b;
            Scanner Sa = new Scanner(System.in); 
            Scanner Sb = new Scanner(System.in);
            System.out.println("Pon el dividiendo:");
            a = Sa.nextInt();
            System.out.println("Pon el divisor:");
            b = Sb.nextInt();
            int division = division2(a,b);
            System.out.println("Division = "+division);
        }catch(ArithmeticException e){
            System.out.println("Exception aritmetica");
        }
    }            
    public static int division(int a, int b) throws ArithmeticException{
        int c;
        c=a/b;
        return c;
    }
    public static int division2(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }int c= a/b;
        return c;
    }
}
