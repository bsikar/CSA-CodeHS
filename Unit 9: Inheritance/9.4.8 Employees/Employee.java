public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double annualSalary) {
        this.name = name;
        salary = annualSalary;
    }

    public String getName() {
        return name;
    }

    public double getAnnualSalary() {
        return salary;
    }

    public void setAnnualSalary(double annualSalary) {
        salary = annualSalary;
    }

    public String toString() {
        return name + " makes $" + salary + " per year";
    }
}

