
import java.util.Scanner;


public class Multiplode3 {

    public static void main(String[] args) {
        //1) inicio
        
        //2)que datos necesito
        Scanner teclado = new Scanner(System.in);
        int numero;
        int residuo;
        boolean dato;
         
        //3)solicitar los datos
        
        System.out.println("Dame un numero entero positivo");
        numero = teclado.nextInt();
        
        //4) calcular resultados
        
        residuo = (numero % 3);
        dato = (numero > 99) && (numero < 201);
        
        //5) dar resultados
        
        if (residuo == 0){
            System.out.println("el numero " +numero+ " es multiplo de 3");
        } else{
            System.out.println("el numero " +numero+ " no es multiplo de 3");
        }
                
        System.out.println("esta entre el rango de 100 y 200 " +dato);
    }
    
}
