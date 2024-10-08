public class Manager extends SalariedEmployee {

    private double performanceBonus;

    public Manager(String name, int id, String specialty, double baseSalary, double performanceBonus) {

        super(name, id, specialty, baseSalary);
        this.performanceBonus = performanceBonus;
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary(); // Βασικός μισθός από τον SalariedEmployee
        this.salary += this.salary * performanceBonus / 100; // Προσθήκη μπόνους απόδοσης
    }
}
