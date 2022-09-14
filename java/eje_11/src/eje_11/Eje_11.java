
package eje_11;

//@author Sistemas

import java.util.Scanner;


public class Eje_11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu calificacion: ");
        var calificacion = entrada.nextFloat();
        
        if(calificacion >= 9 && calificacion <= 10){
            System.out.println("NOTA: A");
        }
        else if(calificacion >= 8 && calificacion < 9){
            System.out.println("NOTA: B");
        }
        else if(calificacion >= 7 && calificacion < 8){
            System.out.println("NOTA: C");
        }
        else if(calificacion >= 6 && calificacion < 7){
            System.out.println("NOTA: D");
        }
        else if(calificacion >= 0 && calificacion < 6){
            System.out.println("NOTA: F");
        }
        else{
            System.out.print("Valor desconocido");
        }
        
        System.out.print("Nota ingresada: "+calificacion);
    }

}
