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
        int numeroMayor = 0, numeroMenor = 0, sumaNumeros = 0, sumaPositivos = 0, sumaNegativos = 0, contaNumeros = 0, contaPositivos = 0, contNegativos = 0;
        boolean stop = true;
        do{
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero: "));


            // econtrara el numero mayor de los introducidos
            if(numeroMayor < numero){
                int tempMayor = numero;
                numeroMayor = tempMayor;
            //encontrara el menor de todos
            } else if (numeroMenor > numero) {
                int tempMenor = numero;
                numeroMenor = tempMenor;
            //sumara los numeros positivos
            } else if (numero > -1) {
                sumaPositivos += numero;
                contaPositivos++;
            //sumara los numeros negativos
            } else if (numero < -1 ) {
                sumaNegativos += numero;
                contNegativos++;
            }
            // suma general de todos los numeros
            sumaNumeros += numero;
            //contador de todos los numeros introducidos
            contaNumeros++;
            // este condicional rompe el siclo una vez introduzca el valor de (-1)
            if(numero == -1 ){
                JOptionPane.showMessageDialog(null, "Introduciste -1, aca termino :(");
                stop = false;
            }
        }while(stop);
        double media = sumaNumeros / contaNumeros;
        System.out.println("\nNumero Mayor introduccido: "+numeroMayor);
        System.out.println("Numero menor introducido: "+numeroMenor);
        System.out.println("Suma de positivos: "+sumaPositivos+" Numeros positivos: "+contaPositivos);
        System.out.println("Suma de negativos: "+sumaNegativos+" Numeros negativos: "+contNegativos);
        System.out.println("Media de los numeros introduccidos: "+media);

    }
}
