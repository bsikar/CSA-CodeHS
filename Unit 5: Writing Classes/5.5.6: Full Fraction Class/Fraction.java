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
