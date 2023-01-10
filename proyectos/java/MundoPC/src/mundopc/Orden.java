package mundopc;

import computadora.Computadora;

import java.sql.SQLOutput;

public class Orden {
    private int idOrden;
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    Computadora computadora[];
    private int contadorComputadoras;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadora[contadorComputadoras++] = computadora;
        }else {
            System.out.println("Supero el limite de computadoras !!");
        }
    }
    public void mostrarComputadora(){
        System.out.println("ID Orden." +this.idOrden+
                "\nComputadoras de la Orden: "+this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadora[i]);
        }
    }

}
