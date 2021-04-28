public class Circle {
    private int radius;
    private String color;
    private int x;
    private int y;

    public Circle(int theRadius, String theColor, int xPosition, int yPosition) {
        radius = theRadius;
        color = theColor;
        x = xPosition;
        y = yPosition;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return color + " circle with a radius of " + radius + " at position ("+ x + ", " + y +")";
    }

    public boolean equals(Circle other) {
        return color.equals(other.color) && radius == other.radius && x == other.x && y == other.y;
    }
}
