import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter 2 positive integers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        boolean bothOdd = num1 % 2 != 0 && num2 % 2 != 0;

        boolean bothOddDeMorgan = !(num1 % 2 == 0 || num2 % 2 == 0);
        if (bothOdd) {
           System.out.println("Both numbers are odd");
        } else {
            System.out.println("Both numbers are NOT odd.");
        }

        if (bothOddDeMorgan) {
           System.out.println("Both numbers are odd with De Morgan's Laws.");
        }
        else {
            System.out.println("Both numbers are NOT odd with DeMorgan's Laws.");
        }

        if (bothOdd == bothOddDeMorgan) {
            System.out.println("DeMorgan was right, again!");
        }
    }
}
