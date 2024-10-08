public class Horse {
    int age;
    double weight;

    public Horse(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public void whinny() {
        System.out.println("whinny");
    }

    public void gallop() {
        System.out.println("travel fast");
    }

    @Override
    public String toString() {
        return "Horse [age=" + age + ", weight=" + weight + "]";
    }
}
