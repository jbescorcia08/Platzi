class Main{
    public static void main(String[] args) {
        
        Car car = new Car("oioeiowei", new Driver(1, "jesus", "234423", "kjdkdjha@aksda.com","*******"));
        car.passenger = 4;
        System.out.println(car);


        UberX  uberX = new  UberX("shshas", new Account("patricia", "23234454", "hjkdsfbkshdjfb@hhsdksd.com", "******"), "Nissan", "2023");

        uberX.printDataDriver();
    }
}