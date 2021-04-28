import java.util.Scanner;

public class HelloTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hello user = new Hello(input.nextLine());
        user.english();
        user.spanish();
        user.german();
    }
}
