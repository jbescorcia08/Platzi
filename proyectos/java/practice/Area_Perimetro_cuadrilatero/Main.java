import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cuadrilatero cuadrilatero1;
        System.out.println("Ingresa el numero 1");
        float numero1 = entrada.nextFloat();
        System.out.println("Ingresa el numero 2");
        float numero2 = entrada.nextFloat();

        if(numero1 != numero2){
            cuadrilatero1 = new Cuadrilatero(numero1, numero2);
        }else{
            cuadrilatero1 = new Cuadrilatero(numero1);
        }

        System.out.println("El area del cuadrilatero es: "+cuadrilatero1.getArea());
        System.out.println("El Perimetro del cuadrilatero es: "+cuadrilatero1.getPerimetro());
    }
}
