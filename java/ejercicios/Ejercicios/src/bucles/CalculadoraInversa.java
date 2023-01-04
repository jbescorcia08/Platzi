package bucles;
/*
* Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizara la operación correspondiente.
* Al final mostrara el resultado en un cuadro de dialogo.
  Los signos aritméticos disponibles son:

    +: suma los dos operandos.
    -: resta los operandos.
    *: multiplica los operandos.
    /: divide los operandos, este debe dar un resultado con decimales (double)
    ^:  1º operando como base y 2º como exponente.
    %:  módulo, resto de la división entre operando1 y operando2.
* */
import javax.swing.*;

public class CalculadoraInversa {
    public static void main(String[] args) {
        boolean stop = true;
        do{
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
            int operacion = Integer.parseInt(JOptionPane.showInputDialog("  0 +: suma los dos operandos.\n" +
                    "  1  -: resta los operandos.\n" +
                    "  2  *: multiplica los operandos.\n" +
                    "  3  /: divide los operandos, este debe dar un resultado con decimales (double)\n" +
                    "  4  ^: 1º operando como base y 2º como exponente.\n" +
                    "  5  %: módulo, resto de la división entre operando1 y operando2.\n" +
                    "  6  SALIR."));
            switch (operacion){
                case 0:
                    int suma = numero1 + numero2;
                    JOptionPane.showMessageDialog(null,"La suma de "+numero1+" & "+numero2+" ES: "+suma);
                    break;
                case 1:
                    int resta = numero1 - numero2;
                    JOptionPane.showMessageDialog(null,"La resta de "+numero1+" & "+numero2+" ES: "+resta);
                    break;
                case 2:
                    int multiplicacion = numero1 * numero2;
                    JOptionPane.showMessageDialog(null,"La multiplicacion de "+numero1+" & "+numero2+" ES: "+multiplicacion);
                    break;
                case 3:
                    double divicion = numero1 / numero2;
                    JOptionPane.showMessageDialog(null,"La divicion de "+numero1+" & "+numero2+" ES: "+divicion);
                    break;
                case 4:
                    double exponete = Math.pow(numero1,numero2);
                    JOptionPane.showMessageDialog(null,"EL exponete de "+numero1+" & "+numero2+" ES: "+exponete);
                    break;
                case 5:
                    double modulo = numero1 % numero2;
                    JOptionPane.showMessageDialog(null,"El modulo de "+numero1+" & "+numero2+" ES: "+modulo);
                    break;
                case 6:
                    stop = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingresa el valor adecuado !!");
            }


        }while (stop);
    }
}
