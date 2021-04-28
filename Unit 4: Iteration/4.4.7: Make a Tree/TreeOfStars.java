public class TreeOfStars {
    public static void main(String[] args) {
       makeATree();
    }
    public static void makeATree() {
        for (int i = 0; i < 9; ++i) {
            for (int o = 0; o < 9 - i; ++o) {
                System.out.print(" ");
            }
            for (int u = 0; u < i + 1; ++u) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
