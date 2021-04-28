import java.util.Scanner;

public class TaffyTester {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Starting Taffy Timer...");
        for (;;) {
            System.out.print("Enter the temperature: ");
            int temp = input.nextInt();
            if (temp < 270) {
                System.out.println("\nThe mixture isn't ready yet.");
            } else {
                System.out.println("Your taffy is ready for the next step!");
                break;
            }
        }
    }
}
