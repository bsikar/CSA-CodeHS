import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0, min = 0, num;
        boolean cnt = false;
        for (;;) {
            System.out.println("Enter a number (-1 to quit): ");
            num = input.nextInt();
            if (!cnt) {
                cnt = true;
                min = num;
                max = num;
            }
            if (num == -1) {
                break;
            } else if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }

            System.out.println("Smallest # so far: " + min + "\nLargest # so far: " + max);
        }
    }
}
