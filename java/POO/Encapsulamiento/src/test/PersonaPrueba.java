package test;

import dominio.*;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona = new Persona("jesus",5000,false);

        System.out.println("Persona: "+persona);


        Prueba coche = new Prueba("tesla","rojo",12000);

        System.out.println("MODELO: "+coche.getModelo());
        coche.setModelo("Cheroled");
        System.out.println("MODELO CAMBIADO: "+coche.getModelo());

        System.out.println("COLOR: "+coche.getColor());
        coche.setColor("verde");
        System.out.println("COLOR CAMBIADO: "+coche.getColor());

        System.out.println("KILOMETROS: "+coche.getKilometros());
        coche.setKilometros(400);
        System.out.println("KILOMETROS CAMBIADOS: "+coche.getKilometros());
        System.out.println("\nMedodo toString");
        System.out.printf(persona.toString());

    }
}
