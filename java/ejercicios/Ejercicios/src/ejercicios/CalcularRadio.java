package ejercicios;

import javax.swing.*;

public class CalcularRadio {
    /*
    * Haz una aplicación que calcule el área de un círculo(pi*R2).
    * El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
    * Usa la constante PI y el método pow de Math.
    * */
    public static void main(String[] args) {
        double pi = 3.14;
        double area, radio;

        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del CIRCULO"));
        area = pi*Math.pow(radio,2);

        System.out.println("El area del circulo es: "+area);


    }
}
