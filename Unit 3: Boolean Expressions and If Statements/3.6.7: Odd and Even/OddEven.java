public class OddEven {
    public static boolean bothOdd(int n1, int n2) {
        return !(n1 % 2 == 0 || n2 % 2 == 0);
    }

    public static boolean bothEven(int n1, int n2) {
        return (n1 % 2 == 0) && (n2 % 2 == 0);
    }
}
