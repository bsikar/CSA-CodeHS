public class ChefTester {
    public static void main(String[] args) {
        Meal macaroni = new Meal("Mac N Cheese", 500, "Boil macaroni for 8 mins, then add cheese with a little milk.");
        Chef alex = new Chef("Alex", "Juniors Cheesecake", macaroni);

        System.out.println(alex);
        System.out.println(alex.getMealRecipe());

        Meal mac = new Meal("Mac N Cheese", 500, "Boil macaroni for 8 mins, then add cheese with a little milk.");
        Chef joe = new Chef("Joe", "Juniors mac", mac);

        System.out.println(joe);
        System.out.println(joe.getMealRecipe());
    }
}
