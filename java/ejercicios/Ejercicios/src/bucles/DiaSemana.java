package bucles;

import javax.swing.*;

/*
* Crea una aplicación que nos pida un día de la semana y que nos
* diga si es un dia laboral o no. Usa un switch para ello
* */
public class DiaSemana {
    public static void main(String[] args) throws IllegalStateException {
        int dia;
        do {
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un dia de Semana." +
                    "\nINGRESA UN NUMERO DEL 1 al 7." +
                    "\n0. para salir !!"));
            switch (dia) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Es lunes");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Es martes");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Es miercoles");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Es jueves");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Es viernes");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Es sabado");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Es domingo");
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingresa un valor correcto, vuelve a intentarlo !!");
            }
        } while (dia != 0);
        JOptionPane.showMessageDialog(null, "Finalizo el programa !!");
    }
}
