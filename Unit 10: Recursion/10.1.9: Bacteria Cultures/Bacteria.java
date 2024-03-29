import java.util.Scanner;

public class Bacteria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        int bacteria = numBacteriaAlive(hours);
        System.out.println("After " + hours + ", there will be " + bacteria);
    }

    public static int numBacteriaAlive(int hour) {
        if (hour < 1) {
            return 10;
        }

        return numBacteriaAlive(hour - 1) + numBacteriaAlive(hour - 1) * 2;
    }
}
