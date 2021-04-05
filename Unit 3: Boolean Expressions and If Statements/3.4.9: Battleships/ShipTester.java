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

public class ShipTester {
    public static void main(String[] args) {
        Battleship sub = new Battleship("submarine", 6);
        Battleship raft = new Battleship("raft", 2);
        Battleship destroyer = new Battleship("destroyer", 9);

        System.out.println(sub);
        System.out.println("Sub has power " + sub.getPower());

        System.out.println(raft);
        System.out.println("Raft has power " + raft.getPower());

        System.out.println(destroyer);
        System.out.println("Destroyer has power " + destroyer.getPower());

        System.out.println("\nRaft attacks Sub");
        sub.isAttacked(raft.getPower());
        System.out.println(sub);

        System.out.println("\nDestroyer attacks Raft");
        raft.isAttacked(destroyer.getPower());
        System.out.println(raft);

        System.out.println("\nSub attacks Destroyer");
        destroyer.isAttacked(sub.getPower());
        System.out.println(destroyer);
    }
}

