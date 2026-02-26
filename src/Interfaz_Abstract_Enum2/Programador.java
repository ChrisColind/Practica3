/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz_Abstract_Enum2;

/**
 *
 * @author Rogelio
 */
public class Programador extends ABSTRACTempleado implements INTERFACEevaluable{
    
    public Programador(String nombre, double salario){
        super(nombre,salario);
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+" || "+"Salario: "+salario);
    }
    
    @Override
    public void evaluarDesempenio(){
        
    }   
}
