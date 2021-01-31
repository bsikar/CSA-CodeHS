import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
    
        // Create an Extremes object
        Extremes extreme = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        System.out.println("Guess the maximum Integer value: ");
        Integer max = input.nextInt();
        System.out.println("You were off by " + Math.abs(extreme.maxDiff(max)));
        
        // Compute and display the difference
        // between the max and the guess
        System.out.println("Guess the minimum Integer value: ");
        Integer min = input.nextInt();
        System.out.println("You were off by "+ extreme.minDiff(min));
        // Ask the user to guess the minimum value of an Integer
        
        
        // Compute and display the difference 
        // between the min and the guess
        
        
    }
}
