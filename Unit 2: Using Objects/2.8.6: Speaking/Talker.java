public class Talker {
    private String text;

    public Talker(String startingText) {
        text = startingText;
    }

    public String yell() {
        return text.toUpperCase();
    }

    public String whisper() {
        return text.toLowerCase();
    }

    public void setText(String newText) {
        text = newText;
    }

    public String toString() {
        return "I say, \"" + text + "\"";
    }
}
