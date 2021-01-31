public class AddFractions 
{
    public static void main(String[] args)
    {
        //Your code goes here!
        int a = 1, b = 2, c = 2, d = 5;
        System.out.println("The numerator of the first fraction is " + a);
        System.out.println("The denominator of the first fraction is " + b);
        System.out.println("The numerator of the second fraction is " + c);
        System.out.println("The denominator of the second fraction is " + d);
        System.out.println("The sum of " + a + '/' + b + ' ' + c + '/' + d + " = " + (a*d + b*c) + '/' + (b*d));
        }
}
