package cuenta;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 0;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (this.cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad = cantidad;
        }
    }

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuenta{");
        sb.append("titular='").append(titular).append('\'');
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }
    public void Ingreso(double cantidad){
        if(cantidad > 0){
            System.out.println("Ingreso: "+cantidad);
            this.cantidad += cantidad;
        }else{
            this.cantidad = cantidad;
        }
    }
    public void Retiro(double cantidad){
        if (this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else {
            System.out.println("Retiro: "+cantidad);
            this.cantidad -= cantidad;
        }
    }

}
