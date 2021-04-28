import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("The minimum is " + Math.min(Math.min(a, b), c));
    }
}
