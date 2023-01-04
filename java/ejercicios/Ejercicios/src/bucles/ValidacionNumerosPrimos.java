package bucles;

import jdk.jshell.EvalException;

import javax.swing.*;

/*
* Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo.
* Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, * sin embargo, 17 si es primo. Un buen truco para calcular la raíz
* cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
* */
public class ValidacionNumerosPrimos {
    public static void main(String[] args) {
        int contador = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        for (int i = 1; i <= numero; i++) {
            int validacionPrimo = numero % i;
            if(validacionPrimo == 0){
                contador+=1;
            }
        }
        if(contador <= 2){
            JOptionPane.showMessageDialog(null,"EL numero: "+numero+" ES PRIMO.");
        }else {
            JOptionPane.showMessageDialog(null,"EL numero: "+numero+" NO ES PRIMO.");
        }
        JOptionPane.showMessageDialog(null,"FINALIZO EL PROGRAMA");
    }
}
