import java.util.Random;

class Kinito extends Tilefono {

    public Kinito(String arithmos) {
        super(arithmos);
    }

    @Override
    public void dial(String arithmosProorismou) {
        Random rand = new Random();
        int diarkeiaKlishs = rand.nextInt(596) + 5;  // τυχαία διάρκεια 5-600
        System.out.println("Κλήση από το κινητό τηλέφωνο " + arithmos + " προς το " +
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
            return synolikaLeptaProsKinita * 0.07;
        } else {
            return synolikaLeptaProsStathera * 0.06;
        }
    }
}
