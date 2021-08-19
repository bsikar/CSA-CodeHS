import java.lang.Math;

public class Pyramid extends Solid {
    private int length;
    private int width;
    private int height;

    public Pyramid(String name, int length, int width, int height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double volume() {
        return (length * width * height) / 3.0;
    }

    @Override
    public double surfaceArea() {
        double a = length * width;
        double b = length * Math.sqrt(Math.pow((double)width / 2, 2) + height * height);
        double c = width * Math.sqrt(Math.pow((double)length / 2, 2) + height * height);

        return a + b + c;
    }
}

