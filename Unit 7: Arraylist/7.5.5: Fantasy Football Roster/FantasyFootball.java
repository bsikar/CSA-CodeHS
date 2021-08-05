import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);

        ArrayList<String> team = new ArrayList<String>();

        for (int i = 0; i < 5; ++i) {
            System.out.println("Enter Player you would like on your team: ");
            String name = input.nextLine();
            if (availablePlayers.contains(name)) {
                team.add(name);
                availablePlayers.remove(availablePlayers.indexOf(name));
                System.out.println("Great! That player is added to your team!\n");
            } else {
                System.out.println("That player is not available, please pick another player.\n");
                i -= 1;
            }
        }

        System.out.println("Your team is:");
        for (String name : team) {
            System.out.println(name);
        }
    }

    public static int search(ArrayList<String> array, String player) {
        for (int i = 0; i < array.size(); ++i) {
            if (array.get(i) == player) {
                return i;
            }
        }

        return -1;
    }

    public static void addPlayers(ArrayList<String> array) {
        //Feel free to add names of your favorite players to this list!
        //But make sure you DON'T remove any players from it!
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}
