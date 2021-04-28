public class PlayerTester {
    public static void main(String[] args) {
        System.out.println(Player.gameFull());
        for (int i = 0; i < 10; ++i) {
            new Player();
        }

        System.out.println(Player.gameFull());
    }
}
