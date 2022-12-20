package domain;

public class Empleado extends Persona {
    protected double sueldo;
    protected String cargo;

    public Empleado(String nombre, char sexo, int edad, boolean mayorEdad, double sueldo, String cargo){
        super(nombre,sexo,edad,mayorEdad);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("sueldo=").append(sueldo);
        sb.append(", cargo='").append(cargo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", edad=").append(edad);
        sb.append(", mayorEdad=").append(mayorEdad);
        sb.append('}');
        return sb.toString();
    }
}
