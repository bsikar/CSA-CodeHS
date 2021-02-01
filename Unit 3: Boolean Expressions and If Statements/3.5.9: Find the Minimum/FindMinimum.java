import java.util.Scanner;

public class FindMinimum 
{
    public static void main(String[] args)
    {
        // Ask the user for three ints and 
        // print out the minimum.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("The minimum is " + Math.min(Math.min(a, b), c));
    }
}
