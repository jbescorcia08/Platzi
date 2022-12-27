package bucles;

import javax.swing.*;

/*
38) Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
Al terminar, mostrará lo siguiente:
– mayor numero introducido
– menor numero introducido
– suma de todos los numeros
– suma de los numeros positivos
– suma de los numeros negativos
– media de la suma (la primera que pido)

El número -1 no contara como número.
* */
public class Numeros {
    public static void main(String[] args) {
        int numeroMayor = 0, numeroMenor = 0, Sumanumeros, sumaPositivos, sumaNegativos, media;
        boolean stop = true;
        do{
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero: "));

            // este condicional rompe el siclo una vez introduzca el valor de (-1)
            if(numero == -1 ){
                stop = false;
            }


        }while(stop);
    }
}
