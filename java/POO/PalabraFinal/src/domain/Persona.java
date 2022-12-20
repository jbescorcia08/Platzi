package domain;

import java.security.PublicKey;

public class Persona {
    protected String nombre;
    protected char sexo;
    protected int edad;
    protected boolean mayorEdad;

    public Persona(String nombre, char sexo, int edad, boolean mayorEdad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.mayorEdad = mayorEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", edad=").append(edad);
        sb.append(", mayorEdad=").append(mayorEdad);
        sb.append('}');
        return sb.toString();
    }
}
