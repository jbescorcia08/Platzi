package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Jesus";
        persona1.apellido = "Barrios";
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        persona2.nombre = "Andrea";
        persona2.apellido = "Perez";
        persona2.desplegarInformacion();

        Persona persona3 = new Persona();
        persona3.nombre = "Jose";
        persona3.apellido = "Barrios";
        persona3.desplegarInformacion();
    }
}
