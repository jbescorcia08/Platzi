
package crearmatriz;

//@author Sistemas

public class CrearMatriz {

    public static void main(String[] args) {
        
        int tamano = 3;
        int[][] matriz = new int[tamano][tamano];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j] = (int)(Math.random()*9+1);
                System.out.print("|   "+matriz[i][j] + "\t");
            }
            System.out.println("|");
        }

    }

}
