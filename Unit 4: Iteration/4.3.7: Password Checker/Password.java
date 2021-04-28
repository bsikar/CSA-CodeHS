import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password");
        System.out.println(passwordCheck(input.nextLine()));
    }

    public static boolean passwordCheck(String password) {
        /*
        // for-each loop
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }*/
        // cooler way with regex
        return password.length() >= 8 && password.matches("^[a-zA-Z0-9]+$");
    }
}
