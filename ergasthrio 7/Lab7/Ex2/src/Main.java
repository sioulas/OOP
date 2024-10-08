public class Main {

    public static void main(String[] args) {

        Employee emp1 = new HourlyEmployee("John Doe", 101, "Engineer", 20.0, 160, 10);
        emp1.calculateSalary();
        System.out.println(emp1);

        Employee emp2 = new Manager("Jane Smith", 102, "Manager", 5000, 15);
        emp2.calculateSalary();
        System.out.println(emp2);
    }
}
