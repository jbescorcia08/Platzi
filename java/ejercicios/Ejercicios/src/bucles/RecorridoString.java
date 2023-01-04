package bucles;
/**
 *  Del siguiente String «La lluvia en Sevilla es una maravilla» cuenta cuantas vocales hay en total (recorre el String con charAt).
 *  Reemplaza todas las a del String anterior por una e.
 *  Recorre el String y transforma cada carácter a su código ASCII. Muestralos en linea recta, separados por un espacio entre cada carácter.
 */

public class RecorridoString {
    public static void main(String[] args) {
        String frace = "La lluvia en Sevilla es una maravilla";
        String frace1 = frace;
        int contador = 0;
        int codeAncci;

        for (int i = 0; i < frace.length(); i++) {
            if(frace.charAt(i)=='a' ||
                    frace.charAt(i)=='e' ||
                    frace.charAt(i)=='i' ||
                    frace.charAt(i)=='o' ||
                    frace.charAt(i)=='u'){
               contador+=1;
            }
        }
        System.out.println("\nHay ["+contador+"] vocales.");
        System.out.println("\nReemplazar la A por la E en la FRACE. ");
        for (int i = 0; i < frace.length(); i++) {
            if(frace.charAt(i)== 'a'){
                frace1 = frace.replace('a','e');
            }
        }
        System.out.println("Frace ccambiada!!...\n"+frace1);

        System.out.println("CODIGO ANCCI DE CADA CARACTER DE LA FRACE");
        for (int i = 0; i < frace.length(); i++) {
            codeAncci = (int) frace.charAt(i);
            System.out.print(codeAncci+" ");
        }
    }
}
