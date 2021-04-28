import java.util.Scanner;

public class HowFarAway {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the latitude of the starting location: ");
        Double latStart = input.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        Double lonStart = input.nextDouble();
        GeoLocation start = new GeoLocation(latStart, lonStart);

        System.out.print("Enter the latitude of the ending location: ");
        Double latStop = input.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        Double lonStop = input.nextDouble();
        GeoLocation stop = new GeoLocation(latStop, lonStop);
        System.out.print("The distance is " + start.distanceFrom(stop) + " miles.");
    }
}
