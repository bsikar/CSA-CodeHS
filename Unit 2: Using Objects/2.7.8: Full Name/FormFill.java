public class FormFill {
    private String fName;
    private String lName;
    private int streetNumber;
    private String streetName;
    private String aptNumber;

    public FormFill(String firstName, String lastName) {
        fName = firstName;
        lName = lastName;
        streetNumber = 0;
        streetName = "";
        aptNumber = "";
    }

    public void setAddress(int number, String street, String apt) {
        streetNumber = number;
        streetName = street;
        aptNumber = apt;
    }

    public String fullName() {
        return lName + ", " + fName;
    }

    public String streetAddress() {
        return streetNumber + " " + streetName + "\nApt " + aptNumber;
    }

    public String creditCardInfo(int creditCardNumber, int expMonth, int expYear) {
        return "Card Number: " + creditCardNumber + "\nExpires: " + expMonth + "/" + expYear;
    }
}
