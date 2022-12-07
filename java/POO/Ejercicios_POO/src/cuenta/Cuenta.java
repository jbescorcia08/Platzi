package cuenta;

public class Cuenta {
    private String titular;
    private double cantidad;


    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        if(cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad = cantidad;
        }
    }
    public Cuenta(String titular){
        this(titular , 0);
    }
    public void Ingresar(double cantidad){
          if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    public void Retirar(double cantidad){
        if(this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }
    }
    public String toString(){
        return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
    }

    // get and set

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
