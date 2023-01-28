package OdjetoMovimiento;
/*
 * Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice su posición dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero.
*/
public class Movimiento {
    private Integer posicionX = 0;
    private Integer posicionY = 0;
    
    public Movimiento(short posicionX,short posicionY){
        this(0,0);
    }

    public Movimiento(Integer posicionX) {
        this.posicionX = this.posicionY = posicionX;
    }

    public Movimiento(Integer posicionX, Integer posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public Integer getPosicionX() {
        if(this.posicionX > 0){
            this.posicionX += 1;
        }else if(this.posicionX < 0){
            this.posicionX -= 1;
        }else{
            this.posicionX = 0;
        }
        return posicionX;
    }

    public Integer getPosicionY() {
        if(this.posicionY > 0){
            this.posicionY += 1;
        }else if(this.posicionY < 0){
            this.posicionY -= 1;
        }else{
            this.posicionY = 0;
        }
        return posicionY;
    }

    @Override
    public String toString() {
        return "Movimiento [posicionX=" + posicionX + ", posicionY=" + posicionY + "]";
    }
    
    
    



    
}
