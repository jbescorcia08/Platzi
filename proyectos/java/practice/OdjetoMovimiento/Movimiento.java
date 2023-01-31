package OdjetoMovimiento;
/*
 * Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice su posición dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero.
*/
public class Movimiento {
    private int posicionX = 0;
    private int posicionY = 0;
    private int posicion_X = 0;
    private int posicion_Y = 0;
    

    public Movimiento(Integer posicionX) {
        this.posicionX = this.posicionY = posicionX;
    }

    public Movimiento(Integer posicionX, Integer posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    

    public void setPosicionX(Integer posicionX) {
        if(posicionX > 0){
            this.posicionX += 1;
        }else if(posicionX < 0){
            this.posicion_X -= 1;
        }else{
            this.posicionX = 0;
            this.posicion_X = 0;
        }
        
    }

    public void setPosicionY(Integer posicionY) {
        if(posicionY > 0){
            this.posicionY += 1;
        }else if(posicionY < 0){
            this.posicion_Y -= 1;
        }else{
            this.posicionY = 0;
            this.posicion_X = 0;
        }
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void PrintCordenadas() {
        System.out.println("\nX Estas en: " + this.posicionX);
        System.out.println("\nY Estas en: " + this.posicionY);
        System.out.println("\n-X Estas en: " + this.posicion_X);
        System.out.println("\n-Y Estas en: " + this.posicion_Y);
    }
    

    
    
    



    
}
