/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

/**
 *
 * @author Rogelio
 */
abstract class ABSTRACTempleado {
    String nombre;
    double salario;
    
    public ABSTRACTempleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    
    abstract void mostrarInfo();
    
    final void mostrarNombre(){
        System.out.println("El nombre del cliente es: "+nombre);
    }
}
