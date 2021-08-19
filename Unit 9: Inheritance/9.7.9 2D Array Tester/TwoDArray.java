public class TwoDArray {
    private Object[][] myArray;

    public TwoDArray(Object[][] input) {
        myArray = input;
    }

    public boolean equals(Object[][] other) {
        return myArray.equals(other);
    }
}
