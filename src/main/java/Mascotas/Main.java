/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author PC HP
 */
public class Main {
    
    public static void main (String[]args) {
    ClinicaVeterinaria c = new ClinicaVeterinaria();
    
    Mascota N1 = new Perro ("Max");
    Mascota N2 = new Gato ("Lulu");
    
    c.recibirMascota(N1);
    c.recibirMascota(N2);
  }
}
