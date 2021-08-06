import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        System.out.println("Please enter a number to start:");
        Scanner input = new Scanner(System.in);
        System.out.println(countdown(input.nextInt()));
    }

    public static String countdown(int number) {
        if (number < 2) {
            return number + " Blastoff!";
        }

        return number + " " + countdown(number - 1);
    }
}
