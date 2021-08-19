public class ClothingTester {
    public static void main(String[] args) {
        Clothing clothing = new Clothing("small", "blue");
        Jeans jeans = new Jeans("small");
        Jeans blackJeans = new Jeans("medium", "black");
        Sweatshirt sweatshirt = new Sweatshirt("large", "white", true);
        TShirt tshirt = new TShirt("extra large", "green", "cotton");

        System.out.println(clothing);
        System.out.println(jeans);
        System.out.println(blackJeans);
        System.out.println(sweatshirt);
        System.out.println(tshirt);
    }
}
