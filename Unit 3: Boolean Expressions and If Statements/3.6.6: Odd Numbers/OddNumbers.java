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

public class OddNumbers {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter 2 positive integers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        boolean bothOdd = num1 % 2 != 0 && num2 % 2 != 0;
        
        boolean bothOddDeMorgan = !(num1 % 2 == 0 || num2 % 2 == 0);
        if (bothOdd) {
           System.out.println("Both numbers are odd");
        } else {
            System.out.println("Both numbers are NOT odd.");
        }
        
        if (bothOddDeMorgan) {
           System.out.println("Both numbers are odd with De Morgan's Laws.");
        }
        else {
            System.out.println("Both numbers are NOT odd with DeMorgan's Laws.");
        }
        
        if (bothOdd == bothOddDeMorgan) {
            System.out.println("DeMorgan was right, again!");
        }
    }
}
