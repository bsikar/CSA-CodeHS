import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your text: ");
        System.out.println((isPalindrome(input.nextLine())) ? "Your word is a palindrome!" : "Not a palindrome :(");
    }

    public static boolean isPalindrome(String text) {
       return text.equals(reverse(text));
    }

    public static String reverse(String text) {
        String output = "";

        for (int i = text.length() - 1; i >= 0; --i) {
            output = output + text.charAt(i);
        }

        return output;
    }
}
