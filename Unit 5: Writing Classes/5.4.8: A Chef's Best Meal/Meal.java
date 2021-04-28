public class Meal {
    String meal;
    int calories;
    String recipe;

    public Meal(String meal, int calories, String recipe) {
        this.meal = meal;
        this.calories = calories;
        this.recipe = recipe;
    }

    public String getName() {
        return meal;
    }

    public int getCalories() {
        return calories;
    }

    public String getRecipe() {
        return recipe;
    }

    public String toString() {
        return meal + ", which has " + calories + ".";
    }
}
