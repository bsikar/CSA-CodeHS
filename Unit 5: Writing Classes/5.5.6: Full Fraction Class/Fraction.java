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
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int x) {
        numerator = x;
    }

    public void setDenominator(int x) {
        denominator = x;
    }

    public void add(Fraction other) {
        if (denominator == other.denominator) {
            numerator += other.numerator;
        } else {
            numerator = other.denominator * numerator + other.numerator * denominator;
            denominator *= other.denominator;
            for (;;) {
                if (numerator % 3 == 0 && denominator % 3 == 0) {
                    numerator /= 3;
                    denominator /= 3;
                } else if (numerator % 2 == 0 && denominator % 2 == 0) {
                    numerator /= 2;
                    denominator /= 2;
                } else {
                    break;
                }
            }
        }
    }

    public void subtract(Fraction other) {
        if (denominator == other.denominator) {
            numerator -= other.numerator;
        } else {
            numerator = other.denominator * numerator - other.numerator * denominator;
            denominator *= other.denominator;
            for (;;) {
                if (numerator % 3 == 0 && denominator % 3 == 0) {
                    numerator /= 3;
                    denominator /= 3;
                } else if (numerator % 2 == 0 && denominator % 2 == 0) {
                    numerator /= 2;
                    denominator /= 2;
                } else {
                    break;
                }
            }
        }
    }

    public void multiply(Fraction other) {
        numerator *= other.getNumerator();
        denominator *= other.getDenominator();
    }

    public String toString() {
        return numerator + " / " + denominator;
    }
}