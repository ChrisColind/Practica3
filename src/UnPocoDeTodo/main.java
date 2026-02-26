/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnPocoDeTodo;

/**
 *
 * @author Rogelio
 */
public class main{
    public static void main(String[] args) {
       Gato MiGato = new Gato();
       MiGato.nombre = "Jerry";
       MiGato.lb = 20;
       
       Pato MiPato = new Pato();
       MiPato.nombre = "cuaqui";
       MiPato.lb = 10;
       
       Pez MiPez = new Pez();
       MiPez.nombre = "nemo";
       MiPez.lb = 4;
       
        System.out.println("===GATO===");
        MiGato.Sonido();
        MiGato.dormir();
        MiGato.peso();
        
        MiGato.escalar();
        MiGato.nadar();
        
        System.out.println("===PATO===");
        MiPato.Sonido();
        MiPato.dormir();
        MiPato.peso();
        
        MiPato.nadar();
        MiPato.volar();
        
        System.out.println("===PEZ===");
        MiPez.Sonido();
        MiPez.dormir();
        MiPez.peso();
        
        MiPez.nadar();
        MiPez.escalar();
    }
    
    
    
}
