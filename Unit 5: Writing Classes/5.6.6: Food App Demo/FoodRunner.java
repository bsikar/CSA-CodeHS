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

import java.util.*;

public class FoodRunner {
    public static void main(String[] args) {
        Food hamburgers = new Food("Hamburgers", 600);
        Food frenchFries = new Food("French Fries", 350);
        Food coke = new Food("Coke", 200);
        Meal meal = new Meal();
        Scanner in = new Scanner(System.in);

        System.out.println(hamburgers + "\nHow many would you like?");
        meal.add(hamburgers, in.nextInt());
        System.out.println(frenchFries + "\nHow many would you like?");
        meal.add(frenchFries, in.nextInt());
        System.out.println(coke + "\nHow many would you like?");
        meal.add(coke, in.nextInt());

        System.out.println("Your meal will have a toal of " + meal.getTotalCalories());
    }
}

class Meal {
    private Vector<Food> food;
    
    public Meal() {
        food = new Vector<Food>(0);
    }
    
    public void add(Food food, int n) {
        for (int i = 0; i < n; ++i) {
            this.food.add(food);
        }
    }
    
    public int getTotalCalories() {
        int calories = 0;
        for (int i = 0; i < food.size(); ++i) {
            calories += food.get(i).getCalories();
        }
        return calories;
    }
}
