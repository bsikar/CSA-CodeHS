import java.util.Scanner;

public class MyAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your current age:");
        int age = input.nextInt();
        System.out.println("My current age is: " + age + "\nMy age next year will be: " + ++age + "\nMy current age is: " + --age);
    }
}
