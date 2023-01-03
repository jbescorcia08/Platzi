package matrices.testDomain;

import arreglos.domain.Persona;

public class TestMatriz {
    public static void main(String[] args) {
        int  edades[][] = new int[3][2];

        edades[0][0] = 2;

        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                if(edades[i][j] == 0){
                    edades[i][j] = (int)(Math.random()*34+1);
                }
                System.out.print(edades[i][j]+"\t");
            }
            System.out.println();
        }

        String frutas[][] = {{"naranjas","limon"},{"fresas","zarzamora"}};
        Imprimir(frutas);


        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Jesus");
        Imprimir(personas);
    }
    public static void Imprimir(Object Matriz[][]){
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print(Matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
