package OdjetoMovimiento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movimiento cordenadasX, cordenadasY;
        Scanner sc = new Scanner(System.in);

        boolean dir = true;

        while (dir) {
            System.out.println("ingresa La posicion en X");
            Integer numeroX = sc.nextInt();
            System.out.println("Ingresa La posicion en Y");
            Integer numeroY = sc.nextInt();

            if(numeroX == numeroY){
                cordenadasX = new Movimiento(numeroX);
                cordenadasY = new Movimiento(numeroY);
                cordenadasX.getPosicionX();
                cordenadasY.getPosicionY();
            }else if(numeroX > numeroY){
                cordenadasX = new Movimiento(numeroX,numeroY);
                cordenadasY = new Movimiento(numeroX,numeroY);
                cordenadasX.getPosicionX();
                cordenadasY.getPosicionY();
            }else{
                cordenadasX = new Movimiento(numeroX);
                cordenadasY = new Movimiento(numeroY);
                cordenadasX.getPosicionX();
                cordenadasY.getPosicionY();
            }

           System.out.println("deseas Continuar", dir ? true : false);
        }
    }
}
