package Lab5;

public class MyUtils {

    public static void insertSortStudentID(Student[] students){
        for(int i = 0 ; i < students.length ; i++){
            short current = students[i].getStudentID();
            int pos = 1;
            while((pos > 0) && (students[pos-1].getStudentID() > current)){
                students[pos].setStudentID(students[pos-1].getStudentID());
                pos--;
            }
            students[pos].setStudentID(current);
        }
        show(students, "Insertion Sort");
    }

    public static void selectSortLastName(Student[] students){
        int min;
        String temp;
        for(int i = 0; i < students.length; i++){
            min = i;
            for(int j = i+1; j < students.length; j++){
                if(students[j].getLastName().charAt(0) < students[min].getLastName().charAt(0)){
                    min = j;
                }
                temp = students[min].getLastName();
                students[min].setLastName(students[i].getLastName());
                students[i].setLastName(temp);
            }
        }
        show(students, "Selection Sort");
    }

    public static void bubbleSort(Student[] students) {
        int n = students.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getStartingYear() > students[j + 1].getStartingYear()) {
                    // Swap the elements
                    short temp = students[j].getStartingYear();
                    students[j].setStartingYear(students[j + 1].getStartingYear());
                    students[j + 1].setStartingYear(temp);
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped)
                break;
        }
        show(students, "Bubble Sort");
    }

    public static void show(Student[] students, String arg) {
        for (int i =0; i < students.length; i++)
            System.out.println(students[i] + " " + arg);
    }
}
