
package ergasthrio1ask1;

class Student {
    private int studentAM;
    private String firstName;
    private String lastName;
    private int absences;
    private double labGrade;
    private double theoryGrade;


    public Student(int studentID, String firstName, String lastName, int absences, double labGrade, double theoryGrade) {
        this.studentAM = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.absences = absences;
        this.labGrade = labGrade;
        this.theoryGrade = theoryGrade;
    }


    public int getStudentAM() {
        return studentAM;
    }

    public void setStudentAM(int studentAM) {
        this.studentAM = studentAM;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public double getLabGrade() {
        return labGrade;
    }

    public void setLabGrade(double labGrade) {
        this.labGrade = labGrade;
    }

    public double getTheoryGrade() {
        return theoryGrade;
    }

    public void setTheoryGrade(double theoryGrade) {
        this.theoryGrade = theoryGrade;
    }


    public double computeFinal() {
        return 0.3 * labGrade + 0.7 * theoryGrade;
    }


    @Override
    public String toString() {
        return "Student ID: " + studentAM + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Absences: " + absences + "\n" +
               "Lab Grade: " + labGrade + "\n" +
               "Theory Grade: " + theoryGrade + "\n" +
               "Final Grade: " + computeFinal();
    }
}
