public class TicTacToe {
	//copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
    private int turn;
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

	//this method returns the current turn
	public int getTurn() {
        return turn;
	}

	/*This method prints out the board array on to the console
	*/
	public void printBoard() {
	    System.out.println("  0 1 2");
        for (int i = 0; i < 3; ++i) {
            System.out.print(i + " ");
            for (String element : board[i]) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
	}

	//This method returns true if space row, col is a valid space
	public boolean pickLocation(int row, int col) {
        return board[row][col] == "-";
	}

	//This method places an X or O at location row,col based on the int turn
	public void takeTurn(int row, int col) {
	    if (pickLocation(row, col)) {
	        String letter = "O";
	        if (turn % 2 == 0) {
	            letter = "X";
	        }
            board[row][col] = letter;
	    }
	    turn += 1;
	}

	//This method returns a boolean that returns true if a row has three X or O's in a row
	public boolean checkRow() {
	    for (int i = 0; i < 3; ++i) {
            String row = board[i][0] + board[i][1] + board[i][2];
            if (row.equals("XXX") || row.equals("OOO")) {
                return true;
            }
	    }
	    return false;
	}

	 //This method returns a boolean that returns true if a col has three X or O's
	public boolean checkCol() {
	    for (int i = 0; i < 3; ++i) {
            String col = board[0][i] + board[1][i] + board[2][i];
            if (col.equals("XXX") || col.equals("OOO")) {
                return true;
            }
	    }
	    return false;
	}

	 //This method returns a boolean that returns true if either diagonal has three X or O's
	public boolean checkDiag() {
	    String x1 = board[0][0] + board[1][1] + board[2][2];
	    String x2 = board[0][2] + board[1][1] + board[2][0];
	    String x = "XXX";
	    String o = "OOO";

	    return x1.equals(x) || x1.equals(o) || x2.equals(x) || x2.equals(o);
	}

	//This method returns a boolean that checks if someone has won the game
	public boolean checkWin() {
        return checkCol() || checkRow() || checkDiag();
	}
}

