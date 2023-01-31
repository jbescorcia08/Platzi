package OdjetoMovimiento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean dir = true;
        int posicion, numeroX = 0, numeroY = 0;
        Movimiento cordenadas = new Movimiento(numeroX,numeroY);

        while (dir) {
            
            System.out.println("\nMovimientos.\n"
            +"1. arriba.\n"
            +"2. abajo.\n"
            +"3. izquierda.\n"
            +"4. derecha.\n"
            +"5. Donde estoy.\n"
            +"0. Dejar de moverme !!\n");
            posicion = sc.nextInt();

            switch(posicion){
                case 0:
                    dir = false;
                    break;
                case 1:
                    numeroX = 1;
                    cordenadas.setPosicionX(numeroX);
                    break;
                case 2:
                    numeroY = 1;
                    cordenadas.setPosicionY(numeroY);
                    break;
                case 3:
                    numeroX = -1;
                    cordenadas.setPosicionX(numeroX);
                    break;
                case 4:
                    numeroY = -1;
                    cordenadas.setPosicionY(numeroY);
                    break;
                case 5:
                    cordenadas.PrintCordenadas();
                    break;
                default:
                    System.out.println("Datos ingresados NO validos.");
                    break;
                    
            }
            
        }
        
        
    }
}
