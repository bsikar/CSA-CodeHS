import java.util.Scanner;

public class CYOA {
    public static void main(String[] args) {
        boolean won;
        // Intro
        Scanner in = new Scanner(System.in);
        System.out.println("This is a game; you better have fun");
        // Choose location from list of 2
        System.out.println("Choose a location: Mall or Racetrack");
        String location = in.nextLine();
        // Choose item from list of 2
        System.out.println("Choose an item: Keys or Money");
        String item = in.nextLine();
        // if location 1 and item 1
        if (location.equals("Mall") && item.equals("Money")) {
            // test them with a question
            System.out.println("Do you have a ride to the mall");
            String answer = in.nextLine();
            // if they guess right
            if (answer.equals("Yes")) {
                // they win
                won = true;
            } else {
            // else
                // they fail
                won = false;
            }
        } else if (location.equals("Mall") && item.equals("Keys")) {
        // else if location 1 and item 2
            // test them with a question
            System.out.println("Are you going to buy anything?");
            String answer = in.nextLine();
            // if they guess right
            if (answer.equals("No")) {
                // they win
                won = true;
            } else {
            // else
                // they fail
                won = false;
            }
        } else if (location.equals("Racetrack") && item.equals("Keys")) {
        // else if location 2 and item 2
            // test them with a question
            System.out.println("Are you going to buy anything?");
            String answer = in.nextLine();
            // if they guess right
            if (answer.equals("No")) {
                // they win
                won = true;
            } else {
            // else
                // they fail
                won = false;
            }
        } else if (location.equals("Racetrack") && item.equals("Money")) {
        // else if location 2 and item 1
            System.out.println("Do you have a ride to the racetrack");
            String answer = in.nextLine();
            // if they guess right
            if (answer.equals("Yes")) {
                // they win
                won = true;
            } else {
            // else
                // they fail
                won = false;
            }
        } else {
        // else they fail
            won = false;
        }
        // if they won
        if (won) {
            // say something epic
            System.out.println("something epic");
        } else {
        // else
            // say something less epic
            System.out.println("something less epic");
        }
    }
}
