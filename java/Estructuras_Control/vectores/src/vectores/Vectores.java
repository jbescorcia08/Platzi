
package vectores;

//@author Sistemas

import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {
//        Se tienen 2 vectores A y B de longitud n elaborar un programa que permita conformar un tercer 
//        vector con la suma de los dos vectores de la siguiente manera: el contenido de la primera 
//        posición de A con el contenido de la última posición de B, el de la segunda posición de A 
//        con el contenido de la penúltima posición de B y así hasta terminar los vectores. Imprimir 
//        los 3 vectores.
        
        int n = 10;
        
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        int[] vector3 = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector1[i] = (int)(Math.random()*10 + 1);
            vector2[i] = (int)(Math.random()*20 + 1);           
        }
        int inverso = n -1;
        for (int i = 0; i < n; i++) {
            vector3[i] = vector1[i] + vector2[inverso];
            inverso--;
        }
        System.out.println("\nVector A: ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(" | "+vector1[i]);
        }
        System.out.println("\nVector B: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.println(" | "+vector2[i]);
        }
        System.out.println("\nVector C: ");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println(" | "+vector3[i]);
        }
    }

}
