public class Battleship {
    private String shipType;
    private int position;

    public Battleship(String type, int shipPosition) {
        shipType = type;
        position = shipPosition;
    }

    public void move (boolean safeToMove) {
        if (safeToMove) {
            position += 5;
        } else {
            position -= 5;
        }
    }

    public int getPosition() {
        return position;
    }

    public String toString() {
        return shipType + " at " + position;
    }
}
