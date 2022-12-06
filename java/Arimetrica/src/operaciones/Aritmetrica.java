package operaciones;

public class Aritmetrica {
    //atributos
    int a, b;


    //metodo

    public void sumar(){
        int resutado = a + b;
        System.out.println("SIn retorno: " +resutado);
    }

    public int sumarReturn(){
        return a + b;
    }

    public int sumarArgumentos(int a, int b){
        // el uso de this elimina la ambiguedad, se refiere
        // al uso de la variable dentro de metodo o la que se pide
        // en el argumento
        this.a = a;
        this.b = b;
        return this.a + this.b;
    }

    //constructor vacio
    public Aritmetrica(){
        System.out.println("Hola !!");
    }

    // constructor con argumentos
    public Aritmetrica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con ARGumentos");
    }
}
