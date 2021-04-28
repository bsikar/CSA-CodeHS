import java.util.Scanner;

public class AddedSugar {
    public static void main(String[] args) {
        System.out.println("How many grams of sugar have you eaten today? ");
        Scanner input = new Scanner(System.in);
        System.out.println("You can eat more sugar: " + (input.nextInt() < 30));
    }
}
