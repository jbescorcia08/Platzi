package bucles;

import javax.swing.*;

/**
 *  Lee un número por teclado y comprueba que este numero es mayor o igual
 *  que cero, si no lo es lo volverá a pedir (do while),
 *  después muestra ese número por consola.
 */
public class NumeroMayor {
    public static void main(String[] args) {
        int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero: "));
        }while (numero <= 0);


    }
}
