public class Car {
    private double efficiency;
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;

    public Car(double efficiency, double tankCapacity) {
        this.efficiency = efficiency;
        this.tankCapacity = tankCapacity;
        gas = 0;
        totalMilesDriven = 0;
    }

    public void addGas() {
        System.out.println("Filling up ...");
        gas = tankCapacity;
    }

    public void addGas(double amount) {
        System.out.println("Adding gas ...");
        gas = (gas+amount > tankCapacity) ? tankCapacity : gas+amount;
    }

    public double getTotalMilesDriven() {
        return totalMilesDriven;
    }

    public void drive(double distance) {
        if (canDrive(distance)) {
            gas = gas - (distance / efficiency);
            System.out.println("Driving " + distance);
            totalMilesDriven += distance;
        } else {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }

    public boolean canDrive(double distance) {
        return efficiency * gas >= distance;
    }

    public double milesAvailable() {
        return gas * efficiency;
    }

    public double getGas() {
        return gas;
    }
}
