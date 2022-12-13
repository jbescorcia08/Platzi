package dominio;

public class Prueba {
    private String modelo;
    private String color;
    private int kilometros;


    public Prueba(String modelo, String color, int kilometros){
        this.modelo = modelo;
        this.color = color;
        this.kilometros = kilometros;

    }
    public  String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getKilometros(){
        return this.kilometros;
    }
    public void setKilometros(int kilometros){
        this.kilometros = kilometros;
    }
}
