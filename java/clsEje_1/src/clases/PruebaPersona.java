/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Sistemas
 */
public class PruebaPersona {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Jesus";
        persona1.apellido = "Barrios";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        persona2.nombre = "Bley";
        persona2.apellido = "Munoz";
        persona2.desplegarInformacion();
    }
}
