public class Truck  extends Vehicle {

    private int axones;

    public Truck(String idioktitis, String arKykloforias, int etosKat, SystimaDieythynsis sysdief, Mihani eng, int axones) {
        super(idioktitis, arKykloforias, etosKat, sysdief, eng);
        this.axones = axones;
    }

    public int getAxones() {
        return axones;
    }

    public void setAxones(int axones) {
        this.axones = axones;
    }

    @Override
    public void drive() {
        System.out.println("You must be a professional driver. This is a " + axones + " axles truck Mr. " + getIdioktitis());
    }
}
