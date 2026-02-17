/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author Rogelio
 */
enum Dia {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
}

public class enums {
    public static void main(String[] args) {
        Dia hoy = Dia.MIERCOLES;
        System.out.println(hoy); // MIERCOLES

        // .values() recorre todos los valores del enum
        for (Dia d : Dia.values()) {
            System.out.println(d);
        }
    }
}