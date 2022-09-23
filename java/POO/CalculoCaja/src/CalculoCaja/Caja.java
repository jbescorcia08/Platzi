

package CalculoCaja;


public class Caja {
    int ancho, alto, profundo, volumen;
    public Caja(){
        
    }
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcularVolumen(){
        return volumen = ancho * alto * profundo;
    }
    

}
