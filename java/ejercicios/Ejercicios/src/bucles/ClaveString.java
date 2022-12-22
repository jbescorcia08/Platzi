package bucles;

import javax.swing.*;

/*
* Escribe una aplicación con un String que contenga una contraseña cualquiera.
* Después se te pedirá que introduzcas la contraseña, con 3 intentos.
* Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje
* diciendo «Enhorabuena». Piensa bien en la condición de salida
* (3 intentos y si acierta sale, aunque le queden intentos).


 * */
public class ClaveString {
    public static void main(String[] args) {
        String clave = "B4rr1os22";
        boolean correcto = true;
        int intentos = 1;

        while(correcto == false || intentos < 3){
            String inputClave = JOptionPane.showInputDialog("Ingresa la clave:");
            if(clave == inputClave){
                correcto = true;
                JOptionPane.showMessageDialog(null, "Enhorabuena");
            }if(clave != inputClave){
                JOptionPane.showMessageDialog(null,"Te quedan "+intentos+" INTENTOS.");
                intentos++;
            }
        }
    }
}
