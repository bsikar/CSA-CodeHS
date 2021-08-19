public class Solid {
    private String name;

    public Solid(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // This should be overriden in the subclass
    public double volume() {
        return 0;
    }

    // This should be overriden in the subclass
    public double surfaceArea() {
        return 0;
    }
}

