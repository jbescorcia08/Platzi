
package eje_10;

//@author Sistemas

import java.util.Scanner;


public class Eje_10 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       
        
        System.out.print("Ingresa tu calificacion: ");
        var calificacion = entrada.nextFloat();
        
        if(calificacion >= 9 || calificacion <= 10){
            System.out.print("NOTA: A");
        }
        else if(calificacion >= 8 || calificacion < 9){
            System.out.print("NOTA: B");
        }
        else if(calificacion >= 7 || calificacion < 8){
            System.out.print("NOTA: C");
        }
        else if(calificacion >= 6 || calificacion < 7){
            System.out.print("NOTA: D");
        }
        else if(calificacion >= 0 || calificacion < 6){
            System.out.print("NOTA: F");
        }
        else{
            System.out.print("Valor desconocido");
        }
        
        System.out.print("Nota ingresada: "+calificacion);
    }

}
