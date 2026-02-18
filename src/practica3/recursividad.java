/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
import java.util.Scanner;
/**
 *
 * @author Rogelio
 */

public class recursividad {
    
    public static void main(String args []){
        Scanner n = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero");
        numero = n.nextInt();
        System.out.println(sumarRecursividad(numero));
        
    }
    public static int sumarRecursividad(int numero){
        int sumar = 0;
        
        if(numero==0){  
            return sumar;
        }
        
        return numero + sumarRecursividad(numero-1);
    }
}
