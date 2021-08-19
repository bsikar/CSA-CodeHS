public class Instrument {
    private String name;
    private String family;

    public Instrument(String name) {
        this.name = name;
        this.family = "Strings";
    }

    public Instrument(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String toString() {
        return name + " is a member of the " + family + " family.";
    }

    public String getName() {
        return this.name;
    }

    public String getFamily() {
        return this.family;
    }
}
