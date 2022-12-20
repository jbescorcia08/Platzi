public class ValidacionEnteros {
    /*Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
    Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.*/
    public static void main(String[] args) {
        int numero1 =(int)(Math.random()*10+1);
        int numero2 =(int)(Math.random()*10+1);

        if(numero1 > numero2){
            System.out.println("Numero 1 es el mayor; "+numero1);
        }else if(numero1<numero2){
            System.out.println("Numero 2 es el mayor; "+numero2);
        }else{
            System.out.println("Son numeros iguales...\n"+numero1+"\n"+numero2);
        }
    }
}
