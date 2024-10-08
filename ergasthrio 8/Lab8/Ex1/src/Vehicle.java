public abstract class Vehicle {

    String idioktitis;
    String arKykloforias;
    int etosKat;
    SystimaDieythynsis sysdief;
    Mihani eng;

    Vehicle(String idioktitis, String arKykloforias, int etosKat, SystimaDieythynsis sysdief, Mihani eng) {
        this.idioktitis = idioktitis;
        this.arKykloforias = arKykloforias;
        this.etosKat = etosKat;
        this.sysdief = sysdief;
        this.eng = eng;
    }

    public String getIdioktitis() {
        return idioktitis;
    }

    public String getArKykloforias() {
        return arKykloforias;
    }

    public int getEtosKat() {
        return etosKat;
    }

    public void setEtosKat(int etosKat) {
        this.etosKat = etosKat;
    }

    public SystimaDieythynsis getSysdief() {
        return sysdief;
    }

    public void setSysdief(SystimaDieythynsis sysdief) {
        this.sysdief = sysdief;
    }

    public Mihani getEng() {
        return eng;
    }

    public void setEng(Mihani eng) {
        this.eng = eng;
    }

    void setIdioktitis(String idioktitis) {
        this.idioktitis = idioktitis;
    }

    void setArKykloforias(String arKykloforias) {
        this.arKykloforias = arKykloforias;
    }

    void displayInfo() {
        System.out.println("Ιδιοκτήτης: " + idioktitis);
        System.out.println("Αριθμός Κυκλοφορίας: " + arKykloforias);
        System.out.println("Έτος Κατασκευής: " + etosKat);
        System.out.println("Κυβισμός Μηχανής: " + eng.kyvismos);
        System.out.println("Ιπποδύναμη: " + eng.ippodynami);
    }

    void startDrivingSequence() {
        sysdief.vazeiEmpros();
        eng.leitourgia();
    }

    void turningOffSequence() {
        sysdief.svynei();
        eng.svysimo();
    }

    public void transferOwnership(String newOwner) {
        System.out.println("Ownership is transferred from " + this.idioktitis + " to " + newOwner);
        this.idioktitis = newOwner;
    }

    public abstract void drive();

}
