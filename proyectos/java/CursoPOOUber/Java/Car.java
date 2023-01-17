public class Car {
    Integer id;
    String licence;
    String driver;
    Integer passenger;

    public Car(String licence, String driver, Integer passenger) {
        this.licence = licence;
        this.driver = driver;
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", licence=" + licence + ", driver=" + driver + ", passenger=" + passenger + "]";
    }
    
}
