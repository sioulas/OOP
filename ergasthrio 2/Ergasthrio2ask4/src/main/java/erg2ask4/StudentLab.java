package erg2ask4;

public class StudentLab {
    private Student[] student;
    private int pointer = 0;



    StudentLab(Student[] student) {
        int i = 0;
        this.student = student;

        while ( i < student.length) i++;

        if (student[0] == null) {
            pointer = 0;
        } else if (i == student.length) {
            pointer = student.length;
        } else {
            pointer++;
        }
    }

    public void passed() {
        int counter = 0;

        for (int i = 0; i < student.length; i++)
            if ((student[i].getLabGrade() + student[i].getTheoryGrade()) >= 5)
                counter++;

        System.out.println("Passed: " + counter);
    }

    public void avgStudents() {
        int avg = 0;

        for (int i = 0; i < student.length; i++)
            avg+= (student[i].getLabGrade() + student[i].getTheoryGrade());

        System.out.println("Avg: " + avg / (student.length + 1));
    }

    public int bestStudent() {
        int max = 0;

        for (int i = 0; i < student.length; i++)
            if (max > (student[i].getLabGrade() + student[i].getTheoryGrade()))
                max = i;

        return max;
    }

}
