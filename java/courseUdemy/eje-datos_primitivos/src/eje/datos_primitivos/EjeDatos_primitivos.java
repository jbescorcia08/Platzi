
package eje.datos_primitivos;

//@author Sistemas

public class EjeDatos_primitivos {

    public static void main(String[] args) {
        
        // datos primitivos --> enteros, byte, short, long
        
        
        //byte
        byte numeroByte = 10; 
        System.out.println("numero BYTE "+numeroByte);
        System.out.println("Numero minimo BYTE; " + Byte.MIN_VALUE);
        System.out.println("Numero maximo BYTE; "+ Byte.MAX_VALUE);
        
        System.out.println("---------------------------------------------------");
        //short
        
        short numeroShort = 29;
        System.out.println("Numero Short; "+numeroShort);
        System.out.println("Numero minimo SHORT; "+ Short.MIN_VALUE);
        System.out.println("Numero maximo SHORT; "+ Short.MAX_VALUE);
        
        System.out.println("---------------------------------------------------");
        //Enteros
        
        int numeroInt = 100;
        System.out.println("Numero Entero; "+numeroInt);
        System.out.println("Cantidad minima de enteros; "+ Integer.MIN_VALUE);
        System.out.println("Valor maximo enteros; "+ Integer.MAX_VALUE);
        
        System.out.println("---------------------------------------------------");
        //log
        
        long numeroLong = 23;
        System.out.println("Numero LONG; "+numeroLong);
        System.out.println("valor minimo numero LONG; "+ Long.MIN_VALUE);
        System.out.println("valor maximo numero LONG; "+ Long.MAX_VALUE);
    }

}
