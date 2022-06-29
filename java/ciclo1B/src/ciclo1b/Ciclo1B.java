/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ciclo1b;

import javax.swing.JOptionPane;

public class Ciclo1B {

    
    public static void main(String[] args) {
        
        int numero, c = 0, resultado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Un numero del 0 al 10: "));

        do{
           
            resultado=c*numero;                        
            System.out.println( numero+" X "+c+" = "+resultado);
            c++;
            
        }while(c <= 12);

    }

}
