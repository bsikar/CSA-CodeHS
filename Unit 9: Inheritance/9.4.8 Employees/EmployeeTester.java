public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee = new Employee("Joe", 86000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Bob", 5000, 20);

        System.out.println(employee);
        System.out.println(hourlyEmployee);
    }
}
