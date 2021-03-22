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

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
    * Returns value of numerator
    * @return numerator
    */
    public int getNumerator() {
        return numerator;
    }

    /**
    * Sets new value of numerator
    * @param numerator new numerator value
    */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
    * Returns value of denominator
    * @return denominator
    */
    public int getDenominator() {
        return denominator;
    }

    /**
    * Sets new value of denominator
    * @param denominator new denominator
    */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
    * Updates this fraction by adding another fraction
    * @param other Fraction to add to existing fraction
    */
    public void addFraction(Fraction other) {
        Fraction x = FractionMath.add(this, other);
        numerator = x.getNumerator();
        denominator = x.getDenominator();
    }

    /**
    * Updates this fraction by multiplying another fraction
    * @param other Fraction to multiple to existing fraction
    */
    public void multiplyFraction(Fraction other) {
        Fraction x = FractionMath.multiply(this, other);
        numerator = x.getNumerator();
        denominator = x.getDenominator();
    }

    /**
    * Prints fraction as numerator / denominator
    * Example: 1 / 2
    */
    public String toString() {
        return numerator + " / " + denominator;
    }
}