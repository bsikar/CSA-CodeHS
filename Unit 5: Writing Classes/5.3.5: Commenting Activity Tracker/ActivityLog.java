public class ActivityLog {
    // private doubles
    private double numHours;
    private double numMiles;

    public ActivityLog() {
        numHours = 0;
        numMiles = 0;
    }

    // increase numHours by + hours (param)
    public void addHours(double hours) {
        numHours += hours;
    }

    // increase addMiles by + miles (param)
    public void addMiles(double miles) {
        numMiles += miles;
    }

    // return private double numMiles
    public double getMiles() {
        return numMiles;
    }

    // return private double numHours
    public double getHours() {
        return numHours;
    }
}
