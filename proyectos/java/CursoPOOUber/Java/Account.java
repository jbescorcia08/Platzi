public class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(Integer id,String name, String document, String email, String password) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", document=" + document + ", email=" + email + ", password="
                + password + "]";
    }  

}
