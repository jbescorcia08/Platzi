
package parimpar;

//@author Sistemas

import java.util.Scanner;


public class ParImpar {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("El numero "+numero+" Es par");
        }else{
            System.out.println("Es impar "+numero);
        }
    }

}
