import java.lang.Math;

public class Cube extends RectangularPrism {
    private int side;

    public Cube(String name, int side) {
        super(name, side, side, side);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea() {
        return 6.0 * side * side;
    }
}
