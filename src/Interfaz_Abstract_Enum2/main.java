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
public class main {
    public static void ContarEmpleados(int n) {
    if (n == 0){
        return;
    }
    ContarEmpleados(n-1); 
    System.out.println("Empleado: #" + n); 
}

    public static void main(String args[]){
        String programador;
        int num=9;
        ContarEmpleados(num);
        
        Vendedor VEND = new Vendedor("carlos",45000);
        Programador PROG = new Programador("javier",80000);
        
        VEND.mostrarInfo();
        VEND.mostrarNombre();
        System.out.println((VEND instanceof Vendedor) ? "Si es un vendedor" : "no es un vendedor");
        System.out.println("=====================================");
        PROG.mostrarInfo();
        PROG.mostrarNombre();
        programador = (PROG instanceof Programador) ? "Si es un programador" : "no es un programador";
        System.out.println(programador);
        
        String salar;
        System.out.println("");
        VEND.mostrarNombre();
        salar = (VEND.salario>50000) ? "salario alto" : "salario bajo";
        System.out.println(salar);
        System.out.println("==============================================");
        PROG.mostrarNombre();
        salar = (PROG.salario>50000) ? "Salario Alto" : "Salario bajo";
        System.out.println(salar);
        System.out.println("");
        for(ENUMDepartamento dep : ENUMDepartamento.values()){
            switch(dep){
                case VENTAS:
                    System.out.println("Departamento de ventas");
                break;
                
                case SISTEMAS:
                    System.out.println("Departamento de sistemas");
                break;
                
                case RRHH:
                    System.out.println("Departamento de RRHH");
                break;
                    
            }
        }
        try {
            int[] arr = new int[3];
            System.out.println(arr[10]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango");
        }
        
        
    }
}

