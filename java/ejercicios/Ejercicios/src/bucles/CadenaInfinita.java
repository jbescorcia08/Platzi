package bucles;

import javax.swing.*;

//Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacia. Mostrar la cadena resultante
public class CadenaInfinita {
    public static void main(String[] args) {
        String fraceInfinita = "";
        boolean stop = true;
        do{
            String frace = JOptionPane.showInputDialog("ESCRIBE UNA FRACE");
            if(frace.isEmpty()){
                stop = false;
            }else{
                fraceInfinita +=frace;
            }
        }while (stop);
        JOptionPane.showMessageDialog(null,"Frace infinita: "+fraceInfinita);

    }
}
