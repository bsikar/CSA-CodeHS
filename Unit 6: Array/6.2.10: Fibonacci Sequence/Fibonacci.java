public class Fibonacci {
    public static void main(String[] args) {
        int max = 15;
        int[] sequence = new int[max];

        sequence[0] = 0;
        sequence[1] = 1;

        for (int i = 2; i < sequence.length; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        System.out.println("Fibonacci sequence up to 15 terms:");
        for (int i : sequence) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Index position of 55 is: " + findIndex(sequence, 55));
    }

    public static int findIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }
}
