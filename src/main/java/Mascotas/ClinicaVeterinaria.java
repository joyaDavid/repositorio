/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author PC HP
 */
public class ClinicaVeterinaria {

    public void recibirMascota(Mascota m) {
        System.out.println("recibiendo a:" + m.nombre);
        m.saludar();
                
        if (m instanceof Perro) {
        ((Perro)m).ladrar();
        
        } else if(m instanceof Gato) {
        ((Gato)m).mauyar();
        
        } else {
        System.out.println("tipo de Mascota no reconocido");
       
      }
   }
}
