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
