
import java.util.Scanner;


public class SueldoEmpleado {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       int horastrabajadas;
       int sueldo;
       
        System.out.println("Ingrese las Horas trabajadas");
        horastrabajadas = teclado.nextInt();
        
        sueldo = (int) (horastrabajadas*130.50);
        
        System.out.println("su sueldo es " +sueldo);
       
        
               
    }
    
}
