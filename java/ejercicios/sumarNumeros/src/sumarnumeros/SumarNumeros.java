
package sumarnumeros;

//@author Sistemas

import java.util.Scanner;


public class SumarNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un numero: ");
        int a = sc.nextInt();
        
        System.out.println("Ingresa un numero: ");
        int b = sc.nextInt();
        
        int c = a + b;
        
        System.out.println("Suma de numeros: "+c);
    }

}
