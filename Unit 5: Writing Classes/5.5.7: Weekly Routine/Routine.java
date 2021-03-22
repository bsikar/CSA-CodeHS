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

public class Routine {
    private double sleep;
    private double fun;
    private double school;
    private double sports;
    private double total;

    public Routine() {
        sleep = fun = school = sports = total = 0;
    }

    public void setSleep(double sleep) {
        this.sleep = sleep;
        total += sleep;
    }

    public void setFun(double fun) {
        this.fun = fun;
        total += fun;
    }

    public void setSchool(double school) {
        this.school = school;
        total += school;
    }
    
    public void setSports(double sports) {
        this.sports = sports;
        total += sports;
    }
    
    public void printTotal() {
        System.out.println("Weekly Totals");
        System.out.println("Sleep: " + sleep*7);
        System.out.println("School: " + school*7);
        System.out.println("Sports: " + sports*7);
        System.out.println("Fun: " + fun*7);
        System.out.println("Grand Total: " + total*7);
        System.out.println("Hours left over: " + (168-(total*7)));
    }
}