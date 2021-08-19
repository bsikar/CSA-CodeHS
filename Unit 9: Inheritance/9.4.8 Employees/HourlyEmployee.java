public class HourlyEmployee extends Employee {
    private double hoursPerWeek;

    public HourlyEmployee(String name, double hourlySalary, double hoursPerWeek) {
        super(name, hourlySalary * hoursPerWeek * 52);
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getHourlySalary() {
        return hoursPerWeek;
    }

    public void setHourlySalary(double hourlySalary) {
        super.setAnnualSalary(hourlySalary);
    }

    public String toString() {
        return super.getName() + " makes $" + super.getAnnualSalary() + " per hour";
    }
}

