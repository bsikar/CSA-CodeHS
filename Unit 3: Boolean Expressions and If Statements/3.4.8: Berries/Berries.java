import java.util.Scanner;

public class Berries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the initial of the berry: ");
        switch (input.nextLine().charAt(0)) {
        case 'r':
            System.out.println("You ordered raspberry");
            break;
        case 'h':
            System.out.println("You ordered huckleberry");
            break;
        case 'g':
            System.out.println("You ordered goji berry");
            break;
        default:
            System.out.println("Berry not recognized");
        }
    }
}
