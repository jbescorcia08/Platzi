
package eje_2;

//@author Sistemas

public class EJe_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int mayor = 0;
        int menor = 0;
        int posicionMenor = 0;
        int posicionMayor = 0;
        
        int[] vector = {4,2,3,8,5,6,7,82};
        
        for (int i = 0; i < vector.length; i++) {
            
            if(vector[i] > mayor && vector[i] < menor){
                mayor = vector[i];
                posicionMayor = i;
                menor = vector[i];
                posicionMenor = i;
            }
            
        }
        System.out.println("El numero mayor es: "+mayor+" en la posicion: "+posicionMayor);
        System.out.println("El numero menor es: "+menor+" en la posicion: "+posicionMenor);
    }

}
