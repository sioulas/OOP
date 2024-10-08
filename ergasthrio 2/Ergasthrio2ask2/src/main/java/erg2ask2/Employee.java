package erg2ask2;

public class Employee {
    private int employeeAM;
    private String firstName;
    private String lastName;
    private double salary;
    private int years;
    private double bonus;

    // Constructor
    public Employee(int employeeAM, String firstName, String lastName, double salary, int years, double bonus) {
        this.employeeAM = employeeAM;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.years = years;
        this.bonus = bonus;
    }

    // Setters
    public void setEmployeeAM(int employeeAM) {
        this.employeeAM = employeeAM;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Getters
    public int getEmployeeAM() {
        return employeeAM;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getYears() {
        return years;
    }

    public double getBonus() {
        return bonus;
    }

    public double finalSalary(){
        return salary + years*10 + bonus;
    }
    @Override
    public String toString() {
        return "Employee: " + employeeAM + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Salary: " + salary + "\n" +
                "Years: " + years + "\n" +
                "Bonus: " + bonus + "\n" +
                "Final Salary: " + finalSalary();
    }

}
