
package numeromayor;

//@author Sistemas

import java.util.Scanner;


public class NumeroMayor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             
        
        System.out.println("Numeros ingresados: ");
        int n = sc.nextInt();
        
 
        int mayor = 0, numero, i = 0 ;
        do{
            System.out.println("Ingresa el numero: ");
            numero = sc.nextInt();
            
            if(numero > mayor){
                mayor = numero;
            } 
            i++;
        }while(i < n);
        
        System.out.println("Numero Mayor: "+mayor);
    }

}
