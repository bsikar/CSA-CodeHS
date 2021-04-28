public class Messages {
    public static void main(String[] args) {
        TextMessage message1 = new TextMessage("Joe", "Bob", "Hi Bob");
        TextMessage message2 = new TextMessage("Bob", "Joe", "Oh, hi Joe!");

        System.out.println(message1);
        System.out.println(message2);
    }
}
