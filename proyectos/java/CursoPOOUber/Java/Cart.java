public class Cart extends Payments {

    String name;
    Integer number;
    short cvv;

    public Cart(Integer id, String name, Integer number, short cvv) {
        super(id);
        this.name = name;
        this.number = number;
        this.cvv = cvv;
    }
    
}
