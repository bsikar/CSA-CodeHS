public class Dragon {
    private String attack;
    private int level;

    public Dragon(int level, String attack) {
        this.attack = attack;
        this.level = level;
    }

    public String getAttack() {
        return attack;
    }

    public int getLevel() {
        return level;
    }

    public String fight() {
        String z = "";
        for (int i = 0; i < level; ++i) {
            z += attack;
        }
        return z;
    }

    public String toString() {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}
