package bucles;

public class NumerosPrimos {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int validadPrimos = (int)Math.sqrt(i);
            int contador = 0;
            for (int j = validadPrimos; j >1 ; j--) {
                if(i%j== 0){
                    contador++;
                }
            }
        if(contador < 1) System.out.println(i);
        }
    }
}
