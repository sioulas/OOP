import java.util.Random;

class Stathero extends Tilefono {

    public Stathero(String arithmos) {
        super(arithmos);
    }

    @Override
    public void dial(String arithmosProorismou) {
        Random rand = new Random();
        int diarkeiaKlishs = rand.nextInt(596) + 5;  // τυχαία διάρκεια 5-600
        System.out.println("Κλήση από το σταθερό τηλέφωνο " + arithmos + " προς το " +
                (arithmosProorismou.startsWith("2") ? "σταθερό" : "κινητό") + " με αριθμό " + arithmosProorismou);

        if (arithmosProorismou.startsWith("2")) {
            synolikaLeptaProsStathera += diarkeiaKlishs;
        } else {
            synolikaLeptaProsKinita += diarkeiaKlishs;
        }
    }

    @Override
    public double cost(boolean prosKinita) {
        if (prosKinita) {
            return synolikaLeptaProsKinita * 0.05;
        } else {
            return synolikaLeptaProsStathera * 0.02;
        }
    }
}