public class Cart extends Payments {
    Integer id;
    String name;
    Integer number;
    short cvv;

    public Cart(Integer id, String name, Integer number, short cvv) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.cvv = cvv;
    }
    
}
