package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {

        var resultado = Operaciones.sumar(2,5);
        System.out.println("Resultado: "+resultado);

        var resultado2 = Operaciones.sumar(3.5,2);
        System.out.printf("Resultado2: "+resultado2);
    }
}
