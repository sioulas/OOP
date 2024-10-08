package Lab4Exercise1;

public class MyUtils {
    public static int anazitisiMeEpwnymo(Student[] students, String eponimo) {
        for (int i = 0; i < students.length; i++)
            if (students[i].getLastName().equals(eponimo))
                return i;
        return -1;
    }
    public static int anazitisiMeArMitrwou(Student[] students, Short am) {
        int pos = -1, mid, start, end;
        start = 0;
        end = students.length -1;

        while ( pos == -1 && start <= end ) {
            mid = (start + end) / 2;

            if (students[mid].getStudentID() < am)
                start = mid + 1;
            else if (students[mid].getStudentID()  > am)
                end = mid - 1;
            else if (students[mid].getStudentID()  == am)
                pos = mid;
            else
                return -1;
        }

        return pos;
    }
    public static int anadromiAnazMeArithMitrwou(Student[] students, Short am, int start, int end) {
        if (start > end )
            return -1;

        int mid = (start + end) / 2;;

        if (students[mid].getStudentID() < am)
            return anadromiAnazMeArithMitrwou(students, am, mid + 1, end);
        else if (students[mid].getStudentID() > am)
            return anadromiAnazMeArithMitrwou(students, am, start, mid - 1);
        else
            return mid;
    }
}

