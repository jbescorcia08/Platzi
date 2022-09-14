
package ceje_1;

//@author Sistemas

public class Ceje_1 {

    public static void main(String[] args) {
        int contador = 0, contador2 = 0, contador3 = 0;
        
        while(contador < 3){
            System.out.println("COntador: "+contador);
            contador++;
        }
        
        
        
        
        do{
            System.out.println("contador 2: "+contador2);
            contador2++;
        }while(contador2 < 0);
        
        
        
        
        for (contador3 = 0; contador3 < 10; contador3++) {
            if(contador3 % 2 == 0){
                continue;
            }
            System.out.println("Contador 3: "+contador3);
        }
        
    }

}
