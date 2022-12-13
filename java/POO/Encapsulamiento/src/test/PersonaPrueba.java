package test;

import dominio.*;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona = new Persona("jesus",5000,false);

        System.out.println("Persona: "+persona.getNombre());
        persona.setNombre("Jesus Barrios");
        System.out.println("Persona cambio Nombre: "+persona.getNombre());

        System.out.println("Sueldo: "+persona.getSueldo());
        persona.setSueldo(4000);
        System.out.println("Sueldo Cambiado: "+persona.getSueldo());

        System.out.println("Boolean: "+persona.getEliminado());
        persona.setEliminado(true);
        System.out.println("Boolean cambiado: "+persona.getEliminado());


        Prueba coche = new Prueba("tesla","rojo",12000);

        System.out.println("MODELO: "+coche.getModelo());
        coche.setModelo("Cheroled");
        System.out.println("MODELO CAMBIADO: "+coche.getModelo());

        System.out.println("COLOR: "+coche.getColor());
        coche.setColor("verde");
        System.out.println("COLOR CAMBIADO: "+coche.getColor());

        System.out.printf("KILOMETROS: "+coche.getKilometros());
        coche.setKilometros(400);
        System.out.println("KILOMETROS CAMBIADOS: "+coche.getKilometros());
    }
}
