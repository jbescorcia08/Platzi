public class User extends Account {
    Integer id;

    public User(Integer id, String name, String document, String email, String password) {
        super(id,name, document, email, password);
    }

    @Override
    public String toString() {
        return "User [id=" + id + "]";
    }
    
}
