import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Fraction obj1 = new Fraction(1, 2);
            
        System.out.println("Enter the numerator: ");
        int num = input.nextInt();
        System.out.println("Enter the denominator: ");
        int denom = input.nextInt();
        Fraction userFractionObj = new Fraction(num, denom);
            
        int sumNumerator = obj1.getNumerator() * denom + obj1.getDenominator() * num;
        int sumDenominator = obj1.getDenominator() * denom;
                
        //creates the sum Object for the sum of user values and 1/2
        Fraction sumObj = new Fraction(sumNumerator, sumDenominator);
                
        //print the values
        System.out.println(obj1 + " + " + userFractionObj + " = " + sumObj);
    }
}
