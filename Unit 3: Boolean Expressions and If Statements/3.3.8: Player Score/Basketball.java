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

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter player one's name:");
        String player1Name = input.nextLine();
        System.out.println("Enter player two's name:");
        String player2Name = input.nextLine();
        System.out.println("Enter " + player1Name + "'s score");

        int player1Score = input.nextInt();
        System.out.println("Enter " + player2Name + "'s score");
        int player2Score = input.nextInt();
     
        if (!(player1Name.compareTo(player2Name) > 0)) {
            System.out.println(player1Name + " scored " + player1Score + " points");
            System.out.println(player2Name + " scored " + player2Score + " points");
        } else {
            System.out.println(player2Name + " scored " + player2Score + " points");
            System.out.println(player1Name + " scored " + player1Score + " points");
        }
       
        if (player1Score > player2Score) {
            System.out.println(player1Name + " wins!");
        } else {
            System.out.println(player2Name + " wins!");
        }
    }
}
