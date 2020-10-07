
import java.util.Scanner;



public class Valorabsoluto {

    
    public static void main(String[] args) {
       //1) inicio
       
       //2) que datos necesito
       
       int x;
      
       Scanner teclado = new Scanner(System.in);
       
       //3) solicitar datos 
       
        System.out.println("Dame el valor para X");
        x = teclado.nextInt();
        
        //4) calcular resultado
         
         System.out.println("Valor absoluto(" + x + ")=" + Math.abs(x));
        
       
       
    }
    
}
