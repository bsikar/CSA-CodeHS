import java.util.Random;

public class Randomizer {
    public static int nextInt() {
        Random x = new Random();
        return x.nextInt(10) + 1;
    }

    public static int nextInt(int min, int max) {
        Random x = new Random();
        return x.nextInt(max - min + 1) + min;
    }
}
