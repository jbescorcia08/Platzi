
package eje_1;

//@author Sistemas

import java.util.Scanner;


public class Eje_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el tamaño del Vectro: ");
        int Tamaño = sc.nextInt();
        
        String[] vector = new String[Tamaño];
        
        for (int i = 0; i < Tamaño; i++) {
            System.out.print("Ingresa el valor "+(i+1)+" del vector:");
            vector[i] = sc.nextLine();
        }
        for(String s: vector){
            System.out.println(s);
        }
    }

}
