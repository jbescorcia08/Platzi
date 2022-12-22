package bucles;
/*
12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
Utiliza el bucle que desees.
* */
public class Mod_2and3 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100){
            if(i % 2 == 0 || i % 3 == 0){
                    System.out.println(i);
            }
            i++;
        }

    }
}
