public class User extends Account {
    public User(Integer id, String name, String document, String email, String password) {
        super(name, document, email, password);

    }    
    public void printDataUser(){
        System.out.println("id" + "Nombre: "+name+" Documento: "+document+
        " email: "+email+ " Password: "+password);
    }
}
