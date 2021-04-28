public class Chef {
    String name;
    String restaurant;
    Meal meal;

    public Chef(String name, String restaurant, Meal meal) {
        this.name = name;
        this.restaurant = restaurant;
        this.meal = meal;
    }

    public String getName() {
        return name;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public Meal getMeal() {
        return meal;
    }

    public String getMealName() {
        return meal.getName();
    }

    public int getMealCalories() {
        return meal.getCalories();
    }

    public String getMealRecipe() {
        return meal.getRecipe();
    }

    public String toString() {
        return "Chef " + name + " works at " + restaurant + " and is best known for " + meal;
    }
}
