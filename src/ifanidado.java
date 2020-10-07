
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
public class ifanidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // que datos necesito
        Scanner teclado = new Scanner (System.in);
        String nombre1, nombre2;
                int añoNacimiento1, añoNacimiento2;
                int añoActual;
                int edad1, edad2; 
                
                //3) capturar valores datos
                System.out.println("datos de la pesona 1 ");
                System.out.println(" da el nombre");
                nombre1 = teclado.nextLine();
                System.out.println("da el año de nacimiento");
                añoNacimiento1 = teclado.nextInt();
                System.out.println("");
                
                System.out.println("datos de la pesona 2 ");
                System.out.println(" da el nombre");
                nombre2 = teclado.next();
               
                System.out.println("da el año de nacimiento");
                añoNacimiento2 = teclado.nextInt();
                System.out.println("");
                
                //4) calcular edad de las personas
                añoActual = 2020;
                edad1 = añoActual - añoNacimiento1;
                edad2 = añoActual - añoNacimiento2;
                
                //5)determinar y mostrar la persona mayor
                if (edad1 > edad2) {
            System.out.println("la persona con mayor edad es " +nombre1);
                         }else if(edad2 > edad1 ){
                    System.out.println("la persona con mayor edad es " +nombre2);
                         }else{
                             System.out.println("ambas tienen la misma edad");
                             
        }
    }
}