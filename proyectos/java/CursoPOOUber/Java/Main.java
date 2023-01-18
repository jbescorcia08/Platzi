class Main{
    public static void main(String[] args) {
        
        Car car = new Car("345jr", new Account("Jesus", "GH234"));
        car.passenger = 4;
        System.out.println(car);
    }
}