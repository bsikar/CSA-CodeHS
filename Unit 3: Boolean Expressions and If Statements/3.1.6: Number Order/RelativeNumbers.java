import java.util.Scanner;

public class RelativeNumbers
{
    public static void main(String[] args)
    {
        // Ask for two numbers
        System.out.println("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        // Compare the numbers as instructed
        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(a + " == " + b + ": " + (a == b));
        System.out.println(a + " > " + b + ": " + (a > b));
        // Display the results
    }
}
