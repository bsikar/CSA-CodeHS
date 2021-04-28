import java.util.Scanner;

public class Salmon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if (year < 3) {
            System.out.println("Not spawning season");
        } else if (year < 7) {
            System.out.println("Spring spawning season");
        } else if (year < 9) {
            System.out.println("Not spawning season");
        } else if (year < 12) {
            System.out.println("Fall spawning season");
        } else {
            System.out.println("Not spawning season");
        }
    }
}
