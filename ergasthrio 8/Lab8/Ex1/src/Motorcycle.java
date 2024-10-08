public class Motorcycle extends Vehicle {

    private boolean extra;

    public Motorcycle(String idioktitis, String arKykloforias, int etosKat, SystimaDieythynsis sysdief, Mihani eng, boolean extra) {
        super(idioktitis, arKykloforias, etosKat, sysdief, eng);
        this.extra = extra;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    @Override
    public void drive() {
        System.out.println("Your car driving license is not enough. You need a special license dear " + getIdioktitis());
    }

}
