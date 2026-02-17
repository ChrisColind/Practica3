/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rogelio
 */
public class PracticaExamen1 {
    
    static final int max = 100;
    static int resultado;
    
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        int cosa;
        coso();
        /*
        System.out.println("cuanto le resta");
        cosa = n.nextInt();
        resultado-=cosa;
        System.out.println(resultado);
        */
        String diaUser;
        Dia hoy;
        try{
            
            System.out.println("que dia es?");
            diaUser = n.nextLine().toUpperCase();

            hoy = Dia.valueOf(diaUser);

            switch(hoy){
                case LUNES:
                    System.out.println("Inicio de semana");
                    break;
                case VIERNES:
                    System.out.println("Por fin viernes");
                    break;
            }
            
        }catch(Exception e){
            System.out.println("Datos incorrectos");
        }
        
        
        String heladoUSER;
        int cantidad;
        
        ArrayList<String> helados = new ArrayList<>();
        System.out.println("Ingrese cuantos helados quiere agregsar");
        cantidad = n.nextInt(); 
        n.nextLine();
        
        for(int x=0 ; x<cantidad ; x++){
            System.out.println("Ingrese que helado quiere agregsar");
            heladoUSER = n.nextLine();
            helados.add(heladoUSER);
        }
        
        for(String h : helados){
            System.out.println(h);
            
            if(h.equals("vainilla")){
                
                System.out.println("este es el helado de vainilla");
                System.out.println("");
            }
        }
    }
    public static void coso(){
        boolean volver=true;
        
        while(volver){
            try{
                resultado=10;
                volver=false;
            }catch(ArithmeticException e){
                System.out.println("error");
                volver=true;
            }
        }
    }
    public static void foreach(){
        
    }
}
