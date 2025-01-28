package ToursAndTravels;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoraTours {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to Dora Tours!");
            System.out.println("1. Book a Flight");
            System.out.println("2. Book a Hotel");
            System.out.println("3. Book a Bus");
            System.out.println("4. Discover Places");
            System.out.println("5. About Us");
            System.out.println("6. Contact Us");
            System.out.println("7. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookFlight(scanner);
                    break;
                case 2:
                    bookHotel(scanner);
                    break;
                case 3:
                    bookBus(scanner);
                    break;
                case 4:
                    discoverPlaces();
                    break;
                case 5:
                    aboutUs();
                    break;
                case 6:
                    contactUs();
                    break;
                case 7:
                    System.out.println("Thank you for using Dora Tours. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void bookFlight(Scanner scanner) {
        System.out.println("\n--- Book a Flight ---");
        System.out.print("Enter your destination: ");
        String destination = scanner.next();
        System.out.print("Enter the number of tickets: ");
        int tickets = scanner.nextInt();
        System.out.println("Flight booked to " + destination + " for " + tickets + " passengers.");
    }

    private static void bookHotel(Scanner scanner) {
        System.out.println("\n--- Book a Hotel ---");
        System.out.print("Enter the city: ");
        String city = scanner.next();
        System.out.print("Enter the number of rooms: ");
        int rooms = scanner.nextInt();
        System.out.println("Hotel booked in " + city + " with " + rooms + " rooms.");
    }

    private static void bookBus(Scanner scanner) {
        System.out.println("\n--- Book a Bus ---");
        System.out.print("Enter your destination: ");
        String destination = scanner.next();
        System.out.print("Enter the number of tickets: ");
        int tickets = scanner.nextInt();
        System.out.println("Bus booked to " + destination + " for " + tickets + " passengers.");
    }

    private static void discoverPlaces() {
        System.out.println("\n--- Discover Places ---");
        List<String> places = new ArrayList<>();
        places.add("1. Paris - The City of Light");
        places.add("2. Tokyo - A Blend of Tradition and Futurism");
        places.add("3. New York - The Big Apple");
        places.add("4. Sydney - The Harbour City");

        for (String place : places) {
            System.out.println(place);
        }
    }

    private static void aboutUs() {
        System.out.println("\n--- About Us ---");
        System.out.println("Dora Tours is your trusted travel partner. We specialize in offering the best travel experiences," +
                " including flights, hotels, buses, and amazing destinations.");
    }

    private static void contactUs() {
        System.out.println("\n--- Contact Us ---");
        System.out.println("If you have any questions or need support, feel free to reach out:");
        System.out.println("Phone: +256 456 7890");
        System.out.println("Email: support@doratours.com");
    }
}

