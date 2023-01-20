public class Driver extends Account{    
    
    public Driver(Integer id, String name, String document, String email, String password){
        super(name, document, email, password);

    }
    public void printDataDriver(){
        System.out.println("id" + "Nombre: "+name+" Documento: "+document+
        " email: "+email+ "Password: "+password);
    }
}
