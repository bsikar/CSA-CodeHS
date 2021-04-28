import java.util.Scanner;

public class DrinkOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to drink? ");
        String drink = input.nextLine();
        System.out.println("How many teaspoons of sugar do you want? ");
        int sugar = input.nextInt();

        System.out.println("Confirming your order. You wanted: \n" + drink + ((sugar > 0) ? " with sugar" : ""));
    }
}
