package Lab6;

public class Student {
    private String firstName;
    private String lastName;
    private short studentID;
    private short startingYear;

    Student(String firstName,String lastName, short studentID, short startingYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.startingYear = startingYear;
    }
    Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStartingYear(short startingYear) {
        this.startingYear = startingYear;
    }

    public void setStudentID(short studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public short getStartingYear() {
        return startingYear;
    }

    public short getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", studentID=" + studentID + ", startingYear=" + startingYear + '}';
    }

}