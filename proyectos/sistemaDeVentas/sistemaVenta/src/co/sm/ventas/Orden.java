package co.sm.ventas;

import javax.swing.*;

public class Orden {
    private int idOrden;
    private Producto Productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.Productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.Productos[this.contadorProductos++] = producto;
        }else{
            JOptionPane.showMessageDialog(null,"Ha superado el limite de produstos: "+Orden.MAX_PRODUCTOS);
        }
    }
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.Productos[i].getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("id Orden: "+this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total Orden: $"+totalOrden);
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.Productos[i]);
        }
    }


}
