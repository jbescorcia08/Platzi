package domain;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Cliente extends Persona{
    private int idCliente;
    private boolean vip;
    private String fechaRegistro;
    private static int contadorCliente;
    private static Date date = new Date();

    public Cliente(String nombre, boolean vip) {
        super(nombre);
        this.idCliente = ++Cliente.contadorCliente;
        this.vip = vip;
        this.fechaRegistro = ;
    }
    public Cliente(String nombre){
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(this.idCliente);
        sb.append(", ").append(super.toString());
        sb.append(", fechaRegistro='").append(FechaCliente()).append('\'');
        sb.append(", vip=").append(this.vip);
        sb.append('}');
        return sb.toString();
    }
}
