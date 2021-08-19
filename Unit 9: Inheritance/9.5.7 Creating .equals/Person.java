public class Person {
    private String name;
    private String birthday;

    public Person (String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Student student) {
        return name.equals(student.getName()) && birthday.equals(student.getBirthday());
    }
}
