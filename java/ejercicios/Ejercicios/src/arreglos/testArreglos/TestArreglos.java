package arreglos.testArreglos;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];

        System.out.println("Ubicacion en memoria ARREGLO: "+edades);

        for (int i = 0; i < edades.length; i++) {
            edades[i] = (int)(Math.random()*50 +1 );
            System.out.println("Edad "+(i+1)+": "+edades[i]);
        }
    }
}
