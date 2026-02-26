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
abstract class Animal {
    String nombre;
    int lb;
    
    abstract void Sonido();
    
    void dormir(){
        System.out.println(nombre+" esta durmiendo");
    }
    
    void peso(){
        System.out.println(nombre+" pesa: "+lb);
    }
    
}
