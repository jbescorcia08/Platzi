
package ejercicioa1;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class EjercicioA1 {

    public static void main(String[] args) {
        
        // CLASE SCANNER --> entrada y salida por consola 
         
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe el titulo; ");
        var titulo = entrada.nextLine();
        
        
        System.out.println("Escribe el autor");
        var autor = entrada.nextLine();
        
        System.out.println(titulo+" Fue escrito por;  "+ autor);
    }
    
}
