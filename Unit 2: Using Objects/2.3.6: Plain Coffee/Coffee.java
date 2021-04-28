public class Coffee {
    private int brewStrength; // on a scale of 1 to 5, 5 being the darkest
    private boolean sugar;    // has sugar (true) or does not (false)

    // takes the values "none", "whole", "nonfat", "soy", or "almond"
    private String milkType;

    public Coffee() {
        brewStrength = 3;
        sugar = true;
        milkType = "whole";
    }

    public Coffee(int howStrong, boolean hasSugar, String milk) {
        brewStrength = howStrong;
        sugar = hasSugar;
        milkType = milk;
    }

    public String toString() {
        return "Coffee brewed to level " + brewStrength + " with " + milkType + " milk. Sugar? " + sugar;
    }
}
