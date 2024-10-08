package Lab6;

public class MyUtils {

    public static void sort(Student[] students) {
        qSort(students, 0, students.length - 1);
        show(students, "Quick Sort");
    }

    public static void qSort(Student[] students, int f, int l) {
        if (f < l) {
            int pivIn = partition(students, f, l);
            qSort(students, f, pivIn - 1);
            qSort(students, pivIn + 1, l);
        }
    }

    public static int partition(Student[] students, int f, int l) {
        int pivot = students[(f + l) / 2].getStudentID();
        int i = f - 1;
        int j = l + 1;

        while (true) {
            do {
                i++;
            } while (students[i].getStudentID() < pivot);

            do {
                j--;
            } while (students[j].getStudentID() > pivot);

            if (i >= j) {
                return j;
            }
            swap(students, i, j);
        }
    }

    public static void swap(Student[] students, int f, int l) {
        short temp = students[f].getStudentID();
        students[f].setStudentID(students[l].getStudentID());
        students[l].setStudentID(temp);
    }

    public static void mergeSortEponymo(Student[] students) {
        mSort(students, 0, students.length - 1);
        show(students, "Merge Sort");
    }

    private static void mSort(Student[] students, int f, int l) {
        if (f < l) {
            int mid = (f + l) / 2;
            mSort(students, f, mid);
            mSort(students, mid + 1, l);
            merge(students, f, mid, l);
        }
    }

    private static void merge(Student[] students, int f, int mid, int l) {
        Student[] left = new Student[mid - f + 1];
        Student[] right = new Student[l - mid];

        // Copy data to temporary arrays
        for (int i = 0; i < left.length; i++)
            left[i] = students[f + i];
        for (int j = 0; j < right.length; j++)
            right[j] = students[mid + 1 + j];

        int i = 0, j = 0;

        int k = f;

        // Merging the temporary arrays back into the array st[]
        while (i < left.length && j < right.length) {
            if (left[i].getLastName().compareTo(right[j].getLastName()) <= 0) {
                students[k] = left[i];
                i++;
            } else {
                students[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left[], if any
        while (i < left.length) {
            students[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right[], if any
        while (j < right.length) {
            students[k] = right[j];
            j++;
            k++;
        }
    }



    public static void show(Student[] students, String arg) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " " + arg);
        }
    }
}
