package testDomain;

import domain.Cliente;
import domain.Empleado;

public class TestDomain {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("jesus", 3000);
        Empleado empleado2 = new Empleado("karla", 500);

        Cliente cliente1 = new Cliente("jesus");
        Cliente cliente2 = new Cliente();


        System.out.println("empleado1: "+empleado1);
        System.out.println("empleado2: "+empleado2);
        System.out.println("\n");
        System.out.println("cliente1: "+cliente1);
        System.out.println("cliente2: "+cliente2);


    }
}
