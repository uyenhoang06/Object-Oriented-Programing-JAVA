import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        if (numStudents > 0) {
            int[] grades = new int[numStudents];
            for (int idx = 0; idx < grades.length; idx++) {
                do {
                    System.out.print("Enter grade for student " + (idx + 1) + ": ");
                    grades[idx] = in.nextInt();
                } while (grades[idx] < 0 || grades[idx] > 100);
            }
            printAverage(grades);
            findMinMaxGrade(grades);
        }

        in.close();
    }

    public static void printAverage(int[] grades) {
        int sum = 0;
        for (int idx = 0; idx < grades.length; idx++) {
            sum += grades[idx];
        }
        double average = (double) sum / grades.length;
        System.out.printf("%s %.2f\n", "The average is:", average);
    }

    public static void findMinMaxGrade(int[] grades) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int idx = 0; idx < grades.length; idx++) {
            if (grades[idx] < min) {
                min = grades[idx];
            }
            if (grades[idx] > max) {
                max = grades[idx];
            }
        }
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}
