/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasoporreferencia;

import persona.Persona;

/**
 *
 * @author Sistemas
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        
        persona1.nombre = "juan";
        System.out.println("Persona : "+persona1.nombre);
        CambioValor(persona1);
        System.out.println("paso por referencia __Persona : "+persona1.nombre);
    }
    public static void CambioValor(Persona persona){
        persona.nombre = "jesus";
    }
}
