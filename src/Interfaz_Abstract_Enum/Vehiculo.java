/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz_Abstract_Enum;

/**
 *
 * @author Rogelio
 */
public abstract class Vehiculo {
    String marca;
    int velocidad;
    
    public Vehiculo(String marca, int velocidad){
        this.marca = marca;
        this.velocidad = velocidad;
        
    }
    abstract void describir();
    
    final void mostrarMarca(){
        System.out.println("Marca "+marca);
        
    }
}
