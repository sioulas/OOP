package erg2ask2;

public class TestEmployee {

    public static void main(String[] args){
        Employee[] staff;
        System.out.println("Give the size of the staff: " );
        staff = new Employee[UserInput.getInteger()];
        for(int i = 0;i< staff.length;i++){
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
            staff[i]=new Employee(employeeAM, firstName, lastName, misthos, years, bonus);
        }
        displayStaff(staff);
    }

    public static void displayStaff(Employee[] staff){
        for(int i=0;i<staff.length;i++){
            System.out.println("The staff's info is: \n" + staff[i]);
            System.out.println("The final salary of this staff member is: " + staff[i].finalSalary());
        }
    }

}
