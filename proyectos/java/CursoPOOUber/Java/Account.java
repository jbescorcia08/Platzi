public class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document, String email, String password) {
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", document=" + document + ", email=" + email + ", password=" + password + "]";
    }

    

    

    

    

}
