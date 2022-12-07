
package datosprimitivos;

//@author Sistemas

import java.util.Scanner;


public class DatosPrimitivos {

    public static void main(String[] args) {
        // String a entero
        
        var edad = Integer.parseInt("20");
        System.out.println(edad + 1);
        
        
        // string a double
        
        var valorDoble = Double.parseDouble("3.44");
        System.out.println(valorDoble);
        
        // pedir un valor 
        
        var consola = new Scanner(System.in);
        edad = Integer.parseInt(consola.nextLine());
        System.out.println(edad + 1);
        
    }

}
