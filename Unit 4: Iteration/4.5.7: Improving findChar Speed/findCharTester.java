public class findCharTester {
    public static void main(String[] args) {
        String word = "This is a sentence";
        String key = "a";
        System.out.println("The character "+ key+ " is in the String "+ word + ": " + findChar(word, key));
    }

    public static boolean findChar(String string, String key) {
        for (int i = 0; i < string.length(); ++i) {
            if (string.substring(i, i+1).equals(key)) {
                return true;
            }
        }
        return false;
    }
}
