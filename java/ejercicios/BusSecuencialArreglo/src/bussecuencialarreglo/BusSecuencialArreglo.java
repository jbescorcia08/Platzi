
package bussecuencialarreglo;

//@author Sistemas

public class BusSecuencialArreglo {

    public static void main(String[] args) {
        
        int[] numeros = {61,8,74,50,23,32,65,47,58,21,9,81,48,32};
        int numero = 48;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==numero){
                System.out.println("El numero esta en la posicion: "+i);
            }
        }
    }

}
