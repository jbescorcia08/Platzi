package bucles;

import javax.swing.*;

/*
* Realiza una aplicación que nos pida un número de ventas a
* introducir, después nos pedirá tantas ventas por teclado como
* número de ventas se hayan indicado. Al final mostrara la suma de
* todas las ventas. Piensa que es lo que se repite y lo que no.
* */
public class NumeroVentas {
    public static void main(String[] args) {

        int numeroProductos = Integer.parseInt(JOptionPane.showInputDialog("Productos en canasta: "));
        int ventas = 0, producto;



        for (int i = 0; i < numeroProductos; i++) {
            producto = Integer.parseInt(JOptionPane.showInputDialog("Valor del producto: "));
            ventas += producto;
        }

        JOptionPane.showMessageDialog(null,"TOTAL a Pagar: "+ventas);
    }
}
