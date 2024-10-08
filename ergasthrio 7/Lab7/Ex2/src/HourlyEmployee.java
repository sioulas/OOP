public class HourlyEmployee extends Employee {

    private int hoursWorked;
    private double productivityBonus;

    public HourlyEmployee(String name, int id, String specialty, double salary, int hoursWorked, double productivityBonus) {

        super(name, id, specialty, salary);
        this.hoursWorked = hoursWorked;
        this.productivityBonus = productivityBonus;
    }

    @Override
    public void calculateSalary() {
        this.salary = (salary * hoursWorked) * (1 + productivityBonus / 100);
    }
}