import java.util.*;

public class AssignmentRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Assignment> assignments = new ArrayList<Assignment>();

        for (;;) {
            System.out.print("Please enter an assignment name (exit to quit): ");
            String name = input.nextLine();

            if (name.equals("exit")) {
                break;
            }
            System.out.print("Please enter the available points: ");
            double availablePoints = input.nextDouble();

            System.out.print("Please enter the earned points: ");
            double earnedPoints = input.nextDouble();

            System.out.print("Is this a (t)est or (p)roject: ");
            char testOrProject = input.next().charAt(0);
            input.nextLine();

            if (testOrProject == 't') {
                System.out.print("Please enter the test date: ");
                String testDate = input.next();
                input.nextLine();

                assignments.add(new Test(name, availablePoints, earnedPoints, testDate));
            } else if (testOrProject == 'p') {
                System.out.print("Please enter the due date: ");
                String dueDate = input.next();
                input.nextLine();

                System.out.print("Group project? true or false: ");
                boolean groups = input.nextBoolean();
                input.nextLine();
                assignments.add(new Project(name, availablePoints, earnedPoints, dueDate, groups));
            }
        }

        System.out.println("Your average: " + average(assignments));

        input.close();
    }

    public static double average(ArrayList<Assignment> assignments) {
        double totalAvailablePoints = 0;
        double totalEarnedPoints = 0;

        for (Assignment a : assignments) {
            totalAvailablePoints += a.getAvailablePoints();
            totalEarnedPoints += a.getEarnedPoints();
        }

        return (totalEarnedPoints / totalAvailablePoints) * 100;
    }
}
