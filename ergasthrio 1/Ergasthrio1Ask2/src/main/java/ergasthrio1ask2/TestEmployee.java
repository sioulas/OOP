
package ergasthrio1ask2;



public class TestEmployee {

    public static void main(String[] args) {
        
        System.out.print("Dwse AM : ");
        int employeeAM= UserInput.getInteger();
        System.out.print("Dwse Onoma : ");
        String firstName= UserInput.getString();
        System.out.print("Dwse Epwnymo : ");
        String lastName= UserInput.getString();
        System.out.print("Dwse Basiko Mistho : ");
        double misthos= UserInput.getDouble();
        System.out.print("Dwse Xronia Apasxolhshs : ");
        int years= UserInput.getInteger();
        System.out.print("Dwse Bonus : ");
        double bonus= UserInput.getDouble();
        Employee e1=new Employee(employeeAM, firstName, lastName, misthos, years, bonus);
        System.out.print("Dwse AM : ");
        int employeeAM2= UserInput.getInteger();
        System.out.print("Dwse Onoma : ");
        String firstName2= UserInput.getString();
        System.out.print("Dwse Epwnymo : ");
        String lastName2= UserInput.getString();
        System.out.print("Dwse Basiko Mistho : ");
        double misthos2= UserInput.getDouble();
        System.out.print("Dwse Xronia Apasxolhshs : ");
        int years2= UserInput.getInteger();
        System.out.print("Dwse Bonus : ");
        double bonus2= UserInput.getDouble();
        Employee e2=new Employee(employeeAM2, firstName2, lastName2, misthos2, years2, bonus2);
        
        System.out.println();
        System.out.println(e1);
        System.out.println();
        System.out.println(e2);
        
        FindLowSalary(e1, e2);
    }
    
    public static void FindLowSalary(Employee e1, Employee e2) {

        if ((e1.getSalary() < 1200) && (e1.getYears() >= 5)) {
            e1.setSalary(e1.getSalary()+100);
            System.out.println("o " + e1.getLastName() + " einai xamilomisthos");
            System.out.println(e1);
        } else if ((e2.getSalary() < 1200) && (e2.getYears() >= 5)) {
            e2.setSalary(e2.getSalary()+100);
            System.out.println("o " + e2.getLastName() + " einai xamilomisthos");
            System.out.println(e2);
        }
        
    }
}
