
package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
       var x = 10;
       
       cambioValor(x);
       
       System.out.println("X es = "+x);    
    }
    
    
    public static void cambioValor(int agr1){
        System.out.println("agr1 = "+agr1);
        agr1 = 39;
    }
}
