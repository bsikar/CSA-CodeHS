public class Dragon {
    private String name;
    private int level;
    private boolean canBreatheFire;

    public Dragon(String name, int level) {
        this.name = name;
        this.level = level;
        if (level > 70) {
            canBreatheFire = true;
        } else {
            canBreatheFire = false;
        }
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public boolean isFireBreather() {
        return canBreatheFire;
    }

    public void attack() {
        if (canBreatheFire) {
            System.out.println(">>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>");
        } else {
            System.out.println("~ ~ ~");
        }
    }

    public void gainExperience() {
        level += 10;

        if (level > 70) {
            canBreatheFire = true;
        }
    }

    public String toString() {
        return "Dragon " + name + " is at level " + level;
    }
}
