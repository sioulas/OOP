import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Δημιουργία πίνακα Ranch
        Horse[] ranch = new Horse[10];
        fillRanch(ranch);

        // Δημιουργία πίνακα Aviary
        iBird[] aviary = new iBird[10];
        fillAviary(aviary);

        // Εμφάνιση των αντικειμένων του Ranch
        for (Horse h : ranch) {
            System.out.println(h);
            h.whinny();
            h.gallop();
            if (h instanceof Pegasus) {
                ((Pegasus) h).fly();
            }
        }

        // Εμφάνιση των αντικειμένων του Aviary
        for (iBird b : aviary) {
            System.out.println(b);
            b.chirp();
            b.fly();
        }
    }

    public static void fillRanch(Horse[] ranch) {
        Random random = new Random();
        for (int i = 0; i < ranch.length; i++) {
            if (random.nextBoolean()) {
                ranch[i] = new Horse(random.nextInt(10) + 1, random.nextDouble() * 100);
            } else {
                ranch[i] = new Pegasus(random.nextInt(10) + 1, random.nextDouble() * 100);
            }
        }
    }

    public static void fillAviary(iBird[] aviary) {
        Random random = new Random();
        for (int i = 0; i < aviary.length; i++) {
            if (random.nextBoolean()) {
                aviary[i] = new Bird(random.nextInt(10) + 1, random.nextDouble() * 10);
            } else {
                aviary[i] = new Pegasus(random.nextInt(10) + 1, random.nextDouble() * 100);
            }
        }
    }
}
