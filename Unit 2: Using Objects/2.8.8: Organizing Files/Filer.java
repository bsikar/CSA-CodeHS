public class Filer {
    private String word;

    public Filer(String theWord) {
        word = theWord;
    }

    public String getWord() {
        return word;
    }

    public boolean comesBefore(String otherWord) {
        return word.compareTo(otherWord) < 0;
    }

    public boolean comesAfter(String otherWord) {
        return word.compareTo(otherWord) > 0;
    }

    public boolean isEqual(String otherWord) {
        return word.equals(otherWord);
    }
}
