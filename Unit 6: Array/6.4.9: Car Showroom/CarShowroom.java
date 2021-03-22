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

public class CarShowroom {
    public static void main (String[] args) {
        CarShowroom showroom = new CarShowroom(7);
        showroom.spaces[0] = new CarModel("Mustang", 157);
        showroom.spaces[1] = new CarModel("Camaro",155);
        showroom.spaces[3] = new CarModel("Corvette", 194);
        showroom.spaces[6] = new CarModel("Porshe", 210);

        System.out.println(showroom);

        System.out.println("Index of Mustang should be 0 and is " + showroom.findCarSpace("Mustang"));
        System.out.println("Index of Corvette should be 3 and is " + showroom.findCarSpace("Corvette"));
        System.out.println("Index of Miata should be -1 and is " + showroom.findCarSpace("Miata"));
        System.out.println("\nOriginal Car Showroom:");
        System.out.println(showroom);
        showroom.consolidate();
        System.out.println("Car Showroom after cars have been consolidated:");
        System.out.println(showroom);
    }

    private CarModel[] spaces;

    public CarShowroom(int numParkingSpaces) {
        spaces = new CarModel[numParkingSpaces];
    }

    public int findCarSpace(String name) {
        for (int i = 0; i < spaces.length; ++i) {
            if (!(spaces[i] == null) && spaces[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void consolidate() {
        for (int j = 0; j < spaces.length; ++j) {
            for (int i = 0; i < spaces.length - 1; ++i) {
                if (spaces[i] == null) {
                    CarModel temp = spaces[i];
                    spaces[i] = spaces[i + 1];
                    spaces[i + 1] = temp;
                }
            }
        }
    }

    public String toString() {
        String result = "";
        CarModel sp = null;

        for (int i = 0; i < spaces.length; ++i) {
            sp = spaces[i];
            result = result + "Space " + i + " has a ";

            if (sp == null) {
                result = result + " null\n";
            } else {
                result = result + sp.toString() + "\n";
            }
        }
        return result;
    }
}
