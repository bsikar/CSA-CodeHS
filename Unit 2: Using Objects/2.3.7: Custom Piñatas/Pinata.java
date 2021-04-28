public class Pinata {
    private String candy;
    private String color;
    private String shape;

    public Pinata() {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }

    public Pinata(String candyI, String colorI, String shapeI) {
        candy = candyI;
        color = colorI;
        shape = shapeI;
    }

    public Pinata(String colorI, String shapeI) {
        candy = "hard candy";
        color = colorI;
        shape = shapeI;
    }

    public Pinata(String candyI) {
        candy = candyI;
        color = "rainbow";
        shape = "donkey";
    }

    public String toString() {
        return color + " " + shape + " pinata filled with " + candy;
    }
}
