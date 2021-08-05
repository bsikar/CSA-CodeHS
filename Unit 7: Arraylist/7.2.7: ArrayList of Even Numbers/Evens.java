import java.util.ArrayList;

public class Evens {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        for (int i = 2; i <= 100; i += 2) {
            a.add(i);
        }

        printArray(a);
    }


    //Don't alter this method! It will print your array in the console
    public static void printArray(ArrayList<Integer> array) {
        System.out.println("Array:");

        for (int name: array) {
            System.out.print(name + " ");
        }
    }
}
