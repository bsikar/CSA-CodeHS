import java.util.Scanner;

public class TripleDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many points did you score? ");
        int a = input.nextInt();
        System.out.println("How many rebounds did you get? ");
        int b = input.nextInt();
        System.out.println("How many assists did you have? ");
        int c = input.nextInt();

        System.out.println("You got 10 or more points: " + (a >= 10));
        System.out.println("You got 10 or more rebounds: " + (b >= 10));
        System.out.println("You got 10 or more assists: " + (c >= 10));
    }
}
