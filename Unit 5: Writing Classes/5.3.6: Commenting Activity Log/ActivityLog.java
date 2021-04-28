public class ActivityLog {
    private double numHours;
    private double numMiles;

    /**
     * initalize private variables and set the to zero
     */
    public ActivityLog() {
        numHours = 0;
        numMiles = 0;
    }

    /**
     * increase private variable numHours by the parameter hours
     *
     * @parm hours the number to increase numHours by
     */
    public void addHours(double hours) {
        numHours += hours;
    }

    /**
     * increase private variable numMiles by the parameter miles
     *
     * @parm miles the number to increase numMiles by
     */
    public void addMiles(double miles) {
        numMiles += miles;
    }

    /**
     * return private variable numMiles
     *
     * @return the number of miles
     */
    public double getMiles() {
        return numMiles;
    }

    /**
     * return private variable numHours
     *
     * @return the number of hours
     */
    public double getHours() {
        return numHours;
    }
}
