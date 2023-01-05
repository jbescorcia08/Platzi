package testVentas;

import co.sm.ventas.*;

public class TestVentas {
    public static void main(String[] args) {
        Producto prodducto1 = new Producto("camisa", 400);
        Producto prodducto2 = new Producto("pantalon", 500);
        Producto prodducto3 = new Producto("camisa", 400);
        Producto prodducto4 = new Producto("pantalon", 500);

        Orden orden1 = new Orden();
        orden1.agregarProducto(prodducto1);
        orden1.agregarProducto(prodducto2);
        orden1.agregarProducto(prodducto3);
        orden1.agregarProducto(prodducto4);
        orden1.mostrarOrden();
    }
}
