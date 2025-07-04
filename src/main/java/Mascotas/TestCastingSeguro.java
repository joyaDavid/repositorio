/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author PC HP
 */
public class TestCastingSeguro {
   
    public static void main(String[] largs) {
    Mascota m = new Gato("Milu");
       
    if (m instanceof Perro) {
    Perro p = (Perro) m;
    p.ladrar();
       
    } else {
    System.out.println("No es un perro, No se puede ladrar");
     
    }
  }
}
