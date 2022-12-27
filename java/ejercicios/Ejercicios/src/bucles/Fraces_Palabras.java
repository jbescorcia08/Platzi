package bucles;

public class Fraces_Palabras {
    public static void main(String[] args) {
        String frace = "Hola jesus como estas?";
        String palabras[]= frace.split(" ");

        for(String palabra: palabras){
            System.out.println(palabra);
        }

    }
}
