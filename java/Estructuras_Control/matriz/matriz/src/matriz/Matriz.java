
package matriz;

//@author Sistemas

import java.util.Scanner;


public class Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //maño de la matriz
        
        int[][] numeros = new int[3][3];
        
        // llena la matriz
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println("Ingrese el valor de fila: "+i+" columna: "+j);
                numeros[i][j] = sc.nextInt();
            }
        }
        
        //imprime la matriz
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                // imprime elementos diagonales
                if(j == i ){
                    System.out.print(numeros[i][j]+"\t");
                }
            }
            System.out.println("\n");
        }
    }

}
