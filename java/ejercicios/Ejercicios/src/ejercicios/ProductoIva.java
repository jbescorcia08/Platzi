package ejercicios;

import javax.swing.*;

public class ProductoIva {
    public static void main(String[] args) {
        double producto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del PRODUCTO."));
        double total, iva;
        iva = producto * 0.21;
        total = producto + iva;

        JOptionPane.showMessageDialog(null,"Total a pagar: "+ total);
    }
}
