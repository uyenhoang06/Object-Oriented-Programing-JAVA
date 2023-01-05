import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENT = 3;
        boolean isValid;
        int sum = 0;
        double average;
        Scanner in = new Scanner(System.in);

        for (int studentNo = 1; studentNo <= NUM_STUDENT; studentNo++) {
            int numberIn;
            isValid = false;
            do {
                System.out.print("Enter the mark (0 - 100) for student " + studentNo + " : ");
                numberIn = in.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
            sum += numberIn;
        }
        average = (double) sum / 3;
        System.out.printf("The average is: %.2f%n", average);

        in.close();
    }
}
