public class Racecar {
    private double accel;
    private String name;

    public Racecar(double acceleration, String driver) {
        accel = acceleration;
        name = driver;
    }

    public double computeTime(double distance) {
        return Math.round(Math.sqrt((2*distance) / accel) * 100.0) / 100.0;
    }

    public String toString() {
        return "Racer " + name;
    }
}
