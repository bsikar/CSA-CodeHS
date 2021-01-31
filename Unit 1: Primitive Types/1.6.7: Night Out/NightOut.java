import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        System.out.println("How much did dinner cost?");
        double a = input.nextDouble();
        System.out.println("How much is mini-golf for one person?");
       // int b = input.nextInt();
        double b = input.nextDouble();
        b *= 2;
        System.out.println("How much did dessert cost?");
        double c = input.nextDouble();
        System.out.println("Dinner: $" + a + "\nMini-Golf: $" + b + "\nDessert: $" + c + "\nGrand Total: $" + (a + b + c));  
    }
}
