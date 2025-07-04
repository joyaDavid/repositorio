/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author PC HP
 */
public class TestCasting {
    
    public static void main (String[] largs) {
    Mascota m = new Gato("Milu");
        
        // que paso aqui
        Perro p = (Perro) m; //Esto lanza ClassCastException
        p.ladrar();
        
  }
}
