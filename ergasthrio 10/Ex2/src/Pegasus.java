public class Pegasus extends Horse implements iBird {

    public Pegasus(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void chirp() {
        // Pegasus does not chirp
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public void whinny() {
        System.out.println("whinny");
    }

    @Override
    public void gallop() {
        System.out.println("travel fast");
    }

    @Override
    public String toString() {
        return "Pegasus [age=" + super.age + ", weight=" + super.weight + "]";
    }
}