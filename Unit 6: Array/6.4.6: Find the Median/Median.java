import java.util.*;

class Median {
    public static void main(String[] args) {
        int[] numbers1 = {12, 75, 3, 17, 65, 22};
        System.out.print("The median value of the EVEN array is " + median(numbers1));

        int[] numbers2 = {12, 75, 3, 17, 65, 22, 105};
        System.out.print("\nThe median value of the ODD array is " + median(numbers2));
    }

    public static double median(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);

        return (len % 2 == 0) ? (double)(arr[len / 2 - 1] + arr[len / 2]) / 2 : arr[len / 2];
    }
}
