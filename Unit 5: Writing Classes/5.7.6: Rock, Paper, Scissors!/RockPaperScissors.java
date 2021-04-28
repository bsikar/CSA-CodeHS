import java.util.Scanner;

public class RockPaperScissors {
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";

    public static String getWinner(String user, String computer) {
        user = user.toLowerCase();
        if (user == computer) {
            return TIE;
        } else if (user.equals("rock")) {
            if (computer.equals("paper")) {
                return COMPUTER_PLAYER;
            }
        } else if (user.equals("paper")) {
            if (computer.equals("scissors")) {
                return COMPUTER_PLAYER;
            }
        } else if (user.equals("scissors")) {
            if (computer.equals("rock")) {
                return COMPUTER_PLAYER;
            }
        } else {
            return COMPUTER_PLAYER;
        }

        return USER_PLAYER;
    }

    public static String getComputerTool() {
        switch (Randomizer.nextInt(1, 3)) {
        case 1:
            return "rock";
        case 2:
            return "paper";
        case 3:
            return "scissors";
        }
        return "impossible";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; ++i) {
            System.out.println("Enter your choice (rock, paper, or scissors):");
            String user = in.nextLine();
            String computer = getComputerTool();
            System.out.println("User: " + user);
            System.out.println("Computer: " + computer);
            System.out.println(getWinner(user, computer));
        }
    }
}
