public class SongTester {
    public static void main(String[] args) {
        Song song = new Song("ABBA", "Dancing Queen", 3, 54);
        for (int i = 0; i < 3; ++i) {
            System.out.println(song);
        }
    }
}
