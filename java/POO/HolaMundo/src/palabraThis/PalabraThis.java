package palabraThis;

import java.security.spec.RSAOtherPrimeInfo;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Jesus", "Barrios");
        System.out.println("Nombre: "+persona.nombre);
        System.out.println("Apellido: "+persona.apellido);
    }
}
class Persona{
    String nombre;
    String apellido;
    Persona(String nombre, String apellido){
        //super();
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: "+this);
        new Imprimir().imprimir(this);
    }

}
class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: "+persona);
        System.out.println("THis: "+this);
    }
}
