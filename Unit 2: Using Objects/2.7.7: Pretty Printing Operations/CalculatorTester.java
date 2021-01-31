import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do
        System.out.println("Enter two doubles");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        Calculator x = new Calculator();
        System.out.println(num1 + " + " + num2 + " = " + x.sum(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + x.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + x.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + x.divide(num1, num2));

    }
}
