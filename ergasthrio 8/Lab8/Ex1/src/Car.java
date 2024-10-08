public class Car extends Vehicle{

    private int portes;

    public int getPortes() {
        return portes;
    }

    public void setPortes(int portes) {
        this.portes = portes;
    }

    public Car(String idioktitis, String arKykloforias, int etosKat, SystimaDieythynsis sysdief, Mihani eng, int portes) {
        super(idioktitis, arKykloforias, etosKat, sysdief, eng);
        this.portes = portes;
    }


    @Override
    public void drive() {
        System.out.println("You need a car driving license dear " + getIdioktitis());
    }
}
