/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ciclo1c;

import javax.swing.JOptionPane;

public class Ciclo1C {

    
    public static void main(String[] args) {
        int nota, aprobados =0, condicionados = 0, suspensos = 0;
        
        for (int i = 1; i <= 6; i++) {
            
            do{
                nota = Integer.parseInt(JOptionPane.showInputDialog("Estudiante: "+i+" Ingresa la nota"));
            }while(nota < 0 || nota > 10);
            
            if (nota > 4 && nota <=10){
                aprobados++;
            }
            if(nota == 4){
                condicionados++;
            }
            if(nota < 4){
                suspensos++;
            }
        }
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Acondicionados: "+condicionados);
        System.out.println("Suspensos: "+suspensos);
        
    }

}
