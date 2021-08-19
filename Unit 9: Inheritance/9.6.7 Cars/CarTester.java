import java.util.*;

public class CarTester {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        Scanner input = new Scanner(System.in);

        for (;;) {
            System.out.println("Please enter a car model name(exit to quit): ");
            String name = input.nextLine();

            if (name.equals("exit")) {
                break;
            }

            System.out.println("Is this car electric? (y or n) ");
            char isElectric = input.nextLine().charAt(0);

            if (isElectric == 'y') {
                cars.add(new ElectricCar(name));
            } else {
                System.out.println("How many miles per gallon: ");
                String mpg = input.nextLine();

                cars.add(new Car(name, mpg));
            }
        }

        for (Car car : cars) {
            System.out.println(car + "\n");
        }
    }
}
