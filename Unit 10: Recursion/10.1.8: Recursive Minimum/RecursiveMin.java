import java.util.*;

public class RecursiveMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (;;) {
             System.out.println("Please enter numbers. Enter -1 to quit: ");
             int number = input.nextInt();

             if (number == -1) {
                 break;
             } else {
                 numbers.add(number);
             }
        }

        int minimum = findMinimum(numbers);
        System.out.println("Minimum: " + minimum);
    }

    public static int findMinimum(ArrayList<Integer> numbers) {
        // Base Case: What is the smallest ArrayList you can have?
        if (numbers.size() == 0) {
            return -1;
        }
        // What is the minimum value of that array?
        if (numbers.size() == 1) {
            return numbers.get(0);
        }
        // Recursive call: How do you find the minimum of the rest of the ArrayList?
        //                 (Not including the last element)
        if (numbers.get(0) < numbers.get(1)) {
            numbers.remove(1);
        } else {
            numbers.remove(0);
        }
        // Return: The minimum of (the last element, minimum of the rest of the ArrayList)
        return findMinimum(numbers);
    }
}
