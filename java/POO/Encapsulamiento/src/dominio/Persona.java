package dominio;

public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }



    // get regresa el atributo del  nombre
    public String getNombre(){
        return this.nombre;
    }
    // set permite modificar el atributo
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public boolean getEliminado(){
        return this.eliminado;
    }
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }

    public String toString(){
        return "Persona: "+ this.nombre +"\n"+this.sueldo +"\n"+this.eliminado;
    }
}
