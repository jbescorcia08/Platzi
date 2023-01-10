package mundopc;

import computadora.Computadora;
import perifericos.*;

public class Main {
    public static void main(String[] args) {

        Monitor monitorHp = new Monitor("HP", 16);
        Teclado tecladoHp = new Teclado("inalambrico", "HP");
        Raton ratonHp = new Raton("inalambrico", "HP");
        Computadora computadoraHp = new Computadora("DELL", monitorHp,tecladoHp,ratonHp);

        Monitor monitorGamer = new Monitor("HP", 16);
        Computadora computadoraGamer = new Computadora("Gamer", monitorGamer,tecladoHp,ratonHp);

        Monitor monitor1 = new Monitor("HP", 14);
        Computadora computadora1 = new Computadora("maxwell", monitor1,tecladoHp,ratonHp);

        Orden orden = new Orden();

        orden.agregarComputadora(computadoraHp);
        orden.agregarComputadora(computadoraGamer);
        orden.agregarComputadora(computadora1);
        orden.mostrarComputadora();

    }
}
