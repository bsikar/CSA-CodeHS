public class TicTacToe {
    private String[][] board;

    public TicTacToe() {
        String[][] board = {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
        };

        this.board = board;
    }

    public String[][] getBoard() {
        return board;
    }
}
