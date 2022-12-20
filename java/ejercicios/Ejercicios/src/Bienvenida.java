import javax.swing.*;
import java.util.Scanner;

public class Bienvenida {
    /*
    * Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
    * Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».
    * */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre = JOptionPane.showInputDialog("Nombre: ");
        String apellido = JOptionPane.showInputDialog("Apellido: ");

        System.out.println("Bienvenido "+nombre+" "+apellido);
    }
}
