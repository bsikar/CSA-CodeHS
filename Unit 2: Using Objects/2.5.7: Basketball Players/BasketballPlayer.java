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

public class BasketballPlayer {
	private String name;
	private String team;
	private int totalPoints;
	private int totalAssists;
	private int gamesPlayed;

	public BasketballPlayer(String playerName, String currentTeam) {
		name = playerName;
		team = currentTeam;
		totalPoints = 0;
		gamesPlayed = 0;
	}

	public BasketballPlayer(String playerName) {
		this(playerName, "no team");
	}

	public void addGame(int points, int assists) {
		totalPoints += points;
		totalAssists += assists;
		gamesPlayed ++;
	}

	public void printPPG() {
		System.out.print("Points per game: ");
		System.out.println((double) totalPoints / gamesPlayed);
	}

	public void printAPG() {
		System.out.print("Assists per game: ");
		System.out.println((double) totalAssists / gamesPlayed);
	}

	public String toString() {
	    return name + " averages " + ((double) totalPoints / gamesPlayed) + " points per game.";
	}
}
