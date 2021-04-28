import java.util.Scanner;

public class RelativeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(a + " == " + b + ": " + (a == b));
        System.out.println(a + " > " + b + ": " + (a > b));
    }
}
