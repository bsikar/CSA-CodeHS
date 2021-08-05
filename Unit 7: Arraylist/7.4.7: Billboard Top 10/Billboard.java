import java.util.ArrayList;

public class Billboard {
    private ArrayList<Musician> top10 = new ArrayList<Musician>();

    public void add(Musician musician) {
        if (musician.getIsPlatinum()) {
            if (top10.size() < 10) {
                top10.add(musician);
            } else {
                Boolean x = false;
                int index = 0;
                for (int i = 0; i < top10.size(); ++i) {
                    if (top10.get(i).getWeeksInTop40() < musician.getWeeksInTop40()) {
                        if (top10.get(index).getWeeksInTop40() > top10.get(i).getWeeksInTop40()) {
                            index = i;
                        }

                        x = true;
                    }
                }
                if (!x) {
                    System.out.println("Sorry, " + musician.getName() + " has less weeks in the Top 40 than the other musicians.");
                } else {
                    System.out.println("The musician " + top10.get(index).getName() + " has been replaced by " + musician.getName() + '.');
                    top10.add(index, musician);
                    top10.remove(index + 1);
                }
            }
        } else {
            System.out.println("Sorry, " + musician.getName() + " does not qualify for Top 10");
        }
    }

    // Don't make alterations to this method!
    public void printTop10() {
        System.out.println(top10);
    }
}
