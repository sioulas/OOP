package erg2ask4;

public class TestStudentLab {

    public static void main(String[] args) {
        Student[] st;

        System.out.print("Give number of Students: ");
        st = new Student[UserInput.getInteger()];

        for (int i = 0; i < st.length; i++) {
            System.out.println(i +" foithths");
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
            st[i] = new Student(studentAM, firstName, lastName, absences, labGrade, theoryGrade);
        }

        StudentLab lab = new StudentLab(st);
        lab.avgStudents();
        lab.passed();
        System.out.println(st[lab.bestStudent()]);
    }
}
