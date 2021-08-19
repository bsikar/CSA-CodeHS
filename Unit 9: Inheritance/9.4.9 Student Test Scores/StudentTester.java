import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the student name: ");
        String name = input.nextLine();
        System.out.println("Please enter the Math Score: ");
        int mathScore = input.nextInt();
        System.out.println("Please enter the ELA Score: ");
        int elaScore = input.nextInt();
        System.out.print("Please enter the Service Hours: ");
        int serviceHours = input.nextInt();

        HSStudent student = new HSStudent(name, mathScore, elaScore, serviceHours);

        System.out.println("Pass Math? " + student.passMath());
        System.out.println("Pass ELA? " + student.passEla());
        System.out.println("Completed Service Hours? " + student.completeService());
        System.out.println(student);
    }
}
