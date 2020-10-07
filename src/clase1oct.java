
import java.util.Scanner;


public class clase1oct {

    
    public static void main(String[] args) {
        
        //que datos necesito
        
        Scanner teclado = new Scanner(System.in);
        String nombre1;
        int calif1;
        int calif2;
        int calif3;
        int promedio;
        
        //adquirir datos
        
        System.out.println("datos de la persona");
        System.out.println("da el nombre de la persona");
        nombre1 = teclado.nextLine();
        System.out.println("da la primera calificacion");
        calif1 = teclado.nextInt();
        System.out.println("da la segunda calificacon");
        calif2 = teclado.nextInt();
        System.out.println("da la tercera calificacion");
        calif3 = teclado.nextInt();
        
        //calcular la calificacion
        
        promedio = (calif1 /3 + calif2 /3 + calif3 / 3);
        
        //imprimir
        
        System.out.println("tu promedio es " +promedio);
        
        
                
                
    }
    
}
