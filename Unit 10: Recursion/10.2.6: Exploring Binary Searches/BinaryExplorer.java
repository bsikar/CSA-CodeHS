public class BinaryExplorer {

    public static void main(String[] args) {
        int[] testArray = {3, 6, 12, 18, 24, 34, 54, 64, 87, 100};

        binaryRec(testArray, 87, 0, testArray.length - 1);
    }

    /**
     * Add Print statements to the binaryRec method:
     *
     * Print Starting, ending, and midpoint values.
     *
     * Print when you find a match
     *
     * Print if you are too high or too low.
     *
     **/
    public static int binaryRec(int[] array, int target, int begin, int end) {
        System.out.println("Starting value: " + array[begin] + "\nEnding value: " + array[end]);
        if (begin <= end) {
            int mid = (begin + end) / 2;
            System.out.println("Testing midpoint value: " + array[mid]);

            // Base Case
            if (target == array[mid]) {
                System.out.println("Match!\n");
                return mid;
            }

            if (target < array[mid]) {
                System.out.println("Too high!\n");
                return binaryRec(array, target, begin, mid - 1);
            }

            if (target > array[mid]) {
                System.out.println("Too low!\n");
                return binaryRec(array, target, mid + 1, end);
            }
        }

        return -1; //Alternate Base Case - not found
    }
}
