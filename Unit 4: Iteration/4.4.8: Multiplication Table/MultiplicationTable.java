public class MultiplicationTable {
    public static void main(String[] args) {
       makeMultiplicationTable();
    }

    public static void makeMultiplicationTable() {
        for (int i = 1; i <= 10; ++i) {
            for (int o = 1; o <= 10; ++o) {
                System.out.print(i * o + "\t");
            }
            System.out.println("");
        }
    }
}
