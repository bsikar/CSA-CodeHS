import java.util.Scanner;

public class Salmon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask user for month of year as an integer
        
        // if month is less than 3 (Jan or Feb) -- not spawning season
        // else if month is less than 7 (march, april, may, june) -- spring spawning season
        // else if month is less than 9 (july, august) -- Not spawning season
        // else if month is less than 12 (sept, oct, nov) -- fall spawning season
        // else (only month left is december) -- not spawning season
        
        
        // Note: because of the way this code is structured,
        // if you enter 2, every single one of these boolean
        // statements is true.  But only the FIRST one executes!
        // Hence, we check for less than 3 to catch jan and feb, etc
        
        int year = input.nextInt();

        if (year < 3) {
            System.out.println("Not spawning season");
        } else if (year < 7) {
            System.out.println("Spring spawning season");
        } else if (year < 9) {
            System.out.println("Not spawning season");
        } else if (year < 12) {
            System.out.println("Fall spawning season");
        } else {
            System.out.println("Not spawning season");
        }
    }
}
