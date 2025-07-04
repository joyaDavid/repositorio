/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso;

 import Mascotas.Mascota;

/**
 *
 * @author PC HP
 */
public class AccesoExterno {
    
    public static void main(String[] largs) {
    Mascota m = new Mascota();
        
        // System.out.println(m.nombrePrivado);   // Error
        //System.out.println(m.nombreDefault);   // Error
        //System.out.println(m.nombreProtegido);   // Error
       
    System.out.println(m.nombrePublico);     //OK
  }
}