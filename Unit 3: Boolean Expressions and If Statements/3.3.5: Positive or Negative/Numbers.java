import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.nextInt() >= 0) {
            System.out.println("That number is positive!");
        } else {
            System.out.println("That number is negative!");
        }
    }
}
