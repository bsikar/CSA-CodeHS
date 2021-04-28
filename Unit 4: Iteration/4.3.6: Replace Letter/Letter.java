import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String letterToReplace = input.nextLine();
        String replacingLetter = input.nextLine();

        System.out.println(replaceLetter(word, letterToReplace, replacingLetter));
    }

    public static String replaceLetter(String word, String letterToReplace, String replacingLetter) {
        String str = "";
        for (int i = 0; i < word.length(); ++i) {
            if (word.charAt(i) == letterToReplace.charAt(0)) {
                str += replacingLetter.charAt(0);
            } else {
                str += word.charAt(i);
            }
        }

        return str;
    }
}
