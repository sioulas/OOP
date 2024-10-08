public class SalariedEmployee extends Employee {

    private double baseSalary;

    public SalariedEmployee(String name, int id, String specialty, double baseSalary) {

        super(name, id, specialty, baseSalary);
        this.baseSalary = baseSalary;
    }

    @Override
    public void calculateSalary() {
        this.salary = baseSalary; // Μπορεί να προστεθούν υπολογισμοί για προϋπηρεσία και παιδιά
    }
}
