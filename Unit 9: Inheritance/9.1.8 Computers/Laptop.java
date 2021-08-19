public class Laptop extends Computer {
    private double batteryLife;

    public Laptop() {
        super();
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public double getBatteryLife() {
        return batteryLife;
    }
}

