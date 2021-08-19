import java.lang.Math;

public class Cylinder extends Solid {
    private int radius;
    private int height;

    private static final double PI = 3.14159;

    public Cylinder(String name, int radius, int height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double volume() {
        return PI * radius * radius * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * PI * radius * height + 2 * PI * radius * radius;
    }
}

