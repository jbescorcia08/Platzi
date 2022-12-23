package bucles;

import javax.swing.*;
/*
* Pide por teclado un número entero positivo (debemos controlarlo) y muestra
* el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que
* tiene 4 cifras. * Tendremos que controlar si tiene una o mas cifras,
* al mostrar el mensaje.
* */
public class LongitudCifras {
    public static void main(String[] args) {
        String run = "si";
        boolean control = true;
        JOptionPane.showMessageDialog(null, "Este programa te dira Cuantas cifras tiene un NUMERO POSITIVO.");
        while(control){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero: "));
            int longitud = Integer.toString(numero).length();
            JOptionPane.showMessageDialog(null,"El numero tiene: ["+(longitud)+"] CIFRAS.");
            String stop = JOptionPane.showInputDialog("Deseas seguir?");
            if(!run.equals(stop.toLowerCase())){
                control = false;
            }
        }
        JOptionPane.showMessageDialog(null, "FIN DEL PROGRAMA.");

    }
}
