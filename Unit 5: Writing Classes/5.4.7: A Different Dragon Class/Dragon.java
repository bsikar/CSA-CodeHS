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

public class Dragon {
    private String name;
    private int level;
    private boolean canBreatheFire;

    public Dragon(String name, int level) {
        this.name = name;
        this.level = level;
        if (level > 70) {
            canBreatheFire = true;
        } else {
            canBreatheFire = false;
        }
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public boolean isFireBreather() {
        return canBreatheFire;
    }

    public void attack() {
        if (canBreatheFire) {
            System.out.println(">>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>");
        } else {
            System.out.println("~ ~ ~");
        }
    }

    public void gainExperience() {
        level += 10;

        if (level > 70) {
            canBreatheFire = true;
        }
    }

    public String toString() {
        return "Dragon " + name + " is at level " + level;
    }
}
