package bucles;

import javax.swing.*;

/**
 * Realiza una aplicación que nos calcule una ecuación de segundo grado.
 * Debes pedir las variables a, b y c por teclado y comprobar antes que
 * el discriminante (operación en la raíz cuadrada).
 * Para la raíz cuadrada usa el método sqlrt de Math.
 * Te recomiendo que uses mensajes de traza.
 */
public class Ecuacion2grado {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de a"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de b"));
        int c=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de c"));

        double discriminante=Math.pow(b, 2)-(4*a*c);

        System.out.println(">>"+discriminante);

        if (discriminante>0){
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);

            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }
}
