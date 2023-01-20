public class User extends Account {
    public User(Integer id, String name, String document, String email, String password) {
        super(name, document, email, password);

    }
    void printDataUser(){
        System.out.println("id: "+id+ "Document Driver: "+document+"Name: "+
        name+" Email: "+email+" password: "+password);
    }
    
}
