public class NumberTriangle {
    public static void main(String[] args) {
       makeNumberTriangle();
    }

    public static void makeNumberTriangle() {
        for (int i = 1; i <= 5; ++i) {
            for (int o = 1; o <= i; ++o) {
                System.out.print(o + " ");
            }
            System.out.println("");
        }
    }
}
