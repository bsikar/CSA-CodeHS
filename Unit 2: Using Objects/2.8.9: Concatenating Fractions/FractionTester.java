/* MIT License
 *
 * Copyright (c) 2021 Brighton Sikarskie
 *  
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
                
        Fraction sumObj = new Fraction(sumNumerator, sumDenominator);
                
        System.out.println(obj1 + " + " + userFractionObj + " = " + sumObj);
    }
}
