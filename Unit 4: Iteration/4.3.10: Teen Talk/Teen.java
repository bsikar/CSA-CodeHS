public class Teen {
    private String firstName;
    private String lastName;
    private int grade;
    private Boolean textMessages;

    public Teen(String theFirstName, String theLastName, int theGrade, Boolean theTextMessages) {
        firstName = theFirstName;
        lastName = theLastName;
        grade = theGrade;
        textMessages = theTextMessages;
    }

    public String toString() {
        return firstName + " " + lastName + " is in grade " + grade + " and wants to send this text:";
    }

    public String teenTalk(String text) {
        String z = "";
        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == ' ') {
                z += " like ";
            } else {
                z += text.charAt(i);
            }
        }

        return z;
    }
}
