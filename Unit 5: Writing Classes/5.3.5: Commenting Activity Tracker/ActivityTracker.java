public class ActivityTracker {
    public static void main(String[] args) {
        // initalize a new ActivityLog named myLog
        ActivityLog mylog = new ActivityLog();
        // add miles (5) and hours (1) to myLog (ActivityLog)
        mylog.addMiles(5);
        mylog.addHours(1);
        // print stuff
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        // initalize a new variable equal to the hours in the log
        double hoursToday = mylog.getHours();
        // add more miles and hours to myLog
        mylog.addHours(1.5);
        mylog.addHours(3);
        // initalize a new variable equal to the increae in hours in the log from last time
        double increase = mylog.getHours() - hoursToday;
        // print stuff
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}
