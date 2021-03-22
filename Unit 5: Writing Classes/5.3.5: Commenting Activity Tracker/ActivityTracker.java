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

public class ActivityTracker {
    public static void main(String[] args) {
        // initalize a new ActivityLog named myLog
        ActivityLog mylog = new ActivityLog();
        // add miles (5) and hours (1) to myLog (ActivityLog)
        mylog.addMiles(5);
        mylog.addHours(1);
        // print stuff
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        // initalize a new variable equal to the hours in the log
        double hoursToday = mylog.getHours();
        // add more miles and hours to myLog
        mylog.addHours(1.5);
        mylog.addHours(3);
        // initalize a new variable equal to the increae in hours in the log from last time
        double increase = mylog.getHours() - hoursToday;
        // print stuff
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}