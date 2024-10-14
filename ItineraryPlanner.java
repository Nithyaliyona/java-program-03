import java.util.*;

class TravelItinerary {
    private String destination;
    private String startDate;
    private String endDate;
    private List<String> preferences;
    private double budget;

    public TravelItinerary(String destination, String startDate, String endDate, List<String> preferences, double budget) {
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.preferences = preferences;
        this.budget = budget;
    }

    public void displayItinerary() {
        System.out.println("=== Travel Itinerary ===");
        System.out.println("Destination: " + destination);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Preferences: " + String.join(", ", preferences));
        System.out.println("Budget: $" + budget);
        System.out.println("========================");
    }
}

public class ItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();

        System.out.print("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();

        System.out.print("Enter preferences (comma-separated): ");
        String[] prefsArray = scanner.nextLine().split(",");
        List<String> preferences = new ArrayList<>();
        for (String pref : prefsArray) {
            preferences.add(pref.trim());
        }

        System.out.print("Enter budget: $");
        double budget = scanner.nextDouble();

        TravelItinerary itinerary = new TravelItinerary(destination, startDate, endDate, preferences, budget);
        itinerary.displayItinerary();

        
    }
}


                