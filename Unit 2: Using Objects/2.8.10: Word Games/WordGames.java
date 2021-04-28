public class WordGames {
    private String word;

    public WordGames(String text) {
        word = text;
    }

    public String scramble() {
        return word.substring(word.length() / 2) + word.substring(0, word.length() / 2);
    }

    public String bananaSplit(int insertIdx, String insertText) {
        return word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
    }

    public String bananaSplit(String insertChar, String insertText) {
        return word.substring(0, word.indexOf(insertChar)) + insertText + word.substring(word.indexOf(insertChar));
    }

    public String toString() {
        return "[" + word + "]";
    }
}
