import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the Person's name: ");
        String personName = input.nextLine();
        System.out.print("Please enter the Person's birthday: ");
        String personBirthday = input.nextLine();
        System.out.print("Please enter the Student's name: ");
        String studentName = input.nextLine();
        System.out.print("Please enter the Student's birthday: ");
        String studentBirthday = input.nextLine();
        System.out.print("Please enter the Student's grade: ");
        int studentGrade = input.nextInt();

        Person person = new Person(personName, personBirthday);
        Student student = new Student(studentName, studentBirthday, studentGrade);

        System.out.println("Same: " + person.equals(student));
    }
}
