public class Car {
    Integer id;
    String licence;
    Account driver;
    Integer passenger;

    public Car(String licence, Account driver){
        this.licence = licence;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", licence=" + licence + ", driver=" + driver + ", passenger=" + passenger + "]";
    }
    
}
