/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ciclo1f;

import javax.swing.JOptionPane;

public class Ciclo1F {

    
    public static void main(String[] args) {
        int nota;
        Boolean suspenso = false;
        
        for (int i = 1; i <= 5; i++) {
            do{
                
                nota = Integer.parseInt(JOptionPane.showInputDialog("Ingre la nota # "+i));
                
            }while(nota < 0 || nota > 10);
            
            if(nota < 4){
                suspenso = true;
            }else if(nota >= 4 && nota <= 10){
                suspenso = false;
            }
            
        }
        
        if (suspenso == true) {
            System.out.println("Hay un suspenso");
        }
        else if (suspenso == false){
            System.out.println("No hay suspensos");
        }
    }

}
