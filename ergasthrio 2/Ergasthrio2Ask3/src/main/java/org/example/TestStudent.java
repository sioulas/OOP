package org.example;

public class TestStudent {
    public static void main(String[] args) {
        Student[] lab;
        System.out.print("Give size of table: ");
        lab = new Student[UserInput.getInteger()];
        insertStudent(lab);
        displayLab(lab);
        passed(lab);
        System.out.println("The average grade of the lab is: " + avgStudents(lab));
        System.out.println("The best student of the lab is: \n" + bestStudent(lab));
    }

    public static void insertStudent(Student[] lab){
        for(int i=0;i<lab.length;i++){
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
            lab[i] = new Student(studentAM, firstName, lastName, absences, labGrade, theoryGrade);
        }
    }

    public static void displayLab(Student[] lab){
        for(int i=0;i<lab.length;i++){
            System.out.println("Ta stoixeia tou foithth einai: \n" + lab[i]);
        }
    }
    public static void passed(Student[] lab){
        for(int i=0;i<lab.length;i++){
            double finalGrade = lab[i].computeFinal(); // Call computeFinal() for the current student
            if(finalGrade > 5){
                System.out.println("Student " + lab[i].getFirstName() + " " + lab[i].getLastName() + " has passed.");
            } else {
                System.out.println("Student " + lab[i].getFirstName() + " " + lab[i].getLastName() + " has not passed.");
            }
        }
    }

    public static double avgStudents(Student[] lab){
        double sum = 0;
        int k = 0;
        for(int i=0;i<lab.length;i++){
            double finalGrade = lab[i].computeFinal();
            sum = sum+finalGrade;
            k = k+1;
        }
        return sum / k;
    }

    public static int bestStudent(Student[] lab){
        int max=0;
        for(int i=0;i<lab.length;i++){
            double finalGrade = lab[i].computeFinal();
            if(finalGrade > max){
               max=i;
            }
        }
        return max;
    }
}