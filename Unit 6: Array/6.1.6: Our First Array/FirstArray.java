public class FirstArray {
    public static void main(String[] args) {
        String[] a = {"Las Vegas", "Minsk", "Sao Paulo"};
        int[] b = {104, 73, 80};
        double[] c = {4.17, 26.7, 55};

        for (int i = 0; i < 3; ++i) {
            System.out.println(a[i] + " has an average annual precipitation of " + c[i] + " inches.");
            System.out.println(a[i] + " has an average annual high temp of " + b[i] + " degrees Fahrenheit.");
        }
    }
}
