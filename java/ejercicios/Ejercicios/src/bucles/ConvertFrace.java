package bucles;

import javax.swing.*;

//30) Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.
public class ConvertFrace {
    public static void main(String[] args) {
        boolean stop = true;
        do{
            String frace = JOptionPane.showInputDialog("ESCRIBE UNA FRACE");
            if(frace.isEmpty()) {
                stop = false;
            }else{
            int opciones = Integer.parseInt(JOptionPane.showInputDialog("Elige a tu preferecia: " +
                    "\n 1. Mayusculas." +
                    "\n 2. Minusculas"+
                    "\n 0. SALIR"));
            switch (opciones){
                case 1:
                    JOptionPane.showMessageDialog(null,"FRACE A MAYUSCULAS: "+frace.toUpperCase());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"FRACE A MINUSCULAS: "+frace.toLowerCase());
                    break;
                case 0:
                    stop = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"INGRESA UNA CADENA VALIDA:");
                }
            }
        }while (stop);
    }
}
