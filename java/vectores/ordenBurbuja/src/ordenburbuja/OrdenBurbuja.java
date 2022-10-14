








package ordenburbuja;

//@author Sistemas

public class OrdenBurbuja {

    public static void main(String[] args) {
        
        int[] numeros = {3,1,2,5,4,7,9,78};
        
        for (int i = 0; i < numeros.length -1; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[i] > numeros[j]){
                    int numero = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = numero;
                }
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
    }

}
