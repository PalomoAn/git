
import java.util.Scanner;


public class Hipotenusa {

    public static void main(String[] args) {
        
        //1) inicio
        
        //2) que datos necesito
        
        Scanner teclado = new Scanner(System.in);
        int cateto1;
        int cateto2;
        int hipotenusa;
        
        //3) solicitar datos 
        
        System.out.println("Dame el lado del primer cateto ");
        cateto1 = teclado.nextInt();
        
        System.out.println("Dame el lado del segundo cateto");
        cateto2 = teclado.nextInt();
        
        //4) calcular los resultados
        
        hipotenusa = (int) Math.hypot(cateto1, cateto2);
        
        //5) dar resulados
        
        System.out.println("La hipotenusa es " +hipotenusa);
        
                
                
       
    }
    
}
