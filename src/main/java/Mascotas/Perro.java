/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author PC HP
 */
public class Perro extends Mascota {

    public Perro(String nombre) {
    super(nombre);
  }
    public void ladrar() {
    System.out.println(nombre + "dice: ! guau !");
  }
}
