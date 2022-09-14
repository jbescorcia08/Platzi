
package eje_8;

//@author Sistemas

import java.util.Scanner;


public class Eje_8 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
       
       
        System.out.print("Ingresa el alto del rectangulo: ");
        var alto = entrada.nextInt();
        System.out.print("Ingresa el ancho del rectangulo: ");
        var ancho = entrada.nextInt();
        
        // secalcula el area del rectangulo
        var area = alto * ancho;
        // calcula el perimetro
        var perimetro = (alto + ancho) * 2;
        
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
        
        

    }

}
