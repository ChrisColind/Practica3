
package practica3;

import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
    int[] repuesta;
    int numero, numero2;
        System.out.println("Ingrese un numero: ");
        numero=n.nextInt();
        System.out.println("ingrese otro numero: ");
        numero2=n.nextInt();
        
        
        repuesta=multiplicacion(numero, numero2);
        System.out.println("Tu numero 1 multiplicado es: "+repuesta[0]);
        System.out.println("Tu numero 2 multiplicado es: "+repuesta[1]);
        
        
    }
    
    public static int[] multiplicacion(int num2, int num1){
        int[] producto;
        producto=new int[2];
        
        producto[0]=num2*2;
        producto[1]=num1*3;
        return producto;
        
    }   
}