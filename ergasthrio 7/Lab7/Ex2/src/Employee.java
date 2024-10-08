public abstract class Employee {

    protected String name;
    protected int id;
    protected String specialty;
    protected double salary;

    public Employee(String name, int id, String specialty, double salary) {
        this.name = name;
        this.id = id;
        this.specialty = specialty;
        this.salary = salary;
    }

    public abstract void calculateSalary();

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Specialty: " + specialty + ", Salary: " + salary;
    }
}
