/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ciclo1d;

import javax.swing.JOptionPane;

public class Ciclo1D {

    
    public static void main(String[] args) {
        int sueldo, numero, sueldoMax=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        
        for (int i = 1; i <= numero; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog(i+". Ingresa tu sueldo: "));
            
            sueldoMax+=sueldo;
            
            if(sueldoMax==sueldo){
                sueldoMax+=sueldo;
            }               
        }
        System.out.println("Sueldo maximo; "+sueldoMax);
    }

}
