import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Εισάγετε τον αριθμό των τηλεφώνων: ");
        int N = scanner.nextInt();
        List<Tilefono> tilefona = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (rand.nextDouble() < 0.6) {
                tilefona.add(new Stathero("2" + String.format("%09d", rand.nextInt(1000000000))));
            } else {
                tilefona.add(new Kinito("6" + String.format("%09d", rand.nextInt(1000000000))));
            }
        }

        int F = rand.nextInt(1901) + 100;  // τυχαία τιμή 100-2000
        for (int i = 0; i < F; i++) {
            Tilefono apo = tilefona.get(rand.nextInt(N));
            String prosArithmos = (rand.nextDouble() < 0.5 ? "2" : "6") + String.format("%09d", rand.nextInt(1000000000));
            apo.dial(prosArithmos);
        }

        double synoloKostosStathera = 0;
        double synoloKostosKinita = 0;
        int synolikaLeptaApoStathera = 0;
        int synolikaLeptaApoKinita = 0;

        for (Tilefono tilefono : tilefona) {
            System.out.println("Τηλέφωνο: " + tilefono.getArithmos() +
                    " | Κόστος προς σταθερά: " + tilefono.cost(false) +
                    " | Κόστος προς κινητά: " + tilefono.cost(true));

            if (tilefono instanceof Stathero) {
                synolikaLeptaApoStathera += tilefono.getSynolikaLeptaProsStathera();
                synolikaLeptaApoStathera += tilefono.getSynolikaLeptaProsKinita();
                synoloKostosStathera += tilefono.cost(false);
                synoloKostosStathera += tilefono.cost(true);
            } else if (tilefono instanceof Kinito) {
                synolikaLeptaApoKinita += tilefono.getSynolikaLeptaProsStathera();
                synolikaLeptaApoKinita += tilefono.getSynolikaLeptaProsKinita();
                synoloKostosKinita += tilefono.cost(false);
                synoloKostosKinita += tilefono.cost(true);
            }
        }

        System.out.println("Συνολικά λεπτά από σταθερά: " + synolikaLeptaApoStathera);
        System.out.println("Συνολικό κόστος από σταθερά: " + synoloKostosStathera);
        System.out.println("Συνολικά λεπτά από κινητά: " + synolikaLeptaApoKinita);
        System.out.println("Συνολικό κόστος από κινητά: " + synoloKostosKinita);
        System.out.println("Συνολικό κόστος όλων των κλήσεων: " + (synoloKostosStathera + synoloKostosKinita));
    }
}