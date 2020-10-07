
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
public class sumaparejaactividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                int num1;
                int num2;
                int num3;
                int suma1;
                int suma2;
                
                System.out.println("Dame un numero ");
               num1= teclado.nextInt();
               System.out.println("dame otro numero");
               num2= teclado.nextInt();
               System.out.println("dame un tercer numero");
               num3= teclado.nextInt();
               
               if(num3 == num1+num2){
                   System.out.println("iguales");
               }else 
                   System.out.println("diferentes");
               
               
               
                       
        // TODO code application logic here
    }
    
}
