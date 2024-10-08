import java.util.ArrayList;
import java.util.Scanner;

public class ArtGallery {
    private static ArrayList<ProsPolisi> ergaProsPolisi = new ArrayList<>();
    private static ArrayList<AgoraParadosi> ergaProsMetafora = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Enter work of art");
            System.out.println("2. Prepare work of art for delivery");
            System.out.println("3. Deliver work of art");
            System.out.println("4. Display all available photographs");
            System.out.println("5. Display all available paintings");
            System.out.println("6. Display all available works of art");
            System.out.println("7. Display all works of art to be delivered");
            System.out.println("8. End program");
            System.out.print("Enter selection (1-8): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    enterWorkOfArt(scanner);
                    break;
                case 2:
                    prepareWorkOfArtForDelivery(scanner);
                    break;
                case 3:
                    deliverWorkOfArt(scanner);
                    break;
                case 4:
                    displayPhotographs();
                    break;
                case 5:
                    displayPaintings();
                    break;
                case 6:
                    displayAllWorksOfArt();
                    break;
                case 7:
                    displayWorksOfArtToBeDelivered();
                    break;
                case 8:
                    System.out.println("Program ended.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    private static void enterWorkOfArt(Scanner scanner) {
        if (ergaProsPolisi.size() >= 10) {
            System.out.println("The catalog is full. Cannot add more works of art.");
            return;
        }

        System.out.println("Enter type of work of art (Photograph/Painting): ");
        String type = scanner.nextLine();

        System.out.println("Enter description: ");
        String description = scanner.nextLine();

        System.out.println("Enter price: ");
        int price = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (type.equalsIgnoreCase("Photograph")) {
            System.out.println("Is it in color? (true/false): ");
            boolean isColor = scanner.nextBoolean();
            scanner.nextLine(); // Consume newline

            Photograph photograph = new Photograph(description, price, isColor);
            ergaProsPolisi.add(photograph);
        } else if (type.equalsIgnoreCase("Painting")) {
            System.out.println("Enter technique: ");
            String technique = scanner.nextLine();

            Painting painting = new Painting(description, price, technique);
            ergaProsPolisi.add(painting);
        } else {
            System.out.println("Invalid type. Work of art not added.");
        }
    }

    private static void prepareWorkOfArtForDelivery(Scanner scanner) {
        if (ergaProsPolisi.isEmpty()) {
            System.out.println("No works of art available for delivery.");
            return;
        }

        System.out.println("Select work of art to prepare for delivery (0 to " + (ergaProsPolisi.size() - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index < 0 || index >= ergaProsPolisi.size()) {
            System.out.println("Invalid selection.");
            return;
        }

        ProsPolisi artwork = ergaProsPolisi.get(index);
        System.out.println("Is it fragile? (true/false): ");
        boolean isFragile = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter weight (grams): ");
        int weight = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        AgoraParadosi delivery = new AgoraParadosi(artwork, isFragile, weight);
        ergaProsMetafora.add(delivery);
        System.out.println("Work of art prepared for delivery.");
    }

    private static void deliverWorkOfArt(Scanner scanner) {
        if (ergaProsMetafora.isEmpty()) {
            System.out.println("No works of art available for delivery.");
            return;
        }

        System.out.println("Select work of art to deliver (0 to " + (ergaProsMetafora.size() - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index < 0 || index >= ergaProsMetafora.size()) {
            System.out.println("Invalid selection.");
            return;
        }

        ergaProsMetafora.remove(index);
        System.out.println("Work of art delivered.");
    }

    private static void displayPhotographs() {
        for (ProsPolisi artwork : ergaProsPolisi) {
            if (artwork instanceof Photograph) {
                System.out.println(artwork.getDescription() + ", Price: " + artwork.getCatalogPrice());
            }
        }
    }

    private static void displayPaintings() {
        for (ProsPolisi artwork : ergaProsPolisi) {
            if (artwork instanceof Painting) {
                System.out.println(artwork.getDescription() + ", Price: " + artwork.getCatalogPrice());
            }
        }
    }

    private static void displayAllWorksOfArt() {
        for (ProsPolisi artwork : ergaProsPolisi) {
            System.out.println(artwork.getDescription() + ", Price: " + artwork.getCatalogPrice());
        }
    }

    private static void displayWorksOfArtToBeDelivered() {
        for (AgoraParadosi delivery : ergaProsMetafora) {
            ProsPolisi artwork = delivery.getArtwork();
            System.out.println("Artwork: " + artwork.getDescription() + ", Insurance Amount: " + delivery.getInsuranceAmount());
        }
    }
}

