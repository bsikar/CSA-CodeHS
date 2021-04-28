import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        if (n > 0) {
            System.out.println("The number is positive!");
        } else if (n == 0) {
            System.out.println("The number is neither positive nor negative!");
        } else {
            System.out.println("The number is negative!");
        }
    }

}
