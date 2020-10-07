
import java.util.Scanner;


public class Parimpar24sep {
    public static void main(String[] args) {
   
        //1) inicio
        
        //2) Que datos necesito
        Scanner teclado = new Scanner (System.in);
        int num;
        int residuo;
        String resultado;
        
        //3) conocer o solicitar los datos
        System.out.println("Dame un numero entero positivo cualesquiera bb");
        num = teclado.nextInt();
        
        //4) obtener residuo
        residuo = num % 2;
        
        //5) determinar si el numero es par o no
        if (residuo == 0) {
            resultado = "El numero " + num + " es Par";
        } else{
            resultado = "el numero " + num + " es Impar";
        }
        
        //6) mostrar resultados
        System.out.println(resultado);
            
    }
}
 
    

