
package nparesarreglos;

//@author Sistemas

public class NParesArreglos {

    public static void main(String[] args) {
        // ingresa el arreglo
        int[] numeros = {61,8,74,50,23,32,65,47,58,21,9,81,48,32};
        // creo uno vacio donde terminaran lo numeros pares del vector numeros[], asi mismo agrgando su mismo tamaño
        int[] numerosPar = new int[numeros.length];
        
        // un for para recorer el vector numeros
        for (int i = 0; i < numeros.length; i++) {
            // esta operacion determina si un numero es par, en cada posicion del vector numeros[]
            if(numeros[i] % 2 == 0){
                // al realizar la operacion anterior solo pasara los numeros pares asignandolo al vector vacio
                numerosPar[i] = numeros[i];
                //imprimimos el vectos vacio:
                System.out.print("["+numerosPar[i]+"] ");
            }
            
        }
        
    }

}
