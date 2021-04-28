public class FractionTester {
    public static void main(String[] args) {
        Fraction first = new Fraction(5, 3);
        Fraction second = new Fraction(12, 18);

        System.out.println();
        System.out.println("BEFORE:");
        System.out.println(first);
        first.add(second);
        System.out.println("AFTER:");
        System.out.println(first);
    }
}
