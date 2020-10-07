
import java.util.Scanner;


public class Actividad1oct {

    
    public static void main(String[] args) {
        
        //que datos necesito
        
        Scanner teclado = new Scanner(System.in);
        String nombre1;
        String nombre2;
        String nombre3;
        int calif1;
        int calif2;
        int calif3;
        int calif4;
        int calif5;
        int calif6;
        int calif7;
        int calif8;
        int calif9;
        int promedio;
        int promedio2;
        int promedio3;
        
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
        
         System.out.println("datos de la segunda persona");
        System.out.println("da el nombre de la segunda persona");
        nombre2 = teclado.next();
        System.out.println("da la primera calificacion");
        calif4 = teclado.nextInt();
        System.out.println("da la segunda calificacon");
        calif5 = teclado.nextInt();
        System.out.println("da la tercera calificacion");
        calif6 = teclado.nextInt();
        
         System.out.println("datos de la tercera persona");
        System.out.println("da el nombre de la tercera persona");
        nombre3 = teclado.next();
        System.out.println("da la primera calificacion");
        calif7 = teclado.nextInt();
        System.out.println("da la segunda calificacon");
        calif8 = teclado.nextInt();
        System.out.println("da la tercera calificacion");
        calif9 = teclado.nextInt();
        
        
        //calcular la calificacion
        
        promedio = (calif1 /3 + calif2 /3 + calif3 / 3);
        promedio2 = (calif4 /3 + calif5 /3 + calif6 / 3);
        promedio3 = (calif7 /3 + calif8 /3 + calif9 / 3);
        
        //imprimir
        
        System.out.println("El promedio del alumno " +nombre1+ " es " +promedio);
        System.out.println("El promedio del alumno " +nombre2+ " es " +promedio2);
        System.out.println("El promedio del alumno " +nombre3+ " es " +promedio3);
      
        
                
                
    }
    
}
