import java.util.Scanner;

public class GuessTheNumber {
    static int secretNumber = 6;
    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("See if you can guess the number!");

        guessMyNumber();
    }

    public static void guessMyNumber() {
        Scanner input = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter your guess: ");
            if (input.nextInt() == secretNumber) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
