import java.util.ArrayList;

public class Phonebook {
    ArrayList<PhoneNumber> phonebook;

    public Phonebook() {
        phonebook = new ArrayList<PhoneNumber>();
    }

    void printPhoneBook() {
        for (PhoneNumber number : phonebook) {
            System.out.println(number.getName());
        }
    }

    void addNumber(PhoneNumber number) {
        if (phonebook.size() != 0) {
            for (int i = 0; i < phonebook.size(); ++i) {
                if (phonebook.get(i).getName().charAt(0) >= number.getName().charAt(0)) {
                    phonebook.add(i, number);
                    break;
                }
            }
        } else {
            phonebook.add(number);
        }
    }
}
