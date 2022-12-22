package ejercicios;

import javax.swing.*;

public class ModuloNumero {

    /*
    * Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
    * */
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero: "));

        if( numero % 2 == 0){
            System.out.println("El numero es divisible entre 2.");
        }else{
            System.out.println("El numero no es divisible entre 2.");
        }
    }
}
