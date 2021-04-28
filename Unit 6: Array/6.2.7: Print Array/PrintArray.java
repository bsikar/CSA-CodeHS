public class PrintArray {
    public static void main(String[] args) {
        String[] arr = new String[] {"a", "b", "c"};
        printArr(arr);
    }

    public static void printArr(String[] arr) {
        for (String i : arr) {
            System.out.println(i);
        }
    }
}
