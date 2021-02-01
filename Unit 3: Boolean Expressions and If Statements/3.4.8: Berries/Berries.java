import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        // Ask for a berry initial
        
        // To get the input as a character, use the String method
        // charAt().  Use str.charAt(0) since you want the
        // first character
        
        
        // Now you can compare characters using ==
        
        // Use comments to list the different
        // branches you will need before you write the code
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the initial of the berry: ");
        switch (input.nextLine().charAt(0)) {
        case 'r': 
            System.out.println("You ordered raspberry");
            break;
        case 'h':
            System.out.println("You ordered huckleberry");
            break;
        case 'g':
            System.out.println("You ordered goji berry");
            break;
        default:
            System.out.println("Berry not recognized");
        }
    }
}
