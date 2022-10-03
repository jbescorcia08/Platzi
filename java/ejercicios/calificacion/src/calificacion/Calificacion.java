
package calificacion;

import java.util.Scanner;

//@author Sistemas

public class Calificacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la calificacion: ");
        double c = sc.nextDouble();
        
        if(c <= 10 && c > 8){
            System.out.println("Calificacion: "+c+" APROVADO");
        }else if(c <= 8 && c >= 6){
            System.out.println("Calificacion: "+c+" Bueno !!");
        }else if(c <= 5 && c == 0){
            System.out.println("Calificacion: "+c+" NO APROVADO");
        }else{
            System.out.println("Valide la nota ingresada");
        }
        
    }

}
