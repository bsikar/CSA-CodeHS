public class BattleshipTester {
    public static void main(String[] args) {
        Battleship submarine = new Battleship("Submarine", 4);
        Battleship carrier = new Battleship("Carrier", 10);

        System.out.println(submarine);
        System.out.println(carrier);

        System.out.println("Submarine cleared to proceed");
        submarine.move(true);
        System.out.println(submarine);

        System.out.println("Carrier NOT cleared to proceed");
        carrier.move(false);
        System.out.println(carrier);
    }
}
