package bucles;

import javax.swing.*;

//34) Dada una frase, separarlo en palabras.
public class SepararFraces {
    public static void main(String[] args) {

       String frace = JOptionPane.showInputDialog("Ingresa la frase");

       String [] extraerPalabra = frace.split(" ");
        // aca use el foreach para recorer un vector, cabe resaltar que solo hace la funcion de recorrer.
        for (String palabra: extraerPalabra) {
            System.out.println(palabra);
        }

    }
}
