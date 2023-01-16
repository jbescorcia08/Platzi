package cuenta;

public class Movimiento {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("jesus", 0);
        cuenta1.Ingreso(-500);
        cuenta1.Retiro(50);

        System.out.println(cuenta1);



    }
}
