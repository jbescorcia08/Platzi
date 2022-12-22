package ejercicios;

public class Variables {
    /*
    * Declara dos variables numéricas (con el valor que desees), muestra
    * por consola la suma, resta, multiplicación, división y módulo
    * (resto de la división).
    * */
    public static void main(String[] args) {
        int numero1 = 22;
        int numero2 = 2;

        System.out.println("Numeros: \n"+numero1+"\n"+numero2);

        System.out.println("Suma: "+(numero1+numero2));
        System.out.println("Resta: "+(numero1-numero2));
        System.out.println("Multiplicacion: "+(numero1*numero2));
        System.out.println("Divicion: "+(numero1/numero2));
        System.out.println("Modulo: "+(numero1%numero2));
    }
}
