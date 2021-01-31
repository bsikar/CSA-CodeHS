public class PlayerTester
{
    public static void main(String[] args) {
        
        //Start here
        BasketballPlayer lebron = new BasketballPlayer("Lebron James", "Heat");
        BasketballPlayer jordan = new BasketballPlayer("Michael Jordan");
        lebron.addGame(26, 13);
        jordan.addGame(30, 8);
        lebron.addGame(26, 13);
        jordan.addGame(30, 8);
        lebron.addGame(26, 13);
        jordan.addGame(30, 8);
        lebron.addGame(26, 13);
        jordan.addGame(30, 8);
        lebron.addGame(26, 13);
        jordan.addGame(30, 8);
        System.out.println("Lebron James Stats:");
        lebron.printPPG();
        lebron.printAPG();
        System.out.println(lebron);
        System.out.println("\nMichael Jordan Stats:");
        jordan.printPPG();
        jordan.printAPG();
        System.out.println(jordan);
    }
}
