public class Scores {
    public static void main(String[] args) {
        int[] scores = {80, 95, 82, 67, 100};
        for (int i : scores) {
            System.out.println(i);
        }
        scores[2] = 72;
        scores[3] = 67;
        scores[4] = 95;
        System.out.println("");
        for (int i : scores) {
            System.out.println(i);
        }
    }
}
