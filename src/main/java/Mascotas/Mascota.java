/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas;

/**
 *
 * @author PC HP
 */
public class Mascota {

    public String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public Mascota() {
        this.nombre = "Simon";
    }

    public void saludar() {
        System.out.println(" hola soy " + nombre);
    }
    private String nombrePrivado = "privado";
    String nombreDefault = "Default";

    protected String nombreProtegido = "Protegido";
    public String nombrePublico = "Publico";

    private void metodoPrivado() {
        System.out.println("Metodo privado");
    }

    void metodoDefault() {
        System.out.println("metodo default");
    }

    protected void metodoprotegido() {
        System.out.println("motodo protegido");
    }

    public void metodopublico() {
        System.out.println("metodo publico");
    }

}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    



  