public class Square extends Rectangle {
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public void setSideLength(double sideLength) {
        super.setWidth(sideLength);
        super.setHeight(sideLength);
    }

    public double getSideLength() {
        return super.getWidth();
    }

    public double area() {
        double side = getSideLength();

        return side * side;
    }

    @Override
    public String toString() {
        return "Square with side lengths " + getSideLength();
    }
}
