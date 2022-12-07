package caja;

public class operacionCaja {
    int ancho, alto, profundo;

    public int caja(int ancho, int alto, int profundo){
       this.ancho = ancho;
       this.alto = ancho;
       this.profundo = profundo;
       return ancho * alto * profundo;

    }
    public void laboratorio(){
        System.out.println("OPeracion de calculo del Profundo de la CAJA");
    }
}
