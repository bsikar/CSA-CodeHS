import java.util.ArrayList;

public class TicketOrganizer {
    private ArrayList<AirlineTicket> tickets;

    public TicketOrganizer(ArrayList<AirlineTicket> tickets) {
        this.tickets = tickets;
    }

    public void printPassengersByBoardingGroup() {
        int x = 0;
        sort(tickets);

        for (int i = 0; i < tickets.size(); ++i) {
            if (tickets.get(i).getBoardingGroup() > x) {
                while (tickets.get(i).getBoardingGroup() > x) {
                    x += 1;
                    System.out.println("Boarding Group " + x + ":");
                }
            }

            System.out.println(tickets.get(i).getName());
        }
        while (x < 5) {
            x += 1;
            System.out.println("Boarding Group " + x + ":");
        }
    }

    public void canBoardTogether() {
        Boolean didPrint = false;
        for (int i = 0; i < tickets.size() - 1; ++i) {
            if (tickets.get(i).getRow() == tickets.get(i + 1).getRow()
                && tickets.get(i).getBoardingGroup() == tickets.get(i + 1).getBoardingGroup())
            {
                System.out.println(tickets.get(i).getName() + " can board with " + tickets.get(i + 1).getName() + '.');
                didPrint = true;
            }
        }

        if (!didPrint) {
            System.out.println("There are no passengers with the same row and boarding group.");
        }
    }

    private void sort(ArrayList<AirlineTicket> tickets) {
        for (int i = 0; i < tickets.size() - 1; ++i) {
            for (int j = 0; j < tickets.size() - i - 1; ++j) {
                if (tickets.get(j).getBoardingGroup() > tickets.get(j + 1).getBoardingGroup()) {
                    tickets.add(j, tickets.get(j + 1));
                    tickets.remove(j + 1);
                }
            }
        }
    }
}
