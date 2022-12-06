package operaciones;

public class ResultadoOperaciones {
    public static void main(String[] args) {

        int a = 10;
        int b = 23;
        miMetodo();

        Aritmetrica arimetrica1 = new Aritmetrica();
        System.out.println("arimetrica1: "+arimetrica1.a);
        System.out.println("arimetrica1: "+arimetrica1.b);

        Aritmetrica arimetrica2 = new Aritmetrica(45,5);
        System.out.println("arimetrica1: "+arimetrica2.a);
        System.out.println("arimetrica1: "+arimetrica2.b);
    }
    public static void miMetodo(){
        System.out.println("Mi metodo !!");
    }
}
