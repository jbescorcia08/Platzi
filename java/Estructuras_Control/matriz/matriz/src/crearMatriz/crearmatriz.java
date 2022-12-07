/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearMatriz;

/**
 *
 * @author Sistemas
 */
public class crearmatriz {
    public static void main(String[] args) {
        
        int tamano = 3;
        int[][] matriz = new int[tamano][tamano];
        
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matriz [i][j] = (int)(Math.random()*9+1);
            }
        }
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; i < tamano; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
