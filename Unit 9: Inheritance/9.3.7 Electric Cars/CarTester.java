public class CarTester {
    public static void main(String[] args) {
        Car car = new Car("Ford", "12");
        ElectricCar electricCar = new ElectricCar("Tesla");

        System.out.println(car);
        System.out.println(electricCar);
        System.out.println(car.getMPG());
        System.out.println(electricCar.getMPG());
        System.out.println(car.getModel());
        System.out.println(electricCar.getModel());
    }
}
