public class Driver extends Account{    
    
    public Driver(String name, String document, String email, String password){
        super(name, document, email, password);

    }
     void printDataDriver(){
        System.out.println("Document Driver: "+document+"Name: "+
        name+" Email: "+email+" password: "+password);
    }
    
}
