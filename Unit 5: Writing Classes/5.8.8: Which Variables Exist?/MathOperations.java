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

public class MathOperations {
    private static double PI = 3.14159;
    
    public static void main(String[] args) {
        int sumResult = sum(5, 10);
        int differenceResult = difference(20, 2);
        double productResult = product(3.5, 2);
        double circumferenceResult = circleCircumference(10);
        double areaResult = circleArea(12);
    }
    
    public static int sum(int one, int two) {
        System.out.println("PI: " + PI);
        System.out.println("one: " + one);
        System.out.println("two: " + two);

        return one + two;
    }
    
    public static int difference(int one, int two) {
        System.out.println("PI: " + PI);
        System.out.println("one: " + one);
        System.out.println("two: " + two);
        
        return one - two;
    }
    
    public static double product(double a, double b) {
        double result = a * b;
        System.out.println("PI: " + PI);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("result: " + result);

        return result;
    }
    
    public static double circleCircumference(int radius) {
        System.out.println("PI: " + PI);
        System.out.println("radius: " + radius);

        return 2 * radius * PI;
    }
    
    public static double circleArea(int radius) {
        double area = PI * radius * radius;
        System.out.println("PI: " + PI);
        System.out.println("radius: " + radius);
        System.out.println("area: " + area);

        return area;
    }
}