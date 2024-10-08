public class Bird implements iBird {
    private int age;
    private double weight;

    public Bird(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void chirp() {
        System.out.println("chirp...");
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public String toString() {
        return "Bird [age=" + age + ", weight=" + weight + "]";
    }
}