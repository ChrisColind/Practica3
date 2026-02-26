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
class Moto extends Vehiculo{
    
    public Moto(String marca, int velocidad){
        super(marca,velocidad);
    }

    @Override
    void describir() {
        System.out.println("La marca es: "+marca+ "| La velocidad es: "+velocidad );
        
    }
    
}
