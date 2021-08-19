public class Fruit extends HealthyFood {
    private boolean isLocal;
    private String color;

    public Fruit(String name, int calories, boolean isLocal, String color) {
        super(name, calories, "Fruit");
        this.isLocal = isLocal;
        this.color = color;
    }

    public void setIsLocal(boolean isLocal) {
        this.isLocal = isLocal;
    }

    public boolean getIsLocal() {
        return isLocal;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.getName() + " has " + super.getCalories() + " calories";
    }
}

