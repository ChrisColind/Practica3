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
class Auto extends Vehiculo implements Electrico{
    
    public Auto(String marca, int velocidad) {
        super(marca, velocidad);
        
    }
    
    @Override
    public void describir(){
        
        System.out.println("la marca del carro es: "+marca);
        System.out.println("la velocidad del carro es: "+velocidad);
        
    }
    
    @Override
    public void CargarBateria(){
        System.out.println("Cargando Bateria...");
    }
}
