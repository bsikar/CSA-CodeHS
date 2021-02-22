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

public class AmusementPark {
    static int AGE_LIMIT = 12;
    static int HEIGHT_LIMIT = 48;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your age: "); 
        int age = input.nextInt();
        
        System.out.println("Enter your height in inches: ");
        int height = input.nextInt();
        
        boolean oldEnough = age >= AGE_LIMIT;
        boolean tallEnough = height >= HEIGHT_LIMIT;
        
        boolean cannotRide = !oldEnough || !tallEnough;
        
        if (cannotRide) {
            System.out.println("You may not ride the rollercoasters.");
        } else {
            System.out.println("You may ride the rollercoasters!");
        }
        
        System.out.println("Can you swim? Enter true or false.");
        boolean canSwim = input.nextBoolean();
        
        System.out.println("Do you have a life jacket? Enter true or false.");
        boolean hasLifeJacket = input.nextBoolean();
        
        boolean cannotSwim = !canSwim && !hasLifeJacket;
        
        if (cannotSwim) {
            System.out.println("You may not swim in the pool.");
        } else {
            System.out.println("You may swim in the pool!");
        }
    }
}
