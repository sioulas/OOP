public abstract class Tilefono {

    protected String arithmos;
    protected int synolikaLeptaProsStathera;
    protected int synolikaLeptaProsKinita;

    public Tilefono(String arithmos) {
        this.arithmos = arithmos;
        this.synolikaLeptaProsStathera = 0;
        this.synolikaLeptaProsKinita = 0;
    }

    public abstract void dial(String arithmosProorismou);

    public abstract double cost(boolean prosKinita);

    public String getArithmos() {
        return arithmos;
    }

    public int getSynolikaLeptaProsStathera() {
        return synolikaLeptaProsStathera;
    }

    public int getSynolikaLeptaProsKinita() {
        return synolikaLeptaProsKinita;
    }
}