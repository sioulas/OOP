import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int N;
        if (args.length > 0) {
            N = Integer.parseInt(args[0]);
        } else {
            System.out.print("Enter the number of vehicles: ");
            N = scanner.nextInt();
        }
        List<Vehicle> vehicles = new ArrayList<>();

        Random rand = new Random();

        int numCars = (int) (N * 0.70);
        int numTrucks = (int) (N * 0.15) + 1;
        int numMotorcycles = N - numCars - numTrucks;


        for (int j = 0; j < numCars; j++) {
            System.out.print("Enter owner for Car " + (j + 1) + ": ");
            String idioktitis = scanner.next();
            System.out.print("Enter license plate for Car " + (j + 1) + ": ");
            String arKykloforias = scanner.next();
            System.out.print("Enter year for Car " + (j + 1) + ": ");
            int etosKat = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter number of doors for Car " + (j + 1) + ": ");
            int portes = scanner.nextInt();
            scanner.nextLine();
            int randomPosition = random.nextInt(vehicles.size() + 1);
            vehicles.add(randomPosition, new Car(idioktitis, arKykloforias, etosKat, null, null, portes));
        }

        for (int j = 0; j < numTrucks; j++) {
            System.out.print("Enter owner for Truck " + (j + 1) + ": ");
            String idioktitis = scanner.next();
            System.out.print("Enter license plate for Truck " + (j + 1) + ": ");
            String arKykloforias = scanner.next();
            System.out.print("Enter year for Truck " + (j + 1) + ": ");
            int etosKat = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter number of axles for Truck " + (j + 1) + ": ");
            int axones = scanner.nextInt();
            scanner.nextLine();
            int randomPosition = random.nextInt(vehicles.size() + 1);
            vehicles.add(randomPosition, new Truck(idioktitis, arKykloforias, etosKat, null, null, axones));
        }
        for (int j = 0; j < numMotorcycles; j++) {
            System.out.print("Enter owner for Motorcycle " + (j + 1) + ": ");
            String idioktitis = scanner.next();
            System.out.print("Enter license plate for Motorcycle " + (j + 1) + ": ");
            String arKykloforias = scanner.next();
            System.out.print("Enter year for Motorcycle " + (j + 1) + ": ");
            int etosKat = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Does Motorcycle " + (j + 1) + " have extra features (true/false): ");
            boolean extra = scanner.nextBoolean();
            scanner.nextLine();
            int randomPosition = random.nextInt(vehicles.size() + 1);
            vehicles.add(randomPosition, new Motorcycle(idioktitis, arKykloforias, etosKat, null, null, extra));
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() + " owned by " + vehicle.getIdioktitis());
            vehicle.drive();
        }
    }


}