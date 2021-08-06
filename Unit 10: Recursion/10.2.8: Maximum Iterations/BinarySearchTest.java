import java.util.*;

public class BinarySearchTest {

    static int count;

    public static void main(String[] args) {

        // Use the helper code to generate arrays, calculate the max
        // iterations, and then find the actual iterations for a randomly
        // selected value.
        for (int i = 100; i <= 1000000; i *= 10) {
            int[] arr = generateArrayOfLength(i);
            System.out.println("Array Size: " + i + "\nMax iterations: " + binaryMax(i) + "\nActual iteration: " + binaryRec(arr, 0, arr[0], arr[arr.length - 1]));
        }
    }

    public static int binaryRec(int[] array, int target, int begin, int end) {
        if (begin <= end) {
        	int mid = (begin + end) / 2;
            count += 1;
        	// Base Case
        	if (target == array[mid]) {
        			return mid;
        	}

            if (target < array[mid]) {
                return binaryRec(array, target, begin, mid - 1);
            }

            if (target > array[mid]) {
                return binaryRec(array, target, mid + 1, end);
            }
        }
		return -1; //Alternate Base Case - not found
    }

    public static int[] generateArrayOfLength(int length) {
        int[] arr = new int[length];
        for(int i = 0; i < length; ++i) {
            arr[i] = (int)(Math.random() * 100);
        }

        Arrays.sort(arr);

        return arr;
    }

    private static int binaryMax(int length) {
        return (int) (Math.log(length) / Math.log(2)) + 1;
    }
}
