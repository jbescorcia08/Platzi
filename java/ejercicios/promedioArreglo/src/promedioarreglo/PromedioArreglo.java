
package promedioarreglo;

//@author Sistemas

public class PromedioArreglo {

    public static void main(String[] args) {
        double[] numeros = {5,4,5,3.9,5};
        double  suma = 0, promedio;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        promedio = suma / numeros.length;
        System.out.println("Promedio de las notas en vector son: "+promedio);
    }

}
