class Cart extends Payments{
    constructor(id, name, number, cvv){
        super(id);
        this.name = name;
        this.number = number;
        this.cvv = cvv;
    }
}