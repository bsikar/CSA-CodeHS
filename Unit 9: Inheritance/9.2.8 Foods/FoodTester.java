public class FoodTester {
    public static void main(String[] args) {
        Food food = new Food("apple", 135);
        HealthyFood healthyFood = new HealthyFood("apple", 135, "fruit");

        System.out.println(food);
        System.out.println(healthyFood);
    }
}
