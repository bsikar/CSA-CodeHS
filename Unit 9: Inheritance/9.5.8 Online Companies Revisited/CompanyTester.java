import java.util.*;

public class CompanyTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Company> array = new ArrayList<Company>();

        for (;;) {
            System.out.print("Please enter a company name, enter 'exit' to quit: ");
            String name = input.nextLine();

            if (name.equals("exit")) {
                break;
            }

            System.out.print("Is this an online company, 'yes' or 'no': ");
            String isOnline = input.nextLine();

            if (isOnline.equals("yes")) {
                System.out.print("Please enter the website address: ");
                String webAddress = input.nextLine();

                array.add(new OnlineCompany(name, webAddress));
            } else {
                System.out.print("Please enter the street address: ");
                String address = input.nextLine();

                System.out.print("Please enter the city address: ");
                String city = input.nextLine();

                System.out.print("Please enter the state address: ");
                String state = input.nextLine();

                array.add(new Company(name, address, city, state));
            }
        }

        for (Company company : array) {
            System.out.println(company);
        }
    }
}

