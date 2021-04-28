import java.util.Scanner;

public class ThreeStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First string? ");
        String a = input.nextLine();
        System.out.print("Second string? ");
        String b = input.nextLine();
        System.out.print("Third string? ");
        String c = input.nextLine();

        if (a.concat(b).equals(c)) {
            System.out.println(a + " + " + b + " is equal to " + c + "!");
        } else {
            System.out.println(a + " + " + b + " is not equal to " + c + "!");
        }
    }
}
