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
public class Pato extends Animal implements nadar, volar{

    @Override
    void Sonido(){
        System.out.println("cuac");
    }
    
    @Override
    public void nadar(){
        System.out.println("El pato nada");
    }
    
    @Override
    public void volar(){
        System.out.println("El pato vuela");
    }
}
