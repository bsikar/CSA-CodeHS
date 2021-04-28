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
