package perifericos;

public class Raton extends DispositivosEntrada {

    private int idEntrada;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        this.idEntrada =  ++Raton.contadorRatones;
    }

    @java.lang.Override
    public java.lang.String toString() {
        final java.lang.StringBuilder sb = new java.lang.StringBuilder("Raton{");
        sb.append("idEntrada=").append(idEntrada);
        sb.append(" ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
