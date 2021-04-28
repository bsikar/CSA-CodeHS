public class CarShowroom {
    public static void main (String[] args) {
        CarShowroom showroom = new CarShowroom(7);
        showroom.spaces[0] = new CarModel("Mustang", 157);
        showroom.spaces[1] = new CarModel("Camaro",155);
        showroom.spaces[3] = new CarModel("Corvette", 194);
        showroom.spaces[6] = new CarModel("Porshe", 210);

        System.out.println(showroom);

        System.out.println("Index of Mustang should be 0 and is " + showroom.findCarSpace("Mustang"));
        System.out.println("Index of Corvette should be 3 and is " + showroom.findCarSpace("Corvette"));
        System.out.println("Index of Miata should be -1 and is " + showroom.findCarSpace("Miata"));
        System.out.println("\nOriginal Car Showroom:");
        System.out.println(showroom);
        showroom.consolidate();
        System.out.println("Car Showroom after cars have been consolidated:");
        System.out.println(showroom);
    }

    private CarModel[] spaces;

    public CarShowroom(int numParkingSpaces) {
        spaces = new CarModel[numParkingSpaces];
    }

    public int findCarSpace(String name) {
        for (int i = 0; i < spaces.length; ++i) {
            if (!(spaces[i] == null) && spaces[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void consolidate() {
        for (int j = 0; j < spaces.length; ++j) {
            for (int i = 0; i < spaces.length - 1; ++i) {
                if (spaces[i] == null) {
                    CarModel temp = spaces[i];
                    spaces[i] = spaces[i + 1];
                    spaces[i + 1] = temp;
                }
            }
        }
    }

    public String toString() {
        String result = "";
        CarModel sp = null;

        for (int i = 0; i < spaces.length; ++i) {
            sp = spaces[i];
            result = result + "Space " + i + " has a ";

            if (sp == null) {
                result = result + " null\n";
            } else {
                result = result + sp.toString() + "\n";
            }
        }
        return result;
    }
}
