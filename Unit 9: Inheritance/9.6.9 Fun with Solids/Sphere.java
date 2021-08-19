import java.lang.Math;

public class Sphere extends Solid {
    private int radius;

    private static final double PI = 3.14159;

    public Sphere(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double volume() {
        return 4.0 / 3.0 * PI * Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea() {
        return 4 * PI * radius * radius;
    }
}

