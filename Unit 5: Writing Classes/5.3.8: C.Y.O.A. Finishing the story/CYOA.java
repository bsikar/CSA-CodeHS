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