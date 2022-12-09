package palabraThis;

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
        this.nombre = nombre;
        this.apellido = apellido;
    }

}
