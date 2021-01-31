public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String candyI, String colorI, String shapeI) {
        candy = candyI;
        color = colorI;
        shape = shapeI;
    }
    
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    public Pinata(String colorI, String shapeI) {
        candy = "hard candy";
        color = colorI;
        shape = shapeI;
    }
    
    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String candyI) {
        candy = candyI;
        color = "rainbow";
        shape = "donkey";
    }
    
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}
