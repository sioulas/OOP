package Lab6;


public class TestMyUtils {

    public static void main(String[] args) {

        Student[] students;
        students = new Student[7];
        students[0] = new Student("Kwstas", "Sioulas");
        System.out.println("AM:");
        students[0].setStudentID(UserInput.getShort());
        System.out.println("Etos:");
        students[0].setStartingYear(UserInput.getShort());

        students[1] = new Student("Nikos", "Smaragdas");
        System.out.println("AM:");
        students[1].setStudentID(UserInput.getShort());
        System.out.println("Etos:");
        students[1].setStartingYear(UserInput.getShort());

        students[2] = new Student("Ioannis", "Xypteras");
        System.out.println("AM:");
        students[2].setStudentID(UserInput.getShort());
        System.out.println("Etos:");
        students[2].setStartingYear(UserInput.getShort());

        students[3] = new Student("Stelios", "Panagiotopoulos");
        System.out.println("AM:");
        students[3].setStudentID(UserInput.getShort());
        System.out.println("Etos:");
        students[3].setStartingYear(UserInput.getShort());

        students[4] = new Student("Faidwn", "Pappas");
        System.out.println("AM:");
        students[4].setStudentID(UserInput.getShort());
        System.out.println("Etos:");
        students[4].setStartingYear(UserInput.getShort());

        students[5] = new Student("Alexandros", "Oikonomou");
        System.out.println("AM:");
        students[5].setStudentID(UserInput.getShort());
        System.out.println("Etos:");
        students[5].setStartingYear(UserInput.getShort());

        students[6] = new Student("Stelios", "Tsilikis");
        System.out.println("AM:");
        students[6].setStudentID(UserInput.getShort());
        System.out.println("Etos:");
        students[6].setStartingYear(UserInput.getShort());

        System.out.println("Quick Sort");
        MyUtils.sort(students);
        System.out.println("Merge Sort");
        MyUtils.mergeSortEponymo(students);

    }
}
