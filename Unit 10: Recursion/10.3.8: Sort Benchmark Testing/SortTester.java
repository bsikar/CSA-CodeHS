import java.util.ArrayList;

public class SortTester {
    public static void main(String[] args) {
        long startTime;

        for (int i = 10; i < 100; i *= 5) {
            int[] randomArray = makeRandomArray(i);
            int[] reverseArray = makeReverseArray(i);
            int[] almostSortedArray = makeAlmostSortedArray(i);

            startTime = System.currentTimeMillis();
            Sorter.mergeSort(randomArray, randomArray.length);
            System.out.println("Merge Sort: randomArray: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            Sorter.mergeSort(reverseArray, reverseArray.length);
            System.out.println("Merge Sort: reverseArray: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            Sorter.mergeSort(almostSortedArray, almostSortedArray.length);
            System.out.println("Merge Sort: almostSortedArray: " + (System.currentTimeMillis() - startTime));
        }
        for (int i = 10; i < 100; i *= 5) {
            int[] randomArray = makeRandomArray(i);
            int[] reverseArray = makeReverseArray(i);
            int[] almostSortedArray = makeAlmostSortedArray(i);

            startTime = System.currentTimeMillis();
            Sorter.selectionSort(randomArray);
            System.out.println("Selection Sort: randomArray: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            Sorter.selectionSort(reverseArray);
            System.out.println("Selection Sort: reverseArray: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            Sorter.selectionSort(almostSortedArray);
            System.out.println("Selection Sort: almostSortedArray: " + (System.currentTimeMillis() - startTime));
        }
        for (int i = 10; i < 100; i *= 5) {
            int[] randomArray = makeRandomArray(i);
            int[] reverseArray = makeReverseArray(i);
            int[] almostSortedArray = makeAlmostSortedArray(i);

            startTime = System.currentTimeMillis();
            Sorter.insertionSort(randomArray);
            System.out.println("Insertion Sort: randomArray: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            Sorter.insertionSort(reverseArray);
            System.out.println("Insertion Sort: reverseArray: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            Sorter.insertionSort(almostSortedArray);
            System.out.println("Insertion Sort: almostSortedArray: " + (System.currentTimeMillis() - startTime));
        }
    }

    /**
     * This method returns an array in random order
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number.
     */
    public static int[] makeRandomArray(int number) {
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number);
        // Create the sorted list
        for (int i = 0; i < number; ++i) {
            sorted.add(i);
        }

        // Now shuffle it.
        int index = 0;
        while (sorted.size() > 0) {
            int randomIndex = (int)(Math.random()*sorted.size());
            array[index] = sorted.remove(randomIndex);
            index += 1;
        }

        return array;
    }

    /**
     * This method returns an array in reverse order starting from the parameter number
     * and going to the value 0.
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number. Index 0 is the value number, and
     * index array.length-1 is 0
     */
    public static int[] makeReverseArray(int number) {
       int[] array = new int[number];
       int counter = number;
       for(int i = 0; i < number; ++i) {
           array[i] = counter;
           counter--;
       }

       return array;
   }

   /**
    * This method returns an array that is almost sorted, but the last index
    * and last index-1 are switched.
    * @param number- the length of the desired almost sorted array
    * @return array - returns an array length number with index array.length - 1
    * and array.length- 2 swapped.
    */
   public static int[] makeAlmostSortedArray(int number) {
       int[] array = new int[number];
       for (int i= 0; i < number; ++i) {
           array[i] = i+1;
       }
       int temp = array[array.length-1];
       array[array.length-1] = array[array.length - 2];
       array[array.length - 2] = temp;

       return array;

   }
}
