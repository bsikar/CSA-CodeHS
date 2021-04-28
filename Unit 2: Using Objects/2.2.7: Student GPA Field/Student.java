public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

    public Student(String fName, String lName, int grade, double studentGpa) {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        gpa = studentGpa;
    }

    public String toString() {
        return firstName + " " + lastName + " is in grade: " + gradeLevel + " and has GPA: " + gpa;
    }
}
