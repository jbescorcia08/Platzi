import javax.swing.*;

public class AncciChar {
    public static void main(String[] args) {
        char ancciChar;
        int ancci = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        ancciChar = (char) ancci;


        System.out.print("Caracter en tabla ancci; "+ancciChar);
    }
}
