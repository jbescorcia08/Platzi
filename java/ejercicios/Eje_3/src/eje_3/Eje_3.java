
package eje_3;

//@author Sistemas

public class Eje_3 {

    public static void main(String[] args) {
        
        int n = 5;
        
        String[] listCadena = {"a","b","c","d","e"};
        int[] listaNumero = new int[n];
        
        
        for (int i = 0; i < n; i++) {
           listaNumero[i] = i+1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(listCadena[i] +" -> "+listaNumero[i]);
        }
    }

}
