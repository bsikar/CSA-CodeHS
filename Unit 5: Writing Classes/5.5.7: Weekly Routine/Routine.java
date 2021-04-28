public class Routine {
    private double sleep;
    private double fun;
    private double school;
    private double sports;
    private double total;

    public Routine() {
        sleep = fun = school = sports = total = 0;
    }

    public void setSleep(double sleep) {
        this.sleep = sleep;
        total += sleep;
    }

    public void setFun(double fun) {
        this.fun = fun;
        total += fun;
    }

    public void setSchool(double school) {
        this.school = school;
        total += school;
    }

    public void setSports(double sports) {
        this.sports = sports;
        total += sports;
    }

    public void printTotal() {
        System.out.println("Weekly Totals");
        System.out.println("Sleep: " + sleep*7);
        System.out.println("School: " + school*7);
        System.out.println("Sports: " + sports*7);
        System.out.println("Fun: " + fun*7);
        System.out.println("Grand Total: " + total*7);
        System.out.println("Hours left over: " + (168-(total*7)));
    }
}
