import java.util.Scanner;

public class GradesStatistics2 {

    public static Scanner in = new Scanner(System.in);
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.println("The grandes are: ");
        print(grades);

        System.out.printf("The average is: %.2f\n", average(grades));
        System.out.printf("The median is: %.2f\n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f", stdDev(grades));

        in.close();
    }

    public static void readGrades() {
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        if (numStudents > 0) {
            grades = new int[numStudents];
            for (int idx = 0; idx < grades.length; idx++) {
                do {
                    System.out.print("Enter grade for student " + (idx + 1) + ": ");
                    grades[idx] = in.nextInt();
                } while (grades[idx] < 0 || grades[idx] > 100);
            }
        } else {
            System.out.println("Please enter again.");
        }
    }

    public static void print(int[] array) {
        System.out.println("The grades are: ");
        if (array == null) {
            System.out.println("null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        if (array.length > 0) {
            System.out.print(array[array.length - 1]);
        }
        System.out.println("]");
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int idx = 0; idx < array.length; idx++) {
            sum += array[idx];
        }
        return sum / array.length;
    }

    public static double max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] > max) {
                max = array[idx];
            }
        }
        return max;
    }

    public static double min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < min) {
                min = array[idx];
            }
        }
        return min;
    }

    public static double median(int[] array) {
        int[] sortArray = sortArray(array);
        double median;
        if (sortArray.length % 2 == 1) {
            median = array[sortArray.length / 2];
        } else {
            median = (array[sortArray.length / 2] + array[sortArray.length / 2 - 1]) / 2;
        }
        return median;
    }

    private static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static double stdDev(int[] array) {
        double meanSquare = Math.pow(average(array), 2);
        double res = 0;
        for (int i : array) {
            res += i * i;
        }
        res = res / array.length - meanSquare;
        return Math.sqrt(res);
    }
}
