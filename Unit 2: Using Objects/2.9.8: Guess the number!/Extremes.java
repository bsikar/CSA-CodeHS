public class Extremes {
    Integer min;
    Integer max;

    public Extremes() {
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
    }

    public Integer maxDiff(Integer number) {
        return max - number;
    }

    public Integer minDiff(Integer number) {
        return min - number;
    }

    public String toString() {
        return "[" + min + ", " + max + "]";
    }
}
