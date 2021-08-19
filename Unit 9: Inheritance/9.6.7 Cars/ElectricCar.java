public class ElectricCar extends Car {
    public ElectricCar(String model) {
        super(model, "Electric cars do not calculate MPG.");
    }

    @Override
    public String toString() {
        return "Car: " + super.getModel() + "\nMPG: Electric cars do not calculate MPG";
    }
}

