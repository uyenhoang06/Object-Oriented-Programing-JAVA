import java.util.Scanner;

public class SpecialSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the x (-1 <= x <= 1): ");
        double x = in.nextDouble();
        if (x < -1 || x > 1) {
            System.out.println("x isn't valid.");
        } else {
            System.out.print("Enter number of terms: ");
            int numTerms = in.nextInt();
            if (numTerms < 0) {
                System.out.println("The number of terms isn't valid.");
            } else {
                System.out.println(specialSeries(x, numTerms));
            }
        }
        in.close();
    }

    public static double specialSeries(double x, int numTerms) {
        double frac = x;
        double res = x;
        for (int i = 1; i <= numTerms; i++) {
            frac = frac * (2 * i - 1) / (2 * i) * (2 * i - 1) / (2 * i + 1) * x * x;
            res += frac;
        }
        return res;
    }
}
