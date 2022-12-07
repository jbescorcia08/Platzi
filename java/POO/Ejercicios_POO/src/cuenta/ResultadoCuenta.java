package cuenta;

import java.util.Scanner;

public class ResultadoCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Visa");
        Cuenta cuenta2 = new Cuenta("Jesus", 500);

        cuenta1.Ingresar(300);
        cuenta2.Ingresar(350);

        cuenta1.Retirar(500);
        cuenta2.Retirar(300);

        System.out.println(cuenta1+"\n"+cuenta2);

    }
}
