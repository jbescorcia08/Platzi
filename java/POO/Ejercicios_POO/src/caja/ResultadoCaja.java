package caja;

public class ResultadoCaja {
    public static void main(String[] args) {
        operacionCaja operacionCaja1 = new operacionCaja();

        var ancho = operacionCaja1.ancho = 3;
        var alto = operacionCaja1.alto = 2;
        var profundo = operacionCaja1.profundo = 6;

        operacionCaja1.laboratorio();
        System.out.println(operacionCaja1.caja(ancho,alto,profundo));


    }
}
