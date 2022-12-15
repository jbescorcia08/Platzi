package testDomain;

import domain.Cliente;
import domain.Empleado;

import java.util.Date;

public class TestDomain {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("jesus", 3000);

        Cliente cliente1 = new Cliente(new Date(),true,"andres",'M',23,"los girasoles");
        System.out.println("empleado1: "+empleado1);
        System.out.println("\n");
        System.out.println("cliente1: "+cliente1);
    }
}
