/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos1a;

import javax.swing.JOptionPane;

public class Ciclos1A {
    public static void main(String[] args) {
        
        double edad, altura, mediaE=0, mediaA=0, totalE, totalA;
        int contadorEdad = 0, contadorAltura =0, estudiante = 0;
        
        for (int i = 1; i <= 5; i++) {
            edad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu edad; "));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura; "));
            
            mediaE+=edad;
            mediaA+=altura;
            
            if(edad > 18){
                contadorEdad=+1;
            }
            else if(altura > 1.75){
                contadorAltura=+1;
            }else{
                estudiante++;
            }
            
        }
        
        totalE = mediaE / 5;
        totalA = mediaA / 5;
        System.out.println("Estudiante menor y chaparro: "+estudiante);
        System.out.println("La altura media es de; "+totalA
        +"\nLa edad media es de; "+totalE
        +"\nEstos son los alumnos "+contadorEdad+" mayores de 18 anos"
        +"\nEstos son los alumnos "+contadorAltura+" con la altura mayor a 1.75 cm");
    }
    
}
