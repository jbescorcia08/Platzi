public class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document) {
        this.name = name;
        this.document = document;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", document=" + document + ", email=" + email + ", password="
                + password + "]";
    }

}
