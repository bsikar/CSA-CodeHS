import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        //To get started, create a new Calculator object
        System.out.println("Enter two doubles");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        Calculator test = new Calculator();
        test.sum(num1, num2);
        test.subtract(num1, num2);
        test.multiply(num1, num2);
        test.divide(num1, num2);
    }
}
