
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class personaMasadulta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //determinar la persona más adulta, de dos ellas. 
        //El algoritmo deberá solicitar por teclado el nombre y el año de nacimiento de las dos personas. 
        //y enviar a pantalla el nombre de la persona mayor.
        
       //1) inicio
       //2) que datos necesitamos 
       Scanner teclado = new Scanner (System.in);    
       int num1;//primer numero
       int num2;//segundo numero
       
       //3) conocer o solicitar datos 
        System.out.println("dame la edad del primero");
        num1 = teclado.nextInt();
        System.out.println("dame la edad del segundo");
        num2 = teclado.nextInt();
        
        if (num1 > num2) {
            System.out.println("la persona con mayor edad es" +num1);
        }
        else {
            System.out.println("la persona con mayor edad es" +num2);
        }
        
                
        
                
       
             
 
    }
    
}
