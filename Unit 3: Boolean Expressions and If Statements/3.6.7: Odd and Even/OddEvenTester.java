import java.util.Scanner;

public class OddEvenTester {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter 2 positive integers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (OddEven.bothOdd(num1, num2)) {
            System.out.println("Both numbers are ODD.");
        } else if (OddEven.bothEven(num1, num2)) {
            System.out.println("Both numbers are EVEN.");
        } else {
            System.out.println("One number is ODD and one number is EVEN.");
        }
    }
}
