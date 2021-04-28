public class Classroom {
    Student[] students;
    int numStudentsAdded;

    public Classroom(int numStudents) {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }

    public Student getMostImprovedStudent() {
        if (numStudentsAdded == 0) {
            return null;
        }
        Student x = students[0];
        for (int i = 0; i < numStudentsAdded; ++i) {
            if (x.getExamRange() < students[i].getExamRange()) {
                x = students[i];
            }
        }
        return x;
    }

    public void addStudent(Student s) {
        students[numStudentsAdded] = s;
        ++numStudentsAdded;
    }

    public void printStudents() {
        for (int i = 0; i < numStudentsAdded; ++i) {
            System.out.println(students[i]);
        }
    }
}
