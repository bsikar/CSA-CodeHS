public class LastElement {
    public static void main(String[] args) {
        String[] arr = {"hello", "my name", "world", "Karel"};
        System.out.println("The last element of the String array is: " + getLastElement(arr));
    }

    public static String getLastElement(String[] arr) {
        return arr[arr.length - 1];
    }
}
