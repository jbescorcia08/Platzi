package funciones.diaLaboral;

import javax.swing.*;

//35) Crea un enum con los días de la semana, pide un día de la semana e indica si es laboral o no (en el main).
public class DiaLaboral {
    public static void diaLaboral(){
        int dia;
        do {
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un dia de Semana." +
                    "\nINGRESA UN NUMERO DEL 1 al 7." +
                    "\n0. para salir !!"));
            switch (dia) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Es lunes, a trabajar !");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Es martes, a trabajar !");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Es miercoles, a trabajar !");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Es jueves, a trabajar !");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Es viernes, a trabajar !");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Es sabado, trabajas has medio tiempo");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Es domingo, descanso");
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingresa un valor correcto, vuelve a intentarlo !!");
            }
        } while (dia != 0);


    }
}
