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
public class Main {
    
    static void ContarCarros(int n){
        if(n==0){
            return;
        }
        System.out.println("Carro: "+n);
        ContarCarros(n-1);
        
        }
    
    public static void main(String args[]){
       
        Auto miCarro = new Auto("toyota",150);
        Moto miMoto = new Moto("honda",200);
        
        miMoto.describir();
        miMoto.mostrarMarca();
        
        miCarro.describir();
        miCarro.mostrarMarca();
        miCarro.CargarBateria();
        
        if(miCarro instanceof Vehiculo){
            System.out.println("Si es un vehiculo");
        }
        System.out.println((miCarro.velocidad>120) ? "Es rapido" : "es lento");
        
        for(TipoVehiculo tipo : TipoVehiculo.values()){
            switch(tipo){
                case AUTO:
                    System.out.println("AUTO: 4 ruedas");
                break;
                
                case MOTO:
                    System.out.println("MOTO: 2 ruedas");
                break;
                
                case CAMION:
                    System.out.println("CAMION: carga");
                break;
            }
        }
        try{
            int division = 10/0;
            
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        int numero =5;
        ContarCarros(numero);
         
    }
}
