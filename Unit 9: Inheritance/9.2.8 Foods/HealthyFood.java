public class HealthyFood extends Food {
    private String group;

    public HealthyFood(String name, int calories, String group) {
        super(name, calories);
        this.group = group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }
}

