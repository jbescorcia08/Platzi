
package ordenararreglo;

//@author Sistemas

public class OrdenarArreglo {

    public static void main(String[] args) {
        
        int[] numeros = {1,8,2,7,3,6,3,4,5,10,9,102,11,13};
        
        
        for (int i = 0; i < numeros.length -1; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[i] > numeros[j]){
                    int numero = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = numero;
                }
            }
        }
        for (int n = 0; n < numeros.length; n++) {
            System.out.print(" ["+numeros[n]+"] ");
        }
    }

}
