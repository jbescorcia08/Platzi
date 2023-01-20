class Main{
    public static void main(String[] args) {
        
        Car car = new Car("oioeiowei", new Driver("jesus", "234423", "kjdkdjha@aksda.com","*******"));
        car.passenger = 4;
        System.out.println(car);


        Driver  driver = new Driver("323234", "Jesus", "Cherolet", "null");
        driver.printDataDriver();

        User user = new User(1, "jose", "12336", "Jaskjlk@gmail.com", "******");
        user.printDataUser();

        
    }

    
}