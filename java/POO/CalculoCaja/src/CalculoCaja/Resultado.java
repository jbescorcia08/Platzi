package CalculoCaja;

public class Resultado{
    public static void main(String[] args) {

        int medidaAcho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;
        
        Caja caja = new Caja();
        caja.ancho = medidaAcho;
        caja.alto = medidaAlto;
        caja.profundo = medidaProf;
        
        int resultado = caja.calcularVolumen();
        System.out.println("El volumen de la caja es: "+resultado);
        
        
        Caja caja2 = new Caja(4,5,6);
        
        System.out.println("Calculo caja 2; "+caja2.calcularVolumen());
    }
    

} 