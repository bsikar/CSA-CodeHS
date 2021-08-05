import java.util.ArrayList;

public class RoadTrip {
    private ArrayList<GeoLocation> stops;

    public RoadTrip() {
        stops = new ArrayList();
    }

    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude) {
        stops.add(new GeoLocation(name, latitude, longitude));
    }

    // Get the total number of stops in the trip
    public int getNumberOfStops() {
        return stops.size();
    }

    // Get the total miles of the trip
    public double getTripLength() {
        double distance = 0.;

        for (int i = 0; i < stops.size() - 1; ++i) {
            distance += stops.get(i).distanceFrom(stops.get(i + 1));
        }

        return distance;
    }

    // Return a formatted toString of the trip
    public String toString() {
        String string = new String();

        for (int i = 0; i < stops.size(); ++i) {
            string += i + 1 + ". " + stops.get(i).getName();
        }

        return string;
    }
}

