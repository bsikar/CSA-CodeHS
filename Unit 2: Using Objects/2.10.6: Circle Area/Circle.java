public class Circle {
    private double radius;

    public Circle(double theRadius) {
        radius = theRadius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
}
