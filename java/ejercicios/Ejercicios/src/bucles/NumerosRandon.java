package bucles;

import javax.swing.*;

/*
* Pide por teclado dos número y genera 10 números aleatorios entre esos números.
* Usa el método Math.random para generar un número entero aleatorio
* (recuerda el casting de double a int).
* */
public class NumerosRandon {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Numeros aleatorios entre el numero 1 a numero 2");
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
        int[] numeroAleatorioSave = new int[10];
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = (int)(Math.random()*(numero1 - numero2) + numero2);
            numeroAleatorioSave[i] = numeroAleatorio;
        }
        for (int i = 0; i < numeroAleatorioSave.length; i++) {
            System.out.print("Numero: "+(i+1)+": ["+numeroAleatorioSave[i]+"], ");
        }
    }
}
