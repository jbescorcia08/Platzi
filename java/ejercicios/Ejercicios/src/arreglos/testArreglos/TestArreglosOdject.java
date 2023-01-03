package arreglos.testArreglos;

import arreglos.domain.Persona;

public class TestArreglosOdject {
    public static void main(String[] args) {
        Persona Personas[] = new Persona[2];

        Personas[0] = new Persona("jesus");
        Personas[1] = new Persona("David");

        System.out.println(Personas[0]);
        System.out.println(Personas[1]);

        // recorrer un arreglo tipo objet
        for (int i = 0; i < Personas.length; i++) {
            System.out.println(Personas[i]);
        }
    }
}
