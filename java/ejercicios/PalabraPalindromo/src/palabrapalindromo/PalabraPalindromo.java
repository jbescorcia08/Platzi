
package palabrapalindromo;

//@author Sistemas

import java.util.Scanner;


public class PalabraPalindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        boolean NoPalindromo = true;
        String palabra;
        
        System.out.println("Ingresa la palabra");
        palabra = sc.nextLine().toLowerCase().replace(" ", "");
        
        for (int i = 0, j = palabra.length() -1; i <= j; i++, j--) {
            if(palabra.charAt(i) != palabra.charAt(j)){
                NoPalindromo = false;
            }
        }
        if(NoPalindromo == true){
            System.out.println("La palabra: ["+palabra+"] Es palindroma");
        }else{
            System.out.println("La palabra: ["+palabra+"] No es palindroma");
        }
    }

}
