

package pasoPorValor;


import Clases.Persona;

public class PasoValor {


    public static void main(String[] args) {
        var x = 10;
        System.out.println("X = "+x);
        
        cambioValor(x);
        
        System.out.println("X nuevo valor: "+x);
    }
    public static void cambioValor(int x1){
        System.out.println("X1 = "+x1);
        x1 = 15;
    }
}
