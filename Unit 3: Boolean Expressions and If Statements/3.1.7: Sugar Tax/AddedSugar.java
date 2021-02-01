import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        System.out.println("How many grams of sugar have you eaten today? ");
        Scanner input = new Scanner(System.in);
        // Ask the user for the grams of sugar
        System.out.println("You can eat more sugar: " + (input.nextInt() < 30));
        // Use a boolean expression to print if they can eat more sugar
    }
}
