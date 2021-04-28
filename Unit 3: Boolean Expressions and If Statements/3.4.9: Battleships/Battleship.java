public class Battleship {
    private String name;
    private int power;
    private int health;

    public Battleship(String shipType, int attackPower) {
        name = shipType;
        power = attackPower;
        health = 100;
    }

    public void isAttacked(int attackPower) {
        if (attackPower < 4) {
            health -= 3;
        } else if (attackPower < 8) {
            health -= 5;
        } else {
            health -= 7;
        }
    }

    public boolean stillFloating() {
        return health > 0;
    }

    public int getPower() {
        return power;
    }

    public String toString() {
        return name + "(" + health + ")";
    }
}
