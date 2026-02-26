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
public class Pez extends Animal implements nadar, escalar{

    @Override
    void Sonido(){
        System.out.println("...");   
    }
    
    @Override
    public void nadar(){
        System.out.println("El pez nada");
    }
    
    @Override
    public void escalar(){
        System.out.println("El pez escala la corriente");
    }
}
