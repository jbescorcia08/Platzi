package domain;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Cliente extends Persona{
    private  int idCliente;
    private Date fechaRegistro;
    private static int contadorCliente;
    private boolean vip;

    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion){
        super(nombre,genero,edad,direccion);
        this.vip = vip;
        this.fechaRegistro = fechaRegistro;
        this.idCliente = ++Cliente.contadorCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
