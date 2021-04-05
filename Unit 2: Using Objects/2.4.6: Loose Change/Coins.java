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

public class Coins {
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    public Coins(int numQuarters, int numDimes, int numNickels, int numPennies) {
        quarters = numQuarters;
        dimes = numDimes;
        nickels = numNickels;
        pennies = numPennies;
    }

    public void addQuarter() {
        System.out.println("Adding a quarter ...");
        quarters ++;
    }

    public void addDime() {
        System.out.println("Adding a dime ...");
        dimes ++;
    }

    public void addNickel() {
        System.out.println("Adding a nickel ...");
        nickels ++;
    }

    public void addPenny() {
        System.out.println("Adding a penny ...");
        pennies ++;
    }

    public void quartersCount() {
        System.out.println(quarters);
    }

    public void quartersTotal() {
        System.out.println(quarters * 0.25);
    }

    public void dimesCount() {
        System.out.println(dimes);
    }

    public void dimesTotal() {
        System.out.println(dimes * 0.10);
    }

    public void nickelsCount() {
        System.out.println(nickels);
    }

    public void nickelsTotal() {
        System.out.println(nickels * 0.05);
    }

    public void penniesCount() {
        System.out.println(pennies);
    }

    public void penniesTotal() {
        System.out.println(pennies * 0.01);
    }

    public void bankValue() {
        System.out.println(quarters * 0.25 + dimes * 0.10 + nickels * 0.05 + pennies * 0.01);
    }

    public void bankCount() {
        System.out.println(quarters + dimes + nickels + pennies);
    }
}
