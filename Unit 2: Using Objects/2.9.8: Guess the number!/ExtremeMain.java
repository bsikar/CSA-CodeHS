import java.util.Scanner;
import java.lang.*;

public class ExtremeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Extremes extreme = new Extremes();

        System.out.println("Guess the maximum Integer value: ");
        Integer max = input.nextInt();
        System.out.println("You were off by " + Math.abs(extreme.maxDiff(max)));

        System.out.println("Guess the minimum Integer value: ");
        Integer min = input.nextInt();
        System.out.println("You were off by "+ extreme.minDiff(min));
    }
}
