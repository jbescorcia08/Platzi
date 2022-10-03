
package numerosparesfor;

//@author Sistemas

import java.util.Scanner;


public class NumerosParesFor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese el numero");
        int n = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            if( i % 2 == 0){
                System.out.println("Numero PAR: "+i);
            }
        }
    }

}
