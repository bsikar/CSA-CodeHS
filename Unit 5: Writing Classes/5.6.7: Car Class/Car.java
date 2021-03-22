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

public class Car {
    private double efficiency;
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car(double efficiency, double tankCapacity) {
        this.efficiency = efficiency;
        this.tankCapacity = tankCapacity;
        gas = 0;
        totalMilesDriven = 0;
    }
    
    public void addGas() {
        System.out.println("Filling up ...");
        gas = tankCapacity;
    }
    
    public void addGas(double amount) {
        System.out.println("Adding gas ...");
        gas = (gas+amount > tankCapacity) ? tankCapacity : gas+amount;
    }
    
    public double getTotalMilesDriven() {
        return totalMilesDriven;
    }
    
    public void drive(double distance) {
        if (canDrive(distance)) {
            gas = gas - (distance / efficiency);
            System.out.println("Driving " + distance);
            totalMilesDriven += distance;
        } else {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }
    
    public boolean canDrive(double distance) {
        return efficiency * gas >= distance;
    }
    
    public double milesAvailable() {
        return gas * efficiency;
    }
    
    public double getGas() {
        return gas;
    }
}