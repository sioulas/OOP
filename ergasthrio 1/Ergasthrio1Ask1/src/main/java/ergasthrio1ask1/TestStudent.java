
package ergasthrio1ask1;


public class TestStudent {


    public static void main(String[] args) {
        System.out.print("Dwse AM : ");
        int studentAM= UserInput.getInteger();
        System.out.print("Dwse Onoma : ");
        String firstName= UserInput.getString();
        System.out.print("Dwse Epwnymo : ");
        String lastName= UserInput.getString();
        System.out.print("Dwse Apousies : ");
        int absences= UserInput.getInteger();
        System.out.print("Dwse Bathmo Ergasthriou : ");
        double labGrade= UserInput.getDouble();
        System.out.print("Dwse Bathmo Thewrias : ");
        double theoryGrade= UserInput.getDouble();
        Student s1=new Student(studentAM, firstName, lastName, absences, labGrade, theoryGrade);
        System.out.print("Dwse AM : ");
        int studentAM2= UserInput.getInteger();
        System.out.print("Dwse Onoma : ");
        String firstName2= UserInput.getString();
        System.out.print("Dwse Epwnymo : ");
        String lastName2= UserInput.getString();
        System.out.print("Dwse Apousies : ");
        int absences2= UserInput.getInteger();
        System.out.print("Dwse Bathmo Ergasthriou : ");
        double labGrade2= UserInput.getDouble();
        System.out.print("Dwse Bathmo Thewrias : ");
        double theoryGrade2= UserInput.getDouble();
        Student s2=new Student(studentAM2, firstName2, lastName2, absences2, labGrade2, theoryGrade2);
        System.out.print("Dwse AM : ");
        int studentAM3= UserInput.getInteger();
        System.out.print("Dwse Onoma : ");
        String firstName3= UserInput.getString();
        System.out.print("Dwse Epwnymo : ");
        String lastName3= UserInput.getString();
        System.out.print("Dwse Apousies : ");
        int absences3= UserInput.getInteger();
        System.out.print("Dwse Bathmo Ergasthriou : ");
        double labGrade3= UserInput.getDouble();
        System.out.print("Dwse Bathmo Thewrias : ");
        double theoryGrade3= UserInput.getDouble();
        Student s3=new Student(studentAM3, firstName3, lastName3, absences3, labGrade3, theoryGrade3);

        System.out.println("\nFirst Student Details:");
        System.out.println(s1);
        System.out.println("\nSecond Student Details:");
        System.out.println(s2);
        System.out.println("\nThird Student Details:");
        System.out.println(s3);
        compareThreeStudentMarks(s1,s2,s3);

    }
    public static void compareThreeStudentMarks(Student s1, Student s2, Student s3) {
        double finalGrade1 = s1.computeFinal();
        double finalGrade2 = s2.computeFinal();
        double finalGrade3 = s3.computeFinal();

        double max = Math.max(finalGrade1, Math.max(finalGrade2, finalGrade3));
        double min = Math.min(finalGrade1, Math.min(finalGrade2, finalGrade3));
        double middle = finalGrade1 + finalGrade2 + finalGrade3 - max - min;

        System.out.println("1) " + max);
        System.out.println("2) " + middle);
        System.out.println("3) " + min);
    }
}
    

