
import java.util.Scanner;


public class Valordey {

    
    public static void main(String[] args) {
      
        //1) inicio
        
        //2) que datos necesito
        
        Scanner teclado = new Scanner(System.in);
        int x;
        int y;
        
        //3) solicitar datos
        
        System.out.println("dame el valor de x");
               x = teclado.nextInt();
               
        //4) realizar las operaciones
        
        y = (4*x^2+5*x-13);
        
        //5) imprimir resuldados
        
        System.out.println("el valor de y es " +y);
        
                
    }
    
}
