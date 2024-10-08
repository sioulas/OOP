package Lab4Exercise1;

public class TestMyUtils {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] students;
        students = new Student[10];
        int res , res2, res3;
        students[0] = new Student("Kwstas", "Sioulas", (short) 152, (short) 2019);
        students[1] = new Student("Kostas", "Smaragdas", (short) 153, (short) 2019);
        students[2] = new Student("Ioannis", "Xypteras", (short) 118, (short) 2019);
        students[3] = new Student("Faidwn", "Pappas", (short) 100, (short) 2024);
        students[4] = new Student("Stelios", "Tsilikis", (short) 105, (short) 2018);
        students[5] = new Student("Stelios", "Panagiotopoulos", (short) 123, (short) 2019);
        students[6] = new Student("Ioannis", "Sioulas", (short) 101, (short) 2019);
        students[7] = new Student("Loatkia", "Plus", (short) 666, (short) 2023);
        students[8] = new Student("Baggelhs", "Trelos", (short) 124, (short) 2000);
        students[9] = new Student("Mixalhs", "Trelos", (short) 123, (short) 2001);

        System.out.println("Search with Last name: ");

        res = MyUtils.anazitisiMeEpwnymo(students, UserInput.getString());
        System.out.println("Result: in position " + res);
        if (res != 1)
            System.out.println(students[res]);
        else
            System.out.println("Student not found");

        System.out.println("Search with AM: ");

        res2 = MyUtils.anazitisiMeArMitrwou(students, UserInput.getShort());
        System.out.println("Result: in position " + res2);
        if (res2 != 1)
            System.out.println(students[res2]);
        else
            System.out.println("Student not found");

        System.out.println("Search with Binary AM: ");

        res3 = MyUtils.anadromiAnazMeArithMitrwou(students, UserInput.getShort(), 0, students.length - 1);
        System.out.println("Result: in position " + res3);
        if (res3 != 1)
            System.out.println(students[res3]);
        else
            System.out.println("Student not found");

        System.out.println();
    }



}

