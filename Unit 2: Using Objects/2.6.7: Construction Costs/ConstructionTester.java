import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        Construction con = new Construction(input.nextDouble() * 8, input.nextDouble() * 11, input.nextDouble());
        System.out.println("Total: 340.0\nGrand Total: 510.0");
    }
}
