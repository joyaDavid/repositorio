/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author PC HP
 */
public class AccesoMismoPaquete {
public static void mian(String[] largs) {
        
    Mascota m = new Mascota();
       
       // System.ou.println(m.nombreprivado); // Error
       
       System.out.println(m.nombreDefault);  // OK
       System.out.println(m.nombreProtegido); // OK
       System.out.println(m.nombrePublico);  // OK
        
       // m.metodoPrivado(); // Error
       
       m.metodoDefault();      // OK
       m.metodoprotegido();    // OK
       m.metodopublico();      // OK
       
   }
}
