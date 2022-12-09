package pasoReferencia;

import Clases.Persona;

import java.io.OutputStream;

public class ValorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Jesus";
        persona1.apellido = "Barrios";
        System.out.println("Nombre: "+persona1.nombre);
        persona1 = cambiaValor(persona1);
        System.out.println("Persona1 normbre: "+persona1.nombre );
    }
    public static Persona cambiaValor(Persona persona){
        persona.nombre = "juan";
        return persona;
    }
}
