
package eje_9;

//@author Sistemas

import java.util.Scanner;


public class Eje_9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        var numero1 = entrada.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        var numero2 = entrada.nextInt();
        
        if (numero1 > numero2){
            System.out.println("El numero 1: "+numero1+" es el mayor");
        }
        else{
            System.out.println("El numero 2: "+numero2+" es el mayor");
        }
    }

}
