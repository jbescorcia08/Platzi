package bucles;

import javax.swing.*;

public class SumaNumeros {
    public static void main(String[] args) {
        int suma = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        if(numero <= 1){
            JOptionPane.showMessageDialog(null, "Valor ingresado Incorrecto.");
        }else {
        for (int i = 1; i <= numero ; i++) {
            suma +=i;
        }
        JOptionPane.showMessageDialog(null,"Suma total; "+suma);
        }
    }
}
