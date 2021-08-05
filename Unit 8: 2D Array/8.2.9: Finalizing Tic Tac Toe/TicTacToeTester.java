import java.util.Scanner;

public class TicTacToeTester {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner input = new Scanner(System.in);

        while (!game.checkWin()) {
            game.printBoard();
            System.out.println("Enter move like `0x0`");
            String move = input.nextLine();
            int x = Character.getNumericValue(move.charAt(0));
            int y =  Character.getNumericValue(move.charAt(2));

            if (game.pickLocation(x, y)) {
                game.takeTurn(x, y);
            } else {
                System.out.println("Invalid move, try again");
            }
        }
    }
}
