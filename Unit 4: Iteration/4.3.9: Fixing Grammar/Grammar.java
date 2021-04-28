import java.util.Scanner;

public class Grammar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence that uses \'2\' instead of \'to\'");

        System.out.println(useProperGrammar(input.nextLine()));
    }

    public static String useProperGrammar(String theText) {
        int count = 0;
        for (int i = 0; i < theText.length(); ++i) {
            if (theText.charAt(i) == '2') {
                theText = theText.substring(0, i) + "to" + theText.substring(i+1, theText.length());
                ++count;
            }
        }
        System.out.println("Fixed " + count + " grammatical errors:");
        return theText;
    }
}
