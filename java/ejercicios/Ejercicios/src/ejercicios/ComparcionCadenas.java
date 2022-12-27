package ejercicios;

import javax.swing.*;

public class ComparcionCadenas {
    public static void main(String[] args) {

        String cadena1 = JOptionPane.showInputDialog("Ingresa la primera cadena").toLowerCase();
        String cadena2 = JOptionPane.showInputDialog("Ingresa la segunda cadena").toLowerCase();

        if(cadena1.equals(cadena2)){
            System.out.println("cadena 1 es igual a la 2");
        }else{
            System.out.println("las cadenas no son iguales");
        }
    }
}
