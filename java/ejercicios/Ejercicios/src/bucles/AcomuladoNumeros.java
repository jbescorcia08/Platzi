package bucles;

import javax.swing.*;
//Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el promedio de números introducidos.
public class AcomuladoNumeros {
    public static void main(String[] args) {
        int acumulado = 0, contador = 0;
        double promedio;
        boolean stop = true;
        do {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
            if(numero < 0){
                stop = false;
            }else{
                acumulado +=numero;
                contador++;
            }
        }while (stop);
        promedio = acumulado / contador;
        JOptionPane.showMessageDialog(null,"Promedio de numeros positivos ACOMULADO: "+promedio);
    }
}
