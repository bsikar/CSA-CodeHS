public class CarTester {
    public static void main(String[] args) {
        Car car = new Car(20, 15);

        car.addGas();
        System.out.println("Miles available: "+ car.milesAvailable());
        car.drive(100);
        System.out.println("Miles available: "+ car.milesAvailable());
        car.addGas(2);
        System.out.println("Miles available: "+ car.milesAvailable());
        car.drive(1000);
        car.drive(200);
        System.out.println("Gas remaining: "+ car.getGas());
        System.out.println("Total Miles Driven: "+ car.getTotalMilesDriven());
    }
}
