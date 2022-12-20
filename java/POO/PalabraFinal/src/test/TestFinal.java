package test;

import domain.Empleado;
import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {


        Persona persona1 = new Persona("jesus",'M',22,true);
        System.out.println(persona1);
        Empleado persona2 = new Empleado("david",'F',34,true,34455,"tecnico");
        persona2.setSexo('M');
        System.out.println(persona2);

    }
}
