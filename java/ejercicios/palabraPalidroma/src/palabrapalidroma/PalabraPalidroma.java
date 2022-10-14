
package palabrapalidroma;

//@author Sistemas

import java.util.Scanner;


public class PalabraPalidroma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra, palabra1="";
        
        System.out.println("Escribe una palabra: ");
        palabra = sc.nextLine().replace(" ", "").toLowerCase();
        
        for (int i = palabra.length()-1; i >= 0 ; i--) {
            palabra1 += palabra.charAt(i);
        }
        if(palabra.equals(palabra1) != true){
            System.out.println("No es polidroma");
        }else{
            System.out.println("Es polidroma");
        }
    }

}
