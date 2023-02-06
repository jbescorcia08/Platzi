package vehiculos;

public class Vehiculos {
    private String marca;
    private String modelo;
    private float precio;

    
    public Vehiculos(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public float getPrecio() {
        return precio;

    }
    

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    public void printVehiculos(){
        System.out.println("Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio);
    }
    
}
