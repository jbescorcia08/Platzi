package bucles;

import javax.swing.*;

public class EliminarEspaciosFrace {
    public static void main(String[] args) {
        String frace = JOptionPane.showInputDialog("ESCRIBE UNA FRACE");
        String fraceSinEspacios="";
        for (int i = 0; i < frace.length(); i++) {
            if (frace.charAt(i) != ' '){
                fraceSinEspacios += String.valueOf(frace.charAt(i));
            }
        }
        System.out.println(fraceSinEspacios);
    }
}

