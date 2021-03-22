/* MIT License
 *
 * Copyright (c) 2021 Brighton Sikarskie
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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