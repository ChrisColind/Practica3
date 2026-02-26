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
public class Gato extends Animal implements escalar, nadar{
    @Override
    void Sonido(){
        System.out.println("Miau");
    }
    
    @Override
    public void escalar(){
        System.out.println("El gato escala");
    }
    
    @Override
    public void nadar(){
        System.out.println("El gato nada");
    }
}
