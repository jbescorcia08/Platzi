/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ciclo1e;

import javax.swing.JOptionPane;

public class Ciclo1E {

    
    public static void main(String[] args) {
        
        int numero, cNegativo =0, cPositivo = 0;
        Boolean negativo = true;
        
        for (int i = 0; i < 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
            
            if (numero < 0 == negativo ){
                cNegativo ++;
                System.out.println("Ha introducido un numero negativo");
            }else{
                cPositivo ++;
                System.out.println("Ha introducido un numero positivo");
            }
            
        }
        System.out.println("Numeros positivos; "+cPositivo);
        System.out.println("Numeros negativos; "+cNegativo);
        
    }

}
